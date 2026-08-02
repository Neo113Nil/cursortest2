package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroidx/compose/runtime/State;", "Lcom/airbnb/lottie/LottieComposition;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getError", "()Ljava/lang/Throwable;", "error", "", "isComplete", "()Z", "isFailure", "isLoading", "isSuccess", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LottieCompositionResult extends androidx.compose.runtime.State<com.airbnb.lottie.LottieComposition> {
    java.lang.Object await(kotlin.coroutines.Continuation<? super com.airbnb.lottie.LottieComposition> continuation);

    java.lang.Throwable getError();

    @Override // androidx.compose.runtime.State
    com.airbnb.lottie.LottieComposition getValue();

    boolean isComplete();

    boolean isFailure();

    boolean isLoading();

    boolean isSuccess();
}
