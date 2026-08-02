package androidx.work.impl.workers;

import A0.C;
import E3.a;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import f2.m;
import g2.l;
import java.util.ArrayList;
import java.util.List;
import k2.InterfaceC2031b;
import q2.C2307j;
import r2.InterfaceC2348a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC2031b {

    /* renamed from: u, reason: collision with root package name */
    public static final String f7123u = m.f("ConstraintTrkngWrkr");

    /* renamed from: p, reason: collision with root package name */
    public final WorkerParameters f7124p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f7125q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f7126r;

    /* renamed from: s, reason: collision with root package name */
    public final C2307j f7127s;

    /* renamed from: t, reason: collision with root package name */
    public ListenableWorker f7128t;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f7124p = workerParameters;
        this.f7125q = new Object();
        this.f7126r = false;
        this.f7127s = new C2307j();
    }

    @Override // k2.InterfaceC2031b
    public final void c(ArrayList arrayList) {
        m.d().a(f7123u, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f7125q) {
            this.f7126r = true;
        }
    }

    @Override // k2.InterfaceC2031b
    public final void e(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceC2348a getTaskExecutor() {
        return l.Q(getApplicationContext()).f17131n;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f7128t;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f7128t;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f7128t.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final a startWork() {
        getBackgroundExecutor().execute(new C(21, this));
        return this.f7127s;
    }
}
