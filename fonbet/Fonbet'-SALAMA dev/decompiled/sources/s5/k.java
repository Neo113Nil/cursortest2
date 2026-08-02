package s5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class k implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f16213a;

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f16213a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // s5.d
    public final void a(RunnableC1600b runnableC1600b) {
        this.f16213a.post(runnableC1600b);
    }
}
