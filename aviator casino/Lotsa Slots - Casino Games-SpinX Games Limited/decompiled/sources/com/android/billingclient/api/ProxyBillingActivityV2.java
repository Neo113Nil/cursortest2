package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public class ProxyBillingActivityV2 extends androidx.activity.ComponentActivity {
    private androidx.activity.result.ActivityResultLauncher zza;
    private androidx.activity.result.ActivityResultLauncher zzb;
    private android.os.ResultReceiver zzc;
    private android.os.ResultReceiver zzd;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.android.billingclient.api.zzcw
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.android.billingclient.api.ProxyBillingActivityV2.this.zza((androidx.activity.result.ActivityResult) obj);
            }
        });
        this.zzb = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult(), new androidx.activity.result.ActivityResultCallback() { // from class: com.android.billingclient.api.zzcx
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.android.billingclient.api.ProxyBillingActivityV2.this.zzb((androidx.activity.result.ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzc = (android.os.ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.zzd = (android.os.ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.zzc = (android.os.ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.zza.launch(new androidx.activity.result.IntentSenderRequest.Builder(pendingIntent).build());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.zzd = (android.os.ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.zzb.launch(new androidx.activity.result.IntentSenderRequest.Builder(pendingIntent2).build());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.os.ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        android.os.ResultReceiver resultReceiver2 = this.zzd;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    final void zza(androidx.activity.result.ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(data, "ProxyBillingActivityV2").getResponseCode();
        android.os.ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    final void zzb(androidx.activity.result.ActivityResult activityResult) {
        android.content.Intent data = activityResult.getData();
        int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(data, "ProxyBillingActivityV2").getResponseCode();
        android.os.ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, data == null ? null : data.getExtras());
        }
        if (activityResult.getResultCode() != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", java.lang.String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", java.lang.Integer.valueOf(activityResult.getResultCode()), java.lang.Integer.valueOf(responseCode)));
        }
        finish();
    }
}
