package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5849a;
    public final int b;

    public g0(int i, Object obj) {
        this.f5849a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f5849a == g0Var.f5849a && this.b == g0Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f5849a) * 65535) + this.b;
    }
}
