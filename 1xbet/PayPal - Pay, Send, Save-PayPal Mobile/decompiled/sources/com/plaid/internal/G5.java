package com.plaid.internal;

/* loaded from: classes16.dex */
public final class G5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.Gson f5795a;
    public final javax.net.SocketFactory b;

    public G5() {
        this(null, 3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.G5)) {
            return false;
        }
        com.plaid.internal.G5 g5 = (com.plaid.internal.G5) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5795a, g5.f5795a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, g5.b);
    }

    public final int hashCode() {
        com.google.gson.Gson gson = this.f5795a;
        int hashCode = gson == null ? 0 : gson.hashCode();
        javax.net.SocketFactory socketFactory = this.b;
        return (hashCode * 31) + (socketFactory != null ? socketFactory.hashCode() : 0);
    }

    public final java.lang.String toString() {
        com.google.gson.Gson gson = this.f5795a;
        javax.net.SocketFactory socketFactory = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaidRetrofitOptions(gson=");
        sb.append(gson);
        sb.append(", socketFactory=");
        sb.append(socketFactory);
        sb.append(")");
        return sb.toString();
    }

    public G5(com.google.gson.Gson gson, int i) {
        this.f5795a = (i & 1) != 0 ? null : gson;
        this.b = null;
    }
}
