package t0;

import n.AbstractC2107A;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2404a implements o {

    /* renamed from: b, reason: collision with root package name */
    public final int f19460b;

    public C2404a(int i) {
        this.f19460b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2404a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType", obj);
        return this.f19460b == ((C2404a) obj).f19460b;
    }

    public final int hashCode() {
        return this.f19460b;
    }

    public final String toString() {
        return AbstractC2107A.t(new StringBuilder("AndroidPointerIcon(type="), this.f19460b, ')');
    }
}
