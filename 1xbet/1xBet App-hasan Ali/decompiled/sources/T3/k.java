package T3;

import G1.C0140k;
import G1.E;
import O3.n;
import P.C0302l;
import P.C0315s;
import P.Z;
import S3.Q;
import W3.o;
import a.AbstractC0444a;
import android.app.Activity;
import android.os.Bundle;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import t.C2396h;

/* loaded from: classes.dex */
public final class k implements i4.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5796k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5797l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.c f5798m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E f5799n;

    public /* synthetic */ k(Object obj, i4.c cVar, E e3, int i) {
        this.f5796k = i;
        this.f5797l = obj;
        this.f5798m = cVar;
        this.f5799n = e3;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5796k) {
            case 0:
                C0140k c0140k = (C0140k) obj2;
                C0315s c0315s = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("stackEntry", c0140k);
                Bundle c5 = c0140k.c();
                if (c5 != null) {
                    int i = c5.getInt("leagueKey");
                    G4.d.a(false, (InterfaceC2015a) this.f5797l, c0315s, 0);
                    c0315s.X(-59360276);
                    i4.c cVar = this.f5798m;
                    boolean f = c0315s.f(cVar);
                    E e3 = this.f5799n;
                    boolean h3 = f | c0315s.h(e3);
                    Object M5 = c0315s.M();
                    if (h3 || M5 == C0302l.f4480a) {
                        M5 = new e(cVar, e3, 2);
                        c0315s.i0(M5);
                    }
                    c0315s.q(false);
                    Q.b(i, (i4.e) M5, null, c0315s, 0);
                }
                break;
            case 1:
                C0315s c0315s2 = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("it", (C0140k) obj2);
                G4.d.a(false, (InterfaceC2015a) this.f5797l, c0315s2, 0);
                c0315s2.X(1964189526);
                final i4.c cVar2 = this.f5798m;
                boolean f5 = c0315s2.f(cVar2);
                final E e5 = this.f5799n;
                boolean h4 = f5 | c0315s2.h(e5);
                Object M6 = c0315s2.M();
                Z z3 = C0302l.f4480a;
                if (h4 || M6 == z3) {
                    M6 = new e(cVar2, e5, 3);
                    c0315s2.i0(M6);
                }
                i4.e eVar = (i4.e) M6;
                c0315s2.q(false);
                c0315s2.X(1964195317);
                boolean f6 = c0315s2.f(cVar2) | c0315s2.h(e5);
                Object M7 = c0315s2.M();
                if (f6 || M7 == z3) {
                    final int i5 = 0;
                    M7 = new InterfaceC2015a() { // from class: T3.l
                        @Override // i4.InterfaceC2015a
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    final E e6 = e5;
                                    final int i6 = 0;
                                    cVar2.c(new InterfaceC2015a() { // from class: T3.m
                                        @Override // i4.InterfaceC2015a
                                        public final Object invoke() {
                                            switch (i6) {
                                                case 0:
                                                    E.l(e6, "appR/navigator/tournament_catalog", null, 6);
                                                    break;
                                                default:
                                                    E.l(e6, "appR/navigator/league_spotlight", null, 6);
                                                    break;
                                            }
                                            return o.f6046a;
                                        }
                                    });
                                    break;
                                default:
                                    final E e7 = e5;
                                    final int i7 = 1;
                                    cVar2.c(new InterfaceC2015a() { // from class: T3.m
                                        @Override // i4.InterfaceC2015a
                                        public final Object invoke() {
                                            switch (i7) {
                                                case 0:
                                                    E.l(e7, "appR/navigator/tournament_catalog", null, 6);
                                                    break;
                                                default:
                                                    E.l(e7, "appR/navigator/league_spotlight", null, 6);
                                                    break;
                                            }
                                            return o.f6046a;
                                        }
                                    });
                                    break;
                            }
                            return o.f6046a;
                        }
                    };
                    c0315s2.i0(M7);
                }
                c0315s2.q(false);
                AbstractC2036a.W(eVar, (InterfaceC2015a) M7, null, c0315s2, 0);
                break;
            default:
                C0315s c0315s3 = (C0315s) obj3;
                ((Number) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$composable", (C2396h) obj);
                kotlin.jvm.internal.l.f("it", (C0140k) obj2);
                c0315s3.X(-257234700);
                Activity activity = (Activity) this.f5797l;
                boolean h5 = c0315s3.h(activity);
                Object M8 = c0315s3.M();
                Z z5 = C0302l.f4480a;
                if (h5 || M8 == z5) {
                    M8 = new n(activity, 1);
                    c0315s3.i0(M8);
                }
                c0315s3.q(false);
                G4.d.a(false, (InterfaceC2015a) M8, c0315s3, 0);
                c0315s3.X(-257231774);
                final i4.c cVar3 = this.f5798m;
                boolean f7 = c0315s3.f(cVar3);
                final E e6 = this.f5799n;
                boolean h6 = f7 | c0315s3.h(e6);
                Object M9 = c0315s3.M();
                if (h6 || M9 == z5) {
                    final int i6 = 1;
                    M9 = new InterfaceC2015a() { // from class: T3.l
                        @Override // i4.InterfaceC2015a
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    final E e62 = e6;
                                    final int i62 = 0;
                                    cVar3.c(new InterfaceC2015a() { // from class: T3.m
                                        @Override // i4.InterfaceC2015a
                                        public final Object invoke() {
                                            switch (i62) {
                                                case 0:
                                                    E.l(e62, "appR/navigator/tournament_catalog", null, 6);
                                                    break;
                                                default:
                                                    E.l(e62, "appR/navigator/league_spotlight", null, 6);
                                                    break;
                                            }
                                            return o.f6046a;
                                        }
                                    });
                                    break;
                                default:
                                    final E e7 = e6;
                                    final int i7 = 1;
                                    cVar3.c(new InterfaceC2015a() { // from class: T3.m
                                        @Override // i4.InterfaceC2015a
                                        public final Object invoke() {
                                            switch (i7) {
                                                case 0:
                                                    E.l(e7, "appR/navigator/tournament_catalog", null, 6);
                                                    break;
                                                default:
                                                    E.l(e7, "appR/navigator/league_spotlight", null, 6);
                                                    break;
                                            }
                                            return o.f6046a;
                                        }
                                    });
                                    break;
                            }
                            return o.f6046a;
                        }
                    };
                    c0315s3.i0(M9);
                }
                c0315s3.q(false);
                AbstractC0444a.Q((InterfaceC2015a) M9, c0315s3, 0);
                break;
        }
        return o.f6046a;
    }
}
