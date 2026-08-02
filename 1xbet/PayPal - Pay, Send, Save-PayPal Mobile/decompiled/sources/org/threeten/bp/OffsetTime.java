package org.threeten.bp;

/* loaded from: classes18.dex */
public final class OffsetTime extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.OffsetTime>, java.io.Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    final org.threeten.bp.ZoneOffset getHighSpeedVideoFpsRangesFor;
    final org.threeten.bp.LocalTime getHighSpeedVideoSizes;
    public static final org.threeten.bp.OffsetTime MIN = org.threeten.bp.LocalTime.MIN.atOffset(org.threeten.bp.ZoneOffset.MAX);
    public static final org.threeten.bp.OffsetTime MAX = org.threeten.bp.LocalTime.MAX.atOffset(org.threeten.bp.ZoneOffset.MIN);
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.OffsetTime> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.OffsetTime>() { // from class: org.threeten.bp.OffsetTime.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.OffsetTime queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.OffsetTime.from(temporalAccessor);
        }
    };

    public static org.threeten.bp.OffsetTime now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.OffsetTime now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.OffsetTime now(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        org.threeten.bp.Instant instant = clock.instant();
        return ofInstant(instant, clock.getZone().getRules().getOffset(instant));
    }

    public static org.threeten.bp.OffsetTime of(org.threeten.bp.LocalTime localTime, org.threeten.bp.ZoneOffset zoneOffset) {
        return new org.threeten.bp.OffsetTime(localTime, zoneOffset);
    }

    public static org.threeten.bp.OffsetTime of(int i, int i2, int i3, int i4, org.threeten.bp.ZoneOffset zoneOffset) {
        return new org.threeten.bp.OffsetTime(org.threeten.bp.LocalTime.of(i, i2, i3, i4), zoneOffset);
    }

    public static org.threeten.bp.OffsetTime ofInstant(org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(instant, "instant");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        org.threeten.bp.ZoneOffset offset = zoneId.getRules().getOffset(instant);
        long epochSecond = ((instant.getEpochSecond() % 86400) + offset.getTotalSeconds()) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return new org.threeten.bp.OffsetTime(org.threeten.bp.LocalTime.getHighResolutionOutputSizeshNQ4ISI(epochSecond, instant.getNano()), offset);
    }

    public static org.threeten.bp.OffsetTime from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof org.threeten.bp.OffsetTime) {
            return (org.threeten.bp.OffsetTime) temporalAccessor;
        }
        try {
            return new org.threeten.bp.OffsetTime(org.threeten.bp.LocalTime.from(temporalAccessor), org.threeten.bp.ZoneOffset.from(temporalAccessor));
        } catch (org.threeten.bp.DateTimeException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain OffsetTime from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    public static org.threeten.bp.OffsetTime parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, org.threeten.bp.format.DateTimeFormatter.ISO_OFFSET_TIME);
    }

    public static org.threeten.bp.OffsetTime parse(java.lang.CharSequence charSequence, org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return (org.threeten.bp.OffsetTime) dateTimeFormatter.parse(charSequence, FROM);
    }

    private OffsetTime(org.threeten.bp.LocalTime localTime, org.threeten.bp.ZoneOffset zoneOffset) {
        this.getHighSpeedVideoSizes = (org.threeten.bp.LocalTime) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localTime, "time");
        this.getHighSpeedVideoFpsRangesFor = (org.threeten.bp.ZoneOffset) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField.isTimeBased() || temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            return temporalUnit.isTimeBased();
        }
        return temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return this.getHighSpeedVideoSizes.range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        return super.get(temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
                return getOffset().getTotalSeconds();
            }
            return this.getHighSpeedVideoSizes.getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public final org.threeten.bp.ZoneOffset getOffset() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final org.threeten.bp.OffsetTime withOffsetSameLocal(org.threeten.bp.ZoneOffset zoneOffset) {
        return (zoneOffset == null || !zoneOffset.equals(this.getHighSpeedVideoFpsRangesFor)) ? new org.threeten.bp.OffsetTime(this.getHighSpeedVideoSizes, zoneOffset) : this;
    }

    public final org.threeten.bp.OffsetTime withOffsetSameInstant(org.threeten.bp.ZoneOffset zoneOffset) {
        if (zoneOffset.equals(this.getHighSpeedVideoFpsRangesFor)) {
            return this;
        }
        return new org.threeten.bp.OffsetTime(this.getHighSpeedVideoSizes.plusSeconds(zoneOffset.getTotalSeconds() - this.getHighSpeedVideoFpsRangesFor.getTotalSeconds()), zoneOffset);
    }

    public final int getHour() {
        return this.getHighSpeedVideoSizes.getHour();
    }

    public final int getMinute() {
        return this.getHighSpeedVideoSizes.getMinute();
    }

    public final int getSecond() {
        return this.getHighSpeedVideoSizes.getSecond();
    }

    public final int getNano() {
        return this.getHighSpeedVideoSizes.getNano();
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetTime with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof org.threeten.bp.LocalTime) {
            org.threeten.bp.LocalTime localTime = (org.threeten.bp.LocalTime) temporalAdjuster;
            org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
            return (this.getHighSpeedVideoSizes == localTime && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(localTime, zoneOffset);
        }
        if (temporalAdjuster instanceof org.threeten.bp.ZoneOffset) {
            org.threeten.bp.ZoneOffset zoneOffset2 = (org.threeten.bp.ZoneOffset) temporalAdjuster;
            return this.getHighSpeedVideoFpsRangesFor.equals(zoneOffset2) ? this : new org.threeten.bp.OffsetTime(this.getHighSpeedVideoSizes, zoneOffset2);
        }
        if (temporalAdjuster instanceof org.threeten.bp.OffsetTime) {
            return (org.threeten.bp.OffsetTime) temporalAdjuster;
        }
        return (org.threeten.bp.OffsetTime) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetTime with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
                org.threeten.bp.LocalTime localTime = this.getHighSpeedVideoSizes;
                org.threeten.bp.ZoneOffset ofTotalSeconds = org.threeten.bp.ZoneOffset.ofTotalSeconds(((org.threeten.bp.temporal.ChronoField) temporalField).checkValidIntValue(j));
                return (this.getHighSpeedVideoSizes == localTime && this.getHighSpeedVideoFpsRangesFor.equals(ofTotalSeconds)) ? this : new org.threeten.bp.OffsetTime(localTime, ofTotalSeconds);
            }
            org.threeten.bp.LocalTime with = this.getHighSpeedVideoSizes.with(temporalField, j);
            org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
            return (this.getHighSpeedVideoSizes == with && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(with, zoneOffset);
        }
        return (org.threeten.bp.OffsetTime) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.OffsetTime withHour(int i) {
        org.threeten.bp.LocalTime withHour = this.getHighSpeedVideoSizes.withHour(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == withHour && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(withHour, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime withMinute(int i) {
        org.threeten.bp.LocalTime withMinute = this.getHighSpeedVideoSizes.withMinute(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == withMinute && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(withMinute, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime withSecond(int i) {
        org.threeten.bp.LocalTime withSecond = this.getHighSpeedVideoSizes.withSecond(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == withSecond && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(withSecond, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime withNano(int i) {
        org.threeten.bp.LocalTime withNano = this.getHighSpeedVideoSizes.withNano(i);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == withNano && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(withNano, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime truncatedTo(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.LocalTime truncatedTo = this.getHighSpeedVideoSizes.truncatedTo(temporalUnit);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == truncatedTo && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(truncatedTo, zoneOffset);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetTime plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.OffsetTime) temporalAmount.addTo(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetTime plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            org.threeten.bp.LocalTime plus = this.getHighSpeedVideoSizes.plus(j, temporalUnit);
            org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
            return (this.getHighSpeedVideoSizes == plus && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(plus, zoneOffset);
        }
        return (org.threeten.bp.OffsetTime) temporalUnit.addTo(this, j);
    }

    public final org.threeten.bp.OffsetTime plusHours(long j) {
        org.threeten.bp.LocalTime plusHours = this.getHighSpeedVideoSizes.plusHours(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == plusHours && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(plusHours, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime plusMinutes(long j) {
        org.threeten.bp.LocalTime plusMinutes = this.getHighSpeedVideoSizes.plusMinutes(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == plusMinutes && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(plusMinutes, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime plusSeconds(long j) {
        org.threeten.bp.LocalTime plusSeconds = this.getHighSpeedVideoSizes.plusSeconds(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == plusSeconds && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(plusSeconds, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime plusNanos(long j) {
        org.threeten.bp.LocalTime plusNanos = this.getHighSpeedVideoSizes.plusNanos(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == plusNanos && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(plusNanos, zoneOffset);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetTime minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.OffsetTime) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.OffsetTime minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.OffsetTime minusHours(long j) {
        org.threeten.bp.LocalTime minusHours = this.getHighSpeedVideoSizes.minusHours(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == minusHours && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(minusHours, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime minusMinutes(long j) {
        org.threeten.bp.LocalTime minusMinutes = this.getHighSpeedVideoSizes.minusMinutes(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == minusMinutes && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(minusMinutes, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime minusSeconds(long j) {
        org.threeten.bp.LocalTime minusSeconds = this.getHighSpeedVideoSizes.minusSeconds(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == minusSeconds && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(minusSeconds, zoneOffset);
    }

    public final org.threeten.bp.OffsetTime minusNanos(long j) {
        org.threeten.bp.LocalTime minusNanos = this.getHighSpeedVideoSizes.minusNanos(j);
        org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoFpsRangesFor;
        return (this.getHighSpeedVideoSizes == minusNanos && zoneOffset.equals(zoneOffset)) ? this : new org.threeten.bp.OffsetTime(minusNanos, zoneOffset);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.NANOS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone()) {
            return (R) getOffset();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return (R) this.getHighSpeedVideoSizes;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId()) {
            return null;
        }
        return (R) super.query(temporalQuery);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.NANO_OF_DAY, this.getHighSpeedVideoSizes.toNanoOfDay()).with(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, getOffset().getTotalSeconds());
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.OffsetTime from = from(temporal);
        if (!(temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit)) {
            return temporalUnit.between(this, from);
        }
        long nanoOfDay = (from.getHighSpeedVideoSizes.toNanoOfDay() - (from.getHighSpeedVideoFpsRangesFor.getTotalSeconds() * 1000000000)) - (this.getHighSpeedVideoSizes.toNanoOfDay() - (this.getHighSpeedVideoFpsRangesFor.getTotalSeconds() * 1000000000));
        switch (org.threeten.bp.OffsetTime.AnonymousClass2.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return nanoOfDay;
            case 2:
                return nanoOfDay / 1000;
            case 3:
                return nanoOfDay / 1000000;
            case 4:
                return nanoOfDay / 1000000000;
            case 5:
                return nanoOfDay / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE;
            case 6:
                return nanoOfDay / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR;
            case 7:
                return nanoOfDay / 43200000000000L;
            default:
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
    }

    /* renamed from: org.threeten.bp.OffsetTime$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.NANOS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.MICROS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public final org.threeten.bp.OffsetDateTime atDate(org.threeten.bp.LocalDate localDate) {
        return org.threeten.bp.OffsetDateTime.of(localDate, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    public final org.threeten.bp.LocalTime toLocalTime() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.OffsetTime offsetTime) {
        if (this.getHighSpeedVideoFpsRangesFor.equals(offsetTime.getHighSpeedVideoFpsRangesFor)) {
            return this.getHighSpeedVideoSizes.compareTo(offsetTime.getHighSpeedVideoSizes);
        }
        int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(this.getHighSpeedVideoSizes.toNanoOfDay() - (this.getHighSpeedVideoFpsRangesFor.getTotalSeconds() * 1000000000), offsetTime.getHighSpeedVideoSizes.toNanoOfDay() - (offsetTime.getHighSpeedVideoFpsRangesFor.getTotalSeconds() * 1000000000));
        return compareLongs == 0 ? this.getHighSpeedVideoSizes.compareTo(offsetTime.getHighSpeedVideoSizes) : compareLongs;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.OffsetTime)) {
            return false;
        }
        org.threeten.bp.OffsetTime offsetTime = (org.threeten.bp.OffsetTime) obj;
        return this.getHighSpeedVideoSizes.equals(offsetTime.getHighSpeedVideoSizes) && this.getHighSpeedVideoFpsRangesFor.equals(offsetTime.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode() ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes.toString());
        sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
        return sb.toString();
    }

    public final java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 66, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.OffsetTime Camera2StreamConfigurationMap(java.io.DataInput dataInput) throws java.io.IOException {
        return of(org.threeten.bp.LocalTime.getHighSpeedVideoFpsRangesFor(dataInput), org.threeten.bp.ZoneOffset.getHighSpeedVideoFpsRanges(dataInput));
    }

    public final boolean isAfter(org.threeten.bp.OffsetTime offsetTime) {
        return this.getHighSpeedVideoSizes.toNanoOfDay() - (((long) this.getHighSpeedVideoFpsRangesFor.getTotalSeconds()) * 1000000000) > offsetTime.getHighSpeedVideoSizes.toNanoOfDay() - (((long) offsetTime.getHighSpeedVideoFpsRangesFor.getTotalSeconds()) * 1000000000);
    }

    public final boolean isBefore(org.threeten.bp.OffsetTime offsetTime) {
        return this.getHighSpeedVideoSizes.toNanoOfDay() - (((long) this.getHighSpeedVideoFpsRangesFor.getTotalSeconds()) * 1000000000) < offsetTime.getHighSpeedVideoSizes.toNanoOfDay() - (((long) offsetTime.getHighSpeedVideoFpsRangesFor.getTotalSeconds()) * 1000000000);
    }

    public final boolean isEqual(org.threeten.bp.OffsetTime offsetTime) {
        return this.getHighSpeedVideoSizes.toNanoOfDay() - (((long) this.getHighSpeedVideoFpsRangesFor.getTotalSeconds()) * 1000000000) == offsetTime.getHighSpeedVideoSizes.toNanoOfDay() - (((long) offsetTime.getHighSpeedVideoFpsRangesFor.getTotalSeconds()) * 1000000000);
    }
}
