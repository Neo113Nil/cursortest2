package K1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f951a;

    public k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f951a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // K1.e
    public final void a(c cVar) {
        this.f951a.post(cVar);
    }
}
