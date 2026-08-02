package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class h extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3826a;
    private final java.util.Set b;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        java.lang.String str = this.f3826a;
        if (str == null) {
            if (standardIntegrityTokenRequest.requestHash() != null) {
                return false;
            }
        } else if (!str.equals(standardIntegrityTokenRequest.requestHash())) {
            return false;
        }
        return this.b.equals(standardIntegrityTokenRequest.verdictOptOut());
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.b.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StandardIntegrityTokenRequest{requestHash=");
        sb.append(this.f3826a);
        sb.append(", verdictOptOut=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.f3826a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final java.util.Set<java.lang.Integer> verdictOptOut() {
        return this.b;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final java.lang.String requestHash() {
        return this.f3826a;
    }

    /* synthetic */ h(java.lang.String str, java.util.Set set, com.google.android.play.core.integrity.g gVar) {
        this.f3826a = str;
        this.b = set;
    }
}
