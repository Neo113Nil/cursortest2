package com.daon.face.quality;

/* loaded from: classes7.dex */
public class DaonFaceQuality implements java.io.Closeable {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private int Exposure;
    private boolean ExposurePass;
    private float EyesFoundConfidence;
    private boolean EyesFoundPass;
    private float EyesOpenConfidence;
    private boolean EyesOpenPass;
    private int FaceBoxLowerRightCornerX;
    private int FaceBoxLowerRightCornerY;
    private int FaceBoxUpperLeftCornerX;
    private int FaceBoxUpperLeftCornerY;
    private int FaceCntrPositionX;
    private int FaceCntrPositionY;
    private float FaceContinuityConfidence;
    private boolean FaceContinuityPass;
    private float FaceFoundConfidence;
    private boolean FaceFoundPass;
    private float FrontalPoseConfidence;
    private boolean FrontalPosePass;
    private boolean GlobalFaceQualityPass;
    private float GlobalFaceQualityScore;
    private int GrayscaleDensity;
    private boolean GrayscaleDensityPass;
    private int InterEyesDistance;
    private boolean InterEyesDistancePass;
    private int LeftEyePositionX;
    private int LeftEyePositionY;
    private float OnlyOneFaceConfidence;
    private boolean OnlyOneFacePass;
    private int PoseAngleRoll;
    private boolean PoseAngleRollPass;
    private float ProcessingTimePerFrame;
    private boolean ProcessingTimePerFramePass;
    private int RightEyePositionX;
    private int RightEyePositionY;
    private int Sharpness;
    private boolean SharpnessPass;
    private float UniformLightingConfidence;
    private boolean UniformLightingPass;
    private long obj_ptr;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = 108 - i2;
        byte[] bArr = $$a;
        int i5 = 105 - i;
        byte[] bArr2 = new byte[s + 6];
        int i6 = s + 5;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = (i5 + (-i8)) - 5;
            i3 = i9;
            int i11 = i7;
            i4 = i10;
            i5 = i11;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            int i12 = i5 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i12];
            int i13 = i4;
            i7 = i12;
            i5 = i13;
            int i102 = (i5 + (-i8)) - 5;
            i3 = i9;
            int i112 = i7;
            i4 = i102;
            i5 = i112;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            int i122 = i5 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i9 = i3 + 1;
            int i1222 = i5 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2 = (s * 2) + 103;
        int i3 = 4 - (s2 * 4);
        int i4 = b * 2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4 + 35];
        int i5 = i4 + 34;
        if (bArr == null) {
            i2 = i5;
            int i6 = i3;
            int i7 = 0;
            i2 = (i2 + (-i3)) - 3;
            i3 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            i6 = i3;
            i3 = bArr[i3];
            i7 = i8;
            i2 = (i2 + (-i3)) - 3;
            i3 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    private native long createJNI(android.content.res.AssetManager assetManager, java.lang.String str, boolean z, boolean z2) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getMinFaceDetectionSizeJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native int getThresholdExposureJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdEyesFoundConfidenceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdEyesOpenConfidenceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdFaceConfidenceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdFaceContinuityConfidenceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdFrontalPoseConfidenceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdGlobalFaceQualityScoreJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native int getThresholdGrayscaleDensityJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native int getThresholdInterEyesDistanceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdOnlyOneFaceConfidenceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdProcessingTimePerFrameJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native int getThresholdRollAngleInDegreesJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native int getThresholdSharpnessJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native float getThresholdUniformLightingConfidenceJNI(long j) throws com.daon.face.quality.DaonFaceQualityException;

    private native void loadConfigXMLJNI(long j, android.content.res.AssetManager assetManager, java.lang.String str) throws com.daon.face.quality.DaonFaceQualityException;

    private native void processFrameJNI(long j, byte[] bArr, int i, int i2, int i3, int i4, boolean z) throws com.daon.face.quality.DaonFaceQualityException;

    private native void releaseJNI(long j);

    private native void setMinFaceDetectionSizeJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdExposureJNI(long j, int i) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdEyesFoundConfidenceJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdEyesOpenConfidenceJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdFaceConfidenceJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdFaceContinuityConfidenceJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdFrontalPoseConfidenceJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdGlobalFaceQualityScoreJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdGrayscaleDensityJNI(long j, int i) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdInterEyesDistanceJNI(long j, int i) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdOnlyOneFaceConfidenceJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdProcessingTimePerFrameJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdRollAngleInDegreesJNI(long j, int i) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdSharpnessJNI(long j, int i) throws com.daon.face.quality.DaonFaceQualityException;

    private native void setThresholdUniformLightingConfidenceJNI(long j, float f) throws com.daon.face.quality.DaonFaceQualityException;

    public static native java.lang.String version();

    static {
        byte[] bArr = {75, 66, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -71, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
        $$d = bArr;
        $$e = 34;
        byte[] bArr2 = {org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -98, 13, 63, 42, -3, -2, -5, -55, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -41, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -42, -38, -3, 4, -10, 2, -3, -20, com.google.common.base.Ascii.GS, -40, 2, -11, 6, -9, 3, 4, -26, 16, 46, -67, 6, -18, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -26, -46, 6, -23, -5, -3, -20, 44, -46, 6, -23, -5, 34, -40, 9, -8, -6, -18, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, -8, 9, -8, 19, -34, 2, -21, com.google.common.base.Ascii.FF, -22, -12, 68};
        $$a = bArr2;
        $$b = 161;
        byte b = bArr2[9];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) 102, b, (byte) (b - 4), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = com.daon.face.quality.DaonFaceQuality.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 349 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, -1487372436, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -1487372436};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char c = (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 45285);
                int maxKeyCode = (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE;
                int threadPriority = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 3;
                byte b2 = bArr[14];
                byte b3 = b2;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b2, b3, b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, maxKeyCode, threadPriority, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.text.TextUtils.indexOf("", "") + 15771), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 104, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r12}, new int[]{r10}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int nextInt = new java.util.Random().nextInt(587669619);
                int i4 = i + (-1768152996) + (((~((-1010233473) | nextInt)) | (-10670625)) * (-964)) + (((~((~nextInt) | (-1010233473))) | 1007952000) * (-964));
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr6[3])[0] = i6 ^ (i6 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) 97, bArr2[16], (byte) (-bArr2[21]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    byte b4 = bArr2[16];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((byte) 81, b4, (byte) (b4 | 13), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((byte) 61, bArr2[16], (byte) (-bArr2[58]), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr2[12], (byte) (-bArr2[7]), bArr2[9], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((byte) 37, bArr2[16], bArr2[41], objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((byte) (-bArr2[37]), (byte) (-bArr2[7]), (byte) (-bArr2[42]), objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.daon.face.quality.DaonFaceQuality.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a((byte) (-bArr2[58]), (byte) 0, (byte) (-bArr2[7]), objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                        return;
                    }
                    byte b5 = (byte) 0;
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a(b5, b5, bArr2[14], objArr14);
                    java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                    declaredMethod2.setAccessible(true);
                    declaredMethod2.invoke(invoke, invoke2, str);
                    return;
                } catch (java.lang.reflect.InvocationTargetException e) {
                    java.lang.Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
            if (strArr2 != null) {
                for (java.lang.String str2 : strArr2) {
                    arrayList.add(str2);
                }
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }

    public void setThresholdUniformLightingConfidence(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdUniformLightingConfidenceJNI(j, f);
    }

    public void setThresholdSharpness(int i) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdSharpnessJNI(j, i);
    }

    public void setThresholdRollAngleInDegrees(int i) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdRollAngleInDegreesJNI(j, i);
    }

    public void setThresholdProcessingTimePerFrame(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdProcessingTimePerFrameJNI(j, f);
    }

    public void setThresholdOnlyOneFaceConfidence(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdOnlyOneFaceConfidenceJNI(j, f);
    }

    public void setThresholdInterEyesDistance(int i) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdInterEyesDistanceJNI(j, i);
    }

    public void setThresholdGrayscaleDensity(int i) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdGrayscaleDensityJNI(j, i);
    }

    public void setThresholdGlobalFaceQualityScore(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdGlobalFaceQualityScoreJNI(j, f);
    }

    public void setThresholdFrontalPoseConfidence(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdFrontalPoseConfidenceJNI(j, f);
    }

    public void setThresholdFaceContinuityConfidence(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdFaceContinuityConfidenceJNI(j, f);
    }

    public void setThresholdFaceConfidence(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdFaceConfidenceJNI(j, f);
    }

    public void setThresholdEyesOpenConfidence(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdEyesOpenConfidenceJNI(j, f);
    }

    public void setThresholdEyesFoundConfidence(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdEyesFoundConfidenceJNI(j, f);
    }

    public void setThresholdExposure(int i) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setThresholdExposureJNI(j, i);
    }

    public void setMinFaceDetectionSize(float f) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        setMinFaceDetectionSizeJNI(j, f);
    }

    public void loadConfigXML(java.lang.String str) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        loadConfigXMLJNI(j, null, str);
    }

    public void loadConfigXML(android.content.res.AssetManager assetManager, java.lang.String str) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        loadConfigXMLJNI(j, assetManager, str);
    }

    public boolean isUniformLightingPass() {
        return this.UniformLightingPass;
    }

    public boolean isSharpnessPass() {
        return this.SharpnessPass;
    }

    public boolean isProcessingTimePerFramePass() {
        return this.ProcessingTimePerFramePass;
    }

    public boolean isPoseAngleRollPass() {
        return this.PoseAngleRollPass;
    }

    public boolean isOnlyOneFacePass() {
        return this.OnlyOneFacePass;
    }

    public boolean isInterEyesDistancePass() {
        return this.InterEyesDistancePass;
    }

    public boolean isGrayscaleDensityPass() {
        return this.GrayscaleDensityPass;
    }

    public boolean isGlobalFaceQualityPass() {
        return this.GlobalFaceQualityPass;
    }

    public boolean isFrontalPosePass() {
        return this.FrontalPosePass;
    }

    public boolean isFaceFoundPass() {
        return this.FaceFoundPass;
    }

    public boolean isFaceContinuityPass() {
        return this.FaceContinuityPass;
    }

    public boolean isEyesOpenPass() {
        return this.EyesOpenPass;
    }

    public boolean isEyesFoundPass() {
        return this.EyesFoundPass;
    }

    public boolean isExposurePass() {
        return this.ExposurePass;
    }

    public float getUniformLightingConfidence() {
        return this.UniformLightingConfidence;
    }

    public float getThresholdUniformLightingConfidence() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdUniformLightingConfidenceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public int getThresholdSharpness() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdSharpnessJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public int getThresholdRollAngleInDegrees() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdRollAngleInDegreesJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdProcessingTimePerFrame() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdProcessingTimePerFrameJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdOnlyOneFaceConfidence() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdOnlyOneFaceConfidenceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public int getThresholdInterEyesDistance() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdInterEyesDistanceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public int getThresholdGrayscaleDensity() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdGrayscaleDensityJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdGlobalFaceQualityScore() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdGlobalFaceQualityScoreJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdFrontalPoseConfidence() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdFrontalPoseConfidenceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdFaceContinuityConfidence() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdFaceContinuityConfidenceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdFaceConfidence() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdFaceConfidenceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdEyesOpenConfidence() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdEyesOpenConfidenceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public float getThresholdEyesFoundConfidence() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdEyesFoundConfidenceJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public int getThresholdExposure() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getThresholdExposureJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public int getSharpness() {
        return this.Sharpness;
    }

    public int getRightEyePositionY() {
        return this.RightEyePositionY;
    }

    public int getRightEyePositionX() {
        return this.RightEyePositionX;
    }

    public float getProcessingTimePerFrame() {
        return this.ProcessingTimePerFrame;
    }

    public int getPoseAngleRoll() {
        return this.PoseAngleRoll;
    }

    public float getOnlyOneFaceConfidence() {
        return this.OnlyOneFaceConfidence;
    }

    public float getMinFaceDetectionSize() throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j != 0) {
            return getMinFaceDetectionSizeJNI(j);
        }
        throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
    }

    public int getLeftEyePositionY() {
        return this.LeftEyePositionY;
    }

    public int getLeftEyePositionX() {
        return this.LeftEyePositionX;
    }

    public int getInterEyesDistance() {
        return this.InterEyesDistance;
    }

    public int getGrayscaleDensity() {
        return this.GrayscaleDensity;
    }

    public float getGlobalFaceQualityScore() {
        return this.GlobalFaceQualityScore;
    }

    public float getFrontalPoseConfidence() {
        return this.FrontalPoseConfidence;
    }

    public float getFaceFoundConfidence() {
        return this.FaceFoundConfidence;
    }

    public float getFaceContinuityConfidence() {
        return this.FaceContinuityConfidence;
    }

    public int getFaceCntrPositionY() {
        return this.FaceCntrPositionY;
    }

    public int getFaceCntrPositionX() {
        return this.FaceCntrPositionX;
    }

    public int getFaceBoxUpperLeftCornerY() {
        return this.FaceBoxUpperLeftCornerY;
    }

    public int getFaceBoxUpperLeftCornerX() {
        return this.FaceBoxUpperLeftCornerX;
    }

    public int getFaceBoxLowerRightCornerY() {
        return this.FaceBoxLowerRightCornerY;
    }

    public int getFaceBoxLowerRightCornerX() {
        return this.FaceBoxLowerRightCornerX;
    }

    public float getEyesOpenConfidence() {
        return this.EyesOpenConfidence;
    }

    public float getEyesFoundConfidence() {
        return this.EyesFoundConfidence;
    }

    public int getExposure() {
        return this.Exposure;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.obj_ptr;
        if (j == 0) {
            return;
        }
        releaseJNI(j);
        this.obj_ptr = 0L;
    }

    public void ProcessFrame(byte[] bArr, int i, int i2, int i3, int i4, boolean z) throws com.daon.face.quality.DaonFaceQualityException {
        long j = this.obj_ptr;
        if (j == 0) {
            throw new com.daon.face.quality.DaonFaceQualityException(com.daon.face.quality.DaonFaceQualityException.ERR_JNI, "release has been called on object");
        }
        processFrameJNI(j, bArr, i, i2, i3, i4, z);
    }

    public DaonFaceQuality(java.lang.String str, boolean z, boolean z2) throws com.daon.face.quality.DaonFaceQualityException {
        this.obj_ptr = 0L;
        this.obj_ptr = createJNI(null, str, z, z2);
    }

    public DaonFaceQuality(java.lang.String str, boolean z) throws com.daon.face.quality.DaonFaceQualityException {
        this.obj_ptr = 0L;
        this.obj_ptr = createJNI(null, str, z, false);
    }

    public DaonFaceQuality(android.content.res.AssetManager assetManager, boolean z) throws com.daon.face.quality.DaonFaceQualityException {
        this.obj_ptr = 0L;
        this.obj_ptr = createJNI(assetManager, "models", true, z);
    }

    public DaonFaceQuality(android.content.res.AssetManager assetManager, java.lang.String str, boolean z, boolean z2) throws com.daon.face.quality.DaonFaceQualityException {
        this.obj_ptr = 0L;
        this.obj_ptr = createJNI(assetManager, str, z, z2);
    }

    public DaonFaceQuality(android.content.res.AssetManager assetManager, java.lang.String str, boolean z) throws com.daon.face.quality.DaonFaceQualityException {
        this.obj_ptr = 0L;
        this.obj_ptr = createJNI(assetManager, str, z, false);
    }

    public DaonFaceQuality(android.content.res.AssetManager assetManager) throws com.daon.face.quality.DaonFaceQualityException {
        this.obj_ptr = 0L;
        this.obj_ptr = createJNI(assetManager, "models", true, false);
    }
}
