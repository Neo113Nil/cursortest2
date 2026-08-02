package Q1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4878k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f4879l;

    public /* synthetic */ g(Context context, int i) {
        this.f4878k = i;
        this.f4879l = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4878k) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f4879l, 1));
                break;
            default:
                e.t(this.f4879l, new O1.b(0), e.f4868a, false);
                break;
        }
    }
}
