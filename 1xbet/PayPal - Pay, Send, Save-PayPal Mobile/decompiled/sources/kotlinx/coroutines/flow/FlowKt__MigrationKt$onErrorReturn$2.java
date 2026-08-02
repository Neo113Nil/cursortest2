package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "e", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class FlowKt__MigrationKt$onErrorReturn$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super T>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ T getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            java.lang.Throwable th = (java.lang.Throwable) this.getHighSpeedVideoSizes;
            if (!this.getHighSpeedVideoFpsRangesFor.invoke(th).booleanValue()) {
                throw th;
            }
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = 1;
            if (flowCollector.emit(this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        flowKt__MigrationKt$onErrorReturn$2.Camera2StreamConfigurationMap = (kotlinx.coroutines.flow.FlowCollector) obj;
        flowKt__MigrationKt$onErrorReturn$2.getHighSpeedVideoSizes = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__MigrationKt$onErrorReturn$2(kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> function1, T t, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = t;
    }
}
