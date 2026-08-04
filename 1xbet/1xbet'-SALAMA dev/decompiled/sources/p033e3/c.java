package p033e3;

import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p095n0.b;
import p102o0.a;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f12658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f12663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile a f12664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile a f12665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Semaphore f12666i;
    public final Set j;

    public c(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = a.f15537y;
        this.f12659b = false;
        this.f12660c = false;
        this.f12661d = true;
        this.f12662e = false;
        signInHubActivity.getApplicationContext();
        this.f12663f = threadPoolExecutor;
        this.f12666i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f12664g != null) {
            if (!this.f12659b) {
                this.f12662e = true;
            }
            if (this.f12665h != null) {
                this.f12664g.getClass();
                this.f12664g = null;
                return;
            }
            this.f12664g.getClass();
            a aVar = this.f12664g;
            aVar.f15542d.set(true);
            if (aVar.f15540b.cancel(false)) {
                this.f12665h = this.f12664g;
            }
            this.f12664g = null;
        }
    }

    public final void b() {
        if (this.f12665h != null || this.f12664g == null) {
            return;
        }
        this.f12664g.getClass();
        a aVar = this.f12664g;
        ThreadPoolExecutor threadPoolExecutor = this.f12663f;
        if (aVar.f15541c == 1) {
            aVar.f15541c = 2;
            aVar.f15539a.getClass();
            threadPoolExecutor.execute(aVar.f15540b);
        } else {
            int iE = e.e(aVar.f15541c);
            if (iE == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iE == 2) {
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
            this.f12666i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        p003a.a.d(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
