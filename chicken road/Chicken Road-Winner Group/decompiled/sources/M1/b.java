package M1;

import H0.f;
import J1.i;
import a.AbstractC0086a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, int i3) {
        super(9, fVar);
        this.f970d = i3;
    }

    @Override // J1.i
    public final Bitmap t(ByteBuffer byteBuffer, d dVar) {
        switch (this.f970d) {
            case 0:
                Bitmap t3 = super.t(byteBuffer, dVar);
                if (t3 != null) {
                    return t3;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f974c == 0) {
                    return AbstractC0086a.d(decodeByteArray, dVar.f976e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f974c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return AbstractC0086a.d(createBitmap, dVar.f976e);
            default:
                return AbstractC0086a.d(super.t(byteBuffer, dVar), dVar.f976e);
        }
    }
}
