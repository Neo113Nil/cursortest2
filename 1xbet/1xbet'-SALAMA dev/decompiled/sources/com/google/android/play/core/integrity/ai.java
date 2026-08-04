package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ai extends A3.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f11586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A3.z f11587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f11588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f11586a = ajVar;
        this.f11587b = new A3.z("OnRequestIntegrityTokenCallback");
        this.f11588c = taskCompletionSource;
    }

    @Override // A3.w
    public final void b(Bundle bundle) {
        this.f11586a.f11589a.d(this.f11588c);
        this.f11587b.b("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f11586a.f11593e.a(bundle);
        if (jVarA != null) {
            this.f11588c.trySetException(jVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f11588c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f11586a.f11591c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f11588c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
