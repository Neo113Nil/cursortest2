package com.visa.cbp;

/* loaded from: classes16.dex */
public class getvProvisionedTokenID {
    public static final int BuildConfig = 256;

    public static java.util.List<java.lang.String[]> valueOf(android.content.Context context, int i) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        getHighSpeedVideoFpsRangesFor(com.visa.cbp.setEncryptionScheme.ConfirmReplenishRequest.BuildConfig(), i);
        getHighSpeedVideoFpsRangesFor(com.visa.cbp.setEncryptionScheme.BuildConfig.BuildConfig(), i);
        getHighSpeedVideoSizes(context, "RSA", com.visa.cbp.setEncryptionScheme.ReplenishAckRequest.BuildConfig());
        getHighSpeedVideoSizes(context, "RSA", com.visa.cbp.setEncryptionScheme.valueOf.BuildConfig());
        getHighSpeedVideoSizes(context, "EC", com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig());
        com.visa.cbp.setDate setdate = new com.visa.cbp.setDate();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(setdate.ConfirmReplenishRequest(com.visa.cbp.setEncryptionScheme.ReplenishAckRequest.BuildConfig()));
        arrayList.add(setdate.ConfirmReplenishRequest(com.visa.cbp.setEncryptionScheme.valueOf.BuildConfig()));
        arrayList.add(setdate.ConfirmReplenishRequest(com.visa.cbp.setEncryptionScheme.getTvls.BuildConfig()));
        return arrayList;
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        new com.visa.cbp.setDate().getHighSpeedVideoFpsRangesFor("ChipSDK", str, i);
    }

    private static void getHighSpeedVideoSizes(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.security.InvalidAlgorithmParameterException, java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        new com.visa.cbp.setDate().valueOf(context, str2, "ChipSDK", str);
    }
}
