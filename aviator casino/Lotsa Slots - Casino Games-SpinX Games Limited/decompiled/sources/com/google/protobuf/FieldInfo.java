package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class FieldInfo implements java.lang.Comparable<com.google.protobuf.FieldInfo> {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final com.google.protobuf.Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final java.lang.Object mapDefaultEntry;
    private final java.lang.Class<?> messageClass;
    private final com.google.protobuf.OneofInfo oneof;
    private final java.lang.Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final com.google.protobuf.FieldType type;

    private static boolean isExactlyOneBitSet(int value) {
        return value != 0 && (value & (value + (-1))) == 0;
    }

    public static com.google.protobuf.FieldInfo forField(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType fieldType, boolean enforceUtf8) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == com.google.protobuf.FieldType.MESSAGE_LIST || fieldType == com.google.protobuf.FieldType.GROUP_LIST) {
            throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new com.google.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, null, null, null, null, null);
    }

    public static com.google.protobuf.FieldInfo forPackedField(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType fieldType, java.lang.reflect.Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == com.google.protobuf.FieldType.MESSAGE_LIST || fieldType == com.google.protobuf.FieldType.GROUP_LIST) {
            throw new java.lang.IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new com.google.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, null, cachedSizeField);
    }

    public static com.google.protobuf.FieldInfo forRepeatedMessageField(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType fieldType, java.lang.Class<?> messageClass) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(messageClass, "messageClass");
        return new com.google.protobuf.FieldInfo(field, fieldNumber, fieldType, messageClass, null, 0, false, false, null, null, null, null, null);
    }

    public static com.google.protobuf.FieldInfo forFieldWithEnumVerifier(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType fieldType, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        return new com.google.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static com.google.protobuf.FieldInfo forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType fieldType, com.google.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field cachedSizeField) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        return new com.google.protobuf.FieldInfo(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, cachedSizeField);
    }

    public static com.google.protobuf.FieldInfo forExplicitPresenceField(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType fieldType, java.lang.reflect.Field presenceField, int presenceMask, boolean enforceUtf8, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(presenceField, "presenceField");
        if (presenceField != null && !isExactlyOneBitSet(presenceMask)) {
            throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
        }
        return new com.google.protobuf.FieldInfo(field, fieldNumber, fieldType, null, presenceField, presenceMask, false, enforceUtf8, null, null, null, enumVerifier, null);
    }

    public static com.google.protobuf.FieldInfo forOneofMemberField(int fieldNumber, com.google.protobuf.FieldType fieldType, com.google.protobuf.OneofInfo oneof, java.lang.Class<?> oneofStoredType, boolean enforceUtf8, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(oneof, "oneof");
        com.google.protobuf.Internal.checkNotNull(oneofStoredType, "oneofStoredType");
        if (!fieldType.isScalar()) {
            throw new java.lang.IllegalArgumentException("Oneof is only supported for scalar fields. Field " + fieldNumber + " is of type " + fieldType);
        }
        return new com.google.protobuf.FieldInfo(null, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, oneof, oneofStoredType, null, enumVerifier, null);
    }

    private static void checkFieldNumber(int fieldNumber) {
        if (fieldNumber > 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException("fieldNumber must be positive: " + fieldNumber);
    }

    public static com.google.protobuf.FieldInfo forLegacyRequiredField(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType fieldType, java.lang.reflect.Field presenceField, int presenceMask, boolean enforceUtf8, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        com.google.protobuf.Internal.checkNotNull(fieldType, "fieldType");
        com.google.protobuf.Internal.checkNotNull(presenceField, "presenceField");
        if (presenceField != null && !isExactlyOneBitSet(presenceMask)) {
            throw new java.lang.IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
        }
        return new com.google.protobuf.FieldInfo(field, fieldNumber, fieldType, null, presenceField, presenceMask, true, enforceUtf8, null, null, null, enumVerifier, null);
    }

    public static com.google.protobuf.FieldInfo forMapField(java.lang.reflect.Field field, int fieldNumber, java.lang.Object mapDefaultEntry, com.google.protobuf.Internal.EnumVerifier enumVerifier) {
        com.google.protobuf.Internal.checkNotNull(mapDefaultEntry, "mapDefaultEntry");
        checkFieldNumber(fieldNumber);
        com.google.protobuf.Internal.checkNotNull(field, "field");
        return new com.google.protobuf.FieldInfo(field, fieldNumber, com.google.protobuf.FieldType.MAP, null, null, 0, false, true, null, null, mapDefaultEntry, enumVerifier, null);
    }

    private FieldInfo(java.lang.reflect.Field field, int fieldNumber, com.google.protobuf.FieldType type, java.lang.Class<?> messageClass, java.lang.reflect.Field presenceField, int presenceMask, boolean required, boolean enforceUtf8, com.google.protobuf.OneofInfo oneof, java.lang.Class<?> oneofStoredType, java.lang.Object mapDefaultEntry, com.google.protobuf.Internal.EnumVerifier enumVerifier, java.lang.reflect.Field cachedSizeField) {
        this.field = field;
        this.type = type;
        this.messageClass = messageClass;
        this.fieldNumber = fieldNumber;
        this.presenceField = presenceField;
        this.presenceMask = presenceMask;
        this.required = required;
        this.enforceUtf8 = enforceUtf8;
        this.oneof = oneof;
        this.oneofStoredType = oneofStoredType;
        this.mapDefaultEntry = mapDefaultEntry;
        this.enumVerifier = enumVerifier;
        this.cachedSizeField = cachedSizeField;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public com.google.protobuf.FieldType getType() {
        return this.type;
    }

    public com.google.protobuf.OneofInfo getOneof() {
        return this.oneof;
    }

    public java.lang.Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public com.google.protobuf.Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.protobuf.FieldInfo o) {
        return this.fieldNumber - o.fieldNumber;
    }

    public java.lang.Class<?> getListElementType() {
        return this.messageClass;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public java.lang.Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public boolean isRequired() {
        return this.required;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    /* renamed from: com.google.protobuf.FieldInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

        static {
            int[] iArr = new int[com.google.protobuf.FieldType.values().length];
            $SwitchMap$com$google$protobuf$FieldType = iArr;
            try {
                iArr[com.google.protobuf.FieldType.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[com.google.protobuf.FieldType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[com.google.protobuf.FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$FieldType[com.google.protobuf.FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public java.lang.Class<?> getMessageFieldClass() {
        int i = com.google.protobuf.FieldInfo.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i == 3 || i == 4) {
            return this.messageClass;
        }
        return null;
    }

    public static com.google.protobuf.FieldInfo.Builder newBuilder() {
        return new com.google.protobuf.FieldInfo.Builder(null);
    }

    public static final class Builder {
        private java.lang.reflect.Field cachedSizeField;
        private boolean enforceUtf8;
        private com.google.protobuf.Internal.EnumVerifier enumVerifier;
        private java.lang.reflect.Field field;
        private int fieldNumber;
        private java.lang.Object mapDefaultEntry;
        private com.google.protobuf.OneofInfo oneof;
        private java.lang.Class<?> oneofStoredType;
        private java.lang.reflect.Field presenceField;
        private int presenceMask;
        private boolean required;
        private com.google.protobuf.FieldType type;

        /* synthetic */ Builder(com.google.protobuf.FieldInfo.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
        }

        public com.google.protobuf.FieldInfo.Builder withField(java.lang.reflect.Field field) {
            if (this.oneof != null) {
                throw new java.lang.IllegalStateException("Cannot set field when building a oneof.");
            }
            this.field = field;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withType(com.google.protobuf.FieldType type) {
            this.type = type;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withFieldNumber(int fieldNumber) {
            this.fieldNumber = fieldNumber;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withPresence(java.lang.reflect.Field presenceField, int presenceMask) {
            this.presenceField = (java.lang.reflect.Field) com.google.protobuf.Internal.checkNotNull(presenceField, "presenceField");
            this.presenceMask = presenceMask;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withOneof(com.google.protobuf.OneofInfo oneof, java.lang.Class<?> oneofStoredType) {
            if (this.field != null || this.presenceField != null) {
                throw new java.lang.IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.oneof = oneof;
            this.oneofStoredType = oneofStoredType;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withRequired(boolean required) {
            this.required = required;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withMapDefaultEntry(java.lang.Object mapDefaultEntry) {
            this.mapDefaultEntry = mapDefaultEntry;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withEnforceUtf8(boolean enforceUtf8) {
            this.enforceUtf8 = enforceUtf8;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withEnumVerifier(com.google.protobuf.Internal.EnumVerifier enumVerifier) {
            this.enumVerifier = enumVerifier;
            return this;
        }

        public com.google.protobuf.FieldInfo.Builder withCachedSizeField(java.lang.reflect.Field cachedSizeField) {
            this.cachedSizeField = cachedSizeField;
            return this;
        }

        public com.google.protobuf.FieldInfo build() {
            com.google.protobuf.OneofInfo oneofInfo = this.oneof;
            if (oneofInfo != null) {
                return com.google.protobuf.FieldInfo.forOneofMemberField(this.fieldNumber, this.type, oneofInfo, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
            }
            java.lang.Object obj = this.mapDefaultEntry;
            if (obj != null) {
                return com.google.protobuf.FieldInfo.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
            }
            java.lang.reflect.Field field = this.presenceField;
            if (field != null) {
                if (this.required) {
                    return com.google.protobuf.FieldInfo.forLegacyRequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
                }
                return com.google.protobuf.FieldInfo.forExplicitPresenceField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            com.google.protobuf.Internal.EnumVerifier enumVerifier = this.enumVerifier;
            if (enumVerifier != null) {
                java.lang.reflect.Field field2 = this.cachedSizeField;
                if (field2 == null) {
                    return com.google.protobuf.FieldInfo.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier);
                }
                return com.google.protobuf.FieldInfo.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier, field2);
            }
            java.lang.reflect.Field field3 = this.cachedSizeField;
            if (field3 == null) {
                return com.google.protobuf.FieldInfo.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
            }
            return com.google.protobuf.FieldInfo.forPackedField(this.field, this.fieldNumber, this.type, field3);
        }
    }
}
