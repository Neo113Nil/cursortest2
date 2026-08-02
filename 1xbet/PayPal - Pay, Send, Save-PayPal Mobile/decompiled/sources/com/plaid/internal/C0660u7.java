package com.plaid.internal;

/* renamed from: com.plaid.internal.u7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0660u7 extends com.plaid.internal.AbstractC0544h7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6592a;
    public final java.lang.String b;

    public C0660u7(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.f6592a = str;
        this.b = str2;
    }

    public final java.lang.String a() {
        return this.b;
    }

    public final java.lang.String b() {
        return this.f6592a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.C0660u7)) {
            return false;
        }
        com.plaid.internal.C0660u7 c0660u7 = (com.plaid.internal.C0660u7) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6592a, c0660u7.f6592a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c0660u7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6592a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f6592a;
        java.lang.String str2 = this.b;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TwilioSnaSessionInfo(verificationId=");
        sb.append(str);
        sb.append(", redirectUri=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
