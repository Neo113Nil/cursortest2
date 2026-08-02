package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.cf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4156cf extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Pi f30802a;

    public C4156cf(Pi effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f30802a = effect;
    }

    @Override // Ve.E
    public final Pi c() {
        return this.f30802a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4156cf) && Intrinsics.d(this.f30802a, ((C4156cf) obj).f30802a);
    }

    public final int hashCode() {
        return this.f30802a.hashCode();
    }

    public final String toString() {
        return "RevokeSuccess(effect=" + this.f30802a + ")";
    }
}
