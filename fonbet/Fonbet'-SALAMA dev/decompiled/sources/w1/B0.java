package w1;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class B0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public C1764z0 f17283a;

    /* renamed from: b, reason: collision with root package name */
    public int f17284b;

    /* renamed from: c, reason: collision with root package name */
    public int f17285c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f17286d;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        B0 b02 = (B0) obj;
        C1764z0 c1764z0 = b02.f17283a;
        C1764z0 c1764z02 = this.f17283a;
        return c1764z02 != c1764z0 ? c1764z02 == C1764z0.f17942d ? -1 : 1 : this.f17284b - b02.f17284b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return this.f17283a == b02.f17283a && this.f17284b == b02.f17284b;
    }

    public final int hashCode() {
        return (this.f17283a.hashCode() * 31) + this.f17284b;
    }

    public final String toString() {
        return this.f17283a + ":" + this.f17284b + ":" + this.f17285c;
    }
}
