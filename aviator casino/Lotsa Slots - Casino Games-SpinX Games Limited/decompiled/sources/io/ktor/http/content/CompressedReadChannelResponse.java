package io.ktor.http.content;

/* compiled from: CompressedContent.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lio/ktor/http/content/CompressedReadChannelResponse;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "original", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "delegateChannel", "Lio/ktor/util/ContentEncoder;", "encoder", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function0;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "", "T", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/http/content/OutgoingContent;", "getOriginal", "()Lio/ktor/http/content/OutgoingContent;", "Lkotlin/jvm/functions/Function0;", "getDelegateChannel", "()Lkotlin/jvm/functions/Function0;", "Lio/ktor/util/ContentEncoder;", "getEncoder", "()Lio/ktor/util/ContentEncoder;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/http/Headers;", "headers$delegate", "Lkotlin/Lazy;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CompressedReadChannelResponse extends io.ktor.http.content.OutgoingContent.ReadChannelContent {
    private final kotlin.coroutines.CoroutineContext coroutineContext;
    private final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> delegateChannel;
    private final io.ktor.util.ContentEncoder encoder;

    /* renamed from: headers$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy headers;
    private final io.ktor.http.content.OutgoingContent original;

    public final io.ktor.http.content.OutgoingContent getOriginal() {
        return this.original;
    }

    public final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> getDelegateChannel() {
        return this.delegateChannel;
    }

    public final io.ktor.util.ContentEncoder getEncoder() {
        return this.encoder;
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompressedReadChannelResponse(io.ktor.http.content.OutgoingContent original, kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> delegateChannel, io.ktor.util.ContentEncoder encoder, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(original, "original");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegateChannel, "delegateChannel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "encoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.original = original;
        this.delegateChannel = delegateChannel;
        this.encoder = encoder;
        this.coroutineContext = coroutineContext;
        this.headers = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.CompressedReadChannelResponse$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                io.ktor.http.Headers headers_delegate$lambda$2;
                headers_delegate$lambda$2 = io.ktor.http.content.CompressedReadChannelResponse.headers_delegate$lambda$2(io.ktor.http.content.CompressedReadChannelResponse.this);
                return headers_delegate$lambda$2;
            }
        });
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public io.ktor.utils.io.ByteReadChannel readFrom() {
        return this.encoder.encode(this.delegateChannel.invoke(), this.coroutineContext);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.Headers getHeaders() {
        return (io.ktor.http.Headers) this.headers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0062, code lost:
    
        if (r10 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final io.ktor.http.Headers headers_delegate$lambda$2(io.ktor.http.content.CompressedReadChannelResponse compressedReadChannelResponse) {
        java.lang.String acceptEncoding;
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        io.ktor.util.StringValuesKt.appendFiltered$default(headersBuilder, compressedReadChannelResponse.original.getHeaders(), false, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.content.CompressedReadChannelResponse$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean headers_delegate$lambda$2$lambda$1$lambda$0;
                headers_delegate$lambda$2$lambda$1$lambda$0 = io.ktor.http.content.CompressedReadChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0((java.lang.String) obj, (java.lang.String) obj2);
                return java.lang.Boolean.valueOf(headers_delegate$lambda$2$lambda$1$lambda$0);
            }
        }, 2, null);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding(), compressedReadChannelResponse.encoder.getName());
        java.lang.String vary = io.ktor.http.HttpHeaders.INSTANCE.getVary();
        java.lang.String str = compressedReadChannelResponse.original.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getVary());
        if (str != null) {
            acceptEncoding = str + ", " + io.ktor.http.HttpHeaders.INSTANCE.getAcceptEncoding();
        }
        acceptEncoding = io.ktor.http.HttpHeaders.INSTANCE.getAcceptEncoding();
        headersBuilder.append(vary, acceptEncoding);
        return headersBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean headers_delegate$lambda$2$lambda$1$lambda$0(java.lang.String name, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<unused var>");
        return !kotlin.text.StringsKt.equals(name, io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), true);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.ContentType getContentType() {
        return this.original.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.HttpStatusCode getStatus() {
        return this.original.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public java.lang.Long getContentLength() {
        java.lang.Long contentLength = this.original.getContentLength();
        if (contentLength == null) {
            return null;
        }
        java.lang.Long predictCompressedLength = this.encoder.predictCompressedLength(contentLength.longValue());
        if (predictCompressedLength == null || predictCompressedLength.longValue() < 0) {
            return null;
        }
        return predictCompressedLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(io.ktor.util.AttributeKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.original.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(io.ktor.util.AttributeKey<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.original.setProperty(key, value);
    }
}
