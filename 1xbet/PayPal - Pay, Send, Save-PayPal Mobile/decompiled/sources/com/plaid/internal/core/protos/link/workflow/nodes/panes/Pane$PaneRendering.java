package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Pane$PaneRendering extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.p0 {
    public static final int AUTOMATIC_ACTIONS_FIELD_NUMBER = 6;
    public static final int BUTTON_FIELD_NUMBER = 105;
    public static final int BUTTON_LIST_FIELD_NUMBER = 106;
    public static final int BUTTON_WITH_ACCORDION_FIELD_NUMBER = 107;
    public static final int BUTTON_WITH_CARDS_FIELD_NUMBER = 108;
    public static final int BUTTON_WITH_TABLE_FIELD_NUMBER = 109;
    public static final int BUTTON_WITH_WEBVIEW_FIELD_NUMBER = 110;
    public static final int CHALLENGE_FIELD_NUMBER = 117;
    public static final int CLIENT_SUBMISSION_FIELD_NUMBER = 165;
    public static final int CONSENT_FIELD_NUMBER = 104;
    public static final int CREDENTIALS_FIELD_NUMBER = 103;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering DEFAULT_INSTANCE;
    public static final int FLEXIBLE_FIELD_NUMBER = 128;
    public static final int GRID_SELECTION_FIELD_NUMBER = 114;
    public static final int HEADLESS_O_AUTH_FIELD_NUMBER = 120;
    public static final int IDENTITY_DATA_SHARING_FIELD_NUMBER = 151;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOADING_FIELD_NUMBER = 131;
    public static final int LOGGING_METADATA_FIELD_NUMBER = 5;
    public static final int NAVIGATION_FIELD_NUMBER = 3;
    public static final int OAUTH_FIELD_NUMBER = 115;
    public static final int ORDERED_LIST_FIELD_NUMBER = 116;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> PARSER = null;
    public static final int PRESENTATION_MODE_FIELD_NUMBER = 8;
    public static final int PROFILE_AUTHENTICATION_FIELD_NUMBER = 167;
    public static final int QR_CODE_FIELD_NUMBER = 125;
    public static final int RENDERING_PROPERTY_KEY_FIELD_NUMBER = 100;
    public static final int SANDBOX_MESSAGE_FIELD_NUMBER = 4;
    public static final int SEARCH_AND_SELECT_FIELD_NUMBER = 111;
    public static final int SESSION_HANDOFF_FIELD_NUMBER = 136;
    public static final int SINK_FIELD_NUMBER = 102;
    public static final int SOURCE_FIELD_NUMBER = 101;
    public static final int USER_INPUT_FIELD_NUMBER = 112;
    public static final int USER_SELECTION_FIELD_NUMBER = 113;
    public static final int VARIABLE_HEIGHT_BUTTON_FIELD_NUMBER = 144;
    public static final int VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT_FIELD_NUMBER = 147;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions automaticActions_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata loggingMetadata_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation navigation_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode presentationMode_;
    private java.lang.Object rendering_;
    private int renderingCase_ = 0;
    private java.lang.String id_ = "";
    private java.lang.String paneNodeId_ = "";
    private java.lang.String sandboxMessage_ = "";
    private java.lang.String renderingPropertyKey_ = "";

    public static final class LoggingMetadata extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PaneRendering.LoggingMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata> PARSER = null;
        public static final int TEAM_FIELD_NUMBER = 1;
        private java.lang.String team_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PaneRendering.LoggingMetadata.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata loggingMetadata = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata();
            DEFAULT_INSTANCE = loggingMetadata;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata.class, loggingMetadata);
        }

        private LoggingMetadata() {
        }

        private void clearTeam() {
            this.team_ = getDefaultInstance().getTeam();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PaneRendering.LoggingMetadata.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setTeamBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.team_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PaneRendering.LoggingMetadata.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"team_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata.class) {
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

        public final java.lang.String getTeam() {
            return this.team_;
        }

        public final com.google.protobuf.ByteString getTeamBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.team_);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PaneRendering.LoggingMetadata.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata loggingMetadata) {
            return DEFAULT_INSTANCE.createBuilder(loggingMetadata);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setTeam(java.lang.String str) {
            this.team_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.p0 {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        SOURCE(101),
        SINK(102),
        CREDENTIALS(103),
        CONSENT(104),
        BUTTON(105),
        BUTTON_LIST(106),
        BUTTON_WITH_ACCORDION(107),
        BUTTON_WITH_CARDS(108),
        BUTTON_WITH_TABLE(109),
        BUTTON_WITH_WEBVIEW(110),
        SEARCH_AND_SELECT(111),
        USER_INPUT(112),
        USER_SELECTION(113),
        GRID_SELECTION(114),
        OAUTH(115),
        ORDERED_LIST(116),
        CHALLENGE(117),
        HEADLESS_O_AUTH(120),
        QR_CODE(125),
        FLEXIBLE(128),
        LOADING(131),
        SESSION_HANDOFF(136),
        VARIABLE_HEIGHT_BUTTON(144),
        VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT(147),
        IDENTITY_DATA_SHARING(151),
        CLIENT_SUBMISSION(165),
        PROFILE_AUTHENTICATION(167),
        RENDERING_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6233a;

        b(int i) {
            this.f6233a = i;
        }

        public final int getNumber() {
            return this.f6233a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b valueOf(int i) {
            return forNumber(i);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b forNumber(int i) {
            switch (i) {
                case 0:
                    return RENDERING_NOT_SET;
                case 120:
                    return HEADLESS_O_AUTH;
                case 125:
                    return QR_CODE;
                case 128:
                    return FLEXIBLE;
                case 131:
                    return LOADING;
                case 136:
                    return SESSION_HANDOFF;
                case 144:
                    return VARIABLE_HEIGHT_BUTTON;
                case 147:
                    return VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT;
                case 151:
                    return IDENTITY_DATA_SHARING;
                case 165:
                    return CLIENT_SUBMISSION;
                case 167:
                    return PROFILE_AUTHENTICATION;
                default:
                    switch (i) {
                        case 101:
                            return SOURCE;
                        case 102:
                            return SINK;
                        case 103:
                            return CREDENTIALS;
                        case 104:
                            return CONSENT;
                        case 105:
                            return BUTTON;
                        case 106:
                            return BUTTON_LIST;
                        case 107:
                            return BUTTON_WITH_ACCORDION;
                        case 108:
                            return BUTTON_WITH_CARDS;
                        case 109:
                            return BUTTON_WITH_TABLE;
                        case 110:
                            return BUTTON_WITH_WEBVIEW;
                        case 111:
                            return SEARCH_AND_SELECT;
                        case 112:
                            return USER_INPUT;
                        case 113:
                            return USER_SELECTION;
                        case 114:
                            return GRID_SELECTION;
                        case 115:
                            return OAUTH;
                        case 116:
                            return ORDERED_LIST;
                        case 117:
                            return CHALLENGE;
                        default:
                            return null;
                    }
            }
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering();
        DEFAULT_INSTANCE = pane$PaneRendering;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.class, pane$PaneRendering);
    }

    private Pane$PaneRendering() {
    }

    private void clearAutomaticActions() {
        this.automaticActions_ = null;
        this.bitField0_ &= -9;
    }

    private void clearButton() {
        if (this.renderingCase_ == 105) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonList() {
        if (this.renderingCase_ == 106) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithAccordion() {
        if (this.renderingCase_ == 107) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithCards() {
        if (this.renderingCase_ == 108) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithTable() {
        if (this.renderingCase_ == 109) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearButtonWithWebview() {
        if (this.renderingCase_ == 110) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearChallenge() {
        if (this.renderingCase_ == 117) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearClientSubmission() {
        if (this.renderingCase_ == 165) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearConsent() {
        if (this.renderingCase_ == 104) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearCredentials() {
        if (this.renderingCase_ == 103) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearFlexible() {
        if (this.renderingCase_ == 128) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearGridSelection() {
        if (this.renderingCase_ == 114) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearHeadlessOAuth() {
        if (this.renderingCase_ == 120) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIdentityDataSharing() {
        if (this.renderingCase_ == 151) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearLoading() {
        if (this.renderingCase_ == 131) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearLoggingMetadata() {
        this.loggingMetadata_ = null;
        this.bitField0_ &= -5;
    }

    private void clearNavigation() {
        this.navigation_ = null;
        this.bitField0_ &= -2;
    }

    private void clearOauth() {
        if (this.renderingCase_ == 115) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearOrderedList() {
        if (this.renderingCase_ == 116) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    private void clearPresentationMode() {
        this.presentationMode_ = null;
        this.bitField0_ &= -3;
    }

    private void clearProfileAuthentication() {
        if (this.renderingCase_ == 167) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearQrCode() {
        if (this.renderingCase_ == 125) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearRendering() {
        this.renderingCase_ = 0;
        this.rendering_ = null;
    }

    private void clearRenderingPropertyKey() {
        this.renderingPropertyKey_ = getDefaultInstance().getRenderingPropertyKey();
    }

    private void clearSandboxMessage() {
        this.sandboxMessage_ = getDefaultInstance().getSandboxMessage();
    }

    private void clearSearchAndSelect() {
        if (this.renderingCase_ == 111) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearSessionHandoff() {
        if (this.renderingCase_ == 136) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearSink() {
        if (this.renderingCase_ == 102) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearSource() {
        if (this.renderingCase_ == 101) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearUserInput() {
        if (this.renderingCase_ == 112) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearUserSelection() {
        if (this.renderingCase_ == 113) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearVariableHeightButton() {
        if (this.renderingCase_ == 144) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    private void clearVariableHeightVerificationCodeInput() {
        if (this.renderingCase_ == 147) {
            this.renderingCase_ = 0;
            this.rendering_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setPaneNodeIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    private void setRenderingPropertyKeyBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.renderingPropertyKey_ = byteString.toStringUtf8();
    }

    private void setSandboxMessageBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.sandboxMessage_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000#\u0001\u0001\u0001§#\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0002\u0006ဉ\u0003\bဉ\u0001dȈe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000x<\u0000}<\u0000\u0080<\u0000\u0083<\u0000\u0088<\u0000\u0090<\u0000\u0093<\u0000\u0097<\u0000¥<\u0000§<\u0000", new java.lang.Object[]{"rendering_", "renderingCase_", "bitField0_", "id_", "paneNodeId_", "navigation_", "sandboxMessage_", "loggingMetadata_", "automaticActions_", "presentationMode_", "renderingPropertyKey_", com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions getAutomaticActions() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions pane$AutomaticActions = this.automaticActions_;
        return pane$AutomaticActions == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions.getDefaultInstance() : pane$AutomaticActions;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering getButton() {
        return this.renderingCase_ == 105 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering getButtonList() {
        return this.renderingCase_ == 106 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering getButtonWithAccordion() {
        return this.renderingCase_ == 107 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering getButtonWithCards() {
        return this.renderingCase_ == 108 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering getButtonWithTable() {
        return this.renderingCase_ == 109 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering getButtonWithWebview() {
        return this.renderingCase_ == 110 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering getChallenge() {
        return this.renderingCase_ == 117 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering getClientSubmission() {
        return this.renderingCase_ == 165 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering getConsent() {
        return this.renderingCase_ == 104 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering getCredentials() {
        return this.renderingCase_ == 103 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering getFlexible() {
        return this.renderingCase_ == 128 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering getGridSelection() {
        return this.renderingCase_ == 114 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering getHeadlessOAuth() {
        return this.renderingCase_ == 120 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.getDefaultInstance();
    }

    public final java.lang.String getId() {
        return this.id_;
    }

    public final com.google.protobuf.ByteString getIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering getIdentityDataSharing() {
        return this.renderingCase_ == 151 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering getLoading() {
        return this.renderingCase_ == 131 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata getLoggingMetadata() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata loggingMetadata = this.loggingMetadata_;
        return loggingMetadata == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata.getDefaultInstance() : loggingMetadata;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation getNavigation() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation pane$Navigation = this.navigation_;
        return pane$Navigation == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.getDefaultInstance() : pane$Navigation;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering getOauth() {
        return this.renderingCase_ == 115 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering getOrderedList() {
        return this.renderingCase_ == 116 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering.getDefaultInstance();
    }

    public final java.lang.String getPaneNodeId() {
        return this.paneNodeId_;
    }

    public final com.google.protobuf.ByteString getPaneNodeIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.paneNodeId_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode getPresentationMode() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode pane$PresentationMode = this.presentationMode_;
        return pane$PresentationMode == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.getDefaultInstance() : pane$PresentationMode;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering getProfileAuthentication() {
        return this.renderingCase_ == 167 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering getQrCode() {
        return this.renderingCase_ == 125 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b getRenderingCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.b.forNumber(this.renderingCase_);
    }

    public final java.lang.String getRenderingPropertyKey() {
        return this.renderingPropertyKey_;
    }

    public final com.google.protobuf.ByteString getRenderingPropertyKeyBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.renderingPropertyKey_);
    }

    public final java.lang.String getSandboxMessage() {
        return this.sandboxMessage_;
    }

    public final com.google.protobuf.ByteString getSandboxMessageBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.sandboxMessage_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering getSearchAndSelect() {
        return this.renderingCase_ == 111 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering getSessionHandoff() {
        return this.renderingCase_ == 136 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering getSink() {
        return this.renderingCase_ == 102 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering getSource() {
        return this.renderingCase_ == 101 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering getUserInput() {
        return this.renderingCase_ == 112 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering getUserSelection() {
        return this.renderingCase_ == 113 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering getVariableHeightButton() {
        return this.renderingCase_ == 144 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering getVariableHeightVerificationCodeInput() {
        return this.renderingCase_ == 147 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) this.rendering_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering.getDefaultInstance();
    }

    public final boolean hasAutomaticActions() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasButton() {
        return this.renderingCase_ == 105;
    }

    public final boolean hasButtonList() {
        return this.renderingCase_ == 106;
    }

    public final boolean hasButtonWithAccordion() {
        return this.renderingCase_ == 107;
    }

    public final boolean hasButtonWithCards() {
        return this.renderingCase_ == 108;
    }

    public final boolean hasButtonWithTable() {
        return this.renderingCase_ == 109;
    }

    public final boolean hasButtonWithWebview() {
        return this.renderingCase_ == 110;
    }

    public final boolean hasChallenge() {
        return this.renderingCase_ == 117;
    }

    public final boolean hasClientSubmission() {
        return this.renderingCase_ == 165;
    }

    public final boolean hasConsent() {
        return this.renderingCase_ == 104;
    }

    public final boolean hasCredentials() {
        return this.renderingCase_ == 103;
    }

    public final boolean hasFlexible() {
        return this.renderingCase_ == 128;
    }

    public final boolean hasGridSelection() {
        return this.renderingCase_ == 114;
    }

    public final boolean hasHeadlessOAuth() {
        return this.renderingCase_ == 120;
    }

    public final boolean hasIdentityDataSharing() {
        return this.renderingCase_ == 151;
    }

    public final boolean hasLoading() {
        return this.renderingCase_ == 131;
    }

    public final boolean hasLoggingMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasNavigation() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasOauth() {
        return this.renderingCase_ == 115;
    }

    public final boolean hasOrderedList() {
        return this.renderingCase_ == 116;
    }

    public final boolean hasPresentationMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasProfileAuthentication() {
        return this.renderingCase_ == 167;
    }

    public final boolean hasQrCode() {
        return this.renderingCase_ == 125;
    }

    public final boolean hasSearchAndSelect() {
        return this.renderingCase_ == 111;
    }

    public final boolean hasSessionHandoff() {
        return this.renderingCase_ == 136;
    }

    public final boolean hasSink() {
        return this.renderingCase_ == 102;
    }

    public final boolean hasSource() {
        return this.renderingCase_ == 101;
    }

    public final boolean hasUserInput() {
        return this.renderingCase_ == 112;
    }

    public final boolean hasUserSelection() {
        return this.renderingCase_ == 113;
    }

    public final boolean hasVariableHeightButton() {
        return this.renderingCase_ == 144;
    }

    public final boolean hasVariableHeightVerificationCodeInput() {
        return this.renderingCase_ == 147;
    }

    private void mergeAutomaticActions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions pane$AutomaticActions) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions pane$AutomaticActions2 = this.automaticActions_;
        if (pane$AutomaticActions2 == null || pane$AutomaticActions2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions.getDefaultInstance()) {
            this.automaticActions_ = pane$AutomaticActions;
        } else {
            this.automaticActions_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions.newBuilder(this.automaticActions_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions.a) pane$AutomaticActions).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering rendering) {
        if (this.renderingCase_ != 105 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 105;
    }

    private void mergeButtonList(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering rendering) {
        if (this.renderingCase_ != 106 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass.ButtonListPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 106;
    }

    private void mergeButtonWithAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering rendering) {
        if (this.renderingCase_ != 107 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Rendering.b) rendering).buildPartial();
        }
        this.renderingCase_ = 107;
    }

    private void mergeButtonWithCards(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering rendering) {
        if (this.renderingCase_ != 108 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass.ButtonWithCardsPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 108;
    }

    private void mergeButtonWithTable(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering rendering) {
        if (this.renderingCase_ != 109 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 109;
    }

    private void mergeButtonWithWebview(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering rendering) {
        if (this.renderingCase_ != 110 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass.ButtonWithWebviewPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 110;
    }

    private void mergeChallenge(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering rendering) {
        if (this.renderingCase_ != 117 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 117;
    }

    private void mergeClientSubmission(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering rendering) {
        if (this.renderingCase_ != 165 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Rendering.b) rendering).buildPartial();
        }
        this.renderingCase_ = 165;
    }

    private void mergeConsent(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering rendering) {
        if (this.renderingCase_ != 104 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 104;
    }

    private void mergeCredentials(com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering rendering) {
        if (this.renderingCase_ != 103 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass.CredentialsPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 103;
    }

    private void mergeFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering rendering) {
        if (this.renderingCase_ != 128 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 128;
    }

    private void mergeGridSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering rendering) {
        if (this.renderingCase_ != 114 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 114;
    }

    private void mergeHeadlessOAuth(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        if (this.renderingCase_ != 120 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 120;
    }

    private void mergeIdentityDataSharing(com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering rendering) {
        if (this.renderingCase_ != 151 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass.IdentityDataSharingPane.Rendering.b) rendering).buildPartial();
        }
        this.renderingCase_ = 151;
    }

    private void mergeLoading(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering rendering) {
        if (this.renderingCase_ != 131 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 131;
    }

    private void mergeLoggingMetadata(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata loggingMetadata) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata loggingMetadata2 = this.loggingMetadata_;
        if (loggingMetadata2 == null || loggingMetadata2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata.getDefaultInstance()) {
            this.loggingMetadata_ = loggingMetadata;
        } else {
            this.loggingMetadata_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata.newBuilder(this.loggingMetadata_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane.PaneRendering.LoggingMetadata.a) loggingMetadata).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeNavigation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation pane$Navigation) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation pane$Navigation2 = this.navigation_;
        if (pane$Navigation2 == null || pane$Navigation2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.getDefaultInstance()) {
            this.navigation_ = pane$Navigation;
        } else {
            this.navigation_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.newBuilder(this.navigation_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation.a) pane$Navigation).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeOauth(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering rendering) {
        if (this.renderingCase_ != 115 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 115;
    }

    private void mergeOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering rendering) {
        if (this.renderingCase_ != 116 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 116;
    }

    private void mergePresentationMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode pane$PresentationMode) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode pane$PresentationMode2 = this.presentationMode_;
        if (pane$PresentationMode2 == null || pane$PresentationMode2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.getDefaultInstance()) {
            this.presentationMode_ = pane$PresentationMode;
        } else {
            this.presentationMode_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.newBuilder(this.presentationMode_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode.a) pane$PresentationMode).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeProfileAuthentication(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering rendering) {
        if (this.renderingCase_ != 167 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Rendering.b) rendering).buildPartial();
        }
        this.renderingCase_ = 167;
    }

    private void mergeQrCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering rendering) {
        if (this.renderingCase_ != 125 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane.QRCodePane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 125;
    }

    private void mergeSearchAndSelect(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering rendering) {
        if (this.renderingCase_ != 111 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 111;
    }

    private void mergeSessionHandoff(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering rendering) {
        if (this.renderingCase_ != 136 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 136;
    }

    private void mergeSink(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering rendering) {
        if (this.renderingCase_ != 102 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 102;
    }

    private void mergeSource(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering rendering) {
        if (this.renderingCase_ != 101 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 101;
    }

    private void mergeUserInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering rendering) {
        if (this.renderingCase_ != 112 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass.UserInputPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 112;
    }

    private void mergeUserSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering rendering) {
        if (this.renderingCase_ != 113 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 113;
    }

    private void mergeVariableHeightButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering rendering) {
        if (this.renderingCase_ != 144 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass.VariableHeightButtonPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 144;
    }

    private void mergeVariableHeightVerificationCodeInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering rendering) {
        if (this.renderingCase_ != 147 || this.rendering_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering.getDefaultInstance()) {
            this.rendering_ = rendering;
        } else {
            this.rendering_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering) this.rendering_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Rendering.a) rendering).buildPartial();
        }
        this.renderingCase_ = 147;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering pane$PaneRendering) {
        return DEFAULT_INSTANCE.createBuilder(pane$PaneRendering);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAutomaticActions(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$AutomaticActions pane$AutomaticActions) {
        this.automaticActions_ = pane$AutomaticActions;
        this.bitField0_ |= 8;
    }

    private void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 105;
    }

    private void setButtonList(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 106;
    }

    private void setButtonWithAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 107;
    }

    private void setButtonWithCards(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 108;
    }

    private void setButtonWithTable(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 109;
    }

    private void setButtonWithWebview(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 110;
    }

    private void setChallenge(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 117;
    }

    private void setClientSubmission(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 165;
    }

    private void setConsent(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 104;
    }

    private void setCredentials(com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 103;
    }

    private void setFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 128;
    }

    private void setGridSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 114;
    }

    private void setHeadlessOAuth(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 120;
    }

    private void setIdentityDataSharing(com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 151;
    }

    private void setLoading(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 131;
    }

    private void setLoggingMetadata(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.LoggingMetadata loggingMetadata) {
        this.loggingMetadata_ = loggingMetadata;
        this.bitField0_ |= 4;
    }

    private void setNavigation(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation pane$Navigation) {
        this.navigation_ = pane$Navigation;
        this.bitField0_ |= 1;
    }

    private void setOauth(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 115;
    }

    private void setOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 116;
    }

    private void setPresentationMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PresentationMode pane$PresentationMode) {
        this.presentationMode_ = pane$PresentationMode;
        this.bitField0_ |= 2;
    }

    private void setProfileAuthentication(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 167;
    }

    private void setQrCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 125;
    }

    private void setSearchAndSelect(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 111;
    }

    private void setSessionHandoff(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 136;
    }

    private void setSink(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 102;
    }

    private void setSource(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 101;
    }

    private void setUserInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 112;
    }

    private void setUserSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 113;
    }

    private void setVariableHeightButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 144;
    }

    private void setVariableHeightVerificationCodeInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Rendering rendering) {
        this.rendering_ = rendering;
        this.renderingCase_ = 147;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setId(java.lang.String str) {
        this.id_ = str;
    }

    private void setPaneNodeId(java.lang.String str) {
        this.paneNodeId_ = str;
    }

    private void setRenderingPropertyKey(java.lang.String str) {
        this.renderingPropertyKey_ = str;
    }

    private void setSandboxMessage(java.lang.String str) {
        this.sandboxMessage_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
