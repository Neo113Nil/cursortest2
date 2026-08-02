package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$LinkTokenConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration DEFAULT_INSTANCE;
    public static final int EMBEDDED_OPEN_LINK_CONFIGURATION_FIELD_NUMBER = 20;
    public static final int EMBEDDED_WORKFLOW_SESSION_ID_FIELD_NUMBER = 19;
    public static final int ENABLE_ACCOUNT_SELECT_FIELD_NUMBER = 18;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 4;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 3;
    public static final int LINK_TOKEN_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration> PARSER = null;
    public static final int PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 22;
    public static final int SDK_USAGE_METADATA_FIELD_NUMBER = 21;
    public static final int WEB3_VALID_CHAINS_FIELD_NUMBER = 6;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration embeddedOpenLinkConfiguration_;
    private boolean enableAccountSelect_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration platformIdentifierConfiguration_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata sdkUsageMetadata_;
    private java.lang.String linkToken_ = "";
    private java.lang.String linkOpenId_ = "";
    private java.lang.String linkPersistentId_ = "";
    private java.lang.String institutionId_ = "";
    private java.lang.String webviewFallbackId_ = "";
    private java.lang.String embeddedWorkflowSessionId_ = "";
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> web3ValidChains_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration();
        DEFAULT_INSTANCE = configuration$LinkTokenConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.class, configuration$LinkTokenConfiguration);
    }

    private Configuration$LinkTokenConfiguration() {
    }

    private void addAllWeb3ValidChains(java.lang.Iterable<java.lang.String> iterable) {
        ensureWeb3ValidChainsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.web3ValidChains_);
    }

    private void addWeb3ValidChainsBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureWeb3ValidChainsIsMutable();
        this.web3ValidChains_.add(byteString.toStringUtf8());
    }

    private void clearEmbeddedOpenLinkConfiguration() {
        this.embeddedOpenLinkConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    private void clearEmbeddedWorkflowSessionId() {
        this.embeddedWorkflowSessionId_ = getDefaultInstance().getEmbeddedWorkflowSessionId();
    }

    private void clearEnableAccountSelect() {
        this.enableAccountSelect_ = false;
    }

    private void clearInstitutionId() {
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    private void clearLinkOpenId() {
        this.linkOpenId_ = getDefaultInstance().getLinkOpenId();
    }

    private void clearLinkPersistentId() {
        this.linkPersistentId_ = getDefaultInstance().getLinkPersistentId();
    }

    private void clearLinkToken() {
        this.linkToken_ = getDefaultInstance().getLinkToken();
    }

    private void clearPlatformIdentifierConfiguration() {
        this.platformIdentifierConfiguration_ = null;
        this.bitField0_ &= -5;
    }

    private void clearSdkUsageMetadata() {
        this.sdkUsageMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearWeb3ValidChains() {
        this.web3ValidChains_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void ensureWeb3ValidChainsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.web3ValidChains_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.web3ValidChains_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEmbeddedWorkflowSessionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.embeddedWorkflowSessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableAccountSelect(boolean z) {
        this.enableAccountSelect_ = z;
    }

    private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.institutionId_ = byteString.toStringUtf8();
    }

    private void setLinkOpenIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linkOpenId_ = byteString.toStringUtf8();
    }

    private void setLinkPersistentIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linkPersistentId_ = byteString.toStringUtf8();
    }

    private void setLinkTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.linkToken_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ț\u0012\u0007\u0013Ȉ\u0014ဉ\u0000\u0015ဉ\u0001\u0016ဉ\u0002", new java.lang.Object[]{"bitField0_", "linkToken_", "linkOpenId_", "linkPersistentId_", "institutionId_", "webviewFallbackId_", "web3ValidChains_", "enableAccountSelect_", "embeddedWorkflowSessionId_", "embeddedOpenLinkConfiguration_", "sdkUsageMetadata_", "platformIdentifierConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration getEmbeddedOpenLinkConfiguration() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration = this.embeddedOpenLinkConfiguration_;
        return configuration$EmbeddedOpenLinkConfiguration == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.getDefaultInstance() : configuration$EmbeddedOpenLinkConfiguration;
    }

    public final java.lang.String getEmbeddedWorkflowSessionId() {
        return this.embeddedWorkflowSessionId_;
    }

    public final com.google.protobuf.ByteString getEmbeddedWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.embeddedWorkflowSessionId_);
    }

    public final boolean getEnableAccountSelect() {
        return this.enableAccountSelect_;
    }

    public final java.lang.String getInstitutionId() {
        return this.institutionId_;
    }

    public final com.google.protobuf.ByteString getInstitutionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.institutionId_);
    }

    public final java.lang.String getLinkOpenId() {
        return this.linkOpenId_;
    }

    public final com.google.protobuf.ByteString getLinkOpenIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linkOpenId_);
    }

    public final java.lang.String getLinkPersistentId() {
        return this.linkPersistentId_;
    }

    public final com.google.protobuf.ByteString getLinkPersistentIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linkPersistentId_);
    }

    public final java.lang.String getLinkToken() {
        return this.linkToken_;
    }

    public final com.google.protobuf.ByteString getLinkTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.linkToken_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration getPlatformIdentifierConfiguration() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration = this.platformIdentifierConfiguration_;
        return configuration$PlatformIdentifierConfiguration == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.getDefaultInstance() : configuration$PlatformIdentifierConfiguration;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata getSdkUsageMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata configuration$SdkUsageMetadata = this.sdkUsageMetadata_;
        return configuration$SdkUsageMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.getDefaultInstance() : configuration$SdkUsageMetadata;
    }

    public final java.lang.String getWeb3ValidChains(int i) {
        return this.web3ValidChains_.get(i);
    }

    public final com.google.protobuf.ByteString getWeb3ValidChainsBytes(int i) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.web3ValidChains_.get(i));
    }

    public final int getWeb3ValidChainsCount() {
        return this.web3ValidChains_.size();
    }

    public final java.util.List<java.lang.String> getWeb3ValidChainsList() {
        return this.web3ValidChains_;
    }

    public final java.lang.String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public final com.google.protobuf.ByteString getWebviewFallbackIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public final boolean hasEmbeddedOpenLinkConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasPlatformIdentifierConfiguration() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasSdkUsageMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setEmbeddedWorkflowSessionId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setInstitutionId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a c(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setLinkOpenId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a d(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setLinkPersistentId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a e(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setLinkToken(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a f(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setWebviewFallbackId(str);
            return this;
        }

        public final void a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setEmbeddedOpenLinkConfiguration(configuration$EmbeddedOpenLinkConfiguration);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a a(boolean z) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setEnableAccountSelect(z);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) this.instance).setPlatformIdentifierConfiguration(configuration$PlatformIdentifierConfiguration);
            return this;
        }
    }

    private void addWeb3ValidChains(java.lang.String str) {
        ensureWeb3ValidChainsIsMutable();
        this.web3ValidChains_.add(str);
    }

    private void mergeEmbeddedOpenLinkConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration2 = this.embeddedOpenLinkConfiguration_;
        if (configuration$EmbeddedOpenLinkConfiguration2 == null || configuration$EmbeddedOpenLinkConfiguration2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.getDefaultInstance()) {
            this.embeddedOpenLinkConfiguration_ = configuration$EmbeddedOpenLinkConfiguration;
        } else {
            this.embeddedOpenLinkConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.newBuilder(this.embeddedOpenLinkConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration.a) configuration$EmbeddedOpenLinkConfiguration).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergePlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration2 = this.platformIdentifierConfiguration_;
        if (configuration$PlatformIdentifierConfiguration2 == null || configuration$PlatformIdentifierConfiguration2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        } else {
            this.platformIdentifierConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.newBuilder(this.platformIdentifierConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a) configuration$PlatformIdentifierConfiguration).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeSdkUsageMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata configuration$SdkUsageMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata configuration$SdkUsageMetadata2 = this.sdkUsageMetadata_;
        if (configuration$SdkUsageMetadata2 == null || configuration$SdkUsageMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.getDefaultInstance()) {
            this.sdkUsageMetadata_ = configuration$SdkUsageMetadata;
        } else {
            this.sdkUsageMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.newBuilder(this.sdkUsageMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.a) configuration$SdkUsageMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkTokenConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedOpenLinkConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
        this.embeddedOpenLinkConfiguration_ = configuration$EmbeddedOpenLinkConfiguration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        this.bitField0_ |= 4;
    }

    private void setSdkUsageMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata configuration$SdkUsageMetadata) {
        this.sdkUsageMetadata_ = configuration$SdkUsageMetadata;
        this.bitField0_ |= 2;
    }

    private void setWeb3ValidChains(int i, java.lang.String str) {
        ensureWeb3ValidChainsIsMutable();
        this.web3ValidChains_.set(i, str);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedWorkflowSessionId(java.lang.String str) {
        this.embeddedWorkflowSessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionId(java.lang.String str) {
        this.institutionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkOpenId(java.lang.String str) {
        this.linkOpenId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkPersistentId(java.lang.String str) {
        this.linkPersistentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkToken(java.lang.String str) {
        this.linkToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallbackId(java.lang.String str) {
        this.webviewFallbackId_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
