package a6;

import T5.i;
import Z5.h;
import Z5.p;
import Z5.q;
import Z5.t;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes8.dex */
public final class g implements p<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final p<h, InputStream> f36382a;

    /* loaded from: classes.dex */
    public static class a implements q<URL, InputStream> {
        @Override // Z5.q
        @NonNull
        public final p<URL, InputStream> build(t tVar) {
            return new g(tVar.c(h.class, InputStream.class));
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public g(p<h, InputStream> pVar) {
        this.f36382a = pVar;
    }

    @Override // Z5.p
    public final p.a<InputStream> buildLoadData(@NonNull URL url, int i11, int i12, @NonNull i iVar) {
        return this.f36382a.buildLoadData(new h(url), i11, i12, iVar);
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull URL url) {
        return true;
    }
}
