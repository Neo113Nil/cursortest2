package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class EnumValue extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.EnumValue, androidx.datastore.preferences.protobuf.EnumValue.Builder> implements androidx.content.preferences.protobuf.EnumValueOrBuilder {
    private static final androidx.content.preferences.protobuf.EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.EnumValue> PARSER;
    private int number_;
    private java.lang.String name_ = "";
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> options_ = emptyProtobufList();

    private EnumValue() {
    }

    @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
    public final int getNumber() {
        return this.number_;
    }

    @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
    public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
        return this.options_;
    }

    public final java.util.List<? extends androidx.content.preferences.protobuf.OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
    public final int getOptionsCount() {
        return this.options_.size();
    }

    @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
    public final androidx.content.preferences.protobuf.Option getOptions(int i) {
        return this.options_.get(i);
    }

    public final androidx.content.preferences.protobuf.OptionOrBuilder getOptionsOrBuilder(int i) {
        return this.options_.get(i);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.EnumValue) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.EnumValue parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.EnumValue) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.EnumValue.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.EnumValue.Builder newBuilder(androidx.content.preferences.protobuf.EnumValue enumValue) {
        return DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.EnumValue, androidx.datastore.preferences.protobuf.EnumValue.Builder> implements androidx.content.preferences.protobuf.EnumValueOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.EnumValue.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.EnumValue) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.EnumValue) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.EnumValue) this.instance).name_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder clearName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.EnumValue) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.EnumValue) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
        public final int getNumber() {
            return ((androidx.content.preferences.protobuf.EnumValue) this.instance).getNumber();
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder setNumber(int i) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.EnumValue) this.instance).number_ = i;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder clearNumber() {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.EnumValue) this.instance).number_ = 0;
            return this;
        }

        @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
        public final java.util.List<androidx.content.preferences.protobuf.Option> getOptionsList() {
            return java.util.Collections.unmodifiableList(((androidx.content.preferences.protobuf.EnumValue) this.instance).getOptionsList());
        }

        @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
        public final int getOptionsCount() {
            return ((androidx.content.preferences.protobuf.EnumValue) this.instance).getOptionsCount();
        }

        @Override // androidx.content.preferences.protobuf.EnumValueOrBuilder
        public final androidx.content.preferences.protobuf.Option getOptions(int i) {
            return ((androidx.content.preferences.protobuf.EnumValue) this.instance).getOptions(i);
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder setOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.EnumValue) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder setOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.EnumValue) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.EnumValue) this.instance, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(int i, androidx.content.preferences.protobuf.Option option) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.EnumValue) this.instance, i, option);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.EnumValue) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder addOptions(int i, androidx.datastore.preferences.protobuf.Option.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.EnumValue) this.instance, i, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder addAllOptions(java.lang.Iterable<? extends androidx.content.preferences.protobuf.Option> iterable) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.EnumValue) this.instance, iterable);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder clearOptions() {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.EnumValue) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.EnumValue.Builder removeOptions(int i) {
            copyOnWrite();
            androidx.content.preferences.protobuf.EnumValue.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.EnumValue) this.instance, i);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.EnumValue$1, reason: invalid class name */
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
        switch (androidx.content.preferences.protobuf.EnumValue.AnonymousClass1.getHighSpeedVideoFpsRangesFor[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.EnumValue();
            case 2:
                return new androidx.datastore.preferences.protobuf.EnumValue.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new java.lang.Object[]{"name_", "number_", "options_", androidx.content.preferences.protobuf.Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.EnumValue> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.EnumValue.class) {
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
        androidx.content.preferences.protobuf.EnumValue enumValue = new androidx.content.preferences.protobuf.EnumValue();
        DEFAULT_INSTANCE = enumValue;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.EnumValue.class, enumValue);
    }

    public static androidx.content.preferences.protobuf.EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.EnumValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.EnumValue enumValue) {
        enumValue.options_ = emptyProtobufList();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.EnumValue enumValue, int i) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = enumValue.options_;
        if (!protobufList.isModifiable()) {
            enumValue.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        enumValue.options_.remove(i);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.EnumValue enumValue) {
        enumValue.name_ = getDefaultInstance().getName();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.EnumValue enumValue, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        enumValue.name_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.EnumValue enumValue, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = enumValue.options_;
        if (!protobufList.isModifiable()) {
            enumValue.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        enumValue.options_.set(i, option);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.EnumValue enumValue, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = enumValue.options_;
        if (!protobufList.isModifiable()) {
            enumValue.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        enumValue.options_.add(option);
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.EnumValue enumValue, int i, androidx.content.preferences.protobuf.Option option) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = enumValue.options_;
        if (!protobufList.isModifiable()) {
            enumValue.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        enumValue.options_.add(i, option);
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.EnumValue enumValue, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.Internal.ProtobufList<androidx.content.preferences.protobuf.Option> protobufList = enumValue.options_;
        if (!protobufList.isModifiable()) {
            enumValue.options_ = androidx.content.preferences.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }
        androidx.content.preferences.protobuf.AbstractMessageLite.addAll(iterable, enumValue.options_);
    }
}
