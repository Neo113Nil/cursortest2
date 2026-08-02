package G7;

import M7.w;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class q extends M7.k {

    /* renamed from: e, reason: collision with root package name */
    private final M7.m f9750e;

    /* renamed from: f, reason: collision with root package name */
    private final TaskCompletionSource f9751f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f9752g;

    q(r rVar, TaskCompletionSource taskCompletionSource) {
        this.f9752g = rVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f9750e = new M7.m("OnRequestIntegrityTokenCallback");
        this.f9751f = taskCompletionSource;
    }

    @Override // M7.l
    public final void f(Bundle bundle) {
        w wVar = this.f9752g.f9755c;
        TaskCompletionSource taskCompletionSource = this.f9751f;
        wVar.r(taskCompletionSource);
        this.f9750e.d("onRequestIntegrityToken", new Object[0]);
        int i11 = bundle.getInt("error");
        if (i11 != 0) {
            taskCompletionSource.trySetException(new c(i11, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            taskCompletionSource.trySetException(new c(-100, null));
            return;
        }
        h hVar = new h();
        hVar.a(string);
        taskCompletionSource.trySetResult(hVar.b());
    }
}
