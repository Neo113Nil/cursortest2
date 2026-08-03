package io.ktor.utils.io;

/* compiled from: ByteChannelScanner.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", i = {}, l = {99, 105, 110}, m = "advanceToNextPotentialMatch", n = {}, s = {})
/* loaded from: classes6.dex */
final class ByteChannelScanner$advanceToNextPotentialMatch$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.ByteChannelScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelScanner$advanceToNextPotentialMatch$1(io.ktor.utils.io.ByteChannelScanner byteChannelScanner, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteChannelScanner$advanceToNextPotentialMatch$1> continuation) {
        super(continuation);
        this.this$0 = byteChannelScanner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object advanceToNextPotentialMatch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        advanceToNextPotentialMatch = this.this$0.advanceToNextPotentialMatch(this);
        return advanceToNextPotentialMatch;
    }
}
