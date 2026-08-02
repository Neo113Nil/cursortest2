package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class aa implements com.google.android.play.core.integrity.IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.integrity.aj f3787a;

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.IntegrityTokenResponse> requestIntegrityToken(com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest) {
        return this.f3787a.c(integrityTokenRequest);
    }

    aa(com.google.android.play.core.integrity.aj ajVar) {
        this.f3787a = ajVar;
    }
}
