package com.paypal.oslo.feature.packagetracking.ui.oauth;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthResultParser;", "", "<init>", "()V", "", "resultCode", "Landroid/content/Intent;", "intent", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "parseResult", "(ILandroid/content/Intent;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "p0", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "Camera2StreamConfigurationMap", "(Landroid/content/Intent;)Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OAuthResultParser {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthResultParser INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthResultParser();

    private OAuthResultParser() {
    }

    private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider Camera2StreamConfigurationMap(android.content.Intent p0) {
        java.lang.String stringExtra;
        java.lang.Object m23436constructorimpl;
        if (p0 == null || (stringExtra = p0.getStringExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_PROVIDER)) == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthResultParser oAuthResultParser = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.valueOf(stringExtra));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult parseResult(int resultCode, android.content.Intent intent) {
        if (resultCode != -1 || intent == null) {
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled(Camera2StreamConfigurationMap(intent));
        }
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(intent);
        if (Camera2StreamConfigurationMap == null) {
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error(null, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.MISSING_PROVIDER);
        }
        java.lang.String stringExtra = intent.getStringExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_ERROR);
        if (stringExtra != null) {
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error(Camera2StreamConfigurationMap, stringExtra);
        }
        java.lang.String stringExtra2 = intent.getStringExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_AUTH_CODE);
        java.lang.String stringExtra3 = intent.getStringExtra(com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthContract.EXTRA_STATE);
        if (stringExtra2 == null || stringExtra3 == null) {
            return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error(Camera2StreamConfigurationMap, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.MISSING_AUTH_RESULT);
        }
        return new com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success(Camera2StreamConfigurationMap, stringExtra2, stringExtra3);
    }
}
