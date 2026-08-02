package I;

import i0.C2001f;
import i0.C2006k;
import i4.InterfaceC2015a;
import k0.C2022b;
import k0.C2023c;
import z0.C2733I;

/* renamed from: I.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154g extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f2485l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2486m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2001f f2487n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2006k f2488o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0154g(InterfaceC2015a interfaceC2015a, boolean z3, C2001f c2001f, C2006k c2006k) {
        super(1);
        this.f2485l = interfaceC2015a;
        this.f2486m = z3;
        this.f2487n = c2001f;
        this.f2488o = c2006k;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        C2733I c2733i = (C2733I) obj;
        c2733i.a();
        if (((Boolean) this.f2485l.invoke()).booleanValue()) {
            boolean z3 = this.f2486m;
            C2006k c2006k = this.f2488o;
            C2001f c2001f = this.f2487n;
            C2022b c2022b = c2733i.f21647k;
            if (z3) {
                long Q5 = c2022b.Q();
                v3.e eVar = c2022b.f17540l;
                long A3 = eVar.A();
                eVar.v().k();
                try {
                    ((C2023c) eVar.f20432l).z(-1.0f, 1.0f, Q5);
                    c2022b.e(c2001f, c2006k);
                } finally {
                    eVar.v().j();
                    eVar.P(A3);
                }
            } else {
                c2022b.e(c2001f, c2006k);
            }
        }
        return W3.o.f6046a;
    }
}
