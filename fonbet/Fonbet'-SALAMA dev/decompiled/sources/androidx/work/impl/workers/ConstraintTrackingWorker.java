package androidx.work.impl.workers;

import I3.b;
import android.content.Context;
import androidx.appcompat.widget.b1;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import d1.n;
import e1.l;
import i1.InterfaceC1243b;
import java.util.ArrayList;
import java.util.List;
import o1.C1501k;
import p1.InterfaceC1533a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC1243b {

    /* renamed from: B, reason: collision with root package name */
    public static final String f9893B = n.g("ConstraintTrkngWrkr");

    /* renamed from: A, reason: collision with root package name */
    public ListenableWorker f9894A;

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f9895f;

    /* renamed from: x, reason: collision with root package name */
    public final Object f9896x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f9897y;

    /* renamed from: z, reason: collision with root package name */
    public final C1501k f9898z;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9895f = workerParameters;
        this.f9896x = new Object();
        this.f9897y = false;
        this.f9898z = new C1501k();
    }

    @Override // i1.InterfaceC1243b
    public final void d(ArrayList arrayList) {
        n.d().b(f9893B, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f9896x) {
            this.f9897y = true;
        }
    }

    @Override // i1.InterfaceC1243b
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceC1533a getTaskExecutor() {
        return l.m0(getApplicationContext()).f12547x;
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
    public final b startWork() {
        getBackgroundExecutor().execute(new b1(this, 14));
        return this.f9898z;
    }
}
