package com.google.android.recaptcha.internal;

import D6.H;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
public final class zzax {
    public static final Task zza(H h6) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        h6.invokeOnCompletion(new zzaw(taskCompletionSource, h6));
        return taskCompletionSource.getTask();
    }
}
