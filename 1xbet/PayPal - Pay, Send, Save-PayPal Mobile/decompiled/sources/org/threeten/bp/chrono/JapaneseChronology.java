package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class JapaneseChronology extends org.threeten.bp.chrono.Chronology implements java.io.Serializable {
    private static final java.util.Map<java.lang.String, java.lang.String[]> Camera2StreamConfigurationMap;
    private static final java.util.Map<java.lang.String, java.lang.String[]> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<java.lang.String, java.lang.String[]> getHighSpeedVideoFpsRanges;
    private static final long serialVersionUID = 459996390165777884L;
    static final java.util.Locale getHighSpeedVideoSizes = new java.util.Locale("ja", "JP", "JP");
    public static final org.threeten.bp.chrono.JapaneseChronology INSTANCE = new org.threeten.bp.chrono.JapaneseChronology();

    @Override // org.threeten.bp.chrono.Chronology
    public final /* bridge */ /* synthetic */ org.threeten.bp.chrono.ChronoLocalDate resolveDate(java.util.Map map, org.threeten.bp.format.ResolverStyle resolverStyle) {
        return resolveDate((java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long>) map, resolverStyle);
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap3;
        hashMap.put("en", new java.lang.String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap.put("ja", new java.lang.String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("en", new java.lang.String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("ja", new java.lang.String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new java.lang.String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new java.lang.String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private JapaneseChronology() {
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getId() {
        return "Japanese";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.lang.String getCalendarType() {
        return "japanese";
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate date(org.threeten.bp.chrono.Era era, int i, int i2, int i3) {
        if (!(era instanceof org.threeten.bp.chrono.JapaneseEra)) {
            throw new java.lang.ClassCastException("Era must be JapaneseEra");
        }
        return org.threeten.bp.chrono.JapaneseDate.of((org.threeten.bp.chrono.JapaneseEra) era, i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate date(int i, int i2, int i3) {
        return new org.threeten.bp.chrono.JapaneseDate(org.threeten.bp.LocalDate.of(i, i2, i3));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate dateYearDay(org.threeten.bp.chrono.Era era, int i, int i2) {
        if (!(era instanceof org.threeten.bp.chrono.JapaneseEra)) {
            throw new java.lang.ClassCastException("Era must be JapaneseEra");
        }
        return org.threeten.bp.chrono.JapaneseDate.getHighSpeedVideoFpsRanges((org.threeten.bp.chrono.JapaneseEra) era, i, i2);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate dateYearDay(int i, int i2) {
        org.threeten.bp.LocalDate ofYearDay = org.threeten.bp.LocalDate.ofYearDay(i, i2);
        return date(i, ofYearDay.getMonthValue(), ofYearDay.getDayOfMonth());
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate dateEpochDay(long j) {
        return new org.threeten.bp.chrono.JapaneseDate(org.threeten.bp.LocalDate.ofEpochDay(j));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate date(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.chrono.JapaneseDate) {
            return (org.threeten.bp.chrono.JapaneseDate) temporalAccessor;
        }
        return new org.threeten.bp.chrono.JapaneseDate(org.threeten.bp.LocalDate.from(temporalAccessor));
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.chrono.JapaneseDate> localDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return super.localDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.chrono.JapaneseDate> zonedDateTime(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return super.zonedDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.ChronoZonedDateTime<org.threeten.bp.chrono.JapaneseDate> zonedDateTime(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        return super.zonedDateTime(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate dateNow() {
        return (org.threeten.bp.chrono.JapaneseDate) super.dateNow();
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate dateNow(org.threeten.bp.ZoneId zoneId) {
        return (org.threeten.bp.chrono.JapaneseDate) super.dateNow(zoneId);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate dateNow(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return (org.threeten.bp.chrono.JapaneseDate) super.dateNow(clock);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final boolean isLeapYear(long j) {
        return org.threeten.bp.chrono.IsoChronology.INSTANCE.isLeapYear(j);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final int prolepticYear(org.threeten.bp.chrono.Era era, int i) {
        if (!(era instanceof org.threeten.bp.chrono.JapaneseEra)) {
            throw new java.lang.ClassCastException("Era must be JapaneseEra");
        }
        int year = ((org.threeten.bp.chrono.JapaneseEra) era).getHighResolutionOutputSizeshNQ4ISI.getYear();
        org.threeten.bp.temporal.ValueRange.of(1L, (r6.Camera2StreamConfigurationMap().getYear() - r6.getHighResolutionOutputSizeshNQ4ISI.getYear()) + 1).checkValidValue(i, org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
        return (year + i) - 1;
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseEra eraOf(int i) {
        return org.threeten.bp.chrono.JapaneseEra.of(i);
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final java.util.List<org.threeten.bp.chrono.Era> eras() {
        return java.util.Arrays.asList(org.threeten.bp.chrono.JapaneseEra.values());
    }

    /* renamed from: org.threeten.bp.chrono.JapaneseChronology$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MICRO_OF_DAY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MINUTE_OF_DAY.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MILLI_OF_DAY.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.NANO_OF_DAY.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_DAY.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_AMPM.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.EPOCH_DAY.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.PROLEPTIC_MONTH.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
        }
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.ChronoField chronoField) {
        switch (org.threeten.bp.chrono.JapaneseChronology.AnonymousClass1.getHighSpeedVideoSizes[chronoField.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return chronoField.range();
            default:
                java.util.Calendar calendar = java.util.Calendar.getInstance(getHighSpeedVideoSizes);
                int i = 0;
                switch (org.threeten.bp.chrono.JapaneseChronology.AnonymousClass1.getHighSpeedVideoSizes[chronoField.ordinal()]) {
                    case 19:
                        org.threeten.bp.chrono.JapaneseEra[] values = org.threeten.bp.chrono.JapaneseEra.values();
                        return org.threeten.bp.temporal.ValueRange.of(values[0].getValue(), values[values.length - 1].getValue());
                    case 20:
                        org.threeten.bp.chrono.JapaneseEra[] values2 = org.threeten.bp.chrono.JapaneseEra.values();
                        return org.threeten.bp.temporal.ValueRange.of(org.threeten.bp.chrono.JapaneseDate.getHighSpeedVideoFpsRangesFor.getYear(), values2[values2.length - 1].Camera2StreamConfigurationMap().getYear());
                    case 21:
                        org.threeten.bp.chrono.JapaneseEra[] values3 = org.threeten.bp.chrono.JapaneseEra.values();
                        int year = values3[values3.length - 1].Camera2StreamConfigurationMap().getYear();
                        int year2 = values3[values3.length - 1].getHighResolutionOutputSizeshNQ4ISI.getYear();
                        int i2 = Integer.MAX_VALUE;
                        while (i < values3.length) {
                            i2 = java.lang.Math.min(i2, (values3[i].Camera2StreamConfigurationMap().getYear() - values3[i].getHighResolutionOutputSizeshNQ4ISI.getYear()) + 1);
                            i++;
                        }
                        return org.threeten.bp.temporal.ValueRange.of(1L, 6L, i2, (year - year2) + 1);
                    case 22:
                        return org.threeten.bp.temporal.ValueRange.of(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case 23:
                        org.threeten.bp.chrono.JapaneseEra[] values4 = org.threeten.bp.chrono.JapaneseEra.values();
                        int i3 = 366;
                        while (i < values4.length) {
                            i3 = java.lang.Math.min(i3, (values4[i].getHighResolutionOutputSizeshNQ4ISI.lengthOfYear() - values4[i].getHighResolutionOutputSizeshNQ4ISI.getDayOfYear()) + 1);
                            i++;
                        }
                        return org.threeten.bp.temporal.ValueRange.of(1L, i3, 366L);
                    default:
                        throw new java.lang.UnsupportedOperationException("Unimplementable field: ".concat(java.lang.String.valueOf(chronoField)));
                }
        }
    }

    @Override // org.threeten.bp.chrono.Chronology
    public final org.threeten.bp.chrono.JapaneseDate resolveDate(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.format.ResolverStyle resolverStyle) {
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
        java.lang.Long l = map.get(org.threeten.bp.temporal.ChronoField.ERA);
        org.threeten.bp.chrono.JapaneseEra eraOf = l != null ? eraOf(range(org.threeten.bp.temporal.ChronoField.ERA).checkValidIntValue(l.longValue(), org.threeten.bp.temporal.ChronoField.ERA)) : null;
        java.lang.Long l2 = map.get(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
        if (l2 != null) {
            int checkValidIntValue = range(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA).checkValidIntValue(l2.longValue(), org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
            if (eraOf == null && resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT && !map.containsKey(org.threeten.bp.temporal.ChronoField.YEAR)) {
                java.util.List<org.threeten.bp.chrono.Era> eras = eras();
                eraOf = (org.threeten.bp.chrono.JapaneseEra) eras.get(eras.size() - 1);
            }
            if (eraOf != null && map.containsKey(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) && map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH)) {
                map.remove(org.threeten.bp.temporal.ChronoField.ERA);
                map.remove(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    return date((eraOf.getHighResolutionOutputSizeshNQ4ISI.getYear() + checkValidIntValue) - 1, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.MONTHS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.DAYS);
                }
                int checkValidIntValue2 = range(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR);
                int checkValidIntValue3 = range(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue(), org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH);
                if (resolverStyle != org.threeten.bp.format.ResolverStyle.SMART) {
                    return date((org.threeten.bp.chrono.Era) eraOf, checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
                }
                if (checkValidIntValue <= 0) {
                    throw new org.threeten.bp.DateTimeException("Invalid YearOfEra: ".concat(java.lang.String.valueOf(checkValidIntValue)));
                }
                int year = (eraOf.getHighResolutionOutputSizeshNQ4ISI.getYear() + checkValidIntValue) - 1;
                if (checkValidIntValue3 > 28) {
                    checkValidIntValue3 = java.lang.Math.min(checkValidIntValue3, date(year, checkValidIntValue2, 1).lengthOfMonth());
                }
                org.threeten.bp.chrono.JapaneseDate date = date(year, checkValidIntValue2, checkValidIntValue3);
                if (date.getEra() != eraOf) {
                    if (java.lang.Math.abs(date.getEra().getValue() - eraOf.getValue()) > 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid Era/YearOfEra: ");
                        sb.append(eraOf);
                        sb.append(" ");
                        sb.append(checkValidIntValue);
                        throw new org.threeten.bp.DateTimeException(sb.toString());
                    }
                    if (date.get(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA) != 1 && checkValidIntValue != 1) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid Era/YearOfEra: ");
                        sb2.append(eraOf);
                        sb2.append(" ");
                        sb2.append(checkValidIntValue);
                        throw new org.threeten.bp.DateTimeException(sb2.toString());
                    }
                }
                return date;
            }
            if (eraOf != null && map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR)) {
                map.remove(org.threeten.bp.temporal.ChronoField.ERA);
                map.remove(org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA);
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    return dateYearDay((eraOf.getHighResolutionOutputSizeshNQ4ISI.getYear() + checkValidIntValue) - 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.DAYS);
                }
                return dateYearDay((org.threeten.bp.chrono.Era) eraOf, checkValidIntValue, range(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue(), org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR));
            }
        }
        if (map.containsKey(org.threeten.bp.temporal.ChronoField.YEAR)) {
            if (map.containsKey(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR)) {
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH)) {
                    int checkValidIntValue4 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                        long safeSubtract = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L);
                        long safeSubtract2 = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue(), 1L);
                        org.threeten.bp.chrono.JapaneseDate date2 = date(checkValidIntValue4, 1, 1);
                        org.threeten.bp.LocalDate plusMonths = date2.Camera2StreamConfigurationMap.plusMonths(safeSubtract);
                        if (!plusMonths.equals(date2.Camera2StreamConfigurationMap)) {
                            date2 = new org.threeten.bp.chrono.JapaneseDate(plusMonths);
                        }
                        org.threeten.bp.LocalDate plusDays = date2.Camera2StreamConfigurationMap.plusDays(safeSubtract2);
                        return plusDays.equals(date2.Camera2StreamConfigurationMap) ? date2 : new org.threeten.bp.chrono.JapaneseDate(plusDays);
                    }
                    int checkValidIntValue5 = range(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR);
                    int checkValidIntValue6 = range(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH).longValue(), org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH);
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.SMART && checkValidIntValue6 > 28) {
                        checkValidIntValue6 = java.lang.Math.min(checkValidIntValue6, date(checkValidIntValue4, checkValidIntValue5, 1).lengthOfMonth());
                    }
                    return date(checkValidIntValue4, checkValidIntValue5, checkValidIntValue6);
                }
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH)) {
                    if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                        int checkValidIntValue7 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                        if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                            return date(checkValidIntValue7, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.MONTHS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.DAYS);
                        }
                        int checkValidIntValue8 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue());
                        org.threeten.bp.chrono.JapaneseDate plus = date(checkValidIntValue7, checkValidIntValue8, 1).plus(((org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1), org.threeten.bp.temporal.ChronoUnit.DAYS);
                        if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || plus.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) == checkValidIntValue8) {
                            return plus;
                        }
                        throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                    }
                    if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
                        int checkValidIntValue9 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                        if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                            return date(checkValidIntValue9, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.MONTHS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.DAYS);
                        }
                        int checkValidIntValue10 = org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR).longValue());
                        org.threeten.bp.chrono.JapaneseDate with = date(checkValidIntValue9, checkValidIntValue10, 1).plus(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH).longValue()) - 1, org.threeten.bp.temporal.ChronoUnit.WEEKS).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
                        if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) == checkValidIntValue10) {
                            return with;
                        }
                        throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                    }
                }
            }
            if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR)) {
                int checkValidIntValue11 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                    long safeSubtract3 = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue(), 1L);
                    org.threeten.bp.chrono.JapaneseDate dateYearDay = dateYearDay(checkValidIntValue11, 1);
                    org.threeten.bp.LocalDate plusDays2 = dateYearDay.Camera2StreamConfigurationMap.plusDays(safeSubtract3);
                    return plusDays2.equals(dateYearDay.Camera2StreamConfigurationMap) ? dateYearDay : new org.threeten.bp.chrono.JapaneseDate(plusDays2);
                }
                return dateYearDay(checkValidIntValue11, org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR).longValue()));
            }
            if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR)) {
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                    int checkValidIntValue12 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                        return date(checkValidIntValue12, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.DAYS);
                    }
                    int checkValidIntValue13 = org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue());
                    int checkValidIntValue14 = org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue());
                    org.threeten.bp.chrono.JapaneseDate date3 = date(checkValidIntValue12, 1, 1);
                    org.threeten.bp.LocalDate plusDays3 = date3.Camera2StreamConfigurationMap.plusDays(((checkValidIntValue13 - 1) * 7) + (checkValidIntValue14 - 1));
                    if (!plusDays3.equals(date3.Camera2StreamConfigurationMap)) {
                        date3 = new org.threeten.bp.chrono.JapaneseDate(plusDays3);
                    }
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || date3.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue12) {
                        return date3;
                    }
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different year");
                }
                if (map.containsKey(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK)) {
                    int checkValidIntValue15 = org.threeten.bp.temporal.ChronoField.YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.YEAR).longValue());
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.LENIENT) {
                        return date(checkValidIntValue15, 1, 1).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.WEEKS).plus(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue(), 1L), org.threeten.bp.temporal.ChronoUnit.DAYS);
                    }
                    org.threeten.bp.chrono.JapaneseDate with2 = date(checkValidIntValue15, 1, 1).plus(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR).longValue()) - 1, org.threeten.bp.temporal.ChronoUnit.WEEKS).with(org.threeten.bp.temporal.TemporalAdjusters.nextOrSame(org.threeten.bp.DayOfWeek.of(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.checkValidIntValue(map.remove(org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK).longValue()))));
                    if (resolverStyle != org.threeten.bp.format.ResolverStyle.STRICT || with2.get(org.threeten.bp.temporal.ChronoField.YEAR) == checkValidIntValue15) {
                        return with2;
                    }
                    throw new org.threeten.bp.DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        return null;
    }
}
