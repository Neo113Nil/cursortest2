package androidx.compose.foundation.gestures;

import b0.o;
import kotlin.jvm.internal.l;
import t0.H;
import v.k0;
import x.C2576e;
import x.C2588k;
import x.C2589k0;
import x.C2592m;
import x.C2604s0;
import x.InterfaceC2591l0;
import x.P;
import y.C2654j;
import z0.AbstractC2749f;
import z0.Z;

/* loaded from: classes.dex */
final class ScrollableElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2591l0 f6834k;

    /* renamed from: l, reason: collision with root package name */
    public final P f6835l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f6836m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6837n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6838o;

    /* renamed from: p, reason: collision with root package name */
    public final C2592m f6839p;

    /* renamed from: q, reason: collision with root package name */
    public final C2654j f6840q;

    public ScrollableElement(k0 k0Var, C2592m c2592m, P p5, InterfaceC2591l0 interfaceC2591l0, C2654j c2654j, boolean z3, boolean z5) {
        this.f6834k = interfaceC2591l0;
        this.f6835l = p5;
        this.f6836m = k0Var;
        this.f6837n = z3;
        this.f6838o = z5;
        this.f6839p = c2592m;
        this.f6840q = c2654j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return l.a(this.f6834k, scrollableElement.f6834k) && this.f6835l == scrollableElement.f6835l && l.a(this.f6836m, scrollableElement.f6836m) && this.f6837n == scrollableElement.f6837n && this.f6838o == scrollableElement.f6838o && l.a(this.f6839p, scrollableElement.f6839p) && l.a(this.f6840q, scrollableElement.f6840q);
    }

    public final int hashCode() {
        int hashCode = (this.f6835l.hashCode() + (this.f6834k.hashCode() * 31)) * 31;
        k0 k0Var = this.f6836m;
        int hashCode2 = (((((hashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31) + (this.f6837n ? 1231 : 1237)) * 31) + (this.f6838o ? 1231 : 1237)) * 31;
        C2592m c2592m = this.f6839p;
        int hashCode3 = (hashCode2 + (c2592m != null ? c2592m.hashCode() : 0)) * 31;
        C2654j c2654j = this.f6840q;
        return (hashCode3 + (c2654j != null ? c2654j.hashCode() : 0)) * 31;
    }

    @Override // z0.Z
    public final o i() {
        P p5 = this.f6835l;
        C2654j c2654j = this.f6840q;
        return new C2589k0(this.f6836m, this.f6839p, p5, this.f6834k, c2654j, this.f6837n, this.f6838o);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        boolean z3;
        H h3;
        C2589k0 c2589k0 = (C2589k0) oVar;
        boolean z5 = c2589k0.f20801C;
        boolean z6 = this.f6837n;
        boolean z7 = true;
        boolean z8 = false;
        if (z5 != z6) {
            c2589k0.f20811O.f11583k = z6;
            c2589k0.f20808L.f20728y = z6;
            z3 = true;
        } else {
            z3 = false;
        }
        C2592m c2592m = this.f6839p;
        C2592m c2592m2 = c2592m == null ? c2589k0.f20809M : c2592m;
        C2604s0 c2604s0 = c2589k0.f20810N;
        InterfaceC2591l0 interfaceC2591l0 = c2604s0.f20863a;
        InterfaceC2591l0 interfaceC2591l02 = this.f6834k;
        if (!l.a(interfaceC2591l0, interfaceC2591l02)) {
            c2604s0.f20863a = interfaceC2591l02;
            z8 = true;
        }
        k0 k0Var = this.f6836m;
        c2604s0.f20864b = k0Var;
        P p5 = c2604s0.f20866d;
        P p6 = this.f6835l;
        if (p5 != p6) {
            c2604s0.f20866d = p6;
            z8 = true;
        }
        boolean z9 = c2604s0.f20867e;
        boolean z10 = this.f6838o;
        if (z9 != z10) {
            c2604s0.f20867e = z10;
            z8 = true;
        }
        c2604s0.f20865c = c2592m2;
        c2604s0.f = c2589k0.K;
        C2588k c2588k = c2589k0.f20812P;
        c2588k.f20797y = p6;
        c2588k.f20790A = z10;
        c2589k0.f20807I = k0Var;
        c2589k0.J = c2592m;
        C2576e c2576e = C2576e.f20755n;
        P p7 = c2604s0.f20866d;
        P p8 = P.f20695k;
        if (p7 != p8) {
            p8 = P.f20696l;
        }
        c2589k0.f20800B = c2576e;
        if (c2589k0.f20801C != z6) {
            c2589k0.f20801C = z6;
            if (!z6) {
                c2589k0.E0();
                H h4 = c2589k0.f20806H;
                if (h4 != null) {
                    c2589k0.z0(h4);
                }
                c2589k0.f20806H = null;
            }
            z8 = true;
        }
        C2654j c2654j = c2589k0.f20802D;
        C2654j c2654j2 = this.f6840q;
        if (!l.a(c2654j, c2654j2)) {
            c2589k0.E0();
            c2589k0.f20802D = c2654j2;
        }
        if (c2589k0.f20799A != p8) {
            c2589k0.f20799A = p8;
        } else {
            z7 = z8;
        }
        if (z7 && (h3 = c2589k0.f20806H) != null) {
            h3.A0();
        }
        if (z3) {
            c2589k0.f20814R = null;
            c2589k0.f20815S = null;
            AbstractC2749f.o(c2589k0);
        }
    }
}
