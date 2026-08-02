package org.tensorflow.lite;

/* loaded from: classes18.dex */
public final class TensorFlowLite {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -78, com.google.common.base.Ascii.DC4, 58, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
    private static final int $$e = 179;
    private static volatile boolean Camera2StreamConfigurationMap;
    private static final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.concurrent.atomic.AtomicBoolean[] getHighSpeedVideoFpsRanges;
    private static final java.util.logging.Logger getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String[][] getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = i + 103;
        int i4 = 118 - b2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[b + 10];
        int i5 = b + 9;
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i4;
            int i9 = i8 + 1;
            int i10 = (i6 + (-i4)) - 5;
            i2 = i7;
            i3 = i10;
            i4 = i9;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i3;
            i8 = i4;
            i4 = bArr[i4];
            i7 = i2 + 1;
            i6 = i11;
            int i92 = i8 + 1;
            int i102 = (i6 + (-i4)) - 5;
            i2 = i7;
            i3 = i102;
            i4 = i92;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = s + 4;
        byte[] bArr = $$d;
        int i3 = b * 2;
        int i4 = 103 - (s2 * 2);
        byte[] bArr2 = new byte[i3 + 35];
        int i5 = i3 + 34;
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i4 = (i6 + (-i4)) - 3;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            int i8 = i + 1;
            i6 = i4;
            i4 = bArr[i2];
            i7 = i8;
            i4 = (i6 + (-i4)) - 3;
            i = i7;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    private static native void nativeDoNothing();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x043c A[Catch: UnsatisfiedLinkError -> 0x0481, TryCatch #32 {UnsatisfiedLinkError -> 0x0481, blocks: (B:82:0x0393, B:125:0x0436, B:127:0x043c, B:129:0x043d, B:204:0x0458), top: B:81:0x0393 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043d A[Catch: UnsatisfiedLinkError -> 0x0481, TryCatch #32 {UnsatisfiedLinkError -> 0x0481, blocks: (B:82:0x0393, B:125:0x0436, B:127:0x043c, B:129:0x043d, B:204:0x0458), top: B:81:0x0393 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04fa  */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v6 */
    static {
        int i;
        java.lang.String str;
        int i2;
        java.lang.ClassLoader classLoader;
        java.lang.String[][] strArr;
        java.lang.Object obj;
        boolean z;
        java.lang.Object[] objArr;
        java.lang.String[][] strArr2;
        java.lang.Object obj2;
        java.lang.String[][] strArr3;
        java.lang.Object obj3;
        java.lang.String[][] strArr4;
        java.lang.Throwable cause;
        byte[] bArr;
        java.lang.Class<?> cls;
        boolean z2;
        java.lang.String[][] strArr5;
        java.lang.Object obj4;
        java.lang.Class<?> cls2;
        java.lang.Object[] objArr2;
        java.lang.Class<?> cls3;
        byte b;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        java.lang.reflect.Method declaredMethod;
        java.util.logging.Logger logger;
        ?? sb;
        int i3;
        int i4;
        int i5;
        int i6;
        java.lang.String str2 = "";
        byte[] bArr2 = {89, 111, -120, -71, 10, -14, -10, -1, -8, 7, -11, -8, -13, 6, -2, com.visa.cbp.getEncExpo.onUnminimized, 10, 1, com.visa.cbp.getEncExpo.onUnminimized, -9, 0, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = 61;
        getHighSpeedVideoFpsRangesFor = java.util.logging.Logger.getLogger(org.tensorflow.lite.TensorFlowLite.class.getName());
        char c = '\b';
        int i7 = 1;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        a((byte) (-bArr2[8]), (byte) 114, (byte) (-bArr2[12]), objArr5);
        int i8 = 0;
        java.lang.String[][] strArr6 = {new java.lang.String[]{(java.lang.String) objArr5[0], "tensorflowlite_jni_stable"}, new java.lang.String[]{"tensorflowlite_jni_gms_client"}};
        getHighSpeedVideoSizes = strArr6;
        Camera2StreamConfigurationMap = false;
        java.lang.UnsatisfiedLinkError unsatisfiedLinkError = null;
        int i9 = 0;
        java.lang.String[][] strArr7 = strArr6;
        while (true) {
            char c2 = 2;
            if (i9 < 2) {
                java.lang.String[] strArr8 = strArr7[i9];
                int length = strArr8.length;
                java.lang.UnsatisfiedLinkError unsatisfiedLinkError2 = unsatisfiedLinkError;
                int i10 = i8;
                ?? r3 = i8;
                java.lang.String[][] strArr9 = strArr7;
                ?? r8 = strArr8;
                java.lang.String[][] strArr10 = strArr10;
                java.lang.Object obj5 = obj5;
                while (true) {
                    if (i10 >= length) {
                        str = str2;
                        c2 = c;
                        strArr10 = strArr9;
                        i2 = i7;
                        break;
                    }
                    ?? r12 = r8[i10];
                    try {
                        try {
                            classLoader = org.tensorflow.lite.TensorFlowLite.class.getClassLoader();
                        } catch (java.lang.UnsatisfiedLinkError e) {
                            e = e;
                        }
                    } catch (java.lang.UnsatisfiedLinkError e2) {
                        e = e2;
                        str = str2;
                        c2 = c;
                        strArr10 = strArr9;
                        obj5 = r8;
                        i = length;
                        r3 = r3;
                    }
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[i7];
                        objArr6[r3 == true ? 1 : 0] = -1395598504;
                        java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                        if (Camera2StreamConfigurationMap2 == null) {
                            try {
                                char maxKeyCode = (char) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                int resolveSizeAndState = android.view.View.resolveSizeAndState(r3 == true ? 1 : 0, r3 == true ? 1 : 0, r3 == true ? 1 : 0) + 349;
                                int i11 = 10 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r3 == true ? 1 : 0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r3 == true ? 1 : 0) == 0.0d ? 0 : -1));
                                java.lang.Class[] clsArr = new java.lang.Class[i7];
                                clsArr[r3 == true ? 1 : 0] = java.lang.Integer.TYPE;
                                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(maxKeyCode, resolveSizeAndState, i11, 778736581, false, null, clsArr);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                java.lang.Throwable cause2 = th.getCause();
                                if (cause2 == null) {
                                    throw th;
                                }
                                throw cause2;
                            }
                        }
                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr6);
                        try {
                            ?? r14 = new java.lang.Object[6];
                            r14[5] = -232124389;
                            r14[4] = newInstance;
                            r14[3] = -232124389;
                            r14[c2] = java.lang.Boolean.valueOf((boolean) r3);
                            r14[i7] = classLoader;
                            r14[r3 == true ? 1 : 0] = r12;
                            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                            if (Camera2StreamConfigurationMap3 == null) {
                                try {
                                    char axisFromString = (char) (android.view.MotionEvent.axisFromString(str2) + 45286);
                                    int packedPositionGroup = 158 - android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                    int lastIndexOf = android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, r3 == true ? 1 : 0, r3 == true ? 1 : 0) + 4;
                                    byte b2 = $$d[14];
                                    java.lang.Object[] objArr7 = new java.lang.Object[i7];
                                    b(b2, r7[4], b2, objArr7);
                                    java.lang.String str3 = (java.lang.String) objArr7[0];
                                    java.lang.Class[] clsArr2 = new java.lang.Class[6];
                                    clsArr2[0] = java.lang.String.class;
                                    clsArr2[i7] = java.lang.ClassLoader.class;
                                    clsArr2[2] = java.lang.Boolean.TYPE;
                                    clsArr2[3] = java.lang.Integer.TYPE;
                                    clsArr2[4] = (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - android.text.TextUtils.indexOf(str2, str2, 0, 0)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 104, android.view.KeyEvent.getDeadChar(0, 0) + 33);
                                    clsArr2[5] = java.lang.Integer.TYPE;
                                    Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(axisFromString, packedPositionGroup, lastIndexOf, 1475857042, false, str3, clsArr2);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    java.lang.Throwable cause3 = th.getCause();
                                    if (cause3 == null) {
                                        throw th;
                                    }
                                    throw cause3;
                                }
                            }
                            java.lang.Object[] objArr8 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, r14);
                            try {
                                z = false;
                            } catch (java.lang.UnsatisfiedLinkError e3) {
                                e = e3;
                                str = str2;
                                strArr = strArr9;
                                obj = r8;
                                i = length;
                                z = false;
                            }
                            try {
                                if (((int[]) objArr8[2])[0] == ((int[]) objArr8[i7])[0]) {
                                    try {
                                        objArr = new java.lang.Object[4];
                                        int[] iArr = new int[i7];
                                        objArr[i7] = iArr;
                                        int[] iArr2 = new int[i7];
                                        objArr[2] = iArr2;
                                        objArr[3] = new int[i7];
                                        int i12 = ((int[]) objArr8[3])[0];
                                        int i13 = ((int[]) objArr8[2])[0];
                                        int i14 = ((int[]) objArr8[i7])[0];
                                        java.lang.String[] strArr11 = (java.lang.String[]) objArr8[0];
                                        iArr2[0] = i13;
                                        iArr[0] = i14;
                                        int myTid = android.os.Process.myTid();
                                        int i15 = ~((-418681879) | myTid);
                                        int i16 = ~myTid;
                                        int i17 = i12 + (-1690806016) + ((i15 | (~(i16 | 602222218))) * (-1808)) + (((~((-14943235) | myTid)) | (~(i16 | 1005960862))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(myTid | (-602222219))) | 403738644 | (~(i16 | 418681878))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN);
                                        int i18 = (i17 << 13) ^ i17;
                                        int i19 = i18 ^ (i18 >>> 17);
                                        try {
                                            ((int[]) objArr[3])[0] = i19 ^ (i19 << 5);
                                            objArr[0] = strArr11;
                                            try {
                                                bArr = $$a;
                                                try {
                                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                                    a(bArr[9], (byte) 97, bArr[36], objArr9);
                                                    cls = java.lang.Class.forName((java.lang.String) objArr9[0]);
                                                    z2 = true;
                                                    try {
                                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                                        a((byte) (-bArr[10]), (byte) 81, bArr[36], objArr10);
                                                        cls2 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                                        str = str2;
                                                        z2 = true;
                                                    } catch (java.lang.UnsatisfiedLinkError e4) {
                                                        e = e4;
                                                        str = str2;
                                                    } catch (java.lang.reflect.InvocationTargetException e5) {
                                                        e = e5;
                                                    }
                                                } catch (java.lang.UnsatisfiedLinkError e6) {
                                                    e = e6;
                                                    str = str2;
                                                    strArr10 = strArr9;
                                                    obj5 = r8;
                                                    i = length;
                                                    r8 = 1;
                                                } catch (java.lang.reflect.InvocationTargetException e7) {
                                                    e = e7;
                                                }
                                            } catch (java.lang.reflect.InvocationTargetException e8) {
                                                e = e8;
                                            }
                                        } catch (java.lang.UnsatisfiedLinkError e9) {
                                            e = e9;
                                            str = str2;
                                        }
                                    } catch (java.lang.UnsatisfiedLinkError e10) {
                                        e = e10;
                                        str = str2;
                                        strArr10 = strArr9;
                                        obj5 = r8;
                                        i = length;
                                        c2 = '\b';
                                    }
                                    try {
                                        objArr2 = new java.lang.Object[1];
                                    } catch (java.lang.UnsatisfiedLinkError e11) {
                                        e = e11;
                                        strArr5 = strArr9;
                                        obj4 = r8;
                                        i = length;
                                        r8 = z2;
                                        strArr10 = strArr5;
                                        obj5 = obj4;
                                        c2 = '\b';
                                        r3 = 0;
                                        getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                        if (unsatisfiedLinkError2 == null) {
                                        }
                                        i10++;
                                        c = c2;
                                        i7 = r8;
                                        str2 = str;
                                        strArr9 = strArr10;
                                        r8 = obj5;
                                        length = i;
                                        c2 = 2;
                                        r3 = r3;
                                        strArr10 = strArr10;
                                        obj5 = obj5;
                                    } catch (java.lang.reflect.InvocationTargetException e12) {
                                        e = e12;
                                        cause = e.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                    try {
                                        a(bArr[13], (byte) $$b, bArr[36], objArr2);
                                        cls3 = java.lang.Class.forName((java.lang.String) objArr2[0]);
                                        b = bArr[20];
                                        strArr10 = strArr9;
                                        try {
                                            objArr3 = new java.lang.Object[1];
                                        } catch (java.lang.UnsatisfiedLinkError e13) {
                                            e = e13;
                                            obj5 = r8;
                                            i = length;
                                            r8 = 1;
                                            strArr10 = strArr10;
                                        } catch (java.lang.reflect.InvocationTargetException e14) {
                                            e = e14;
                                        }
                                    } catch (java.lang.UnsatisfiedLinkError e15) {
                                        e = e15;
                                        strArr2 = strArr9;
                                        obj2 = r8;
                                        strArr3 = strArr2;
                                        i = length;
                                        strArr4 = strArr3;
                                        obj3 = obj2;
                                        c2 = '\b';
                                        strArr10 = strArr4;
                                        obj5 = obj3;
                                        r8 = 1;
                                        r3 = 0;
                                        getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                        if (unsatisfiedLinkError2 == null) {
                                        }
                                        i10++;
                                        c = c2;
                                        i7 = r8;
                                        str2 = str;
                                        strArr9 = strArr10;
                                        r8 = obj5;
                                        length = i;
                                        c2 = 2;
                                        r3 = r3;
                                        strArr10 = strArr10;
                                        obj5 = obj5;
                                    } catch (java.lang.reflect.InvocationTargetException e16) {
                                        e = e16;
                                        cause = e.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                    try {
                                        a(b, bArr[24], b, objArr3);
                                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                                        byte b3 = (byte) (-bArr[50]);
                                        obj5 = r8;
                                        try {
                                            objArr4 = new java.lang.Object[1];
                                        } catch (java.lang.UnsatisfiedLinkError e17) {
                                            e = e17;
                                            r8 = 1;
                                            i = length;
                                            strArr10 = strArr10;
                                            obj5 = obj5;
                                        } catch (java.lang.reflect.InvocationTargetException e18) {
                                            e = e18;
                                        }
                                        try {
                                            a(b3, (byte) (b3 | 32), bArr[36], objArr4);
                                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                                            i = length;
                                            z2 = true;
                                            try {
                                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                try {
                                                    try {
                                                        a(bArr[21], (byte) (-bArr[49]), bArr[20], objArr11);
                                                        java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr11[0], new java.lang.Class[0]).invoke(org.tensorflow.lite.TensorFlowLite.class, new java.lang.Object[0]);
                                                        if (android.os.Build.VERSION.SDK_INT <= 24) {
                                                            try {
                                                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                                a(bArr[17], bArr[4], (byte) (-bArr[50]), objArr12);
                                                                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr12[0], cls3, cls2);
                                                                declaredMethod2.setAccessible(true);
                                                                declaredMethod2.invoke(invoke, r12, invoke2);
                                                            } catch (java.lang.UnsatisfiedLinkError e19) {
                                                                e = e19;
                                                                r3 = 0;
                                                                c2 = '\b';
                                                                r8 = 1;
                                                                getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                                if (unsatisfiedLinkError2 == null) {
                                                                }
                                                                i10++;
                                                                c = c2;
                                                                i7 = r8;
                                                                str2 = str;
                                                                strArr9 = strArr10;
                                                                r8 = obj5;
                                                                length = i;
                                                                c2 = 2;
                                                                r3 = r3;
                                                                strArr10 = strArr10;
                                                                obj5 = obj5;
                                                            }
                                                        } else {
                                                            try {
                                                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                                a(bArr[28], bArr[20], (byte) (-bArr[50]), objArr13);
                                                                declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls2, cls3);
                                                            } catch (java.lang.UnsatisfiedLinkError e20) {
                                                                e = e20;
                                                                r8 = 1;
                                                                strArr10 = strArr10;
                                                                obj5 = obj5;
                                                            } catch (java.lang.reflect.InvocationTargetException e21) {
                                                                e = e21;
                                                            }
                                                            try {
                                                                declaredMethod.setAccessible(true);
                                                                declaredMethod.invoke(invoke, invoke2, r12);
                                                            } catch (java.lang.UnsatisfiedLinkError e22) {
                                                                e = e22;
                                                                r8 = 1;
                                                                strArr10 = strArr10;
                                                                obj5 = obj5;
                                                                c2 = '\b';
                                                                r3 = 0;
                                                                getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                                if (unsatisfiedLinkError2 == null) {
                                                                }
                                                                i10++;
                                                                c = c2;
                                                                i7 = r8;
                                                                str2 = str;
                                                                strArr9 = strArr10;
                                                                r8 = obj5;
                                                                length = i;
                                                                c2 = 2;
                                                                r3 = r3;
                                                                strArr10 = strArr10;
                                                                obj5 = obj5;
                                                            } catch (java.lang.reflect.InvocationTargetException e23) {
                                                                e = e23;
                                                                cause = e.getCause();
                                                                if (cause == null) {
                                                                }
                                                            }
                                                        }
                                                        logger = getHighSpeedVideoFpsRangesFor;
                                                        sb = new java.lang.StringBuilder();
                                                        int i20 = ((int[]) objArr[3])[0];
                                                        i7 = 1;
                                                        int i21 = ((i20 * i20) - (~(-(1509700622 * i20)))) - 1;
                                                        int i22 = -(i20 * (-2035349110));
                                                        int i23 = ((i21 ^ i22) + ((i22 & i21) << 1)) - (-1442345616);
                                                        int i24 = i23 >> 25;
                                                        try {
                                                            int i25 = (((i24 | (-255)) << 1) - (i24 ^ (-255))) / 128;
                                                            int i26 = (i25 & 1) + (i25 | 1);
                                                            i3 = (i23 ^ i26) + ((i26 & i23) << 1);
                                                            i4 = (i23 >> 29) - 15;
                                                            c2 = '\b';
                                                        } catch (java.lang.UnsatisfiedLinkError e24) {
                                                            e = e24;
                                                            r8 = 1;
                                                            strArr10 = strArr10;
                                                            obj5 = obj5;
                                                            c2 = '\b';
                                                            r3 = 0;
                                                            getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                            if (unsatisfiedLinkError2 == null) {
                                                            }
                                                            i10++;
                                                            c = c2;
                                                            i7 = r8;
                                                            str2 = str;
                                                            strArr9 = strArr10;
                                                            r8 = obj5;
                                                            length = i;
                                                            c2 = 2;
                                                            r3 = r3;
                                                            strArr10 = strArr10;
                                                            obj5 = obj5;
                                                        }
                                                        try {
                                                            int i27 = i4 / 8;
                                                            int i28 = -(i3 ^ (((i27 | 1) << 1) - (i27 ^ 1)));
                                                            i5 = (i28 & 9) + (i28 | 9);
                                                            int i29 = i5 >> 17;
                                                            try {
                                                                int i30 = (((-65535) & i29) + (i29 | (-65535))) / 32768;
                                                                r8 = 1;
                                                                i2 = 1;
                                                                i6 = (i30 & 1) + (i30 | 1);
                                                            } catch (java.lang.UnsatisfiedLinkError e25) {
                                                                e = e25;
                                                                strArr10 = strArr10;
                                                                obj5 = obj5;
                                                                r8 = 1;
                                                                r3 = 0;
                                                                getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                                if (unsatisfiedLinkError2 == null) {
                                                                    unsatisfiedLinkError2 = e;
                                                                } else {
                                                                    unsatisfiedLinkError2.addSuppressed(e);
                                                                }
                                                                i10++;
                                                                c = c2;
                                                                i7 = r8;
                                                                str2 = str;
                                                                strArr9 = strArr10;
                                                                r8 = obj5;
                                                                length = i;
                                                                c2 = 2;
                                                                r3 = r3;
                                                                strArr10 = strArr10;
                                                                obj5 = obj5;
                                                            }
                                                        } catch (java.lang.UnsatisfiedLinkError e26) {
                                                            e = e26;
                                                            strArr10 = strArr10;
                                                            obj5 = obj5;
                                                            r8 = i7;
                                                            r3 = 0;
                                                            getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                            if (unsatisfiedLinkError2 == null) {
                                                            }
                                                            i10++;
                                                            c = c2;
                                                            i7 = r8;
                                                            str2 = str;
                                                            strArr9 = strArr10;
                                                            r8 = obj5;
                                                            length = i;
                                                            c2 = 2;
                                                            r3 = r3;
                                                            strArr10 = strArr10;
                                                            obj5 = obj5;
                                                        }
                                                    } catch (java.lang.reflect.InvocationTargetException e27) {
                                                        e = e27;
                                                        cause = e.getCause();
                                                        if (cause == null) {
                                                            throw e;
                                                        }
                                                        throw cause;
                                                    }
                                                } catch (java.lang.UnsatisfiedLinkError e28) {
                                                    e = e28;
                                                    strArr4 = strArr10;
                                                    obj3 = obj5;
                                                    c2 = '\b';
                                                    strArr10 = strArr4;
                                                    obj5 = obj3;
                                                    r8 = 1;
                                                    r3 = 0;
                                                    getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                    if (unsatisfiedLinkError2 == null) {
                                                    }
                                                    i10++;
                                                    c = c2;
                                                    i7 = r8;
                                                    str2 = str;
                                                    strArr9 = strArr10;
                                                    r8 = obj5;
                                                    length = i;
                                                    c2 = 2;
                                                    r3 = r3;
                                                    strArr10 = strArr10;
                                                    obj5 = obj5;
                                                }
                                                try {
                                                    sb.append("21/10/2/15/22/Loaded native library: ".substring(132804 / (((-(((i6 | 1) << 1) - (i6 ^ 1))) & i5) * org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_URL_LIST)));
                                                    sb.append(r12);
                                                    logger.info(sb.toString());
                                                    r3 = 0;
                                                    break;
                                                } catch (java.lang.UnsatisfiedLinkError e29) {
                                                    e = e29;
                                                    r3 = 0;
                                                    getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                    if (unsatisfiedLinkError2 == null) {
                                                    }
                                                    i10++;
                                                    c = c2;
                                                    i7 = r8;
                                                    str2 = str;
                                                    strArr9 = strArr10;
                                                    r8 = obj5;
                                                    length = i;
                                                    c2 = 2;
                                                    r3 = r3;
                                                    strArr10 = strArr10;
                                                    obj5 = obj5;
                                                }
                                            } catch (java.lang.UnsatisfiedLinkError e30) {
                                                e = e30;
                                                strArr5 = strArr10;
                                                obj4 = obj5;
                                                r8 = z2;
                                                strArr10 = strArr5;
                                                obj5 = obj4;
                                                c2 = '\b';
                                                r3 = 0;
                                                getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                                if (unsatisfiedLinkError2 == null) {
                                                }
                                                i10++;
                                                c = c2;
                                                i7 = r8;
                                                str2 = str;
                                                strArr9 = strArr10;
                                                r8 = obj5;
                                                length = i;
                                                c2 = 2;
                                                r3 = r3;
                                                strArr10 = strArr10;
                                                obj5 = obj5;
                                            } catch (java.lang.reflect.InvocationTargetException e31) {
                                                e = e31;
                                                cause = e.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        } catch (java.lang.UnsatisfiedLinkError e32) {
                                            e = e32;
                                            strArr3 = strArr10;
                                            obj2 = obj5;
                                            i = length;
                                            strArr4 = strArr3;
                                            obj3 = obj2;
                                            c2 = '\b';
                                            strArr10 = strArr4;
                                            obj5 = obj3;
                                            r8 = 1;
                                            r3 = 0;
                                            getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                            if (unsatisfiedLinkError2 == null) {
                                            }
                                            i10++;
                                            c = c2;
                                            i7 = r8;
                                            str2 = str;
                                            strArr9 = strArr10;
                                            r8 = obj5;
                                            length = i;
                                            c2 = 2;
                                            r3 = r3;
                                            strArr10 = strArr10;
                                            obj5 = obj5;
                                        } catch (java.lang.reflect.InvocationTargetException e33) {
                                            e = e33;
                                            cause = e.getCause();
                                            if (cause == null) {
                                            }
                                        }
                                    } catch (java.lang.UnsatisfiedLinkError e34) {
                                        e = e34;
                                        strArr2 = strArr10;
                                        obj2 = r8;
                                        strArr3 = strArr2;
                                        i = length;
                                        strArr4 = strArr3;
                                        obj3 = obj2;
                                        c2 = '\b';
                                        strArr10 = strArr4;
                                        obj5 = obj3;
                                        r8 = 1;
                                        r3 = 0;
                                        getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                        if (unsatisfiedLinkError2 == null) {
                                        }
                                        i10++;
                                        c = c2;
                                        i7 = r8;
                                        str2 = str;
                                        strArr9 = strArr10;
                                        r8 = obj5;
                                        length = i;
                                        c2 = 2;
                                        r3 = r3;
                                        strArr10 = strArr10;
                                        obj5 = obj5;
                                    } catch (java.lang.reflect.InvocationTargetException e35) {
                                        e = e35;
                                        cause = e.getCause();
                                        if (cause == null) {
                                        }
                                    }
                                } else {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.lang.String[] strArr12 = (java.lang.String[]) objArr8[0];
                                    if (strArr12 != null) {
                                        for (java.lang.String str4 : strArr12) {
                                            arrayList.add(str4);
                                        }
                                    }
                                    throw new java.lang.NullPointerException();
                                }
                            } catch (java.lang.UnsatisfiedLinkError e36) {
                                e = e36;
                                str = str2;
                                strArr = strArr9;
                                obj = r8;
                                i = length;
                                c2 = '\b';
                                r3 = z;
                                strArr10 = strArr;
                                obj5 = obj;
                                r8 = i7;
                                getHighSpeedVideoFpsRangesFor.info("Didn't load native library: ".concat(java.lang.String.valueOf((java.lang.Object) r12)));
                                if (unsatisfiedLinkError2 == null) {
                                }
                                i10++;
                                c = c2;
                                i7 = r8;
                                str2 = str;
                                strArr9 = strArr10;
                                r8 = obj5;
                                length = i;
                                c2 = 2;
                                r3 = r3;
                                strArr10 = strArr10;
                                obj5 = obj5;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                    i10++;
                    c = c2;
                    i7 = r8;
                    str2 = str;
                    strArr9 = strArr10;
                    r8 = obj5;
                    length = i;
                    c2 = 2;
                    r3 = r3;
                    strArr10 = strArr10;
                    obj5 = obj5;
                }
                i9++;
                c = c2;
                i7 = i2;
                unsatisfiedLinkError = unsatisfiedLinkError2;
                str2 = str;
                strArr7 = strArr10;
                i8 = r3;
            } else {
                getHighResolutionOutputSizeshNQ4ISI = unsatisfiedLinkError;
                getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean[org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.values().length];
                for (int i31 = i8; i31 < org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.values().length; i31++) {
                    getHighSpeedVideoFpsRanges[i31] = new java.util.concurrent.atomic.AtomicBoolean();
                }
                return;
            }
        }
    }

    private TensorFlowLite() {
    }

    @java.lang.Deprecated
    public static java.lang.String version() {
        return schemaVersion();
    }

    public static java.lang.String runtimeVersion(org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getHighSpeedVideoFpsRangesFor(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "runtimeVersion").runtimeVersion();
    }

    public static java.lang.String runtimeVersion() {
        return runtimeVersion(null);
    }

    public static java.lang.String schemaVersion(org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getHighSpeedVideoFpsRangesFor(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "schemaVersion").schemaVersion();
    }

    public static java.lang.String schemaVersion() {
        return schemaVersion(null);
    }

    public static void init() {
        if (Camera2StreamConfigurationMap) {
            return;
        }
        try {
            nativeDoNothing();
            Camera2StreamConfigurationMap = true;
        } catch (java.lang.UnsatisfiedLinkError e) {
            java.lang.Throwable th = getHighResolutionOutputSizeshNQ4ISI;
            if (th == null) {
                th = e;
            }
            java.lang.UnsatisfiedLinkError unsatisfiedLinkError = new java.lang.UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  ".concat(java.lang.String.valueOf(th)));
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    static class PossiblyAvailableRuntime {
        final org.tensorflow.lite.InterpreterFactoryApi Camera2StreamConfigurationMap;
        final java.lang.Exception getHighSpeedVideoFpsRangesFor;

        PossiblyAvailableRuntime(java.lang.String str, java.lang.String str2) {
            org.tensorflow.lite.InterpreterFactoryApi interpreterFactoryApi;
            java.lang.Exception e = null;
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(".InterpreterFactoryImpl");
                java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName(sb.toString()).getDeclaredConstructor(new java.lang.Class[0]);
                declaredConstructor.setAccessible(true);
                interpreterFactoryApi = (org.tensorflow.lite.InterpreterFactoryApi) declaredConstructor.newInstance(new java.lang.Object[0]);
                try {
                    if (interpreterFactoryApi != null) {
                        org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Found %s TF Lite runtime client in %s", str2, str));
                    } else {
                        org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.warning(java.lang.String.format("Failed to construct TF Lite runtime client from %s", str));
                    }
                } catch (java.lang.ClassNotFoundException e2) {
                    e = e2;
                    org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.getHighSpeedVideoFpsRangesFor = e;
                    this.Camera2StreamConfigurationMap = interpreterFactoryApi;
                } catch (java.lang.IllegalAccessException e3) {
                    e = e3;
                    org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.getHighSpeedVideoFpsRangesFor = e;
                    this.Camera2StreamConfigurationMap = interpreterFactoryApi;
                } catch (java.lang.IllegalArgumentException e4) {
                    e = e4;
                    org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.getHighSpeedVideoFpsRangesFor = e;
                    this.Camera2StreamConfigurationMap = interpreterFactoryApi;
                } catch (java.lang.InstantiationException e5) {
                    e = e5;
                    org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.getHighSpeedVideoFpsRangesFor = e;
                    this.Camera2StreamConfigurationMap = interpreterFactoryApi;
                } catch (java.lang.NoSuchMethodException e6) {
                    e = e6;
                    org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.getHighSpeedVideoFpsRangesFor = e;
                    this.Camera2StreamConfigurationMap = interpreterFactoryApi;
                } catch (java.lang.SecurityException e7) {
                    e = e7;
                    org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.getHighSpeedVideoFpsRangesFor = e;
                    this.Camera2StreamConfigurationMap = interpreterFactoryApi;
                } catch (java.lang.reflect.InvocationTargetException e8) {
                    e = e8;
                    org.tensorflow.lite.TensorFlowLite.getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
                    this.getHighSpeedVideoFpsRangesFor = e;
                    this.Camera2StreamConfigurationMap = interpreterFactoryApi;
                }
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.reflect.InvocationTargetException e9) {
                interpreterFactoryApi = null;
                e = e9;
            }
            this.getHighSpeedVideoFpsRangesFor = e;
            this.Camera2StreamConfigurationMap = interpreterFactoryApi;
        }
    }

    static class RuntimeFromSystem {
        static final org.tensorflow.lite.TensorFlowLite.PossiblyAvailableRuntime getHighSpeedVideoFpsRangesFor = new org.tensorflow.lite.TensorFlowLite.PossiblyAvailableRuntime("com.google.android.gms.tflite", "system");

        private RuntimeFromSystem() {
        }
    }

    static class RuntimeFromApplication {
        static final org.tensorflow.lite.TensorFlowLite.PossiblyAvailableRuntime getHighResolutionOutputSizeshNQ4ISI = new org.tensorflow.lite.TensorFlowLite.PossiblyAvailableRuntime("org.tensorflow.lite", "application");

        private RuntimeFromApplication() {
        }
    }

    static org.tensorflow.lite.InterpreterFactoryApi getHighResolutionOutputSizeshNQ4ISI(org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getHighSpeedVideoFpsRangesFor(tfLiteRuntime, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
    }

    private static org.tensorflow.lite.InterpreterFactoryApi getHighSpeedVideoFpsRangesFor(org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime tfLiteRuntime, java.lang.String str, java.lang.String str2) {
        java.lang.Exception exc;
        java.lang.String format;
        if (tfLiteRuntime == null) {
            tfLiteRuntime = org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
        }
        if (tfLiteRuntime != org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION && tfLiteRuntime != org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY) {
            exc = null;
        } else {
            if (org.tensorflow.lite.TensorFlowLite.RuntimeFromSystem.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap != null) {
                if (!getHighSpeedVideoFpsRanges[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("TfLiteRuntime.%s: Using system TF Lite runtime client from com.google.android.gms", tfLiteRuntime.name()));
                }
                return org.tensorflow.lite.TensorFlowLite.RuntimeFromSystem.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            }
            exc = org.tensorflow.lite.TensorFlowLite.RuntimeFromSystem.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
        }
        if (tfLiteRuntime == org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION || tfLiteRuntime == org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY) {
            if (org.tensorflow.lite.TensorFlowLite.RuntimeFromApplication.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap != null) {
                if (!getHighSpeedVideoFpsRanges[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    getHighSpeedVideoFpsRangesFor.info(java.lang.String.format("TfLiteRuntime.%s: Using application TF Lite runtime client from org.tensorflow.lite", tfLiteRuntime.name()));
                }
                return org.tensorflow.lite.TensorFlowLite.RuntimeFromApplication.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            }
            if (exc != null) {
                if (exc.getSuppressed().length == 0) {
                    exc.addSuppressed(org.tensorflow.lite.TensorFlowLite.RuntimeFromApplication.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
                }
            } else {
                exc = org.tensorflow.lite.TensorFlowLite.RuntimeFromApplication.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            }
        }
        int i = org.tensorflow.lite.TensorFlowLite.AnonymousClass1.getHighSpeedVideoSizes[tfLiteRuntime.ordinal()];
        if (i == 1) {
            format = java.lang.String.format("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .%s with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for %s#%s(TfLiteRuntime)).", str2, str, str2);
        } else if (i == 2) {
            format = java.lang.String.format("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .%s with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for %s#%s).", str2, str, str2);
        } else {
            format = "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java";
        }
        throw new java.lang.IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. ".concat(java.lang.String.valueOf(format)), exc);
    }

    /* renamed from: org.tensorflow.lite.TensorFlowLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[org.tensorflow.lite.InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
