package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Pane$PaneOutput extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.o0 {
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
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput DEFAULT_INSTANCE;
    public static final int FLEXIBLE_FIELD_NUMBER = 128;
    public static final int GRID_SELECTION_FIELD_NUMBER = 114;
    public static final int HEADLESS_O_AUTH_FIELD_NUMBER = 120;
    public static final int IDENTITY_DATA_SHARING_FIELD_NUMBER = 151;
    public static final int LOADING_FIELD_NUMBER = 131;
    public static final int OAUTH_FIELD_NUMBER = 115;
    public static final int ORDERED_LIST_FIELD_NUMBER = 116;
    public static final int PANE_NODE_ID_FIELD_NUMBER = 2;
    public static final int PANE_RENDERING_ID_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> PARSER = null;
    public static final int PROFILE_AUTHENTICATION_FIELD_NUMBER = 167;
    public static final int QR_CODE_FIELD_NUMBER = 125;
    public static final int SEARCH_AND_SELECT_FIELD_NUMBER = 111;
    public static final int SESSION_HANDOFF_FIELD_NUMBER = 136;
    public static final int SINK_FIELD_NUMBER = 102;
    public static final int SOURCE_FIELD_NUMBER = 101;
    public static final int USER_INPUT_FIELD_NUMBER = 112;
    public static final int USER_SELECTION_FIELD_NUMBER = 113;
    public static final int VARIABLE_HEIGHT_BUTTON_FIELD_NUMBER = 144;
    public static final int VARIABLE_HEIGHT_VERIFICATION_CODE_INPUT_FIELD_NUMBER = 147;
    private java.lang.Object output_;
    private int outputCase_ = 0;
    private java.lang.String paneRenderingId_ = "";
    private java.lang.String paneNodeId_ = "";

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
        OUTPUT_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        public final int f6232a;

        b(int i) {
            this.f6232a = i;
        }

        public final int getNumber() {
            return this.f6232a;
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.b valueOf(int i) {
            return forNumber(i);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.b forNumber(int i) {
            switch (i) {
                case 0:
                    return OUTPUT_NOT_SET;
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
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput pane$PaneOutput = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput();
        DEFAULT_INSTANCE = pane$PaneOutput;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.class, pane$PaneOutput);
    }

    private Pane$PaneOutput() {
    }

    private void clearButton() {
        if (this.outputCase_ == 105) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonList() {
        if (this.outputCase_ == 106) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithAccordion() {
        if (this.outputCase_ == 107) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithCards() {
        if (this.outputCase_ == 108) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithTable() {
        if (this.outputCase_ == 109) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearButtonWithWebview() {
        if (this.outputCase_ == 110) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearChallenge() {
        if (this.outputCase_ == 117) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearClientSubmission() {
        if (this.outputCase_ == 165) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearConsent() {
        if (this.outputCase_ == 104) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearCredentials() {
        if (this.outputCase_ == 103) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearFlexible() {
        if (this.outputCase_ == 128) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearGridSelection() {
        if (this.outputCase_ == 114) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearHeadlessOAuth() {
        if (this.outputCase_ == 120) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearIdentityDataSharing() {
        if (this.outputCase_ == 151) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearLoading() {
        if (this.outputCase_ == 131) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearOauth() {
        if (this.outputCase_ == 115) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearOrderedList() {
        if (this.outputCase_ == 116) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    private void clearPaneNodeId() {
        this.paneNodeId_ = getDefaultInstance().getPaneNodeId();
    }

    private void clearPaneRenderingId() {
        this.paneRenderingId_ = getDefaultInstance().getPaneRenderingId();
    }

    private void clearProfileAuthentication() {
        if (this.outputCase_ == 167) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearQrCode() {
        if (this.outputCase_ == 125) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSearchAndSelect() {
        if (this.outputCase_ == 111) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSessionHandoff() {
        if (this.outputCase_ == 136) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSink() {
        if (this.outputCase_ == 102) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearSource() {
        if (this.outputCase_ == 101) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearUserInput() {
        if (this.outputCase_ == 112) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearUserSelection() {
        if (this.outputCase_ == 113) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearVariableHeightButton() {
        if (this.outputCase_ == 144) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    private void clearVariableHeightVerificationCodeInput() {
        if (this.outputCase_ == 147) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPaneNodeIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.paneNodeId_ = byteString.toStringUtf8();
    }

    private void setPaneRenderingIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.paneRenderingId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.m0.f6311a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001d\u0001\u0000\u0001§\u001d\u0000\u0000\u0000\u0001Ȉ\u0002Ȉe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000x<\u0000}<\u0000\u0080<\u0000\u0083<\u0000\u0088<\u0000\u0090<\u0000\u0093<\u0000\u0097<\u0000¥<\u0000§<\u0000", new java.lang.Object[]{"output_", "outputCase_", "paneRenderingId_", "paneNodeId_", com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.class, com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions getButton() {
        return this.outputCase_ == 105 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions getButtonList() {
        return this.outputCase_ == 106 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions getButtonWithAccordion() {
        return this.outputCase_ == 107 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions getButtonWithCards() {
        return this.outputCase_ == 108 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions getButtonWithTable() {
        return this.outputCase_ == 109 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions getButtonWithWebview() {
        return this.outputCase_ == 110 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions getChallenge() {
        return this.outputCase_ == 117 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions getClientSubmission() {
        return this.outputCase_ == 165 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions getConsent() {
        return this.outputCase_ == 104 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions getCredentials() {
        return this.outputCase_ == 103 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions getFlexible() {
        return this.outputCase_ == 128 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions getGridSelection() {
        return this.outputCase_ == 114 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions getHeadlessOAuth() {
        return this.outputCase_ == 120 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions getIdentityDataSharing() {
        return this.outputCase_ == 151 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions getLoading() {
        return this.outputCase_ == 131 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions getOauth() {
        return this.outputCase_ == 115 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions getOrderedList() {
        return this.outputCase_ == 116 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.b getOutputCase() {
        return com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.b.forNumber(this.outputCase_);
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

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions getProfileAuthentication() {
        return this.outputCase_ == 167 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions getQrCode() {
        return this.outputCase_ == 125 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions getSearchAndSelect() {
        return this.outputCase_ == 111 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions getSessionHandoff() {
        return this.outputCase_ == 136 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions getSink() {
        return this.outputCase_ == 102 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions getSource() {
        return this.outputCase_ == 101 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions getUserInput() {
        return this.outputCase_ == 112 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions getUserSelection() {
        return this.outputCase_ == 113 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions getVariableHeightButton() {
        return this.outputCase_ == 144 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.getDefaultInstance();
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions getVariableHeightVerificationCodeInput() {
        return this.outputCase_ == 147 ? (com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) this.output_ : com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.getDefaultInstance();
    }

    public final boolean hasButton() {
        return this.outputCase_ == 105;
    }

    public final boolean hasButtonList() {
        return this.outputCase_ == 106;
    }

    public final boolean hasButtonWithAccordion() {
        return this.outputCase_ == 107;
    }

    public final boolean hasButtonWithCards() {
        return this.outputCase_ == 108;
    }

    public final boolean hasButtonWithTable() {
        return this.outputCase_ == 109;
    }

    public final boolean hasButtonWithWebview() {
        return this.outputCase_ == 110;
    }

    public final boolean hasChallenge() {
        return this.outputCase_ == 117;
    }

    public final boolean hasClientSubmission() {
        return this.outputCase_ == 165;
    }

    public final boolean hasConsent() {
        return this.outputCase_ == 104;
    }

    public final boolean hasCredentials() {
        return this.outputCase_ == 103;
    }

    public final boolean hasFlexible() {
        return this.outputCase_ == 128;
    }

    public final boolean hasGridSelection() {
        return this.outputCase_ == 114;
    }

    public final boolean hasHeadlessOAuth() {
        return this.outputCase_ == 120;
    }

    public final boolean hasIdentityDataSharing() {
        return this.outputCase_ == 151;
    }

    public final boolean hasLoading() {
        return this.outputCase_ == 131;
    }

    public final boolean hasOauth() {
        return this.outputCase_ == 115;
    }

    public final boolean hasOrderedList() {
        return this.outputCase_ == 116;
    }

    public final boolean hasProfileAuthentication() {
        return this.outputCase_ == 167;
    }

    public final boolean hasQrCode() {
        return this.outputCase_ == 125;
    }

    public final boolean hasSearchAndSelect() {
        return this.outputCase_ == 111;
    }

    public final boolean hasSessionHandoff() {
        return this.outputCase_ == 136;
    }

    public final boolean hasSink() {
        return this.outputCase_ == 102;
    }

    public final boolean hasSource() {
        return this.outputCase_ == 101;
    }

    public final boolean hasUserInput() {
        return this.outputCase_ == 112;
    }

    public final boolean hasUserSelection() {
        return this.outputCase_ == 113;
    }

    public final boolean hasVariableHeightButton() {
        return this.outputCase_ == 144;
    }

    public final boolean hasVariableHeightVerificationCodeInput() {
        return this.outputCase_ == 147;
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a> implements com.plaid.internal.core.protos.link.workflow.nodes.panes.o0 {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) this.instance).setPaneNodeId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a b(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) this.instance).setPaneRenderingId(str);
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a a(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b bVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) this.instance).setButton(bVar.build());
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a a(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b bVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) this.instance).setButtonWithTable(bVar.build());
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a a(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b bVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) this.instance).setSearchAndSelect(bVar.build());
            return this;
        }

        public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a a(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b bVar) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) this.instance).setHeadlessOAuth(bVar.build());
            return this;
        }
    }

    private void mergeButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions actions) {
        if (this.outputCase_ != 105 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass.ButtonPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 105;
    }

    private void mergeButtonList(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions actions) {
        if (this.outputCase_ != 106 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass.ButtonListPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 106;
    }

    private void mergeButtonWithAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions actions) {
        if (this.outputCase_ != 107 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass.ButtonWithAccordionPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 107;
    }

    private void mergeButtonWithCards(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions actions) {
        if (this.outputCase_ != 108 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass.ButtonWithCardsPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 108;
    }

    private void mergeButtonWithTable(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions actions) {
        if (this.outputCase_ != 109 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass.ButtonWithTablePane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 109;
    }

    private void mergeButtonWithWebview(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions actions) {
        if (this.outputCase_ != 110 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass.ButtonWithWebviewPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 110;
    }

    private void mergeChallenge(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions actions) {
        if (this.outputCase_ != 117 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass.ChallengePane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 117;
    }

    private void mergeClientSubmission(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions actions) {
        if (this.outputCase_ != 165 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass.ClientSubmissionPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 165;
    }

    private void mergeConsent(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions actions) {
        if (this.outputCase_ != 104 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass.ConsentPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 104;
    }

    private void mergeCredentials(com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions actions) {
        if (this.outputCase_ != 103 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass.CredentialsPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 103;
    }

    private void mergeFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions actions) {
        if (this.outputCase_ != 128 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass.FlexiblePane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 128;
    }

    private void mergeGridSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions actions) {
        if (this.outputCase_ != 114 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass.GridSelectionPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 114;
    }

    private void mergeHeadlessOAuth(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions actions) {
        if (this.outputCase_ != 120 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass.HeadlessOAuthPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 120;
    }

    private void mergeIdentityDataSharing(com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions actions) {
        if (this.outputCase_ != 151 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass.IdentityDataSharingPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 151;
    }

    private void mergeLoading(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions actions) {
        if (this.outputCase_ != 131 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass.LoadingPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 131;
    }

    private void mergeOauth(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions actions) {
        if (this.outputCase_ != 115 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane.OAuthPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 115;
    }

    private void mergeOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions actions) {
        if (this.outputCase_ != 116 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass.OrderedListPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 116;
    }

    private void mergeProfileAuthentication(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions actions) {
        if (this.outputCase_ != 167 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass.ProfileAuthenticationPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 167;
    }

    private void mergeQrCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions actions) {
        if (this.outputCase_ != 125 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane.QRCodePane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 125;
    }

    private void mergeSearchAndSelect(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions actions) {
        if (this.outputCase_ != 111 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass.SearchAndSelectPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 111;
    }

    private void mergeSessionHandoff(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions actions) {
        if (this.outputCase_ != 136 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass.SessionHandoffPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 136;
    }

    private void mergeSink(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions actions) {
        if (this.outputCase_ != 102 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass.SinkPane.Actions.a) actions).buildPartial();
        }
        this.outputCase_ = 102;
    }

    private void mergeSource(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions actions) {
        if (this.outputCase_ != 101 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass.SourcePane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 101;
    }

    private void mergeUserInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions actions) {
        if (this.outputCase_ != 112 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass.UserInputPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 112;
    }

    private void mergeUserSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions actions) {
        if (this.outputCase_ != 113 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass.UserSelectionPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 113;
    }

    private void mergeVariableHeightButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions actions) {
        if (this.outputCase_ != 144 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass.VariableHeightButtonPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 144;
    }

    private void mergeVariableHeightVerificationCodeInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions actions) {
        if (this.outputCase_ != 147 || this.output_ == com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.getDefaultInstance()) {
            this.output_ = actions;
        } else {
            this.output_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions.newBuilder((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions) this.output_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass.VariableHeightVerificationCodeInputPane.Actions.b) actions).buildPartial();
        }
        this.outputCase_ = 147;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput pane$PaneOutput) {
        return DEFAULT_INSTANCE.createBuilder(pane$PaneOutput);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonPaneOuterClass$ButtonPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 105;
    }

    private void setButtonList(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonListPaneOuterClass$ButtonListPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 106;
    }

    private void setButtonWithAccordion(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordionPaneOuterClass$ButtonWithAccordionPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 107;
    }

    private void setButtonWithCards(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCardsPaneOuterClass$ButtonWithCardsPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 108;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonWithTable(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTablePaneOuterClass$ButtonWithTablePane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 109;
    }

    private void setButtonWithWebview(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebviewPaneOuterClass$ButtonWithWebviewPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 110;
    }

    private void setChallenge(com.plaid.internal.core.protos.link.workflow.nodes.panes.ChallengePaneOuterClass$ChallengePane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 117;
    }

    private void setClientSubmission(com.plaid.internal.core.protos.link.workflow.nodes.panes.ClientSubmissionPaneOuterClass$ClientSubmissionPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 165;
    }

    private void setConsent(com.plaid.internal.core.protos.link.workflow.nodes.panes.ConsentPaneOuterClass$ConsentPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 104;
    }

    private void setCredentials(com.plaid.internal.core.protos.link.workflow.nodes.panes.CredentialsPaneOuterClass$CredentialsPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 103;
    }

    private void setFlexible(com.plaid.internal.core.protos.link.workflow.nodes.panes.FlexiblePaneOuterClass$FlexiblePane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 128;
    }

    private void setGridSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.GridSelectionPaneOuterClass$GridSelectionPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 114;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadlessOAuth(com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 120;
    }

    private void setIdentityDataSharing(com.plaid.internal.core.protos.link.workflow.nodes.panes.IdentityDataSharingPaneOuterClass$IdentityDataSharingPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 151;
    }

    private void setLoading(com.plaid.internal.core.protos.link.workflow.nodes.panes.LoadingPaneOuterClass$LoadingPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 131;
    }

    private void setOauth(com.plaid.internal.core.protos.link.workflow.nodes.panes.OauthPane$OAuthPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 115;
    }

    private void setOrderedList(com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedListPaneOuterClass$OrderedListPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 116;
    }

    private void setProfileAuthentication(com.plaid.internal.core.protos.link.workflow.nodes.panes.ProfileAuthenticationPaneOuterClass$ProfileAuthenticationPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 167;
    }

    private void setQrCode(com.plaid.internal.core.protos.link.workflow.nodes.panes.QrCodePane$QRCodePane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 125;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAndSelect(com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelectPaneOuterClass$SearchAndSelectPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 111;
    }

    private void setSessionHandoff(com.plaid.internal.core.protos.link.workflow.nodes.panes.SessionHandoffPaneOuterClass$SessionHandoffPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 136;
    }

    private void setSink(com.plaid.internal.core.protos.link.workflow.nodes.panes.SinkPaneOuterClass$SinkPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 102;
    }

    private void setSource(com.plaid.internal.core.protos.link.workflow.nodes.panes.SourcePaneOuterClass$SourcePane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 101;
    }

    private void setUserInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInputPaneOuterClass$UserInputPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 112;
    }

    private void setUserSelection(com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelectionPaneOuterClass$UserSelectionPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 113;
    }

    private void setVariableHeightButton(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightButtonPaneOuterClass$VariableHeightButtonPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 144;
    }

    private void setVariableHeightVerificationCodeInput(com.plaid.internal.core.protos.link.workflow.nodes.panes.VariableHeightVerificationCodeInputPaneOuterClass$VariableHeightVerificationCodeInputPane.Actions actions) {
        this.output_ = actions;
        this.outputCase_ = 147;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneNodeId(java.lang.String str) {
        this.paneNodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaneRenderingId(java.lang.String str) {
        this.paneRenderingId_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
