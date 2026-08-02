package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class ListValue extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.ListValue, androidx.datastore.preferences.protobuf.ListValue.Builder> implements androidx.content.preferences.protobuf.ListValueOrBuilder {
    private static final androidx.content.preferences.protobuf.ListValue DEFAULT_INSTANCE;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.ListValue> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Value> values_ = emptyProtobufList();

    private ListValue() {
    }

    @Override // androidx.content.preferences.protobuf.ListValueOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Value> getValuesList() {
        return this.values_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // androidx.content.preferences.protobuf.ListValueOrBuilder
    public final int getValuesCount() {
        return this.values_.size();
    }

    @Override // androidx.content.preferences.protobuf.ListValueOrBuilder
    public final androidx.content.preferences.protobuf.Value getValues(int i) {
        return this.values_.get(i);
    }

    public final androidx.content.preferences.protobuf.ValueOrBuilder getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.ListValue parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.ListValue parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.ListValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.ListValue parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.ListValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.ListValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.ListValue.Builder newBuilder(androidx.content.preferences.protobuf.ListValue listValue) {
        return DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.ListValue, androidx.datastore.preferences.protobuf.ListValue.Builder> implements androidx.content.preferences.protobuf.ListValueOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.ListValue.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.ListValueOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Value> getValuesList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.ListValue) this.instance).getValuesList());
        }

        @Override // androidx.content.preferences.protobuf.ListValueOrBuilder
        public final int getValuesCount() {
            return ((androidx.content.preferences.protobuf.ListValue) this.instance).getValuesCount();
        }

        @Override // androidx.content.preferences.protobuf.ListValueOrBuilder
        public final androidx.content.preferences.protobuf.Value getValues(int i) {
            return ((androidx.content.preferences.protobuf.ListValue) this.instance).getValues(i);
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder setValues(int i, androidx.content.preferences.protobuf.Value value) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.ListValue) this.instance, i, value);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder setValues(int i, androidx.datastore.preferences.protobuf.Value.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.ListValue) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder addValues(androidx.content.preferences.protobuf.Value value) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.ListValue) this.instance, value);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder addValues(int i, androidx.content.preferences.protobuf.Value value) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.ListValue) this.instance, i, value);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder addValues(androidx.datastore.preferences.protobuf.Value.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.ListValue) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder addValues(int i, androidx.datastore.preferences.protobuf.Value.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.ListValue) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder addAllValues(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Value> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.ListValue) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder clearValues() {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.ListValue) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.ListValue.Builder removeValues(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.ListValue.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.ListValue) this.instance, i);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ListValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.ListValue.AnonymousClass1.getHighSpeedVideoFpsRangesFor[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.ListValue();
            case 2:
                return new androidx.datastore.preferences.protobuf.ListValue.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"values_", androidx.content.preferences.protobuf.Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.ListValue> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.ListValue.class) {
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
        androidx.content.preferences.protobuf.ListValue listValue = new androidx.content.preferences.protobuf.ListValue();
        DEFAULT_INSTANCE = listValue;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.ListValue.class, listValue);
    }

    public static androidx.content.preferences.protobuf.ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.ListValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.ListValue listValue, int i, androidx.content.preferences.protobuf.Value value) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Value> protobufList = listValue.values_;
        if (!protobufList.isModifiable()) {
            listValue.values_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        listValue.values_.set(i, value);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.ListValue listValue, androidx.content.preferences.protobuf.Value value) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Value> protobufList = listValue.values_;
        if (!protobufList.isModifiable()) {
            listValue.values_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        listValue.values_.add(value);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.ListValue listValue, int i, androidx.content.preferences.protobuf.Value value) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Value> protobufList = listValue.values_;
        if (!protobufList.isModifiable()) {
            listValue.values_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        listValue.values_.add(i, value);
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.ListValue listValue, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Value> protobufList = listValue.values_;
        if (!protobufList.isModifiable()) {
            listValue.values_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, listValue.values_);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.ListValue listValue) {
        listValue.values_ = emptyProtobufList();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.ListValue listValue, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Value> protobufList = listValue.values_;
        if (!protobufList.isModifiable()) {
            listValue.values_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        listValue.values_.remove(i);
    }
}
