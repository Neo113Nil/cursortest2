package S5;

import V5.v;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e implements T5.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final a f25797a;

    public e(a aVar) {
        this.f25797a = aVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull InputStream inputStream, @NonNull T5.i iVar) throws IOException {
        return this.f25797a.b(inputStream, iVar);
    }

    @Override // T5.k
    public final v<Bitmap> b(@NonNull InputStream inputStream, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        a aVar = this.f25797a;
        byte[] b11 = h.b(inputStream);
        if (b11 == null) {
            return null;
        }
        return aVar.a(ByteBuffer.wrap(b11), i11, i12);
    }
}
