package com.microblink.blinkid.entities.recognizers.blinkid.idbarcode;

/* loaded from: classes10.dex */
public final class BarcodeElements {
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    public BarcodeElements(long j, java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = obj;
    }

    private static native boolean emptyNativeGet(long j);

    private static native byte[] valueNativeGet(long j, int i);

    public final java.lang.String getValue(com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.BarcodeElementKey barcodeElementKey) {
        return com.microblink.blinkid.util.StringUtils.convertByteArrayToString(valueNativeGet(this.getHighResolutionOutputSizeshNQ4ISI, barcodeElementKey.ordinal()));
    }

    public final boolean isEmpty() {
        return emptyNativeGet(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
