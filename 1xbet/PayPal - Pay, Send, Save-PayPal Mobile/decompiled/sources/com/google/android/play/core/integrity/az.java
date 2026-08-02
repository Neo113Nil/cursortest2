package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class az implements com.google.android.play.core.integrity.StandardIntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.integrity.bn f3806a;
    private final com.google.android.play.core.integrity.bt b;

    final /* synthetic */ com.google.android.gms.tasks.Task a(com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, java.lang.Long l) throws java.lang.Exception {
        final long b = prepareIntegrityTokenRequest.b();
        final long longValue = l.longValue();
        prepareIntegrityTokenRequest.a();
        final com.google.android.play.core.integrity.bt btVar = this.b;
        final int i = 0;
        return com.google.android.gms.tasks.Tasks.forResult(new com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider(b, longValue, i) { // from class: com.google.android.play.core.integrity.bs
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final com.google.android.gms.tasks.Task request(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return com.google.android.play.core.integrity.bt.this.a(this.b, this.c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long b = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f3806a.e(b, 0).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.android.play.core.integrity.az.this.a(prepareIntegrityTokenRequest, (java.lang.Long) obj);
            }
        });
    }

    az(com.google.android.play.core.integrity.bn bnVar, com.google.android.play.core.integrity.bt btVar) {
        this.f3806a = bnVar;
        this.b = btVar;
    }
}
