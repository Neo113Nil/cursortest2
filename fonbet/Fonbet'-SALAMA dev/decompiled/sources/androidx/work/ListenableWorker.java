package androidx.work;

import A2.c;
import I3.b;
import W5.A1;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import d1.C0954g;
import d1.C0955h;
import d1.u;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n1.C1458m;
import n1.C1459n;
import o1.C1501k;
import p1.InterfaceC1533a;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9853a;

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f9854b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f9855c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9856d;

    /* renamed from: e, reason: collision with root package name */
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
        C1501k c1501k = new C1501k();
        c1501k.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c1501k;
    }

    public final UUID getId() {
        return this.f9854b.f9860a;
    }

    public final C0954g getInputData() {
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

    public InterfaceC1533a getTaskExecutor() {
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

    public final b setForegroundAsync(C0955h c0955h) {
        this.f9857e = true;
        C1458m c1458m = this.f9854b.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        c1458m.getClass();
        C1501k c1501k = new C1501k();
        c1458m.f15331a.G(new A1(c1458m, c1501k, id, c0955h, applicationContext, 3));
        return c1501k;
    }

    public b setProgressAsync(C0954g c0954g) {
        C1459n c1459n = this.f9854b.f9868i;
        getApplicationContext();
        UUID id = getId();
        c1459n.getClass();
        C1501k c1501k = new C1501k();
        c1459n.f15336b.G(new c(c1459n, id, c0954g, c1501k, 17, false));
        return c1501k;
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
