package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class f extends com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f3825a;
    private java.util.Set b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        java.util.Set set = this.b;
        if (set != null) {
            return new com.google.android.play.core.integrity.h(this.f3825a, set, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(java.util.Set<java.lang.Integer> set) {
        if (set == null) {
            throw new java.lang.NullPointerException("Null verdictOptOut");
        }
        this.b = set;
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(java.lang.String str) {
        this.f3825a = str;
        return this;
    }

    f() {
    }
}
