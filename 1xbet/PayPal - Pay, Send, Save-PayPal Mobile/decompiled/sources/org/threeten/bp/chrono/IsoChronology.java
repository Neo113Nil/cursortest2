package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class IsoChronology extends org.threeten.bp.chrono.Chronology implements java.io.Serializable {
    public static final org.threeten.bp.chrono.IsoChronology INSTANCE = new org.threeten.bp.chrono.IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // org.threeten.bp.chrono.Chronology
    public final /* bridge */ /* synthetic */ org.threeten.bp.chrono.ChronoLocalDate resolveDate(java.util.Map map, org.threeten.bp.format.ResolverStyle resolverStyle) {
        return resolveDate((java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long>) map, resolverStyle);
    }

    private IsoChronology() {
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getId() {
        return androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getCalendarType() {
        return "iso8601";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate date(org.threeten.bp.chrono.Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate date(int i, int i2, int i3) {
        return org.threeten.bp.LocalDate.of(i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate dateYearDay(org.threeten.bp.chrono.Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate dateYearDay(int i, int i2) {
        return org.threeten.bp.LocalDate.ofYearDay(i, i2);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate dateEpochDay(long j) {
        return org.threeten.bp.LocalDate.ofEpochDay(j);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate date(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return org.threeten.bp.LocalDate.from(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDateTime localDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return org.threeten.bp.LocalDateTime.from(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.ZonedDateTime zonedDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return org.threeten.bp.ZonedDateTime.from(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.ZonedDateTime zonedDateTime(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate dateNow() {
        return dateNow(org.threeten.bp.Clock.systemDefaultZone());
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate dateNow(org.threeten.bp.ZoneId zoneId) {
        return dateNow(org.threeten.bp.Clock.system(zoneId));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate dateNow(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return date((org.threeten.bp.temporal.TemporalAccessor) org.threeten.bp.LocalDate.now(clock));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final boolean isLeapYear(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final int prolepticYear(org.threeten.bp.chrono.Era era, int i) {
        if (era instanceof org.threeten.bp.chrono.IsoEra) {
            return era == org.threeten.bp.chrono.IsoEra.CE ? i : 1 - i;
        }
        throw new java.lang.ClassCastException("Era must be IsoEra");
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.IsoEra eraOf(int i) {
        return org.threeten.bp.chrono.IsoEra.of(i);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.util.List<org.threeten.bp.chrono.Era> eras() {
        return java.util.Arrays.asList(org.threeten.bp.chrono.IsoEra.values());
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.ChronoField chronoField) {
        return chronoField.range();
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.LocalDate resolveDate(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.format.ResolverStyle resolverStyle) {
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.EPOCH_DAY)) {
            return org.threeten.bp.LocalDate.ofEpochDay(map.remove(org.threeten.bp.temporal.ChronoField.EPOCH_DAY).longValue());
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
                int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue());
                int safeToInt2 = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue());
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    return org.threeten.bp.LocalDate.of(checkValidIntValue, 1, 1).plusMonths(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(safeToInt, 1)).plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(safeToInt2, 1));
                }
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.SMART) {
                    org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.checkValidValue(safeToInt2);
                    if (safeToInt == 4 || safeToInt == 6 || safeToInt == 9 || safeToInt == 11) {
                        safeToInt2 = java.lang.Math.min(safeToInt2, 30);
                    } else if (safeToInt == 2) {
                        safeToInt2 = java.lang.Math.min(safeToInt2, org.threeten.bp.Month.FEBRUARY.length(org.threeten.bp.Year.isLeap(checkValidIntValue)));
                    }
                    return org.threeten.bp.LocalDate.of(checkValidIntValue, safeToInt, safeToInt2);
                }
                return org.threeten.bp.LocalDate.of(checkValidIntValue, safeToInt, safeToInt2);
            }
            if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH)) {
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                    int checkValidIntValue2 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                        return org.threeten.bp.LocalDate.of(checkValidIntValue2, 1, 1).plusMonths(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L)).plusWeeks(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L)).plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1L));
                    }
                    int checkValidIntValue3 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue());
                    org.threeten.bp.LocalDate plusDays = org.threeten.bp.LocalDate.of(checkValidIntValue2, checkValidIntValue3, 1).plusDays(((org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1));
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || plusDays.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) == checkValidIntValue3) {
                        return plusDays;
                    }
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                }
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
                    int checkValidIntValue4 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                        return org.threeten.bp.LocalDate.of(checkValidIntValue4, 1, 1).plusMonths(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L)).plusWeeks(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L)).plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue(), 1L));
                    }
                    int checkValidIntValue5 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue());
                    org.threeten.bp.LocalDate with = org.threeten.bp.LocalDate.of(checkValidIntValue4, checkValidIntValue5, 1).plusWeeks(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) == checkValidIntValue5) {
                        return with;
                    }
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR)) {
            int checkValidIntValue6 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
            if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                return org.threeten.bp.LocalDate.ofYearDay(checkValidIntValue6, 1).plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue(), 1L));
            }
            return org.threeten.bp.LocalDate.ofYearDay(checkValidIntValue6, org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue()));
        }
        if (!map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR)) {
            return null;
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
            int checkValidIntValue7 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
            if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                return org.threeten.bp.LocalDate.of(checkValidIntValue7, 1, 1).plusWeeks(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L)).plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1L));
            }
            org.threeten.bp.LocalDate plusDays2 = org.threeten.bp.LocalDate.of(checkValidIntValue7, 1, 1).plusDays(((org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1) * 7) + (org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue()) - 1));
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || plusDays2.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue7) {
                return plusDays2;
            }
            throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different year");
        }
        if (!map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
            return null;
        }
        int checkValidIntValue8 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
        if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
            return org.threeten.bp.LocalDate.of(checkValidIntValue8, 1, 1).plusWeeks(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L)).plusDays(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue(), 1L));
        }
        org.threeten.bp.LocalDate with2 = org.threeten.bp.LocalDate.of(checkValidIntValue8, 1, 1).plusWeeks(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
        if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with2.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue8) {
            return with2;
        }
        throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
    }
}
