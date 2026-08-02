package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Method extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Method, androidx.datastore.preferences.protobuf.Method.Builder> implements androidx.content.preferences.protobuf.MethodOrBuilder {
    private static final androidx.content.preferences.protobuf.Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Method> PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private java.lang.String name_ = "";
    private java.lang.String requestTypeUrl_ = "";
    private java.lang.String responseTypeUrl_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> options_ = emptyProtobufList();

    private Method() {
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final java.lang.String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getRequestTypeUrlBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final java.lang.String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getResponseTypeUrlBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final androidx.content.preferences.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final androidx.content.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // androidx.content.preferences.protobuf.MethodOrBuilder
    public final androidx.content.preferences.protobuf.Syntax getSyntax() {
        androidx.content.preferences.protobuf.Syntax forNumber = androidx.content.preferences.protobuf.Syntax.forNumber(this.syntax_);
        return forNumber == null ? androidx.content.preferences.protobuf.Syntax.UNRECOGNIZED : forNumber;
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Method parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Method) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Method parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Method) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Method parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Method) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Method.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Method.Builder newBuilder(androidx.content.preferences.protobuf.Method method) {
        return DEFAULT_INSTANCE.createBuilder(method);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Method, androidx.datastore.preferences.protobuf.Method.Builder> implements androidx.content.preferences.protobuf.MethodOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Method.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).name_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder clearName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Method) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Method) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final java.lang.String getRequestTypeUrl() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getRequestTypeUrl();
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getRequestTypeUrlBytes() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getRequestTypeUrlBytes();
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setRequestTypeUrl(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).requestTypeUrl_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder clearRequestTypeUrl() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoSizesFor((androidx.content.preferences.protobuf.Method) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setRequestTypeUrlBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Method) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final boolean getRequestStreaming() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getRequestStreaming();
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setRequestStreaming(boolean z) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).requestStreaming_ = z;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder clearRequestStreaming() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).requestStreaming_ = false;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final java.lang.String getResponseTypeUrl() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getResponseTypeUrl();
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getResponseTypeUrlBytes() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getResponseTypeUrlBytes();
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setResponseTypeUrl(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).responseTypeUrl_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder clearResponseTypeUrl() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Method) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setResponseTypeUrlBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Method) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final boolean getResponseStreaming() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getResponseStreaming();
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setResponseStreaming(boolean z) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).responseStreaming_ = z;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder clearResponseStreaming() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).responseStreaming_ = false;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.Method) this.instance).getOptionsList());
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final int getOptionsCount() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getOptionsCount();
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final androidx.content.preferences.protobuf.Option getOptions(int i) {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getOptions(i);
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Method) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Method) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder addOptions(androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Method) this.instance, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder addOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Method) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Method) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder addOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Method) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder addAllOptions(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Option> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Method) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder clearOptions() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Method) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder removeOptions(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Method) this.instance, i);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final int getSyntaxValue() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getSyntaxValue();
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setSyntaxValue(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).syntax_ = i;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MethodOrBuilder
        public final androidx.content.preferences.protobuf.Syntax getSyntax() {
            return ((androidx.content.preferences.protobuf.Method) this.instance).getSyntax();
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder setSyntax(androidx.content.preferences.protobuf.Syntax syntax) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Method.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Method) this.instance, syntax);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Method.Builder clearSyntax() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Method) this.instance).syntax_ = 0;
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Method$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        androidx.content.preferences.protobuf.Parser parser;
        switch (androidx.content.preferences.protobuf.Method.AnonymousClass1.Camera2StreamConfigurationMap[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Method();
            case 2:
                return new androidx.datastore.preferences.protobuf.Method.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new java.lang.Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", androidx.content.preferences.protobuf.Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Method> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Method.class) {
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
        androidx.content.preferences.protobuf.Method method = new androidx.content.preferences.protobuf.Method();
        DEFAULT_INSTANCE = method;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Method.class, method);
    }

    public static androidx.content.preferences.protobuf.Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Method> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Method method) {
        method.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Method method, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        method.responseTypeUrl_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Method method, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = method.options_;
        if (!protobufList.isModifiable()) {
            method.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        method.options_.set(i, option);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Method method, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = method.options_;
        if (!protobufList.isModifiable()) {
            method.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        method.options_.add(option);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Method method, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = method.options_;
        if (!protobufList.isModifiable()) {
            method.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        method.options_.add(i, option);
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Method method, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = method.options_;
        if (!protobufList.isModifiable()) {
            method.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, method.options_);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Method method) {
        method.options_ = emptyProtobufList();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Method method, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = method.options_;
        if (!protobufList.isModifiable()) {
            method.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        method.options_.remove(i);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Method method) {
        method.name_ = getDefaultInstance().getName();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Method method, androidx.content.preferences.protobuf.Syntax syntax) {
        method.syntax_ = syntax.getNumber();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Method method, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        method.name_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighSpeedVideoSizesFor(androidx.content.preferences.protobuf.Method method) {
        method.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Method method, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        method.requestTypeUrl_ = byteString.toStringUtf8();
    }
}
