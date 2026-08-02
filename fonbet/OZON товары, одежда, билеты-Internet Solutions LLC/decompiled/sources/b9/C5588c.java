package b9;

import a9.C4962a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@KeepForSdk
/* renamed from: b9.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5588c {
    @NonNull
    @KeepForSdk
    public static ByteBuffer a(@NonNull C4962a c4962a) throws R8.a {
        int c11 = c4962a.c();
        int i11 = 0;
        if (c11 != -1) {
            if (c11 == 17) {
                return (ByteBuffer) Preconditions.checkNotNull(null);
            }
            if (c11 == 35) {
                return d((Image.Plane[]) Preconditions.checkNotNull(null), c4962a.e(), c4962a.d());
            }
            if (c11 == 842094169) {
                return e((ByteBuffer) Preconditions.checkNotNull(null), false);
            }
            throw new R8.a("Unsupported image format", 13);
        }
        Bitmap bitmap = (Bitmap) Preconditions.checkNotNull(c4962a.b());
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i12 = width * height;
        int[] iArr = new int[i12];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i12);
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            int i16 = i11;
            while (i16 < width) {
                int i17 = iArr[i15];
                int i18 = i17 >> 16;
                int i19 = i17 >> 8;
                int i21 = i17 & 255;
                int i22 = i14 + 1;
                int i23 = i18 & 255;
                int i24 = i19 & 255;
                allocateDirect.put(i14, (byte) Math.min(255, ((((i21 * 25) + ((i24 * 129) + (i23 * 66))) + UserVerificationMethods.USER_VERIFY_PATTERN) >> 8) + 16));
                if (i13 % 2 == 0 && i15 % 2 == 0) {
                    int i25 = ((((i23 * 112) - (i24 * 94)) - (i21 * 18)) + UserVerificationMethods.USER_VERIFY_PATTERN) >> 8;
                    int i26 = ((((i23 * (-38)) - (i24 * 74)) + (i21 * 112)) + UserVerificationMethods.USER_VERIFY_PATTERN) >> 8;
                    int i27 = i25 + UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i28 = i26 + UserVerificationMethods.USER_VERIFY_PATTERN;
                    int i29 = i12 + 1;
                    allocateDirect.put(i12, (byte) Math.min(255, i27));
                    i12 += 2;
                    allocateDirect.put(i29, (byte) Math.min(255, i28));
                }
                i15++;
                i16++;
                i14 = i22;
            }
            i13++;
            i11 = 0;
        }
        return allocateDirect;
    }

    @NonNull
    @KeepForSdk
    public static Bitmap b(@NonNull C4962a c4962a) throws R8.a {
        int c11 = c4962a.c();
        if (c11 == -1) {
            return f((Bitmap) Preconditions.checkNotNull(c4962a.b()), 0, c4962a.e(), c4962a.d());
        }
        if (c11 == 17) {
            return c(c4962a.e(), (ByteBuffer) Preconditions.checkNotNull(null), c4962a.d(), 0);
        }
        if (c11 == 35) {
            return c(c4962a.e(), d((Image.Plane[]) Preconditions.checkNotNull(null), c4962a.e(), c4962a.d()), c4962a.d(), 0);
        }
        if (c11 != 842094169) {
            throw new R8.a("Unsupported image format", 13);
        }
        byte[] g10 = g(c4962a.e(), c4962a.d(), e((ByteBuffer) Preconditions.checkNotNull(null), true).array());
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(g10, 0, g10.length);
        return f(decodeByteArray, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public static Bitmap c(int i11, @NonNull ByteBuffer byteBuffer, int i12, int i13) throws R8.a {
        byte[] bArr;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            bArr = byteBuffer.array();
        } else {
            byteBuffer.rewind();
            int limit = byteBuffer.limit();
            byte[] bArr2 = new byte[limit];
            byteBuffer.get(bArr2, 0, limit);
            bArr = bArr2;
        }
        byte[] g10 = g(i11, i12, bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(g10, 0, g10.length);
        return f(decodeByteArray, i13, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer d(@NonNull Image.Plane[] planeArr, int i11, int i12) {
        int i13 = i11 * i12;
        int i14 = i13 / 4;
        byte[] bArr = new byte[i14 + i14 + i13];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i15 = (i13 + i13) / 4;
        boolean z11 = buffer2.remaining() == i15 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z11) {
            planeArr[0].getBuffer().get(bArr, 0, i13);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i13, 1);
            buffer3.get(bArr, i13 + 1, i15 - 1);
        } else {
            h(planeArr[0], i11, i12, bArr, 0, 1);
            h(planeArr[1], i11, i12, bArr, i13 + 1, 2);
            h(planeArr[2], i11, i12, bArr, i13, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    @NonNull
    @KeepForSdk
    public static ByteBuffer e(@NonNull ByteBuffer byteBuffer, boolean z11) {
        int i11;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i12 = limit / 6;
        ByteBuffer allocate = z11 ? ByteBuffer.allocate(limit) : ByteBuffer.allocateDirect(limit);
        int i13 = 0;
        while (true) {
            i11 = i12 * 4;
            if (i13 >= i11) {
                break;
            }
            allocate.put(i13, byteBuffer.get(i13));
            i13++;
        }
        for (int i14 = 0; i14 < i12 + i12; i14++) {
            allocate.put(i11 + i14, byteBuffer.get((i14 / 2) + ((i14 % 2) * i12) + i11));
        }
        return allocate;
    }

    @NonNull
    public static Bitmap f(@NonNull Bitmap bitmap, int i11, int i12, int i13) {
        if (i11 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i12, i13);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, i12, i13, matrix, true);
    }

    private static byte[] g(int i11, int i12, @NonNull byte[] bArr) throws R8.a {
        YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i11, i12), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e11) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new R8.a("Image conversion error from NV21 format", e11);
        }
    }

    private static final void h(Image.Plane plane, int i11, int i12, byte[] bArr, int i13, int i14) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i15 = i11 / (i12 / rowStride);
        int i16 = 0;
        for (int i17 = 0; i17 < rowStride; i17++) {
            int i18 = i16;
            for (int i19 = 0; i19 < i15; i19++) {
                bArr[i13] = buffer.get(i18);
                i13 += i14;
                i18 += plane.getPixelStride();
            }
            i16 += plane.getRowStride();
        }
    }
}
