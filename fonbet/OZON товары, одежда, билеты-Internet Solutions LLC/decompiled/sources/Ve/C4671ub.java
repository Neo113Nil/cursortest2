package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ub, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4671ub {

    /* renamed from: a, reason: collision with root package name */
    public final int f32201a;

    /* renamed from: b, reason: collision with root package name */
    public final Sr f32202b;

    public C4671ub(int i11, Sr text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f32201a = i11;
        this.f32202b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4671ub)) {
            return false;
        }
        C4671ub c4671ub = (C4671ub) obj;
        return this.f32201a == c4671ub.f32201a && this.f32202b.equals(c4671ub.f32202b);
    }

    public final int hashCode() {
        return this.f32202b.hashCode() + (Integer.hashCode(this.f32201a) * 31);
    }

    public final String toString() {
        return "HintHelper(priority=" + this.f32201a + ", text=" + this.f32202b + ")";
    }
}
