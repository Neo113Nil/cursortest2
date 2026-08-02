package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowNextResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ADDITIONAL_PANES_FIELD_NUMBER = 3;
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 5;
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse DEFAULT_INSTANCE;
    public static final int NEXT_PANE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse> PARSER = null;
    public static final int QUEUED_SDK_EVENTS_FIELD_NUMBER = 6;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering nextPane_;
    private java.lang.String workflowSessionId_ = "";
    private java.lang.String continuationToken_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> additionalPanes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String requestId_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent> queuedSdkEvents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowNextResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.class, workflow$LinkWorkflowNextResponse);
    }

    private Workflow$LinkWorkflowNextResponse() {
    }

    private void addAllAdditionalPanes(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> iterable) {
        ensureAdditionalPanesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.additionalPanes_);
    }

    private void addAllQueuedSdkEvents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent> iterable) {
        ensureQueuedSdkEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.queuedSdkEvents_);
    }

    private void clearAdditionalPanes() {
        this.additionalPanes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearNextPane() {
        this.nextPane_ = null;
        this.bitField0_ &= -2;
    }

    private void clearQueuedSdkEvents() {
        this.queuedSdkEvents_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureAdditionalPanesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> protobufList = this.additionalPanes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.additionalPanes_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureQueuedSdkEventsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent> protobufList = this.queuedSdkEvents_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.queuedSdkEvents_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdditionalPanes(int i) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.remove(i);
    }

    private void removeQueuedSdkEvents(int i) {
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.remove(i);
    }

    private void setContinuationTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
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
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004Ȉ\u0005Ȉ\u0006\u001b", new java.lang.Object[]{"bitField0_", "workflowSessionId_", "nextPane_", "additionalPanes_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.class, "requestId_", "continuationToken_", "queuedSdkEvents_", com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering getAdditionalPanes(int i) {
        return this.additionalPanes_.get(i);
    }

    public final int getAdditionalPanesCount() {
        return this.additionalPanes_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> getAdditionalPanesList() {
        return this.additionalPanes_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.p0 getAdditionalPanesOrBuilder(int i) {
        return this.additionalPanes_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.p0> getAdditionalPanesOrBuilderList() {
        return this.additionalPanes_;
    }

    public final java.lang.String getContinuationToken() {
        return this.continuationToken_;
    }

    public final com.google.protobuf.ByteString getContinuationTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.continuationToken_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering getNextPane() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering = this.nextPane_;
        return pane$PaneRendering == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
    }

    public final com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent getQueuedSdkEvents(int i) {
        return this.queuedSdkEvents_.get(i);
    }

    public final int getQueuedSdkEventsCount() {
        return this.queuedSdkEvents_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent> getQueuedSdkEventsList() {
        return this.queuedSdkEvents_;
    }

    public final com.plaid.internal.core.protos.link.sdkevents.b getQueuedSdkEventsOrBuilder(int i) {
        return this.queuedSdkEvents_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.sdkevents.b> getQueuedSdkEventsOrBuilderList() {
        return this.queuedSdkEvents_;
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public final boolean hasNextPane() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addAdditionalPanes(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(pane$PaneRendering);
    }

    private void addQueuedSdkEvents(com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.add(sdkEvent$SDKEvent);
    }

    private void mergeNextPane(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering2 = this.nextPane_;
        if (pane$PaneRendering2 == null || pane$PaneRendering2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.getDefaultInstance()) {
            this.nextPane_ = pane$PaneRendering;
        } else {
            this.nextPane_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.newBuilder(this.nextPane_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.a) pane$PaneRendering).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse workflow$LinkWorkflowNextResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowNextResponse);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAdditionalPanes(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.set(i, pane$PaneRendering);
    }

    private void setNextPane(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        this.nextPane_ = pane$PaneRendering;
        this.bitField0_ |= 1;
    }

    private void setQueuedSdkEvents(int i, com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.set(i, sdkEvent$SDKEvent);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setContinuationToken(java.lang.String str) {
        this.continuationToken_ = str;
    }

    private void setRequestId(java.lang.String str) {
        this.requestId_ = str;
    }

    private void setWorkflowSessionId(java.lang.String str) {
        this.workflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addAdditionalPanes(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(i, pane$PaneRendering);
    }

    private void addQueuedSdkEvents(int i, com.plaid.internal.core.protos.link.sdkevents.SdkEvent$SDKEvent sdkEvent$SDKEvent) {
        ensureQueuedSdkEventsIsMutable();
        this.queuedSdkEvents_.add(i, sdkEvent$SDKEvent);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
