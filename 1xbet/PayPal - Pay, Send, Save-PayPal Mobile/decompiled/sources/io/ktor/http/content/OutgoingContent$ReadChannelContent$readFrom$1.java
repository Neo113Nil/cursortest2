package io.ktor.http.content;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", i = {0, 0}, l = {119, 121}, m = "invokeSuspend", n = {"$this$writer", "source"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class OutgoingContent$ReadChannelContent$readFrom$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.http.content.OutgoingContent.ReadChannelContent getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.ranges.LongRange getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(r1, r3.getChannel(), (r4 - r6) + 1, r9) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges;
        io.ktor.utils.io.WriterScope writerScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope2 = (io.ktor.utils.io.WriterScope) this.Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRanges();
            this.Camera2StreamConfigurationMap = writerScope2;
            this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (io.ktor.utils.io.ByteReadChannelOperationsKt.discard(getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getFirst(), this) != coroutine_suspended) {
                writerScope = writerScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        getHighSpeedVideoFpsRanges = (io.ktor.utils.io.ByteReadChannel) this.getHighSpeedVideoFpsRangesFor;
        writerScope = (io.ktor.utils.io.WriterScope) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        long last = this.getHighSpeedVideoSizes.getLast();
        long first = this.getHighSpeedVideoSizes.getFirst();
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        outgoingContent$ReadChannelContent$readFrom$1.Camera2StreamConfigurationMap = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutgoingContent$ReadChannelContent$readFrom$1(io.ktor.http.content.OutgoingContent.ReadChannelContent readChannelContent, kotlin.ranges.LongRange longRange, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = readChannelContent;
        this.getHighSpeedVideoSizes = longRange;
    }
}
