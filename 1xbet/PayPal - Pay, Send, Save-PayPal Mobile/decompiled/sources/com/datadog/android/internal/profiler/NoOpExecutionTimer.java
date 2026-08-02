package com.datadog.android.internal.profiler;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/internal/profiler/NoOpExecutionTimer;", "Lcom/datadog/android/internal/profiler/ExecutionTimer;", "<init>", "()V", "T", "Lkotlin/Function0;", "action", "measure", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpExecutionTimer implements com.datadog.android.internal.profiler.ExecutionTimer {
    @Override // com.datadog.android.internal.profiler.ExecutionTimer
    public final <T> T measure(kotlin.jvm.functions.Function0<? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return action.invoke();
    }
}
