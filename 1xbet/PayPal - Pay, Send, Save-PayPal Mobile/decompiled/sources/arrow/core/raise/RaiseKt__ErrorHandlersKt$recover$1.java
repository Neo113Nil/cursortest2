package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [A, OtherError] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "A", "OtherError", "Larrow/core/raise/Raise;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__ErrorHandlersKt$recover$1", f = "ErrorHandlers.kt", i = {0, 0}, l = {36, 36}, m = "invokeSuspend", n = {"$this$effect", "raise$iv$iv"}, s = {"L$0", "L$2"}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__ErrorHandlersKt$recover$1<A, OtherError> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super OtherError>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<arrow.core.raise.Raise<? super OtherError>, Error, kotlin.coroutines.Continuation<? super A>, java.lang.Object> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083 A[PHI: r8
      0x0083: PHI (r8v15 java.lang.Object) = (r8v12 java.lang.Object), (r8v0 java.lang.Object) binds: [B:19:0x0080, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise defaultRaise;
        kotlin.jvm.functions.Function3 function3;
        arrow.core.raise.Raise raise;
        arrow.core.raise.RaiseCancellationException e;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
            kotlin.Function function = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function3 function32 = this.Camera2StreamConfigurationMap;
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                this.getOutputMinFrameDuration = raise2;
                this.getHighResolutionOutputSizeshNQ4ISI = function32;
                this.getHighSpeedVideoFpsRangesFor = defaultRaise;
                this.getHighSpeedVideoFpsRanges = 1;
                java.lang.Object invoke = defaultRaise.invoke(function, this);
                if (invoke != coroutine_suspended) {
                    function3 = function32;
                    raise = raise2;
                    obj = invoke;
                    defaultRaise2 = defaultRaise;
                }
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                function3 = function32;
                raise = raise2;
                e = e2;
                defaultRaise.complete();
                java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                this.getOutputMinFrameDuration = null;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges = 2;
                obj = function3.invoke(raise, raisedOrRethrow, this);
                if (obj != coroutine_suspended) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defaultRaise2 = (arrow.core.raise.DefaultRaise) this.getHighSpeedVideoFpsRangesFor;
        function3 = (kotlin.jvm.functions.Function3) this.getHighResolutionOutputSizeshNQ4ISI;
        raise = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            e = e3;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
            this.getOutputMinFrameDuration = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = 2;
            obj = function3.invoke(raise, raisedOrRethrow2, this);
            return obj != coroutine_suspended ? coroutine_suspended : obj;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        defaultRaise2.complete();
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((arrow.core.raise.RaiseKt__ErrorHandlersKt$recover$1) create((arrow.core.raise.Raise) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__ErrorHandlersKt$recover$1 raiseKt__ErrorHandlersKt$recover$1 = new arrow.core.raise.RaiseKt__ErrorHandlersKt$recover$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        raiseKt__ErrorHandlersKt$recover$1.getOutputMinFrameDuration = obj;
        return raiseKt__ErrorHandlersKt$recover$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RaiseKt__ErrorHandlersKt$recover$1(kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super arrow.core.raise.Raise<? super OtherError>, ? super Error, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__ErrorHandlersKt$recover$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function2;
        this.Camera2StreamConfigurationMap = function3;
    }
}
