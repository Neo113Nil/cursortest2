package R;

import B90.b0;
import G.q;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.w;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class f implements I {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final I f23868a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final k f23869b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final l f23870c;

    /* renamed from: d, reason: collision with root package name */
    private final w.b f23871d;

    f(@NonNull I i11, @NonNull w.b bVar, @NonNull b0 b0Var) {
        this.f23868a = i11;
        this.f23871d = bVar;
        this.f23869b = new k(i11.k(), b0Var);
        this.f23870c = new l(i11.e());
    }

    @Override // androidx.camera.core.impl.I
    @NonNull
    public final InterfaceC5129y0<I.a> c() {
        return this.f23868a.c();
    }

    @Override // androidx.camera.core.w.b
    public final void d(@NonNull w wVar) {
        q.a();
        this.f23871d.d(wVar);
    }

    @Override // androidx.camera.core.impl.I
    @NonNull
    public final H e() {
        return this.f23870c;
    }

    @Override // androidx.camera.core.impl.I
    public final void h(@NonNull ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.w.b
    public final void j(@NonNull w wVar) {
        q.a();
        ((h) this.f23871d).j(wVar);
    }

    @Override // androidx.camera.core.impl.I
    @NonNull
    public final E k() {
        return this.f23869b;
    }

    @Override // androidx.camera.core.w.b
    public final void m(@NonNull w wVar) {
        q.a();
        this.f23871d.m(wVar);
    }

    @Override // androidx.camera.core.impl.I
    public final void o(@NonNull ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.I
    public final boolean p() {
        return false;
    }

    @Override // androidx.camera.core.w.b
    public final void q(@NonNull w wVar) {
        q.a();
        ((h) this.f23871d).q(wVar);
    }

    final void r(int i11) {
        this.f23870c.r(i11);
    }
}
