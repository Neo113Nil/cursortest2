package androidx.work;

import E3.a;
import K2.e;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import com.google.android.gms.internal.ads.RunnableC1699ve;
import f2.C1948f;
import f2.C1949g;
import f2.t;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p2.C2256n;
import p2.C2257o;
import q2.C2307j;
import r2.InterfaceC2348a;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: k, reason: collision with root package name */
    public final Context f7083k;

    /* renamed from: l, reason: collision with root package name */
    public final WorkerParameters f7084l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f7085m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7086n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7087o;

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f7083k = context;
        this.f7084l = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f7083k;
    }

    public Executor getBackgroundExecutor() {
        return this.f7084l.f;
    }

    public a getForegroundInfoAsync() {
        C2307j c2307j = new C2307j();
        c2307j.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c2307j;
    }

    public final UUID getId() {
        return this.f7084l.f7090a;
    }

    public final C1948f getInputData() {
        return this.f7084l.f7091b;
    }

    public final Network getNetwork() {
        return (Network) this.f7084l.f7093d.f20434n;
    }

    public final int getRunAttemptCount() {
        return this.f7084l.f7094e;
    }

    public final Set<String> getTags() {
        return this.f7084l.f7092c;
    }

    public InterfaceC2348a getTaskExecutor() {
        return this.f7084l.f7095g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f7084l.f7093d.f20432l;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f7084l.f7093d.f20433m;
    }

    public t getWorkerFactory() {
        return this.f7084l.f7096h;
    }

    public boolean isRunInForeground() {
        return this.f7087o;
    }

    public final boolean isStopped() {
        return this.f7085m;
    }

    public final boolean isUsed() {
        return this.f7086n;
    }

    public void onStopped() {
    }

    public final a setForegroundAsync(C1949g c1949g) {
        this.f7087o = true;
        C2256n c2256n = this.f7084l.f7097j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c2256n.getClass();
        C2307j c2307j = new C2307j();
        c2256n.f18724a.t(new RunnableC1699ve(c2256n, c2307j, id, c1949g, applicationContext, 3));
        return c2307j;
    }

    public a setProgressAsync(C1948f c1948f) {
        C2257o c2257o = this.f7084l.i;
        getApplicationContext();
        UUID id = getId();
        c2257o.getClass();
        C2307j c2307j = new C2307j();
        c2257o.f18729b.t(new e(c2257o, id, c1948f, c2307j, 13, false));
        return c2307j;
    }

    public void setRunInForeground(boolean z3) {
        this.f7087o = z3;
    }

    public final void setUsed() {
        this.f7086n = true;
    }

    public abstract a startWork();

    public final void stop() {
        this.f7085m = true;
        onStopped();
    }
}
