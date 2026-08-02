package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowEventRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest DEFAULT_INSTANCE;
    public static final int EVENTS_FIELD_NUMBER = 3;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest> PARSER = null;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 27;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 2;
    private java.lang.String workflowSessionId_ = "";
    private java.lang.String webviewFallbackId_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent> events_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowEventRequest;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.class, workflow$LinkWorkflowEventRequest);
    }

    private Workflow$LinkWorkflowEventRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent> iterable) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.events_);
    }

    private void clearEvents() {
        this.events_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void clearWorkflowSessionId() {
        this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
    }

    private void ensureEventsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent> protobufList = this.events_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.events_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeEvents(int i) {
        ensureEventsIsMutable();
        this.events_.remove(i);
    }

    private void setWebviewFallbackIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
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
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u001b\u0003\u0000\u0001\u0000\u0002Ȉ\u0003\u001b\u001bȈ", new java.lang.Object[]{"workflowSessionId_", "events_", com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent.class, "webviewFallbackId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.class) {
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

    public final com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent getEvents(int i) {
        return this.events_.get(i);
    }

    public final int getEventsCount() {
        return this.events_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent> getEventsList() {
        return this.events_;
    }

    public final com.plaid.internal.core.protos.link.api.c getEventsOrBuilder(int i) {
        return this.events_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.api.c> getEventsOrBuilderList() {
        return this.events_;
    }

    public final java.lang.String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public final com.google.protobuf.ByteString getWebviewFallbackIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.DEFAULT_INSTANCE);
        }

        public final void a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) this.instance).setWebviewFallbackId(str);
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) this.instance).setWorkflowSessionId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a a(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) this.instance).addEvents(clientEventOuterClass$ClientEvent);
            return this;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a a(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent> iterable) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) this.instance).addAllEvents(iterable);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
        ensureEventsIsMutable();
        this.events_.add(clientEventOuterClass$ClientEvent);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest workflow$LinkWorkflowEventRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowEventRequest);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setEvents(int i, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
        ensureEventsIsMutable();
        this.events_.set(i, clientEventOuterClass$ClientEvent);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewFallbackId(java.lang.String str) {
        this.webviewFallbackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowSessionId(java.lang.String str) {
        this.workflowSessionId_ = str;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addEvents(int i, com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent) {
        ensureEventsIsMutable();
        this.events_.add(i, clientEventOuterClass$ClientEvent);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
