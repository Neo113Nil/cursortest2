package androidx.camera.core;

/* loaded from: classes6.dex */
public final class ImageProcessingUtil {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static int Camera2StreamConfigurationMap = 0;
    public static final java.lang.String JNI_LIB_NAME = "image_processing_util_jni";

    enum Result {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = 108 - i;
        int i4 = 106 - s2;
        byte[] bArr2 = new byte[21 - s];
        int i5 = 20 - s;
        if (bArr == null) {
            int i6 = i5;
            i3 = i4;
            int i7 = 0;
            i4++;
            i3 = (i3 + i6) - 5;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i4++;
            i3 = (i3 + i6) - 5;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$d;
        int i2 = 103 - (b2 * 3);
        int i3 = b * 3;
        int i4 = 4 - (s * 3);
        byte[] bArr2 = new byte[35 - i3];
        int i5 = 34 - i3;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i4++;
            i2 = (i2 + (-i6)) - 3;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i++;
            i4++;
            i2 = (i2 + (-i6)) - 3;
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

    private static native int nativeConvertAndroid420ToABGR(java.nio.ByteBuffer byteBuffer, int i, java.nio.ByteBuffer byteBuffer2, int i2, java.nio.ByteBuffer byteBuffer3, int i3, int i4, int i5, android.view.Surface surface, java.nio.ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(java.nio.ByteBuffer byteBuffer, int i, java.nio.ByteBuffer byteBuffer2, int i2, java.nio.ByteBuffer byteBuffer3, int i3, int i4, int i5, android.graphics.Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeGetYUVImageVUOff(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2);

    public static native java.nio.ByteBuffer nativeNewDirectByteBuffer(java.nio.ByteBuffer byteBuffer, int i, int i2);

    private static native int nativeRotateYUV(java.nio.ByteBuffer byteBuffer, int i, java.nio.ByteBuffer byteBuffer2, int i2, java.nio.ByteBuffer byteBuffer3, int i3, int i4, java.nio.ByteBuffer byteBuffer4, int i5, int i6, java.nio.ByteBuffer byteBuffer5, int i7, int i8, java.nio.ByteBuffer byteBuffer6, int i9, int i10, java.nio.ByteBuffer byteBuffer7, java.nio.ByteBuffer byteBuffer8, java.nio.ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(java.nio.ByteBuffer byteBuffer, int i, java.nio.ByteBuffer byteBuffer2, int i2, java.nio.ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    private static native int nativeWriteJpegToSurface(byte[] bArr, android.view.Surface surface);

    static {
        byte[] bArr = {6, 47, 118, 18, -1, -18, 41, -36, -1, -4, 19, -22, -17, 1, 0, -12, -2, 8, -9, -2, com.google.common.base.Ascii.FS, -41, -2, 1, -8, -2, com.google.common.base.Ascii.RS, -25, -20, 18, -17, 8, com.google.common.base.Ascii.ETB, -6, com.google.common.base.Ascii.SUB, -24, -13, 7};
        $$d = bArr;
        $$e = 82;
        byte[] bArr2 = {com.google.common.base.Ascii.GS, 122, 56, com.google.common.base.Ascii.EM, 1, -37, 5, 48, -36, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 29;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a((byte) 15, (byte) 102, (byte) (29 >>> 2), objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = androidx.camera.core.ImageProcessingUtil.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap2 == null) {
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.os.Process.myTid() >> 22), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 350, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 10, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, 1645136777, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap2).newInstance(objArr2), 1645136777};
            java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap3 == null) {
                char c = (char) (45286 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int keyCodeFromString = 158 - android.view.KeyEvent.keyCodeFromString("");
                int scrollDefaultDelay = (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3;
                byte b = bArr[14];
                byte b2 = b;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                b(b, b2, b2, objArr4);
                Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, keyCodeFromString, scrollDefaultDelay, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (15771 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), 103 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32), java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr5 = (java.lang.Object[]) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3);
            if (((int[]) objArr5[2])[0] == ((int[]) objArr5[1])[0]) {
                java.lang.Object[] objArr6 = {r0, new int[]{r15}, new int[]{r13}, new int[1]};
                int i = ((int[]) objArr5[3])[0];
                int i2 = ((int[]) objArr5[2])[0];
                int i3 = ((int[]) objArr5[1])[0];
                java.lang.String[] strArr = (java.lang.String[]) objArr5[0];
                int i4 = ~((int) java.lang.Runtime.getRuntime().totalMemory());
                int i5 = i + 1859918793 + (((~((-893333537) | i4)) | (-127570561)) * (-983)) + (((~(i4 | (-127570561))) | 41976448) * 983);
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr6[3])[0] = i7 ^ (i7 << 5);
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a((byte) (-bArr2[9]), (byte) 97, (byte) (-bArr2[16]), objArr7);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                    byte b3 = (byte) (bArr2[4] - 1);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(b3, (byte) (b3 | 81), (byte) (-bArr2[16]), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    byte b4 = bArr2[6];
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(b4, (byte) (b4 | 56), (byte) (-bArr2[16]), objArr9);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(bArr2[21], bArr2[35], bArr2[6], objArr10);
                    java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a(bArr2[43], (byte) (-bArr2[5]), (byte) (-bArr2[16]), objArr11);
                    java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((byte) (29 >>> 2), bArr2[37], bArr2[6], objArr12);
                    java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(androidx.camera.core.ImageProcessingUtil.class, new java.lang.Object[0]);
                    if (android.os.Build.VERSION.SDK_INT <= 24) {
                        byte b5 = bArr2[58];
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(b5, b5, (byte) (bArr2[4] - 1), objArr13);
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(invoke, str, invoke2);
                        return;
                    }
                    byte b6 = bArr2[23];
                    byte b7 = (byte) (bArr2[4] - 1);
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    a(b6, b7, b7, objArr14);
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

    private ImageProcessingUtil() {
    }

    public static androidx.camera.core.ImageProxy convertJpegBytesToImage(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy, byte[] bArr) {
        androidx.core.util.Preconditions.checkArgument(imageReaderProxy.getImageFormat() == 256);
        androidx.core.util.Preconditions.checkNotNull(bArr);
        android.view.Surface surface = imageReaderProxy.getSurface();
        androidx.core.util.Preconditions.checkNotNull(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage == null) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return acquireLatestImage;
    }

    public static void copyBitmapToByteBuffer(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void copyByteBufferToBitmap(android.graphics.Bitmap bitmap, java.nio.ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean writeJpegBytesToSurface(android.view.Surface surface, byte[] bArr) {
        androidx.core.util.Preconditions.checkNotNull(bArr);
        androidx.core.util.Preconditions.checkNotNull(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        androidx.camera.core.Logger.e("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }

    public static boolean convertYuvToJpegBytesIntoSurface(android.media.Image image, int i, int i2, android.view.Surface surface) {
        return convertYuvToJpegBytesIntoSurface(new androidx.camera.core.AndroidImageProxy(image), i, i2, surface);
    }

    public static boolean convertYuvToJpegBytesIntoSurface(androidx.camera.core.ImageProxy imageProxy, int i, int i2, android.view.Surface surface) {
        try {
            return writeJpegBytesToSurface(surface, androidx.camera.core.internal.utils.ImageUtil.yuvImageToJpegByteArray(imageProxy, null, i, i2));
        } catch (androidx.camera.core.internal.utils.ImageUtil.CodecFailedException e) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Failed to encode YUV to JPEG", e);
            return false;
        }
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageProxy imageProxy2) {
        if (imageProxy == null || imageProxy2 == null) {
            return;
        }
        imageProxy2.close();
    }

    public static android.graphics.Bitmap convertYUVToBitmap(androidx.camera.core.ImageProxy imageProxy) {
        if (imageProxy.getFormat() != 35) {
            throw new java.lang.IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(imageProxy.getWidth(), imageProxy.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
            return createBitmap;
        }
        throw new java.lang.UnsupportedOperationException("YUV to RGB conversion failed");
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageProxy imageProxy2) {
        if (imageProxy == null || imageProxy2 == null) {
            return;
        }
        imageProxy2.close();
    }

    public static boolean isNV21FormatImage(androidx.camera.core.ImageProxy imageProxy) {
        return imageProxy.getPlanes().length == 3 && imageProxy.getPlanes()[1].getPixelStride() == 2 && nativeGetYUVImageVUOff(imageProxy.getPlanes()[2].getBuffer(), imageProxy.getPlanes()[1].getBuffer()) == -1;
    }

    static class NV21ImageProxy extends androidx.camera.core.ForwardingImageProxy {
        private final int Camera2StreamConfigurationMap;
        private final androidx.camera.core.ImageProxy.PlaneProxy[] getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;

        NV21ImageProxy(androidx.camera.core.ImageProxy imageProxy, final java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, final int i, int i2) {
            super(imageProxy);
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.ImageProxy.PlaneProxy[]{new androidx.camera.core.ImageProxy.PlaneProxy() { // from class: androidx.camera.core.ImageProcessingUtil.NV21ImageProxy.1
                @Override // androidx.camera.core.ImageProxy.PlaneProxy
                public int getPixelStride() {
                    return 1;
                }

                @Override // androidx.camera.core.ImageProxy.PlaneProxy
                public int getRowStride() {
                    return i;
                }

                @Override // androidx.camera.core.ImageProxy.PlaneProxy
                public java.nio.ByteBuffer getBuffer() {
                    return byteBuffer;
                }
            }, new androidx.camera.core.ImageProcessingUtil.NV21PlaneProxy(byteBuffer2, i), new androidx.camera.core.ImageProcessingUtil.NV21PlaneProxy(byteBuffer3, i)};
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = i2;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getHeight() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public int getWidth() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    static class NV21PlaneProxy implements androidx.camera.core.ImageProxy.PlaneProxy {
        private final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getPixelStride() {
            return 2;
        }

        NV21PlaneProxy(java.nio.ByteBuffer byteBuffer, int i) {
            this.getHighSpeedVideoFpsRangesFor = byteBuffer;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public int getRowStride() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public java.nio.ByteBuffer getBuffer() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public static boolean applyPixelShiftForYUV(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.ImageProcessingUtil.Result result;
        if (imageProxy.getFormat() != 35 || imageProxy.getPlanes().length != 3) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (nativeShiftPixel(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, width, height, pixelStride, pixelStride2, pixelStride2) != 0) {
            result = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION;
        } else {
            result = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS;
        }
        if (result != androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION) {
            return true;
        }
        androidx.camera.core.Logger.e("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    public static androidx.camera.core.ImageProxy convertYUVToRGB(final androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.impl.ImageReaderProxy imageReaderProxy, java.nio.ByteBuffer byteBuffer, int i, boolean z) {
        androidx.camera.core.ImageProcessingUtil.Result result;
        if (imageProxy.getFormat() != 35 || imageProxy.getPlanes().length != 3) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        android.view.Surface surface = imageReaderProxy.getSurface();
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        if (nativeConvertAndroid420ToABGR(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, surface, byteBuffer, width, height, z ? pixelStride : 0, z ? pixelStride2 : 0, z ? pixelStride2 : 0, i) != 0) {
            result = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION;
        } else {
            result = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS;
        }
        if (result == androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (android.util.Log.isLoggable("MH", 3)) {
            androidx.camera.core.Logger.d("ImageProcessingUtil", java.lang.String.format(java.util.Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(Camera2StreamConfigurationMap)));
            Camera2StreamConfigurationMap++;
        }
        final androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage == null) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        androidx.camera.core.SingleCloseImageProxy singleCloseImageProxy = new androidx.camera.core.SingleCloseImageProxy(acquireLatestImage);
        singleCloseImageProxy.addOnImageCloseListener(new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.ImageProcessingUtil$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
            public final void onImageClose(androidx.camera.core.ImageProxy imageProxy2) {
                androidx.camera.core.ImageProcessingUtil.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.ImageProxy.this, imageProxy);
            }
        });
        return singleCloseImageProxy;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.camera.core.ImageProxy rotateYUV(final androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.impl.ImageReaderProxy imageReaderProxy, android.media.ImageWriter imageWriter, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, int i) {
        java.lang.String str;
        if (imageProxy.getFormat() != 35 || imageProxy.getPlanes().length != 3) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        androidx.camera.core.ImageProcessingUtil.Result result = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION;
        if (i > 0) {
            int width = imageProxy.getWidth();
            int height = imageProxy.getHeight();
            int rowStride = imageProxy.getPlanes()[0].getRowStride();
            int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
            int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
            int pixelStride = imageProxy.getPlanes()[1].getPixelStride();
            android.media.Image dequeueInputImage = androidx.camera.core.internal.compat.ImageWriterCompat.dequeueInputImage(imageWriter);
            if (dequeueInputImage == null) {
                result = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION;
            } else {
                str = "ImageProcessingUtil";
                if (nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
                    result = androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION;
                } else {
                    androidx.camera.core.internal.compat.ImageWriterCompat.queueInputImage(imageWriter, dequeueInputImage);
                    result = androidx.camera.core.ImageProcessingUtil.Result.SUCCESS;
                }
                if (result != androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION) {
                    androidx.camera.core.Logger.e(str, "rotate YUV failure");
                    return null;
                }
                java.lang.String str2 = str;
                final androidx.camera.core.ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
                if (acquireLatestImage == null) {
                    androidx.camera.core.Logger.e(str2, "YUV rotation acquireLatestImage failure");
                    return null;
                }
                androidx.camera.core.SingleCloseImageProxy singleCloseImageProxy = new androidx.camera.core.SingleCloseImageProxy(acquireLatestImage);
                singleCloseImageProxy.addOnImageCloseListener(new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.ImageProcessingUtil$$ExternalSyntheticLambda1
                    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
                    public final void onImageClose(androidx.camera.core.ImageProxy imageProxy2) {
                        androidx.camera.core.ImageProcessingUtil.Camera2StreamConfigurationMap(androidx.camera.core.ImageProxy.this, imageProxy);
                    }
                });
                return singleCloseImageProxy;
            }
        }
        str = "ImageProcessingUtil";
        if (result != androidx.camera.core.ImageProcessingUtil.Result.ERROR_CONVERSION) {
        }
    }

    public static androidx.camera.core.ImageProxy rotateYUVAndConvertToNV21(androidx.camera.core.ImageProxy imageProxy, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, java.nio.ByteBuffer byteBuffer4, java.nio.ByteBuffer byteBuffer5, int i) {
        if (imageProxy.getFormat() != 35 || imageProxy.getPlanes().length != 3) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i == 0 && isNV21FormatImage(imageProxy)) {
            return null;
        }
        int i2 = i % com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        int width = i2 == 0 ? imageProxy.getWidth() : imageProxy.getHeight();
        int height = i2 == 0 ? imageProxy.getHeight() : imageProxy.getWidth();
        java.nio.ByteBuffer nativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), imageProxy.getPlanes()[0].getRowStride(), imageProxy.getPlanes()[1].getBuffer(), imageProxy.getPlanes()[1].getRowStride(), imageProxy.getPlanes()[2].getBuffer(), imageProxy.getPlanes()[2].getRowStride(), imageProxy.getPlanes()[2].getPixelStride(), byteBuffer4, width, 1, nativeNewDirectByteBuffer, width, 2, byteBuffer5, width, 2, byteBuffer, byteBuffer2, byteBuffer3, imageProxy.getWidth(), imageProxy.getHeight(), i) != 0) {
            androidx.camera.core.Logger.e("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        return new androidx.camera.core.SingleCloseImageProxy(new androidx.camera.core.ImageProcessingUtil.NV21ImageProxy(imageProxy, byteBuffer4, nativeNewDirectByteBuffer, byteBuffer5, width, height));
    }
}
