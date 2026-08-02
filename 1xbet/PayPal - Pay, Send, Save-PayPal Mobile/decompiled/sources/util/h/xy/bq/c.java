package util.h.xy.bq;

/* loaded from: classes5.dex */
public final class c implements com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo, util.h.xy.bq.e {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static final byte[][] getHighSpeedVideoSizes = {f1009, f1006, f1008, f1018, f1021, f1014, f1012, f1001};
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final byte[] getInputSizeshNQ4ISI;
    private final byte[] getOutputFormats;
    private final byte[] getOutputMinFrameDuration;
    private final byte[] getOutputSizes;

    static {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i ^ 43) + ((i & 43) << 1)) % 128;
    }

    public c(byte[] bArr) {
        java.util.Map<java.nio.ByteBuffer, util.h.xy.ar.mb> m25056 = util.h.xy.ar.a.m25056(bArr, getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRangesFor = m25056.get(java.nio.ByteBuffer.wrap(f1006)).m25110();
        this.getOutputMinFrameDuration = m25056.get(java.nio.ByteBuffer.wrap(f1008)).m25110();
        this.getHighSpeedVideoSizesFor = m25056.get(java.nio.ByteBuffer.wrap(f1018)).m25110();
        this.getOutputFormats = m25056.get(java.nio.ByteBuffer.wrap(f1021)).m25110();
        this.getInputFormats = m25056.get(java.nio.ByteBuffer.wrap(f1014)).m25110();
        this.getOutputSizes = m25056.get(java.nio.ByteBuffer.wrap(f1012)).m25110();
        this.getInputSizeshNQ4ISI = m25056.get(java.nio.ByteBuffer.wrap(f1009)).m25110();
        this.getHighResolutionOutputSizeshNQ4ISI = m25056.get(java.nio.ByteBuffer.wrap(f1001)).m25110();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions getConditionsofUse() {
        int i = Camera2StreamConfigurationMap + 53;
        int i2 = i % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (i % 2 == 0 ? this.getInputFormats[0] != 1 : this.getInputFormats[1] != 1) {
            com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions transactionConditions = com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions.INTERNATIONAL;
            int i3 = getHighSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap = ((i3 ^ 17) + ((i3 & 17) << 1)) % 128;
            return transactionConditions;
        }
        int i4 = (i2 ^ 9) + ((i2 & 9) << 1);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions transactionConditions2 = com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions.DOMESTIC;
            int i5 = getHighSpeedVideoFpsRanges + 99;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                return transactionConditions2;
            }
            throw null;
        }
        com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions transactionConditions3 = com.gemalto.mfs.mwsdk.payment.engine.TransactionConditions.DOMESTIC;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose getPurpose() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i & 67) + (i | 67)) % 128;
        if ((this.getOutputFormats[0] & com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose.AUTHORIZE.getValue()) == -128) {
            int i2 = Camera2StreamConfigurationMap + 119;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                return com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose.AUTHORIZE;
            }
            com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose transactionPurpose = com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose.AUTHORIZE;
            throw new java.lang.ArithmeticException();
        }
        byte b = this.getOutputFormats[0];
        int value = com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose.AUTHENTICATE.getValue();
        if (((b ^ value) | (b & value)) != 63) {
            return com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose.UNKNOWN;
        }
        int i3 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i3 & 103) + (i3 | 103)) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose transactionPurpose2 = com.gemalto.mfs.mwsdk.payment.engine.TransactionPurpose.AUTHENTICATE;
        int i4 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = ((i4 ^ 31) + ((i4 & 31) << 1)) % 128;
        return transactionPurpose2;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi getExpectedUserActionOnPOI() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 81) << 1) - (i ^ 81);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0 ? this.getHighSpeedVideoSizesFor[0] == com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.NONE.getValue() : this.getHighSpeedVideoSizesFor[1] == com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.NONE.getValue()) {
            com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi userActionOnPoi = com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.NONE;
            int i3 = getHighSpeedVideoFpsRanges;
            int i4 = ((i3 | 25) << 1) - (i3 ^ 25);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                return userActionOnPoi;
            }
            throw null;
        }
        if (this.getHighSpeedVideoSizesFor[0] == com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.ONLINE_PIN.getValue()) {
            com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi userActionOnPoi2 = com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.ONLINE_PIN;
            int i5 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = ((i5 & 25) + (i5 | 25)) % 128;
            return userActionOnPoi2;
        }
        if (this.getHighSpeedVideoSizesFor[0] == com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.SIGNATURE.getValue()) {
            com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi userActionOnPoi3 = com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.SIGNATURE;
            int i6 = Camera2StreamConfigurationMap;
            int i7 = (i6 ^ 53) + ((i6 & 53) << 1);
            getHighSpeedVideoFpsRanges = i7 % 128;
            if (i7 % 2 == 0) {
                return userActionOnPoi3;
            }
            throw null;
        }
        if (this.getHighSpeedVideoSizesFor[0] == com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.ONLINE_PIN_OR_SIGNATURE.getValue()) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 97) % 128;
            return com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.ONLINE_PIN_OR_SIGNATURE;
        }
        com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi userActionOnPoi4 = com.gemalto.mfs.mwsdk.payment.engine.UserActionOnPoi.UNKNOWN;
        int i8 = getHighSpeedVideoFpsRanges;
        int i9 = (i8 ^ 7) + ((i8 & 7) << 1);
        Camera2StreamConfigurationMap = i9 % 128;
        if (i9 % 2 != 0) {
            return userActionOnPoi4;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionRange getTransactionRange() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 103;
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 != 0 ? this.getOutputMinFrameDuration[0] != 1 : this.getOutputMinFrameDuration[1] != 1) {
            if (this.getOutputMinFrameDuration[0] != 2) {
                com.gemalto.mfs.mwsdk.payment.engine.TransactionRange transactionRange = com.gemalto.mfs.mwsdk.payment.engine.TransactionRange.UNKNOWN;
                int i4 = getHighSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap = ((i4 & 121) + (i4 | 121)) % 128;
                return transactionRange;
            }
            int i5 = ((i3 | 95) << 1) - (i3 ^ 95);
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 == 0) {
                return com.gemalto.mfs.mwsdk.payment.engine.TransactionRange.HIGH_VALUE;
            }
            com.gemalto.mfs.mwsdk.payment.engine.TransactionRange transactionRange2 = com.gemalto.mfs.mwsdk.payment.engine.TransactionRange.HIGH_VALUE;
            throw null;
        }
        int i6 = ((i | 107) << 1) - (i ^ 107);
        Camera2StreamConfigurationMap = i6 % 128;
        if (i6 % 2 == 0) {
            com.gemalto.mfs.mwsdk.payment.engine.TransactionRange transactionRange3 = com.gemalto.mfs.mwsdk.payment.engine.TransactionRange.LOW_VALUE;
            throw null;
        }
        com.gemalto.mfs.mwsdk.payment.engine.TransactionRange transactionRange4 = com.gemalto.mfs.mwsdk.payment.engine.TransactionRange.LOW_VALUE;
        int i7 = getHighSpeedVideoFpsRanges;
        int i8 = ((i7 | 21) << 1) - (i7 ^ 21);
        Camera2StreamConfigurationMap = i8 % 128;
        if (i8 % 2 != 0) {
            return transactionRange4;
        }
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo
    public final double getOtherAmount() {
        int i = Camera2StreamConfigurationMap + 57;
        getHighSpeedVideoFpsRanges = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (i % 2 == 0) {
            return getHighSpeedVideoFpsRanges(bArr);
        }
        getHighSpeedVideoFpsRanges(bArr);
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo
    public final boolean isAlternateAID() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 17) + ((i & 17) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0 ? this.getHighResolutionOutputSizeshNQ4ISI[0] != 0 : this.getHighResolutionOutputSizeshNQ4ISI[1] != 0) {
            return true;
        }
        Camera2StreamConfigurationMap = ((i ^ 11) + ((i & 11) << 1)) % 128;
        return false;
    }

    @Override // com.gemalto.mfs.mwsdk.payment.engine.MasterCardTransactionInfo
    public final boolean hasTerminalRequestedCdCvm() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 93;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0 ? this.getOutputSizes[0] != 0 : this.getOutputSizes[1] != 0) {
            Camera2StreamConfigurationMap = ((i3 ^ 83) + ((i3 & 83) << 1)) % 128;
            return true;
        }
        getHighSpeedVideoFpsRanges = ((i ^ 71) + ((i & 71) << 1)) % 128;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private double getHighSpeedVideoFpsRanges(byte[] bArr) {
        int i;
        int i2;
        double d;
        double d2;
        double d3;
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f557);
        sb.append(util.h.xy.al.ra.f539);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int length = bArr.length;
        if (util.h.xy.bq.md.f1027.containsKey(util.h.xy.ar.b.m25074(this.getInputSizeshNQ4ISI))) {
            int i3 = getHighSpeedVideoFpsRanges + 41;
            Camera2StreamConfigurationMap = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    i = java.util.Currency.getInstance(util.h.xy.bq.md.f1027.get(util.h.xy.ar.b.m25074(this.getInputSizeshNQ4ISI))).getDefaultFractionDigits();
                    try {
                        throw null;
                    } catch (java.lang.IllegalArgumentException unused) {
                        if (util.h.xy.bq.md.f1027.get(util.h.xy.ar.b.m25074(this.getInputSizeshNQ4ISI)) == util.h.xy.al.ra.f760) {
                            i = 4;
                        }
                        if (i != 0) {
                        }
                        int i4 = getHighSpeedVideoFpsRanges;
                        Camera2StreamConfigurationMap = (((i4 | 69) << 1) - (i4 ^ 69)) % 128;
                        double d4 = 0.0d;
                        i2 = 0;
                        while (i2 < length) {
                        }
                        if (i != 2) {
                        }
                        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance(java.util.Locale.US);
                        numberFormat.setMaximumFractionDigits(i);
                        numberFormat.setMinimumFractionDigits(i);
                        numberFormat.setGroupingUsed(false);
                        return java.lang.Double.parseDouble(numberFormat.format(d4));
                    }
                }
                i = java.util.Currency.getInstance(util.h.xy.bq.md.f1027.get(util.h.xy.ar.b.m25074(this.getInputSizeshNQ4ISI))).getDefaultFractionDigits();
            } catch (java.lang.IllegalArgumentException unused2) {
                i = 2;
            }
        } else {
            i = 2;
        }
        if (i != 0) {
            int i5 = Camera2StreamConfigurationMap + 75;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        } else if (i == 2) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 13) % 128;
            length = (-2) - (~length);
        } else {
            length -= 2;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 45) % 128;
        }
        int i42 = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (((i42 | 69) << 1) - (i42 ^ 69)) % 128;
        double d42 = 0.0d;
        i2 = 0;
        while (i2 < length) {
            int i6 = getHighSpeedVideoFpsRanges;
            int i7 = (i6 & 89) + (i6 | 89);
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = bArr[i2] & 13308;
                d42 = (d42 % 100.0d) + (((((i8 | 3) << 1) - (3 ^ i8)) % 71) >>> (r13 & 35));
                int i9 = (i2 ^ (-106)) + ((i2 & (-106)) << 1);
                i2 = (i9 ^ 109) + ((i9 & 109) << 1);
            } else {
                byte b = bArr[i2];
                int i10 = ((b & com.visa.cbp.getEncExpo.onUnminimized) >> 4) * 10;
                int i11 = -(-(b & com.google.common.base.Ascii.SI));
                d42 = (d42 * 100.0d) + (i10 ^ i11) + ((i11 & i10) << 1);
                i2++;
            }
        }
        if (i != 2) {
            byte b2 = bArr[length];
            int i12 = (b2 & com.visa.cbp.getEncExpo.onUnminimized) >> 4;
            int i13 = i12 * 10;
            int i14 = b2 & com.google.common.base.Ascii.SI;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i15 = i14 * (-129);
            int i16 = i12 * 1310;
            int i17 = (i15 & i16) + (i16 | i15);
            int i18 = ~i13;
            int i19 = (~identityHashCode) | i18;
            int i20 = -(-((~((i19 ^ i14) | (i19 & i14))) * 130));
            int i21 = (i18 ^ i14) | (i18 & i14);
            int i22 = ((((i17 | i20) << 1) - (i20 ^ i17)) - (~(-(-((~i21) * (-260)))))) - 1;
            int i23 = ~i14;
            int i24 = ~((i23 ^ i13) | (i23 & i13));
            int i25 = ~((i21 ^ identityHashCode) | (i21 & identityHashCode));
            int i26 = ((i24 ^ i25) | (i24 & i25)) * 130;
            d42 += (((i22 | i26) << 1) - (i26 ^ i22)) / 100.0d;
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 37) % 128;
        } else {
            if (i == 3) {
                int i27 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i27 & 81) + (i27 | 81)) % 128;
                byte b3 = bArr[length];
                d = (d42 * 10.0d) + ((b3 & com.visa.cbp.getEncExpo.onUnminimized) >> 4) + ((b3 & com.google.common.base.Ascii.SI) / 10.0d);
                byte b4 = bArr[((length | 1) << 1) - (length ^ 1)];
                int i28 = (b4 & com.visa.cbp.getEncExpo.onUnminimized) >> 4;
                int i29 = i28 * 10;
                int i30 = b4 & com.google.common.base.Ascii.SI;
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i31 = ((i30 * (-381)) - (~(-(-(i28 * 1920))))) - 1;
                int i32 = ~i30;
                int i33 = i32 * (-191);
                int i34 = ~((i29 ^ identityHashCode2) | (i29 & identityHashCode2));
                int i35 = -(-(((i30 ^ i34) | (i30 & i34)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE));
                int i36 = ~identityHashCode2;
                d2 = ((((i31 & i33) + (i31 | i33)) - (~i35)) - 1) + (((~((i32 ^ i29) | (i32 & i29))) | (~((i36 & i29) | (i29 ^ i36)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
                d3 = 1000.0d;
            } else if (i == 4) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 43) % 128;
                byte b5 = bArr[length];
                int i37 = (b5 & com.visa.cbp.getEncExpo.onUnminimized) >> 4;
                int i38 = i37 * 10;
                int i39 = b5 & com.google.common.base.Ascii.SI;
                int identityHashCode3 = java.lang.System.identityHashCode(this);
                int i40 = ((i39 * 319) - (~(i37 * (-3170)))) - 1;
                int i41 = ~i38;
                int i43 = ~i39;
                int i44 = ~((i43 ^ identityHashCode3) | (i43 & identityHashCode3));
                int i45 = -(-(((i41 ^ i44) | (i44 & i41)) * (-318)));
                int i46 = ((i40 | i45) << 1) - (i40 ^ i45);
                int i47 = ~((i41 ^ identityHashCode3) | (i41 & identityHashCode3));
                int i48 = ~identityHashCode3;
                int i49 = i48 | i39;
                int i50 = ~((i49 ^ i38) | (i49 & i38));
                int i51 = ((i50 & i47) | (i50 ^ i47)) * 318;
                int i52 = (i46 ^ i51) + ((i51 & i46) << 1);
                int i53 = (i48 & i41) | (i41 ^ i48);
                int i54 = ~((i53 ^ i39) | (i53 & i39));
                int i55 = (i39 ^ i38) | (i39 & i38);
                int i56 = ~((i55 ^ identityHashCode3) | (i55 & identityHashCode3));
                int i57 = -(-(((i56 ^ i54) | (i56 & i54)) * 318));
                d = d42 + (((i52 ^ i57) + ((i57 & i52) << 1)) / 100.0d);
                byte b6 = bArr[((length | 1) << 1) - (length ^ 1)];
                d2 = ((((b6 & com.visa.cbp.getEncExpo.onUnminimized) >> 4) * 10) - (~(b6 & com.google.common.base.Ascii.SI))) - 1;
                d3 = 10000.0d;
            }
            d42 = d + (d2 / d3);
        }
        java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getInstance(java.util.Locale.US);
        numberFormat2.setMaximumFractionDigits(i);
        numberFormat2.setMinimumFractionDigits(i);
        numberFormat2.setGroupingUsed(false);
        return java.lang.Double.parseDouble(numberFormat2.format(d42));
    }
}
