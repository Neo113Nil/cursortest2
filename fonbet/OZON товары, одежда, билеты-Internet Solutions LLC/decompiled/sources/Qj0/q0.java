package Qj0;

import Hj0.C3148e;
import Hj0.C3154k;
import ki0.InterfaceC7684a;
import xe.C10720e0;

/* loaded from: classes7.dex */
public final class q0 implements Jb.e<p0> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Mj0.h> f23700a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC7684a> f23701b;

    /* renamed from: c, reason: collision with root package name */
    private final C3154k f23702c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f23703d;

    public q0(Pc.a aVar, Pc.a aVar2, C3154k c3154k, Jb.f fVar, C3148e c3148e) {
        this.f23700a = aVar;
        this.f23701b = aVar2;
        this.f23702c = c3154k;
        this.f23703d = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        Ib.a a11 = Jb.d.a(this.f23700a);
        Ib.a a12 = Jb.d.a(this.f23701b);
        Ib.a a13 = Jb.d.a(this.f23702c);
        fi0.x xVar = (fi0.x) this.f23703d.get();
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b bVar = He.b.f10879b;
        Jb.j.d(bVar);
        return new p0(a11, a12, a13, xVar, bVar);
    }
}
