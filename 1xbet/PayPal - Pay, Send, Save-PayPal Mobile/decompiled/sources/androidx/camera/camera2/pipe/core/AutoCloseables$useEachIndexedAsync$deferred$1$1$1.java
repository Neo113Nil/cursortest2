package androidx.camera.camera2.pipe.core;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX WARN: Incorrect field signature: TT; */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1$1$1", f = "AutoCloseables.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class AutoCloseables$useEachIndexedAsync$deferred$1$1$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function4<kotlinx.coroutines.CoroutineScope, java.lang.Integer, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.AutoCloseable getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function4<kotlinx.coroutines.CoroutineScope, java.lang.Integer, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function4 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(this.getHighSpeedVideoSizes);
        java.lang.AutoCloseable autoCloseable = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = function4.invoke(coroutineScope, boxInt, autoCloseable, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke((kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap, java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRanges, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1$1$1 autoCloseables$useEachIndexedAsync$deferred$1$1$1 = new androidx.camera.camera2.pipe.core.AutoCloseables$useEachIndexedAsync$deferred$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        autoCloseables$useEachIndexedAsync$deferred$1$1$1.Camera2StreamConfigurationMap = obj;
        return autoCloseables$useEachIndexedAsync$deferred$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function4<-Lkotlinx/coroutines/CoroutineScope;-Ljava/lang/Integer;-TT;-Lkotlin/coroutines/Continuation<-TR;>;+Ljava/lang/Object;>;ITT;Lkotlin/coroutines/Continuation<-Landroidx/camera/camera2/pipe/core/AutoCloseables$useEachIndexedAsync$deferred$1$1$1;>;)V */
    public AutoCloseables$useEachIndexedAsync$deferred$1$1$1(kotlin.jvm.functions.Function4 function4, int i, java.lang.AutoCloseable autoCloseable, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function4;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = autoCloseable;
    }
}
