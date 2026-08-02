package org.threeten.bp;

/* loaded from: classes18.dex */
public final class Instant extends org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor implements org.threeten.bp.temporal.Temporal, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.Instant>, java.io.Serializable {
    private static final long serialVersionUID = -665713676816604388L;
    final long Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    public static final org.threeten.bp.Instant EPOCH = new org.threeten.bp.Instant(0, 0);
    public static final org.threeten.bp.Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final org.threeten.bp.Instant MAX = ofEpochSecond(31556889864403199L, 999999999);
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Instant> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.Instant>() { // from class: org.threeten.bp.Instant.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.Instant queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.Instant.from(temporalAccessor);
        }
    };

    public static org.threeten.bp.Instant now() {
        return org.threeten.bp.Clock.systemUTC().instant();
    }

    public static org.threeten.bp.Instant now(org.threeten.bp.Clock clock) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(clock, "clock");
        return clock.instant();
    }

    public static org.threeten.bp.Instant ofEpochSecond(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(j, 0);
    }

    public static org.threeten.bp.Instant ofEpochSecond(long j, long j2) {
        return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(j, org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j2, 1000000000L)), org.threeten.bp.jdk8.Jdk8Methods.floorMod(j2, 1000000000));
    }

    public static org.threeten.bp.Instant ofEpochMilli(long j) {
        return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j, 1000L), org.threeten.bp.jdk8.Jdk8Methods.floorMod(j, 1000) * 1000000);
    }

    public static org.threeten.bp.Instant from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        try {
            return ofEpochSecond(temporalAccessor.getLong(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS), temporalAccessor.get(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND));
        } catch (org.threeten.bp.DateTimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain Instant from TemporalAccessor: ");
            sb.append(temporalAccessor);
            sb.append(", type ");
            sb.append(temporalAccessor.getClass().getName());
            throw new org.threeten.bp.DateTimeException(sb.toString(), e);
        }
    }

    public static org.threeten.bp.Instant parse(java.lang.CharSequence charSequence) {
        return (org.threeten.bp.Instant) org.threeten.bp.format.DateTimeFormatter.ISO_INSTANT.parse(charSequence, FROM);
    }

    private static org.threeten.bp.Instant getHighResolutionOutputSizeshNQ4ISI(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new org.threeten.bp.DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new org.threeten.bp.Instant(j, i);
    }

    private Instant(long j, int i) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS || temporalField == org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND || temporalField == org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND || temporalField == org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final boolean isSupported(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit ? temporalUnit.isTimeBased() || temporalUnit == org.threeten.bp.temporal.ChronoUnit.DAYS : temporalUnit != null && temporalUnit.isSupportedBy(this);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        return super.range(temporalField);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i = org.threeten.bp.Instant.AnonymousClass2.getHighSpeedVideoSizes[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (i == 2) {
                return this.getHighResolutionOutputSizeshNQ4ISI / 1000;
            }
            if (i == 3) {
                return this.getHighResolutionOutputSizeshNQ4ISI / 1000000;
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return range(temporalField).checkValidIntValue(temporalField.getFrom(this), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        int i;
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            int i2 = org.threeten.bp.Instant.AnonymousClass2.getHighSpeedVideoSizes[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()];
            if (i2 == 1) {
                i = this.getHighResolutionOutputSizeshNQ4ISI;
            } else if (i2 == 2) {
                i = this.getHighResolutionOutputSizeshNQ4ISI / 1000;
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        return this.Camera2StreamConfigurationMap;
                    }
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
                }
                i = this.getHighResolutionOutputSizeshNQ4ISI / 1000000;
            }
            return i;
        }
        return temporalField.getFrom(this);
    }

    public final long getEpochSecond() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getNano() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Instant with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return (org.threeten.bp.Instant) temporalAdjuster.adjustInto(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Instant with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = org.threeten.bp.Instant.AnonymousClass2.getHighSpeedVideoSizes[chronoField.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    int i2 = ((int) j) * 1000;
                    if (i2 != this.getHighResolutionOutputSizeshNQ4ISI) {
                        return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, i2);
                    }
                } else if (i == 3) {
                    int i3 = ((int) j) * 1000000;
                    if (i3 != this.getHighResolutionOutputSizeshNQ4ISI) {
                        return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, i3);
                    }
                } else {
                    if (i != 4) {
                        throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
                    }
                    if (j != this.Camera2StreamConfigurationMap) {
                        return getHighResolutionOutputSizeshNQ4ISI(j, this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
            } else if (j != this.getHighResolutionOutputSizeshNQ4ISI) {
                return getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, (int) j);
            }
            return this;
        }
        return (org.threeten.bp.Instant) temporalField.adjustInto(this, j);
    }

    public final org.threeten.bp.Instant truncatedTo(org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit == org.threeten.bp.temporal.ChronoUnit.NANOS) {
            return this;
        }
        org.threeten.bp.Duration duration = temporalUnit.getDuration();
        if (duration.getSeconds() > 86400) {
            throw new org.threeten.bp.DateTimeException("Unit is too large to be used for truncation");
        }
        long nanos = duration.toNanos();
        if (kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_DAY % nanos != 0) {
            throw new org.threeten.bp.DateTimeException("Unit must divide into a standard day without remainder");
        }
        long j = ((this.Camera2StreamConfigurationMap % 86400) * 1000000000) + this.getHighResolutionOutputSizeshNQ4ISI;
        return plusNanos((org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j, nanos) * nanos) - j);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Instant plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.Instant) temporalAmount.addTo(this);
    }

    /* renamed from: org.threeten.bp.Instant$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoUnit.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoUnit.NANOS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.MICROS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoUnit.DAYS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoSizes[org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Instant plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        if (temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit) {
            switch (org.threeten.bp.Instant.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plusNanos(j);
                case 2:
                    return Camera2StreamConfigurationMap(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return plusMillis(j);
                case 4:
                    return plusSeconds(j);
                case 5:
                    return plusSeconds(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 60));
                case 6:
                    return plusSeconds(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 3600));
                case 7:
                    return plusSeconds(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 43200));
                case 8:
                    return plusSeconds(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY));
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
            }
        }
        return (org.threeten.bp.Instant) temporalUnit.addTo(this, j);
    }

    public final org.threeten.bp.Instant plusSeconds(long j) {
        return Camera2StreamConfigurationMap(j, 0L);
    }

    public final org.threeten.bp.Instant plusMillis(long j) {
        return Camera2StreamConfigurationMap(j / 1000, (j % 1000) * 1000000);
    }

    public final org.threeten.bp.Instant plusNanos(long j) {
        return Camera2StreamConfigurationMap(0L, j);
    }

    private org.threeten.bp.Instant Camera2StreamConfigurationMap(long j, long j2) {
        return (j | j2) == 0 ? this : ofEpochSecond(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.Camera2StreamConfigurationMap, j), j2 / 1000000000), this.getHighResolutionOutputSizeshNQ4ISI + (j2 % 1000000000));
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Instant minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.Instant) temporalAmount.subtractFrom(this);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.Instant minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    public final org.threeten.bp.Instant minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            return plusSeconds(Long.MAX_VALUE).plusSeconds(1L);
        }
        return plusSeconds(-j);
    }

    public final org.threeten.bp.Instant minusMillis(long j) {
        if (j == Long.MIN_VALUE) {
            return plusMillis(Long.MAX_VALUE).plusMillis(1L);
        }
        return plusMillis(-j);
    }

    public final org.threeten.bp.Instant minusNanos(long j) {
        if (j == Long.MIN_VALUE) {
            return plusNanos(Long.MAX_VALUE).plusNanos(1L);
        }
        return plusNanos(-j);
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision()) {
            return (R) org.threeten.bp.temporal.ChronoUnit.NANOS;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS, this.Camera2StreamConfigurationMap).with(org.threeten.bp.temporal.ChronoField.NANO_OF_SECOND, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.temporal.Temporal
    public final long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        org.threeten.bp.Instant from = from(temporal);
        if (!(temporalUnit instanceof org.threeten.bp.temporal.ChronoUnit)) {
            return temporalUnit.between(this, from);
        }
        switch (org.threeten.bp.Instant.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI[((org.threeten.bp.temporal.ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(from.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap), 1000000000), from.getHighResolutionOutputSizeshNQ4ISI - this.getHighResolutionOutputSizeshNQ4ISI);
            case 2:
                return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(from.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap), 1000000000), from.getHighResolutionOutputSizeshNQ4ISI - this.getHighResolutionOutputSizeshNQ4ISI) / 1000;
            case 3:
                return org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(from.toEpochMilli(), toEpochMilli());
            case 4:
                return Camera2StreamConfigurationMap(from);
            case 5:
                return Camera2StreamConfigurationMap(from) / 60;
            case 6:
                return Camera2StreamConfigurationMap(from) / 3600;
            case 7:
                return Camera2StreamConfigurationMap(from) / 43200;
            case 8:
                return Camera2StreamConfigurationMap(from) / 86400;
            default:
                throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported unit: ".concat(java.lang.String.valueOf(temporalUnit)));
        }
    }

    private long Camera2StreamConfigurationMap(org.threeten.bp.Instant instant) {
        long safeSubtract = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(instant.Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap);
        long j = instant.getHighResolutionOutputSizeshNQ4ISI - this.getHighResolutionOutputSizeshNQ4ISI;
        return (safeSubtract <= 0 || j >= 0) ? (safeSubtract >= 0 || j <= 0) ? safeSubtract : safeSubtract + 1 : safeSubtract - 1;
    }

    public final org.threeten.bp.OffsetDateTime atOffset(org.threeten.bp.ZoneOffset zoneOffset) {
        return org.threeten.bp.OffsetDateTime.ofInstant(this, zoneOffset);
    }

    public final org.threeten.bp.ZonedDateTime atZone(org.threeten.bp.ZoneId zoneId) {
        return org.threeten.bp.ZonedDateTime.ofInstant(this, zoneId);
    }

    public final long toEpochMilli() {
        long j = this.Camera2StreamConfigurationMap;
        if (j >= 0) {
            return org.threeten.bp.jdk8.Jdk8Methods.safeAdd(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j, 1000L), this.getHighResolutionOutputSizeshNQ4ISI / 1000000);
        }
        return org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(org.threeten.bp.jdk8.Jdk8Methods.safeMultiply(j + 1, 1000L), 1000 - (this.getHighResolutionOutputSizeshNQ4ISI / 1000000));
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.Instant instant) {
        int compareLongs = org.threeten.bp.jdk8.Jdk8Methods.compareLongs(this.Camera2StreamConfigurationMap, instant.Camera2StreamConfigurationMap);
        return compareLongs != 0 ? compareLongs : this.getHighResolutionOutputSizeshNQ4ISI - instant.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isAfter(org.threeten.bp.Instant instant) {
        return compareTo(instant) > 0;
    }

    public final boolean isBefore(org.threeten.bp.Instant instant) {
        return compareTo(instant) < 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.Instant)) {
            return false;
        }
        org.threeten.bp.Instant instant = (org.threeten.bp.Instant) obj;
        return this.Camera2StreamConfigurationMap == instant.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI == instant.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        long j = this.Camera2StreamConfigurationMap;
        return ((int) (j ^ (j >>> 32))) + (this.getHighResolutionOutputSizeshNQ4ISI * 51);
    }

    public final java.lang.String toString() {
        return org.threeten.bp.format.DateTimeFormatter.ISO_INSTANT.format(this);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 2, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    static org.threeten.bp.Instant getHighResolutionOutputSizeshNQ4ISI(java.io.DataInput dataInput) throws java.io.IOException {
        return ofEpochSecond(dataInput.readLong(), dataInput.readInt());
    }
}
