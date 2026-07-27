package S;

import android.content.Context;
import com.startapp.sdk.internal.gh;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1276b;

    public /* synthetic */ f(Context context, int i3) {
        this.f1275a = i3;
        this.f1276b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1275a) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new f(this.f1276b, 1));
                break;
            case 1:
                e.s(this.f1276b, new c(), e.f1266a, false);
                break;
            default:
                gh.e(this.f1276b);
                break;
        }
    }
}
