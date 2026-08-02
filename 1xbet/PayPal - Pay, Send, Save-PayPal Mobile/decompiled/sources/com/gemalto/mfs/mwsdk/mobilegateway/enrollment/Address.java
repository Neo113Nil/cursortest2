package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public class Address {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private java.lang.String getOutputMinFrameDuration;

    public java.lang.String getLine1() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f814);
        sb.append(util.h.xy.al.ra.f324);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        return str2;
    }

    public void setLine1(java.lang.String str) {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = str;
        getHighResolutionOutputSizeshNQ4ISI = (i + 35) % 128;
    }

    public java.lang.String getLine2() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f814);
        sb.append(util.h.xy.al.ra.f341);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
        return str2;
    }

    public void setLine2(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 31) << 1) - (i ^ 31);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoSizes = str;
            int i4 = (i3 & 37) + (i3 | 37);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoSizes = str;
        throw null;
    }

    public java.lang.String getCity() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f814);
        sb.append(util.h.xy.al.ra.f340);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ~((identityHashCode & (-1166665858)) | (identityHashCode ^ (-1166665858)));
        int i3 = ~((identityHashCode ^ (-2005619734)) | (identityHashCode & (-2005619734)));
        int i4 = (i2 ^ i3) | (i2 & i3);
        int i5 = (i & 1166665857) | (i ^ 1166665857);
        int i6 = ~((i5 ^ 2005619733) | (i5 & 2005619733));
        int i7 = ((((((~(((-1166665858) & i) | (i ^ (-1166665858)))) | 1166622721) | (~(((-2005619734) & i) | (i ^ (-2005619734))))) * (-1136)) + 1144236390) - (~(((i4 ^ i6) | (i4 & i6)) * (-568)))) - 1;
        int i8 = ~(i | 1166665857);
        int i9 = ~((i ^ 2005619733) | (i & 2005619733));
        int i10 = (i9 ^ i8) | (i9 & i8);
        int i11 = ~(identityHashCode | (-1166622722));
        int i12 = -(-(((i11 ^ i10) | (i11 & i10)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i13 = ~((identityHashCode2 ^ 539220235) | (identityHashCode2 & 539220235));
        int i14 = -(-(((i13 ^ (-114427306)) | (i13 & (-114427306))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int i15 = ((i14 & 1796097462) + (i14 | 1796097462)) - 1732339176;
        int i16 = ~identityHashCode2;
        int i17 = ~((i16 ^ 539220235) | (i16 & 539220235));
        int i18 = (i17 ^ 539088898) | (i17 & 539088898);
        int i19 = ((i18 ^ (-653516204)) | (i18 & (-653516204))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
        if ((i7 & i12) + (i12 | i7) <= (i15 ^ i19) + ((i19 & i15) << 1)) {
            return str2;
        }
        throw null;
    }

    public void setCity(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 17;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = str;
        } else {
            this.getHighSpeedVideoFpsRanges = str;
            throw null;
        }
    }

    public java.lang.String getState() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f814);
        sb.append(util.h.xy.al.ra.f328);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoSizesFor;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 89) + ((i & 89) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public void setState(java.lang.String str) {
        int i = (getHighSpeedVideoFpsRangesFor + 37) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizesFor = str;
        int i2 = ((i | 115) << 1) - (i ^ 115);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public java.lang.String getCountry() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f814);
        sb.append(util.h.xy.al.ra.f340);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputMinFrameDuration;
        int i = getHighResolutionOutputSizeshNQ4ISI + 5;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    public void setCountry(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            this.getOutputMinFrameDuration = str;
        } else {
            this.getOutputMinFrameDuration = str;
            throw new java.lang.ArithmeticException();
        }
    }

    public java.lang.String getPostalCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f814);
        sb.append(util.h.xy.al.ra.f289);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputFormats;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 31) + ((i & 31) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public void setPostalCode(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 23) + ((i & 23) << 1);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            this.getInputFormats = str;
        } else {
            this.getInputFormats = str;
            throw new java.lang.ArithmeticException();
        }
    }
}
