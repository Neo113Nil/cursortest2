package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes3.dex */
public class AuthenticationState {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private com.gemalto.mfs.mwsdk.payment.CHVerificationMethod getHighSpeedVideoSizes;

    public AuthenticationState(com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState authState, com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod, java.lang.String str) {
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f595);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        this.Camera2StreamConfigurationMap = authState;
        this.getHighSpeedVideoSizes = cHVerificationMethod;
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public com.gemalto.mfs.mwsdk.payment.CHVerificationMethod getCvm() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f595);
        sb.append(util.h.xy.al.ra.f340);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod = this.getHighSpeedVideoSizes;
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return cHVerificationMethod;
        }
        throw new java.lang.ArithmeticException();
    }

    public com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState getState() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f595);
        sb.append(util.h.xy.al.ra.f328);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.provisioning.model.AuthenticationState.AuthState authState = this.Camera2StreamConfigurationMap;
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 39) + ((i & 39) << 1)) % 128;
        return authState;
    }

    public java.lang.String getTokenID() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f595);
        sb.append(util.h.xy.al.ra.f329);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
        return str2;
    }

    /* loaded from: classes8.dex */
    public enum AuthState {
        AUTH_NEEDED(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, util.h.xy.al.ma.f225),
        AUTH_NOT_NEEDED(187, util.h.xy.al.ma.f212);

        private int getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoSizes;

        AuthState(int i, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = str;
        }

        public final int getValue() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.getHighSpeedVideoSizes;
        }
    }
}
