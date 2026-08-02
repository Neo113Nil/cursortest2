package J7;

import K7.r;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class j extends K7.f {

    /* renamed from: e, reason: collision with root package name */
    final K7.h f14171e;

    /* renamed from: f, reason: collision with root package name */
    final TaskCompletionSource f14172f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k f14173g;

    j(k kVar, TaskCompletionSource taskCompletionSource) {
        K7.h hVar = new K7.h("OnRequestInstallCallback");
        this.f14173g = kVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f14171e = hVar;
        this.f14172f = taskCompletionSource;
    }

    @Override // K7.g
    public final void a(Bundle bundle) throws RemoteException {
        r rVar = this.f14173g.f14175a;
        TaskCompletionSource taskCompletionSource = this.f14172f;
        if (rVar != null) {
            rVar.r(taskCompletionSource);
        }
        this.f14171e.d("onGetLaunchReviewFlowInfo", new Object[0]);
        taskCompletionSource.trySetResult(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
