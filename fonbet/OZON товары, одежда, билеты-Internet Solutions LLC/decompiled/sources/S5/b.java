package S5;

import V5.v;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.integration.webp.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b implements T5.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final a f25791a;

    public b(a aVar) {
        this.f25791a = aVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull T5.i iVar) throws IOException {
        return !((Boolean) iVar.a(a.f25787d)).booleanValue() && com.bumptech.glide.integration.webp.c.d(byteBuffer) == c.e.WEBP_EXTENDED_ANIMATED;
    }

    @Override // T5.k
    public final v<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return this.f25791a.a(byteBuffer, i11, i12);
    }
}
