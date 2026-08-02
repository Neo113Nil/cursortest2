package okhttp3.internal.idn;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\t*\u00020\t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lokhttp3/internal/idn/Punycode;", "", "<init>", "()V", "", "string", "encode", "(Ljava/lang/String;)Ljava/lang/String;", "decode", "", "p0", "p1", "", "p2", "getHighSpeedVideoSizes", "(IIZ)I", "PREFIX_STRING", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "Lokio/ByteString;", "PREFIX", "Lokio/ByteString;", "getPREFIX", "()Lokio/ByteString;", "getHighSpeedVideoFpsRanges", "(I)I"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Punycode {
    public static final okhttp3.internal.idn.Punycode INSTANCE = new okhttp3.internal.idn.Punycode();
    private static final java.lang.String PREFIX_STRING = "xn--";
    private static final okio.ByteString PREFIX = okio.ByteString.INSTANCE.encodeUtf8("xn--");

    private Punycode() {
    }

    public final java.lang.String getPREFIX_STRING() {
        return PREFIX_STRING;
    }

    public final okio.ByteString getPREFIX() {
        return PREFIX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [char] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    public final java.lang.String encode(java.lang.String string) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        int length = string.length();
        okio.Buffer buffer = new okio.Buffer();
        int i2 = 0;
        while (i2 < length) {
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) string, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, i2, false, 4, (java.lang.Object) null);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= indexOf$default) {
                    buffer.writeUtf8(string, i2, indexOf$default);
                    break;
                }
                int i4 = 128;
                if (string.charAt(i3) >= 128) {
                    buffer.write(PREFIX);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (i2 < indexOf$default) {
                        int charAt = string.charAt(i2);
                        java.util.ArrayList arrayList2 = arrayList;
                        if (kotlin.text.CharsKt.isSurrogate(charAt)) {
                            int i5 = i2 + 1;
                            char charAt2 = i5 < indexOf$default ? string.charAt(i5) : (char) 0;
                            if (java.lang.Character.isLowSurrogate(charAt) || !java.lang.Character.isLowSurrogate(charAt2)) {
                                charAt = 63;
                            } else {
                                charAt = (((charAt & 1023) << 10) | (charAt2 & 1023)) + 65536;
                                i2 = i5;
                            }
                        }
                        arrayList2.add(java.lang.Integer.valueOf(charAt));
                        i2++;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        if (intValue < 128) {
                            buffer.writeByte(intValue);
                            i6++;
                        }
                    }
                    if (i6 > 0) {
                        buffer.writeByte(45);
                    }
                    int i7 = 72;
                    int i8 = i6;
                    int i9 = 0;
                    while (i8 < arrayList.size()) {
                        java.util.Iterator it2 = arrayList.iterator();
                        if (!it2.hasNext()) {
                            throw new java.util.NoSuchElementException();
                        }
                        java.lang.Object next = it2.next();
                        int i10 = Integer.MAX_VALUE;
                        if (it2.hasNext()) {
                            int intValue2 = ((java.lang.Number) next).intValue();
                            if (intValue2 < i4) {
                                intValue2 = Integer.MAX_VALUE;
                            }
                            do {
                                java.lang.Object next2 = it2.next();
                                int intValue3 = ((java.lang.Number) next2).intValue();
                                if (intValue3 < i4) {
                                    intValue3 = Integer.MAX_VALUE;
                                }
                                if (intValue2 > intValue3) {
                                    intValue2 = intValue3;
                                    next = next2;
                                }
                            } while (it2.hasNext());
                        }
                        int intValue4 = ((java.lang.Number) next).intValue();
                        int i11 = (intValue4 - i4) * (i8 + 1);
                        if (i9 > Integer.MAX_VALUE - i11) {
                            return null;
                        }
                        int i12 = i9 + i11;
                        java.util.Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            int intValue5 = ((java.lang.Number) it3.next()).intValue();
                            if (intValue5 < intValue4) {
                                if (i12 == i10) {
                                    return null;
                                }
                                i12++;
                            } else if (intValue5 == intValue4) {
                                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(36, i10), 36);
                                int first = step.getFirst();
                                int last = step.getLast();
                                int step2 = step.getStep();
                                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                                    i = i12;
                                    while (true) {
                                        int i13 = first <= i7 ? 1 : first >= i7 + 26 ? 26 : first - i7;
                                        if (i < i13) {
                                            break;
                                        }
                                        int i14 = i - i13;
                                        int i15 = 36 - i13;
                                        buffer.writeByte(getHighSpeedVideoFpsRanges(i13 + (i14 % i15)));
                                        i = i14 / i15;
                                        if (first == last) {
                                            break;
                                        }
                                        first += step2;
                                    }
                                } else {
                                    i = i12;
                                }
                                buffer.writeByte(getHighSpeedVideoFpsRanges(i));
                                int i16 = i8 + 1;
                                i7 = getHighSpeedVideoSizes(i12, i16, i8 == i6);
                                i8 = i16;
                                i12 = 0;
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                        i9 = i12 + 1;
                        i4 = intValue4 + 1;
                    }
                } else {
                    i3++;
                }
            }
            if (indexOf$default >= length) {
                break;
            }
            buffer.writeByte(46);
            i2 = indexOf$default + 1;
        }
        return buffer.readUtf8();
    }

    public final java.lang.String decode(java.lang.String string) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "");
        int length = string.length();
        okio.Buffer buffer = new okio.Buffer();
        int i3 = 0;
        while (i3 < length) {
            java.lang.String str = string;
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, i3, false, 4, (java.lang.Object) null);
            int i4 = indexOf$default == -1 ? length : indexOf$default;
            if (!kotlin.text.StringsKt.regionMatches(string, i3, PREFIX_STRING, 0, 4, true)) {
                buffer.writeUtf8(string, i3, i4);
            } else {
                int i5 = i3 + 4;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, '-', i4, false, 4, (java.lang.Object) null);
                char c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST;
                char c2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ;
                char c3 = 'A';
                if (lastIndexOf$default >= i5) {
                    while (i5 < lastIndexOf$default) {
                        char charAt = string.charAt(i5);
                        if (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && (('0' > charAt || charAt >= ':') && charAt != '-'))) {
                            return null;
                        }
                        arrayList.add(java.lang.Integer.valueOf(charAt));
                        i5++;
                    }
                    i5++;
                }
                int i6 = 128;
                int i7 = 72;
                int i8 = 0;
                while (i5 < i4) {
                    kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(36, Integer.MAX_VALUE), 36);
                    int first = step.getFirst();
                    int last = step.getLast();
                    int step2 = step.getStep();
                    if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                        i = i8;
                        int i9 = 1;
                        while (i5 != i4) {
                            int i10 = i5 + 1;
                            char charAt2 = string.charAt(i5);
                            if ('a' <= charAt2 && charAt2 < c2) {
                                i2 = charAt2 - 'a';
                            } else if (c3 <= charAt2 && charAt2 < c) {
                                i2 = charAt2 - 'A';
                            } else {
                                if ('0' > charAt2 || charAt2 >= ':') {
                                    return null;
                                }
                                i2 = charAt2 - 22;
                            }
                            int i11 = i9;
                            int i12 = i2 * i11;
                            int i13 = i;
                            if (i13 > Integer.MAX_VALUE - i12) {
                                return null;
                            }
                            i = i13 + i12;
                            int i14 = first <= i7 ? 1 : first >= i7 + 26 ? 26 : first - i7;
                            if (i2 >= i14) {
                                int i15 = 36 - i14;
                                if (i11 > Integer.MAX_VALUE / i15) {
                                    return null;
                                }
                                i9 = i11 * i15;
                                if (first != last) {
                                    first += step2;
                                    i5 = i10;
                                    c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST;
                                    c2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ;
                                    c3 = 'A';
                                }
                            }
                            i5 = i10;
                        }
                        return null;
                    }
                    i = i8;
                    i7 = getHighSpeedVideoSizes(i - i8, arrayList.size() + 1, i8 == 0);
                    int size = i / (arrayList.size() + 1);
                    if (i6 > Integer.MAX_VALUE - size) {
                        return null;
                    }
                    i6 += size;
                    int size2 = i % (arrayList.size() + 1);
                    if (i6 > 1114111) {
                        return null;
                    }
                    arrayList.add(size2, java.lang.Integer.valueOf(i6));
                    i8 = size2 + 1;
                    c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST;
                    c2 = kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ;
                    c3 = 'A';
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    buffer.writeUtf8CodePoint(((java.lang.Number) it.next()).intValue());
                }
            }
            if (i4 >= length) {
                break;
            }
            buffer.writeByte(46);
            i3 = i4 + 1;
        }
        return buffer.readUtf8();
    }

    private static int getHighSpeedVideoSizes(int p0, int p1, boolean p2) {
        int i;
        if (p2) {
            i = p0 / 700;
        } else {
            i = p0 / 2;
        }
        int i2 = i + (i / p1);
        int i3 = 0;
        while (i2 > 455) {
            i2 /= 35;
            i3 += 36;
        }
        return i3 + ((i2 * 36) / (i2 + 38));
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new java.lang.IllegalStateException("unexpected digit: ".concat(java.lang.String.valueOf(i)).toString());
    }
}
