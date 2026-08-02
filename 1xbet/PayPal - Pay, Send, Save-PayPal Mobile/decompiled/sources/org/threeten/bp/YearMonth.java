package org.threeten.bp;

/* loaded from: classes18.dex */
public final class YearMonth extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.YearMonth>, java.io.Serializable {
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.YearMonth> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.YearMonth>() { // from class: org.threeten.bp.YearMonth.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.YearMonth queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.YearMonth.from(temporalAccessor);
        }
    };
    private static final org.threeten.bp.format.DateTimeFormatter getHighSpeedVideoFpsRanges = new org.threeten.bp.format.DateTimeFormatterBuilder().appendValue(org.threeten.bp.temporal.ChronoField.YEAR, 4, 10, org.threeten.bp.format.SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    final int Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;

    public static org.threeten.bp.YearMonth now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.YearMonth now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.YearMonth now(org.threeten.bp.Clock clock) {
        org.threeten.bp.LocalDate now = org.threeten.bp.LocalDate.now(clock);
        return of(now.getYear(), now.getMonth());
    }

    public static org.threeten.bp.YearMonth of(int i, org.threeten.bp.Month month) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(month, "month");
        return of(i, month.getValue());
    }

    public static org.threeten.bp.YearMonth of(int i, int i2) {
        org.threeten.bp.temporal.ChronoField.YEAR.checkValidValue(i);
        org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        return new org.threeten.bp.YearMonth(i, i2);
    }

    public static org.threeten.bp.YearMonth from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.YearMonth) {
            return (org.threeten.bp.YearMonth) temporalAccessor;
        }
        try {
            if (!org.threeten.bp.chrono.IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.Chronology.from(temporalAccessor))) {
                temporalAccessor = org.threeten.bp.LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.YEAR), temporalAccessor.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR));
        } catch (org.threeten.bp.DateTimeException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain YearMonth from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    public static org.threeten.bp.YearMonth parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, getHighSpeedVideoFpsRanges);
    }

    public static org.threeten.bp.YearMonth parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.YearMonth) dateTimeFormatter.parse(charSequence, FROM);
    }

    private YearMonth(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.YEAR || temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR || temporalField == org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH || temporalField == org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA || temporalField == org.threeten.bp.temporal.ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit ? temporalUnit == org.threeten.bp.temporal.ChronoUnit.MONTHS || temporalUnit == org.threeten.bp.temporal.ChronoUnit.YEARS || temporalUnit == org.threeten.bp.temporal.ChronoUnit.DECADES || temporalUnit == org.threeten.bp.temporal.ChronoUnit.CENTURIES || temporalUnit == org.threeten.bp.temporal.ChronoUnit.MILLENNIA || temporalUnit == org.threeten.bp.temporal.ChronoUnit.ERAS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA) {
            return org.threeten.bp.temporal.ValueRange.of(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        int i;
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i2 = org.threeten.bp.YearMonth.AnonymousClass2.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i2 == 1) {
                i = this.Camera2StreamConfigurationMap;
            } else {
                if (i2 == 2) {
                    return (this.getHighResolutionOutputSizeshNQ4ISI * 12) + (this.Camera2StreamConfigurationMap - 1);
                }
                if (i2 == 3) {
                    int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i3 <= 0) {
                        i3 = 1 - i3;
                    }
                    return i3;
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        return this.getHighResolutionOutputSizeshNQ4ISI <= 0 ? 0 : 1;
                    }
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
                }
                i = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            return i;
        }
        return temporalField.getFrom(this);
    }

    public final int getYear() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getMonthValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public final org.threeten.bp.Month getMonth() {
        return org.threeten.bp.Month.of(this.Camera2StreamConfigurationMap);
    }

    public final boolean isLeapYear() {
        return org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean isValidDay(int i) {
        return i > 0 && i <= lengthOfMonth();
    }

    public final int lengthOfMonth() {
        return getMonth().length(isLeapYear());
    }

    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.YearMonth with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return (org.threeten.bp.YearMonth) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.YearMonth with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = org.threeten.bp.YearMonth.AnonymousClass2.Camera2StreamConfigurationMap[chronoField.ordinal()];
            if (i == 1) {
                return withMonth((int) j);
            }
            if (i == 2) {
                return plusMonths(j - getLong(org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH));
            }
            if (i == 3) {
                if (this.getHighResolutionOutputSizeshNQ4ISI <= 0) {
                    j = 1 - j;
                }
                return withYear((int) j);
            }
            if (i == 4) {
                return withYear((int) j);
            }
            if (i == 5) {
                return getLong(org.threeten.bp.temporal.ChronoField.ERA) == j ? this : withYear(1 - this.getHighResolutionOutputSizeshNQ4ISI);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return (org.threeten.bp.YearMonth) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.YearMonth withYear(int i) {
        org.threeten.bp.temporal.ChronoField.YEAR.checkValidValue(i);
        return this.getHighResolutionOutputSizeshNQ4ISI == i ? this : new org.threeten.bp.YearMonth(i, this.Camera2StreamConfigurationMap);
    }

    public final org.threeten.bp.YearMonth withMonth(int i) {
        org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidValue(i);
        return this.Camera2StreamConfigurationMap == i ? this : new org.threeten.bp.YearMonth(this.getHighResolutionOutputSizeshNQ4ISI, i);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.YearMonth plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.YearMonth) temporalAmount.addTo(this);
    }

    /* renamed from: org.threeten.bp.YearMonth$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.MONTHS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoUnit.YEARS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoUnit.DECADES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoUnit.CENTURIES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoUnit.MILLENNIA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoUnit.ERAS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.ChronoField.values().length];
            Camera2StreamConfigurationMap = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.YearMonth plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            switch (org.threeten.bp.YearMonth.AnonymousClass2.getHighSpeedVideoSizes[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusMonths(j);
                case 2:
                    return plusYears(j);
                case 3:
                    return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 10));
                case 4:
                    return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 100));
                case 5:
                    return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 1000));
                case 6:
                    return with((org.threeten.bp.temporal.TemporalField) org.threeten.bp.temporal.ChronoField.ERA, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(getLong(org.threeten.bp.temporal.ChronoField.ERA), j));
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
            }
        }
        return (org.threeten.bp.YearMonth) temporalUnit.addTo(this, j);
    }

    public final org.threeten.bp.YearMonth plusYears(long j) {
        if (j == 0) {
            return this;
        }
        int checkValidIntValue = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(this.getHighResolutionOutputSizeshNQ4ISI + j);
        return this.getHighResolutionOutputSizeshNQ4ISI == checkValidIntValue ? this : new org.threeten.bp.YearMonth(checkValidIntValue, this.Camera2StreamConfigurationMap);
    }

    public final org.threeten.bp.YearMonth plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.getHighResolutionOutputSizeshNQ4ISI * 12) + (this.Camera2StreamConfigurationMap - 1) + j;
        int checkValidIntValue = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j2, 12L));
        int floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(j2, 12) + 1;
        return (this.getHighResolutionOutputSizeshNQ4ISI == checkValidIntValue && this.Camera2StreamConfigurationMap == floorMod) ? this : new org.threeten.bp.YearMonth(checkValidIntValue, floorMod);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.YearMonth minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.YearMonth) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.YearMonth minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.YearMonth minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public final org.threeten.bp.YearMonth minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) org.threeten.bp.chrono.IsoChronology.INSTANCE;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.MONTHS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return null;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        if (!org.threeten.bp.chrono.Chronology.from(temporal).equals(org.threeten.bp.chrono.IsoChronology.INSTANCE)) {
            throw new org.threeten.bp.DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.with(org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH, (this.getHighResolutionOutputSizeshNQ4ISI * 12) + (this.Camera2StreamConfigurationMap - 1));
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.YearMonth from = from(temporal);
        if (!(temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit)) {
            return temporalUnit.between(this, from);
        }
        long j = ((from.getHighResolutionOutputSizeshNQ4ISI * 12) + (from.Camera2StreamConfigurationMap - 1)) - ((this.getHighResolutionOutputSizeshNQ4ISI * 12) + (this.Camera2StreamConfigurationMap - 1));
        switch (org.threeten.bp.YearMonth.AnonymousClass2.getHighSpeedVideoSizes[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return j;
            case 2:
                return j / 12;
            case 3:
                return j / 120;
            case 4:
                return j / com.paypal.pds.core.ConstantsKt.MotionDuration1200;
            case 5:
                return j / com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions.DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS;
            case 6:
                return from.getLong(org.threeten.bp.temporal.ChronoField.ERA) - getLong(org.threeten.bp.temporal.ChronoField.ERA);
            default:
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
    }

    public final org.threeten.bp.LocalDate atDay(int i) {
        return org.threeten.bp.LocalDate.of(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, i);
    }

    public final org.threeten.bp.LocalDate atEndOfMonth() {
        return org.threeten.bp.LocalDate.of(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, lengthOfMonth());
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.YearMonth yearMonth) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI - yearMonth.getHighResolutionOutputSizeshNQ4ISI;
        return i == 0 ? this.Camera2StreamConfigurationMap - yearMonth.Camera2StreamConfigurationMap : i;
    }

    public final boolean isAfter(org.threeten.bp.YearMonth yearMonth) {
        return compareTo(yearMonth) > 0;
    }

    public final boolean isBefore(org.threeten.bp.YearMonth yearMonth) {
        return compareTo(yearMonth) < 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.YearMonth)) {
            return false;
        }
        org.threeten.bp.YearMonth yearMonth = (org.threeten.bp.YearMonth) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == yearMonth.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap == yearMonth.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI ^ (this.Camera2StreamConfigurationMap << 27);
    }

    public final java.lang.String toString() {
        int abs = java.lang.Math.abs(this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(9);
        if (abs < 1000) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        sb.append(this.Camera2StreamConfigurationMap < 10 ? "-0" : "-");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 68, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.YearMonth getHighSpeedVideoFpsRanges(java.io.DataInput dataInput) throws java.io.IOException {
        return of(dataInput.readInt(), dataInput.readByte());
    }
}
