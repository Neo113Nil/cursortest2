package com.paypal.oslo.feature.helpcenter.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/api/analytics/HelpCenterAnalytics;", "", "<init>", "()V", "", "Product", "Ljava/lang/String;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_INVOCATION_PAGE_EDUCATIONAL_SHEET}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HelpCenterAnalytics {
    public static final com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics INSTANCE = new com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics();
    public static final java.lang.String Product = "help_center";

    private HelpCenterAnalytics() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/api/analytics/HelpCenterAnalytics$EducationalSheet;", "", "<init>", "()V", "", "FeatureName", "Ljava/lang/String;", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "AddTaxIdButton", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getAddTaxIdButton", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "MoreQuestionsLink", "getMoreQuestionsLink", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "AddTaxIdClickedAction", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "getAddTaxIdClickedAction", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "MoreQuestionsClickedAction", "getMoreQuestionsClickedAction", "ScreenShownAction", "getScreenShownAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EducationalSheet {
        public static final java.lang.String FeatureName = "education_sheet";
        public static final java.lang.String ScreenName = "education_sheet";
        public static final com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.EducationalSheet INSTANCE = new com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.EducationalSheet();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item AddTaxIdButton = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("add_tax_id_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item MoreQuestionsLink = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("more_questions_link", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext AddTaxIdClickedAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.Product, "education_sheet", "initiated_add_tax_id");
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext MoreQuestionsClickedAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.Product, "education_sheet", "had_more_questions");
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext ScreenShownAction = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.helpcenter.api.analytics.HelpCenterAnalytics.Product, "education_sheet", "viewed");

        private EducationalSheet() {
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAddTaxIdButton() {
            return AddTaxIdButton;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getMoreQuestionsLink() {
            return MoreQuestionsLink;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getAddTaxIdClickedAction() {
            return AddTaxIdClickedAction;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getMoreQuestionsClickedAction() {
            return MoreQuestionsClickedAction;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getScreenShownAction() {
            return ScreenShownAction;
        }
    }
}
