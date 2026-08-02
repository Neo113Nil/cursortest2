package C7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class s extends r {
    @Override // C7.r, D7.j
    public final void a(Bundle bundle) throws RemoteException {
        super.a(bundle);
        int i11 = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.f4454f;
        if (i11 != 0) {
            taskCompletionSource.trySetException(new E7.a(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult(null);
        }
    }
}
