package Ri0;

import sj0.InterfaceC9701a;

/* loaded from: classes3.dex */
public final class c implements Jb.e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC9701a<Hi0.a>> f25132a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ij0.e> f25133b;

    public c(Pc.a<InterfaceC9701a<Hi0.a>> aVar, Pc.a<ij0.e> aVar2) {
        this.f25132a = aVar;
        this.f25133b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f25132a.get(), Jb.d.a(this.f25133b));
    }
}
