package com.gemalto.mfs.mwsdk.dcm.sdkconfig;

/* loaded from: classes3.dex */
public enum ProfileChannel {
    CONTACTLESS(Byte.MIN_VALUE, util.h.xy.al.ma.f240),
    QR((byte) 32, util.h.xy.al.ma.f222),
    DSRP((byte) 64, util.h.xy.al.ma.f229),
    CONTACTLESS_AND_QR(com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, util.h.xy.al.ma.f205),
    CONTACTLESS_AND_DSRP(com.visa.cbp.getEncExpo.startTransaction, util.h.xy.al.ma.f264),
    CONTACTLESS_AND_DSRP_AND_QR((byte) -32, util.h.xy.al.ma.f227);

    private java.lang.String Camera2StreamConfigurationMap;
    private final byte getHighSpeedVideoFpsRangesFor;

    ProfileChannel(byte b, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = b;
        this.Camera2StreamConfigurationMap = str;
    }

    public final byte[] getCode() {
        util.h.xy.al.rc.m25020("ProfileChannel", "getCode");
        util.h.xy.am.ma.m25027("LPIS", "PC.GC");
        return new byte[]{this.getHighSpeedVideoFpsRangesFor};
    }

    public static com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel get(byte b) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.al.rc.m25020("ProfileChannel", "get");
        util.h.xy.am.ma.m25027("LPIS", "PC.G");
        for (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel : values()) {
            util.h.xy.al.rc.m25020("ProfileChannel", "getCodeByte");
            util.h.xy.am.ma.m25027("LPIS", "PC.GCB");
            if (b == profileChannel.getHighSpeedVideoFpsRangesFor) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(".getPaymentChannels().get() ");
                sb.append(profileChannel.toString());
                util.h.xy.al.rc.m25021("ProfileChannel", sb.toString());
                return profileChannel;
            }
        }
        util.h.xy.al.rc.m25018("ProfileChannel", ".getPaymentChannels() - unknown payment channels! ".concat(java.lang.String.valueOf((int) b)));
        throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException("unknown payment channels!");
    }

    public static boolean isQrSupported(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        util.h.xy.al.rc.m25020("ProfileChannel", "isQrSupported");
        util.h.xy.am.ma.m25027("LPIS", "PC.IQS");
        byte b = profileChannel.getHighSpeedVideoFpsRangesFor;
        byte b2 = QR.getHighSpeedVideoFpsRangesFor;
        return (b & b2) == b2;
    }

    public static boolean isClSupported(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        util.h.xy.al.rc.m25020("ProfileChannel", "isClSupported");
        util.h.xy.am.ma.m25027("LPIS", "PC.CLS");
        byte b = profileChannel.getHighSpeedVideoFpsRangesFor;
        byte b2 = CONTACTLESS.getHighSpeedVideoFpsRangesFor;
        return (b & b2) == b2;
    }

    public static boolean isDsrpSupported(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        util.h.xy.al.rc.m25020("ProfileChannel", "isDsrpSupported");
        util.h.xy.am.ma.m25027("LPIS", "PC.IDS");
        byte b = profileChannel.getHighSpeedVideoFpsRangesFor;
        byte b2 = DSRP.getHighSpeedVideoFpsRangesFor;
        return (b & b2) == b2;
    }

    public static com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel getProfileChannel(byte[] bArr) {
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel = CONTACTLESS;
        if (java.util.Arrays.equals(bArr, profileChannel.getCode())) {
            return profileChannel;
        }
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel2 = QR;
        if (java.util.Arrays.equals(bArr, profileChannel2.getCode())) {
            return profileChannel2;
        }
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel3 = DSRP;
        if (java.util.Arrays.equals(bArr, profileChannel3.getCode())) {
            return profileChannel3;
        }
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel4 = CONTACTLESS_AND_QR;
        if (java.util.Arrays.equals(bArr, profileChannel4.getCode())) {
            return profileChannel4;
        }
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel5 = CONTACTLESS_AND_DSRP;
        if (java.util.Arrays.equals(bArr, profileChannel5.getCode())) {
            return profileChannel5;
        }
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel6 = CONTACTLESS_AND_DSRP_AND_QR;
        if (java.util.Arrays.equals(bArr, profileChannel6.getCode())) {
            return profileChannel6;
        }
        return null;
    }

    public static com.gemalto.mfs.mwsdk.dcm.PaymentType getPaymentType(com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) {
        if (profileChannel == CONTACTLESS) {
            return com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS;
        }
        if (profileChannel == QR) {
            return com.gemalto.mfs.mwsdk.dcm.PaymentType.QR;
        }
        if (profileChannel == DSRP) {
            return com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP;
        }
        return null;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
