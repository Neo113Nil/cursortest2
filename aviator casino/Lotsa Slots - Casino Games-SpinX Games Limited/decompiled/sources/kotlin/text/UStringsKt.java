package kotlin.text;

/* compiled from: UStrings.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0016\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u0019\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toUByteOrNull", "toUShortOrNull", "toUIntOrNull", "toULongOrNull", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UStringsKt {
    /* renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final java.lang.String m12133toStringLxnNnR4(byte b, int i) {
        java.lang.String num = java.lang.Integer.toString(b & 255, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    /* renamed from: toString-olVBNx4, reason: not valid java name */
    public static final java.lang.String m12135toStringolVBNx4(short s, int i) {
        java.lang.String num = java.lang.Integer.toString(s & kotlin.UShort.MAX_VALUE, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    /* renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final java.lang.String m12134toStringV7xB4Y4(int i, int i2) {
        return kotlin.UnsignedKt.ulongToString(i & 4294967295L, kotlin.text.CharsKt.checkRadix(i2));
    }

    /* renamed from: toString-JSWoG40, reason: not valid java name */
    public static final java.lang.String m12132toStringJSWoG40(long j, int i) {
        return kotlin.UnsignedKt.ulongToString(j, kotlin.text.CharsKt.checkRadix(i));
    }

    public static final byte toUByte(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final byte toUByte(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UByte uByteOrNull = toUByteOrNull(str, i);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final short toUShort(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final short toUShort(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UShort uShortOrNull = toUShortOrNull(str, i);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int toUInt(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final int toUInt(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final long toULong(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final long toULong(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.ULong uLongOrNull = toULongOrNull(str, i);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        kotlin.text.StringsKt.numberFormatError(str);
        throw new kotlin.KotlinNothingValueException();
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String str, int i) {
        int compare;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        compare = java.lang.Integer.compare(data ^ Integer.MIN_VALUE, kotlin.UInt.m10896constructorimpl(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return kotlin.UByte.m10810boximpl(kotlin.UByte.m10816constructorimpl((byte) data));
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String str, int i) {
        int compare;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.UInt uIntOrNull = toUIntOrNull(str, i);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        compare = java.lang.Integer.compare(data ^ Integer.MIN_VALUE, kotlin.UInt.m10896constructorimpl(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return kotlin.UShort.m11076boximpl(kotlin.UShort.m11082constructorimpl((short) data));
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String str, int i) {
        int i2;
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int m10896constructorimpl = kotlin.UInt.m10896constructorimpl(i);
        int i4 = 119304647;
        while (i2 < length) {
            int digitOf = kotlin.text.CharsKt.digitOf(str.charAt(i2), i);
            if (digitOf < 0) {
                return null;
            }
            compare = java.lang.Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i4 == 119304647) {
                    i4 = kotlin.UByte$$ExternalSyntheticBackport0.m$2(-1, m10896constructorimpl);
                    compare3 = java.lang.Integer.compare(i3 ^ Integer.MIN_VALUE, i4 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int m10896constructorimpl2 = kotlin.UInt.m10896constructorimpl(i3 * m10896constructorimpl);
            int m10896constructorimpl3 = kotlin.UInt.m10896constructorimpl(kotlin.UInt.m10896constructorimpl(digitOf) + m10896constructorimpl2);
            compare2 = java.lang.Integer.compare(m10896constructorimpl3 ^ Integer.MIN_VALUE, m10896constructorimpl2 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            i3 = m10896constructorimpl3;
        }
        return kotlin.UInt.m10890boximpl(i3);
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String str, int i) {
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long m10975constructorimpl = kotlin.ULong.m10975constructorimpl(i);
        long j = 0;
        long j2 = 512409557603043100L;
        while (i2 < length) {
            if (kotlin.text.CharsKt.digitOf(str.charAt(i2), i) < 0) {
                return null;
            }
            compare = java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j2 == 512409557603043100L) {
                    j2 = kotlin.UByte$$ExternalSyntheticBackport0.m$1(-1L, m10975constructorimpl);
                    compare3 = java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long m10975constructorimpl2 = kotlin.ULong.m10975constructorimpl(j * m10975constructorimpl);
            long m10975constructorimpl3 = kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(kotlin.UInt.m10896constructorimpl(r13) & 4294967295L) + m10975constructorimpl2);
            compare2 = java.lang.Long.compare(m10975constructorimpl3 ^ Long.MIN_VALUE, m10975constructorimpl2 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i2++;
            j = m10975constructorimpl3;
        }
        return kotlin.ULong.m10969boximpl(j);
    }
}
