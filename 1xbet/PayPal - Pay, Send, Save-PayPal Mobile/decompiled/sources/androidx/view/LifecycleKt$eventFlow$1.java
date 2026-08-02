package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/lifecycle/Lifecycle$Event;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class LifecycleKt$eventFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.lifecycle.Lifecycle.Event>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.Lifecycle getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleKt$eventFlow$1$$ExternalSyntheticLambda0
                @Override // androidx.view.LifecycleEventObserver
                public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    androidx.view.LifecycleKt$eventFlow$1.getHighSpeedVideoFpsRanges(kotlinx.coroutines.channels.ProducerScope.this, event);
                }
            };
            this.getHighSpeedVideoFpsRanges.addObserver(lifecycleEventObserver);
            final androidx.view.Lifecycle lifecycle = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.LifecycleKt$eventFlow$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.LifecycleKt$eventFlow$1.getHighResolutionOutputSizeshNQ4ISI(androidx.view.Lifecycle.this, lifecycleEventObserver);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.view.Lifecycle lifecycle, androidx.view.LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.removeObserver(lifecycleEventObserver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRanges(kotlinx.coroutines.channels.ProducerScope producerScope, androidx.lifecycle.Lifecycle.Event event) {
        producerScope.mo9266trySendJP2dKIU(event);
        if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.lifecycle.Lifecycle.Event> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.LifecycleKt$eventFlow$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new androidx.view.LifecycleKt$eventFlow$1(this.getHighSpeedVideoFpsRanges, continuation);
        lifecycleKt$eventFlow$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return lifecycleKt$eventFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LifecycleKt$eventFlow$1(androidx.view.Lifecycle lifecycle, kotlin.coroutines.Continuation<? super androidx.view.LifecycleKt$eventFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lifecycle;
    }
}
