package com.microblink.blinkid.activity.result.contract;

/* loaded from: classes9.dex */
public class TwoSideDocumentScan extends androidx.view.result.contract.ActivityResultContract<java.lang.Void, com.microblink.blinkid.activity.result.TwoSideScanResult> {
    public static final java.lang.String EXTRA_SCAN_EXCEPTION = "com.microblink.blinkid.scanexception";
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer Camera2StreamConfigurationMap;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.view.result.contract.ActivityResultContract
    public android.content.Intent createIntent(android.content.Context context, java.lang.Void r4) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer blinkIdMultiSideRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer();
        this.Camera2StreamConfigurationMap = blinkIdMultiSideRecognizer;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(blinkIdMultiSideRecognizer);
        com.microblink.blinkid.uisettings.BlinkIdUISettings blinkIdUISettings = new com.microblink.blinkid.uisettings.BlinkIdUISettings(this.getHighResolutionOutputSizeshNQ4ISI);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.microblink.blinkid.activity.BlinkIdActivity.class);
        blinkIdUISettings.saveToIntent(intent);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.result.contract.ActivityResultContract
    public com.microblink.blinkid.activity.result.TwoSideScanResult parseResult(int i, android.content.Intent intent) {
        if (intent == null) {
            return new com.microblink.blinkid.activity.result.TwoSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.CANCELLED, null, null);
        }
        if (i != -1) {
            java.lang.Throwable th = (java.lang.Throwable) intent.getSerializableExtra("com.microblink.blinkid.scanexception");
            return th != null ? new com.microblink.blinkid.activity.result.TwoSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.EXCEPTION, null, th) : new com.microblink.blinkid.activity.result.TwoSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.CANCELLED, null, null);
        }
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighResolutionOutputSizeshNQ4ISI;
        if (recognizerBundle == null) {
            com.microblink.blinkid.entities.recognizers.RecognizerBundle createFromIntent = com.microblink.blinkid.entities.recognizers.RecognizerBundle.createFromIntent(intent);
            this.getHighResolutionOutputSizeshNQ4ISI = createFromIntent;
            this.Camera2StreamConfigurationMap = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) createFromIntent.getRecognizers()[0];
        } else {
            recognizerBundle.loadFromIntent(intent);
        }
        return new com.microblink.blinkid.activity.result.TwoSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.FINISHED, (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) this.Camera2StreamConfigurationMap.getResult(), null);
    }
}
