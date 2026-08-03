package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f4192a;
    public final int b;

    public g0(int i, java.lang.Object obj) {
        this.f4192a = obj;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.g0)) {
            return false;
        }
        com.fyber.inneractive.sdk.protobuf.g0 g0Var = (com.fyber.inneractive.sdk.protobuf.g0) obj;
        return this.f4192a == g0Var.f4192a && this.b == g0Var.b;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.f4192a) * 65535) + this.b;
    }
}
