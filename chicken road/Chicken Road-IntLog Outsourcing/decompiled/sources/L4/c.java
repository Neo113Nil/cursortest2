package L4;

import D4.C0007g;
import D4.InterfaceC0006f;
import D4.x0;
import G0.C0051a;
import I4.u;
import f4.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1223i;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class c implements InterfaceC0006f, x0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0007g f1527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1528b;

    public c(d dVar, C0007g c0007g) {
        this.f1528b = dVar;
        this.f1527a = c0007g;
    }

    @Override // D4.x0
    public final void a(u uVar, int i2) {
        this.f1527a.a(uVar, i2);
    }

    @Override // D4.InterfaceC0006f
    public final C0051a d(Object obj, InterfaceC1441l interfaceC1441l) {
        d dVar = this.f1528b;
        b bVar = new b(dVar, this, 1);
        C0051a d6 = this.f1527a.d((v) obj, bVar);
        if (d6 != null) {
            d.f1529g.set(dVar, null);
        }
        return d6;
    }

    @Override // D4.InterfaceC0006f
    public final void f(Object obj, InterfaceC1441l interfaceC1441l) {
        v vVar = v.f5689a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1529g;
        d dVar = this.f1528b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f1527a.f(vVar, new b(dVar, this, 0));
    }

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return this.f1527a.f512e;
    }

    @Override // D4.InterfaceC0006f
    public final void j(Object obj) {
        this.f1527a.j(obj);
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        this.f1527a.resumeWith(obj);
    }
}
