package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversionsJVM.kt */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\u0010\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u000e\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u0001H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0001H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\u0004*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\f\u001a\u00020\u0006*\u00020\u0001H\u0087\b\u001a\u0015\u0010\f\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0001H\u0087\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0001H\u0087\b\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0016*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0001H\u0007\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0087\b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bH\u0007\u001a4\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0004\b\"\u0010#\u001a\u0015\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0001H\u0002¢\u0006\u0002\b&\u001a \u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0083\b¢\u0006\u0002\b*\u001a\u0012\u0010+\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b-\u001a\u0012\u0010.\u001a\u00020\b*\u00020,H\u0083\b¢\u0006\u0002\b/\u001a\u0012\u00100\u001a\u00020\u0004*\u00020,H\u0083\b¢\u0006\u0002\b1\u001a6\u00102\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b4\u001a6\u00105\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b6\u001a>\u00107\u001a\u00020\u0004*\u00020\u00012\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u00108\u001a\u00020\b2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0!H\u0083\b¢\u0006\u0002\b9¨\u0006:"}, d2 = {"toString", "", "", "radix", "", "", "", "toBoolean", "", "toByte", "toShort", "toInt", "toLong", "toFloat", "", "toDouble", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toBigInteger", "Ljava/math/BigInteger;", "toBigIntegerOrNull", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "screenFloatValue", "T", "str", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "isValidFloat", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "isValidFloat$StringsKt__StringNumberConversionsJVMKt", "guessNamedFloatConstant", "start", "endInclusive", "guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt", "isAsciiDigit", "", "isAsciiDigit$StringsKt__StringNumberConversionsJVMKt", "isHexLetter", "isHexLetter$StringsKt__StringNumberConversionsJVMKt", "asciiLetterToLowerCaseCode", "asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt", "advanceWhile", "predicate", "advanceWhile$StringsKt__StringNumberConversionsJVMKt", "backtrackWhile", "backtrackWhile$StringsKt__StringNumberConversionsJVMKt", "advanceAndValidateMantissa", "hexFormat", "advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
public class StringsKt__StringNumberConversionsJVMKt extends kotlin.text.StringsKt__StringBuilderKt {
    private static final int asciiLetterToLowerCaseCode$StringsKt__StringNumberConversionsJVMKt(char c) {
        return c | ' ';
    }

    private static final boolean isAsciiDigit$StringsKt__StringNumberConversionsJVMKt(char c) {
        return ((c + 65488) & 65535) < 10;
    }

    private static final boolean isHexLetter$StringsKt__StringNumberConversionsJVMKt(char c) {
        return (((c | ' ') + (-97)) & 65535) < 6;
    }

    private static final java.lang.String toString(byte b, int i) {
        java.lang.String num = java.lang.Integer.toString(b, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    private static final java.lang.String toString(short s, int i) {
        java.lang.String num = java.lang.Integer.toString(s, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    private static final java.lang.String toString(int i, int i2) {
        java.lang.String num = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        return num;
    }

    private static final java.lang.String toString(long j, int i) {
        java.lang.String l = java.lang.Long.toString(j, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "toString(...)");
        return l;
    }

    private static final boolean toBoolean(java.lang.String str) {
        return java.lang.Boolean.parseBoolean(str);
    }

    private static final byte toByte(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Byte.parseByte(str);
    }

    private static final byte toByte(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Byte.parseByte(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final short toShort(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Short.parseShort(str);
    }

    private static final short toShort(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Short.parseShort(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final int toInt(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Integer.parseInt(str);
    }

    private static final int toInt(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Integer.parseInt(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final long toLong(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Long.parseLong(str);
    }

    private static final long toLong(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Long.parseLong(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final float toFloat(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Float.parseFloat(str);
    }

    private static final double toDouble(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Double.parseDouble(str);
    }

    private static final java.math.BigInteger toBigInteger(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.math.BigInteger(str);
    }

    private static final java.math.BigInteger toBigInteger(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.math.BigInteger(str, kotlin.text.CharsKt.checkRadix(i));
    }

    public static final java.math.BigInteger toBigIntegerOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.toBigIntegerOrNull(str, 10);
    }

    public static final java.math.BigInteger toBigIntegerOrNull(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
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
            for (int i2 = str.charAt(0) == '-' ? 1 : 0; i2 < length; i2++) {
                if (kotlin.text.CharsKt.digitOf(str.charAt(i2), i) < 0) {
                    return null;
                }
            }
        }
        return new java.math.BigInteger(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final java.math.BigDecimal toBigDecimal(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.math.BigDecimal(str);
    }

    private static final java.math.BigDecimal toBigDecimal(java.lang.String str, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(str, mathContext);
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> function1) {
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean isValidFloat$StringsKt__StringNumberConversionsJVMKt(java.lang.String str) {
        boolean z;
        int charAt;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int length = str.length() - 1;
        int i3 = 0;
        while (i3 <= length && str.charAt(i3) <= ' ') {
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        while (length > i3 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i3) == '+' || str.charAt(i3) == '-') {
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        if (str.charAt(i3) == '0') {
            int i4 = i3 + 1;
            if (i4 > length) {
                return true;
            }
            if ((str.charAt(i4) | ' ') == 120) {
                int i5 = i3 + 2;
                int i6 = i5;
                while (i6 <= length) {
                    if (((str.charAt(i6) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i6++;
                }
                boolean z4 = i5 != i6;
                if (i6 <= length) {
                    if (str.charAt(i6) == '.') {
                        int i7 = i6 + 1;
                        i2 = i7;
                        while (i2 <= length) {
                            if (((str.charAt(i2) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i2++;
                        }
                        if (i7 != i2) {
                            z3 = true;
                            if (!z4 || z3) {
                                i3 = i2;
                                if (i3 != -1 || i3 > length) {
                                    return false;
                                }
                                z = true;
                                if (!z) {
                                    int i8 = i3;
                                    while (i8 <= length && ((str.charAt(i8) - '0') & 65535) < 10) {
                                        i8++;
                                    }
                                    boolean z5 = i3 != i8;
                                    if (i8 > length) {
                                        i3 = i8;
                                    } else {
                                        if (str.charAt(i8) == '.') {
                                            int i9 = i8 + 1;
                                            i = i9;
                                            while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                                i++;
                                            }
                                            if (i9 != i) {
                                                z2 = true;
                                                if (!z5 || z2) {
                                                    i3 = i;
                                                } else {
                                                    java.lang.String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                                    i3 = (str2 != null && kotlin.text.StringsKt.indexOf((java.lang.CharSequence) str, str2, i, false) == i) ? length + 1 : -1;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        z2 = false;
                                        if (z5) {
                                        }
                                        i3 = i;
                                    }
                                    if (i3 == -1) {
                                        return false;
                                    }
                                    if (i3 > length) {
                                        return true;
                                    }
                                }
                                int i10 = i3 + 1;
                                charAt = str.charAt(i3) | ' ';
                                if (charAt == (!z ? 112 : 101)) {
                                    return !z && (charAt == 102 || charAt == 100) && i10 > length;
                                }
                                if (i10 > length) {
                                    return false;
                                }
                                if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i3 + 2) > length) {
                                    return false;
                                }
                                while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
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
                        }
                    } else {
                        i2 = i6;
                    }
                    z3 = false;
                    if (!z4) {
                    }
                    i3 = i2;
                    if (i3 != -1) {
                    }
                    return false;
                }
                i3 = -1;
                if (i3 != -1) {
                }
                return false;
            }
        }
        z = false;
        if (!z) {
        }
        int i102 = i3 + 1;
        charAt = str.charAt(i3) | ' ';
        if (charAt == (!z ? 112 : 101)) {
        }
    }

    private static final java.lang.String guessNamedFloatConstant$StringsKt__StringNumberConversionsJVMKt(int i, int i2) {
        if (i2 == i + 2) {
            return "NaN";
        }
        if (i2 == i + 7) {
            return "Infinity";
        }
        return null;
    }

    private static final int advanceWhile$StringsKt__StringNumberConversionsJVMKt(java.lang.String str, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        while (i <= i2 && function1.invoke(java.lang.Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    private static final int backtrackWhile$StringsKt__StringNumberConversionsJVMKt(java.lang.String str, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        while (i2 > i && function1.invoke(java.lang.Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2--;
        }
        return i2;
    }

    private static final int advanceAndValidateMantissa$StringsKt__StringNumberConversionsJVMKt(java.lang.String str, int i, int i2, boolean z, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        boolean z2;
        java.lang.String str2;
        int i3 = i;
        while (i3 <= i2 && function1.invoke(java.lang.Character.valueOf(str.charAt(i3))).booleanValue()) {
            i3++;
        }
        boolean z3 = i != i3;
        if (i3 > i2) {
            if (z) {
                return -1;
            }
            return i3;
        }
        if (str.charAt(i3) == '.') {
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 <= i2 && function1.invoke(java.lang.Character.valueOf(str.charAt(i5))).booleanValue()) {
                i5++;
            }
            z2 = i4 != i5;
            i3 = i5;
        } else {
            z2 = false;
        }
        if (z3 || z2) {
            return i3;
        }
        if (z) {
            return -1;
        }
        if (i2 == i3 + 2) {
            str2 = "NaN";
        } else {
            str2 = i2 == i3 + 7 ? "Infinity" : null;
        }
        if (str2 != null && kotlin.text.StringsKt.indexOf((java.lang.CharSequence) str, str2, i3, false) == i3) {
            return i2 + 1;
        }
        return -1;
    }

    public static final java.lang.Float toFloatOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.lang.Double toDoubleOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.math.BigDecimal toBigDecimalOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new java.math.BigDecimal(str);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.math.BigDecimal toBigDecimalOrNull(java.lang.String str, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (isValidFloat$StringsKt__StringNumberConversionsJVMKt(str)) {
                return new java.math.BigDecimal(str, mathContext);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
