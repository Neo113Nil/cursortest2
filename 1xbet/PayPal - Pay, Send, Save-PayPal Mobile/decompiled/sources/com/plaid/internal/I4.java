package com.plaid.internal;

/* loaded from: classes16.dex */
public final class I4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5811a;
    public final java.lang.String b;
    public final byte[] c;

    public I4(java.lang.String str, java.lang.String str2, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.f5811a = str;
        this.b = str2;
        this.c = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.I4)) {
            return false;
        }
        com.plaid.internal.I4 i4 = (com.plaid.internal.I4) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5811a, i4.f5811a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, i4.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, i4.c);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.c) + com.plaid.internal.C0679x.a(this.b, this.f5811a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5811a;
        java.lang.String str2 = this.b;
        java.lang.String arrays = java.util.Arrays.toString(this.c);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaneEntity(workflowId=");
        sb.append(str);
        sb.append(", renderingId=");
        sb.append(str2);
        sb.append(", model=");
        sb.append(arrays);
        sb.append(")");
        return sb.toString();
    }
}
