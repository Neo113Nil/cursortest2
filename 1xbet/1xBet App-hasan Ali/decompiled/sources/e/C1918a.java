package e;

import A0.AbstractC0015c;
import I1.d;
import c.C0522a;
import kotlin.jvm.internal.l;
import r0.AbstractC2346c;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1918a extends d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0015c f16886d;

    public C1918a(AbstractC0015c abstractC0015c, AbstractC2346c abstractC2346c) {
        this.f16886d = abstractC0015c;
        this.f2570a = abstractC2346c;
        this.f2571b = false;
    }

    @Override // I1.d
    public final void a() {
        this.f16886d.g();
    }

    @Override // I1.d
    public final void b() {
        this.f16886d.h();
    }

    @Override // I1.d
    public final void c(I1.b bVar) {
        this.f16886d.i(new C0522a(bVar));
    }

    @Override // I1.d
    public final void d(I1.b bVar) {
        l.f("navigationEvent", bVar);
        this.f16886d.j();
    }
}
