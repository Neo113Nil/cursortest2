package com.visa.cbp;

/* loaded from: classes5.dex */
public class getPhone {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "getPhone";
    static com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface getHighSpeedVideoFpsRanges;
    private com.visa.cbp.getSc Camera2StreamConfigurationMap;

    public enum ReplenishAckRequest {
        DAY(24);

        int getHighSpeedVideoFpsRangesFor;

        ReplenishAckRequest(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        final int getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public getPhone(com.visa.cbp.getSc getsc) {
        this.Camera2StreamConfigurationMap = getsc;
    }

    public static void values(com.visa.cbp.getPhone.ReplenishAckRequest replenishAckRequest) {
        androidx.work.WorkManager.getInstance().enqueueUniquePeriodicWork(getHighResolutionOutputSizeshNQ4ISI, androidx.work.ExistingPeriodicWorkPolicy.KEEP, new androidx.work.PeriodicWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishWorker.class, replenishAckRequest.getHighSpeedVideoFpsRangesFor(), java.util.concurrent.TimeUnit.HOURS).setInputData(new androidx.work.Data.Builder().build()).setConstraints(new androidx.work.Constraints.Builder().setRequiresBatteryNotLow(true).build()).build());
    }

    public static void valueOf(com.visa.cbp.getPhone.ReplenishAckRequest replenishAckRequest, com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface) {
        getHighSpeedVideoFpsRanges = replenishCallbackInterface;
        androidx.work.WorkManager.getInstance().enqueueUniquePeriodicWork(getHighResolutionOutputSizeshNQ4ISI, androidx.work.ExistingPeriodicWorkPolicy.KEEP, new androidx.work.PeriodicWorkRequest.Builder((java.lang.Class<? extends androidx.work.ListenableWorker>) com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishWorker.class, replenishAckRequest.getHighSpeedVideoFpsRangesFor(), java.util.concurrent.TimeUnit.HOURS).setInputData(new androidx.work.Data.Builder().build()).setConstraints(new androidx.work.Constraints.Builder().setRequiresBatteryNotLow(true).build()).build());
    }

    public void BuildConfig(android.content.Context context) {
        com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface;
        com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishCallbackInterface replenishCallbackInterface2;
        java.util.Calendar.getInstance().getTime();
        java.util.ArrayList<com.visa.cbp.sdk.facade.data.TokenKey> ReplenishAckRequest2 = ReplenishAckRequest(context);
        if (ReplenishAckRequest2.size() > 0 && (replenishCallbackInterface2 = getHighSpeedVideoFpsRanges) != null) {
            replenishCallbackInterface2.doReplenish(context, ReplenishAckRequest2);
        }
        java.util.ArrayList<com.visa.cbp.sdk.facade.data.TokenKey> values = values();
        if (values.size() <= 0 || (replenishCallbackInterface = getHighSpeedVideoFpsRanges) == null) {
            return;
        }
        replenishCallbackInterface.doOdaReplenish(context, values);
    }

    public java.util.ArrayList<com.visa.cbp.sdk.facade.data.TokenKey> ReplenishAckRequest(android.content.Context context) {
        java.util.ArrayList<com.visa.cbp.sdk.facade.data.TokenKey> arrayList = new java.util.ArrayList<>();
        java.util.List<com.visa.cbp.setDeviceId> ReplenishAckRequest2 = this.Camera2StreamConfigurationMap.ReplenishAckRequest();
        if (com.visa.cbp.sdk.facade.util.MiscUtils.isNotEmptyList(ReplenishAckRequest2)) {
            java.util.Iterator<com.visa.cbp.setDeviceId> it = ReplenishAckRequest2.iterator();
            while (it.hasNext()) {
                com.visa.cbp.sdk.facade.data.TokenKey ConfirmReplenishRequest = it.next().ConfirmReplenishRequest();
                if (getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, ConfirmReplenishRequest) && this.Camera2StreamConfigurationMap.getTvls(context, ConfirmReplenishRequest).m23146(this.Camera2StreamConfigurationMap, ConfirmReplenishRequest)) {
                    arrayList.add(ConfirmReplenishRequest);
                }
            }
        }
        return arrayList;
    }

    public java.util.ArrayList<com.visa.cbp.sdk.facade.data.TokenKey> values() {
        java.util.ArrayList<com.visa.cbp.sdk.facade.data.TokenKey> arrayList = new java.util.ArrayList<>();
        java.util.List<com.visa.cbp.sdk.facade.data.TokenData> tvls = this.Camera2StreamConfigurationMap.getTvls();
        if (com.visa.cbp.sdk.facade.util.MiscUtils.isNotEmptyList(tvls)) {
            java.util.Iterator<com.visa.cbp.sdk.facade.data.TokenData> it = tvls.iterator();
            while (it.hasNext()) {
                com.visa.cbp.sdk.facade.data.TokenKey tokenKey = it.next().getTokenKey();
                if (getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, tokenKey) && this.Camera2StreamConfigurationMap.setEncryptionMetaData(tokenKey)) {
                    arrayList.add(tokenKey);
                }
            }
        }
        return arrayList;
    }

    public boolean valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return this.Camera2StreamConfigurationMap.ReplenishRequest(tokenKey) && getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, tokenKey) && this.Camera2StreamConfigurationMap.getTvls(context, tokenKey).m23146(this.Camera2StreamConfigurationMap, tokenKey);
    }

    private boolean getHighSpeedVideoSizes(com.visa.cbp.getSc getsc, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        com.visa.cbp.sdk.facade.TokenRepersoStatus signature = getsc.BuildConfig(tokenKey).setSignature();
        return signature == com.visa.cbp.sdk.facade.TokenRepersoStatus.COMPLETED_REPERSO || signature == com.visa.cbp.sdk.facade.TokenRepersoStatus.NO_MIGRATION;
    }
}
