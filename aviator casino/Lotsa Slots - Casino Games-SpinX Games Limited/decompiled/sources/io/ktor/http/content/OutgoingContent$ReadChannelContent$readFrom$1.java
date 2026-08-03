package io.ktor.http.content;

/* compiled from: OutgoingContent.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1", f = "OutgoingContent.kt", i = {0, 0}, l = {119, 121}, m = "invokeSuspend", n = {"$this$writer", "source"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class OutgoingContent$ReadChannelContent$readFrom$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.ranges.LongRange $range;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ io.ktor.http.content.OutgoingContent.ReadChannelContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutgoingContent$ReadChannelContent$readFrom$1(io.ktor.http.content.OutgoingContent.ReadChannelContent readChannelContent, kotlin.ranges.LongRange longRange, kotlin.coroutines.Continuation<? super io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1> continuation) {
        super(2, continuation);
        this.this$0 = readChannelContent;
        this.$range = longRange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1 outgoingContent$ReadChannelContent$readFrom$1 = new io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1(this.this$0, this.$range, continuation);
        outgoingContent$ReadChannelContent$readFrom$1.L$0 = obj;
        return outgoingContent$ReadChannelContent$readFrom$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.http.content.OutgoingContent$ReadChannelContent$readFrom$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.ktor.utils.io.ByteReadChannel readFrom;
        io.ktor.utils.io.WriterScope writerScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.WriterScope writerScope2 = (io.ktor.utils.io.WriterScope) this.L$0;
            readFrom = this.this$0.readFrom();
            this.L$0 = writerScope2;
            this.L$1 = readFrom;
            this.label = 1;
            if (io.ktor.utils.io.ByteReadChannelOperationsKt.discard(readFrom, this.$range.getFirst(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            writerScope = writerScope2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            readFrom = (io.ktor.utils.io.ByteReadChannel) this.L$1;
            writerScope = (io.ktor.utils.io.WriterScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        long last = (this.$range.getLast() - this.$range.getFirst()) + 1;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(readFrom, writerScope.getChannel(), last, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
