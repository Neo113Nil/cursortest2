package androidx.compose.foundation.layout;

import b0.o;
import kotlin.jvm.internal.l;
import z.C2681E;
import z.C2682F;
import z0.Z;

/* loaded from: classes.dex */
final class PaddingValuesElement extends Z {

    /* renamed from: k, reason: collision with root package name */
    public final C2681E f6854k;

    public PaddingValuesElement(C2681E c2681e) {
        this.f6854k = c2681e;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return l.a(this.f6854k, paddingValuesElement.f6854k);
    }

    public final int hashCode() {
        return this.f6854k.hashCode();
    }

    @Override // z0.Z
    public final o i() {
        C2682F c2682f = new C2682F();
        c2682f.f21478y = this.f6854k;
        return c2682f;
    }

    @Override // z0.Z
    public final void k(o oVar) {
        ((C2682F) oVar).f21478y = this.f6854k;
    }
}
