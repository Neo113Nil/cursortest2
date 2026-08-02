package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public final class EligibilityData {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData getHighSpeedVideoFpsRanges;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizesFor;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m10180(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i2;
        if ((i * 165) + (i2 * (-163)) + (((~(i4 | i2)) | i) * (-328)) + ((i | i3) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~((~i) | i5)) | (~(i3 | i5)) | (~(i2 | i4 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) != 1) {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData) objArr[0];
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData) objArr[1];
            int i6 = getHighSpeedVideoSizes;
            int i7 = ((i6 ^ 21) + ((i6 & 21) << 1)) % 128;
            Camera2StreamConfigurationMap = i7;
            eligibilityData.getHighSpeedVideoFpsRanges = walletAccountData;
            getHighSpeedVideoSizes = (i7 + 81) % 128;
            return walletAccountData;
        }
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData2 = (com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i8 = Camera2StreamConfigurationMap;
        int i9 = (i8 & 51) + (i8 | 51);
        getHighSpeedVideoSizes = i9 % 128;
        eligibilityData2.getHighResolutionOutputSizeshNQ4ISI = str;
        if (i9 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 57) + (i | 57);
        getHighSpeedVideoSizes = i2 % 128;
        eligibilityData.getHighSpeedVideoFpsRangesFor = inputMethod;
        if (i2 % 2 == 0) {
            return inputMethod;
        }
        throw null;
    }

    static /* synthetic */ java.lang.String Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData, java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        eligibilityData.getHighSpeedVideoSizesFor = str;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        Camera2StreamConfigurationMap = ((i3 & 15) + (i3 | 15)) % 128;
        return str;
    }

    protected EligibilityData() {
    }

    public static class Builder {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData Camera2StreamConfigurationMap;
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoSizes;
        private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod getHighSpeedVideoSizesFor;

        public Builder(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str) {
            util.h.xy.au.d.f863.m25121(inputMethod, str);
            this.getHighSpeedVideoSizesFor = inputMethod;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData.Builder serialNumber(java.lang.String str) {
            int i = getHighSpeedVideoFpsRangesFor + 19;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                util.h.xy.au.d.f863.m25120(str);
                this.getHighSpeedVideoSizes = str;
                return this;
            }
            util.h.xy.au.d.f863.m25120(str);
            this.getHighSpeedVideoSizes = str;
            throw null;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData.Builder walletAccountData(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData) {
            int i = getHighSpeedVideoFpsRanges + 107;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                util.h.xy.au.d.f863.m25122(walletAccountData);
                this.Camera2StreamConfigurationMap = walletAccountData;
                return this;
            }
            util.h.xy.au.d.f863.m25122(walletAccountData);
            this.Camera2StreamConfigurationMap = walletAccountData;
            throw null;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData build() {
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData = new com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData();
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData.Camera2StreamConfigurationMap(eligibilityData, this.getHighSpeedVideoSizesFor);
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData.Camera2StreamConfigurationMap(eligibilityData, this.getHighSpeedVideoSizes);
            int i = getHighSpeedVideoFpsRanges + 111;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                return eligibilityData;
            }
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod getInputMethod() {
        int i = (getHighSpeedVideoSizes + 47) % 128;
        Camera2StreamConfigurationMap = i;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod = this.getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 91) + ((i & 91) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return inputMethod;
        }
        throw null;
    }

    public final java.lang.String getLanguage() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 91) % 128;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData getWalletAccountData() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 113) + (i | 113)) % 128;
        Camera2StreamConfigurationMap = i2;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData = this.getHighSpeedVideoFpsRanges;
        int i3 = i2 + 73;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return walletAccountData;
        }
        throw null;
    }

    public final java.lang.String getSerialNumber() {
        int i = getHighSpeedVideoSizes + 31;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getHighSpeedVideoSizesFor;
        }
        throw null;
    }
}
