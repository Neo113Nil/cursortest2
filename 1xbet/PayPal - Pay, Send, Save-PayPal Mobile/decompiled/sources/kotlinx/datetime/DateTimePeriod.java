package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \"2\u00020\u0001:\u0001\"B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8!X \u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000e8!X \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0019\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\rR\u0014\u0010\u001b\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u001d\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010\u001f\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u0014\u0010!\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\r\u0082\u0001\u0002#$"}, d2 = {"Lkotlinx/datetime/DateTimePeriod;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "getTotalMonths$kotlinx_datetime", "()J", "totalMonths", "getDays", "days", "getTotalNanoseconds$kotlinx_datetime", "totalNanoseconds", "getYears", "years", "getMonths", "months", "getHours", "hours", "getMinutes", "minutes", "getSeconds", "seconds", "getNanoseconds", "nanoseconds", "Companion", "Lkotlinx/datetime/DatePeriod;", "Lkotlinx/datetime/DateTimePeriodImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.DateTimePeriodSerializer.class)
/* loaded from: classes3.dex */
public abstract class DateTimePeriod {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.DateTimePeriod.Companion INSTANCE = new kotlinx.datetime.DateTimePeriod.Companion(null);

    public abstract int getDays();

    public abstract long getTotalMonths$kotlinx_datetime();

    public abstract long getTotalNanoseconds$kotlinx_datetime();

    private DateTimePeriod() {
    }

    public final int getYears() {
        return (int) (getTotalMonths$kotlinx_datetime() / 12);
    }

    public final int getMonths() {
        return (int) (getTotalMonths$kotlinx_datetime() % 12);
    }

    public int getHours() {
        return (int) (getTotalNanoseconds$kotlinx_datetime() / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR);
    }

    public int getMinutes() {
        return (int) ((getTotalNanoseconds$kotlinx_datetime() % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR) / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE);
    }

    public int getSeconds() {
        return (int) ((getTotalNanoseconds$kotlinx_datetime() % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE) / 1000000000);
    }

    public int getNanoseconds() {
        return (int) (getTotalNanoseconds$kotlinx_datetime() % 1000000000);
    }

