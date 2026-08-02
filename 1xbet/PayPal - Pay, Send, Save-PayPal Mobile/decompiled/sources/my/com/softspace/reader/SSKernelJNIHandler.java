package my.com.softspace.reader;

/* loaded from: classes17.dex */
public class SSKernelJNIHandler {
    private static final java.util.concurrent.atomic.AtomicReference<my.com.softspace.reader.SSKernelHandler> getHighSpeedVideoFpsRanges;
    private static final my.com.softspace.reader.SSKernelHandler getHighSpeedVideoFpsRangesFor;

    static {
        my.com.softspace.reader.SSKernelHandler sSKernelHandler = new my.com.softspace.reader.SSKernelHandler() { // from class: my.com.softspace.reader.SSKernelJNIHandler.1
            @Override // my.com.softspace.reader.SSKernelHandler
            public void onComplete(byte[] bArr, int i, int i2) {
            }

            @Override // my.com.softspace.reader.SSKernelHandler
            public int updateUI(int i) {
                return 0;
            }

            @Override // my.com.softspace.reader.SSKernelHandler
            public byte[] exchangeAPDU(byte[] bArr) throws java.lang.Exception {
                return my.com.softspace.reader.internal.encoding.SimpleTlvEncoding.encode(1, null);
            }

            @Override // my.com.softspace.reader.SSKernelHandler
            public byte[] sendOnlineAuthentication(byte[] bArr, byte[] bArr2) throws java.lang.Exception {
                return new byte[0];
            }

            @Override // my.com.softspace.reader.SSKernelHandler
            public java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
                return new java.lang.Object[]{0};
            }

            @Override // my.com.softspace.reader.SSKernelHandler
            public java.lang.Object[] hmacSHA256(byte[] bArr) {
                return new java.lang.Object[]{0};
            }

            @Override // my.com.softspace.reader.SSKernelHandler
            public java.lang.Object[] cmac(byte[] bArr) {
                return new java.lang.Object[]{0};
            }
        };
        getHighSpeedVideoFpsRangesFor = sSKernelHandler;
        getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(sSKernelHandler);
    }

    public static void subscribeHandler(my.com.softspace.reader.SSKernelHandler sSKernelHandler) {
        java.util.Objects.requireNonNull(sSKernelHandler);
        getHighSpeedVideoFpsRanges.set(sSKernelHandler);
    }

    public static void unsubcribeHandler() {
        getHighSpeedVideoFpsRanges.set(getHighSpeedVideoFpsRangesFor);
    }

    public static int updateUI(int i) {
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("SSKernel", "[Callback]: updateUI: ".concat(java.lang.String.valueOf(i)));
        return getHighSpeedVideoFpsRanges.get().updateUI(i);
    }

    public static byte[] exchangeAPDU(byte[] bArr) {
        byte[] bArr2;
        int i;
        try {
            bArr2 = getHighSpeedVideoFpsRanges.get().exchangeAPDU(my.com.softspace.reader.internal.encoding.SimpleTlvEncoding.decode(bArr));
            i = 0;
        } catch (java.lang.Exception e) {
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().e("SSKernel", "exchangeAPDU ", e);
            bArr2 = null;
            i = 1;
        }
        byte[] encode = my.com.softspace.reader.internal.encoding.SimpleTlvEncoding.encode(i, bArr2);
        if (bArr2 != null) {
            java.util.Arrays.fill(bArr2, (byte) 0);
        }
        return encode;
    }

    public static byte[] sendOnlineAuthentication(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i = 1;
        if (my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().isEnabled()) {
            my.com.softspace.reader.ILogger logger = my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[Callback]: sendOnlineAuthentication: ");
            sb.append(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr, true));
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(bArr2, true));
            logger.i("SSKernel", sb.toString());
        }
        try {
            bArr3 = getHighSpeedVideoFpsRanges.get().sendOnlineAuthentication(bArr, bArr2);
            i = 0;
        } catch (java.lang.Exception e) {
            my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().e("SSKernel", "send online ", e);
            bArr3 = null;
        }
        return my.com.softspace.reader.internal.encoding.SimpleTlvEncoding.encode(i, bArr3);
    }

    public static java.lang.Object[] cipherOperation(boolean z, byte[] bArr, boolean z2) {
        return getHighSpeedVideoFpsRanges.get().cipherOperation(z, bArr, z2);
    }

    public static void onComplete(byte[] bArr, int i, int i2) {
        getHighSpeedVideoFpsRanges.get().onComplete(bArr, i, i2);
    }

    public static byte[] generateRandom(int i) {
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("SSKernel", "TEE >>> generate random for length ".concat(java.lang.String.valueOf(i)));
        byte[] bArr = new byte[i];
        my.com.softspace.reader.TEEReaderEngine.getInstance().sharedSecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static int generateRandomInt() {
        int nextInt = my.com.softspace.reader.TEEReaderEngine.getInstance().sharedSecureRandom().nextInt();
        my.com.softspace.reader.TEEReaderEngine.getInstance().getLogger().i("SSKernel", "TEE >>> generate random int : ".concat(java.lang.String.valueOf(nextInt)));
        return nextInt;
    }

    public static byte[] rsaCipher(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            if ((bArr[0] & 128) != 0) {
                byte[] bArr4 = new byte[bArr.length + 1];
                bArr4[0] = 0;
                java.lang.System.arraycopy(bArr, 0, bArr4, 1, bArr.length);
                bArr = bArr4;
            }
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.RSAPublicKeySpec(new java.math.BigInteger(bArr), new java.math.BigInteger(bArr2)));
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/NoPadding");
            cipher.init(i, generatePublic);
            return cipher.doFinal(bArr3);
        } catch (java.security.GeneralSecurityException e) {
            java.lang.System.err.println(e);
            return null;
        }
    }

    public static byte[] sha1(byte[] bArr) {
        try {
            return java.security.MessageDigest.getInstance("SHA-1").digest(bArr);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static java.lang.Object[] hmacSHA256(byte[] bArr) {
        return getHighSpeedVideoFpsRanges.get().hmacSHA256(bArr);
    }

    public static java.lang.Object[] cmac(byte[] bArr) {
        return getHighSpeedVideoFpsRanges.get().cmac(bArr);
    }
}
