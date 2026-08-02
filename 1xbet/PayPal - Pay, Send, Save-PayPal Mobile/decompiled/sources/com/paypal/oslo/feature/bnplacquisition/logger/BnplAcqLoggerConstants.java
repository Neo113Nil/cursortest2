package com.paypal.oslo.feature.bnplacquisition.logger;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/logger/BnplAcqLoggerConstants;", "", "<init>", "()V", "", "DOWNSTREAM_ERROR_NAME", "Ljava/lang/String;", "OPERATION_NAME", "REDUCER_EVENT_NAME", "NO_CONNECTION", "HTTP_ERROR", "UNKNOWN", "UNEXPECTED_EVENT", "Category", "ScreenAttributes", "ScreenNames", "MessageTemplates", "ExceptionAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplAcqLoggerConstants {
    public static final int $stable = 0;
    public static final java.lang.String DOWNSTREAM_ERROR_NAME = "downstream_error_name";
    public static final java.lang.String HTTP_ERROR = "HttpError";
    public static final com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants INSTANCE = new com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants();
    public static final java.lang.String NO_CONNECTION = "NoConnection";
    public static final java.lang.String OPERATION_NAME = "operation_name";
    public static final java.lang.String REDUCER_EVENT_NAME = "reducer_event_name";
    public static final java.lang.String UNEXPECTED_EVENT = "Unexpected Event";
    public static final java.lang.String UNKNOWN = "UNKNOWN";

    private BnplAcqLoggerConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/logger/BnplAcqLoggerConstants$Category;", "", "<init>", "()V", "", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "Ljava/lang/String;", "DOWNSTREAM", "SCREEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Category {
        public static final int $stable = 0;
        public static final java.lang.String DOWNSTREAM = "Downstream";
        public static final com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.Category INSTANCE = new com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.Category();
        public static final java.lang.String NETWORK = "Network";
        public static final java.lang.String SCREEN = "Screen";

        private Category() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/logger/BnplAcqLoggerConstants$ScreenAttributes;", "", "<init>", "()V", "", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V5.Target.SESSION_ID, "Ljava/lang/String;", "CREDIT_PRODUCT_IDENTIFIER", "FLOW_ATTRIBUTE", "FLOW_SPECIFIER", "FLOW_OUTCOME", "CREDIT_ACCOUNT_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ScreenAttributes {
        public static final int $stable = 0;
        public static final java.lang.String CREDIT_ACCOUNT_ID = "credit_account_id";
        public static final java.lang.String CREDIT_PRODUCT_IDENTIFIER = "credit_product_identifier";
        public static final java.lang.String FLOW_ATTRIBUTE = "flow_attribute";
        public static final java.lang.String FLOW_OUTCOME = "flow_outcome";
        public static final java.lang.String FLOW_SPECIFIER = "flow_specifier";
        public static final com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenAttributes INSTANCE = new com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenAttributes();
        public static final java.lang.String SESSION_ID = "session_id";

        private ScreenAttributes() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/logger/BnplAcqLoggerConstants$ScreenNames;", "", "<init>", "()V", "", "OFFERS_SCREEN", "Ljava/lang/String;", "ENTER_AMOUNT_SCREEN", "INTERMEDIARY_LOADING_SCREEN", "REVIEW_TERMS_SCREEN", "PERSONAL_INFO_SCREEN", "REPAYMENTS_SCREEN", "REVIEW_PLAN_SCREEN", "VIRTUAL_CARD_OVERVIEW_SCREEN", "CONTENT_VIEWER_SCREEN", "ADDRESS_ADD_SCREEN", "ADDRESS_OVERVIEW_SCREEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ScreenNames {
        public static final int $stable = 0;
        public static final java.lang.String ADDRESS_ADD_SCREEN = "AddressAddScreen";
        public static final java.lang.String ADDRESS_OVERVIEW_SCREEN = "AddressOverviewScreen";
        public static final java.lang.String CONTENT_VIEWER_SCREEN = "ContentViewerScreen";
        public static final java.lang.String ENTER_AMOUNT_SCREEN = "EnterAmountScreen";
        public static final com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames INSTANCE = new com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ScreenNames();
        public static final java.lang.String INTERMEDIARY_LOADING_SCREEN = "IntermediaryLoadingScreen";
        public static final java.lang.String OFFERS_SCREEN = "OffersScreen";
        public static final java.lang.String PERSONAL_INFO_SCREEN = "PersonalInfoScreen";
        public static final java.lang.String REPAYMENTS_SCREEN = "RepaymentsScreen";
        public static final java.lang.String REVIEW_PLAN_SCREEN = "ReviewPlanScreen";
        public static final java.lang.String REVIEW_TERMS_SCREEN = "ReviewTermsScreen";
        public static final java.lang.String VIRTUAL_CARD_OVERVIEW_SCREEN = "VirtualCardOverviewScreen";

        private ScreenNames() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/logger/BnplAcqLoggerConstants$MessageTemplates;", "", "<init>", "()V", "", "VARIABLE", "Ljava/lang/String;", "EXCEPTION", "SEPARATOR", "BASE_PREFIX", "UNKNOWN_MAPPING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MessageTemplates {
        public static final int $stable = 0;
        public static final java.lang.String BASE_PREFIX = "BnplAcq";
        public static final java.lang.String EXCEPTION = "Exception";
        public static final com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates INSTANCE = new com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.MessageTemplates();
        public static final java.lang.String SEPARATOR = " | ";
        public static final java.lang.String UNKNOWN_MAPPING = "Unknown";
        public static final java.lang.String VARIABLE = "Variable";

        private MessageTemplates() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/logger/BnplAcqLoggerConstants$ExceptionAttributes;", "", "<init>", "()V", "", "VARIABLE", "Ljava/lang/String;", androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_TYPE_TAG, androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, "CONTEXT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExceptionAttributes {
        public static final int $stable = 0;
        public static final java.lang.String CONTEXT = "context";
        public static final java.lang.String EXCEPTION_MESSAGE = "exception_message";
        public static final java.lang.String EXCEPTION_TYPE = "exception_type";
        public static final com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ExceptionAttributes INSTANCE = new com.paypal.oslo.feature.bnplacquisition.logger.BnplAcqLoggerConstants.ExceptionAttributes();
        public static final java.lang.String VARIABLE = "variable";

        private ExceptionAttributes() {
        }
    }
}
