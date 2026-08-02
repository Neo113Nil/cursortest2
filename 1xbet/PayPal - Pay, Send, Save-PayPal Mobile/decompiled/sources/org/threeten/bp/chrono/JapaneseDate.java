package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class JapaneseDate extends org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.JapaneseDate> implements java.io.Serializable {
    static final org.threeten.bp.LocalDate getHighSpeedVideoFpsRangesFor = org.threeten.bp.LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    final org.threeten.bp.LocalDate Camera2StreamConfigurationMap;
    private transient int getHighSpeedVideoFpsRanges;
    private transient org.threeten.bp.chrono.JapaneseEra getHighSpeedVideoSizes;

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.temporal.Temporal
    public final /* bridge */ /* synthetic */ long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return super.until(temporal, temporalUnit);
    }

    public static org.threeten.bp.chrono.JapaneseDate now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.chrono.JapaneseDate now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.chrono.JapaneseDate now(org.threeten.bp.Clock clock) {
        return new org.threeten.bp.chrono.JapaneseDate(org.threeten.bp.LocalDate.now(clock));
    }

    public static org.threeten.bp.chrono.JapaneseDate of(org.threeten.bp.chrono.JapaneseEra japaneseEra, int i, int i2, int i3) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(japaneseEra, "era");
        if (i <= 0) {
            throw new org.threeten.bp.DateTimeException("Invalid YearOfEra: ".concat(java.lang.String.valueOf(i)));
        }
        org.threeten.bp.LocalDate localDate = japaneseEra.getHighResolutionOutputSizeshNQ4ISI;
        org.threeten.bp.LocalDate Camera2StreamConfigurationMap = japaneseEra.Camera2StreamConfigurationMap();
        org.threeten.bp.LocalDate of = org.threeten.bp.LocalDate.of((localDate.getYear() - 1) + i, i2, i3);
        if (of.isBefore(localDate) || of.isAfter(Camera2StreamConfigurationMap)) {
            throw new org.threeten.bp.DateTimeException("Requested date is outside bounds of era ".concat(java.lang.String.valueOf(japaneseEra)));
        }
        return new org.threeten.bp.chrono.JapaneseDate(japaneseEra, i, of);
    }

    static org.threeten.bp.chrono.JapaneseDate getHighSpeedVideoFpsRanges(org.threeten.bp.chrono.JapaneseEra japaneseEra, int i, int i2) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(japaneseEra, "era");
        if (i <= 0) {
            throw new org.threeten.bp.DateTimeException("Invalid YearOfEra: ".concat(java.lang.String.valueOf(i)));
        }
        org.threeten.bp.LocalDate localDate = japaneseEra.getHighResolutionOutputSizeshNQ4ISI;
        org.threeten.bp.LocalDate Camera2StreamConfigurationMap = japaneseEra.Camera2StreamConfigurationMap();
        if (i == 1 && (i2 = i2 + (localDate.getDayOfYear() - 1)) > localDate.lengthOfYear()) {
            throw new org.threeten.bp.DateTimeException("DayOfYear exceeds maximum allowed in the first year of era ".concat(java.lang.String.valueOf(japaneseEra)));
        }
        org.threeten.bp.LocalDate ofYearDay = org.threeten.bp.LocalDate.ofYearDay((localDate.getYear() - 1) + i, i2);
        if (ofYearDay.isBefore(localDate) || ofYearDay.isAfter(Camera2StreamConfigurationMap)) {
            throw new org.threeten.bp.DateTimeException("Requested date is outside bounds of era ".concat(java.lang.String.valueOf(japaneseEra)));
        }
        return new org.threeten.bp.chrono.JapaneseDate(japaneseEra, i, ofYearDay);
    }

    public static org.threeten.bp.chrono.JapaneseDate of(int i, int i2, int i3) {
        return new org.threeten.bp.chrono.JapaneseDate(org.threeten.bp.LocalDate.of(i, i2, i3));
    }

    public static org.threeten.bp.chrono.JapaneseDate from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return org.threeten.bp.chrono.JapaneseChronology.INSTANCE.date(temporalAccessor);
    }

    JapaneseDate(org.threeten.bp.LocalDate localDate) {
        if (localDate.isBefore(getHighSpeedVideoFpsRangesFor)) {
            throw new org.threeten.bp.DateTimeException("Minimum supported date is January 1st Meiji 6");
        }
        this.getHighSpeedVideoSizes = org.threeten.bp.chrono.JapaneseEra.Camera2StreamConfigurationMap(localDate);
        this.getHighSpeedVideoFpsRanges = localDate.getYear() - (r0.getHighResolutionOutputSizeshNQ4ISI.getYear() - 1);
        this.Camera2StreamConfigurationMap = localDate;
    }

    private JapaneseDate(org.threeten.bp.chrono.JapaneseEra japaneseEra, int i, org.threeten.bp.LocalDate localDate) {
        if (localDate.isBefore(getHighSpeedVideoFpsRangesFor)) {
            throw new org.threeten.bp.DateTimeException("Minimum supported date is January 1st Meiji 6");
        }
        this.getHighSpeedVideoSizes = japaneseEra;
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = localDate;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.getHighSpeedVideoSizes = org.threeten.bp.chrono.JapaneseEra.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getYear() - (r2.getHighResolutionOutputSizeshNQ4ISI.getYear() - 1);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.JapaneseChronology getChronology() {
        return org.threeten.bp.chrono.JapaneseChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.JapaneseEra getEra() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return this.Camera2StreamConfigurationMap.lengthOfMonth();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(org.threeten.bp.chrono.JapaneseChronology.getHighSpeedVideoSizes);
        calendar.set(0, this.getHighSpeedVideoSizes.getValue() + 2);
        calendar.set(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.getMonthValue() - 1, this.Camera2StreamConfigurationMap.getDayOfMonth());
        return calendar.getActualMaximum(6);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (isSupported(temporalField)) {
                org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
                int i = org.threeten.bp.chrono.JapaneseDate.AnonymousClass1.Camera2StreamConfigurationMap[chronoField.ordinal()];
                if (i == 1) {
                    return getHighSpeedVideoFpsRanges(6);
                }
                if (i == 2) {
                    return getHighSpeedVideoFpsRanges(1);
                }
                return getChronology().range(chronoField);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* renamed from: org.threeten.bp.chrono.JapaneseDate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    private org.threeten.bp.temporal.ValueRange getHighSpeedVideoFpsRanges(int i) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(org.threeten.bp.chrono.JapaneseChronology.getHighSpeedVideoSizes);
        calendar.set(0, this.getHighSpeedVideoSizes.getValue() + 2);
        calendar.set(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap.getMonthValue() - 1, this.Camera2StreamConfigurationMap.getDayOfMonth());
        return org.threeten.bp.temporal.ValueRange.of(calendar.getActualMinimum(i), calendar.getActualMaximum(i));
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            switch (org.threeten.bp.chrono.JapaneseDate.AnonymousClass1.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()]) {
                case 1:
                    return getHighResolutionOutputSizeshNQ4ISI();
                case 2:
                    return this.getHighSpeedVideoFpsRanges;
                case 3:
                case 4:
                case 5:
                case 6:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
                case 7:
                    return this.getHighSpeedVideoSizes.getValue();
                default:
                    return this.Camera2StreamConfigurationMap.getLong(temporalField);
            }
        }
        return temporalField.getFrom(this);
    }

    private long getHighResolutionOutputSizeshNQ4ISI() {
        int dayOfYear;
        if (this.getHighSpeedVideoFpsRanges == 1) {
            dayOfYear = (this.Camera2StreamConfigurationMap.getDayOfYear() - this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.getDayOfYear()) + 1;
        } else {
            dayOfYear = this.Camera2StreamConfigurationMap.getDayOfYear();
        }
        return dayOfYear;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.JapaneseDate with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return (org.threeten.bp.chrono.JapaneseDate) super.with(temporalAdjuster);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.JapaneseDate with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            if (getLong(chronoField) == j) {
                return this;
            }
            int i = org.threeten.bp.chrono.JapaneseDate.AnonymousClass1.Camera2StreamConfigurationMap[chronoField.ordinal()];
            if (i == 1 || i == 2 || i == 7) {
                int checkValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
                int i2 = org.threeten.bp.chrono.JapaneseDate.AnonymousClass1.Camera2StreamConfigurationMap[chronoField.ordinal()];
                if (i2 == 1) {
                    org.threeten.bp.LocalDate plusDays = this.Camera2StreamConfigurationMap.plusDays(checkValidIntValue - getHighResolutionOutputSizeshNQ4ISI());
                    return plusDays.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.JapaneseDate(plusDays);
                }
                if (i2 == 2) {
                    return getHighResolutionOutputSizeshNQ4ISI(getEra(), checkValidIntValue);
                }
                if (i2 == 7) {
                    return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.chrono.JapaneseEra.of(checkValidIntValue), this.getHighSpeedVideoFpsRanges);
                }
            }
            org.threeten.bp.LocalDate with = this.Camera2StreamConfigurationMap.with(temporalField, j);
            return with.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.JapaneseDate(with);
        }
        return (org.threeten.bp.chrono.JapaneseDate) temporalField.adjustInto(this, j);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.JapaneseDate plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.JapaneseDate) super.plus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.JapaneseDate plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.JapaneseDate) super.plus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.JapaneseDate minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.JapaneseDate) super.minus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.JapaneseDate minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.JapaneseDate) super.minus(j, temporalUnit);
    }

    private org.threeten.bp.chrono.JapaneseDate getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.chrono.JapaneseEra japaneseEra, int i) {
        org.threeten.bp.LocalDate withYear = this.Camera2StreamConfigurationMap.withYear(org.threeten.bp.chrono.JapaneseChronology.INSTANCE.prolepticYear(japaneseEra, i));
        return withYear.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.JapaneseDate(withYear);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.chrono.JapaneseDate> atTime(org.threeten.bp.LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ChronoPeriod until(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        org.threeten.bp.Period until = this.Camera2StreamConfigurationMap.until(chronoLocalDate);
        return getChronology().period(until.getYears(), until.getMonths(), until.getDays());
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.Camera2StreamConfigurationMap.toEpochDay();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.threeten.bp.chrono.JapaneseDate) {
            return this.Camera2StreamConfigurationMap.equals(((org.threeten.bp.chrono.JapaneseDate) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int hashCode() {
        return getChronology().getId().hashCode() ^ this.Camera2StreamConfigurationMap.hashCode();
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser((byte) 1, this);
    }

    static org.threeten.bp.chrono.ChronoLocalDate getHighSpeedVideoFpsRanges(java.io.DataInput dataInput) throws java.io.IOException {
        return org.threeten.bp.chrono.JapaneseChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.JapaneseDate> Camera2StreamConfigurationMap(long j) {
        org.threeten.bp.LocalDate plusDays = this.Camera2StreamConfigurationMap.plusDays(j);
        return plusDays.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.JapaneseDate(plusDays);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.JapaneseDate> getHighSpeedVideoFpsRangesFor(long j) {
        org.threeten.bp.LocalDate plusMonths = this.Camera2StreamConfigurationMap.plusMonths(j);
        return plusMonths.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.JapaneseDate(plusMonths);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.JapaneseDate> getHighSpeedVideoFpsRanges(long j) {
        org.threeten.bp.LocalDate plusYears = this.Camera2StreamConfigurationMap.plusYears(j);
        return plusYears.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.JapaneseDate(plusYears);
    }
}
