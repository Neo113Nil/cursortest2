package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public final class TemporalQueries {
    static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> getHighSpeedVideoSizesFor = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId>() { // from class: org.threeten.bp.temporal.TemporalQueries.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.ZoneId queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return (org.threeten.bp.ZoneId) temporalAccessor.query(this);
        }
    };
    static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.chrono.Chronology> getHighSpeedVideoFpsRanges = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.chrono.Chronology>() { // from class: org.threeten.bp.temporal.TemporalQueries.2
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.chrono.Chronology queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return (org.threeten.bp.chrono.Chronology) temporalAccessor.query(this);
        }
    };
    static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.temporal.TemporalUnit> getHighSpeedVideoFpsRangesFor = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.temporal.TemporalUnit>() { // from class: org.threeten.bp.temporal.TemporalQueries.3
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.temporal.TemporalUnit queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return (org.threeten.bp.temporal.TemporalUnit) temporalAccessor.query(this);
        }
    };
    static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> getInputSizeshNQ4ISI = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId>() { // from class: org.threeten.bp.temporal.TemporalQueries.4
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.ZoneId queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            org.threeten.bp.ZoneId zoneId = (org.threeten.bp.ZoneId) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.getHighSpeedVideoSizesFor);
            return zoneId != null ? zoneId : (org.threeten.bp.ZoneId) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.getHighSpeedVideoSizes);
        }
    };
    static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneOffset> getHighSpeedVideoSizes = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneOffset>() { // from class: org.threeten.bp.temporal.TemporalQueries.5
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.ZoneOffset queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            if (temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS)) {
                return org.threeten.bp.ZoneOffset.ofTotalSeconds(temporalAccessor.get(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS));
            }
            return null;
        }
    };
    static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalDate> getHighResolutionOutputSizeshNQ4ISI = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalDate>() { // from class: org.threeten.bp.temporal.TemporalQueries.6
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.LocalDate queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            if (temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY)) {
                return org.threeten.bp.LocalDate.ofEpochDay(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.EPOCH_DAY));
            }
            return null;
        }
    };
    static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalTime> Camera2StreamConfigurationMap = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalTime>() { // from class: org.threeten.bp.temporal.TemporalQueries.7
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.LocalTime queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            if (temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY)) {
                return org.threeten.bp.LocalTime.ofNanoOfDay(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY));
            }
            return null;
        }
    };

    private TemporalQueries() {
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> zoneId() {
        return getHighSpeedVideoSizesFor;
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.chrono.Chronology> chronology() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.temporal.TemporalUnit> precision() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneId> zone() {
        return getInputSizeshNQ4ISI;
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneOffset> offset() {
        return getHighSpeedVideoSizes;
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalDate> localDate() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.LocalTime> localTime() {
        return Camera2StreamConfigurationMap;
    }
}
