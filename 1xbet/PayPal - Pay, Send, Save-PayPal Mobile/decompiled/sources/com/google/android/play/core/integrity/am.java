package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class am extends com.google.android.play.core.integrity.IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f3797a;
    private java.lang.Long b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityTokenRequest build() {
        java.lang.String str = this.f3797a;
        if (str == null) {
            throw new java.lang.IllegalStateException("Missing required properties: nonce");
        }
        com.google.android.play.core.integrity.an anVar = null;
        return new com.google.android.play.core.integrity.ao(str, this.b, anVar, anVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.b = java.lang.Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.IntegrityTokenRequest.Builder setNonce(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null nonce");
        }
        this.f3797a = str;
        return this;
    }

    am() {
    }
}
