package D3;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.Jt;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements Executor {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f964k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f965l;

    public /* synthetic */ n(int i, Object obj) {
        this.f964k = i;
        this.f965l = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f964k) {
            case 0:
                ((Jt) this.f965l).post(runnable);
                break;
            case 1:
                ((Jt) this.f965l).post(runnable);
                break;
            default:
                ((Handler) ((v3.e) this.f965l).f20433m).post(runnable);
                break;
        }
    }

    public n() {
        this.f964k = 0;
        Jt jt = new Jt(Looper.getMainLooper(), 3, false);
        Looper.getMainLooper();
        this.f965l = jt;
    }
}
