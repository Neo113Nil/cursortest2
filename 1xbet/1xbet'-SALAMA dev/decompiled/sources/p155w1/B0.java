package p155w1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1055z0 f17289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f17292d;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        B0 b7 = (B0) obj;
        C1055z0 c1055z0 = b7.f17289a;
        C1055z0 c1055z1 = this.f17289a;
        if (c1055z1 != c1055z0) {
            return c1055z1 == C1055z0.f17948d ? -1 : 1;
        }
        return this.f17290b - b7.f17290b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b7 = (B0) obj;
        return this.f17289a == b7.f17289a && this.f17290b == b7.f17290b;
    }

    public final int hashCode() {
        return (this.f17289a.hashCode() * 31) + this.f17290b;
    }

    public final String toString() {
        return this.f17289a + ":" + this.f17290b + ":" + this.f17291c;
    }
}
