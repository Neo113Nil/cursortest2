package S5;

import V5.v;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import p6.C8861a;

/* loaded from: classes.dex */
public final class c implements T5.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final j f25792a;

    public c(j jVar) {
        this.f25792a = jVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull T5.i iVar) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) iVar.a(j.f25816e)).booleanValue() || ((Boolean) iVar.a(j.f25817f)).booleanValue()) {
            return false;
        }
        return com.bumptech.glide.integration.webp.c.e(com.bumptech.glide.integration.webp.c.d(byteBuffer2));
    }

    @Override // T5.k
    public final v<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return this.f25792a.a(C8861a.f(byteBuffer), i11, i12, iVar);
    }
}
