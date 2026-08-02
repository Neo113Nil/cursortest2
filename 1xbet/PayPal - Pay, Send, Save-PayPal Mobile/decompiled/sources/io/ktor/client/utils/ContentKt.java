package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lkotlin/Function1;", "Lio/ktor/http/Headers;", "block", "wrapHeaders", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function1;)Lio/ktor/http/content/OutgoingContent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentKt {
    public static final io.ktor.http.content.OutgoingContent wrapHeaders(final io.ktor.http.content.OutgoingContent outgoingContent, final kotlin.jvm.functions.Function1<? super io.ktor.http.Headers, ? extends io.ktor.http.Headers> function1) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) {
                return new io.ktor.http.content.OutgoingContent.NoContent(function1, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$1
                    final /* synthetic */ io.ktor.http.content.OutgoingContent getHighSpeedVideoSizes;
                    private final io.ktor.http.Headers headers;

                    {
                        this.getHighSpeedVideoSizes = outgoingContent;
                        this.headers = function1.invoke(outgoingContent.getHeaders());
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final java.lang.Long getContentLength() {
                        return this.getHighSpeedVideoSizes.getContentLength();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.ContentType getContentType() {
                        return this.getHighSpeedVideoSizes.getContentType();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.HttpStatusCode getStatus() {
                        return this.getHighSpeedVideoSizes.getStatus();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.Headers getHeaders() {
                        return this.headers;
                    }
                };
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                return new io.ktor.http.content.OutgoingContent.ReadChannelContent(function1, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$2
                    final /* synthetic */ io.ktor.http.content.OutgoingContent Camera2StreamConfigurationMap;
                    private final io.ktor.http.Headers headers;

                    {
                        this.Camera2StreamConfigurationMap = outgoingContent;
                        this.headers = function1.invoke(outgoingContent.getHeaders());
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final java.lang.Long getContentLength() {
                        return this.Camera2StreamConfigurationMap.getContentLength();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.ContentType getContentType() {
                        return this.Camera2StreamConfigurationMap.getContentType();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.HttpStatusCode getStatus() {
                        return this.Camera2StreamConfigurationMap.getStatus();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.Headers getHeaders() {
                        return this.headers;
                    }

                    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                    public final io.ktor.utils.io.ByteReadChannel readFrom() {
                        return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) this.Camera2StreamConfigurationMap).readFrom();
                    }

                    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                    public final io.ktor.utils.io.ByteReadChannel readFrom(kotlin.ranges.LongRange range) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
                        return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) this.Camera2StreamConfigurationMap).readFrom(range);
                    }
                };
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
                return new io.ktor.http.content.OutgoingContent.WriteChannelContent(function1, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$3
                    final /* synthetic */ io.ktor.http.content.OutgoingContent getHighResolutionOutputSizeshNQ4ISI;
                    private final io.ktor.http.Headers headers;

                    {
                        this.getHighResolutionOutputSizeshNQ4ISI = outgoingContent;
                        this.headers = function1.invoke(outgoingContent.getHeaders());
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final java.lang.Long getContentLength() {
                        return this.getHighResolutionOutputSizeshNQ4ISI.getContentLength();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.ContentType getContentType() {
                        return this.getHighResolutionOutputSizeshNQ4ISI.getContentType();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.HttpStatusCode getStatus() {
                        return this.getHighResolutionOutputSizeshNQ4ISI.getStatus();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.Headers getHeaders() {
                        return this.headers;
                    }

                    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
                    public final java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object writeTo = ((io.ktor.http.content.OutgoingContent.WriteChannelContent) this.getHighResolutionOutputSizeshNQ4ISI).writeTo(byteWriteChannel, continuation);
                        return writeTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeTo : kotlin.Unit.INSTANCE;
                    }
                };
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
                return new io.ktor.http.content.OutgoingContent.ByteArrayContent(function1, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$4
                    final /* synthetic */ io.ktor.http.content.OutgoingContent getHighSpeedVideoFpsRanges;
                    private final io.ktor.http.Headers headers;

                    {
                        this.getHighSpeedVideoFpsRanges = outgoingContent;
                        this.headers = function1.invoke(outgoingContent.getHeaders());
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final java.lang.Long getContentLength() {
                        return this.getHighSpeedVideoFpsRanges.getContentLength();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.ContentType getContentType() {
                        return this.getHighSpeedVideoFpsRanges.getContentType();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.HttpStatusCode getStatus() {
                        return this.getHighSpeedVideoFpsRanges.getStatus();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.Headers getHeaders() {
                        return this.headers;
                    }

                    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                    public final byte[] bytes() {
                        return ((io.ktor.http.content.OutgoingContent.ByteArrayContent) this.getHighSpeedVideoFpsRanges).bytes();
                    }
                };
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
                return new io.ktor.http.content.OutgoingContent.ProtocolUpgrade(function1, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$5
                    final /* synthetic */ io.ktor.http.content.OutgoingContent getHighResolutionOutputSizeshNQ4ISI;
                    private final io.ktor.http.Headers headers;

                    {
                        this.getHighResolutionOutputSizeshNQ4ISI = outgoingContent;
                        this.headers = function1.invoke(outgoingContent.getHeaders());
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final java.lang.Long getContentLength() {
                        return this.getHighResolutionOutputSizeshNQ4ISI.getContentLength();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.ContentType getContentType() {
                        return this.getHighResolutionOutputSizeshNQ4ISI.getContentType();
                    }

                    @Override // io.ktor.http.content.OutgoingContent
                    public final io.ktor.http.Headers getHeaders() {
                        return this.headers;
                    }

                    @Override // io.ktor.http.content.OutgoingContent.ProtocolUpgrade
                    public final java.lang.Object upgrade(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
                        return ((io.ktor.http.content.OutgoingContent.ProtocolUpgrade) this.getHighResolutionOutputSizeshNQ4ISI).upgrade(byteReadChannel, byteWriteChannel, coroutineContext, coroutineContext2, continuation);
                    }
                };
            }
            if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            outgoingContent = ((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getGetHighSpeedVideoFpsRanges();
        }
    }
}
