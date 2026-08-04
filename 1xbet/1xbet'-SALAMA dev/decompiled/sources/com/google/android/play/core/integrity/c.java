package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f11671b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i7) {
        this.f11671b = (byte) (this.f11671b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f11671b == 3) {
            return new e(this.f11670a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11671b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f11671b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f11670a = j;
        this.f11671b = (byte) (this.f11671b | 1);
        return this;
    }
}
