package y2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: y2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1566k implements InterfaceC1560e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12379a;

    public C1566k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f12379a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // y2.InterfaceC1560e
    public final void a(RunnableC1558c runnableC1558c) {
        this.f12379a.post(runnableC1558c);
    }
}
