package com.microblink.blinkid.activity.result.contract;

/* loaded from: classes9.dex */
public class MbScan extends androidx.view.result.contract.ActivityResultContract<com.microblink.blinkid.uisettings.UISettings, com.microblink.blinkid.activity.result.ScanResult> {
    public static final java.lang.String EXTRA_SCAN_EXCEPTION = "com.microblink.blinkid.scanexception";

    @Override // androidx.view.result.contract.ActivityResultContract
    public android.content.Intent createIntent(android.content.Context context, com.microblink.blinkid.uisettings.UISettings uISettings) {
        android.content.Intent intent = new android.content.Intent(context, uISettings.getTargetActivity());
        uISettings.saveToIntent(intent);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.view.result.contract.ActivityResultContract
    public com.microblink.blinkid.activity.result.ScanResult parseResult(int i, android.content.Intent intent) {
        if (intent == null) {
            return new com.microblink.blinkid.activity.result.ScanResult(com.microblink.blinkid.activity.result.ResultStatus.CANCELLED, null, null);
        }
        if (i == -1) {
            return new com.microblink.blinkid.activity.result.ScanResult(com.microblink.blinkid.activity.result.ResultStatus.FINISHED, intent, null);
        }
        java.lang.Throwable th = (java.lang.Throwable) intent.getSerializableExtra("com.microblink.blinkid.scanexception");
        return th != null ? new com.microblink.blinkid.activity.result.ScanResult(com.microblink.blinkid.activity.result.ResultStatus.EXCEPTION, null, th) : new com.microblink.blinkid.activity.result.ScanResult(com.microblink.blinkid.activity.result.ResultStatus.CANCELLED, null, null);
    }
}
