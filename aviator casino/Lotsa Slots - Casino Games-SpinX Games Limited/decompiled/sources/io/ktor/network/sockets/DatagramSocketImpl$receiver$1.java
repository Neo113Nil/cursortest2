package io.ktor.network.sockets;

/* compiled from: DatagramSocketImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/network/sockets/Datagram;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", i = {0, 1}, l = {52, 52}, m = "invokeSuspend", n = {"$this$produce", "$this$produce"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class DatagramSocketImpl$receiver$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.ktor.network.sockets.Datagram>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ io.ktor.network.sockets.DatagramSocketImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSocketImpl$receiver$1(io.ktor.network.sockets.DatagramSocketImpl datagramSocketImpl, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSocketImpl$receiver$1> continuation) {
        super(2, continuation);
        this.this$0 = datagramSocketImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.network.sockets.DatagramSocketImpl$receiver$1 datagramSocketImpl$receiver$1 = new io.ktor.network.sockets.DatagramSocketImpl$receiver$1(this.this$0, continuation);
        datagramSocketImpl$receiver$1.L$0 = obj;
        return datagramSocketImpl$receiver$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.ktor.network.sockets.Datagram> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.DatagramSocketImpl$receiver$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:9:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.SendChannel sendChannel;
        java.lang.Object receiveImpl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            } else if (i == 1) {
                sendChannel = (kotlinx.coroutines.channels.SendChannel) this.L$1;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = producerScope2;
                this.L$1 = null;
                this.label = 2;
                if (sendChannel.send(obj, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = producerScope3;
            }
            sendChannel = producerScope.getChannel();
            this.L$0 = producerScope;
            this.L$1 = sendChannel;
            this.label = 1;
            receiveImpl = this.this$0.receiveImpl(this);
            if (receiveImpl == coroutine_suspended) {
                return coroutine_suspended;
            }
            producerScope2 = producerScope;
            obj = receiveImpl;
            this.L$0 = producerScope2;
            this.L$1 = null;
            this.label = 2;
            if (sendChannel.send(obj, this) != coroutine_suspended) {
            }
        } catch (java.nio.channels.ClosedChannelException | java.io.IOException unused) {
            return kotlin.Unit.INSTANCE;
        }
    }
}
