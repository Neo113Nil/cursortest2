package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowEnabledRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest DEFAULT_INSTANCE;
    public static final int INBOUND_REQUEST_USER_AGENT_FIELD_NUMBER = 4;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest> PARSER = null;
    public static final int QUERY_STRING_FIELD_NUMBER = 1;
    public static final int UNIQUE_LINK_REQUEST_ID_FIELD_NUMBER = 3;
    private java.lang.Object configuration_;
    private int configurationCase_ = 0;
    private java.lang.String uniqueLinkRequestId_ = "";
    private java.lang.String inboundRequestUserAgent_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        QUERY_STRING(1),
        CONFIGURATION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6061a;

        b(int i) {
            this.f6061a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.b forNumber(int i) {
            if (i == 0) {
                return CONFIGURATION_NOT_SET;
            }
            if (i != 1) {
                return null;
            }
            return QUERY_STRING;
        }

        public final int getNumber() {
            return this.f6061a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest workflow$LinkWorkflowEnabledRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEnabledRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.class, workflow$LinkWorkflowEnabledRequest);
    }

    private Workflow$LinkWorkflowEnabledRequest() {
    }

    private void clearConfiguration() {
        this.configurationCase_ = 0;
        this.configuration_ = null;
    }

    private void clearInboundRequestUserAgent() {
        this.inboundRequestUserAgent_ = getDefaultInstance().getInboundRequestUserAgent();
    }

    private void clearQueryString() {
        if (this.configurationCase_ == 1) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearUniqueLinkRequestId() {
        this.uniqueLinkRequestId_ = getDefaultInstance().getUniqueLinkRequestId();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setInboundRequestUserAgentBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.inboundRequestUserAgent_ = byteString.toStringUtf8();
    }

    private void setQueryStringBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.configuration_ = byteString.toStringUtf8();
        this.configurationCase_ = 1;
    }

    private void setUniqueLinkRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.uniqueLinkRequestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"configuration_", "configurationCase_", "uniqueLinkRequestId_", "inboundRequestUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.class) {
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

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.b getConfigurationCase() {
        return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.b.forNumber(this.configurationCase_);
    }

    public final java.lang.String getInboundRequestUserAgent() {
        return this.inboundRequestUserAgent_;
    }

    public final com.google.protobuf.ByteString getInboundRequestUserAgentBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.inboundRequestUserAgent_);
    }

    public final java.lang.String getUniqueLinkRequestId() {
        return this.uniqueLinkRequestId_;
    }

    public final com.google.protobuf.ByteString getUniqueLinkRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.uniqueLinkRequestId_);
    }

    public final boolean hasQueryString() {
        return this.configurationCase_ == 1;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest workflow$LinkWorkflowEnabledRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEnabledRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setQueryString(java.lang.String str) {
        this.configurationCase_ = 1;
        this.configuration_ = str;
    }

    public final java.lang.String getQueryString() {
        return this.configurationCase_ == 1 ? (java.lang.String) this.configuration_ : "";
    }

    public final com.google.protobuf.ByteString getQueryStringBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.configurationCase_ == 1 ? (java.lang.String) this.configuration_ : "");
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setInboundRequestUserAgent(java.lang.String str) {
        this.inboundRequestUserAgent_ = str;
    }

    private void setUniqueLinkRequestId(java.lang.String str) {
        this.uniqueLinkRequestId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEnabledRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
