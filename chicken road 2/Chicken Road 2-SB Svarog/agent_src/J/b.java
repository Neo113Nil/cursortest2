package J;

import F.t;
import G.m;
import a.AbstractC0018a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(m mVar, int i2) {
        super(4, mVar);
        this.f257d = i2;
    }

    @Override // F.t
    public final Bitmap t(ByteBuffer byteBuffer, d dVar) {
        switch (this.f257d) {
            case 0:
                Bitmap t2 = super.t(byteBuffer, dVar);
                if (t2 != null) {
                    return t2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f261c == 0) {
                    return AbstractC0018a.b(decodeByteArray, dVar.f263e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(dVar.f261c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return AbstractC0018a.b(createBitmap, dVar.f263e);
            default:
                return AbstractC0018a.b(super.t(byteBuffer, dVar), dVar.f263e);
        }
    }
}
