package J2;

/* loaded from: classes.dex */
public final class h extends p {

    /* renamed from: a, reason: collision with root package name */
    public final int f3819a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3820b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3821c;

    public h(int i7, int i8, boolean z4) {
        this.f3819a = i7;
        this.f3820b = i8;
        this.f3821c = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f3819a == ((h) pVar).f3819a) {
                h hVar = (h) pVar;
                if (this.f3820b == hVar.f3820b && this.f3821c == hVar.f3821c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f3821c ? 1237 : 1231) ^ ((((this.f3819a ^ 1000003) * 1000003) ^ this.f3820b) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f3819a + ", clickPrerequisite=" + this.f3820b + ", notificationFlowEnabled=" + this.f3821c + "}";
    }
}
