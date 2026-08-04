package androidx.work.impl.workers;

import android.content.Context;
import androidx.appcompat.widget.b1;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import p023d1.n;
import p031e1.l;
import p060i1.b;
import p103o1.k;
import p111p1.a;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f9893B = n.g("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ListenableWorker f9894A;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WorkerParameters f9895f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f9896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f9897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k f9898z;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9895f = workerParameters;
        this.f9896x = new Object();
        this.f9897y = false;
        this.f9898z = new k();
    }

    @Override // p060i1.b
    public final void d(ArrayList arrayList) {
        n.d().b(f9893B, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f9896x) {
            this.f9897y = true;
        }
    }

    @Override // p060i1.b
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return l.m0(getApplicationContext()).f12553x;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f9894A;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f9894A;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f9894A.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final I3.b startWork() {
        getBackgroundExecutor().execute(new b1(this, 14));
        return this.f9898z;
    }
}
