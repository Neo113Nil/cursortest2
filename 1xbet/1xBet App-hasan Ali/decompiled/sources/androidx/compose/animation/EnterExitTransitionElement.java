package androidx.compose.animation;

import W0.b;
import b0.o;
import i4.InterfaceC2015a;
import kotlin.jvm.internal.l;
import t.C2381C;
import t.C2382D;
import t.C2383E;
import t.C2384F;
import t.s;
import t.w;
import u.t0;
import z0.Z;

/* loaded from: classes.dex */
final class EnterExitTransitionElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final t0 f6798k;

    /* renamed from: l, reason: collision with root package name */
    public final C2383E f6799l;

    /* renamed from: m, reason: collision with root package name */
    public final C2384F f6800m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2015a f6801n;

    /* renamed from: o, reason: collision with root package name */
    public final w f6802o;

    public EnterExitTransitionElement(t0 t0Var, C2383E c2383e, C2384F c2384f, InterfaceC2015a interfaceC2015a, w wVar) {
        this.f6798k = t0Var;
        this.f6799l = c2383e;
        this.f6800m = c2384f;
        this.f6801n = interfaceC2015a;
        this.f6802o = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f6798k.equals(enterExitTransitionElement.f6798k) && this.f6799l.equals(enterExitTransitionElement.f6799l) && l.a(this.f6800m, enterExitTransitionElement.f6800m) && l.a(this.f6801n, enterExitTransitionElement.f6801n) && l.a(this.f6802o, enterExitTransitionElement.f6802o);
    }

    public final int hashCode() {
        return this.f6802o.hashCode() + ((this.f6801n.hashCode() + ((this.f6800m.f19343a.hashCode() + ((this.f6799l.f19340a.hashCode() + (this.f6798k.hashCode() * 923521)) * 31)) * 31)) * 31);
    }

    @Override // z0.Z
    public final o i() {
        C2383E c2383e = this.f6799l;
        C2384F c2384f = this.f6800m;
        t0 t0Var = this.f6798k;
        InterfaceC2015a interfaceC2015a = this.f6801n;
        w wVar = this.f6802o;
        C2382D c2382d = new C2382D();
        c2382d.f19337y = t0Var;
        c2382d.f19338z = c2383e;
        c2382d.f19332A = c2384f;
        c2382d.f19333B = interfaceC2015a;
        c2382d.f19334C = wVar;
        c2382d.f19335D = s.f19405a;
        b.b(0, 0, 15);
        new C2381C(c2382d, 0);
        new C2381C(c2382d, 1);
        return c2382d;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        C2382D c2382d = (C2382D) oVar;
        c2382d.f19337y = this.f6798k;
        c2382d.f19338z = this.f6799l;
        c2382d.f19332A = this.f6800m;
        c2382d.f19333B = this.f6801n;
        c2382d.f19334C = this.f6802o;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f6798k + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.f6799l + ", exit=" + this.f6800m + ", isEnabled=" + this.f6801n + ", graphicsLayerBlock=" + this.f6802o + ')';
    }
}
