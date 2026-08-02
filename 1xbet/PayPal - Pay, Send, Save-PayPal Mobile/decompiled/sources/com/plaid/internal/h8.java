package com.plaid.internal;

/* loaded from: classes16.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6433a;
    public final java.lang.String b;
    public final byte[] c;

    public h8(java.lang.String str, java.lang.String str2, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.f6433a = str;
        this.b = str2;
        this.c = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.internal.h8.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        com.plaid.internal.h8 h8Var = (com.plaid.internal.h8) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6433a, h8Var.f6433a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, h8Var.b) && java.util.Arrays.equals(this.c, h8Var.c);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.c) + com.plaid.internal.C0679x.a(this.b, this.f6433a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f6433a;
        java.lang.String str2 = this.b;
        java.lang.String arrays = java.util.Arrays.toString(this.c);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkflowAnalyticsEntity(workflowId=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", model=");
        sb.append(arrays);
        sb.append(")");
        return sb.toString();
    }
}
