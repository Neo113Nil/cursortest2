package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1", f = "OkHttpEngine.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class OkHttpEngineKt$convertToOkHttpBody$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.http.content.OutgoingContent Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope = (io.ktor.utils.io.WriterScope) this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (((io.ktor.http.content.OutgoingContent.WriteChannelContent) this.Camera2StreamConfigurationMap).writeTo(writerScope.getChannel(), this) == coroutine_suspended) {
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
        return ((io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1 okHttpEngineKt$convertToOkHttpBody$3$1 = new io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1(this.Camera2StreamConfigurationMap, continuation);
        okHttpEngineKt$convertToOkHttpBody$3$1.getHighSpeedVideoFpsRanges = obj;
        return okHttpEngineKt$convertToOkHttpBody$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpEngineKt$convertToOkHttpBody$3$1(io.ktor.http.content.OutgoingContent outgoingContent, kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpEngineKt$convertToOkHttpBody$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = outgoingContent;
    }
}
