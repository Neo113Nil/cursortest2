package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ye, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4787ye extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Pi f32569a;

    public C4787ye(Pi effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f32569a = effect;
    }

    @Override // Ve.E
    public final Pi c() {
        return this.f32569a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4787ye) && Intrinsics.d(this.f32569a, ((C4787ye) obj).f32569a);
    }

    public final int hashCode() {
        return this.f32569a.hashCode();
    }

    public final String toString() {
        return "RevokeFail(effect=" + this.f32569a + ")";
    }
}
