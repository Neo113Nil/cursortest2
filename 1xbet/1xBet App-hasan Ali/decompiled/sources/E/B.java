package E;

import A0.C0025f0;
import G1.C0140k;
import K0.C0203h;
import P0.C0331a;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f990l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f991m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f992n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f993o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C0140k c0140k, Z.p pVar, boolean z3) {
        super(1);
        this.f992n = c0140k;
        this.f991m = z3;
        this.f993o = pVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        int i = 4;
        Object obj2 = this.f993o;
        final boolean z3 = this.f991m;
        Object obj3 = this.f992n;
        switch (this.f990l) {
            case 0:
                C0203h c0203h = (C0203h) obj;
                if (!z3) {
                    return Boolean.FALSE;
                }
                Z z5 = (Z) obj3;
                P0.C c5 = z5.f1092e;
                C0116v c0116v = z5.f1105t;
                W3.o oVar = null;
                if (c5 != null) {
                    P0.w t5 = z5.f1091d.t(X3.n.O(new P0.i(), new C0331a(c0203h, 1)));
                    c5.a(null, t5);
                    c0116v.c(t5);
                    oVar = W3.o.f6046a;
                }
                if (oVar == null) {
                    P0.w wVar = (P0.w) obj2;
                    String str = wVar.f4679a.f2829l;
                    int i5 = K0.N.f2802c;
                    long j5 = wVar.f4680b;
                    int i6 = (int) (j5 >> 32);
                    int i7 = (int) (j5 & 4294967295L);
                    kotlin.jvm.internal.l.f("<this>", str);
                    kotlin.jvm.internal.l.f("replacement", c0203h);
                    if (i7 < i6) {
                        throw new IndexOutOfBoundsException("End index (" + i7 + ") is less than start index (" + i6 + ").");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i6);
                    sb.append((CharSequence) c0203h);
                    sb.append((CharSequence) str, i7, str.length());
                    String obj4 = sb.toString();
                    int length = c0203h.f2829l.length() + i6;
                    c0116v.c(new P0.w(4, K0.F.b(length, length), obj4));
                }
                return Boolean.TRUE;
            default:
                final C0140k c0140k = (C0140k) obj3;
                final Z.p pVar = (Z.p) obj2;
                InterfaceC0489s interfaceC0489s = new InterfaceC0489s() { // from class: H1.m
                    @Override // androidx.lifecycle.InterfaceC0489s
                    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
                        C0140k c0140k2 = c0140k;
                        boolean z6 = z3;
                        Z.p pVar2 = pVar;
                        if (z6 && !pVar2.contains(c0140k2)) {
                            pVar2.add(c0140k2);
                        }
                        if (enumC0486o == EnumC0486o.ON_START && !pVar2.contains(c0140k2)) {
                            pVar2.add(c0140k2);
                        }
                        if (enumC0486o == EnumC0486o.ON_STOP) {
                            pVar2.remove(c0140k2);
                        }
                    }
                };
                c0140k.f1905r.a(interfaceC0489s);
                return new C0025f0(i, c0140k, interfaceC0489s);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(boolean z3, Z z5, H0.j jVar, P0.w wVar) {
        super(1);
        this.f991m = z3;
        this.f992n = z5;
        this.f993o = wVar;
    }
}
