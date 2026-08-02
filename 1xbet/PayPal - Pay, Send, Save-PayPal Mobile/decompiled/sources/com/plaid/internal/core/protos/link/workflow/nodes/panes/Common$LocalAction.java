package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$LocalAction extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.B {
    public static final int ALSO_SUBMIT_ACTION_FIELD_NUMBER = 5;
    public static final int AUTHORIZE_FINANCEKIT_FIELD_NUMBER = 15;
    public static final int AUTOMATIC_HANDOFF_UNSUPPORTED_INSTITUTION_FIELD_NUMBER = 14;
    public static final int CALL_PHONE_NUMBER_FIELD_NUMBER = 3;
    public static final int CLOSE_LINK_FROM_HOSTED_LINK_SECURITY_MODAL_FIELD_NUMBER = 19;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction DEFAULT_INSTANCE;
    public static final int EMBEDDED_SESSION_HANDOFF_FIELD_NUMBER = 22;
    public static final int EMIT_SDK_INTERNAL_EVENT_FIELD_NUMBER = 11;
    public static final int EVENT_METADATA_FIELD_NUMBER = 13;
    public static final int EXECUTE_RECAPTCHA_ENTERPRISE_FIELD_NUMBER = 9;
    public static final int FOCUS_INPUT_FIELD_NUMBER = 8;
    public static final int GO_BACK_FIELD_NUMBER = 7;
    public static final int HANDOFF_UNSUPPORTED_INSTITUTION_FIELD_NUMBER = 12;
    public static final int HIDE_MODAL_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_TO_URL_FIELD_NUMBER = 2;
    public static final int OOPWV_CLOSE_FIELD_NUMBER = 17;
    public static final int OOPWV_OPEN_FIELD_NUMBER = 16;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> PARSER = null;
    public static final int SDK_EVENT_FIELD_NUMBER = 10;
    public static final int SFPC_REQUEST_FIELD_NUMBER = 18;
    public static final int SHOW_MODAL_FIELD_NUMBER = 4;
    public static final int TRIGGER_ACTION_FIELD_NUMBER = 21;
    public static final int TRIGGER_HAPTIC_FIELD_NUMBER = 20;
    private java.lang.Object action_;
    private boolean alsoSubmitAction_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata eventMetadata_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent sdkEvent_;
    private int actionCase_ = 0;
    private java.lang.String id_ = "";

    public static final class EmbeddedSessionHandoff extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EmbeddedSessionHandoff.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 2;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff> PARSER = null;
        public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
        private java.lang.String workflowSessionId_ = "";
        private java.lang.String continuationToken_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EmbeddedSessionHandoff.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff embeddedSessionHandoff = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff();
            DEFAULT_INSTANCE = embeddedSessionHandoff;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff.class, embeddedSessionHandoff);
        }

        private EmbeddedSessionHandoff() {
        }

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        private void clearWorkflowSessionId() {
            this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EmbeddedSessionHandoff.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EmbeddedSessionHandoff.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"workflowSessionId_", "continuationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff.class) {
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

        public final java.lang.String getWorkflowSessionId() {
            return this.workflowSessionId_;
        }

        public final com.google.protobuf.ByteString getWorkflowSessionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.workflowSessionId_);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EmbeddedSessionHandoff.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff embeddedSessionHandoff) {
            return DEFAULT_INSTANCE.createBuilder(embeddedSessionHandoff);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setContinuationToken(java.lang.String str) {
            this.continuationToken_ = str;
        }

        private void setWorkflowSessionId(java.lang.String str) {
            this.workflowSessionId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EventMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EventMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata DEFAULT_INSTANCE;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata> PARSER;
        private java.lang.String institutionId_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EventMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata eventMetadata = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata();
            DEFAULT_INSTANCE = eventMetadata;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata.class, eventMetadata);
        }

        private EventMetadata() {
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EventMetadata.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setInstitutionIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EventMetadata.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"institutionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata.class) {
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

        public final java.lang.String getInstitutionId() {
            return this.institutionId_;
        }

        public final com.google.protobuf.ByteString getInstitutionIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.institutionId_);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EventMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata eventMetadata) {
            return DEFAULT_INSTANCE.createBuilder(eventMetadata);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setInstitutionId(java.lang.String str) {
            this.institutionId_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OopwvClose extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvClose.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose> PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        private java.lang.String url_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvClose.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose oopwvClose = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose();
            DEFAULT_INSTANCE = oopwvClose;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose.class, oopwvClose);
        }

        private OopwvClose() {
        }

        private void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvClose.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setUrlBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvClose.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose.class) {
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

        public final java.lang.String getUrl() {
            return this.url_;
        }

        public final com.google.protobuf.ByteString getUrlBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.url_);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvClose.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose oopwvClose) {
            return DEFAULT_INSTANCE.createBuilder(oopwvClose);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setUrl(java.lang.String str) {
            this.url_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OopwvOpen extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int ANDROID_CALLBACKS_FIELD_NUMBER = 6;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen DEFAULT_INSTANCE;
        public static final int IOS_CALLBACKS_FIELD_NUMBER = 5;
        public static final int LEGACY_EVENTS_CHANNEL_INFO_FIELD_NUMBER = 7;
        public static final int OPEN_MESSAGE_FIELD_NUMBER = 2;
        public static final int OPEN_URL_FIELD_NUMBER = 3;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen> PARSER;
        private int bitField0_;
        private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo legacyEventsChannelInfo_;
        private com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage openMessage_;
        private java.lang.Object openTo_;
        private java.lang.Object submitCallbacks_;
        private int openToCase_ = 0;
        private int submitCallbacksCase_ = 0;

        public static final class AndroidCallbacks extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks> PARSER = null;
            public static final int SUBMIT_OUTPUT_ON_CANCEL_FIELD_NUMBER = 2;
            public static final int SUBMIT_OUTPUT_ON_FINISH_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.google.protobuf.Any submitOutputOnCancel_;
            private com.google.protobuf.Any submitOutputOnFinish_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks androidCallbacks = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks();
                DEFAULT_INSTANCE = androidCallbacks;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.class, androidCallbacks);
            }

            private AndroidCallbacks() {
            }

            private void clearSubmitOutputOnCancel() {
                this.submitOutputOnCancel_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSubmitOutputOnFinish() {
                this.submitOutputOnFinish_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"bitField0_", "submitOutputOnFinish_", "submitOutputOnCancel_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.class) {
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

            public final com.google.protobuf.Any getSubmitOutputOnCancel() {
                com.google.protobuf.Any any = this.submitOutputOnCancel_;
                return any == null ? com.google.protobuf.Any.getDefaultInstance() : any;
            }

            public final com.google.protobuf.Any getSubmitOutputOnFinish() {
                com.google.protobuf.Any any = this.submitOutputOnFinish_;
                return any == null ? com.google.protobuf.Any.getDefaultInstance() : any;
            }

            public final boolean hasSubmitOutputOnCancel() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasSubmitOutputOnFinish() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeSubmitOutputOnCancel(com.google.protobuf.Any any) {
                com.google.protobuf.Any any2 = this.submitOutputOnCancel_;
                if (any2 == null || any2 == com.google.protobuf.Any.getDefaultInstance()) {
                    this.submitOutputOnCancel_ = any;
                } else {
                    this.submitOutputOnCancel_ = com.google.protobuf.Any.newBuilder(this.submitOutputOnCancel_).mergeFrom((com.google.protobuf.Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeSubmitOutputOnFinish(com.google.protobuf.Any any) {
                com.google.protobuf.Any any2 = this.submitOutputOnFinish_;
                if (any2 == null || any2 == com.google.protobuf.Any.getDefaultInstance()) {
                    this.submitOutputOnFinish_ = any;
                } else {
                    this.submitOutputOnFinish_ = com.google.protobuf.Any.newBuilder(this.submitOutputOnFinish_).mergeFrom((com.google.protobuf.Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks androidCallbacks) {
                return DEFAULT_INSTANCE.createBuilder(androidCallbacks);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setSubmitOutputOnCancel(com.google.protobuf.Any any) {
                this.submitOutputOnCancel_ = any;
                this.bitField0_ |= 2;
            }

            private void setSubmitOutputOnFinish(com.google.protobuf.Any any) {
                this.submitOutputOnFinish_ = any;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class IosCallbacks extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.a> implements com.google.protobuf.MessageLiteOrBuilder {
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks> PARSER = null;
            public static final int SUBMIT_OUTPUT_ON_CANCEL_FIELD_NUMBER = 3;
            public static final int SUBMIT_OUTPUT_ON_DECLINE_OPEN_SESSION_ONLY_FIELD_NUMBER = 2;
            public static final int SUBMIT_OUTPUT_ON_FINISH_FIELD_NUMBER = 1;
            private int bitField0_;
            private com.google.protobuf.Any submitOutputOnCancel_;
            private com.google.protobuf.Any submitOutputOnDeclineOpenSessionOnly_;
            private com.google.protobuf.Any submitOutputOnFinish_;

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks iosCallbacks = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks();
                DEFAULT_INSTANCE = iosCallbacks;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.class, iosCallbacks);
            }

            private IosCallbacks() {
            }

            private void clearSubmitOutputOnCancel() {
                this.submitOutputOnCancel_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSubmitOutputOnDeclineOpenSessionOnly() {
                this.submitOutputOnDeclineOpenSessionOnly_ = null;
                this.bitField0_ &= -3;
            }

            private void clearSubmitOutputOnFinish() {
                this.submitOutputOnFinish_ = null;
                this.bitField0_ &= -2;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"bitField0_", "submitOutputOnFinish_", "submitOutputOnDeclineOpenSessionOnly_", "submitOutputOnCancel_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.class) {
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

            public final com.google.protobuf.Any getSubmitOutputOnCancel() {
                com.google.protobuf.Any any = this.submitOutputOnCancel_;
                return any == null ? com.google.protobuf.Any.getDefaultInstance() : any;
            }

            public final com.google.protobuf.Any getSubmitOutputOnDeclineOpenSessionOnly() {
                com.google.protobuf.Any any = this.submitOutputOnDeclineOpenSessionOnly_;
                return any == null ? com.google.protobuf.Any.getDefaultInstance() : any;
            }

            public final com.google.protobuf.Any getSubmitOutputOnFinish() {
                com.google.protobuf.Any any = this.submitOutputOnFinish_;
                return any == null ? com.google.protobuf.Any.getDefaultInstance() : any;
            }

            public final boolean hasSubmitOutputOnCancel() {
                return (this.bitField0_ & 4) != 0;
            }

            public final boolean hasSubmitOutputOnDeclineOpenSessionOnly() {
                return (this.bitField0_ & 2) != 0;
            }

            public final boolean hasSubmitOutputOnFinish() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeSubmitOutputOnCancel(com.google.protobuf.Any any) {
                com.google.protobuf.Any any2 = this.submitOutputOnCancel_;
                if (any2 == null || any2 == com.google.protobuf.Any.getDefaultInstance()) {
                    this.submitOutputOnCancel_ = any;
                } else {
                    this.submitOutputOnCancel_ = com.google.protobuf.Any.newBuilder(this.submitOutputOnCancel_).mergeFrom((com.google.protobuf.Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSubmitOutputOnDeclineOpenSessionOnly(com.google.protobuf.Any any) {
                com.google.protobuf.Any any2 = this.submitOutputOnDeclineOpenSessionOnly_;
                if (any2 == null || any2 == com.google.protobuf.Any.getDefaultInstance()) {
                    this.submitOutputOnDeclineOpenSessionOnly_ = any;
                } else {
                    this.submitOutputOnDeclineOpenSessionOnly_ = com.google.protobuf.Any.newBuilder(this.submitOutputOnDeclineOpenSessionOnly_).mergeFrom((com.google.protobuf.Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            private void mergeSubmitOutputOnFinish(com.google.protobuf.Any any) {
                com.google.protobuf.Any any2 = this.submitOutputOnFinish_;
                if (any2 == null || any2 == com.google.protobuf.Any.getDefaultInstance()) {
                    this.submitOutputOnFinish_ = any;
                } else {
                    this.submitOutputOnFinish_ = com.google.protobuf.Any.newBuilder(this.submitOutputOnFinish_).mergeFrom((com.google.protobuf.Any.Builder) any).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks iosCallbacks) {
                return DEFAULT_INSTANCE.createBuilder(iosCallbacks);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            private void setSubmitOutputOnCancel(com.google.protobuf.Any any) {
                this.submitOutputOnCancel_ = any;
                this.bitField0_ |= 4;
            }

            private void setSubmitOutputOnDeclineOpenSessionOnly(com.google.protobuf.Any any) {
                this.submitOutputOnDeclineOpenSessionOnly_ = any;
                this.bitField0_ |= 2;
            }

            private void setSubmitOutputOnFinish(com.google.protobuf.Any any) {
                this.submitOutputOnFinish_ = any;
                this.bitField0_ |= 1;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LegacyEventsChannelInfo extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public static final int CHANNEL_ID_FIELD_NUMBER = 1;
            public static final int CHANNEL_SECRET_FIELD_NUMBER = 2;
            private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo DEFAULT_INSTANCE;
            private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo> PARSER;
            private java.lang.String channelId_ = "";
            private java.lang.String channelSecret_ = "";

            public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.a> implements com.google.protobuf.MessageLiteOrBuilder {
                public a() {
                    super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.DEFAULT_INSTANCE);
                }
            }

            static {
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo legacyEventsChannelInfo = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo();
                DEFAULT_INSTANCE = legacyEventsChannelInfo;
                com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.class, legacyEventsChannelInfo);
            }

            private LegacyEventsChannelInfo() {
            }

            private void clearChannelId() {
                this.channelId_ = getDefaultInstance().getChannelId();
            }

            private void clearChannelSecret() {
                this.channelSecret_ = getDefaultInstance().getChannelSecret();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseDelimitedFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(java.nio.ByteBuffer byteBuffer) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setChannelIdBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.channelId_ = byteString.toStringUtf8();
            }

            private void setChannelSecretBytes(com.google.protobuf.ByteString byteString) {
                com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
                this.channelSecret_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
                com.google.protobuf.Parser parser;
                switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo();
                    case 2:
                        return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.a();
                    case 3:
                        return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"channelId_", "channelSecret_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo> parser2 = PARSER;
                        if (parser2 != null) {
                            return parser2;
                        }
                        synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.class) {
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

            public final java.lang.String getChannelId() {
                return this.channelId_;
            }

            public final com.google.protobuf.ByteString getChannelIdBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.channelId_);
            }

            public final java.lang.String getChannelSecret() {
                return this.channelSecret_;
            }

            public final com.google.protobuf.ByteString getChannelSecretBytes() {
                return com.google.protobuf.ByteString.copyFromUtf8(this.channelSecret_);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo legacyEventsChannelInfo) {
                return DEFAULT_INSTANCE.createBuilder(legacyEventsChannelInfo);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(com.google.protobuf.ByteString byteString) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            private void setChannelId(java.lang.String str) {
                this.channelId_ = str;
            }

            private void setChannelSecret(java.lang.String str) {
                this.channelSecret_ = str;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(byte[] bArr) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(java.io.InputStream inputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
                return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen.DEFAULT_INSTANCE);
            }
        }

        public enum b {
            OPEN_URL(3),
            OPENTO_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6133a;

            b(int i) {
                this.f6133a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.b forNumber(int i) {
                if (i == 0) {
                    return OPENTO_NOT_SET;
                }
                if (i != 3) {
                    return null;
                }
                return OPEN_URL;
            }

            public final int getNumber() {
                return this.f6133a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.b valueOf(int i) {
                return forNumber(i);
            }
        }

        public enum c {
            IOS_CALLBACKS(5),
            ANDROID_CALLBACKS(6),
            SUBMITCALLBACKS_NOT_SET(0);


            /* renamed from: a, reason: collision with root package name */
            public final int f6134a;

            c(int i) {
                this.f6134a = i;
            }

            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.c forNumber(int i) {
                if (i == 0) {
                    return SUBMITCALLBACKS_NOT_SET;
                }
                if (i == 5) {
                    return IOS_CALLBACKS;
                }
                if (i != 6) {
                    return null;
                }
                return ANDROID_CALLBACKS;
            }

            public final int getNumber() {
                return this.f6134a;
            }

            @java.lang.Deprecated
            public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.c valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen oopwvOpen = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen();
            DEFAULT_INSTANCE = oopwvOpen;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen.class, oopwvOpen);
        }

        private OopwvOpen() {
        }

        private void clearAndroidCallbacks() {
            if (this.submitCallbacksCase_ == 6) {
                this.submitCallbacksCase_ = 0;
                this.submitCallbacks_ = null;
            }
        }

        private void clearIosCallbacks() {
            if (this.submitCallbacksCase_ == 5) {
                this.submitCallbacksCase_ = 0;
                this.submitCallbacks_ = null;
            }
        }

        private void clearLegacyEventsChannelInfo() {
            this.legacyEventsChannelInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearOpenMessage() {
            this.openMessage_ = null;
            this.bitField0_ &= -2;
        }

        private void clearOpenTo() {
            this.openToCase_ = 0;
            this.openTo_ = null;
        }

        private void clearOpenUrl() {
            if (this.openToCase_ == 3) {
                this.openToCase_ = 0;
                this.openTo_ = null;
            }
        }

        private void clearSubmitCallbacks() {
            this.submitCallbacksCase_ = 0;
            this.submitCallbacks_ = null;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setOpenUrlBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.openTo_ = byteString.toStringUtf8();
            this.openToCase_ = 3;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0002\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002ဉ\u0000\u0003Ȼ\u0000\u0005<\u0001\u0006<\u0001\u0007ဉ\u0001", new java.lang.Object[]{"openTo_", "openToCase_", "submitCallbacks_", "submitCallbacksCase_", "bitField0_", "openMessage_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.class, "legacyEventsChannelInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen.class) {
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

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks getAndroidCallbacks() {
            return this.submitCallbacksCase_ == 6 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) this.submitCallbacks_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks getIosCallbacks() {
            return this.submitCallbacksCase_ == 5 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) this.submitCallbacks_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.getDefaultInstance();
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo getLegacyEventsChannelInfo() {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo legacyEventsChannelInfo = this.legacyEventsChannelInfo_;
            return legacyEventsChannelInfo == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.getDefaultInstance() : legacyEventsChannelInfo;
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage getOpenMessage() {
            com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage = this.openMessage_;
            return oauthInitializationOptions$MobileSdkUrlOpenMessage == null ? com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance() : oauthInitializationOptions$MobileSdkUrlOpenMessage;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.b getOpenToCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.b.forNumber(this.openToCase_);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.c getSubmitCallbacksCase() {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.c.forNumber(this.submitCallbacksCase_);
        }

        public final boolean hasAndroidCallbacks() {
            return this.submitCallbacksCase_ == 6;
        }

        public final boolean hasIosCallbacks() {
            return this.submitCallbacksCase_ == 5;
        }

        public final boolean hasLegacyEventsChannelInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public final boolean hasOpenMessage() {
            return (this.bitField0_ & 1) != 0;
        }

        public final boolean hasOpenUrl() {
            return this.openToCase_ == 3;
        }

        private void mergeAndroidCallbacks(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks androidCallbacks) {
            if (this.submitCallbacksCase_ != 6 || this.submitCallbacks_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.getDefaultInstance()) {
                this.submitCallbacks_ = androidCallbacks;
            } else {
                this.submitCallbacks_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks) this.submitCallbacks_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks.a) androidCallbacks).buildPartial();
            }
            this.submitCallbacksCase_ = 6;
        }

        private void mergeIosCallbacks(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks iosCallbacks) {
            if (this.submitCallbacksCase_ != 5 || this.submitCallbacks_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.getDefaultInstance()) {
                this.submitCallbacks_ = iosCallbacks;
            } else {
                this.submitCallbacks_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks) this.submitCallbacks_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks.a) iosCallbacks).buildPartial();
            }
            this.submitCallbacksCase_ = 5;
        }

        private void mergeLegacyEventsChannelInfo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo legacyEventsChannelInfo) {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo legacyEventsChannelInfo2 = this.legacyEventsChannelInfo_;
            if (legacyEventsChannelInfo2 == null || legacyEventsChannelInfo2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.getDefaultInstance()) {
                this.legacyEventsChannelInfo_ = legacyEventsChannelInfo;
            } else {
                this.legacyEventsChannelInfo_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.newBuilder(this.legacyEventsChannelInfo_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo.a) legacyEventsChannelInfo).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeOpenMessage(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
            com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage2 = this.openMessage_;
            if (oauthInitializationOptions$MobileSdkUrlOpenMessage2 == null || oauthInitializationOptions$MobileSdkUrlOpenMessage2 == com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance()) {
                this.openMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
            } else {
                this.openMessage_ = com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.newBuilder(this.openMessage_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.a) oauthInitializationOptions$MobileSdkUrlOpenMessage).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen oopwvOpen) {
            return DEFAULT_INSTANCE.createBuilder(oopwvOpen);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        private void setAndroidCallbacks(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.AndroidCallbacks androidCallbacks) {
            this.submitCallbacks_ = androidCallbacks;
            this.submitCallbacksCase_ = 6;
        }

        private void setIosCallbacks(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.IosCallbacks iosCallbacks) {
            this.submitCallbacks_ = iosCallbacks;
            this.submitCallbacksCase_ = 5;
        }

        private void setLegacyEventsChannelInfo(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.LegacyEventsChannelInfo legacyEventsChannelInfo) {
            this.legacyEventsChannelInfo_ = legacyEventsChannelInfo;
            this.bitField0_ |= 2;
        }

        private void setOpenMessage(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
            this.openMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
            this.bitField0_ |= 1;
        }

        private void setOpenUrl(java.lang.String str) {
            this.openToCase_ = 3;
            this.openTo_ = str;
        }

        public final java.lang.String getOpenUrl() {
            return this.openToCase_ == 3 ? (java.lang.String) this.openTo_ : "";
        }

        public final com.google.protobuf.ByteString getOpenUrlBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.openToCase_ == 3 ? (java.lang.String) this.openTo_ : "");
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SfpcRequest extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.SfpcRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 1;
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest> PARSER;
        private java.lang.String continuationToken_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.SfpcRequest.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest sfpcRequest = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest();
            DEFAULT_INSTANCE = sfpcRequest;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest.class, sfpcRequest);
        }

        private SfpcRequest() {
        }

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.SfpcRequest.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContinuationTokenBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.continuationToken_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.SfpcRequest.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"continuationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest.class) {
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

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.SfpcRequest.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest sfpcRequest) {
            return DEFAULT_INSTANCE.createBuilder(sfpcRequest);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setContinuationToken(java.lang.String str) {
            this.continuationToken_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public enum a {
        NAVIGATE_TO_URL(2),
        CALL_PHONE_NUMBER(3),
        SHOW_MODAL(4),
        HIDE_MODAL(6),
        GO_BACK(7),
        FOCUS_INPUT(8),
        EXECUTE_RECAPTCHA_ENTERPRISE(9),
        EMIT_SDK_INTERNAL_EVENT(11),
        HANDOFF_UNSUPPORTED_INSTITUTION(12),
        AUTOMATIC_HANDOFF_UNSUPPORTED_INSTITUTION(14),
        AUTHORIZE_FINANCEKIT(15),
        OOPWV_OPEN(16),
        OOPWV_CLOSE(17),
        SFPC_REQUEST(18),
        CLOSE_LINK_FROM_HOSTED_LINK_SECURITY_MODAL(19),
        TRIGGER_ACTION(21),
        TRIGGER_HAPTIC(20),
        EMBEDDED_SESSION_HANDOFF(22),
        ACTION_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6135a;

        a(int i) {
            this.f6135a = i;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.a forNumber(int i) {
            switch (i) {
                case 0:
                    return ACTION_NOT_SET;
                case 1:
                case 5:
                case 10:
                case 13:
                default:
                    return null;
                case 2:
                    return NAVIGATE_TO_URL;
                case 3:
                    return CALL_PHONE_NUMBER;
                case 4:
                    return SHOW_MODAL;
                case 6:
                    return HIDE_MODAL;
                case 7:
                    return GO_BACK;
                case 8:
                    return FOCUS_INPUT;
                case 9:
                    return EXECUTE_RECAPTCHA_ENTERPRISE;
                case 11:
                    return EMIT_SDK_INTERNAL_EVENT;
                case 12:
                    return HANDOFF_UNSUPPORTED_INSTITUTION;
                case 14:
                    return AUTOMATIC_HANDOFF_UNSUPPORTED_INSTITUTION;
                case 15:
                    return AUTHORIZE_FINANCEKIT;
                case 16:
                    return OOPWV_OPEN;
                case 17:
                    return OOPWV_CLOSE;
                case 18:
                    return SFPC_REQUEST;
                case 19:
                    return CLOSE_LINK_FROM_HOSTED_LINK_SECURITY_MODAL;
                case 20:
                    return TRIGGER_HAPTIC;
                case 21:
                    return TRIGGER_ACTION;
                case 22:
                    return EMBEDDED_SESSION_HANDOFF;
            }
        }

        public final int getNumber() {
            return this.f6135a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.a valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class b extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.B {
        public b() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction();
        DEFAULT_INSTANCE = common$LocalAction;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.class, common$LocalAction);
    }

    private Common$LocalAction() {
    }

    private void clearAction() {
        this.actionCase_ = 0;
        this.action_ = null;
    }

    private void clearAlsoSubmitAction() {
        this.alsoSubmitAction_ = false;
    }

    private void clearAuthorizeFinancekit() {
        if (this.actionCase_ == 15) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearAutomaticHandoffUnsupportedInstitution() {
        if (this.actionCase_ == 14) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearCallPhoneNumber() {
        if (this.actionCase_ == 3) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearCloseLinkFromHostedLinkSecurityModal() {
        if (this.actionCase_ == 19) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearEmbeddedSessionHandoff() {
        if (this.actionCase_ == 22) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearEmitSdkInternalEvent() {
        if (this.actionCase_ == 11) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearEventMetadata() {
        this.eventMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearExecuteRecaptchaEnterprise() {
        if (this.actionCase_ == 9) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearFocusInput() {
        if (this.actionCase_ == 8) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearGoBack() {
        if (this.actionCase_ == 7) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearHandoffUnsupportedInstitution() {
        if (this.actionCase_ == 12) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearHideModal() {
        if (this.actionCase_ == 6) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearNavigateToUrl() {
        if (this.actionCase_ == 2) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearOopwvClose() {
        if (this.actionCase_ == 17) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearOopwvOpen() {
        if (this.actionCase_ == 16) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearSdkEvent() {
        this.sdkEvent_ = null;
        this.bitField0_ &= -3;
    }

    private void clearSfpcRequest() {
        if (this.actionCase_ == 18) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearShowModal() {
        if (this.actionCase_ == 4) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearTriggerAction() {
        if (this.actionCase_ == 21) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    private void clearTriggerHaptic() {
        if (this.actionCase_ == 20) {
            this.actionCase_ = 0;
            this.action_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlsoSubmitAction(boolean z) {
        this.alsoSubmitAction_ = z;
    }

    private void setAuthorizeFinancekit(boolean z) {
        this.actionCase_ = 15;
        this.action_ = java.lang.Boolean.valueOf(z);
    }

    private void setAutomaticHandoffUnsupportedInstitutionBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 14;
    }

    private void setCallPhoneNumberBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 3;
    }

    private void setCloseLinkFromHostedLinkSecurityModal(boolean z) {
        this.actionCase_ = 19;
        this.action_ = java.lang.Boolean.valueOf(z);
    }

    private void setExecuteRecaptchaEnterprise(boolean z) {
        this.actionCase_ = 9;
        this.action_ = java.lang.Boolean.valueOf(z);
    }

    private void setFocusInputBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 8;
    }

    private void setGoBack(boolean z) {
        this.actionCase_ = 7;
        this.action_ = java.lang.Boolean.valueOf(z);
    }

    private void setHandoffUnsupportedInstitutionBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 12;
    }

    private void setHideModal(boolean z) {
        this.actionCase_ = 6;
        this.action_ = java.lang.Boolean.valueOf(z);
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setNavigateToUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.action_ = byteString.toStringUtf8();
        this.actionCase_ = 2;
    }

    private void setTriggerHaptic(com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z enumC0499z) {
        this.action_ = java.lang.Integer.valueOf(enumC0499z.getNumber());
        this.actionCase_ = 20;
    }

    private void setTriggerHapticValue(int i) {
        this.actionCase_ = 20;
        this.action_ = java.lang.Integer.valueOf(i);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0001\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005\u0007\u0006:\u0000\u0007:\u0000\bȻ\u0000\t:\u0000\nဉ\u0001\u000b<\u0000\fȻ\u0000\rဉ\u0000\u000eȻ\u0000\u000f:\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013:\u0000\u0014?\u0000\u0015<\u0000\u0016<\u0000", new java.lang.Object[]{"action_", "actionCase_", "bitField0_", "id_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.class, "alsoSubmitAction_", "sdkEvent_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.class, "eventMetadata_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest.class, com.google.protobuf.Any.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.a getActionCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.a.forNumber(this.actionCase_);
    }

    public final boolean getAlsoSubmitAction() {
        return this.alsoSubmitAction_;
    }

    public final boolean getAuthorizeFinancekit() {
        if (this.actionCase_ == 15) {
            return ((java.lang.Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public final boolean getCloseLinkFromHostedLinkSecurityModal() {
        if (this.actionCase_ == 19) {
            return ((java.lang.Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff getEmbeddedSessionHandoff() {
        return this.actionCase_ == 22 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent getEmitSdkInternalEvent() {
        return this.actionCase_ == 11 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata getEventMetadata() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata eventMetadata = this.eventMetadata_;
        return eventMetadata == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata.getDefaultInstance() : eventMetadata;
    }

    public final boolean getExecuteRecaptchaEnterprise() {
        if (this.actionCase_ == 9) {
            return ((java.lang.Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public final boolean getGoBack() {
        if (this.actionCase_ == 7) {
            return ((java.lang.Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public final boolean getHideModal() {
        if (this.actionCase_ == 6) {
            return ((java.lang.Boolean) this.action_).booleanValue();
        }
        return false;
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose getOopwvClose() {
        return this.actionCase_ == 17 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen getOopwvOpen() {
        return this.actionCase_ == 16 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent getSdkEvent() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent = this.sdkEvent_;
        return common$SDKEvent == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance() : common$SDKEvent;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest getSfpcRequest() {
        return this.actionCase_ == 18 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal getShowModal() {
        return this.actionCase_ == 4 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) this.action_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.getDefaultInstance();
    }

    public final com.google.protobuf.Any getTriggerAction() {
        return this.actionCase_ == 21 ? (com.google.protobuf.Any) this.action_ : com.google.protobuf.Any.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z getTriggerHaptic() {
        if (this.actionCase_ != 20) {
            return com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.HAPTIC_TYPE_UNKNOWN;
        }
        com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.forNumber(((java.lang.Integer) this.action_).intValue());
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.EnumC0499z.UNRECOGNIZED : forNumber;
    }

    public final int getTriggerHapticValue() {
        if (this.actionCase_ == 20) {
            return ((java.lang.Integer) this.action_).intValue();
        }
        return 0;
    }

    public final boolean hasAuthorizeFinancekit() {
        return this.actionCase_ == 15;
    }

    public final boolean hasAutomaticHandoffUnsupportedInstitution() {
        return this.actionCase_ == 14;
    }

    public final boolean hasCallPhoneNumber() {
        return this.actionCase_ == 3;
    }

    public final boolean hasCloseLinkFromHostedLinkSecurityModal() {
        return this.actionCase_ == 19;
    }

    public final boolean hasEmbeddedSessionHandoff() {
        return this.actionCase_ == 22;
    }

    public final boolean hasEmitSdkInternalEvent() {
        return this.actionCase_ == 11;
    }

    public final boolean hasEventMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasExecuteRecaptchaEnterprise() {
        return this.actionCase_ == 9;
    }

    public final boolean hasFocusInput() {
        return this.actionCase_ == 8;
    }

    public final boolean hasGoBack() {
        return this.actionCase_ == 7;
    }

    public final boolean hasHandoffUnsupportedInstitution() {
        return this.actionCase_ == 12;
    }

    public final boolean hasHideModal() {
        return this.actionCase_ == 6;
    }

    public final boolean hasNavigateToUrl() {
        return this.actionCase_ == 2;
    }

    public final boolean hasOopwvClose() {
        return this.actionCase_ == 17;
    }

    public final boolean hasOopwvOpen() {
        return this.actionCase_ == 16;
    }

    public final boolean hasSdkEvent() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasSfpcRequest() {
        return this.actionCase_ == 18;
    }

    public final boolean hasShowModal() {
        return this.actionCase_ == 4;
    }

    public final boolean hasTriggerAction() {
        return this.actionCase_ == 21;
    }

    public final boolean hasTriggerHaptic() {
        return this.actionCase_ == 20;
    }

    private void mergeEmbeddedSessionHandoff(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff embeddedSessionHandoff) {
        if (this.actionCase_ != 22 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff.getDefaultInstance()) {
            this.action_ = embeddedSessionHandoff;
        } else {
            this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EmbeddedSessionHandoff.a) embeddedSessionHandoff).buildPartial();
        }
        this.actionCase_ = 22;
    }

    private void mergeEmitSdkInternalEvent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent common$SDKInternalEvent) {
        if (this.actionCase_ != 11 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.getDefaultInstance()) {
            this.action_ = common$SDKInternalEvent;
        } else {
            this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent.a) common$SDKInternalEvent).buildPartial();
        }
        this.actionCase_ = 11;
    }

    private void mergeEventMetadata(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata eventMetadata) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata eventMetadata2 = this.eventMetadata_;
        if (eventMetadata2 == null || eventMetadata2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata.getDefaultInstance()) {
            this.eventMetadata_ = eventMetadata;
        } else {
            this.eventMetadata_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata.newBuilder(this.eventMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.EventMetadata.a) eventMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeOopwvClose(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose oopwvClose) {
        if (this.actionCase_ != 17 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose.getDefaultInstance()) {
            this.action_ = oopwvClose;
        } else {
            this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvClose.a) oopwvClose).buildPartial();
        }
        this.actionCase_ = 17;
    }

    private void mergeOopwvOpen(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen oopwvOpen) {
        if (this.actionCase_ != 16 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen.getDefaultInstance()) {
            this.action_ = oopwvOpen;
        } else {
            this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.OopwvOpen.a) oopwvOpen).buildPartial();
        }
        this.actionCase_ = 16;
    }

    private void mergeSdkEvent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent2 = this.sdkEvent_;
        if (common$SDKEvent2 == null || common$SDKEvent2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.getDefaultInstance()) {
            this.sdkEvent_ = common$SDKEvent;
        } else {
            this.sdkEvent_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.newBuilder(this.sdkEvent_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent.a) common$SDKEvent).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeSfpcRequest(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest sfpcRequest) {
        if (this.actionCase_ != 18 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest.getDefaultInstance()) {
            this.action_ = sfpcRequest;
        } else {
            this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.LocalAction.SfpcRequest.a) sfpcRequest).buildPartial();
        }
        this.actionCase_ = 18;
    }

    private void mergeShowModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal) {
        if (this.actionCase_ != 4 || this.action_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.getDefaultInstance()) {
            this.action_ = common$Modal;
        } else {
            this.action_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal) this.action_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal.a) common$Modal).buildPartial();
        }
        this.actionCase_ = 4;
    }

    private void mergeTriggerAction(com.google.protobuf.Any any) {
        if (this.actionCase_ != 21 || this.action_ == com.google.protobuf.Any.getDefaultInstance()) {
            this.action_ = any;
        } else {
            this.action_ = com.google.protobuf.Any.newBuilder((com.google.protobuf.Any) this.action_).mergeFrom((com.google.protobuf.Any.Builder) any).buildPartial();
        }
        this.actionCase_ = 21;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.b newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction common$LocalAction) {
        return DEFAULT_INSTANCE.createBuilder(common$LocalAction);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAutomaticHandoffUnsupportedInstitution(java.lang.String str) {
        this.actionCase_ = 14;
        this.action_ = str;
    }

    private void setCallPhoneNumber(java.lang.String str) {
        this.actionCase_ = 3;
        this.action_ = str;
    }

    private void setEmbeddedSessionHandoff(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EmbeddedSessionHandoff embeddedSessionHandoff) {
        this.action_ = embeddedSessionHandoff;
        this.actionCase_ = 22;
    }

    private void setEmitSdkInternalEvent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent common$SDKInternalEvent) {
        this.action_ = common$SDKInternalEvent;
        this.actionCase_ = 11;
    }

    private void setEventMetadata(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.EventMetadata eventMetadata) {
        this.eventMetadata_ = eventMetadata;
        this.bitField0_ |= 1;
    }

    private void setFocusInput(java.lang.String str) {
        this.actionCase_ = 8;
        this.action_ = str;
    }

    private void setHandoffUnsupportedInstitution(java.lang.String str) {
        this.actionCase_ = 12;
        this.action_ = str;
    }

    private void setNavigateToUrl(java.lang.String str) {
        this.actionCase_ = 2;
        this.action_ = str;
    }

    private void setOopwvClose(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvClose oopwvClose) {
        this.action_ = oopwvClose;
        this.actionCase_ = 17;
    }

    private void setOopwvOpen(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.OopwvOpen oopwvOpen) {
        this.action_ = oopwvOpen;
        this.actionCase_ = 16;
    }

    private void setSdkEvent(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent common$SDKEvent) {
        this.sdkEvent_ = common$SDKEvent;
        this.bitField0_ |= 2;
    }

    private void setSfpcRequest(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction.SfpcRequest sfpcRequest) {
        this.action_ = sfpcRequest;
        this.actionCase_ = 18;
    }

    private void setShowModal(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal common$Modal) {
        this.action_ = common$Modal;
        this.actionCase_ = 4;
    }

    private void setTriggerAction(com.google.protobuf.Any any) {
        this.action_ = any;
        this.actionCase_ = 21;
    }

    public final java.lang.String getAutomaticHandoffUnsupportedInstitution() {
        return this.actionCase_ == 14 ? (java.lang.String) this.action_ : "";
    }

    public final com.google.protobuf.ByteString getAutomaticHandoffUnsupportedInstitutionBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.actionCase_ == 14 ? (java.lang.String) this.action_ : "");
    }

    public final java.lang.String getCallPhoneNumber() {
        return this.actionCase_ == 3 ? (java.lang.String) this.action_ : "";
    }

    public final com.google.protobuf.ByteString getCallPhoneNumberBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.actionCase_ == 3 ? (java.lang.String) this.action_ : "");
    }

    public final java.lang.String getFocusInput() {
        return this.actionCase_ == 8 ? (java.lang.String) this.action_ : "";
    }

    public final com.google.protobuf.ByteString getFocusInputBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.actionCase_ == 8 ? (java.lang.String) this.action_ : "");
    }

    public final java.lang.String getHandoffUnsupportedInstitution() {
        return this.actionCase_ == 12 ? (java.lang.String) this.action_ : "";
    }

    public final com.google.protobuf.ByteString getHandoffUnsupportedInstitutionBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.actionCase_ == 12 ? (java.lang.String) this.action_ : "");
    }

    public final java.lang.String getNavigateToUrl() {
        return this.actionCase_ == 2 ? (java.lang.String) this.action_ : "";
    }

    public final com.google.protobuf.ByteString getNavigateToUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.actionCase_ == 2 ? (java.lang.String) this.action_ : "");
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
