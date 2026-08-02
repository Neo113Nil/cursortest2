package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\"#$%&'B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0001\u0006()*+,-"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "", "<init>", "()V", "T", "Lio/ktor/util/AttributeKey;", "key", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/http/Headers;", "trailers", "()Lio/ktor/http/Headers;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "getHeaders", "headers", "Lio/ktor/util/Attributes;", "Camera2StreamConfigurationMap", "Lio/ktor/util/Attributes;", "getHighSpeedVideoFpsRangesFor", "NoContent", "ReadChannelContent", "WriteChannelContent", "ByteArrayContent", "ProtocolUpgrade", "ContentWrapper", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OutgoingContent {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private io.ktor.util.Attributes getHighSpeedVideoFpsRangesFor;

    public java.lang.Long getContentLength() {
        return null;
    }

    public io.ktor.http.ContentType getContentType() {
        return null;
    }

    public io.ktor.http.HttpStatusCode getStatus() {
        return null;
    }

    public io.ktor.http.Headers trailers() {
        return null;
    }

    private OutgoingContent() {
    }

    public io.ktor.http.Headers getHeaders() {
        return io.ktor.http.Headers.INSTANCE.getEmpty();
    }

    public <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        io.ktor.util.Attributes attributes = this.getHighSpeedVideoFpsRangesFor;
        if (attributes != null) {
            return (T) attributes.getOrNull(key);
        }
        return null;
    }

    public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (value == null && this.getHighSpeedVideoFpsRangesFor == null) {
            return;
        }
        if (value == null) {
            io.ktor.util.Attributes attributes = this.getHighSpeedVideoFpsRangesFor;
            if (attributes != null) {
                attributes.remove(key);
                return;
            }
            return;
        }
        io.ktor.util.Attributes attributes2 = this.getHighSpeedVideoFpsRangesFor;
        if (attributes2 == null) {
            attributes2 = io.ktor.util.AttributesJvmKt.Attributes$default(false, 1, null);
        }
        this.getHighSpeedVideoFpsRangesFor = attributes2;
        attributes2.put(key, value);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static abstract class NoContent extends io.ktor.http.content.OutgoingContent {
        public NoContent() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\t"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/ranges/LongRange;", "range", "(Lkotlin/ranges/LongRange;)Lio/ktor/utils/io/ByteReadChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static abstract class ReadChannelContent extends io.ktor.http.content.OutgoingContent {
        public abstract io.ktor.utils.io.ByteReadChannel readFrom();

        public ReadChannelContent() {
            super(null);
        }

        public io.ktor.utils.io.ByteReadChannel readFrom(kotlin.ranges.LongRange range) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "");
            if (range.isEmpty()) {
                return io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty();
            }
            return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, (kotlin.coroutines.CoroutineContext) kotlinx.coroutines.Dispatchers.getUnconfined(), true, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1(this, range, null)).getChannel();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static abstract class WriteChannelContent extends io.ktor.http.content.OutgoingContent {
        public abstract java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

        public WriteChannelContent() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "()[B"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static abstract class ByteArrayContent extends io.ktor.http.content.OutgoingContent {
        public abstract byte[] bytes();

        public ByteArrayContent() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "Lkotlin/coroutines/CoroutineContext;", "engineContext", "userContext", "Lkotlinx/coroutines/Job;", "upgrade", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static abstract class ProtocolUpgrade extends io.ktor.http.content.OutgoingContent {
        public abstract java.lang.Object upgrade(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation);

        public ProtocolUpgrade() {
            super(null);
        }

        @Override // io.ktor.http.content.OutgoingContent
        public final io.ktor.http.HttpStatusCode getStatus() {
            return io.ktor.http.HttpStatusCode.INSTANCE.getSwitchingProtocols();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0006*\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lio/ktor/http/content/OutgoingContent;", "delegate", "<init>", "(Lio/ktor/http/content/OutgoingContent;)V", "", "T", "Lio/ktor/util/AttributeKey;", "key", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "()Lio/ktor/http/content/OutgoingContent;", "copy", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Camera2StreamConfigurationMap", "Lio/ktor/http/content/OutgoingContent;", "getHighSpeedVideoFpsRanges", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "headers"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static abstract class ContentWrapper extends io.ktor.http.content.OutgoingContent {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final io.ktor.http.content.OutgoingContent getHighSpeedVideoFpsRanges;

        public abstract io.ktor.http.content.OutgoingContent.ContentWrapper copy(io.ktor.http.content.OutgoingContent delegate);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentWrapper(io.ktor.http.content.OutgoingContent outgoingContent) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
            this.getHighSpeedVideoFpsRanges = outgoingContent;
        }

        @Override // io.ktor.http.content.OutgoingContent
        public io.ktor.http.ContentType getContentType() {
            return this.getHighSpeedVideoFpsRanges.getContentType();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public java.lang.Long getContentLength() {
            return this.getHighSpeedVideoFpsRanges.getContentLength();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public io.ktor.http.HttpStatusCode getStatus() {
            return this.getHighSpeedVideoFpsRanges.getStatus();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public io.ktor.http.Headers getHeaders() {
            return this.getHighSpeedVideoFpsRanges.getHeaders();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            return (T) this.getHighSpeedVideoFpsRanges.getProperty(key);
        }

        @Override // io.ktor.http.content.OutgoingContent
        public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.getHighSpeedVideoFpsRanges.setProperty(key, value);
        }

        /* renamed from: delegate, reason: from getter */
        public final io.ktor.http.content.OutgoingContent getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public /* synthetic */ OutgoingContent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
