package com.visa.cbp.sdk.facade.activeaccountmanagement;

/* loaded from: classes5.dex */
public class ReplenishWorker extends androidx.work.Worker {
    private static final java.lang.String TAG = "ReplenishWorker";

    public ReplenishWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public androidx.work.ListenableWorker.Result doWork() {
        try {
            new com.visa.cbp.getPhone(new com.visa.cbp.setSc(getApplicationContext(), com.visa.cbp.getCardMetaData.valueOf(getApplicationContext()))).BuildConfig(getApplicationContext());
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
        return androidx.work.ListenableWorker.Result.success();
    }
}
