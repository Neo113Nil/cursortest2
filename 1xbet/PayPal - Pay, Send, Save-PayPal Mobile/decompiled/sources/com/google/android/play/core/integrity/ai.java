package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.aj f3793a;
    private final com.google.android.play.integrity.internal.s b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
    private final com.google.android.gms.tasks.TaskCompletionSource c;

    ai(com.google.android.play.core.integrity.aj ajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.f3793a = ajVar;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(android.os.Bundle bundle) {
        com.google.android.play.core.integrity.k kVar;
        java.lang.String str;
        this.f3793a.f3794a.v(this.c);
        this.b.d("onRequestIntegrityToken", new java.lang.Object[0]);
        kVar = this.f3793a.f;
        com.google.android.gms.common.api.ApiException a2 = kVar.a(bundle);
        if (a2 != null) {
            this.c.trySetException(a2);
            return;
        }
        java.lang.String string = bundle.getString(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
        if (string == null) {
            this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, null));
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.f3793a.c;
        com.google.android.play.core.integrity.ah ahVar = new com.google.android.play.core.integrity.ah(this, str, j);
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.c;
        com.google.android.play.core.integrity.a aVar = new com.google.android.play.core.integrity.a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
