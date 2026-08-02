package com.plaid.internal.core.protos.link.api;

/* loaded from: classes16.dex */
public final class Workflow$LinkWorkflowStartResponse extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.b> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ADDITIONAL_PANES_FIELD_NUMBER = 3;
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_FIELD_NUMBER = 13;
    public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse DEFAULT_INSTANCE;
    public static final int ERROR_TRACKING_METADATA_FIELD_NUMBER = 10;
    public static final int EVENTS_FIELD_NUMBER = 5;
    public static final int HEARTBEAT_CONFIGURATION_FIELD_NUMBER = 9;
    public static final int MOBILE_SDK_LOG_LEVEL_FIELD_NUMBER = 15;
    public static final int NEXT_PANE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 4;
    public static final int SEND_BACKEND_EVENTS_FIELD_NUMBER = 12;
    public static final int SESSION_RENDERING_DATA_FIELD_NUMBER = 8;
    public static final int TD_RUN_CONFIGURATION_FIELD_NUMBER = 14;
    public static final int WEBVIEW_FALLBACK_FIELD_NUMBER = 7;
    public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    private int androidSmsVerificationApiType_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata errorTrackingMetadata_;
    private com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events_;
    private com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration heartbeatConfiguration_;
    private int mobileSdkLogLevel_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering nextPane_;
    private int sendBackendEvents_;
    private com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData sessionRenderingData_;
    private int tdRunConfiguration_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback webviewFallback_;
    private java.lang.String workflowSessionId_ = "";
    private java.lang.String continuationToken_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> additionalPanes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String requestId_ = "";

    public static final class ErrorTrackingMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.ErrorTrackingMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata> PARSER = null;
        public static final int WORKFLOW_NAME_FIELD_NUMBER = 1;
        private java.lang.String workflowName_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.ErrorTrackingMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata errorTrackingMetadata = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata();
            DEFAULT_INSTANCE = errorTrackingMetadata;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata.class, errorTrackingMetadata);
        }

        private ErrorTrackingMetadata() {
        }

        private void clearWorkflowName() {
            this.workflowName_ = getDefaultInstance().getWorkflowName();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.ErrorTrackingMetadata.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setWorkflowNameBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.workflowName_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.ErrorTrackingMetadata.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"workflowName_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata.class) {
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

        public final java.lang.String getWorkflowName() {
            return this.workflowName_;
        }

        public final com.google.protobuf.ByteString getWorkflowNameBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.workflowName_);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.ErrorTrackingMetadata.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata errorTrackingMetadata) {
            return DEFAULT_INSTANCE.createBuilder(errorTrackingMetadata);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setWorkflowName(java.lang.String str) {
            this.workflowName_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Events extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events DEFAULT_INSTANCE;
        public static final int ON_APPEAR_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events> PARSER;
        private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.Events.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events();
            DEFAULT_INSTANCE = events;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events.class, events);
        }

        private Events() {
        }

        private void addAllOnAppear(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> iterable) {
            ensureOnAppearIsMutable();
            com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.onAppear_);
        }

        private void clearOnAppear() {
            this.onAppear_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureOnAppearIsMutable() {
            com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> protobufList = this.onAppear_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.onAppear_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.Events.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeOnAppear(int i) {
            ensureOnAppearIsMutable();
            this.onAppear_.remove(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.Events.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"onAppear_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getOnAppear(int i) {
            return this.onAppear_.get(i);
        }

        public final int getOnAppearCount() {
            return this.onAppear_.size();
        }

        public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> getOnAppearList() {
            return this.onAppear_;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.M getOnAppearOrBuilder(int i) {
            return this.onAppear_.get(i);
        }

        public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.M> getOnAppearOrBuilderList() {
            return this.onAppear_;
        }

        private void addOnAppear(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
            ensureOnAppearIsMutable();
            this.onAppear_.add(common$SDKEvent);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.Events.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events) {
            return DEFAULT_INSTANCE.createBuilder(events);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
            ensureOnAppearIsMutable();
            this.onAppear_.set(i, common$SDKEvent);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        private void addOnAppear(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
            ensureOnAppearIsMutable();
            this.onAppear_.add(i, common$SDKEvent);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HeartbeatConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.HeartbeatConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration DEFAULT_INSTANCE;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration> PARSER = null;
        public static final int SERVE_NEW_WARDEN_FIELD_NUMBER = 2;
        private java.lang.String linkSessionId_ = "";
        private boolean serveNewWarden_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.HeartbeatConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration heartbeatConfiguration = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration();
            DEFAULT_INSTANCE = heartbeatConfiguration;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration.class, heartbeatConfiguration);
        }

        private HeartbeatConfiguration() {
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearServeNewWarden() {
            this.serveNewWarden_ = false;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.HeartbeatConfiguration.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLinkSessionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setServeNewWarden(boolean z) {
            this.serveNewWarden_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.HeartbeatConfiguration.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new java.lang.Object[]{"linkSessionId_", "serveNewWarden_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration.class) {
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

        public final java.lang.String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public final com.google.protobuf.ByteString getLinkSessionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public final boolean getServeNewWarden() {
            return this.serveNewWarden_;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.HeartbeatConfiguration.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration heartbeatConfiguration) {
            return DEFAULT_INSTANCE.createBuilder(heartbeatConfiguration);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setLinkSessionId(java.lang.String str) {
            this.linkSessionId_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SessionRenderingData extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int APPEARANCE_FIELD_NUMBER = 6;
        public static final int BODY_TEXT_OVERRIDE_FIELD_NUMBER = 15;
        private static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData DEFAULT_INSTANCE;
        public static final int DISCLAIMER_TEXT_OVERRIDE_FIELD_NUMBER = 16;
        public static final int HEADER_TEXT_OVERRIDE_FIELD_NUMBER = 10;
        public static final int ILLUSTRATION_OVERRIDE_FIELD_NUMBER = 11;
        public static final int INSTANTIATE_WEB3_BRIDGE_FIELD_NUMBER = 5;
        public static final int NAVIGATION_OVERRIDE_FIELD_NUMBER = 18;
        public static final int OVERLAY_BACKGROUND_COLOR_FIELD_NUMBER = 2;
        public static final int OVERLAY_BACKGROUND_FOOTER_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData> PARSER = null;
        public static final int PRIMARY_BUTTON_OVERRIDE_FIELD_NUMBER = 12;
        public static final int RECAPTCHA_ENTERPRISE_ENABLED_FIELD_NUMBER = 3;
        public static final int SPACING_OVERRIDE_FIELD_NUMBER = 19;
        public static final int TEXT_ALIGNMENT_OVERRIDE_FIELD_NUMBER = 9;
        public static final int TEXT_INPUT_OVERRIDE_FIELD_NUMBER = 14;
        public static final int THREADS_INPUT_VARIATION_FIELD_NUMBER = 13;
        public static final int USE_HAPTICS_FIELD_NUMBER = 17;
        public static final int USE_HOSTED_LINK_UI_CUSTOMIZATIONS_FIELD_NUMBER = 8;
        public static final int USE_LINK_REFRESH_FIELD_NUMBER = 7;
        private int appearance_;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride bodyTextOverride_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride disclaimerTextOverride_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride headerTextOverride_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride illustrationOverride_;
        private boolean instantiateWeb3Bridge_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride navigationOverride_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString overlayBackgroundFooter_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride primaryButtonOverride_;
        private boolean recaptchaEnterpriseEnabled_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride spacingOverride_;
        private int textAlignmentOverride_;
        private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride textInputOverride_;
        private boolean useHaptics_;
        private boolean useHostedLinkUiCustomizations_;
        private boolean useLinkRefresh_;
        private java.lang.String overlayBackgroundColor_ = "";
        private java.lang.String threadsInputVariation_ = "";

        public static final class BaseTextInputOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int ACTIVE_BORDER_COLOR_FIELD_NUMBER = 5;
            public static final int BORDER_COLOR_FIELD_NUMBER = 4;
            public static final int BORDER_RADIUS_FIELD_NUMBER = 2;
            public static final int BORDER_WIDTH_FIELD_NUMBER = 3;
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride DEFAULT_INSTANCE;
            public static final int HEIGHT_FIELD_NUMBER = 1;
            public static final int HIDE_CALLING_CODE_FIELD_NUMBER = 6;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride> PARSER;
            private com.google.protobuf.StringValue activeBorderColor_;
            private int bitField0_;
            private com.google.protobuf.StringValue borderColor_;
            private com.google.protobuf.Int64Value borderRadius_;
            private com.google.protobuf.FloatValue borderWidth_;
            private com.google.protobuf.Int64Value height_;
            private com.google.protobuf.BoolValue hideCallingCode_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride baseTextInputOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride();
                DEFAULT_INSTANCE = baseTextInputOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.class, baseTextInputOverride);
            }

            private BaseTextInputOverride() {
            }

            private void clearActiveBorderColor() {
                this.activeBorderColor_ = null;
                this.bitField0_ &= -17;
            }

            private void clearBorderColor() {
                this.borderColor_ = null;
                this.bitField0_ &= -9;
            }

            private void clearBorderRadius() {
                this.borderRadius_ = null;
                this.bitField0_ &= -3;
            }

            private void clearBorderWidth() {
                this.borderWidth_ = null;
                this.bitField0_ &= -5;
            }

            private void clearHeight() {
                this.height_ = null;
                this.bitField0_ &= -2;
            }

            private void clearHideCallingCode() {
                this.hideCallingCode_ = null;
                this.bitField0_ &= -33;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new java.lang.Object[]{"bitField0_", "height_", "borderRadius_", "borderWidth_", "borderColor_", "activeBorderColor_", "hideCallingCode_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.class) {
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

            public final com.google.protobuf.StringValue getActiveBorderColor() {
                com.google.protobuf.StringValue stringValue = this.activeBorderColor_;
                return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
            }

            public final com.google.protobuf.StringValue getBorderColor() {
                com.google.protobuf.StringValue stringValue = this.borderColor_;
                return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
            }

            public final com.google.protobuf.Int64Value getBorderRadius() {
                com.google.protobuf.Int64Value int64Value = this.borderRadius_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final com.google.protobuf.FloatValue getBorderWidth() {
                com.google.protobuf.FloatValue floatValue = this.borderWidth_;
                return floatValue == null ? com.google.protobuf.FloatValue.getDefaultInstance() : floatValue;
            }

            public final com.google.protobuf.Int64Value getHeight() {
                com.google.protobuf.Int64Value int64Value = this.height_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final com.google.protobuf.BoolValue getHideCallingCode() {
                com.google.protobuf.BoolValue boolValue = this.hideCallingCode_;
                return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
            }

            public final boolean hasActiveBorderColor() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasBorderColor() {
                return (this.bitField0_ & 8) != 0;
            }

            public final boolean hasBorderRadius() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasBorderWidth() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasHeight() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasHideCallingCode() {
                return (this.bitField0_ & 32) != 0;
            }

            private void mergeActiveBorderColor(com.google.protobuf.StringValue stringValue) {
                com.google.protobuf.StringValue stringValue2 = this.activeBorderColor_;
                if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
                    this.activeBorderColor_ = stringValue;
                } else {
                    this.activeBorderColor_ = com.google.protobuf.StringValue.newBuilder(this.activeBorderColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeBorderColor(com.google.protobuf.StringValue stringValue) {
                com.google.protobuf.StringValue stringValue2 = this.borderColor_;
                if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
                    this.borderColor_ = stringValue;
                } else {
                    this.borderColor_ = com.google.protobuf.StringValue.newBuilder(this.borderColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeBorderRadius(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.borderRadius_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.borderRadius_ = int64Value;
                } else {
                    this.borderRadius_ = com.google.protobuf.Int64Value.newBuilder(this.borderRadius_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeBorderWidth(com.google.protobuf.FloatValue floatValue) {
                com.google.protobuf.FloatValue floatValue2 = this.borderWidth_;
                if (floatValue2 == null || floatValue2 == com.google.protobuf.FloatValue.getDefaultInstance()) {
                    this.borderWidth_ = floatValue;
                } else {
                    this.borderWidth_ = com.google.protobuf.FloatValue.newBuilder(this.borderWidth_).mergeFrom((com.google.protobuf.FloatValue.Builder) floatValue).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeHeight(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.height_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.height_ = int64Value;
                } else {
                    this.height_ = com.google.protobuf.Int64Value.newBuilder(this.height_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeHideCallingCode(com.google.protobuf.BoolValue boolValue) {
                com.google.protobuf.BoolValue boolValue2 = this.hideCallingCode_;
                if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
                    this.hideCallingCode_ = boolValue;
                } else {
                    this.hideCallingCode_ = com.google.protobuf.BoolValue.newBuilder(this.hideCallingCode_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
                }
                this.bitField0_ |= 32;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride baseTextInputOverride) {
                return DEFAULT_INSTANCE.createBuilder(baseTextInputOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setActiveBorderColor(com.google.protobuf.StringValue stringValue) {
                this.activeBorderColor_ = stringValue;
                this.bitField0_ |= 16;
            }

            private void setBorderColor(com.google.protobuf.StringValue stringValue) {
                this.borderColor_ = stringValue;
                this.bitField0_ |= 8;
            }

            private void setBorderRadius(com.google.protobuf.Int64Value int64Value) {
                this.borderRadius_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setBorderWidth(com.google.protobuf.FloatValue floatValue) {
                this.borderWidth_ = floatValue;
                this.bitField0_ |= 4;
            }

            private void setHeight(com.google.protobuf.Int64Value int64Value) {
                this.height_ = int64Value;
                this.bitField0_ |= 1;
            }

            private void setHideCallingCode(com.google.protobuf.BoolValue boolValue) {
                this.hideCallingCode_ = boolValue;
                this.bitField0_ |= 32;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class BodyTextOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int DEFAULT_FONT_OVERRIDE_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride defaultFontOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride bodyTextOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride();
                DEFAULT_INSTANCE = bodyTextOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.class, bodyTextOverride);
            }

            private BodyTextOverride() {
            }

            private void clearDefaultFontOverride() {
                this.defaultFontOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "defaultFontOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.class) {
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

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride getDefaultFontOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride = this.defaultFontOverride_;
                return fontOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.getDefaultInstance() : fontOverride;
            }

            public final boolean hasDefaultFontOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeDefaultFontOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride) {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride2 = this.defaultFontOverride_;
                if (fontOverride2 == null || fontOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.getDefaultInstance()) {
                    this.defaultFontOverride_ = fontOverride;
                } else {
                    this.defaultFontOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.newBuilder(this.defaultFontOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a) fontOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride bodyTextOverride) {
                return DEFAULT_INSTANCE.createBuilder(bodyTextOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setDefaultFontOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride) {
                this.defaultFontOverride_ = fontOverride;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class ButtonOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride DEFAULT_INSTANCE;
            public static final int FONT_SIZE_FIELD_NUMBER = 2;
            public static final int HEIGHT_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride> PARSER;
            private int bitField0_;
            private com.google.protobuf.Int64Value fontSize_;
            private com.google.protobuf.Int64Value height_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride buttonOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride();
                DEFAULT_INSTANCE = buttonOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.class, buttonOverride);
            }

            private ButtonOverride() {
            }

            private void clearFontSize() {
                this.fontSize_ = null;
                this.bitField0_ &= -3;
            }

            private void clearHeight() {
                this.height_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "height_", "fontSize_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.class) {
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

            public final com.google.protobuf.Int64Value getFontSize() {
                com.google.protobuf.Int64Value int64Value = this.fontSize_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final com.google.protobuf.Int64Value getHeight() {
                com.google.protobuf.Int64Value int64Value = this.height_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final boolean hasFontSize() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasHeight() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeFontSize(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.fontSize_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.fontSize_ = int64Value;
                } else {
                    this.fontSize_ = com.google.protobuf.Int64Value.newBuilder(this.fontSize_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeHeight(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.height_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.height_ = int64Value;
                } else {
                    this.height_ = com.google.protobuf.Int64Value.newBuilder(this.height_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride buttonOverride) {
                return DEFAULT_INSTANCE.createBuilder(buttonOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setFontSize(com.google.protobuf.Int64Value int64Value) {
                this.fontSize_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setHeight(com.google.protobuf.Int64Value int64Value) {
                this.height_ = int64Value;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class DisclaimerTextOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int DEFAULT_FONT_OVERRIDE_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride defaultFontOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride disclaimerTextOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride();
                DEFAULT_INSTANCE = disclaimerTextOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.class, disclaimerTextOverride);
            }

            private DisclaimerTextOverride() {
            }

            private void clearDefaultFontOverride() {
                this.defaultFontOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "defaultFontOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.class) {
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

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride getDefaultFontOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride = this.defaultFontOverride_;
                return fontOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.getDefaultInstance() : fontOverride;
            }

            public final boolean hasDefaultFontOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeDefaultFontOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride) {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride2 = this.defaultFontOverride_;
                if (fontOverride2 == null || fontOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.getDefaultInstance()) {
                    this.defaultFontOverride_ = fontOverride;
                } else {
                    this.defaultFontOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.newBuilder(this.defaultFontOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a) fontOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride disclaimerTextOverride) {
                return DEFAULT_INSTANCE.createBuilder(disclaimerTextOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setDefaultFontOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride) {
                this.defaultFontOverride_ = fontOverride;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class FontOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride DEFAULT_INSTANCE;
            public static final int FONT_COLOR_FIELD_NUMBER = 4;
            public static final int FONT_FAMILY_FIELD_NUMBER = 1;
            public static final int FONT_SIZE_FIELD_NUMBER = 3;
            public static final int FONT_WEIGHT_FIELD_NUMBER = 2;
            public static final int HYPERLINK_FONT_FIELD_NUMBER = 6;
            public static final int LINE_HEIGHT_FIELD_NUMBER = 5;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride> PARSER;
            private int bitField0_;
            private com.google.protobuf.StringValue fontColor_;
            private int fontFamily_;
            private com.google.protobuf.Int64Value fontSize_;
            private com.google.protobuf.Int64Value fontWeight_;
            private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride hyperlinkFont_;
            private com.google.protobuf.Int64Value lineHeight_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride();
                DEFAULT_INSTANCE = fontOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.class, fontOverride);
            }

            private FontOverride() {
            }

            private void clearFontColor() {
                this.fontColor_ = null;
                this.bitField0_ &= -5;
            }

            private void clearFontFamily() {
                this.fontFamily_ = 0;
            }

            private void clearFontSize() {
                this.fontSize_ = null;
                this.bitField0_ &= -3;
            }

            private void clearFontWeight() {
                this.fontWeight_ = null;
                this.bitField0_ &= -2;
            }

            private void clearHyperlinkFont() {
                this.hyperlinkFont_ = null;
                this.bitField0_ &= -17;
            }

            private void clearLineHeight() {
                this.lineHeight_ = null;
                this.bitField0_ &= -9;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setFontFamily(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d dVar) {
                this.fontFamily_ = dVar.getNumber();
            }

            private void setFontFamilyValue(int i) {
                this.fontFamily_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new java.lang.Object[]{"bitField0_", "fontFamily_", "fontWeight_", "fontSize_", "fontColor_", "lineHeight_", "hyperlinkFont_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.class) {
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

            public final com.google.protobuf.StringValue getFontColor() {
                com.google.protobuf.StringValue stringValue = this.fontColor_;
                return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
            }

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d getFontFamily() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d forNumber = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.forNumber(this.fontFamily_);
                return forNumber == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.UNRECOGNIZED : forNumber;
            }

            public final int getFontFamilyValue() {
                return this.fontFamily_;
            }

            public final com.google.protobuf.Int64Value getFontSize() {
                com.google.protobuf.Int64Value int64Value = this.fontSize_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final com.google.protobuf.Int64Value getFontWeight() {
                com.google.protobuf.Int64Value int64Value = this.fontWeight_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride getHyperlinkFont() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride hyperlinkFontOverride = this.hyperlinkFont_;
                return hyperlinkFontOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.getDefaultInstance() : hyperlinkFontOverride;
            }

            public final com.google.protobuf.Int64Value getLineHeight() {
                com.google.protobuf.Int64Value int64Value = this.lineHeight_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final boolean hasFontColor() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasFontSize() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasFontWeight() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasHyperlinkFont() {
                return (this.bitField0_ & 16) != 0;
            }

            public final boolean hasLineHeight() {
                return (this.bitField0_ & 8) != 0;
            }

            private void mergeFontColor(com.google.protobuf.StringValue stringValue) {
                com.google.protobuf.StringValue stringValue2 = this.fontColor_;
                if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
                    this.fontColor_ = stringValue;
                } else {
                    this.fontColor_ = com.google.protobuf.StringValue.newBuilder(this.fontColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeFontSize(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.fontSize_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.fontSize_ = int64Value;
                } else {
                    this.fontSize_ = com.google.protobuf.Int64Value.newBuilder(this.fontSize_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeFontWeight(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.fontWeight_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.fontWeight_ = int64Value;
                } else {
                    this.fontWeight_ = com.google.protobuf.Int64Value.newBuilder(this.fontWeight_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeHyperlinkFont(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride hyperlinkFontOverride) {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride hyperlinkFontOverride2 = this.hyperlinkFont_;
                if (hyperlinkFontOverride2 == null || hyperlinkFontOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.getDefaultInstance()) {
                    this.hyperlinkFont_ = hyperlinkFontOverride;
                } else {
                    this.hyperlinkFont_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.newBuilder(this.hyperlinkFont_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.a) hyperlinkFontOverride).buildPartial();
                }
                this.bitField0_ |= 16;
            }

            private void mergeLineHeight(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.lineHeight_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.lineHeight_ = int64Value;
                } else {
                    this.lineHeight_ = com.google.protobuf.Int64Value.newBuilder(this.lineHeight_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride) {
                return DEFAULT_INSTANCE.createBuilder(fontOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setFontColor(com.google.protobuf.StringValue stringValue) {
                this.fontColor_ = stringValue;
                this.bitField0_ |= 4;
            }

            private void setFontSize(com.google.protobuf.Int64Value int64Value) {
                this.fontSize_ = int64Value;
                this.bitField0_ |= 2;
            }

            private void setFontWeight(com.google.protobuf.Int64Value int64Value) {
                this.fontWeight_ = int64Value;
                this.bitField0_ |= 1;
            }

            private void setHyperlinkFont(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride hyperlinkFontOverride) {
                this.hyperlinkFont_ = hyperlinkFontOverride;
                this.bitField0_ |= 16;
            }

            private void setLineHeight(com.google.protobuf.Int64Value int64Value) {
                this.lineHeight_ = int64Value;
                this.bitField0_ |= 8;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class HeaderTextOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int DEFAULT_FONT_OVERRIDE_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride defaultFontOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride headerTextOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride();
                DEFAULT_INSTANCE = headerTextOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.class, headerTextOverride);
            }

            private HeaderTextOverride() {
            }

            private void clearDefaultFontOverride() {
                this.defaultFontOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "defaultFontOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.class) {
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

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride getDefaultFontOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride = this.defaultFontOverride_;
                return fontOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.getDefaultInstance() : fontOverride;
            }

            public final boolean hasDefaultFontOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeDefaultFontOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride) {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride2 = this.defaultFontOverride_;
                if (fontOverride2 == null || fontOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.getDefaultInstance()) {
                    this.defaultFontOverride_ = fontOverride;
                } else {
                    this.defaultFontOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.newBuilder(this.defaultFontOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride.a) fontOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride headerTextOverride) {
                return DEFAULT_INSTANCE.createBuilder(headerTextOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setDefaultFontOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.FontOverride fontOverride) {
                this.defaultFontOverride_ = fontOverride;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class HeaderTextSpacingOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride DEFAULT_INSTANCE;
            public static final int MARGIN_BOTTOM_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride> PARSER;
            private int bitField0_;
            private com.google.protobuf.Int64Value marginBottom_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride headerTextSpacingOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride();
                DEFAULT_INSTANCE = headerTextSpacingOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.class, headerTextSpacingOverride);
            }

            private HeaderTextSpacingOverride() {
            }

            private void clearMarginBottom() {
                this.marginBottom_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "marginBottom_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.class) {
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

            public final com.google.protobuf.Int64Value getMarginBottom() {
                com.google.protobuf.Int64Value int64Value = this.marginBottom_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final boolean hasMarginBottom() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeMarginBottom(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.marginBottom_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.marginBottom_ = int64Value;
                } else {
                    this.marginBottom_ = com.google.protobuf.Int64Value.newBuilder(this.marginBottom_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride headerTextSpacingOverride) {
                return DEFAULT_INSTANCE.createBuilder(headerTextSpacingOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setMarginBottom(com.google.protobuf.Int64Value int64Value) {
                this.marginBottom_ = int64Value;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class HyperlinkFontOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride DEFAULT_INSTANCE;
            public static final int FONT_COLOR_FIELD_NUMBER = 2;
            public static final int FONT_WEIGHT_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride> PARSER = null;
            public static final int TEXT_DECORATION_FIELD_NUMBER = 3;
            private int bitField0_;
            private com.google.protobuf.StringValue fontColor_;
            private com.google.protobuf.Int64Value fontWeight_;
            private com.google.protobuf.StringValue textDecoration_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride hyperlinkFontOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride();
                DEFAULT_INSTANCE = hyperlinkFontOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.class, hyperlinkFontOverride);
            }

            private HyperlinkFontOverride() {
            }

            private void clearFontColor() {
                this.fontColor_ = null;
                this.bitField0_ &= -3;
            }

            private void clearFontWeight() {
                this.fontWeight_ = null;
                this.bitField0_ &= -2;
            }

            private void clearTextDecoration() {
                this.textDecoration_ = null;
                this.bitField0_ &= -5;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"bitField0_", "fontWeight_", "fontColor_", "textDecoration_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.class) {
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

            public final com.google.protobuf.StringValue getFontColor() {
                com.google.protobuf.StringValue stringValue = this.fontColor_;
                return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
            }

            public final com.google.protobuf.Int64Value getFontWeight() {
                com.google.protobuf.Int64Value int64Value = this.fontWeight_;
                return int64Value == null ? com.google.protobuf.Int64Value.getDefaultInstance() : int64Value;
            }

            public final com.google.protobuf.StringValue getTextDecoration() {
                com.google.protobuf.StringValue stringValue = this.textDecoration_;
                return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
            }

            public final boolean hasFontColor() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasFontWeight() {
                return (this.bitField0_ & 1) != 0;
            }

            public final boolean hasTextDecoration() {
                return (this.bitField0_ & 4) != 0;
            }

            private void mergeFontColor(com.google.protobuf.StringValue stringValue) {
                com.google.protobuf.StringValue stringValue2 = this.fontColor_;
                if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
                    this.fontColor_ = stringValue;
                } else {
                    this.fontColor_ = com.google.protobuf.StringValue.newBuilder(this.fontColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeFontWeight(com.google.protobuf.Int64Value int64Value) {
                com.google.protobuf.Int64Value int64Value2 = this.fontWeight_;
                if (int64Value2 == null || int64Value2 == com.google.protobuf.Int64Value.getDefaultInstance()) {
                    this.fontWeight_ = int64Value;
                } else {
                    this.fontWeight_ = com.google.protobuf.Int64Value.newBuilder(this.fontWeight_).mergeFrom((com.google.protobuf.Int64Value.Builder) int64Value).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            private void mergeTextDecoration(com.google.protobuf.StringValue stringValue) {
                com.google.protobuf.StringValue stringValue2 = this.textDecoration_;
                if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
                    this.textDecoration_ = stringValue;
                } else {
                    this.textDecoration_ = com.google.protobuf.StringValue.newBuilder(this.textDecoration_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride hyperlinkFontOverride) {
                return DEFAULT_INSTANCE.createBuilder(hyperlinkFontOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setFontColor(com.google.protobuf.StringValue stringValue) {
                this.fontColor_ = stringValue;
                this.bitField0_ |= 2;
            }

            private void setFontWeight(com.google.protobuf.Int64Value int64Value) {
                this.fontWeight_ = int64Value;
                this.bitField0_ |= 1;
            }

            private void setTextDecoration(com.google.protobuf.StringValue stringValue) {
                this.textDecoration_ = stringValue;
                this.bitField0_ |= 4;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HyperlinkFontOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class IllustrationOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride DEFAULT_INSTANCE;
            public static final int HIDE_ILLUSTRATIONS_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride> PARSER;
            private int bitField0_;
            private com.google.protobuf.BoolValue hideIllustrations_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride illustrationOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride();
                DEFAULT_INSTANCE = illustrationOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.class, illustrationOverride);
            }

            private IllustrationOverride() {
            }

            private void clearHideIllustrations() {
                this.hideIllustrations_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "hideIllustrations_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.class) {
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

            public final com.google.protobuf.BoolValue getHideIllustrations() {
                com.google.protobuf.BoolValue boolValue = this.hideIllustrations_;
                return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
            }

            public final boolean hasHideIllustrations() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeHideIllustrations(com.google.protobuf.BoolValue boolValue) {
                com.google.protobuf.BoolValue boolValue2 = this.hideIllustrations_;
                if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
                    this.hideIllustrations_ = boolValue;
                } else {
                    this.hideIllustrations_ = com.google.protobuf.BoolValue.newBuilder(this.hideIllustrations_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride illustrationOverride) {
                return DEFAULT_INSTANCE.createBuilder(illustrationOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setHideIllustrations(com.google.protobuf.BoolValue boolValue) {
                this.hideIllustrations_ = boolValue;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class NavigationOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int BACK_ICON_OVERRIDE_FIELD_NUMBER = 1;
            public static final int CLOSE_ICON_OVERRIDE_FIELD_NUMBER = 2;
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride> PARSER;
            private int backIconOverride_;
            private int closeIconOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride navigationOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride();
                DEFAULT_INSTANCE = navigationOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.class, navigationOverride);
            }

            private NavigationOverride() {
            }

            private void clearBackIconOverride() {
                this.backIconOverride_ = 0;
            }

            private void clearCloseIconOverride() {
                this.closeIconOverride_ = 0;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBackIconOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a aVar) {
                this.backIconOverride_ = aVar.getNumber();
            }

            private void setBackIconOverrideValue(int i) {
                this.backIconOverride_ = i;
            }

            private void setCloseIconOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c cVar) {
                this.closeIconOverride_ = cVar.getNumber();
            }

            private void setCloseIconOverrideValue(int i) {
                this.closeIconOverride_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new java.lang.Object[]{"backIconOverride_", "closeIconOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.class) {
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

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a getBackIconOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a forNumber = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.forNumber(this.backIconOverride_);
                return forNumber == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.UNRECOGNIZED : forNumber;
            }

            public final int getBackIconOverrideValue() {
                return this.backIconOverride_;
            }

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c getCloseIconOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c forNumber = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.forNumber(this.closeIconOverride_);
                return forNumber == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.UNRECOGNIZED : forNumber;
            }

            public final int getCloseIconOverrideValue() {
                return this.closeIconOverride_;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride navigationOverride) {
                return DEFAULT_INSTANCE.createBuilder(navigationOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class PrimaryButtonOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int DEFAULT_BUTTON_OVERRIDE_FIELD_NUMBER = 1;
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride defaultButtonOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride primaryButtonOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride();
                DEFAULT_INSTANCE = primaryButtonOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.class, primaryButtonOverride);
            }

            private PrimaryButtonOverride() {
            }

            private void clearDefaultButtonOverride() {
                this.defaultButtonOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "defaultButtonOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.class) {
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

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride getDefaultButtonOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride buttonOverride = this.defaultButtonOverride_;
                return buttonOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.getDefaultInstance() : buttonOverride;
            }

            public final boolean hasDefaultButtonOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeDefaultButtonOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride buttonOverride) {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride buttonOverride2 = this.defaultButtonOverride_;
                if (buttonOverride2 == null || buttonOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.getDefaultInstance()) {
                    this.defaultButtonOverride_ = buttonOverride;
                } else {
                    this.defaultButtonOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.newBuilder(this.defaultButtonOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride.a) buttonOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride primaryButtonOverride) {
                return DEFAULT_INSTANCE.createBuilder(primaryButtonOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setDefaultButtonOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.ButtonOverride buttonOverride) {
                this.defaultButtonOverride_ = buttonOverride;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class SpacingOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride DEFAULT_INSTANCE;
            public static final int HEADER_TEXT_SPACING_OVERRIDE_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride headerTextSpacingOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride spacingOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride();
                DEFAULT_INSTANCE = spacingOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.class, spacingOverride);
            }

            private SpacingOverride() {
            }

            private void clearHeaderTextSpacingOverride() {
                this.headerTextSpacingOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "headerTextSpacingOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.class) {
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

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride getHeaderTextSpacingOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride headerTextSpacingOverride = this.headerTextSpacingOverride_;
                return headerTextSpacingOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.getDefaultInstance() : headerTextSpacingOverride;
            }

            public final boolean hasHeaderTextSpacingOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeHeaderTextSpacingOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride headerTextSpacingOverride) {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride headerTextSpacingOverride2 = this.headerTextSpacingOverride_;
                if (headerTextSpacingOverride2 == null || headerTextSpacingOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.getDefaultInstance()) {
                    this.headerTextSpacingOverride_ = headerTextSpacingOverride;
                } else {
                    this.headerTextSpacingOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.newBuilder(this.headerTextSpacingOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride.a) headerTextSpacingOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride spacingOverride) {
                return DEFAULT_INSTANCE.createBuilder(spacingOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setHeaderTextSpacingOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextSpacingOverride headerTextSpacingOverride) {
                this.headerTextSpacingOverride_ = headerTextSpacingOverride;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class TextInputOverride extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride DEFAULT_INSTANCE;
            public static final int DEFAULT_TEXT_INPUT_OVERRIDE_FIELD_NUMBER = 1;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride> PARSER;
            private int bitField0_;
            private com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride defaultTextInputOverride_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride textInputOverride = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride();
                DEFAULT_INSTANCE = textInputOverride;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.class, textInputOverride);
            }

            private TextInputOverride() {
            }

            private void clearDefaultTextInputOverride() {
                this.defaultTextInputOverride_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride();
                    case 2:
                        return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"bitField0_", "defaultTextInputOverride_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.class) {
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

            public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride getDefaultTextInputOverride() {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride baseTextInputOverride = this.defaultTextInputOverride_;
                return baseTextInputOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.getDefaultInstance() : baseTextInputOverride;
            }

            public final boolean hasDefaultTextInputOverride() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeDefaultTextInputOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride baseTextInputOverride) {
                com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride baseTextInputOverride2 = this.defaultTextInputOverride_;
                if (baseTextInputOverride2 == null || baseTextInputOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.getDefaultInstance()) {
                    this.defaultTextInputOverride_ = baseTextInputOverride;
                } else {
                    this.defaultTextInputOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.newBuilder(this.defaultTextInputOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride.a) baseTextInputOverride).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.a newBuilder(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride textInputOverride) {
                return DEFAULT_INSTANCE.createBuilder(textInputOverride);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setDefaultTextInputOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BaseTextInputOverride baseTextInputOverride) {
                this.defaultTextInputOverride_ = baseTextInputOverride;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public enum a implements com.google.protobuf.Internal.EnumLite {
            BACK_ICON_NO_OVERRIDE(0),
            BACK_ICON_CHEVRON_1(1),
            UNRECOGNIZED(-1);

            public static final int BACK_ICON_CHEVRON_1_VALUE = 1;
            public static final int BACK_ICON_NO_OVERRIDE_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.C0168a b = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.C0168a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6066a;

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$SessionRenderingData$a$a, reason: collision with other inner class name */
            public final class C0168a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.b f6067a = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.forNumber(i) != null;
                }
            }

            a(int i) {
                this.f6066a = i;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a forNumber(int i) {
                if (i == 0) {
                    return BACK_ICON_NO_OVERRIDE;
                }
                if (i != 1) {
                    return null;
                }
                return BACK_ICON_CHEVRON_1;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a.b.f6067a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6066a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.a valueOf(int i) {
                return forNumber(i);
            }
        }

        public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData, com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.b> implements com.google.protobuf.MessageLiteOrBuilder {
            public b() {
                super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData.DEFAULT_INSTANCE);
            }
        }

        public enum c implements com.google.protobuf.Internal.EnumLite {
            CLOSE_ICON_NO_OVERRIDE(0),
            CLOSE_ICON_X_1(1),
            UNRECOGNIZED(-1);

            public static final int CLOSE_ICON_NO_OVERRIDE_VALUE = 0;
            public static final int CLOSE_ICON_X_1_VALUE = 1;
            public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.a b = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6068a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.b f6069a = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.forNumber(i) != null;
                }
            }

            c(int i) {
                this.f6068a = i;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c forNumber(int i) {
                if (i == 0) {
                    return CLOSE_ICON_NO_OVERRIDE;
                }
                if (i != 1) {
                    return null;
                }
                return CLOSE_ICON_X_1;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c.b.f6069a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6068a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.c valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum d implements com.google.protobuf.Internal.EnumLite {
            FONT_FAMILY_NO_OVERRIDE(0),
            FONT_FAMILY_ATHLETICS(1),
            FONT_FAMILY_SCTO_GROTESK_A(2),
            UNRECOGNIZED(-1);

            public static final int FONT_FAMILY_ATHLETICS_VALUE = 1;
            public static final int FONT_FAMILY_NO_OVERRIDE_VALUE = 0;
            public static final int FONT_FAMILY_SCTO_GROTESK_A_VALUE = 2;
            public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.a b = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6070a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.b f6071a = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.forNumber(i) != null;
                }
            }

            d(int i) {
                this.f6070a = i;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d forNumber(int i) {
                if (i == 0) {
                    return FONT_FAMILY_NO_OVERRIDE;
                }
                if (i == 1) {
                    return FONT_FAMILY_ATHLETICS;
                }
                if (i != 2) {
                    return null;
                }
                return FONT_FAMILY_SCTO_GROTESK_A;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d.b.f6071a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6070a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.d valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum e implements com.google.protobuf.Internal.EnumLite {
            NO_OVERRIDE(0),
            LEFT(1),
            UNRECOGNIZED(-1);

            public static final int LEFT_VALUE = 1;
            public static final int NO_OVERRIDE_VALUE = 0;
            public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.a b = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.a();

            /* renamed from: a, reason: collision with root package name */
            public final int f6072a;

            public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e findValueByNumber(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.forNumber(i);
                }
            }

            public static final class b implements com.google.protobuf.Internal.EnumVerifier {

                /* renamed from: a, reason: collision with root package name */
                public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.b f6073a = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.forNumber(i) != null;
                }
            }

            e(int i) {
                this.f6072a = i;
            }

            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e forNumber(int i) {
                if (i == 0) {
                    return NO_OVERRIDE;
                }
                if (i != 1) {
                    return null;
                }
                return LEFT;
            }

            public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e> internalGetValueMap() {
                return b;
            }

            public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
                return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.b.f6073a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f6072a;
                }
                throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData sessionRenderingData = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData();
            DEFAULT_INSTANCE = sessionRenderingData;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData.class, sessionRenderingData);
        }

        private SessionRenderingData() {
        }

        private void clearAppearance() {
            this.appearance_ = 0;
        }

        private void clearBodyTextOverride() {
            this.bodyTextOverride_ = null;
            this.bitField0_ &= -5;
        }

        private void clearDisclaimerTextOverride() {
            this.disclaimerTextOverride_ = null;
            this.bitField0_ &= -9;
        }

        private void clearHeaderTextOverride() {
            this.headerTextOverride_ = null;
            this.bitField0_ &= -3;
        }

        private void clearIllustrationOverride() {
            this.illustrationOverride_ = null;
            this.bitField0_ &= -17;
        }

        private void clearInstantiateWeb3Bridge() {
            this.instantiateWeb3Bridge_ = false;
        }

        private void clearNavigationOverride() {
            this.navigationOverride_ = null;
            this.bitField0_ &= -129;
        }

        private void clearOverlayBackgroundColor() {
            this.overlayBackgroundColor_ = getDefaultInstance().getOverlayBackgroundColor();
        }

        private void clearOverlayBackgroundFooter() {
            this.overlayBackgroundFooter_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPrimaryButtonOverride() {
            this.primaryButtonOverride_ = null;
            this.bitField0_ &= -33;
        }

        private void clearRecaptchaEnterpriseEnabled() {
            this.recaptchaEnterpriseEnabled_ = false;
        }

        private void clearSpacingOverride() {
            this.spacingOverride_ = null;
            this.bitField0_ &= -257;
        }

        private void clearTextAlignmentOverride() {
            this.textAlignmentOverride_ = 0;
        }

        private void clearTextInputOverride() {
            this.textInputOverride_ = null;
            this.bitField0_ &= -65;
        }

        private void clearThreadsInputVariation() {
            this.threadsInputVariation_ = getDefaultInstance().getThreadsInputVariation();
        }

        private void clearUseHaptics() {
            this.useHaptics_ = false;
        }

        private void clearUseHostedLinkUiCustomizations() {
            this.useHostedLinkUiCustomizations_ = false;
        }

        private void clearUseLinkRefresh() {
            this.useLinkRefresh_ = false;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppearance(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c cVar) {
            this.appearance_ = cVar.getNumber();
        }

        private void setAppearanceValue(int i) {
            this.appearance_ = i;
        }

        private void setInstantiateWeb3Bridge(boolean z) {
            this.instantiateWeb3Bridge_ = z;
        }

        private void setOverlayBackgroundColorBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.overlayBackgroundColor_ = byteString.toStringUtf8();
        }

        private void setRecaptchaEnterpriseEnabled(boolean z) {
            this.recaptchaEnterpriseEnabled_ = z;
        }

        private void setTextAlignmentOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e eVar) {
            this.textAlignmentOverride_ = eVar.getNumber();
        }

        private void setTextAlignmentOverrideValue(int i) {
            this.textAlignmentOverride_ = i;
        }

        private void setThreadsInputVariationBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.threadsInputVariation_ = byteString.toStringUtf8();
        }

        private void setUseHaptics(boolean z) {
            this.useHaptics_ = z;
        }

        private void setUseHostedLinkUiCustomizations(boolean z) {
            this.useHostedLinkUiCustomizations_ = z;
        }

        private void setUseLinkRefresh(boolean z) {
            this.useLinkRefresh_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.api.g.f6085a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData();
                case 2:
                    return new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.b();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u0007\u0005\u0007\u0006\f\u0007\u0007\b\u0007\t\f\nဉ\u0001\u000bဉ\u0004\fဉ\u0005\rȈ\u000eဉ\u0006\u000fဉ\u0002\u0010ဉ\u0003\u0011\u0007\u0012ဉ\u0007\u0013ဉ\b", new java.lang.Object[]{"bitField0_", "overlayBackgroundFooter_", "overlayBackgroundColor_", "recaptchaEnterpriseEnabled_", "instantiateWeb3Bridge_", "appearance_", "useLinkRefresh_", "useHostedLinkUiCustomizations_", "textAlignmentOverride_", "headerTextOverride_", "illustrationOverride_", "primaryButtonOverride_", "threadsInputVariation_", "textInputOverride_", "bodyTextOverride_", "disclaimerTextOverride_", "useHaptics_", "navigationOverride_", "spacingOverride_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData.class) {
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

        public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c getAppearance() {
            com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c.forNumber(this.appearance_);
            return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c.UNRECOGNIZED : forNumber;
        }

        public final int getAppearanceValue() {
            return this.appearance_;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride getBodyTextOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride bodyTextOverride = this.bodyTextOverride_;
            return bodyTextOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.getDefaultInstance() : bodyTextOverride;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride getDisclaimerTextOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride disclaimerTextOverride = this.disclaimerTextOverride_;
            return disclaimerTextOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.getDefaultInstance() : disclaimerTextOverride;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride getHeaderTextOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride headerTextOverride = this.headerTextOverride_;
            return headerTextOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.getDefaultInstance() : headerTextOverride;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride getIllustrationOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride illustrationOverride = this.illustrationOverride_;
            return illustrationOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.getDefaultInstance() : illustrationOverride;
        }

        public final boolean getInstantiateWeb3Bridge() {
            return this.instantiateWeb3Bridge_;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride getNavigationOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride navigationOverride = this.navigationOverride_;
            return navigationOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.getDefaultInstance() : navigationOverride;
        }

        public final java.lang.String getOverlayBackgroundColor() {
            return this.overlayBackgroundColor_;
        }

        public final com.google.protobuf.ByteString getOverlayBackgroundColorBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.overlayBackgroundColor_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString getOverlayBackgroundFooter() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString = this.overlayBackgroundFooter_;
            return common$AttributedLocalizedString == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride getPrimaryButtonOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride primaryButtonOverride = this.primaryButtonOverride_;
            return primaryButtonOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.getDefaultInstance() : primaryButtonOverride;
        }

        public final boolean getRecaptchaEnterpriseEnabled() {
            return this.recaptchaEnterpriseEnabled_;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride getSpacingOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride spacingOverride = this.spacingOverride_;
            return spacingOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.getDefaultInstance() : spacingOverride;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e getTextAlignmentOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e forNumber = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.forNumber(this.textAlignmentOverride_);
            return forNumber == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.e.UNRECOGNIZED : forNumber;
        }

        public final int getTextAlignmentOverrideValue() {
            return this.textAlignmentOverride_;
        }

        public final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride getTextInputOverride() {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride textInputOverride = this.textInputOverride_;
            return textInputOverride == null ? com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.getDefaultInstance() : textInputOverride;
        }

        public final java.lang.String getThreadsInputVariation() {
            return this.threadsInputVariation_;
        }

        public final com.google.protobuf.ByteString getThreadsInputVariationBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.threadsInputVariation_);
        }

        public final boolean getUseHaptics() {
            return this.useHaptics_;
        }

        public final boolean getUseHostedLinkUiCustomizations() {
            return this.useHostedLinkUiCustomizations_;
        }

        public final boolean getUseLinkRefresh() {
            return this.useLinkRefresh_;
        }

        public final boolean hasBodyTextOverride() {
            return (this.bitField0_ & 4) != 0;
        }

        public final boolean hasDisclaimerTextOverride() {
            return (this.bitField0_ & 8) != 0;
        }

        public final boolean hasHeaderTextOverride() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasIllustrationOverride() {
            return (this.bitField0_ & 16) != 0;
        }

        public final boolean hasNavigationOverride() {
            return (this.bitField0_ & 128) != 0;
        }

        public final boolean hasOverlayBackgroundFooter() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasPrimaryButtonOverride() {
            return (this.bitField0_ & 32) != 0;
        }

        public final boolean hasSpacingOverride() {
            return (this.bitField0_ & 256) != 0;
        }

        public final boolean hasTextInputOverride() {
            return (this.bitField0_ & 64) != 0;
        }

        private void mergeBodyTextOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride bodyTextOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride bodyTextOverride2 = this.bodyTextOverride_;
            if (bodyTextOverride2 == null || bodyTextOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.getDefaultInstance()) {
                this.bodyTextOverride_ = bodyTextOverride;
            } else {
                this.bodyTextOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.newBuilder(this.bodyTextOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride.a) bodyTextOverride).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeDisclaimerTextOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride disclaimerTextOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride disclaimerTextOverride2 = this.disclaimerTextOverride_;
            if (disclaimerTextOverride2 == null || disclaimerTextOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.getDefaultInstance()) {
                this.disclaimerTextOverride_ = disclaimerTextOverride;
            } else {
                this.disclaimerTextOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.newBuilder(this.disclaimerTextOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride.a) disclaimerTextOverride).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeHeaderTextOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride headerTextOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride headerTextOverride2 = this.headerTextOverride_;
            if (headerTextOverride2 == null || headerTextOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.getDefaultInstance()) {
                this.headerTextOverride_ = headerTextOverride;
            } else {
                this.headerTextOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.newBuilder(this.headerTextOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride.a) headerTextOverride).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeIllustrationOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride illustrationOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride illustrationOverride2 = this.illustrationOverride_;
            if (illustrationOverride2 == null || illustrationOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.getDefaultInstance()) {
                this.illustrationOverride_ = illustrationOverride;
            } else {
                this.illustrationOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.newBuilder(this.illustrationOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride.a) illustrationOverride).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeNavigationOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride navigationOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride navigationOverride2 = this.navigationOverride_;
            if (navigationOverride2 == null || navigationOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.getDefaultInstance()) {
                this.navigationOverride_ = navigationOverride;
            } else {
                this.navigationOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.newBuilder(this.navigationOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride.a) navigationOverride).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeOverlayBackgroundFooter(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.overlayBackgroundFooter_;
            if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.getDefaultInstance()) {
                this.overlayBackgroundFooter_ = common$AttributedLocalizedString;
            } else {
                this.overlayBackgroundFooter_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.newBuilder(this.overlayBackgroundFooter_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergePrimaryButtonOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride primaryButtonOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride primaryButtonOverride2 = this.primaryButtonOverride_;
            if (primaryButtonOverride2 == null || primaryButtonOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.getDefaultInstance()) {
                this.primaryButtonOverride_ = primaryButtonOverride;
            } else {
                this.primaryButtonOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.newBuilder(this.primaryButtonOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride.a) primaryButtonOverride).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeSpacingOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride spacingOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride spacingOverride2 = this.spacingOverride_;
            if (spacingOverride2 == null || spacingOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.getDefaultInstance()) {
                this.spacingOverride_ = spacingOverride;
            } else {
                this.spacingOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.newBuilder(this.spacingOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride.a) spacingOverride).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeTextInputOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride textInputOverride) {
            com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride textInputOverride2 = this.textInputOverride_;
            if (textInputOverride2 == null || textInputOverride2 == com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.getDefaultInstance()) {
                this.textInputOverride_ = textInputOverride;
            } else {
                this.textInputOverride_ = com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.newBuilder(this.textInputOverride_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride.a) textInputOverride).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.b newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData sessionRenderingData) {
            return DEFAULT_INSTANCE.createBuilder(sessionRenderingData);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setBodyTextOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.BodyTextOverride bodyTextOverride) {
            this.bodyTextOverride_ = bodyTextOverride;
            this.bitField0_ |= 4;
        }

        private void setDisclaimerTextOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.DisclaimerTextOverride disclaimerTextOverride) {
            this.disclaimerTextOverride_ = disclaimerTextOverride;
            this.bitField0_ |= 8;
        }

        private void setHeaderTextOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.HeaderTextOverride headerTextOverride) {
            this.headerTextOverride_ = headerTextOverride;
            this.bitField0_ |= 2;
        }

        private void setIllustrationOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.IllustrationOverride illustrationOverride) {
            this.illustrationOverride_ = illustrationOverride;
            this.bitField0_ |= 16;
        }

        private void setNavigationOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.NavigationOverride navigationOverride) {
            this.navigationOverride_ = navigationOverride;
            this.bitField0_ |= 128;
        }

        private void setOverlayBackgroundFooter(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString common$AttributedLocalizedString) {
            this.overlayBackgroundFooter_ = common$AttributedLocalizedString;
            this.bitField0_ |= 1;
        }

        private void setPrimaryButtonOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.PrimaryButtonOverride primaryButtonOverride) {
            this.primaryButtonOverride_ = primaryButtonOverride;
            this.bitField0_ |= 32;
        }

        private void setSpacingOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.SpacingOverride spacingOverride) {
            this.spacingOverride_ = spacingOverride;
            this.bitField0_ |= 256;
        }

        private void setTextInputOverride(com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.TextInputOverride textInputOverride) {
            this.textInputOverride_ = textInputOverride;
            this.bitField0_ |= 64;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setOverlayBackgroundColor(java.lang.String str) {
            this.overlayBackgroundColor_ = str;
        }

        private void setThreadsInputVariation(java.lang.String str) {
            this.threadsInputVariation_ = str;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum a implements com.google.protobuf.Internal.EnumLite {
        NO_BACKEND_EVENTS(0),
        BACKEND_AND_FRONTEND_EVENTS(1),
        ONLY_BACKEND_EVENTS(2),
        UNRECOGNIZED(-1);

        public static final int BACKEND_AND_FRONTEND_EVENTS_VALUE = 1;
        public static final int NO_BACKEND_EVENTS_VALUE = 0;
        public static final int ONLY_BACKEND_EVENTS_VALUE = 2;
        public static final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a.C0169a b = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a.C0169a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6074a;

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse$a$a, reason: collision with other inner class name */
        public final class C0169a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.a.b f6075a = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.a.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a.forNumber(i) != null;
            }
        }

        a(int i) {
            this.f6074a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a forNumber(int i) {
            if (i == 0) {
                return NO_BACKEND_EVENTS;
            }
            if (i == 1) {
                return BACKEND_AND_FRONTEND_EVENTS;
            }
            if (i != 2) {
                return null;
            }
            return ONLY_BACKEND_EVENTS;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.a.b.f6075a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6074a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse, com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.b> implements com.google.protobuf.MessageLiteOrBuilder {
        public b() {
            super(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.DEFAULT_INSTANCE);
        }
    }

    public enum c implements com.google.protobuf.Internal.EnumLite {
        MOBILE_SDK_LOG_LEVEL_UNKNOWN(0),
        MOBILE_SDK_LOG_LEVEL_NONE(1),
        MOBILE_SDK_LOG_LEVEL_ERRORS_ONLY(2),
        MOBILE_SDK_LOG_LEVEL_ALL(3),
        UNRECOGNIZED(-1);

        public static final int MOBILE_SDK_LOG_LEVEL_ALL_VALUE = 3;
        public static final int MOBILE_SDK_LOG_LEVEL_ERRORS_ONLY_VALUE = 2;
        public static final int MOBILE_SDK_LOG_LEVEL_NONE_VALUE = 1;
        public static final int MOBILE_SDK_LOG_LEVEL_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.c.a b = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.c.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6076a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.c.b f6077a = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.c.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c.forNumber(i) != null;
            }
        }

        c(int i) {
            this.f6076a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c forNumber(int i) {
            if (i == 0) {
                return MOBILE_SDK_LOG_LEVEL_UNKNOWN;
            }
            if (i == 1) {
                return MOBILE_SDK_LOG_LEVEL_NONE;
            }
            if (i == 2) {
                return MOBILE_SDK_LOG_LEVEL_ERRORS_ONLY;
            }
            if (i != 3) {
                return null;
            }
            return MOBILE_SDK_LOG_LEVEL_ALL;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.c.b.f6077a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6076a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum d implements com.google.protobuf.Internal.EnumLite {
        TD_CONFIGURATION_UNKNOWN(0),
        TD_CONFIGURATION_RUN_ON_OPEN(1),
        TD_CONFIGURATION_RUN_IMMEDIATELY(2),
        UNRECOGNIZED(-1);

        public static final int TD_CONFIGURATION_RUN_IMMEDIATELY_VALUE = 2;
        public static final int TD_CONFIGURATION_RUN_ON_OPEN_VALUE = 1;
        public static final int TD_CONFIGURATION_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.d.a b = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.d.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6078a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d findValueByNumber(int i) {
                return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.d.b f6079a = new com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.d.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d.forNumber(i) != null;
            }
        }

        d(int i) {
            this.f6078a = i;
        }

        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d forNumber(int i) {
            if (i == 0) {
                return TD_CONFIGURATION_UNKNOWN;
            }
            if (i == 1) {
                return TD_CONFIGURATION_RUN_ON_OPEN;
            }
            if (i != 2) {
                return null;
            }
            return TD_CONFIGURATION_RUN_IMMEDIATELY;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.d.b.f6079a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6078a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse = new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse();
        DEFAULT_INSTANCE = workflow$LinkWorkflowStartResponse;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.class, workflow$LinkWorkflowStartResponse);
    }

    private Workflow$LinkWorkflowStartResponse() {
    }

    private void addAllAdditionalPanes(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> iterable) {
        ensureAdditionalPanesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.additionalPanes_);
    }

    private void clearAdditionalPanes() {
        this.additionalPanes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAndroidSmsVerificationApiType() {
        this.androidSmsVerificationApiType_ = 0;
    }

    private void clearContinuationToken() {
        this.continuationToken_ = getDefaultInstance().getContinuationToken();
    }

    private void clearErrorTrackingMetadata() {
        this.errorTrackingMetadata_ = null;
        this.bitField0_ &= -33;
    }

    private void clearEvents() {
        this.events_ = null;
        this.bitField0_ &= -3;
    }

    private void clearHeartbeatConfiguration() {
        this.heartbeatConfiguration_ = null;
        this.bitField0_ &= -17;
    }

    private void clearMobileSdkLogLevel() {
        this.mobileSdkLogLevel_ = 0;
    }

    private void clearNextPane() {
        this.nextPane_ = null;
        this.bitField0_ &= -2;
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearSendBackendEvents() {
        this.sendBackendEvents_ = 0;
    }

    private void clearSessionRenderingData() {
        this.sessionRenderingData_ = null;
        this.bitField0_ &= -9;
    }

    private void clearTdRunConfiguration() {
        this.tdRunConfiguration_ = 0;
    }

    private void clearWebviewFallback() {
        this.webviewFallback_ = null;
        this.bitField0_ &= -5;
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

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdditionalPanes(int i) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.remove(i);
    }

    private void setAndroidSmsVerificationApiType(com.plaid.internal.core.protos.link.workflow.primitives.f fVar) {
        this.androidSmsVerificationApiType_ = fVar.getNumber();
    }

    private void setAndroidSmsVerificationApiTypeValue(int i) {
        this.androidSmsVerificationApiType_ = i;
    }

    private void setContinuationTokenBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.continuationToken_ = byteString.toStringUtf8();
    }

    private void setMobileSdkLogLevel(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c cVar) {
        this.mobileSdkLogLevel_ = cVar.getNumber();
    }

    private void setMobileSdkLogLevelValue(int i) {
        this.mobileSdkLogLevel_ = i;
    }

    private void setRequestIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setSendBackendEvents(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a aVar) {
        this.sendBackendEvents_ = aVar.getNumber();
    }

    private void setSendBackendEventsValue(int i) {
        this.sendBackendEvents_ = i;
    }

    private void setTdRunConfiguration(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d dVar) {
        this.tdRunConfiguration_ = dVar.getNumber();
    }

    private void setTdRunConfigurationValue(int i) {
        this.tdRunConfiguration_ = i;
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
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse();
            case 2:
                return new com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004Ȉ\u0005ဉ\u0001\u0006Ȉ\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\f\f\r\f\u000e\f\u000f\f", new java.lang.Object[]{"bitField0_", "workflowSessionId_", "nextPane_", "additionalPanes_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.class, "requestId_", "events_", "continuationToken_", "webviewFallback_", "sessionRenderingData_", "heartbeatConfiguration_", "errorTrackingMetadata_", "sendBackendEvents_", "androidSmsVerificationApiType_", "tdRunConfiguration_", "mobileSdkLogLevel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.f getAndroidSmsVerificationApiType() {
        com.plaid.internal.core.protos.link.workflow.primitives.f forNumber = com.plaid.internal.core.protos.link.workflow.primitives.f.forNumber(this.androidSmsVerificationApiType_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.f.UNRECOGNIZED : forNumber;
    }

    public final int getAndroidSmsVerificationApiTypeValue() {
        return this.androidSmsVerificationApiType_;
    }

    public final java.lang.String getContinuationToken() {
        return this.continuationToken_;
    }

    public final com.google.protobuf.ByteString getContinuationTokenBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.continuationToken_);
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata getErrorTrackingMetadata() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata errorTrackingMetadata = this.errorTrackingMetadata_;
        return errorTrackingMetadata == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata.getDefaultInstance() : errorTrackingMetadata;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events getEvents() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events = this.events_;
        return events == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events.getDefaultInstance() : events;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration getHeartbeatConfiguration() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration heartbeatConfiguration = this.heartbeatConfiguration_;
        return heartbeatConfiguration == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration.getDefaultInstance() : heartbeatConfiguration;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c getMobileSdkLogLevel() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c forNumber = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c.forNumber(this.mobileSdkLogLevel_);
        return forNumber == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.c.UNRECOGNIZED : forNumber;
    }

    public final int getMobileSdkLogLevelValue() {
        return this.mobileSdkLogLevel_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering getNextPane() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering = this.nextPane_;
        return pane$PaneRendering == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.getDefaultInstance() : pane$PaneRendering;
    }

    public final java.lang.String getRequestId() {
        return this.requestId_;
    }

    public final com.google.protobuf.ByteString getRequestIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.requestId_);
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a getSendBackendEvents() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a forNumber = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a.forNumber(this.sendBackendEvents_);
        return forNumber == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.a.UNRECOGNIZED : forNumber;
    }

    public final int getSendBackendEventsValue() {
        return this.sendBackendEvents_;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData getSessionRenderingData() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData sessionRenderingData = this.sessionRenderingData_;
        return sessionRenderingData == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData.getDefaultInstance() : sessionRenderingData;
    }

    public final com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d getTdRunConfiguration() {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d forNumber = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d.forNumber(this.tdRunConfiguration_);
        return forNumber == null ? com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.d.UNRECOGNIZED : forNumber;
    }

    public final int getTdRunConfigurationValue() {
        return this.tdRunConfiguration_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback getWebviewFallback() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback = this.webviewFallback_;
        return common$WebviewFallback == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.getDefaultInstance() : common$WebviewFallback;
    }

    public final java.lang.String getWorkflowSessionId() {
        return this.workflowSessionId_;
    }

    public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
    }

    public final boolean hasErrorTrackingMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasEvents() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasHeartbeatConfiguration() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasNextPane() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasSessionRenderingData() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasWebviewFallback() {
        return (this.bitField0_ & 4) != 0;
    }

    private void addAdditionalPanes(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(pane$PaneRendering);
    }

    private void mergeErrorTrackingMetadata(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata errorTrackingMetadata) {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata errorTrackingMetadata2 = this.errorTrackingMetadata_;
        if (errorTrackingMetadata2 == null || errorTrackingMetadata2 == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata.getDefaultInstance()) {
            this.errorTrackingMetadata_ = errorTrackingMetadata;
        } else {
            this.errorTrackingMetadata_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata.newBuilder(this.errorTrackingMetadata_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.ErrorTrackingMetadata.a) errorTrackingMetadata).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeEvents(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events) {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events2 = this.events_;
        if (events2 == null || events2 == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events.getDefaultInstance()) {
            this.events_ = events;
        } else {
            this.events_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events.newBuilder(this.events_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.Events.a) events).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeHeartbeatConfiguration(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration heartbeatConfiguration) {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration heartbeatConfiguration2 = this.heartbeatConfiguration_;
        if (heartbeatConfiguration2 == null || heartbeatConfiguration2 == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration.getDefaultInstance()) {
            this.heartbeatConfiguration_ = heartbeatConfiguration;
        } else {
            this.heartbeatConfiguration_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration.newBuilder(this.heartbeatConfiguration_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.HeartbeatConfiguration.a) heartbeatConfiguration).buildPartial();
        }
        this.bitField0_ |= 16;
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

    private void mergeSessionRenderingData(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData sessionRenderingData) {
        com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData sessionRenderingData2 = this.sessionRenderingData_;
        if (sessionRenderingData2 == null || sessionRenderingData2 == com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData.getDefaultInstance()) {
            this.sessionRenderingData_ = sessionRenderingData;
        } else {
            this.sessionRenderingData_ = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData.newBuilder(this.sessionRenderingData_).mergeFrom((com.plaid.internal.core.protos.link.api.Workflow.LinkWorkflowStartResponse.SessionRenderingData.b) sessionRenderingData).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeWebviewFallback(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback2 = this.webviewFallback_;
        if (common$WebviewFallback2 == null || common$WebviewFallback2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.getDefaultInstance()) {
            this.webviewFallback_ = common$WebviewFallback;
        } else {
            this.webviewFallback_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.newBuilder(this.webviewFallback_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.a) common$WebviewFallback).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.b newBuilder(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse workflow$LinkWorkflowStartResponse) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowStartResponse);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAdditionalPanes(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.set(i, pane$PaneRendering);
    }

    private void setErrorTrackingMetadata(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.ErrorTrackingMetadata errorTrackingMetadata) {
        this.errorTrackingMetadata_ = errorTrackingMetadata;
        this.bitField0_ |= 32;
    }

    private void setEvents(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.Events events) {
        this.events_ = events;
        this.bitField0_ |= 2;
    }

    private void setHeartbeatConfiguration(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.HeartbeatConfiguration heartbeatConfiguration) {
        this.heartbeatConfiguration_ = heartbeatConfiguration;
        this.bitField0_ |= 16;
    }

    private void setNextPane(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        this.nextPane_ = pane$PaneRendering;
        this.bitField0_ |= 1;
    }

    private void setSessionRenderingData(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse.SessionRenderingData sessionRenderingData) {
        this.sessionRenderingData_ = sessionRenderingData;
        this.bitField0_ |= 8;
    }

    private void setWebviewFallback(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback) {
        this.webviewFallback_ = common$WebviewFallback;
        this.bitField0_ |= 4;
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
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

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addAdditionalPanes(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        ensureAdditionalPanesIsMutable();
        this.additionalPanes_.add(i, pane$PaneRendering);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
