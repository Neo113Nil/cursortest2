package com.miteksystems.misnap.camera.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011Jn\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001a\u0010\u001d"}, d2 = {"Lcom/miteksystems/misnap/camera/internal/CameraUtilNativeWrapper;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "channel", "", "width", "height", "rotationDegrees", "", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "frameInfos", "Landroidx/camera/core/ImageProxy;", "proxy", "Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "process", "(Ljava/nio/ByteBuffer;III[Lcom/miteksystems/misnap/core/Frame$FrameInfo;Landroidx/camera/core/ImageProxy;)Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "yBuffer", "uBuffer", "vBuffer", "yRowStride", "uvRowStride", "uvPixStride", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII[Lcom/miteksystems/misnap/core/Frame$FrameInfo;Landroidx/camera/core/ImageProxy;)Lcom/miteksystems/misnap/camera/internal/CameraFrame;", "", "a", "()Z", "imageProxy", "(Landroidx/camera/core/ImageProxy;)Lcom/miteksystems/misnap/camera/internal/CameraFrame;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CameraUtilNativeWrapper {
    private static final byte[] $$d = {3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 57, -118, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
    private static final int $$e = 56;
    private static final byte[] $$a = {82, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 113, -1, -51, 3, 57, 3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
    private static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 108 - s;
        int i3 = 104 - b;
        byte[] bArr2 = new byte[21 - s2];
        int i4 = 20 - s2;
        if (bArr == null) {
            int i5 = i3;
            int i6 = 0;
            i2 = (i2 + i3) - 5;
            i3 = i5;
            i = i6;
            bArr2[i] = (byte) i2;
            int i7 = i3 + 1;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i + 1;
            i5 = i7;
            i3 = bArr[i7];
            i6 = i8;
            i2 = (i2 + i3) - 5;
            i3 = i5;
            i = i6;
            bArr2[i] = (byte) i2;
            int i72 = i3 + 1;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            int i722 = i3 + 1;
            if (i == i4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (b * 2);
        int i5 = i * 2;
        ?? r8 = 103 - (s * 4);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[35 - i5];
        int i6 = 34 - i5;
        if (bArr == null) {
            byte b2 = r8;
            i2 = 0;
            int i7 = i4;
            int i8 = i7;
            i3 = (i4 + (-b2)) - 3;
            i4 = i8;
            int i9 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            b2 = bArr[i9];
            int i10 = i3;
            i7 = i9;
            i4 = i10;
            int i82 = i7;
            i3 = (i4 + (-b2)) - 3;
            i4 = i82;
            int i92 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3 = r8;
            int i922 = i4 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    private final native com.miteksystems.misnap.camera.internal.CameraFrame process(java.nio.ByteBuffer channel, int width, int height, int rotationDegrees, com.miteksystems.misnap.core.Frame.FrameInfo[] frameInfos, androidx.camera.core.ImageProxy proxy);

    private final native com.miteksystems.misnap.camera.internal.CameraFrame process(java.nio.ByteBuffer yBuffer, java.nio.ByteBuffer uBuffer, java.nio.ByteBuffer vBuffer, int yRowStride, int uvRowStride, int uvPixStride, int width, int height, int rotationDegrees, com.miteksystems.misnap.core.Frame.FrameInfo[] frameInfos, androidx.camera.core.ImageProxy proxy);

    /* JADX WARN: Type inference failed for: r1v24, types: [boolean, int] */
    public final /* synthetic */ boolean a() {
        try {
            byte[] bArr = $$a;
            byte b = (byte) (bArr[3] + 1);
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(b, (byte) (b | 101), (byte) (-bArr[10]), objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            java.lang.ClassLoader classLoader = com.miteksystems.misnap.camera.internal.CameraUtilNativeWrapper.class.getClassLoader();
            try {
                java.lang.Object[] objArr2 = {-1395598504};
                java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
                if (Camera2StreamConfigurationMap == null) {
                    Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.text.TextUtils.getOffsetBefore("", 0), 350 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 10 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                try {
                    java.lang.Object[] objArr3 = {str, classLoader, false, -1394528984, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), -1394528984};
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char offsetBefore = (char) (android.text.TextUtils.getOffsetBefore("", 0) + 45285);
                        int maximumDrawingCacheSize = 158 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int argb = android.graphics.Color.argb(0, 0, 0, 0) + 3;
                        byte b2 = $$d[14];
                        byte b3 = b2;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        c(b2, b3, b3, objArr4);
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(offsetBefore, maximumDrawingCacheSize, argb, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.text.TextUtils.getCapsMode("", 0, 0) + 15771), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 104, (android.os.Process.myPid() >> 22) + 33), java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr3);
                    if (((int[]) objArr5[2])[0] != ((int[]) objArr5[1])[0]) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                        if (strArr != null) {
                            for (java.lang.String str2 : strArr) {
                                arrayList.add(str2);
                            }
                        }
                        throw new java.lang.NullPointerException();
                    }
                    java.lang.Object[] objArr6 = {r6, new int[]{r13}, new int[]{r12}, new int[1]};
                    int i = ((int[]) objArr5[3])[0];
                    int i2 = ((int[]) objArr5[2])[0];
                    int i3 = ((int[]) objArr5[1])[0];
                    java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i4 = ~identityHashCode;
                    int i5 = i + (-757869426) + (((~((-139838874) | i4)) | (~(1020788127 | identityHashCode))) * (-831)) + ((~((-139722905) | identityHashCode)) * (-1662)) + (((~(identityHashCode | 139838873)) | (~(i4 | (-881065224))) | (~(881065223 | identityHashCode))) * 831);
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                    try {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b((byte) (-bArr[15]), (byte) 97, (byte) (-bArr[8]), objArr7);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        b((byte) (-bArr[15]), (byte) (bArr[0] - 1), (byte) (bArr[3] + 1), objArr8);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                        byte b4 = (byte) (-bArr[15]);
                        int i8 = $$b;
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(b4, (byte) (i8 & 127), bArr[37], objArr9);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        b(bArr[37], bArr[34], bArr[20], objArr10);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        b((byte) (-bArr[15]), (byte) (i8 & 103), bArr[42], objArr11);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                        byte b5 = bArr[37];
                        byte b6 = bArr[36];
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        b(b5, b6, (byte) (b6 & com.google.common.base.Ascii.SI), objArr12);
                        java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(com.miteksystems.misnap.camera.internal.CameraUtilNativeWrapper.class, new java.lang.Object[0]);
                        if (android.os.Build.VERSION.SDK_INT <= 24) {
                            byte b7 = (byte) (bArr[3] + 1);
                            byte b8 = bArr[57];
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(b7, b8, b8, objArr13);
                            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(invoke, str, invoke2);
                        } else {
                            byte b9 = (byte) (bArr[3] + 1);
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            b(b9, b9, bArr[22], objArr14);
                            java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(invoke, invoke2, str);
                        }
                        int i9 = ((int[]) objArr6[3])[0];
                        int i10 = i9 * i9;
                        int i11 = -(2049037113 * i9);
                        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                        int i13 = -(i9 * (-569913993));
                        int i14 = (i12 & i13) + (i13 | i12);
                        int i15 = (i14 ^ 2001673792) + ((2001673792 & i14) << 1);
                        int i16 = i15 >> 22;
                        int i17 = (((i16 | (-2047)) << 1) - (i16 ^ (-2047))) / 1024;
                        int i18 = (i15 - (~((i17 ^ 1) + ((i17 & 1) << 1)))) - 1;
                        int i19 = i15 >> 29;
                        int i20 = ((i19 & (-15)) + (i19 | (-15))) / 8;
                        int i21 = (-(i18 ^ (((i20 | 1) << 1) - (i20 ^ 1)))) + 3;
                        int i22 = i21 >> 28;
                        int i23 = ((((i22 | (-31)) << 1) - (i22 ^ (-31))) / 16) + 1;
                        return 4875 / ((i21 & (-((i23 ^ 1) + ((i23 & 1) << 1)))) * 1625);
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        java.lang.Throwable cause = e.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw e;
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause3 = th2.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th2;
            }
        } catch (java.lang.UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public final /* synthetic */ com.miteksystems.misnap.camera.internal.CameraFrame a(androidx.camera.core.ImageProxy imageProxy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageProxy, "");
        int format = imageProxy.getFormat();
        if (format != 35) {
            if (format != 256) {
                imageProxy.getFormat();
                return new com.miteksystems.misnap.camera.internal.CameraFrame(new android.util.Size(imageProxy.getWidth(), imageProxy.getHeight()), imageProxy.getFormat(), imageProxy.getImageInfo().getRotationDegrees(), new byte[0], new com.miteksystems.misnap.core.Frame.FrameInfo[]{new com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo(imageProxy.getImageInfo().getTimestamp())}, imageProxy, null, 64, null);
            }
            java.nio.ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buffer, "");
            return process(buffer, imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getImageInfo().getRotationDegrees(), new com.miteksystems.misnap.core.Frame.FrameInfo[]{new com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo(imageProxy.getImageInfo().getTimestamp())}, imageProxy);
        }
        java.nio.ByteBuffer buffer2 = imageProxy.getPlanes()[0].getBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buffer2, "");
        java.nio.ByteBuffer buffer3 = imageProxy.getPlanes()[1].getBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buffer3, "");
        java.nio.ByteBuffer buffer4 = imageProxy.getPlanes()[2].getBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buffer4, "");
        return process(buffer2, buffer3, buffer4, imageProxy.getPlanes()[0].getRowStride(), imageProxy.getPlanes()[1].getRowStride(), imageProxy.getPlanes()[1].getPixelStride(), imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getImageInfo().getRotationDegrees(), new com.miteksystems.misnap.core.Frame.FrameInfo[]{new com.miteksystems.misnap.core.Frame.FrameInfo.TimingFrameInfo(imageProxy.getImageInfo().getTimestamp())}, imageProxy);
    }
}
