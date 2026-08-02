package M6;

import D6.C0130m;
import D6.I0;
import D6.InterfaceC0129l;
import F2.W0;
import I6.u;
import f6.C1116i;
import i6.InterfaceC1292i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class c implements InterfaceC0129l, I0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0130m f4610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4611b;

    public c(d dVar, C0130m c0130m) {
        this.f4611b = dVar;
        this.f4610a = c0130m;
    }

    @Override // D6.I0
    public final void a(u uVar, int i7) {
        this.f4610a.a(uVar, i7);
    }

    @Override // D6.InterfaceC0129l
    public final W0 b(Object obj, Function1 function1) {
        d dVar = this.f4611b;
        b bVar = new b(dVar, this, 1);
        W0 D7 = this.f4610a.D((C1116i) obj, bVar);
        if (D7 != null) {
            d.f4612g.set(dVar, null);
        }
        return D7;
    }

    @Override // D6.InterfaceC0129l
    public final void d(Object obj, Function1 function1) {
        C1116i c1116i = C1116i.f13008a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f4612g;
        d dVar = this.f4611b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f4610a.d(c1116i, new b(dVar, this, 0));
    }

    @Override // D6.InterfaceC0129l
    public final void f(Object obj) {
        this.f4610a.f(obj);
    }

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        return this.f4610a.f1858e;
    }

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        this.f4610a.resumeWith(obj);
    }
}
