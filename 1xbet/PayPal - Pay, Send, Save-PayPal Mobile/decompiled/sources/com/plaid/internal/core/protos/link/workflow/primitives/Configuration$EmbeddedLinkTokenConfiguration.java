package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$EmbeddedLinkTokenConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration DEFAULT_INSTANCE;
    public static final int EMBEDDED_COMPONENT_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int LINK_OPEN_ID_FIELD_NUMBER = 2;
    public static final int LINK_PERSISTENT_ID_FIELD_NUMBER = 3;
    public static final int LINK_TOKEN_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration> PARSER = null;
    public static final int PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration embeddedComponentConfiguration_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration platformIdentifierConfiguration_;
    private java.lang.String linkToken_ = "";
    private java.lang.String linkOpenId_ = "";
    private java.lang.String linkPersistentId_ = "";

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration();
        DEFAULT_INSTANCE = configuration$EmbeddedLinkTokenConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.class, configuration$EmbeddedLinkTokenConfiguration);
    }

    private Configuration$EmbeddedLinkTokenConfiguration() {
    }

    private void clearEmbeddedComponentConfiguration() {
        this.embeddedComponentConfiguration_ = null;
        this.bitField0_ &= -2;
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
        this.bitField0_ &= -3;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001", new java.lang.Object[]{"bitField0_", "linkToken_", "linkOpenId_", "linkPersistentId_", "embeddedComponentConfiguration_", "platformIdentifierConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration getEmbeddedComponentConfiguration() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration = this.embeddedComponentConfiguration_;
        return configuration$EmbeddedComponentConfiguration == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.getDefaultInstance() : configuration$EmbeddedComponentConfiguration;
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

    public final boolean hasEmbeddedComponentConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasPlatformIdentifierConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) this.instance).setLinkOpenId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) this.instance).setLinkPersistentId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a c(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) this.instance).setLinkToken(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a a(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) this.instance).setPlatformIdentifierConfiguration(configuration$PlatformIdentifierConfiguration);
            return this;
        }
    }

    private void mergeEmbeddedComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration2 = this.embeddedComponentConfiguration_;
        if (configuration$EmbeddedComponentConfiguration2 == null || configuration$EmbeddedComponentConfiguration2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.getDefaultInstance()) {
            this.embeddedComponentConfiguration_ = configuration$EmbeddedComponentConfiguration;
        } else {
            this.embeddedComponentConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.newBuilder(this.embeddedComponentConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration.a) configuration$EmbeddedComponentConfiguration).buildPartial();
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
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedLinkTokenConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setEmbeddedComponentConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedComponentConfiguration configuration$EmbeddedComponentConfiguration) {
        this.embeddedComponentConfiguration_ = configuration$EmbeddedComponentConfiguration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
