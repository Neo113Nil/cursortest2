package androidx.view.playservices.controllers.identityauth;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ)\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/ResultReceiver;", "getHighSpeedVideoFpsRangesFor", "Landroid/os/ResultReceiver;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class HiddenActivity extends android.app.Activity {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.os.ResultReceiver getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.Object obj;
        java.lang.String str;
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        java.lang.String stringExtra = getIntent().getStringExtra("TYPE");
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) getIntent().getParcelableExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.getHighSpeedVideoFpsRanges = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (savedInstanceState != null) {
            this.Camera2StreamConfigurationMap = savedInstanceState.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (this.Camera2StreamConfigurationMap) {
        }
        if (stringExtra == null) {
            finish();
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT);
        int intExtra = getIntent().getIntExtra(androidx.view.playservices.controllers.CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (pendingIntent == null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        android.os.ResultReceiver resultReceiver2 = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver2);
                        androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver2, androidx.view.playservices.controllers.CredentialProviderBaseController.GET_UNKNOWN, "internal error during the begin sign in operation");
                        finish();
                        break;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        android.os.ResultReceiver resultReceiver3 = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver3);
                        androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver3, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during public key credential creation");
                        finish();
                        break;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        android.os.ResultReceiver resultReceiver4 = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver4);
                        androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver4, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_UNKNOWN, "internal error during password creation");
                        finish();
                        break;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        android.os.ResultReceiver resultReceiver5 = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver5);
                        androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver5, androidx.view.playservices.controllers.CredentialProviderBaseController.GET_UNKNOWN, "internal error during the sign-in intent operation");
                        finish();
                        break;
                    }
                    break;
            }
        }
        try {
            this.Camera2StreamConfigurationMap = true;
            android.content.IntentSender intentSender = pendingIntent.getIntentSender();
            obj = androidx.view.playservices.controllers.CredentialProviderBaseController.BEGIN_SIGN_IN_TAG;
            str = androidx.view.playservices.controllers.CredentialProviderBaseController.GET_UNKNOWN;
            try {
                startIntentSenderForResult(intentSender, intExtra, null, 0, 0, 0, null);
            } catch (android.content.IntentSender.SendIntentException e) {
                e = e;
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals(obj)) {
                            android.os.ResultReceiver resultReceiver6 = this.getHighSpeedVideoFpsRanges;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver6);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("During begin sign in, one tap ui intent sender failure: ");
                            sb.append(e.getMessage());
                            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver6, str, sb.toString());
                            finish();
                            break;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                            android.os.ResultReceiver resultReceiver7 = this.getHighSpeedVideoFpsRanges;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver7);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("During public key credential, found IntentSender failure on public key creation: ");
                            sb2.append(e.getMessage());
                            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver7, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_UNKNOWN, sb2.toString());
                            finish();
                            break;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                            android.os.ResultReceiver resultReceiver8 = this.getHighSpeedVideoFpsRanges;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver8);
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("During save password, found UI intent sender failure: ");
                            sb3.append(e.getMessage());
                            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver8, androidx.view.playservices.controllers.CredentialProviderBaseController.CREATE_UNKNOWN, sb3.toString());
                            finish();
                            break;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals(androidx.view.playservices.controllers.CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                            android.os.ResultReceiver resultReceiver9 = this.getHighSpeedVideoFpsRanges;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(resultReceiver9);
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("During get sign-in intent, one tap ui intent sender failure: ");
                            sb4.append(e.getMessage());
                            androidx.view.playservices.controllers.CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver9, str, sb4.toString());
                            finish();
                            break;
                        }
                        break;
                }
            }
        } catch (android.content.IntentSender.SendIntentException e2) {
            e = e2;
            obj = androidx.view.playservices.controllers.CredentialProviderBaseController.BEGIN_SIGN_IN_TAG;
            str = androidx.view.playservices.controllers.CredentialProviderBaseController.GET_UNKNOWN;
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
        android.os.ResultReceiver resultReceiver = this.getHighSpeedVideoFpsRanges;
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
