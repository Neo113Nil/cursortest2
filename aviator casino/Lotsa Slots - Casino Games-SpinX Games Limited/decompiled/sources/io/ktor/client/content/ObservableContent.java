package io.ktor.client.content;

/* compiled from: ObservableContent.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0014\"\b\b\u0000\u0010\u000e*\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lio/ktor/client/content/ObservableContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lio/ktor/client/content/ProgressListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/CoroutineContext;Lio/ktor/client/content/ProgressListener;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getContent", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/utils/io/ByteReadChannel;", "", "T", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/http/content/OutgoingContent;", "Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/client/content/ProgressListener;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ObservableContent extends io.ktor.http.content.OutgoingContent.ReadChannelContent {
    private final kotlin.coroutines.CoroutineContext callContext;
    private final io.ktor.http.content.OutgoingContent delegate;
    private final io.ktor.client.content.ProgressListener listener;

    public ObservableContent(io.ktor.http.content.OutgoingContent delegate, kotlin.coroutines.CoroutineContext callContext, io.ktor.client.content.ProgressListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callContext, "callContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.delegate = delegate;
        this.callContext = callContext;
        this.listener = listener;
    }

    private final io.ktor.utils.io.ByteReadChannel getContent(io.ktor.http.content.OutgoingContent delegate) {
        if (delegate instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
            return getContent(((io.ktor.http.content.OutgoingContent.ContentWrapper) delegate).getDelegate());
        }
        if (delegate instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
            return io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(((io.ktor.http.content.OutgoingContent.ByteArrayContent) delegate).getBytes(), 0, 0, 6, null);
        }
        if (delegate instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
            throw new io.ktor.client.call.UnsupportedContentTypeException(delegate);
        }
        if (delegate instanceof io.ktor.http.content.OutgoingContent.NoContent) {
            return io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty();
        }
        if (delegate instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
            return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) delegate).readFrom();
        }
        if (!(delegate instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, this.callContext, true, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.client.content.ObservableContent$getContent$1(delegate, null)).getChannel();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.ContentType getContentType() {
        return this.delegate.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public java.lang.Long getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.HttpStatusCode getStatus() {
        return this.delegate.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.Headers getHeaders() {
        return this.delegate.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.delegate.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.delegate.setProperty(key, value);
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public io.ktor.utils.io.ByteReadChannel readFrom() {
        return io.ktor.client.utils.ByteChannelUtilsKt.observable(getContent(this.delegate), this.callContext, getContentLength(), this.listener);
    }
}
