package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public final class JulianFields {
    public static final org.threeten.bp.temporal.TemporalField JULIAN_DAY = org.threeten.bp.temporal.JulianFields.Field.JULIAN_DAY;
    public static final org.threeten.bp.temporal.TemporalField MODIFIED_JULIAN_DAY = org.threeten.bp.temporal.JulianFields.Field.MODIFIED_JULIAN_DAY;
    public static final org.threeten.bp.temporal.TemporalField RATA_DIE = org.threeten.bp.temporal.JulianFields.Field.RATA_DIE;

    enum Field implements org.threeten.bp.temporal.TemporalField {
        JULIAN_DAY("JulianDay", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.FOREVER, 2440588),
        MODIFIED_JULIAN_DAY("ModifiedJulianDay", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.FOREVER, 40587),
        RATA_DIE("RataDie", org.threeten.bp.temporal.ChronoUnit.DAYS, org.threeten.bp.temporal.ChronoUnit.FOREVER, 719163);

        private final org.threeten.bp.temporal.TemporalUnit Camera2StreamConfigurationMap;
        private final org.threeten.bp.temporal.ValueRange getHighSpeedVideoSizesFor;
        private final java.lang.String getInputSizeshNQ4ISI;
        private final long getOutputFormats;
        private final org.threeten.bp.temporal.TemporalUnit getOutputMinFrameDuration;

        @Override // org.threeten.bp.temporal.TemporalField
        public final boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final boolean isTimeBased() {
            return false;
        }

        Field(java.lang.String str, org.threeten.bp.temporal.TemporalUnit temporalUnit, org.threeten.bp.temporal.TemporalUnit temporalUnit2, long j) {
            this.getInputSizeshNQ4ISI = str;
            this.Camera2StreamConfigurationMap = temporalUnit;
            this.getOutputMinFrameDuration = temporalUnit2;
            this.getHighSpeedVideoSizesFor = org.threeten.bp.temporal.ValueRange.of((-365243219162L) + j, 365241780471L + j);
            this.getOutputFormats = j;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final org.threeten.bp.temporal.TemporalUnit getBaseUnit() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final org.threeten.bp.temporal.TemporalUnit getRangeUnit() {
            return this.getOutputMinFrameDuration;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final org.threeten.bp.temporal.ValueRange range() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final boolean isSupportedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return temporalAccessor.isSupported(org.threeten.bp.temporal.ChronoField.EPOCH_DAY);
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final org.threeten.bp.temporal.ValueRange rangeRefinedBy(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            if (!isSupportedBy(temporalAccessor)) {
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(this)));
            }
            return range();
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final long getFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.EPOCH_DAY) + this.getOutputFormats;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final <R extends org.threeten.bp.temporal.Temporal> R adjustInto(R r, long j) {
            if (!range().isValidValue(j)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid value: ");
                sb.append(this.getInputSizeshNQ4ISI);
                sb.append(" ");
                sb.append(j);
                throw new org.threeten.bp.DateTimeException(sb.toString());
            }
            return (R) r.with(org.threeten.bp.temporal.ChronoField.EPOCH_DAY, org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(j, this.getOutputFormats));
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final java.lang.String getDisplayName(java.util.Locale locale) {
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(locale, "locale");
            return toString();
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public final org.threeten.bp.temporal.TemporalAccessor resolve(java.util.Map<org.threeten.bp.temporal.TemporalField, java.lang.Long> map, org.threeten.bp.temporal.TemporalAccessor temporalAccessor, org.threeten.bp.format.ResolverStyle resolverStyle) {
            return org.threeten.bp.chrono.Chronology.from(temporalAccessor).dateEpochDay(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(map.remove(this).longValue(), this.getOutputFormats));
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getInputSizeshNQ4ISI;
        }
    }
}
