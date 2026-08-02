package net.idrnd.face.iad.capture;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015Jh\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\tH\u0086 ¢\u0006\u0004\b&\u0010'J\"\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000bH\u0086 ¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lnet/idrnd/face/iad/capture/NativeImageProcessor;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "rgbBuffer", "", "bitmapToRgb", "(Landroid/graphics/Bitmap;[B)Z", "", "nv21ByteArrayPointer", "", "width", "height", "rgbOutput", "", "convertNv21ToRgb", "(JII[B)V", "", "argbOutput", "convertNv21ToArgb", "(JII[I)V", "Ljava/nio/ByteBuffer;", "yBuffer", "yPixelStride", "yRowStride", "uBuffer", "uPixelStride", "uRowStride", "vBuffer", "vPixelStride", "vRowStride", "convertYuv420ToNv21", "(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIII)J", "byteArrayPointer", "byteArraySize", "copyNativeByteArray", "(JI)J", "freeNativeByteArray", "(J)V", "copyToJavaByteArray", "(JI)[B", "byteArray", "copyJavaByteArrayToNativeMemory", "([B)J", "iad-2.4.3_misnap"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes17.dex */
public final class NativeImageProcessor {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;

    /* renamed from: a, reason: collision with root package name */
    public static final net.idrnd.face.iad.capture.NativeImageProcessor f6950a;

