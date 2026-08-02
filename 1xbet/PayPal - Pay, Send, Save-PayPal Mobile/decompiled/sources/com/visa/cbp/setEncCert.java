package com.visa.cbp;

/* loaded from: classes5.dex */
public class setEncCert implements com.visa.cbp.setEncExpo {
    private static final java.lang.String Camera2StreamConfigurationMap = "setEncCert";
    public static byte ReplenishAckRequest;
    public static byte values;
    private com.visa.cbp.getEncCert getHighSpeedVideoFpsRanges;
    private com.visa.cbp.sdk.facade.data.TokenKey getHighSpeedVideoFpsRangesFor;

    public setEncCert(com.visa.cbp.setSignExpo setsignexpo) {
        this.getHighSpeedVideoFpsRanges = com.visa.cbp.getEncCert.Camera2StreamConfigurationMap(setsignexpo);
    }

    @Override // com.visa.cbp.setEncExpo
    public byte[] ConfirmReplenishRequest(android.content.Context context, byte[] bArr, android.os.Bundle bundle, boolean z, com.visa.cbp.sdk.facade.data.CvmMode cvmMode, boolean z2) throws java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException {
        byte[] bArr2 = new byte[2];
        byte[] bArr3 = new byte[256];
        short Camera2StreamConfigurationMap2 = com.visa.cbp.getEncryptedDPM.Camera2StreamConfigurationMap(bArr, (short) 0);
        short Camera2StreamConfigurationMap3 = com.visa.cbp.getEncryptedDPM.Camera2StreamConfigurationMap(bArr, (short) 2);
        if (Camera2StreamConfigurationMap2 == -32600) {
            values = (byte) 0;
            if (ReplenishAckRequest == 2) {
                ReplenishAckRequest = (byte) 3;
                int Camera2StreamConfigurationMap4 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(context, bArr, bArr3, z, cvmMode, z2);
                if (Camera2StreamConfigurationMap4 < 0) {
                    byte[] bArr4 = new byte[2];
                    if (Camera2StreamConfigurationMap4 == -3) {
                        com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.isOutputSupportedFor, (short) 0, bArr4, (short) 0, (short) com.visa.cbp.getEncExpo.isOutputSupportedFor.length);
                        return bArr4;
                    }
                    if (Camera2StreamConfigurationMap4 == -17 || Camera2StreamConfigurationMap4 == -4) {
                        com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.aid, (short) 0, bArr4, (short) 0, (short) com.visa.cbp.getEncExpo.aid.length);
                        return bArr4;
                    }
                    com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.IAuthTabCallbackStub, (short) 0, bArr4, (short) 0, (short) com.visa.cbp.getEncExpo.IAuthTabCallbackStub.length);
                    return bArr4;
                }
                byte[] bArr5 = new byte[Camera2StreamConfigurationMap4];
                com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(bArr3, (short) 0, bArr5, (short) 0, (short) Camera2StreamConfigurationMap4);
                values = (byte) 9;
                return bArr5;
            }
            byte[] bArr6 = new byte[2];
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.isOutputSupportedFor, (short) 0, bArr6, (short) 0, (short) com.visa.cbp.getEncExpo.isOutputSupportedFor.length);
            return bArr6;
        }
        if (Camera2StreamConfigurationMap2 == -32566) {
            ReplenishAckRequest = (byte) 6;
            int Camera2StreamConfigurationMap5 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3, bArr3);
            if (Camera2StreamConfigurationMap5 < 0) {
                byte[] bArr7 = new byte[2];
                com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.IAuthTabCallbackDefault, (short) 0, bArr7, (short) 0, (short) com.visa.cbp.getEncExpo.IAuthTabCallbackDefault.length);
                return bArr7;
            }
            byte[] bArr8 = new byte[Camera2StreamConfigurationMap5 + 2];
            short s = (short) Camera2StreamConfigurationMap5;
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(bArr3, (short) 0, bArr8, (short) 0, s);
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.getOnBackPressedInput, (short) 0, bArr8, s, (short) com.visa.cbp.getEncExpo.getOnBackPressedInput.length);
            return bArr8;
        }
        if (Camera2StreamConfigurationMap2 == -32542) {
            ReplenishAckRequest = (byte) 5;
            byte[] bArr9 = new byte[2];
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.isOutputSupportedFor, (short) 0, bArr9, (short) 0, (short) com.visa.cbp.getEncExpo.isOutputSupportedFor.length);
            return bArr9;
        }
        if (Camera2StreamConfigurationMap2 == -32529) {
            if (ReplenishAckRequest == 2) {
                ReplenishAckRequest = (byte) 7;
                int highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(bArr, (short) 0, (short) bArr.length);
                if (highSpeedVideoFpsRangesFor < 0) {
                    byte[] bArr10 = new byte[2];
                    com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.ActivityViewModelLazyKtviewModels2, (short) 0, bArr10, (short) 0, (short) com.visa.cbp.getEncExpo.ActivityViewModelLazyKtviewModels2.length);
                    return bArr10;
                }
                byte[] bArr11 = new byte[2];
                com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.getOnBackPressedInput, (short) 0, bArr11, (short) highSpeedVideoFpsRangesFor, (short) com.visa.cbp.getEncExpo.getOnBackPressedInput.length);
                return bArr11;
            }
            byte[] bArr12 = new byte[2];
            ReplenishAckRequest = (byte) 7;
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.isOutputSupportedFor, (short) 0, bArr12, (short) 0, (short) com.visa.cbp.getEncExpo.isOutputSupportedFor.length);
            return bArr12;
        }
        if (Camera2StreamConfigurationMap2 != 164) {
            if (Camera2StreamConfigurationMap2 == 178) {
                byte b = ReplenishAckRequest;
                if (b == 3 || b == 4) {
                    ReplenishAckRequest = (byte) 4;
                    int highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(context, bArr, bArr3);
                    if (highResolutionOutputSizeshNQ4ISI >= 0) {
                        byte[] bArr13 = new byte[highResolutionOutputSizeshNQ4ISI];
                        com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(bArr3, (short) 0, bArr13, (short) 0, (short) highResolutionOutputSizeshNQ4ISI);
                        values = (byte) 9;
                        return bArr13;
                    }
                    if (highResolutionOutputSizeshNQ4ISI == -7) {
                        com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.IAuthTabCallbackStub, (short) 0, bArr2, (short) 0, (short) com.visa.cbp.getEncExpo.IAuthTabCallbackStub.length);
                        return bArr2;
                    }
                    com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.ActivityViewModelLazyKt, (short) 0, bArr2, (short) 0, (short) com.visa.cbp.getEncExpo.ActivityViewModelLazyKt.length);
                    return bArr2;
                }
                byte[] bArr14 = new byte[2];
                com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.isOutputSupportedFor, (short) 0, bArr14, (short) 0, (short) com.visa.cbp.getEncExpo.isOutputSupportedFor.length);
                return bArr14;
            }
            byte[] bArr15 = new byte[2];
            ReplenishAckRequest = (byte) 0;
            values = (byte) 0;
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.ActivityViewModelLazyKtviewModels2, (short) 0, bArr15, (short) 0, (short) com.visa.cbp.getEncExpo.ActivityViewModelLazyKtviewModels2.length);
            return bArr15;
        }
        if (java.util.Arrays.equals(com.visa.cbp.getEncExpo.isOutputSupportedForhNQ4ISI, bArr) || java.util.Arrays.equals(com.visa.cbp.getEncExpo.AMEXKernelProvider, bArr)) {
            ReplenishAckRequest = (byte) 1;
            values = (byte) 0;
            int highSpeedVideoFpsRangesFor2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(bArr, bArr3);
            if (highSpeedVideoFpsRangesFor2 < 0) {
                byte[] bArr16 = new byte[2];
                com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.isOutputSupportedFor, (short) 0, bArr16, (short) 0, (short) com.visa.cbp.getEncExpo.isOutputSupportedFor.length);
                return bArr16;
            }
            byte[] bArr17 = new byte[highSpeedVideoFpsRangesFor2];
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(bArr3, (short) 0, bArr17, (short) 0, (short) highSpeedVideoFpsRangesFor2);
            return bArr17;
        }
        ReplenishAckRequest = (byte) 2;
        int highResolutionOutputSizeshNQ4ISI2 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(bArr, bArr3);
        if (highResolutionOutputSizeshNQ4ISI2 < 0) {
            byte[] bArr18 = new byte[2];
            if (highResolutionOutputSizeshNQ4ISI2 == -16) {
                com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.ActivityViewModelLazyKt, (short) 0, bArr18, (short) 0, (short) com.visa.cbp.getEncExpo.ActivityViewModelLazyKt.length);
                return bArr18;
            }
            if (highResolutionOutputSizeshNQ4ISI2 == -3) {
                com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.isOutputSupportedFor, (short) 0, bArr18, (short) 0, (short) com.visa.cbp.getEncExpo.isOutputSupportedFor.length);
                return bArr18;
            }
            com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(com.visa.cbp.getEncExpo.IAuthTabCallbackStub, (short) 0, bArr18, (short) 0, (short) com.visa.cbp.getEncExpo.IAuthTabCallbackStub.length);
            return bArr18;
        }
        byte[] bArr19 = new byte[highResolutionOutputSizeshNQ4ISI2];
        com.visa.cbp.getEncryptedDPM.getHighResolutionOutputSizeshNQ4ISI(bArr3, (short) 0, bArr19, (short) 0, (short) highResolutionOutputSizeshNQ4ISI2);
        return bArr19;
    }

    @Override // com.visa.cbp.setEncExpo
    public void valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(tokenKey);
    }

    @Override // com.visa.cbp.setEncExpo
    public com.visa.cbp.sdk.facade.data.TokenKey ConfirmReplenishRequest() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
    }

    @Override // com.visa.cbp.setEncExpo
    public void BuildConfig(com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority) {
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(cVMPriority);
    }

    @Override // com.visa.cbp.setEncExpo
    public void BuildConfig(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.getHighSpeedVideoFpsRangesFor = tokenKey;
    }

    @Override // com.visa.cbp.setEncExpo
    public boolean valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(context, tokenKey);
    }

    @Override // com.visa.cbp.setEncExpo
    public boolean valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.external.common.PaywaveData paywaveData, int i, boolean z) {
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(tokenKey, paywaveData, i, z);
    }

    @Override // com.visa.cbp.setEncExpo
    public int valueOf(android.content.Context context) {
        return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(context);
    }

    @Override // com.visa.cbp.setEncExpo
    public void ConfirmReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, boolean z) {
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(context, tokenKey, str, z);
    }
}
