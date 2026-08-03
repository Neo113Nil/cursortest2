package gatewayprotocol.v1;

/* loaded from: classes6.dex */
public final class MediationInfoOuterClass {

    public interface MediationInfoOrBuilder extends com.google.protobuf.MessageLiteOrBuilder {
        java.lang.String getAdapterVersion();

        com.google.protobuf.ByteString getAdapterVersionBytes();

        java.lang.String getCustomName();

        com.google.protobuf.ByteString getCustomNameBytes();

        gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getProvider();

        int getProviderValue();

        java.lang.String getVersion();

        com.google.protobuf.ByteString getVersionBytes();

        boolean hasAdapterVersion();

        boolean hasCustomName();

        boolean hasVersion();
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
    }

    private MediationInfoOuterClass() {
    }

    public static final class MediationInfo extends com.google.protobuf.GeneratedMessageLite<gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo, gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder> implements gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder {
        public static final int ADAPTER_VERSION_FIELD_NUMBER = 4;
        public static final int CUSTOM_NAME_FIELD_NUMBER = 2;
        private static final gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo> PARSER = null;
        public static final int PROVIDER_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 3;
        private int bitField0_;
        private int provider_;
        private java.lang.String customName_ = "";
        private java.lang.String version_ = "";
        private java.lang.String adapterVersion_ = "";

        private MediationInfo() {
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public int getProviderValue() {
            return this.provider_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getProvider() {
            gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider forNumber = gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.forNumber(this.provider_);
            return forNumber == null ? gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderValue(int i) {
            this.provider_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProvider(gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.provider_ = mediationProvider.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProvider() {
            this.provider_ = 0;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public boolean hasCustomName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public java.lang.String getCustomName() {
            return this.customName_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public com.google.protobuf.ByteString getCustomNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.customName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomName(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomName() {
            this.bitField0_ &= -2;
            this.customName_ = getDefaultInstance().getCustomName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomNameBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.customName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public java.lang.String getVersion() {
            return this.version_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public com.google.protobuf.ByteString getVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.version_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.version_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -3;
            this.version_ = getDefaultInstance().getVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public boolean hasAdapterVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public java.lang.String getAdapterVersion() {
            return this.adapterVersion_;
        }

        @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
        public com.google.protobuf.ByteString getAdapterVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.adapterVersion_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdapterVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.adapterVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdapterVersion() {
            this.bitField0_ &= -5;
            this.adapterVersion_ = getDefaultInstance().getAdapterVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdapterVersionBytes(com.google.protobuf.ByteString byteString) {
            checkByteStringIsUtf8(byteString);
            this.adapterVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(java.nio.ByteBuffer byteBuffer) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(com.google.protobuf.ByteString byteString) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws com.google.protobuf.InvalidProtocolBufferException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseDelimitedFrom(java.io.InputStream inputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            return (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder newBuilder(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo mediationInfo) {
            return DEFAULT_INSTANCE.createBuilder(mediationInfo);
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo, gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder> implements gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder {
            /* synthetic */ Builder(gatewayprotocol.v1.MediationInfoOuterClass.AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public int getProviderValue() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getProviderValue();
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setProviderValue(int i) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setProviderValue(i);
                return this;
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider getProvider() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getProvider();
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setProvider(gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setProvider(mediationProvider);
                return this;
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder clearProvider() {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).clearProvider();
                return this;
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public boolean hasCustomName() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).hasCustomName();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public java.lang.String getCustomName() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getCustomName();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public com.google.protobuf.ByteString getCustomNameBytes() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getCustomNameBytes();
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setCustomName(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setCustomName(str);
                return this;
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder clearCustomName() {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).clearCustomName();
                return this;
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setCustomNameBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setCustomNameBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public boolean hasVersion() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).hasVersion();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public java.lang.String getVersion() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getVersion();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public com.google.protobuf.ByteString getVersionBytes() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getVersionBytes();
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setVersion(str);
                return this;
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder clearVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).clearVersion();
                return this;
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setVersionBytes(byteString);
                return this;
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public boolean hasAdapterVersion() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).hasAdapterVersion();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public java.lang.String getAdapterVersion() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getAdapterVersion();
            }

            @Override // gatewayprotocol.v1.MediationInfoOuterClass.MediationInfoOrBuilder
            public com.google.protobuf.ByteString getAdapterVersionBytes() {
                return ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).getAdapterVersionBytes();
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setAdapterVersion(java.lang.String str) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setAdapterVersion(str);
                return this;
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder clearAdapterVersion() {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).clearAdapterVersion();
                return this;
            }

            public gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder setAdapterVersionBytes(com.google.protobuf.ByteString byteString) {
                copyOnWrite();
                ((gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo) this.instance).setAdapterVersionBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            gatewayprotocol.v1.MediationInfoOuterClass.AnonymousClass1 anonymousClass1 = null;
            switch (gatewayprotocol.v1.MediationInfoOuterClass.AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo();
                case 2:
                    return new gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.Builder(anonymousClass1);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002", new java.lang.Object[]{"bitField0_", "provider_", "customName_", "version_", "adapterVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
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
            gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo mediationInfo = new gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo();
            DEFAULT_INSTANCE = mediationInfo;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo.class, mediationInfo);
        }

        public static gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<gatewayprotocol.v1.MediationInfoOuterClass.MediationInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: gatewayprotocol.v1.MediationInfoOuterClass$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }
}
