package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class MinguoDate extends org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.MinguoDate> implements java.io.Serializable {
    private static final long serialVersionUID = 1300372329181994526L;
    final org.threeten.bp.LocalDate getHighSpeedVideoFpsRanges;

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.temporal.Temporal
    public final /* bridge */ /* synthetic */ long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return super.until(temporal, temporalUnit);
    }

    public static org.threeten.bp.chrono.MinguoDate now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.chrono.MinguoDate now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.chrono.MinguoDate now(org.threeten.bp.Clock clock) {
        return new org.threeten.bp.chrono.MinguoDate(org.threeten.bp.LocalDate.now(clock));
    }

    public static org.threeten.bp.chrono.MinguoDate of(int i, int i2, int i3) {
        return org.threeten.bp.chrono.MinguoChronology.INSTANCE.date(i, i2, i3);
    }

    public static org.threeten.bp.chrono.MinguoDate from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return org.threeten.bp.chrono.MinguoChronology.INSTANCE.date(temporalAccessor);
    }

    MinguoDate(org.threeten.bp.LocalDate localDate) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDate, "date");
        this.getHighSpeedVideoFpsRanges = localDate;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.MinguoChronology getChronology() {
        return org.threeten.bp.chrono.MinguoChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.MinguoEra getEra() {
        return (org.threeten.bp.chrono.MinguoEra) super.getEra();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return this.getHighSpeedVideoFpsRanges.lengthOfMonth();
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (isSupported(temporalField)) {
                org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
                int i = org.threeten.bp.chrono.MinguoDate.AnonymousClass1.getHighSpeedVideoFpsRanges[chronoField.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return this.getHighSpeedVideoFpsRanges.range(temporalField);
                }
                if (i == 4) {
                    org.threeten.bp.temporal.ValueRange range = org.threeten.bp.temporal.ChronoField.YEAR.range();
                    return org.threeten.bp.temporal.ValueRange.of(1L, this.getHighSpeedVideoFpsRanges.getYear() + (-1911) <= 0 ? (-range.getMinimum()) + 1912 : range.getMaximum() - 1911);
                }
                return getChronology().range(chronoField);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* renamed from: org.threeten.bp.chrono.MinguoDate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.chrono.MinguoDate.AnonymousClass1.getHighSpeedVideoFpsRanges[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 4) {
                int year = this.getHighSpeedVideoFpsRanges.getYear() - 1911;
                if (year <= 0) {
                    year = 1 - year;
                }
                return year;
            }
            if (i == 5) {
                return (((this.getHighSpeedVideoFpsRanges.getYear() - 1911) * 12) + this.getHighSpeedVideoFpsRanges.getMonthValue()) - 1;
            }
            if (i == 6) {
                return this.getHighSpeedVideoFpsRanges.getYear() - 1911;
            }
            if (i != 7) {
                return this.getHighSpeedVideoFpsRanges.getLong(temporalField);
            }
            return this.getHighSpeedVideoFpsRanges.getYear() + (-1911) <= 0 ? 0 : 1;
        }
        return temporalField.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.MinguoDate with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return (org.threeten.bp.chrono.MinguoDate) super.with(temporalAdjuster);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r1 != 7) goto L23;
     */
    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.threeten.bp.chrono.MinguoDate with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            if (getLong(chronoField) == j) {
                return this;
            }
            int i = org.threeten.bp.chrono.MinguoDate.AnonymousClass1.getHighSpeedVideoFpsRanges[chronoField.ordinal()];
            if (i != 4) {
                if (i == 5) {
                    getChronology().range(chronoField).checkValidValue(j, chronoField);
                    org.threeten.bp.LocalDate plusMonths = this.getHighSpeedVideoFpsRanges.plusMonths(j - ((((this.getHighSpeedVideoFpsRanges.getYear() - 1911) * 12) + this.getHighSpeedVideoFpsRanges.getMonthValue()) - 1));
                    return plusMonths.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(plusMonths);
                }
                if (i != 6) {
                }
            }
            int checkValidIntValue = getChronology().range(chronoField).checkValidIntValue(j, chronoField);
            int i2 = org.threeten.bp.chrono.MinguoDate.AnonymousClass1.getHighSpeedVideoFpsRanges[chronoField.ordinal()];
            if (i2 == 4) {
                org.threeten.bp.LocalDate localDate = this.getHighSpeedVideoFpsRanges;
                org.threeten.bp.LocalDate withYear = localDate.withYear(localDate.getYear() + (-1911) > 0 ? checkValidIntValue + 1911 : 1912 - checkValidIntValue);
                return withYear.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(withYear);
            }
            if (i2 == 6) {
                org.threeten.bp.LocalDate withYear2 = this.getHighSpeedVideoFpsRanges.withYear(checkValidIntValue + 1911);
                return withYear2.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(withYear2);
            }
            if (i2 == 7) {
                org.threeten.bp.LocalDate withYear3 = this.getHighSpeedVideoFpsRanges.withYear(1912 - (r7.getYear() - 1911));
                return withYear3.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(withYear3);
            }
            org.threeten.bp.LocalDate with = this.getHighSpeedVideoFpsRanges.with(temporalField, j);
            return with.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(with);
        }
        return (org.threeten.bp.chrono.MinguoDate) temporalField.adjustInto(this, j);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.MinguoDate plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.MinguoDate) super.plus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.MinguoDate plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.MinguoDate) super.plus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.MinguoDate minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.MinguoDate) super.minus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.MinguoDate minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.MinguoDate) super.minus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.chrono.MinguoDate> atTime(org.threeten.bp.LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ChronoPeriod until(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        org.threeten.bp.Period until = this.getHighSpeedVideoFpsRanges.until(chronoLocalDate);
        return getChronology().period(until.getYears(), until.getMonths(), until.getDays());
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.getHighSpeedVideoFpsRanges.toEpochDay();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.threeten.bp.chrono.MinguoDate) {
            return this.getHighSpeedVideoFpsRanges.equals(((org.threeten.bp.chrono.MinguoDate) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int hashCode() {
        return getChronology().getId().hashCode() ^ this.getHighSpeedVideoFpsRanges.hashCode();
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser((byte) 5, this);
    }

    static org.threeten.bp.chrono.ChronoLocalDate getHighSpeedVideoFpsRangesFor(java.io.DataInput dataInput) throws java.io.IOException {
        return org.threeten.bp.chrono.MinguoChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.MinguoDate> Camera2StreamConfigurationMap(long j) {
        org.threeten.bp.LocalDate plusDays = this.getHighSpeedVideoFpsRanges.plusDays(j);
        return plusDays.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(plusDays);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.MinguoDate> getHighSpeedVideoFpsRangesFor(long j) {
        org.threeten.bp.LocalDate plusMonths = this.getHighSpeedVideoFpsRanges.plusMonths(j);
        return plusMonths.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(plusMonths);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.MinguoDate> getHighSpeedVideoFpsRanges(long j) {
        org.threeten.bp.LocalDate plusYears = this.getHighSpeedVideoFpsRanges.plusYears(j);
        return plusYears.equals(this.getHighSpeedVideoFpsRanges) ? this : new org.threeten.bp.chrono.MinguoDate(plusYears);
    }
}
