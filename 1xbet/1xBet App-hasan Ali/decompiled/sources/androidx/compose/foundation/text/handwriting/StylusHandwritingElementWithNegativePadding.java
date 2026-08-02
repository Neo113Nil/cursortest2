package androidx.compose.foundation.text.handwriting;

import F.d;
import b0.o;
import i4.InterfaceC2015a;
import kotlin.jvm.internal.l;
import z0.Z;

/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2015a f6890k;

    public StylusHandwritingElementWithNegativePadding(InterfaceC2015a interfaceC2015a) {
        this.f6890k = interfaceC2015a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && l.a(this.f6890k, ((StylusHandwritingElementWithNegativePadding) obj).f6890k);
    }

    public final int hashCode() {
        return this.f6890k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        return new d(this.f6890k);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((d) oVar).f1515A = this.f6890k;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f6890k + ')';
    }
}
