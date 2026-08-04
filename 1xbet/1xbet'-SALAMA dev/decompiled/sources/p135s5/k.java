package p135s5;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16219a;

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f16219a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // p135s5.d
    public final void a(b bVar) {
        this.f16219a.post(bVar);
    }
}
