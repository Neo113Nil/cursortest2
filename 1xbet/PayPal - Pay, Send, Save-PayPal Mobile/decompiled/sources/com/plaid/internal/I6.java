package com.plaid.internal;

/* loaded from: classes16.dex */
public final class I6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5813a;
    public final long b;
    public final java.util.Map<java.lang.String, java.lang.String> c;
    public final com.plaid.internal.J6 d;

    public I6(java.lang.String str, java.util.Map map, com.plaid.internal.J6 j6) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j6, "");
        this.f5813a = str;
        this.b = currentTimeMillis;
        this.c = map;
        this.d = j6;
    }

    public final java.lang.String a() {
        return this.f5813a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.I6)) {
            return false;
        }
        com.plaid.internal.I6 i6 = (com.plaid.internal.I6) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5813a, i6.f5813a) && this.b == i6.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, i6.c) && this.d == i6.d;
    }

    public final int hashCode() {
        int hashCode = this.f5813a.hashCode();
        int hashCode2 = java.lang.Long.hashCode(this.b);
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5813a;
        long j = this.b;
        java.util.Map<java.lang.String, java.lang.String> map = this.c;
        com.plaid.internal.J6 j6 = this.d;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoteLogEvent(eventName=");
        sb.append(str);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", metadata=");
        sb.append(map);
        sb.append(", logLevel=");
        sb.append(j6);
        sb.append(")");
        return sb.toString();
    }

    public I6() {
        throw null;
    }
}
