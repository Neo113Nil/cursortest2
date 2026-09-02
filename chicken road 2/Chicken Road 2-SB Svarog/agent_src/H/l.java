package H;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f255a;

    public l() {
        Looper mainLooper = Looper.getMainLooper();
        this.f255a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // H.e
    public final void a(c cVar) {
        this.f255a.post(cVar);
    }
}
