package com.google.android.recaptcha.internal;

import D6.H;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.C1116i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import t6.i;

/* loaded from: classes.dex */
final class zzaw extends i implements Function1 {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ H zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(TaskCompletionSource taskCompletionSource, H h6) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = h6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (exc == null) {
                    exc = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return C1116i.f13008a;
    }
}
