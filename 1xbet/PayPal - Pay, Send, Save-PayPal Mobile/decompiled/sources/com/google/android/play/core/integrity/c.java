package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class c extends com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f3823a;
    private byte b;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.b == 3) {
            return new com.google.android.play.core.integrity.e(this.f3823a, 0, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f3823a = j;
        this.b = (byte) (this.b | 1);
        return this;
    }

    public final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i) {
        this.b = (byte) (this.b | 2);
        return this;
    }

    c() {
    }
}
