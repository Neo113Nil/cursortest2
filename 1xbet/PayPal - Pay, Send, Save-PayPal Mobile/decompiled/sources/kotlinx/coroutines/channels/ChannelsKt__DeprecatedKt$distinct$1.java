package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n"}, d2 = {"<anonymous>", "E", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$distinct$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super E>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1 channelsKt__DeprecatedKt$distinct$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1(continuation);
        channelsKt__DeprecatedKt$distinct$1.getHighSpeedVideoFpsRangesFor = obj;
        return channelsKt__DeprecatedKt$distinct$1;
    }

    ChannelsKt__DeprecatedKt$distinct$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1> continuation) {
        super(2, continuation);
    }
}
