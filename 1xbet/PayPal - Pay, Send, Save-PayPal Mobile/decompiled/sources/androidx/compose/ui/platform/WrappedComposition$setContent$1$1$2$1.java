package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class WrappedComposition$setContent$1$1$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.platform.WrappedComposition getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes().boundsUpdatesContentCaptureEventLoop(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WrappedComposition$setContent$1$1$2$1(androidx.compose.ui.platform.WrappedComposition wrappedComposition, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = wrappedComposition;
    }
}
