package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Option extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Option, androidx.datastore.preferences.protobuf.Option.Builder> implements androidx.content.preferences.protobuf.OptionOrBuilder {
    private static final androidx.content.preferences.protobuf.Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Option> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private java.lang.String name_ = "";
    private androidx.content.preferences.protobuf.Any value_;

    private Option() {
    }

    @Override // androidx.content.preferences.protobuf.OptionOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.OptionOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.OptionOrBuilder
    public final boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // androidx.content.preferences.protobuf.OptionOrBuilder
    public final androidx.content.preferences.protobuf.Any getValue() {
        androidx.content.preferences.protobuf.Any any = this.value_;
        return any == null ? androidx.content.preferences.protobuf.Any.getDefaultInstance() : any;
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Option parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Option) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Option parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Option) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Option parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Option) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Option.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Option.Builder newBuilder(androidx.content.preferences.protobuf.Option option) {
        return DEFAULT_INSTANCE.createBuilder(option);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Option, androidx.datastore.preferences.protobuf.Option.Builder> implements androidx.content.preferences.protobuf.OptionOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Option.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.OptionOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.Option) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.OptionOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.Option) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Option.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Option) this.instance).name_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Option.Builder clearName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Option.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Option) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Option.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Option.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.Option) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.OptionOrBuilder
        public final boolean hasValue() {
            return ((androidx.content.preferences.protobuf.Option) this.instance).hasValue();
        }

        @Override // androidx.content.preferences.protobuf.OptionOrBuilder
        public final androidx.content.preferences.protobuf.Any getValue() {
            return ((androidx.content.preferences.protobuf.Option) this.instance).getValue();
        }

        public final androidx.datastore.preferences.protobuf.Option.Builder setValue(androidx.content.preferences.protobuf.Any any) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Option.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Option) this.instance, any);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Option.Builder setValue(androidx.datastore.preferences.protobuf.Any.Builder builder) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Option.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Option) this.instance, builder.build());
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Option.Builder mergeValue(androidx.content.preferences.protobuf.Any any) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Option.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Option) this.instance, any);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Option.Builder clearValue() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Option.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.Option) this.instance);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Option$1, reason: invalid class name */
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
        switch (androidx.content.preferences.protobuf.Option.AnonymousClass1.getHighSpeedVideoFpsRangesFor[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Option();
            case 2:
                return new androidx.datastore.preferences.protobuf.Option.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Option> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Option.class) {
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
        androidx.content.preferences.protobuf.Option option = new androidx.content.preferences.protobuf.Option();
        DEFAULT_INSTANCE = option;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Option.class, option);
    }

    public static androidx.content.preferences.protobuf.Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Option> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Option option) {
        option.name_ = getDefaultInstance().getName();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Option option, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        option.name_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Option option, androidx.content.preferences.protobuf.Any any) {
        option.value_ = any;
        option.bitField0_ |= 1;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Option option, androidx.content.preferences.protobuf.Any any) {
        androidx.content.preferences.protobuf.Any any2 = option.value_;
        if (any2 != null && any2 != androidx.content.preferences.protobuf.Any.getDefaultInstance()) {
            option.value_ = androidx.content.preferences.protobuf.Any.newBuilder(option.value_).mergeFrom((androidx.datastore.preferences.protobuf.Any.Builder) any).buildPartial();
        } else {
            option.value_ = any;
        }
        option.bitField0_ |= 1;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.Option option) {
        option.value_ = null;
        option.bitField0_ &= -2;
    }
}
