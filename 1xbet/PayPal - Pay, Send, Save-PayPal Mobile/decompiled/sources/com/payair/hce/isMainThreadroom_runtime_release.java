package com.payair.hce;

/* loaded from: classes4.dex */
public final class isMainThreadroom_runtime_release extends com.payair.hce.isOpenannotations {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] SdkCoreBusinessLogicModuleImpl;
    private static short[] getApplicationLifeCycleData;
    private static byte[] getCiacDecline;
    private static int getCvmResetTimeout;
    private static int getCvrMaskAnd;
    private static int getGpoResponse;
    private static int getPaymentFci;
    private static int getSecurityWord;
    private int AlternateContactlessPaymentDataJson;
    private int DigitizedCardProfile;
    private int IccPrivateKeyCrtComponentsJson;
    private int[] RecordsJson;
    private int SdkCoreAlternateContactlessPaymentDataImpl;
    private int getAid;
    private int getProfileVersion;
    private int valueOf;
    private int values;
    private int writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~((~i2) | i3);
        int i10 = (i * (-574)) + (i2 * (-574)) + (((~(i7 | i8)) | i9) * 1150) + (((~(i2 | i8)) | i9) * (-575)) + (((~(i | i8)) | (~(i7 | i3))) * 575);
        if (i10 == 1) {
            return writeReplace(objArr);
        }
        if (i10 == 2) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        int i11 = getSecurityWord;
        int i12 = i11 + 53;
        getCvmResetTimeout = i12 % 128;
        if (i12 % 2 != 0) {
            i4 = ((intValue >> 4) | (intValue >> 81)) ^ ((intValue >> 10) | intValue);
            i5 = intValue / 50;
            i6 = intValue << 77;
        } else {
            i4 = ((intValue >>> 2) | (intValue << 30)) ^ ((intValue >>> 13) | (intValue << 19));
            i5 = intValue >>> 22;
            i6 = intValue << 10;
        }
        getCvmResetTimeout = (i11 + 69) % 128;
        return java.lang.Integer.valueOf((i6 | i5) ^ i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i * 4) + 104;
        byte[] bArr = $$a;
        int i5 = s * 2;
        int i6 = 3 - (i2 * 4);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            int i8 = 0;
            i4 += i6;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i6 + 1;
            int i10 = i3 + 1;
            i7 = i9;
            i6 = bArr[i9];
            i8 = i10;
            i4 += i6;
            i6 = i7;
            i3 = i8;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public isMainThreadroom_runtime_release() {
        this.RecordsJson = new int[64];
        valueOf();
    }

    private isMainThreadroom_runtime_release(com.payair.hce.isMainThreadroom_runtime_release ismainthreadroom_runtime_release) {
        super(ismainthreadroom_runtime_release);
        this.RecordsJson = new int[64];
        DigitizedCardProfile(ismainthreadroom_runtime_release);
    }

    private void DigitizedCardProfile(com.payair.hce.isMainThreadroom_runtime_release ismainthreadroom_runtime_release) {
        getSecurityWord = (getCvmResetTimeout + 69) % 128;
        super.valueOf(ismainthreadroom_runtime_release);
        this.values = ismainthreadroom_runtime_release.values;
        this.writeReplace = ismainthreadroom_runtime_release.writeReplace;
        this.AlternateContactlessPaymentDataJson = ismainthreadroom_runtime_release.AlternateContactlessPaymentDataJson;
        this.valueOf = ismainthreadroom_runtime_release.valueOf;
        this.DigitizedCardProfile = ismainthreadroom_runtime_release.DigitizedCardProfile;
        this.IccPrivateKeyCrtComponentsJson = ismainthreadroom_runtime_release.IccPrivateKeyCrtComponentsJson;
        this.SdkCoreAlternateContactlessPaymentDataImpl = ismainthreadroom_runtime_release.SdkCoreAlternateContactlessPaymentDataImpl;
        this.getAid = ismainthreadroom_runtime_release.getAid;
        int[] iArr = ismainthreadroom_runtime_release.RecordsJson;
        java.lang.System.arraycopy(iArr, 0, this.RecordsJson, 0, iArr.length);
        this.getProfileVersion = ismainthreadroom_runtime_release.getProfileVersion;
        int i = getCvmResetTimeout + 47;
        getSecurityWord = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final java.lang.String values() {
        getSecurityWord = (getCvmResetTimeout + 47) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1744606058, android.graphics.Color.argb(0, 0, 0, 0) - 1768080739, android.view.KeyEvent.keyCodeFromString("") - 77, (byte) (1 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (short) (45 - android.text.TextUtils.indexOf("", "")), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = getCvmResetTimeout + 31;
        getSecurityWord = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final int AlternateContactlessPaymentDataJson() {
        int i = getSecurityWord;
        getCvmResetTimeout = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getCvmResetTimeout = (i + 103) % 128;
        return 32;
    }

    @Override // com.payair.hce.isOpenannotations
    protected final void values(byte[] bArr, int i) {
        int i2 = getSecurityWord;
        getCvmResetTimeout = (i2 + 81) % 128;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int[] iArr = this.RecordsJson;
        int i3 = this.getProfileVersion;
        iArr[i3] = (b4 & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
        int i4 = i3 + 1;
        this.getProfileVersion = i4;
        if (i4 == 16) {
            int i5 = i2 + 31;
            getCvmResetTimeout = i5 % 128;
            if (i5 % 2 == 0) {
                IccPrivateKeyCrtComponentsJson();
            } else {
                IccPrivateKeyCrtComponentsJson();
                throw null;
            }
        }
        getCvmResetTimeout = (getSecurityWord + 29) % 128;
    }

    @Override // com.payair.hce.isOpenannotations
    protected final void valueOf(long j) {
        int i = getSecurityWord + 11;
        getCvmResetTimeout = i % 128;
        if (i % 2 == 0 ? this.getProfileVersion > 14 : this.getProfileVersion > 51) {
            IccPrivateKeyCrtComponentsJson();
            getSecurityWord = (getCvmResetTimeout + 71) % 128;
        }
        int[] iArr = this.RecordsJson;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final int valueOf(byte[] bArr, int i) {
        getSecurityWord = (getCvmResetTimeout + 91) % 128;
        writeReplace();
        int i2 = this.values;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i2), bArr, java.lang.Integer.valueOf(i)}, 2084777341, -2084777337, i2);
        int i3 = this.writeReplace;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i3), bArr, java.lang.Integer.valueOf(i + 4)}, 2084777341, -2084777337, i3);
        int i4 = this.AlternateContactlessPaymentDataJson;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i4), bArr, java.lang.Integer.valueOf(i + 8)}, 2084777341, -2084777337, i4);
        int i5 = this.valueOf;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i5), bArr, java.lang.Integer.valueOf(i + 12)}, 2084777341, -2084777337, i5);
        int i6 = this.DigitizedCardProfile;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i6), bArr, java.lang.Integer.valueOf(i + 16)}, 2084777341, -2084777337, i6);
        int i7 = this.IccPrivateKeyCrtComponentsJson;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i7), bArr, java.lang.Integer.valueOf(i + 20)}, 2084777341, -2084777337, i7);
        int i8 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i8), bArr, java.lang.Integer.valueOf(i + 24)}, 2084777341, -2084777337, i8);
        int i9 = this.getAid;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i9), bArr, java.lang.Integer.valueOf(i + 28)}, 2084777341, -2084777337, i9);
        valueOf();
        getCvmResetTimeout = (getSecurityWord + 71) % 128;
        return 32;
    }

    @Override // com.payair.hce.isOpenannotations, com.payair.hce.getTransactionExecutor
    public final void valueOf() {
        super.valueOf();
        this.values = 1779033703;
        this.writeReplace = -1150833019;
        this.AlternateContactlessPaymentDataJson = 1013904242;
        this.valueOf = -1521486534;
        this.DigitizedCardProfile = 1359893119;
        this.IccPrivateKeyCrtComponentsJson = -1694144372;
        this.SdkCoreAlternateContactlessPaymentDataImpl = 528734635;
        this.getAid = 1541459225;
        this.getProfileVersion = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.RecordsJson;
            if (i != iArr.length) {
                int i2 = getCvmResetTimeout + 3;
                getSecurityWord = i2 % 128;
                if (i2 % 2 == 0) {
                    iArr[i] = 1;
                    i += 107;
                } else {
                    iArr[i] = 0;
                    i++;
                }
            } else {
                getSecurityWord = (getCvmResetTimeout + 43) % 128;
                return;
            }
        }
    }

    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getCvrMaskAnd)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                $10 = ($11 + 69) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i5 = $10 + 43;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                byte[] bArr = getCiacDecline;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        $10 = ($11 + 111) % 128;
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.getOffsetBefore("", 0) + 5088, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i6++;
                        $11 = ($10 + 71) % 128;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    $11 = ($10 + 39) % 128;
                    byte[] bArr3 = getCiacDecline;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(getGpoResponse)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 27, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (getCvrMaskAnd ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (getApplicationLifeCycleData[i2 + ((int) (getGpoResponse ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getCvrMaskAnd ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i7 = $10;
                $11 = (i7 + 101) % 128;
                int i8 = (int) (getGpoResponse ^ (-4897270311952305750L));
                if (z) {
                    $11 = (i7 + 103) % 128;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + i8 + i4;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(getPaymentFci), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.ImageFormat.getBitsPerPixel(0), android.graphics.Color.rgb(0, 0, 0) + 16779580, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((short) 0, 0, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr4 = getCiacDecline;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        $11 = ($10 + 9) % 128;
                        bArr5[i9] = (byte) (bArr4[i9] ^ (-4897270311952305750L));
                    }
                    $11 = ($10 + 7) % 128;
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        $11 = ($10 + 75) % 128;
                        byte[] bArr6 = getCiacDecline;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = getApplicationLifeCycleData;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    }
                    sb.append(gettrack2constructiondata.values);
                    gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                    gettrack2constructiondata.DigitizedCardProfile++;
                }
            }
            objArr[0] = sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.payair.hce.isOpenannotations
    protected final void IccPrivateKeyCrtComponentsJson() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.RecordsJson;
            int writeReplace = writeReplace(iArr[i - 2]);
            int[] iArr2 = this.RecordsJson;
            int i2 = iArr2[i - 7];
            int i3 = iArr2[i - 15];
            iArr[i] = writeReplace + i2 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i3)}, 1093690796, -1093690794, i3)).intValue() + this.RecordsJson[i - 16];
        }
        int i4 = this.values;
        int i5 = this.writeReplace;
        int i6 = this.AlternateContactlessPaymentDataJson;
        int i7 = this.valueOf;
        int i8 = this.DigitizedCardProfile;
        int i9 = this.IccPrivateKeyCrtComponentsJson;
        int i10 = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i11 = this.getAid;
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            getCvmResetTimeout = (getSecurityWord + 53) % 128;
            int AlternateContactlessPaymentDataJson = i11 + AlternateContactlessPaymentDataJson(i8) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i8), java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10)}, 713645593, -713645592, i8)).intValue() + SdkCoreBusinessLogicModuleImpl[i12] + this.RecordsJson[i12];
            int i14 = i7 + AlternateContactlessPaymentDataJson;
            int intValue = AlternateContactlessPaymentDataJson + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i4)}, 663594331, -663594331, i4)).intValue() + values(i4, i5, i6);
            int i15 = i12 + 1;
            int AlternateContactlessPaymentDataJson2 = i10 + AlternateContactlessPaymentDataJson(i14) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i14), java.lang.Integer.valueOf(i8), java.lang.Integer.valueOf(i9)}, 713645593, -713645592, i14)).intValue() + SdkCoreBusinessLogicModuleImpl[i15] + this.RecordsJson[i15];
            int i16 = i6 + AlternateContactlessPaymentDataJson2;
            int intValue2 = AlternateContactlessPaymentDataJson2 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, 663594331, -663594331, intValue)).intValue() + values(intValue, i4, i5);
            int i17 = i12 + 2;
            int AlternateContactlessPaymentDataJson3 = i9 + AlternateContactlessPaymentDataJson(i16) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i16), java.lang.Integer.valueOf(i14), java.lang.Integer.valueOf(i8)}, 713645593, -713645592, i16)).intValue() + SdkCoreBusinessLogicModuleImpl[i17] + this.RecordsJson[i17];
            int i18 = i5 + AlternateContactlessPaymentDataJson3;
            int intValue3 = AlternateContactlessPaymentDataJson3 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(intValue2)}, 663594331, -663594331, intValue2)).intValue() + values(intValue2, intValue, i4);
            int i19 = i12 + 3;
            int AlternateContactlessPaymentDataJson4 = i8 + AlternateContactlessPaymentDataJson(i18) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i16), java.lang.Integer.valueOf(i14)}, 713645593, -713645592, i18)).intValue() + SdkCoreBusinessLogicModuleImpl[i19] + this.RecordsJson[i19];
            int i20 = i4 + AlternateContactlessPaymentDataJson4;
            int intValue4 = AlternateContactlessPaymentDataJson4 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(intValue3)}, 663594331, -663594331, intValue3)).intValue() + values(intValue3, intValue2, intValue);
            int i21 = i12 + 4;
            int AlternateContactlessPaymentDataJson5 = i14 + AlternateContactlessPaymentDataJson(i20) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i20), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i16)}, 713645593, -713645592, i20)).intValue() + SdkCoreBusinessLogicModuleImpl[i21] + this.RecordsJson[i21];
            i11 = intValue + AlternateContactlessPaymentDataJson5;
            i7 = AlternateContactlessPaymentDataJson5 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(intValue4)}, 663594331, -663594331, intValue4)).intValue() + values(intValue4, intValue3, intValue2);
            int i22 = i12 + 5;
            int AlternateContactlessPaymentDataJson6 = i16 + AlternateContactlessPaymentDataJson(i11) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i20), java.lang.Integer.valueOf(i18)}, 713645593, -713645592, i11)).intValue() + SdkCoreBusinessLogicModuleImpl[i22] + this.RecordsJson[i22];
            i10 = intValue2 + AlternateContactlessPaymentDataJson6;
            i6 = AlternateContactlessPaymentDataJson6 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i7)}, 663594331, -663594331, i7)).intValue() + values(i7, intValue4, intValue3);
            int i23 = i12 + 6;
            int AlternateContactlessPaymentDataJson7 = i18 + AlternateContactlessPaymentDataJson(i10) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i20)}, 713645593, -713645592, i10)).intValue() + SdkCoreBusinessLogicModuleImpl[i23] + this.RecordsJson[i23];
            i9 = intValue3 + AlternateContactlessPaymentDataJson7;
            i5 = AlternateContactlessPaymentDataJson7 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i6)}, 663594331, -663594331, i6)).intValue() + values(i6, i7, intValue4);
            int i24 = i12 + 7;
            int AlternateContactlessPaymentDataJson8 = i20 + AlternateContactlessPaymentDataJson(i9) + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11)}, 713645593, -713645592, i9)).intValue() + SdkCoreBusinessLogicModuleImpl[i24] + this.RecordsJson[i24];
            i8 = intValue4 + AlternateContactlessPaymentDataJson8;
            i4 = AlternateContactlessPaymentDataJson8 + ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i5)}, 663594331, -663594331, i5)).intValue() + values(i5, i6, i7);
            i12 += 8;
        }
        this.values += i4;
        this.writeReplace += i5;
        this.AlternateContactlessPaymentDataJson += i6;
        this.valueOf += i7;
        this.DigitizedCardProfile += i8;
        this.IccPrivateKeyCrtComponentsJson += i9;
        this.SdkCoreAlternateContactlessPaymentDataImpl += i10;
        this.getAid += i11;
        this.getProfileVersion = 0;
        int i25 = 0;
        while (i25 < 16) {
            int i26 = getSecurityWord;
            getCvmResetTimeout = (i26 + 17) % 128;
            this.RecordsJson[i25] = 0;
            i25++;
            getCvmResetTimeout = (i26 + 95) % 128;
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        int intValue2 = ((java.lang.Number) objArr[1]).intValue();
        int intValue3 = ((java.lang.Number) objArr[2]).intValue();
        int i = (getCvmResetTimeout + 81) % 128;
        getSecurityWord = i;
        int i2 = i + 73;
        getCvmResetTimeout = i2 % 128;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf((intValue3 & (~intValue)) ^ (intValue & intValue2));
        }
        throw null;
    }

    private static int values(int i, int i2, int i3) {
        int i4 = getSecurityWord;
        getCvmResetTimeout = (i4 + 117) % 128;
        int i5 = i4 + 17;
        getCvmResetTimeout = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        return ((i & i2) ^ (i & i3)) ^ (i2 & i3);
    }

    private static int AlternateContactlessPaymentDataJson(int i) {
        int i2 = (getCvmResetTimeout + 85) % 128;
        getSecurityWord = i2;
        int i3 = i2 + 125;
        getCvmResetTimeout = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        return (((i << 21) | (i >>> 11)) ^ ((i >>> 6) | (i << 26))) ^ ((i << 7) | (i >>> 25));
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        int i = (getSecurityWord + 113) % 128;
        getCvmResetTimeout = i;
        int i2 = i + 31;
        getSecurityWord = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return java.lang.Integer.valueOf((((intValue << 14) | (intValue >>> 18)) ^ ((intValue >>> 7) | (intValue << 25))) ^ (intValue >>> 3));
    }

    private static int writeReplace(int i) {
        int i2 = getCvmResetTimeout;
        getSecurityWord = (i2 + 89) % 128;
        getSecurityWord = (i2 + 43) % 128;
        return (((i << 13) | (i >>> 19)) ^ ((i >>> 17) | (i << 15))) ^ (i >>> 10);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCvmResetTimeout = 0;
        getSecurityWord = 1;
        getProfileVersion();
        SdkCoreBusinessLogicModuleImpl = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
        getCvmResetTimeout = (getSecurityWord + 59) % 128;
    }

    @Override // com.payair.hce.isUserRecoverableError
    public final com.payair.hce.isUserRecoverableError RecordsJson() {
        com.payair.hce.isMainThreadroom_runtime_release ismainthreadroom_runtime_release = new com.payair.hce.isMainThreadroom_runtime_release(this);
        getCvmResetTimeout = (getSecurityWord + 9) % 128;
        return ismainthreadroom_runtime_release;
    }

    @Override // com.payair.hce.isUserRecoverableError
    public final void DigitizedCardProfile(com.payair.hce.isUserRecoverableError isuserrecoverableerror) {
        getCvmResetTimeout = (getSecurityWord + 51) % 128;
        DigitizedCardProfile((com.payair.hce.isMainThreadroom_runtime_release) isuserrecoverableerror);
        int i = getSecurityWord + 105;
        getCvmResetTimeout = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void getProfileVersion() {
        getGpoResponse = 1986458825;
        getCvrMaskAnd = 520368614;
        getPaymentFci = -2029560510;
        getCiacDecline = new byte[]{17, 9, com.google.common.base.Ascii.SI, 13, -70, 81, 93};
    }

    private static int DigitizedCardProfile(int i) {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1093690796, -1093690794, i)).intValue();
    }

    private static int valueOf(int i) {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 663594331, -663594331, i)).intValue();
    }

    private static int AlternateContactlessPaymentDataJson(int i, int i2, int i3) {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)}, 713645593, -713645592, i)).intValue();
    }

    static void init$0() {
        $$a = new byte[]{84, 108, com.google.common.base.Ascii.CAN, -19};
        $$b = 181;
    }
}
