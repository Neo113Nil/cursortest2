package A3;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f624a;

    public A() {
        this.f624a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f624a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f624a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e7) {
            a(e7);
        }
    }

    public A(TaskCompletionSource taskCompletionSource) {
        this.f624a = taskCompletionSource;
    }
}
