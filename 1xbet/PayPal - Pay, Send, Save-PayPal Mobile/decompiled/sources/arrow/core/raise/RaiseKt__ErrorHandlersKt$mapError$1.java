package arrow.core.raise;

/* JADX INFO: Add missing generic type declarations: [A, OtherError] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "A", "OtherError", "Larrow/core/raise/Raise;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "arrow.core.raise.RaiseKt__ErrorHandlersKt$mapError$1", f = "ErrorHandlers.kt", i = {0, 0}, l = {125, 125}, m = "invokeSuspend", n = {"$this$withError$iv", "raise$iv$iv$iv"}, s = {"L$0", "L$2"}, v = 1)
/* loaded from: classes.dex */
final class RaiseKt__ErrorHandlersKt$mapError$1<A, OtherError> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super OtherError>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<Error, kotlin.coroutines.Continuation<? super OtherError>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<arrow.core.raise.Raise<? super Error>, kotlin.coroutines.Continuation<? super A>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.RaiseCancellationException e;
        kotlin.jvm.functions.Function2 function2;
        java.lang.Object invoke;
        arrow.core.raise.Raise raise2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                raise2 = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                raise2.raise(obj);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise = (arrow.core.raise.DefaultRaise) this.getHighSpeedVideoFpsRanges;
            function2 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoSizes;
            raise = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
                defaultRaise.complete();
                java.lang.Object raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
                this.getOutputMinFrameDuration = raise;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.Camera2StreamConfigurationMap = 2;
                obj = function2.invoke(raisedOrRethrow, this);
                if (obj != coroutine_suspended) {
                }
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.raise.Raise raise3 = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
        kotlin.jvm.functions.Function2 function22 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.Function function = this.getHighSpeedVideoFpsRangesFor;
        arrow.core.raise.DefaultRaise defaultRaise2 = new arrow.core.raise.DefaultRaise(false);
        try {
            this.getOutputMinFrameDuration = raise3;
            this.getHighSpeedVideoSizes = function22;
            this.getHighSpeedVideoFpsRanges = defaultRaise2;
            this.Camera2StreamConfigurationMap = 1;
            invoke = defaultRaise2.invoke(function, this);
        } catch (arrow.core.raise.RaiseCancellationException e3) {
            raise = raise3;
            e = e3;
            function2 = function22;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            java.lang.Object raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise);
            this.getOutputMinFrameDuration = raise;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = 2;
            obj = function2.invoke(raisedOrRethrow2, this);
            if (obj != coroutine_suspended) {
                raise2 = raise;
                raise2.raise(obj);
                throw new kotlin.KotlinNothingValueException();
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = defaultRaise2;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        return invoke != coroutine_suspended ? invoke : coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((arrow.core.raise.RaiseKt__ErrorHandlersKt$mapError$1) create((arrow.core.raise.Raise) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        arrow.core.raise.RaiseKt__ErrorHandlersKt$mapError$1 raiseKt__ErrorHandlersKt$mapError$1 = new arrow.core.raise.RaiseKt__ErrorHandlersKt$mapError$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        raiseKt__ErrorHandlersKt$mapError$1.getOutputMinFrameDuration = obj;
        return raiseKt__ErrorHandlersKt$mapError$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RaiseKt__ErrorHandlersKt$mapError$1(kotlin.jvm.functions.Function2<? super Error, ? super kotlin.coroutines.Continuation<? super OtherError>, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super arrow.core.raise.Raise<? super Error>, ? super kotlin.coroutines.Continuation<? super A>, ? extends java.lang.Object> function22, kotlin.coroutines.Continuation<? super arrow.core.raise.RaiseKt__ErrorHandlersKt$mapError$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRangesFor = function22;
    }
}
