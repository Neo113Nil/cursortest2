package androidx.compose.ui.semantics;

import b0.n;
import b0.o;
import i4.c;
import z0.Z;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends Z implements n {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6947k;

    /* renamed from: l, reason: collision with root package name */
    public final c f6948l;

    public AppendedSemanticsElement(c cVar, boolean z3) {
        this.f6947k = z3;
        this.f6948l = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f6947k == appendedSemanticsElement.f6947k && this.f6948l == appendedSemanticsElement.f6948l;
    }

    public final int hashCode() {
        return this.f6948l.hashCode() + ((this.f6947k ? 1231 : 1237) * 31);
    }

    @Override // z0.Z
    public final o i() {
        H0.c cVar = new H0.c();
        cVar.f2066y = this.f6947k;
        cVar.f2067z = this.f6948l;
        return cVar;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        H0.c cVar = (H0.c) oVar;
        cVar.f2066y = this.f6947k;
        cVar.f2067z = this.f6948l;
    }
}
