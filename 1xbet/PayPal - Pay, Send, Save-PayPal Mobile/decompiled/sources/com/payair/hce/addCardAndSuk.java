package com.payair.hce;

/* loaded from: classes4.dex */
public final class addCardAndSuk extends com.payair.hce.initialize {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreCardRiskManagementDataImpl;
    private static char getAdditionalCheckTable;
    private static char[] getCardholderValidators;
    private static int[] getMagstripeCvmIssuerOptions;
    private static int getMchipCvmIssuerOptions;
    private com.payair.hce.transactionCanBeResumed RecordsJson;
    private com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.transactionCanBeResumed SdkCoreBusinessLogicModuleImpl;
    private com.payair.hce.transactionCanBeResumed getAid;
    private com.payair.hce.setRecordValue getApplicationLifeCycleData;
    private com.payair.hce.onRequestSessionFailed getCardLayoutDescription;
    private com.payair.hce.transactionCanBeResumed getCiacDecline;
    private com.payair.hce.transactionCanBeResumed getCvmResetTimeout;
    private com.payair.hce.transactionCanBeResumed getCvrMaskAnd;
    private com.payair.hce.transactionCanBeResumed getDualTapResetTimeout;
    private com.payair.hce.transactionCanBeResumed getGpoResponse;
    private com.payair.hce.transactionCanBeResumed getPaymentFci;
    private com.payair.hce.transactionCanBeResumed getProfileVersion;
    private com.payair.hce.transactionCanBeResumed getSecurityWord;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, short s, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        ?? r7 = 718 - (b * 653);
        int i4 = i * 34;
        int i5 = (s * 34) + 4;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - i4];
        if (bArr == null) {
            byte b2 = r7;
            i2 = 0;
            int i6 = i5;
            i5++;
            i3 = (i6 + (-b2)) - 2;
            cArr[i2] = i3 == true ? (char) 1 : (char) 0;
            if (i2 == 34 - i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i2++;
            b2 = bArr[i5];
            i6 = i3;
            i5++;
            i3 = (i6 + (-b2)) - 2;
            cArr[i2] = i3 == true ? (char) 1 : (char) 0;
            if (i2 == 34 - i4) {
            }
        } else {
            i2 = 0;
            i3 = r7;
            cArr[i2] = i3 == true ? (char) 1 : (char) 0;
            if (i2 == 34 - i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$g;
        int i3 = b2 + 4;
        int i4 = s * 3;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            i2 = i3;
            i = 0;
            i3 += -i5;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i2];
            i3 += -i5;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i3 = 73 - b;
            i2 = i3;
            bArr2[i] = (byte) i3;
            i2++;
            if (i == i4) {
            }
        }
    }

    public addCardAndSuk(com.payair.hce.hasVersionCheckFailed hasversioncheckfailed) throws com.payair.hce.updateSukFileName {
        super(hasversioncheckfailed.DigitizedCardProfile());
        com.payair.hce.updatePushToken writeReplace = hasversioncheckfailed.writeReplace();
        if (writeReplace.RecordsJson() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCardholderValidators);
        }
        this.valueOf = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.RecordsJson());
        if (this.valueOf.DigitizedCardProfile() < 18) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getMaximumPinTry);
        }
        if (writeReplace.AlternateContactlessPaymentDataJson() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCiacDecline);
        }
        this.RecordsJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.AlternateContactlessPaymentDataJson());
        if (writeReplace.valueOf() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCdol1RelatedDataLength);
        }
        this.getAid = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.valueOf());
        if (writeReplace.values() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getCrmCountryCode);
        }
        this.getApplicationLifeCycleData = new com.payair.hce.setRecordValue(writeReplace.values());
        if (writeReplace.getProfileVersion() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.buildRecords);
        }
        this.getCardLayoutDescription = new com.payair.hce.onRequestSessionFailed(writeReplace.getProfileVersion());
        if (writeReplace.DigitizedCardProfile() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getAckAutomaticallyResetByApplication);
        }
        this.getProfileVersion = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.DigitizedCardProfile());
        if (writeReplace.SdkCoreBusinessLogicModuleImpl() != null) {
            this.SdkCoreAlternateContactlessPaymentDataImpl = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.SdkCoreBusinessLogicModuleImpl());
        }
        if (writeReplace.getPaymentFci() != null) {
            this.getPaymentFci = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.getPaymentFci());
        }
        if (writeReplace.writeReplace() != null) {
            this.getCiacDecline = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.writeReplace());
        }
        if (writeReplace.getGpoResponse() != null) {
            this.getGpoResponse = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.getGpoResponse());
        }
        this.values = writeReplace.SdkCoreAlternateContactlessPaymentDataImpl();
        this.AlternateContactlessPaymentDataJson = writeReplace.getAid();
        if (writeReplace.IccPrivateKeyCrtComponentsJson() != null) {
            this.writeReplace = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.IccPrivateKeyCrtComponentsJson());
        }
        if (writeReplace.getCiacDecline() != null) {
            this.DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.getCiacDecline());
        }
        this.getSecurityWord = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(writeReplace.getCvrMaskAnd());
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getMagstripeCvmIssuerOptions;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i2 = 1;
        int i3 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    objArr2[i3] = java.lang.Integer.valueOf(iArr3[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(i3, i3) + 27, 28 - android.text.TextUtils.indexOf("", c, i3, i3), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(i3)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i4++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i2 = 1;
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
        int[] iArr6 = getMagstripeCvmIssuerOptions;
        if (iArr6 != null) {
            $10 = ($11 + 17) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i5])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 27, android.view.Gravity.getAbsoluteGravity(0, 0) + 29, (char) android.text.TextUtils.indexOf("", ""))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i5++;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            $11 = ($10 + 79) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i6 = 0;
            for (int i7 = 16; i6 < i7; i7 = 16) {
                int i8 = $10 + 99;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, 5088 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.text.TextUtils.indexOf("", "", 0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i6 += 50;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 32, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5087, (char) android.text.TextUtils.indexOf("", ""))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i6++;
                }
            }
            int i9 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i9;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i10 = istransitsupported.DigitizedCardProfile;
            int i11 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 2923 - android.view.View.MeasureSpec.getMode(0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2989));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((byte) ($$h - 3), (short) 0, (byte) -1, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public final com.payair.hce.transactionCanBeResumed valueOf() {
        int i = SdkCoreCardRiskManagementDataImpl;
        int i2 = i + 5;
        getMchipCvmIssuerOptions = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.SdkCoreBusinessLogicModuleImpl;
        getMchipCvmIssuerOptions = (i + 57) % 128;
        return transactioncanberesumed;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x012c, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015a, code lost:
    
        r9 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), r2};
        r12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a9, code lost:
    
        if (r12 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ab, code lost:
    
        r12 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3596, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0225, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r12).invoke(null, r9)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0227, code lost:
    
        com.payair.hce.addCardAndSuk.$11 = (com.payair.hce.addCardAndSuk.$10 + 107) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0231, code lost:
    
        r9 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, r2, java.lang.Integer.valueOf(r4), java.lang.Integer.valueOf(r4), r2, java.lang.Integer.valueOf(r4), r2};
        r7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x026d, code lost:
    
        if (r7 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x026f, code lost:
    
        r7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 49, 2665 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (18889 - android.view.View.getDefaultSize(0, 0)));
        r12 = new java.lang.Object[1];
        d((byte) 0, 0, (byte) -1, r12);
        r7 = r7.getMethod((java.lang.String) r12[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02dc, code lost:
    
        r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02e9, code lost:
    
        r9 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r2.values] = r3[r7];
        r5[r2.values + 1] = r3[(r9 * r4) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0346, code lost:
    
        r2.values += 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0303, code lost:
    
        if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0305, code lost:
    
        r2.RecordsJson = ((r2.RecordsJson + r4) - 1) % r4;
        r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r4) - 1) % r4;
        r7 = r2.DigitizedCardProfile;
        r9 = r2.RecordsJson;
        r14 = r2.AlternateContactlessPaymentDataJson;
        r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r5[r2.values] = r3[(r7 * r4) + r9];
        r5[r2.values + 1] = r3[(r14 * r4) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x032d, code lost:
    
        r7 = r2.DigitizedCardProfile;
        r9 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r12 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.RecordsJson;
        r5[r2.values] = r3[(r7 * r4) + r9];
        r5[r2.values + 1] = r3[(r12 * r4) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        r5[r2.values] = (char) (r2.valueOf - r29);
        r5[r2.values + 1] = (char) (r2.writeReplace - r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = getCardholderValidators;
        float f = 0.0f;
        int i3 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                $10 = ($11 + 105) % 128;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 2508 - android.text.TextUtils.getTrimmedLength(""), (char) (6803 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) ($$h - i3), (short) 0, (byte) -1, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    f = 0.0f;
                    i3 = 2;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getAdditionalCheckTable)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.View.getDefaultSize(0, 0), 2508 - android.view.View.getDefaultSize(0, 0), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            d((byte) ($$h - 2), (short) 0, (byte) -1, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i5 = $10 + 33;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values - 1];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            $11 = ($10 + 113) % 128;
            cArr3[i6] = (char) (cArr3[i6] ^ 13722);
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        $11 = ($10 + 37) % 128;
        objArr[0] = str2;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.view.View.resolveSize(0, 0);
        android.graphics.Color.alpha(0);
        new java.lang.Object[]{super.toString()};
        android.media.AudioTrack.getMaxVolume();
        android.media.AudioTrack.getMinVolume();
        new java.lang.Object[]{this.valueOf.writeReplace()};
        android.graphics.Color.rgb(0, 0, 0);
        android.view.ViewConfiguration.getScrollDefaultDelay();
        new java.lang.Object[]{this.values};
        android.os.Process.getElapsedCpuTime();
        android.view.KeyEvent.keyCodeFromString("");
        new java.lang.Object[]{this.AlternateContactlessPaymentDataJson};
        android.view.ViewConfiguration.getScrollBarSize();
        android.view.ViewConfiguration.getMaximumFlingVelocity();
        new java.lang.Object[]{this.RecordsJson.writeReplace()};
        android.view.KeyEvent.getDeadChar(0, 0);
        new java.lang.Object[]{this.getAid.writeReplace()};
        android.view.ViewConfiguration.getFadingEdgeLength();
        new java.lang.Object[]{this.getProfileVersion.writeReplace()};
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.SdkCoreAlternateContactlessPaymentDataImpl;
        new java.lang.Object[]{transactioncanberesumed != null ? transactioncanberesumed.writeReplace() : ""};
        android.text.TextUtils.getOffsetAfter("", 0);
        new java.lang.Object[]{""};
        android.view.ViewConfiguration.getEdgeSlop();
        android.media.AudioTrack.getMaxVolume();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = this.getPaymentFci;
        new java.lang.Object[]{transactioncanberesumed2 != null ? transactioncanberesumed2.writeReplace() : ""};
        android.view.KeyEvent.getMaxKeyCode();
        com.payair.hce.transactionCanBeResumed transactioncanberesumed3 = this.getCiacDecline;
        new java.lang.Object[]{transactioncanberesumed3 != null ? transactioncanberesumed3.writeReplace() : ""};
        android.graphics.ImageFormat.getBitsPerPixel(0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed4 = this.getGpoResponse;
        if (transactioncanberesumed4 != null) {
            getMchipCvmIssuerOptions = (SdkCoreCardRiskManagementDataImpl + 103) % 128;
            str = transactioncanberesumed4.writeReplace();
        } else {
            str = "";
        }
        new java.lang.Object[]{str};
        android.os.SystemClock.uptimeMillis();
        android.text.TextUtils.getCapsMode("", 0, 0);
        new java.lang.Object[]{""};
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.view.ViewConfiguration.getMaximumDrawingCacheSize();
        new java.lang.Object[]{""};
        android.view.ViewConfiguration.getKeyRepeatTimeout();
        android.view.Gravity.getAbsoluteGravity(0, 0);
        com.payair.hce.transactionCanBeResumed transactioncanberesumed5 = this.getSecurityWord;
        if (transactioncanberesumed5 != null) {
            str2 = transactioncanberesumed5.writeReplace();
            SdkCoreCardRiskManagementDataImpl = (getMchipCvmIssuerOptions + 121) % 128;
        } else {
            str2 = "";
        }
        new java.lang.Object[]{str2};
        android.text.TextUtils.indexOf("", "", 0, 0);
        new java.lang.Object[]{""};
        android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1131092739, 1405246146, -367972851, -1766308748, -1131931472, 429147635, -1459492355, -1492286808}, android.text.TextUtils.indexOf("", "", 0, 0) + 14, objArr);
        return ((java.lang.String) objArr[0]).intern();
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getMchipCvmIssuerOptions = 0;
        SdkCoreCardRiskManagementDataImpl = 1;
        getCardholderValidators = new char[]{12325, 12296, 12344, 12297, 12331, 12338, 12414, 12351, 12347, 12326, 12329, 12333, 12327, 12312, 12323, 13267, 12321, 12335, 12334, 12293, 12330, 12299, 12292, 12302, 12319, 12313, 12345, 12305, 12328, 12314, 12291, 12348, 12346, 12388, 12318, 13264, 13266, 12295, 12332, 12399, 12294, 12415, 13265, 12290, 12324, 12407, 12350, 12339, 12400};
        getAdditionalCheckTable = (char) 1495;
        getMagstripeCvmIssuerOptions = new int[]{-957860970, 984914029, 1077751841, -358460901, -1807507621, -1592274015, -1910397017, 767492578, -1490045846, 1578444956, 942200117, -94144771, 168008990, 151557408, 1939012376, -1777293327, 990698937, 1656378973};
    }

    static void init$1() {
        $$g = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS};
        $$h = 10;
    }

    static void init$0() {
        $$a = new byte[]{3, -108, -39, 38, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 207;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0aa0, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r10;
        ((int[]) r0[1])[0] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0ab9, code lost:
    
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r33), r22, java.lang.Integer.valueOf((((((-1826755455) | r10) * 376) + 1780011136) + (((~((~r10) | 777395949)) | (-1861623808)) * (-376))) + (((~((-777395950) | r10)) | 1119096211) * 376))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0af5, code lost:
    
        if (r1 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0af7, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
        r4 = com.payair.hce.addCardAndSuk.$$a[14];
        r5 = (byte) (r4 + 1);
        r8 = new java.lang.Object[1];
        b(r5, r5, (byte) (-r4), r8);
        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0b54, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r2)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0b5b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0b5c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0b5d, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0b61, code lost:
    
        if (r1 != null) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0b63, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0b64, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0b98, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r10;
        ((int[]) r0[1])[0] = r10 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0bb3, code lost:
    
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r33), r9, java.lang.Integer.valueOf((((((~((-17450501) | r10)) | (~((~r10) | 1879041660))) * (-318)) - 1901627792) + (((~(62809660 | r10)) | 1816232000) * (-318))) + (((~((-62809661) | r10)) | (-1833682501)) * 318))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0bf6, code lost:
    
        if (r1 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0bf8, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 49, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 2714, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))));
        r4 = com.payair.hce.addCardAndSuk.$$a[14];
        r5 = (byte) (r4 + 1);
        r8 = new java.lang.Object[1];
        b(r5, r5, (byte) (-r4), r8);
        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0c5a, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r2)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0c61, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0c62, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0c63, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0c67, code lost:
    
        if (r1 != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0c69, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0c6a, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        java.lang.Integer num;
        java.lang.String str;
        int i4;
        java.lang.String intern;
        java.lang.Integer num2;
        java.lang.String[] strArr2 = strArr;
        int i5 = i;
        java.lang.Integer num3 = 16;
        int i6 = 0;
        int i7 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i5;
                ((int[]) objArr[1])[0] = i5;
                int i8 = ~i5;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~(394786493 | i8)) | (-1602746368)) * (-160)) + 118814304 + (((~(i8 | (-1501705668))) | 394786493) * 160))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(""), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b2, b2, (byte) (-b), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            if (strArr2.length == 0) {
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i5;
                ((int[]) objArr4[1])[0] = i5 ^ 4;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((450193572 | r1) * (-757)) - 535728152) + ((~((-1142981465) | i5)) * 1514) + (((~((~i5) | (-1446298589))) | 303317124 | (~(i5 | 1593175036))) * 757))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b3 = $$a[14];
                    byte b4 = (byte) (b3 + 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b4, b4, (byte) (-b3), objArr6);
                    obj2 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length = strArr2.length;
            java.nio.LongBuffer[] longBufferArr = new java.nio.LongBuffer[length];
            int i9 = 0;
            while (i9 < strArr2.length) {
                java.lang.String lowerCase = strArr2[i9].toLowerCase();
                java.lang.Object[] objArr7 = new java.lang.Object[i7];
                c("㖮", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i6, i6), (byte) (14 - android.text.TextUtils.indexOf("", "")), objArr7);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[i6]).intern(), "");
                int i10 = length;
                long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                long longValue2 = new java.math.BigInteger(replaceAll.substring(i6, 16), 16).longValue();
                int length2 = replaceAll.length();
                if (length2 == 32) {
                    num2 = num3;
                    longBufferArr[i9] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length2 != 64) {
                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr8[0])[0] = i5;
                        ((int[]) objArr8[1])[0] = i5 ^ 3;
                        int i11 = ~i5;
                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((~((-941621250) | i5)) | (~((-8527883) | i11))) * 920) + 880427136 + (((~((-946343030) | i11)) | 941621249) * 920) + (((~(i11 | (-941621250))) | (~((-4721781) | i5)) | (~(i5 | (-8527883)))) * 920))};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2, android.view.View.combineMeasuredStates(0, 0) + 2713, (char) android.graphics.Color.alpha(0));
                            byte b5 = $$a[14];
                            byte b6 = (byte) (b5 + 1);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(b6, b6, (byte) (-b5), objArr10);
                            obj3 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                        }
                        ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr9)).intValue();
                        return objArr8;
                    }
                    num2 = num3;
                    longBufferArr[i9] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i9++;
                strArr2 = strArr;
                i5 = i;
                num3 = num2;
                length = i10;
                i6 = 0;
                i7 = 1;
            }
            java.lang.Integer num4 = num3;
            int i12 = length;
            try {
                if (context == null) {
                    try {
                        java.lang.Object[] objArr11 = {new int[1], new int[1], new int[1]};
                        i9 = i;
                        ((int[]) objArr11[0])[0] = i9;
                        ((int[]) objArr11[1])[0] = i9;
                        try {
                            java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(1378689855 | i9)) | (-517802306)) * (-465)) - 644722031) + (((~((-517802306) | i9)) | 1378689855) * 930) + (((-214960193) | i9) * 465))};
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50, android.text.TextUtils.getOffsetAfter("", 0) + 2713, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                byte b7 = $$a[14];
                                byte b8 = (byte) (b7 + 1);
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                b(b8, b8, (byte) (-b7), objArr13);
                                obj4 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                            }
                            ((int[]) objArr11[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr12)).intValue();
                            return objArr11;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable unused) {
                        i9 = i;
                    }
                } else {
                    i9 = i;
                    int i13 = i12;
                    byte[][] bArr = new byte[i13][];
                    int i14 = 0;
                    for (int i15 = 0; i15 < i13; i15++) {
                        java.nio.LongBuffer longBuffer = longBufferArr[i15];
                        if (longBuffer.capacity() == 4) {
                            getMchipCvmIssuerOptions = (SdkCoreCardRiskManagementDataImpl + 37) % 128;
                            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                            java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                            long[] array = longBuffer.array();
                            int length3 = array.length;
                            getMchipCvmIssuerOptions = (SdkCoreCardRiskManagementDataImpl + 39) % 128;
                            int i16 = 0;
                            while (i16 < length3) {
                                int i17 = length3;
                                asLongBuffer.put(array[i16]);
                                i16++;
                                length3 = i17;
                            }
                            bArr[i14] = allocate.array();
                            i14++;
                        }
                    }
                    if (i14 > 0) {
                        int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                        try {
                            java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i9 ^ currentTimeMillis), bArr, java.lang.Integer.valueOf(i14)};
                            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                            if (obj5 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 27, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 429, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31610));
                                byte b9 = (byte) (-$$a[14]);
                                byte b10 = b9;
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                b(b9, b10, (byte) (b10 - 1), objArr15);
                                obj5 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj5);
                            }
                            long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr14)).longValue();
                            long j = (-122629899) | longValue3;
                            long j2 = i9;
                            long j3 = (~j2) | 122629898;
                            long j4 = ~(j2 | j);
                            num = 0;
                            str = "";
                            long j5 = ((503 * longValue3) - 61682839197L) + (j * (-502)) + (((~((~longValue3) | 122629898)) | (~j3) | j4) * (-502)) + (((~(j3 | longValue3)) | j4) * 502) + 1056530606;
                            int i18 = ~i9;
                            int i19 = ((((int) j5) & (((((1368737813 | i9) * 614) + 2107673779) + ((((~((-1826978102) | i18)) | 1082476565) | (~(1030762784 | i18))) * (-1228))) + (((~((-744501537) | i18)) | (~(2113239349 | i18))) * 614))) | (((((((~(189457989 | i18)) | (-1811939318)) | (~(1626684400 | i18))) * (-397)) - 231393174) + (((-1807736246) | i9) * 397)) & ((int) (j5 >> 32)))) ^ currentTimeMillis;
                            if ((i2 & 1) == 1 && (i19 ^ i9) == 15) {
                                java.lang.Object[] objArr16 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr16[0])[0] = i9;
                                ((int[]) objArr16[1])[0] = i19;
                                try {
                                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(732650220 | i9)) | (-1879038973)) * 305) + 506016610 + (((~(732650220 | i18)) | (-1163841941)) * 305))};
                                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj6 == null) {
                                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                        byte b11 = $$a[14];
                                        byte b12 = (byte) (b11 + 1);
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        b(b12, b12, (byte) (-b11), objArr18);
                                        obj6 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                    }
                                    ((int[]) objArr16[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr17)).intValue();
                                    return objArr16;
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            }
                            int i20 = i19 ^ i9;
                            if (i20 == 0) {
                                getMchipCvmIssuerOptions = (SdkCoreCardRiskManagementDataImpl + 55) % 128;
                                java.lang.Object[] objArr19 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr19[0])[0] = i9;
                                ((int[]) objArr19[1])[0] = i19;
                                try {
                                    java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), null, java.lang.Integer.valueOf(((~((-911680477) | i18)) * 979) + 477500760 + ((984811684 | i9) * (-979)) + (((~((-911680477) | i9)) | (~(984811684 | i18))) * 979))};
                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj7 == null) {
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.View.getDefaultSize(0, 0) + 2713, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                        byte b13 = $$a[14];
                                        byte b14 = (byte) (b13 + 1);
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        b(b14, b14, (byte) (-b13), objArr21);
                                        obj7 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                    }
                                    ((int[]) objArr19[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr20)).intValue();
                                    return objArr19;
                                } catch (java.lang.Throwable th3) {
                                    java.lang.Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                            if (i20 == 11) {
                                java.lang.Object[] objArr22 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr22[0])[0] = i9;
                                ((int[]) objArr22[1])[0] = i19;
                                try {
                                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf(((809797648 | i18) * (-192)) + 950766720 + (((~((-1086018153) | i18)) | 676360) * (-384)) + (((~((-676361) | i9)) | (~((-1085341793) | i18)) | (~(1895815800 | i9))) * 192))};
                                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj8 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 50, 2713 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                        byte b15 = $$a[14];
                                        byte b16 = (byte) (b15 + 1);
                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                        b(b16, b16, (byte) (-b15), objArr24);
                                        obj8 = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                    }
                                    ((int[]) objArr22[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr23)).intValue();
                                    return objArr22;
                                } catch (java.lang.Throwable th4) {
                                    java.lang.Throwable cause4 = th4.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th4;
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            java.lang.Throwable cause5 = th5.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th5;
                        }
                    } else {
                        num = 0;
                        str = "";
                    }
                    getMchipCvmIssuerOptions = (SdkCoreCardRiskManagementDataImpl + 29) % 128;
                    try {
                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                        c("\u0002.\u0010\u0004\u0007\u0015\u0013 \u0007\u0003-/\u0010-/ \u0004\u0001-/\u0013\u0003㙐", android.view.KeyEvent.keyCodeFromString(str) + 23, (byte) (98 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr25);
                        java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr25[0]).intern());
                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                        a(new int[]{1762469018, -386574727, 268575431, 1889682836, -45808100, -192982297, 296463230, -168667678, 43098144, -1623768740}, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, objArr26);
                        java.lang.Object invoke = cls9.getMethod(((java.lang.String) objArr26[0]).intern(), null).invoke(context, null);
                        try {
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            c("\u0002.\u0010\u0004\u0007\u0015\u0013 \u0007\u0003-/\u0010-/ \u0004\u0001-/\u0013\u0003㙐", android.graphics.Color.red(0) + 23, (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 98), objArr27);
                            java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                            java.lang.String str2 = str;
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            a(new int[]{1762469018, -386574727, 268575431, 1889682836, 862602327, -2110323671, 806087829, 274635845}, 14 - android.text.TextUtils.getOffsetBefore(str2, 0), objArr28);
                            try {
                                java.lang.Object[] objArr29 = {cls10.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(context, null), 64};
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                a(new int[]{144381782, 235520346, -38761329, 1963999493, -252635234, -1224527276, -176245306, -159983906, 717232618, -860385236, 268575431, 1889682836, -45808100, -192982297, 296463230, -168667678, 43098144, -1623768740}, 34 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr30);
                                java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                a(new int[]{1762469018, -386574727, 268575431, 1889682836, -772089392, -1936105507, -1289337599, 592973318}, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, objArr31);
                                java.lang.Object invoke2 = cls11.getMethod(((java.lang.String) objArr31[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr29);
                                int i21 = 0;
                                loop3: while (true) {
                                    if (i21 >= i13) {
                                        break;
                                    }
                                    java.nio.LongBuffer longBuffer2 = longBufferArr[i21];
                                    if (longBuffer2.capacity() == 4) {
                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                        a(new int[]{4308392, 1298933883, 118160903, -111359256}, 8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr32);
                                        intern = ((java.lang.String) objArr32[0]).intern();
                                        i4 = 0;
                                    } else {
                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                        c(",\u001e㖷", 2 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (8 - android.text.TextUtils.indexOf(str2, str2)), objArr33);
                                        i4 = 0;
                                        intern = ((java.lang.String) objArr33[0]).intern();
                                    }
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    c("\u0002.\u0010\u0004\u0007\u0015\u0013 \u0007\u0003-/\u0010-/ !\u000b\"\u001e\u0003\u000b\u0012\u0002\n\u0012%\u0002#\u0003", android.view.View.MeasureSpec.makeMeasureSpec(i4, i4) + 30, (byte) (50 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr34);
                                    java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr34[0]).intern());
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    c("\u0015\u0013\t.\u000b\u0004\t\u0000\u0013\u0018", android.view.View.MeasureSpec.getSize(0) + 10, (byte) (android.view.View.resolveSize(0, 0) + 14), objArr35);
                                    java.lang.Object[] objArr36 = (java.lang.Object[]) cls12.getField(((java.lang.String) objArr35[0]).intern()).get(invoke2);
                                    int length4 = objArr36.length;
                                    int i22 = 0;
                                    while (i22 < length4) {
                                        java.lang.Object obj9 = objArr36[i22];
                                        try {
                                            java.lang.Object obj10 = invoke2;
                                            int i23 = i13;
                                            java.lang.Object[] objArr37 = objArr36;
                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                            a(new int[]{1232007644, -1976241722, 1173619295, 1344080940, 1417241453, 1633922105, -1544569273, 451656626, -721219415, 1264340669, 1250363011, 363777616, -557691990, -27378809}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 27, objArr38);
                                            java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr38[0]).intern());
                                            int i24 = length4;
                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                            c("\n\u0012, /\u0017\u0004\u000b-\t㙞", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (byte) (96 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr39);
                                            java.lang.Object invoke3 = cls13.getMethod(((java.lang.String) objArr39[0]).intern(), java.lang.String.class).invoke(null, intern);
                                            try {
                                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                c("\u0002.\u0010\u0004\u0007\u0015\u0013 \u0007\u0003-/\u0010-/ !\u000b \u001a\u0012\u0007.\u0002*\u000b\u0003\u0010", 28 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 125), objArr40);
                                                java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr40[0]).intern());
                                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                c("*\u0004\u0005+-\u0012\u0017\u0000\u0003\u0005㙝", 10 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (122 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)), objArr41);
                                                java.lang.Object invoke4 = cls14.getMethod(((java.lang.String) objArr41[0]).intern(), null).invoke(obj9, null);
                                                SdkCoreCardRiskManagementDataImpl = (getMchipCvmIssuerOptions + 69) % 128;
                                                try {
                                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                    a(new int[]{1232007644, -1976241722, 1173619295, 1344080940, 1417241453, 1633922105, -1544569273, 451656626, -721219415, 1264340669, 1250363011, 363777616, -557691990, -27378809}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27, objArr42);
                                                    java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                                    c("\u0013\u000f\n\u0012\u0019/", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 6, (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 109), objArr43);
                                                    if (java.nio.ByteBuffer.wrap((byte[]) cls15.getMethod(((java.lang.String) objArr43[0]).intern(), byte[].class).invoke(invoke3, invoke4)).asLongBuffer().equals(longBuffer2.rewind())) {
                                                        break loop3;
                                                    }
                                                    i22++;
                                                    invoke2 = obj10;
                                                    objArr36 = objArr37;
                                                    i13 = i23;
                                                    length4 = i24;
                                                } catch (java.lang.Throwable th6) {
                                                    java.lang.Throwable cause6 = th6.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th6;
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                java.lang.Throwable cause7 = th7.getCause();
                                                if (cause7 != null) {
                                                    throw cause7;
                                                }
                                                throw th7;
                                            }
                                        } catch (java.lang.Throwable th8) {
                                            java.lang.Throwable cause8 = th8.getCause();
                                            if (cause8 != null) {
                                                throw cause8;
                                            }
                                            throw th8;
                                        }
                                    }
                                    i21++;
                                }
                            } catch (java.lang.Throwable th9) {
                                java.lang.Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (java.lang.Throwable th10) {
                            java.lang.Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (java.lang.Throwable th11) {
                        java.lang.Throwable cause11 = th11.getCause();
                        if (cause11 != null) {
                            throw cause11;
                        }
                        throw th11;
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
            java.lang.Object[] objArr44 = {new int[1], new int[1], new int[1]};
            ((int[]) objArr44[0])[0] = i9;
            ((int[]) objArr44[1])[0] = i9 ^ 2;
            int i25 = ~(633226342 | i9);
            java.lang.Object[] objArr45 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf(((1245816856 | i25) * (-814)) + 599437698 + ((i25 | (~((~i9) | (-1263265819))) | 615777380) * 407) + (((~((-633226343) | i9)) | 615777380 | (~(1263265818 | i9))) * 407))};
            java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj11 == null) {
                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, 2713 - android.graphics.Color.red(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                byte b17 = $$a[14];
                byte b18 = (byte) (b17 + 1);
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                b(b18, b18, (byte) (-b17), objArr46);
                obj11 = cls16.getMethod((java.lang.String) objArr46[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
            }
            ((int[]) objArr44[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr45)).intValue();
            return objArr44;
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause12 = th12.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th12;
        }
    }
}
