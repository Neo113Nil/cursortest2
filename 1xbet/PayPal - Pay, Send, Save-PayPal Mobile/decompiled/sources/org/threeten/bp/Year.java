package org.threeten.bp;

/* loaded from: classes18.dex */
public final class Year extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.Year>, java.io.Serializable {
    public static final int MAX_VALUE = 999999999;
    public static final int MIN_VALUE = -999999999;
    private static final long serialVersionUID = -23038383694477807L;
    final int getHighSpeedVideoFpsRangesFor;
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Year> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Year>() { // from class: org.threeten.bp.Year.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.Year queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.Year.from(temporalAccessor);
        }
    };
    private static final org.threeten.bp.format.DateTimeFormatter Camera2StreamConfigurationMap = new org.threeten.bp.format.DateTimeFormatterBuilder().appendValue(org.threeten.bp.temporal.ChronoField.YEAR, 4, 10, org.threeten.bp.format.SignStyle.EXCEEDS_PAD).toFormatter();

    public static org.threeten.bp.Year now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.Year now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.Year now(org.threeten.bp.Clock clock) {
        return of(org.threeten.bp.LocalDate.now(clock).getYear());
    }

    public static org.threeten.bp.Year of(int i) {
        org.threeten.bp.temporal.ChronoField.YEAR.checkValidValue(i);
        return new org.threeten.bp.Year(i);
    }

    public static org.threeten.bp.Year from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.Year) {
            return (org.threeten.bp.Year) temporalAccessor;
        }
        try {
            if (!org.threeten.bp.chrono.IsoChronology.INSTANCE.equals(org.threeten.bp.chrono.Chronology.from(temporalAccessor))) {
                temporalAccessor = org.threeten.bp.LocalDate.from(temporalAccessor);
            }
            return of(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.YEAR));
        } catch (org.threeten.bp.DateTimeException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain Year from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    public static org.threeten.bp.Year parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, Camera2StreamConfigurationMap);
    }

    public static org.threeten.bp.Year parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.Year) dateTimeFormatter.parse(charSequence, FROM);
    }

    public static boolean isLeap(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    private Year(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final int getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.YEAR || temporalField == org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA || temporalField == org.threeten.bp.temporal.ChronoField.ERA : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit ? temporalUnit == org.threeten.bp.temporal.ChronoUnit.YEARS || temporalUnit == org.threeten.bp.temporal.ChronoUnit.DECADES || temporalUnit == org.threeten.bp.temporal.ChronoUnit.CENTURIES || temporalUnit == org.threeten.bp.temporal.ChronoUnit.MILLENNIA || temporalUnit == org.threeten.bp.temporal.ChronoUnit.ERAS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA) {
            return org.threeten.bp.temporal.ValueRange.of(1L, this.getHighSpeedVideoFpsRangesFor <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.Year.AnonymousClass2.getHighSpeedVideoFpsRanges[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 1) {
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                if (i2 <= 0) {
                    i2 = 1 - i2;
                }
                return i2;
            }
            if (i == 2) {
                return this.getHighSpeedVideoFpsRangesFor;
            }
            if (i == 3) {
                return this.getHighSpeedVideoFpsRangesFor <= 0 ? 0 : 1;
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.getFrom(this);
    }

    public final boolean isLeap() {
        return isLeap(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean isValidMonthDay(org.threeten.bp.MonthDay monthDay) {
        return monthDay != null && monthDay.isValidYear(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int length() {
        return isLeap() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Year with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return (org.threeten.bp.Year) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Year with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = org.threeten.bp.Year.AnonymousClass2.getHighSpeedVideoFpsRanges[chronoField.ordinal()];
            if (i == 1) {
                if (this.getHighSpeedVideoFpsRangesFor <= 0) {
                    j = 1 - j;
                }
                return of((int) j);
            }
            if (i == 2) {
                return of((int) j);
            }
            if (i == 3) {
                return getLong(org.threeten.bp.temporal.ChronoField.ERA) == j ? this : of(1 - this.getHighSpeedVideoFpsRangesFor);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return (org.threeten.bp.Year) temporalField.adjustInto(this, j);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Year plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.Year) temporalAmount.addTo(this);
    }

    /* renamed from: org.threeten.bp.Year$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.YEARS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.DECADES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.CENTURIES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.MILLENNIA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.ERAS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Year plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            int i = org.threeten.bp.Year.AnonymousClass2.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return plusYears(j);
            }
            if (i == 2) {
                return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 10));
            }
            if (i == 3) {
                return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 100));
            }
            if (i == 4) {
                return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 1000));
            }
            if (i == 5) {
                return with((org.threeten.bp.temporal.TemporalField) org.threeten.bp.temporal.ChronoField.ERA, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(getLong(org.threeten.bp.temporal.ChronoField.ERA), j));
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
        return (org.threeten.bp.Year) temporalUnit.addTo(this, j);
    }

    public final org.threeten.bp.Year plusYears(long j) {
        return j == 0 ? this : of(org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(this.getHighSpeedVideoFpsRangesFor + j));
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Year minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.Year) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Year minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.Year minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) org.threeten.bp.chrono.IsoChronology.INSTANCE;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.YEARS;
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
        return temporal.with(org.threeten.bp.temporal.ChronoField.YEAR, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.Year from = from(temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            long j = from.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoFpsRangesFor;
            int i = org.threeten.bp.Year.AnonymousClass2.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()];
            if (i == 1) {
                return j;
            }
            if (i == 2) {
                return j / 10;
            }
            if (i == 3) {
                return j / 100;
            }
            if (i == 4) {
                return j / 1000;
            }
            if (i == 5) {
                return from.getLong(org.threeten.bp.temporal.ChronoField.ERA) - getLong(org.threeten.bp.temporal.ChronoField.ERA);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
        return temporalUnit.between(this, from);
    }

    public final org.threeten.bp.LocalDate atDay(int i) {
        return org.threeten.bp.LocalDate.ofYearDay(this.getHighSpeedVideoFpsRangesFor, i);
    }

    public final org.threeten.bp.YearMonth atMonth(org.threeten.bp.Month month) {
        return org.threeten.bp.YearMonth.of(this.getHighSpeedVideoFpsRangesFor, month);
    }

    public final org.threeten.bp.YearMonth atMonth(int i) {
        return org.threeten.bp.YearMonth.of(this.getHighSpeedVideoFpsRangesFor, i);
    }

    public final org.threeten.bp.LocalDate atMonthDay(org.threeten.bp.MonthDay monthDay) {
        return monthDay.atYear(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.Year year) {
        return this.getHighSpeedVideoFpsRangesFor - year.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isAfter(org.threeten.bp.Year year) {
        return this.getHighSpeedVideoFpsRangesFor > year.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isBefore(org.threeten.bp.Year year) {
        return this.getHighSpeedVideoFpsRangesFor < year.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.Year) && this.getHighSpeedVideoFpsRangesFor == ((org.threeten.bp.Year) obj).getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 67, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.Year getHighSpeedVideoSizes(java.io.DataInput dataInput) throws java.io.IOException {
        return of(dataInput.readInt());
    }
}
