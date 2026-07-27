package x0;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12254a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12255b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12256c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12257d;

    public C1535a(boolean z, boolean z5, boolean z6, boolean z7) {
        this.f12254a = z;
        this.f12255b = z5;
        this.f12256c = z6;
        this.f12257d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1535a)) {
            return false;
        }
        C1535a c1535a = (C1535a) obj;
        return this.f12254a == c1535a.f12254a && this.f12255b == c1535a.f12255b && this.f12256c == c1535a.f12256c && this.f12257d == c1535a.f12257d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z = this.f12254a;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = i2 * 31;
        boolean z5 = this.f12255b;
        int i6 = z5;
        if (z5 != 0) {
            i6 = 1;
        }
        int i7 = (i3 + i6) * 31;
        boolean z6 = this.f12256c;
        int i8 = z6;
        if (z6 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z7 = this.f12257d;
        return i9 + (z7 ? 1 : z7 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f12254a + ", isValidated=" + this.f12255b + ", isMetered=" + this.f12256c + ", isNotRoaming=" + this.f12257d + ')';
    }
}
