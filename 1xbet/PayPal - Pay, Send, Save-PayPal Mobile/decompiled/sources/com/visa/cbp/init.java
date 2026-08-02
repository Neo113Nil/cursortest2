package com.visa.cbp;

/* loaded from: classes16.dex */
class init {
    init() {
    }

    static int getHighSpeedVideoSizes(byte[] bArr) {
        int i = 65535;
        for (byte b : bArr) {
            int i2 = (((i >>> 8) | (i << 8)) & 65535) ^ (b & 255);
            int i3 = i2 ^ ((i2 & 255) >> 4);
            int i4 = i3 ^ ((i3 << 12) & 65535);
            i = i4 ^ (((i4 & 255) << 5) & 65535);
        }
        return i & 65535;
    }

    static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 2;
            try {
                java.lang.String substring = str.substring(i, i2);
                if ((java.lang.Integer.parseInt(substring, 16) & 31) == 31) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(substring);
                    int i3 = i + 4;
                    sb.append(str.substring(i2, i3));
                    substring = sb.toString();
                    i2 = i3;
                }
                int i4 = i2 + 2;
                int parseInt = java.lang.Integer.parseInt(str.substring(i2, i4), 10);
                if (parseInt > 127) {
                    int i5 = ((parseInt + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) << 1) + i4;
                    parseInt = java.lang.Integer.parseInt(str.substring(i4, i5), 16);
                    i4 = i5;
                }
                int i6 = parseInt + i4;
                hashMap.put(substring, str.substring(i4, i6));
                i = i6;
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw new com.visa.cbp.mpqr.facade.VisaPaymentMPQRException(com.visa.cbp.mpqr.facade.MpqrErrorType.OUT_OF_BOUNDS);
            } catch (java.lang.NumberFormatException unused2) {
                throw new com.visa.cbp.mpqr.facade.VisaPaymentMPQRException(com.visa.cbp.mpqr.facade.MpqrErrorType.INVALID_MPQR_FORMAT);
            }
        }
        return hashMap;
    }
}
