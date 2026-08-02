package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class HijrahChronology extends org.threeten.bp.chrono.Chronology implements java.io.Serializable {
    public static final org.threeten.bp.chrono.HijrahChronology INSTANCE = new org.threeten.bp.chrono.HijrahChronology();
    private static final java.util.HashMap<java.lang.String, java.lang.String[]> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.HashMap<java.lang.String, java.lang.String[]> getHighSpeedVideoFpsRangesFor;
    private static final java.util.HashMap<java.lang.String, java.lang.String[]> getHighSpeedVideoSizes;
    private static final long serialVersionUID = 3127340209035924785L;

    @Override // org.threeten.bp.chrono.Chronology
    public final /* bridge */ /* synthetic */ org.threeten.bp.chrono.ChronoLocalDate resolveDate(java.util.Map map, org.threeten.bp.format.ResolverStyle resolverStyle) {
        return resolveDate((java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long>) map, resolverStyle);
    }

    static {
        java.util.HashMap<java.lang.String, java.lang.String[]> hashMap = new java.util.HashMap<>();
        getHighSpeedVideoSizes = hashMap;
        java.util.HashMap<java.lang.String, java.lang.String[]> hashMap2 = new java.util.HashMap<>();
        getHighSpeedVideoFpsRangesFor = hashMap2;
        java.util.HashMap<java.lang.String, java.lang.String[]> hashMap3 = new java.util.HashMap<>();
        getHighResolutionOutputSizeshNQ4ISI = hashMap3;
        hashMap.put("en", new java.lang.String[]{"BH", "HE"});
        hashMap2.put("en", new java.lang.String[]{"B.H.", "H.E."});
        hashMap3.put("en", new java.lang.String[]{"Before Hijrah", "Hijrah Era"});
    }

    private HijrahChronology() {
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getId() {
        return "Hijrah-umalqura";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getCalendarType() {
        return androidx.core.text.util.LocalePreferences.CalendarType.ISLAMIC_UMALQURA;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate date(org.threeten.bp.chrono.Era era, int i, int i2, int i3) {
        return (org.threeten.bp.chrono.HijrahDate) super.date(era, i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate date(int i, int i2, int i3) {
        return org.threeten.bp.chrono.HijrahDate.of(i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate dateYearDay(org.threeten.bp.chrono.Era era, int i, int i2) {
        return (org.threeten.bp.chrono.HijrahDate) super.dateYearDay(era, i, i2);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate dateYearDay(int i, int i2) {
        return new org.threeten.bp.chrono.HijrahDate(org.threeten.bp.chrono.HijrahDate.of(i, 1, 1).getHighSpeedVideoFpsRangesFor + (i2 - 1));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate dateEpochDay(long j) {
        return org.threeten.bp.chrono.HijrahDate.Camera2StreamConfigurationMap(org.threeten.bp.LocalDate.ofEpochDay(j));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate date(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.chrono.HijrahDate) {
            return (org.threeten.bp.chrono.HijrahDate) temporalAccessor;
        }
        return org.threeten.bp.chrono.HijrahDate.getHighResolutionOutputSizeshNQ4ISI(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.EPOCH_DAY));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.chrono.HijrahDate> localDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.chrono.HijrahDate> zonedDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.chrono.HijrahDate> zonedDateTime(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate dateNow() {
        return (org.threeten.bp.chrono.HijrahDate) super.dateNow();
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate dateNow(org.threeten.bp.ZoneId zoneId) {
        return (org.threeten.bp.chrono.HijrahDate) super.dateNow(zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate dateNow(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return (org.threeten.bp.chrono.HijrahDate) super.dateNow(clock);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return org.threeten.bp.chrono.HijrahDate.getHighSpeedVideoSizes(j);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final int prolepticYear(org.threeten.bp.chrono.Era era, int i) {
        if (era instanceof org.threeten.bp.chrono.HijrahEra) {
            return era == org.threeten.bp.chrono.HijrahEra.AH ? i : 1 - i;
        }
        throw new java.lang.ClassCastException("Era must be HijrahEra");
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahEra eraOf(int i) {
        if (i == 0) {
            return org.threeten.bp.chrono.HijrahEra.BEFORE_AH;
        }
        if (i == 1) {
            return org.threeten.bp.chrono.HijrahEra.AH;
        }
        throw new org.threeten.bp.DateTimeException("invalid Hijrah era");
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.util.List<org.threeten.bp.chrono.Era> eras() {
        return java.util.Arrays.asList(org.threeten.bp.chrono.HijrahEra.values());
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.ChronoField chronoField) {
        return chronoField.range();
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.HijrahDate resolveDate(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.format.ResolverStyle resolverStyle) {
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.EPOCH_DAY)) {
            return dateEpochDay(map.remove(org.threeten.bp.temporal.ChronoField.EPOCH_DAY).longValue());
        }
        java.lang.Long remove = map.remove(org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH);
        if (remove != null) {
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.checkValidValue(remove.longValue());
            }
            getHighSpeedVideoFpsRanges(map, org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR, org.threeten.bp.jdk8.Jdk8Methods.floorMod(remove.longValue(), 12) + 1);
            getHighSpeedVideoFpsRanges(map, org.threeten.bp.temporal.ChronoField.YEAR, org.threeten.bp.jdk8.Jdk8Methods.floorDiv(remove.longValue(), 12L));
        }
        java.lang.Long remove2 = map.remove(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
        if (remove2 != null) {
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.checkValidValue(remove2.longValue());
            }
            java.lang.Long remove3 = map.remove(org.threeten.bp.temporal.ChronoField.ERA);
            if (remove3 == null) {
                java.lang.Long l = map.get(org.threeten.bp.temporal.ChronoField.YEAR);
                if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT) {
                    getHighSpeedVideoFpsRanges(map, org.threeten.bp.temporal.ChronoField.YEAR, (l == null || l.longValue() > 0) ? remove2.longValue() : org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(1L, remove2.longValue()));
                } else if (l != null) {
                    getHighSpeedVideoFpsRanges(map, org.threeten.bp.temporal.ChronoField.YEAR, l.longValue() > 0 ? remove2.longValue() : org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(1L, remove2.longValue()));
                } else {
                    map.put(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA, remove2);
                }
            } else if (remove3.longValue() == 1) {
                getHighSpeedVideoFpsRanges(map, org.threeten.bp.temporal.ChronoField.YEAR, remove2.longValue());
            } else if (remove3.longValue() == 0) {
                getHighSpeedVideoFpsRanges(map, org.threeten.bp.temporal.ChronoField.YEAR, org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(1L, remove2.longValue()));
            } else {
                throw new org.threeten.bp.DateTimeException("Invalid value for era: ".concat(java.lang.String.valueOf(remove3)));
            }
        } else if (map.containsKey(org.threeten.bp.temporal.ChronoField.ERA)) {
            org.threeten.bp.temporal.ChronoField.ERA.checkValidValue(map.get(org.threeten.bp.temporal.ChronoField.ERA).longValue());
        }
        if (!map.containsKey(org.threeten.bp.temporal.ChronoField.YEAR)) {
            return null;
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR)) {
            if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH)) {
                int checkValidIntValue = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    return new org.threeten.bp.chrono.HijrahDate(date(checkValidIntValue, 1, 1).getHighSpeedVideoFpsRangesFor(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L)).getHighSpeedVideoFpsRangesFor + org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue(), 1L));
                }
                int checkValidIntValue2 = range(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR);
                int checkValidIntValue3 = range(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue(), org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.SMART && checkValidIntValue3 > 28) {
                    checkValidIntValue3 = java.lang.Math.min(checkValidIntValue3, date(checkValidIntValue, checkValidIntValue2, 1).lengthOfMonth());
                }
                return date(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
            }
            if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH)) {
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                    int checkValidIntValue4 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                        return date(checkValidIntValue4, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.MONTHS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
                    }
                    int checkValidIntValue5 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue());
                    org.threeten.bp.chrono.HijrahDate plus = date(checkValidIntValue4, checkValidIntValue5, 1).plus(((org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || plus.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) == checkValidIntValue5) {
                        return plus;
                    }
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                }
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
                    int checkValidIntValue6 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                        return date(checkValidIntValue6, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.MONTHS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
                    }
                    int checkValidIntValue7 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue());
                    org.threeten.bp.chrono.HijrahDate with = date(checkValidIntValue6, checkValidIntValue7, 1).plus(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) == checkValidIntValue7) {
                        return with;
                    }
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR)) {
            int checkValidIntValue8 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                return dateYearDay(checkValidIntValue8, org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue()));
            }
            return new org.threeten.bp.chrono.HijrahDate(dateYearDay(checkValidIntValue8, 1).getHighSpeedVideoFpsRangesFor + org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue(), 1L));
        }
        if (!map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR)) {
            return null;
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
            int checkValidIntValue9 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
            if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                return date(checkValidIntValue9, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
            }
            org.threeten.bp.chrono.HijrahDate hijrahDate = new org.threeten.bp.chrono.HijrahDate(date(checkValidIntValue9, 1, 1).getHighSpeedVideoFpsRangesFor + ((org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1) * 7) + (org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue()) - 1));
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || hijrahDate.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue9) {
                return hijrahDate;
            }
            throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different year");
        }
        if (!map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
            return null;
        }
        int checkValidIntValue10 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
        if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
            return date(checkValidIntValue10, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
        }
        org.threeten.bp.chrono.HijrahDate with2 = date(checkValidIntValue10, 1, 1).plus(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
        if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with2.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue10) {
            return with2;
        }
        throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
    }
}
