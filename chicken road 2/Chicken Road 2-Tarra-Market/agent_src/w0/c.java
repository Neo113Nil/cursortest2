package w0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;
import t0.i;

/* loaded from: classes.dex */
public final class c extends io.flutter.plugin.editing.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(i iVar, int i2) {
        super(13, iVar);
        this.f6746c = i2;
    }

    @Override // io.flutter.plugin.editing.a
    public final Bitmap m(ByteBuffer byteBuffer, e eVar) {
        Bitmap c2;
        switch (this.f6746c) {
            case 0:
                Bitmap m2 = super.m(byteBuffer, eVar);
                if (m2 != null) {
                    return m2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (eVar.f6750c != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(eVar.f6750c);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    c2 = V.a.c(createBitmap, eVar.f6752e);
                } else {
                    c2 = V.a.c(decodeByteArray, eVar.f6752e);
                }
                return c2;
            default:
                return V.a.c(super.m(byteBuffer, eVar), eVar.f6752e);
        }
    }
}
