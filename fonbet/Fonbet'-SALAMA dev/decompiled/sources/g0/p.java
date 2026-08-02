package g0;

import A1.K0;
import B4.V;
import W5.AbstractC0486a1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13046a;

    /* renamed from: b, reason: collision with root package name */
    public final I4.j f13047b;

    /* renamed from: c, reason: collision with root package name */
    public final V f13048c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13049d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f13050e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f13051f;

    /* renamed from: x, reason: collision with root package name */
    public ThreadPoolExecutor f13052x;

    /* renamed from: y, reason: collision with root package name */
    public p3.f f13053y;

    public p(I4.j jVar, Context context) {
        V v6 = q.f13054d;
        this.f13049d = new Object();
        AbstractC1464a.i(context, "Context cannot be null");
        this.f13046a = context.getApplicationContext();
        this.f13047b = jVar;
        this.f13048c = v6;
    }

    public final void a() {
        synchronized (this.f13049d) {
            try {
                this.f13053y = null;
                Handler handler = this.f13050e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f13050e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f13052x;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f13051f = null;
                this.f13052x = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g0.i
    public final void b(p3.f fVar) {
        synchronized (this.f13049d) {
            this.f13053y = fVar;
        }
        synchronized (this.f13049d) {
            try {
                if (this.f13053y == null) {
                    return;
                }
                if (this.f13051f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1119a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f13052x = threadPoolExecutor;
                    this.f13051f = threadPoolExecutor;
                }
                this.f13051f.execute(new K0(this, 24));
            } finally {
            }
        }
    }

    public final M.f c() {
        try {
            V v6 = this.f13048c;
            Context context = this.f13046a;
            I4.j jVar = this.f13047b;
            v6.getClass();
            B.v a2 = M.a.a(jVar, context);
            int i7 = a2.f965b;
            if (i7 != 0) {
                throw new RuntimeException(AbstractC0486a1.f(i7, "fetchFonts failed (", ")"));
            }
            M.f[] fVarArr = (M.f[]) a2.f966c;
            if (fVarArr == null || fVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return fVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
