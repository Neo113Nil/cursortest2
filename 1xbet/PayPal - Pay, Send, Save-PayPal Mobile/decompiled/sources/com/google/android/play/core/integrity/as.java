package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.gms.tasks.TaskCompletionSource f3801a;
    final com.google.android.play.integrity.internal.ae b;
    private final com.google.android.play.integrity.internal.s c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");
    private final java.lang.String d;
    private final com.google.android.play.core.integrity.k e;
    private final android.app.Activity f;

    as(android.content.Context context, com.google.android.play.core.integrity.k kVar, android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.d = context.getPackageName();
        this.e = kVar;
        this.f3801a = taskCompletionSource;
        this.f = activity;
        this.b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(android.os.Bundle bundle) {
        this.b.v(this.f3801a);
        this.c.d("onRequestDialog(%s)", this.d);
        com.google.android.gms.common.api.ApiException a2 = this.e.a(bundle);
        if (a2 != null) {
            this.f3801a.trySetException(a2);
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.c.b("onRequestDialog(%s): got null dialog intent", this.d);
            this.f3801a.trySetResult(0);
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f, (java.lang.Class<?>) com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new com.google.android.play.core.integrity.ar(this, this.b.c()));
        this.c.a("Starting dialog intent...", new java.lang.Object[0]);
        this.f.startActivityForResult(intent, 0);
    }
}
