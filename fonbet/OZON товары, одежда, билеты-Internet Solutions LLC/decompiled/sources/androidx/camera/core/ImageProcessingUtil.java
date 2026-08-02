package androidx.camera.core;

import C.S;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.f;
import androidx.camera.core.impl.InterfaceC5104l0;
import java.nio.ByteBuffer;
import java.util.Locale;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes8.dex */
public final class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    private static int f38064a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f38065b = 0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR_CONVERSION;
        public static final a SUCCESS;
        public static final a UNKNOWN;

        static {
            a aVar = new a(FraudMonInfo.UNKNOWN, 0);
            UNKNOWN = aVar;
            a aVar2 = new a("SUCCESS", 1);
            SUCCESS = aVar2;
            a aVar3 = new a("ERROR_CONVERSION", 2);
            ERROR_CONVERSION = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(@NonNull p pVar) {
        if (!g(pVar)) {
            S.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = pVar.getWidth();
        int height = pVar.getHeight();
        int g10 = pVar.c0()[0].g();
        int g11 = pVar.c0()[1].g();
        int g12 = pVar.c0()[2].g();
        int h11 = pVar.c0()[0].h();
        int h12 = pVar.c0()[1].h();
        if ((nativeShiftPixel(pVar.c0()[0].f(), g10, pVar.c0()[1].f(), g11, pVar.c0()[2].f(), g12, h11, h12, width, height, h11, h12, h12) != 0 ? a.ERROR_CONVERSION : a.SUCCESS) == a.ERROR_CONVERSION) {
            S.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static p b(@NonNull u uVar, @NonNull byte[] bArr) {
        x2.i.b(uVar.b() == 256);
        bArr.getClass();
        Surface a11 = uVar.a();
        a11.getClass();
        if (nativeWriteJpegToSurface(bArr, a11) != 0) {
            S.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        p e11 = uVar.e();
        if (e11 == null) {
            S.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return e11;
    }

    @NonNull
    public static Bitmap c(@NonNull p pVar) {
        if (pVar.g() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = pVar.getWidth();
        int height = pVar.getHeight();
        int g10 = pVar.c0()[0].g();
        int g11 = pVar.c0()[1].g();
        int g12 = pVar.c0()[2].g();
        int h11 = pVar.c0()[0].h();
        int h12 = pVar.c0()[1].h();
        Bitmap createBitmap = Bitmap.createBitmap(pVar.getWidth(), pVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(pVar.c0()[0].f(), g10, pVar.c0()[1].f(), g11, pVar.c0()[2].f(), g12, h11, h12, createBitmap, createBitmap.getRowBytes(), width, height) == 0) {
            return createBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static p d(@NonNull final p pVar, @NonNull InterfaceC5104l0 interfaceC5104l0, ByteBuffer byteBuffer, int i11, boolean z11) {
        if (!g(pVar)) {
            S.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i11 != 0 && i11 != 90 && i11 != 180 && i11 != 270) {
            S.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface a11 = interfaceC5104l0.a();
        int width = pVar.getWidth();
        int height = pVar.getHeight();
        int g10 = pVar.c0()[0].g();
        int g11 = pVar.c0()[1].g();
        int g12 = pVar.c0()[2].g();
        int h11 = pVar.c0()[0].h();
        int h12 = pVar.c0()[1].h();
        if ((nativeConvertAndroid420ToABGR(pVar.c0()[0].f(), g10, pVar.c0()[1].f(), g11, pVar.c0()[2].f(), g12, h11, h12, a11, byteBuffer, width, height, z11 ? h11 : 0, z11 ? h12 : 0, z11 ? h12 : 0, i11) != 0 ? a.ERROR_CONVERSION : a.SUCCESS) == a.ERROR_CONVERSION) {
            S.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            S.a("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + f38064a);
            f38064a = f38064a + 1;
        }
        final p e11 = interfaceC5104l0.e();
        if (e11 == null) {
            S.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        v vVar = new v(e11);
        vVar.c(new f.a() { // from class: C.M
            @Override // androidx.camera.core.f.a
            public final void h(androidx.camera.core.f fVar) {
                int i12 = ImageProcessingUtil.f38065b;
                pVar.close();
            }
        });
        return vVar;
    }

    public static void e(@NonNull Bitmap bitmap, @NonNull ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i11, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void f(@NonNull Bitmap bitmap, @NonNull ByteBuffer byteBuffer, int i11) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i11, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean g(@NonNull p pVar) {
        return pVar.g() == 35 && pVar.c0().length == 3;
    }

    public static p h(@NonNull final p pVar, @NonNull InterfaceC5104l0 interfaceC5104l0, @NonNull ImageWriter imageWriter, @NonNull ByteBuffer byteBuffer, @NonNull ByteBuffer byteBuffer2, @NonNull ByteBuffer byteBuffer3, int i11) {
        String str;
        a aVar;
        a aVar2;
        if (!g(pVar)) {
            S.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (i11 != 0 && i11 != 90 && i11 != 180 && i11 != 270) {
            S.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar3 = a.ERROR_CONVERSION;
        if (i11 > 0) {
            int width = pVar.getWidth();
            int height = pVar.getHeight();
            int g10 = pVar.c0()[0].g();
            int g11 = pVar.c0()[1].g();
            int g12 = pVar.c0()[2].g();
            int h11 = pVar.c0()[1].h();
            Image dequeueInputImage = imageWriter.dequeueInputImage();
            if (dequeueInputImage == null) {
                aVar2 = aVar3;
                str = "ImageProcessingUtil";
            } else {
                aVar2 = aVar3;
                str = "ImageProcessingUtil";
                if (nativeRotateYUV(pVar.c0()[0].f(), g10, pVar.c0()[1].f(), g11, pVar.c0()[2].f(), g12, h11, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), dequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i11) != 0) {
                    aVar3 = aVar2;
                } else {
                    imageWriter.queueInputImage(dequeueInputImage);
                    aVar3 = a.SUCCESS;
                }
            }
            aVar = aVar2;
        } else {
            str = "ImageProcessingUtil";
            aVar = aVar3;
            aVar3 = aVar;
        }
        if (aVar3 == aVar) {
            S.c(str, "rotate YUV failure");
            return null;
        }
        String str2 = str;
        final p e11 = interfaceC5104l0.e();
        if (e11 == null) {
            S.c(str2, "YUV rotation acquireLatestImage failure");
            return null;
        }
        v vVar = new v(e11);
        vVar.c(new f.a() { // from class: C.N
            @Override // androidx.camera.core.f.a
            public final void h(androidx.camera.core.f fVar) {
                int i12 = ImageProcessingUtil.f38065b;
                pVar.close();
            }
        });
        return vVar;
    }

    public static void i(@NonNull byte[] bArr, @NonNull Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            S.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, int i15, Surface surface, ByteBuffer byteBuffer4, int i16, int i17, int i18, int i19, int i21, int i22);

    private static native int nativeConvertAndroid420ToBitmap(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, int i15, @NonNull Bitmap bitmap, int i16, int i17, int i18);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, boolean z11);

    private static native int nativeRotateYUV(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, @NonNull ByteBuffer byteBuffer4, int i15, int i16, @NonNull ByteBuffer byteBuffer5, int i17, int i18, @NonNull ByteBuffer byteBuffer6, int i19, int i21, @NonNull ByteBuffer byteBuffer7, @NonNull ByteBuffer byteBuffer8, @NonNull ByteBuffer byteBuffer9, int i22, int i23, int i24);

    private static native int nativeShiftPixel(@NonNull ByteBuffer byteBuffer, int i11, @NonNull ByteBuffer byteBuffer2, int i12, @NonNull ByteBuffer byteBuffer3, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21);

    private static native int nativeWriteJpegToSurface(@NonNull byte[] bArr, @NonNull Surface surface);
}
