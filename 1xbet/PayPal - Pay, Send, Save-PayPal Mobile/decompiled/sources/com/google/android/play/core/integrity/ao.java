package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class ao extends com.google.android.play.core.integrity.IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3798a;
    private final java.lang.Long b;
    private final java.lang.Object c = null;

    private static boolean a() {
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        java.lang.Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.integrity.IntegrityTokenRequest) {
            com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest = (com.google.android.play.core.integrity.IntegrityTokenRequest) obj;
            if (this.f3798a.equals(integrityTokenRequest.nonce()) && ((l = this.b) != null ? l.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z = true;
                if ((obj instanceof com.google.android.play.core.integrity.ao) || !a()) {
                    return z;
                }
                com.google.android.play.core.integrity.ao aoVar = (com.google.android.play.core.integrity.ao) obj;
                if (!z) {
                    return false;
                }
                java.lang.Object obj2 = aoVar.c;
                return true;
            }
        }
        z = false;
        if (obj instanceof com.google.android.play.core.integrity.ao) {
        }
        return z;
    }

    public final int hashCode() {
        int hashCode = this.f3798a.hashCode();
        java.lang.Long l = this.b;
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ (l == null ? 0 : l.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntegrityTokenRequest{nonce=");
        sb.append(this.f3798a);
        sb.append(", cloudProjectNumber=");
        sb.append(this.b);
        java.lang.String obj = sb.toString();
        if (a()) {
            obj = obj.concat(", network=null");
        }
        return obj.concat("}");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final java.lang.String nonce() {
        return this.f3798a;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final java.lang.Long cloudProjectNumber() {
        return this.b;
    }

    /* synthetic */ ao(java.lang.String str, java.lang.Long l, java.lang.Object obj, com.google.android.play.core.integrity.an anVar) {
        this.f3798a = str;
        this.b = l;
    }
}
