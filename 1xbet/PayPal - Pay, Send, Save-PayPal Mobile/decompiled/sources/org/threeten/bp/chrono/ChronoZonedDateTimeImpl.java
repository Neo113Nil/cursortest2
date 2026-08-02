package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
final class ChronoZonedDateTimeImpl<D extends org.threeten.bp.chrono.ChronoLocalDate> extends org.threeten.bp.chrono.ChronoZonedDateTime<D> implements java.io.Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    final org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> Camera2StreamConfigurationMap;
    final org.threeten.bp.ZoneOffset getHighResolutionOutputSizeshNQ4ISI;
    final org.threeten.bp.ZoneId getHighSpeedVideoFpsRangesFor;

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public final /* bridge */ /* synthetic */ org.threeten.bp.temporal.Temporal plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return plus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public final /* bridge */ /* synthetic */ org.threeten.bp.temporal.Temporal with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        return with(temporalField, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r2.contains(r13) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <R extends org.threeten.bp.chrono.ChronoLocalDate> org.threeten.bp.chrono.ChronoZonedDateTime<R> getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.chrono.ChronoLocalDateTimeImpl<R> chronoLocalDateTimeImpl, org.threeten.bp.ZoneId zoneId, org.threeten.bp.ZoneOffset zoneOffset) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(chronoLocalDateTimeImpl, "localDateTime");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        if (zoneId instanceof org.threeten.bp.ZoneOffset) {
            return new org.threeten.bp.chrono.ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, (org.threeten.bp.ZoneOffset) zoneId, zoneId);
        }
        org.threeten.bp.zone.ZoneRules rules = zoneId.getRules();
        org.threeten.bp.LocalDateTime from = org.threeten.bp.LocalDateTime.from((org.threeten.bp.temporal.TemporalAccessor) chronoLocalDateTimeImpl);
        java.util.List<org.threeten.bp.ZoneOffset> validOffsets = rules.getValidOffsets(from);
        if (validOffsets.size() != 1) {
            if (validOffsets.size() == 0) {
                org.threeten.bp.zone.ZoneOffsetTransition transition = rules.getTransition(from);
                chronoLocalDateTimeImpl = chronoLocalDateTimeImpl.Camera2StreamConfigurationMap(chronoLocalDateTimeImpl.getHighSpeedVideoSizes, 0L, 0L, transition.getDuration().getSeconds(), 0L);
                zoneOffset = transition.getOffsetAfter();
            } else if (zoneOffset != null) {
            }
            org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
            return new org.threeten.bp.chrono.ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, zoneOffset, zoneId);
        }
        zoneOffset = validOffsets.get(0);
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        return new org.threeten.bp.chrono.ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, zoneOffset, zoneId);
    }

    static <R extends org.threeten.bp.chrono.ChronoLocalDate> org.threeten.bp.chrono.ChronoZonedDateTimeImpl<R> getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.chrono.Chronology chronology, org.threeten.bp.Instant instant, org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.ZoneOffset offset = zoneId.getRules().getOffset(instant);
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(offset, "offset");
        return new org.threeten.bp.chrono.ChronoZonedDateTimeImpl<>((org.threeten.bp.chrono.ChronoLocalDateTimeImpl) chronology.localDateTime(org.threeten.bp.LocalDateTime.ofEpochSecond(instant.getEpochSecond(), instant.getNano(), offset)), offset, zoneId);
    }

    private ChronoZonedDateTimeImpl(org.threeten.bp.chrono.ChronoLocalDateTimeImpl<D> chronoLocalDateTimeImpl, org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneId zoneId) {
        this.Camera2StreamConfigurationMap = (org.threeten.bp.chrono.ChronoLocalDateTimeImpl) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(chronoLocalDateTimeImpl, "dateTime");
        this.getHighResolutionOutputSizeshNQ4ISI = (org.threeten.bp.ZoneOffset) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneOffset, "offset");
        this.getHighSpeedVideoFpsRangesFor = (org.threeten.bp.ZoneId) org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit ? temporalUnit.isDateBased() || temporalUnit.isTimeBased() : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final org.threeten.bp.ZoneOffset getOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withEarlierOffsetAtOverlap */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<D> withEarlierOffsetAtOverlap2() {
        org.threeten.bp.zone.ZoneOffsetTransition transition = getZone().getRules().getTransition(org.threeten.bp.LocalDateTime.from((org.threeten.bp.temporal.TemporalAccessor) this));
        if (transition != null && transition.isOverlap()) {
            org.threeten.bp.ZoneOffset offsetBefore = transition.getOffsetBefore();
            if (!offsetBefore.equals(this.getHighResolutionOutputSizeshNQ4ISI)) {
                return new org.threeten.bp.chrono.ChronoZonedDateTimeImpl(this.Camera2StreamConfigurationMap, offsetBefore, this.getHighSpeedVideoFpsRangesFor);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withLaterOffsetAtOverlap */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<D> withLaterOffsetAtOverlap2() {
        org.threeten.bp.zone.ZoneOffsetTransition transition = getZone().getRules().getTransition(org.threeten.bp.LocalDateTime.from((org.threeten.bp.temporal.TemporalAccessor) this));
        if (transition != null) {
            org.threeten.bp.ZoneOffset offsetAfter = transition.getOffsetAfter();
            if (!offsetAfter.equals(getOffset())) {
                return new org.threeten.bp.chrono.ChronoZonedDateTimeImpl(this.Camera2StreamConfigurationMap, offsetAfter, this.getHighSpeedVideoFpsRangesFor);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime */
    public final org.threeten.bp.chrono.ChronoLocalDateTime<D> toLocalDateTime2() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final org.threeten.bp.ZoneId getZone() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameLocal */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<D> withZoneSameLocal2(org.threeten.bp.ZoneId zoneId) {
        return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, zoneId, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    /* renamed from: withZoneSameInstant */
    public final org.threeten.bp.chrono.ChronoZonedDateTime<D> withZoneSameInstant2(org.threeten.bp.ZoneId zoneId) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(zoneId, "zone");
        if (this.getHighSpeedVideoFpsRangesFor.equals(zoneId)) {
            return this;
        }
        return getHighResolutionOutputSizeshNQ4ISI(toLocalDate().getChronology(), this.Camera2StreamConfigurationMap.toInstant(this.getHighResolutionOutputSizeshNQ4ISI), zoneId);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.ChronoZonedDateTime<D> with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            int i = org.threeten.bp.chrono.ChronoZonedDateTimeImpl.AnonymousClass1.getHighSpeedVideoFpsRangesFor[chronoField.ordinal()];
            if (i == 1) {
                return plus(j - toEpochSecond(), (org.threeten.bp.temporal.TemporalUnit) org.threeten.bp.temporal.ChronoUnit.SECONDS);
            }
            if (i == 2) {
                return getHighResolutionOutputSizeshNQ4ISI(toLocalDate().getChronology(), this.Camera2StreamConfigurationMap.toInstant(org.threeten.bp.ZoneOffset.ofTotalSeconds(chronoField.checkValidIntValue(j))), this.getHighSpeedVideoFpsRangesFor);
            }
            return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap.with(temporalField, j), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return toLocalDate().getChronology().Camera2StreamConfigurationMap(temporalField.adjustInto(this, j));
    }

    /* renamed from: org.threeten.bp.chrono.ChronoZonedDateTimeImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.ChronoZonedDateTime<D> plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            return with((org.threeten.bp.temporal.TemporalAdjuster) this.Camera2StreamConfigurationMap.plus(j, temporalUnit));
        }
        return toLocalDate().getChronology().Camera2StreamConfigurationMap(temporalUnit.addTo(this, j));
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.chrono.ChronoZonedDateTime<?> zonedDateTime = toLocalDate().getChronology().zonedDateTime(temporal);
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            return this.Camera2StreamConfigurationMap.until(zonedDateTime.withZoneSameInstant2(this.getHighResolutionOutputSizeshNQ4ISI).toLocalDateTime2(), temporalUnit);
        }
        return temporalUnit.between(this, zonedDateTime);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser((byte) 13, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.chrono.ChronoZonedDateTime<?> getHighSpeedVideoFpsRangesFor(java.io.ObjectInput objectInput) throws java.io.IOException, java.lang.ClassNotFoundException {
        org.threeten.bp.chrono.ChronoLocalDateTime chronoLocalDateTime = (org.threeten.bp.chrono.ChronoLocalDateTime) objectInput.readObject();
        org.threeten.bp.ZoneOffset zoneOffset = (org.threeten.bp.ZoneOffset) objectInput.readObject();
        return chronoLocalDateTime.atZone2(zoneOffset).withZoneSameLocal2((org.threeten.bp.ZoneId) objectInput.readObject());
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.chrono.ChronoZonedDateTime) && compareTo((org.threeten.bp.chrono.ChronoZonedDateTime<?>) obj) == 0;
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final int hashCode() {
        return (toLocalDateTime2().hashCode() ^ getOffset().hashCode()) ^ java.lang.Integer.rotateLeft(getZone().hashCode(), 3);
    }

    @Override // org.threeten.bp.chrono.ChronoZonedDateTime
    public final java.lang.String toString() {
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
