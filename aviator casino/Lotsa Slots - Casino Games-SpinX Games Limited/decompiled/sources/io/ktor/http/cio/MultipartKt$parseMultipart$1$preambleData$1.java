package io.ktor.http.cio;

/* compiled from: Multipart.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", f = "Multipart.kt", i = {0}, l = {206, 207}, m = "invokeSuspend", n = {"$this$writer"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class MultipartKt$parseMultipart$1$preambleData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ io.ktor.utils.io.CountedByteReadChannel $countedInput;
    final /* synthetic */ kotlinx.io.bytestring.ByteString $firstBoundary;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$parseMultipart$1$preambleData$1(kotlinx.io.bytestring.ByteString byteString, io.ktor.utils.io.CountedByteReadChannel countedByteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1> continuation) {
        super(2, continuation);
        this.$firstBoundary = byteString;
        this.$countedInput = countedByteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1 multipartKt$parseMultipart$1$preambleData$1 = new io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1(this.$firstBoundary, this.$countedInput, continuation);
        multipartKt$parseMultipart$1$preambleData$1.L$0 = obj;
        return multipartKt$parseMultipart$1$preambleData$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.WriterScope writerScope;
        java.lang.Object parsePreambleImpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
            this.L$0 = writerScope;
            this.label = 1;
            parsePreambleImpl = io.ktor.http.cio.MultipartKt.parsePreambleImpl(this.$firstBoundary, this.$countedInput, writerScope.getChannel(), 8193L, this);
            if (parsePreambleImpl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (writerScope.getChannel().flushAndClose(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
