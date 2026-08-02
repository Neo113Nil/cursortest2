package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes9.dex */
public final class Value extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite<com.google.crypto.tink.shaded.protobuf.Value, com.google.crypto.tink.shaded.protobuf.Value.Builder> implements com.google.crypto.tink.shaded.protobuf.ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final com.google.crypto.tink.shaded.protobuf.Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Value> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private java.lang.Object kind_;

    private Value() {
    }

    public enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int value;

        KindCase(int i) {
            this.value = i;
        }

        @java.lang.Deprecated
        public static com.google.crypto.tink.shaded.protobuf.Value.KindCase valueOf(int i) {
            return forNumber(i);
        }

        public static com.google.crypto.tink.shaded.protobuf.Value.KindCase forNumber(int i) {
            switch (i) {
                case 0:
                    return KIND_NOT_SET;
                case 1:
                    return NULL_VALUE;
                case 2:
                    return NUMBER_VALUE;
                case 3:
                    return STRING_VALUE;
                case 4:
                    return BOOL_VALUE;
                case 5:
                    return STRUCT_VALUE;
                case 6:
                    return LIST_VALUE;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.Value.KindCase getKindCase() {
        return com.google.crypto.tink.shaded.protobuf.Value.KindCase.forNumber(this.kindCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((java.lang.Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.NullValue getNullValue() {
        if (this.kindCase_ == 1) {
            com.google.crypto.tink.shaded.protobuf.NullValue forNumber = com.google.crypto.tink.shaded.protobuf.NullValue.forNumber(((java.lang.Integer) this.kind_).intValue());
            return forNumber == null ? com.google.crypto.tink.shaded.protobuf.NullValue.UNRECOGNIZED : forNumber;
        }
        return com.google.crypto.tink.shaded.protobuf.NullValue.NULL_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = java.lang.Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(com.google.crypto.tink.shaded.protobuf.NullValue nullValue) {
        this.kind_ = java.lang.Integer.valueOf(nullValue.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((java.lang.Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = java.lang.Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final java.lang.String getStringValue() {
        if (this.kindCase_ == 3) {
            return (java.lang.String) this.kind_;
        }
        return "";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ByteString getStringValueBytes() {
        java.lang.String str;
        if (this.kindCase_ != 3) {
            str = "";
        } else {
            str = (java.lang.String) this.kind_;
        }
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(java.lang.String str) {
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        this.kind_ = byteString.toStringUtf8();
        this.kindCase_ = 3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((java.lang.Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = java.lang.Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (com.google.crypto.tink.shaded.protobuf.Struct) this.kind_;
        }
        return com.google.crypto.tink.shaded.protobuf.Struct.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(com.google.crypto.tink.shaded.protobuf.Struct struct) {
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(com.google.crypto.tink.shaded.protobuf.Struct struct) {
        if (this.kindCase_ == 5 && this.kind_ != com.google.crypto.tink.shaded.protobuf.Struct.getDefaultInstance()) {
            this.kind_ = com.google.crypto.tink.shaded.protobuf.Struct.newBuilder((com.google.crypto.tink.shaded.protobuf.Struct) this.kind_).mergeFrom((com.google.crypto.tink.shaded.protobuf.Struct.Builder) struct).buildPartial();
        } else {
            this.kind_ = struct;
        }
        this.kindCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
    public final com.google.crypto.tink.shaded.protobuf.ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (com.google.crypto.tink.shaded.protobuf.ListValue) this.kind_;
        }
        return com.google.crypto.tink.shaded.protobuf.ListValue.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(com.google.crypto.tink.shaded.protobuf.ListValue listValue) {
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(com.google.crypto.tink.shaded.protobuf.ListValue listValue) {
        if (this.kindCase_ == 6 && this.kind_ != com.google.crypto.tink.shaded.protobuf.ListValue.getDefaultInstance()) {
            this.kind_ = com.google.crypto.tink.shaded.protobuf.ListValue.newBuilder((com.google.crypto.tink.shaded.protobuf.ListValue) this.kind_).mergeFrom((com.google.crypto.tink.shaded.protobuf.ListValue.Builder) listValue).buildPartial();
        } else {
            this.kind_ = listValue;
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.nio.ByteBuffer byteBuffer, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.ByteString byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(byte[] bArr) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(byte[] bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseDelimitedFrom(java.io.InputStream inputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value parseFrom(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (com.google.crypto.tink.shaded.protobuf.Value) com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.google.crypto.tink.shaded.protobuf.Value.Builder newBuilder(com.google.crypto.tink.shaded.protobuf.Value value) {
        return DEFAULT_INSTANCE.createBuilder(value);
    }

    public static final class Builder extends com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder<com.google.crypto.tink.shaded.protobuf.Value, com.google.crypto.tink.shaded.protobuf.Value.Builder> implements com.google.crypto.tink.shaded.protobuf.ValueOrBuilder {
        /* synthetic */ Builder(com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(com.google.crypto.tink.shaded.protobuf.Value.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Value.KindCase getKindCase() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getKindCase();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder clearKind() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).clearKind();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final boolean hasNullValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).hasNullValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final int getNullValueValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getNullValueValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setNullValueValue(int i) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setNullValueValue(i);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.NullValue getNullValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getNullValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setNullValue(com.google.crypto.tink.shaded.protobuf.NullValue nullValue) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setNullValue(nullValue);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder clearNullValue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).clearNullValue();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final boolean hasNumberValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).hasNumberValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final double getNumberValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getNumberValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setNumberValue(double d) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setNumberValue(d);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder clearNumberValue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).clearNumberValue();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final boolean hasStringValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).hasStringValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final java.lang.String getStringValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getStringValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ByteString getStringValueBytes() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getStringValueBytes();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setStringValue(java.lang.String str) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setStringValue(str);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder clearStringValue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).clearStringValue();
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setStringValueBytes(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setStringValueBytes(byteString);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final boolean hasBoolValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).hasBoolValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final boolean getBoolValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getBoolValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setBoolValue(boolean z) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setBoolValue(z);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder clearBoolValue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).clearBoolValue();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final boolean hasStructValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).hasStructValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.Struct getStructValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getStructValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setStructValue(com.google.crypto.tink.shaded.protobuf.Struct struct) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setStructValue(struct);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setStructValue(com.google.crypto.tink.shaded.protobuf.Struct.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setStructValue(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder mergeStructValue(com.google.crypto.tink.shaded.protobuf.Struct struct) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).mergeStructValue(struct);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder clearStructValue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).clearStructValue();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final boolean hasListValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).hasListValue();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ValueOrBuilder
        public final com.google.crypto.tink.shaded.protobuf.ListValue getListValue() {
            return ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).getListValue();
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setListValue(com.google.crypto.tink.shaded.protobuf.ListValue listValue) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setListValue(listValue);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder setListValue(com.google.crypto.tink.shaded.protobuf.ListValue.Builder builder) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).setListValue(builder.build());
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder mergeListValue(com.google.crypto.tink.shaded.protobuf.ListValue listValue) {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).mergeListValue(listValue);
            return this;
        }

        public final com.google.crypto.tink.shaded.protobuf.Value.Builder clearListValue() {
            copyOnWrite();
            ((com.google.crypto.tink.shaded.protobuf.Value) this.instance).clearListValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.Value$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.Parser parser;
        com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1 anonymousClass1 = null;
        switch (com.google.crypto.tink.shaded.protobuf.Value.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new com.google.crypto.tink.shaded.protobuf.Value();
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.Value.Builder(anonymousClass1);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"kind_", "kindCase_", com.google.crypto.tink.shaded.protobuf.Struct.class, com.google.crypto.tink.shaded.protobuf.ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Value> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.google.crypto.tink.shaded.protobuf.Value.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    static {
        com.google.crypto.tink.shaded.protobuf.Value value = new com.google.crypto.tink.shaded.protobuf.Value();
        DEFAULT_INSTANCE = value;
        com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.registerDefaultInstance(com.google.crypto.tink.shaded.protobuf.Value.class, value);
    }

    public static com.google.crypto.tink.shaded.protobuf.Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.crypto.tink.shaded.protobuf.Parser<com.google.crypto.tink.shaded.protobuf.Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
