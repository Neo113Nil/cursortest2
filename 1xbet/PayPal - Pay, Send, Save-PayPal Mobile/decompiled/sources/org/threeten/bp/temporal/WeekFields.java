package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public final class WeekFields implements java.io.Serializable {
    private static final long serialVersionUID = -1177360819670808121L;
    private final org.threeten.bp.DayOfWeek Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.temporal.WeekFields> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap(4, 0.75f, 2);
    public static final org.threeten.bp.temporal.WeekFields ISO = new org.threeten.bp.temporal.WeekFields(org.threeten.bp.DayOfWeek.MONDAY, 4);
    public static final org.threeten.bp.temporal.WeekFields SUNDAY_START = of(org.threeten.bp.DayOfWeek.SUNDAY, 1);
    private final transient org.threeten.bp.temporal.TemporalField getHighSpeedVideoFpsRangesFor = org.threeten.bp.temporal.WeekFields.ComputedDayOfField.getHighSpeedVideoSizes(this);
    private final transient org.threeten.bp.temporal.TemporalField getInputFormats = org.threeten.bp.temporal.WeekFields.ComputedDayOfField.getHighSpeedVideoFpsRangesFor(this);
    private final transient org.threeten.bp.temporal.TemporalField getInputSizeshNQ4ISI = org.threeten.bp.temporal.WeekFields.ComputedDayOfField.getHighSpeedVideoFpsRanges(this);
    private final transient org.threeten.bp.temporal.TemporalField getOutputFormats = org.threeten.bp.temporal.WeekFields.ComputedDayOfField.getHighResolutionOutputSizeshNQ4ISI(this);
    private final transient org.threeten.bp.temporal.TemporalField getHighSpeedVideoFpsRanges = org.threeten.bp.temporal.WeekFields.ComputedDayOfField.Camera2StreamConfigurationMap(this);

    public static org.threeten.bp.temporal.WeekFields of(java.util.Locale locale) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
        return of(org.threeten.bp.DayOfWeek.SUNDAY.plus(r4.getFirstDayOfWeek() - 1), new java.util.GregorianCalendar(new java.util.Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
    }

    public static org.threeten.bp.temporal.WeekFields of(org.threeten.bp.DayOfWeek dayOfWeek, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(dayOfWeek.toString());
        sb.append(i);
        java.lang.String obj = sb.toString();
        java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.temporal.WeekFields> concurrentMap = getHighSpeedVideoSizes;
        org.threeten.bp.temporal.WeekFields weekFields = concurrentMap.get(obj);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(obj, new org.threeten.bp.temporal.WeekFields(dayOfWeek, i));
        return concurrentMap.get(obj);
    }

    private WeekFields(org.threeten.bp.DayOfWeek dayOfWeek, int i) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i <= 0 || i > 7) {
            throw new java.lang.IllegalArgumentException("Minimal number of days is invalid");
        }
        this.Camera2StreamConfigurationMap = dayOfWeek;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    private java.lang.Object readResolve() throws java.io.InvalidObjectException {
        try {
            return of(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid WeekFields");
            sb.append(e.getMessage());
            throw new java.io.InvalidObjectException(sb.toString());
        }
    }

    public final org.threeten.bp.DayOfWeek getFirstDayOfWeek() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getMinimalDaysInFirstWeek() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final org.threeten.bp.temporal.TemporalField dayOfWeek() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final org.threeten.bp.temporal.TemporalField weekOfMonth() {
        return this.getInputFormats;
    }

    public final org.threeten.bp.temporal.TemporalField weekOfYear() {
        return this.getInputSizeshNQ4ISI;
    }

    public final org.threeten.bp.temporal.TemporalField weekOfWeekBasedYear() {
        return this.getOutputFormats;
    }

    public final org.threeten.bp.temporal.TemporalField weekBasedYear() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.temporal.WeekFields) && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return (this.Camera2StreamConfigurationMap.ordinal() * 7) + this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WeekFields[");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    static class ComputedDayOfField implements org.threeten.bp.temporal.TemporalField {
        private final org.threeten.bp.temporal.TemporalUnit getHighSpeedVideoSizesFor;
        private final org.threeten.bp.temporal.WeekFields getInputFormats;
        private final org.threeten.bp.temporal.ValueRange getInputSizeshNQ4ISI;
        private final org.threeten.bp.temporal.TemporalUnit getOutputFormats;
        private final java.lang.String getOutputMinFrameDuration;
        private static final org.threeten.bp.temporal.ValueRange getHighSpeedVideoSizes = org.threeten.bp.temporal.ValueRange.of(1, 7);
        private static final org.threeten.bp.temporal.ValueRange getHighSpeedVideoFpsRangesFor = org.threeten.bp.temporal.ValueRange.of(0, 1, 4, 6);
        private static final org.threeten.bp.temporal.ValueRange Camera2StreamConfigurationMap = org.threeten.bp.temporal.ValueRange.of(0, 1, 52, 54);
        private static final org.threeten.bp.temporal.ValueRange getHighResolutionOutputSizeshNQ4ISI = org.threeten.bp.temporal.ValueRange.of(1, 52, 53);
        private static final org.threeten.bp.temporal.ValueRange getHighSpeedVideoFpsRanges = org.threeten.bp.temporal.ChronoField.YEAR.range();

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        static org.threeten.bp.temporal.WeekFields.ComputedDayOfField getHighSpeedVideoSizes(org.threeten.bp.temporal.WeekFields weekFields) {
            return new org.threeten.bp.temporal.WeekFields.ComputedDayOfField("DayOfWeek", weekFields, org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.WEEKS, getHighSpeedVideoSizes);
        }

        static org.threeten.bp.temporal.WeekFields.ComputedDayOfField getHighSpeedVideoFpsRangesFor(org.threeten.bp.temporal.WeekFields weekFields) {
            return new org.threeten.bp.temporal.WeekFields.ComputedDayOfField("WeekOfMonth", weekFields, org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.ChronoUnit.MONTHS, getHighSpeedVideoFpsRangesFor);
        }

        static org.threeten.bp.temporal.WeekFields.ComputedDayOfField getHighSpeedVideoFpsRanges(org.threeten.bp.temporal.WeekFields weekFields) {
            return new org.threeten.bp.temporal.WeekFields.ComputedDayOfField("WeekOfYear", weekFields, org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.ChronoUnit.YEARS, Camera2StreamConfigurationMap);
        }

        static org.threeten.bp.temporal.WeekFields.ComputedDayOfField getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.WeekFields weekFields) {
            return new org.threeten.bp.temporal.WeekFields.ComputedDayOfField("WeekOfWeekBasedYear", weekFields, org.threeten.bp.temporal.ChronoUnit.WEEKS, org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEARS, getHighResolutionOutputSizeshNQ4ISI);
        }

        static org.threeten.bp.temporal.WeekFields.ComputedDayOfField Camera2StreamConfigurationMap(org.threeten.bp.temporal.WeekFields weekFields) {
            return new org.threeten.bp.temporal.WeekFields.ComputedDayOfField("WeekBasedYear", weekFields, org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEARS, org.threeten.bp.temporal.ChronoUnit.FOREVER, getHighSpeedVideoFpsRanges);
        }

        private ComputedDayOfField(java.lang.String str, org.threeten.bp.temporal.WeekFields weekFields, org.threeten.bp.temporal.TemporalUnit temporalUnit, org.threeten.bp.temporal.TemporalUnit temporalUnit2, org.threeten.bp.temporal.ValueRange valueRange) {
            this.getOutputMinFrameDuration = str;
            this.getInputFormats = weekFields;
            this.getHighSpeedVideoSizesFor = temporalUnit;
            this.getOutputFormats = temporalUnit2;
            this.getInputSizeshNQ4ISI = valueRange;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            int i;
            int i2;
            int floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - this.getInputFormats.getFirstDayOfWeek().getValue(), 7) + 1;
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.WEEKS) {
                return floorMod;
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.MONTHS) {
                int i3 = temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH);
                int floorMod2 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(i3 - floorMod, 7);
                int i4 = -floorMod2;
                if (floorMod2 + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                    i4 = 7 - floorMod2;
                }
                i = ((i4 + 7) + (i3 - 1)) / 7;
            } else if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.YEARS) {
                int i5 = temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR);
                int floorMod3 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(i5 - floorMod, 7);
                int i6 = -floorMod3;
                if (floorMod3 + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                    i6 = 7 - floorMod3;
                }
                i = ((i6 + 7) + (i5 - 1)) / 7;
            } else {
                if (this.getOutputFormats != org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEARS) {
                    if (this.getOutputFormats != org.threeten.bp.temporal.ChronoUnit.FOREVER) {
                        throw new java.lang.IllegalStateException("unreachable");
                    }
                    int floorMod4 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - this.getInputFormats.getFirstDayOfWeek().getValue(), 7) + 1;
                    i = temporalAccessor.get(org.threeten.bp.temporal.ChronoField.YEAR);
                    long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(temporalAccessor, floorMod4);
                    if (highSpeedVideoFpsRangesFor == 0) {
                        i--;
                    } else if (highSpeedVideoFpsRangesFor >= 53) {
                        int floorMod5 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR) - floorMod4, 7);
                        int i7 = -floorMod5;
                        if (floorMod5 + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                            i7 = 7 - floorMod5;
                        }
                        if (highSpeedVideoFpsRangesFor >= ((i7 + 7) + (((org.threeten.bp.Year.isLeap((long) i) ? 366 : 365) + this.getInputFormats.getMinimalDaysInFirstWeek()) - 1)) / 7) {
                            i++;
                        }
                    }
                } else {
                    int floorMod6 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - this.getInputFormats.getFirstDayOfWeek().getValue(), 7) + 1;
                    long highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(temporalAccessor, floorMod6);
                    if (highSpeedVideoFpsRangesFor2 == 0) {
                        i2 = ((int) getHighSpeedVideoFpsRangesFor(org.threeten.bp.chrono.Chronology.from(temporalAccessor).date(temporalAccessor).minus(1L, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS), floorMod6)) + 1;
                    } else {
                        if (highSpeedVideoFpsRangesFor2 >= 53) {
                            int floorMod7 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR) - floorMod6, 7);
                            int i8 = -floorMod7;
                            if (floorMod7 + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                                i8 = 7 - floorMod7;
                            }
                            if (highSpeedVideoFpsRangesFor2 >= ((i8 + 7) + (((org.threeten.bp.Year.isLeap((long) temporalAccessor.get(org.threeten.bp.temporal.ChronoField.YEAR)) ? 366 : 365) + this.getInputFormats.getMinimalDaysInFirstWeek()) - 1)) / 7) {
                                highSpeedVideoFpsRangesFor2 -= r2 - 1;
                            }
                        }
                        i2 = (int) highSpeedVideoFpsRangesFor2;
                    }
                    i = i2;
                }
            }
            return i;
        }

        private long getHighSpeedVideoFpsRanges(org.threeten.bp.temporal.TemporalAccessor temporalAccessor, int i) {
            int floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH) - i, 7);
            int i2 = -floorMod;
            if (floorMod + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                i2 = 7 - floorMod;
            }
            return ((i2 + 7) + (r5 - 1)) / 7;
        }

        private long getHighSpeedVideoFpsRangesFor(org.threeten.bp.temporal.TemporalAccessor temporalAccessor, int i) {
            int floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR) - i, 7);
            int i2 = -floorMod;
            if (floorMod + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                i2 = 7 - floorMod;
            }
            return ((i2 + 7) + (r5 - 1)) / 7;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j) {
            int checkValidIntValue = this.getInputSizeshNQ4ISI.checkValidIntValue(j, this);
            if (checkValidIntValue == r.get(this)) {
                return r;
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.FOREVER) {
                int i = r.get(this.getInputFormats.getOutputFormats);
                org.threeten.bp.temporal.Temporal plus = r.plus((long) ((j - r1) * 52.1775d), org.threeten.bp.temporal.ChronoUnit.WEEKS);
                if (plus.get(this) > checkValidIntValue) {
                    return (R) plus.minus(plus.get(this.getInputFormats.getOutputFormats), org.threeten.bp.temporal.ChronoUnit.WEEKS);
                }
                if (plus.get(this) < checkValidIntValue) {
                    plus = plus.plus(2L, org.threeten.bp.temporal.ChronoUnit.WEEKS);
                }
                R r2 = (R) plus.plus(i - plus.get(this.getInputFormats.getOutputFormats), org.threeten.bp.temporal.ChronoUnit.WEEKS);
                return r2.get(this) > checkValidIntValue ? (R) r2.minus(1L, org.threeten.bp.temporal.ChronoUnit.WEEKS) : r2;
            }
            return (R) r.plus(checkValidIntValue - r1, this.getHighSpeedVideoSizesFor);
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public org.threeten.bp.temporal.TemporalAccessor resolve(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.ResolverStyle resolverStyle) {
            long checkValidIntValue;
            org.threeten.bp.chrono.ChronoLocalDate date;
            long checkValidIntValue2;
            org.threeten.bp.chrono.ChronoLocalDate date2;
            long checkValidIntValue3;
            int floorMod;
            long highSpeedVideoFpsRangesFor;
            int value = this.getInputFormats.getFirstDayOfWeek().getValue();
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.WEEKS) {
                map.put(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK, java.lang.Long.valueOf(org.threeten.bp.jdk8.Jdk8Methods.floorMod((value - 1) + (this.getInputSizeshNQ4ISI.checkValidIntValue(map.remove(this).longValue(), this) - 1), 7) + 1));
                return null;
            }
            if (!map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
                return null;
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.FOREVER) {
                if (!map.containsKey(this.getInputFormats.getOutputFormats)) {
                    return null;
                }
                org.threeten.bp.chrono.Chronology from = org.threeten.bp.chrono.Chronology.from(temporalAccessor);
                int floorMod2 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()) - value, 7);
                int checkValidIntValue4 = range().checkValidIntValue(map.get(this).longValue(), this);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    date2 = from.date(checkValidIntValue4, 1, this.getInputFormats.getMinimalDaysInFirstWeek());
                    checkValidIntValue3 = map.get(this.getInputFormats.getOutputFormats).longValue();
                    floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(date2.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - value, 7) + 1;
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(date2, floorMod);
                } else {
                    date2 = from.date(checkValidIntValue4, 1, this.getInputFormats.getMinimalDaysInFirstWeek());
                    checkValidIntValue3 = this.getInputFormats.getOutputFormats.range().checkValidIntValue(map.get(this.getInputFormats.getOutputFormats).longValue(), this.getInputFormats.getOutputFormats);
                    floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(date2.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - value, 7) + 1;
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(date2, floorMod);
                }
                org.threeten.bp.chrono.ChronoLocalDate plus = date2.plus(((checkValidIntValue3 - highSpeedVideoFpsRangesFor) * 7) + ((floorMod2 + 1) - floorMod), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.STRICT && plus.getLong(this) != map.get(this).longValue()) {
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(this.getInputFormats.getOutputFormats);
                map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
                return plus;
            }
            if (!map.containsKey(org.threeten.bp.temporal.ChronoField.YEAR)) {
                return null;
            }
            int floorMod3 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()) - value, 7) + 1;
            int checkValidIntValue5 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.get(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
            org.threeten.bp.chrono.Chronology from2 = org.threeten.bp.chrono.Chronology.from(temporalAccessor);
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.MONTHS) {
                if (!map.containsKey(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR)) {
                    return null;
                }
                long longValue = map.remove(this).longValue();
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    date = from2.date(checkValidIntValue5, 1, 1).plus(map.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue() - 1, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.MONTHS);
                    checkValidIntValue2 = ((longValue - getHighSpeedVideoFpsRanges(date, org.threeten.bp.jdk8.Jdk8Methods.floorMod(date.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - value, 7) + 1)) * 7) + (floorMod3 - r3);
                } else {
                    date = from2.date(checkValidIntValue5, org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue()), 8);
                    checkValidIntValue2 = ((this.getInputSizeshNQ4ISI.checkValidIntValue(longValue, this) - getHighSpeedVideoFpsRanges(date, org.threeten.bp.jdk8.Jdk8Methods.floorMod(date.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - value, 7) + 1)) * 7) + (floorMod3 - r3);
                }
                org.threeten.bp.chrono.ChronoLocalDate plus2 = date.plus(checkValidIntValue2, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.STRICT && plus2.getLong(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) != map.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue()) {
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                }
                map.remove(this);
                map.remove(org.threeten.bp.temporal.ChronoField.YEAR);
                map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR);
                map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
                return plus2;
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.YEARS) {
                long longValue2 = map.remove(this).longValue();
                org.threeten.bp.chrono.ChronoLocalDate date3 = from2.date(checkValidIntValue5, 1, 1);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    checkValidIntValue = ((longValue2 - getHighSpeedVideoFpsRangesFor(date3, org.threeten.bp.jdk8.Jdk8Methods.floorMod(date3.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - value, 7) + 1)) * 7) + (floorMod3 - r3);
                } else {
                    checkValidIntValue = ((this.getInputSizeshNQ4ISI.checkValidIntValue(longValue2, this) - getHighSpeedVideoFpsRangesFor(date3, org.threeten.bp.jdk8.Jdk8Methods.floorMod(date3.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - value, 7) + 1)) * 7) + (floorMod3 - r3);
                }
                org.threeten.bp.chrono.ChronoLocalDate plus3 = date3.plus(checkValidIntValue, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.STRICT && plus3.getLong(org.threeten.bp.temporal.ChronoField.YEAR) != map.get(org.threeten.bp.temporal.ChronoField.YEAR).longValue()) {
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(org.threeten.bp.temporal.ChronoField.YEAR);
                map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK);
                return plus3;
            }
            throw new java.lang.IllegalStateException("unreachable");
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public org.threeten.bp.temporal.TemporalUnit getBaseUnit() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public org.threeten.bp.temporal.TemporalUnit getRangeUnit() {
            return this.getOutputFormats;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public org.threeten.bp.temporal.ValueRange range() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            if (!temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
                return false;
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.WEEKS) {
                return true;
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.MONTHS) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH);
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.YEARS) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR);
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEARS) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY);
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.FOREVER) {
                return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY);
            }
            return false;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            org.threeten.bp.temporal.ChronoField chronoField;
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.WEEKS) {
                return this.getInputSizeshNQ4ISI;
            }
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.MONTHS) {
                chronoField = org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH;
            } else if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.YEARS) {
                chronoField = org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR;
            } else {
                if (this.getOutputFormats != org.threeten.bp.temporal.IsoFields.WEEK_BASED_YEARS) {
                    if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.FOREVER) {
                        return temporalAccessor.range(org.threeten.bp.temporal.ChronoField.YEAR);
                    }
                    throw new java.lang.IllegalStateException("unreachable");
                }
                while (true) {
                    int floorMod = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - this.getInputFormats.getFirstDayOfWeek().getValue(), 7) + 1;
                    long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(temporalAccessor, floorMod);
                    if (highSpeedVideoFpsRangesFor == 0) {
                        temporalAccessor = org.threeten.bp.chrono.Chronology.from(temporalAccessor).date(temporalAccessor).minus(2L, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS);
                    } else {
                        int floorMod2 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR) - floorMod, 7);
                        int i = -floorMod2;
                        if (floorMod2 + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                            i = 7 - floorMod2;
                        }
                        if (highSpeedVideoFpsRangesFor >= ((i + 7) + (((org.threeten.bp.Year.isLeap((long) temporalAccessor.get(org.threeten.bp.temporal.ChronoField.YEAR)) ? 366 : 365) + this.getInputFormats.getMinimalDaysInFirstWeek()) - 1)) / 7) {
                            temporalAccessor = org.threeten.bp.chrono.Chronology.from(temporalAccessor).date(temporalAccessor).plus(2L, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS);
                        } else {
                            return org.threeten.bp.temporal.ValueRange.of(1L, r1 - 1);
                        }
                    }
                }
            }
            int floorMod3 = org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(chronoField) - (org.threeten.bp.jdk8.Jdk8Methods.floorMod(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) - this.getInputFormats.getFirstDayOfWeek().getValue(), 7) + 1), 7);
            int i2 = -floorMod3;
            if (floorMod3 + 1 > this.getInputFormats.getMinimalDaysInFirstWeek()) {
                i2 = 7 - floorMod3;
            }
            org.threeten.bp.temporal.ValueRange range = temporalAccessor.range(chronoField);
            int i3 = i2 + 7;
            return org.threeten.bp.temporal.ValueRange.of(((((int) range.getMinimum()) - 1) + i3) / 7, (i3 + (((int) range.getMaximum()) - 1)) / 7);
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public java.lang.String getDisplayName(java.util.Locale locale) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
            if (this.getOutputFormats == org.threeten.bp.temporal.ChronoUnit.YEARS) {
                return "Week";
            }
            return toString();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getOutputMinFrameDuration);
            sb.append("[");
            sb.append(this.getInputFormats.toString());
            sb.append("]");
            return sb.toString();
        }
    }
}
