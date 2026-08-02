package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public final class InstrumentData {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String Camera2StreamConfigurationMap;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType getInputSizeshNQ4ISI;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m10181(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        if ((i * (-183)) + (i2 * 185) + ((i2 | i4) * (-368)) + ((i | i5 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~(i | i6)) | (~(i4 | i5)) | (~(i2 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) == 1) {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData) objArr[0];
            java.lang.String str = (java.lang.String) objArr[1];
            int i7 = getHighResolutionOutputSizeshNQ4ISI + 49;
            getHighSpeedVideoSizes = i7 % 128;
            instrumentData.Camera2StreamConfigurationMap = str;
            if (i7 % 2 == 0) {
                return str;
            }
            throw null;
        }
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData2 = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData) objArr[0];
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt issuerPushReceipt = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt) objArr[1];
        int i8 = getHighSpeedVideoSizes;
        int i9 = (i8 & 21) + (i8 | 21);
        getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
        instrumentData2.getHighSpeedVideoFpsRanges = issuerPushReceipt;
        if (i9 % 2 == 0) {
            throw null;
        }
        int i10 = ((i8 | 99) << 1) - (i8 ^ 99);
        getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
        if (i10 % 2 != 0) {
            return issuerPushReceipt;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ byte[] Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData, byte[] bArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 117) % 128;
        instrumentData.getHighSpeedVideoFpsRangesFor = bArr;
        int i2 = (i & 9) + (i | 9);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType getHighSpeedVideoSizes(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType instrumentDataType) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        getHighSpeedVideoSizes = i;
        instrumentData.getInputSizeshNQ4ISI = instrumentDataType;
        int i2 = i + 73;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return instrumentDataType;
        }
        throw null;
    }

    protected InstrumentData() {
    }

    public static class EncryptedCardDataBuilder {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoSizes = 1;
        private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType Camera2StreamConfigurationMap;
        private java.lang.String getHighSpeedVideoFpsRanges;
        private byte[] getHighSpeedVideoFpsRangesFor;

        public EncryptedCardDataBuilder(byte[] bArr) {
            util.h.xy.au.rc.f878.m25204(bArr);
            this.getHighSpeedVideoFpsRangesFor = bArr;
            this.Camera2StreamConfigurationMap = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType.CARDDATA;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData.EncryptedCardDataBuilder publicKeyIdentifier(java.lang.String str) {
            int i = getHighSpeedVideoSizes + 15;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                util.h.xy.au.rc.f878.m25205(str);
                this.getHighSpeedVideoFpsRanges = str;
                return this;
            }
            util.h.xy.au.rc.f878.m25205(str);
            this.getHighSpeedVideoFpsRanges = str;
            throw null;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData build() {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData();
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData.Camera2StreamConfigurationMap(instrumentData, this.getHighSpeedVideoFpsRangesFor);
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData.getHighSpeedVideoSizes(instrumentData, this.Camera2StreamConfigurationMap);
            int i = getHighSpeedVideoSizes;
            int i2 = (i ^ 43) + ((i & 43) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return instrumentData;
            }
            throw null;
        }
    }

    public static class IssuerPushReceiptBuilder {
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType Camera2StreamConfigurationMap;
        private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt getHighResolutionOutputSizeshNQ4ISI;

        public IssuerPushReceiptBuilder(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            util.h.xy.au.rc.f878.m25203(str, str2, str3);
            this.getHighResolutionOutputSizeshNQ4ISI = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt(str, str2, str3);
            this.Camera2StreamConfigurationMap = com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType.ISSUER_PUSH_RECEIPT;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData.IssuerPushReceiptBuilder version(java.lang.String str) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 107) % 128;
            util.h.xy.au.rc.f878.m25202(str);
            this.getHighResolutionOutputSizeshNQ4ISI.version(str);
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i | 105) << 1) - (i ^ 105)) % 128;
            return this;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData build() {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData();
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData.getHighSpeedVideoSizes(instrumentData, this.Camera2StreamConfigurationMap);
            int i = getHighSpeedVideoFpsRangesFor + 69;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                return instrumentData;
            }
            throw null;
        }
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType getInstrumentDataType() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 63) << 1) - (i ^ 63)) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType instrumentDataType = this.getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 89) << 1) - (i ^ 89)) % 128;
        return instrumentDataType;
    }

    public final byte[] getEncryptedCardData() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int i4 = i3 + 107;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt getIssuerPushReceipt() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 69) + ((i & 69) << 1)) % 128;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt issuerPushReceipt = this.getHighSpeedVideoFpsRanges;
        int i2 = (i & 59) + (i | 59);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return issuerPushReceipt;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String getPublicKeyIdentifier() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 119) + ((i & 119) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }
}
