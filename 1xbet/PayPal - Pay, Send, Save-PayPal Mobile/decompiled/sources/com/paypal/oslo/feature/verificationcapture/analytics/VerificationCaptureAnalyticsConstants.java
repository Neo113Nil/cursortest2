package com.paypal.oslo.feature.verificationcapture.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/analytics/VerificationCaptureAnalyticsConstants;", "", "<init>", "()V", "", "PRODUCT", "Ljava/lang/String;", "FEATURE", "DocumentCapture", "ManualUpload", "CancelConfirmation", "LivenessCapture"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureAnalyticsConstants {
    public static final int $stable = 0;
    public static final java.lang.String FEATURE = "verification_capture";
    public static final com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants();
    public static final java.lang.String PRODUCT = "identity_verification";

    private VerificationCaptureAnalyticsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/analytics/VerificationCaptureAnalyticsConstants$DocumentCapture;", "", "<init>", "()V", "", "SCREEN", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "CAPTURE_FRAME_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getCAPTURE_FRAME_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "ACTION_BAR_ZONE", "getACTION_BAR_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "BACK_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getBACK_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "FLASH_BUTTON", "getFLASH_BUTTON", "RETRY_BUTTON", "getRETRY_BUTTON", "ACTION_VIEW", "ACTION_CAPTURE", "ACTION_BACK", "ACTION_TOGGLE_FLASH", "ACTION_RETRY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DocumentCapture {
        public static final int $stable;
        public static final java.lang.String ACTION_BACK = "navigate_back";
        public static final java.lang.String ACTION_CAPTURE = "capture_document";
        public static final java.lang.String ACTION_RETRY = "retry_capture";
        public static final java.lang.String ACTION_TOGGLE_FLASH = "toggle_flash";
        public static final java.lang.String ACTION_VIEW = "view_document_capture";
        public static final java.lang.String FEATURE = "document_capture";
        public static final java.lang.String SCREEN = "document_capture";
        public static final com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.DocumentCapture INSTANCE = new com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.DocumentCapture();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module CAPTURE_FRAME_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("capture_frame_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module ACTION_BAR_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("action_bar_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item BACK_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("back_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item FLASH_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("flash_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item RETRY_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen.RETRY_BUTTON, 0, 2, null);

        private DocumentCapture() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getCAPTURE_FRAME_ZONE() {
            return CAPTURE_FRAME_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getACTION_BAR_ZONE() {
            return ACTION_BAR_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getBACK_BUTTON() {
            return BACK_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getFLASH_BUTTON() {
            return FLASH_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getRETRY_BUTTON() {
            return RETRY_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/analytics/VerificationCaptureAnalyticsConstants$ManualUpload;", "", "<init>", "()V", "", "SCREEN", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "UPLOAD_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getUPLOAD_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "DIALOG_ZONE", "getDIALOG_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "UPLOAD_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getUPLOAD_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CONFIRM_BUTTON", "getCONFIRM_BUTTON", "CANCEL_BUTTON", "getCANCEL_BUTTON", "ACTION_VIEW", "ACTION_UPLOAD", "ACTION_CONFIRM", "ACTION_CANCEL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ManualUpload {
        public static final int $stable;
        public static final java.lang.String ACTION_CANCEL = "cancel_upload";
        public static final java.lang.String ACTION_CONFIRM = "confirm_upload";
        public static final java.lang.String ACTION_UPLOAD = "upload_document";
        public static final java.lang.String ACTION_VIEW = "view_manual_upload";
        public static final java.lang.String FEATURE = "manual_upload";
        public static final java.lang.String SCREEN = "manual_upload";
        public static final com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.ManualUpload INSTANCE = new com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.ManualUpload();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module UPLOAD_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("upload_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module DIALOG_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("upload_dialog_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item UPLOAD_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("upload_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONFIRM_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt.TestTagConfirmButton, 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CANCEL_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("cancel_button", 0, 2, null);

        private ManualUpload() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getUPLOAD_ZONE() {
            return UPLOAD_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getDIALOG_ZONE() {
            return DIALOG_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getUPLOAD_BUTTON() {
            return UPLOAD_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONFIRM_BUTTON() {
            return CONFIRM_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCANCEL_BUTTON() {
            return CANCEL_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/analytics/VerificationCaptureAnalyticsConstants$CancelConfirmation;", "", "<init>", "()V", "", "SCREEN", "Ljava/lang/String;", "FEATURE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "DIALOG_ZONE", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "getDIALOG_ZONE", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "CONFIRM_BUTTON", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCONFIRM_BUTTON", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "DISMISS_BUTTON", "getDISMISS_BUTTON", "ACTION_VIEW", "ACTION_CONFIRM", "ACTION_DISMISS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CancelConfirmation {
        public static final int $stable;
        public static final java.lang.String ACTION_CONFIRM = "confirm_cancel";
        public static final java.lang.String ACTION_DISMISS = "dismiss_cancel";
        public static final java.lang.String ACTION_VIEW = "view_cancel_confirmation";
        public static final java.lang.String FEATURE = "verification_capture";
        public static final java.lang.String SCREEN = "cancel_confirmation";
        public static final com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.CancelConfirmation INSTANCE = new com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.CancelConfirmation();
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module DIALOG_ZONE = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("cancel_dialog_zone", 0, null, null, 14, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item CONFIRM_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("confirm_cancel_button", 0, 2, null);
        private static final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item DISMISS_BUTTON = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("dismiss_cancel_button", 0, 2, null);

        private CancelConfirmation() {
        }

        static {
            int i = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
            $stable = i | i | com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module.$stable;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module getDIALOG_ZONE() {
            return DIALOG_ZONE;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCONFIRM_BUTTON() {
            return CONFIRM_BUTTON;
        }

        public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getDISMISS_BUTTON() {
            return DISMISS_BUTTON;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/analytics/VerificationCaptureAnalyticsConstants$LivenessCapture;", "", "<init>", "()V", "", "SCREEN", "Ljava/lang/String;", "FEATURE", "ACTION_VIEW", "ACTION_COMPLETE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LivenessCapture {
        public static final int $stable = 0;
        public static final java.lang.String ACTION_COMPLETE = "complete_liveness_capture";
        public static final java.lang.String ACTION_VIEW = "view_liveness_capture";
        public static final java.lang.String FEATURE = "liveness_capture";
        public static final com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.LivenessCapture INSTANCE = new com.paypal.oslo.feature.verificationcapture.analytics.VerificationCaptureAnalyticsConstants.LivenessCapture();
        public static final java.lang.String SCREEN = "liveness_capture";

        private LivenessCapture() {
        }
    }
}
