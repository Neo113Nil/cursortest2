package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$SDKMetadataWrapper extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper> PARSER = null;
    public static final int SDK_METADATA_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata sdkMetadata_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper configuration$SDKMetadataWrapper = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper();
        DEFAULT_INSTANCE = configuration$SDKMetadataWrapper;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.class, configuration$SDKMetadataWrapper);
    }

    private Configuration$SDKMetadataWrapper() {
    }

    private void clearSdkMetadata() {
        this.sdkMetadata_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "sdkMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata getSdkMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public final boolean hasSdkMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeSdkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 == null || configuration$SDKMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = configuration$SDKMetadata;
        } else {
            this.sdkMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a) configuration$SDKMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper configuration$SDKMetadataWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SDKMetadataWrapper);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setSdkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
        this.sdkMetadata_ = configuration$SDKMetadata;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
