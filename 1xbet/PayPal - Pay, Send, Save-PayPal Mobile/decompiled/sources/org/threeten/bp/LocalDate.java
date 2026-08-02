package org.threeten.bp;

/* loaded from: classes18.dex */
public final class LocalDate extends org.threeten.bp.chrono.ChronoLocalDate implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.io.Serializable {
    private static final long serialVersionUID = 2942565459149668126L;
    final short Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRangesFor;
    final short getHighSpeedVideoSizes;
    public static final org.threeten.bp.LocalDate MIN = of(org.threeten.bp.Year.MIN_VALUE, 1, 1);
    public static final org.threeten.bp.LocalDate MAX = of(org.threeten.bp.Year.MAX_VALUE, 12, 31);
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalDate> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalDate>() { // from class: org.threeten.bp.LocalDate.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.LocalDate queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.LocalDate.from(temporalAccessor);
        }
    };

    @Override // org.threeten.bp.chrono.ChronoLocalDate, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return compareTo((org.threeten.bp.chrono.ChronoLocalDate) obj);
    }

    public static org.threeten.bp.LocalDate now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.LocalDate now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.LocalDate now(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return ofEpochDay(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(clock.instant().getEpochSecond() + clock.getZone().getRules().getOffset(r0).getTotalSeconds(), 86400L));
    }

    public static org.threeten.bp.LocalDate of(int i, org.threeten.bp.Month month, int i2) {
        org.threeten.bp.temporal.ChronoField.YEAR.checkValidValue(i);
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(month, "month");
        org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.checkValidValue(i2);
        return getHighSpeedVideoFpsRanges(i, month, i2);
    }

    public static org.threeten.bp.LocalDate of(int i, int i2, int i3) {
        org.threeten.bp.temporal.ChronoField.YEAR.checkValidValue(i);
        org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidValue(i2);
        org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.checkValidValue(i3);
        return getHighSpeedVideoFpsRanges(i, org.threeten.bp.Month.of(i2), i3);
    }

    public static org.threeten.bp.LocalDate ofYearDay(int i, int i2) {
        long j = i;
        org.threeten.bp.temporal.ChronoField.YEAR.checkValidValue(j);
        org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.checkValidValue(i2);
        boolean isLeapYear = org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(j);
        if (i2 == 366 && !isLeapYear) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid date 'DayOfYear 366' as '");
            sb.append(i);
            sb.append("' is not a leap year");
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        org.threeten.bp.Month of = org.threeten.bp.Month.of(((i2 - 1) / 31) + 1);
        if (i2 > (of.firstDayOfYear(isLeapYear) + of.length(isLeapYear)) - 1) {
            of = of.plus(1L);
        }
        return getHighSpeedVideoFpsRanges(i, of, (i2 - of.firstDayOfYear(isLeapYear)) + 1);
    }

    public static org.threeten.bp.LocalDate ofEpochDay(long j) {
        long j2;
        org.threeten.bp.temporal.ChronoField.EPOCH_DAY.checkValidValue(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new org.threeten.bp.LocalDate(org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(j5 + j2 + (i2 / 10)), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static org.threeten.bp.LocalDate from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.LocalDate localDate = (org.threeten.bp.LocalDate) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.localDate());
        if (localDate != null) {
            return localDate;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain LocalDate from TemporalAccessor: ");
        sb.append(temporalAccessor);
        sb.append(", type ");
        sb.append(temporalAccessor.getClass().getName());
        throw new org.threeten.bp.DateTimeException(sb.toString());
    }

    public static org.threeten.bp.LocalDate parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, org.threeten.bp.format.DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static org.threeten.bp.LocalDate parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.LocalDate) dateTimeFormatter.parse(charSequence, FROM);
    }

    private static org.threeten.bp.LocalDate getHighSpeedVideoFpsRanges(int i, org.threeten.bp.Month month, int i2) {
        if (i2 <= 28 || i2 <= month.length(org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(i))) {
            return new org.threeten.bp.LocalDate(i, month.getValue(), i2);
        }
        if (i2 == 29) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid date 'February 29' as '");
            sb.append(i);
            sb.append("' is not a leap year");
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid date '");
        sb2.append(month.name());
        sb2.append(" ");
        sb2.append(i2);
        sb2.append("'");
        throw new org.threeten.bp.DateTimeException(sb2.toString());
    }

    private static org.threeten.bp.LocalDate getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = java.lang.Math.min(i3, org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = java.lang.Math.min(i3, 30);
        }
        return of(i, i2, i3);
    }

    private LocalDate(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = (short) i2;
        this.getHighSpeedVideoSizes = (short) i3;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return super.isSupported(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            if (chronoField.isDateBased()) {
                int i = org.threeten.bp.LocalDate.AnonymousClass2.getHighSpeedVideoFpsRanges[chronoField.ordinal()];
                if (i == 1) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, lengthOfMonth());
                }
                if (i == 2) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, lengthOfYear());
                }
                if (i == 3) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, (getMonth() != org.threeten.bp.Month.FEBRUARY || isLeapYear()) ? 5L : 4L);
                }
                if (i != 4) {
                    return temporalField.range();
                }
                return getYear() <= 0 ? org.threeten.bp.temporal.ValueRange.of(1L, 1000000000L) : org.threeten.bp.temporal.ValueRange.of(1L, 999999999L);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return getHighResolutionOutputSizeshNQ4ISI(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.EPOCH_DAY) {
                return toEpochDay();
            }
            if (temporalField != org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH) {
                return getHighResolutionOutputSizeshNQ4ISI(temporalField);
            }
            return (this.getHighSpeedVideoFpsRangesFor * 12) + (this.Camera2StreamConfigurationMap - 1);
        }
        return temporalField.getFrom(this);
    }

    private int getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.TemporalField temporalField) {
        switch (org.threeten.bp.LocalDate.AnonymousClass2.getHighSpeedVideoFpsRanges[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.getHighSpeedVideoSizes;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.getHighSpeedVideoSizes - 1) / 7) + 1;
            case 4:
                int i = this.getHighSpeedVideoFpsRangesFor;
                return i > 0 ? i : 1 - i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.getHighSpeedVideoSizes - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new org.threeten.bp.DateTimeException("Field too large for an int: ".concat(java.lang.String.valueOf(temporalField)));
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.Camera2StreamConfigurationMap;
            case 11:
                throw new org.threeten.bp.DateTimeException("Field too large for an int: ".concat(java.lang.String.valueOf(temporalField)));
            case 12:
                return this.getHighSpeedVideoFpsRangesFor;
            case 13:
                return this.getHighSpeedVideoFpsRangesFor > 0 ? 1 : 0;
            default:
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.IsoChronology getChronology() {
        return org.threeten.bp.chrono.IsoChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.Era getEra() {
        return super.getEra();
    }

    public final int getYear() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getMonthValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public final org.threeten.bp.Month getMonth() {
        return org.threeten.bp.Month.of(this.Camera2StreamConfigurationMap);
    }

    public final int getDayOfMonth() {
        return this.getHighSpeedVideoSizes;
    }

    public final int getDayOfYear() {
        return (getMonth().firstDayOfYear(isLeapYear()) + this.getHighSpeedVideoSizes) - 1;
    }

    public final org.threeten.bp.DayOfWeek getDayOfWeek() {
        return org.threeten.bp.DayOfWeek.of(org.threeten.bp.jdk8.Jdk8Methods.floorMod(toEpochDay() + 3, 7) + 1);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        short s = this.Camera2StreamConfigurationMap;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDate with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof org.threeten.bp.LocalDate) {
            return (org.threeten.bp.LocalDate) temporalAdjuster;
        }
        return (org.threeten.bp.LocalDate) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDate with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            chronoField.checkValidValue(j);
            switch (org.threeten.bp.LocalDate.AnonymousClass2.getHighSpeedVideoFpsRanges[chronoField.ordinal()]) {
                case 1:
                    return withDayOfMonth((int) j);
                case 2:
                    return withDayOfYear((int) j);
                case 3:
                    return plusWeeks(j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (this.getHighSpeedVideoFpsRangesFor <= 0) {
                        j = 1 - j;
                    }
                    return withYear((int) j);
                case 5:
                    return plusDays(j - getDayOfWeek().getValue());
                case 6:
                    return plusDays(j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return plusDays(j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return ofEpochDay(j);
                case 9:
                    return plusWeeks(j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    return withMonth((int) j);
                case 11:
                    return plusMonths(j - getLong(org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH));
                case 12:
                    return withYear((int) j);
                case 13:
                    return getLong(org.threeten.bp.temporal.ChronoField.ERA) == j ? this : withYear(1 - this.getHighSpeedVideoFpsRangesFor);
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }
        }
        return (org.threeten.bp.LocalDate) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.LocalDate withYear(int i) {
        if (this.getHighSpeedVideoFpsRangesFor == i) {
            return this;
        }
        org.threeten.bp.temporal.ChronoField.YEAR.checkValidValue(i);
        return getHighSpeedVideoFpsRanges(i, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
    }

    public final org.threeten.bp.LocalDate withMonth(int i) {
        if (this.Camera2StreamConfigurationMap == i) {
            return this;
        }
        org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidValue(i);
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, i, this.getHighSpeedVideoSizes);
    }

    public final org.threeten.bp.LocalDate withDayOfMonth(int i) {
        return this.getHighSpeedVideoSizes == i ? this : of(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, i);
    }

    public final org.threeten.bp.LocalDate withDayOfYear(int i) {
        return getDayOfYear() == i ? this : ofYearDay(this.getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDate plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.LocalDate) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDate plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            switch (org.threeten.bp.LocalDate.AnonymousClass2.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusDays(j);
                case 2:
                    return plusWeeks(j);
                case 3:
                    return plusMonths(j);
                case 4:
                    return plusYears(j);
                case 5:
                    return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 10));
                case 6:
                    return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 100));
                case 7:
                    return plusYears(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 1000));
                case 8:
                    return with((org.threeten.bp.temporal.TemporalField) org.threeten.bp.temporal.ChronoField.ERA, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(getLong(org.threeten.bp.temporal.ChronoField.ERA), j));
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
            }
        }
        return (org.threeten.bp.LocalDate) temporalUnit.addTo(this, j);
    }

    /* renamed from: org.threeten.bp.LocalDate$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.DAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.WEEKS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MONTHS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.YEARS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.DECADES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.CENTURIES.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.MILLENNIA.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[org.threeten.bp.temporal.ChronoUnit.ERAS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoFpsRanges = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.EPOCH_DAY.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
        }
    }

    public final org.threeten.bp.LocalDate plusYears(long j) {
        return j == 0 ? this : getHighSpeedVideoFpsRanges(org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(this.getHighSpeedVideoFpsRangesFor + j), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
    }

    public final org.threeten.bp.LocalDate plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.getHighSpeedVideoFpsRangesFor * 12) + (this.Camera2StreamConfigurationMap - 1) + j;
        return getHighSpeedVideoFpsRanges(org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j2, 12L)), org.threeten.bp.jdk8.Jdk8Methods.floorMod(j2, 12) + 1, this.getHighSpeedVideoSizes);
    }

    public final org.threeten.bp.LocalDate plusWeeks(long j) {
        return plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 7));
    }

    public final org.threeten.bp.LocalDate plusDays(long j) {
        return j == 0 ? this : ofEpochDay(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(toEpochDay(), j));
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDate minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.LocalDate) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.LocalDate minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.LocalDate minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public final org.threeten.bp.LocalDate minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public final org.threeten.bp.LocalDate minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1L) : plusWeeks(-j);
    }

    public final org.threeten.bp.LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        return temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() ? this : (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return super.adjustInto(temporal);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.LocalDate from = from((org.threeten.bp.temporal.TemporalAccessor) temporal);
        if (!(temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit)) {
            return temporalUnit.between(this, from);
        }
        switch (org.threeten.bp.LocalDate.AnonymousClass2.Camera2StreamConfigurationMap[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return from.toEpochDay() - toEpochDay();
            case 2:
                return (from.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return getHighSpeedVideoFpsRanges(from);
            case 4:
                return getHighSpeedVideoFpsRanges(from) / 12;
            case 5:
                return getHighSpeedVideoFpsRanges(from) / 120;
            case 6:
                return getHighSpeedVideoFpsRanges(from) / com.paypal.pds.core.ConstantsKt.MotionDuration1200;
            case 7:
                return getHighSpeedVideoFpsRanges(from) / com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions.DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS;
            case 8:
                return from.getLong(org.threeten.bp.temporal.ChronoField.ERA) - getLong(org.threeten.bp.temporal.ChronoField.ERA);
            default:
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.Period until(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        org.threeten.bp.LocalDate from = from((org.threeten.bp.temporal.TemporalAccessor) chronoLocalDate);
        long j = ((from.getHighSpeedVideoFpsRangesFor * 12) + (from.Camera2StreamConfigurationMap - 1)) - ((this.getHighSpeedVideoFpsRangesFor * 12) + (this.Camera2StreamConfigurationMap - 1));
        int i = from.getHighSpeedVideoSizes - this.getHighSpeedVideoSizes;
        if (j > 0 && i < 0) {
            j--;
            i = (int) (from.toEpochDay() - plusMonths(j).toEpochDay());
        } else if (j < 0 && i > 0) {
            j++;
            i -= from.lengthOfMonth();
        }
        return org.threeten.bp.Period.of(org.threeten.bp.jdk8.Jdk8Methods.safeToInt(j / 12), (int) (j % 12), i);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.LocalDateTime atTime(org.threeten.bp.LocalTime localTime) {
        return org.threeten.bp.LocalDateTime.of(this, localTime);
    }

    public final org.threeten.bp.LocalDateTime atTime(int i, int i2) {
        return atTime(org.threeten.bp.LocalTime.of(i, i2));
    }

    public final org.threeten.bp.LocalDateTime atTime(int i, int i2, int i3) {
        return atTime(org.threeten.bp.LocalTime.of(i, i2, i3));
    }

    public final org.threeten.bp.LocalDateTime atTime(int i, int i2, int i3, int i4) {
        return atTime(org.threeten.bp.LocalTime.of(i, i2, i3, i4));
    }

    public final org.threeten.bp.OffsetDateTime atTime(org.threeten.bp.OffsetTime offsetTime) {
        return org.threeten.bp.OffsetDateTime.of(org.threeten.bp.LocalDateTime.of(this, offsetTime.toLocalTime()), offsetTime.getOffset());
    }

    public final org.threeten.bp.LocalDateTime atStartOfDay() {
        return org.threeten.bp.LocalDateTime.of(this, org.threeten.bp.LocalTime.MIDNIGHT);
    }

    public final org.threeten.bp.ZonedDateTime atStartOfDay(org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.zone.ZoneOffsetTransition transition;
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        org.threeten.bp.LocalDateTime atTime = atTime(org.threeten.bp.LocalTime.MIDNIGHT);
        if (!(zoneId instanceof org.threeten.bp.ZoneOffset) && (transition = zoneId.getRules().getTransition(atTime)) != null && transition.isGap()) {
            atTime = transition.getDateTimeAfter();
        }
        return org.threeten.bp.ZonedDateTime.of(atTime, zoneId);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final long toEpochDay() {
        long j;
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        long j3 = this.Camera2StreamConfigurationMap;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j4 - (((j2 / (-4)) - (j2 / (-100))) + (j2 / (-400)));
        }
        long j5 = j + (((367 * j3) - 362) / 12) + (this.getHighSpeedVideoSizes - 1);
        if (j3 > 2) {
            j5 -= isLeapYear() ? 1L : 2L;
        }
        return j5 - 719528;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int compareTo(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof org.threeten.bp.LocalDate) {
            return getHighSpeedVideoSizes((org.threeten.bp.LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    final int getHighSpeedVideoSizes(org.threeten.bp.LocalDate localDate) {
        int i = this.getHighSpeedVideoFpsRangesFor - localDate.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            return i;
        }
        int i2 = this.Camera2StreamConfigurationMap - localDate.Camera2StreamConfigurationMap;
        return i2 == 0 ? this.getHighSpeedVideoSizes - localDate.getHighSpeedVideoSizes : i2;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean isAfter(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof org.threeten.bp.LocalDate) {
            return getHighSpeedVideoSizes((org.threeten.bp.LocalDate) chronoLocalDate) > 0;
        }
        return super.isAfter(chronoLocalDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean isBefore(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof org.threeten.bp.LocalDate) {
            return getHighSpeedVideoSizes((org.threeten.bp.LocalDate) chronoLocalDate) < 0;
        }
        return super.isBefore(chronoLocalDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean isEqual(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof org.threeten.bp.LocalDate) {
            return getHighSpeedVideoSizes((org.threeten.bp.LocalDate) chronoLocalDate) == 0;
        }
        return super.isEqual(chronoLocalDate);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.LocalDate) && getHighSpeedVideoSizes((org.threeten.bp.LocalDate) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int hashCode() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        return (i & (-2048)) ^ (((i << 11) + (this.Camera2StreamConfigurationMap << 6)) + this.getHighSpeedVideoSizes);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final java.lang.String toString() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        short s = this.Camera2StreamConfigurationMap;
        short s2 = this.getHighSpeedVideoSizes;
        int abs = java.lang.Math.abs(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        return super.format(dateTimeFormatter);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 3, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.LocalDate getHighSpeedVideoFpsRangesFor(java.io.DataInput dataInput) throws java.io.IOException {
        return of(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private long getHighSpeedVideoFpsRanges(org.threeten.bp.LocalDate localDate) {
        long j = (this.getHighSpeedVideoFpsRangesFor * 12) + (this.Camera2StreamConfigurationMap - 1);
        return (((((localDate.getHighSpeedVideoFpsRangesFor * 12) + (localDate.Camera2StreamConfigurationMap - 1)) * 32) + localDate.getDayOfMonth()) - ((j * 32) + getDayOfMonth())) / 32;
    }
}
