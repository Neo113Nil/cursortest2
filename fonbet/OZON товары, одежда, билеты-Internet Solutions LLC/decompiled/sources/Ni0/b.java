package Ni0;

import Ai0.c;
import Bi0.f;
import Jb.e;

/* loaded from: classes3.dex */
public final class b implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pa0.e f19597a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Ai0.a> f19598b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<c> f19599c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Ai0.a> f19600d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Ai0.b> f19601e;

    public b(Pa0.e eVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f19597a = eVar;
        this.f19598b = aVar;
        this.f19599c = aVar2;
        this.f19600d = aVar3;
        this.f19601e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new a((f) this.f19597a.get(), this.f19598b.get(), this.f19599c.get(), this.f19600d.get(), this.f19601e.get());
    }
}
