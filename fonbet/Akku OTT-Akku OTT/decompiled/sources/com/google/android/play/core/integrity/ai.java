package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.auth.Constants;

/* loaded from: classes4.dex */
final class ai extends com.google.android.play.integrity.internal.o {
    final /* synthetic */ aj a;
    private final com.google.android.play.integrity.internal.s b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
    private final TaskCompletionSource c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.a = ajVar;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        k kVar;
        String str;
        this.a.a.v(this.c);
        this.b.d("onRequestIntegrityToken", new Object[0]);
        kVar = this.a.f;
        com.google.android.gms.common.api.b a = kVar.a(bundle);
        if (a != null) {
            this.c.trySetException(a);
            return;
        }
        String string = bundle.getString(Constants.TOKEN);
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.a.c;
        ah ahVar = new ah(this, str, j);
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
