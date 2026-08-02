package com.payair.hce;

/* loaded from: classes10.dex */
public class getContactlessMdSessionKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int getApplicationLifeCycleData;
    private static long getCvmResetTimeout;
    private static int getMchipCvmIssuerOptions;
    private static int getSecurityWord;

    @com.payair.hce.setSelectionFromTop(valueOf = "CDOL1_RelatedDataLength")
    public int AlternateContactlessPaymentDataJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "issuerApplicationData")
    public java.lang.String DigitizedCardProfile;

    @com.payair.hce.setSelectionFromTop(valueOf = "PPSE_FCI")
    public java.lang.String IccPrivateKeyCrtComponentsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "paymentFCI")
    public java.lang.String RecordsJson;

    @com.payair.hce.setSelectionFromTop(valueOf = "alternateContactlessPaymentData")
    public com.payair.hce.RequestSessionRequest SdkCoreAlternateContactlessPaymentDataImpl;

    @com.payair.hce.setSelectionFromTop(valueOf = "ICC_privateKey_dq")
    public java.lang.String SdkCoreBusinessLogicModuleImpl;

    @com.payair.hce.setSelectionFromTop(valueOf = "ICC_privateKey_q")
    public java.lang.String getAid;

    @com.payair.hce.setSelectionFromTop(valueOf = "records")
    public com.payair.hce.setDsrpMdSessionKey[] getCardLayoutDescription;

    @com.payair.hce.setSelectionFromTop(valueOf = "PIN_IV_CVC3_Track2")
    public java.lang.String getCiacDecline;

    @com.payair.hce.setSelectionFromTop(valueOf = "AID")
    public java.lang.String getCvrMaskAnd;

    @com.payair.hce.setSelectionFromTop(valueOf = "ICC_privateKey_dp")
    public java.lang.String getDualTapResetTimeout;

    @com.payair.hce.setSelectionFromTop(valueOf = "ICC_privateKey_p")
    public java.lang.String getGpoResponse;

    @com.payair.hce.setSelectionFromTop(valueOf = "CVR_MaskAnd")
    public java.lang.String getPaymentFci;

    @com.payair.hce.setSelectionFromTop(valueOf = "CIAC_DeclineOnPPMS")
    public java.lang.String getProfileVersion;

    @com.payair.hce.setSelectionFromTop(valueOf = "GPO_Response")
    public java.lang.String valueOf;

    @com.payair.hce.setSelectionFromTop(valueOf = "ICC_privateKey_a")
    public java.lang.String values;

    @com.payair.hce.setSelectionFromTop(valueOf = "CIAC_Decline")
    public java.lang.String writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 35 - (s * 34);
        int i5 = 37 - (i * 34);
        byte[] bArr = $$a;
        int i6 = (b * 653) + 65;
        char[] cArr = new char[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 = (i6 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            i5++;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i5];
            i6 = (i6 + (-i7)) - 2;
            i2 = i3;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            i5++;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            cArr[i2] = (char) i6;
            i5++;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = b + com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i4 = 4 - (i * 3);
        int i5 = s * 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4++;
            i3 += -i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i6 = bArr[i4];
            i4++;
            i3 += -i6;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11 + 75;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i3 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1891 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 3600));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, 0, (byte) 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getCvmResetTimeout ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 64, 1443 - android.graphics.Color.green(0), (char) ((android.os.Process.myPid() >> 22) + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, 0, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < charArray.length) {
            int i4 = $10 + 119;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1443, (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29682));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d((short) 0, 0, (byte) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                throw null;
            }
            cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr8 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj4 == null) {
                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 64, android.graphics.Color.blue(0) + 1443, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29681));
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                d((short) 0, 0, (byte) 0, objArr9);
                obj4 = cls4.getMethod((java.lang.String) objArr9[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void c(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        int i4 = ($10 + 65) % 128;
        $11 = i4;
        if (str != null) {
            int i5 = i4 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 97) % 128;
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i6 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i6]), java.lang.Integer.valueOf(getApplicationLifeCycleData)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 43, android.view.View.MeasureSpec.getSize(0) + 2073, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, 0, $$d[0], objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i6] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53, 3544 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
            $11 = ($10 + 7) % 128;
        }
        if (z) {
            $10 = ($11 + 117) % 128;
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 53, 3543 - android.text.TextUtils.getOffsetBefore("", 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSecurityWord = 0;
        getMchipCvmIssuerOptions = 1;
        getCvmResetTimeout = 2251019294417816115L;
        getApplicationLifeCycleData = 1889207132;
    }

    static void init$1() {
        $$d = new byte[]{3, -32, -117, 13};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 57;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0b46, code lost:
    
        com.payair.hce.getContactlessMdSessionKey.getSecurityWord = (com.payair.hce.getContactlessMdSessionKey.getMchipCvmIssuerOptions + 75) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0b4f, code lost:
    
        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r2[0])[0] = r8;
        ((int[]) r2[1])[0] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0b66, code lost:
    
        r1 = ~r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0b6d, code lost:
    
        r6 = new java.lang.Object[]{java.lang.Integer.valueOf(r37), r26, java.lang.Integer.valueOf(((((1551559057 | r3) * 764) - 822881204) + (((~(r1 | 1551559057)) | 8716910) * (-1528))) + ((1224059774 | (~(344933103 | r1))) * 764))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0ba3, code lost:
    
        if (r1 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0ba5, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0) + 2714, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
        r3 = com.payair.hce.getContactlessMdSessionKey.$$a[14];
        r4 = (byte) (r3 + 1);
        r11 = new java.lang.Object[1];
        a(r4, r4, (byte) (-r3), r11);
        r1 = r1.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0c02, code lost:
    
        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r6)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0c09, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0c0a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0c0b, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0c10, code lost:
    
        if (r2 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0c12, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0c13, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0c54, code lost:
    
        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r2[0])[0] = r8;
        ((int[]) r2[1])[0] = r8 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0c6e, code lost:
    
        r1 = ~r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0c70, code lost:
    
        r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r37), 16, java.lang.Integer.valueOf(((((~(464614663 | r8)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 873849776) + (((-1145602681) | r1) * (-216))) + (((~(r1 | 464614663)) | 1431877497) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0cad, code lost:
    
        if (r1 != null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0caf, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, 2713 - android.text.TextUtils.getOffsetBefore(r9, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        r3 = com.payair.hce.getContactlessMdSessionKey.$$a[14];
        r6 = (byte) (r3 + 1);
        r11 = new java.lang.Object[1];
        a(r6, r6, (byte) (-r3), r11);
        r1 = r1.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0d08, code lost:
    
        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r4)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0d0f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0d10, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0d11, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0d16, code lost:
    
        if (r2 != null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0d18, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0d19, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0d96 A[Catch: all -> 0x00c5, TryCatch #5 {all -> 0x00c5, blocks: (B:5:0x003c, B:7:0x0070, B:8:0x00b2, B:15:0x00e9, B:17:0x0127, B:18:0x016c, B:33:0x01ef, B:35:0x0239, B:36:0x0289, B:80:0x0d58, B:82:0x0d96, B:83:0x0de2), top: B:2:0x001c }] */
    /* JADX WARN: Type inference failed for: r1v100, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v144, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v169, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        ?? r5;
        java.lang.Object obj;
        java.lang.Integer num;
        java.lang.Object obj2;
        java.lang.Throwable th;
        int i4;
        java.lang.String str;
        java.lang.String[] strArr2 = strArr;
        int i5 = i;
        int i6 = 0;
        java.lang.String str2 = "";
        int i7 = 1;
        try {
            if (context == null) {
                getSecurityWord = (getMchipCvmIssuerOptions + 49) % 128;
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i5;
                ((int[]) objArr[1])[0] = i5;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-1125480745) | i5)) | (-771011417)) * (-964)) + 7539708 + (((~((~i5) | (-1125480745))) | 1107380256) * (-964)))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.MotionEvent.axisFromString("") + 1));
                    byte b = $$a[14];
                    byte b2 = (byte) (b + 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b2, b2, (byte) (-b), objArr3);
                    obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).intValue();
                return objArr;
            }
            if (strArr2.length == 0) {
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i5;
                ((int[]) objArr4[1])[0] = i5 ^ 4;
                int i8 = ~i5;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1879042943 | i8)) | 17449217) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 568909960 + (((~(i8 | 1195295545)) | 701196615) * (-440)) + ((1879042943 | i5) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                    byte b3 = $$a[14];
                    byte b4 = (byte) (b3 + 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(b4, b4, (byte) (-b3), objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length = strArr2.length;
            java.nio.LongBuffer[] longBufferArr = new java.nio.LongBuffer[length];
            int i9 = 0;
            while (i9 < strArr2.length) {
                java.lang.String lowerCase = strArr2[i9].toLowerCase();
                java.lang.Object[] objArr7 = new java.lang.Object[i7];
                b("粁", 19163 - android.view.View.getDefaultSize(i6, i6), objArr7);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[i6]).intern(), str2);
                int i10 = length;
                long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                long longValue2 = new java.math.BigInteger(replaceAll.substring(i6, 16), 16).longValue();
                int length2 = replaceAll.length();
                if (length2 == 32) {
                    str = str2;
                    longBufferArr[i9] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length2 != 64) {
                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr8[0])[0] = i5;
                        ((int[]) objArr8[1])[0] = i5 ^ 3;
                        int i11 = ~i5;
                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(i11 | (-942796330))) | 953695831) * (-90)) + 1339293440 + (((~(i5 | (-942796330))) | (-955907712)) * (-45)) + (((~(i11 | 953695831)) | (~(i5 | (-953695832))) | (-942796330)) * 45))};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj5 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.ImageFormat.getBitsPerPixel(0), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                            byte b5 = $$a[14];
                            byte b6 = (byte) (b5 + 1);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a(b6, b6, (byte) (-b5), objArr10);
                            obj5 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                        }
                        ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).intValue();
                        return objArr8;
                    }
                    str = str2;
                    longBufferArr[i9] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i9++;
                strArr2 = strArr;
                i5 = i;
                str2 = str;
                length = i10;
                i6 = 0;
                i7 = 1;
            }
            java.lang.String str3 = str2;
            int i12 = length;
            if (context != null) {
                i9 = i;
                str2 = str3;
                int i13 = i12;
                byte[][] bArr = new byte[i13][];
                r5 = 0;
                int i14 = 0;
                while (r5 < i13) {
                    java.nio.LongBuffer longBuffer = longBufferArr[r5];
                    if (longBuffer.capacity() == 4) {
                        getMchipCvmIssuerOptions = (getSecurityWord + 103) % 128;
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                        java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                        long[] array = longBuffer.array();
                        int length3 = array.length;
                        int i15 = 0;
                        while (true) {
                            i4 = i13;
                            if (i15 >= length3) {
                                break;
                            }
                            asLongBuffer.put(array[i15]);
                            i15++;
                            getSecurityWord = (getMchipCvmIssuerOptions + 109) % 128;
                            i13 = i4;
                        }
                        bArr[i14] = allocate.array();
                        i14++;
                    } else {
                        i4 = i13;
                    }
                    i13 = i4;
                    r5++;
                }
                int i16 = i13;
                if (i14 > 0) {
                    int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                    try {
                        java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i9 ^ currentTimeMillis), bArr, java.lang.Integer.valueOf(i14)};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                        if (obj6 == null) {
                            try {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.resolveSizeAndState(0, 0, 0), 429 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31609));
                                byte b7 = (byte) (-$$a[14]);
                                byte b8 = b7;
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(b7, b8, (byte) (b8 - 1), objArr12);
                                obj6 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj6);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr11)).longValue();
                        long j = ~longValue3;
                        long j2 = i9;
                        long j3 = ~j2;
                        num = 0;
                        long j4 = ((-317) * longValue3) + 147642891858L + (((~(j2 | (-462830383))) | j) * (-318)) + (((~(j3 | 462830382 | longValue3)) | (~(j | j2))) * 318) + (((~(j3 | j | 462830382)) | (~(462830382 | longValue3 | j2))) * 318) + 471070325;
                        int i17 = ~i9;
                        int i18 = ((((int) j4) & (((((((~((-1821352706) | i17)) | 746980096) | (~((-1036388181) | i17))) * (-1136)) - 1738041619) + ((((~((-1821352706) | i9)) | (~((-1036388181) | i9))) | (~(2110760789 | i17))) * (-568))) + ((((~(1821352705 | i17)) | (~(1036388180 | i17))) | (~((-746980097) | i9))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))) | (((int) (j4 >> 32)) & ((((((~((-1995909712) | i17)) | 541327364) | (~((-558683301) | i17))) * (-397)) + 1839771610) + (((-1471938284) | i9) * 397)))) ^ currentTimeMillis;
                        if ((i2 & 1) == 1) {
                            getSecurityWord = (getMchipCvmIssuerOptions + 105) % 128;
                            if ((i18 ^ i9) == 15) {
                                try {
                                    java.lang.Object[] objArr13 = {new int[1], new int[1], new int[1]};
                                    ((int[]) objArr13[0])[0] = i9;
                                    ((int[]) objArr13[1])[0] = i18;
                                    try {
                                        java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-645227195) | i17)) | 34881666) * (-241)) + 622439902 + (((~(i17 | (-610345529))) | 1216383300) * 241))};
                                        try {
                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj7 == null) {
                                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                byte b9 = $$a[14];
                                                byte b10 = (byte) (b9 + 1);
                                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                a(b10, b10, (byte) (-b9), objArr15);
                                                obj7 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                            }
                                            ((int[]) objArr13[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr14)).intValue();
                                            return objArr13;
                                        } catch (java.lang.Throwable th3) {
                                            th = th3;
                                            java.lang.Throwable th4 = th;
                                            java.lang.Throwable cause2 = th4.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th4;
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                    }
                                } catch (java.lang.Throwable unused) {
                                    r5 = -1347122530;
                                }
                            }
                        }
                        r5 = -1347122530;
                        int i19 = i18 ^ i9;
                        if (i19 == 0) {
                            java.lang.Object[] objArr16 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr16[0])[0] = i9;
                            ((int[]) objArr16[1])[0] = i18;
                            try {
                                java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), null, java.lang.Integer.valueOf((((~(134668353 | i17)) | (-1762126976)) * 529) + 118498594 + (((~(134668353 | i9)) | (-1761823808)) * 529))};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj8 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 2713 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    byte b11 = $$a[14];
                                    byte b12 = (byte) (b11 + 1);
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a(b12, b12, (byte) (-b11), objArr18);
                                    obj8 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                }
                                ((int[]) objArr16[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr17)).intValue();
                                return objArr16;
                            } catch (java.lang.Throwable th6) {
                                java.lang.Throwable cause3 = th6.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th6;
                            }
                        }
                        r5 = -1347122530;
                        if (i19 == 11) {
                            getMchipCvmIssuerOptions = (getSecurityWord + 85) % 128;
                            java.lang.Object[] objArr19 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr19[0])[0] = i9;
                            ((int[]) objArr19[1])[0] = i18;
                            try {
                                java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1059212375 | i17)) * (-560)) - 2126673952) + ((~((-12951593) | i9)) * (-560)) + (((~(i17 | 837279785)) | 234884182) * 560))};
                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj9 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.text.TextUtils.getTrimmedLength(str2) + 2713, (char) (android.os.Process.myPid() >> 22));
                                    byte b13 = $$a[14];
                                    byte b14 = (byte) (b13 + 1);
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    a(b14, b14, (byte) (-b13), objArr21);
                                    obj9 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                                }
                                ((int[]) objArr19[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr20)).intValue();
                                return objArr19;
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause4 = th7.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th7;
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                    }
                    java.lang.Object[] objArr22 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr22[0])[0] = i9;
                    ((int[]) objArr22[1])[0] = i9 ^ 2;
                    int i20 = ~i9;
                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((965369410 | r3) * 764) - 1600973928) + (((~(i20 | 965369410)) | 108363836) * (-1528)) + ((250974332 | (~(931122750 | i20))) * 764))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
                    if (obj == null) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 50, android.text.TextUtils.getTrimmedLength(str2) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                        byte b15 = $$a[14];
                        byte b16 = (byte) (b15 + 1);
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        a(b16, b16, (byte) (-b15), objArr24);
                        obj = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r5, obj);
                    }
                    ((int[]) objArr22[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr23)).intValue();
                    return objArr22;
                }
                r5 = -1347122530;
                num = 0;
                try {
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    c("\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 12 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, android.os.Process.getGidForName(str2) + 24, objArr25);
                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr25[0]).intern());
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    c("\u000e\u0001\u0003�\n�￩\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 161, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 17, true, 17 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr26);
                    java.lang.Object invoke = cls9.getMethod(((java.lang.String) objArr26[0]).intern(), null).invoke(context, null);
                    getSecurityWord = (getMchipCvmIssuerOptions + 67) % 128;
                    try {
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        c("\u000f\u0000\t\u000f\uffc9\uffde\n\t\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t", 162 - android.graphics.Color.argb(0, 0, 0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 12, false, 23 - android.text.TextUtils.getOffsetBefore(str2, 0), objArr27);
                        java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        c("\ufffe\u0004\u0002￫\ufffe\n\u0002\u0004\u0002\u0011￭\ufffe\u0000\b", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 160, 8 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, 14 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr28);
                        java.lang.Object invoke2 = cls10.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(context, null);
                        getSecurityWord = (getMchipCvmIssuerOptions + 35) % 128;
                        try {
                            java.lang.Object[] objArr29 = {invoke2, 64};
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            b("糚\u1ae4낽乚\ue410舧᧹럂䵐\ueb6d脿ᣔ뚒䲨\uea61聊Ί떗叧\ue948蜎ờ듦劽\ue844蘗ᰌ믱冉\uef57蕢⌱뫩", 26161 - android.graphics.Color.blue(0), objArr30);
                            java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            c("\u0007�\u0003\u0001￥\n\u0002\u000b\u0003\u0001\u0010￬�\uffff", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 161, 7 - android.os.Process.getGidForName(str2), false, android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15, objArr31);
                            java.lang.Object invoke3 = cls11.getMethod(((java.lang.String) objArr31[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr29);
                            int i21 = i16;
                            int i22 = 0;
                            loop3: while (true) {
                                if (i22 >= i21) {
                                    break;
                                }
                                java.nio.LongBuffer longBuffer2 = longBufferArr[i22];
                                if (longBuffer2.capacity() == 4) {
                                    getMchipCvmIssuerOptions = (getSecurityWord + 55) % 128;
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    c("\u0005\f\u0017\ufffa\ufff9\ufff6\ufff1", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 120, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, true, android.view.Gravity.getAbsoluteGravity(0, 0) + 7, objArr32);
                                    obj2 = objArr32[0];
                                } else {
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    c("\ufff3\u0002\u000b", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, 3 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), true, 3 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr33);
                                    obj2 = objArr33[0];
                                }
                                java.lang.String intern = ((java.lang.String) obj2).intern();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                b("糚Ɫ\uddb1軬㸈\uef41颕䦔怒ꪻ寳\u0b12둊斞ᛍ올瞻\u20f1큋腾㊖\ue3db鍪㲫\uedf4鴁乤ﾘ꣙塯", android.os.Process.getGidForName(str2) + 20664, objArr34);
                                java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr34[0]).intern());
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                b("糈圵⬒｠퍆Ꝍ箤侘⏦\uf7d7", android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 11240, objArr35);
                                java.lang.Object[] objArr36 = (java.lang.Object[]) cls12.getField(((java.lang.String) objArr35[0]).intern()).get(invoke3);
                                int length4 = objArr36.length;
                                int i23 = 0;
                                while (i23 < length4) {
                                    java.lang.Object obj10 = objArr36[i23];
                                    try {
                                        java.lang.Object[] objArr37 = {intern};
                                        java.lang.Object obj11 = invoke3;
                                        int i24 = i21;
                                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                                        c("\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ￩\u0001\u000f\u000f�\u0003\u0001￠\u0005\u0003\u0001\u000f\u0010\u0006�\u0012�ￊ\u000f", 160 - android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 21 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), false, 27 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr38);
                                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr38[0]).intern());
                                        java.lang.String str4 = intern;
                                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                                        b("糜窅灹濣方挏嫭傧不䗫䍐", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1626, objArr39);
                                        java.nio.LongBuffer[] longBufferArr2 = longBufferArr;
                                        java.lang.Object invoke4 = cls13.getMethod(((java.lang.String) objArr39[0]).intern(), java.lang.String.class).invoke(null, objArr37);
                                        try {
                                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                                            c("\n\u0000\u000e\u000b\u0005\u0000ￊ\uffff\u000b\n\u0010\u0001\n\u0010ￊ\f\tￊ\uffef\u0005\u0003\n�\u0010\u0011\u000e\u0001�", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 161, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 27, false, android.widget.ExpandableListView.getPackedPositionChild(0L) + 29, objArr40);
                                            java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr40[0]).intern());
                                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                                            b("糏즳ᘷ峷꥓\uf7dd㲐褘ퟱ᱅櫄", 46439 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr41);
                                            try {
                                                java.lang.Object[] objArr42 = {cls14.getMethod(((java.lang.String) objArr41[0]).intern(), null).invoke(obj10, null)};
                                                java.lang.Object[] objArr43 = objArr36;
                                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                c("\u0001\uffff\u0011\u000e\u0005\u0010\u0015ￊ￩\u0001\u000f\u000f�\u0003\u0001￠\u0005\u0003\u0001\u000f\u0010\u0006�\u0012�ￊ\u000f", 161 - android.view.View.combineMeasuredStates(0, 0), 22 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false, 27 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr44);
                                                java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                b("糟笉獪歏掤守", android.text.TextUtils.getCapsMode(str2, 0, 0) + 2011, objArr45);
                                                if (java.nio.ByteBuffer.wrap((byte[]) cls15.getMethod(((java.lang.String) objArr45[0]).intern(), byte[].class).invoke(invoke4, objArr42)).asLongBuffer().equals(longBuffer2.rewind())) {
                                                    break loop3;
                                                }
                                                i23++;
                                                getSecurityWord = (getMchipCvmIssuerOptions + 23) % 128;
                                                invoke3 = obj11;
                                                objArr36 = objArr43;
                                                intern = str4;
                                                longBufferArr = longBufferArr2;
                                                i21 = i24;
                                            } catch (java.lang.Throwable th9) {
                                                java.lang.Throwable cause5 = th9.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th9;
                                            }
                                        } catch (java.lang.Throwable th10) {
                                            java.lang.Throwable cause6 = th10.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th10;
                                        }
                                    } catch (java.lang.Throwable th11) {
                                        java.lang.Throwable cause7 = th11.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th11;
                                    }
                                }
                                i22++;
                                java.lang.Object[] objArr222 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr222[0])[0] = i9;
                                ((int[]) objArr222[1])[0] = i9 ^ 2;
                                int i202 = ~i9;
                                java.lang.Object[] objArr232 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((965369410 | r3) * 764) - 1600973928) + (((~(i202 | 965369410)) | 108363836) * (-1528)) + ((250974332 | (~(931122750 | i202))) * 764))};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
                                if (obj == null) {
                                }
                                ((int[]) objArr222[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr232)).intValue();
                                return objArr222;
                            }
                        } catch (java.lang.Throwable th12) {
                            java.lang.Throwable cause8 = th12.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th12;
                        }
                    } catch (java.lang.Throwable th13) {
                        java.lang.Throwable cause9 = th13.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th13;
                    }
                } catch (java.lang.Throwable th14) {
                    java.lang.Throwable cause10 = th14.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th14;
                }
            }
            try {
                java.lang.Object[] objArr46 = {new int[1], new int[1], new int[1]};
                i9 = i;
                try {
                    ((int[]) objArr46[0])[0] = i9;
                    ((int[]) objArr46[1])[0] = i9;
                    int i25 = ~i9;
                    try {
                        java.lang.Object[] objArr47 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-67776643) | i9)) | (~((-1215629341) | i25))) * 920) + 880427136 + (((~((-613086179) | i25)) | 67776642) * 920) + (((~(i25 | (-67776643))) | (~((-545309537) | i9)) | (~((-1215629341) | i9))) * 920))};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj12 == null) {
                            try {
                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, android.text.TextUtils.indexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) ((-1) - android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                byte b17 = $$a[14];
                                byte b18 = (byte) (b17 + 1);
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                a(b18, b18, (byte) (-b17), objArr48);
                                obj12 = cls16.getMethod((java.lang.String) objArr48[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                            } catch (java.lang.Throwable th15) {
                                th = th15;
                                java.lang.Throwable th16 = th;
                                java.lang.Throwable cause11 = th16.getCause();
                                if (cause11 != null) {
                                    throw cause11;
                                }
                                throw th16;
                            }
                        }
                        ((int[]) objArr46[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr47)).intValue();
                        return objArr46;
                    } catch (java.lang.Throwable th17) {
                        th = th17;
                    }
                } catch (java.lang.Throwable unused2) {
                    str2 = str3;
                    r5 = -1347122530;
                    java.lang.Object[] objArr2222 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr2222[0])[0] = i9;
                    ((int[]) objArr2222[1])[0] = i9 ^ 2;
                    int i2022 = ~i9;
                    java.lang.Object[] objArr2322 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((965369410 | r3) * 764) - 1600973928) + (((~(i2022 | 965369410)) | 108363836) * (-1528)) + ((250974332 | (~(931122750 | i2022))) * 764))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
                    if (obj == null) {
                    }
                    ((int[]) objArr2222[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2322)).intValue();
                    return objArr2222;
                }
            } catch (java.lang.Throwable unused3) {
                i9 = i;
            }
        } catch (java.lang.Throwable th18) {
            java.lang.Throwable cause12 = th18.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th18;
        }
    }
}
