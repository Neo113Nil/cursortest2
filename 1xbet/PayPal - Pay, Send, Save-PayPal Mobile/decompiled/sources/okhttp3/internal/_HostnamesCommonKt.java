package okhttp3.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0012\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u0017\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"", "", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "containsInvalidLabelLengths", "containsInvalidHostnameAsciiCodes", "input", "", "pos", "limit", "", "decodeIpv6", "(Ljava/lang/String;II)[B", "address", "addressOffset", "decodeIpv4Suffix", "(Ljava/lang/String;II[BI)Z", "inet6AddressToAscii", "([B)Ljava/lang/String;", "canonicalizeInetAddress", "([B)[B", "inet4AddressToAscii", "toCanonicalHost", "(Ljava/lang/String;)Ljava/lang/String;", com.datadog.android.log.LogAttributes.HOST, "idnToAscii", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _HostnamesCommonKt {
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoFpsRangesFor.matches(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean containsInvalidLabelLengths(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        if (length > 0 && length < 254) {
            int i = 0;
            while (true) {
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, i, false, 4, (java.lang.Object) null);
                int length2 = indexOf$default == -1 ? str.length() - i : indexOf$default - i;
                if (length2 <= 0 || length2 >= 64) {
                    break;
                }
                if (indexOf$default == -1 || indexOf$default == str.length() - 1) {
                    break;
                }
                i = indexOf$default + 1;
            }
        }
        return true;
    }

    public static final boolean containsInvalidHostnameAsciiCodes(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 31) <= 0 || kotlin.jvm.internal.Intrinsics.compare((int) charAt, 127) >= 0 || kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (java.lang.Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] decodeIpv6(java.lang.String str, int i, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            if (i4 < i2) {
                if (i7 != 16) {
                    int i8 = i4 + 2;
                    if (i8 <= i2 && kotlin.text.StringsKt.startsWith$default(str, "::", i4, false, 4, (java.lang.Object) null)) {
                        if (i5 == -1) {
                            i7 += 2;
                            if (i8 != i2) {
                                i6 = i8;
                                i5 = i7;
                                i4 = i6;
                                int i9 = 0;
                                while (i4 < i2) {
                                }
                                i3 = i4 - i6;
                                if (i3 == 0) {
                                    break;
                                }
                                break;
                            }
                            i5 = i7;
                            break;
                        }
                        return null;
                    }
                    if (i7 != 0) {
                        if (kotlin.text.StringsKt.startsWith$default(str, io.ktor.sse.ServerSentEventKt.COLON, i4, false, 4, (java.lang.Object) null)) {
                            i4++;
                        } else {
                            if (!kotlin.text.StringsKt.startsWith$default(str, ".", i4, false, 4, (java.lang.Object) null) || !decodeIpv4Suffix(str, i6, i2, bArr, i7 - 2)) {
                                return null;
                            }
                            i7 += 2;
                        }
                    }
                    i6 = i4;
                    i4 = i6;
                    int i92 = 0;
                    while (i4 < i2) {
                        int parseHexDigit = okhttp3.internal._UtilCommonKt.parseHexDigit(str.charAt(i4));
                        if (parseHexDigit == -1) {
                            break;
                        }
                        i92 = (i92 << 4) + parseHexDigit;
                        i4++;
                    }
                    i3 = i4 - i6;
                    if (i3 == 0 || i3 > 4) {
                        break;
                    }
                    bArr[i7] = (byte) ((i92 >>> 8) & 255);
                    bArr[i7 + 1] = (byte) (i92 & 255);
                    i7 += 2;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        if (i7 != 16) {
            if (i5 == -1) {
                return null;
            }
            kotlin.collections.ArraysKt.copyInto(bArr, bArr, 16 - (i7 - i5), i5, i7);
            kotlin.collections.ArraysKt.fill(bArr, (byte) 0, i5, (16 - i7) + i5);
        }
        return bArr;
    }

    public static final boolean decodeIpv4Suffix(java.lang.String str, int i, int i2, byte[] bArr, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (kotlin.jvm.internal.Intrinsics.compare((int) charAt, 48) < 0 || kotlin.jvm.internal.Intrinsics.compare((int) charAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    public static final java.lang.String inet6AddressToAscii(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        okio.Buffer buffer = new okio.Buffer();
        while (i2 < bArr.length) {
            if (i2 == i) {
                buffer.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((okhttp3.internal._UtilCommonKt.and(bArr[i2], 255) << 8) | okhttp3.internal._UtilCommonKt.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return buffer.readUtf8();
    }

    public static final java.lang.String inet4AddressToAscii(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length != 4) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return new okio.Buffer().writeDecimalLong(okhttp3.internal._UtilCommonKt.and(bArr[0], 255)).writeByte(46).writeDecimalLong(okhttp3.internal._UtilCommonKt.and(bArr[1], 255)).writeByte(46).writeDecimalLong(okhttp3.internal._UtilCommonKt.and(bArr[2], 255)).writeByte(46).writeDecimalLong(okhttp3.internal._UtilCommonKt.and(bArr[3], 255)).readUtf8();
    }

    public static final java.lang.String toCanonicalHost(java.lang.String str) {
        byte[] decodeIpv6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.COLON, false, 2, (java.lang.Object) null)) {
            if (kotlin.text.StringsKt.startsWith$default(str, "[", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.endsWith$default(str, "]", false, 2, (java.lang.Object) null)) {
                decodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                decodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (decodeIpv6 == null) {
                return null;
            }
            byte[] canonicalizeInetAddress = canonicalizeInetAddress(decodeIpv6);
            if (canonicalizeInetAddress.length == 16) {
                return inet6AddressToAscii(canonicalizeInetAddress);
            }
            if (canonicalizeInetAddress.length == 4) {
                return inet4AddressToAscii(canonicalizeInetAddress);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid IPv6 address: '");
            sb.append(str);
            sb.append('\'');
            throw new java.lang.AssertionError(sb.toString());
        }
        java.lang.String idnToAscii = idnToAscii(str);
        if (idnToAscii == null || idnToAscii.length() == 0 || containsInvalidHostnameAsciiCodes(idnToAscii) || containsInvalidLabelLengths(idnToAscii)) {
            return null;
        }
        return idnToAscii;
    }

    public static final java.lang.String idnToAscii(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        okio.Buffer writeUtf8 = new okio.Buffer().writeUtf8(str);
        okio.Buffer buffer = new okio.Buffer();
        while (!writeUtf8.exhausted()) {
            if (!okhttp3.internal.idn.IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(writeUtf8.readUtf8CodePoint(), buffer)) {
                return null;
            }
        }
        writeUtf8.writeUtf8(okhttp3.internal._NormalizeJvmKt.normalizeNfc(buffer.readUtf8()));
        java.lang.String decode = okhttp3.internal.idn.Punycode.INSTANCE.decode(writeUtf8.readUtf8());
        if (decode != null && kotlin.jvm.internal.Intrinsics.areEqual(decode, okhttp3.internal._NormalizeJvmKt.normalizeNfc(decode))) {
            return okhttp3.internal.idn.Punycode.INSTANCE.encode(decode);
        }
        return null;
    }

    public static final byte[] canonicalizeInetAddress(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length != 16) {
            return bArr;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return bArr;
            }
        }
        return (bArr[10] == -1 && bArr[11] == -1) ? kotlin.collections.ArraysKt.sliceArray(bArr, kotlin.ranges.RangesKt.until(12, 16)) : bArr;
    }
}
