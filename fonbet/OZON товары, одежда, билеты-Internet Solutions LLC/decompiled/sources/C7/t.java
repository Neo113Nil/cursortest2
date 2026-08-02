package C7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class t extends r {

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ u f4456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, TaskCompletionSource taskCompletionSource, String str) {
        super(uVar, new D7.n("OnRequestInstallCallback"), taskCompletionSource);
        this.f4456h = uVar;
    }

    @Override // C7.r, D7.j
    public final void k(Bundle bundle) throws RemoteException {
        super.k(bundle);
        int i11 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.f4454f;
        if (i11 != 0) {
            taskCompletionSource.trySetException(new E7.a(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult(u.e(this.f4456h, bundle));
        }
    }
}
