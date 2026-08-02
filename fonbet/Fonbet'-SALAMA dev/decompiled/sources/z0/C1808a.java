package z0;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1808a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18427a;

    public C1808a(boolean z4) {
        this.f18427a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1808a)) {
            return false;
        }
        C1808a c1808a = (C1808a) obj;
        c1808a.getClass();
        return this.f18427a == c1808a.f18427a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18427a) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f18427a;
    }
}
