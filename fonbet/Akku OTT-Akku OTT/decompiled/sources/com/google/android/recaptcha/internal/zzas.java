package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlinx.coroutines.S;

/* loaded from: classes4.dex */
public final class zzas {
    public static final Task zza(S s) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        s.invokeOnCompletion(new zzar(taskCompletionSource, s));
        return taskCompletionSource.getTask();
    }
}
