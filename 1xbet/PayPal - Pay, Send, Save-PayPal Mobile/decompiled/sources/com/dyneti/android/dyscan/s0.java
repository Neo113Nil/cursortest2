package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class s0 implements com.dyneti.android.dyscan.DyScanView.DyScanResultListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.dyneti.android.dyscan.DyScanActivity f3337a;

    public s0(com.dyneti.android.dyscan.DyScanActivity dyScanActivity) {
        this.f3337a = dyScanActivity;
    }

    @Override // com.dyneti.android.dyscan.DyScanView.DyScanResultListener
    public final void onFailure(int i) {
        android.content.Intent intent = new android.content.Intent();
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = i != 5 ? 0 : 6;
                }
            }
        }
        this.f3337a.setResult(i2, intent);
        this.f3337a.finish();
    }

    @Override // com.dyneti.android.dyscan.DyScanView.DyScanResultListener
    public final void onProgressUpdate(com.dyneti.android.dyscan.DyScanProgressUpdate dyScanProgressUpdate) {
        if (dyScanProgressUpdate.getFewDigitsSeen()) {
            android.widget.Toast.makeText(this.f3337a.getApplicationContext(), com.dyneti.android.dyscan.R.string.dyscan_few_digits_seen, 1).show();
        }
    }

    @Override // com.dyneti.android.dyscan.DyScanView.DyScanResultListener
    public final void onSuccess(com.dyneti.android.dyscan.CreditCard creditCard) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.dyneti.android.dyscan.DyScanActivity.EXTRA_SCAN_RESULT, creditCard);
        this.f3337a.setResult(-1, intent);
        this.f3337a.finish();
    }
}
