package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$SdkUsageMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata> PARSER = null;
    public static final int USES_ON_EVENT_FIELD_NUMBER = 1;
    public static final int USES_ON_EXIT_FIELD_NUMBER = 2;
    public static final int USES_ON_LOAD_FIELD_NUMBER = 3;
    public static final int USES_ON_RESULT_FIELD_NUMBER = 4;
    private boolean usesOnEvent_;
    private boolean usesOnExit_;
    private boolean usesOnLoad_;
    private boolean usesOnResult_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata configuration$SdkUsageMetadata = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata();
        DEFAULT_INSTANCE = configuration$SdkUsageMetadata;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.class, configuration$SdkUsageMetadata);
    }

    private Configuration$SdkUsageMetadata() {
    }

    private void clearUsesOnEvent() {
        this.usesOnEvent_ = false;
    }

    private void clearUsesOnExit() {
        this.usesOnExit_ = false;
    }

    private void clearUsesOnLoad() {
        this.usesOnLoad_ = false;
    }

    private void clearUsesOnResult() {
        this.usesOnResult_ = false;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setUsesOnEvent(boolean z) {
        this.usesOnEvent_ = z;
    }

    private void setUsesOnExit(boolean z) {
        this.usesOnExit_ = z;
    }

    private void setUsesOnLoad(boolean z) {
        this.usesOnLoad_ = z;
    }

    private void setUsesOnResult(boolean z) {
        this.usesOnResult_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new java.lang.Object[]{"usesOnEvent_", "usesOnExit_", "usesOnLoad_", "usesOnResult_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.class) {
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

    public final boolean getUsesOnEvent() {
        return this.usesOnEvent_;
    }

    public final boolean getUsesOnExit() {
        return this.usesOnExit_;
    }

    public final boolean getUsesOnLoad() {
        return this.usesOnLoad_;
    }

    public final boolean getUsesOnResult() {
        return this.usesOnResult_;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata configuration$SdkUsageMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SdkUsageMetadata);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SdkUsageMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
