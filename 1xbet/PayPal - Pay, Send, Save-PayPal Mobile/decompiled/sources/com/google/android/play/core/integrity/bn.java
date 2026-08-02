package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
final class bn {

    /* renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f3816a;
    private final com.google.android.play.integrity.internal.s b;
    private final java.lang.String c;
    private final com.google.android.gms.tasks.TaskCompletionSource d;
    private final com.google.android.play.core.integrity.at e;
    private final com.google.android.play.core.integrity.k f;

    bn(android.content.Context context, com.google.android.play.integrity.internal.s sVar, com.google.android.play.core.integrity.at atVar, com.google.android.play.core.integrity.k kVar) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.d = taskCompletionSource;
        this.c = context.getPackageName();
        this.b = sVar;
        this.e = atVar;
        this.f = kVar;
        com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, "ExpressIntegrityService", com.google.android.play.core.integrity.bo.f3817a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.z
            public final java.lang.Object a(android.os.IBinder iBinder) {
                return com.google.android.play.integrity.internal.h.b(iBinder);
            }
        }, null);
        this.f3816a = aeVar;
        aeVar.c().post(new com.google.android.play.core.integrity.be(this, taskCompletionSource, context));
    }

    static /* synthetic */ android.os.Bundle a(com.google.android.play.core.integrity.bn bnVar, com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
        bundle.putLong("warm.up.sid", j2);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new java.util.ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new java.util.ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* synthetic */ android.os.Bundle b(com.google.android.play.core.integrity.bn bnVar, long j, int i) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package.name", bnVar.c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new java.util.ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    static /* synthetic */ boolean k(com.google.android.play.core.integrity.bn bnVar, int i) {
        return bnVar.d.getTask().isSuccessful() && ((java.lang.Integer) bnVar.d.getTask().getResult()).intValue() < 83420000;
    }

    static /* synthetic */ boolean l(com.google.android.play.core.integrity.bn bnVar) {
        return bnVar.d.getTask().isSuccessful() && ((java.lang.Integer) bnVar.d.getTask().getResult()).intValue() == 0;
    }

    final com.google.android.gms.tasks.Task c(android.app.Activity activity, android.os.Bundle bundle) {
        int i = bundle.getInt("dialog.intent.type");
        this.b.d("requestAndShowDialog(%s)", java.lang.Integer.valueOf(i));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f3816a.t(new com.google.android.play.core.integrity.bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task d(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
        this.b.d("requestExpressIntegrityToken(%s)", java.lang.Long.valueOf(j2));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f3816a.t(new com.google.android.play.core.integrity.bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j2, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task e(long j, int i) {
        this.b.d("warmUpIntegrityToken(%s)", java.lang.Long.valueOf(j));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f3816a.t(new com.google.android.play.core.integrity.bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
