package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u000e\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00018\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00038\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0017\u001a\u00020\u001c8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Lio/ktor/http/content/CompressedWriteChannelResponse;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "p0", "Lio/ktor/util/ContentEncoder;", "p1", "Lkotlin/coroutines/CoroutineContext;", "p2", "<init>", "(Lio/ktor/http/content/OutgoingContent$WriteChannelContent;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)V", "", "T", "Lio/ktor/util/AttributeKey;", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lio/ktor/util/ContentEncoder;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/CoroutineContext;", "Camera2StreamConfigurationMap", "Lio/ktor/http/Headers;", "Lkotlin/Lazy;", "getHeaders", "()Lio/ktor/http/Headers;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "getInputFormats", "", "getContentLength", "()Ljava/lang/Long;", "getOutputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class CompressedWriteChannelResponse extends io.ktor.http.content.OutgoingContent.WriteChannelContent {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final io.ktor.http.content.OutgoingContent.WriteChannelContent getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final io.ktor.util.ContentEncoder getHighResolutionOutputSizeshNQ4ISI;

    public CompressedWriteChannelResponse(io.ktor.http.content.OutgoingContent.WriteChannelContent writeChannelContent, io.ktor.util.ContentEncoder contentEncoder, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeChannelContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentEncoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoFpsRangesFor = writeChannelContent;
        this.getHighResolutionOutputSizeshNQ4ISI = contentEncoder;
        this.Camera2StreamConfigurationMap = coroutineContext;
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.CompressedWriteChannelResponse$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.http.content.CompressedWriteChannelResponse.Camera2StreamConfigurationMap(io.ktor.http.content.CompressedWriteChannelResponse.this);
            }
        });
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.Headers getHeaders() {
        return (io.ktor.http.Headers) this.getHighSpeedVideoSizes.getValue();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.getHighSpeedVideoFpsRangesFor.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.getHighSpeedVideoFpsRangesFor.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        java.lang.Long contentLength = this.getHighSpeedVideoFpsRangesFor.getContentLength();
        if (contentLength == null) {
            return null;
        }
        java.lang.Long predictCompressedLength = this.getHighResolutionOutputSizeshNQ4ISI.predictCompressedLength(contentLength.longValue());
        if (predictCompressedLength == null || predictCompressedLength.longValue() < 0) {
            return null;
        }
        return predictCompressedLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final <T> T getProperty(io.ktor.util.AttributeKey<T> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return (T) this.getHighSpeedVideoFpsRangesFor.getProperty(p0);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final <T> void setProperty(io.ktor.util.AttributeKey<T> p0, T p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRangesFor.setProperty(p0, p1);
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public final java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new io.ktor.http.content.CompressedWriteChannelResponse$writeTo$2(this, byteWriteChannel, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return !kotlin.text.StringsKt.equals(str, io.ktor.http.HttpHeaders.INSTANCE.getContentLength(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0062, code lost:
    
        if (r10 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ io.ktor.http.Headers Camera2StreamConfigurationMap(io.ktor.http.content.CompressedWriteChannelResponse compressedWriteChannelResponse) {
        java.lang.String acceptEncoding;
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        io.ktor.util.StringValuesKt.appendFiltered$default(headersBuilder, compressedWriteChannelResponse.getHighSpeedVideoFpsRangesFor.getHeaders(), false, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.content.CompressedWriteChannelResponse$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(io.ktor.http.content.CompressedWriteChannelResponse.getHighSpeedVideoFpsRangesFor((java.lang.String) obj, (java.lang.String) obj2));
            }
        }, 2, null);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding(), compressedWriteChannelResponse.getHighResolutionOutputSizeshNQ4ISI.getName());
        java.lang.String vary = io.ktor.http.HttpHeaders.INSTANCE.getVary();
        java.lang.String str = compressedWriteChannelResponse.getHighSpeedVideoFpsRangesFor.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getVary());
        if (str != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(io.ktor.http.HttpHeaders.INSTANCE.getAcceptEncoding());
            acceptEncoding = sb.toString();
        }
        acceptEncoding = io.ktor.http.HttpHeaders.INSTANCE.getAcceptEncoding();
        headersBuilder.append(vary, acceptEncoding);
        return headersBuilder.build();
    }
}
