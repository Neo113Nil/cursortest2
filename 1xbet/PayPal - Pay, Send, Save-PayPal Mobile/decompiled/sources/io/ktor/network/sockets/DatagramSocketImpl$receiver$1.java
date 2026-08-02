package io.ktor.network.sockets;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/ktor/network/sockets/Datagram;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.DatagramSocketImpl$receiver$1", f = "DatagramSocketImpl.kt", i = {0, 1}, l = {52, 52}, m = "invokeSuspend", n = {"$this$produce", "$this$produce"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class DatagramSocketImpl$receiver$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super io.ktor.network.sockets.Datagram>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.network.sockets.DatagramSocketImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (r4.send(r9, r8) != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005b -> B:8:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.SendChannel sendChannel;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            } else if (i == 1) {
                kotlinx.coroutines.channels.SendChannel sendChannel2 = (kotlinx.coroutines.channels.SendChannel) this.Camera2StreamConfigurationMap;
                kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                sendChannel = sendChannel2;
                producerScope = producerScope2;
                this.getHighSpeedVideoFpsRangesFor = producerScope;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges = 2;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.channels.SendChannel channel = producerScope.getChannel();
            this.getHighSpeedVideoFpsRangesFor = producerScope;
            this.Camera2StreamConfigurationMap = channel;
            this.getHighSpeedVideoFpsRanges = 1;
            highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(this);
            if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                sendChannel = channel;
                obj = highResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = producerScope;
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges = 2;
            }
            return coroutine_suspended;
        } catch (java.nio.channels.ClosedChannelException | java.io.IOException unused) {
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super io.ktor.network.sockets.Datagram> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.DatagramSocketImpl$receiver$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.network.sockets.DatagramSocketImpl$receiver$1 datagramSocketImpl$receiver$1 = new io.ktor.network.sockets.DatagramSocketImpl$receiver$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        datagramSocketImpl$receiver$1.getHighSpeedVideoFpsRangesFor = obj;
        return datagramSocketImpl$receiver$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatagramSocketImpl$receiver$1(io.ktor.network.sockets.DatagramSocketImpl datagramSocketImpl, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.DatagramSocketImpl$receiver$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = datagramSocketImpl;
    }
}
