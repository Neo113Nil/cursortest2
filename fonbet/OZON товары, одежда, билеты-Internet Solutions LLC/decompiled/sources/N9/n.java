package N9;

import Am.C2438a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import h9.s;
import java.io.ByteArrayOutputStream;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private k f18817a;

    /* renamed from: b, reason: collision with root package name */
    private int f18818b;

    /* renamed from: c, reason: collision with root package name */
    private int f18819c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f18820d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18821e;

    public n(byte[] bArr, int i11, int i12, int i13, int i14) {
        this.f18817a = new k(bArr, i11, i12);
        this.f18819c = i14;
        this.f18818b = i13;
        if (i11 * i12 <= bArr.length) {
            return;
        }
        StringBuilder a11 = C2438a.a("Image data does not match the resolution. ", i11, "x", " > ", i12);
        a11.append(bArr.length);
        throw new IllegalArgumentException(a11.toString());
    }

    public final h9.n a() {
        k a11 = this.f18817a.e(this.f18819c).a(this.f18820d);
        return new h9.n(a11.b(), a11.d(), a11.c(), a11.d(), a11.c());
    }

    public final Bitmap b() {
        int i11 = this.f18819c;
        k kVar = this.f18817a;
        Rect rect = new Rect(0, 0, kVar.d(), kVar.c());
        YuvImage yuvImage = new YuvImage(kVar.b(), this.f18818b, kVar.d(), kVar.c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 2;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (i11 == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    public final void c(Rect rect) {
        this.f18820d = rect;
    }

    public final void d() {
        this.f18821e = true;
    }

    public final s e(s sVar) {
        float f7 = 1;
        float b11 = (sVar.b() * f7) + this.f18820d.left;
        float c11 = (sVar.c() * f7) + this.f18820d.top;
        if (this.f18821e) {
            b11 = this.f18817a.d() - b11;
        }
        return new s(b11, c11);
    }
}
