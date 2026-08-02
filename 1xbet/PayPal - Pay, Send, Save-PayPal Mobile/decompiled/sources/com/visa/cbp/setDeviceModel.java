package com.visa.cbp;

/* loaded from: classes16.dex */
class setDeviceModel {
    static com.visa.cbp.setDeviceModel Camera2StreamConfigurationMap = null;
    public static final int getHighResolutionOutputSizeshNQ4ISI = 3000;
    private static final java.lang.String getHighSpeedVideoFpsRanges = "setDeviceModel";
    private static android.nfc.tech.NfcA getHighSpeedVideoFpsRangesFor = null;
    private static android.nfc.tech.IsoDep getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = -1;
    private static android.nfc.tech.NfcB getInputFormats;
    private android.app.PendingIntent getInputSizeshNQ4ISI;
    private java.lang.String[][] getOutputFormats;
    private android.nfc.Tag getOutputMinFrameDuration;
    private android.nfc.NfcAdapter getOutputMinFrameDurationlomOqCM;
    private android.content.IntentFilter[] getOutputSizeshNQ4ISI;

    public static com.visa.cbp.setDeviceModel Camera2StreamConfigurationMap(android.content.Context context) {
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = new com.visa.cbp.setDeviceModel(context);
        }
        return Camera2StreamConfigurationMap;
    }

    public setDeviceModel(android.content.Context context) {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(context);
        this.getOutputMinFrameDurationlomOqCM = defaultAdapter;
        if (defaultAdapter == null) {
            com.visa.cbp.setDeviceCerts.Content.valueOf();
            throw new com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException(com.visa.cbp.setDeviceCerts.Content);
        }
        this.getInputSizeshNQ4ISI = android.app.PendingIntent.getActivity(context, 0, new android.content.Intent(context, getClass()).addFlags(536870912), 67108864);
        new android.content.IntentFilter("android.nfc.action.NDEF_DISCOVERED");
        new android.content.IntentFilter("android.nfc.action.TECH_DISCOVERED");
        new android.content.IntentFilter("android.nfc.action.TAG_DISCOVERED");
        this.getOutputFormats = new java.lang.String[][]{new java.lang.String[]{android.nfc.tech.NfcA.class.getName()}, new java.lang.String[]{android.nfc.tech.NfcB.class.getName()}, new java.lang.String[]{android.nfc.tech.IsoDep.class.getName()}};
    }

    public byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws java.io.IOException {
        if (getHighSpeedVideoSizes == null) {
            getHighSpeedVideoSizes = android.nfc.tech.IsoDep.get(this.getOutputMinFrameDuration);
        }
        if (!getHighSpeedVideoSizes.isConnected()) {
            getHighSpeedVideoSizes.connect();
            getHighSpeedVideoSizes.setTimeout(3000);
        }
        if (!getHighSpeedVideoSizes.isConnected()) {
            return null;
        }
        new com.visa.cbp.setPhoneNumber().getHighSpeedVideoFpsRangesFor(bArr);
        byte[] transceive = getHighSpeedVideoSizes.transceive(bArr);
        new com.visa.cbp.setPhoneNumber().getHighSpeedVideoFpsRangesFor(transceive);
        return transceive;
    }

    public void getHighSpeedVideoFpsRangesFor(android.nfc.Tag tag) {
        this.getOutputMinFrameDuration = tag;
    }

    public void getHighSpeedVideoFpsRangesFor() {
        try {
            android.nfc.tech.IsoDep isoDep = getHighSpeedVideoSizes;
            if (isoDep != null) {
                isoDep.close();
                getHighSpeedVideoSizes = null;
            }
        } catch (java.io.IOException unused) {
        }
    }
}
