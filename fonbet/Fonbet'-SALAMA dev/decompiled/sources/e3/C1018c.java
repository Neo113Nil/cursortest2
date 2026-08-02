package e3;

import a.AbstractC0603a;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0.RunnableC1487a;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018c {

    /* renamed from: a, reason: collision with root package name */
    public n0.b f12652a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12653b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12654c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12656e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f12657f;

    /* renamed from: g, reason: collision with root package name */
    public volatile RunnableC1487a f12658g;

    /* renamed from: h, reason: collision with root package name */
    public volatile RunnableC1487a f12659h;

    /* renamed from: i, reason: collision with root package name */
    public final Semaphore f12660i;
    public final Set j;

    public C1018c(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = RunnableC1487a.f15531y;
        this.f12653b = false;
        this.f12654c = false;
        this.f12655d = true;
        this.f12656e = false;
        signInHubActivity.getApplicationContext();
        this.f12657f = threadPoolExecutor;
        this.f12660i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f12658g != null) {
            if (!this.f12653b) {
                this.f12656e = true;
            }
            if (this.f12659h != null) {
                this.f12658g.getClass();
                this.f12658g = null;
                return;
            }
            this.f12658g.getClass();
            RunnableC1487a runnableC1487a = this.f12658g;
            runnableC1487a.f15536d.set(true);
            if (runnableC1487a.f15534b.cancel(false)) {
                this.f12659h = this.f12658g;
            }
            this.f12658g = null;
        }
    }

    public final void b() {
        if (this.f12659h != null || this.f12658g == null) {
            return;
        }
        this.f12658g.getClass();
        RunnableC1487a runnableC1487a = this.f12658g;
        ThreadPoolExecutor threadPoolExecutor = this.f12657f;
        if (runnableC1487a.f15535c == 1) {
            runnableC1487a.f15535c = 2;
            runnableC1487a.f15533a.getClass();
            threadPoolExecutor.execute(runnableC1487a.f15534b);
        } else {
            int e7 = t.e.e(runnableC1487a.f15535c);
            if (e7 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (e7 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final void c() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f12660i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        AbstractC0603a.d(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
