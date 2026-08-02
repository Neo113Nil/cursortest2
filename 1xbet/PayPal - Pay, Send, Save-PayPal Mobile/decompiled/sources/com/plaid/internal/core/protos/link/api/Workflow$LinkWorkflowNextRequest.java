package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowNextRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 3;
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest DEFAULT_INSTANCE;
    public static final int PANE_META_OUTPUTS_FIELD_NUMBER = 4;
    public static final int PANE_OUTPUTS_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest> PARSER = null;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private java.lang.String workflowSessionId_ = "";
    private java.lang.String continuationToken_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> paneOutputs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput> paneMetaOutputs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class PaneMetaOutput extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextRequest.PaneMetaOutput.a> implements com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.b {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput DEFAULT_INSTANCE;
        public static final int PANE_NODE_ID_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput> PARSER = null;
        public static final int RECAPTCHA_ENTERPRISE_TOKEN_FIELD_NUMBER = 2;
        public static final int TD_REQUEST_ID_FIELD_NUMBER = 4;
        public static final int TD_RESULT_FIELD_NUMBER = 5;
        private java.lang.String paneNodeId_ = "";
        private java.lang.String recaptchaEnterpriseToken_ = "";
        private java.lang.String tdRequestId_ = "";
        private java.lang.String tdResult_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextRequest.PaneMetaOutput.a> implements com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.b {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput paneMetaOutput = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput();
            DEFAULT_INSTANCE = paneMetaOutput;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput.class, paneMetaOutput);
        }

        private PaneMetaOutput() {
        }

        private void clearPaneNodeId() {
            this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
        }

        private void clearRecaptchaEnterpriseToken() {
            this.recaptchaEnterpriseToken_ = getDefaultInstance().getRecaptchaEnterpriseToken();
        }

        private void clearTdRequestId() {
            this.tdRequestId_ = getDefaultInstance().getTdRequestId();
        }

        private void clearTdResult() {
            this.tdResult_ = getDefaultInstance().getTdResult();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextRequest.PaneMetaOutput.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPaneNodeIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.paneNodeId_ = byteString.toStringUtf8();
        }

        private void setRecaptchaEnterpriseTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.recaptchaEnterpriseToken_ = byteString.toStringUtf8();
        }

        private void setTdRequestIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.tdRequestId_ = byteString.toStringUtf8();
        }

        private void setTdResultBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.tdResult_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextRequest.PaneMetaOutput.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ", new java.lang.Object[]{"paneNodeId_", "recaptchaEnterpriseToken_", "tdRequestId_", "tdResult_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput.class) {
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

        public final java.lang.String getPaneNodeId() {
            return this.paneNodeId_;
        }

        public final com.google.protobuf.ByteString getPaneNodeIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.paneNodeId_);
        }

        public final java.lang.String getRecaptchaEnterpriseToken() {
            return this.recaptchaEnterpriseToken_;
        }

        public final com.google.protobuf.ByteString getRecaptchaEnterpriseTokenBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.recaptchaEnterpriseToken_);
        }

        public final java.lang.String getTdRequestId() {
            return this.tdRequestId_;
        }

        public final com.google.protobuf.ByteString getTdRequestIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.tdRequestId_);
        }

        public final java.lang.String getTdResult() {
            return this.tdResult_;
        }

        public final com.google.protobuf.ByteString getTdResultBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.tdResult_);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowNextRequest.PaneMetaOutput.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput paneMetaOutput) {
            return DEFAULT_INSTANCE.createBuilder(paneMetaOutput);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setPaneNodeId(java.lang.String str) {
            this.paneNodeId_ = str;
        }

        private void setRecaptchaEnterpriseToken(java.lang.String str) {
            this.recaptchaEnterpriseToken_ = str;
        }

        private void setTdRequestId(java.lang.String str) {
            this.tdRequestId_ = str;
        }

        private void setTdResult(java.lang.String str) {
            this.tdResult_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface b extends com.google.protobuf.MessageLiteOrBuilder {
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowNextRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.class, workflow$LinkWorkflowNextRequest);
    }

    private Workflow$LinkWorkflowNextRequest() {
    }

    private void addAllPaneMetaOutputs(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput> iterable) {
        ensurePaneMetaOutputsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.paneMetaOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPaneOutputs(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> iterable) {
        ensurePaneOutputsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.paneOutputs_);
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearPaneMetaOutputs() {
        this.paneMetaOutputs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPaneOutputs() {
        this.paneOutputs_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensurePaneMetaOutputsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput> protobufList = this.paneMetaOutputs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paneMetaOutputs_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensurePaneOutputsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> protobufList = this.paneOutputs_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.paneOutputs_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePaneMetaOutputs(int i) {
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.remove(i);
    }

    private void removePaneOutputs(int i) {
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.remove(i);
    }

    private void setContinuationTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
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
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004\u001b", new java.lang.Object[]{"workflowSessionId_", "paneOutputs_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.class, "continuationToken_", "paneMetaOutputs_", com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.class) {
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

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput getPaneMetaOutputs(int i) {
        return this.paneMetaOutputs_.get(i);
    }

    public final int getPaneMetaOutputsCount() {
        return this.paneMetaOutputs_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput> getPaneMetaOutputsList() {
        return this.paneMetaOutputs_;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.b getPaneMetaOutputsOrBuilder(int i) {
        return this.paneMetaOutputs_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.b> getPaneMetaOutputsOrBuilderList() {
        return this.paneMetaOutputs_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput getPaneOutputs(int i) {
        return this.paneOutputs_.get(i);
    }

    public final int getPaneOutputsCount() {
        return this.paneOutputs_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> getPaneOutputsList() {
        return this.paneOutputs_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.o0 getPaneOutputsOrBuilder(int i) {
        return this.paneOutputs_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.o0> getPaneOutputsOrBuilderList() {
        return this.paneOutputs_;
    }

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.DEFAULT_INSTANCE);
        }

        public final void a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) this.instance).setContinuationToken(str);
        }

        public final void b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) this.instance).setWorkflowSessionId(str);
        }

        public final void a(java.util.List list) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) this.instance).addAllPaneOutputs(list);
        }
    }

    private void addPaneMetaOutputs(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput paneMetaOutput) {
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.add(paneMetaOutput);
    }

    private void addPaneOutputs(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput pane$PaneOutput) {
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.add(pane$PaneOutput);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowNextRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setPaneMetaOutputs(int i, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput paneMetaOutput) {
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.set(i, paneMetaOutput);
    }

    private void setPaneOutputs(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput pane$PaneOutput) {
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.set(i, pane$PaneOutput);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContinuationToken(java.lang.String str) {
        this.continuationToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionId(java.lang.String str) {
        this.workflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addPaneMetaOutputs(int i, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest.PaneMetaOutput paneMetaOutput) {
        ensurePaneMetaOutputsIsMutable();
        this.paneMetaOutputs_.add(i, paneMetaOutput);
    }

    private void addPaneOutputs(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput pane$PaneOutput) {
        ensurePaneOutputsIsMutable();
        this.paneOutputs_.add(i, pane$PaneOutput);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
