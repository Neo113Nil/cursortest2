package io.ktor.http.cio.internals;

/* compiled from: Chars.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.internals.CharsKt", f = "Chars.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {110, 118}, m = "writeIntHex", n = {"$this$writeIntHex", com.ironsource.B5.R, "current", "digits", "$this$writeIntHex", com.ironsource.B5.R, "current", "digits"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes6.dex */
final class CharsKt$writeIntHex$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    CharsKt$writeIntHex$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.internals.CharsKt$writeIntHex$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.http.cio.internals.CharsKt.writeIntHex(null, 0, this);
    }
}
