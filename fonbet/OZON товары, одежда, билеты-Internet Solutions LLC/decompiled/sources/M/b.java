package M;

import G.j;
import G.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.p;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class b {

    public static final class a extends Exception {
    }

    @NonNull
    public static Bitmap a(@NonNull p pVar) {
        int g10 = pVar.g();
        if (g10 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(pVar.getWidth(), pVar.getHeight(), Bitmap.Config.ARGB_8888);
            pVar.c0()[0].f().rewind();
            ImageProcessingUtil.f(createBitmap, pVar.c0()[0].f(), pVar.c0()[0].g());
            return createBitmap;
        }
        if (g10 == 35) {
            return ImageProcessingUtil.c(pVar);
        }
        if (g10 != 256 && g10 != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + pVar.g() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!b(pVar.g())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + pVar.g());
        }
        ByteBuffer f7 = pVar.c0()[0].f();
        int capacity = f7.capacity();
        byte[] bArr = new byte[capacity];
        f7.rewind();
        f7.get(bArr);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static boolean b(int i11) {
        return i11 == 256 || i11 == 4101;
    }

    @NonNull
    public static byte[] c(@NonNull p pVar, Rect rect, int i11, int i12) throws a {
        if (pVar.g() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + pVar.g());
        }
        p.a aVar = pVar.c0()[0];
        p.a aVar2 = pVar.c0()[1];
        p.a aVar3 = pVar.c0()[2];
        ByteBuffer f7 = aVar.f();
        ByteBuffer f11 = aVar2.f();
        ByteBuffer f12 = aVar3.f();
        f7.rewind();
        f11.rewind();
        f12.rewind();
        int remaining = f7.remaining();
        byte[] bArr = new byte[((pVar.getHeight() * pVar.getWidth()) / 2) + remaining];
        int i13 = 0;
        for (int i14 = 0; i14 < pVar.getHeight(); i14++) {
            f7.get(bArr, i13, pVar.getWidth());
            i13 += pVar.getWidth();
            f7.position(Math.min(remaining, aVar.g() + (f7.position() - pVar.getWidth())));
        }
        int height = pVar.getHeight() / 2;
        int width = pVar.getWidth() / 2;
        int g10 = aVar3.g();
        int g11 = aVar2.g();
        int h11 = aVar3.h();
        int h12 = aVar2.h();
        byte[] bArr2 = new byte[g10];
        byte[] bArr3 = new byte[g11];
        for (int i15 = 0; i15 < height; i15++) {
            f12.get(bArr2, 0, Math.min(g10, f12.remaining()));
            f11.get(bArr3, 0, Math.min(g11, f11.remaining()));
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < width; i18++) {
                int i19 = i13 + 1;
                bArr[i13] = bArr2[i16];
                i13 += 2;
                bArr[i19] = bArr3[i17];
                i16 += h11;
                i17 += h12;
            }
        }
        YuvImage yuvImage = new YuvImage(bArr, 17, pVar.getWidth(), pVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, pVar.getWidth(), pVar.getHeight()) : rect, i11, new k(byteArrayOutputStream, j.a(pVar, i12)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.");
    }
}
