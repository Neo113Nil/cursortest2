package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lio/ktor/client/plugins/logging/LoggedContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "originalContent", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "<init>", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/utils/io/ByteReadChannel;)V", "", "T", "Lio/ktor/util/AttributeKey;", "key", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/http/content/OutgoingContent;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lio/ktor/utils/io/ByteReadChannel;", "getHighSpeedVideoFpsRanges", "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LoggedContent extends io.ktor.http.content.OutgoingContent.ReadChannelContent {
    private final java.lang.Long contentLength;
    private final io.ktor.http.ContentType contentType;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final io.ktor.http.content.OutgoingContent getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges;
    private final io.ktor.http.Headers headers;
    private final io.ktor.http.HttpStatusCode status;

    public LoggedContent(io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        this.getHighResolutionOutputSizeshNQ4ISI = outgoingContent;
        this.getHighSpeedVideoFpsRanges = byteReadChannel;
        this.contentType = outgoingContent.getContentType();
        this.contentLength = outgoingContent.getContentLength();
        this.status = outgoingContent.getStatus();
        this.headers = outgoingContent.getHeaders();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (T) this.getHighResolutionOutputSizeshNQ4ISI.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setProperty(key, value);
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* renamed from: readFrom, reason: from getter */
    public final io.ktor.utils.io.ByteReadChannel getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
