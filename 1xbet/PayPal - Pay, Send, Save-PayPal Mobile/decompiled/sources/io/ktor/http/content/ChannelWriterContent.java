package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001BR\u0012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R5\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lio/ktor/http/content/ChannelWriterContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lkotlin/Function2;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lio/ktor/http/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "Lio/ktor/http/HttpStatusCode;", "status", "", "contentLength", "<init>", "(Lkotlin/jvm/functions/Function2;Lio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;Ljava/lang/Long;)V", "channel", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChannelWriterContent extends io.ktor.http.content.OutgoingContent.WriteChannelContent {
    private final java.lang.Long contentLength;
    private final io.ktor.http.ContentType contentType;
    private final kotlin.jvm.functions.Function2<io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    private final io.ktor.http.HttpStatusCode status;

    public /* synthetic */ ChannelWriterContent(kotlin.jvm.functions.Function2 function2, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, contentType, (i & 4) != 0 ? null : httpStatusCode, (i & 8) != 0 ? null : l);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final io.ktor.http.HttpStatusCode getStatus() {
        return this.status;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final java.lang.Long getContentLength() {
        return this.contentLength;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelWriterContent(kotlin.jvm.functions.Function2<? super io.ktor.utils.io.ByteWriteChannel, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, io.ktor.http.ContentType contentType, io.ktor.http.HttpStatusCode httpStatusCode, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.contentType = contentType;
        this.status = httpStatusCode;
        this.contentLength = l;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public final java.lang.Object writeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object invoke = this.getHighSpeedVideoFpsRangesFor.invoke(byteWriteChannel, continuation);
        return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
    }
}
