package io.ktor.util;

/* compiled from: Deflater.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DeflaterKt$deflated$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.ReaderScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> $pool;
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel $this_deflated;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeflaterKt$deflated$2(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, boolean z, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, kotlin.coroutines.Continuation<? super io.ktor.util.DeflaterKt$deflated$2> continuation) {
        super(2, continuation);
        this.$this_deflated = byteWriteChannel;
        this.$gzip = z;
        this.$pool = objectPool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.util.DeflaterKt$deflated$2 deflaterKt$deflated$2 = new io.ktor.util.DeflaterKt$deflated$2(this.$this_deflated, this.$gzip, this.$pool, continuation);
        deflaterKt$deflated$2.L$0 = obj;
        return deflaterKt$deflated$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.ReaderScope readerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.util.DeflaterKt$deflated$2) create(readerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object deflateTo;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            deflateTo = io.ktor.util.DeflaterKt.deflateTo(((io.ktor.utils.io.ReaderScope) this.L$0).getChannel(), this.$this_deflated, this.$gzip, this.$pool, this);
            if (deflateTo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
