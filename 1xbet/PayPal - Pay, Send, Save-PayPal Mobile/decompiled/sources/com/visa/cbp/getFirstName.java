package com.visa.cbp;

/* loaded from: classes16.dex */
class getFirstName {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "getFirstName";

    getFirstName() {
    }

    byte[] getHighSpeedVideoFpsRanges(com.visa.cbp.getPaymentInstrument getpaymentinstrument) {
        int i;
        short s;
        byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(getpaymentinstrument);
        if (Camera2StreamConfigurationMap != null) {
            i = (short) Camera2StreamConfigurationMap.length;
            com.visa.cbp.sdk.facade.util.MiscUtils.byteArrayToHex(Camera2StreamConfigurationMap);
        } else {
            i = 0;
        }
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getpaymentinstrument);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            i = (short) (i + ((short) highResolutionOutputSizeshNQ4ISI.length));
            com.visa.cbp.sdk.facade.util.MiscUtils.byteArrayToHex(highResolutionOutputSizeshNQ4ISI);
        }
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(getpaymentinstrument);
        if (highSpeedVideoSizes != null) {
            i = (short) (i + ((short) highSpeedVideoSizes.length));
            com.visa.cbp.sdk.facade.util.MiscUtils.byteArrayToHex(highSpeedVideoSizes);
        }
        byte[] bArr = new byte[i];
        if (Camera2StreamConfigurationMap != null) {
            java.lang.System.arraycopy(Camera2StreamConfigurationMap, 0, bArr, 0, (short) Camera2StreamConfigurationMap.length);
            s = (short) Camera2StreamConfigurationMap.length;
        } else {
            s = 0;
        }
        if (highResolutionOutputSizeshNQ4ISI != null) {
            java.lang.System.arraycopy(highResolutionOutputSizeshNQ4ISI, 0, bArr, s, (short) highResolutionOutputSizeshNQ4ISI.length);
            s = (short) (s + ((short) highResolutionOutputSizeshNQ4ISI.length));
        }
        if (highSpeedVideoSizes != null) {
            java.lang.System.arraycopy(highSpeedVideoSizes, 0, bArr, s, (short) highSpeedVideoSizes.length);
        }
        new com.google.gson.Gson().toJson(getpaymentinstrument, com.visa.cbp.getPaymentInstrument.class);
        com.visa.cbp.sdk.facade.util.MiscUtils.byteArrayToHex(bArr);
        return bArr;
    }

    byte[] Camera2StreamConfigurationMap(com.visa.cbp.getPaymentInstrument getpaymentinstrument) {
        byte[] bArr = new byte[256];
        bArr[0] = 97;
        bArr[1] = 1;
        bArr[2] = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION;
        bArr[3] = 7;
        java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().ConfirmReplenishRequest()), 0, bArr, 4, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().ConfirmReplenishRequest()).length);
        int length = (short) (((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().ConfirmReplenishRequest()).length) + 4);
        if (getpaymentinstrument.valueOf().ReplenishAckRequest() != null && getpaymentinstrument.valueOf().ReplenishAckRequest().length() > 0) {
            short s = (short) (length + 1);
            bArr[length] = -97;
            short s2 = (short) (s + 1);
            bArr[s] = 110;
            short s3 = (short) (s2 + 1);
            bArr[s2] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().ReplenishAckRequest()).length;
            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().ReplenishAckRequest()), 0, bArr, s3, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().ReplenishAckRequest()).length);
            length = (short) (s3 + ((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().ReplenishAckRequest()).length));
        }
        if (getpaymentinstrument.valueOf().BuildConfig() != null && getpaymentinstrument.valueOf().BuildConfig().length() > 0) {
            short s4 = (short) (length + 1);
            bArr[length] = -97;
            short s5 = (short) (s4 + 1);
            bArr[s4] = 124;
            short s6 = (short) (s5 + 1);
            bArr[s5] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().BuildConfig()).length;
            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().BuildConfig()), 0, bArr, s6, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().BuildConfig()).length);
            length = (short) (s6 + ((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.valueOf().BuildConfig()).length));
        }
        bArr[1] = (byte) (length - 2);
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    byte[] getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getPaymentInstrument getpaymentinstrument) {
        byte[] bArr = new byte[256];
        if (getpaymentinstrument.BuildConfig() == null || getpaymentinstrument.BuildConfig().values() == null) {
            return null;
        }
        bArr[0] = 97;
        bArr[1] = 1;
        bArr[2] = com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION;
        bArr[3] = 7;
        java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.BuildConfig().values()), 0, bArr, 4, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.BuildConfig().values()).length);
        int length = (short) (((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.BuildConfig().values()).length) + 4);
        bArr[1] = (byte) (length - 2);
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    byte[] getHighSpeedVideoSizes(com.visa.cbp.getPaymentInstrument getpaymentinstrument) {
        short s;
        byte[] bArr = new byte[256];
        bArr[0] = 98;
        bArr[1] = 1;
        if (getpaymentinstrument.ReplenishAckRequest().valueOf() != null) {
            bArr[2] = 87;
            bArr[3] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().valueOf()).length;
            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().valueOf()), 0, bArr, 4, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().valueOf()).length);
            s = (short) (((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().valueOf()).length) + 4);
        } else {
            s = 2;
        }
        if (getpaymentinstrument.ReplenishAckRequest().ConfirmReplenishRequest() != null) {
            short s2 = (short) (s + 1);
            bArr[s] = -126;
            short s3 = (short) (s2 + 1);
            bArr[s2] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().ConfirmReplenishRequest()).length;
            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().ConfirmReplenishRequest()), 0, bArr, s3, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().ConfirmReplenishRequest()).length);
            s = (short) (s3 + ((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().ConfirmReplenishRequest()).length));
        }
        if (getpaymentinstrument.ReplenishAckRequest().BuildConfig() != null) {
            short s4 = (short) (s + 1);
            bArr[s] = -97;
            short s5 = (short) (s4 + 1);
            bArr[s4] = 16;
            short s6 = (short) (s5 + 1);
            bArr[s5] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().BuildConfig()).length;
            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().BuildConfig()), 0, bArr, s6, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().BuildConfig()).length);
            s = (short) (s6 + ((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().BuildConfig()).length));
        }
        if (getpaymentinstrument.ReplenishAckRequest().values() != null) {
            bArr[com.visa.cbp.sdk.facade.util.MiscUtils.setShort(bArr, s, (short) -24794)] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().values()).length;
            short s7 = (short) (s + 3);
            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().values()), 0, bArr, s7, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().values()).length);
            s = (short) (s7 + ((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().values()).length));
        }
        short s8 = (short) (s + 1);
        bArr[s] = -97;
        short s9 = (short) (s8 + 1);
        bArr[s8] = org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE;
        short s10 = (short) (s9 + 1);
        bArr[s9] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().ReplenishAckRequest()).length;
        java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().ReplenishAckRequest()), 0, bArr, s10, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().ReplenishAckRequest()).length);
        short s11 = (short) (s10 + 2);
        short s12 = (short) (s11 + 1);
        bArr[s11] = -97;
        short s13 = (short) (s12 + 1);
        bArr[s12] = org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE;
        short s14 = (short) (s13 + 1);
        bArr[s13] = 4;
        java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().getTvls()), 0, bArr, s14, 4);
        int i = (short) (s14 + 4);
        if (getpaymentinstrument.ReplenishAckRequest().setTvls() != null) {
            short s15 = (short) (i + 1);
            bArr[i] = -97;
            short s16 = (short) (s15 + 1);
            bArr[s15] = 36;
            short s17 = (short) (s16 + 1);
            bArr[s16] = (byte) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().setTvls()).length;
            java.lang.System.arraycopy(com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().setTvls()), 0, bArr, s17, (short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().setTvls()).length);
            i = (short) (s17 + ((short) com.visa.cbp.sdk.facade.util.MiscUtils.hexToByteArray(getpaymentinstrument.ReplenishAckRequest().setTvls()).length));
        }
        bArr[1] = (byte) (i - 2);
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }
}
