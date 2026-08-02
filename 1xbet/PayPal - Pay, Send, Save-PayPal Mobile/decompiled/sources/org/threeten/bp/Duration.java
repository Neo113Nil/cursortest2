package org.threeten.bp;

/* loaded from: classes18.dex */
public final class Duration implements org.threeten.bp.temporal.TemporalAmount, java.lang.Comparable<org.threeten.bp.Duration>, java.io.Serializable {
    private static final long serialVersionUID = 3078945930695997490L;
    final int getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoSizes;
    public static final org.threeten.bp.Duration ZERO = new org.threeten.bp.Duration(0, 0);
    private static final java.math.BigInteger Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(1000000000);
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRangesFor = java.util.regex.Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    public static org.threeten.bp.Duration ofDays(long j) {
        long safeMultiply = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY);
        if (safeMultiply == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(safeMultiply, 0);
    }

    public static org.threeten.bp.Duration ofHours(long j) {
        long safeMultiply = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 3600);
        if (safeMultiply == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(safeMultiply, 0);
    }

    public static org.threeten.bp.Duration ofMinutes(long j) {
        long safeMultiply = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 60);
        if (safeMultiply == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(safeMultiply, 0);
    }

    public static org.threeten.bp.Duration ofSeconds(long j, long j2) {
        long safeAdd = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(j, org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j2, 1000000000L));
        int floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(j2, 1000000000);
        if ((floorMod | safeAdd) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(safeAdd, floorMod);
    }

    public static org.threeten.bp.Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        int i2 = i * 1000000;
        if ((i2 | j2) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(j2, i2);
    }

    public static org.threeten.bp.Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        if ((i | j2) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(j2, i);
    }

    public static org.threeten.bp.Duration of(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return ZERO.plus(j, temporalUnit);
    }

