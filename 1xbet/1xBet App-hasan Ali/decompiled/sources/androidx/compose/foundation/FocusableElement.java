package androidx.compose.foundation;

import b0.o;
import kotlin.jvm.internal.l;
import v.N;
import y.C2654j;
import z0.Z;

/* loaded from: classes.dex */
final class FocusableElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C2654j f6816k;

    public FocusableElement(C2654j c2654j) {
        this.f6816k = c2654j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return l.a(this.f6816k, ((FocusableElement) obj).f6816k);
        }
        return false;
    }

    public final int hashCode() {
        C2654j c2654j = this.f6816k;
        if (c2654j != null) {
            return c2654j.hashCode();
        }
        return 0;
    }

    @Override // z0.Z
    public final o i() {
        return new N(this.f6816k);
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((N) oVar).B0(this.f6816k);
    }
}
