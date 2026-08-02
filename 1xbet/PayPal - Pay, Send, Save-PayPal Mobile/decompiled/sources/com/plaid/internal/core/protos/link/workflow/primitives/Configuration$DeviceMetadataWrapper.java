package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$DeviceMetadataWrapper extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper> PARSER;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata deviceMetadata_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper configuration$DeviceMetadataWrapper = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper();
        DEFAULT_INSTANCE = configuration$DeviceMetadataWrapper;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.class, configuration$DeviceMetadataWrapper);
    }

    private Configuration$DeviceMetadataWrapper() {
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "deviceMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata getDeviceMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    public final boolean hasDeviceMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeDeviceMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata2 = this.deviceMetadata_;
        if (configuration$DeviceMetadata2 == null || configuration$DeviceMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.getDefaultInstance()) {
            this.deviceMetadata_ = configuration$DeviceMetadata;
        } else {
            this.deviceMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.newBuilder(this.deviceMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.a) configuration$DeviceMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper configuration$DeviceMetadataWrapper) {
        return DEFAULT_INSTANCE.createBuilder(configuration$DeviceMetadataWrapper);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setDeviceMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadataWrapper) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
