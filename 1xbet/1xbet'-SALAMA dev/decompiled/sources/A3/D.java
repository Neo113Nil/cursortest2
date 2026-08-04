package A3;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class D extends A {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ A f630y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0056e f631z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C0056e c0056e, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, A a2) {
        super(taskCompletionSource);
        this.f631z = c0056e;
        this.f629x = taskCompletionSource2;
        this.f630y = a2;
    }

    @Override // A3.A
    public final void b() {
        synchronized (this.f631z.f645f) {
            try {
                C0056e c0056e = this.f631z;
                TaskCompletionSource taskCompletionSource = this.f629x;
                c0056e.f644e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new C(c0056e, taskCompletionSource));
                if (this.f631z.f650l.getAndIncrement() > 0) {
                    this.f631z.f641b.b("Already connected to the service.", new Object[0]);
                }
                C0056e.b(this.f631z, this.f630y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
