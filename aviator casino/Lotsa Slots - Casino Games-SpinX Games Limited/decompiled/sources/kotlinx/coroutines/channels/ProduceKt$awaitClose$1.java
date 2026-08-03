package kotlinx.coroutines.channels;

/* compiled from: Produce.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class ProduceKt$awaitClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    ProduceKt$awaitClose$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ProduceKt$awaitClose$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return kotlinx.coroutines.channels.ProduceKt.awaitClose(null, null, this);
    }
}
