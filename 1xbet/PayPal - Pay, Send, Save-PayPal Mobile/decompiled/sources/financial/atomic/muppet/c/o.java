package financial.atomic.muppet.c;

/* loaded from: classes17.dex */
public final class o implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.ByteWriteChannel f6852a;

    public o(io.ktor.utils.io.ByteWriteChannel byteWriteChannel) {
        this.f6852a = byteWriteChannel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object writeFully$default = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(this.f6852a, (byte[]) obj, 0, 0, continuation, 6, null);
        return writeFully$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeFully$default : kotlin.Unit.INSTANCE;
    }
}
