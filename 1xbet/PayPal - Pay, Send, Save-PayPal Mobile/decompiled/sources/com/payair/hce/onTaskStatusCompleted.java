package com.payair.hce;

/* loaded from: classes4.dex */
public final class onTaskStatusCompleted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static int getPaymentFci;
    private static short[] getProfileVersion;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private byte[] valueOf;
    private java.lang.Long values;
    private byte[] writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (b * 4);
        int i5 = i * 3;
        int i6 = 104 - (i2 * 4);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i4++;
            i6 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i4++;
            i6 += i7;
            i3 = i8;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            i8 = i3 + 1;
            if (i3 == i5) {
            }
        }
    }

    public final byte[] valueOf() {
        int i = SdkCoreBusinessLogicModuleImpl + 81;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            return this.valueOf;
        }
        throw null;
    }

    public final byte[] DigitizedCardProfile() {
        int i = SdkCoreBusinessLogicModuleImpl + 55;
        getPaymentFci = i % 128;
        if (i % 2 != 0) {
            return this.AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.onTaskStatusCompleted ontaskstatuscompleted = (com.payair.hce.onTaskStatusCompleted) objArr[0];
        int i = SdkCoreBusinessLogicModuleImpl + 71;
        getPaymentFci = i % 128;
        byte[] bArr = ontaskstatuscompleted.DigitizedCardProfile;
        if (i % 2 != 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public final byte[] writeReplace() {
        int i = getPaymentFci;
        SdkCoreBusinessLogicModuleImpl = (i + 15) % 128;
        byte[] bArr = this.writeReplace;
        int i2 = i + 79;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    public final java.lang.String toString() {
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 15) % 128;
        com.payair.hce.setMaximumPinTry.valueOf();
        android.view.ViewConfiguration.getScrollBarSize();
        android.text.TextUtils.indexOf("", "");
        android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        android.view.ViewConfiguration.getKeyRepeatDelay();
        android.graphics.Color.alpha(0);
        android.view.ViewConfiguration.getScrollBarFadeDuration();
        android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        new java.lang.Object[]{null};
        android.graphics.Color.green(0);
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.text.TextUtils.indexOf("", "");
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        android.view.ViewConfiguration.getTouchSlop();
        new java.lang.Object[]{null};
        android.graphics.drawable.Drawable.resolveOpacity(0, 0);
        android.view.KeyEvent.getDeadChar(0, 0);
        android.media.AudioTrack.getMinVolume();
        android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        android.view.ViewConfiguration.getKeyRepeatDelay();
        new java.lang.Object[]{null};
        android.view.View.MeasureSpec.getSize(0);
        android.view.Gravity.getAbsoluteGravity(0, 0);
        android.view.ViewConfiguration.getMaximumFlingVelocity();
        android.view.View.resolveSizeAndState(0, 0, 0);
        android.text.TextUtils.getTrimmedLength("");
        new java.lang.Object[]{null};
        android.view.ViewConfiguration.getJumpTapTimeout();
        android.os.Process.myPid();
        android.graphics.Color.rgb(0, 0, 0);
        android.graphics.Color.rgb(0, 0, 0);
        android.view.ViewConfiguration.getDoubleTapTimeout();
        new java.lang.Object[]{this.values};
        android.view.ViewConfiguration.getMaximumFlingVelocity();
        android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        android.graphics.Color.red(0);
        android.view.ViewConfiguration.getPressedStateDuration();
        android.graphics.PointF.length(0.0f, 0.0f);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((-1515119970) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (-1491976349) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 136, (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) - 100), (short) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = getPaymentFci + 15;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            return intern;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b0, code lost:
    
        if (r10 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c6, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c4, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c2, code lost:
    
        if (r10 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int length;
        byte[] bArr;
        com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(getAid)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27, android.graphics.Color.rgb(0, 0, 0) + 16777245, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
            }
            int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (z) {
                byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                if (bArr2 != null) {
                    $11 = ($10 + 73) % 128;
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i6 = 0;
                    while (i6 < length2) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr2[i6])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                        if (obj2 == null) {
                            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.lastIndexOf("", c, 0), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5087, (char) (android.text.TextUtils.indexOf("", c, 0) + 1))).getMethod("e", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                        }
                        bArr3[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                        i6++;
                        int i7 = $11 + 35;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = IccPrivateKeyCrtComponentsJson;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 28, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29, (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L))));
                } else {
                    intValue = (short) (((short) (getProfileVersion[i2 + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (getAid ^ (-4897270311952305750L))));
                }
            }
            if (intValue > 0) {
                int i9 = $11 + 3;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    i4 = ((i2 / intValue) << 4) >> ((int) (SdkCoreAlternateContactlessPaymentDataImpl % (-4897270311952305750L)));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ (-4897270311952305750L)));
                }
                gettrack2constructiondata.writeReplace = i4 + i5;
                java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(RecordsJson), sb};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 27, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2365, (char) (android.os.Process.myTid() >> 22));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b((byte) 0, 0, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                }
                ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                if (bArr5 != null) {
                    int i10 = $10 + 15;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        bArr[i11] = (byte) (bArr5[i11] ^ (-4897270311952305750L));
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                gettrack2constructiondata.DigitizedCardProfile = 1;
                while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                    if (z2) {
                        byte[] bArr6 = IccPrivateKeyCrtComponentsJson;
                        gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                        gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                    } else {
                        short[] sArr = getProfileVersion;
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

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreBusinessLogicModuleImpl = 0;
        getPaymentFci = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = 1206513826;
        getAid = 520368590;
        RecordsJson = 1162531865;
        IccPrivateKeyCrtComponentsJson = new byte[]{118, 71, -71, -73, 122, 85, -81, -88, -113, 76, 91, -117, 75, -83, -85, -113, 92, 57, -97, -66, 113, -114, 113, 117, 91, -92, -120, 113, -126, 102, 117, com.visa.cbp.getEncExpo.registerForActivityResult, 114, 122, -104, 105, -112, 101, 9, 66, -92, -97, 70, -78, 107, -115, 81, -78, 78, -76, 71, -70, 117, -111, -69, com.google.common.base.Ascii.GS, 45, -12, 0, -39, 63, -14, com.google.common.base.Ascii.VT, -13, com.google.common.base.Ascii.FF, -13, -39, 35, -20, 74, 122, 83, -79, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 116, 93, -92, 87, -77, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 76, -89, -81, 77, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 69, -126, 36, 6, -61, 58, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -34, 41, -23, 40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -56, -39, 32, -55, 56, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -25, com.google.common.base.Ascii.DC4, -37, 37, 43, -26, -55, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 19, -48, -57, com.google.common.base.Ascii.ETB, -86, -86, -86, -86, -86, -86, -86, -86};
    }

    static void init$0() {
        $$a = new byte[]{65, -108, -120, -80};
        $$b = 126;
    }

    public final byte[] values() {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -520127426, 520127426, java.lang.System.identityHashCode(this));
    }
}
