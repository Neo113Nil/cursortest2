package com.visa.cbp;

/* loaded from: classes16.dex */
public class DecoderException {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;

    private static void getHighSpeedVideoSizes(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3 = 114 - (i2 * 2);
        int i4 = i * 2;
        int i5 = b + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i4 + (-i5);
            i5 = i5;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            int i8 = i5 + 1;
            if (i7 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i3 += -bArr[i8];
                i5 = i8;
                i6 = i7;
            }
        }
    }

    public static byte[] values(android.content.Context context, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3, false, 3 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "\u0006\u0007\ufff5", android.view.KeyEvent.keyCodeFromString("") + 203, objArr);
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance(((java.lang.String) objArr[0]).intern()).generatePublic(new java.security.spec.X509EncodedKeySpec(bArr2));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.text.TextUtils.getCapsMode("", 0, 0) + 20, true, android.graphics.Color.argb(0, 0, 0, 0) + 14, "\u0002￣\u0005\ufff5�\u0002￡\ufff4\ufff5\ufff7￡\ufff3\u0005\u0004\u0019 \u001b\u0016\u0016\u0013", 204 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(((java.lang.String) objArr2[0]).intern());
            cipher.init(1, generatePublic);
            bArr3 = cipher.doFinal(bArr);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } catch (java.lang.Exception e) {
            com.visa.cbp.CardMetadataUpdateResponse.ConfirmReplenishRequest(context, e);
            bArr3 = null;
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
        return bArr3;
    }

    public static byte[] ReplenishAckRequest(android.content.Context context, byte[] bArr, java.lang.String str) {
        byte[] bArr2;
        java.security.KeyPair BuildConfig = new com.visa.cbp.setDate().BuildConfig(str);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(19 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), true, 14 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0002￣\u0005\ufff5�\u0002￡\ufff4\ufff5\ufff7￡\ufff3\u0005\u0004\u0019 \u001b\u0016\u0016\u0013", 205 - android.view.View.resolveSize(0, 0), objArr);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(((java.lang.String) objArr[0]).intern());
            cipher.init(2, BuildConfig.getPrivate());
            bArr2 = cipher.doFinal(bArr);
            int i = getHighSpeedVideoFpsRangesFor + 19;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                int i2 = 5 / 4;
            }
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            com.visa.cbp.CardMetadataUpdateResponse.ConfirmReplenishRequest(context, e);
            bArr2 = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 117) % 128;
        return bArr2;
    }

    public static boolean BuildConfig(android.content.Context context, byte[] bArr, java.lang.String str, byte[] bArr2) throws java.security.InvalidKeyException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(26 - android.graphics.Color.blue(0), false, 12 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), "\u0011\u000e\b￥\u0010\n\u001e\ufff2\ufff2\ufff2\ufff2\ufff2\ufff2\ufff2\ufff2\ufff2\ufff2\u0007\n\f\u000e\u0013￥\u0015\u001a\u0007", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 186, objArr);
        java.lang.String replace = str.replace(((java.lang.String) objArr[0]).intern(), "");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(25 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, 20 - android.os.Process.getGidForName(""), "\ufff3\ufff3\u001f\u000b\u0011￦\t\u000f\u0012\b\u001b\u0016￦\n\u0014\u000b\ufff3\ufff3\ufff3\ufff3\ufff3\ufff3\ufff3\ufff3", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 185, objArr2);
        java.lang.String replace2 = replace.replace(((java.lang.String) objArr2[0]).intern(), "");
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, false, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1, "\u0000", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 138, objArr3);
        try {
            java.security.spec.X509EncodedKeySpec x509EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(replace2.replace(((java.lang.String) objArr3[0]).intern(), ""), 0));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(3 - (android.os.Process.myPid() >> 22), false, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, "\u0006\u0007\ufff5", 204 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance(((java.lang.String) objArr4[0]).intern()).generatePublic(x509EncodedKeySpec);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, false, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 4, "\u0018\u0002\u0003\ufff1\u0003\ufff8\ufff1￢￥￦'\u0019$", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 207, objArr5);
            java.security.Signature signature = java.security.Signature.getInstance(((java.lang.String) objArr5[0]).intern());
            signature.initVerify(generatePublic);
            signature.update(bArr);
            boolean verify = signature.verify(bArr2);
            int i = getHighResolutionOutputSizeshNQ4ISI + 27;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                return verify;
            }
            throw null;
        } catch (java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException e) {
            com.visa.cbp.CardMetadataUpdateResponse.ConfirmReplenishRequest(context, e);
            return false;
        }
    }

    public static byte[] values(android.content.Context context, byte[] bArr, java.lang.String str) throws java.security.InvalidKeyException {
        try {
            com.visa.cbp.sdk.facade.IccKey iccKey = (com.visa.cbp.sdk.facade.IccKey) new com.google.gson.Gson().fromJson(str, com.visa.cbp.sdk.facade.IccKey.class);
            java.security.spec.RSAPrivateKeySpec rSAPrivateKeySpec = new java.security.spec.RSAPrivateKeySpec(new java.math.BigInteger(iccKey.getIccCRTPrivateKey().getModulus(), 16), new java.math.BigInteger(iccKey.getIccCRTPrivateKey().getExponent(), 16));
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(4 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, 3 - android.view.View.combineMeasuredStates(0, 0), "\u0006\u0007\ufff5", android.graphics.Color.alpha(0) + 203, objArr);
            java.security.PrivateKey generatePrivate = java.security.KeyFactory.getInstance(((java.lang.String) objArr[0]).intern()).generatePrivate(rSAPrivateKeySpec);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(18 - android.view.View.getDefaultSize(0, 0), true, 6 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\u0016\ufff5ￖ￨\ufffa\ufff9\u000e\u0015\u0010\u000b\u000b\b\ufff7\u0016\ufff5ￖ\f\u0015", android.graphics.Color.alpha(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, objArr2);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(((java.lang.String) objArr2[0]).intern());
            cipher.init(1, generatePrivate);
            byte[] doFinal = cipher.doFinal(bArr);
            int i = getHighSpeedVideoFpsRangesFor + 117;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return doFinal;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            com.visa.cbp.CardMetadataUpdateResponse.ConfirmReplenishRequest(context, e);
            return null;
        }
    }

    public static byte[] ReplenishAckRequest(android.content.Context context, byte[] bArr) throws java.security.InvalidKeyException {
        try {
            java.security.PrivateKey privateKey = new com.visa.cbp.setDate().BuildConfig(com.visa.cbp.setEncryptionScheme.valueOf.BuildConfig()).getPrivate();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(13 - android.view.View.combineMeasuredStates(0, 0), false, android.view.MotionEvent.axisFromString("") + 5, "\u0018\u0002\u0003\ufff1\u0003\ufff8\ufff1￢￥￦'\u0019$", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 207, objArr);
            java.security.Signature signature = java.security.Signature.getInstance(((java.lang.String) objArr[0]).intern());
            signature.initSign(privateKey);
            signature.update(bArr);
            byte[] sign = signature.sign();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
            return sign;
        } catch (java.security.NoSuchAlgorithmException | java.security.SignatureException e) {
            com.visa.cbp.CardMetadataUpdateResponse.ConfirmReplenishRequest(context, e);
            return null;
        }
    }

    public static void ReplenishAckRequest(byte[] bArr, short s, byte[] bArr2, short s2, short s3) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 107;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int i2 = i % 2 == 0 ? 1 : 0;
        while (i2 < s3) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 111;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                bArr2[s2 - i2] = bArr[s * i2];
                i2 += 109;
            } else {
                bArr2[s2 + i2] = bArr[s + i2];
                i2++;
            }
        }
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 39;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r5 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int ConfirmReplenishRequest(byte[] bArr, int i, byte[] bArr2, int i2) {
        short s;
        int length;
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        int i4 = i3 + 107;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            short s2 = (short) i2;
            bArr[s2] = (byte) i;
            bArr[(short) (s2 + 1)] = (byte) bArr2.length;
            bArr[0] = 0;
            if (bArr2 == null) {
                return 0;
            }
            s = 0;
        } else {
            short s3 = (short) i2;
            short s4 = (short) (s3 + 1);
            bArr[s3] = (byte) i;
            short s5 = (short) (s4 + 1);
            bArr[s4] = (byte) bArr2.length;
            s = (short) (s5 + 1);
            bArr[s5] = 0;
        }
        if (bArr2.length > 0) {
            int i5 = i3 + 69;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 == 0) {
                ReplenishAckRequest(bArr2, (short) 0, bArr, s, (short) bArr2.length);
                length = s - bArr2.length;
            } else {
                ReplenishAckRequest(bArr2, (short) 0, bArr, s, (short) bArr2.length);
                length = s + bArr2.length;
            }
            short s6 = (short) length;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 37) % 128;
            return s6;
        }
        return s;
    }

    public static byte[] values(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        short s = 0;
        while (s < bArr.length) {
            bArr3[s] = (byte) (bArr[s] ^ bArr2[s]);
            s = (short) (s + 1);
            int i = getHighSpeedVideoFpsRangesFor + 95;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                int i2 = 5 / 4;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 77) % 128;
        return bArr3;
    }

    public static java.lang.String BuildConfig(byte[] bArr, int i, int i2, java.lang.String str) {
        int i3 = (getHighSpeedVideoFpsRangesFor + 55) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (bArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 7) % 128;
                if (i4 != 0) {
                    int i6 = i5 + 21;
                    getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                    int i7 = i6 % 2;
                }
                java.lang.String hexString = java.lang.Integer.toHexString(bArr[i4 + i] & 255);
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
        getHighSpeedVideoFpsRangesFor = (i3 + 103) % 128;
        return "";
    }

    private static void getHighSpeedVideoFpsRanges(int i, boolean z, int i2, java.lang.String str, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = Camera2StreamConfigurationMap + 37;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        com.visa.cbp.setTvls settvls = new com.visa.cbp.setTvls();
        char[] cArr2 = new char[i];
        settvls.BuildConfig = 0;
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 19) % 128;
        while (settvls.BuildConfig < i) {
            settvls.values = charArray[settvls.BuildConfig];
            cArr2[settvls.BuildConfig] = (char) (i3 + settvls.values);
            int i5 = settvls.BuildConfig;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i5]), java.lang.Integer.valueOf(getHighSpeedVideoFpsRanges)};
                java.lang.Object obj = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1140899376);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 17628), android.view.Gravity.getAbsoluteGravity(0, 0) + 315, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 16);
                    byte b = (byte) ($$b - 4);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(b, b2, (byte) (b2 - 1), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1140899376, obj);
                }
                cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                try {
                    java.lang.Object[] objArr4 = {settvls, settvls};
                    java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1304551840);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30831), 1970 - android.view.MotionEvent.axisFromString(""), 29 - android.view.View.combineMeasuredStates(0, 0))).getMethod("p", java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1304551840, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i2 > 0) {
            settvls.ReplenishAckRequest = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - settvls.ReplenishAckRequest, settvls.ReplenishAckRequest);
            java.lang.System.arraycopy(cArr3, settvls.ReplenishAckRequest, cArr2, 0, i - settvls.ReplenishAckRequest);
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 83) % 128;
        }
        if (z) {
            int i6 = Camera2StreamConfigurationMap + 109;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 == 0) {
                cArr = new char[i];
                settvls.BuildConfig = 1;
            } else {
                cArr = new char[i];
                settvls.BuildConfig = 0;
            }
            while (settvls.BuildConfig < i) {
                cArr[settvls.BuildConfig] = cArr2[(i - settvls.BuildConfig) - 1];
                try {
                    java.lang.Object[] objArr5 = {settvls, settvls};
                    java.lang.Object obj3 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(1304551840);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.View.combineMeasuredStates(0, 0) + 30832), 1971 - android.view.Gravity.getAbsoluteGravity(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 29)).getMethod("p", java.lang.Object.class, java.lang.Object.class);
                        com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(1304551840, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    static void getHighSpeedVideoSizes() {
        $$a = new byte[]{38, 126, -120, -41};
        $$b = 4;
    }

    static {
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap = 0;
        getHighSpeedVideoSizes = 1;
        getHighResolutionOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoFpsRangesFor = 1;
        getHighSpeedVideoFpsRanges = -178298334;
    }
}
