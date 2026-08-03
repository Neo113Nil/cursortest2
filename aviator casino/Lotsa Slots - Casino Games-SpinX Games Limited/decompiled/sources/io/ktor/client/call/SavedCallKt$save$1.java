package io.ktor.client.call;

/* compiled from: SavedCall.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", i = {0}, l = {36}, m = "save", n = {"$this$save"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class SavedCallKt$save$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    SavedCallKt$save$1(kotlin.coroutines.Continuation<? super io.ktor.client.call.SavedCallKt$save$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.client.call.SavedCallKt.save(null, this);
    }
}
