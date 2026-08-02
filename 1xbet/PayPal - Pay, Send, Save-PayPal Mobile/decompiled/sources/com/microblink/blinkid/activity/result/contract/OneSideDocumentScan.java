package com.microblink.blinkid.activity.result.contract;

/* loaded from: classes9.dex */
public class OneSideDocumentScan extends androidx.view.result.contract.ActivityResultContract<java.lang.Void, com.microblink.blinkid.activity.result.OneSideScanResult> {
    public static final java.lang.String EXTRA_SCAN_EXCEPTION = "com.microblink.blinkid.scanexception";
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer getHighSpeedVideoFpsRangesFor;

    @Override // androidx.view.result.contract.ActivityResultContract
    public android.content.Intent createIntent(android.content.Context context, java.lang.Void r4) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer blinkIdSingleSideRecognizer = new com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer();
        this.getHighSpeedVideoFpsRangesFor = blinkIdSingleSideRecognizer;
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(blinkIdSingleSideRecognizer);
        com.microblink.blinkid.uisettings.BlinkIdUISettings blinkIdUISettings = new com.microblink.blinkid.uisettings.BlinkIdUISettings(this.getHighSpeedVideoFpsRanges);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.microblink.blinkid.activity.BlinkIdActivity.class);
        blinkIdUISettings.saveToIntent(intent);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.result.contract.ActivityResultContract
    public com.microblink.blinkid.activity.result.OneSideScanResult parseResult(int i, android.content.Intent intent) {
        if (intent == null) {
            return new com.microblink.blinkid.activity.result.OneSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.CANCELLED, null, null);
        }
        if (i != -1) {
            java.lang.Throwable th = (java.lang.Throwable) intent.getSerializableExtra("com.microblink.blinkid.scanexception");
            return th != null ? new com.microblink.blinkid.activity.result.OneSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.EXCEPTION, null, th) : new com.microblink.blinkid.activity.result.OneSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.CANCELLED, null, null);
        }
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getHighSpeedVideoFpsRanges;
        if (recognizerBundle == null) {
            com.microblink.blinkid.entities.recognizers.RecognizerBundle createFromIntent = com.microblink.blinkid.entities.recognizers.RecognizerBundle.createFromIntent(intent);
            this.getHighSpeedVideoFpsRanges = createFromIntent;
            this.getHighSpeedVideoFpsRangesFor = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) createFromIntent.getRecognizers()[0];
        } else {
            recognizerBundle.loadFromIntent(intent);
        }
        return new com.microblink.blinkid.activity.result.OneSideScanResult(com.microblink.blinkid.activity.result.ResultStatus.FINISHED, (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) this.getHighSpeedVideoFpsRangesFor.getResult(), null);
    }
}
