package androidx.compose.ui.focus;

import g0.o;
import g0.q;
import kotlin.jvm.internal.l;
import z0.Z;

/* loaded from: classes.dex */
final class FocusRequesterElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final o f6916k;

    public FocusRequesterElement(o oVar) {
        this.f6916k = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && l.a(this.f6916k, ((FocusRequesterElement) obj).f6916k);
    }

    public final int hashCode() {
        return this.f6916k.hashCode();
    }

    @Override // z0.Z
    public final b0.o i() {
        q qVar = new q();
        qVar.f17053y = this.f6916k;
        return qVar;
    }

    @Override // z0.Z
    public final void k(b0.o oVar) {
        q qVar = (q) oVar;
        qVar.f17053y.f17052a.k(qVar);
        o oVar2 = this.f6916k;
        qVar.f17053y = oVar2;
        oVar2.f17052a.c(qVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f6916k + ')';
    }
}
