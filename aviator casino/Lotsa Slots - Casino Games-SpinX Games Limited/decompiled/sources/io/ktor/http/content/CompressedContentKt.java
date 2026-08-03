package io.ktor.http.content;

/* compiled from: CompressedContent.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/util/ContentEncoder;", "contentEncoder", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "compressed", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompressedContentKt {
    public static /* synthetic */ io.ktor.http.content.OutgoingContent compressed$default(io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.ContentEncoder contentEncoder, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return compressed(outgoingContent, contentEncoder, coroutineContext);
    }

    public static final io.ktor.http.content.OutgoingContent compressed(final io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.ContentEncoder contentEncoder, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentEncoder, "contentEncoder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
            return new io.ktor.http.content.CompressedReadChannelResponse(outgoingContent, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.CompressedContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    io.ktor.utils.io.ByteReadChannel compressed$lambda$0;
                    compressed$lambda$0 = io.ktor.http.content.CompressedContentKt.compressed$lambda$0(io.ktor.http.content.OutgoingContent.this);
                    return compressed$lambda$0;
                }
            }, contentEncoder, coroutineContext);
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
            return new io.ktor.http.content.CompressedWriteChannelResponse((io.ktor.http.content.OutgoingContent.WriteChannelContent) outgoingContent, contentEncoder, coroutineContext);
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
            return new io.ktor.http.content.CompressedReadChannelResponse(outgoingContent, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.CompressedContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    io.ktor.utils.io.ByteReadChannel compressed$lambda$1;
                    compressed$lambda$1 = io.ktor.http.content.CompressedContentKt.compressed$lambda$1(io.ktor.http.content.OutgoingContent.this);
                    return compressed$lambda$1;
                }
            }, contentEncoder, coroutineContext);
        }
        if ((outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) || (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade)) {
            return null;
        }
        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper) {
            return compressed(((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getDelegate(), contentEncoder, coroutineContext);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel compressed$lambda$0(io.ktor.http.content.OutgoingContent outgoingContent) {
        return ((io.ktor.http.content.OutgoingContent.ReadChannelContent) outgoingContent).readFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel compressed$lambda$1(io.ktor.http.content.OutgoingContent outgoingContent) {
        return io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getContent(), 0, 0, 6, null);
    }
}
