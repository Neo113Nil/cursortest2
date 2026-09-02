package r;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6473b;

    public /* synthetic */ f(Context context, int i2) {
        this.f6472a = i2;
        this.f6473b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6472a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f6473b, 1));
                break;
            default:
                e.s(this.f6473b, new c(), e.f6462a, false);
                break;
        }
    }
}
