package com.ironsource;

/* loaded from: classes5.dex */
public final class Rc {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5950a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public Rc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.f5950a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.f5950a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Rc)) {
            return false;
        }
        com.ironsource.Rc rc = (com.ironsource.Rc) obj;
        return this.f5950a == rc.f5950a && this.b == rc.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f5950a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.b;
    }

    public java.lang.String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f5950a + ", flags=" + this.b + ")";
    }

    public Rc(boolean z, int i) {
        this.f5950a = z;
        this.b = i;
    }

    public final com.ironsource.Rc a(boolean z, int i) {
        return new com.ironsource.Rc(z, i);
    }

    public static /* synthetic */ com.ironsource.Rc a(com.ironsource.Rc rc, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = rc.f5950a;
        }
        if ((i2 & 2) != 0) {
            i = rc.b;
        }
        return rc.a(z, i);
    }

    public /* synthetic */ Rc(boolean z, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }
}
