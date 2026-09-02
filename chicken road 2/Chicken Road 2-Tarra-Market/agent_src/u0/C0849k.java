package u0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: u0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849k implements InterfaceC0843e {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6730a;

    public C0849k() {
        Looper mainLooper = Looper.getMainLooper();
        this.f6730a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // u0.InterfaceC0843e
    public final void a(RunnableC0841c runnableC0841c) {
        this.f6730a.post(runnableC0841c);
    }
}
