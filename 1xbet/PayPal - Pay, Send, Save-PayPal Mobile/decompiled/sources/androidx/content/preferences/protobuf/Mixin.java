package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
public final class Mixin extends androidx.content.preferences.protobuf.GeneratedMessageLite<androidx.content.preferences.protobuf.Mixin, androidx.datastore.preferences.protobuf.Mixin.Builder> implements androidx.content.preferences.protobuf.MixinOrBuilder {
    private static final androidx.content.preferences.protobuf.Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Mixin> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private java.lang.String name_ = "";
    private java.lang.String root_ = "";

    private Mixin() {
    }

    @Override // androidx.content.preferences.protobuf.MixinOrBuilder
    public final java.lang.String getName() {
        return this.name_;
    }

    @Override // androidx.content.preferences.protobuf.MixinOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.name_);
    }

    @Override // androidx.content.preferences.protobuf.MixinOrBuilder
    public final java.lang.String getRoot() {
        return this.root_;
    }

    @Override // androidx.content.preferences.protobuf.MixinOrBuilder
    public final androidx.content.preferences.protobuf.ByteString getRootBytes() {
        return androidx.content.preferences.protobuf.ByteString.copyFromUtf8(this.root_);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(java.nio.ByteBuffer byteBuffer) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(java.nio.ByteBuffer byteBuffer, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(androidx.content.preferences.protobuf.ByteString byteString) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(androidx.content.preferences.protobuf.ByteString byteString, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(byte[] bArr) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(byte[] bArr, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Mixin parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Mixin) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static androidx.content.preferences.protobuf.Mixin parseDelimitedFrom(java.io.InputStream inputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Mixin) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static androidx.content.preferences.protobuf.Mixin parseFrom(androidx.content.preferences.protobuf.CodedInputStream codedInputStream, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        return (androidx.content.preferences.protobuf.Mixin) androidx.content.preferences.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static androidx.datastore.preferences.protobuf.Mixin.Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static androidx.datastore.preferences.protobuf.Mixin.Builder newBuilder(androidx.content.preferences.protobuf.Mixin mixin) {
        return DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.content.preferences.protobuf.Mixin, androidx.datastore.preferences.protobuf.Mixin.Builder> implements androidx.content.preferences.protobuf.MixinOrBuilder {
        /* synthetic */ Builder(byte b) {
            this();
        }

        private Builder() {
            super(androidx.content.preferences.protobuf.Mixin.DEFAULT_INSTANCE);
        }

        @Override // androidx.content.preferences.protobuf.MixinOrBuilder
        public final java.lang.String getName() {
            return ((androidx.content.preferences.protobuf.Mixin) this.instance).getName();
        }

        @Override // androidx.content.preferences.protobuf.MixinOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getNameBytes() {
            return ((androidx.content.preferences.protobuf.Mixin) this.instance).getNameBytes();
        }

        public final androidx.datastore.preferences.protobuf.Mixin.Builder setName(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Mixin) this.instance).name_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Mixin.Builder clearName() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Mixin.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.Mixin) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Mixin.Builder setNameBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Mixin.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Mixin) this.instance, byteString);
            return this;
        }

        @Override // androidx.content.preferences.protobuf.MixinOrBuilder
        public final java.lang.String getRoot() {
            return ((androidx.content.preferences.protobuf.Mixin) this.instance).getRoot();
        }

        @Override // androidx.content.preferences.protobuf.MixinOrBuilder
        public final androidx.content.preferences.protobuf.ByteString getRootBytes() {
            return ((androidx.content.preferences.protobuf.Mixin) this.instance).getRootBytes();
        }

        public final androidx.datastore.preferences.protobuf.Mixin.Builder setRoot(java.lang.String str) {
            copyOnWrite();
            ((androidx.content.preferences.protobuf.Mixin) this.instance).root_ = str;
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Mixin.Builder clearRoot() {
            copyOnWrite();
            androidx.content.preferences.protobuf.Mixin.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.Mixin) this.instance);
            return this;
        }

        public final androidx.datastore.preferences.protobuf.Mixin.Builder setRootBytes(androidx.content.preferences.protobuf.ByteString byteString) {
            copyOnWrite();
            androidx.content.preferences.protobuf.Mixin.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Mixin) this.instance, byteString);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Mixin$1, reason: invalid class name */
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
        switch (androidx.content.preferences.protobuf.Mixin.AnonymousClass1.getHighSpeedVideoFpsRangesFor[methodToInvoke.ordinal()]) {
            case 1:
                return new androidx.content.preferences.protobuf.Mixin();
            case 2:
                return new androidx.datastore.preferences.protobuf.Mixin.Builder((byte) 0);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Mixin> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (androidx.content.preferences.protobuf.Mixin.class) {
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
        androidx.content.preferences.protobuf.Mixin mixin = new androidx.content.preferences.protobuf.Mixin();
        DEFAULT_INSTANCE = mixin;
        androidx.content.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(androidx.content.preferences.protobuf.Mixin.class, mixin);
    }

    public static androidx.content.preferences.protobuf.Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static androidx.content.preferences.protobuf.Parser<androidx.content.preferences.protobuf.Mixin> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Mixin mixin) {
        mixin.name_ = getDefaultInstance().getName();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Mixin mixin, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        mixin.name_ = byteString.toStringUtf8();
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Mixin mixin) {
        mixin.root_ = getDefaultInstance().getRoot();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Mixin mixin, androidx.content.preferences.protobuf.ByteString byteString) {
        checkByteStringIsUtf8(byteString);
        mixin.root_ = byteString.toStringUtf8();
    }
}
