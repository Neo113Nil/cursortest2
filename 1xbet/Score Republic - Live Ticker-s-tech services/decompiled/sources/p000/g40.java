package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g40 implements InterfaceC0558ov {

    /* JADX INFO: renamed from: j */
    public final Context f2601j;

    /* JADX INFO: renamed from: k */
    public final f40 f2602k;

    /* JADX INFO: renamed from: l */
    public final nc1 f2603l;

    /* JADX INFO: renamed from: m */
    public final Object f2604m = new Object();

    /* JADX INFO: renamed from: n */
    public Handler f2605n;

    /* JADX INFO: renamed from: o */
    public ThreadPoolExecutor f2606o;

    /* JADX INFO: renamed from: p */
    public ThreadPoolExecutor f2607p;

    /* JADX INFO: renamed from: q */
    public d71 f2608q;

    public g40(Context context, f40 f40Var) {
        hn0.m2313g(context, "Context cannot be null");
        this.f2601j = context.getApplicationContext();
        this.f2602k = f40Var;
        this.f2603l = h40.f3042d;
    }

    /* JADX INFO: renamed from: a */
    public final void m1975a() {
        synchronized (this.f2604m) {
            try {
                this.f2608q = null;
                Handler handler = this.f2605n;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f2605n = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2607p;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2606o = null;
                this.f2607p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final q40 m1976b() {
        try {
            nc1 nc1Var = this.f2603l;
            Context context = this.f2601j;
            f40 f40Var = this.f2602k;
            nc1Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{f40Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0678s3 c0678s3M1360a = e40.m1360a(context, Collections.unmodifiableList(arrayList));
            int i = c0678s3M1360a.f7021j;
            if (i != 0) {
                throw new RuntimeException(AbstractC0024an.m282e(i, "fetchFonts failed (", ")"));
            }
            q40[] q40VarArr = (q40[]) ((List) c0678s3M1360a.f7022k).get(0);
            if (q40VarArr == null || q40VarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return q40VarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            C0270h1.m2189e("provider not found", e);
            return null;
        }
    }

    @Override // p000.InterfaceC0558ov
    /* JADX INFO: renamed from: d */
    public final void mo1479d(d71 d71Var) {
        synchronized (this.f2604m) {
            this.f2608q = d71Var;
        }
        synchronized (this.f2604m) {
            try {
                if (this.f2608q == null) {
                    return;
                }
                if (this.f2606o == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0022al("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f2607p = threadPoolExecutor;
                    this.f2606o = threadPoolExecutor;
                }
                this.f2606o.execute(new RunnableC0944za(3, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
