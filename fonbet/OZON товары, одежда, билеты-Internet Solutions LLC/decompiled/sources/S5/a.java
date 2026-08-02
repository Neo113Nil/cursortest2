package S5;

import androidx.annotation.NonNull;
import c6.C5753e;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.integration.webp.c;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final T5.h<Boolean> f25787d = T5.h.c(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.AnimatedWebpBitmapDecoder.DisableBitmap");

    /* renamed from: a, reason: collision with root package name */
    private final W5.b f25788a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.d f25789b;

    /* renamed from: c, reason: collision with root package name */
    private final g6.b f25790c;

    public a(W5.b bVar, W5.d dVar) {
        this.f25788a = bVar;
        this.f25789b = dVar;
        this.f25790c = new g6.b(bVar, dVar);
    }

    public final C5753e a(ByteBuffer byteBuffer, int i11, int i12) throws IOException {
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        i iVar = new i(this.f25790c, create, byteBuffer, h.a(create.getWidth(), create.getHeight(), i11, i12));
        try {
            iVar.c();
            return C5753e.c(this.f25789b, iVar.a());
        } finally {
            iVar.d();
        }
    }

    public final boolean b(InputStream inputStream, @NonNull T5.i iVar) throws IOException {
        return !((Boolean) iVar.a(f25787d)).booleanValue() && com.bumptech.glide.integration.webp.c.c(inputStream, this.f25788a) == c.e.WEBP_EXTENDED_ANIMATED;
    }
}
