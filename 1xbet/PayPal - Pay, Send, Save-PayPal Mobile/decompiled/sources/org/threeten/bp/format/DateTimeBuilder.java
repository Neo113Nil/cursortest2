package org.threeten.bp.format;

/* loaded from: classes18.dex */
final class DateTimeBuilder extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.TemporalAccessor, java.lang.Cloneable {
    org.threeten.bp.chrono.ChronoLocalDate Camera2StreamConfigurationMap;
    org.threeten.bp.chrono.Chronology getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    final java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    org.threeten.bp.Period getHighSpeedVideoSizes;
    org.threeten.bp.ZoneId getInputSizeshNQ4ISI;
    org.threeten.bp.LocalTime getOutputFormats;

    private org.threeten.bp.format.DateTimeBuilder getHighSpeedVideoSizes(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        java.lang.Long l = this.getHighSpeedVideoFpsRangesFor.get(temporalField);
        if (l != null && l.longValue() != j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Conflict found: ");
            sb.append(temporalField);
            sb.append(" ");
            sb.append(l);
            sb.append(" differs from ");
            sb.append(temporalField);
            sb.append(" ");
            sb.append(j);
            sb.append(": ");
            sb.append(this);
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor.put(temporalField, java.lang.Long.valueOf(j));
        return this;
    }

    public final org.threeten.bp.format.DateTimeBuilder getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.format.ResolverStyle resolverStyle, java.util.Set<org.threeten.bp.temporal.TemporalField> set) {
        org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate;
        org.threeten.bp.LocalTime localTime;
        if (set != null) {
            this.getHighSpeedVideoFpsRangesFor.keySet().retainAll(set);
        }
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRanges(resolverStyle);
        getHighSpeedVideoFpsRangesFor(resolverStyle);
        int i = 0;
        loop0: while (i < 100) {
            java.util.Iterator<java.util.Map.Entry<org.threeten.bp.temporal.TemporalField, java.lang.Long>> it = this.getHighSpeedVideoFpsRangesFor.entrySet().iterator();
            while (it.hasNext()) {
                org.threeten.bp.temporal.TemporalField key = it.next().getKey();
                org.threeten.bp.temporal.TemporalAccessor resolve = key.resolve(this.getHighSpeedVideoFpsRangesFor, this, resolverStyle);
                if (resolve != null) {
                    if (resolve instanceof org.threeten.bp.chrono.ChronoZonedDateTime) {
                        org.threeten.bp.chrono.ChronoZonedDateTime chronoZonedDateTime = (org.threeten.bp.chrono.ChronoZonedDateTime) resolve;
                        org.threeten.bp.ZoneId zoneId = this.getInputSizeshNQ4ISI;
                        if (zoneId == null) {
                            this.getInputSizeshNQ4ISI = chronoZonedDateTime.getZone();
                        } else if (!zoneId.equals(chronoZonedDateTime.getZone())) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChronoZonedDateTime must use the effective parsed zone: ");
                            sb.append(this.getInputSizeshNQ4ISI);
                            throw new org.threeten.bp.DateTimeException(sb.toString());
                        }
                        resolve = chronoZonedDateTime.toLocalDateTime2();
                    }
                    if (resolve instanceof org.threeten.bp.chrono.ChronoLocalDate) {
                        getHighSpeedVideoSizes(key, (org.threeten.bp.chrono.ChronoLocalDate) resolve);
                    } else if (resolve instanceof org.threeten.bp.LocalTime) {
                        getHighSpeedVideoSizes(key, (org.threeten.bp.LocalTime) resolve);
                    } else if (resolve instanceof org.threeten.bp.chrono.ChronoLocalDateTime) {
                        org.threeten.bp.chrono.ChronoLocalDateTime chronoLocalDateTime = (org.threeten.bp.chrono.ChronoLocalDateTime) resolve;
                        getHighSpeedVideoSizes(key, chronoLocalDateTime.toLocalDate());
                        getHighSpeedVideoSizes(key, chronoLocalDateTime.toLocalTime());
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown type: ");
                        sb2.append(resolve.getClass().getName());
                        throw new org.threeten.bp.DateTimeException(sb2.toString());
                    }
                } else if (!this.getHighSpeedVideoFpsRangesFor.containsKey(key)) {
                    break;
                }
                i++;
            }
        }
        if (i == 100) {
            throw new org.threeten.bp.DateTimeException("Badly written field");
        }
        if (i > 0) {
            Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges(resolverStyle);
            getHighSpeedVideoFpsRangesFor(resolverStyle);
        }
        java.lang.Long l = this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY);
        java.lang.Long l2 = this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR);
        java.lang.Long l3 = this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE);
        java.lang.Long l4 = this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND);
        if (l != null && ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null))) {
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                if (l != null) {
                    if (resolverStyle == org.threeten.bp.format.ResolverStyle.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                        l = 0L;
                        this.getHighSpeedVideoSizes = org.threeten.bp.Period.ofDays(1);
                    }
                    int checkValidIntValue = org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY.checkValidIntValue(l.longValue());
                    if (l2 != null) {
                        int checkValidIntValue2 = org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR.checkValidIntValue(l2.longValue());
                        if (l3 != null) {
                            int checkValidIntValue3 = org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE.checkValidIntValue(l3.longValue());
                            if (l4 != null) {
                                this.getOutputFormats = org.threeten.bp.LocalTime.of(checkValidIntValue, checkValidIntValue2, checkValidIntValue3, org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.checkValidIntValue(l4.longValue()));
                            } else {
                                this.getOutputFormats = org.threeten.bp.LocalTime.of(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
                            }
                        } else if (l4 == null) {
                            this.getOutputFormats = org.threeten.bp.LocalTime.of(checkValidIntValue, checkValidIntValue2);
                        }
                    } else if (l3 == null && l4 == null) {
                        this.getOutputFormats = org.threeten.bp.LocalTime.of(checkValidIntValue, 0);
                    }
                }
            } else if (l != null) {
                long longValue = l.longValue();
                if (l2 == null) {
                    int safeToInt = org.threeten.bp.jdk8.Jdk8Methods.safeToInt(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(longValue, 24L));
                    this.getOutputFormats = org.threeten.bp.LocalTime.of(org.threeten.bp.jdk8.Jdk8Methods.floorMod(longValue, 24), 0);
                    this.getHighSpeedVideoSizes = org.threeten.bp.Period.ofDays(safeToInt);
                } else if (l3 != null) {
                    if (l4 == null) {
                        l4 = 0L;
                    }
                    long safeAdd = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(longValue, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR), org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(l2.longValue(), kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE)), org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(l3.longValue(), 1000000000L)), l4.longValue());
                    int floorDiv = (int) org.threeten.bp.jdk8.Jdk8Methods.floorDiv(safeAdd, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY);
                    this.getOutputFormats = org.threeten.bp.LocalTime.ofNanoOfDay(org.threeten.bp.jdk8.Jdk8Methods.floorMod(safeAdd, kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY));
                    this.getHighSpeedVideoSizes = org.threeten.bp.Period.ofDays(floorDiv);
                } else {
                    long safeAdd2 = org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(longValue, 3600L), org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(l2.longValue(), 60L));
                    int floorDiv2 = (int) org.threeten.bp.jdk8.Jdk8Methods.floorDiv(safeAdd2, 86400L);
                    this.getOutputFormats = org.threeten.bp.LocalTime.ofSecondOfDay(org.threeten.bp.jdk8.Jdk8Methods.floorMod(safeAdd2, 86400L));
                    this.getHighSpeedVideoSizes = org.threeten.bp.Period.ofDays(floorDiv2);
                }
            }
            this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY);
            this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR);
            this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE);
            this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND);
        }
        if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
            org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate2 = this.Camera2StreamConfigurationMap;
            if (chronoLocalDate2 != null && (localTime = this.getOutputFormats) != null) {
                getHighSpeedVideoFpsRangesFor(chronoLocalDate2.atTime(localTime));
            } else if (chronoLocalDate2 != null) {
                getHighSpeedVideoFpsRangesFor(chronoLocalDate2);
            } else {
                org.threeten.bp.temporal.TemporalAccessor temporalAccessor = this.getOutputFormats;
                if (temporalAccessor != null) {
                    getHighSpeedVideoFpsRangesFor(temporalAccessor);
                }
            }
        }
        org.threeten.bp.Period period = this.getHighSpeedVideoSizes;
        if (period != null && !period.isZero() && (chronoLocalDate = this.Camera2StreamConfigurationMap) != null && this.getOutputFormats != null) {
            this.Camera2StreamConfigurationMap = chronoLocalDate.plus((org.threeten.bp.temporal.TemporalAmount) this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes = org.threeten.bp.Period.ZERO;
        }
        if (this.getOutputFormats == null && (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS) || this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY) || this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE))) {
            if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND)) {
                long longValue2 = this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND).longValue();
                this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND, java.lang.Long.valueOf(longValue2 / 1000));
                this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND, java.lang.Long.valueOf(longValue2 / 1000000));
            } else {
                this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, 0L);
                this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND, 0L);
                this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND, 0L);
            }
        }
        if (this.Camera2StreamConfigurationMap != null && this.getOutputFormats != null) {
            java.lang.Long l5 = this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS);
            if (l5 != null) {
                this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS, java.lang.Long.valueOf(this.Camera2StreamConfigurationMap.atTime(this.getOutputFormats).atZone2(org.threeten.bp.ZoneOffset.ofTotalSeconds(l5.intValue())).getLong(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS)));
            } else if (this.getInputSizeshNQ4ISI != null) {
                this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS, java.lang.Long.valueOf(this.Camera2StreamConfigurationMap.atTime(this.getOutputFormats).atZone2(this.getInputSizeshNQ4ISI).getLong(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS)));
            }
        }
        return this;
    }

    private void getHighSpeedVideoSizes(org.threeten.bp.temporal.TemporalField temporalField, org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.equals(chronoLocalDate.getChronology())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChronoLocalDate must use the effective parsed chronology: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        long epochDay = chronoLocalDate.toEpochDay();
        java.lang.Long put = this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.EPOCH_DAY, java.lang.Long.valueOf(epochDay));
        if (put == null || put.longValue() == epochDay) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Conflict found: ");
        sb2.append(org.threeten.bp.LocalDate.ofEpochDay(put.longValue()));
        sb2.append(" differs from ");
        sb2.append(org.threeten.bp.LocalDate.ofEpochDay(epochDay));
        sb2.append(" while resolving  ");
        sb2.append(temporalField);
        throw new org.threeten.bp.DateTimeException(sb2.toString());
    }

    private void getHighSpeedVideoSizes(org.threeten.bp.temporal.TemporalField temporalField, org.threeten.bp.LocalTime localTime) {
        long nanoOfDay = localTime.toNanoOfDay();
        java.lang.Long put = this.getHighSpeedVideoFpsRangesFor.put(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY, java.lang.Long.valueOf(nanoOfDay));
        if (put == null || put.longValue() == nanoOfDay) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Conflict found: ");
        sb.append(org.threeten.bp.LocalTime.ofNanoOfDay(put.longValue()));
        sb.append(" differs from ");
        sb.append(localTime);
        sb.append(" while resolving  ");
        sb.append(temporalField);
        throw new org.threeten.bp.DateTimeException(sb.toString());
    }

    private void getHighSpeedVideoFpsRanges(org.threeten.bp.format.ResolverStyle resolverStyle) {
        if (this.getHighResolutionOutputSizeshNQ4ISI instanceof org.threeten.bp.chrono.IsoChronology) {
            Camera2StreamConfigurationMap(org.threeten.bp.chrono.IsoChronology.INSTANCE.resolveDate(this.getHighSpeedVideoFpsRangesFor, resolverStyle));
        } else if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.EPOCH_DAY)) {
            Camera2StreamConfigurationMap(org.threeten.bp.LocalDate.ofEpochDay(this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.EPOCH_DAY).longValue()));
        }
    }

    private void getHighSpeedVideoFpsRangesFor(org.threeten.bp.format.ResolverStyle resolverStyle) {
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_DAY)) {
            long longValue = this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_DAY).longValue();
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT && (resolverStyle != org.threeten.bp.format.ResolverStyle.SMART || longValue != 0)) {
                org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_DAY.checkValidValue(longValue);
            }
            org.threeten.bp.temporal.ChronoField chronoField = org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            getHighSpeedVideoSizes(chronoField, longValue);
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_AMPM)) {
            long longValue2 = this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_AMPM).longValue();
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT && (resolverStyle != org.threeten.bp.format.ResolverStyle.SMART || longValue2 != 0)) {
                org.threeten.bp.temporal.ChronoField.CLOCK_HOUR_OF_AMPM.checkValidValue(longValue2);
            }
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM, longValue2 != 12 ? longValue2 : 0L);
        }
        if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
            if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY)) {
                org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY.checkValidValue(this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY).longValue());
            }
            if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM)) {
                org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM.checkValidValue(this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM).longValue());
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY) && this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM)) {
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY, (this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY).longValue() * 12) + this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.HOUR_OF_AMPM).longValue());
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY)) {
            long longValue3 = this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY).longValue();
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                org.threeten.bp.temporal.ChronoField.NANO_OF_DAY.checkValidValue(longValue3);
            }
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY, longValue3 / 1000000000);
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MICRO_OF_DAY)) {
            long longValue4 = this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MICRO_OF_DAY).longValue();
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                org.threeten.bp.temporal.ChronoField.MICRO_OF_DAY.checkValidValue(longValue4);
            }
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY, longValue4 / 1000000);
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MILLI_OF_DAY)) {
            long longValue5 = this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MILLI_OF_DAY).longValue();
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                org.threeten.bp.temporal.ChronoField.MILLI_OF_DAY.checkValidValue(longValue5);
            }
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY, longValue5 / 1000);
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND, longValue5 % 1000);
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY)) {
            long longValue6 = this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY).longValue();
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY.checkValidValue(longValue6);
            }
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY, longValue6 / 3600);
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.SECOND_OF_MINUTE, longValue6 % 60);
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MINUTE_OF_DAY)) {
            long longValue7 = this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MINUTE_OF_DAY).longValue();
            if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
                org.threeten.bp.temporal.ChronoField.MINUTE_OF_DAY.checkValidValue(longValue7);
            }
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.HOUR_OF_DAY, longValue7 / 60);
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (resolverStyle != org.threeten.bp.format.ResolverStyle.LENIENT) {
            if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND)) {
                org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND.checkValidValue(this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND).longValue());
            }
            if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND)) {
                org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND.checkValidValue(this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND).longValue());
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND) && this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND)) {
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND, (this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND).longValue() * 1000) + (this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND).longValue() % 1000));
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND) && this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND)) {
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND, this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND).longValue() / 1000);
            this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND);
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND) && this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND)) {
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND, this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND).longValue() / 1000000);
            this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND);
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND)) {
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND).longValue() * 1000);
        } else if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND)) {
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND).longValue() * 1000000);
        }
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS)) {
            org.threeten.bp.ZoneId zoneId = this.getInputSizeshNQ4ISI;
            if (zoneId != null) {
                getHighSpeedVideoFpsRangesFor(zoneId);
                return;
            }
            java.lang.Long l = this.getHighSpeedVideoFpsRangesFor.get(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS);
            if (l != null) {
                getHighSpeedVideoFpsRangesFor((org.threeten.bp.ZoneId) org.threeten.bp.ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    private void getHighSpeedVideoFpsRangesFor(org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.chrono.ChronoZonedDateTime<?> zonedDateTime = this.getHighResolutionOutputSizeshNQ4ISI.zonedDateTime(org.threeten.bp.Instant.ofEpochSecond(this.getHighSpeedVideoFpsRangesFor.remove(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS).longValue()), zoneId);
        if (this.Camera2StreamConfigurationMap != null) {
            getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS, zonedDateTime.toLocalDate());
        } else {
            this.Camera2StreamConfigurationMap = zonedDateTime.toLocalDate();
        }
        getHighSpeedVideoSizes(org.threeten.bp.temporal.ChronoField.SECOND_OF_DAY, zonedDateTime.toLocalTime().toSecondOfDay());
    }

    private void getHighSpeedVideoFpsRangesFor(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        java.util.Iterator<java.util.Map.Entry<org.threeten.bp.temporal.TemporalField, java.lang.Long>> it = this.getHighSpeedVideoFpsRangesFor.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<org.threeten.bp.temporal.TemporalField, java.lang.Long> next = it.next();
            org.threeten.bp.temporal.TemporalField key = next.getKey();
            long longValue = next.getValue().longValue();
            if (temporalAccessor.isSupported(key)) {
                try {
                    long j = temporalAccessor.getLong(key);
                    if (j != longValue) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cross check failed: ");
                        sb.append(key);
                        sb.append(" ");
                        sb.append(j);
                        sb.append(" vs ");
                        sb.append(key);
                        sb.append(" ");
                        sb.append(longValue);
                        throw new org.threeten.bp.DateTimeException(sb.toString());
                    }
                    it.remove();
                } catch (java.lang.RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == null) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRangesFor.containsKey(temporalField)) {
            return true;
        }
        org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate = this.Camera2StreamConfigurationMap;
        if (chronoLocalDate != null && chronoLocalDate.isSupported(temporalField)) {
            return true;
        }
        org.threeten.bp.LocalTime localTime = this.getOutputFormats;
        return localTime != null && localTime.isSupported(temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalField, "field");
        java.lang.Long l = this.getHighSpeedVideoFpsRangesFor.get(temporalField);
        if (l == null) {
            org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate = this.Camera2StreamConfigurationMap;
            if (chronoLocalDate != null && chronoLocalDate.isSupported(temporalField)) {
                return this.Camera2StreamConfigurationMap.getLong(temporalField);
            }
            org.threeten.bp.LocalTime localTime = this.getOutputFormats;
            if (localTime != null && localTime.isSupported(temporalField)) {
                return this.getOutputFormats.getLong(temporalField);
            }
            throw new org.threeten.bp.DateTimeException("Field not found: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return l.longValue();
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId()) {
            return (R) this.getInputSizeshNQ4ISI;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) this.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate = this.Camera2StreamConfigurationMap;
            if (chronoLocalDate != null) {
                return (R) org.threeten.bp.LocalDate.from((org.threeten.bp.temporal.TemporalAccessor) chronoLocalDate);
            }
            return null;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return (R) this.getOutputFormats;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return temporalQuery.queryFrom(this);
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.getHighSpeedVideoFpsRangesFor.size() > 0) {
            sb.append("fields=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
        }
        sb.append(", ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", ");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", ");
        sb.append(this.getOutputFormats);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private void Camera2StreamConfigurationMap(org.threeten.bp.LocalDate localDate) {
        if (localDate != null) {
            this.Camera2StreamConfigurationMap = localDate;
            for (org.threeten.bp.temporal.TemporalField temporalField : this.getHighSpeedVideoFpsRangesFor.keySet()) {
                if ((temporalField instanceof org.threeten.bp.temporal.ChronoField) && temporalField.isDateBased()) {
                    try {
                        long j = localDate.getLong(temporalField);
                        java.lang.Long l = this.getHighSpeedVideoFpsRangesFor.get(temporalField);
                        if (j != l.longValue()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Conflict found: Field ");
                            sb.append(temporalField);
                            sb.append(" ");
                            sb.append(j);
                            sb.append(" differs from ");
                            sb.append(temporalField);
                            sb.append(" ");
                            sb.append(l);
                            sb.append(" derived from ");
                            sb.append(localDate);
                            throw new org.threeten.bp.DateTimeException(sb.toString());
                        }
                    } catch (org.threeten.bp.DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }
}
