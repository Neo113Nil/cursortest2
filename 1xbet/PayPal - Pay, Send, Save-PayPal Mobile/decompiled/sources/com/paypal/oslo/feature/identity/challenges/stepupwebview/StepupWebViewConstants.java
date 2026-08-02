package com.paypal.oslo.feature.identity.challenges.stepupwebview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/StepupWebViewConstants;", "", "<init>", "()V", "Analytics", "Scripts", "Headers", "HeaderFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StepupWebViewConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants();

    private StepupWebViewConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/StepupWebViewConstants$Analytics;", "", "<init>", "()V", "", "SOURCE_PREFIX", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Analytics {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.Analytics INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.Analytics();
        public static final java.lang.String SOURCE_PREFIX = "stepup_";

        private Analytics() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/StepupWebViewConstants$Scripts;", "", "<init>", "()V", "", "REMOVE_BLANK_TARGETS", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Scripts {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.Scripts INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.Scripts();
        public static final java.lang.String REMOVE_BLANK_TARGETS = "document.querySelectorAll('a[target=\"_blank\"]').forEach(function(a){a.target='_self';})";

        private Scripts() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/StepupWebViewConstants$Headers;", "", "<init>", "()V", "", "SECURE_APP_DATA_HEADER", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Headers {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.Headers INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.Headers();
        public static final java.lang.String SECURE_APP_DATA_HEADER = "x-paypal-secure-app-data";

        private Headers() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/StepupWebViewConstants$HeaderFields;", "", "<init>", "()V", "", "STEPUP_CONTEXT", "Ljava/lang/String;", "ACCESS_TOKEN", "RETURN_URI", "FLOW_ID", "FLOW_CONTEXT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class HeaderFields {
        public static final int $stable = 0;
        public static final java.lang.String ACCESS_TOKEN = "accessToken";
        public static final java.lang.String FLOW_CONTEXT = "flowContext";
        public static final java.lang.String FLOW_ID = "flowId";
        public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields INSTANCE = new com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields();
        public static final java.lang.String RETURN_URI = "returnUri";
        public static final java.lang.String STEPUP_CONTEXT = "stepupContext";

        private HeaderFields() {
        }
    }
}
