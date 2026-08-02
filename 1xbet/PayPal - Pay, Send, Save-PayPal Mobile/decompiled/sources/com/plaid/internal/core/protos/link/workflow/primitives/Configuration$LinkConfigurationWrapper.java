package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$LinkConfigurationWrapper extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper DEFAULT_INSTANCE;
    public static final int LINK_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper> PARSER;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration linkConfiguration_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper configuration$LinkConfigurationWrapper = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper();
        DEFAULT_INSTANCE = configuration$LinkConfigurationWrapper;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.class, configuration$LinkConfigurationWrapper);
    }

    private Configuration$LinkConfigurationWrapper() {
    }

    private void clearLinkConfiguration() {
        this.linkConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "linkConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration getLinkConfiguration() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration = this.linkConfiguration_;
        return configuration$LinkConfiguration == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.getDefaultInstance() : configuration$LinkConfiguration;
    }

    public final boolean hasLinkConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeLinkConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration2 = this.linkConfiguration_;
        if (configuration$LinkConfiguration2 == null || configuration$LinkConfiguration2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.getDefaultInstance()) {
            this.linkConfiguration_ = configuration$LinkConfiguration;
        } else {
            this.linkConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.newBuilder(this.linkConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration.b) configuration$LinkConfiguration).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper configuration$LinkConfigurationWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$LinkConfigurationWrapper);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setLinkConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration configuration$LinkConfiguration) {
        this.linkConfiguration_ = configuration$LinkConfiguration;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfigurationWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
