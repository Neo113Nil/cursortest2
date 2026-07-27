package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes7.dex */
public final class f {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10743a;

    public f(boolean z) {
        this.f10743a = z;
    }

    public final boolean a() {
        return this.f10743a;
    }

    public final boolean b() {
        return this.f10743a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f10743a == ((f) obj).f10743a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f10743a);
    }

    public String toString() {
        return "BidTokenConfig(dbtEnabled=" + this.f10743a + ')';
    }

    public final f a(boolean z) {
        return new f(z);
    }

    public static /* synthetic */ f a(f fVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fVar.f10743a;
        }
        return fVar.a(z);
    }
}
