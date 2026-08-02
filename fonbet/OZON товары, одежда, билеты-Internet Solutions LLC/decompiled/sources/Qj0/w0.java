package Qj0;

import ak0.InterfaceC5031a;

/* loaded from: classes7.dex */
public final class w0 implements Jb.e<u0> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC5031a> f23755a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<xe.M> f23756b;

    public w0(Pc.a<InterfaceC5031a> aVar, Pc.a<xe.M> aVar2) {
        this.f23755a = aVar;
        this.f23756b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new u0(this.f23755a.get(), this.f23756b.get());
    }
}
