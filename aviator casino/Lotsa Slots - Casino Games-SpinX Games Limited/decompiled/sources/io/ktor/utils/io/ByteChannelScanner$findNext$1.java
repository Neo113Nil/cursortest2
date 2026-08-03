package io.ktor.utils.io;

/* compiled from: ByteChannelScanner.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteChannelScanner", f = "ByteChannelScanner.kt", i = {0, 1, 2}, l = {53, 55, 58, 70}, m = "findNext$ktor_io", n = {"ignoreMissing", "ignoreMissing", "ignoreMissing"}, s = {"Z$0", "Z$0", "Z$0"})
/* loaded from: classes6.dex */
final class ByteChannelScanner$findNext$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.utils.io.ByteChannelScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelScanner$findNext$1(io.ktor.utils.io.ByteChannelScanner byteChannelScanner, kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteChannelScanner$findNext$1> continuation) {
        super(continuation);
        this.this$0 = byteChannelScanner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.findNext$ktor_io(false, this);
    }
}
