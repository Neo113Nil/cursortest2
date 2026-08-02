package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class h extends com.iovation.mobile.android.b.i {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f3932a;
    public final java.lang.String b;
    public final long c;
    public final int d;

    public h(org.json.JSONObject jSONObject, java.lang.String str, long j, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f3932a = jSONObject;
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.iovation.mobile.android.b.h)) {
            return false;
        }
        com.iovation.mobile.android.b.h hVar = (com.iovation.mobile.android.b.h) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3932a, hVar.f3932a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, hVar.b) && this.c == hVar.c && this.d == hVar.d;
    }

    public final int hashCode() {
        int hashCode = this.f3932a.hashCode();
        int hashCode2 = this.b.hashCode();
        return java.lang.Integer.hashCode(this.d) + ((java.lang.Long.hashCode(this.c) + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(phoneHomeData=");
        sb.append(this.f3932a);
        sb.append(", serverTime=");
        sb.append(this.b);
        sb.append(", executionTime=");
        sb.append(this.c);
        sb.append(", responseCode=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
