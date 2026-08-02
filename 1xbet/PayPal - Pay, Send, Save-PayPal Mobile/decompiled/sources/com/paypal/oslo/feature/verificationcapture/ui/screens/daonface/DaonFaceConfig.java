package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceConfig;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "readLicense", "(Landroid/content/Context;)Ljava/lang/String;", "", "SDK_OPTIONS", com.visa.cbp.getEncExpo.warmup, "", "BLINK_THRESHOLD", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "EYES_OPEN_COUNT", "EYES_OPEN_CONFIDENCE", "CAPTURE_SESSION_TIMEOUT", "LIVENESS_TIMEOUT", "CAPTURE_SKIP_FRAME", "BLINK_CHECK_TIMEOUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DaonFaceConfig {
    public static final int $stable = 0;
    public static final int BLINK_CHECK_TIMEOUT = 10;
    public static final float BLINK_THRESHOLD = 0.35f;
    public static final int CAPTURE_SESSION_TIMEOUT = 60000;
    public static final int CAPTURE_SKIP_FRAME = 10;
    public static final float EYES_OPEN_CONFIDENCE = 0.73f;
    public static final int EYES_OPEN_COUNT = 7;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceConfig INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceConfig();
    public static final int LIVENESS_TIMEOUT = 2500;
    public static final int SDK_OPTIONS = 3;

    private DaonFaceConfig() {
    }

    public final java.lang.String readLicense(android.content.Context context) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String str = context.getApplicationInfo().packageName;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        java.lang.String str2 = str;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "demo", false, 2, (java.lang.Object) null)) {
            i = com.paypal.oslo.feature.verificationcapture.R.raw.feature_verification_capture_daon_face_demo;
        } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "merchant.client.debug", false, 2, (java.lang.Object) null)) {
            i = com.paypal.oslo.feature.verificationcapture.R.raw.feature_verification_capture_daon_face_merchant_debug;
        } else {
            i = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "merchant.client", false, 2, (java.lang.Object) null) ? com.paypal.oslo.feature.verificationcapture.R.raw.feature_verification_capture_daon_face_merchant : com.paypal.oslo.feature.verificationcapture.R.raw.feature_verification_capture_daon_face;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Loading Daon Face license", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("package", str), kotlin.TuplesKt.to("resource", java.lang.Integer.valueOf(i))), null, 4, null);
        java.io.BufferedReader openRawResource = context.getResources().openRawResource(i);
        try {
            openRawResource = new java.io.BufferedReader(new java.io.InputStreamReader(openRawResource));
            try {
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(openRawResource);
                kotlin.io.CloseableKt.closeFinally(openRawResource, null);
                kotlin.io.CloseableKt.closeFinally(openRawResource, null);
                return readText;
            } finally {
            }
        } finally {
        }
    }
}
