package androidx.work;

import A0.C;
import E3.a;
import android.content.Context;
import f2.l;
import q2.C2307j;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: p, reason: collision with root package name */
    public C2307j f7089p;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract l doWork();

    @Override // androidx.work.ListenableWorker
    public final a startWork() {
        this.f7089p = new C2307j();
        getBackgroundExecutor().execute(new C(11, this));
        return this.f7089p;
    }
}
