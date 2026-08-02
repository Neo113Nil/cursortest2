package com.plaid.internal.core.protos.clients;

/* loaded from: classes16.dex */
public final class LinkCustomizations$LinkCustomization extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization, com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.d> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ACCOUNT_CLASS_BUSINESS_DISABLED_FIELD_NUMBER = 76;
    public static final int ACCOUNT_NUMBER_PANE_MESSAGE_FIELD_NUMBER = 39;
    public static final int ACCOUNT_NUMBER_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 40;
    public static final int ACCOUNT_NUMBER_PANE_TITLE_FIELD_NUMBER = 38;
    public static final int ACCOUNT_SELECT_PANE_IS_ENABLED_FIELD_NUMBER = 46;
    public static final int ACCOUNT_SELECT_PANE_IS_MULTI_ACCOUNT_SELECT_ENABLED_FIELD_NUMBER = 47;
    public static final int ACCOUNT_SELECT_PANE_MODE_FIELD_NUMBER = 75;
    public static final int ACCOUNT_SELECT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 45;
    public static final int ACCOUNT_SELECT_PANE_TITLE_FIELD_NUMBER = 44;
    public static final int AUTH_FLOW_TYPE_FIELD_NUMBER = 115;
    public static final int CONNECTED_PANE_HEADING_FIELD_NUMBER = 55;
    public static final int CONNECTED_PANE_IS_ENABLED_FIELD_NUMBER = 6;
    public static final int CONNECTED_PANE_MESSAGE_FIELD_NUMBER = 4;
    public static final int CONNECTED_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 5;
    public static final int CONNECTED_PANE_TITLE_FIELD_NUMBER = 3;
    public static final int COUNTRY_CODES_FIELD_NUMBER = 56;
    public static final int CREDENTIAL_PANE_PLAID_LEGAL_ENABLED_FIELD_NUMBER = 14;
    public static final int CREDENTIAL_PANE_RESET_PASSWORD_BUTTON_FIELD_NUMBER = 13;
    public static final int CREDENTIAL_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 12;
    public static final int CREDENTIAL_PANE_TITLE_FIELD_NUMBER = 11;
    public static final int CREDENTIAL_PANE_TOS_CONTENT_FIELD_NUMBER = 15;
    public static final int CREDENTIAL_PANE_TOS_ENABLED_FIELD_NUMBER = 16;
    private static final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization DEFAULT_INSTANCE;
    public static final int DOCUMENT_INCOME_UPLOAD_PANE_DOCUMENT_FILE_TYPE_PREFERENCES_FIELD_NUMBER = 90;
    public static final int DOCUMENT_INCOME_UPLOAD_PANE_NUMBER_OF_UPLOADS_PREFERENCES_FIELD_NUMBER = 91;
    public static final int DOCUMENT_TIME_RANGE_FIELD_NUMBER = 108;
    public static final int DTM_ENABLEMENT_STATUS_FIELD_NUMBER = 105;
    public static final int DTM_USE_CASES_FIELD_NUMBER = 104;
    public static final int ERROR_PANE_TITLE_FIELD_NUMBER = 20;
    public static final int EU_CONSENT_PANE_CANCEL_FIELD_NUMBER = 63;
    public static final int EU_CONSENT_PANE_CONTACT_DETAILS_TITLE_FIELD_NUMBER = 57;
    public static final int EU_CONSENT_PANE_CONTINUE_AGREE_FIELD_NUMBER = 61;
    public static final int EU_CONSENT_PANE_CONTINUE_FIELD_NUMBER = 62;
    public static final int EU_CONSENT_PANE_DETAILS_TITLE_FIELD_NUMBER = 60;
    public static final int EU_CONSENT_PANE_IS_ENABLED_FIELD_NUMBER = 17;
    public static final int EU_CONSENT_PANE_LINK_WITH_PLAID_FIELD_NUMBER = 58;
    public static final int EU_CONSENT_PANE_SUBMIT_AGREE_FIELD_NUMBER = 19;
    public static final int EU_CONSENT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 18;
    public static final int EU_CONSENT_PANE_TRANSACTIONS_TITLE_FIELD_NUMBER = 59;
    public static final int EXIT_PANE_CANCEL_BUTTON_FIELD_NUMBER = 25;
    public static final int EXIT_PANE_HEADING_FIELD_NUMBER = 22;
    public static final int EXIT_PANE_MESSAGE_FIELD_NUMBER = 23;
    public static final int EXIT_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 24;
    public static final int EXIT_PANE_TITLE_FIELD_NUMBER = 21;
    public static final int GLOBAL_APPEARANCE_FIELD_NUMBER = 82;
    public static final int GLOBAL_BUTTON_BORDER_RADIUS_FIELD_NUMBER = 88;
    public static final int GLOBAL_BUTTON_COLOR_FIELD_NUMBER = 85;
    public static final int GLOBAL_BUTTON_COLOR_HOVER_FIELD_NUMBER = 86;
    public static final int GLOBAL_BUTTON_DARK_MODE_COLOR_FIELD_NUMBER = 116;
    public static final int GLOBAL_BUTTON_DARK_MODE_COLOR_HOVER_FIELD_NUMBER = 117;
    public static final int GLOBAL_BUTTON_DARK_MODE_TEXT_COLOR_FIELD_NUMBER = 118;
    public static final int GLOBAL_BUTTON_FONT_WEIGHT_FIELD_NUMBER = 89;
    public static final int GLOBAL_BUTTON_TEXT_COLOR_FIELD_NUMBER = 87;
    public static final int GLOBAL_HIGHLIGHT_COLOR_FIELD_NUMBER = 1;
    public static final int GLOBAL_OVERLAY_BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int IDENTITY_MATCH_RISK_PROFILE_KEY_FIELD_NUMBER = 106;
    public static final int INSTITUTION_SEARCH_PANE_EXIT_BUTTON_FIELD_NUMBER = 29;
    public static final int INSTITUTION_SEARCH_PANE_INITIAL_MESSAGE_FIELD_NUMBER = 31;
    public static final int INSTITUTION_SEARCH_PANE_NO_RESULTS_MESSAGE_FIELD_NUMBER = 32;
    public static final int INSTITUTION_SEARCH_PANE_PLACEHOLDER_FIELD_NUMBER = 30;
    public static final int INSTITUTION_SEARCH_PANE_TIMEOUT_MESSAGE_FIELD_NUMBER = 33;
    public static final int INSTITUTION_SELECT_PANE_INSTITUTION_LIST_FIELD_NUMBER = 28;
    public static final int INSTITUTION_SELECT_PANE_SEARCH_BUTTON_FIELD_NUMBER = 27;
    public static final int INSTITUTION_SELECT_PANE_TITLE_FIELD_NUMBER = 26;
    public static final int INSTITUTION_SELECT_PANE_USE_DYNAMIC_INSTITUTION_SELECT_FIELD_NUMBER = 69;
    public static final int IS_VENMO_SPECIFIC_FIELD_NUMBER = 107;
    public static final int LANGUAGE_FIELD_NUMBER = 53;
    public static final int LAYER_CONSENT_PANE_HEADER_TEXT_ACTION_FIELD_NUMBER = 102;
    public static final int LAYER_CONSENT_PANE_HEADER_TEXT_PROFILE_TERM_FIELD_NUMBER = 103;
    public static final int LOADING_PANE_TITLE_FIELD_NUMBER = 34;
    public static final int LOGO_URL_FIELD_NUMBER = 113;
    public static final int MANUAL_VERIFICATION_OF_INCOME_UPLOAD_PANE_DOCUMENT_PREFERENCES_FIELD_NUMBER = 70;
    public static final int MFA_PANE_TITLE_FIELD_NUMBER = 41;
    public static final int OAUTH_LANDING_PANE_AFTER_CONTINUE_FIELD_NUMBER = 65;
    public static final int OAUTH_LANDING_PANE_AUTHENTICATE_BANK_FIELD_NUMBER = 64;
    public static final int OAUTH_LANDING_PANE_CONTINUE_TO_INSTITUTION_FIELD_NUMBER = 67;
    public static final int OAUTH_LANDING_PANE_REDIRECTED_BACK_FIELD_NUMBER = 66;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization> PARSER = null;
    public static final int PRIVACY_INTERSTITIAL_PANE_CO_BRANDED_IS_ENABLED_FIELD_NUMBER = 73;
    public static final int PRIVACY_INTERSTITIAL_PANE_HEADING_ACCOUNT_NAME_FIELD_NUMBER = 74;
    public static final int PRIVACY_INTERSTITIAL_PANE_HEADING_FIELD_NUMBER = 48;
    public static final int PRIVACY_INTERSTITIAL_PANE_SUBMIT_AGREE_FIELD_NUMBER = 50;
    public static final int PRIVACY_INTERSTITIAL_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 49;
    public static final int PRODUCT_DOMAIN_FIELD_NUMBER = 110;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_ALLOW_BUTTON_FIELD_NUMBER = 78;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_MODAL_DISMISS_BUTTON_FIELD_NUMBER = 81;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_FIELD_NUMBER = 80;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_UPDATE_USE_CASE_FIELD_NUMBER = 79;
    public static final int PRODUCT_SCOPES_TRANSPARENCY_PANE_USE_CASE_FIELD_NUMBER = 77;
    public static final int PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_FIELD_NUMBER = 119;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_ADDRESS_FIELD_NUMBER = 96;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_DATE_OF_BIRTH_FIELD_NUMBER = 94;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_DOCUMENTS_FIELD_NUMBER = 98;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_EMAIL_FIELD_NUMBER = 95;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_NAME_FIELD_NUMBER = 93;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_SSN_FIELD_NUMBER = 97;
    public static final int PROFILE_ELIGIBILITY_IDENTITY_FIELD_SSN_LAST4_ONLY_FIELD_NUMBER = 109;
    public static final int PROFILE_ELIGIBILITY_ITEMS_ALLOW_INDIRECT_FIELD_NUMBER = 100;
    public static final int PROFILE_ELIGIBILITY_ITEMS_ALLOW_REAUTHENTICATION_FIELD_NUMBER = 101;
    public static final int PROFILE_ELIGIBILITY_REQUIRE_IDENTITY_FIELD_NUMBER = 92;
    public static final int PROFILE_ELIGIBILITY_REQUIRE_ITEMS_FIELD_NUMBER = 99;
    public static final int RECAPTCHA_PANE_MESSAGE_FIELD_NUMBER = 43;
    public static final int RECAPTCHA_PANE_TITLE_FIELD_NUMBER = 42;
    public static final int RECONNECTED_PANE_IS_ENABLED_FIELD_NUMBER = 10;
    public static final int RECONNECTED_PANE_MESSAGE_FIELD_NUMBER = 8;
    public static final int RECONNECTED_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 9;
    public static final int RECONNECTED_PANE_TITLE_FIELD_NUMBER = 7;
    public static final int ROUTING_NUMBER_PANE_MESSAGE_FIELD_NUMBER = 36;
    public static final int ROUTING_NUMBER_PANE_SUBMIT_BUTTON_FIELD_NUMBER = 37;
    public static final int ROUTING_NUMBER_PANE_TITLE_FIELD_NUMBER = 35;
    public static final int START_DATE_DAYS_AGO_FIELD_NUMBER = 52;
    public static final int TEMPLATE_NAME_FIELD_NUMBER = 112;
    public static final int TEMPLATE_SYMBOL_FIELD_NUMBER = 114;
    public static final int TEMPLATE_TOKEN_CONFIGURATION_FIELD_NUMBER = 120;
    public static final int WALLET_SELECT_PANE_HIDDEN_WALLET_BRAND_LIST_FIELD_NUMBER = 84;
    public static final int WALLET_SELECT_PANE_PINNED_WALLET_BRAND_LIST_FIELD_NUMBER = 83;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e> dtmUseCases_converter_ = new com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.a();
    private com.google.protobuf.BoolValue accountClassBusinessDisabled_;
    private com.google.protobuf.StringValue accountNumberPaneMessage_;
    private com.google.protobuf.StringValue accountNumberPaneSubmitButton_;
    private com.google.protobuf.StringValue accountNumberPaneTitle_;
    private com.google.protobuf.BoolValue accountSelectPaneIsEnabled_;
    private com.google.protobuf.BoolValue accountSelectPaneIsMultiAccountSelectEnabled_;
    private int accountSelectPaneMode_;
    private com.google.protobuf.StringValue accountSelectPaneSubmitButton_;
    private com.google.protobuf.StringValue accountSelectPaneTitle_;
    private com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType authFlowType_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private com.google.protobuf.StringValue connectedPaneHeading_;
    private com.google.protobuf.BoolValue connectedPaneIsEnabled_;
    private com.google.protobuf.StringValue connectedPaneMessage_;
    private com.google.protobuf.StringValue connectedPaneSubmitButton_;
    private com.google.protobuf.StringValue connectedPaneTitle_;
    private com.google.protobuf.BoolValue credentialPanePlaidLegalEnabled_;
    private com.google.protobuf.StringValue credentialPaneResetPasswordButton_;
    private com.google.protobuf.StringValue credentialPaneSubmitButton_;
    private com.google.protobuf.StringValue credentialPaneTitle_;
    private com.google.protobuf.StringValue credentialPaneTosContent_;
    private com.google.protobuf.BoolValue credentialPaneTosEnabled_;
    private com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences documentIncomeUploadPaneNumberOfUploadsPreferences_;
    private com.google.protobuf.StringValue documentTimeRange_;
    private com.google.protobuf.BoolValue dtmEnablementStatus_;
    private int dtmUseCasesMemoizedSerializedSize;
    private com.google.protobuf.StringValue errorPaneTitle_;
    private com.google.protobuf.StringValue euConsentPaneCancel_;
    private com.google.protobuf.StringValue euConsentPaneContactDetailsTitle_;
    private com.google.protobuf.StringValue euConsentPaneContinueAgree_;
    private com.google.protobuf.StringValue euConsentPaneContinue_;
    private com.google.protobuf.StringValue euConsentPaneDetailsTitle_;
    private com.google.protobuf.BoolValue euConsentPaneIsEnabled_;
    private com.google.protobuf.StringValue euConsentPaneLinkWithPlaid_;
    private com.google.protobuf.StringValue euConsentPaneSubmitAgree_;
    private com.google.protobuf.StringValue euConsentPaneSubmitButton_;
    private com.google.protobuf.StringValue euConsentPaneTransactionsTitle_;
    private com.google.protobuf.StringValue exitPaneCancelButton_;
    private com.google.protobuf.StringValue exitPaneHeading_;
    private com.google.protobuf.StringValue exitPaneMessage_;
    private com.google.protobuf.StringValue exitPaneSubmitButton_;
    private com.google.protobuf.StringValue exitPaneTitle_;
    private int globalAppearance_;
    private com.google.protobuf.Int32Value globalButtonBorderRadius_;
    private com.google.protobuf.StringValue globalButtonColorHover_;
    private com.google.protobuf.StringValue globalButtonColor_;
    private com.google.protobuf.StringValue globalButtonDarkModeColorHover_;
    private com.google.protobuf.StringValue globalButtonDarkModeColor_;
    private com.google.protobuf.StringValue globalButtonDarkModeTextColor_;
    private com.google.protobuf.StringValue globalButtonFontWeight_;
    private com.google.protobuf.StringValue globalButtonTextColor_;
    private com.google.protobuf.StringValue globalHighlightColor_;
    private com.google.protobuf.StringValue globalOverlayBackgroundColor_;
    private com.google.protobuf.StringValue identityMatchRiskProfileKey_;
    private com.google.protobuf.StringValue institutionSearchPaneExitButton_;
    private com.google.protobuf.StringValue institutionSearchPaneInitialMessage_;
    private com.google.protobuf.StringValue institutionSearchPaneNoResultsMessage_;
    private com.google.protobuf.StringValue institutionSearchPanePlaceholder_;
    private com.google.protobuf.StringValue institutionSearchPaneTimeoutMessage_;
    private com.google.protobuf.StringValue institutionSelectPaneSearchButton_;
    private com.google.protobuf.StringValue institutionSelectPaneTitle_;
    private com.google.protobuf.BoolValue institutionSelectPaneUseDynamicInstitutionSelect_;
    private com.google.protobuf.BoolValue isVenmoSpecific_;
    private com.google.protobuf.StringValue language_;
    private com.google.protobuf.StringValue layerConsentPaneHeaderTextAction_;
    private com.google.protobuf.StringValue layerConsentPaneHeaderTextProfileTerm_;
    private com.google.protobuf.StringValue loadingPaneTitle_;
    private com.google.protobuf.StringValue logoUrl_;
    private com.google.protobuf.StringValue mfaPaneTitle_;
    private com.google.protobuf.StringValue oauthLandingPaneAfterContinue_;
    private com.google.protobuf.StringValue oauthLandingPaneAuthenticateBank_;
    private com.google.protobuf.StringValue oauthLandingPaneContinueToInstitution_;
    private com.google.protobuf.StringValue oauthLandingPaneRedirectedBack_;
    private com.google.protobuf.BoolValue privacyInterstitialPaneCoBrandedIsEnabled_;
    private com.google.protobuf.StringValue privacyInterstitialPaneHeadingAccountName_;
    private com.google.protobuf.StringValue privacyInterstitialPaneHeading_;
    private com.google.protobuf.StringValue privacyInterstitialPaneSubmitAgree_;
    private com.google.protobuf.StringValue privacyInterstitialPaneSubmitButton_;
    private int productDomain_;
    private com.google.protobuf.StringValue productScopesTransparencyPaneAllowButton_;
    private com.google.protobuf.StringValue productScopesTransparencyPaneModalDismissButton_;
    private int productScopesTransparencyPaneMode_;
    private com.google.protobuf.StringValue productScopesTransparencyPaneUpdateUseCase_;
    private com.google.protobuf.StringValue productScopesTransparencyPaneUseCase_;
    private int profileEligibilityDesiredAccountType_;
    private int profileEligibilityIdentityFieldAddress_;
    private int profileEligibilityIdentityFieldDateOfBirth_;
    private int profileEligibilityIdentityFieldDocuments_;
    private int profileEligibilityIdentityFieldEmail_;
    private int profileEligibilityIdentityFieldName_;
    private com.google.protobuf.BoolValue profileEligibilityIdentityFieldSsnLast4Only_;
    private int profileEligibilityIdentityFieldSsn_;
    private com.google.protobuf.BoolValue profileEligibilityItemsAllowIndirect_;
    private com.google.protobuf.BoolValue profileEligibilityItemsAllowReauthentication_;
    private int profileEligibilityRequireIdentity_;
    private int profileEligibilityRequireItems_;
    private com.google.protobuf.StringValue recaptchaPaneMessage_;
    private com.google.protobuf.StringValue recaptchaPaneTitle_;
    private com.google.protobuf.BoolValue reconnectedPaneIsEnabled_;
    private com.google.protobuf.StringValue reconnectedPaneMessage_;
    private com.google.protobuf.StringValue reconnectedPaneSubmitButton_;
    private com.google.protobuf.StringValue reconnectedPaneTitle_;
    private com.google.protobuf.StringValue routingNumberPaneMessage_;
    private com.google.protobuf.StringValue routingNumberPaneSubmitButton_;
    private com.google.protobuf.StringValue routingNumberPaneTitle_;
    private com.google.protobuf.Int32Value startDateDaysAgo_;
    private com.google.protobuf.StringValue templateName_;
    private com.google.protobuf.StringValue templateSymbol_;
    private com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration templateTokenConfiguration_;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> countryCodes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> institutionSelectPaneInstitutionList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> walletSelectPanePinnedWalletBrandList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> walletSelectPaneHiddenWalletBrandList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.IntList dtmUseCases_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference> manualVerificationOfIncomeUploadPaneDocumentPreferences_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference> documentIncomeUploadPaneDocumentFileTypePreferences_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();

    public static final class AuthFlowType extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType, com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.AuthFlowType.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public static final int AUTH_TYPE_SELECT_ENABLED_FIELD_NUMBER = 7;
        public static final int AUTOMATED_MICRODEPOSITS_ENABLED_FIELD_NUMBER = 2;
        public static final int DATABASE_INSIGHTS_ENABLED_FIELD_NUMBER = 6;
        public static final int DATABASE_MATCH_ENABLED_FIELD_NUMBER = 5;
        private static final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType DEFAULT_INSTANCE;
        public static final int INSTANT_MATCH_ENABLED_FIELD_NUMBER = 1;
        public static final int INSTANT_MICRODEPOSITS_ENABLED_FIELD_NUMBER = 4;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType> PARSER = null;
        public static final int REROUTE_TO_CREDENTIALS_FIELD_NUMBER = 9;
        public static final int SAME_DAY_MICRODEPOSITS_ENABLED_FIELD_NUMBER = 3;
        public static final int SMS_MICRODEPOSITS_VERIFICATION_ENABLED_FIELD_NUMBER = 8;
        private boolean authTypeSelectEnabled_;
        private boolean automatedMicrodepositsEnabled_;
        private boolean databaseInsightsEnabled_;
        private boolean databaseMatchEnabled_;
        private boolean instantMatchEnabled_;
        private boolean instantMicrodepositsEnabled_;
        private java.lang.String rerouteToCredentials_ = "";
        private boolean sameDayMicrodepositsEnabled_;
        private boolean smsMicrodepositsVerificationEnabled_;

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType, com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.AuthFlowType.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType authFlowType = new com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType();
            DEFAULT_INSTANCE = authFlowType;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType.class, authFlowType);
        }

        private AuthFlowType() {
        }

        private void clearAuthTypeSelectEnabled() {
            this.authTypeSelectEnabled_ = false;
        }

        private void clearAutomatedMicrodepositsEnabled() {
            this.automatedMicrodepositsEnabled_ = false;
        }

        private void clearDatabaseInsightsEnabled() {
            this.databaseInsightsEnabled_ = false;
        }

        private void clearDatabaseMatchEnabled() {
            this.databaseMatchEnabled_ = false;
        }

        private void clearInstantMatchEnabled() {
            this.instantMatchEnabled_ = false;
        }

        private void clearInstantMicrodepositsEnabled() {
            this.instantMicrodepositsEnabled_ = false;
        }

        private void clearRerouteToCredentials() {
            this.rerouteToCredentials_ = getDefaultInstance().getRerouteToCredentials();
        }

        private void clearSameDayMicrodepositsEnabled() {
            this.sameDayMicrodepositsEnabled_ = false;
        }

        private void clearSmsMicrodepositsVerificationEnabled() {
            this.smsMicrodepositsVerificationEnabled_ = false;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.AuthFlowType.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAuthTypeSelectEnabled(boolean z) {
            this.authTypeSelectEnabled_ = z;
        }

        private void setAutomatedMicrodepositsEnabled(boolean z) {
            this.automatedMicrodepositsEnabled_ = z;
        }

        private void setDatabaseInsightsEnabled(boolean z) {
            this.databaseInsightsEnabled_ = z;
        }

        private void setDatabaseMatchEnabled(boolean z) {
            this.databaseMatchEnabled_ = z;
        }

        private void setInstantMatchEnabled(boolean z) {
            this.instantMatchEnabled_ = z;
        }

        private void setInstantMicrodepositsEnabled(boolean z) {
            this.instantMicrodepositsEnabled_ = z;
        }

        private void setRerouteToCredentialsBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.rerouteToCredentials_ = byteString.toStringUtf8();
        }

        private void setSameDayMicrodepositsEnabled(boolean z) {
            this.sameDayMicrodepositsEnabled_ = z;
        }

        private void setSmsMicrodepositsVerificationEnabled(boolean z) {
            this.smsMicrodepositsVerificationEnabled_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.clients.a.f6030a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType();
                case 2:
                    return new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.AuthFlowType.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007\b\u0007\tȈ", new java.lang.Object[]{"instantMatchEnabled_", "automatedMicrodepositsEnabled_", "sameDayMicrodepositsEnabled_", "instantMicrodepositsEnabled_", "databaseMatchEnabled_", "databaseInsightsEnabled_", "authTypeSelectEnabled_", "smsMicrodepositsVerificationEnabled_", "rerouteToCredentials_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType.class) {
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

        public final boolean getAuthTypeSelectEnabled() {
            return this.authTypeSelectEnabled_;
        }

        public final boolean getAutomatedMicrodepositsEnabled() {
            return this.automatedMicrodepositsEnabled_;
        }

        public final boolean getDatabaseInsightsEnabled() {
            return this.databaseInsightsEnabled_;
        }

        public final boolean getDatabaseMatchEnabled() {
            return this.databaseMatchEnabled_;
        }

        public final boolean getInstantMatchEnabled() {
            return this.instantMatchEnabled_;
        }

        public final boolean getInstantMicrodepositsEnabled() {
            return this.instantMicrodepositsEnabled_;
        }

        public final java.lang.String getRerouteToCredentials() {
            return this.rerouteToCredentials_;
        }

        public final com.google.protobuf.ByteString getRerouteToCredentialsBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.rerouteToCredentials_);
        }

        public final boolean getSameDayMicrodepositsEnabled() {
            return this.sameDayMicrodepositsEnabled_;
        }

        public final boolean getSmsMicrodepositsVerificationEnabled() {
            return this.smsMicrodepositsVerificationEnabled_;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.AuthFlowType.a newBuilder(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType authFlowType) {
            return DEFAULT_INSTANCE.createBuilder(authFlowType);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setRerouteToCredentials(java.lang.String str) {
            this.rerouteToCredentials_ = str;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public final class a implements com.google.protobuf.Internal.ListAdapter.Converter<java.lang.Integer, com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e convert(java.lang.Integer num) {
            com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e.forNumber(num.intValue());
            return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e.UNRECOGNIZED : forNumber;
        }
    }

    public enum b implements com.google.protobuf.Internal.EnumLite {
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE(0),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT(1),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT(2),
        LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS(3),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE_VALUE = 0;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS_VALUE = 3;
        public static final int LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT_VALUE = 1;
        public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.b.a b = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.b.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6016a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b findValueByNumber(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization$b$b, reason: collision with other inner class name */
        public static final class C0159b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b.C0159b f6017a = new com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b.C0159b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.f6016a = i;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_NONE;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_SINGLE_SELECT;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_MULTI_SELECT;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_ACCOUNT_SELECT_PANE_MODE_REQUIRE_ALL_ACCOUNTS;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b.C0159b.f6017a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6016a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum c implements com.google.protobuf.Internal.EnumLite {
        LINK_CUSTOMIZATION_APPEARANCE_NONE(0),
        LINK_CUSTOMIZATION_APPEARANCE_LIGHT(1),
        LINK_CUSTOMIZATION_APPEARANCE_DARK(2),
        LINK_CUSTOMIZATION_APPEARANCE_SYSTEM(3),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_APPEARANCE_DARK_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_APPEARANCE_LIGHT_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_APPEARANCE_NONE_VALUE = 0;
        public static final int LINK_CUSTOMIZATION_APPEARANCE_SYSTEM_VALUE = 3;
        public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.c.a b = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.c.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6018a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c findValueByNumber(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.c.b f6019a = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.c.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c.forNumber(i) != null;
            }
        }

        c(int i) {
            this.f6018a = i;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_APPEARANCE_NONE;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_APPEARANCE_LIGHT;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_APPEARANCE_DARK;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_APPEARANCE_SYSTEM;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.c.b.f6019a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6018a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class d extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization, com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.d> implements com.google.protobuf.MessageLiteOrBuilder {
        public d() {
            super(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.DEFAULT_INSTANCE);
        }
    }

    public enum e implements com.google.protobuf.Internal.EnumLite {
        LINK_CUSTOMIZATION_DTM_USE_CASE_NONE(0),
        LINK_CUSTOMIZATION_DTM_USE_CASE_SEND_AND_RECEIVE_MONEY(1),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_YOUR_BILLS(2),
        LINK_CUSTOMIZATION_DTM_USE_CASE_MAKE_PURCHASE_ONLINE(3),
        LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_BUSINESS_TO_BUSINESS_PAYMENTS(4),
        LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_IDENTITY_AND_PREVENT_FRAUD(5),
        LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_ACCOUNT(6),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PROTECT_AGAINST_FRAUD(7),
        LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_AND_MANAGE_YOUR_FINANCES(8),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_YOUR_TAXES(9),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_REWARDS(10),
        LINK_CUSTOMIZATION_DTM_USE_CASE_INVEST_YOUR_MONEY(11),
        LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_ACCOUNTING_AND_TAX_PREPARATION(12),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_AND_CATEGORIZE_INVOICES(13),
        LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_EMPLOYEE_EXPENSE_REPORTING_AND_MANAGEMENT(14),
        LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_MANAGE_AND_BUILD_YOUR_CREDIT(15),
        LINK_CUSTOMIZATION_DTM_USE_CASE_ACCESS_YOUR_PAYCHECK_SOONER(16),
        LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_DOWN_DEBT(17),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_LOAN(18),
        LINK_CUSTOMIZATION_DTM_USE_CASE_FUND_YOUR_ACCOUNT(19),
        LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_INCOME(20),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_CREDIT(21),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_FINANCING(22),
        LINK_CUSTOMIZATION_DTM_USE_CASE_GET_A_PERSONALIZED_SPENDING_LIMIT(23),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_ACCESS_YOUR_PAYCHECK_SOONER_VALUE = 16;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_FUND_YOUR_ACCOUNT_VALUE = 19;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_A_PERSONALIZED_SPENDING_LIMIT_VALUE = 23;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_CREDIT_VALUE = 21;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_FINANCING_VALUE = 22;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_LOAN_VALUE = 18;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_GET_REWARDS_VALUE = 10;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_INVEST_YOUR_MONEY_VALUE = 11;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_MAKE_PURCHASE_ONLINE_VALUE = 3;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_NONE_VALUE = 0;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_DOWN_DEBT_VALUE = 17;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_YOUR_BILLS_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_AND_CATEGORIZE_INVOICES_VALUE = 13;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_YOUR_TAXES_VALUE = 9;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_PROTECT_AGAINST_FRAUD_VALUE = 7;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_SEND_AND_RECEIVE_MONEY_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_AND_MANAGE_YOUR_FINANCES_VALUE = 8;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_MANAGE_AND_BUILD_YOUR_CREDIT_VALUE = 15;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_ACCOUNT_VALUE = 6;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_IDENTITY_AND_PREVENT_FRAUD_VALUE = 5;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_INCOME_VALUE = 20;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_ACCOUNTING_AND_TAX_PREPARATION_VALUE = 12;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_BUSINESS_TO_BUSINESS_PAYMENTS_VALUE = 4;
        public static final int LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_EMPLOYEE_EXPENSE_REPORTING_AND_MANAGEMENT_VALUE = 14;
        public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.e.a b = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.e.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6020a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e findValueByNumber(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.e.b f6021a = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.e.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e.forNumber(i) != null;
            }
        }

        e(int i) {
            this.f6020a = i;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e forNumber(int i) {
            switch (i) {
                case 0:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_NONE;
                case 1:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_SEND_AND_RECEIVE_MONEY;
                case 2:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_YOUR_BILLS;
                case 3:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_MAKE_PURCHASE_ONLINE;
                case 4:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_BUSINESS_TO_BUSINESS_PAYMENTS;
                case 5:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_IDENTITY_AND_PREVENT_FRAUD;
                case 6:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_ACCOUNT;
                case 7:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PROTECT_AGAINST_FRAUD;
                case 8:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_AND_MANAGE_YOUR_FINANCES;
                case 9:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_YOUR_TAXES;
                case 10:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_REWARDS;
                case 11:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_INVEST_YOUR_MONEY;
                case 12:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_ACCOUNTING_AND_TAX_PREPARATION;
                case 13:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PREPARE_AND_CATEGORIZE_INVOICES;
                case 14:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_WITH_EMPLOYEE_EXPENSE_REPORTING_AND_MANAGEMENT;
                case 15:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_TRACK_MANAGE_AND_BUILD_YOUR_CREDIT;
                case 16:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_ACCESS_YOUR_PAYCHECK_SOONER;
                case 17:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_PAY_DOWN_DEBT;
                case 18:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_LOAN;
                case 19:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_FUND_YOUR_ACCOUNT;
                case 20:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_VERIFY_YOUR_INCOME;
                case 21:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_CREDIT;
                case 22:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_CONSIDERED_FOR_FINANCING;
                case 23:
                    return LINK_CUSTOMIZATION_DTM_USE_CASE_GET_A_PERSONALIZED_SPENDING_LIMIT;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.e.b.f6021a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6020a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum f implements com.google.protobuf.Internal.EnumLite {
        LINK_CUSTOMIZATION_PRODUCT_DOMAIN_UNKNOWN(0),
        LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LINK(1),
        LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LAYER(2),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LAYER_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LINK_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_PRODUCT_DOMAIN_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.f.a b = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.f.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6022a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f findValueByNumber(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.f.b f6023a = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.f.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f.forNumber(i) != null;
            }
        }

        f(int i) {
            this.f6022a = i;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PRODUCT_DOMAIN_UNKNOWN;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LINK;
            }
            if (i != 2) {
                return null;
            }
            return LINK_CUSTOMIZATION_PRODUCT_DOMAIN_LAYER;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.f.b.f6023a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6022a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum g implements com.google.protobuf.Internal.EnumLite {
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_NONE(0),
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_STANDALONE(1),
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_CONSENT_ONLY(2),
        LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_MODE_STANDALONE(3),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_CONSENT_ONLY_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_NONE_VALUE = 0;
        public static final int LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_STANDALONE_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_MODE_STANDALONE_VALUE = 3;
        public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.g.a b = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.g.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6024a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g findValueByNumber(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.g.b f6025a = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.g.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g.forNumber(i) != null;
            }
        }

        g(int i) {
            this.f6024a = i;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_NONE;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_STANDALONE;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_PANE_MODE_CONSENT_ONLY;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_PRODUCT_SCOPES_TRANSPARENCY_V4_PANE_MODE_STANDALONE;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.g.b.f6025a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6024a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum h implements com.google.protobuf.Internal.EnumLite {
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_UNKNOWN(0),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_ANY(1),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_PRIMARY_INCOME(2),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_ANY_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_PRIMARY_INCOME_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.h.a b = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.h.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6026a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h findValueByNumber(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.h.b f6027a = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.h.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h.forNumber(i) != null;
            }
        }

        h(int i) {
            this.f6026a = i;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_ANY;
            }
            if (i != 2) {
                return null;
            }
            return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_DESIRED_ACCOUNT_TYPE_PRIMARY_INCOME;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.h.b.f6027a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6026a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum i implements com.google.protobuf.Internal.EnumLite {
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_UNKNOWN(0),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_REQUIRE(1),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OPTIONAL(2),
        LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OMIT(3),
        UNRECOGNIZED(-1);

        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OMIT_VALUE = 3;
        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OPTIONAL_VALUE = 2;
        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_REQUIRE_VALUE = 1;
        public static final int LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_UNKNOWN_VALUE = 0;
        public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.i.a b = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.i.a();

        /* renamed from: a, reason: collision with root package name */
        public final int f6028a;

        public final class a implements com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i findValueByNumber(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(i);
            }
        }

        public static final class b implements com.google.protobuf.Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.i.b f6029a = new com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.i.b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(i) != null;
            }
        }

        i(int i) {
            this.f6028a = i;
        }

        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber(int i) {
            if (i == 0) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_UNKNOWN;
            }
            if (i == 1) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_REQUIRE;
            }
            if (i == 2) {
                return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OPTIONAL;
            }
            if (i != 3) {
                return null;
            }
            return LINK_CUSTOMIZATION_PROFILE_ELIGIBILITY_REQUIREMENT_OMIT;
        }

        public static com.google.protobuf.Internal.EnumLiteMap<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i> internalGetValueMap() {
            return b;
        }

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.i.b.f6029a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f6028a;
            }
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @java.lang.Deprecated
        public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization = new com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization();
        DEFAULT_INSTANCE = linkCustomizations$LinkCustomization;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.class, linkCustomizations$LinkCustomization);
    }

    private LinkCustomizations$LinkCustomization() {
    }

    private void addAllCountryCodes(java.lang.Iterable<java.lang.String> iterable) {
        ensureCountryCodesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.countryCodes_);
    }

    private void addAllDocumentIncomeUploadPaneDocumentFileTypePreferences(java.lang.Iterable<? extends com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference> iterable) {
        ensureDocumentIncomeUploadPaneDocumentFileTypePreferencesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.documentIncomeUploadPaneDocumentFileTypePreferences_);
    }

    private void addAllDtmUseCases(java.lang.Iterable<? extends com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e> iterable) {
        ensureDtmUseCasesIsMutable();
        java.util.Iterator<? extends com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e> it = iterable.iterator();
        while (it.hasNext()) {
            this.dtmUseCases_.addInt(it.next().getNumber());
        }
    }

    private void addAllDtmUseCasesValue(java.lang.Iterable<java.lang.Integer> iterable) {
        ensureDtmUseCasesIsMutable();
        java.util.Iterator<java.lang.Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.dtmUseCases_.addInt(it.next().intValue());
        }
    }

    private void addAllInstitutionSelectPaneInstitutionList(java.lang.Iterable<java.lang.String> iterable) {
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.institutionSelectPaneInstitutionList_);
    }

    private void addAllManualVerificationOfIncomeUploadPaneDocumentPreferences(java.lang.Iterable<? extends com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference> iterable) {
        ensureManualVerificationOfIncomeUploadPaneDocumentPreferencesIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.manualVerificationOfIncomeUploadPaneDocumentPreferences_);
    }

    private void addAllWalletSelectPaneHiddenWalletBrandList(java.lang.Iterable<java.lang.String> iterable) {
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.walletSelectPaneHiddenWalletBrandList_);
    }

    private void addAllWalletSelectPanePinnedWalletBrandList(java.lang.Iterable<java.lang.String> iterable) {
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.walletSelectPanePinnedWalletBrandList_);
    }

    private void addCountryCodesBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(byteString.toStringUtf8());
    }

    private void addDtmUseCasesValue(int i2) {
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.addInt(i2);
    }

    private void addInstitutionSelectPaneInstitutionListBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.add(byteString.toStringUtf8());
    }

    private void addWalletSelectPaneHiddenWalletBrandListBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        this.walletSelectPaneHiddenWalletBrandList_.add(byteString.toStringUtf8());
    }

    private void addWalletSelectPanePinnedWalletBrandListBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        this.walletSelectPanePinnedWalletBrandList_.add(byteString.toStringUtf8());
    }

    private void clearAccountClassBusinessDisabled() {
        this.accountClassBusinessDisabled_ = null;
        this.bitField2_ &= -131073;
    }

    private void clearAccountNumberPaneMessage() {
        this.accountNumberPaneMessage_ = null;
        this.bitField1_ &= -1073741825;
    }

    private void clearAccountNumberPaneSubmitButton() {
        this.accountNumberPaneSubmitButton_ = null;
        this.bitField1_ &= Integer.MAX_VALUE;
    }

    private void clearAccountNumberPaneTitle() {
        this.accountNumberPaneTitle_ = null;
        this.bitField1_ &= -536870913;
    }

    private void clearAccountSelectPaneIsEnabled() {
        this.accountSelectPaneIsEnabled_ = null;
        this.bitField2_ &= -33;
    }

    private void clearAccountSelectPaneIsMultiAccountSelectEnabled() {
        this.accountSelectPaneIsMultiAccountSelectEnabled_ = null;
        this.bitField2_ &= -65;
    }

    private void clearAccountSelectPaneMode() {
        this.accountSelectPaneMode_ = 0;
    }

    private void clearAccountSelectPaneSubmitButton() {
        this.accountSelectPaneSubmitButton_ = null;
        this.bitField2_ &= -17;
    }

    private void clearAccountSelectPaneTitle() {
        this.accountSelectPaneTitle_ = null;
        this.bitField2_ &= -9;
    }

    private void clearAuthFlowType() {
        this.authFlowType_ = null;
        this.bitField2_ &= -134217729;
    }

    private void clearConnectedPaneHeading() {
        this.connectedPaneHeading_ = null;
        this.bitField0_ &= -65537;
    }

    private void clearConnectedPaneIsEnabled() {
        this.connectedPaneIsEnabled_ = null;
        this.bitField0_ &= -32769;
    }

    private void clearConnectedPaneMessage() {
        this.connectedPaneMessage_ = null;
        this.bitField0_ &= -8193;
    }

    private void clearConnectedPaneSubmitButton() {
        this.connectedPaneSubmitButton_ = null;
        this.bitField0_ &= -16385;
    }

    private void clearConnectedPaneTitle() {
        this.connectedPaneTitle_ = null;
        this.bitField0_ &= -4097;
    }

    private void clearCountryCodes() {
        this.countryCodes_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearCredentialPanePlaidLegalEnabled() {
        this.credentialPanePlaidLegalEnabled_ = null;
        this.bitField0_ &= -16777217;
    }

    private void clearCredentialPaneResetPasswordButton() {
        this.credentialPaneResetPasswordButton_ = null;
        this.bitField0_ &= -8388609;
    }

    private void clearCredentialPaneSubmitButton() {
        this.credentialPaneSubmitButton_ = null;
        this.bitField0_ &= -4194305;
    }

    private void clearCredentialPaneTitle() {
        this.credentialPaneTitle_ = null;
        this.bitField0_ &= -2097153;
    }

    private void clearCredentialPaneTosContent() {
        this.credentialPaneTosContent_ = null;
        this.bitField0_ &= -33554433;
    }

    private void clearCredentialPaneTosEnabled() {
        this.credentialPaneTosEnabled_ = null;
        this.bitField0_ &= -67108865;
    }

    private void clearDocumentIncomeUploadPaneDocumentFileTypePreferences() {
        this.documentIncomeUploadPaneDocumentFileTypePreferences_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDocumentIncomeUploadPaneNumberOfUploadsPreferences() {
        this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = null;
        this.bitField2_ &= -262145;
    }

    private void clearDocumentTimeRange() {
        this.documentTimeRange_ = null;
        this.bitField2_ &= -536870913;
    }

    private void clearDtmEnablementStatus() {
        this.dtmEnablementStatus_ = null;
        this.bitField2_ &= -65537;
    }

    private void clearDtmUseCases() {
        this.dtmUseCases_ = com.google.protobuf.GeneratedMessageLite.emptyIntList();
    }

    private void clearErrorPaneTitle() {
        this.errorPaneTitle_ = null;
        this.bitField1_ &= -513;
    }

    private void clearEuConsentPaneCancel() {
        this.euConsentPaneCancel_ = null;
        this.bitField1_ &= -17;
    }

    private void clearEuConsentPaneContactDetailsTitle() {
        this.euConsentPaneContactDetailsTitle_ = null;
        this.bitField0_ &= -1073741825;
    }

    private void clearEuConsentPaneContinue() {
        this.euConsentPaneContinue_ = null;
        this.bitField1_ &= -9;
    }

    private void clearEuConsentPaneContinueAgree() {
        this.euConsentPaneContinueAgree_ = null;
        this.bitField1_ &= -5;
    }

    private void clearEuConsentPaneDetailsTitle() {
        this.euConsentPaneDetailsTitle_ = null;
        this.bitField1_ &= -3;
    }

    private void clearEuConsentPaneIsEnabled() {
        this.euConsentPaneIsEnabled_ = null;
        this.bitField0_ &= -134217729;
    }

    private void clearEuConsentPaneLinkWithPlaid() {
        this.euConsentPaneLinkWithPlaid_ = null;
        this.bitField0_ &= Integer.MAX_VALUE;
    }

    private void clearEuConsentPaneSubmitAgree() {
        this.euConsentPaneSubmitAgree_ = null;
        this.bitField0_ &= -536870913;
    }

    private void clearEuConsentPaneSubmitButton() {
        this.euConsentPaneSubmitButton_ = null;
        this.bitField0_ &= -268435457;
    }

    private void clearEuConsentPaneTransactionsTitle() {
        this.euConsentPaneTransactionsTitle_ = null;
        this.bitField1_ &= -2;
    }

    private void clearExitPaneCancelButton() {
        this.exitPaneCancelButton_ = null;
        this.bitField1_ &= -16385;
    }

    private void clearExitPaneHeading() {
        this.exitPaneHeading_ = null;
        this.bitField1_ &= -2049;
    }

    private void clearExitPaneMessage() {
        this.exitPaneMessage_ = null;
        this.bitField1_ &= -4097;
    }

    private void clearExitPaneSubmitButton() {
        this.exitPaneSubmitButton_ = null;
        this.bitField1_ &= -8193;
    }

    private void clearExitPaneTitle() {
        this.exitPaneTitle_ = null;
        this.bitField1_ &= -1025;
    }

    private void clearGlobalAppearance() {
        this.globalAppearance_ = 0;
    }

    private void clearGlobalButtonBorderRadius() {
        this.globalButtonBorderRadius_ = null;
        this.bitField0_ &= -129;
    }

    private void clearGlobalButtonColor() {
        this.globalButtonColor_ = null;
        this.bitField0_ &= -17;
    }

    private void clearGlobalButtonColorHover() {
        this.globalButtonColorHover_ = null;
        this.bitField0_ &= -33;
    }

    private void clearGlobalButtonDarkModeColor() {
        this.globalButtonDarkModeColor_ = null;
        this.bitField0_ &= -513;
    }

    private void clearGlobalButtonDarkModeColorHover() {
        this.globalButtonDarkModeColorHover_ = null;
        this.bitField0_ &= -1025;
    }

    private void clearGlobalButtonDarkModeTextColor() {
        this.globalButtonDarkModeTextColor_ = null;
        this.bitField0_ &= -2049;
    }

    private void clearGlobalButtonFontWeight() {
        this.globalButtonFontWeight_ = null;
        this.bitField0_ &= -257;
    }

    private void clearGlobalButtonTextColor() {
        this.globalButtonTextColor_ = null;
        this.bitField0_ &= -65;
    }

    private void clearGlobalHighlightColor() {
        this.globalHighlightColor_ = null;
        this.bitField0_ &= -5;
    }

    private void clearGlobalOverlayBackgroundColor() {
        this.globalOverlayBackgroundColor_ = null;
        this.bitField0_ &= -9;
    }

    private void clearIdentityMatchRiskProfileKey() {
        this.identityMatchRiskProfileKey_ = null;
        this.bitField2_ &= -268435457;
    }

    private void clearInstitutionSearchPaneExitButton() {
        this.institutionSearchPaneExitButton_ = null;
        this.bitField1_ &= -262145;
    }

    private void clearInstitutionSearchPaneInitialMessage() {
        this.institutionSearchPaneInitialMessage_ = null;
        this.bitField1_ &= -1048577;
    }

    private void clearInstitutionSearchPaneNoResultsMessage() {
        this.institutionSearchPaneNoResultsMessage_ = null;
        this.bitField1_ &= -2097153;
    }

    private void clearInstitutionSearchPanePlaceholder() {
        this.institutionSearchPanePlaceholder_ = null;
        this.bitField1_ &= -524289;
    }

    private void clearInstitutionSearchPaneTimeoutMessage() {
        this.institutionSearchPaneTimeoutMessage_ = null;
        this.bitField1_ &= -4194305;
    }

    private void clearInstitutionSelectPaneInstitutionList() {
        this.institutionSelectPaneInstitutionList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearInstitutionSelectPaneSearchButton() {
        this.institutionSelectPaneSearchButton_ = null;
        this.bitField1_ &= -65537;
    }

    private void clearInstitutionSelectPaneTitle() {
        this.institutionSelectPaneTitle_ = null;
        this.bitField1_ &= -32769;
    }

    private void clearInstitutionSelectPaneUseDynamicInstitutionSelect() {
        this.institutionSelectPaneUseDynamicInstitutionSelect_ = null;
        this.bitField1_ &= -131073;
    }

    private void clearIsVenmoSpecific() {
        this.isVenmoSpecific_ = null;
        this.bitField2_ &= -67108865;
    }

    private void clearLanguage() {
        this.language_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLayerConsentPaneHeaderTextAction() {
        this.layerConsentPaneHeaderTextAction_ = null;
        this.bitField1_ &= -8388609;
    }

    private void clearLayerConsentPaneHeaderTextProfileTerm() {
        this.layerConsentPaneHeaderTextProfileTerm_ = null;
        this.bitField1_ &= -16777217;
    }

    private void clearLoadingPaneTitle() {
        this.loadingPaneTitle_ = null;
        this.bitField1_ &= -33554433;
    }

    private void clearLogoUrl() {
        this.logoUrl_ = null;
        this.bitField2_ &= -4194305;
    }

    private void clearManualVerificationOfIncomeUploadPaneDocumentPreferences() {
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMfaPaneTitle() {
        this.mfaPaneTitle_ = null;
        this.bitField2_ &= -2;
    }

    private void clearOauthLandingPaneAfterContinue() {
        this.oauthLandingPaneAfterContinue_ = null;
        this.bitField1_ &= -65;
    }

    private void clearOauthLandingPaneAuthenticateBank() {
        this.oauthLandingPaneAuthenticateBank_ = null;
        this.bitField1_ &= -33;
    }

    private void clearOauthLandingPaneContinueToInstitution() {
        this.oauthLandingPaneContinueToInstitution_ = null;
        this.bitField1_ &= -257;
    }

    private void clearOauthLandingPaneRedirectedBack() {
        this.oauthLandingPaneRedirectedBack_ = null;
        this.bitField1_ &= -129;
    }

    private void clearPrivacyInterstitialPaneCoBrandedIsEnabled() {
        this.privacyInterstitialPaneCoBrandedIsEnabled_ = null;
        this.bitField2_ &= -1025;
    }

    private void clearPrivacyInterstitialPaneHeading() {
        this.privacyInterstitialPaneHeading_ = null;
        this.bitField2_ &= -129;
    }

    private void clearPrivacyInterstitialPaneHeadingAccountName() {
        this.privacyInterstitialPaneHeadingAccountName_ = null;
        this.bitField2_ &= -2049;
    }

    private void clearPrivacyInterstitialPaneSubmitAgree() {
        this.privacyInterstitialPaneSubmitAgree_ = null;
        this.bitField2_ &= -513;
    }

    private void clearPrivacyInterstitialPaneSubmitButton() {
        this.privacyInterstitialPaneSubmitButton_ = null;
        this.bitField2_ &= -257;
    }

    private void clearProductDomain() {
        this.productDomain_ = 0;
    }

    private void clearProductScopesTransparencyPaneAllowButton() {
        this.productScopesTransparencyPaneAllowButton_ = null;
        this.bitField2_ &= -8193;
    }

    private void clearProductScopesTransparencyPaneModalDismissButton() {
        this.productScopesTransparencyPaneModalDismissButton_ = null;
        this.bitField2_ &= -32769;
    }

    private void clearProductScopesTransparencyPaneMode() {
        this.productScopesTransparencyPaneMode_ = 0;
    }

    private void clearProductScopesTransparencyPaneUpdateUseCase() {
        this.productScopesTransparencyPaneUpdateUseCase_ = null;
        this.bitField2_ &= -16385;
    }

    private void clearProductScopesTransparencyPaneUseCase() {
        this.productScopesTransparencyPaneUseCase_ = null;
        this.bitField2_ &= -4097;
    }

    private void clearProfileEligibilityDesiredAccountType() {
        this.profileEligibilityDesiredAccountType_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldAddress() {
        this.profileEligibilityIdentityFieldAddress_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldDateOfBirth() {
        this.profileEligibilityIdentityFieldDateOfBirth_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldDocuments() {
        this.profileEligibilityIdentityFieldDocuments_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldEmail() {
        this.profileEligibilityIdentityFieldEmail_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldName() {
        this.profileEligibilityIdentityFieldName_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldSsn() {
        this.profileEligibilityIdentityFieldSsn_ = 0;
    }

    private void clearProfileEligibilityIdentityFieldSsnLast4Only() {
        this.profileEligibilityIdentityFieldSsnLast4Only_ = null;
        this.bitField2_ &= -8388609;
    }

    private void clearProfileEligibilityItemsAllowIndirect() {
        this.profileEligibilityItemsAllowIndirect_ = null;
        this.bitField2_ &= -16777217;
    }

    private void clearProfileEligibilityItemsAllowReauthentication() {
        this.profileEligibilityItemsAllowReauthentication_ = null;
        this.bitField2_ &= -33554433;
    }

    private void clearProfileEligibilityRequireIdentity() {
        this.profileEligibilityRequireIdentity_ = 0;
    }

    private void clearProfileEligibilityRequireItems() {
        this.profileEligibilityRequireItems_ = 0;
    }

    private void clearRecaptchaPaneMessage() {
        this.recaptchaPaneMessage_ = null;
        this.bitField2_ &= -5;
    }

    private void clearRecaptchaPaneTitle() {
        this.recaptchaPaneTitle_ = null;
        this.bitField2_ &= -3;
    }

    private void clearReconnectedPaneIsEnabled() {
        this.reconnectedPaneIsEnabled_ = null;
        this.bitField0_ &= -1048577;
    }

    private void clearReconnectedPaneMessage() {
        this.reconnectedPaneMessage_ = null;
        this.bitField0_ &= -262145;
    }

    private void clearReconnectedPaneSubmitButton() {
        this.reconnectedPaneSubmitButton_ = null;
        this.bitField0_ &= -524289;
    }

    private void clearReconnectedPaneTitle() {
        this.reconnectedPaneTitle_ = null;
        this.bitField0_ &= -131073;
    }

    private void clearRoutingNumberPaneMessage() {
        this.routingNumberPaneMessage_ = null;
        this.bitField1_ &= -134217729;
    }

    private void clearRoutingNumberPaneSubmitButton() {
        this.routingNumberPaneSubmitButton_ = null;
        this.bitField1_ &= -268435457;
    }

    private void clearRoutingNumberPaneTitle() {
        this.routingNumberPaneTitle_ = null;
        this.bitField1_ &= -67108865;
    }

    private void clearStartDateDaysAgo() {
        this.startDateDaysAgo_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTemplateName() {
        this.templateName_ = null;
        this.bitField2_ &= -1048577;
    }

    private void clearTemplateSymbol() {
        this.templateSymbol_ = null;
        this.bitField2_ &= -2097153;
    }

    private void clearTemplateTokenConfiguration() {
        this.templateTokenConfiguration_ = null;
        this.bitField2_ &= -524289;
    }

    private void clearWalletSelectPaneHiddenWalletBrandList() {
        this.walletSelectPaneHiddenWalletBrandList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWalletSelectPanePinnedWalletBrandList() {
        this.walletSelectPanePinnedWalletBrandList_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCountryCodesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.countryCodes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryCodes_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDocumentIncomeUploadPaneDocumentFileTypePreferencesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference> protobufList = this.documentIncomeUploadPaneDocumentFileTypePreferences_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.documentIncomeUploadPaneDocumentFileTypePreferences_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureDtmUseCasesIsMutable() {
        com.google.protobuf.Internal.IntList intList = this.dtmUseCases_;
        if (intList.isModifiable()) {
            return;
        }
        this.dtmUseCases_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureInstitutionSelectPaneInstitutionListIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.institutionSelectPaneInstitutionList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.institutionSelectPaneInstitutionList_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureManualVerificationOfIncomeUploadPaneDocumentPreferencesIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference> protobufList = this.manualVerificationOfIncomeUploadPaneDocumentPreferences_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureWalletSelectPaneHiddenWalletBrandListIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.walletSelectPaneHiddenWalletBrandList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.walletSelectPaneHiddenWalletBrandList_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureWalletSelectPanePinnedWalletBrandListIsMutable() {
        com.google.protobuf.Internal.ProtobufList<java.lang.String> protobufList = this.walletSelectPanePinnedWalletBrandList_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.walletSelectPanePinnedWalletBrandList_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDocumentIncomeUploadPaneDocumentFileTypePreferences(int i2) {
        ensureDocumentIncomeUploadPaneDocumentFileTypePreferencesIsMutable();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.remove(i2);
    }

    private void removeManualVerificationOfIncomeUploadPaneDocumentPreferences(int i2) {
        ensureManualVerificationOfIncomeUploadPaneDocumentPreferencesIsMutable();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.remove(i2);
    }

    private void setAccountSelectPaneMode(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b bVar) {
        this.accountSelectPaneMode_ = bVar.getNumber();
    }

    private void setAccountSelectPaneModeValue(int i2) {
        this.accountSelectPaneMode_ = i2;
    }

    private void setDtmUseCasesValue(int i2, int i3) {
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.setInt(i2, i3);
    }

    private void setGlobalAppearance(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c cVar) {
        this.globalAppearance_ = cVar.getNumber();
    }

    private void setGlobalAppearanceValue(int i2) {
        this.globalAppearance_ = i2;
    }

    private void setProductDomain(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f fVar) {
        this.productDomain_ = fVar.getNumber();
    }

    private void setProductDomainValue(int i2) {
        this.productDomain_ = i2;
    }

    private void setProductScopesTransparencyPaneMode(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g gVar) {
        this.productScopesTransparencyPaneMode_ = gVar.getNumber();
    }

    private void setProductScopesTransparencyPaneModeValue(int i2) {
        this.productScopesTransparencyPaneMode_ = i2;
    }

    private void setProfileEligibilityDesiredAccountType(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h hVar) {
        this.profileEligibilityDesiredAccountType_ = hVar.getNumber();
    }

    private void setProfileEligibilityDesiredAccountTypeValue(int i2) {
        this.profileEligibilityDesiredAccountType_ = i2;
    }

    private void setProfileEligibilityIdentityFieldAddress(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityIdentityFieldAddress_ = iVar.getNumber();
    }

    private void setProfileEligibilityIdentityFieldAddressValue(int i2) {
        this.profileEligibilityIdentityFieldAddress_ = i2;
    }

    private void setProfileEligibilityIdentityFieldDateOfBirth(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityIdentityFieldDateOfBirth_ = iVar.getNumber();
    }

    private void setProfileEligibilityIdentityFieldDateOfBirthValue(int i2) {
        this.profileEligibilityIdentityFieldDateOfBirth_ = i2;
    }

    private void setProfileEligibilityIdentityFieldDocuments(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityIdentityFieldDocuments_ = iVar.getNumber();
    }

    private void setProfileEligibilityIdentityFieldDocumentsValue(int i2) {
        this.profileEligibilityIdentityFieldDocuments_ = i2;
    }

    private void setProfileEligibilityIdentityFieldEmail(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityIdentityFieldEmail_ = iVar.getNumber();
    }

    private void setProfileEligibilityIdentityFieldEmailValue(int i2) {
        this.profileEligibilityIdentityFieldEmail_ = i2;
    }

    private void setProfileEligibilityIdentityFieldName(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityIdentityFieldName_ = iVar.getNumber();
    }

    private void setProfileEligibilityIdentityFieldNameValue(int i2) {
        this.profileEligibilityIdentityFieldName_ = i2;
    }

    private void setProfileEligibilityIdentityFieldSsn(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityIdentityFieldSsn_ = iVar.getNumber();
    }

    private void setProfileEligibilityIdentityFieldSsnValue(int i2) {
        this.profileEligibilityIdentityFieldSsn_ = i2;
    }

    private void setProfileEligibilityRequireIdentity(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityRequireIdentity_ = iVar.getNumber();
    }

    private void setProfileEligibilityRequireIdentityValue(int i2) {
        this.profileEligibilityRequireIdentity_ = i2;
    }

    private void setProfileEligibilityRequireItems(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i iVar) {
        this.profileEligibilityRequireItems_ = iVar.getNumber();
    }

    private void setProfileEligibilityRequireItemsValue(int i2) {
        this.profileEligibilityRequireItems_ = i2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.clients.a.f6030a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization();
            case 2:
                return new com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.d();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000r\u0000\u0003\u0001xr\u0000\u0007\u0000\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဉ\f\u0004ဉ\r\u0005ဉ\u000e\u0006ဉ\u000f\u0007ဉ\u0011\bဉ\u0012\tဉ\u0013\nဉ\u0014\u000bဉ\u0015\fဉ\u0016\rဉ\u0017\u000eဉ\u0018\u000fဉ\u0019\u0010ဉ\u001a\u0011ဉ\u001b\u0012ဉ\u001c\u0013ဉ\u001d\u0014ဉ)\u0015ဉ*\u0016ဉ+\u0017ဉ,\u0018ဉ-\u0019ဉ.\u001aဉ/\u001bဉ0\u001cȚ\u001dဉ2\u001eဉ3\u001fဉ4 ဉ5!ဉ6\"ဉ9#ဉ:$ဉ;%ဉ<&ဉ='ဉ>(ဉ?)ဉ@*ဉA+ဉB,ဉC-ဉD.ဉE/ဉF0ဉG1ဉH2ဉI4ဉ\u00015ဉ\u00007ဉ\u00108Ț9ဉ\u001e:ဉ\u001f;ဉ <ဉ!=ဉ\">ဉ#?ဉ$@ဉ%Aဉ&Bဉ'Cဉ(Eဉ1F\u001bIဉJJဉKK\fLဉQMဉLNဉMOဉNP\fQဉOR\fSȚTȚUဉ\u0004Vဉ\u0005Wဉ\u0006Xဉ\u0007Yဉ\bZ\u001b[ဉR\\\f]\f^\f_\f`\fa\fb\fc\fdဉXeဉYfဉ7gဉ8h,iဉPjဉ\\kဉZlဉ]mဉWn\fpဉTqဉVrဉUsဉ[tဉ\tuဉ\nvဉ\u000bw\fxဉS", new java.lang.Object[]{"bitField0_", "bitField1_", "bitField2_", "globalHighlightColor_", "globalOverlayBackgroundColor_", "connectedPaneTitle_", "connectedPaneMessage_", "connectedPaneSubmitButton_", "connectedPaneIsEnabled_", "reconnectedPaneTitle_", "reconnectedPaneMessage_", "reconnectedPaneSubmitButton_", "reconnectedPaneIsEnabled_", "credentialPaneTitle_", "credentialPaneSubmitButton_", "credentialPaneResetPasswordButton_", "credentialPanePlaidLegalEnabled_", "credentialPaneTosContent_", "credentialPaneTosEnabled_", "euConsentPaneIsEnabled_", "euConsentPaneSubmitButton_", "euConsentPaneSubmitAgree_", "errorPaneTitle_", "exitPaneTitle_", "exitPaneHeading_", "exitPaneMessage_", "exitPaneSubmitButton_", "exitPaneCancelButton_", "institutionSelectPaneTitle_", "institutionSelectPaneSearchButton_", "institutionSelectPaneInstitutionList_", "institutionSearchPaneExitButton_", "institutionSearchPanePlaceholder_", "institutionSearchPaneInitialMessage_", "institutionSearchPaneNoResultsMessage_", "institutionSearchPaneTimeoutMessage_", "loadingPaneTitle_", "routingNumberPaneTitle_", "routingNumberPaneMessage_", "routingNumberPaneSubmitButton_", "accountNumberPaneTitle_", "accountNumberPaneMessage_", "accountNumberPaneSubmitButton_", "mfaPaneTitle_", "recaptchaPaneTitle_", "recaptchaPaneMessage_", "accountSelectPaneTitle_", "accountSelectPaneSubmitButton_", "accountSelectPaneIsEnabled_", "accountSelectPaneIsMultiAccountSelectEnabled_", "privacyInterstitialPaneHeading_", "privacyInterstitialPaneSubmitButton_", "privacyInterstitialPaneSubmitAgree_", "startDateDaysAgo_", "language_", "connectedPaneHeading_", "countryCodes_", "euConsentPaneContactDetailsTitle_", "euConsentPaneLinkWithPlaid_", "euConsentPaneTransactionsTitle_", "euConsentPaneDetailsTitle_", "euConsentPaneContinueAgree_", "euConsentPaneContinue_", "euConsentPaneCancel_", "oauthLandingPaneAuthenticateBank_", "oauthLandingPaneAfterContinue_", "oauthLandingPaneRedirectedBack_", "oauthLandingPaneContinueToInstitution_", "institutionSelectPaneUseDynamicInstitutionSelect_", "manualVerificationOfIncomeUploadPaneDocumentPreferences_", com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference.class, "privacyInterstitialPaneCoBrandedIsEnabled_", "privacyInterstitialPaneHeadingAccountName_", "accountSelectPaneMode_", "accountClassBusinessDisabled_", "productScopesTransparencyPaneUseCase_", "productScopesTransparencyPaneAllowButton_", "productScopesTransparencyPaneUpdateUseCase_", "productScopesTransparencyPaneMode_", "productScopesTransparencyPaneModalDismissButton_", "globalAppearance_", "walletSelectPanePinnedWalletBrandList_", "walletSelectPaneHiddenWalletBrandList_", "globalButtonColor_", "globalButtonColorHover_", "globalButtonTextColor_", "globalButtonBorderRadius_", "globalButtonFontWeight_", "documentIncomeUploadPaneDocumentFileTypePreferences_", com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference.class, "documentIncomeUploadPaneNumberOfUploadsPreferences_", "profileEligibilityRequireIdentity_", "profileEligibilityIdentityFieldName_", "profileEligibilityIdentityFieldDateOfBirth_", "profileEligibilityIdentityFieldEmail_", "profileEligibilityIdentityFieldAddress_", "profileEligibilityIdentityFieldSsn_", "profileEligibilityIdentityFieldDocuments_", "profileEligibilityRequireItems_", "profileEligibilityItemsAllowIndirect_", "profileEligibilityItemsAllowReauthentication_", "layerConsentPaneHeaderTextAction_", "layerConsentPaneHeaderTextProfileTerm_", "dtmUseCases_", "dtmEnablementStatus_", "identityMatchRiskProfileKey_", "isVenmoSpecific_", "documentTimeRange_", "profileEligibilityIdentityFieldSsnLast4Only_", "productDomain_", "templateName_", "logoUrl_", "templateSymbol_", "authFlowType_", "globalButtonDarkModeColor_", "globalButtonDarkModeColorHover_", "globalButtonDarkModeTextColor_", "profileEligibilityDesiredAccountType_", "templateTokenConfiguration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.class) {
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

    public final com.google.protobuf.BoolValue getAccountClassBusinessDisabled() {
        com.google.protobuf.BoolValue boolValue = this.accountClassBusinessDisabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.StringValue getAccountNumberPaneMessage() {
        com.google.protobuf.StringValue stringValue = this.accountNumberPaneMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getAccountNumberPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.accountNumberPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getAccountNumberPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.accountNumberPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getAccountSelectPaneIsEnabled() {
        com.google.protobuf.BoolValue boolValue = this.accountSelectPaneIsEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.BoolValue getAccountSelectPaneIsMultiAccountSelectEnabled() {
        com.google.protobuf.BoolValue boolValue = this.accountSelectPaneIsMultiAccountSelectEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b getAccountSelectPaneMode() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b.forNumber(this.accountSelectPaneMode_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.b.UNRECOGNIZED : forNumber;
    }

    public final int getAccountSelectPaneModeValue() {
        return this.accountSelectPaneMode_;
    }

    public final com.google.protobuf.StringValue getAccountSelectPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.accountSelectPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getAccountSelectPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.accountSelectPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType getAuthFlowType() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType authFlowType = this.authFlowType_;
        return authFlowType == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType.getDefaultInstance() : authFlowType;
    }

    public final com.google.protobuf.StringValue getConnectedPaneHeading() {
        com.google.protobuf.StringValue stringValue = this.connectedPaneHeading_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getConnectedPaneIsEnabled() {
        com.google.protobuf.BoolValue boolValue = this.connectedPaneIsEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.StringValue getConnectedPaneMessage() {
        com.google.protobuf.StringValue stringValue = this.connectedPaneMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getConnectedPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.connectedPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getConnectedPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.connectedPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final java.lang.String getCountryCodes(int i2) {
        return this.countryCodes_.get(i2);
    }

    public final com.google.protobuf.ByteString getCountryCodesBytes(int i2) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.countryCodes_.get(i2));
    }

    public final int getCountryCodesCount() {
        return this.countryCodes_.size();
    }

    public final java.util.List<java.lang.String> getCountryCodesList() {
        return this.countryCodes_;
    }

    public final com.google.protobuf.BoolValue getCredentialPanePlaidLegalEnabled() {
        com.google.protobuf.BoolValue boolValue = this.credentialPanePlaidLegalEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.StringValue getCredentialPaneResetPasswordButton() {
        com.google.protobuf.StringValue stringValue = this.credentialPaneResetPasswordButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getCredentialPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.credentialPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getCredentialPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.credentialPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getCredentialPaneTosContent() {
        com.google.protobuf.StringValue stringValue = this.credentialPaneTosContent_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getCredentialPaneTosEnabled() {
        com.google.protobuf.BoolValue boolValue = this.credentialPaneTosEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference getDocumentIncomeUploadPaneDocumentFileTypePreferences(int i2) {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_.get(i2);
    }

    public final int getDocumentIncomeUploadPaneDocumentFileTypePreferencesCount() {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference> getDocumentIncomeUploadPaneDocumentFileTypePreferencesList() {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_;
    }

    public final com.plaid.internal.core.protos.income_verification_manager.c getDocumentIncomeUploadPaneDocumentFileTypePreferencesOrBuilder(int i2) {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_.get(i2);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.income_verification_manager.c> getDocumentIncomeUploadPaneDocumentFileTypePreferencesOrBuilderList() {
        return this.documentIncomeUploadPaneDocumentFileTypePreferences_;
    }

    public final com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences getDocumentIncomeUploadPaneNumberOfUploadsPreferences() {
        com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences = this.documentIncomeUploadPaneNumberOfUploadsPreferences_;
        return external$DocumentNumberOfUploadsPreferences == null ? com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.getDefaultInstance() : external$DocumentNumberOfUploadsPreferences;
    }

    public final com.google.protobuf.StringValue getDocumentTimeRange() {
        com.google.protobuf.StringValue stringValue = this.documentTimeRange_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getDtmEnablementStatus() {
        com.google.protobuf.BoolValue boolValue = this.dtmEnablementStatus_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e getDtmUseCases(int i2) {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e.forNumber(this.dtmUseCases_.getInt(i2));
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e.UNRECOGNIZED : forNumber;
    }

    public final int getDtmUseCasesCount() {
        return this.dtmUseCases_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e> getDtmUseCasesList() {
        return new com.google.protobuf.Internal.ListAdapter(this.dtmUseCases_, dtmUseCases_converter_);
    }

    public final int getDtmUseCasesValue(int i2) {
        return this.dtmUseCases_.getInt(i2);
    }

    public final java.util.List<java.lang.Integer> getDtmUseCasesValueList() {
        return this.dtmUseCases_;
    }

    public final com.google.protobuf.StringValue getErrorPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.errorPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneCancel() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneCancel_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneContactDetailsTitle() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneContactDetailsTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneContinue() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneContinue_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneContinueAgree() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneContinueAgree_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneDetailsTitle() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneDetailsTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getEuConsentPaneIsEnabled() {
        com.google.protobuf.BoolValue boolValue = this.euConsentPaneIsEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneLinkWithPlaid() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneLinkWithPlaid_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneSubmitAgree() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneSubmitAgree_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getEuConsentPaneTransactionsTitle() {
        com.google.protobuf.StringValue stringValue = this.euConsentPaneTransactionsTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getExitPaneCancelButton() {
        com.google.protobuf.StringValue stringValue = this.exitPaneCancelButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getExitPaneHeading() {
        com.google.protobuf.StringValue stringValue = this.exitPaneHeading_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getExitPaneMessage() {
        com.google.protobuf.StringValue stringValue = this.exitPaneMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getExitPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.exitPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getExitPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.exitPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c getGlobalAppearance() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c.forNumber(this.globalAppearance_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.c.UNRECOGNIZED : forNumber;
    }

    public final int getGlobalAppearanceValue() {
        return this.globalAppearance_;
    }

    public final com.google.protobuf.Int32Value getGlobalButtonBorderRadius() {
        com.google.protobuf.Int32Value int32Value = this.globalButtonBorderRadius_;
        return int32Value == null ? com.google.protobuf.Int32Value.getDefaultInstance() : int32Value;
    }

    public final com.google.protobuf.StringValue getGlobalButtonColor() {
        com.google.protobuf.StringValue stringValue = this.globalButtonColor_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalButtonColorHover() {
        com.google.protobuf.StringValue stringValue = this.globalButtonColorHover_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalButtonDarkModeColor() {
        com.google.protobuf.StringValue stringValue = this.globalButtonDarkModeColor_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalButtonDarkModeColorHover() {
        com.google.protobuf.StringValue stringValue = this.globalButtonDarkModeColorHover_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalButtonDarkModeTextColor() {
        com.google.protobuf.StringValue stringValue = this.globalButtonDarkModeTextColor_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalButtonFontWeight() {
        com.google.protobuf.StringValue stringValue = this.globalButtonFontWeight_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalButtonTextColor() {
        com.google.protobuf.StringValue stringValue = this.globalButtonTextColor_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalHighlightColor() {
        com.google.protobuf.StringValue stringValue = this.globalHighlightColor_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getGlobalOverlayBackgroundColor() {
        com.google.protobuf.StringValue stringValue = this.globalOverlayBackgroundColor_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getIdentityMatchRiskProfileKey() {
        com.google.protobuf.StringValue stringValue = this.identityMatchRiskProfileKey_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getInstitutionSearchPaneExitButton() {
        com.google.protobuf.StringValue stringValue = this.institutionSearchPaneExitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getInstitutionSearchPaneInitialMessage() {
        com.google.protobuf.StringValue stringValue = this.institutionSearchPaneInitialMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getInstitutionSearchPaneNoResultsMessage() {
        com.google.protobuf.StringValue stringValue = this.institutionSearchPaneNoResultsMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getInstitutionSearchPanePlaceholder() {
        com.google.protobuf.StringValue stringValue = this.institutionSearchPanePlaceholder_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getInstitutionSearchPaneTimeoutMessage() {
        com.google.protobuf.StringValue stringValue = this.institutionSearchPaneTimeoutMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final java.lang.String getInstitutionSelectPaneInstitutionList(int i2) {
        return this.institutionSelectPaneInstitutionList_.get(i2);
    }

    public final com.google.protobuf.ByteString getInstitutionSelectPaneInstitutionListBytes(int i2) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.institutionSelectPaneInstitutionList_.get(i2));
    }

    public final int getInstitutionSelectPaneInstitutionListCount() {
        return this.institutionSelectPaneInstitutionList_.size();
    }

    public final java.util.List<java.lang.String> getInstitutionSelectPaneInstitutionListList() {
        return this.institutionSelectPaneInstitutionList_;
    }

    public final com.google.protobuf.StringValue getInstitutionSelectPaneSearchButton() {
        com.google.protobuf.StringValue stringValue = this.institutionSelectPaneSearchButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getInstitutionSelectPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.institutionSelectPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getInstitutionSelectPaneUseDynamicInstitutionSelect() {
        com.google.protobuf.BoolValue boolValue = this.institutionSelectPaneUseDynamicInstitutionSelect_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.BoolValue getIsVenmoSpecific() {
        com.google.protobuf.BoolValue boolValue = this.isVenmoSpecific_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.StringValue getLanguage() {
        com.google.protobuf.StringValue stringValue = this.language_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getLayerConsentPaneHeaderTextAction() {
        com.google.protobuf.StringValue stringValue = this.layerConsentPaneHeaderTextAction_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getLayerConsentPaneHeaderTextProfileTerm() {
        com.google.protobuf.StringValue stringValue = this.layerConsentPaneHeaderTextProfileTerm_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getLoadingPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.loadingPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getLogoUrl() {
        com.google.protobuf.StringValue stringValue = this.logoUrl_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference getManualVerificationOfIncomeUploadPaneDocumentPreferences(int i2) {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.get(i2);
    }

    public final int getManualVerificationOfIncomeUploadPaneDocumentPreferencesCount() {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference> getManualVerificationOfIncomeUploadPaneDocumentPreferencesList() {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_;
    }

    public final com.plaid.internal.core.protos.clients.b getManualVerificationOfIncomeUploadPaneDocumentPreferencesOrBuilder(int i2) {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.get(i2);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.clients.b> getManualVerificationOfIncomeUploadPaneDocumentPreferencesOrBuilderList() {
        return this.manualVerificationOfIncomeUploadPaneDocumentPreferences_;
    }

    public final com.google.protobuf.StringValue getMfaPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.mfaPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getOauthLandingPaneAfterContinue() {
        com.google.protobuf.StringValue stringValue = this.oauthLandingPaneAfterContinue_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getOauthLandingPaneAuthenticateBank() {
        com.google.protobuf.StringValue stringValue = this.oauthLandingPaneAuthenticateBank_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getOauthLandingPaneContinueToInstitution() {
        com.google.protobuf.StringValue stringValue = this.oauthLandingPaneContinueToInstitution_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getOauthLandingPaneRedirectedBack() {
        com.google.protobuf.StringValue stringValue = this.oauthLandingPaneRedirectedBack_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getPrivacyInterstitialPaneCoBrandedIsEnabled() {
        com.google.protobuf.BoolValue boolValue = this.privacyInterstitialPaneCoBrandedIsEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.StringValue getPrivacyInterstitialPaneHeading() {
        com.google.protobuf.StringValue stringValue = this.privacyInterstitialPaneHeading_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getPrivacyInterstitialPaneHeadingAccountName() {
        com.google.protobuf.StringValue stringValue = this.privacyInterstitialPaneHeadingAccountName_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getPrivacyInterstitialPaneSubmitAgree() {
        com.google.protobuf.StringValue stringValue = this.privacyInterstitialPaneSubmitAgree_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getPrivacyInterstitialPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.privacyInterstitialPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f getProductDomain() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f.forNumber(this.productDomain_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.f.UNRECOGNIZED : forNumber;
    }

    public final int getProductDomainValue() {
        return this.productDomain_;
    }

    public final com.google.protobuf.StringValue getProductScopesTransparencyPaneAllowButton() {
        com.google.protobuf.StringValue stringValue = this.productScopesTransparencyPaneAllowButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getProductScopesTransparencyPaneModalDismissButton() {
        com.google.protobuf.StringValue stringValue = this.productScopesTransparencyPaneModalDismissButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g getProductScopesTransparencyPaneMode() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g.forNumber(this.productScopesTransparencyPaneMode_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.g.UNRECOGNIZED : forNumber;
    }

    public final int getProductScopesTransparencyPaneModeValue() {
        return this.productScopesTransparencyPaneMode_;
    }

    public final com.google.protobuf.StringValue getProductScopesTransparencyPaneUpdateUseCase() {
        com.google.protobuf.StringValue stringValue = this.productScopesTransparencyPaneUpdateUseCase_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getProductScopesTransparencyPaneUseCase() {
        com.google.protobuf.StringValue stringValue = this.productScopesTransparencyPaneUseCase_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h getProfileEligibilityDesiredAccountType() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h.forNumber(this.profileEligibilityDesiredAccountType_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.h.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityDesiredAccountTypeValue() {
        return this.profileEligibilityDesiredAccountType_;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityIdentityFieldAddress() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityIdentityFieldAddress_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityIdentityFieldAddressValue() {
        return this.profileEligibilityIdentityFieldAddress_;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityIdentityFieldDateOfBirth() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityIdentityFieldDateOfBirth_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityIdentityFieldDateOfBirthValue() {
        return this.profileEligibilityIdentityFieldDateOfBirth_;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityIdentityFieldDocuments() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityIdentityFieldDocuments_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityIdentityFieldDocumentsValue() {
        return this.profileEligibilityIdentityFieldDocuments_;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityIdentityFieldEmail() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityIdentityFieldEmail_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityIdentityFieldEmailValue() {
        return this.profileEligibilityIdentityFieldEmail_;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityIdentityFieldName() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityIdentityFieldName_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityIdentityFieldNameValue() {
        return this.profileEligibilityIdentityFieldName_;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityIdentityFieldSsn() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityIdentityFieldSsn_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final com.google.protobuf.BoolValue getProfileEligibilityIdentityFieldSsnLast4Only() {
        com.google.protobuf.BoolValue boolValue = this.profileEligibilityIdentityFieldSsnLast4Only_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final int getProfileEligibilityIdentityFieldSsnValue() {
        return this.profileEligibilityIdentityFieldSsn_;
    }

    public final com.google.protobuf.BoolValue getProfileEligibilityItemsAllowIndirect() {
        com.google.protobuf.BoolValue boolValue = this.profileEligibilityItemsAllowIndirect_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.BoolValue getProfileEligibilityItemsAllowReauthentication() {
        com.google.protobuf.BoolValue boolValue = this.profileEligibilityItemsAllowReauthentication_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityRequireIdentity() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityRequireIdentity_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityRequireIdentityValue() {
        return this.profileEligibilityRequireIdentity_;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i getProfileEligibilityRequireItems() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i forNumber = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.forNumber(this.profileEligibilityRequireItems_);
        return forNumber == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.i.UNRECOGNIZED : forNumber;
    }

    public final int getProfileEligibilityRequireItemsValue() {
        return this.profileEligibilityRequireItems_;
    }

    public final com.google.protobuf.StringValue getRecaptchaPaneMessage() {
        com.google.protobuf.StringValue stringValue = this.recaptchaPaneMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getRecaptchaPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.recaptchaPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.BoolValue getReconnectedPaneIsEnabled() {
        com.google.protobuf.BoolValue boolValue = this.reconnectedPaneIsEnabled_;
        return boolValue == null ? com.google.protobuf.BoolValue.getDefaultInstance() : boolValue;
    }

    public final com.google.protobuf.StringValue getReconnectedPaneMessage() {
        com.google.protobuf.StringValue stringValue = this.reconnectedPaneMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getReconnectedPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.reconnectedPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getReconnectedPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.reconnectedPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getRoutingNumberPaneMessage() {
        com.google.protobuf.StringValue stringValue = this.routingNumberPaneMessage_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getRoutingNumberPaneSubmitButton() {
        com.google.protobuf.StringValue stringValue = this.routingNumberPaneSubmitButton_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getRoutingNumberPaneTitle() {
        com.google.protobuf.StringValue stringValue = this.routingNumberPaneTitle_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.Int32Value getStartDateDaysAgo() {
        com.google.protobuf.Int32Value int32Value = this.startDateDaysAgo_;
        return int32Value == null ? com.google.protobuf.Int32Value.getDefaultInstance() : int32Value;
    }

    public final com.google.protobuf.StringValue getTemplateName() {
        com.google.protobuf.StringValue stringValue = this.templateName_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.google.protobuf.StringValue getTemplateSymbol() {
        com.google.protobuf.StringValue stringValue = this.templateSymbol_;
        return stringValue == null ? com.google.protobuf.StringValue.getDefaultInstance() : stringValue;
    }

    public final com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration getTemplateTokenConfiguration() {
        com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration = this.templateTokenConfiguration_;
        return linkCustomizations$TemplateTokenConfiguration == null ? com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.getDefaultInstance() : linkCustomizations$TemplateTokenConfiguration;
    }

    public final java.lang.String getWalletSelectPaneHiddenWalletBrandList(int i2) {
        return this.walletSelectPaneHiddenWalletBrandList_.get(i2);
    }

    public final com.google.protobuf.ByteString getWalletSelectPaneHiddenWalletBrandListBytes(int i2) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.walletSelectPaneHiddenWalletBrandList_.get(i2));
    }

    public final int getWalletSelectPaneHiddenWalletBrandListCount() {
        return this.walletSelectPaneHiddenWalletBrandList_.size();
    }

    public final java.util.List<java.lang.String> getWalletSelectPaneHiddenWalletBrandListList() {
        return this.walletSelectPaneHiddenWalletBrandList_;
    }

    public final java.lang.String getWalletSelectPanePinnedWalletBrandList(int i2) {
        return this.walletSelectPanePinnedWalletBrandList_.get(i2);
    }

    public final com.google.protobuf.ByteString getWalletSelectPanePinnedWalletBrandListBytes(int i2) {
        return com.google.protobuf.ByteString.copyFromUtf8(this.walletSelectPanePinnedWalletBrandList_.get(i2));
    }

    public final int getWalletSelectPanePinnedWalletBrandListCount() {
        return this.walletSelectPanePinnedWalletBrandList_.size();
    }

    public final java.util.List<java.lang.String> getWalletSelectPanePinnedWalletBrandListList() {
        return this.walletSelectPanePinnedWalletBrandList_;
    }

    public final boolean hasAccountClassBusinessDisabled() {
        return (this.bitField2_ & 131072) != 0;
    }

    public final boolean hasAccountNumberPaneMessage() {
        return (this.bitField1_ & 1073741824) != 0;
    }

    public final boolean hasAccountNumberPaneSubmitButton() {
        return (this.bitField1_ & Integer.MIN_VALUE) != 0;
    }

    public final boolean hasAccountNumberPaneTitle() {
        return (this.bitField1_ & 536870912) != 0;
    }

    public final boolean hasAccountSelectPaneIsEnabled() {
        return (this.bitField2_ & 32) != 0;
    }

    public final boolean hasAccountSelectPaneIsMultiAccountSelectEnabled() {
        return (this.bitField2_ & 64) != 0;
    }

    public final boolean hasAccountSelectPaneSubmitButton() {
        return (this.bitField2_ & 16) != 0;
    }

    public final boolean hasAccountSelectPaneTitle() {
        return (this.bitField2_ & 8) != 0;
    }

    public final boolean hasAuthFlowType() {
        return (this.bitField2_ & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean hasConnectedPaneHeading() {
        return (this.bitField0_ & 65536) != 0;
    }

    public final boolean hasConnectedPaneIsEnabled() {
        return (this.bitField0_ & 32768) != 0;
    }

    public final boolean hasConnectedPaneMessage() {
        return (this.bitField0_ & 8192) != 0;
    }

    public final boolean hasConnectedPaneSubmitButton() {
        return (this.bitField0_ & 16384) != 0;
    }

    public final boolean hasConnectedPaneTitle() {
        return (this.bitField0_ & 4096) != 0;
    }

    public final boolean hasCredentialPanePlaidLegalEnabled() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public final boolean hasCredentialPaneResetPasswordButton() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public final boolean hasCredentialPaneSubmitButton() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public final boolean hasCredentialPaneTitle() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public final boolean hasCredentialPaneTosContent() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public final boolean hasCredentialPaneTosEnabled() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public final boolean hasDocumentIncomeUploadPaneNumberOfUploadsPreferences() {
        return (this.bitField2_ & 262144) != 0;
    }

    public final boolean hasDocumentTimeRange() {
        return (this.bitField2_ & 536870912) != 0;
    }

    public final boolean hasDtmEnablementStatus() {
        return (this.bitField2_ & 65536) != 0;
    }

    public final boolean hasErrorPaneTitle() {
        return (this.bitField1_ & 512) != 0;
    }

    public final boolean hasEuConsentPaneCancel() {
        return (this.bitField1_ & 16) != 0;
    }

    public final boolean hasEuConsentPaneContactDetailsTitle() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public final boolean hasEuConsentPaneContinue() {
        return (this.bitField1_ & 8) != 0;
    }

    public final boolean hasEuConsentPaneContinueAgree() {
        return (this.bitField1_ & 4) != 0;
    }

    public final boolean hasEuConsentPaneDetailsTitle() {
        return (this.bitField1_ & 2) != 0;
    }

    public final boolean hasEuConsentPaneIsEnabled() {
        return (this.bitField0_ & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean hasEuConsentPaneLinkWithPlaid() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public final boolean hasEuConsentPaneSubmitAgree() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public final boolean hasEuConsentPaneSubmitButton() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public final boolean hasEuConsentPaneTransactionsTitle() {
        return (this.bitField1_ & 1) != 0;
    }

    public final boolean hasExitPaneCancelButton() {
        return (this.bitField1_ & 16384) != 0;
    }

    public final boolean hasExitPaneHeading() {
        return (this.bitField1_ & 2048) != 0;
    }

    public final boolean hasExitPaneMessage() {
        return (this.bitField1_ & 4096) != 0;
    }

    public final boolean hasExitPaneSubmitButton() {
        return (this.bitField1_ & 8192) != 0;
    }

    public final boolean hasExitPaneTitle() {
        return (this.bitField1_ & 1024) != 0;
    }

    public final boolean hasGlobalButtonBorderRadius() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean hasGlobalButtonColor() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasGlobalButtonColorHover() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean hasGlobalButtonDarkModeColor() {
        return (this.bitField0_ & 512) != 0;
    }

    public final boolean hasGlobalButtonDarkModeColorHover() {
        return (this.bitField0_ & 1024) != 0;
    }

    public final boolean hasGlobalButtonDarkModeTextColor() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean hasGlobalButtonFontWeight() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasGlobalButtonTextColor() {
        return (this.bitField0_ & 64) != 0;
    }

    public final boolean hasGlobalHighlightColor() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasGlobalOverlayBackgroundColor() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean hasIdentityMatchRiskProfileKey() {
        return (this.bitField2_ & 268435456) != 0;
    }

    public final boolean hasInstitutionSearchPaneExitButton() {
        return (this.bitField1_ & 262144) != 0;
    }

    public final boolean hasInstitutionSearchPaneInitialMessage() {
        return (this.bitField1_ & 1048576) != 0;
    }

    public final boolean hasInstitutionSearchPaneNoResultsMessage() {
        return (this.bitField1_ & 2097152) != 0;
    }

    public final boolean hasInstitutionSearchPanePlaceholder() {
        return (this.bitField1_ & 524288) != 0;
    }

    public final boolean hasInstitutionSearchPaneTimeoutMessage() {
        return (this.bitField1_ & 4194304) != 0;
    }

    public final boolean hasInstitutionSelectPaneSearchButton() {
        return (this.bitField1_ & 65536) != 0;
    }

    public final boolean hasInstitutionSelectPaneTitle() {
        return (this.bitField1_ & 32768) != 0;
    }

    public final boolean hasInstitutionSelectPaneUseDynamicInstitutionSelect() {
        return (this.bitField1_ & 131072) != 0;
    }

    public final boolean hasIsVenmoSpecific() {
        return (this.bitField2_ & 67108864) != 0;
    }

    public final boolean hasLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean hasLayerConsentPaneHeaderTextAction() {
        return (this.bitField1_ & 8388608) != 0;
    }

    public final boolean hasLayerConsentPaneHeaderTextProfileTerm() {
        return (this.bitField1_ & 16777216) != 0;
    }

    public final boolean hasLoadingPaneTitle() {
        return (this.bitField1_ & 33554432) != 0;
    }

    public final boolean hasLogoUrl() {
        return (this.bitField2_ & 4194304) != 0;
    }

    public final boolean hasMfaPaneTitle() {
        return (this.bitField2_ & 1) != 0;
    }

    public final boolean hasOauthLandingPaneAfterContinue() {
        return (this.bitField1_ & 64) != 0;
    }

    public final boolean hasOauthLandingPaneAuthenticateBank() {
        return (this.bitField1_ & 32) != 0;
    }

    public final boolean hasOauthLandingPaneContinueToInstitution() {
        return (this.bitField1_ & 256) != 0;
    }

    public final boolean hasOauthLandingPaneRedirectedBack() {
        return (this.bitField1_ & 128) != 0;
    }

    public final boolean hasPrivacyInterstitialPaneCoBrandedIsEnabled() {
        return (this.bitField2_ & 1024) != 0;
    }

    public final boolean hasPrivacyInterstitialPaneHeading() {
        return (this.bitField2_ & 128) != 0;
    }

    public final boolean hasPrivacyInterstitialPaneHeadingAccountName() {
        return (this.bitField2_ & 2048) != 0;
    }

    public final boolean hasPrivacyInterstitialPaneSubmitAgree() {
        return (this.bitField2_ & 512) != 0;
    }

    public final boolean hasPrivacyInterstitialPaneSubmitButton() {
        return (this.bitField2_ & 256) != 0;
    }

    public final boolean hasProductScopesTransparencyPaneAllowButton() {
        return (this.bitField2_ & 8192) != 0;
    }

    public final boolean hasProductScopesTransparencyPaneModalDismissButton() {
        return (this.bitField2_ & 32768) != 0;
    }

    public final boolean hasProductScopesTransparencyPaneUpdateUseCase() {
        return (this.bitField2_ & 16384) != 0;
    }

    public final boolean hasProductScopesTransparencyPaneUseCase() {
        return (this.bitField2_ & 4096) != 0;
    }

    public final boolean hasProfileEligibilityIdentityFieldSsnLast4Only() {
        return (this.bitField2_ & 8388608) != 0;
    }

    public final boolean hasProfileEligibilityItemsAllowIndirect() {
        return (this.bitField2_ & 16777216) != 0;
    }

    public final boolean hasProfileEligibilityItemsAllowReauthentication() {
        return (this.bitField2_ & 33554432) != 0;
    }

    public final boolean hasRecaptchaPaneMessage() {
        return (this.bitField2_ & 4) != 0;
    }

    public final boolean hasRecaptchaPaneTitle() {
        return (this.bitField2_ & 2) != 0;
    }

    public final boolean hasReconnectedPaneIsEnabled() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public final boolean hasReconnectedPaneMessage() {
        return (this.bitField0_ & 262144) != 0;
    }

    public final boolean hasReconnectedPaneSubmitButton() {
        return (this.bitField0_ & 524288) != 0;
    }

    public final boolean hasReconnectedPaneTitle() {
        return (this.bitField0_ & 131072) != 0;
    }

    public final boolean hasRoutingNumberPaneMessage() {
        return (this.bitField1_ & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0;
    }

    public final boolean hasRoutingNumberPaneSubmitButton() {
        return (this.bitField1_ & 268435456) != 0;
    }

    public final boolean hasRoutingNumberPaneTitle() {
        return (this.bitField1_ & 67108864) != 0;
    }

    public final boolean hasStartDateDaysAgo() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean hasTemplateName() {
        return (this.bitField2_ & 1048576) != 0;
    }

    public final boolean hasTemplateSymbol() {
        return (this.bitField2_ & 2097152) != 0;
    }

    public final boolean hasTemplateTokenConfiguration() {
        return (this.bitField2_ & 524288) != 0;
    }

    private void addCountryCodes(java.lang.String str) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.add(str);
    }

    private void addDocumentIncomeUploadPaneDocumentFileTypePreferences(com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        ensureDocumentIncomeUploadPaneDocumentFileTypePreferencesIsMutable();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.add(external$DocumentUploadFilePreference);
    }

    private void addDtmUseCases(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e eVar) {
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.addInt(eVar.getNumber());
    }

    private void addInstitutionSelectPaneInstitutionList(java.lang.String str) {
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.add(str);
    }

    private void addManualVerificationOfIncomeUploadPaneDocumentPreferences(com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        ensureManualVerificationOfIncomeUploadPaneDocumentPreferencesIsMutable();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.add(linkCustomizations$DocumentPreference);
    }

    private void addWalletSelectPaneHiddenWalletBrandList(java.lang.String str) {
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        this.walletSelectPaneHiddenWalletBrandList_.add(str);
    }

    private void addWalletSelectPanePinnedWalletBrandList(java.lang.String str) {
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        this.walletSelectPanePinnedWalletBrandList_.add(str);
    }

    private void mergeAccountClassBusinessDisabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.accountClassBusinessDisabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.accountClassBusinessDisabled_ = boolValue;
        } else {
            this.accountClassBusinessDisabled_ = com.google.protobuf.BoolValue.newBuilder(this.accountClassBusinessDisabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 131072;
    }

    private void mergeAccountNumberPaneMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.accountNumberPaneMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.accountNumberPaneMessage_ = stringValue;
        } else {
            this.accountNumberPaneMessage_ = com.google.protobuf.StringValue.newBuilder(this.accountNumberPaneMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1073741824;
    }

    private void mergeAccountNumberPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.accountNumberPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.accountNumberPaneSubmitButton_ = stringValue;
        } else {
            this.accountNumberPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.accountNumberPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    private void mergeAccountNumberPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.accountNumberPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.accountNumberPaneTitle_ = stringValue;
        } else {
            this.accountNumberPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.accountNumberPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 536870912;
    }

    private void mergeAccountSelectPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.accountSelectPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.accountSelectPaneIsEnabled_ = boolValue;
        } else {
            this.accountSelectPaneIsEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.accountSelectPaneIsEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 32;
    }

    private void mergeAccountSelectPaneIsMultiAccountSelectEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.accountSelectPaneIsMultiAccountSelectEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.accountSelectPaneIsMultiAccountSelectEnabled_ = boolValue;
        } else {
            this.accountSelectPaneIsMultiAccountSelectEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.accountSelectPaneIsMultiAccountSelectEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 64;
    }

    private void mergeAccountSelectPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.accountSelectPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.accountSelectPaneSubmitButton_ = stringValue;
        } else {
            this.accountSelectPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.accountSelectPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 16;
    }

    private void mergeAccountSelectPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.accountSelectPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.accountSelectPaneTitle_ = stringValue;
        } else {
            this.accountSelectPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.accountSelectPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 8;
    }

    private void mergeAuthFlowType(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType authFlowType) {
        com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType authFlowType2 = this.authFlowType_;
        if (authFlowType2 == null || authFlowType2 == com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType.getDefaultInstance()) {
            this.authFlowType_ = authFlowType;
        } else {
            this.authFlowType_ = com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType.newBuilder(this.authFlowType_).mergeFrom((com.plaid.internal.core.protos.clients.LinkCustomizations.LinkCustomization.AuthFlowType.a) authFlowType).buildPartial();
        }
        this.bitField2_ |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    private void mergeConnectedPaneHeading(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.connectedPaneHeading_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.connectedPaneHeading_ = stringValue;
        } else {
            this.connectedPaneHeading_ = com.google.protobuf.StringValue.newBuilder(this.connectedPaneHeading_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 65536;
    }

    private void mergeConnectedPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.connectedPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.connectedPaneIsEnabled_ = boolValue;
        } else {
            this.connectedPaneIsEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.connectedPaneIsEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 32768;
    }

    private void mergeConnectedPaneMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.connectedPaneMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.connectedPaneMessage_ = stringValue;
        } else {
            this.connectedPaneMessage_ = com.google.protobuf.StringValue.newBuilder(this.connectedPaneMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 8192;
    }

    private void mergeConnectedPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.connectedPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.connectedPaneSubmitButton_ = stringValue;
        } else {
            this.connectedPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.connectedPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 16384;
    }

    private void mergeConnectedPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.connectedPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.connectedPaneTitle_ = stringValue;
        } else {
            this.connectedPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.connectedPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 4096;
    }

    private void mergeCredentialPanePlaidLegalEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.credentialPanePlaidLegalEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.credentialPanePlaidLegalEnabled_ = boolValue;
        } else {
            this.credentialPanePlaidLegalEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.credentialPanePlaidLegalEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 16777216;
    }

    private void mergeCredentialPaneResetPasswordButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.credentialPaneResetPasswordButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.credentialPaneResetPasswordButton_ = stringValue;
        } else {
            this.credentialPaneResetPasswordButton_ = com.google.protobuf.StringValue.newBuilder(this.credentialPaneResetPasswordButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 8388608;
    }

    private void mergeCredentialPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.credentialPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.credentialPaneSubmitButton_ = stringValue;
        } else {
            this.credentialPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.credentialPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 4194304;
    }

    private void mergeCredentialPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.credentialPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.credentialPaneTitle_ = stringValue;
        } else {
            this.credentialPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.credentialPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 2097152;
    }

    private void mergeCredentialPaneTosContent(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.credentialPaneTosContent_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.credentialPaneTosContent_ = stringValue;
        } else {
            this.credentialPaneTosContent_ = com.google.protobuf.StringValue.newBuilder(this.credentialPaneTosContent_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 33554432;
    }

    private void mergeCredentialPaneTosEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.credentialPaneTosEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.credentialPaneTosEnabled_ = boolValue;
        } else {
            this.credentialPaneTosEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.credentialPaneTosEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 67108864;
    }

    private void mergeDocumentIncomeUploadPaneNumberOfUploadsPreferences(com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences) {
        com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences2 = this.documentIncomeUploadPaneNumberOfUploadsPreferences_;
        if (external$DocumentNumberOfUploadsPreferences2 == null || external$DocumentNumberOfUploadsPreferences2 == com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.getDefaultInstance()) {
            this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = external$DocumentNumberOfUploadsPreferences;
        } else {
            this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.newBuilder(this.documentIncomeUploadPaneNumberOfUploadsPreferences_).mergeFrom((com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences.a) external$DocumentNumberOfUploadsPreferences).buildPartial();
        }
        this.bitField2_ |= 262144;
    }

    private void mergeDocumentTimeRange(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.documentTimeRange_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.documentTimeRange_ = stringValue;
        } else {
            this.documentTimeRange_ = com.google.protobuf.StringValue.newBuilder(this.documentTimeRange_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 536870912;
    }

    private void mergeDtmEnablementStatus(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.dtmEnablementStatus_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.dtmEnablementStatus_ = boolValue;
        } else {
            this.dtmEnablementStatus_ = com.google.protobuf.BoolValue.newBuilder(this.dtmEnablementStatus_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 65536;
    }

    private void mergeErrorPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.errorPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.errorPaneTitle_ = stringValue;
        } else {
            this.errorPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.errorPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 512;
    }

    private void mergeEuConsentPaneCancel(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneCancel_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneCancel_ = stringValue;
        } else {
            this.euConsentPaneCancel_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneCancel_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 16;
    }

    private void mergeEuConsentPaneContactDetailsTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneContactDetailsTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneContactDetailsTitle_ = stringValue;
        } else {
            this.euConsentPaneContactDetailsTitle_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneContactDetailsTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 1073741824;
    }

    private void mergeEuConsentPaneContinue(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneContinue_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneContinue_ = stringValue;
        } else {
            this.euConsentPaneContinue_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneContinue_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 8;
    }

    private void mergeEuConsentPaneContinueAgree(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneContinueAgree_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneContinueAgree_ = stringValue;
        } else {
            this.euConsentPaneContinueAgree_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneContinueAgree_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 4;
    }

    private void mergeEuConsentPaneDetailsTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneDetailsTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneDetailsTitle_ = stringValue;
        } else {
            this.euConsentPaneDetailsTitle_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneDetailsTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 2;
    }

    private void mergeEuConsentPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.euConsentPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.euConsentPaneIsEnabled_ = boolValue;
        } else {
            this.euConsentPaneIsEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.euConsentPaneIsEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    private void mergeEuConsentPaneLinkWithPlaid(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneLinkWithPlaid_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneLinkWithPlaid_ = stringValue;
        } else {
            this.euConsentPaneLinkWithPlaid_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneLinkWithPlaid_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    private void mergeEuConsentPaneSubmitAgree(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneSubmitAgree_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneSubmitAgree_ = stringValue;
        } else {
            this.euConsentPaneSubmitAgree_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneSubmitAgree_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 536870912;
    }

    private void mergeEuConsentPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneSubmitButton_ = stringValue;
        } else {
            this.euConsentPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 268435456;
    }

    private void mergeEuConsentPaneTransactionsTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.euConsentPaneTransactionsTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.euConsentPaneTransactionsTitle_ = stringValue;
        } else {
            this.euConsentPaneTransactionsTitle_ = com.google.protobuf.StringValue.newBuilder(this.euConsentPaneTransactionsTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1;
    }

    private void mergeExitPaneCancelButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.exitPaneCancelButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.exitPaneCancelButton_ = stringValue;
        } else {
            this.exitPaneCancelButton_ = com.google.protobuf.StringValue.newBuilder(this.exitPaneCancelButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 16384;
    }

    private void mergeExitPaneHeading(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.exitPaneHeading_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.exitPaneHeading_ = stringValue;
        } else {
            this.exitPaneHeading_ = com.google.protobuf.StringValue.newBuilder(this.exitPaneHeading_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 2048;
    }

    private void mergeExitPaneMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.exitPaneMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.exitPaneMessage_ = stringValue;
        } else {
            this.exitPaneMessage_ = com.google.protobuf.StringValue.newBuilder(this.exitPaneMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 4096;
    }

    private void mergeExitPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.exitPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.exitPaneSubmitButton_ = stringValue;
        } else {
            this.exitPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.exitPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 8192;
    }

    private void mergeExitPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.exitPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.exitPaneTitle_ = stringValue;
        } else {
            this.exitPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.exitPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1024;
    }

    private void mergeGlobalButtonBorderRadius(com.google.protobuf.Int32Value int32Value) {
        com.google.protobuf.Int32Value int32Value2 = this.globalButtonBorderRadius_;
        if (int32Value2 == null || int32Value2 == com.google.protobuf.Int32Value.getDefaultInstance()) {
            this.globalButtonBorderRadius_ = int32Value;
        } else {
            this.globalButtonBorderRadius_ = com.google.protobuf.Int32Value.newBuilder(this.globalButtonBorderRadius_).mergeFrom((com.google.protobuf.Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeGlobalButtonColor(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalButtonColor_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalButtonColor_ = stringValue;
        } else {
            this.globalButtonColor_ = com.google.protobuf.StringValue.newBuilder(this.globalButtonColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeGlobalButtonColorHover(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalButtonColorHover_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalButtonColorHover_ = stringValue;
        } else {
            this.globalButtonColorHover_ = com.google.protobuf.StringValue.newBuilder(this.globalButtonColorHover_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergeGlobalButtonDarkModeColor(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalButtonDarkModeColor_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalButtonDarkModeColor_ = stringValue;
        } else {
            this.globalButtonDarkModeColor_ = com.google.protobuf.StringValue.newBuilder(this.globalButtonDarkModeColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    private void mergeGlobalButtonDarkModeColorHover(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalButtonDarkModeColorHover_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalButtonDarkModeColorHover_ = stringValue;
        } else {
            this.globalButtonDarkModeColorHover_ = com.google.protobuf.StringValue.newBuilder(this.globalButtonDarkModeColorHover_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    private void mergeGlobalButtonDarkModeTextColor(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalButtonDarkModeTextColor_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalButtonDarkModeTextColor_ = stringValue;
        } else {
            this.globalButtonDarkModeTextColor_ = com.google.protobuf.StringValue.newBuilder(this.globalButtonDarkModeTextColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 2048;
    }

    private void mergeGlobalButtonFontWeight(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalButtonFontWeight_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalButtonFontWeight_ = stringValue;
        } else {
            this.globalButtonFontWeight_ = com.google.protobuf.StringValue.newBuilder(this.globalButtonFontWeight_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    private void mergeGlobalButtonTextColor(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalButtonTextColor_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalButtonTextColor_ = stringValue;
        } else {
            this.globalButtonTextColor_ = com.google.protobuf.StringValue.newBuilder(this.globalButtonTextColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeGlobalHighlightColor(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalHighlightColor_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalHighlightColor_ = stringValue;
        } else {
            this.globalHighlightColor_ = com.google.protobuf.StringValue.newBuilder(this.globalHighlightColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeGlobalOverlayBackgroundColor(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.globalOverlayBackgroundColor_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.globalOverlayBackgroundColor_ = stringValue;
        } else {
            this.globalOverlayBackgroundColor_ = com.google.protobuf.StringValue.newBuilder(this.globalOverlayBackgroundColor_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeIdentityMatchRiskProfileKey(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.identityMatchRiskProfileKey_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.identityMatchRiskProfileKey_ = stringValue;
        } else {
            this.identityMatchRiskProfileKey_ = com.google.protobuf.StringValue.newBuilder(this.identityMatchRiskProfileKey_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 268435456;
    }

    private void mergeInstitutionSearchPaneExitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.institutionSearchPaneExitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.institutionSearchPaneExitButton_ = stringValue;
        } else {
            this.institutionSearchPaneExitButton_ = com.google.protobuf.StringValue.newBuilder(this.institutionSearchPaneExitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 262144;
    }

    private void mergeInstitutionSearchPaneInitialMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.institutionSearchPaneInitialMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.institutionSearchPaneInitialMessage_ = stringValue;
        } else {
            this.institutionSearchPaneInitialMessage_ = com.google.protobuf.StringValue.newBuilder(this.institutionSearchPaneInitialMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 1048576;
    }

    private void mergeInstitutionSearchPaneNoResultsMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.institutionSearchPaneNoResultsMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.institutionSearchPaneNoResultsMessage_ = stringValue;
        } else {
            this.institutionSearchPaneNoResultsMessage_ = com.google.protobuf.StringValue.newBuilder(this.institutionSearchPaneNoResultsMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 2097152;
    }

    private void mergeInstitutionSearchPanePlaceholder(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.institutionSearchPanePlaceholder_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.institutionSearchPanePlaceholder_ = stringValue;
        } else {
            this.institutionSearchPanePlaceholder_ = com.google.protobuf.StringValue.newBuilder(this.institutionSearchPanePlaceholder_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 524288;
    }

    private void mergeInstitutionSearchPaneTimeoutMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.institutionSearchPaneTimeoutMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.institutionSearchPaneTimeoutMessage_ = stringValue;
        } else {
            this.institutionSearchPaneTimeoutMessage_ = com.google.protobuf.StringValue.newBuilder(this.institutionSearchPaneTimeoutMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 4194304;
    }

    private void mergeInstitutionSelectPaneSearchButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.institutionSelectPaneSearchButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.institutionSelectPaneSearchButton_ = stringValue;
        } else {
            this.institutionSelectPaneSearchButton_ = com.google.protobuf.StringValue.newBuilder(this.institutionSelectPaneSearchButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 65536;
    }

    private void mergeInstitutionSelectPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.institutionSelectPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.institutionSelectPaneTitle_ = stringValue;
        } else {
            this.institutionSelectPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.institutionSelectPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 32768;
    }

    private void mergeInstitutionSelectPaneUseDynamicInstitutionSelect(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.institutionSelectPaneUseDynamicInstitutionSelect_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.institutionSelectPaneUseDynamicInstitutionSelect_ = boolValue;
        } else {
            this.institutionSelectPaneUseDynamicInstitutionSelect_ = com.google.protobuf.BoolValue.newBuilder(this.institutionSelectPaneUseDynamicInstitutionSelect_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField1_ |= 131072;
    }

    private void mergeIsVenmoSpecific(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.isVenmoSpecific_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.isVenmoSpecific_ = boolValue;
        } else {
            this.isVenmoSpecific_ = com.google.protobuf.BoolValue.newBuilder(this.isVenmoSpecific_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 67108864;
    }

    private void mergeLanguage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.language_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.language_ = stringValue;
        } else {
            this.language_ = com.google.protobuf.StringValue.newBuilder(this.language_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeLayerConsentPaneHeaderTextAction(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.layerConsentPaneHeaderTextAction_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.layerConsentPaneHeaderTextAction_ = stringValue;
        } else {
            this.layerConsentPaneHeaderTextAction_ = com.google.protobuf.StringValue.newBuilder(this.layerConsentPaneHeaderTextAction_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 8388608;
    }

    private void mergeLayerConsentPaneHeaderTextProfileTerm(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.layerConsentPaneHeaderTextProfileTerm_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.layerConsentPaneHeaderTextProfileTerm_ = stringValue;
        } else {
            this.layerConsentPaneHeaderTextProfileTerm_ = com.google.protobuf.StringValue.newBuilder(this.layerConsentPaneHeaderTextProfileTerm_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 16777216;
    }

    private void mergeLoadingPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.loadingPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.loadingPaneTitle_ = stringValue;
        } else {
            this.loadingPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.loadingPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 33554432;
    }

    private void mergeLogoUrl(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.logoUrl_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.logoUrl_ = stringValue;
        } else {
            this.logoUrl_ = com.google.protobuf.StringValue.newBuilder(this.logoUrl_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 4194304;
    }

    private void mergeMfaPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.mfaPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.mfaPaneTitle_ = stringValue;
        } else {
            this.mfaPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.mfaPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 1;
    }

    private void mergeOauthLandingPaneAfterContinue(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.oauthLandingPaneAfterContinue_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.oauthLandingPaneAfterContinue_ = stringValue;
        } else {
            this.oauthLandingPaneAfterContinue_ = com.google.protobuf.StringValue.newBuilder(this.oauthLandingPaneAfterContinue_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 64;
    }

    private void mergeOauthLandingPaneAuthenticateBank(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.oauthLandingPaneAuthenticateBank_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.oauthLandingPaneAuthenticateBank_ = stringValue;
        } else {
            this.oauthLandingPaneAuthenticateBank_ = com.google.protobuf.StringValue.newBuilder(this.oauthLandingPaneAuthenticateBank_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 32;
    }

    private void mergeOauthLandingPaneContinueToInstitution(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.oauthLandingPaneContinueToInstitution_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.oauthLandingPaneContinueToInstitution_ = stringValue;
        } else {
            this.oauthLandingPaneContinueToInstitution_ = com.google.protobuf.StringValue.newBuilder(this.oauthLandingPaneContinueToInstitution_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 256;
    }

    private void mergeOauthLandingPaneRedirectedBack(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.oauthLandingPaneRedirectedBack_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.oauthLandingPaneRedirectedBack_ = stringValue;
        } else {
            this.oauthLandingPaneRedirectedBack_ = com.google.protobuf.StringValue.newBuilder(this.oauthLandingPaneRedirectedBack_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 128;
    }

    private void mergePrivacyInterstitialPaneCoBrandedIsEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.privacyInterstitialPaneCoBrandedIsEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.privacyInterstitialPaneCoBrandedIsEnabled_ = boolValue;
        } else {
            this.privacyInterstitialPaneCoBrandedIsEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.privacyInterstitialPaneCoBrandedIsEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 1024;
    }

    private void mergePrivacyInterstitialPaneHeading(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.privacyInterstitialPaneHeading_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneHeading_ = stringValue;
        } else {
            this.privacyInterstitialPaneHeading_ = com.google.protobuf.StringValue.newBuilder(this.privacyInterstitialPaneHeading_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 128;
    }

    private void mergePrivacyInterstitialPaneHeadingAccountName(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.privacyInterstitialPaneHeadingAccountName_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneHeadingAccountName_ = stringValue;
        } else {
            this.privacyInterstitialPaneHeadingAccountName_ = com.google.protobuf.StringValue.newBuilder(this.privacyInterstitialPaneHeadingAccountName_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 2048;
    }

    private void mergePrivacyInterstitialPaneSubmitAgree(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.privacyInterstitialPaneSubmitAgree_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneSubmitAgree_ = stringValue;
        } else {
            this.privacyInterstitialPaneSubmitAgree_ = com.google.protobuf.StringValue.newBuilder(this.privacyInterstitialPaneSubmitAgree_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 512;
    }

    private void mergePrivacyInterstitialPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.privacyInterstitialPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.privacyInterstitialPaneSubmitButton_ = stringValue;
        } else {
            this.privacyInterstitialPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.privacyInterstitialPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 256;
    }

    private void mergeProductScopesTransparencyPaneAllowButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.productScopesTransparencyPaneAllowButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneAllowButton_ = stringValue;
        } else {
            this.productScopesTransparencyPaneAllowButton_ = com.google.protobuf.StringValue.newBuilder(this.productScopesTransparencyPaneAllowButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 8192;
    }

    private void mergeProductScopesTransparencyPaneModalDismissButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.productScopesTransparencyPaneModalDismissButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneModalDismissButton_ = stringValue;
        } else {
            this.productScopesTransparencyPaneModalDismissButton_ = com.google.protobuf.StringValue.newBuilder(this.productScopesTransparencyPaneModalDismissButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 32768;
    }

    private void mergeProductScopesTransparencyPaneUpdateUseCase(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.productScopesTransparencyPaneUpdateUseCase_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneUpdateUseCase_ = stringValue;
        } else {
            this.productScopesTransparencyPaneUpdateUseCase_ = com.google.protobuf.StringValue.newBuilder(this.productScopesTransparencyPaneUpdateUseCase_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 16384;
    }

    private void mergeProductScopesTransparencyPaneUseCase(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.productScopesTransparencyPaneUseCase_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.productScopesTransparencyPaneUseCase_ = stringValue;
        } else {
            this.productScopesTransparencyPaneUseCase_ = com.google.protobuf.StringValue.newBuilder(this.productScopesTransparencyPaneUseCase_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 4096;
    }

    private void mergeProfileEligibilityIdentityFieldSsnLast4Only(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.profileEligibilityIdentityFieldSsnLast4Only_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.profileEligibilityIdentityFieldSsnLast4Only_ = boolValue;
        } else {
            this.profileEligibilityIdentityFieldSsnLast4Only_ = com.google.protobuf.BoolValue.newBuilder(this.profileEligibilityIdentityFieldSsnLast4Only_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 8388608;
    }

    private void mergeProfileEligibilityItemsAllowIndirect(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.profileEligibilityItemsAllowIndirect_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.profileEligibilityItemsAllowIndirect_ = boolValue;
        } else {
            this.profileEligibilityItemsAllowIndirect_ = com.google.protobuf.BoolValue.newBuilder(this.profileEligibilityItemsAllowIndirect_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 16777216;
    }

    private void mergeProfileEligibilityItemsAllowReauthentication(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.profileEligibilityItemsAllowReauthentication_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.profileEligibilityItemsAllowReauthentication_ = boolValue;
        } else {
            this.profileEligibilityItemsAllowReauthentication_ = com.google.protobuf.BoolValue.newBuilder(this.profileEligibilityItemsAllowReauthentication_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField2_ |= 33554432;
    }

    private void mergeRecaptchaPaneMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.recaptchaPaneMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.recaptchaPaneMessage_ = stringValue;
        } else {
            this.recaptchaPaneMessage_ = com.google.protobuf.StringValue.newBuilder(this.recaptchaPaneMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 4;
    }

    private void mergeRecaptchaPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.recaptchaPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.recaptchaPaneTitle_ = stringValue;
        } else {
            this.recaptchaPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.recaptchaPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 2;
    }

    private void mergeReconnectedPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        com.google.protobuf.BoolValue boolValue2 = this.reconnectedPaneIsEnabled_;
        if (boolValue2 == null || boolValue2 == com.google.protobuf.BoolValue.getDefaultInstance()) {
            this.reconnectedPaneIsEnabled_ = boolValue;
        } else {
            this.reconnectedPaneIsEnabled_ = com.google.protobuf.BoolValue.newBuilder(this.reconnectedPaneIsEnabled_).mergeFrom((com.google.protobuf.BoolValue.Builder) boolValue).buildPartial();
        }
        this.bitField0_ |= 1048576;
    }

    private void mergeReconnectedPaneMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.reconnectedPaneMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.reconnectedPaneMessage_ = stringValue;
        } else {
            this.reconnectedPaneMessage_ = com.google.protobuf.StringValue.newBuilder(this.reconnectedPaneMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 262144;
    }

    private void mergeReconnectedPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.reconnectedPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.reconnectedPaneSubmitButton_ = stringValue;
        } else {
            this.reconnectedPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.reconnectedPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 524288;
    }

    private void mergeReconnectedPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.reconnectedPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.reconnectedPaneTitle_ = stringValue;
        } else {
            this.reconnectedPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.reconnectedPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 131072;
    }

    private void mergeRoutingNumberPaneMessage(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.routingNumberPaneMessage_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.routingNumberPaneMessage_ = stringValue;
        } else {
            this.routingNumberPaneMessage_ = com.google.protobuf.StringValue.newBuilder(this.routingNumberPaneMessage_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    private void mergeRoutingNumberPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.routingNumberPaneSubmitButton_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.routingNumberPaneSubmitButton_ = stringValue;
        } else {
            this.routingNumberPaneSubmitButton_ = com.google.protobuf.StringValue.newBuilder(this.routingNumberPaneSubmitButton_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 268435456;
    }

    private void mergeRoutingNumberPaneTitle(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.routingNumberPaneTitle_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.routingNumberPaneTitle_ = stringValue;
        } else {
            this.routingNumberPaneTitle_ = com.google.protobuf.StringValue.newBuilder(this.routingNumberPaneTitle_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField1_ |= 67108864;
    }

    private void mergeStartDateDaysAgo(com.google.protobuf.Int32Value int32Value) {
        com.google.protobuf.Int32Value int32Value2 = this.startDateDaysAgo_;
        if (int32Value2 == null || int32Value2 == com.google.protobuf.Int32Value.getDefaultInstance()) {
            this.startDateDaysAgo_ = int32Value;
        } else {
            this.startDateDaysAgo_ = com.google.protobuf.Int32Value.newBuilder(this.startDateDaysAgo_).mergeFrom((com.google.protobuf.Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeTemplateName(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.templateName_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.templateName_ = stringValue;
        } else {
            this.templateName_ = com.google.protobuf.StringValue.newBuilder(this.templateName_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 1048576;
    }

    private void mergeTemplateSymbol(com.google.protobuf.StringValue stringValue) {
        com.google.protobuf.StringValue stringValue2 = this.templateSymbol_;
        if (stringValue2 == null || stringValue2 == com.google.protobuf.StringValue.getDefaultInstance()) {
            this.templateSymbol_ = stringValue;
        } else {
            this.templateSymbol_ = com.google.protobuf.StringValue.newBuilder(this.templateSymbol_).mergeFrom((com.google.protobuf.StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField2_ |= 2097152;
    }

    private void mergeTemplateTokenConfiguration(com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration) {
        com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration2 = this.templateTokenConfiguration_;
        if (linkCustomizations$TemplateTokenConfiguration2 == null || linkCustomizations$TemplateTokenConfiguration2 == com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.getDefaultInstance()) {
            this.templateTokenConfiguration_ = linkCustomizations$TemplateTokenConfiguration;
        } else {
            this.templateTokenConfiguration_ = com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.newBuilder(this.templateTokenConfiguration_).mergeFrom((com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration.a) linkCustomizations$TemplateTokenConfiguration).buildPartial();
        }
        this.bitField2_ |= 524288;
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.d newBuilder(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization linkCustomizations$LinkCustomization) {
        return DEFAULT_INSTANCE.createBuilder(linkCustomizations$LinkCustomization);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setAccountClassBusinessDisabled(com.google.protobuf.BoolValue boolValue) {
        this.accountClassBusinessDisabled_ = boolValue;
        this.bitField2_ |= 131072;
    }

    private void setAccountNumberPaneMessage(com.google.protobuf.StringValue stringValue) {
        this.accountNumberPaneMessage_ = stringValue;
        this.bitField1_ |= 1073741824;
    }

    private void setAccountNumberPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.accountNumberPaneSubmitButton_ = stringValue;
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    private void setAccountNumberPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.accountNumberPaneTitle_ = stringValue;
        this.bitField1_ |= 536870912;
    }

    private void setAccountSelectPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        this.accountSelectPaneIsEnabled_ = boolValue;
        this.bitField2_ |= 32;
    }

    private void setAccountSelectPaneIsMultiAccountSelectEnabled(com.google.protobuf.BoolValue boolValue) {
        this.accountSelectPaneIsMultiAccountSelectEnabled_ = boolValue;
        this.bitField2_ |= 64;
    }

    private void setAccountSelectPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.accountSelectPaneSubmitButton_ = stringValue;
        this.bitField2_ |= 16;
    }

    private void setAccountSelectPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.accountSelectPaneTitle_ = stringValue;
        this.bitField2_ |= 8;
    }

    private void setAuthFlowType(com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.AuthFlowType authFlowType) {
        this.authFlowType_ = authFlowType;
        this.bitField2_ |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    private void setConnectedPaneHeading(com.google.protobuf.StringValue stringValue) {
        this.connectedPaneHeading_ = stringValue;
        this.bitField0_ |= 65536;
    }

    private void setConnectedPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        this.connectedPaneIsEnabled_ = boolValue;
        this.bitField0_ |= 32768;
    }

    private void setConnectedPaneMessage(com.google.protobuf.StringValue stringValue) {
        this.connectedPaneMessage_ = stringValue;
        this.bitField0_ |= 8192;
    }

    private void setConnectedPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.connectedPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 16384;
    }

    private void setConnectedPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.connectedPaneTitle_ = stringValue;
        this.bitField0_ |= 4096;
    }

    private void setCountryCodes(int i2, java.lang.String str) {
        ensureCountryCodesIsMutable();
        this.countryCodes_.set(i2, str);
    }

    private void setCredentialPanePlaidLegalEnabled(com.google.protobuf.BoolValue boolValue) {
        this.credentialPanePlaidLegalEnabled_ = boolValue;
        this.bitField0_ |= 16777216;
    }

    private void setCredentialPaneResetPasswordButton(com.google.protobuf.StringValue stringValue) {
        this.credentialPaneResetPasswordButton_ = stringValue;
        this.bitField0_ |= 8388608;
    }

    private void setCredentialPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.credentialPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 4194304;
    }

    private void setCredentialPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.credentialPaneTitle_ = stringValue;
        this.bitField0_ |= 2097152;
    }

    private void setCredentialPaneTosContent(com.google.protobuf.StringValue stringValue) {
        this.credentialPaneTosContent_ = stringValue;
        this.bitField0_ |= 33554432;
    }

    private void setCredentialPaneTosEnabled(com.google.protobuf.BoolValue boolValue) {
        this.credentialPaneTosEnabled_ = boolValue;
        this.bitField0_ |= 67108864;
    }

    private void setDocumentIncomeUploadPaneDocumentFileTypePreferences(int i2, com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        ensureDocumentIncomeUploadPaneDocumentFileTypePreferencesIsMutable();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.set(i2, external$DocumentUploadFilePreference);
    }

    private void setDocumentIncomeUploadPaneNumberOfUploadsPreferences(com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences) {
        this.documentIncomeUploadPaneNumberOfUploadsPreferences_ = external$DocumentNumberOfUploadsPreferences;
        this.bitField2_ |= 262144;
    }

    private void setDocumentTimeRange(com.google.protobuf.StringValue stringValue) {
        this.documentTimeRange_ = stringValue;
        this.bitField2_ |= 536870912;
    }

    private void setDtmEnablementStatus(com.google.protobuf.BoolValue boolValue) {
        this.dtmEnablementStatus_ = boolValue;
        this.bitField2_ |= 65536;
    }

    private void setDtmUseCases(int i2, com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization.e eVar) {
        ensureDtmUseCasesIsMutable();
        this.dtmUseCases_.setInt(i2, eVar.getNumber());
    }

    private void setErrorPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.errorPaneTitle_ = stringValue;
        this.bitField1_ |= 512;
    }

    private void setEuConsentPaneCancel(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneCancel_ = stringValue;
        this.bitField1_ |= 16;
    }

    private void setEuConsentPaneContactDetailsTitle(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneContactDetailsTitle_ = stringValue;
        this.bitField0_ |= 1073741824;
    }

    private void setEuConsentPaneContinue(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneContinue_ = stringValue;
        this.bitField1_ |= 8;
    }

    private void setEuConsentPaneContinueAgree(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneContinueAgree_ = stringValue;
        this.bitField1_ |= 4;
    }

    private void setEuConsentPaneDetailsTitle(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneDetailsTitle_ = stringValue;
        this.bitField1_ |= 2;
    }

    private void setEuConsentPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        this.euConsentPaneIsEnabled_ = boolValue;
        this.bitField0_ |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    private void setEuConsentPaneLinkWithPlaid(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneLinkWithPlaid_ = stringValue;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    private void setEuConsentPaneSubmitAgree(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneSubmitAgree_ = stringValue;
        this.bitField0_ |= 536870912;
    }

    private void setEuConsentPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 268435456;
    }

    private void setEuConsentPaneTransactionsTitle(com.google.protobuf.StringValue stringValue) {
        this.euConsentPaneTransactionsTitle_ = stringValue;
        this.bitField1_ |= 1;
    }

    private void setExitPaneCancelButton(com.google.protobuf.StringValue stringValue) {
        this.exitPaneCancelButton_ = stringValue;
        this.bitField1_ |= 16384;
    }

    private void setExitPaneHeading(com.google.protobuf.StringValue stringValue) {
        this.exitPaneHeading_ = stringValue;
        this.bitField1_ |= 2048;
    }

    private void setExitPaneMessage(com.google.protobuf.StringValue stringValue) {
        this.exitPaneMessage_ = stringValue;
        this.bitField1_ |= 4096;
    }

    private void setExitPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.exitPaneSubmitButton_ = stringValue;
        this.bitField1_ |= 8192;
    }

    private void setExitPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.exitPaneTitle_ = stringValue;
        this.bitField1_ |= 1024;
    }

    private void setGlobalButtonBorderRadius(com.google.protobuf.Int32Value int32Value) {
        this.globalButtonBorderRadius_ = int32Value;
        this.bitField0_ |= 128;
    }

    private void setGlobalButtonColor(com.google.protobuf.StringValue stringValue) {
        this.globalButtonColor_ = stringValue;
        this.bitField0_ |= 16;
    }

    private void setGlobalButtonColorHover(com.google.protobuf.StringValue stringValue) {
        this.globalButtonColorHover_ = stringValue;
        this.bitField0_ |= 32;
    }

    private void setGlobalButtonDarkModeColor(com.google.protobuf.StringValue stringValue) {
        this.globalButtonDarkModeColor_ = stringValue;
        this.bitField0_ |= 512;
    }

    private void setGlobalButtonDarkModeColorHover(com.google.protobuf.StringValue stringValue) {
        this.globalButtonDarkModeColorHover_ = stringValue;
        this.bitField0_ |= 1024;
    }

    private void setGlobalButtonDarkModeTextColor(com.google.protobuf.StringValue stringValue) {
        this.globalButtonDarkModeTextColor_ = stringValue;
        this.bitField0_ |= 2048;
    }

    private void setGlobalButtonFontWeight(com.google.protobuf.StringValue stringValue) {
        this.globalButtonFontWeight_ = stringValue;
        this.bitField0_ |= 256;
    }

    private void setGlobalButtonTextColor(com.google.protobuf.StringValue stringValue) {
        this.globalButtonTextColor_ = stringValue;
        this.bitField0_ |= 64;
    }

    private void setGlobalHighlightColor(com.google.protobuf.StringValue stringValue) {
        this.globalHighlightColor_ = stringValue;
        this.bitField0_ |= 4;
    }

    private void setGlobalOverlayBackgroundColor(com.google.protobuf.StringValue stringValue) {
        this.globalOverlayBackgroundColor_ = stringValue;
        this.bitField0_ |= 8;
    }

    private void setIdentityMatchRiskProfileKey(com.google.protobuf.StringValue stringValue) {
        this.identityMatchRiskProfileKey_ = stringValue;
        this.bitField2_ |= 268435456;
    }

    private void setInstitutionSearchPaneExitButton(com.google.protobuf.StringValue stringValue) {
        this.institutionSearchPaneExitButton_ = stringValue;
        this.bitField1_ |= 262144;
    }

    private void setInstitutionSearchPaneInitialMessage(com.google.protobuf.StringValue stringValue) {
        this.institutionSearchPaneInitialMessage_ = stringValue;
        this.bitField1_ |= 1048576;
    }

    private void setInstitutionSearchPaneNoResultsMessage(com.google.protobuf.StringValue stringValue) {
        this.institutionSearchPaneNoResultsMessage_ = stringValue;
        this.bitField1_ |= 2097152;
    }

    private void setInstitutionSearchPanePlaceholder(com.google.protobuf.StringValue stringValue) {
        this.institutionSearchPanePlaceholder_ = stringValue;
        this.bitField1_ |= 524288;
    }

    private void setInstitutionSearchPaneTimeoutMessage(com.google.protobuf.StringValue stringValue) {
        this.institutionSearchPaneTimeoutMessage_ = stringValue;
        this.bitField1_ |= 4194304;
    }

    private void setInstitutionSelectPaneInstitutionList(int i2, java.lang.String str) {
        ensureInstitutionSelectPaneInstitutionListIsMutable();
        this.institutionSelectPaneInstitutionList_.set(i2, str);
    }

    private void setInstitutionSelectPaneSearchButton(com.google.protobuf.StringValue stringValue) {
        this.institutionSelectPaneSearchButton_ = stringValue;
        this.bitField1_ |= 65536;
    }

    private void setInstitutionSelectPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.institutionSelectPaneTitle_ = stringValue;
        this.bitField1_ |= 32768;
    }

    private void setInstitutionSelectPaneUseDynamicInstitutionSelect(com.google.protobuf.BoolValue boolValue) {
        this.institutionSelectPaneUseDynamicInstitutionSelect_ = boolValue;
        this.bitField1_ |= 131072;
    }

    private void setIsVenmoSpecific(com.google.protobuf.BoolValue boolValue) {
        this.isVenmoSpecific_ = boolValue;
        this.bitField2_ |= 67108864;
    }

    private void setLanguage(com.google.protobuf.StringValue stringValue) {
        this.language_ = stringValue;
        this.bitField0_ |= 1;
    }

    private void setLayerConsentPaneHeaderTextAction(com.google.protobuf.StringValue stringValue) {
        this.layerConsentPaneHeaderTextAction_ = stringValue;
        this.bitField1_ |= 8388608;
    }

    private void setLayerConsentPaneHeaderTextProfileTerm(com.google.protobuf.StringValue stringValue) {
        this.layerConsentPaneHeaderTextProfileTerm_ = stringValue;
        this.bitField1_ |= 16777216;
    }

    private void setLoadingPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.loadingPaneTitle_ = stringValue;
        this.bitField1_ |= 33554432;
    }

    private void setLogoUrl(com.google.protobuf.StringValue stringValue) {
        this.logoUrl_ = stringValue;
        this.bitField2_ |= 4194304;
    }

    private void setManualVerificationOfIncomeUploadPaneDocumentPreferences(int i2, com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        ensureManualVerificationOfIncomeUploadPaneDocumentPreferencesIsMutable();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.set(i2, linkCustomizations$DocumentPreference);
    }

    private void setMfaPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.mfaPaneTitle_ = stringValue;
        this.bitField2_ |= 1;
    }

    private void setOauthLandingPaneAfterContinue(com.google.protobuf.StringValue stringValue) {
        this.oauthLandingPaneAfterContinue_ = stringValue;
        this.bitField1_ |= 64;
    }

    private void setOauthLandingPaneAuthenticateBank(com.google.protobuf.StringValue stringValue) {
        this.oauthLandingPaneAuthenticateBank_ = stringValue;
        this.bitField1_ |= 32;
    }

    private void setOauthLandingPaneContinueToInstitution(com.google.protobuf.StringValue stringValue) {
        this.oauthLandingPaneContinueToInstitution_ = stringValue;
        this.bitField1_ |= 256;
    }

    private void setOauthLandingPaneRedirectedBack(com.google.protobuf.StringValue stringValue) {
        this.oauthLandingPaneRedirectedBack_ = stringValue;
        this.bitField1_ |= 128;
    }

    private void setPrivacyInterstitialPaneCoBrandedIsEnabled(com.google.protobuf.BoolValue boolValue) {
        this.privacyInterstitialPaneCoBrandedIsEnabled_ = boolValue;
        this.bitField2_ |= 1024;
    }

    private void setPrivacyInterstitialPaneHeading(com.google.protobuf.StringValue stringValue) {
        this.privacyInterstitialPaneHeading_ = stringValue;
        this.bitField2_ |= 128;
    }

    private void setPrivacyInterstitialPaneHeadingAccountName(com.google.protobuf.StringValue stringValue) {
        this.privacyInterstitialPaneHeadingAccountName_ = stringValue;
        this.bitField2_ |= 2048;
    }

    private void setPrivacyInterstitialPaneSubmitAgree(com.google.protobuf.StringValue stringValue) {
        this.privacyInterstitialPaneSubmitAgree_ = stringValue;
        this.bitField2_ |= 512;
    }

    private void setPrivacyInterstitialPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.privacyInterstitialPaneSubmitButton_ = stringValue;
        this.bitField2_ |= 256;
    }

    private void setProductScopesTransparencyPaneAllowButton(com.google.protobuf.StringValue stringValue) {
        this.productScopesTransparencyPaneAllowButton_ = stringValue;
        this.bitField2_ |= 8192;
    }

    private void setProductScopesTransparencyPaneModalDismissButton(com.google.protobuf.StringValue stringValue) {
        this.productScopesTransparencyPaneModalDismissButton_ = stringValue;
        this.bitField2_ |= 32768;
    }

    private void setProductScopesTransparencyPaneUpdateUseCase(com.google.protobuf.StringValue stringValue) {
        this.productScopesTransparencyPaneUpdateUseCase_ = stringValue;
        this.bitField2_ |= 16384;
    }

    private void setProductScopesTransparencyPaneUseCase(com.google.protobuf.StringValue stringValue) {
        this.productScopesTransparencyPaneUseCase_ = stringValue;
        this.bitField2_ |= 4096;
    }

    private void setProfileEligibilityIdentityFieldSsnLast4Only(com.google.protobuf.BoolValue boolValue) {
        this.profileEligibilityIdentityFieldSsnLast4Only_ = boolValue;
        this.bitField2_ |= 8388608;
    }

    private void setProfileEligibilityItemsAllowIndirect(com.google.protobuf.BoolValue boolValue) {
        this.profileEligibilityItemsAllowIndirect_ = boolValue;
        this.bitField2_ |= 16777216;
    }

    private void setProfileEligibilityItemsAllowReauthentication(com.google.protobuf.BoolValue boolValue) {
        this.profileEligibilityItemsAllowReauthentication_ = boolValue;
        this.bitField2_ |= 33554432;
    }

    private void setRecaptchaPaneMessage(com.google.protobuf.StringValue stringValue) {
        this.recaptchaPaneMessage_ = stringValue;
        this.bitField2_ |= 4;
    }

    private void setRecaptchaPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.recaptchaPaneTitle_ = stringValue;
        this.bitField2_ |= 2;
    }

    private void setReconnectedPaneIsEnabled(com.google.protobuf.BoolValue boolValue) {
        this.reconnectedPaneIsEnabled_ = boolValue;
        this.bitField0_ |= 1048576;
    }

    private void setReconnectedPaneMessage(com.google.protobuf.StringValue stringValue) {
        this.reconnectedPaneMessage_ = stringValue;
        this.bitField0_ |= 262144;
    }

    private void setReconnectedPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.reconnectedPaneSubmitButton_ = stringValue;
        this.bitField0_ |= 524288;
    }

    private void setReconnectedPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.reconnectedPaneTitle_ = stringValue;
        this.bitField0_ |= 131072;
    }

    private void setRoutingNumberPaneMessage(com.google.protobuf.StringValue stringValue) {
        this.routingNumberPaneMessage_ = stringValue;
        this.bitField1_ |= androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE;
    }

    private void setRoutingNumberPaneSubmitButton(com.google.protobuf.StringValue stringValue) {
        this.routingNumberPaneSubmitButton_ = stringValue;
        this.bitField1_ |= 268435456;
    }

    private void setRoutingNumberPaneTitle(com.google.protobuf.StringValue stringValue) {
        this.routingNumberPaneTitle_ = stringValue;
        this.bitField1_ |= 67108864;
    }

    private void setStartDateDaysAgo(com.google.protobuf.Int32Value int32Value) {
        this.startDateDaysAgo_ = int32Value;
        this.bitField0_ |= 2;
    }

    private void setTemplateName(com.google.protobuf.StringValue stringValue) {
        this.templateName_ = stringValue;
        this.bitField2_ |= 1048576;
    }

    private void setTemplateSymbol(com.google.protobuf.StringValue stringValue) {
        this.templateSymbol_ = stringValue;
        this.bitField2_ |= 2097152;
    }

    private void setTemplateTokenConfiguration(com.plaid.internal.core.protos.clients.LinkCustomizations$TemplateTokenConfiguration linkCustomizations$TemplateTokenConfiguration) {
        this.templateTokenConfiguration_ = linkCustomizations$TemplateTokenConfiguration;
        this.bitField2_ |= 524288;
    }

    private void setWalletSelectPaneHiddenWalletBrandList(int i2, java.lang.String str) {
        ensureWalletSelectPaneHiddenWalletBrandListIsMutable();
        this.walletSelectPaneHiddenWalletBrandList_.set(i2, str);
    }

    private void setWalletSelectPanePinnedWalletBrandList(int i2, java.lang.String str) {
        ensureWalletSelectPanePinnedWalletBrandListIsMutable();
        this.walletSelectPanePinnedWalletBrandList_.set(i2, str);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addDocumentIncomeUploadPaneDocumentFileTypePreferences(int i2, com.plaid.internal.core.protos.income_verification_manager.External$DocumentUploadFilePreference external$DocumentUploadFilePreference) {
        ensureDocumentIncomeUploadPaneDocumentFileTypePreferencesIsMutable();
        this.documentIncomeUploadPaneDocumentFileTypePreferences_.add(i2, external$DocumentUploadFilePreference);
    }

    private void addManualVerificationOfIncomeUploadPaneDocumentPreferences(int i2, com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        ensureManualVerificationOfIncomeUploadPaneDocumentPreferencesIsMutable();
        this.manualVerificationOfIncomeUploadPaneDocumentPreferences_.add(i2, linkCustomizations$DocumentPreference);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.clients.LinkCustomizations$LinkCustomization) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
