package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\r\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"", "", "toByteOrNull", "(Ljava/lang/String;)Ljava/lang/Byte;", "", "radix", "(Ljava/lang/String;I)Ljava/lang/Byte;", "", "toShortOrNull", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "toLongOrNull", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "numberFormatError", "(Ljava/lang/String;)Ljava/lang/Void;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringNumberConversionsKt extends kotlin.text.StringsKt__StringNumberConversionsJVMKt {
    public static final java.lang.Byte toByteOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.toByteOrNull(str, 10);
    }

    public static final java.lang.Byte toByteOrNull(java.lang.String str, int i) {
        int intValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str, i);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return java.lang.Byte.valueOf((byte) intValue);
    }

    public static final java.lang.Short toShortOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.toShortOrNull(str, 10);
    }

    public static final java.lang.Short toShortOrNull(java.lang.String str, int i) {
        int intValue;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str, i);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return java.lang.Short.valueOf((short) intValue);
    }

    public static final java.lang.Integer toIntOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.toIntOrNull(str, 10);
    }

    public static final java.lang.Integer toIntOrNull(java.lang.String str, int i) {
        int i2;
        boolean z;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int compare = kotlin.jvm.internal.Intrinsics.compare((int) charAt, 48);
        int i5 = androidx.media3.common.C.RATE_UNSET_INT;
        if (compare < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                i2 = 1;
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                i2 = 1;
            }
        } else {
            i2 = 0;
            z = false;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int digitOf = kotlin.text.CharsKt.digitOf(str.charAt(i2), i);
            if (digitOf < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + digitOf) {
                return null;
            }
            i4 = i3 - digitOf;
            i2++;
        }
        return z ? java.lang.Integer.valueOf(i4) : java.lang.Integer.valueOf(-i4);
    }

    public static final java.lang.Long toLongOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.toLongOrNull(str, 10);
    }

    public static final java.lang.Long toLongOrNull(java.lang.String str, int i) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int compare = kotlin.jvm.internal.Intrinsics.compare((int) charAt, 48);
        long j = androidx.media3.common.C.TIME_UNSET;
        if (compare < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int digitOf = kotlin.text.CharsKt.digitOf(str.charAt(i2), i);
            if (digitOf < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = digitOf;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? java.lang.Long.valueOf(j3) : java.lang.Long.valueOf(-j3);
    }

    public static final java.lang.Void numberFormatError(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid number format: '");
        sb.append(str);
        sb.append('\'');
        throw new java.lang.NumberFormatException(sb.toString());
    }
}
