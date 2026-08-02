package I3;

import F3.InterfaceC3018x;
import F3.d0;
import I3.B;
import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.k0;
import j3.AbstractC7252H;
import j3.C7255K;
import j3.C7263e;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private a f11820a;

    /* renamed from: b, reason: collision with root package name */
    private J3.d f11821b;

    public interface a {
        void a();

        default void d() {
        }
    }

    protected final J3.d a() {
        J3.d dVar = this.f11821b;
        G10.a.i(dVar);
        return dVar;
    }

    public C7255K b() {
        return C7255K.f68969F;
    }

    public k0.a c() {
        return null;
    }

    public final void d(a aVar, J3.d dVar) {
        G10.a.h(this.f11820a == null);
        this.f11820a = aVar;
        this.f11821b = dVar;
    }

    protected final void e() {
        a aVar = this.f11820a;
        if (aVar != null) {
            aVar.a();
        }
    }

    protected final void f(AbstractC5444f abstractC5444f) {
        a aVar = this.f11820a;
        if (aVar != null) {
            aVar.d();
        }
    }

    public abstract void g(B.a aVar);

    public void h() {
        this.f11820a = null;
        this.f11821b = null;
    }

    public abstract F i(k0[] k0VarArr, d0 d0Var, InterfaceC3018x.b bVar, AbstractC7252H abstractC7252H) throws C5449k;

    public void j(C7263e c7263e) {
    }

    public void k(C7255K c7255k) {
    }
}
