package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f11646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A3.z f11647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.f11646c = bnVar;
        this.f11647d = new A3.z("OnRequestIntegrityTokenCallback");
        this.f11648e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, A3.r
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f11647d.b("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.j jVarA = this.f11646c.f11657f.a(bundle);
        if (jVarA != null) {
            this.f11643a.trySetException(jVarA);
            return;
        }
        bj bjVar = new bj(this, this.f11646c.f11654c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f11643a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
