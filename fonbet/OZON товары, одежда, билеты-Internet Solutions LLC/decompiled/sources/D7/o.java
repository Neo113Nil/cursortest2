package D7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f6114a;

    o() {
        this.f6114a = null;
    }

    protected abstract void a();

    final TaskCompletionSource b() {
        return this.f6114a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f6114a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e11) {
            c(e11);
        }
    }

    public o(TaskCompletionSource taskCompletionSource) {
        this.f6114a = taskCompletionSource;
    }
}
