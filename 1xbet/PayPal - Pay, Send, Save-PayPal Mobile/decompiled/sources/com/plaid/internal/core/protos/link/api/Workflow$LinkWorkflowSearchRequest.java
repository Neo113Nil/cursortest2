package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowSearchRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest DEFAULT_INSTANCE;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 3;
    public static final int PANE_RENDERING_ID_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private java.lang.String workflowSessionId_ = "";
    private java.lang.String paneRenderingId_ = "";
    private java.lang.String paneNodeId_ = "";
    private java.lang.String continuationToken_ = "";
    private java.lang.String query_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest workflow$LinkWorkflowSearchRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowSearchRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.class, workflow$LinkWorkflowSearchRequest);
    }

    private Workflow$LinkWorkflowSearchRequest() {
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    private void clearPaneRenderingId() {
        this.paneRenderingId_ = getDefaultInstance().getPaneRenderingId();
    }

    private void clearQuery() {
        this.query_ = getDefaultInstance().getQuery();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setContinuationTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setPaneNodeIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    private void setPaneRenderingIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.paneRenderingId_ = byteString.toStringUtf8();
    }

    private void setQueryBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.query_ = byteString.toStringUtf8();
    }

    private void setWorkflowSessionIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowSessionId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new java.lang.Object[]{"workflowSessionId_", "paneRenderingId_", "paneNodeId_", "continuationToken_", "query_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.class) {
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

    public final java.lang.String getContinuationToken() {
        return this.continuationToken_;
    }

    public final com.google.protobuf.ByteString getContinuationTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.continuationToken_);
    }

    public final java.lang.String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public final com.google.protobuf.ByteString getPaneNodeIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public final java.lang.String getPaneRenderingId() {
        return this.paneRenderingId_;
    }

    public final com.google.protobuf.ByteString getPaneRenderingIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.paneRenderingId_);
    }

    public final java.lang.String getQuery() {
        return this.query_;
    }

    public final com.google.protobuf.ByteString getQueryBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.query_);
    }

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest workflow$LinkWorkflowSearchRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowSearchRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setContinuationToken(java.lang.String str) {
        this.continuationToken_ = str;
    }

    private void setPaneNodeId(java.lang.String str) {
        this.paneNodeId_ = str;
    }

    private void setPaneRenderingId(java.lang.String str) {
        this.paneRenderingId_ = str;
    }

    private void setQuery(java.lang.String str) {
        this.query_ = str;
    }

    private void setWorkflowSessionId(java.lang.String str) {
        this.workflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
