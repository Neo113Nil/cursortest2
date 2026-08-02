package com.paypal.oslo.feature.bnplservicing.logger;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/logger/BnplServLoggerConstants;", "", "<init>", "()V", "", "UNKNOWN", "Ljava/lang/String;", "HTTP_ERROR", "NO_CONNECTION", "DOWNSTREAM_ERROR_NAME", "OPERATION_NAME", "REDUCER_EVENT_NAME", "VARIABLE", "Category", "ScreenAttributes", "ExceptionAttributes", "Screens"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServLoggerConstants {
    public static final int $stable = 0;
    public static final java.lang.String DOWNSTREAM_ERROR_NAME = "downstream_error_name";
    public static final java.lang.String HTTP_ERROR = "HttpError";
    public static final com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants INSTANCE = new com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants();
    public static final java.lang.String NO_CONNECTION = "NoConnection";
    public static final java.lang.String OPERATION_NAME = "operation_name";
    public static final java.lang.String REDUCER_EVENT_NAME = "reducer_event_name";
    public static final java.lang.String UNKNOWN = "Unknown";
    public static final java.lang.String VARIABLE = "variable";

    private BnplServLoggerConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/logger/BnplServLoggerConstants$Category;", "", "<init>", "()V", "", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "Ljava/lang/String;", "DOWNSTREAM", "SCREEN", "VARIABLE", "EXCEPTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Category {
        public static final int $stable = 0;
        public static final java.lang.String DOWNSTREAM = "Downstream";
        public static final java.lang.String EXCEPTION = "Exception";
        public static final com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.Category INSTANCE = new com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.Category();
        public static final java.lang.String NETWORK = "Network";
        public static final java.lang.String SCREEN = "Screen";
        public static final java.lang.String VARIABLE = "Variable";

        private Category() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/logger/BnplServLoggerConstants$ScreenAttributes;", "", "<init>", "()V", "", "CREDIT_PRODUCT_IDENTIFIER", "Ljava/lang/String;", "PAYLATER_SOURCE", "CREDIT_ACCOUNT_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ScreenAttributes {
        public static final int $stable = 0;
        public static final java.lang.String CREDIT_ACCOUNT_ID = "credit_account_id";
        public static final java.lang.String CREDIT_PRODUCT_IDENTIFIER = "credit_product_identifier";
        public static final com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.ScreenAttributes INSTANCE = new com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.ScreenAttributes();
        public static final java.lang.String PAYLATER_SOURCE = "paylater_source";

        private ScreenAttributes() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/logger/BnplServLoggerConstants$ExceptionAttributes;", "", "<init>", "()V", "", androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_TYPE_TAG, "Ljava/lang/String;", androidx.view.playservices.controllers.CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, "CONTEXT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ExceptionAttributes {
        public static final int $stable = 0;
        public static final java.lang.String CONTEXT = "context";
        public static final java.lang.String EXCEPTION_MESSAGE = "exception_message";
        public static final java.lang.String EXCEPTION_TYPE = "exception_type";
        public static final com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.ExceptionAttributes INSTANCE = new com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.ExceptionAttributes();

        private ExceptionAttributes() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/logger/BnplServLoggerConstants$Screens;", "", "<init>", "()V", "", "MAKE_A_PAYMENT_SCREEN", "Ljava/lang/String;", "PLAN_LIST_SCREEN", "PLAN_DETAILS_SCREEN", "SNOOZE_SCREEN", "PAY_LATER_HUB_SCREEN", "PRE_QUAL_SCREEN", "CHANGE_FI_SCREEN", "UPDATE_AUTOPAY_SCREEN", "WEBVIEW_SCREEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Screens {
        public static final int $stable = 0;
        public static final java.lang.String CHANGE_FI_SCREEN = "ChangeFiScreen";
        public static final com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.Screens INSTANCE = new com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.Screens();
        public static final java.lang.String MAKE_A_PAYMENT_SCREEN = "MakeAPaymentScreen";
        public static final java.lang.String PAY_LATER_HUB_SCREEN = "PayLaterHubScreen";
        public static final java.lang.String PLAN_DETAILS_SCREEN = "PlanDetailsScreen";
        public static final java.lang.String PLAN_LIST_SCREEN = "PlanListScreen";
        public static final java.lang.String PRE_QUAL_SCREEN = "PreQualScreen";
        public static final java.lang.String SNOOZE_SCREEN = "SnoozeScreen";
        public static final java.lang.String UPDATE_AUTOPAY_SCREEN = "UpdateAutopayScreen";
        public static final java.lang.String WEBVIEW_SCREEN = "WebViewScreen";

        private Screens() {
        }
    }
}
