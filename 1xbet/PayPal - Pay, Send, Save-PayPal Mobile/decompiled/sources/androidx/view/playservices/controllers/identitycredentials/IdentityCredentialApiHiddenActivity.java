package androidx.view.playservices.controllers.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\bJ)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/credentials/playservices/controllers/identitycredentials/IdentityCredentialApiHiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "p0", "getHighSpeedVideoFpsRangesFor", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/ResultReceiver;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/os/ResultReceiver;", "", "getHighSpeedVideoFpsRanges", "Z", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class IdentityCredentialApiHiddenActivity extends android.app.Activity {
    private android.os.ResultReceiver getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) getIntent().getParcelableExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.getHighResolutionOutputSizeshNQ4ISI = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        java.lang.String stringExtra = getIntent().getStringExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_ERROR_NAME);
        if (stringExtra == null) {
            finish();
            return;
        }
        getHighSpeedVideoFpsRangesFor(savedInstanceState);
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT);
        if (pendingIntent != null) {
            this.Camera2StreamConfigurationMap = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release(), null, 0, 0, 0, null);
        } else {
            android.os.ResultReceiver resultReceiver2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (resultReceiver2 != null) {
                androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver2, stringExtra, "Internal error");
            }
            finish();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(android.os.Bundle p0) {
        if (p0 != null) {
            this.Camera2StreamConfigurationMap = p0.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle outState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.Camera2StreamConfigurationMap);
        super.onSaveInstanceState(outState);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        android.os.ResultReceiver resultReceiver = this.getHighResolutionOutputSizeshNQ4ISI;
        if (resultReceiver != null) {
            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportResult$credentials_play_services_auth_release(resultReceiver, requestCode, resultCode, data);
        }
        this.Camera2StreamConfigurationMap = false;
        finish();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
