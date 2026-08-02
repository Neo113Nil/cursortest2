package M7;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes9.dex */
public abstract class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f17517a;

    n() {
        this.f17517a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f17517a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    protected abstract void b();

    final TaskCompletionSource c() {
        return this.f17517a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e11) {
            a(e11);
        }
    }

    public n(TaskCompletionSource taskCompletionSource) {
        this.f17517a = taskCompletionSource;
    }
}
