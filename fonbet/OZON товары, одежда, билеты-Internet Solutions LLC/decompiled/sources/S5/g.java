package S5;

import V5.v;
import androidx.annotation.NonNull;
import com.bumptech.glide.integration.webp.c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g implements T5.k<InputStream, k> {

    /* renamed from: c, reason: collision with root package name */
    public static final T5.h<Boolean> f25799c = T5.h.c(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.StreamWebpDecoder.DisableAnimation");

    /* renamed from: a, reason: collision with root package name */
    private final d f25800a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.b f25801b;

    public g(d dVar, W5.b bVar) {
        this.f25800a = dVar;
        this.f25801b = bVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull InputStream inputStream, @NonNull T5.i iVar) throws IOException {
        return !((Boolean) iVar.a(f25799c)).booleanValue() && com.bumptech.glide.integration.webp.c.c(inputStream, this.f25801b) == c.e.WEBP_EXTENDED_ANIMATED;
    }

    @Override // T5.k
    public final v<k> b(@NonNull InputStream inputStream, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        byte[] b11 = h.b(inputStream);
        if (b11 == null) {
            return null;
        }
        return this.f25800a.b(ByteBuffer.wrap(b11), i11, i12, iVar);
    }
}
