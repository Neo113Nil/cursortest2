package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class ThaiBuddhistDate extends org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.ThaiBuddhistDate> implements java.io.Serializable {
    private static final long serialVersionUID = -8722293800195731463L;
    final org.threeten.bp.LocalDate Camera2StreamConfigurationMap;

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.temporal.Temporal
    public final /* bridge */ /* synthetic */ long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return super.until(temporal, temporalUnit);
    }

    public static org.threeten.bp.chrono.ThaiBuddhistDate now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.chrono.ThaiBuddhistDate now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.chrono.ThaiBuddhistDate now(org.threeten.bp.Clock clock) {
        return new org.threeten.bp.chrono.ThaiBuddhistDate(org.threeten.bp.LocalDate.now(clock));
    }

    public static org.threeten.bp.chrono.ThaiBuddhistDate of(int i, int i2, int i3) {
        return org.threeten.bp.chrono.ThaiBuddhistChronology.INSTANCE.date(i, i2, i3);
    }

    public static org.threeten.bp.chrono.ThaiBuddhistDate from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return org.threeten.bp.chrono.ThaiBuddhistChronology.INSTANCE.date(temporalAccessor);
    }

    ThaiBuddhistDate(org.threeten.bp.LocalDate localDate) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDate, "date");
        this.Camera2StreamConfigurationMap = localDate;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ThaiBuddhistChronology getChronology() {
        return org.threeten.bp.chrono.ThaiBuddhistChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ThaiBuddhistEra getEra() {
        return (org.threeten.bp.chrono.ThaiBuddhistEra) super.getEra();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return this.Camera2StreamConfigurationMap.lengthOfMonth();
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (isSupported(temporalField)) {
                org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
                int i = org.threeten.bp.chrono.ThaiBuddhistDate.AnonymousClass1.getHighSpeedVideoFpsRangesFor[chronoField.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return this.Camera2StreamConfigurationMap.range(temporalField);
                }
                if (i == 4) {
                    org.threeten.bp.temporal.ValueRange range = org.threeten.bp.temporal.ChronoField.YEAR.range();
                    return org.threeten.bp.temporal.ValueRange.of(1L, this.Camera2StreamConfigurationMap.getYear() + 543 <= 0 ? (-(range.getMinimum() + 543)) + 1 : 543 + range.getMaximum());
                }
                return getChronology().range(chronoField);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* renamed from: org.threeten.bp.chrono.ThaiBuddhistDate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.chrono.ThaiBuddhistDate.AnonymousClass1.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 4) {
                int year = this.Camera2StreamConfigurationMap.getYear() + 543;
                if (year <= 0) {
                    year = 1 - year;
                }
                return year;
            }
            if (i == 5) {
                return (((this.Camera2StreamConfigurationMap.getYear() + 543) * 12) + this.Camera2StreamConfigurationMap.getMonthValue()) - 1;
            }
            if (i == 6) {
                return this.Camera2StreamConfigurationMap.getYear() + 543;
            }
            if (i != 7) {
                return this.Camera2StreamConfigurationMap.getLong(temporalField);
            }
            return this.Camera2StreamConfigurationMap.getYear() + 543 <= 0 ? 0 : 1;
        }
        return temporalField.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.ThaiBuddhistDate with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return (org.threeten.bp.chrono.ThaiBuddhistDate) super.with(temporalAdjuster);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r1 != 7) goto L23;
     */
    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.threeten.bp.chrono.ThaiBuddhistDate with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            if (getLong(chronoField) == j) {
                return this;
            }
            int i = org.threeten.bp.chrono.ThaiBuddhistDate.AnonymousClass1.getHighSpeedVideoFpsRangesFor[chronoField.ordinal()];
            if (i != 4) {
                if (i == 5) {
                    getChronology().range(chronoField).checkValidValue(j, chronoField);
                    org.threeten.bp.LocalDate plusMonths = this.Camera2StreamConfigurationMap.plusMonths(j - ((((this.Camera2StreamConfigurationMap.getYear() + 543) * 12) + this.Camera2StreamConfigurationMap.getMonthValue()) - 1));
                    return plusMonths.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(plusMonths);
                }
                if (i != 6) {
                }
            }
            int checkValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
            int i2 = org.threeten.bp.chrono.ThaiBuddhistDate.AnonymousClass1.getHighSpeedVideoFpsRangesFor[chronoField.ordinal()];
            if (i2 == 4) {
                org.threeten.bp.LocalDate localDate = this.Camera2StreamConfigurationMap;
                if (localDate.getYear() + 543 <= 0) {
                    checkValidIntValue = 1 - checkValidIntValue;
                }
                org.threeten.bp.LocalDate withYear = localDate.withYear(checkValidIntValue - 543);
                return withYear.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(withYear);
            }
            if (i2 == 6) {
                org.threeten.bp.LocalDate withYear2 = this.Camera2StreamConfigurationMap.withYear(checkValidIntValue - 543);
                return withYear2.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(withYear2);
            }
            if (i2 == 7) {
                org.threeten.bp.LocalDate localDate2 = this.Camera2StreamConfigurationMap;
                org.threeten.bp.LocalDate withYear3 = localDate2.withYear((-542) - (localDate2.getYear() + 543));
                return withYear3.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(withYear3);
            }
            org.threeten.bp.LocalDate with = this.Camera2StreamConfigurationMap.with(temporalField, j);
            return with.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(with);
        }
        return (org.threeten.bp.chrono.ThaiBuddhistDate) temporalField.adjustInto(this, j);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.ThaiBuddhistDate plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.ThaiBuddhistDate) super.plus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.ThaiBuddhistDate plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.ThaiBuddhistDate) super.plus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.ThaiBuddhistDate minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.ThaiBuddhistDate) super.minus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.ThaiBuddhistDate minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.ThaiBuddhistDate) super.minus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.chrono.ThaiBuddhistDate> atTime(org.threeten.bp.LocalTime localTime) {
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
        if (obj instanceof org.threeten.bp.chrono.ThaiBuddhistDate) {
            return this.Camera2StreamConfigurationMap.equals(((org.threeten.bp.chrono.ThaiBuddhistDate) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int hashCode() {
        return getChronology().getId().hashCode() ^ this.Camera2StreamConfigurationMap.hashCode();
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser((byte) 7, this);
    }

    static org.threeten.bp.chrono.ChronoLocalDate getHighSpeedVideoFpsRanges(java.io.DataInput dataInput) throws java.io.IOException {
        return org.threeten.bp.chrono.ThaiBuddhistChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.ThaiBuddhistDate> Camera2StreamConfigurationMap(long j) {
        org.threeten.bp.LocalDate plusDays = this.Camera2StreamConfigurationMap.plusDays(j);
        return plusDays.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(plusDays);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.ThaiBuddhistDate> getHighSpeedVideoFpsRangesFor(long j) {
        org.threeten.bp.LocalDate plusMonths = this.Camera2StreamConfigurationMap.plusMonths(j);
        return plusMonths.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(plusMonths);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.ThaiBuddhistDate> getHighSpeedVideoFpsRanges(long j) {
        org.threeten.bp.LocalDate plusYears = this.Camera2StreamConfigurationMap.plusYears(j);
        return plusYears.equals(this.Camera2StreamConfigurationMap) ? this : new org.threeten.bp.chrono.ThaiBuddhistDate(plusYears);
    }
}
