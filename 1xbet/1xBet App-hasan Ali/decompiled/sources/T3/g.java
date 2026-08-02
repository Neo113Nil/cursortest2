package T3;

import G1.C0140k;
import G1.E;
import P.C0302l;
import P.C0315s;
import P.Z;
import S3.AbstractC0412o;
import W3.o;
import android.os.Bundle;
import i4.InterfaceC2015a;
import r0.AbstractC2346c;
import t.C2396h;

/* loaded from: classes.dex */
public final class g implements i4.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5781k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.c f5783m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E f5784n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5785o;

    public /* synthetic */ g(int i, E e3, InterfaceC2015a interfaceC2015a, i4.c cVar, String str) {
        this.f5781k = i;
        this.f5782l = interfaceC2015a;
        this.f5783m = cVar;
        this.f5784n = e3;
        this.f5785o = str;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5781k) {
            case 0:
                C0315s c0315s = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("it", (C0140k) obj2);
                G4.d.a(false, this.f5782l, c0315s, 0);
                c0315s.X(-952112587);
                i4.c cVar = this.f5783m;
                boolean f = c0315s.f(cVar);
                E e3 = this.f5784n;
                boolean h3 = f | c0315s.h(e3);
                Object M5 = c0315s.M();
                if (h3 || M5 == C0302l.f4480a) {
                    M5 = new e(cVar, e3, 0);
                    c0315s.i0(M5);
                }
                c0315s.q(false);
                AbstractC2346c.H((i4.e) M5, this.f5785o, null, c0315s, 0);
                break;
            case 1:
                C0140k c0140k = (C0140k) obj2;
                C0315s c0315s2 = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("stackEntry", c0140k);
                Bundle c5 = c0140k.c();
                if (c5 != null) {
                    final int i = c5.getInt("matchKey");
                    G4.d.a(false, this.f5782l, c0315s2, 0);
                    c0315s2.X(1982303425);
                    final i4.c cVar2 = this.f5783m;
                    boolean f5 = c0315s2.f(cVar2);
                    final E e5 = this.f5784n;
                    boolean h4 = f5 | c0315s2.h(e5) | c0315s2.d(i);
                    Object M6 = c0315s2.M();
                    Z z3 = C0302l.f4480a;
                    if (h4 || M6 == z3) {
                        final int i5 = 0;
                        M6 = new InterfaceC2015a() { // from class: T3.h
                            @Override // i4.InterfaceC2015a
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        cVar2.c(new c(e5, i, 2));
                                        break;
                                    default:
                                        cVar2.c(new c(e5, i, 1));
                                        break;
                                }
                                return o.f6046a;
                            }
                        };
                        c0315s2.i0(M6);
                    }
                    InterfaceC2015a interfaceC2015a = (InterfaceC2015a) M6;
                    c0315s2.q(false);
                    c0315s2.X(1982307137);
                    boolean f6 = c0315s2.f(cVar2) | c0315s2.h(e5) | c0315s2.d(i);
                    Object M7 = c0315s2.M();
                    if (f6 || M7 == z3) {
                        final int i6 = 1;
                        M7 = new InterfaceC2015a() { // from class: T3.h
                            @Override // i4.InterfaceC2015a
                            public final Object invoke() {
                                switch (i6) {
                                    case 0:
                                        cVar2.c(new c(e5, i, 2));
                                        break;
                                    default:
                                        cVar2.c(new c(e5, i, 1));
                                        break;
                                }
                                return o.f6046a;
                            }
                        };
                        c0315s2.i0(M7);
                    }
                    InterfaceC2015a interfaceC2015a2 = (InterfaceC2015a) M7;
                    c0315s2.q(false);
                    c0315s2.X(1982310862);
                    boolean f7 = c0315s2.f(cVar2) | c0315s2.h(e5);
                    Object M8 = c0315s2.M();
                    if (f7 || M8 == z3) {
                        M8 = new b(cVar2, e5, 1);
                        c0315s2.i0(M8);
                    }
                    i4.c cVar3 = (i4.c) M8;
                    c0315s2.q(false);
                    c0315s2.X(1982315053);
                    boolean f8 = c0315s2.f(cVar2) | c0315s2.h(e5);
                    Object M9 = c0315s2.M();
                    if (f8 || M9 == z3) {
                        M9 = new e(cVar2, e5, 1);
                        c0315s2.i0(M9);
                    }
                    c0315s2.q(false);
                    String str = this.f5785o;
                    AbstractC0412o.a(i, this.f5782l, interfaceC2015a, interfaceC2015a2, cVar3, (i4.e) M9, str, null, c0315s2, 0);
                }
                break;
            default:
                C0140k c0140k2 = (C0140k) obj2;
                C0315s c0315s3 = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("stackEntry", c0140k2);
                Bundle c6 = c0140k2.c();
                if (c6 != null) {
                    int i7 = c6.getInt("teamKey");
                    G4.d.a(false, this.f5782l, c0315s3, 0);
                    c0315s3.X(1387662395);
                    i4.c cVar4 = this.f5783m;
                    boolean f9 = c0315s3.f(cVar4);
                    E e6 = this.f5784n;
                    boolean h5 = f9 | c0315s3.h(e6);
                    Object M10 = c0315s3.M();
                    if (h5 || M10 == C0302l.f4480a) {
                        M10 = new e(cVar4, e6, 4);
                        c0315s3.i0(M10);
                    }
                    c0315s3.q(false);
                    S3.Z.b(i7, this.f5782l, (i4.e) M10, this.f5785o, null, c0315s3, 0);
                }
                break;
        }
        return o.f6046a;
    }
}
