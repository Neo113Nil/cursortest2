package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0016"}, d2 = {"", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigInteger;", "toBigIntegerOrNull", "(Ljava/lang/String;)Ljava/math/BigInteger;", "", "radix", "(Ljava/lang/String;I)Ljava/math/BigInteger;", "Ljava/math/BigDecimal;", "toBigDecimalOrNull", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "Ljava/math/MathContext;", "mathContext", "(Ljava/lang/String;Ljava/math/MathContext;)Ljava/math/BigDecimal;", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRangesFor"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringNumberConversionsJVMKt extends kotlin.text.StringsKt__StringBuilderKt {
    public static final java.math.BigInteger toBigIntegerOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.toBigIntegerOrNull(str, 10);
    }

    public static final java.math.BigInteger toBigIntegerOrNull(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            if (kotlin.text.CharsKt.digitOf(str.charAt(0), i) < 0) {
                return null;
            }
        } else {
            for (int i2 = str.charAt(0) != '-' ? 0 : 1; i2 < length; i2++) {
                if (kotlin.text.CharsKt.digitOf(str.charAt(i2), i) < 0) {
                    return null;
                }
            }
        }
        return new java.math.BigInteger(str, kotlin.text.CharsKt.checkRadix(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        boolean z;
        int charAt;
        int i;
        boolean z2;
        boolean z3;
        int length = str.length() - 1;
        int i2 = 0;
        while (i2 <= length && str.charAt(i2) <= ' ') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        while (length > i2 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
            i2++;
        }
        if (i2 > length) {
            return false;
        }
        if (str.charAt(i2) == '0') {
            int i3 = i2 + 1;
            if (i3 > length) {
                return true;
            }
            if ((str.charAt(i3) | ' ') == 120) {
                int i4 = i2 + 2;
                int i5 = i4;
                while (i5 <= length) {
                    if (((str.charAt(i5) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i5++;
                }
                boolean z4 = i4 != i5;
                if (i5 <= length) {
                    if (str.charAt(i5) == '.') {
                        int i6 = i5 + 1;
                        int i7 = i6;
                        while (i7 <= length) {
                            if (((str.charAt(i7) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i7++;
                        }
                        if (i6 != i7) {
                            i5 = i7;
                            z3 = true;
                            if (!z4 || z3) {
                                i2 = i5;
                                if (i2 != -1 || i2 > length) {
                                    return false;
                                }
                                z = true;
                                if (!z) {
                                    int i8 = i2;
                                    while (i8 <= length && ((str.charAt(i8) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) & 65535) < 10) {
                                        i8++;
                                    }
                                    boolean z5 = i2 != i8;
                                    if (i8 > length) {
                                        i2 = i8;
                                    } else {
                                        if (str.charAt(i8) == '.') {
                                            int i9 = i8 + 1;
                                            i = i9;
                                            while (i <= length && ((str.charAt(i) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) & 65535) < 10) {
                                                i++;
                                            }
                                            if (i9 != i) {
                                                z2 = true;
                                                if (!z5 || z2) {
                                                    i2 = i;
                                                } else {
                                                    java.lang.String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                                    i2 = (str2 != null && kotlin.text.StringsKt.indexOf((java.lang.CharSequence) str, str2, i, false) == i) ? length + 1 : -1;
                                                }
                                            } else {
                                                i8 = i;
                                            }
                                        }
                                        i = i8;
                                        z2 = false;
                                        if (z5) {
                                        }
                                        i2 = i;
                                    }
                                    if (i2 == -1) {
                                        return false;
                                    }
                                    if (i2 > length) {
                                        return true;
                                    }
                                }
                                int i10 = i2 + 1;
                                charAt = str.charAt(i2) | ' ';
                                if (charAt == (!z ? 112 : 101)) {
                                    return !z && (charAt == 102 || charAt == 100) && i10 > length;
                                }
                                if (i10 > length) {
                                    return false;
                                }
                                if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i2 + 2) > length) {
                                    return false;
                                }
                                while (i10 <= length && ((str.charAt(i10) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) & 65535) < 10) {
                                    i10++;
                                }
                                if (i10 > length) {
                                    return true;
                                }
                                if (i10 != length) {
                                    return false;
                                }
                                int charAt2 = str.charAt(i10) | ' ';
                                return charAt2 == 102 || charAt2 == 100;
                            }
                        } else {
                            i5 = i7;
                        }
                    }
                    z3 = false;
                    if (!z4) {
                    }
                    i2 = i5;
                    if (i2 != -1) {
                    }
                    return false;
                }
                i2 = -1;
                if (i2 != -1) {
                }
                return false;
            }
        }
        z = false;
        if (!z) {
        }
        int i102 = i2 + 1;
        charAt = str.charAt(i2) | ' ';
        if (charAt == (!z ? 112 : 101)) {
        }
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        int i;
        if (str.length() == 0) {
            return false;
        }
        int i2 = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
        int i3 = i2;
        while (i3 < str.length() && java.lang.Character.isDigit(str.charAt(i3))) {
            i3++;
        }
        if (i3 == str.length()) {
            return i3 - i2 > 0;
        }
        if (str.charAt(i3) == '.') {
            i3++;
            if (i3 == str.length()) {
                return i3 - i2 > 1;
            }
            while (i3 < str.length() && java.lang.Character.isDigit(str.charAt(i3))) {
                i3++;
            }
        }
        if (i3 == str.length()) {
            return true;
        }
        if ((str.charAt(i3) != 'e' && str.charAt(i3) != 'E') || (i = i3 + 1) == str.length()) {
            return false;
        }
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            i = i3 + 2;
        }
        if (i == str.length()) {
            return false;
        }
        while (i < str.length() && java.lang.Character.isDigit(str.charAt(i))) {
            i++;
        }
        return i == str.length();
    }

    public static final java.lang.Float toFloatOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            if (getHighSpeedVideoFpsRanges(str)) {
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.lang.Double toDoubleOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            if (getHighSpeedVideoFpsRanges(str)) {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.math.BigDecimal toBigDecimalOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            if (getHighSpeedVideoFpsRangesFor(str)) {
                return new java.math.BigDecimal(str);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.math.BigDecimal toBigDecimalOrNull(java.lang.String str, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "");
        try {
            if (getHighSpeedVideoFpsRangesFor(str)) {
                return new java.math.BigDecimal(str, mathContext);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
