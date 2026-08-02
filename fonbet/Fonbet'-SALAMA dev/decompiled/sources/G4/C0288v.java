package G4;

import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0909j;
import e3.C1023h;
import java.util.HashMap;
import w1.C1722m0;
import w1.P2;
import w1.V0;

/* renamed from: G4.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0288v extends P6.b {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3031c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3032d;

    /* renamed from: e, reason: collision with root package name */
    public final C1023h f3033e;

    /* renamed from: f, reason: collision with root package name */
    public final C0289w f3034f;

    /* renamed from: g, reason: collision with root package name */
    public final P2 f3035g;

    /* renamed from: h, reason: collision with root package name */
    public final V0 f3036h;

    /* renamed from: i, reason: collision with root package name */
    public C f3037i;
    public boolean j;

    public C0288v() {
        C0909j c0909j = AbstractC0911k.f12212b;
        this.f3031c = new HashMap();
        this.f3033e = new C1023h(4);
        this.f3034f = new C0289w(this);
        this.f3035g = new P2(9, (byte) 0);
        V0 v02 = new V0(10, false);
        v02.f17562b = H4.g.f3315a;
        this.f3036h = v02;
        this.f3032d = new HashMap();
    }

    @Override // P6.b
    public final Object G(String str, L4.p pVar) {
        this.f3037i.g();
        try {
            return pVar.get();
        } finally {
            this.f3037i.f();
        }
    }

    @Override // P6.b
    public final void H(Runnable runnable, String str) {
        this.f3037i.g();
        try {
            runnable.run();
        } finally {
            this.f3037i.f();
        }
    }

    @Override // P6.b
    public final void L() {
        p3.f.O("MemoryPersistence shutdown without start", this.j, new Object[0]);
        this.j = false;
    }

    @Override // P6.b
    public final void M() {
        p3.f.O("MemoryPersistence double-started!", !this.j, new Object[0]);
        this.j = true;
    }

    @Override // P6.b
    public final P2 l() {
        return this.f3035g;
    }

    @Override // P6.b
    public final InterfaceC0268a n(C4.e eVar) {
        HashMap hashMap = this.f3032d;
        C0285s c0285s = (C0285s) hashMap.get(eVar);
        if (c0285s != null) {
            return c0285s;
        }
        C0285s c0285s2 = new C0285s();
        hashMap.put(eVar, c0285s2);
        return c0285s2;
    }

    @Override // P6.b
    public final InterfaceC0273f o(C4.e eVar) {
        return this.f3033e;
    }

    @Override // P6.b
    public final InterfaceC0290x p(C4.e eVar, InterfaceC0273f interfaceC0273f) {
        HashMap hashMap = this.f3031c;
        C0287u c0287u = (C0287u) hashMap.get(eVar);
        if (c0287u != null) {
            return c0287u;
        }
        C0287u c0287u2 = new C0287u(this);
        hashMap.put(eVar, c0287u2);
        return c0287u2;
    }

    @Override // P6.b
    public final InterfaceC0291y q() {
        return new C1722m0(4);
    }

    @Override // P6.b
    public final C r() {
        return this.f3037i;
    }

    @Override // P6.b
    public final D s() {
        return this.f3036h;
    }

    @Override // P6.b
    public final Y t() {
        return this.f3034f;
    }

    @Override // P6.b
    public final boolean y() {
        return this.j;
    }
}
