package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1", f = "ObservingUtils.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ObservingUtilsKt$toReadChannel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.http.content.OutgoingContent.WriteChannelContent getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope = (io.ktor.utils.io.WriterScope) this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighSpeedVideoFpsRangesFor.writeTo(writerScope.getChannel(), this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1 observingUtilsKt$toReadChannel$1 = new io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        observingUtilsKt$toReadChannel$1.Camera2StreamConfigurationMap = obj;
        return observingUtilsKt$toReadChannel$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservingUtilsKt$toReadChannel$1(io.ktor.http.content.OutgoingContent.WriteChannelContent writeChannelContent, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = writeChannelContent;
    }
}
