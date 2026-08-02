package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getShortDescription {
    private static final com.visa.cbp.setShortDescription Camera2StreamConfigurationMap = new com.visa.cbp.getTermsAndConditionsID();

    public static byte[] ReplenishAckRequest(byte[] bArr) {
        return getHighSpeedVideoFpsRanges(bArr, bArr.length);
    }

    private static byte[] getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(((i + 2) / 3) << 2);
        try {
            Camera2StreamConfigurationMap.ConfirmReplenishRequest(bArr, 0, i, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding base64 string: ");
            sb.append(e.getMessage());
            throw new com.visa.cbp.setContactName(sb.toString(), e);
        }
    }
}
