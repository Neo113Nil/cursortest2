package io.ktor.util.cio;

/* compiled from: Readers.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", i = {}, l = {19}, m = "toByteArray", n = {}, s = {})
/* loaded from: classes6.dex */
final class ReadersKt$toByteArray$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    ReadersKt$toByteArray$1(kotlin.coroutines.Continuation<? super io.ktor.util.cio.ReadersKt$toByteArray$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.util.cio.ReadersKt.toByteArray(null, 0, this);
    }
}
