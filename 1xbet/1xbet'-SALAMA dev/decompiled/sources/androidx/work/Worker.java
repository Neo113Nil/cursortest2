package androidx.work;

import I3.b;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.appcompat.widget.b1;
import p023d1.m;
import p103o1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f9859f;

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m doWork();

    @Override // androidx.work.ListenableWorker
    public final b startWork() {
        this.f9859f = new k();
        getBackgroundExecutor().execute(new b1(this, 5));
        return this.f9859f;
    }
}
