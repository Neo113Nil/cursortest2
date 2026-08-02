package androidx.compose.foundation;

import b0.o;
import kotlin.jvm.internal.l;
import v.X;
import v.Y;
import y.C2654j;
import z0.InterfaceC2755l;
import z0.Z;

/* loaded from: classes.dex */
final class IndicationModifierElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C2654j f6817k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f6818l;

    public IndicationModifierElement(C2654j c2654j, Y y5) {
        this.f6817k = c2654j;
        this.f6818l = y5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return l.a(this.f6817k, indicationModifierElement.f6817k) && l.a(this.f6818l, indicationModifierElement.f6818l);
    }

    public final int hashCode() {
        return this.f6818l.hashCode() + (this.f6817k.hashCode() * 31);
    }

    @Override // z0.Z
    public final o i() {
        InterfaceC2755l b3 = this.f6818l.b(this.f6817k);
        X x5 = new X();
        x5.f20187A = b3;
        x5.y0(b3);
        return x5;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        X x5 = (X) oVar;
        InterfaceC2755l b3 = this.f6818l.b(this.f6817k);
        x5.z0(x5.f20187A);
        x5.f20187A = b3;
        x5.y0(b3);
    }
}
