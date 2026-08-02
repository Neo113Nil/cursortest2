package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class DebugCoroutineInfoImpl$creationStackTrace$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.debug.internal.StackTraceFrame Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(this.getHighSpeedVideoFpsRangesFor, sequenceScope, this.Camera2StreamConfigurationMap.getCallerFrame(), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        debugCoroutineInfoImpl$creationStackTrace$1.getHighSpeedVideoFpsRanges = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$creationStackTrace$1(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl, kotlinx.coroutines.debug.internal.StackTraceFrame stackTraceFrame, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = debugCoroutineInfoImpl;
        this.Camera2StreamConfigurationMap = stackTraceFrame;
    }
}
