package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f12049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Continuation f12050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12051c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f12052d;

    public /* synthetic */ p(s sVar, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f12049a = sVar;
        this.f12050b = continuation;
        this.f12051c = taskCompletionSource;
        this.f12052d = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Continuation continuation = this.f12050b;
        TaskCompletionSource taskCompletionSource = this.f12051c;
        s sVar = this.f12049a;
        sVar.getClass();
        try {
            Task task2 = (Task) continuation.then(sVar);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new E4.q(1, taskCompletionSource));
            task2.addOnFailureListener(new E4.r(1, taskCompletionSource));
            task2.addOnCanceledListener(new o(this.f12052d));
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e7.getCause());
            } else {
                taskCompletionSource.setException(e7);
            }
        } catch (Exception e8) {
            taskCompletionSource.setException(e8);
        }
    }
}
