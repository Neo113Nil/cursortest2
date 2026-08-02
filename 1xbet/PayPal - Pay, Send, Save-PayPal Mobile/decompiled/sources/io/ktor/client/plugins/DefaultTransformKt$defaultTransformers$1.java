package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class DefaultTransformKt$defaultTransformers$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.http.content.OutgoingContent.ReadChannelContent platformRequestDefaultTransform;
        org.slf4j.Logger logger;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final io.ktor.util.pipeline.PipelineContext pipelineContext = (io.ktor.util.pipeline.PipelineContext) this.getHighSpeedVideoFpsRanges;
            final java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getAccept()) == null) {
                ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getHeaders().append(io.ktor.http.HttpHeaders.INSTANCE.getAccept(), "*/*");
            }
            final io.ktor.http.ContentType contentType = io.ktor.http.HttpMessagePropertiesKt.contentType((io.ktor.http.HttpMessageBuilder) pipelineContext.getContext());
            if (obj2 instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) obj2;
                if (contentType == null) {
                    contentType = io.ktor.http.ContentType.Text.INSTANCE.getPlain();
                }
                platformRequestDefaultTransform = new io.ktor.http.content.TextContent(str, contentType, null, 4, null);
            } else if (obj2 instanceof byte[]) {
                platformRequestDefaultTransform = new io.ktor.http.content.OutgoingContent.ByteArrayContent(contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$1
                    private final long contentLength;
                    private final io.ktor.http.ContentType contentType;
                    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

                    {
                        this.getHighSpeedVideoFpsRanges = obj2;
                        this.contentType = contentType == null ? io.ktor.http.ContentType.Application.INSTANCE.getOctetStream() : contentType;
                        this.contentLength = ((byte[]) obj2).length;
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.ContentType getContentType() {
                        return this.contentType;
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final java.lang.Long getContentLength() {
                        return java.lang.Long.valueOf(this.contentLength);
                    }

                    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                    /* renamed from: bytes */
                    public final byte[] getGetHighSpeedVideoFpsRangesFor() {
                        return (byte[]) this.getHighSpeedVideoFpsRanges;
                    }
                };
            } else if (obj2 instanceof io.ktor.utils.io.ByteReadChannel) {
                platformRequestDefaultTransform = new io.ktor.http.content.OutgoingContent.ReadChannelContent(pipelineContext, contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$2
                    private final java.lang.Long contentLength;
                    private final io.ktor.http.ContentType contentType;
                    final /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

                    {
                        this.getHighResolutionOutputSizeshNQ4ISI = obj2;
                        java.lang.String str2 = pipelineContext.getContext().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                        this.contentLength = str2 != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str2)) : null;
                        this.contentType = contentType == null ? io.ktor.http.ContentType.Application.INSTANCE.getOctetStream() : contentType;
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final java.lang.Long getContentLength() {
                        return this.contentLength;
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.ContentType getContentType() {
                        return this.contentType;
                    }

                    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                    /* renamed from: readFrom */
                    public final io.ktor.utils.io.ByteReadChannel getGetHighSpeedVideoFpsRanges() {
                        return (io.ktor.utils.io.ByteReadChannel) this.getHighResolutionOutputSizeshNQ4ISI;
                    }
                };
            } else {
                platformRequestDefaultTransform = obj2 instanceof io.ktor.http.content.OutgoingContent ? (io.ktor.http.content.OutgoingContent) obj2 : io.ktor.client.plugins.DefaultTransformersJvmKt.platformRequestDefaultTransform(contentType, (io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext(), obj2);
            }
            if ((platformRequestDefaultTransform != null ? platformRequestDefaultTransform.getContentType() : null) != null) {
                ((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getContentType());
                logger = io.ktor.client.plugins.DefaultTransformKt.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Transformed with default transformers request body for ");
                sb.append(((io.ktor.client.request.HttpRequestBuilder) pipelineContext.getContext()).getUrl());
                sb.append(" from ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj2.getClass()));
                logger.trace(sb.toString());
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (pipelineContext.proceedWith(platformRequestDefaultTransform, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.util.pipeline.PipelineContext<java.lang.Object, io.ktor.client.request.HttpRequestBuilder> pipelineContext, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1 defaultTransformKt$defaultTransformers$1 = new io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1(continuation);
        defaultTransformKt$defaultTransformers$1.getHighSpeedVideoFpsRanges = pipelineContext;
        defaultTransformKt$defaultTransformers$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return defaultTransformKt$defaultTransformers$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    DefaultTransformKt$defaultTransformers$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1> continuation) {
        super(3, continuation);
    }
}
