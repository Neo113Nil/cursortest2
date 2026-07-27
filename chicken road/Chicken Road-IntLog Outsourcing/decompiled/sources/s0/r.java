package s0;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class r {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public r(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f4714f;
    }

    public J1.a getForegroundInfoAsync() {
        D0.k kVar = new D0.k();
        kVar.l(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.mWorkerParams.f4709a;
    }

    public final g getInputData() {
        return this.mWorkerParams.f4710b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f4712d.f313d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f4713e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f4711c;
    }

    public E0.a getTaskExecutor() {
        return this.mWorkerParams.f4715g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f4712d.f311b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f4712d.f312c;
    }

    public AbstractC1412A getWorkerFactory() {
        return this.mWorkerParams.f4716h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final J1.a setForegroundAsync(i iVar) {
        C0.u uVar = this.mWorkerParams.f4718j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        uVar.getClass();
        D0.k kVar = new D0.k();
        uVar.f367a.o(new C0.t(uVar, kVar, id, iVar, applicationContext));
        return kVar;
    }

    public J1.a setProgressAsync(g gVar) {
        C0.w wVar = this.mWorkerParams.f4717i;
        getApplicationContext();
        UUID id = getId();
        wVar.getClass();
        D0.k kVar = new D0.k();
        wVar.f377b.o(new C0.v(wVar, id, gVar, kVar, 0));
        return kVar;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract J1.a startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
