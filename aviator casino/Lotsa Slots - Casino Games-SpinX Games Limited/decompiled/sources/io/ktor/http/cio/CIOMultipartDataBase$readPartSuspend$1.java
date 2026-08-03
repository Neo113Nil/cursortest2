package io.ktor.http.cio;

/* compiled from: CIOMultipartDataBase.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {}, l = {51, 52}, m = "readPartSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CIOMultipartDataBase$readPartSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.ktor.http.cio.CIOMultipartDataBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$readPartSuspend$1(io.ktor.http.cio.CIOMultipartDataBase cIOMultipartDataBase, kotlin.coroutines.Continuation<? super io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1> continuation) {
        super(continuation);
        this.this$0 = cIOMultipartDataBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object readPartSuspend;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readPartSuspend = this.this$0.readPartSuspend(this);
        return readPartSuspend;
    }
}
