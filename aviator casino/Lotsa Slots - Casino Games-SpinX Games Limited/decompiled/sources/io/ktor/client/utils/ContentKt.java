package io.ktor.client.utils;

/* compiled from: Content.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lkotlin/Function1;", "Lio/ktor/http/Headers;", "block", "wrapHeaders", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function1;)Lio/ktor/http/content/OutgoingContent;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentKt {
    public static final io.ktor.http.content.OutgoingContent wrapHeaders(final io.ktor.http.content.OutgoingContent outgoingContent, final kotlin.jvm.functions.Function1<? super io.ktor.http.Headers, ? extends io.ktor.http.Headers> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) {
            return new io.ktor.http.content.OutgoingContent.NoContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$1
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
            return new io.ktor.http.content.OutgoingContent.ReadChannelContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$2
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                public io.ktor.utils.io.ByteReadChannel readFrom() {
                    return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).readFrom();
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                public io.ktor.utils.io.ByteReadChannel readFrom(kotlin.ranges.LongRange range) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
                    return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) this.$this_wrapHeaders).readFrom(range);
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
            return new io.ktor.http.content.OutgoingContent.WriteChannelContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$3
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
                public java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    java.lang.Object writeTo = ((io.ktor.http.content.OutgoingContent.WriteChannelContent) this.$this_wrapHeaders).writeTo(byteWriteChannel, continuation);
                    return writeTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeTo : kotlin.Unit.INSTANCE;
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
            return new io.ktor.http.content.OutgoingContent.ByteArrayContent(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$4
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.HttpStatusCode getStatus() {
                    return this.$this_wrapHeaders.getStatus();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                public byte[] bytes() {
                    return ((io.ktor.http.content.OutgoingContent.ByteArrayContent) this.$this_wrapHeaders).bytes();
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
            return new io.ktor.http.content.OutgoingContent.ProtocolUpgrade(block, outgoingContent) { // from class: io.ktor.client.utils.ContentKt$wrapHeaders$5
                final /* synthetic */ io.ktor.http.content.OutgoingContent $this_wrapHeaders;
                private final io.ktor.http.Headers headers;

                {
                    this.$this_wrapHeaders = outgoingContent;
                    this.headers = block.invoke(outgoingContent.getHeaders());
                }

                @Override // io.ktor.http.content.OutgoingContent
                public java.lang.Long getContentLength() {
                    return this.$this_wrapHeaders.getContentLength();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.ContentType getContentType() {
                    return this.$this_wrapHeaders.getContentType();
                }

                @Override // io.ktor.http.content.OutgoingContent
                public io.ktor.http.Headers getHeaders() {
                    return this.headers;
                }

                @Override // io.ktor.http.content.OutgoingContent.ProtocolUpgrade
                public java.lang.Object upgrade(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
                    return ((io.ktor.http.content.OutgoingContent.ProtocolUpgrade) this.$this_wrapHeaders).upgrade(byteReadChannel, byteWriteChannel, coroutineContext, coroutineContext2, continuation);
                }
            };
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
            return wrapHeaders(((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), block);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