    public static org.threeten.bp.Duration from(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalAmount, "amount");
        org.threeten.bp.Duration duration = ZERO;
        for (org.threeten.bp.temporal.TemporalUnit temporalUnit : temporalAmount.getUnits()) {
            duration = duration.plus(temporalAmount.get(temporalUnit), temporalUnit);
        }
        return duration;
    }

    public static org.threeten.bp.Duration between(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.Temporal temporal2) {
        long until = temporal.until(temporal2, org.threeten.bp.temporal.ChronoUnit.SECONDS);
        long j = 0;
        if (temporal.isSupported(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND) && temporal2.isSupported(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND)) {
            try {
                long j2 = temporal.getLong(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND);
                long j3 = temporal2.getLong(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND) - j2;
                if (until > 0 && j3 < 0) {
                    j = j3 + 1000000000;
                } else if (until >= 0 || j3 <= 0) {
                    if (until == 0 && j3 != 0) {
                        try {
                            until = temporal.until(temporal2.with(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, j2), org.threeten.bp.temporal.ChronoUnit.SECONDS);
                        } catch (java.lang.ArithmeticException | org.threeten.bp.DateTimeException unused) {
                        }
                    }
                    j = j3;
                } else {
                    j = j3 - 1000000000;
                }
            } catch (java.lang.ArithmeticException | org.threeten.bp.DateTimeException unused2) {
            }
        }
        return ofSeconds(until, j);
    }

    public static org.threeten.bp.Duration parse(java.lang.CharSequence charSequence) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(charSequence, "text");
        java.util.regex.Matcher matcher = getHighSpeedVideoFpsRangesFor.matcher(charSequence);
        if (matcher.matches() && !"T".equals(matcher.group(3))) {
            int i = 1;
            boolean equals = "-".equals(matcher.group(1));
            java.lang.String group = matcher.group(2);
            java.lang.String group2 = matcher.group(4);
            java.lang.String group3 = matcher.group(5);
            java.lang.String group4 = matcher.group(6);
            java.lang.String group5 = matcher.group(7);
            if (group != null || group2 != null || group3 != null || group4 != null) {
                long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(charSequence, group, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY, "days");
                long highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(charSequence, group2, 3600, "hours");
                long highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(charSequence, group3, 60, "minutes");
                long highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(charSequence, group4, 1, "seconds");
                if (group4 != null && group4.charAt(0) == '-') {
                    i = -1;
                }
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charSequence, group5, i);
                try {
                    long safeAdd = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(highSpeedVideoFpsRangesFor, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(highSpeedVideoFpsRangesFor2, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(highSpeedVideoFpsRangesFor3, highSpeedVideoFpsRangesFor4)));
                    if (equals) {
                        return ofSeconds(safeAdd, highSpeedVideoFpsRanges).negated();
                    }
                    return ofSeconds(safeAdd, highSpeedVideoFpsRanges);
                } catch (java.lang.ArithmeticException e) {
                    throw ((org.threeten.bp.format.DateTimeParseException) new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e));
                }
            }
        }
        throw new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Duration", charSequence, 0);
    }

    private static long getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, java.lang.String str, int i, java.lang.String str2) {
        if (str == null) {
            return 0L;
        }
        try {
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
            return org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(java.lang.Long.parseLong(str), i);
        } catch (java.lang.ArithmeticException e) {
            throw ((org.threeten.bp.format.DateTimeParseException) new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Duration: ".concat(java.lang.String.valueOf(str2)), charSequence, 0).initCause(e));
        } catch (java.lang.NumberFormatException e2) {
            throw ((org.threeten.bp.format.DateTimeParseException) new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Duration: ".concat(java.lang.String.valueOf(str2)), charSequence, 0).initCause(e2));
        }
    }

    private static int getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, java.lang.String str, int i) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("000000000");
            return java.lang.Integer.parseInt(sb.toString().substring(0, 9)) * i;
        } catch (java.lang.ArithmeticException e) {
            throw ((org.threeten.bp.format.DateTimeParseException) new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e));
        } catch (java.lang.NumberFormatException e2) {
            throw ((org.threeten.bp.format.DateTimeParseException) new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e2));
        }
    }

    private Duration(long j, int i) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public final java.util.List<org.threeten.bp.temporal.TemporalUnit> getUnits() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(org.threeten.bp.temporal.ChronoUnit.SECONDS, org.threeten.bp.temporal.ChronoUnit.NANOS));
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public final long get(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.SECONDS) {
            return this.getHighSpeedVideoSizes;
        }
        if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.NANOS) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
    }

    public final boolean isZero() {
        return (this.getHighSpeedVideoSizes | ((long) this.getHighSpeedVideoFpsRanges)) == 0;
    }

    public final boolean isNegative() {
        return this.getHighSpeedVideoSizes < 0;
    }

    public final long getSeconds() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getNano() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final org.threeten.bp.Duration withSeconds(long j) {
        int i = this.getHighSpeedVideoFpsRanges;
        if ((i | j) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(j, i);
    }

    public final org.threeten.bp.Duration withNanos(int i) {
        long j = i;
        org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.checkValidIntValue(j);
        long j2 = this.getHighSpeedVideoSizes;
        if ((j | j2) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(j2, i);
    }

    public final org.threeten.bp.Duration plus(org.threeten.bp.Duration duration) {
        return getHighResolutionOutputSizeshNQ4ISI(duration.getSeconds(), duration.getNano());
    }

    public final org.threeten.bp.Duration plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalUnit, "unit");
        if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.DAYS) {
            return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY), 0L);
        }
        if (temporalUnit.isDurationEstimated()) {
            throw new org.threeten.bp.DateTimeException("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return this;
        }
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            int i = org.threeten.bp.Duration.AnonymousClass1.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return plusNanos(j);
            }
            if (i == 2) {
                return plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000);
            }
            if (i == 3) {
                return plusMillis(j);
            }
            if (i == 4) {
                return plusSeconds(j);
            }
            return plusSeconds(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(temporalUnit.getDuration().getHighSpeedVideoSizes, j));
        }
        return plusSeconds(temporalUnit.getDuration().multipliedBy(j).getSeconds()).plusNanos(r7.getNano());
    }

    /* renamed from: org.threeten.bp.Duration$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.NANOS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MICROS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public final org.threeten.bp.Duration plusDays(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY), 0L);
    }

    public final org.threeten.bp.Duration plusHours(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 3600), 0L);
    }

    public final org.threeten.bp.Duration plusMinutes(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 60), 0L);
    }

    public final org.threeten.bp.Duration plusSeconds(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(j, 0L);
    }

    public final org.threeten.bp.Duration plusMillis(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(j / 1000, (j % 1000) * 1000000);
    }

    public final org.threeten.bp.Duration plusNanos(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(0L, j);
    }

    private org.threeten.bp.Duration getHighResolutionOutputSizeshNQ4ISI(long j, long j2) {
        return (j | j2) == 0 ? this : ofSeconds(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoSizes, j), j2 / 1000000000), this.getHighSpeedVideoFpsRanges + (j2 % 1000000000));
    }

    public final org.threeten.bp.Duration minus(org.threeten.bp.Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        if (seconds == Long.MIN_VALUE) {
            return getHighResolutionOutputSizeshNQ4ISI(Long.MAX_VALUE, -nano).getHighResolutionOutputSizeshNQ4ISI(1L, 0L);
        }
        return getHighResolutionOutputSizeshNQ4ISI(-seconds, -nano);
    }

    public final org.threeten.bp.Duration minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.Duration minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public final org.threeten.bp.Duration minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1L) : plusHours(-j);
    }

    public final org.threeten.bp.Duration minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1L) : plusMinutes(-j);
    }

    public final org.threeten.bp.Duration minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1L) : plusSeconds(-j);
    }

    public final org.threeten.bp.Duration minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public final org.threeten.bp.Duration minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1L) : plusNanos(-j);
    }

    public final org.threeten.bp.Duration multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        return j == 1 ? this : getHighSpeedVideoFpsRangesFor(java.math.BigDecimal.valueOf(this.getHighSpeedVideoSizes).add(java.math.BigDecimal.valueOf(this.getHighSpeedVideoFpsRanges, 9)).multiply(java.math.BigDecimal.valueOf(j)));
    }

    private static org.threeten.bp.Duration getHighSpeedVideoFpsRangesFor(java.math.BigDecimal bigDecimal) {
        java.math.BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        java.math.BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(Camera2StreamConfigurationMap);
        if (divideAndRemainder[0].bitLength() > 63) {
            throw new java.lang.ArithmeticException("Exceeds capacity of Duration: ".concat(java.lang.String.valueOf(bigIntegerExact)));
        }
        return ofSeconds(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
    }

    public final org.threeten.bp.Duration negated() {
        return multipliedBy(-1L);
    }

    public final org.threeten.bp.Duration abs() {
        return isNegative() ? negated() : this;
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public final org.threeten.bp.temporal.Temporal addTo(org.threeten.bp.temporal.Temporal temporal) {
        long j = this.getHighSpeedVideoSizes;
        if (j != 0) {
            temporal = temporal.plus(j, org.threeten.bp.temporal.ChronoUnit.SECONDS);
        }
        int i = this.getHighSpeedVideoFpsRanges;
        return i != 0 ? temporal.plus(i, org.threeten.bp.temporal.ChronoUnit.NANOS) : temporal;
    }

    @Override // org.threeten.bp.temporal.TemporalAmount
    public final org.threeten.bp.temporal.Temporal subtractFrom(org.threeten.bp.temporal.Temporal temporal) {
        long j = this.getHighSpeedVideoSizes;
        if (j != 0) {
            temporal = temporal.minus(j, org.threeten.bp.temporal.ChronoUnit.SECONDS);
        }
        int i = this.getHighSpeedVideoFpsRanges;
        return i != 0 ? temporal.minus(i, org.threeten.bp.temporal.ChronoUnit.NANOS) : temporal;
    }

    public final long toDays() {
        return this.getHighSpeedVideoSizes / 86400;
    }

    public final long toHours() {
        return this.getHighSpeedVideoSizes / 3600;
    }

    public final long toMinutes() {
        return this.getHighSpeedVideoSizes / 60;
    }

    public final long toMillis() {
        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.getHighSpeedVideoSizes, 1000), this.getHighSpeedVideoFpsRanges / 1000000);
    }

    public final long toNanos() {
        return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.getHighSpeedVideoSizes, 1000000000), this.getHighSpeedVideoFpsRanges);
    }

    public final long toDaysPart() {
        return this.getHighSpeedVideoSizes / 86400;
    }

    public final int toHoursPart() {
        return (int) (toHours() % 24);
    }

    public final int toMinutesPart() {
        return (int) (toMinutes() % 60);
    }

    public final int toSecondsPart() {
        return (int) (this.getHighSpeedVideoSizes % 60);
    }

    public final int toMillisPart() {
        return this.getHighSpeedVideoFpsRanges / 1000000;
    }

    public final int toNanosPart() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.Duration duration) {
        int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(this.getHighSpeedVideoSizes, duration.getHighSpeedVideoSizes);
        return compareLongs != 0 ? compareLongs : this.getHighSpeedVideoFpsRanges - duration.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.Duration)) {
            return false;
        }
        org.threeten.bp.Duration duration = (org.threeten.bp.Duration) obj;
        return this.getHighSpeedVideoSizes == duration.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == duration.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        long j = this.getHighSpeedVideoSizes;
        return ((int) (j ^ (j >>> 32))) + (this.getHighSpeedVideoFpsRanges * 51);
    }

    public final java.lang.String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.getHighSpeedVideoSizes;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
        }
        if (i2 == 0 && this.getHighSpeedVideoFpsRanges == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.getHighSpeedVideoFpsRanges <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.getHighSpeedVideoFpsRanges > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.getHighSpeedVideoFpsRanges);
            } else {
                sb.append(this.getHighSpeedVideoFpsRanges + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        }
        sb.append('S');
        return sb.toString();
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 1, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.Duration getHighSpeedVideoFpsRangesFor(java.io.DataInput dataInput) throws java.io.IOException {
        return ofSeconds(dataInput.readLong(), dataInput.readInt());
    }

    public static org.threeten.bp.Duration ofSeconds(long j) {
        if (j == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Duration(j, 0);
    }

    public final org.threeten.bp.Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : getHighSpeedVideoFpsRangesFor(java.math.BigDecimal.valueOf(this.getHighSpeedVideoSizes).add(java.math.BigDecimal.valueOf(this.getHighSpeedVideoFpsRanges, 9)).divide(java.math.BigDecimal.valueOf(j), java.math.RoundingMode.DOWN));
        }
        throw new java.lang.ArithmeticException("Cannot divide by zero");
    }
}
