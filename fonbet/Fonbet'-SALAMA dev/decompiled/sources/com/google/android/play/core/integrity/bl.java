package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class bl extends bi {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f11649c;

    /* renamed from: d, reason: collision with root package name */
    private final A3.z f11650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f11649c = bnVar;
        this.f11650d = new A3.z("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, A3.r
    public final void e(Bundle bundle) {
        k kVar;
        super.e(bundle);
        this.f11650d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.f11649c.f11657f;
        com.google.android.gms.common.api.j a2 = kVar.a(bundle);
        if (a2 != null) {
            this.f11643a.trySetException(a2);
        } else {
            this.f11643a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
