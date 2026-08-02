package org.threeten.bp.format;

/* loaded from: classes18.dex */
final class DateTimePrintContext {
    org.threeten.bp.temporal.TemporalAccessor getHighResolutionOutputSizeshNQ4ISI;
    org.threeten.bp.format.DecimalStyle getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.util.Locale getHighSpeedVideoSizes;

    DateTimePrintContext(final org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.chrono.Chronology chronology = dateTimeFormatter.getChronology();
        org.threeten.bp.ZoneId zone = dateTimeFormatter.getZone();
        if (chronology != null || zone != null) {
            org.threeten.bp.chrono.Chronology chronology2 = (org.threeten.bp.chrono.Chronology) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.chronology());
            final org.threeten.bp.ZoneId zoneId = (org.threeten.bp.ZoneId) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.zoneId());
            final org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate = null;
            chronology = org.threeten.bp.jdk8.Jdk8Methods.equals(chronology2, chronology) ? null : chronology;
            zone = org.threeten.bp.jdk8.Jdk8Methods.equals(zoneId, zone) ? null : zone;
            if (chronology != null || zone != null) {
                final org.threeten.bp.chrono.Chronology chronology3 = chronology != null ? chronology : chronology2;
                zoneId = zone != null ? zone : zoneId;
                if (zone != null) {
                    if (temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS)) {
                        temporalAccessor = (chronology3 == null ? org.threeten.bp.chrono.IsoChronology.INSTANCE : chronology3).zonedDateTime(org.threeten.bp.Instant.from(temporalAccessor), zone);
                    } else {
                        org.threeten.bp.ZoneId normalized = zone.normalized();
                        org.threeten.bp.ZoneOffset zoneOffset = (org.threeten.bp.ZoneOffset) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.offset());
                        if ((normalized instanceof org.threeten.bp.ZoneOffset) && zoneOffset != null && !normalized.equals(zoneOffset)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid override zone for temporal: ");
                            sb.append(zone);
                            sb.append(" ");
                            sb.append(temporalAccessor);
                            throw new org.threeten.bp.DateTimeException(sb.toString());
                        }
                    }
                }
                if (chronology != null) {
                    if (temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY)) {
                        chronoLocalDate = chronology3.date(temporalAccessor);
                    } else if (chronology != org.threeten.bp.chrono.IsoChronology.INSTANCE || chronology2 != null) {
                        for (org.threeten.bp.temporal.ChronoField chronoField : org.threeten.bp.temporal.ChronoField.values()) {
                            if (chronoField.isDateBased() && temporalAccessor.isSupported(chronoField)) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid override chronology for temporal: ");
                                sb2.append(chronology);
                                sb2.append(" ");
                                sb2.append(temporalAccessor);
                                throw new org.threeten.bp.DateTimeException(sb2.toString());
                            }
                        }
                    }
                }
                temporalAccessor = new org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor() { // from class: org.threeten.bp.format.DateTimePrintContext.1
                    @Override // org.threeten.bp.temporal.TemporalAccessor
                    public boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
                        if (org.threeten.bp.chrono.ChronoLocalDate.this != null && temporalField.isDateBased()) {
                            return org.threeten.bp.chrono.ChronoLocalDate.this.isSupported(temporalField);
                        }
                        return temporalAccessor.isSupported(temporalField);
                    }

                    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
                    public org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
                        if (org.threeten.bp.chrono.ChronoLocalDate.this != null && temporalField.isDateBased()) {
                            return org.threeten.bp.chrono.ChronoLocalDate.this.range(temporalField);
                        }
                        return temporalAccessor.range(temporalField);
                    }

                    @Override // org.threeten.bp.temporal.TemporalAccessor
                    public long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
                        if (org.threeten.bp.chrono.ChronoLocalDate.this != null && temporalField.isDateBased()) {
                            return org.threeten.bp.chrono.ChronoLocalDate.this.getLong(temporalField);
                        }
                        return temporalAccessor.getLong(temporalField);
                    }

                    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
                    public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
                        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
                            return (R) chronology3;
                        }
                        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId()) {
                            return (R) zoneId;
                        }
                        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
                            return (R) temporalAccessor.query(temporalQuery);
                        }
                        return temporalQuery.queryFrom(this);
                    }
                };
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = temporalAccessor;
        this.getHighSpeedVideoSizes = dateTimeFormatter.getLocale();
        this.getHighSpeedVideoFpsRanges = dateTimeFormatter.getDecimalStyle();
    }

    final <R> R getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        R r = (R) this.getHighResolutionOutputSizeshNQ4ISI.query(temporalQuery);
        if (r != null || this.getHighSpeedVideoFpsRangesFor != 0) {
            return r;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to extract value: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getClass());
        throw new org.threeten.bp.DateTimeException(sb.toString());
    }

    final java.lang.Long Camera2StreamConfigurationMap(org.threeten.bp.temporal.TemporalField temporalField) {
        try {
            return java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getLong(temporalField));
        } catch (org.threeten.bp.DateTimeException e) {
            if (this.getHighSpeedVideoFpsRangesFor > 0) {
                return null;
            }
            throw e;
        }
    }

    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }
}