    static {
        byte[] bArr = {41, -125, -85, 4, 1, 18, -41, 36, 1, 4, -19, com.google.common.base.Ascii.SYN, 17, -1, 0, com.google.common.base.Ascii.FF, 2, -8, 9, 2, -28, 41, 2, -1, 8, 2, -30, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, -18, 17, -8, -23, 6, -26, com.google.common.base.Ascii.CAN, 13, -7};
        $$d = bArr;
        $$e = 88;
        byte[] bArr2 = {com.google.common.base.Ascii.SI, 67, 38, 68, -14, -40, 5, 47, -38, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 41, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, 42, 38, 3, -4, 10, -2, 3, com.google.common.base.Ascii.DC4, -29, 40, -2, com.google.common.base.Ascii.VT, -6, 9, -3, -4, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -46, 67, -6, 18, -2, -52, com.google.common.base.Ascii.SUB, 46, -6, com.google.common.base.Ascii.ETB, 5, 3, com.google.common.base.Ascii.DC4, -44, 46, -6, com.google.common.base.Ascii.ETB, 5, -34, 40, -9, 8, 6, 18, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, 8, -9, 8, -19, 34, -2, com.google.common.base.Ascii.NAK, -12, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FF, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT};
        $$a = bArr2;
        $$b = 107;
        f6950a = new net.idrnd.face.iad.capture.NativeImageProcessor();
        byte b = bArr2[0];
        byte b2 = (byte) 0;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(b, (byte) (b + 2), b2, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.ClassLoader classLoader = net.idrnd.face.iad.capture.NativeImageProcessor.class.getClassLoader();
        try {
            java.lang.Object[] objArr2 = {-1395598504};
            java.lang.Object Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1284877627);
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) android.text.TextUtils.getTrimmedLength(""), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 350, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, 778736581, false, null, new java.lang.Class[]{java.lang.Integer.TYPE});
            }
            java.lang.Object[] objArr3 = {str, classLoader, false, 906521353, ((java.lang.reflect.Constructor) Camera2StreamConfigurationMap).newInstance(objArr2), 906521353};
            java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-889779310);
            if (Camera2StreamConfigurationMap2 == null) {
                char resolveSizeAndState = (char) (45285 - android.view.View.resolveSizeAndState(0, 0, 0));
                int packedPositionChild = 157 - android.widget.ExpandableListView.getPackedPositionChild(0L);
                int threadPriority = 3 - ((android.os.Process.getThreadPriority(0) + 20) >> 6);
                byte b3 = bArr[14];
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                c(b3, bArr[13], b3, objArr4);
                Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(resolveSizeAndState, packedPositionChild, threadPriority, 1475857042, false, (java.lang.String) objArr4[0], new java.lang.Class[]{java.lang.String.class, java.lang.ClassLoader.class, java.lang.Boolean.TYPE, java.lang.Integer.TYPE, (java.lang.Class) o.CoroutineDebuggingKt.getHighResolutionOutputSizeshNQ4ISI((char) (android.graphics.Color.alpha(0) + 15771), 105 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 33), java.lang.Integer.TYPE});
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
                throw null;
            }
            java.lang.Object[] objArr6 = {r0, new int[]{r12}, new int[]{r11}, new int[1]};
            int i = ((int[]) objArr5[3])[0];
            int i2 = ((int[]) objArr5[2])[0];
            int i3 = ((int[]) objArr5[1])[0];
            java.lang.String[] strArr2 = (java.lang.String[]) objArr5[0];
            int myTid = android.os.Process.myTid();
            int i4 = i + (((1254967748 + (((-106956866) | (~myTid)) * (-490))) + (((~(myTid | (-913414220))) | 806457354) * 490)) - 1130432668);
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr6[3])[0] = i6 ^ (i6 << 5);
            try {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((byte) (-bArr2[9]), bArr2[56], bArr2[6], objArr7);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(b2, bArr2[56], bArr2[102], objArr8);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b(bArr2[6], bArr2[56], bArr2[18], objArr9);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(bArr2[21], b2, (byte) (b2 | 56), objArr10);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr10[0], new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b(bArr2[43], bArr2[56], (byte) (107 & 469), objArr11);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                b((byte) (bArr2[42] - 1), b2, (byte) (b2 | com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION), objArr12);
                java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr12[0], new java.lang.Class[0]).invoke(net.idrnd.face.iad.capture.NativeImageProcessor.class, new java.lang.Object[0]);
                if (android.os.Build.VERSION.SDK_INT <= 24) {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    b(bArr2[58], bArr2[6], (byte) 92, objArr13);
                    java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod((java.lang.String) objArr13[0], cls3, cls2);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(invoke, str, invoke2);
                    return;
                }
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                b(bArr2[23], bArr2[6], (byte) (107 - 5), objArr14);
                java.lang.reflect.Method declaredMethod2 = cls.getDeclaredMethod((java.lang.String) objArr14[0], cls2, cls3);
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(invoke, invoke2, str);
            } catch (java.lang.reflect.InvocationTargetException e) {
                java.lang.Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause2 = th.getCause();
            if (cause2 == null) {
                throw th;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        byte[] bArr = $$a;
        int i5 = i2 + 103;
        int i6 = i3 + 4;
        byte[] bArr2 = new byte[21 - i];
        int i7 = 20 - i;
        if (bArr == null) {
            int i8 = i6;
            int i9 = 0;
            int i10 = i6 + i5;
            int i11 = i8 + 1;
            int i12 = i10 - 5;
            i4 = i9;
            i6 = i11;
            i5 = i12;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            byte b = bArr[i6];
            int i13 = i6;
            i6 = i5;
            i5 = b;
            i9 = i4 + 1;
            i8 = i13;
            int i102 = i6 + i5;
            int i112 = i8 + 1;
            int i122 = i102 - 5;
            i4 = i9;
            i6 = i112;
            i5 = i122;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4 = 103 - (b * 3);
        int i5 = i2 + 4;
        byte[] bArr = $$d;
        int i6 = i * 4;
        byte[] bArr2 = new byte[35 - i6];
        int i7 = 34 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i5;
            int i10 = 0;
            int i11 = (i8 + i5) - 3;
            i3 = i10;
            int i12 = i9;
            i4 = i11;
            i5 = i12;
            int i13 = i5 + 1;
            bArr2[i3] = (byte) i4;
            i10 = i3 + 1;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i14 = i4;
            i9 = i13;
            i5 = bArr[i13];
            i8 = i14;
            int i112 = (i8 + i5) - 3;
            i3 = i10;
            int i122 = i9;
            i4 = i112;
            i5 = i122;
            int i132 = i5 + 1;
            bArr2[i3] = (byte) i4;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1322 = i5 + 1;
            bArr2[i3] = (byte) i4;
            i10 = i3 + 1;
            if (i3 == i7) {
            }
        }
    }

    public final native boolean bitmapToRgb(android.graphics.Bitmap bitmap, byte[] rgbBuffer);

    public final native void convertNv21ToArgb(long nv21ByteArrayPointer, int width, int height, int[] argbOutput);

    public final native void convertNv21ToRgb(long nv21ByteArrayPointer, int width, int height, byte[] rgbOutput);

    public final native long convertYuv420ToNv21(java.nio.ByteBuffer yBuffer, int yPixelStride, int yRowStride, java.nio.ByteBuffer uBuffer, int uPixelStride, int uRowStride, java.nio.ByteBuffer vBuffer, int vPixelStride, int vRowStride, int width, int height);

    public final native long copyJavaByteArrayToNativeMemory(byte[] byteArray);

    public final native long copyNativeByteArray(long byteArrayPointer, int byteArraySize);

    public final native byte[] copyToJavaByteArray(long byteArrayPointer, int byteArraySize);

    public final native void freeNativeByteArray(long byteArrayPointer);
}
