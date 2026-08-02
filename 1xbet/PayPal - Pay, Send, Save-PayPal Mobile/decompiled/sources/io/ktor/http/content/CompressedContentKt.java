package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/util/ContentEncoder;", "contentEncoder", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "compressed", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/http/content/OutgoingContent;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CompressedContentKt {
    public static /* synthetic */ io.ktor.http.content.OutgoingContent compressed$default(io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.ContentEncoder contentEncoder, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return compressed(outgoingContent, contentEncoder, coroutineContext);
    }

    public static final io.ktor.http.content.OutgoingContent compressed(final io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.ContentEncoder contentEncoder, kotlin.coroutines.CoroutineContext coroutineContext) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoingContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentEncoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                return new io.ktor.http.content.CompressedReadChannelResponse(outgoingContent, new kotlin.jvm.functions.Function0() { // from class: io.ktor.http.content.CompressedContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRanges = ((io.ktor.http.content.OutgoingContent.ReadChannelContent) io.ktor.http.content.OutgoingContent.this).getGetHighSpeedVideoFpsRanges();
                        return getHighSpeedVideoFpsRanges;
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
                        io.ktor.utils.io.ByteReadChannel ByteReadChannel$default;
                        ByteReadChannel$default = io.ktor.utils.io.ByteChannelCtorKt.ByteReadChannel$default(((io.ktor.http.content.OutgoingContent.ByteArrayContent) io.ktor.http.content.OutgoingContent.this).getGetHighResolutionOutputSizeshNQ4ISI(), 0, 0, 6, null);
                        return ByteReadChannel$default;
                    }
                }, contentEncoder, coroutineContext);
            }
            if ((outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) || (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade)) {
                return null;
            }
            if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            outgoingContent = ((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getGetHighSpeedVideoFpsRanges();
        }
    }
}
