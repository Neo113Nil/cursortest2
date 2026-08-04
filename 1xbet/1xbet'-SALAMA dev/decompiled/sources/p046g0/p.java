package p046g0;

import A1.K0;
import B.v;
import B4.V;
import I4.j;
import W5.AbstractC0486a1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p097n3.a;
import p113p3.f;

/* JADX INFO: loaded from: classes.dex */
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f13053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f13054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f13056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f13057f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ThreadPoolExecutor f13058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f13059y;

    public p(j jVar, Context context) {
        V v6 = q.f13060d;
        this.f13055d = new Object();
        a.i(context, "Context cannot be null");
        this.f13052a = context.getApplicationContext();
        this.f13053b = jVar;
        this.f13054c = v6;
    }

    public final void a() {
        synchronized (this.f13055d) {
            try {
                this.f13059y = null;
                Handler handler = this.f13056e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f13056e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f13058x;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f13057f = null;
                this.f13058x = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p046g0.i
    public final void b(f fVar) {
        synchronized (this.f13055d) {
            this.f13059y = fVar;
        }
        synchronized (this.f13055d) {
            try {
                if (this.f13059y == null) {
                    return;
                }
                if (this.f13057f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f13058x = threadPoolExecutor;
                    this.f13057f = threadPoolExecutor;
                }
                this.f13057f.execute(new K0(this, 24));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final M.f c() {
        try {
            V v6 = this.f13054c;
            Context context = this.f13052a;
            j jVar = this.f13053b;
            v6.getClass();
            v vVarA = M.a.a(jVar, context);
            int i7 = vVarA.f965b;
            if (i7 != 0) {
                throw new RuntimeException(AbstractC0486a1.f(i7, "fetchFonts failed (", ")"));
            }
            M.f[] fVarArr = (M.f[]) vVarA.f966c;
            if (fVarArr == null || fVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return fVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
