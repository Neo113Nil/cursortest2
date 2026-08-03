package T0;

/* loaded from: classes.dex */
public final class b extends C.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Q0.i iVar, int i2) {
        super(22, iVar);
        this.f1708c = i2;
    }

    @Override // C.j
    public final android.graphics.Bitmap k(java.nio.ByteBuffer byteBuffer, T0.d dVar) {
        android.graphics.Bitmap b2;
        switch (this.f1708c) {
            case 0:
                android.graphics.Bitmap k2 = super.k(byteBuffer, dVar);
                if (k2 != null) {
                    return k2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f1712c != 0) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.postRotate(dVar.f1712c);
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    b2 = a.AbstractC0059a.b(createBitmap, dVar.f1714e);
                } else {
                    b2 = a.AbstractC0059a.b(decodeByteArray, dVar.f1714e);
                }
                return b2;
            default:
                return a.AbstractC0059a.b(super.k(byteBuffer, dVar), dVar.f1714e);
        }
    }
}
