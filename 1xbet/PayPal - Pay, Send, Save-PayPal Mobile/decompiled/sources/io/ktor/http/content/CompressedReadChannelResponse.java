package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u00020\u0014\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010\u001e\u001a\u00020 8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u0004\u0018\u00010,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Lio/ktor/http/content/CompressedReadChannelResponse;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "p0", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "p1", "Lio/ktor/util/ContentEncoder;", "p2", "Lkotlin/coroutines/CoroutineContext;", "p3", "<init>", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/jvm/functions/Function0;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "", "T", "Lio/ktor/util/AttributeKey;", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "getHighSpeedVideoSizes", "Lio/ktor/http/content/OutgoingContent;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Lio/ktor/util/ContentEncoder;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/http/Headers;", "Lkotlin/Lazy;", "getHeaders", "()Lio/ktor/http/Headers;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "getOutputFormats", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "getOutputMinFrameDuration", "", "getContentLength", "()Ljava/lang/Long;", "getInputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class CompressedReadChannelResponse extends io.ktor.http.content.OutgoingContent.ReadChannelContent {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<io.ktor.utils.io.ByteReadChannel> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.util.ContentEncoder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.http.content.OutgoingContent Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public CompressedReadChannelResponse(io.ktor.http.content.OutgoingContent outgoingContent, kotlin.jvm.functions.Function0<? extends io.ktor.utils.io.ByteReadChannel> function0, io.ktor.util.ContentEncoder contentEncoder, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentEncoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.Camera2StreamConfigurationMap = outgoingContent;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = contentEncoder;
        this.getHighSpeedVideoSizes = coroutineContext;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.CompressedReadChannelResponse$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return io.ktor.http.content.CompressedReadChannelResponse.getHighSpeedVideoFpsRanges(io.ktor.http.content.CompressedReadChannelResponse.this);
            }
        });
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* renamed from: readFrom */
    public final io.ktor.utils.io.ByteReadChannel getGetHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI.encode(this.getHighSpeedVideoFpsRanges.invoke(), this.getHighSpeedVideoSizes);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.Headers getHeaders() {
        return (io.ktor.http.Headers) this.getHighSpeedVideoFpsRangesFor.getValue();
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
    public final java.lang.Long getContentLength() {
        java.lang.Long contentLength = this.Camera2StreamConfigurationMap.getContentLength();
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
        return (T) this.Camera2StreamConfigurationMap.getProperty(p0);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final <T> void setProperty(io.ktor.util.AttributeKey<T> p0, T p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.Camera2StreamConfigurationMap.setProperty(p0, p1);
    }

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) {
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
    public static /* synthetic */ io.ktor.http.Headers getHighSpeedVideoFpsRanges(io.ktor.http.content.CompressedReadChannelResponse compressedReadChannelResponse) {
        java.lang.String acceptEncoding;
        io.ktor.http.Headers.Companion companion = io.ktor.http.Headers.INSTANCE;
        io.ktor.http.HeadersBuilder headersBuilder = new io.ktor.http.HeadersBuilder(0, 1, null);
        io.ktor.util.StringValuesKt.appendFiltered$default(headersBuilder, compressedReadChannelResponse.Camera2StreamConfigurationMap.getHeaders(), false, new kotlin.jvm.functions.Function2() { // from class: io.ktor.http.content.CompressedReadChannelResponse$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(io.ktor.http.content.CompressedReadChannelResponse.getHighResolutionOutputSizeshNQ4ISI((java.lang.String) obj, (java.lang.String) obj2));
            }
        }, 2, null);
        headersBuilder.append(io.ktor.http.HttpHeaders.INSTANCE.getContentEncoding(), compressedReadChannelResponse.getHighResolutionOutputSizeshNQ4ISI.getName());
        java.lang.String vary = io.ktor.http.HttpHeaders.INSTANCE.getVary();
        java.lang.String str = compressedReadChannelResponse.Camera2StreamConfigurationMap.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getVary());
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
