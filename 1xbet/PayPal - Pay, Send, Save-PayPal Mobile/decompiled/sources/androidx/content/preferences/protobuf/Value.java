package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Value extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Value, androidx.datastore.preferences.protobuf.Value.Builder> implements androidx.content.preferences.protobuf.ValueOrBuilder {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final androidx.content.preferences.protobuf.Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Value> PARSER = null;
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

        private final int getHighSpeedVideoSizes;

        KindCase(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        @java.lang.Deprecated
        public static androidx.datastore.preferences.protobuf.Value.KindCase valueOf(int i) {
            return forNumber(i);
        }

        public static androidx.datastore.preferences.protobuf.Value.KindCase forNumber(int i) {
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
            return this.getHighSpeedVideoSizes;
        }
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final androidx.datastore.preferences.protobuf.Value.KindCase getKindCase() {
        return androidx.datastore.preferences.protobuf.Value.KindCase.forNumber(this.kindCase_);
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((java.lang.Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final androidx.content.preferences.protobuf.NullValue getNullValue() {
        if (this.kindCase_ == 1) {
            androidx.content.preferences.protobuf.NullValue forNumber = androidx.content.preferences.protobuf.NullValue.forNumber(((java.lang.Integer) this.kind_).intValue());
            return forNumber == null ? androidx.content.preferences.protobuf.NullValue.UNRECOGNIZED : forNumber;
        }
        return androidx.content.preferences.protobuf.NullValue.NULL_VALUE;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((java.lang.Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final java.lang.String getStringValue() {
        if (this.kindCase_ == 3) {
            return (java.lang.String) this.kind_;
        }
        return "";
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getStringValueBytes() {
        java.lang.String str;
        if (this.kindCase_ != 3) {
            str = "";
        } else {
            str = (java.lang.String) this.kind_;
        }
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(str);
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((java.lang.Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final androidx.content.preferences.protobuf.Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (androidx.content.preferences.protobuf.Struct) this.kind_;
        }
        return androidx.content.preferences.protobuf.Struct.getDefaultInstance();
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override // androidx.content.preferences.protobuf.ValueOrBuilder
    public final androidx.content.preferences.protobuf.ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (androidx.content.preferences.protobuf.ListValue) this.kind_;
        }
        return androidx.content.preferences.protobuf.ListValue.getDefaultInstance();
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Value parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Value parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Value) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Value parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Value) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Value.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Value.Builder newBuilder(androidx.content.preferences.protobuf.Value value) {
        return DEFAULT_INSTANCE.createBuilder(value);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Value, androidx.datastore.preferences.protobuf.Value.Builder> implements androidx.content.preferences.protobuf.ValueOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Value.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final androidx.datastore.preferences.protobuf.Value.KindCase getKindCase() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getKindCase();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder clearKind() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Value) this.instance);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final boolean hasNullValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).hasNullValue();
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final int getNullValueValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getNullValueValue();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setNullValueValue(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Value) this.instance, i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final androidx.content.preferences.protobuf.NullValue getNullValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getNullValue();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setNullValue(androidx.content.preferences.protobuf.NullValue nullValue) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Value) this.instance, nullValue);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder clearNullValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Value) this.instance);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final boolean hasNumberValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).hasNumberValue();
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final double getNumberValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getNumberValue();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setNumberValue(double d) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Value) this.instance, d);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder clearNumberValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getInputFormats((androidx.content.preferences.protobuf.Value) this.instance);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final boolean hasStringValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).hasStringValue();
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final java.lang.String getStringValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getStringValue();
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getStringValueBytes() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getStringValueBytes();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setStringValue(java.lang.String str) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Value) this.instance, str);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder clearStringValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getOutputFormats((androidx.content.preferences.protobuf.Value) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setStringValueBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Value) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final boolean hasBoolValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).hasBoolValue();
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final boolean getBoolValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getBoolValue();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setBoolValue(boolean z) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Value) this.instance, z);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder clearBoolValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Value) this.instance);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final boolean hasStructValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).hasStructValue();
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final androidx.content.preferences.protobuf.Struct getStructValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getStructValue();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setStructValue(androidx.content.preferences.protobuf.Struct struct) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Value) this.instance, struct);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setStructValue(androidx.datastore.preferences.protobuf.Struct.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Value) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder mergeStructValue(androidx.content.preferences.protobuf.Struct struct) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Value) this.instance, struct);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder clearStructValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Value) this.instance);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final boolean hasListValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).hasListValue();
        }

        @Override // androidx.content.preferences.protobuf.ValueOrBuilder
        public final androidx.content.preferences.protobuf.ListValue getListValue() {
            return ((androidx.content.preferences.protobuf.Value) this.instance).getListValue();
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setListValue(androidx.content.preferences.protobuf.ListValue listValue) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Value) this.instance, listValue);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder setListValue(androidx.datastore.preferences.protobuf.ListValue.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Value) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder mergeListValue(androidx.content.preferences.protobuf.ListValue listValue) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Value) this.instance, listValue);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Value.Builder clearListValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Value.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Value) this.instance);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Value$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoSizes[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.Value.AnonymousClass1.getHighSpeedVideoSizes[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Value();
            case 2:
                return new androidx.datastore.preferences.protobuf.Value.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new java.lang.Object[]{"kind_", "kindCase_", androidx.content.preferences.protobuf.Struct.class, androidx.content.preferences.protobuf.ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Value> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Value.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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
        androidx.content.preferences.protobuf.Value value = new androidx.content.preferences.protobuf.Value();
        DEFAULT_INSTANCE = value;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Value.class, value);
    }

    public static androidx.content.preferences.protobuf.Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Value value) {
        value.kindCase_ = 0;
        value.kind_ = null;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Value value, boolean z) {
        value.kindCase_ = 4;
        value.kind_ = java.lang.Boolean.valueOf(z);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Value value) {
        if (value.kindCase_ == 4) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Value value, androidx.content.preferences.protobuf.Struct struct) {
        value.kind_ = struct;
        value.kindCase_ = 5;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Value value, androidx.content.preferences.protobuf.Struct struct) {
        if (value.kindCase_ == 5 && value.kind_ != androidx.content.preferences.protobuf.Struct.getDefaultInstance()) {
            value.kind_ = androidx.content.preferences.protobuf.Struct.newBuilder((androidx.content.preferences.protobuf.Struct) value.kind_).mergeFrom((androidx.datastore.preferences.protobuf.Struct.Builder) struct).buildPartial();
        } else {
            value.kind_ = struct;
        }
        value.kindCase_ = 5;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Value value) {
        if (value.kindCase_ == 5) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Value value, androidx.content.preferences.protobuf.ListValue listValue) {
        value.kind_ = listValue;
        value.kindCase_ = 6;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Value value, androidx.content.preferences.protobuf.ListValue listValue) {
        if (value.kindCase_ == 6 && value.kind_ != androidx.content.preferences.protobuf.ListValue.getDefaultInstance()) {
            value.kind_ = androidx.content.preferences.protobuf.ListValue.newBuilder((androidx.content.preferences.protobuf.ListValue) value.kind_).mergeFrom((androidx.datastore.preferences.protobuf.ListValue.Builder) listValue).buildPartial();
        } else {
            value.kind_ = listValue;
        }
        value.kindCase_ = 6;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Value value) {
        if (value.kindCase_ == 6) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Value value, int i) {
        value.kindCase_ = 1;
        value.kind_ = java.lang.Integer.valueOf(i);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Value value, androidx.content.preferences.protobuf.NullValue nullValue) {
        value.kind_ = java.lang.Integer.valueOf(nullValue.getNumber());
        value.kindCase_ = 1;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Value value) {
        if (value.kindCase_ == 1) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Value value, double d) {
        value.kindCase_ = 2;
        value.kind_ = java.lang.Double.valueOf(d);
    }

    static /* synthetic */ void getInputFormats(androidx.content.preferences.protobuf.Value value) {
        if (value.kindCase_ == 2) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Value value, java.lang.String str) {
        value.kindCase_ = 3;
        value.kind_ = str;
    }

    static /* synthetic */ void getOutputFormats(androidx.content.preferences.protobuf.Value value) {
        if (value.kindCase_ == 3) {
            value.kindCase_ = 0;
            value.kind_ = null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Value value, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        value.kind_ = byteString.toStringUtf8();
        value.kindCase_ = 3;
    }
}
