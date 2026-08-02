package S5;

import S5.k;
import V5.v;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.integration.webp.WebpImage;
import com.bumptech.glide.integration.webp.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d implements T5.k<ByteBuffer, k> {

    /* renamed from: d, reason: collision with root package name */
    public static final T5.h<Boolean> f25793d = T5.h.c(Boolean.FALSE, "com.bumptech.glide.integration.webp.decoder.ByteBufferWebpDecoder.DisableAnimation");

    /* renamed from: a, reason: collision with root package name */
    private final Context f25794a;

    /* renamed from: b, reason: collision with root package name */
    private final W5.d f25795b;

    /* renamed from: c, reason: collision with root package name */
    private final g6.b f25796c;

    public d(Context context, W5.b bVar, W5.d dVar) {
        this.f25794a = context.getApplicationContext();
        this.f25795b = dVar;
        this.f25796c = new g6.b(bVar, dVar);
    }

    @Override // T5.k
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull T5.i iVar) throws IOException {
        return !((Boolean) iVar.a(f25793d)).booleanValue() && com.bumptech.glide.integration.webp.c.d(byteBuffer) == c.e.WEBP_EXTENDED_ANIMATED;
    }

    @Override // T5.k
    public final v<k> b(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        int remaining = byteBuffer2.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer2.get(bArr, 0, remaining);
        WebpImage create = WebpImage.create(bArr);
        i iVar2 = new i(this.f25796c, create, byteBuffer2, h.a(create.getWidth(), create.getHeight(), i11, i12), (n) iVar.a(o.f25840r));
        iVar2.c();
        Bitmap a11 = iVar2.a();
        return new l(new k(new k.a(this.f25795b, new o(com.bumptech.glide.c.a(this.f25794a), iVar2, i11, i12, b6.j.a(), a11))));
    }
}
