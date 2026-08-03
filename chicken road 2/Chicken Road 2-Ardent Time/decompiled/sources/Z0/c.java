package Z0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f1868a;

    /* renamed from: b, reason: collision with root package name */
    public int f1869b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1870c;

    /* renamed from: d, reason: collision with root package name */
    public final F.C0014n f1871d;

    public c(R0.b bVar) {
        F.C0014n c0014n = new F.C0014n(bVar, "flutter/lifecycle", a1.p.f1952b, null);
        this.f1868a = 0;
        this.f1869b = 0;
        this.f1870c = true;
        this.f1871d = c0014n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        java.lang.String str;
        int i4 = this.f1868a;
        if (i4 == i2 && z2 == this.f1870c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f1870c = z2;
            return;
        }
        int b2 = H.j.b(i2);
        if (b2 != 0) {
            if (b2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (b2 != 2 && b2 != 3 && b2 != 4) {
                i3 = 0;
            }
            this.f1868a = i2;
            this.f1870c = z2;
            if (i3 != this.f1869b) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppLifecycleState.");
            if (i3 == 1) {
                str = "DETACHED";
            } else if (i3 == 2) {
                str = "RESUMED";
            } else if (i3 == 3) {
                str = "INACTIVE";
            } else if (i3 == 4) {
                str = "HIDDEN";
            } else {
                if (i3 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(java.util.Locale.ROOT));
            this.f1871d.g(sb.toString(), null);
            this.f1869b = i3;
            return;
        }
        i3 = i2;
        this.f1868a = i2;
        this.f1870c = z2;
        if (i3 != this.f1869b) {
        }
    }
}
