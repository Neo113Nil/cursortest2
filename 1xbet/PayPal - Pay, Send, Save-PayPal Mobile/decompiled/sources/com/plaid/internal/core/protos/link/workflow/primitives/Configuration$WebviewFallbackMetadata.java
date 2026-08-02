package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$WebviewFallbackMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_FIELD_NUMBER = 9;
    public static final int CHANNEL_ID_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 2;
    public static final int MOST_RECENT_WORKFLOW_SESSION_ID_FIELD_NUMBER = 8;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata> PARSER = null;
    public static final int PLATFORM_IDENTIFIER_CONFIGURATION_FIELD_NUMBER = 7;
    public static final int RESOLVER_NAME_FIELD_NUMBER = 1;
    public static final int SDK_METADATA_FIELD_NUMBER = 3;
    public static final int WEBVIEW_FALLBACK_MODE_FIELD_NUMBER = 4;
    public static final int WEBVIEW_REQUEST_COUNT_FIELD_NUMBER = 5;
    private int androidSmsVerificationApiType_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata deviceMetadata_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration platformIdentifierConfiguration_;
    private com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata sdkMetadata_;
    private int webviewRequestCount_;
    private java.lang.String resolverName_ = "";
    private java.lang.String webviewFallbackMode_ = "";
    private java.lang.String channelId_ = "";
    private java.lang.String mostRecentWorkflowSessionId_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata configuration$WebviewFallbackMetadata = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata();
        DEFAULT_INSTANCE = configuration$WebviewFallbackMetadata;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.class, configuration$WebviewFallbackMetadata);
    }

    private Configuration$WebviewFallbackMetadata() {
    }

    private void clearAndroidSmsVerificationApiType() {
        this.androidSmsVerificationApiType_ = 0;
    }

    private void clearChannelId() {
        this.channelId_ = getDefaultInstance().getChannelId();
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMostRecentWorkflowSessionId() {
        this.mostRecentWorkflowSessionId_ = getDefaultInstance().getMostRecentWorkflowSessionId();
    }

    private void clearPlatformIdentifierConfiguration() {
        this.platformIdentifierConfiguration_ = null;
        this.bitField0_ &= -5;
    }

    private void clearResolverName() {
        this.resolverName_ = getDefaultInstance().getResolverName();
    }

    private void clearSdkMetadata() {
        this.sdkMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearWebviewFallbackMode() {
        this.webviewFallbackMode_ = getDefaultInstance().getWebviewFallbackMode();
    }

    private void clearWebviewRequestCount() {
        this.webviewRequestCount_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidSmsVerificationApiType(com.plaid.internal.core.protos.link.workflow.primitives.f fVar) {
        this.androidSmsVerificationApiType_ = fVar.getNumber();
    }

    private void setAndroidSmsVerificationApiTypeValue(int i) {
        this.androidSmsVerificationApiType_ = i;
    }

    private void setChannelIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.channelId_ = byteString.toStringUtf8();
    }

    private void setMostRecentWorkflowSessionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.mostRecentWorkflowSessionId_ = byteString.toStringUtf8();
    }

    private void setResolverNameBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.resolverName_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackModeBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackMode_ = byteString.toStringUtf8();
    }

    private void setWebviewRequestCount(int i) {
        this.webviewRequestCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007ဉ\u0002\bȈ\t\f", new java.lang.Object[]{"bitField0_", "resolverName_", "deviceMetadata_", "sdkMetadata_", "webviewFallbackMode_", "webviewRequestCount_", "channelId_", "platformIdentifierConfiguration_", "mostRecentWorkflowSessionId_", "androidSmsVerificationApiType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.f getAndroidSmsVerificationApiType() {
        com.plaid.internal.core.protos.link.workflow.primitives.f forNumber = com.plaid.internal.core.protos.link.workflow.primitives.f.forNumber(this.androidSmsVerificationApiType_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.f.UNRECOGNIZED : forNumber;
    }

    public final int getAndroidSmsVerificationApiTypeValue() {
        return this.androidSmsVerificationApiType_;
    }

    public final java.lang.String getChannelId() {
        return this.channelId_;
    }

    public final com.google.protobuf.ByteString getChannelIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.channelId_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata getDeviceMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    public final java.lang.String getMostRecentWorkflowSessionId() {
        return this.mostRecentWorkflowSessionId_;
    }

    public final com.google.protobuf.ByteString getMostRecentWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.mostRecentWorkflowSessionId_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration getPlatformIdentifierConfiguration() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration = this.platformIdentifierConfiguration_;
        return configuration$PlatformIdentifierConfiguration == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.getDefaultInstance() : configuration$PlatformIdentifierConfiguration;
    }

    public final java.lang.String getResolverName() {
        return this.resolverName_;
    }

    public final com.google.protobuf.ByteString getResolverNameBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.resolverName_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata getSdkMetadata() {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public final java.lang.String getWebviewFallbackMode() {
        return this.webviewFallbackMode_;
    }

    public final com.google.protobuf.ByteString getWebviewFallbackModeBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewFallbackMode_);
    }

    public final int getWebviewRequestCount() {
        return this.webviewRequestCount_;
    }

    public final boolean hasDeviceMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasPlatformIdentifierConfiguration() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasSdkMetadata() {
        return (this.bitField0_ & 2) != 0;
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

    private void mergePlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration2 = this.platformIdentifierConfiguration_;
        if (configuration$PlatformIdentifierConfiguration2 == null || configuration$PlatformIdentifierConfiguration2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.getDefaultInstance()) {
            this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        } else {
            this.platformIdentifierConfiguration_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.newBuilder(this.platformIdentifierConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration.a) configuration$PlatformIdentifierConfiguration).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeSdkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 == null || configuration$SDKMetadata2 == com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = configuration$SDKMetadata;
        } else {
            this.sdkMetadata_ = com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata.a) configuration$SDKMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata configuration$WebviewFallbackMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$WebviewFallbackMetadata);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setDeviceMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata configuration$DeviceMetadata) {
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 1;
    }

    private void setPlatformIdentifierConfiguration(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration configuration$PlatformIdentifierConfiguration) {
        this.platformIdentifierConfiguration_ = configuration$PlatformIdentifierConfiguration;
        this.bitField0_ |= 4;
    }

    private void setSdkMetadata(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata configuration$SDKMetadata) {
        this.sdkMetadata_ = configuration$SDKMetadata;
        this.bitField0_ |= 2;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setChannelId(java.lang.String str) {
        this.channelId_ = str;
    }

    private void setMostRecentWorkflowSessionId(java.lang.String str) {
        this.mostRecentWorkflowSessionId_ = str;
    }

    private void setResolverName(java.lang.String str) {
        this.resolverName_ = str;
    }

    private void setWebviewFallbackMode(java.lang.String str) {
        this.webviewFallbackMode_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$WebviewFallbackMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
