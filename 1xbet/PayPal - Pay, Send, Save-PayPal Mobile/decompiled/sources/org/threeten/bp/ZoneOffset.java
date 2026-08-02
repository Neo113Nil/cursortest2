package org.threeten.bp;

/* loaded from: classes18.dex */
public final class ZoneOffset extends org.threeten.bp.ZoneId implements org.threeten.bp.temporal.TemporalAccessor, org.threeten.bp.temporal.TemporalAdjuster, java.lang.Comparable<org.threeten.bp.ZoneOffset>, java.io.Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final transient java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    public static final org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneOffset> FROM = new org.threeten.bp.temporal.TemporalQuery<org.threeten.bp.ZoneOffset>() { // from class: org.threeten.bp.ZoneOffset.1
        @Override // org.threeten.bp.temporal.TemporalQuery
        public /* synthetic */ org.threeten.bp.ZoneOffset queryFrom(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
            return org.threeten.bp.ZoneOffset.from(temporalAccessor);
        }
    };
    private static final java.util.concurrent.ConcurrentMap<java.lang.Integer, org.threeten.bp.ZoneOffset> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);
    private static final java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.ZoneOffset> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 4);
    public static final org.threeten.bp.ZoneOffset UTC = ofTotalSeconds(0);
    public static final org.threeten.bp.ZoneOffset MIN = ofTotalSeconds(-64800);
    public static final org.threeten.bp.ZoneOffset MAX = ofTotalSeconds(64800);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.threeten.bp.ZoneOffset of(java.lang.String str) {
        int Camera2StreamConfigurationMap;
        int i;
        int i2;
        char charAt;
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "offsetId");
        org.threeten.bp.ZoneOffset zoneOffset = getHighSpeedVideoFpsRanges.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str.charAt(0));
            sb.append("0");
            sb.append(str.charAt(1));
            str = sb.toString();
        } else if (length != 3) {
            if (length == 5) {
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, 1, false);
                i = Camera2StreamConfigurationMap(str, 3, false);
            } else if (length == 6) {
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, 1, false);
                i = Camera2StreamConfigurationMap(str, 4, true);
            } else {
                if (length == 7) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, 1, false);
                    i = Camera2StreamConfigurationMap(str, 3, false);
                    i2 = Camera2StreamConfigurationMap(str, 5, false);
                } else if (length == 9) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, 1, false);
                    i = Camera2StreamConfigurationMap(str, 4, true);
                    i2 = Camera2StreamConfigurationMap(str, 7, true);
                } else {
                    throw new org.threeten.bp.DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(java.lang.String.valueOf(str)));
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    throw new org.threeten.bp.DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(java.lang.String.valueOf(str)));
                }
                if (charAt == '-') {
                    return ofHoursMinutesSeconds(-Camera2StreamConfigurationMap, -i, -i2);
                }
                return ofHoursMinutesSeconds(Camera2StreamConfigurationMap, i, i2);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, 1, false);
        i = 0;
        i2 = 0;
        charAt = str.charAt(0);
        if (charAt == '+') {
        }
        if (charAt == '-') {
        }
    }

    private static int Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new org.threeten.bp.DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: ".concat(java.lang.String.valueOf(charSequence)));
        }
        char charAt = charSequence.charAt(i);
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
            throw new org.threeten.bp.DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: ".concat(java.lang.String.valueOf(charSequence)));
        }
        return ((charAt - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charAt2 - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
    }

    public static org.threeten.bp.ZoneOffset ofHours(int i) {
        return ofHoursMinutesSeconds(i, 0, 0);
    }

    public static org.threeten.bp.ZoneOffset ofHoursMinutes(int i, int i2) {
        return ofHoursMinutesSeconds(i, i2, 0);
    }

    public static org.threeten.bp.ZoneOffset from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        org.threeten.bp.ZoneOffset zoneOffset = (org.threeten.bp.ZoneOffset) temporalAccessor.query(org.threeten.bp.temporal.TemporalQueries.offset());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to obtain ZoneOffset from TemporalAccessor: ");
        sb.append(temporalAccessor);
        sb.append(", type ");
        sb.append(temporalAccessor.getClass().getName());
        throw new org.threeten.bp.DateTimeException(sb.toString());
    }

    public static org.threeten.bp.ZoneOffset ofTotalSeconds(int i) {
        if (java.lang.Math.abs(i) > 64800) {
            throw new org.threeten.bp.DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
            java.util.concurrent.ConcurrentMap<java.lang.Integer, org.threeten.bp.ZoneOffset> concurrentMap = getHighSpeedVideoSizes;
            org.threeten.bp.ZoneOffset zoneOffset = concurrentMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(valueOf, new org.threeten.bp.ZoneOffset(i));
            org.threeten.bp.ZoneOffset zoneOffset2 = concurrentMap.get(valueOf);
            getHighSpeedVideoFpsRanges.putIfAbsent(zoneOffset2.getId(), zoneOffset2);
            return zoneOffset2;
        }
        return new org.threeten.bp.ZoneOffset(i);
    }

    private ZoneOffset(int i) {
        java.lang.String obj;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i == 0) {
            obj = "Z";
        } else {
            int abs = java.lang.Math.abs(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? "0" : "");
            sb.append(i2);
            java.lang.String str = io.ktor.sse.ServerSentEventKt.COLON;
            sb.append(i3 < 10 ? ":0" : io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 < 10 ? ":0" : str);
                sb.append(i4);
            }
            obj = sb.toString();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    public final int getTotalSeconds() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.ZoneId
    public final java.lang.String getId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.threeten.bp.ZoneId
    public final org.threeten.bp.zone.ZoneRules getRules() {
        return org.threeten.bp.zone.ZoneRules.of(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final boolean isSupported(org.threeten.bp.temporal.TemporalField temporalField) {
        return temporalField instanceof org.threeten.bp.temporal.ChronoField ? temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.isSupportedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
            return temporalField.range();
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final int get(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return range(temporalField).checkValidIntValue(getLong(temporalField), temporalField);
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            throw new org.threeten.bp.DateTimeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.getFrom(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final <R> R query(org.threeten.bp.temporal.TemporalQuery<R> temporalQuery) {
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.offset() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zone()) {
            return this;
        }
        if (temporalQuery == org.threeten.bp.temporal.TemporalQueries.localDate() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.localTime() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.precision() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.chronology() || temporalQuery == org.threeten.bp.temporal.TemporalQueries.zoneId()) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // org.threeten.bp.temporal.TemporalAdjuster
    public final org.threeten.bp.temporal.Temporal adjustInto(org.threeten.bp.temporal.Temporal temporal) {
        return temporal.with(org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // java.lang.Comparable
    public final int compareTo(org.threeten.bp.ZoneOffset zoneOffset) {
        return zoneOffset.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.ZoneId
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof org.threeten.bp.ZoneOffset) && this.getHighSpeedVideoFpsRangesFor == ((org.threeten.bp.ZoneOffset) obj).getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.ZoneId
    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.ZoneId
    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.Ser((byte) 8, this);
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // org.threeten.bp.ZoneId
    final void getHighSpeedVideoFpsRanges(java.io.DataOutput dataOutput) throws java.io.IOException {
        dataOutput.writeByte(8);
        getHighSpeedVideoFpsRangesFor(dataOutput);
    }

    final void getHighSpeedVideoFpsRangesFor(java.io.DataOutput dataOutput) throws java.io.IOException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    static org.threeten.bp.ZoneOffset getHighSpeedVideoFpsRanges(java.io.DataInput dataInput) throws java.io.IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(readByte * 900);
    }

    public static org.threeten.bp.ZoneOffset ofHoursMinutesSeconds(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Zone offset hours not in valid range: value ");
            sb.append(i);
            sb.append(" is not in the range -18 to 18");
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new org.threeten.bp.DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new org.threeten.bp.DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new org.threeten.bp.DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (java.lang.Math.abs(i2) > 59) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Zone offset minutes not in valid range: abs(value) ");
            sb2.append(java.lang.Math.abs(i2));
            sb2.append(" is not in the range 0 to 59");
            throw new org.threeten.bp.DateTimeException(sb2.toString());
        }
        if (java.lang.Math.abs(i3) > 59) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Zone offset seconds not in valid range: abs(value) ");
            sb3.append(java.lang.Math.abs(i3));
            sb3.append(" is not in the range 0 to 59");
            throw new org.threeten.bp.DateTimeException(sb3.toString());
        }
        if (java.lang.Math.abs(i) != 18 || (java.lang.Math.abs(i2) <= 0 && java.lang.Math.abs(i3) <= 0)) {
            return ofTotalSeconds((i * 3600) + (i2 * 60) + i3);
        }
        throw new org.threeten.bp.DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
    }
}
