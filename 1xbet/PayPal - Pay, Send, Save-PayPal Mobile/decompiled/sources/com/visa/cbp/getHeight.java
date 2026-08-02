package com.visa.cbp;

/* loaded from: classes16.dex */
public class getHeight {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static boolean Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static char[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static int getOutputFormats;
    private static boolean getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoSizes(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2 = 1 - (b3 * 3);
        byte[] bArr = $$a;
        int i3 = b2 + 4;
        int i4 = 116 - (b * 5);
        byte[] bArr2 = new byte[i2];
        if (bArr == null) {
            int i5 = i2;
            i = 0;
            i4 += -i5;
            bArr2[i] = (byte) i4;
            i3++;
            i++;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = bArr[i3];
            i4 += -i5;
            bArr2[i] = (byte) i4;
            i3++;
            i++;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i3++;
            i++;
            if (i == i2) {
            }
        }
    }

    public java.security.KeyPair values() throws java.security.NoSuchAlgorithmException {
        getOutputFormats = (getHighSpeedVideoSizesFor + 41) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u0082\u0081", objArr);
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance(((java.lang.String) objArr[0]).intern());
        keyPairGenerator.initialize(256);
        java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        getHighSpeedVideoSizesFor = (getOutputFormats + 19) % 128;
        return generateKeyPair;
    }

    public byte[] BuildConfig(android.content.Context context, byte[] bArr, java.security.PublicKey publicKey, java.security.PrivateKey privateKey) {
        int i = getOutputFormats + 21;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(privateKey, publicKey);
            if (highResolutionOutputSizeshNQ4ISI == null) {
                return null;
            }
            getOutputFormats = (getHighSpeedVideoSizesFor + 27) % 128;
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI, bArr);
            getOutputFormats = (getHighSpeedVideoSizesFor + 121) % 128;
            return highSpeedVideoFpsRanges;
        }
        getHighResolutionOutputSizeshNQ4ISI(privateKey, publicKey);
        throw new java.lang.ArithmeticException();
    }

    byte[] getHighResolutionOutputSizeshNQ4ISI(java.security.PrivateKey privateKey, java.security.PublicKey publicKey) {
        java.lang.String intern;
        int i = getOutputFormats + 35;
        getHighSpeedVideoSizesFor = i % 128;
        try {
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(52 >>> android.text.TextUtils.indexOf((java.lang.CharSequence) "", ')', 1), "\u0084\u0083\u0082\u0081", objArr);
                intern = ((java.lang.String) objArr[0]).intern();
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(126 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "\u0084\u0083\u0082\u0081", objArr2);
                intern = ((java.lang.String) objArr2[0]).intern();
            }
            javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance(intern);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            int i2 = getHighSpeedVideoSizesFor + 67;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                return generateSecret;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    byte[] getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2) {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getSize(0) + 127, "\u0086\u0081\u0085", objArr);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.Color.rgb(0, 0, 0) + 16777343, "\u0086\u0081\u0085", objArr2);
            cipher.init(1, new javax.crypto.spec.SecretKeySpec(bArr, ((java.lang.String) objArr2[0]).intern()));
            byte[] bArr3 = new byte[cipher.getOutputSize(bArr2.length)];
            cipher.doFinal(bArr3, cipher.update(bArr2, 0, bArr2.length, bArr3, 0));
            getOutputFormats = (getHighSpeedVideoSizesFor + 59) % 128;
            return bArr3;
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException | javax.crypto.ShortBufferException unused) {
            return null;
        }
    }

    public java.lang.String valueOf(byte[] bArr, int i, int i2, java.lang.String str) {
        getHighSpeedVideoSizesFor = (getOutputFormats + 7) % 128;
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            getOutputFormats = (getHighSpeedVideoSizesFor + 91) % 128;
            for (int i3 = 0; i3 < i2; i3++) {
                java.lang.String hexString = java.lang.Integer.toHexString(bArr[i3 + i] & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(java.lang.String.valueOf(hexString));
                }
                java.lang.String upperCase = hexString.toUpperCase(java.util.Locale.US);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(upperCase);
                sb.append(str);
                stringBuffer.append(sb.toString());
            }
            return stringBuffer.toString();
        }
        return "";
    }

    private static void getHighSpeedVideoFpsRanges(int i, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        com.visa.cbp.setMac setmac = new com.visa.cbp.setMac();
        char[] cArr2 = getHighSpeedVideoFpsRangesFor;
        if (cArr2 != null) {
            int i2 = getHighSpeedVideoFpsRanges + 121;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i3])};
                    java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1013896520);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.resolveSizeAndState(0, 0, 0) + 30832), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1972, 29 - android.view.View.MeasureSpec.getMode(0))).getMethod("m", java.lang.Integer.TYPE);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1013896520, obj);
                    }
                    cArr[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        try {
            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getHighSpeedVideoSizes)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(892366433);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 958, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 20);
                byte b = (byte) ($$b & 5);
                byte b2 = (byte) (-b);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(b, b2, (byte) (b2 + 1), objArr4);
                obj2 = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(892366433, obj2);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
            if (!getOutputMinFrameDuration) {
                if (!Camera2StreamConfigurationMap) {
                    throw null;
                }
                throw null;
            }
            setmac.BuildConfig = bytes.length;
            char[] cArr3 = new char[setmac.BuildConfig];
            setmac.valueOf = 0;
            while (setmac.valueOf < setmac.BuildConfig) {
                cArr3[setmac.valueOf] = (char) (cArr2[bytes[(setmac.BuildConfig - 1) - setmac.valueOf] + i] - intValue);
                try {
                    java.lang.Object[] objArr5 = {setmac, setmac};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-2053037684);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0) + 257, 25 - android.graphics.Color.blue(0));
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((byte) 0, (byte) -1, (byte) 0, objArr6);
                        obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-2053037684, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new java.lang.String(cArr3);
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    static void Camera2StreamConfigurationMap() {
        $$a = new byte[]{91, 125, 3, -55};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
    }

    static {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoFpsRanges = 1;
        getOutputFormats = 0;
        getHighSpeedVideoSizesFor = 1;
        Camera2StreamConfigurationMap = true;
        getOutputMinFrameDuration = true;
        getHighSpeedVideoSizes = 514420597;
        getHighSpeedVideoFpsRangesFor = new char[]{28456, 28470, 28457, 28461, 28468, 28454};
    }
}
