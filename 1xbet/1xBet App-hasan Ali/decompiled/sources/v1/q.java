package v1;

import A0.RunnableC0049o;
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
import k4.AbstractC2036a;
import l3.C2054a;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: k, reason: collision with root package name */
    public final Context f20362k;

    /* renamed from: l, reason: collision with root package name */
    public final k1.e f20363l;

    /* renamed from: m, reason: collision with root package name */
    public final C2054a f20364m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f20365n;

    /* renamed from: o, reason: collision with root package name */
    public Handler f20366o;

    /* renamed from: p, reason: collision with root package name */
    public ThreadPoolExecutor f20367p;

    /* renamed from: q, reason: collision with root package name */
    public ThreadPoolExecutor f20368q;

    /* renamed from: r, reason: collision with root package name */
    public j f20369r;

    public q(Context context, k1.e eVar) {
        C2054a c2054a = r.f20370d;
        this.f20365n = new Object();
        AbstractC2036a.o("Context cannot be null", context);
        this.f20362k = context.getApplicationContext();
        this.f20363l = eVar;
        this.f20364m = c2054a;
    }

    public final void a() {
        synchronized (this.f20365n) {
            try {
                this.f20369r = null;
                Handler handler = this.f20366o;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f20366o = null;
                ThreadPoolExecutor threadPoolExecutor = this.f20368q;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f20367p = null;
                this.f20368q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f20365n) {
            try {
                if (this.f20369r == null) {
                    return;
                }
                if (this.f20367p == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2533a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f20368q = threadPoolExecutor;
                    this.f20367p = threadPoolExecutor;
                }
                this.f20367p.execute(new RunnableC0049o(15, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final k1.i c() {
        try {
            C2054a c2054a = this.f20364m;
            Context context = this.f20362k;
            k1.e eVar = this.f20363l;
            c2054a.getClass();
            Object[] objArr = {eVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C2.h a5 = k1.d.a(context, Collections.unmodifiableList(arrayList));
            int i = a5.f833l;
            if (i != 0) {
                throw new RuntimeException(L1.a.l(i, "fetchFonts failed (", ")"));
            }
            k1.i[] iVarArr = (k1.i[]) ((List) a5.f834m).get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }

    @Override // v1.i
    public final void f(j jVar) {
        synchronized (this.f20365n) {
            this.f20369r = jVar;
        }
        b();
    }
}
