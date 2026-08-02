package androidx.compose.ui.layout;

import b0.o;
import i4.c;
import x0.W;
import z0.Z;

/* loaded from: classes.dex */
final class OnSizeChangedModifier extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final c f6936k;

    public OnSizeChangedModifier(c cVar) {
        this.f6936k = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f6936k == ((OnSizeChangedModifier) obj).f6936k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6936k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        W w5 = new W();
        w5.f20969y = this.f6936k;
        long j5 = Integer.MIN_VALUE;
        w5.f20970z = (j5 & 4294967295L) | (j5 << 32);
        return w5;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        W w5 = (W) oVar;
        w5.f20969y = this.f6936k;
        long j5 = Integer.MIN_VALUE;
        w5.f20970z = (j5 & 4294967295L) | (j5 << 32);
    }
}
