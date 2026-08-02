package U2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f5873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5874b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5875c;

    public h(int i, int i5, boolean z3) {
        this.f5873a = i;
        this.f5874b = i5;
        this.f5875c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f5873a == hVar.f5873a && this.f5874b == hVar.f5874b && this.f5875c == hVar.f5875c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f5875c ? 1237 : 1231) ^ ((((this.f5873a ^ 1000003) * 1000003) ^ this.f5874b) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f5873a + ", clickPrerequisite=" + this.f5874b + ", notificationFlowEnabled=" + this.f5875c + "}";
    }
}
