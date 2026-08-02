package com.plaid.internal;

/* renamed from: com.plaid.internal.t6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0650t6 extends com.plaid.internal.AbstractC0544h7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6582a;

    public C0650t6(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f6582a = str;
    }

    public final java.lang.String a() {
        return this.f6582a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.plaid.internal.C0650t6) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6582a, ((com.plaid.internal.C0650t6) obj).f6582a);
    }

    public final int hashCode() {
        return this.f6582a.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f6582a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProveSnaSessionInfo(verificationId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
