package J7;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
final class g extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f14166a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f14166a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i11, Bundle bundle) {
        this.f14166a.trySetResult(null);
    }
}
