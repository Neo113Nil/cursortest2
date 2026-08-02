package O4;

import java.util.concurrent.Executor;

/* renamed from: O4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269o implements InterfaceC0259e {

    /* renamed from: k, reason: collision with root package name */
    public final Executor f4219k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0259e f4220l;

    public C0269o(Executor executor, InterfaceC0259e interfaceC0259e) {
        this.f4219k = executor;
        this.f4220l = interfaceC0259e;
    }

    @Override // O4.InterfaceC0259e
    public final void cancel() {
        this.f4220l.cancel();
    }

    @Override // O4.InterfaceC0259e
    public final void d(InterfaceC0262h interfaceC0262h) {
        this.f4220l.d(new G.v(7, this, interfaceC0262h, false));
    }

    @Override // O4.InterfaceC0259e
    public final C0.c f() {
        return this.f4220l.f();
    }

    @Override // O4.InterfaceC0259e
    public final boolean h() {
        return this.f4220l.h();
    }

    @Override // O4.InterfaceC0259e
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0259e m7clone() {
        return new C0269o(this.f4219k, this.f4220l.m7clone());
    }
}
