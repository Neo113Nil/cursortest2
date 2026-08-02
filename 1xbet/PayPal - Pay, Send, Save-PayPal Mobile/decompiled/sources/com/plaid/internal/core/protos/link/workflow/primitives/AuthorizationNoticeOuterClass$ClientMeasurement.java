package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class AuthorizationNoticeOuterClass$ClientMeasurement extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement, com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata deviceMetadata_;
    private java.lang.String version_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement, com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement = new com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement();
        DEFAULT_INSTANCE = authorizationNoticeOuterClass$ClientMeasurement;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.class, authorizationNoticeOuterClass$ClientMeasurement);
    }

    private AuthorizationNoticeOuterClass$ClientMeasurement() {
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setVersionBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.a.f6355a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "version_", "deviceMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.class) {
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

    public final java.lang.String getVersion() {
        return this.version_;
    }

    public final com.google.protobuf.ByteString getVersionBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.version_);
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

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        return DEFAULT_INSTANCE.createBuilder(authorizationNoticeOuterClass$ClientMeasurement);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setDeviceMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setVersion(java.lang.String str) {
        this.version_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
