package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$SDKMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANDROID_APP_HASH_FIELD_NUMBER = 7;
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 6;
    public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
    public static final int COMMIT_FIELD_NUMBER = 3;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata DEFAULT_INSTANCE;
    public static final int INTEGRATION_MODE_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int WRAPPING_SDKS_FIELD_NUMBER = 5;
    private int clientType_;
    private int integrationMode_;
    private java.lang.String version_ = "";
    private java.lang.String commit_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK> wrappingSdks_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String appPackageName_ = "";
    private java.lang.String androidAppHash_ = "";

    public static final class WrappingSDK extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.SDKMetadata.WrappingSDK.a> implements com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.b {
        public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int clientType_;
        private java.lang.String version_ = "";

        static {
            com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK wrappingSDK = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK();
            DEFAULT_INSTANCE = wrappingSDK;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK.class, wrappingSDK);
        }

        private WrappingSDK() {
        }

        private void clearClientType() {
            this.clientType_ = 0;
        }

        private void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.SDKMetadata.WrappingSDK.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientType(com.plaid.internal.core.protos.link.workflow.primitives.g gVar) {
            this.clientType_ = gVar.getNumber();
        }

        private void setClientTypeValue(int i) {
            this.clientType_ = i;
        }

        private void setVersionBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration.SDKMetadata.WrappingSDK.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new java.lang.Object[]{"clientType_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

        public final com.plaid.internal.core.protos.link.workflow.primitives.g getClientType() {
            com.plaid.internal.core.protos.link.workflow.primitives.g forNumber = com.plaid.internal.core.protos.link.workflow.primitives.g.forNumber(this.clientType_);
            return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.g.UNRECOGNIZED : forNumber;
        }

        public final int getClientTypeValue() {
            return this.clientType_;
        }

        public final java.lang.String getVersion() {
            return this.version_;
        }

        public final com.google.protobuf.ByteString getVersionBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.version_);
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK, com.plaid.internal.core.protos.link.workflow.primitives.Configuration.SDKMetadata.WrappingSDK.a> implements com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.b {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK.DEFAULT_INSTANCE);
            }

            public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration.SDKMetadata.WrappingSDK.a a(com.plaid.internal.core.protos.link.workflow.primitives.g gVar) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) this.instance).setClientType(gVar);
                return this;
            }

            public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration.SDKMetadata.WrappingSDK.a a(java.lang.String str) {
                copyOnWrite();
                ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) this.instance).setVersion(str);
                return this;
            }
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration.SDKMetadata.WrappingSDK.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK wrappingSDK) {
            return DEFAULT_INSTANCE.createBuilder(wrappingSDK);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(java.lang.String str) {
            this.version_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata();
        DEFAULT_INSTANCE = configuration$SDKMetadata;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.class, configuration$SDKMetadata);
    }

    private Configuration$SDKMetadata() {
    }

    private void addAllWrappingSdks(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK> iterable) {
        ensureWrappingSdksIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.wrappingSdks_);
    }

    private void clearAndroidAppHash() {
        this.androidAppHash_ = getDefaultInstance().getAndroidAppHash();
    }

    private void clearAppPackageName() {
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    private void clearClientType() {
        this.clientType_ = 0;
    }

    private void clearCommit() {
        this.commit_ = getDefaultInstance().getCommit();
    }

    private void clearIntegrationMode() {
        this.integrationMode_ = 0;
    }

    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void clearWrappingSdks() {
        this.wrappingSdks_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureWrappingSdksIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK> protobufList = this.wrappingSdks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.wrappingSdks_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWrappingSdks(int i) {
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.remove(i);
    }

    private void setAndroidAppHashBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.androidAppHash_ = byteString.toStringUtf8();
    }

    private void setAppPackageNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.appPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(com.plaid.internal.core.protos.link.workflow.primitives.g gVar) {
        this.clientType_ = gVar.getNumber();
    }

    private void setClientTypeValue(int i) {
        this.clientType_ = i;
    }

    private void setCommitBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.commit_ = byteString.toStringUtf8();
    }

    private void setIntegrationMode(com.plaid.internal.core.protos.link.workflow.primitives.i iVar) {
        this.integrationMode_ = iVar.getNumber();
    }

    private void setIntegrationModeValue(int i) {
        this.integrationMode_ = i;
    }

    private void setVersionBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b\u0006Ȉ\u0007Ȉ", new java.lang.Object[]{"clientType_", "version_", "commit_", "integrationMode_", "wrappingSdks_", com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK.class, "appPackageName_", "androidAppHash_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    public final java.lang.String getAndroidAppHash() {
        return this.androidAppHash_;
    }

    public final com.google.protobuf.ByteString getAndroidAppHashBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.androidAppHash_);
    }

    public final java.lang.String getAppPackageName() {
        return this.appPackageName_;
    }

    public final com.google.protobuf.ByteString getAppPackageNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.appPackageName_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.g getClientType() {
        com.plaid.internal.core.protos.link.workflow.primitives.g forNumber = com.plaid.internal.core.protos.link.workflow.primitives.g.forNumber(this.clientType_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.g.UNRECOGNIZED : forNumber;
    }

    public final int getClientTypeValue() {
        return this.clientType_;
    }

    public final java.lang.String getCommit() {
        return this.commit_;
    }

    public final com.google.protobuf.ByteString getCommitBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.commit_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.i getIntegrationMode() {
        com.plaid.internal.core.protos.link.workflow.primitives.i forNumber = com.plaid.internal.core.protos.link.workflow.primitives.i.forNumber(this.integrationMode_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.i.UNRECOGNIZED : forNumber;
    }

    public final int getIntegrationModeValue() {
        return this.integrationMode_;
    }

    public final java.lang.String getVersion() {
        return this.version_;
    }

    public final com.google.protobuf.ByteString getVersionBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.version_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK getWrappingSdks(int i) {
        return this.wrappingSdks_.get(i);
    }

    public final int getWrappingSdksCount() {
        return this.wrappingSdks_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK> getWrappingSdksList() {
        return this.wrappingSdks_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.b getWrappingSdksOrBuilder(int i) {
        return this.wrappingSdks_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.b> getWrappingSdksOrBuilderList() {
        return this.wrappingSdks_;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.DEFAULT_INSTANCE);
        }

        public final void a(com.plaid.internal.core.protos.link.workflow.primitives.g gVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) this.instance).setClientType(gVar);
        }

        public final void b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) this.instance).setAppPackageName(str);
        }

        public final void c(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) this.instance).setVersion(str);
        }

        public final void a() {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) this.instance).setCommit("5d8ab3d97fe");
        }

        public final void a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK wrappingSDK) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) this.instance).addWrappingSdks(wrappingSDK);
        }

        public final void a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) this.instance).setAndroidAppHash(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrappingSdks(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK wrappingSDK) {
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.add(wrappingSDK);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SDKMetadata);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setWrappingSdks(int i, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK wrappingSDK) {
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.set(i, wrappingSDK);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppHash(java.lang.String str) {
        this.androidAppHash_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(java.lang.String str) {
        this.appPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommit(java.lang.String str) {
        this.commit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(java.lang.String str) {
        this.version_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addWrappingSdks(int i, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.WrappingSDK wrappingSDK) {
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.add(i, wrappingSDK);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
