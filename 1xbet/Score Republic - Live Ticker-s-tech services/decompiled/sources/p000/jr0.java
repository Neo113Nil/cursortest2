package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jr0 {

    /* JADX INFO: renamed from: a */
    public final int f4072a;

    /* JADX INFO: renamed from: b */
    public final float f4073b;

    /* JADX INFO: renamed from: c */
    public final float f4074c;

    /* JADX INFO: renamed from: d */
    public final float f4075d;

    /* JADX INFO: renamed from: e */
    public final long f4076e;

    public jr0(int i, float f, float f2, float f3, long j) {
        this.f4072a = i;
        this.f4073b = f;
        this.f4074c = f2;
        this.f4075d = f3;
        this.f4076e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jr0.class == obj.getClass()) {
            jr0 jr0Var = (jr0) obj;
            return this.f4074c == jr0Var.f4074c && this.f4075d == jr0Var.f4075d && this.f4073b == jr0Var.f4073b && this.f4072a == jr0Var.f4072a && this.f4076e == jr0Var.f4076e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4076e) + ((Integer.hashCode(this.f4072a) + ((Float.hashCode(this.f4073b) + ((Float.hashCode(this.f4075d) + (Float.hashCode(this.f4074c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f4074c + ", touchY=" + this.f4075d + ", progress=" + this.f4073b + ", swipeEdge=" + this.f4072a + ", frameTimeMillis=" + this.f4076e + ')';
    }
}
