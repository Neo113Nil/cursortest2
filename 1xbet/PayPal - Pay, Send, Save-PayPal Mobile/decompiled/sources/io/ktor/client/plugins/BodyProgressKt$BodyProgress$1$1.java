package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/ktor/http/content/OutgoingContent;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class BodyProgressKt$BodyProgress$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.request.HttpRequestBuilder, io.ktor.http.content.OutgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.util.AttributeKey attributeKey;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.getHighResolutionOutputSizeshNQ4ISI;
        io.ktor.http.content.OutgoingContent outgoingContent = (io.ktor.http.content.OutgoingContent) this.getHighSpeedVideoSizes;
        io.ktor.util.Attributes attributes = httpRequestBuilder.getAttributes();
        attributeKey = io.ktor.client.plugins.BodyProgressKt.getHighResolutionOutputSizeshNQ4ISI;
        io.ktor.client.content.ProgressListener progressListener = (io.ktor.client.content.ProgressListener) attributes.getOrNull(attributeKey);
        if (progressListener == null) {
            return null;
        }
        return new io.ktor.client.content.ObservableContent(outgoingContent, httpRequestBuilder.getExecutionContext(), progressListener);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.http.content.OutgoingContent outgoingContent, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent> continuation) {
        io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1 bodyProgressKt$BodyProgress$1$1 = new io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1(continuation);
        bodyProgressKt$BodyProgress$1$1.getHighResolutionOutputSizeshNQ4ISI = httpRequestBuilder;
        bodyProgressKt$BodyProgress$1$1.getHighSpeedVideoSizes = outgoingContent;
        return bodyProgressKt$BodyProgress$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    BodyProgressKt$BodyProgress$1$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1> continuation) {
        super(3, continuation);
    }
}
