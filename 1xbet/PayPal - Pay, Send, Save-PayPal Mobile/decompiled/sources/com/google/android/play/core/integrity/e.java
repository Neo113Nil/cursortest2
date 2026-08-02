package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class e extends com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final long f3824a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    final int a() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest)) {
            return false;
        }
        com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
        if (this.f3824a != prepareIntegrityTokenRequest.b()) {
            return false;
        }
        prepareIntegrityTokenRequest.a();
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber=");
        sb.append(this.f3824a);
        sb.append(", webViewRequestMode=0}");
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.f3824a;
        return (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
        return this.f3824a;
    }

    /* synthetic */ e(long j, int i, com.google.android.play.core.integrity.d dVar) {
        this.f3824a = j;
    }
}
