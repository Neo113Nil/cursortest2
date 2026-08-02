package s4;

import i4.C1266c;
import n4.AbstractC1472f;
import n4.C1473g;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1594b implements InterfaceC1597e {

    /* renamed from: a, reason: collision with root package name */
    public final C1473g f16150a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1472f f16151b;

    /* renamed from: c, reason: collision with root package name */
    public final C1266c f16152c;

    public C1594b(AbstractC1472f abstractC1472f, C1266c c1266c, C1473g c1473g) {
        this.f16151b = abstractC1472f;
        this.f16150a = c1473g;
        this.f16152c = c1266c;
    }

    @Override // s4.InterfaceC1597e
    public final void a() {
        this.f16151b.c(this.f16152c);
    }

    @Override // s4.InterfaceC1597e
    public final String toString() {
        return this.f16150a + ":CANCEL";
    }
}
