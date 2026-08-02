package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class FieldInfo implements java.lang.Comparable<androidx.content.preferences.protobuf.FieldInfo> {
    final androidx.datastore.preferences.protobuf.Internal.EnumVerifier Camera2StreamConfigurationMap;
    final java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final java.lang.reflect.Field getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final androidx.content.preferences.protobuf.OneofInfo getHighSpeedVideoSizesFor;
    final java.lang.Class<?> getInputFormats;
    final java.lang.Object getInputSizeshNQ4ISI;
    final java.lang.reflect.Field getOutputFormats;
    final java.lang.Class<?> getOutputMinFrameDuration = null;
    final int getOutputSizes;
    final androidx.content.preferences.protobuf.FieldType getOutputSizeshNQ4ISI;
    final boolean getOutputStallDurationlomOqCM;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(androidx.content.preferences.protobuf.FieldInfo fieldInfo) {
        return this.getHighSpeedVideoFpsRanges - fieldInfo.getHighSpeedVideoFpsRanges;
    }

    public static androidx.content.preferences.protobuf.FieldInfo getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Field field, int i, androidx.content.preferences.protobuf.FieldType fieldType, boolean z) {
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "field");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(fieldType, "fieldType");
            if (fieldType == androidx.content.preferences.protobuf.FieldType.MESSAGE_LIST || fieldType == androidx.content.preferences.protobuf.FieldType.GROUP_LIST) {
                throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
            }
            return new androidx.content.preferences.protobuf.FieldInfo(field, i, fieldType, null, 0, false, z, null, null, null, null, null);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    public static androidx.content.preferences.protobuf.FieldInfo getHighSpeedVideoSizes(java.lang.reflect.Field field, int i, androidx.content.preferences.protobuf.FieldType fieldType, java.lang.reflect.Field field2) {
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "field");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(fieldType, "fieldType");
            if (fieldType == androidx.content.preferences.protobuf.FieldType.MESSAGE_LIST || fieldType == androidx.content.preferences.protobuf.FieldType.GROUP_LIST) {
                throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
            }
            return new androidx.content.preferences.protobuf.FieldInfo(field, i, fieldType, null, 0, false, false, null, null, null, null, field2);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    public static androidx.content.preferences.protobuf.FieldInfo getHighSpeedVideoFpsRanges(java.lang.reflect.Field field, int i, androidx.content.preferences.protobuf.FieldType fieldType, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "field");
            return new androidx.content.preferences.protobuf.FieldInfo(field, i, fieldType, null, 0, false, false, null, null, null, enumVerifier, null);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    public static androidx.content.preferences.protobuf.FieldInfo Camera2StreamConfigurationMap(java.lang.reflect.Field field, int i, androidx.content.preferences.protobuf.FieldType fieldType, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "field");
            return new androidx.content.preferences.protobuf.FieldInfo(field, i, fieldType, null, 0, false, false, null, null, null, enumVerifier, field2);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    public static androidx.content.preferences.protobuf.FieldInfo getHighSpeedVideoFpsRanges(java.lang.reflect.Field field, int i, androidx.content.preferences.protobuf.FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "field");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(fieldType, "fieldType");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field2, "presenceField");
            if (field2 != null && (i2 == 0 || (i2 & (i2 - 1)) != 0)) {
                throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: ".concat(java.lang.String.valueOf(i2)));
            }
            return new androidx.content.preferences.protobuf.FieldInfo(field, i, fieldType, field2, i2, false, z, null, null, null, enumVerifier, null);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    public static androidx.content.preferences.protobuf.FieldInfo Camera2StreamConfigurationMap(int i, androidx.content.preferences.protobuf.FieldType fieldType, androidx.content.preferences.protobuf.OneofInfo oneofInfo, java.lang.Class<?> cls, boolean z, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(fieldType, "fieldType");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(oneofInfo, "oneof");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(cls, "oneofStoredType");
            if (!fieldType.isScalar()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Oneof is only supported for scalar fields. Field ");
                sb.append(i);
                sb.append(" is of type ");
                sb.append(fieldType);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            return new androidx.content.preferences.protobuf.FieldInfo(null, i, fieldType, null, 0, false, z, oneofInfo, cls, null, enumVerifier, null);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    public static androidx.content.preferences.protobuf.FieldInfo Camera2StreamConfigurationMap(java.lang.reflect.Field field, int i, androidx.content.preferences.protobuf.FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "field");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(fieldType, "fieldType");
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field2, "presenceField");
            if (field2 != null && (i2 == 0 || (i2 & (i2 - 1)) != 0)) {
                throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: ".concat(java.lang.String.valueOf(i2)));
            }
            return new androidx.content.preferences.protobuf.FieldInfo(field, i, fieldType, field2, i2, true, z, null, null, null, enumVerifier, null);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    public static androidx.content.preferences.protobuf.FieldInfo Camera2StreamConfigurationMap(java.lang.reflect.Field field, int i, java.lang.Object obj, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
        androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(obj, "mapDefaultEntry");
        if (i > 0) {
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "field");
            return new androidx.content.preferences.protobuf.FieldInfo(field, i, androidx.content.preferences.protobuf.FieldType.MAP, null, 0, false, true, null, null, obj, enumVerifier, null);
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: ".concat(java.lang.String.valueOf(i)));
    }

    private FieldInfo(java.lang.reflect.Field field, int i, androidx.content.preferences.protobuf.FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, androidx.content.preferences.protobuf.OneofInfo oneofInfo, java.lang.Class<?> cls, java.lang.Object obj, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.getHighSpeedVideoFpsRangesFor = field;
        this.getOutputSizeshNQ4ISI = fieldType;
        this.getHighSpeedVideoFpsRanges = i;
        this.getOutputFormats = field2;
        this.getOutputSizes = i2;
        this.getOutputStallDurationlomOqCM = z;
        this.getHighSpeedVideoSizes = z2;
        this.getHighSpeedVideoSizesFor = oneofInfo;
        this.getInputFormats = cls;
        this.getInputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap = enumVerifier;
        this.getHighResolutionOutputSizeshNQ4ISI = field3;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.FieldInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.content.preferences.protobuf.FieldType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.content.preferences.protobuf.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.content.preferences.protobuf.FieldType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.content.preferences.protobuf.FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.content.preferences.protobuf.FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class Builder {
        private androidx.datastore.preferences.protobuf.Internal.EnumVerifier Camera2StreamConfigurationMap;
        private java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private java.lang.reflect.Field getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private androidx.content.preferences.protobuf.OneofInfo getHighSpeedVideoSizesFor;
        private java.lang.reflect.Field getInputFormats;
        private int getInputSizeshNQ4ISI;
        private java.lang.Object getOutputFormats;
        private java.lang.Class<?> getOutputMinFrameDuration;
        private androidx.content.preferences.protobuf.FieldType getOutputSizes;
        private boolean getOutputSizeshNQ4ISI;

        private Builder() {
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withField(java.lang.reflect.Field field) {
            if (this.getHighSpeedVideoSizesFor != null) {
                throw new java.lang.IllegalStateException("Cannot set field when building a oneof.");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = field;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withType(androidx.content.preferences.protobuf.FieldType fieldType) {
            this.getOutputSizes = fieldType;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withFieldNumber(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withPresence(java.lang.reflect.Field field, int i) {
            this.getInputFormats = (java.lang.reflect.Field) androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(field, "presenceField");
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withOneof(androidx.content.preferences.protobuf.OneofInfo oneofInfo, java.lang.Class<?> cls) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null || this.getInputFormats != null) {
                throw new java.lang.IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.getHighSpeedVideoSizesFor = oneofInfo;
            this.getOutputMinFrameDuration = cls;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withRequired(boolean z) {
            this.getOutputSizeshNQ4ISI = z;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withMapDefaultEntry(java.lang.Object obj) {
            this.getOutputFormats = obj;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withEnforceUtf8(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withEnumVerifier(androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier) {
            this.Camera2StreamConfigurationMap = enumVerifier;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.FieldInfo.Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.getHighSpeedVideoFpsRangesFor = field;
            return this;
        }

        public final androidx.content.preferences.protobuf.FieldInfo build() {
            androidx.content.preferences.protobuf.OneofInfo oneofInfo = this.getHighSpeedVideoSizesFor;
            if (oneofInfo != null) {
                return androidx.content.preferences.protobuf.FieldInfo.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.getOutputSizes, oneofInfo, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            }
            java.lang.Object obj = this.getOutputFormats;
            if (obj != null) {
                return androidx.content.preferences.protobuf.FieldInfo.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, obj, this.Camera2StreamConfigurationMap);
            }
            java.lang.reflect.Field field = this.getInputFormats;
            if (field != null) {
                if (this.getOutputSizeshNQ4ISI) {
                    return androidx.content.preferences.protobuf.FieldInfo.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputSizes, field, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
                }
                return androidx.content.preferences.protobuf.FieldInfo.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputSizes, field, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            }
            androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier = this.Camera2StreamConfigurationMap;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.getHighSpeedVideoFpsRangesFor;
                if (field2 == null) {
                    return androidx.content.preferences.protobuf.FieldInfo.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputSizes, enumVerifier);
                }
                return androidx.content.preferences.protobuf.FieldInfo.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputSizes, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.getHighSpeedVideoFpsRangesFor;
            if (field3 == null) {
                return androidx.content.preferences.protobuf.FieldInfo.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputSizes, this.getHighSpeedVideoFpsRanges);
            }
            return androidx.content.preferences.protobuf.FieldInfo.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputSizes, field3);
        }
    }
}
