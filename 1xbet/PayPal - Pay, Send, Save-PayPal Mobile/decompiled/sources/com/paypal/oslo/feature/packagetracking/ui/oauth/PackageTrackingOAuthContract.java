package com.paypal.oslo.feature.packagetracking.ui.oauth;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/PackageTrackingOAuthContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowInput;", "Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowInput;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/paypal/oslo/feature/packagetracking/ui/oauth/OAuthFlowResult;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingOAuthContract extends androidx.view.result.contract.ActivityResultContract<com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowInput, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult> {
    public static final java.lang.String EXTRA_AUTH_CODE = "extra_auth_code";
    public static final java.lang.String EXTRA_AUTH_URL = "extra_auth_url";
    public static final java.lang.String EXTRA_ERROR = "extra_error";
    public static final java.lang.String EXTRA_PROVIDER = "extra_provider";
    public static final java.lang.String EXTRA_STATE = "extra_state";
    public static final int $stable = 8;

    @Override // androidx.view.result.contract.ActivityResultContract
    public final android.content.Intent createIntent(android.content.Context context, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.paypal.oslo.feature.packagetracking.ui.oauth.PackageTrackingOAuthActivity.class);
        intent.putExtra(EXTRA_PROVIDER, input.getProvider().name());
        intent.putExtra(EXTRA_AUTH_URL, input.getAuthorizationUrl());
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public final com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult parseResult(int resultCode, android.content.Intent intent) {
        return com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthResultParser.INSTANCE.parseResult(resultCode, intent);
    }
}
