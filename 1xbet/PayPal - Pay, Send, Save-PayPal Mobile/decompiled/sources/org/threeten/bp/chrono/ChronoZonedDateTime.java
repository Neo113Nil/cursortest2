package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public abstract class ChronoZonedDateTime<D extends org.threeten.bp.chrono.ChronoLocalDate> extends org.threeten.bp.jdk8.DefaultInterfaceTemporal implements org.threeten.bp.temporal.Temporal, java.lang.Comparable<org.threeten.bp.chrono.ChronoZonedDateTime<?>> {
    private static java.util.Comparator<org.threeten.bp.chrono.ChronoZonedDateTime<?>> getHighSpeedVideoSizes = new java.util.Comparator<org.threeten.bp.chrono.ChronoZonedDateTime<?>>() { // from class: org.threeten.bp.chrono.ChronoZonedDateTime.1
        @Override // java.util.Comparator
        public /* synthetic */ int compare(org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime, org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime2) {
            org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime3 = chronoZonedDateTime;
            org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime4 = chronoZonedDateTime2;
            int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(chronoZonedDateTime3.toEpochSecond(), chronoZonedDateTime4.toEpochSecond());
            return compareLongs == 0 ? org.threeten.bp.jdk8.Jdk8Methods.compareLongs(chronoZonedDateTime3.toLocalTime().toNanoOfDay(), chronoZonedDateTime4.toLocalTime().toNanoOfDay()) : compareLongs;
        }
    };

    public abstract org.threeten.bp.ZoneOffset getOffset();

    public abstract org.threeten.bp.ZoneId getZone();

    @Override // org.threeten.bp.temporal.Temporal
    public abstract org.threeten.bp.chrono.ChronoZonedDateTime<D> plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit);

    /* renamed from: toLocalDateTime */
    public abstract org.threeten.bp.chrono.ChronoLocalDateTime<D> toLocalDateTime2();

    @Override // org.threeten.bp.temporal.Temporal
    public abstract org.threeten.bp.chrono.ChronoZonedDateTime<D> with(org.threeten.bp.temporal.TemporalField temporalField, long j);

    /* renamed from: withEarlierOffsetAtOverlap */
    public abstract org.threeten.bp.chrono.ChronoZonedDateTime<D> withEarlierOffsetAtOverlap2();

    /* renamed from: withLaterOffsetAtOverlap */
    public abstract org.threeten.bp.chrono.ChronoZonedDateTime<D> withLaterOffsetAtOverlap2();

    /* renamed from: withZoneSameInstant */
    public abstract org.threeten.bp.chrono.ChronoZonedDateTime<D> withZoneSameInstant2(org.threeten.bp.ZoneId zoneId);

    /* renamed from: withZoneSameLocal */
    public abstract org.threeten.bp.chrono.ChronoZonedDateTime<D> withZoneSameLocal2(org.threeten.bp.ZoneId zoneId);

    public static java.util.Comparator<org.threeten.bp.chrono.ChronoZonedDateTime<?>> timeLineOrder() {
        return getHighSpeedVideoSizes;
    }

    public static org.threeten.bp.chrono.ChronoZonedDateTime<?> from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        if (temporalAccessor instanceof org.threeten.bp.chrono.ChronoZonedDateTime) {
            return (org.threeten.bp.chrono.ChronoZonedDateTime) temporalAccessor;
        }
        org.threeten.bp.chrono.Chronology chronology = (org.threeten.bp.chrono.Chronology) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.chronology());
        if (chronology == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No Chronology found to create ChronoZonedDateTime: ");
            sb.append(temporalAccessor.getClass());
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        return chronology.zonedDateTime(temporalAccessor);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (temporalField == org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS || temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
                return temporalField.range();
            }
            return toLocalDateTime2().range(temporalField);
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* renamed from: org.threeten.bp.chrono.ChronoZonedDateTime$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.chrono.ChronoZonedDateTime.AnonymousClass2.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Field too large for an int: ".concat(java.lang.String.valueOf(temporalField)));
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return toLocalDateTime2().get(temporalField);
        }
        return super.get(temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.chrono.ChronoZonedDateTime.AnonymousClass2.getHighSpeedVideoFpsRangesFor[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return toEpochSecond();
            }
            if (i == 2) {
                return getOffset().getTotalSeconds();
            }
            return toLocalDateTime2().getLong(temporalField);
        }
        return temporalField.getFrom(this);
    }

    public D toLocalDate() {
        return toLocalDateTime2().toLocalDate();
    }

    public org.threeten.bp.LocalTime toLocalTime() {
        return toLocalDateTime2().toLocalTime();
    }

    public org.threeten.bp.chrono.Chronology getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoZonedDateTime<D> with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return toLocalDate().getChronology().Camera2StreamConfigurationMap(super.with(temporalAdjuster));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoZonedDateTime<D> plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return toLocalDate().getChronology().Camera2StreamConfigurationMap(super.plus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoZonedDateTime<D> minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return toLocalDate().getChronology().Camera2StreamConfigurationMap(super.minus(temporalAmount));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public org.threeten.bp.chrono.ChronoZonedDateTime<D> minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return toLocalDate().getChronology().Camera2StreamConfigurationMap(super.minus(j, temporalUnit));
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone()) {
            return (R) getZone();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology()) {
            return (R) toLocalDate().getChronology();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.NANOS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return (R) getOffset();
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate()) {
            return (R) org.threeten.bp.LocalDate.ofEpochDay(toLocalDate().toEpochDay());
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime()) {
            return (R) toLocalTime();
        }
        return (R) super.query(temporalQuery);
    }

    public java.lang.String format(org.threeten.bp.format.DateTimeFormatter dateTimeFormatter) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    public org.threeten.bp.Instant toInstant() {
        return org.threeten.bp.Instant.ofEpochSecond(toEpochSecond(), toLocalTime().getNano());
    }

    public long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + toLocalTime().toSecondOfDay()) - getOffset().getTotalSeconds();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [org.threeten.bp.chrono.ChronoLocalDate] */
    @Override // java.lang.Comparable
    public int compareTo(org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime) {
        int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(toEpochSecond(), chronoZonedDateTime.toEpochSecond());
        return (compareLongs == 0 && (compareLongs = toLocalTime().getNano() - chronoZonedDateTime.toLocalTime().getNano()) == 0 && (compareLongs = toLocalDateTime2().compareTo(chronoZonedDateTime.toLocalDateTime2())) == 0 && (compareLongs = getZone().getId().compareTo(chronoZonedDateTime.getZone().getId())) == 0) ? toLocalDate().getChronology().compareTo(chronoZonedDateTime.toLocalDate().getChronology()) : compareLongs;
    }

    public boolean isAfter(org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        if (epochSecond <= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().getNano() > chronoZonedDateTime.toLocalTime().getNano();
        }
        return true;
    }

    public boolean isBefore(org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = chronoZonedDateTime.toEpochSecond();
        if (epochSecond >= epochSecond2) {
            return epochSecond == epochSecond2 && toLocalTime().getNano() < chronoZonedDateTime.toLocalTime().getNano();
        }
        return true;
    }

    public boolean isEqual(org.threeten.bp.chrono.ChronoZonedDateTime<?> chronoZonedDateTime) {
        return toEpochSecond() == chronoZonedDateTime.toEpochSecond() && toLocalTime().getNano() == chronoZonedDateTime.toLocalTime().getNano();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.chrono.ChronoZonedDateTime) && compareTo((org.threeten.bp.chrono.ChronoZonedDateTime<?>) obj) == 0;
    }

    public int hashCode() {
        return (toLocalDateTime2().hashCode() ^ getOffset().hashCode()) ^ java.lang.Integer.rotateLeft(getZone().hashCode(), 3);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(toLocalDateTime2().toString());
        sb.append(getOffset().toString());
        java.lang.String obj = sb.toString();
        if (getOffset() == getZone()) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb2.append(getZone().toString());
        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }
}
