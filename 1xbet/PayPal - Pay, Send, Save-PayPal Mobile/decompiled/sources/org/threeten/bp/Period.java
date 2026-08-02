package org.threeten.bp;

/* loaded from: classes18.dex */
public final class Period extends org.threeten.bp.chrono.ChronoPeriod implements java.io.Serializable {
    public static final org.threeten.bp.Period ZERO = new org.threeten.bp.Period(0, 0, 0);
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private static final long serialVersionUID = -8290556941213247973L;
    private final int Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    public static org.threeten.bp.Period ofWeeks(int i) {
        int safeMultiply = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(i, 7);
        if (safeMultiply == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(0, 0, safeMultiply);
    }

    public static org.threeten.bp.Period from(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        if (temporalAmount instanceof org.threeten.bp.Period) {
            return (org.threeten.bp.Period) temporalAmount;
        }
        if ((temporalAmount instanceof org.threeten.bp.chrono.ChronoPeriod) && !org.threeten.bp.chrono.IsoChronology.INSTANCE.equals(((org.threeten.bp.chrono.ChronoPeriod) temporalAmount).getChronology())) {
            throw new org.threeten.bp.DateTimeException("Period requires ISO chronology: ".concat(java.lang.String.valueOf(temporalAmount)));
        }
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalAmount, "amount");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (org.threeten.bp.temporal.TemporalUnit temporalUnit : temporalAmount.getUnits()) {
            long j = temporalAmount.get(temporalUnit);
            if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.YEARS) {
                i = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(j);
            } else if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.MONTHS) {
                i2 = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(j);
            } else if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.DAYS) {
                i3 = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(j);
            } else {
                throw new org.threeten.bp.DateTimeException("Unit must be Years, Months or Days, but was ".concat(java.lang.String.valueOf(temporalUnit)));
            }
        }
        if ((i | i2 | i3) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i, i2, i3);
    }

    public static org.threeten.bp.Period between(org.threeten.bp.LocalDate localDate, org.threeten.bp.LocalDate localDate2) {
        return localDate.until((org.threeten.bp.chrono.ChronoLocalDate) localDate2);
    }

    public static org.threeten.bp.Period parse(java.lang.CharSequence charSequence) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(charSequence, "text");
        java.util.regex.Matcher matcher = getHighSpeedVideoFpsRanges.matcher(charSequence);
        if (matcher.matches()) {
            int i = "-".equals(matcher.group(1)) ? -1 : 1;
            java.lang.String group = matcher.group(2);
            java.lang.String group2 = matcher.group(3);
            java.lang.String group3 = matcher.group(4);
            java.lang.String group4 = matcher.group(5);
            if (group != null || group2 != null || group3 != null || group4 != null) {
                try {
                    int highSpeedVideoSizes = getHighSpeedVideoSizes(charSequence, group, i);
                    int highSpeedVideoSizes2 = getHighSpeedVideoSizes(charSequence, group2, i);
                    int safeAdd = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(getHighSpeedVideoSizes(charSequence, group4, i), org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(getHighSpeedVideoSizes(charSequence, group3, i), 7));
                    if ((highSpeedVideoSizes | highSpeedVideoSizes2 | safeAdd) == 0) {
                        return ZERO;
                    }
                    return new org.threeten.bp.Period(highSpeedVideoSizes, highSpeedVideoSizes2, safeAdd);
                } catch (java.lang.NumberFormatException e) {
                    throw ((org.threeten.bp.format.DateTimeParseException) new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
                }
            }
        }
        throw new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    private static int getHighSpeedVideoSizes(java.lang.CharSequence charSequence, java.lang.String str, int i) {
        if (str == null) {
            return 0;
        }
        try {
            return org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(java.lang.Integer.parseInt(str), i);
        } catch (java.lang.ArithmeticException e) {
            throw ((org.threeten.bp.format.DateTimeParseException) new org.threeten.bp.format.DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
        }
    }

    private Period(int i, int i2, int i3) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoSizes = i3;
    }

    private java.lang.Object readResolve() {
        return ((this.Camera2StreamConfigurationMap | this.getHighSpeedVideoFpsRangesFor) | this.getHighSpeedVideoSizes) == 0 ? ZERO : this;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final java.util.List<org.threeten.bp.temporal.TemporalUnit> getUnits() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(org.threeten.bp.temporal.ChronoUnit.YEARS, org.threeten.bp.temporal.ChronoUnit.MONTHS, org.threeten.bp.temporal.ChronoUnit.DAYS));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.chrono.Chronology getChronology() {
        return org.threeten.bp.chrono.IsoChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final long get(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        int i;
        if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.YEARS) {
            i = this.Camera2StreamConfigurationMap;
        } else if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.MONTHS) {
            i = this.getHighSpeedVideoFpsRangesFor;
        } else if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.DAYS) {
            i = this.getHighSpeedVideoSizes;
        } else {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
        return i;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final boolean isZero() {
        return this == ZERO;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final boolean isNegative() {
        return this.Camera2StreamConfigurationMap < 0 || this.getHighSpeedVideoFpsRangesFor < 0 || this.getHighSpeedVideoSizes < 0;
    }

    public final int getYears() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getMonths() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getDays() {
        return this.getHighSpeedVideoSizes;
    }

    public final org.threeten.bp.Period withYears(int i) {
        if (i == this.Camera2StreamConfigurationMap) {
            return this;
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.getHighSpeedVideoSizes;
        if ((i | i2 | i3) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i, i2, i3);
    }

    public final org.threeten.bp.Period withMonths(int i) {
        if (i == this.getHighSpeedVideoFpsRangesFor) {
            return this;
        }
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoSizes;
        if ((i2 | i | i3) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i2, i, i3);
    }

    public final org.threeten.bp.Period withDays(int i) {
        if (i == this.getHighSpeedVideoSizes) {
            return this;
        }
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        if ((i2 | i3 | i) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i2, i3, i);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.Period plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        org.threeten.bp.Period from = from(temporalAmount);
        int safeAdd = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.Camera2StreamConfigurationMap, from.Camera2StreamConfigurationMap);
        int safeAdd2 = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoFpsRangesFor, from.getHighSpeedVideoFpsRangesFor);
        int safeAdd3 = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoSizes, from.getHighSpeedVideoSizes);
        if ((safeAdd | safeAdd2 | safeAdd3) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(safeAdd, safeAdd2, safeAdd3);
    }

    public final org.threeten.bp.Period plusYears(long j) {
        if (j == 0) {
            return this;
        }
        int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.Camera2StreamConfigurationMap, j));
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighSpeedVideoSizes;
        if ((safeToInt | i | i2) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(safeToInt, i, i2);
    }

    public final org.threeten.bp.Period plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        int i = this.Camera2StreamConfigurationMap;
        int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoFpsRangesFor, j));
        int i2 = this.getHighSpeedVideoSizes;
        if ((i | safeToInt | i2) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i, safeToInt, i2);
    }

    public final org.threeten.bp.Period plusDays(long j) {
        if (j == 0) {
            return this;
        }
        int i = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.getHighSpeedVideoSizes, j));
        if ((i | i2 | safeToInt) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i, i2, safeToInt);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.Period minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        org.threeten.bp.Period from = from(temporalAmount);
        int safeSubtract = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(this.Camera2StreamConfigurationMap, from.Camera2StreamConfigurationMap);
        int safeSubtract2 = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(this.getHighSpeedVideoFpsRangesFor, from.getHighSpeedVideoFpsRangesFor);
        int safeSubtract3 = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(this.getHighSpeedVideoSizes, from.getHighSpeedVideoSizes);
        if ((safeSubtract | safeSubtract2 | safeSubtract3) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(safeSubtract, safeSubtract2, safeSubtract3);
    }

    public final org.threeten.bp.Period minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public final org.threeten.bp.Period minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public final org.threeten.bp.Period minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.Period multipliedBy(int i) {
        org.threeten.bp.Period period = ZERO;
        if (this == period || i == 1) {
            return this;
        }
        int safeMultiply = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.Camera2StreamConfigurationMap, i);
        int safeMultiply2 = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.getHighSpeedVideoFpsRangesFor, i);
        int safeMultiply3 = org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(this.getHighSpeedVideoSizes, i);
        return ((safeMultiply | safeMultiply2) | safeMultiply3) == 0 ? period : new org.threeten.bp.Period(safeMultiply, safeMultiply2, safeMultiply3);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.Period negated() {
        return multipliedBy(-1);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final org.threeten.bp.Period normalized() {
        long totalMonths = toTotalMonths();
        long j = totalMonths / 12;
        int i = (int) (totalMonths % 12);
        if (j == this.Camera2StreamConfigurationMap && i == this.getHighSpeedVideoFpsRangesFor) {
            return this;
        }
        int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(j);
        int i2 = this.getHighSpeedVideoSizes;
        if ((safeToInt | i | i2) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(safeToInt, i, i2);
    }

    public final long toTotalMonths() {
        return (this.Camera2StreamConfigurationMap * 12) + this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final org.threeten.bp.temporal.Temporal addTo(org.threeten.bp.temporal.Temporal temporal) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporal, "temporal");
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                temporal = temporal.plus(toTotalMonths(), org.threeten.bp.temporal.ChronoUnit.MONTHS);
            } else {
                temporal = temporal.plus(i, org.threeten.bp.temporal.ChronoUnit.YEARS);
            }
        } else {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 != 0) {
                temporal = temporal.plus(i2, org.threeten.bp.temporal.ChronoUnit.MONTHS);
            }
        }
        int i3 = this.getHighSpeedVideoSizes;
        return i3 != 0 ? temporal.plus(i3, org.threeten.bp.temporal.ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public final org.threeten.bp.temporal.Temporal subtractFrom(org.threeten.bp.temporal.Temporal temporal) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporal, "temporal");
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                temporal = temporal.minus(toTotalMonths(), org.threeten.bp.temporal.ChronoUnit.MONTHS);
            } else {
                temporal = temporal.minus(i, org.threeten.bp.temporal.ChronoUnit.YEARS);
            }
        } else {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 != 0) {
                temporal = temporal.minus(i2, org.threeten.bp.temporal.ChronoUnit.MONTHS);
            }
        }
        int i3 = this.getHighSpeedVideoSizes;
        return i3 != 0 ? temporal.minus(i3, org.threeten.bp.temporal.ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.Period)) {
            return false;
        }
        org.threeten.bp.Period period = (org.threeten.bp.Period) obj;
        return this.Camera2StreamConfigurationMap == period.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == period.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == period.getHighSpeedVideoSizes;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final int hashCode() {
        return this.Camera2StreamConfigurationMap + java.lang.Integer.rotateLeft(this.getHighSpeedVideoFpsRangesFor, 8) + java.lang.Integer.rotateLeft(this.getHighSpeedVideoSizes, 16);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public final java.lang.String toString() {
        if (this == ZERO) {
            return "P0D";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("P");
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            sb.append(i);
            sb.append(io.ktor.util.date.GMTDateParser.YEAR);
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (i2 != 0) {
            sb.append(i2);
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
        }
        int i3 = this.getHighSpeedVideoSizes;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public static org.threeten.bp.Period of(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i, i2, i3);
    }

    public static org.threeten.bp.Period ofDays(int i) {
        if (i == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(0, 0, i);
    }

    public static org.threeten.bp.Period ofMonths(int i) {
        if (i == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(0, i, 0);
    }

    public static org.threeten.bp.Period ofYears(int i) {
        if (i == 0) {
            return ZERO;
        }
        return new org.threeten.bp.Period(i, 0, 0);
    }
}
