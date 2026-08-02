package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class MinguoChronology extends org.threeten.bp.chrono.Chronology implements java.io.Serializable {
    public static final org.threeten.bp.chrono.MinguoChronology INSTANCE = new org.threeten.bp.chrono.MinguoChronology();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // org.threeten.bp.chrono.Chronology
    public final /* bridge */ /* synthetic */ org.threeten.bp.chrono.ChronoLocalDate resolveDate(java.util.Map map, org.threeten.bp.format.ResolverStyle resolverStyle) {
        return resolveDate((java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long>) map, resolverStyle);
    }

    private MinguoChronology() {
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getId() {
        return "Minguo";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getCalendarType() {
        return "roc";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate date(org.threeten.bp.chrono.Era era, int i, int i2, int i3) {
        return (org.threeten.bp.chrono.MinguoDate) super.date(era, i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate date(int i, int i2, int i3) {
        return new org.threeten.bp.chrono.MinguoDate(org.threeten.bp.LocalDate.of(i + 1911, i2, i3));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate dateYearDay(org.threeten.bp.chrono.Era era, int i, int i2) {
        return (org.threeten.bp.chrono.MinguoDate) super.dateYearDay(era, i, i2);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate dateYearDay(int i, int i2) {
        return new org.threeten.bp.chrono.MinguoDate(org.threeten.bp.LocalDate.ofYearDay(i + 1911, i2));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate dateEpochDay(long j) {
        return new org.threeten.bp.chrono.MinguoDate(org.threeten.bp.LocalDate.ofEpochDay(j));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate date(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.chrono.MinguoDate) {
            return (org.threeten.bp.chrono.MinguoDate) temporalAccessor;
        }
        return new org.threeten.bp.chrono.MinguoDate(org.threeten.bp.LocalDate.from(temporalAccessor));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.chrono.MinguoDate> localDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.chrono.MinguoDate> zonedDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.chrono.MinguoDate> zonedDateTime(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate dateNow() {
        return (org.threeten.bp.chrono.MinguoDate) super.dateNow();
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate dateNow(org.threeten.bp.ZoneId zoneId) {
        return (org.threeten.bp.chrono.MinguoDate) super.dateNow(zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate dateNow(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return (org.threeten.bp.chrono.MinguoDate) super.dateNow(clock);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(j + 1911);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final int prolepticYear(org.threeten.bp.chrono.Era era, int i) {
        if (era instanceof org.threeten.bp.chrono.MinguoEra) {
            return era == org.threeten.bp.chrono.MinguoEra.ROC ? i : 1 - i;
        }
        throw new java.lang.ClassCastException("Era must be MinguoEra");
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoEra eraOf(int i) {
        return org.threeten.bp.chrono.MinguoEra.of(i);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.util.List<org.threeten.bp.chrono.Era> eras() {
        return java.util.Arrays.asList(org.threeten.bp.chrono.MinguoEra.values());
    }

    /* renamed from: org.threeten.bp.chrono.MinguoChronology$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.ChronoField chronoField) {
        int i = org.threeten.bp.chrono.MinguoChronology.AnonymousClass1.getHighSpeedVideoFpsRanges[chronoField.ordinal()];
        if (i == 1) {
            org.threeten.bp.temporal.ValueRange range = org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.range();
            return org.threeten.bp.temporal.ValueRange.of(range.getMinimum() - 22932, range.getMaximum() - 22932);
        }
        if (i == 2) {
            org.threeten.bp.temporal.ValueRange range2 = org.threeten.bp.temporal.ChronoField.YEAR.range();
            return org.threeten.bp.temporal.ValueRange.of(1L, range2.getMaximum() - 1911, (-range2.getMinimum()) + 1912);
        }
        if (i == 3) {
            org.threeten.bp.temporal.ValueRange range3 = org.threeten.bp.temporal.ChronoField.YEAR.range();
            return org.threeten.bp.temporal.ValueRange.of(range3.getMinimum() - 1911, range3.getMaximum() - 1911);
        }
        return chronoField.range();
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.MinguoDate resolveDate(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.format.ResolverStyle resolverStyle) {
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
                    long safeSubtract = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L);
                    long safeSubtract2 = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue(), 1L);
                    org.threeten.bp.chrono.MinguoDate date = date(checkValidIntValue, 1, 1);
                    org.threeten.bp.LocalDate plusMonths = date.getHighSpeedVideoFpsRanges.plusMonths(safeSubtract);
                    if (!plusMonths.equals(date.getHighSpeedVideoFpsRanges)) {
                        date = new org.threeten.bp.chrono.MinguoDate(plusMonths);
                    }
                    org.threeten.bp.LocalDate plusDays = date.getHighSpeedVideoFpsRanges.plusDays(safeSubtract2);
                    return plusDays.equals(date.getHighSpeedVideoFpsRanges) ? date : new org.threeten.bp.chrono.MinguoDate(plusDays);
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
                    org.threeten.bp.chrono.MinguoDate plus = date(checkValidIntValue4, checkValidIntValue5, 1).plus(((org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
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
                    org.threeten.bp.chrono.MinguoDate with = date(checkValidIntValue6, checkValidIntValue7, 1).plus(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) == checkValidIntValue7) {
                        return with;
                    }
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR)) {
            int checkValidIntValue8 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
            if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                long safeSubtract3 = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue(), 1L);
                org.threeten.bp.chrono.MinguoDate dateYearDay = dateYearDay(checkValidIntValue8, 1);
                org.threeten.bp.LocalDate plusDays2 = dateYearDay.getHighSpeedVideoFpsRanges.plusDays(safeSubtract3);
                return plusDays2.equals(dateYearDay.getHighSpeedVideoFpsRanges) ? dateYearDay : new org.threeten.bp.chrono.MinguoDate(plusDays2);
            }
            return dateYearDay(checkValidIntValue8, org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue()));
        }
        if (!map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR)) {
            return null;
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
            int checkValidIntValue9 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
            if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                return date(checkValidIntValue9, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
            }
            int checkValidIntValue10 = org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue());
            int checkValidIntValue11 = org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue());
            org.threeten.bp.chrono.MinguoDate date2 = date(checkValidIntValue9, 1, 1);
            org.threeten.bp.LocalDate plusDays3 = date2.getHighSpeedVideoFpsRanges.plusDays(((checkValidIntValue10 - 1) * 7) + (checkValidIntValue11 - 1));
            if (!plusDays3.equals(date2.getHighSpeedVideoFpsRanges)) {
                date2 = new org.threeten.bp.chrono.MinguoDate(plusDays3);
            }
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || date2.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue9) {
                return date2;
            }
            throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different year");
        }
        if (!map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
            return null;
        }
        int checkValidIntValue12 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
        if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
            return date(checkValidIntValue12, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue(), 1L), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.DAYS);
        }
        org.threeten.bp.chrono.MinguoDate with2 = date(checkValidIntValue12, 1, 1).plus(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1, (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.WEEKS).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
        if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with2.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue12) {
            return with2;
        }
        throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
    }
}