    public java.lang.String toString() {
        int i;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (getTotalMonths$kotlinx_datetime() > 0 || getDays() > 0 || getTotalNanoseconds$kotlinx_datetime() > 0 || ((getTotalMonths$kotlinx_datetime() | getTotalNanoseconds$kotlinx_datetime()) == 0 && getDays() == 0)) {
            i = 1;
        } else {
            sb.append('-');
            i = -1;
        }
        sb.append('P');
        if (getYears() != 0) {
            sb.append(getYears() * i);
            sb.append(io.ktor.util.date.GMTDateParser.YEAR);
        }
        if (getMonths() != 0) {
            sb.append(getMonths() * i);
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
        }
        if (getDays() != 0) {
            sb.append(getDays() * i);
            sb.append('D');
        }
        java.lang.String str2 = "T";
        java.lang.String str3 = "";
        if (getHours() != 0) {
            sb.append("T");
            sb.append(getHours() * i);
            sb.append('H');
            str2 = "";
        }
        if (getMinutes() != 0) {
            sb.append(str2);
            sb.append(getMinutes() * i);
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
        } else {
            str3 = str2;
        }
        if ((getSeconds() | getNanoseconds()) != 0) {
            sb.append(str3);
            if (getSeconds() != 0) {
                str = java.lang.Integer.valueOf(getSeconds() * i);
            } else {
                str = getNanoseconds() * i < 0 ? "-0" : "0";
            }
            sb.append(str);
            if (getNanoseconds() != 0) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(kotlin.text.StringsKt.padStart(java.lang.String.valueOf(java.lang.Math.abs(getNanoseconds())), 9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            }
            sb.append('S');
        }
        if (sb.length() == 1) {
            sb.append("0D");
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlinx.datetime.DateTimePeriod)) {
            return false;
        }
        kotlinx.datetime.DateTimePeriod dateTimePeriod = (kotlinx.datetime.DateTimePeriod) other;
        return getTotalMonths$kotlinx_datetime() == dateTimePeriod.getTotalMonths$kotlinx_datetime() && getDays() == dateTimePeriod.getDays() && getTotalNanoseconds$kotlinx_datetime() == dateTimePeriod.getTotalNanoseconds$kotlinx_datetime();
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(getTotalMonths$kotlinx_datetime()) * 31) + getDays()) * 31) + java.lang.Long.hashCode(getTotalNanoseconds$kotlinx_datetime());
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/DateTimePeriod$Companion;", "", "<init>", "()V", "", "text", "Lkotlinx/datetime/DateTimePeriod;", "parse", "(Ljava/lang/String;)Lkotlinx/datetime/DateTimePeriod;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimePeriod> serializer() {
            return kotlinx.datetime.serializers.DateTimePeriodSerializer.INSTANCE;
        }

        private static final java.lang.Void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Parse error at char ");
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            throw new kotlinx.datetime.DateTimeFormatException(sb.toString());
        }

        public final kotlinx.datetime.DateTimePeriod parse(java.lang.String text) {
            int i;
            int i2;
            char charAt;
            char c;
            char c2;
            char charAt2;
            char c3;
            char charAt3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            int i3 = 0;
            char c4 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            boolean z = false;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i3 < text.length()) {
                if (c4 == 0) {
                    int i13 = i3 + 1;
                    if (i13 >= text.length() && (text.charAt(i3) == '+' || text.charAt(i3) == '-')) {
                        getHighSpeedVideoFpsRangesFor("Unexpected end of string; 'P' designator is required", i3);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    char charAt4 = text.charAt(i3);
                    int i14 = i4;
                    if (charAt4 == '+' || charAt4 == '-') {
                        if (text.charAt(i3) == '-') {
                            i6 = -1;
                        }
                        if (text.charAt(i13) != 'P') {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected 'P', got '");
                            sb.append(text.charAt(i13));
                            sb.append('\'');
                            getHighSpeedVideoFpsRangesFor(sb.toString(), i13);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        i3 += 2;
                    } else {
                        if (charAt4 != 'P') {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected '+', '-', 'P', got '");
                            sb2.append(text.charAt(i3));
                            sb2.append('\'');
                            getHighSpeedVideoFpsRangesFor(sb2.toString(), i3);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        i3 = i13;
                    }
                    i4 = i14;
                    c4 = 1;
                } else {
                    int i15 = i4;
                    char charAt5 = text.charAt(i3);
                    char c5 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    if (charAt5 == '+' || charAt5 == '-') {
                        i = text.charAt(i3) == '-' ? i6 * (-1) : i6;
                        i2 = i3 + 1;
                        if (i2 < text.length() && '0' <= (charAt = text.charAt(i2))) {
                            c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                            if (charAt >= ':') {
                            }
                        }
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("A number expected after '");
                        sb3.append(text.charAt(i2));
                        sb3.append('\'');
                        getHighSpeedVideoFpsRangesFor(sb3.toString(), i2);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (('0' <= charAt5 && charAt5 < ':') || charAt5 != 'T') {
                        i2 = i3;
                        i = i6;
                        c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                    } else {
                        if (c4 >= 6) {
                            getHighSpeedVideoFpsRangesFor("Only one 'T' designator is allowed", i3);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        i3++;
                        i4 = i15;
                        c4 = 6;
                    }
                    long j = 0;
                    while (i2 < text.length() && c5 <= (charAt3 = text.charAt(i2)) && charAt3 < c) {
                        int i16 = i10;
                        int i17 = i5;
                        try {
                            int i18 = i11;
                            long safeAdd = kotlinx.datetime.internal.MathJvmKt.safeAdd(kotlinx.datetime.internal.MathJvmKt.safeMultiply(j, 10L), text.charAt(i2) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                            i2++;
                            i10 = i16;
                            i11 = i18;
                            c = kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON;
                            c5 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                            j = safeAdd;
                            i5 = i17;
                        } catch (java.lang.ArithmeticException unused) {
                            getHighSpeedVideoFpsRangesFor("The number is too large", i3);
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }
                    int i19 = i5;
                    int i20 = i10;
                    long j2 = j;
                    int i21 = i11;
                    long j3 = i * j2;
                    if (i2 == text.length()) {
                        getHighSpeedVideoFpsRangesFor("Expected a designator after the numerical value", i2);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    char upperCase = java.lang.Character.toUpperCase(text.charAt(i2));
                    int i22 = i6;
                    if (upperCase == ',' || upperCase == '.') {
                        int i23 = i2 + 1;
                        if (i23 >= text.length()) {
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected designator 'S' after ");
                            sb4.append(text.charAt(i2));
                            getHighSpeedVideoFpsRangesFor(sb4.toString(), i23);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        i2 = i23;
                        while (i2 < text.length() && '0' <= (charAt2 = text.charAt(i2)) && charAt2 < ':') {
                            i2++;
                        }
                        int i24 = i2 - i23;
                        if (i24 > 9) {
                            getHighSpeedVideoFpsRangesFor("Only the nanosecond fractions of a second are supported", i23);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        java.lang.String substring = text.substring(i23, i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                        sb5.append(substring);
                        sb5.append(kotlin.text.StringsKt.repeat("0", 9 - i24));
                        int parseInt = java.lang.Integer.parseInt(sb5.toString(), kotlin.text.CharsKt.checkRadix(10));
                        if (text.charAt(i2) != 'S') {
                            getHighSpeedVideoFpsRangesFor("Expected the 'S' designator after a fraction", i2);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        c2 = '\t';
                        if (c4 >= '\t' || c4 < 6) {
                            getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                            throw new kotlin.KotlinNothingValueException();
                        }
                        i7 = parseInt * i;
                        i12 = Camera2StreamConfigurationMap(j3, i3, 'S');
                    } else {
                        if (upperCase != 'D') {
                            if (upperCase != 'H') {
                                if (upperCase != 'M') {
                                    if (upperCase != 'S') {
                                        if (upperCase != 'W') {
                                            if (upperCase != 'Y') {
                                                getHighSpeedVideoFpsRangesFor("Expected a designator after the numerical value", i2);
                                                throw new kotlin.KotlinNothingValueException();
                                            }
                                            c3 = 2;
                                            if (c4 >= 2) {
                                                getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                throw new kotlin.KotlinNothingValueException();
                                            }
                                            i8 = Camera2StreamConfigurationMap(j3, i3, io.ktor.util.date.GMTDateParser.YEAR);
                                        } else {
                                            if (c4 >= 4) {
                                                getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                                throw new kotlin.KotlinNothingValueException();
                                            }
                                            i5 = Camera2StreamConfigurationMap(j3, i3, 'W');
                                            c4 = 4;
                                            i10 = i20;
                                            i4 = i15;
                                            i11 = i21;
                                            i3 = i2 + 1;
                                            z = true;
                                            i6 = i22;
                                        }
                                    } else {
                                        if (c4 >= '\t' || c4 < 6) {
                                            getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                            throw new kotlin.KotlinNothingValueException();
                                        }
                                        i12 = Camera2StreamConfigurationMap(j3, i3, 'S');
                                        c2 = '\t';
                                    }
                                } else if (c4 >= 6) {
                                    if (c4 >= '\b') {
                                        getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                        throw new kotlin.KotlinNothingValueException();
                                    }
                                    i11 = Camera2StreamConfigurationMap(j3, i3, io.ktor.util.date.GMTDateParser.MONTH);
                                    c4 = '\b';
                                    i10 = i20;
                                    i4 = i15;
                                    i5 = i19;
                                    i3 = i2 + 1;
                                    z = true;
                                    i6 = i22;
                                } else {
                                    if (c4 >= 3) {
                                        getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                        throw new kotlin.KotlinNothingValueException();
                                    }
                                    i9 = Camera2StreamConfigurationMap(j3, i3, io.ktor.util.date.GMTDateParser.MONTH);
                                    c3 = 3;
                                }
                                i4 = i15;
                            } else {
                                if (c4 >= 7 || c4 < 6) {
                                    getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                    throw new kotlin.KotlinNothingValueException();
                                }
                                i10 = Camera2StreamConfigurationMap(j3, i3, 'H');
                                c4 = 7;
                                i4 = i15;
                                i5 = i19;
                                i11 = i21;
                                i3 = i2 + 1;
                                z = true;
                                i6 = i22;
                            }
                        } else {
                            if (c4 >= 5) {
                                getHighSpeedVideoFpsRangesFor("Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'", i2);
                                throw new kotlin.KotlinNothingValueException();
                            }
                            i4 = Camera2StreamConfigurationMap(j3, i3, 'D');
                            c3 = 5;
                        }
                        c4 = c3;
                        i10 = i20;
                        i5 = i19;
                        i11 = i21;
                        i3 = i2 + 1;
                        z = true;
                        i6 = i22;
                    }
                    c4 = c2;
                    i10 = i20;
                    i4 = i15;
                    i5 = i19;
                    i11 = i21;
                    i3 = i2 + 1;
                    z = true;
                    i6 = i22;
                }
            }
            if (c4 == 0) {
                getHighSpeedVideoFpsRangesFor("Unexpected end of input; 'P' designator is required", i3);
                throw new kotlin.KotlinNothingValueException();
            }
            if (c4 == 6) {
                getHighSpeedVideoFpsRangesFor("Unexpected end of input; at least one time component is required after 'T'", i3);
                throw new kotlin.KotlinNothingValueException();
            }
            long j4 = i4 + (i5 * 7);
            if (androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask > j4 || j4 > androidx.collection.SieveCacheKt.NodeLinkMask) {
                getHighSpeedVideoFpsRangesFor("The total number of days under 'D' and 'W' designators should fit into an Int", 0);
                throw new kotlin.KotlinNothingValueException();
            }
            int i25 = (int) j4;
            if (!z) {
                getHighSpeedVideoFpsRangesFor("At least one component is required, but none were found", 0);
                throw new kotlin.KotlinNothingValueException();
            }
            return kotlinx.datetime.DateTimePeriodKt.DateTimePeriod(i8, i9, i25, i10, i11, i12, i7);
        }

        private static final int Camera2StreamConfigurationMap(long j, int i, char c) {
            if (j >= androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask && j <= androidx.collection.SieveCacheKt.NodeLinkMask) {
                return (int) j;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Value ");
            sb.append(j);
            sb.append(" does not fit into an Int, which is required for component '");
            sb.append(c);
            sb.append('\'');
            getHighSpeedVideoFpsRangesFor(sb.toString(), i);
            throw new kotlin.KotlinNothingValueException();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DateTimePeriod(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
