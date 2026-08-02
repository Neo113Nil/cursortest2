package K7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
public abstract class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f15301a;

    i() {
        this.f15301a = null;
    }

    protected abstract void a();

    final TaskCompletionSource b() {
        return this.f15301a;
    }

    public final void c(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f15301a;
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

    public i(TaskCompletionSource taskCompletionSource) {
        this.f15301a = taskCompletionSource;
    }
}
