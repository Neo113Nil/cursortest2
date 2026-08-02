package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$EmbeddedLinkTokenConfigurationWrapper extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper DEFAULT_INSTANCE;
    public static final int EMBEDDED_LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper> PARSER;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration embeddedLinkTokenConfiguration_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper configuration$EmbeddedLinkTokenConfigurationWrapper = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper();
        DEFAULT_INSTANCE = configuration$EmbeddedLinkTokenConfigurationWrapper;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.class, configuration$EmbeddedLinkTokenConfigurationWrapper);
    }

    private Configuration$EmbeddedLinkTokenConfigurationWrapper() {
    }

    private void clearEmbeddedLinkTokenConfiguration() {
        this.embeddedLinkTokenConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "embeddedLinkTokenConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration getEmbeddedLinkTokenConfiguration() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration = this.embeddedLinkTokenConfiguration_;
        return configuration$EmbeddedLinkTokenConfiguration == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance() : configuration$EmbeddedLinkTokenConfiguration;
    }

    public final boolean hasEmbeddedLinkTokenConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeEmbeddedLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration2 = this.embeddedLinkTokenConfiguration_;
        if (configuration$EmbeddedLinkTokenConfiguration2 == null || configuration$EmbeddedLinkTokenConfiguration2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance()) {
            this.embeddedLinkTokenConfiguration_ = configuration$EmbeddedLinkTokenConfiguration;
        } else {
            this.embeddedLinkTokenConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.newBuilder(this.embeddedLinkTokenConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration.a) configuration$EmbeddedLinkTokenConfiguration).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper configuration$EmbeddedLinkTokenConfigurationWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedLinkTokenConfigurationWrapper);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setEmbeddedLinkTokenConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        this.embeddedLinkTokenConfiguration_ = configuration$EmbeddedLinkTokenConfiguration;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
