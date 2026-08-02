package S5;

import V5.v;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f implements T5.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final j f25798a;

    public f(j jVar, W5.b bVar) {
        this.f25798a = jVar;
    }

    @Override // T5.k
    public final boolean a(@NonNull InputStream inputStream, @NonNull T5.i iVar) throws IOException {
        return this.f25798a.e(inputStream, iVar);
    }

    @Override // T5.k
    public final v<Bitmap> b(@NonNull InputStream inputStream, int i11, int i12, @NonNull T5.i iVar) throws IOException {
        return this.f25798a.a(inputStream, i11, i12, iVar);
    }
}
