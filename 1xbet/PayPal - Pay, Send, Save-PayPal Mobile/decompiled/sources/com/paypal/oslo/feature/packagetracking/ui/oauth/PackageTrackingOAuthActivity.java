package com.paypal.oslo.feature.packagetracking.ui.oauth;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/oauth/PackageTrackingOAuthActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onPause", "onResume", "outState", "onSaveInstanceState", "Landroid/net/Uri;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/net/Uri;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingOAuthActivity extends androidx.view.ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.String callingPackage;
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (savedInstanceState != null) {
            this.getHighSpeedVideoFpsRangesFor = savedInstanceState.getBoolean(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.STATE_HAS_LAUNCHED, false);
            this.getHighSpeedVideoFpsRanges = savedInstanceState.getBoolean(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.STATE_HAS_HANDLED_CALLBACK, false);
            this.Camera2StreamConfigurationMap = savedInstanceState.getBoolean(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.STATE_HAS_PAUSED, false);
            this.getHighResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.restoreProvider(savedInstanceState);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper oAuthActivityHelper = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE;
            android.content.Intent intent = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
            this.getHighResolutionOutputSizeshNQ4ISI = oAuthActivityHelper.extractProviderFromIntent(intent);
        }
        android.net.Uri data = getIntent().getData();
        if (data != null) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getIntent().getAction(), "android.intent.action.VIEW")) {
                data = null;
            }
            if (data != null) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.extractProviderFromUri(data);
                }
                getHighResolutionOutputSizeshNQ4ISI(data);
                return;
            }
        }
        android.content.ComponentName callingActivity = getCallingActivity();
        if (callingActivity == null || (callingPackage = callingActivity.getPackageName()) == null) {
            callingPackage = getCallingPackage();
        }
        com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper oAuthActivityHelper2 = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE;
        java.lang.String action = getIntent().getAction();
        java.lang.String packageName = getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
        if (!oAuthActivityHelper2.shouldRejectLaunch(action, callingPackage, packageName)) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper oAuthActivityHelper3 = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE;
            android.content.Intent intent2 = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "");
            java.lang.String extractAuthUrlFromIntent = oAuthActivityHelper3.extractAuthUrlFromIntent(intent2);
            if (extractAuthUrlFromIntent != null) {
                arrow.core.Either<java.lang.String, kotlin.Unit> launchOAuthBrowser = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.launchOAuthBrowser(this, extractAuthUrlFromIntent);
                if (launchOAuthBrowser instanceof arrow.core.Either.Right) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    return;
                } else {
                    if (!(launchOAuthBrowser instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    setResult(-1, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.createErrorIntent(this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.String) ((arrow.core.Either.Left) launchOAuthBrowser).getValue()));
                    finish();
                    return;
                }
            }
            setResult(-1, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.createErrorIntent(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.MISSING_AUTH_URL));
            finish();
            return;
        }
        setResult(0, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.createCancellationIntent(this.getHighResolutionOutputSizeshNQ4ISI));
        finish();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        android.net.Uri data = intent.getData();
        if (data == null || !kotlin.jvm.internal.Intrinsics.areEqual(intent.getAction(), "android.intent.action.VIEW")) {
            data = null;
        }
        if (data != null) {
            getHighResolutionOutputSizeshNQ4ISI(data);
        } else {
            if (!this.getHighSpeedVideoFpsRangesFor || this.getHighSpeedVideoFpsRanges) {
                return;
            }
            setResult(0, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.createCancellationIntent(this.getHighResolutionOutputSizeshNQ4ISI));
            finish();
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.Camera2StreamConfigurationMap = true;
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap && !this.getHighSpeedVideoFpsRanges && getIntent().getData() == null) {
            setResult(0, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.createCancellationIntent(this.getHighResolutionOutputSizeshNQ4ISI));
            finish();
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        super.onSaveInstanceState(outState);
        outState.putBoolean(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.STATE_HAS_LAUNCHED, this.getHighSpeedVideoFpsRangesFor);
        outState.putBoolean(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.STATE_HAS_HANDLED_CALLBACK, this.getHighSpeedVideoFpsRanges);
        outState.putBoolean(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.STATE_HAS_PAUSED, this.Camera2StreamConfigurationMap);
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.getHighResolutionOutputSizeshNQ4ISI;
        outState.putString(com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.STATE_PROVIDER, emailProvider != null ? emailProvider.name() : null);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(android.net.Uri p0) {
        android.content.Intent processCallbackUri = com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.processCallbackUri(p0, this.getHighResolutionOutputSizeshNQ4ISI);
        if (processCallbackUri != null) {
            this.getHighSpeedVideoFpsRanges = true;
            setResult(-1, processCallbackUri);
        } else {
            setResult(-1, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthActivityHelper.INSTANCE.createErrorIntent(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthErrorCode.INVALID_CALLBACK_URI));
        }
        finish();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
    }
}
