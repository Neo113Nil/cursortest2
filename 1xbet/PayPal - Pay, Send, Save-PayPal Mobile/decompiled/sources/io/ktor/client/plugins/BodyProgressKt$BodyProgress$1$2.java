package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/statement/HttpResponse;", "response"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class BodyProgressKt$BodyProgress$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.AttributeKey attributeKey;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.statement.HttpResponse httpResponse = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoFpsRanges;
        io.ktor.util.Attributes attributes = httpResponse.getCall().getRequest().getAttributes();
        attributeKey = io.ktor.client.plugins.BodyProgressKt.getHighSpeedVideoSizes;
        io.ktor.client.content.ProgressListener progressListener = (io.ktor.client.content.ProgressListener) attributes.getOrNull(attributeKey);
        if (progressListener == null) {
            return null;
        }
        return io.ktor.client.plugins.BodyProgressKt.withObservableDownload(httpResponse, progressListener);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpResponse> continuation) {
        return ((io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2) create(httpResponse, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2 bodyProgressKt$BodyProgress$1$2 = new io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2(continuation);
        bodyProgressKt$BodyProgress$1$2.getHighSpeedVideoFpsRanges = obj;
        return bodyProgressKt$BodyProgress$1$2;
    }

    BodyProgressKt$BodyProgress$1$2(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2> continuation) {
        super(2, continuation);
    }
}
