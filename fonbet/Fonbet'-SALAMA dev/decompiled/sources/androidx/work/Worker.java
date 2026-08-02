package androidx.work;

import I3.b;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.appcompat.widget.b1;
import d1.m;
import o1.C1501k;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    public C1501k f9859f;

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract m doWork();

    @Override // androidx.work.ListenableWorker
    public final b startWork() {
        this.f9859f = new C1501k();
        getBackgroundExecutor().execute(new b1(this, 5));
        return this.f9859f;
    }
}
