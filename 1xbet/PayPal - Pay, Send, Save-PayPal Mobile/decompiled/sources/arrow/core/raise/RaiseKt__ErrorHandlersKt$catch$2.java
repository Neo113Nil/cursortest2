package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [A, Error] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "A", "Error", "Larrow/core/raise/Raise;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$2", f = "ErrorHandlers.kt", i = {0}, l = {91, 91}, m = "invokeSuspend", n = {"$this$effect"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
public final class RaiseKt__ErrorHandlersKt$catch$2<A, Error> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function3<arrow.core.raise.Raise<? super Error>, T, kotlin.coroutines.Continuation<? super A>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.Raise raise;
        java.lang.Throwable th;
        kotlin.jvm.functions.Function3 function3;
        java.lang.Object invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function3 function32 = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                this.Camera2StreamConfigurationMap = raise2;
                this.getHighSpeedVideoFpsRanges = function32;
                this.getHighSpeedVideoSizes = 1;
                invoke = raise2.invoke(function2, this);
            } catch (java.lang.Throwable th2) {
                raise = raise2;
                th = th2;
                function3 = function32;
            }
            return invoke != coroutine_suspended ? invoke : coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        function3 = (kotlin.jvm.functions.Function3) this.getHighSpeedVideoFpsRanges;
        raise = (arrow.core.raise.Raise) this.Camera2StreamConfigurationMap;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        if (nonFatalOrThrow instanceof java.lang.Throwable) {
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = 2;
            obj = function3.invoke(raise, nonFatalOrThrow, this);
            if (obj != coroutine_suspended) {
                return obj;
            }
        } else {
            throw nonFatalOrThrow;
        }
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        arrow.core.raise.Raise<? super Error> raise = (arrow.core.raise.Raise) this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super java.lang.Object>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function3<arrow.core.raise.Raise<? super Error>, T, kotlin.coroutines.Continuation<? super A>, java.lang.Object> function3 = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            return raise.invoke(function2, null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (nonFatalOrThrow instanceof java.lang.Throwable) {
                return function3.invoke(raise, nonFatalOrThrow, null);
            }
            throw nonFatalOrThrow;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(arrow.core.raise.Raise<? super Error> raise, kotlin.coroutines.Continuation<? super A> continuation) {
        return ((arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$2) create(raise, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$2 raiseKt__ErrorHandlersKt$catch$2 = new arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        raiseKt__ErrorHandlersKt$catch$2.Camera2StreamConfigurationMap = obj;
        return raiseKt__ErrorHandlersKt$catch$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RaiseKt__ErrorHandlersKt$catch$2(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super arrow.core.raise.Raise<? super Error>, ? super T, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__ErrorHandlersKt$catch$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = function3;
    }
}
