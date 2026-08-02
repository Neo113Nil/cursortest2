package L4;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final b f4344a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4345b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread f4346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f4347d;

    public d(f fVar) {
        this.f4347d = fVar;
        c cVar = new c(this);
        Thread newThread = Executors.defaultThreadFactory().newThread(cVar);
        this.f4346c = newThread;
        newThread.setName("FirestoreWorker");
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new a(this, 0));
        b bVar = new b(this, cVar, 0);
        this.f4344a = bVar;
        bVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
        this.f4345b = false;
    }

    public final Task a(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            execute(new K5.a(taskCompletionSource, callable));
        } catch (RejectedExecutionException unused) {
            Q0.a.v(2, f.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
        }
        return taskCompletionSource.getTask();
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (!this.f4345b) {
            this.f4344a.execute(runnable);
        }
    }
}
