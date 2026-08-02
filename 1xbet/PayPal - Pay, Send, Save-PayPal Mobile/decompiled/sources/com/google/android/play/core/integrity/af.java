package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f3790a;
    final /* synthetic */ java.lang.Long b;
    final /* synthetic */ android.os.Parcelable c;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource d;
    final /* synthetic */ com.google.android.play.core.integrity.IntegrityTokenRequest e;
    final /* synthetic */ com.google.android.play.core.integrity.aj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(com.google.android.play.core.integrity.aj ajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, byte[] bArr, java.lang.Long l, android.os.Parcelable parcelable, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f3790a = bArr;
        this.b = l;
        this.c = parcelable;
        this.d = taskCompletionSource2;
        this.e = integrityTokenRequest;
        this.f = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(java.lang.Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new com.google.android.play.core.integrity.IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        com.google.android.play.integrity.internal.s sVar;
        try {
            ((com.google.android.play.integrity.internal.n) this.f.f3794a.e()).d(com.google.android.play.core.integrity.aj.a(this.f, this.f3790a, this.b, this.c), new com.google.android.play.core.integrity.ai(this.f, this.d));
        } catch (android.os.RemoteException e) {
            com.google.android.play.core.integrity.aj ajVar = this.f;
            com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest = this.e;
            sVar = ajVar.b;
            sVar.c(e, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.d.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, e));
        }
    }
}
