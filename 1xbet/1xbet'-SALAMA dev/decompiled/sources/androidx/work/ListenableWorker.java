package androidx.work;

import A2.c;
import I3.b;
import W5.A1;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p023d1.g;
import p023d1.h;
import p023d1.u;
import p096n1.m;
import p096n1.n;
import p103o1.k;
import p111p1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f9854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f9855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9857e;

    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f9853a = context;
        this.f9854b = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f9853a;
    }

    public Executor getBackgroundExecutor() {
        return this.f9854b.f9865f;
    }

    public b getForegroundInfoAsync() {
        k kVar = new k();
        kVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public final UUID getId() {
        return this.f9854b.f9860a;
    }

    public final g getInputData() {
        return this.f9854b.f9861b;
    }

    public final Network getNetwork() {
        return (Network) this.f9854b.f9863d.f8078d;
    }

    public final int getRunAttemptCount() {
        return this.f9854b.f9864e;
    }

    public final Set<String> getTags() {
        return this.f9854b.f9862c;
    }

    public a getTaskExecutor() {
        return this.f9854b.f9866g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.f9854b.f9863d.f8076b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.f9854b.f9863d.f8077c;
    }

    public u getWorkerFactory() {
        return this.f9854b.f9867h;
    }

    public boolean isRunInForeground() {
        return this.f9857e;
    }

    public final boolean isStopped() {
        return this.f9855c;
    }

    public final boolean isUsed() {
        return this.f9856d;
    }

    public void onStopped() {
    }

    public final b setForegroundAsync(h hVar) {
        this.f9857e = true;
        m mVar = this.f9854b.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        mVar.getClass();
        k kVar = new k();
        mVar.f15337a.G(new A1(mVar, kVar, id, hVar, applicationContext, 3));
        return kVar;
    }

    public b setProgressAsync(g gVar) {
        n nVar = this.f9854b.f9868i;
        getApplicationContext();
        UUID id = getId();
        nVar.getClass();
        k kVar = new k();
        nVar.f15342b.G(new c(nVar, id, gVar, kVar, 17, false));
        return kVar;
    }

    public void setRunInForeground(boolean z4) {
        this.f9857e = z4;
    }

    public final void setUsed() {
        this.f9856d = true;
    }

    public abstract b startWork();

    public final void stop() {
        this.f9855c = true;
        onStopped();
    }
}
