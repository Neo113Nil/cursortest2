package P5;

/* renamed from: P5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0396h {

    /* renamed from: a, reason: collision with root package name */
    public final String f5652a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5653b;

    public C0396h(String str, boolean z4) {
        this.f5652a = str;
        this.f5653b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0396h)) {
            return false;
        }
        C0396h c0396h = (C0396h) obj;
        return t6.h.a(this.f5652a, c0396h.f5652a) && this.f5653b == c0396h.f5653b;
    }

    public final int hashCode() {
        String str = this.f5652a;
        return Boolean.hashCode(this.f5653b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f5652a + ", useDataStore=" + this.f5653b + ")";
    }
}
