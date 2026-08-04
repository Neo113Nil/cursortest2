package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SuccessContinuation f12053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f12055c;

    public /* synthetic */ q(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f12053a = successContinuation;
        this.f12054b = taskCompletionSource;
        this.f12055c = cancellationTokenSource;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        SuccessContinuation successContinuation = this.f12053a;
        TaskCompletionSource taskCompletionSource = this.f12054b;
        try {
            Task taskThen = successContinuation.then((r) obj);
            taskThen.addOnSuccessListener(new E4.q(1, taskCompletionSource));
            taskThen.addOnFailureListener(new E4.r(1, taskCompletionSource));
            taskThen.addOnCanceledListener(new o(this.f12055c));
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
