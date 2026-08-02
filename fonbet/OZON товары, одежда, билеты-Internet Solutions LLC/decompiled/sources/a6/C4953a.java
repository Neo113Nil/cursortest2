package a6;

import T5.i;
import Z5.h;
import Z5.o;
import Z5.p;
import Z5.q;
import Z5.t;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4953a implements p<h, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final T5.h<Integer> f36358b = T5.h.c(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    private final o<h, h> f36359a;

    /* renamed from: a6.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0697a implements q<h, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final o<h, h> f36360a = new o<>();

        @Override // Z5.q
        @NonNull
        public final p<h, InputStream> build(t tVar) {
            return new C4953a(this.f36360a);
        }

        @Override // Z5.q
        public final void teardown() {
        }
    }

    public C4953a(o<h, h> oVar) {
        this.f36359a = oVar;
    }

    @Override // Z5.p
    public final p.a<InputStream> buildLoadData(@NonNull h hVar, int i11, int i12, @NonNull i iVar) {
        h hVar2 = hVar;
        o<h, h> oVar = this.f36359a;
        if (oVar != null) {
            h hVar3 = (h) oVar.a(hVar2);
            if (hVar3 == null) {
                oVar.b(hVar2, hVar2);
            } else {
                hVar2 = hVar3;
            }
        }
        return new p.a<>(hVar2, new j(hVar2, ((Integer) iVar.a(f36358b)).intValue()));
    }

    @Override // Z5.p
    public final /* bridge */ /* synthetic */ boolean handles(@NonNull h hVar) {
        return true;
    }
}
