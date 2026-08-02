package io.ktor.client.content;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0012\u001a\u00020\u0011\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+"}, d2 = {"Lio/ktor/client/content/ObservableContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lio/ktor/client/content/ProgressListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/CoroutineContext;Lio/ktor/client/content/ProgressListener;)V", "", "T", "Lio/ktor/util/AttributeKey;", "key", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/utils/io/ByteReadChannel;", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/http/content/OutgoingContent;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRanges", "Lio/ktor/client/content/ProgressListener;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "headers"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ObservableContent extends io.ktor.http.content.OutgoingContent.ReadChannelContent {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.client.content.ProgressListener getHighSpeedVideoSizes;
    private final io.ktor.http.content.OutgoingContent getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    public ObservableContent(io.ktor.http.content.OutgoingContent outgoingContent, kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.client.content.ProgressListener progressListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressListener, "");
        this.getHighSpeedVideoFpsRangesFor = outgoingContent;
        this.getHighSpeedVideoFpsRanges = coroutineContext;
        this.getHighSpeedVideoSizes = progressListener;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.getHighSpeedVideoFpsRangesFor.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return this.getHighSpeedVideoFpsRangesFor.getContentLength();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.getHighSpeedVideoFpsRangesFor.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.Headers getHeaders() {
        return this.getHighSpeedVideoFpsRangesFor.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (T) this.getHighSpeedVideoFpsRangesFor.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighSpeedVideoFpsRangesFor.setProperty(key, value);
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* renamed from: readFrom */
    public final io.ktor.utils.io.ByteReadChannel getGetHighSpeedVideoFpsRanges() {
        io.ktor.utils.io.ByteReadChannel channel;
        io.ktor.http.content.OutgoingContent outgoingContent = this.getHighSpeedVideoFpsRangesFor;
        while (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
            outgoingContent = ((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getGetHighSpeedVideoFpsRanges();
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
            channel = io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getGetHighResolutionOutputSizeshNQ4ISI(), 0, 0, 6, null);
        } else {
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
                throw new io.ktor.client.call.UnsupportedContentTypeException(outgoingContent);
            }
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) {
                channel = io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty();
            } else if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                channel = ((io.ktor.http.content.OutgoingContent.ReadChannelContent) outgoingContent).getGetHighSpeedVideoFpsRanges();
            } else {
                if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                channel = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, this.getHighSpeedVideoFpsRanges, true, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.client.content.ObservableContent$getContent$1(outgoingContent, null)).getChannel();
            }
        }
        return io.ktor.client.utils.ByteChannelUtilsKt.observable(channel, this.getHighSpeedVideoFpsRanges, getContentLength(), this.getHighSpeedVideoSizes);
    }
}
