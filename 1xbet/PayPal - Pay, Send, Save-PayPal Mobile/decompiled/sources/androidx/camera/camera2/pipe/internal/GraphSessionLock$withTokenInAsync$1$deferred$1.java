package androidx.camera.camera2.pipe.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "T", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroidx/camera/camera2/pipe/core/Token;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1", f = "GraphSessionLock.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class GraphSessionLock$withTokenInAsync$1$deferred$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, java.lang.Object> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

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
        androidx.camera.camera2.pipe.core.Token token = (androidx.camera.camera2.pipe.core.Token) this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, java.lang.Object> function2 = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = 1;
        java.lang.Object invoke = function2.invoke(token, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.core.Token token, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1) create(token, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1 graphSessionLock$withTokenInAsync$1$deferred$1 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1(this.Camera2StreamConfigurationMap, continuation);
        graphSessionLock$withTokenInAsync$1$deferred$1.getHighSpeedVideoFpsRanges = obj;
        return graphSessionLock$withTokenInAsync$1$deferred$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$withTokenInAsync$1$deferred$1(kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function2;
    }
}
