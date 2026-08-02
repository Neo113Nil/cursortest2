package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R/\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b8W@SX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000eR\u001b\u0010\u001b\u001a\u00020\u00188WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u00188WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001b\u0010 \u001a\u00020\u00188WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001b\u0010\"\u001a\u00020\u00188WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR/\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048W@SX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\n"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "<init>", "()V", "Lcom/airbnb/lottie/LottieComposition;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "composition", "", "complete$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "", "error", "completeExceptionally$lottie_compose_release", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CompletableDeferred;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CompletableDeferred;", "<set-?>", "error$delegate", "Landroidx/compose/runtime/MutableState;", "getError", "()Ljava/lang/Throwable;", "setError", "", "isComplete$delegate", "Landroidx/compose/runtime/State;", "isComplete", "()Z", "isFailure$delegate", "isFailure", "isLoading$delegate", "isLoading", "isSuccess$delegate", "isSuccess", "value$delegate", "getValue", "()Lcom/airbnb/lottie/LottieComposition;", "setValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieCompositionResultImpl implements com.airbnb.lottie.compose.LottieCompositionResult {
    public static final int $stable = 0;
    private final kotlinx.coroutines.CompletableDeferred<com.airbnb.lottie.LottieComposition> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: error$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState error = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: isLoading$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State isLoading = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(com.airbnb.lottie.compose.LottieCompositionResultImpl.this.getValue() == null && com.airbnb.lottie.compose.LottieCompositionResultImpl.this.getError() == null);
        }

        {
            super(0);
        }
    });

    /* renamed from: isComplete$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State isComplete = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf((com.airbnb.lottie.compose.LottieCompositionResultImpl.this.getValue() == null && com.airbnb.lottie.compose.LottieCompositionResultImpl.this.getError() == null) ? false : true);
        }

        {
            super(0);
        }
    });

    /* renamed from: isFailure$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State isFailure = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(com.airbnb.lottie.compose.LottieCompositionResultImpl.this.getError() != null);
        }

        {
            super(0);
        }
    });

    /* renamed from: isSuccess$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State isSuccess = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(com.airbnb.lottie.compose.LottieCompositionResultImpl.this.getValue() != null);
        }

        {
            super(0);
        }
    });

    private void setValue(com.airbnb.lottie.LottieComposition lottieComposition) {
        this.value.setValue(lottieComposition);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    public final com.airbnb.lottie.LottieComposition getValue() {
        return (com.airbnb.lottie.LottieComposition) this.value.getValue();
    }

    private void setError(java.lang.Throwable th) {
        this.error.setValue(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public final java.lang.Throwable getError() {
        return (java.lang.Throwable) this.error.getValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public final boolean isLoading() {
        return ((java.lang.Boolean) this.isLoading.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public final boolean isComplete() {
        return ((java.lang.Boolean) this.isComplete.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public final boolean isFailure() {
        return ((java.lang.Boolean) this.isFailure.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public final boolean isSuccess() {
        return ((java.lang.Boolean) this.isSuccess.getValue()).booleanValue();
    }

    @Override // com.airbnb.lottie.compose.LottieCompositionResult
    public final java.lang.Object await(kotlin.coroutines.Continuation<? super com.airbnb.lottie.LottieComposition> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.await(continuation);
    }

    public final void complete$lottie_compose_release(com.airbnb.lottie.LottieComposition composition) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composition, "");
            if (isComplete()) {
                return;
            }
            setValue(composition);
            this.getHighSpeedVideoFpsRangesFor.complete(composition);
        }
    }

    public final void completeExceptionally$lottie_compose_release(java.lang.Throwable error) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            if (isComplete()) {
                return;
            }
            setError(error);
            this.getHighSpeedVideoFpsRangesFor.completeExceptionally(error);
        }
    }
}
