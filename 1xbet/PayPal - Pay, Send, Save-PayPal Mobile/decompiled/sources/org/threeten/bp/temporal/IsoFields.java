package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public final class IsoFields {
    public static final org.threeten.bp.temporal.TemporalField DAY_OF_QUARTER = org.threeten.bp.temporal.IsoFields.Field.DAY_OF_QUARTER;
    public static final org.threeten.bp.temporal.TemporalField QUARTER_OF_YEAR = org.threeten.bp.temporal.IsoFields.Field.QUARTER_OF_YEAR;
    public static final org.threeten.bp.temporal.TemporalField WEEK_OF_WEEK_BASED_YEAR = org.threeten.bp.temporal.IsoFields.Field.WEEK_OF_WEEK_BASED_YEAR;
    public static final org.threeten.bp.temporal.TemporalField WEEK_BASED_YEAR = org.threeten.bp.temporal.IsoFields.Field.WEEK_BASED_YEAR;
    public static final org.threeten.bp.temporal.TemporalUnit WEEK_BASED_YEARS = org.threeten.bp.temporal.IsoFields.Unit.WEEK_BASED_YEARS;
    public static final org.threeten.bp.temporal.TemporalUnit QUARTER_YEARS = org.threeten.bp.temporal.IsoFields.Unit.QUARTER_YEARS;

    private IsoFields() {
        throw new java.lang.AssertionError("Not instantiable");
    }

    enum Field implements org.threeten.bp.temporal.TemporalField {
        DAY_OF_QUARTER { // from class: org.threeten.bp.temporal.IsoFields.Field.1
            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "DayOfQuarter";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getBaseUnit() {
                return org.threeten.bp.temporal.ChronoUnit.DAYS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getRangeUnit() {
                return org.threeten.bp.temporal.IsoFields.QUARTER_YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange range() {
                return org.threeten.bp.temporal.ValueRange.of(1L, 90L, 92L);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR) && temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) && temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.YEAR) && org.threeten.bp.chrono.Chronology.from(temporalAccessor).equals(org.threeten.bp.chrono.IsoChronology.INSTANCE);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long j = temporalAccessor.getLong(QUARTER_OF_YEAR);
                if (j == 1) {
                    return org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.YEAR)) ? org.threeten.bp.temporal.ValueRange.of(1L, 91L) : org.threeten.bp.temporal.ValueRange.of(1L, 90L);
                }
                if (j == 2) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, 91L);
                }
                if (j == 3 || j == 4) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, 92L);
                }
                return range();
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR) - org.threeten.bp.temporal.IsoFields.Field.getHighSpeedVideoSizesFor[((temporalAccessor.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) - 1) / 3) + (org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().checkValidValue(j, this);
                return (R) r.with(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR, r.getLong(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR) + (j - from));
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalAccessor resolve(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.ResolverStyle resolverStyle) {
                org.threeten.bp.LocalDate plusDays;
                int i;
                java.lang.Long l = map.get(org.threeten.bp.temporal.ChronoField.YEAR);
                java.lang.Long l2 = map.get(QUARTER_OF_YEAR);
                if (l == null || l2 == null) {
                    return null;
                }
                int checkValidIntValue = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(l.longValue());
                long longValue = map.get(DAY_OF_QUARTER).longValue();
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    plusDays = org.threeten.bp.LocalDate.of(checkValidIntValue, 1, 1).plusMonths(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(l2.longValue(), 1L), 3)).plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(longValue, 1L));
                } else {
                    int checkValidIntValue2 = QUARTER_OF_YEAR.range().checkValidIntValue(l2.longValue(), QUARTER_OF_YEAR);
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT) {
                        range().checkValidValue(longValue, this);
                    } else if (checkValidIntValue2 == 1) {
                        if (!org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(checkValidIntValue)) {
                            i = 90;
                            org.threeten.bp.temporal.ValueRange.of(1L, i).checkValidValue(longValue, this);
                        }
                        i = 91;
                        org.threeten.bp.temporal.ValueRange.of(1L, i).checkValidValue(longValue, this);
                    } else {
                        if (checkValidIntValue2 != 2) {
                            i = 92;
                            org.threeten.bp.temporal.ValueRange.of(1L, i).checkValidValue(longValue, this);
                        }
                        i = 91;
                        org.threeten.bp.temporal.ValueRange.of(1L, i).checkValidValue(longValue, this);
                    }
                    plusDays = org.threeten.bp.LocalDate.of(checkValidIntValue, ((checkValidIntValue2 - 1) * 3) + 1, 1).plusDays(longValue - 1);
                }
                map.remove(this);
                map.remove(org.threeten.bp.temporal.ChronoField.YEAR);
                map.remove(QUARTER_OF_YEAR);
                return plusDays;
            }
        },
        QUARTER_OF_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.2
            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "QuarterOfYear";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getBaseUnit() {
                return org.threeten.bp.temporal.IsoFields.QUARTER_YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getRangeUnit() {
                return org.threeten.bp.temporal.ChronoUnit.YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange range() {
                return org.threeten.bp.temporal.ValueRange.of(1L, 4L);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) && org.threeten.bp.chrono.Chronology.from(temporalAccessor).equals(org.threeten.bp.chrono.IsoChronology.INSTANCE);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                return range();
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j) {
                long from = getFrom(r);
                range().checkValidValue(j, this);
                return (R) r.with(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, r.getLong(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) + ((j - from) * 3));
            }
        },
        WEEK_OF_WEEK_BASED_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.3
            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getBaseUnit() {
                return org.threeten.bp.temporal.ChronoUnit.WEEKS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getRangeUnit() {
                return org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEARS;
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.TemporalField
            public final java.lang.String getDisplayName(java.util.Locale locale) {
                org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
                return "Week";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange range() {
                return org.threeten.bp.temporal.ValueRange.of(1L, 52L, 53L);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY) && org.threeten.bp.chrono.Chronology.from(temporalAccessor).equals(org.threeten.bp.chrono.IsoChronology.INSTANCE);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return org.threeten.bp.temporal.IsoFields.Field.getHighSpeedVideoSizes(org.threeten.bp.LocalDate.from(temporalAccessor));
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.isSupported(this)) {
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
                }
                return org.threeten.bp.temporal.IsoFields.Field.Camera2StreamConfigurationMap(org.threeten.bp.LocalDate.from(temporalAccessor));
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j) {
                range().checkValidValue(j, this);
                return (R) r.plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(j, getFrom(r)), org.threeten.bp.temporal.ChronoUnit.WEEKS);
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalAccessor resolve(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.ResolverStyle resolverStyle) {
                org.threeten.bp.LocalDate with;
                long j;
                java.lang.Long l = map.get(WEEK_BASED_YEAR);
                java.lang.Long l2 = map.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
                if (l == null || l2 == null) {
                    return null;
                }
                int checkValidIntValue = WEEK_BASED_YEAR.range().checkValidIntValue(l.longValue(), WEEK_BASED_YEAR);
                long longValue = map.get(WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    long longValue2 = l2.longValue();
                    if (longValue2 > 7) {
                        long j2 = longValue2 - 1;
                        j = j2 / 7;
                        longValue2 = (j2 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    } else {
                        j = 0;
                    }
                    with = org.threeten.bp.LocalDate.of(checkValidIntValue, 1, 4).plusWeeks(longValue - 1).plusWeeks(j).with((org.threeten.bp.temporal.TemporalField) org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK, longValue2);
                } else {
                    int checkValidIntValue2 = org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(l2.longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.STRICT) {
                        org.threeten.bp.temporal.IsoFields.Field.getHighSpeedVideoSizes(org.threeten.bp.LocalDate.of(checkValidIntValue, 1, 4)).checkValidValue(longValue, this);
                    } else {
                        range().checkValidValue(longValue, this);
                    }
                    with = org.threeten.bp.LocalDate.of(checkValidIntValue, 1, 4).plusWeeks(longValue - 1).with((org.threeten.bp.temporal.TemporalField) org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK, checkValidIntValue2);
                }
                map.remove(this);
                map.remove(WEEK_BASED_YEAR);
                map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
                return with;
            }
        },
        WEEK_BASED_YEAR { // from class: org.threeten.bp.temporal.IsoFields.Field.4
            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekBasedYear";
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getBaseUnit() {
                return org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEARS;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.TemporalUnit getRangeUnit() {
                return org.threeten.bp.temporal.ChronoUnit.FOREVER;
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange range() {
                return org.threeten.bp.temporal.ChronoField.YEAR.range();
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY) && org.threeten.bp.chrono.Chronology.from(temporalAccessor).equals(org.threeten.bp.chrono.IsoChronology.INSTANCE);
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                return org.threeten.bp.temporal.ChronoField.YEAR.range();
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
                if (temporalAccessor.isSupported(this)) {
                    return org.threeten.bp.temporal.IsoFields.Field.getHighSpeedVideoFpsRangesFor(org.threeten.bp.LocalDate.from(temporalAccessor));
                }
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.TemporalField
            public final <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j) {
                if (!isSupportedBy(r)) {
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int checkValidIntValue = range().checkValidIntValue(j, WEEK_BASED_YEAR);
                org.threeten.bp.LocalDate from = org.threeten.bp.LocalDate.from((org.threeten.bp.temporal.TemporalAccessor) r);
                int i = from.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
                int Camera2StreamConfigurationMap = org.threeten.bp.temporal.IsoFields.Field.Camera2StreamConfigurationMap(from);
                if (Camera2StreamConfigurationMap == 53 && org.threeten.bp.temporal.IsoFields.Field.getHighResolutionOutputSizeshNQ4ISI(checkValidIntValue) == 52) {
                    Camera2StreamConfigurationMap = 52;
                }
                return (R) r.with(org.threeten.bp.LocalDate.of(checkValidIntValue, 1, 4).plusDays((i - r5.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) + ((Camera2StreamConfigurationMap - 1) * 7)));
            }
        };

        private static final int[] getHighSpeedVideoSizesFor = {0, 90, 181, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 0, 91, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE};

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public org.threeten.bp.temporal.TemporalAccessor resolve(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.ResolverStyle resolverStyle) {
            return null;
        }

        /* synthetic */ Field(byte b) {
            this();
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public java.lang.String getDisplayName(java.util.Locale locale) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
            return toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getHighResolutionOutputSizeshNQ4ISI(int i) {
            org.threeten.bp.LocalDate of = org.threeten.bp.LocalDate.of(i, 1, 1);
            if (of.getDayOfWeek() != org.threeten.bp.DayOfWeek.THURSDAY) {
                return (of.getDayOfWeek() == org.threeten.bp.DayOfWeek.WEDNESDAY && of.isLeapYear()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getHighSpeedVideoFpsRangesFor(org.threeten.bp.LocalDate localDate) {
            int year = localDate.getYear();
            int dayOfYear = localDate.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
            }
            if (dayOfYear >= 363) {
                return ((dayOfYear - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
            }
            return year;
        }

        static /* synthetic */ org.threeten.bp.temporal.ValueRange getHighSpeedVideoSizes(org.threeten.bp.LocalDate localDate) {
            return org.threeten.bp.temporal.ValueRange.of(1L, getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(localDate)));
        }

        static /* synthetic */ int Camera2StreamConfigurationMap(org.threeten.bp.LocalDate localDate) {
            int ordinal = localDate.getDayOfWeek().ordinal();
            int dayOfYear = localDate.getDayOfYear() - 1;
            int i = (3 - ordinal) + dayOfYear;
            int i2 = i - ((i / 7) * 7);
            int i3 = i2 - 3;
            if (i3 < -3) {
                i3 = i2 + 4;
            }
            if (dayOfYear < i3) {
                return (int) org.threeten.bp.temporal.ValueRange.of(1L, getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor(localDate.withDayOfYear(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE).minusYears(1L)))).getMaximum();
            }
            int i4 = ((dayOfYear - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
                return i4;
            }
            return 1;
        }
    }

    enum Unit implements org.threeten.bp.temporal.TemporalUnit {
        WEEK_BASED_YEARS("WeekBasedYears", org.threeten.bp.Duration.ofSeconds(31556952)),
        QUARTER_YEARS("QuarterYears", org.threeten.bp.Duration.ofSeconds(7889238));

        private final java.lang.String Camera2StreamConfigurationMap;
        private final org.threeten.bp.Duration getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.threeten.bp.temporal.TemporalUnit
        public final boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public final boolean isDurationEstimated() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public final boolean isTimeBased() {
            return false;
        }

        Unit(java.lang.String str, org.threeten.bp.Duration duration) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighResolutionOutputSizeshNQ4ISI = duration;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public final org.threeten.bp.Duration getDuration() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public final boolean isSupportedBy(org.threeten.bp.temporal.Temporal temporal) {
            return temporal.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY);
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public final <R extends org.threeten.bp.temporal.Temporal> R addTo(R r, long j) {
            int i = org.threeten.bp.temporal.IsoFields.AnonymousClass1.getHighSpeedVideoSizes[ordinal()];
            if (i == 1) {
                return (R) r.with(org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEAR, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(r.get(org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEAR), j));
            }
            if (i == 2) {
                return (R) r.plus(j / 256, org.threeten.bp.temporal.ChronoUnit.YEARS).plus((j % 256) * 3, org.threeten.bp.temporal.ChronoUnit.MONTHS);
            }
            throw new java.lang.IllegalStateException("Unreachable");
        }

        @Override // org.threeten.bp.temporal.TemporalUnit
        public final long between(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.Temporal temporal2) {
            int i = org.threeten.bp.temporal.IsoFields.AnonymousClass1.getHighSpeedVideoSizes[ordinal()];
            if (i == 1) {
                return org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(temporal2.getLong(org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEAR), temporal.getLong(org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEAR));
            }
            if (i == 2) {
                return temporal.until(temporal2, org.threeten.bp.temporal.ChronoUnit.MONTHS) / 3;
            }
            throw new java.lang.IllegalStateException("Unreachable");
        }

        @Override // java.lang.Enum, org.threeten.bp.temporal.TemporalUnit
        public final java.lang.String toString() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    /* renamed from: org.threeten.bp.temporal.IsoFields$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.IsoFields.Unit.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.threeten.bp.temporal.IsoFields.Unit.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.IsoFields.Unit.QUARTER_YEARS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
