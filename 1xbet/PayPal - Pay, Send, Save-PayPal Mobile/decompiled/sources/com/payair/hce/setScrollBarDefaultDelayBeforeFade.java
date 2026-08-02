package com.payair.hce;

/* loaded from: classes4.dex */
public final class setScrollBarDefaultDelayBeforeFade {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static com.payair.hce.SdkCoreRemotePaymentDataImpl AlternateContactlessPaymentDataJson;
    private static java.util.Map DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static char[] getAid;
    private static java.util.Map getProfileVersion;
    private static int valueOf;
    private static byte[] values;
    private static byte[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3 = 3 - (s * 2);
        int i4 = s2 * 2;
        int i5 = i + 66;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            i5 = i4;
            int i7 = 0;
            i5 += i6;
            i2 = i7;
            i3++;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i5 += i6;
            i2 = i7;
            i3++;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        switch ((i * (-563)) + (i2 * 565) + (((~((~i2) | i5)) | i4 | (~(i2 | i3))) * (-564)) + ((~(i3 | i4 | i2)) * 1128) + (((~(i | i2)) | (~(i4 | i5))) * 564)) {
            case 1:
                return valueOf(objArr);
            case 2:
                return AlternateContactlessPaymentDataJson(objArr);
            case 3:
                return values(objArr);
            case 4:
                com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (com.payair.hce.setScrollBarDefaultDelayBeforeFade) objArr[0];
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[1];
                com.payair.hce.setIsCredential setiscredential = new com.payair.hce.setIsCredential();
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setFocusedByDefault.writeReplace(new java.lang.Object[0], 2007837142, -2007837141, (int) java.lang.System.currentTimeMillis())}, 1349837615, -1349837613, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener2 = (com.payair.hce.setOnCapturedPointerListener) valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2013040726, -2013040725, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade));
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener2}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener2))}, 1863235497, -1863235496, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener2}, 2121132154, -2121132154, java.lang.System.identityHashCode(setoncapturedpointerlistener2))}, -1680271665, 1680271669, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -808754747, 808754756, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                int i6 = RecordsJson;
                IccPrivateKeyCrtComponentsJson = (((i6 & 22) + (i6 | 22)) - 1) % 128;
                return null;
            case 5:
                return writeReplace(objArr);
            case 6:
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader((java.io.InputStream) objArr[0]));
                java.lang.String readLine = bufferedReader.readLine();
                bufferedReader.close();
                int i7 = RecordsJson;
                int i8 = i7 & 55;
                int i9 = (i7 ^ 55) | i8;
                IccPrivateKeyCrtComponentsJson = ((i8 & i9) + (i9 | i8)) % 128;
                return readLine;
            case 7:
                return getAid(objArr);
            default:
                return DigitizedCardProfile(objArr);
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener;
        com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (com.payair.hce.setScrollBarDefaultDelayBeforeFade) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int identityHashCode = java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade);
        int i2 = i * (-501);
        int i3 = (i2 & 502) | ((~i2) & (-503));
        int i4 = -(-((i2 & (-503)) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = ~identityHashCode;
        int i7 = ~i;
        int i8 = ~((i7 ^ i) | (i7 & i));
        int i9 = i6 & i8;
        int i10 = (i8 | i6) & (~i9);
        int i11 = ((i10 ^ i9) | (i10 & i9)) * (-502);
        int i12 = (i5 & i11) + (i5 | i11);
        int i13 = (i6 & i7) | ((~i6) & i);
        int i14 = i6 & i;
        int i15 = -(~(-(-((~((i13 ^ i14) | (i13 & i14))) * (-502)))));
        int i16 = (i12 & i15) + (i15 | i12);
        int i17 = (~i16) + (i16 << 1);
        int i18 = (i | i7) & i7;
        int i19 = (i6 & i18) | ((~i18) & identityHashCode);
        int i20 = i18 & identityHashCode;
        int i21 = (~((i20 ^ i19) | (i20 & i19))) * 502;
        int i22 = i17 ^ i21;
        int i23 = ((i21 & i17) | i22) << 1;
        int i24 = -i22;
        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
        int identityHashCode2 = java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade);
        int i25 = windowTouchSlop * (-317);
        int i26 = i25 | 1914;
        int i27 = ((i26 << 1) - (~(-((~(i25 & 1914)) & i26)))) - 1;
        int i28 = ~windowTouchSlop;
        int i29 = (i28 | windowTouchSlop) & i28;
        int i30 = i29 & (-7);
        int i31 = ((i29 | (-7)) & (~i30)) | i30;
        int i32 = i31 & identityHashCode2;
        int i33 = ~identityHashCode2;
        int i34 = ~(((i31 | identityHashCode2) & (~i32)) | i32);
        int i35 = i33 & windowTouchSlop;
        int i36 = (i33 ^ windowTouchSlop) | i35;
        int i37 = i36 & 6;
        int i38 = (i36 | 6) & (~i37);
        int i39 = ~((i38 ^ i37) | (i38 & i37));
        int i40 = i34 & i39;
        int i41 = (i34 | i39) & (~i40);
        int i42 = ((i41 ^ i40) | (i41 & i40)) * (-318);
        int i43 = i27 ^ i42;
        int i44 = (windowTouchSlop ^ (-7)) | (windowTouchSlop & (-7));
        int i45 = ~i44;
        int i46 = (i44 | i45) & i45;
        int i47 = identityHashCode2 & i28;
        int i48 = i35 | i47;
        int i49 = windowTouchSlop & identityHashCode2;
        int i50 = ~((i49 & i48) | (i49 ^ i48));
        int i51 = ((~i46) & i50) | ((~i50) & i46);
        int i52 = i50 & i46;
        int i53 = (((((i42 & i27) | i43) << 1) - i43) - (~(((i51 ^ i52) | (i52 & i51)) * (-318)))) - 1;
        int i54 = (i28 & i33) | ((~i28) & identityHashCode2);
        int i55 = ~((i54 ^ i47) | (i54 & i47));
        int i56 = ((~i55) & (-7)) | (i55 & 6);
        int i57 = i55 & (-7);
        int i58 = ((i57 ^ i56) | (i57 & i56)) * 318;
        int i59 = i53 & i58;
        int i60 = i58 | i53;
        java.io.OutputStream values2 = setscrollbardefaultdelaybeforefade.values(byteArrayOutputStream, (i23 & i24) + (i23 | i24), ((i59 | i60) << 1) - (i60 ^ i59));
        try {
            setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) valueOf(new java.lang.Object[]{str}, 2076547784, -2076547779, (int) java.lang.System.currentTimeMillis());
            values2.write(((java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener))).getBytes());
            values2.close();
            RecordsJson = (IccPrivateKeyCrtComponentsJson + 81) % 128;
        } catch (java.io.IOException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException unused) {
            setoncapturedpointerlistener = new com.payair.hce.setOnCapturedPointerListener();
        }
        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener, (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{byteArrayOutputStream.toByteArray()}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis())}, 1863235497, -1863235496, java.lang.System.identityHashCode(setoncapturedpointerlistener));
        int i61 = RecordsJson;
        int i62 = i61 & 73;
        IccPrivateKeyCrtComponentsJson = (i62 + ((i61 ^ 73) | i62)) % 128;
        return setoncapturedpointerlistener;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.io.InputStream inputStream;
        com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (com.payair.hce.setScrollBarDefaultDelayBeforeFade) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        java.lang.String str = (java.lang.String) objArr[2];
        java.lang.String str2 = (java.lang.String) objArr[3];
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            if (str != null) {
                int i = IccPrivateKeyCrtComponentsJson;
                int i2 = i & 25;
                int i3 = ((i ^ 25) | i2) << 1;
                int i4 = -((i | 25) & (~i2));
                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                RecordsJson = i5 % 128;
                if (i5 % 2 == 0) {
                    str.equals("key1");
                    throw null;
                }
                if (!str.equals("key1")) {
                    if (!str.equals("key2")) {
                        int i6 = RecordsJson;
                        int i7 = (i6 & (-68)) | ((~i6) & 67);
                        int i8 = (i6 & 67) << 1;
                        IccPrivateKeyCrtComponentsJson = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                        return null;
                    }
                    com.payair.hce.setScrollBarDefaultDelayBeforeFade.writeReplace writereplace = setscrollbardefaultdelaybeforefade.new writeReplace();
                    inputStream = (java.io.InputStream) com.payair.hce.setScrollBarDefaultDelayBeforeFade.writeReplace.writeReplace(new java.lang.Object[]{writereplace, byteArrayInputStream}, 1008239320, -1008239320, java.lang.System.identityHashCode(writereplace));
                    int i9 = IccPrivateKeyCrtComponentsJson;
                    RecordsJson = (((i9 | 85) << 1) - (i9 ^ 85)) % 128;
                    java.lang.String str3 = (java.lang.String) valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, new com.payair.hce.setOnCapturedPointerListener(null, "CRYPTO_KEK", valueOf(inputStream), str2)}, -1139273316, 1139273323, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    int i10 = RecordsJson;
                    IccPrivateKeyCrtComponentsJson = (((i10 & (-32)) | ((~i10) & 31)) + ((i10 & 31) << 1)) % 128;
                    return str3;
                }
            }
            java.lang.String str32 = (java.lang.String) valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, new com.payair.hce.setOnCapturedPointerListener(null, "CRYPTO_KEK", valueOf(inputStream), str2)}, -1139273316, 1139273323, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade));
            int i102 = RecordsJson;
            IccPrivateKeyCrtComponentsJson = (((i102 & (-32)) | ((~i102) & 31)) + ((i102 & 31) << 1)) % 128;
            return str32;
        } catch (java.io.IOException | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.UnrecoverableEntryException | java.security.cert.CertificateException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException unused) {
            return null;
        }
        com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf valueof = setscrollbardefaultdelaybeforefade.new valueOf();
        inputStream = (java.io.InputStream) com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf.writeReplace(new java.lang.Object[]{valueof, byteArrayInputStream}, -1908823989, 1908823989, java.lang.System.identityHashCode(valueof));
        int i11 = RecordsJson;
        IccPrivateKeyCrtComponentsJson = (((i11 & 87) - (~(-(-(i11 | 87))))) - 1) % 128;
    }

    final class valueOf {
        private static com.payair.hce.SdkCoreRemotePaymentDataImpl DigitizedCardProfile = null;
        private static int IccPrivateKeyCrtComponentsJson = 1;
        private static int RecordsJson;
        private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
        private static java.util.Map getAid;
        private static java.util.Map getProfileVersion;
        private static byte[] valueOf;
        private static com.payair.hce.SdkCoreRemotePaymentDataImpl values;
        private static int writeReplace;

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            return writeReplace(objArr);
        }

        valueOf() {
        }

        private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
            com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf valueof = (com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf) objArr[0];
            java.io.ByteArrayInputStream byteArrayInputStream = (java.io.ByteArrayInputStream) objArr[1];
            int i = RecordsJson;
            int i2 = i & 69;
            int i3 = (i | 69) & (~i2);
            int i4 = i2 << 1;
            IccPrivateKeyCrtComponentsJson = ((i3 & i4) + (i3 | i4)) % 128;
            char mirror = android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int identityHashCode = java.lang.System.identityHashCode(valueof);
            int i5 = mirror * 860;
            int i6 = i5 & 41184;
            int i7 = (i5 ^ 41184) | i6;
            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
            int i9 = mirror & identityHashCode;
            int i10 = (~i9) & (mirror | identityHashCode);
            int i11 = -(~(-(-(((i9 ^ i10) | (i9 & i10)) * (-859)))));
            int i12 = ((i8 & i11) + (i11 | i8)) - 1;
            int i13 = ~identityHashCode;
            int i14 = ~mirror;
            int i15 = (i14 & i13) | ((~i13) & mirror);
            int i16 = i13 & mirror;
            int i17 = ~((i15 ^ i16) | (i15 & i16));
            int i18 = i14 & 47;
            int i19 = (i14 | 47) & (~i18);
            int i20 = (i19 ^ i18) | (i19 & i18);
            int i21 = i20 & identityHashCode;
            int i22 = (i20 | identityHashCode) & (~i21);
            int i23 = ~((i22 ^ i21) | (i22 & i21));
            int i24 = ((i23 & (~i17)) | ((~i23) & i17) | (i17 & i23)) * 859;
            int i25 = i12 & i24;
            int i26 = ((i12 ^ i24) | i25) << 1;
            int i27 = -((i24 | i12) & (~i25));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            int i29 = (identityHashCode | i13) & i13;
            int i30 = i29 & 47;
            int i31 = (i29 | 47) & (~i30);
            int i32 = ~((i31 ^ i30) | (i31 & i30));
            int i33 = mirror & kotlinx.io.files.FileSystemKt.UnixPathSeparator;
            int i34 = (mirror | kotlinx.io.files.FileSystemKt.UnixPathSeparator) & (~i33);
            int i35 = ~((i34 ^ i33) | (i34 & i33));
            int i36 = ((~i35) & i32) | ((~i32) & i35);
            int i37 = i35 & i32;
            int i38 = -(-(((i37 ^ i36) | (i37 & i36)) * 859));
            int i39 = i28 & i38;
            int i40 = -android.text.TextUtils.indexOf("", "", 0);
            int i41 = i40 & 14;
            int i42 = -(-((i40 ^ 14) | i41));
            java.io.InputStream DigitizedCardProfile2 = valueof.DigitizedCardProfile(byteArrayInputStream, i39 + ((i38 ^ i28) | i39), ((i41 | i42) << 1) - (i42 ^ i41));
            int i43 = RecordsJson;
            int i44 = (((i43 | 97) << 1) - (~(-(i43 ^ 97)))) - 1;
            IccPrivateKeyCrtComponentsJson = i44 % 128;
            if (i44 % 2 != 0) {
                return DigitizedCardProfile2;
            }
            throw null;
        }

        private java.io.OutputStream valueOf(java.io.OutputStream outputStream, int i, int i2) {
            try {
                java.lang.Object[] objArr = {outputStream, DigitizedCardProfile, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace), valueOf};
                java.lang.Object obj = com.payair.hce.assignRecords.getMchipCvmIssuerOptions.get(1283205134);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.assignRecords.writeReplace((char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 764), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 41)).getDeclaredConstructor(java.io.OutputStream.class, com.payair.hce.SdkCoreRemotePaymentDataImpl.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, byte[].class);
                    com.payair.hce.assignRecords.getMchipCvmIssuerOptions.put(1283205134, obj);
                }
                return (java.io.OutputStream) ((java.lang.reflect.Constructor) obj).newInstance(objArr);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        private java.io.InputStream DigitizedCardProfile(java.io.InputStream inputStream, int i, int i2) throws java.io.IOException {
            try {
                java.lang.Object[] objArr = {inputStream, values, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace), valueOf};
                java.lang.Object obj = com.payair.hce.CardWalletRelatedDataJson.getMchipCvmIssuerOptions.get(1639652918);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.CardWalletRelatedDataJson.AlternateContactlessPaymentDataJson((char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.graphics.Color.red(0) + 35, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).getDeclaredConstructor(java.io.InputStream.class, com.payair.hce.SdkCoreRemotePaymentDataImpl.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, byte[].class);
                    com.payair.hce.CardWalletRelatedDataJson.getMchipCvmIssuerOptions.put(1639652918, obj);
                }
                return (java.io.InputStream) ((java.lang.reflect.Constructor) obj).newInstance(objArr);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        static void DigitizedCardProfile() {
            java.nio.channels.ReadableByteChannel newChannel = java.nio.channels.Channels.newChannel(com.payair.hce.setScrollBarDefaultDelayBeforeFade.valueOf.class.getResourceAsStream("/com/payair/hce/b-"));
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(1352163);
            while (allocate.hasRemaining()) {
                newChannel.read(allocate);
            }
            newChannel.close();
            allocate.rewind();
            SdkCoreAlternateContactlessPaymentDataImpl = allocate.array();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(0, com.payair.hce.SdkCoreRemotePaymentDataImpl.class);
            hashMap.put(1, com.payair.hce.getPanSequenceNumber.class);
            hashMap.put(2, com.payair.hce.getRecordNumber.class);
            hashMap.put(3, com.payair.hce.getSfi.class);
            hashMap.put(4, com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl.class);
            hashMap.put(5, com.payair.hce.getContactlessPaymentData.class);
            hashMap.put(6, com.payair.hce.SdkCoreRecordsImpl.class);
            hashMap.put(7, com.payair.hce.getRecordValue.class);
            getProfileVersion = hashMap;
            getAid = new java.util.HashMap();
        }

        static {
            DigitizedCardProfile();
            com.payair.hce.getStartCommandIntent getstartcommandintent = new com.payair.hce.getStartCommandIntent(new java.io.ByteArrayInputStream(SdkCoreAlternateContactlessPaymentDataImpl), getProfileVersion, getAid);
            DigitizedCardProfile = (com.payair.hce.SdkCoreRemotePaymentDataImpl) getstartcommandintent.RecordsJson();
            values = (com.payair.hce.SdkCoreRemotePaymentDataImpl) getstartcommandintent.RecordsJson();
            valueOf = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            writeReplace = 1;
        }

        final java.io.InputStream valueOf(java.io.ByteArrayInputStream byteArrayInputStream) {
            return (java.io.InputStream) writeReplace(new java.lang.Object[]{this, byteArrayInputStream}, -1908823989, 1908823989, java.lang.System.identityHashCode(this));
        }
    }

    private static void c(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = 1;
        int i3 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(iArr3[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(i3, i3) + 27, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, (char) (android.graphics.ImageFormat.getBitsPerPixel(i3) + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i4++;
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = SdkCoreAlternateContactlessPaymentDataImpl;
        float f = 0.0f;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i2];
                objArr3[0] = java.lang.Integer.valueOf(iArr6[i5]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 29, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i5++;
                iArr6 = iArr2;
                f = 0.0f;
                i2 = 1;
            }
            iArr6 = iArr7;
        }
        char c = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i6 = 0;
            for (int i7 = 16; i6 < i7; i7 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 32, 5088 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i6++;
            }
            int i8 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i8;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i9 = istransitsupported.DigitizedCardProfile;
            int i10 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.resolveSize(0, 0), 2923 - android.view.KeyEvent.getDeadChar(0, 0), (char) (3037 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(0, (short) 0, (short) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            c = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    final class writeReplace {
        private static com.payair.hce.SdkCoreRemotePaymentDataImpl AlternateContactlessPaymentDataJson = null;
        private static int IccPrivateKeyCrtComponentsJson = 1;
        private static java.util.Map RecordsJson;
        private static byte[] SdkCoreAlternateContactlessPaymentDataImpl;
        private static java.util.Map getAid;
        private static int getProfileVersion;
        private static com.payair.hce.SdkCoreRemotePaymentDataImpl valueOf;
        private static byte[] values;
        private static int writeReplace;

        public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
            return values(objArr);
        }

        writeReplace() {
        }

        private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
            com.payair.hce.setScrollBarDefaultDelayBeforeFade.writeReplace writereplace = (com.payair.hce.setScrollBarDefaultDelayBeforeFade.writeReplace) objArr[0];
            java.io.ByteArrayInputStream byteArrayInputStream = (java.io.ByteArrayInputStream) objArr[1];
            int i = getProfileVersion;
            int i2 = i & 87;
            int i3 = (i | 87) & (~i2);
            int i4 = i2 << 1;
            IccPrivateKeyCrtComponentsJson = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
            int blue = android.graphics.Color.blue(0);
            int i5 = -(android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            int identityHashCode = java.lang.System.identityHashCode(writereplace);
            int i6 = i5 * (-501);
            int i7 = i6 & 3018;
            int i8 = i7 + ((i6 ^ 3018) | i7);
            int i9 = (identityHashCode ^ (-7)) | (identityHashCode & (-7));
            int i10 = ~i9;
            int i11 = (i9 | i10) & i10;
            int i12 = ~((i5 ^ 6) | (i5 & 6));
            int i13 = i11 & i12;
            int i14 = (i11 | i12) & (~i13);
            int i15 = ((i14 ^ i13) | (i14 & i13)) * (-502);
            int i16 = ((i8 | i15) << 1) - (i15 ^ i8);
            int i17 = ~identityHashCode;
            int i18 = i17 & (i17 | identityHashCode);
            int i19 = i18 & (-7);
            int i20 = (i18 | (-7)) & (~i19);
            int i21 = (i20 ^ i19) | (i20 & i19);
            int i22 = i21 ^ i5;
            int i23 = i21 & i5;
            int i24 = -(-((~((i23 ^ i22) | (i23 & i22))) * (-502)));
            int i25 = ((~i24) & i16) | ((~i16) & i24);
            int i26 = (i24 & i16) << 1;
            int i27 = ~i5;
            int i28 = i27 & identityHashCode;
            int i29 = ((i27 | identityHashCode) & (~i28)) | i28;
            int i30 = ~i29;
            int i31 = (i29 | i30) & i30;
            java.io.InputStream DigitizedCardProfile = writereplace.DigitizedCardProfile(byteArrayInputStream, blue, (((i25 & i26) + (i26 | i25)) - (~(-(~(((i31 ^ (-7)) | (i31 & (-7))) * 502))))) - 2);
            int i32 = IccPrivateKeyCrtComponentsJson;
            int i33 = (i32 & (-46)) | ((~i32) & 45);
            int i34 = -(-((i32 & 45) << 1));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            getProfileVersion = i35 % 128;
            if (i35 % 2 == 0) {
                return DigitizedCardProfile;
            }
            throw null;
        }

        private java.io.OutputStream valueOf(java.io.OutputStream outputStream, int i, int i2) {
            try {
                java.lang.Object[] objArr = {outputStream, valueOf, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace), values};
                java.lang.Object obj = com.payair.hce.assignRecords.getMchipCvmIssuerOptions.get(1283205134);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.assignRecords.writeReplace((char) (764 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), (-1) - android.view.MotionEvent.axisFromString(""), 41 - (android.view.KeyEvent.getMaxKeyCode() >> 16))).getDeclaredConstructor(java.io.OutputStream.class, com.payair.hce.SdkCoreRemotePaymentDataImpl.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, byte[].class);
                    com.payair.hce.assignRecords.getMchipCvmIssuerOptions.put(1283205134, obj);
                }
                return (java.io.OutputStream) ((java.lang.reflect.Constructor) obj).newInstance(objArr);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        private java.io.InputStream DigitizedCardProfile(java.io.InputStream inputStream, int i, int i2) throws java.io.IOException {
            try {
                java.lang.Object[] objArr = {inputStream, AlternateContactlessPaymentDataJson, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(writeReplace), values};
                java.lang.Object obj = com.payair.hce.CardWalletRelatedDataJson.getMchipCvmIssuerOptions.get(1639652918);
                if (obj == null) {
                    obj = ((java.lang.Class) com.payair.hce.CardWalletRelatedDataJson.AlternateContactlessPaymentDataJson((char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 35 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), android.os.Process.myTid() >> 22)).getDeclaredConstructor(java.io.InputStream.class, com.payair.hce.SdkCoreRemotePaymentDataImpl.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, byte[].class);
                    com.payair.hce.CardWalletRelatedDataJson.getMchipCvmIssuerOptions.put(1639652918, obj);
                }
                return (java.io.InputStream) ((java.lang.reflect.Constructor) obj).newInstance(objArr);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        static void AlternateContactlessPaymentDataJson() {
            java.nio.channels.ReadableByteChannel newChannel = java.nio.channels.Channels.newChannel(com.payair.hce.setScrollBarDefaultDelayBeforeFade.writeReplace.class.getResourceAsStream("/com/payair/hce/c-"));
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(3072702);
            while (allocate.hasRemaining()) {
                newChannel.read(allocate);
            }
            newChannel.close();
            allocate.rewind();
            SdkCoreAlternateContactlessPaymentDataImpl = allocate.array();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(0, com.payair.hce.SdkCoreRemotePaymentDataImpl.class);
            hashMap.put(1, com.payair.hce.getPanSequenceNumber.class);
            hashMap.put(2, com.payair.hce.getRecordNumber.class);
            hashMap.put(3, com.payair.hce.getSfi.class);
            hashMap.put(4, com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl.class);
            hashMap.put(5, com.payair.hce.getContactlessPaymentData.class);
            hashMap.put(6, com.payair.hce.SdkCoreRecordsImpl.class);
            hashMap.put(7, com.payair.hce.getRecordValue.class);
            getAid = hashMap;
            RecordsJson = new java.util.HashMap();
        }

        static {
            AlternateContactlessPaymentDataJson();
            com.payair.hce.getStartCommandIntent getstartcommandintent = new com.payair.hce.getStartCommandIntent(new java.io.ByteArrayInputStream(SdkCoreAlternateContactlessPaymentDataImpl), getAid, RecordsJson);
            valueOf = (com.payair.hce.SdkCoreRemotePaymentDataImpl) getstartcommandintent.RecordsJson();
            AlternateContactlessPaymentDataJson = (com.payair.hce.SdkCoreRemotePaymentDataImpl) getstartcommandintent.RecordsJson();
            values = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            writeReplace = 1;
        }

        final java.io.InputStream DigitizedCardProfile(java.io.ByteArrayInputStream byteArrayInputStream) {
            return (java.io.InputStream) writeReplace(new java.lang.Object[]{this, byteArrayInputStream}, 1008239320, -1008239320, java.lang.System.identityHashCode(this));
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        try {
            java.lang.Object[] objArr2 = {org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME};
            int i = -(~(-(-(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, 388931207, -1066184156, 1322522203, 221047406, 1376168222, -822292470, 726239453, 2053633176}, (((i | 19) << 1) - (i ^ 19)) - 1, objArr3);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 11, 0, 0}, objArr4);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
            int i2 = -android.graphics.Color.rgb(0, 0, 0);
            int i3 = i2 & (-16777194);
            int i4 = -(-((i2 ^ (-16777194)) | i3));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, -1479998628, -1997459177, 235913542, 1907966381, 1488307668, 95985983, 1557075611, 1865789732, 755005676, 1397137859}, (i3 & i4) + (i4 | i3), objArr5);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 11, 0, 0}, objArr6);
            java.security.KeyStore keyStore = (java.security.KeyStore) cls2.getMethod((java.lang.String) objArr6[0], java.lang.String.class).invoke(null, "AndroidKeyStore");
            keyStore.load(null);
            java.security.KeyStore.SecretKeyEntry secretKeyEntry = (java.security.KeyStore.SecretKeyEntry) keyStore.getEntry("CRYPTO_WB_KEY", null);
            if (secretKeyEntry == null) {
                try {
                    valueOf(new java.lang.Object[0], 204438579, -204438577, (int) java.lang.System.currentTimeMillis());
                } catch (java.security.InvalidAlgorithmParameterException | java.security.NoSuchProviderException unused) {
                }
                secretKeyEntry = (java.security.KeyStore.SecretKeyEntry) keyStore.getEntry("CRYPTO_WB_KEY", null);
            }
            java.lang.Object[] objArr7 = {1, secretKeyEntry.getSecretKey()};
            int i5 = -(android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i6 = i5 * (-1939);
            int i7 = i6 & 18449;
            int i8 = -(-((i6 ^ 18449) | i7));
            int i9 = (i7 & i8) + (i8 | i7);
            int i10 = ~i5;
            int i11 = (i10 & (-20)) | (i5 & 19);
            int i12 = i5 & (-20);
            int i13 = ~((i11 & i12) | (i11 ^ i12));
            int i14 = ~currentTimeMillis;
            int i15 = (i14 & (-20)) | ((~i14) & 19);
            int i16 = i14 & 19;
            int i17 = ~((i15 ^ i16) | (i15 & i16));
            int i18 = ((~i17) & i13) | ((~i13) & i17);
            int i19 = i17 & i13;
            int i20 = ((i18 ^ i19) | (i18 & i19)) * (-970);
            int i21 = i9 ^ i20;
            int i22 = ((i20 & i9) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 & i23) + (i22 | i23);
            int i25 = (~(i10 | 19)) * 1940;
            int i26 = i24 & i25;
            int i27 = i26 + ((i25 ^ i24) | i26);
            int i28 = (i10 | i5) & i10;
            int i29 = ~((i28 ^ (-20)) | (i28 & (-20)));
            int i30 = ~(((i14 | 19) & (~i16)) | i16);
            int i31 = ((~i30) & i29) | ((~i29) & i30);
            int i32 = i29 & i30;
            int i33 = ((i32 ^ i31) | (i32 & i31)) * 970;
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, 388931207, -1066184156, 1322522203, 221047406, 1376168222, -822292470, 726239453, 2053633176}, ((i27 | i33) << 1) - (i33 ^ i27), objArr8);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            b("\u0000\u0001\u0001\u0001", false, new int[]{11, 4, 51, 0}, objArr9);
            cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.security.Key.class).invoke(invoke, objArr7);
            int resolveSize = android.view.View.resolveSize(0, 0);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i34 = ~resolveSize;
            int i35 = (i34 | resolveSize) & i34;
            int i36 = ~currentTimeMillis2;
            int i37 = i36 & (-20);
            int i38 = ~(i37 | ((~i37) & (i36 | (-20))));
            int i39 = (i38 ^ i35) | (i38 & i35);
            int i40 = (i36 & 19) | (currentTimeMillis2 & (-20));
            int i41 = currentTimeMillis2 & 19;
            int i42 = (i40 ^ i41) | (i40 & i41);
            int i43 = ~i42;
            int i44 = (i42 | i43) & i43;
            int i45 = (((resolveSize * (-563)) + 10735) - (~(-(~(((i39 ^ i44) | (i39 & i44)) * (-564)))))) - 1;
            int i46 = i34 ^ 19;
            int i47 = i34 & 19;
            int i48 = (i46 ^ i47) | (i47 & i46);
            int i49 = i48 & currentTimeMillis2;
            int i50 = (((~i45) + (i45 << 1)) - (~(-(-((~(((currentTimeMillis2 | i48) & (~i49)) | i49)) * 1128))))) - 1;
            int i51 = ~((i35 ^ i36) | (i35 & i36));
            int i52 = ~((resolveSize & (-20)) | i47 | (resolveSize & 19));
            int i53 = -(-(((i52 ^ i51) | (i52 & i51)) * 564));
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, 388931207, -1066184156, 1322522203, 221047406, 1376168222, -822292470, 726239453, 2053633176}, (i50 & i53) + (i53 | i50), objArr10);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr10[0]);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            b("\u0000\u0001\u0001\u0001\u0000", true, new int[]{15, 5, 106, 0}, objArr11);
            byte[] bArr = (byte[]) cls4.getMethod((java.lang.String) objArr11[0], null).invoke(invoke, null);
            java.lang.Object[] objArr12 = {str.getBytes()};
            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16;
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, 388931207, -1066184156, 1322522203, 221047406, 1376168222, -822292470, 726239453, 2053633176}, (keyRepeatTimeout ^ 19) + ((keyRepeatTimeout & 19) << 1), objArr13);
            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr13[0]);
            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i54 = normalizeMetaState * (-375);
            int i55 = (i54 ^ (-2625)) + ((i54 & (-2625)) << 1);
            int i56 = ~normalizeMetaState;
            int i57 = (i56 | normalizeMetaState) & i56;
            int i58 = ((~i57) & (-8)) | (i57 & 7) | (i57 & (-8));
            int i59 = ~i58;
            int i60 = (i58 | i59) & i59;
            int i61 = (i60 ^ currentTimeMillis3) | (i60 & currentTimeMillis3);
            int i62 = normalizeMetaState ^ 7;
            int i63 = normalizeMetaState & 7;
            int i64 = ~((i62 & i63) | (i62 ^ i63));
            int i65 = ((i61 & i64) | ((~i64) & i61) | ((~i61) & i64)) * 376;
            int i66 = (i55 & i65) + (i55 | i65);
            int i67 = ~currentTimeMillis3;
            int i68 = (i67 | currentTimeMillis3) & i67;
            int i69 = ~((i68 ^ normalizeMetaState) | (i68 & normalizeMetaState));
            int i70 = (normalizeMetaState & (-8)) | (i56 & 7);
            int i71 = ~((i70 ^ i63) | (i70 & i63));
            int i72 = -(-(((i71 & (~i69)) | ((~i71) & i69) | (i69 & i71)) * (-376)));
            int i73 = (((~i72) & i66) | ((~i66) & i72)) + ((i72 & i66) << 1);
            int i74 = (i56 & i67) | ((~i56) & currentTimeMillis3);
            int i75 = currentTimeMillis3 & i56;
            int i76 = ~((i74 ^ i75) | (i74 & i75));
            int i77 = ((~i76) & 7) | (i76 & (-8));
            int i78 = i76 & 7;
            int i79 = -(~(((i78 ^ i77) | (i78 & i77)) * 376));
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            c(new int[]{791772883, -1865208021, -397643817, 2027952728}, (-2) - (~((i73 ^ i79) + ((i79 & i73) << 1))), objArr14);
            return new com.payair.hce.setOnCapturedPointerListener(null, "CRYPTO_KEK", (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(byte[]) cls5.getMethod((java.lang.String) objArr14[0], byte[].class).invoke(invoke, objArr12)}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis()), (java.lang.String) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{bArr}, -5816740, 5816740, (int) java.lang.System.currentTimeMillis()));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private java.io.OutputStream values(java.io.OutputStream outputStream, int i, int i2) {
        try {
            java.lang.Object[] objArr = {outputStream, AlternateContactlessPaymentDataJson, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf), writeReplace};
            java.lang.Object obj = com.payair.hce.assignRecords.getMchipCvmIssuerOptions.get(1283205134);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.assignRecords.writeReplace((char) (764 - android.view.View.combineMeasuredStates(0, 0)), android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 40)).getDeclaredConstructor(java.io.OutputStream.class, com.payair.hce.SdkCoreRemotePaymentDataImpl.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, byte[].class);
                com.payair.hce.assignRecords.getMchipCvmIssuerOptions.put(1283205134, obj);
            }
            return (java.io.OutputStream) ((java.lang.reflect.Constructor) obj).newInstance(objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (com.payair.hce.setScrollBarDefaultDelayBeforeFade) objArr[0];
        com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener = (com.payair.hce.setOnCapturedPointerListener) objArr[1];
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i & 63;
        int i3 = ((((i | 63) & (~i2)) - (~(i2 << 1))) - 1) % 128;
        RecordsJson = i3;
        IccPrivateKeyCrtComponentsJson = (i3 + 67) % 128;
        try {
            int i4 = -android.view.View.resolveSizeAndState(0, 0, 0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, -1479998628, -1997459177, 235913542, 1907966381, 1488307668, 95985983, 1557075611, 1865789732, 755005676, 1397137859}, ((((i4 & 22) | (i4 ^ 22)) << 1) - (~(-((i4 & (-23)) | ((~i4) & 22))))) - 1, objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 11, 0, 0}, objArr3);
            java.security.KeyStore keyStore = (java.security.KeyStore) cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, "AndroidKeyStore");
            keyStore.load(null);
            java.security.KeyStore.SecretKeyEntry secretKeyEntry = (java.security.KeyStore.SecretKeyEntry) keyStore.getEntry("CRYPTO_WB_KEY", null);
            if (secretKeyEntry == null) {
                java.lang.String str = (java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener));
                valueOf(new java.lang.Object[]{setscrollbardefaultdelaybeforefade, setoncapturedpointerlistener}, 742574534, -742574530, java.lang.System.identityHashCode(setscrollbardefaultdelaybeforefade));
                int i5 = RecordsJson;
                int i6 = i5 | 113;
                int i7 = ((i6 << 1) - (~(-((~(i5 & 113)) & i6)))) - 1;
                IccPrivateKeyCrtComponentsJson = i7 % 128;
                if (i7 % 2 == 0) {
                    return str;
                }
                throw new java.lang.ArithmeticException();
            }
            int i8 = IccPrivateKeyCrtComponentsJson;
            RecordsJson = ((i8 ^ 79) + ((i8 & 79) << 1)) % 128;
            javax.crypto.SecretKey secretKey = secretKeyEntry.getSecretKey();
            int i9 = RecordsJson;
            int i10 = i9 ^ 23;
            int i11 = (i9 & 23) << 1;
            IccPrivateKeyCrtComponentsJson = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
            java.lang.Object[] objArr4 = {org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME};
            int i12 = (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i13 = i12 | 19;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, 388931207, -1066184156, 1322522203, 221047406, 1376168222, -822292470, 726239453, 2053633176}, (i13 << 1) - ((~(i12 & 19)) & i13), objArr5);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 11, 0, 0}, objArr6);
            java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr6[0], java.lang.String.class).invoke(null, objArr4);
            byte[] bArr = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, 2121132154, -2121132154, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
            int i14 = IccPrivateKeyCrtComponentsJson;
            int i15 = i14 & 19;
            int i16 = (i14 | 19) & (~i15);
            int i17 = i15 << 1;
            RecordsJson = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b("\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{20, 34, 33, 0}, objArr7);
            java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) objArr7[0]).getDeclaredConstructor(java.lang.Integer.TYPE, byte[].class).newInstance(128, bArr);
            int i18 = RecordsJson;
            int i19 = ((i18 | 33) << 1) - (33 ^ i18);
            int i20 = i19 % 128;
            IccPrivateKeyCrtComponentsJson = i20;
            int i21 = i19 % 2;
            RecordsJson = (i20 + 7) % 128;
            java.lang.Object[] objArr8 = {2, secretKey, newInstance};
            int i22 = -(~(-(-(android.os.Process.myPid() >> 22))));
            int i23 = ((i22 | 19) << 1) - (i22 ^ 19);
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, 388931207, -1066184156, 1322522203, 221047406, 1376168222, -822292470, 726239453, 2053633176}, (~i23) + (i23 << 1), objArr9);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            b("\u0000\u0001\u0001\u0001", false, new int[]{11, 4, 51, 0}, objArr10);
            cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.security.Key.class, java.security.spec.AlgorithmParameterSpec.class).invoke(invoke, objArr8);
            byte[] bArr2 = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{setoncapturedpointerlistener}, -1049511775, 1049511786, java.lang.System.identityHashCode(setoncapturedpointerlistener))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
            int i24 = IccPrivateKeyCrtComponentsJson;
            RecordsJson = (((i24 ^ 76) + ((i24 & 76) << 1)) - 1) % 128;
            int i25 = -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, 388931207, -1066184156, 1322522203, 221047406, 1376168222, -822292470, 726239453, 2053633176}, ((((~i25) & 18) | (i25 & (-19))) - (~((i25 & 18) << 1))) - 1, objArr11);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
            int i26 = -(android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            c(new int[]{791772883, -1865208021, -397643817, 2027952728}, (i26 & 8) + (i26 | 8), objArr12);
            java.lang.String str2 = new java.lang.String((byte[]) cls4.getMethod((java.lang.String) objArr12[0], byte[].class).invoke(invoke, bArr2), "UTF-8");
            int i27 = IccPrivateKeyCrtComponentsJson;
            int i28 = ((i27 & 78) + (i27 | 78)) - 1;
            RecordsJson = i28 % 128;
            if (i28 % 2 != 0) {
                return str2;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void b(java.lang.String str, boolean z, int[] iArr, java.lang.Object[] objArr) {
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getAid;
        float f = 0.0f;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)) + 28, android.view.View.combineMeasuredStates(0, 0) + 2807, (char) android.view.View.MeasureSpec.getSize(0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        a(43, (short) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    f = 0.0f;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr2 != null) {
            char[] cArr4 = new char[i2];
            getaccounttype.writeReplace = 0;
            char c = 0;
            while (getaccounttype.writeReplace < i2) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i6 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "") + 44, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2836, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(41, (short) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr4[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i7 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr3[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 43, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2879, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a(45, (short) 0, (short) 0, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr4[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr4[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34, 211 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.resolveSize(0, 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr6[getaccounttype.writeReplace] = cArr3[(i2 - getaccounttype.writeReplace) - 1];
                getaccounttype.writeReplace++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            getaccounttype.writeReplace = 0;
            while (getaccounttype.writeReplace < i2) {
                cArr3[getaccounttype.writeReplace] = (char) (cArr3[getaccounttype.writeReplace] - iArr[2]);
                getaccounttype.writeReplace++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = IccPrivateKeyCrtComponentsJson + 93;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        try {
            java.lang.Object[] objArr2 = {org.jose4j.keys.AesKey.ALGORITHM, "AndroidKeyStore"};
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{54, 25, 89, 0}, objArr3);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 11, 0, 0}, objArr4);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class, java.lang.String.class).invoke(null, objArr2);
            android.security.keystore.KeyGenParameterSpec build = new android.security.keystore.KeyGenParameterSpec.Builder("CRYPTO_WB_KEY", 3).setBlockModes(com.google.android.gms.stats.CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
            int i2 = IccPrivateKeyCrtComponentsJson;
            RecordsJson = ((i2 ^ 115) + ((i2 & 115) << 1)) % 128;
            int i3 = i2 & 27;
            RecordsJson = (i3 + ((i2 ^ 27) | i3)) % 128;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{54, 25, 89, 0}, objArr5);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b("\u0000\u0001\u0001\u0001", false, new int[]{11, 4, 51, 0}, objArr6);
            cls2.getMethod((java.lang.String) objArr6[0], java.security.spec.AlgorithmParameterSpec.class).invoke(invoke, build);
            int i4 = RecordsJson;
            int i5 = (i4 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i4) & 109);
            int i6 = (i4 & 109) << 1;
            int i7 = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            IccPrivateKeyCrtComponentsJson = i7;
            int i8 = i7 & 111;
            RecordsJson = (i8 + ((i7 ^ 111) | i8)) % 128;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{54, 25, 89, 0}, objArr7);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
            int i9 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i10 = (i9 | 12) << 1;
            int i11 = -(i9 ^ 12);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            c(new int[]{1759465635, 1438589749, 1481469339, 1465170848, -514079374, 280292744}, (i10 & i11) + (i11 | i10), objArr8);
            cls3.getMethod((java.lang.String) objArr8[0], null).invoke(invoke, null);
            int i12 = IccPrivateKeyCrtComponentsJson;
            int i13 = ((i12 | 33) << 1) - (i12 ^ 33);
            RecordsJson = i13 % 128;
            if (i13 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = (IccPrivateKeyCrtComponentsJson + 39) % 128;
        RecordsJson = i;
        int i2 = i & 97;
        int i3 = (i | 97) & (~i2);
        int i4 = i2 << 1;
        IccPrivateKeyCrtComponentsJson = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
        try {
            int i5 = -(android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i6 = i5 * 69;
            int i7 = ~i5;
            int i8 = (i7 | i5) & i7;
            int i9 = (i8 ^ (-24)) | (i8 & (-24));
            int i10 = ~currentTimeMillis;
            int i11 = i9 ^ i10;
            int i12 = i9 & i10;
            int i13 = ~((i12 ^ i11) | (i12 & i11));
            int i14 = i5 & 23;
            int i15 = ~(((i5 | 23) & (~i14)) | i14);
            int i16 = i13 & i15;
            int i17 = (i15 | i13) & (~i16);
            int i18 = (i17 ^ i16) | (i17 & i16);
            int i19 = currentTimeMillis & 23;
            int i20 = (~i19) & (currentTimeMillis | 23);
            int i21 = ~((i19 ^ i20) | (i19 & i20));
            int i22 = i18 & i21;
            int i23 = (i18 | i21) & (~i22);
            int i24 = i7 ^ i10;
            int i25 = i7 & i10;
            int i26 = (i25 ^ i24) | (i24 & i25);
            int i27 = i26 & 23;
            int i28 = (i26 | 23) & (~i27);
            int i29 = ((((i6 & 1540) | ((~i6) & (-1541))) - (~((i6 & (-1541)) << 1))) - 1) + (((i23 ^ i22) | (i23 & i22)) * (-68)) + ((~((i28 & i27) | (i28 ^ i27))) * (-68));
            int i30 = (currentTimeMillis | i10) & i10;
            int i31 = i30 & (-24);
            int i32 = ~(((i30 | (-24)) & (~i31)) | i31);
            int i33 = ((~i32) & i8) | ((~i8) & i32);
            int i34 = i32 & i8;
            int i35 = ((i34 ^ i33) | (i34 & i33)) * 68;
            int i36 = i29 & i35;
            int i37 = (i35 | i29) & (~i36);
            int i38 = i36 << 1;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, -1479998628, -1997459177, 235913542, 1907966381, 1488307668, 95985983, 1557075611, 1865789732, 755005676, 1397137859}, (i37 & i38) + (i37 | i38), objArr2);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", false, new int[]{0, 11, 0, 0}, objArr3);
            java.security.KeyStore keyStore = (java.security.KeyStore) cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, "AndroidKeyStore");
            keyStore.load(null);
            int i39 = IccPrivateKeyCrtComponentsJson + 100;
            int i40 = (~i39) + (i39 << 1);
            RecordsJson = i40 % 128;
            int i41 = i40 % 2;
            int i42 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i43 = (i42 * 236) + 10362;
            int i44 = ~i42;
            int i45 = ~currentTimeMillis2;
            int i46 = (i45 | currentTimeMillis2) & i45;
            int i47 = i44 & i46;
            int i48 = (i46 | i44) & (~i47);
            int i49 = ~((i48 ^ i47) | (i48 & i47));
            int i50 = ((~i49) & 22) | (i49 & (-23));
            int i51 = i49 & 22;
            int i52 = ((i51 ^ i50) | (i51 & i50)) * (-235);
            int i53 = i43 & i52;
            int i54 = i43 | i52;
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            int i56 = (i44 | i42) & i44;
            int i57 = (i45 & i56) | ((~i56) & currentTimeMillis2);
            int i58 = i56 & currentTimeMillis2;
            int i59 = ~((i58 ^ i57) | (i58 & i57));
            int i60 = i59 & 22;
            int i61 = (i59 | 22) & (~i60);
            int i62 = ((i61 ^ i60) | (i61 & i60)) * (-470);
            int i63 = (i55 ^ i62) + ((i62 & i55) << 1);
            int i64 = i44 & (-23);
            int i65 = (i42 & 22) | i64 | (i42 & (-23));
            int i66 = ((~i44) & 22) | i64;
            int i67 = i44 & 22;
            int i68 = (i66 ^ i67) | (i66 & i67);
            int i69 = ~i65;
            int i70 = -(-((((i65 | i69) & i69) | (~((currentTimeMillis2 ^ i68) | (currentTimeMillis2 & i68)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            c(new int[]{2031933323, -294028622, -1479998628, -1997459177, 235913542, 1907966381, 1488307668, 95985983, 1557075611, 1865789732, 755005676, 1397137859}, (i63 & i70) + (i70 | i63), objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            c(new int[]{1554611845, 747575486, -1248767071, 493888388, -2130457647, 1720185329}, 10 - (~(-android.text.TextUtils.getTrimmedLength(""))), objArr5);
            cls2.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(keyStore, "CRYPTO_WB_KEY");
            int i71 = RecordsJson;
            int i72 = ((i71 & 72) + (i71 | 72)) - 1;
            IccPrivateKeyCrtComponentsJson = i72 % 128;
            if (i72 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void valueOf() {
        SdkCoreAlternateContactlessPaymentDataImpl = new int[]{-1853221381, -1408084992, -72157816, -619536730, -1899506400, 2058983901, 330423794, 1916050437, -238886054, -696375892, 2101697607, 1426776278, -1104369023, 443925664, 501545472, 1352428425, -1355331834, 2017000400};
        getAid = new char[]{16893, 16808, 16802, 16784, 16789, 16830, 16829, 16804, 16809, 16806, 16810, 16768, 16720, 16720, 16751, 16814, 16759, 16646, 16664, 16670, 16780, 16715, 16709, 16716, 16717, 16706, 16707, 16707, 16708, 16710, 16708, 16708, 16823, 16801, 16807, 16808, 16789, 16807, 16715, 16709, 16732, 16831, 16801, 16732, 16733, 16731, 16728, 16709, 16807, 16826, 16707, 16706, 16706, 16712, 16815, 16752, 16650, 16650, 16651, 16738, 16751, 16653, 16640, 16643, 16645, 16644, 16745, 16731, 16767, 16646, 16759, 16737, 16652, 16652, 16650, 16652, 16653, 16644, 16647};
    }

    static void AlternateContactlessPaymentDataJson() {
        java.nio.channels.ReadableByteChannel newChannel = java.nio.channels.Channels.newChannel(com.payair.hce.setScrollBarDefaultDelayBeforeFade.class.getResourceAsStream("/com/payair/hce/a-"));
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(3072702);
        while (allocate.hasRemaining()) {
            newChannel.read(allocate);
        }
        newChannel.close();
        allocate.rewind();
        values = allocate.array();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(0, com.payair.hce.SdkCoreRemotePaymentDataImpl.class);
        hashMap.put(1, com.payair.hce.getPanSequenceNumber.class);
        hashMap.put(2, com.payair.hce.getRecordNumber.class);
        hashMap.put(3, com.payair.hce.getSfi.class);
        hashMap.put(4, com.payair.hce.SdkCoreMagstripeCvmIssuerOptionsImpl.class);
        hashMap.put(5, com.payair.hce.getContactlessPaymentData.class);
        hashMap.put(6, com.payair.hce.SdkCoreRecordsImpl.class);
        hashMap.put(7, com.payair.hce.getRecordValue.class);
        DigitizedCardProfile = hashMap;
        getProfileVersion = new java.util.HashMap();
    }

    static {
        init$0();
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        valueOf();
        AlternateContactlessPaymentDataJson();
        com.payair.hce.getStartCommandIntent getstartcommandintent = new com.payair.hce.getStartCommandIntent(new java.io.ByteArrayInputStream(values), DigitizedCardProfile, getProfileVersion);
        AlternateContactlessPaymentDataJson = (com.payair.hce.SdkCoreRemotePaymentDataImpl) getstartcommandintent.RecordsJson();
        writeReplace = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        valueOf = 1;
    }

    static void DigitizedCardProfile() throws java.security.KeyStoreException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException {
        valueOf(new java.lang.Object[0], -361139453, 361139456, (int) java.lang.System.currentTimeMillis());
    }

    private static void writeReplace() throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException {
        valueOf(new java.lang.Object[0], 204438579, -204438577, (int) java.lang.System.currentTimeMillis());
    }

    private void DigitizedCardProfile(com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener) {
        valueOf(new java.lang.Object[]{this, setoncapturedpointerlistener}, 742574534, -742574530, java.lang.System.identityHashCode(this));
    }

    private java.lang.String AlternateContactlessPaymentDataJson(com.payair.hce.setOnCapturedPointerListener setoncapturedpointerlistener) throws java.security.KeyStoreException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, javax.crypto.NoSuchPaddingException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException {
        return (java.lang.String) valueOf(new java.lang.Object[]{this, setoncapturedpointerlistener}, -1139273316, 1139273323, java.lang.System.identityHashCode(this));
    }

    private static com.payair.hce.setOnCapturedPointerListener valueOf(java.lang.String str) throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException, java.security.cert.CertificateException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, java.security.UnrecoverableEntryException {
        return (com.payair.hce.setOnCapturedPointerListener) valueOf(new java.lang.Object[]{str}, 2076547784, -2076547779, (int) java.lang.System.currentTimeMillis());
    }

    private static java.lang.String valueOf(java.io.InputStream inputStream) throws java.io.IOException {
        return (java.lang.String) valueOf(new java.lang.Object[]{inputStream}, -799348421, 799348427, (int) java.lang.System.currentTimeMillis());
    }

    final java.lang.String writeReplace(byte[] bArr, java.lang.String str, java.lang.String str2) {
        return (java.lang.String) valueOf(new java.lang.Object[]{this, bArr, str, str2}, -1314303054, 1314303054, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{89, 16, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -117};
        $$b = 74;
    }

    final com.payair.hce.setOnCapturedPointerListener DigitizedCardProfile(java.lang.String str) {
        return (com.payair.hce.setOnCapturedPointerListener) valueOf(new java.lang.Object[]{this, str}, 2013040726, -2013040725, java.lang.System.identityHashCode(this));
    }
}
