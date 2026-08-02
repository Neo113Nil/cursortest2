package com.ingo.sdk.kotlin.common.platform;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.platform.BaseViewModel$runSingleUseCase$1", f = "BaseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class BaseViewModel$runSingleUseCase$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.platform.BaseViewModel getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        boolean compareAndSet;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean3;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
        atomicBoolean = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        boolean z = atomicBoolean.get();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseViewModel runSingleUseCase scope: ");
        sb.append(coroutineScope);
        sb.append(" isUseCaseRunning ");
        sb.append(z);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, sb.toString(), null, 2, null);
        compareAndSet = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true);
        if (compareAndSet) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
            atomicBoolean3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            boolean z2 = atomicBoolean3.get();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("BaseViewModel safe to work, executing scope: ");
            sb2.append(coroutineScope);
            sb2.append(" isUseCaseRunning ");
            sb2.append(z2);
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging2, sb2.toString(), null, 2, null);
            this.Camera2StreamConfigurationMap.invoke();
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
            atomicBoolean4 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            boolean z3 = atomicBoolean4.get();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("BaseViewModel work invoked, scope ");
            sb3.append(coroutineScope);
            sb3.append(" isUseCaseRunning ");
            sb3.append(z3);
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging3, sb3.toString(), null, 2, null);
        } else {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging4 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
            atomicBoolean2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            boolean z4 = atomicBoolean2.get();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("BaseViewModel NOT SAFE TO WORK! scope ");
            sb4.append(coroutineScope);
            sb4.append(" isUseCaseRunning ");
            sb4.append(z4);
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging4, sb4.toString(), null, 2, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.ingo.sdk.kotlin.common.platform.BaseViewModel$runSingleUseCase$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.ingo.sdk.kotlin.common.platform.BaseViewModel$runSingleUseCase$1 baseViewModel$runSingleUseCase$1 = new com.ingo.sdk.kotlin.common.platform.BaseViewModel$runSingleUseCase$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        baseViewModel$runSingleUseCase$1.getHighSpeedVideoFpsRangesFor = obj;
        return baseViewModel$runSingleUseCase$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseViewModel$runSingleUseCase$1(com.ingo.sdk.kotlin.common.platform.BaseViewModel baseViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.platform.BaseViewModel$runSingleUseCase$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = baseViewModel;
        this.Camera2StreamConfigurationMap = function0;
    }
}
