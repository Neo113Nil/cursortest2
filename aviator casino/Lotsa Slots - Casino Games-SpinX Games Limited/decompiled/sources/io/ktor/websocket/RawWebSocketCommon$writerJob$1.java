package io.ktor.websocket;

/* compiled from: RawWebSocketCommon.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1, 2}, l = {62, 64, 65, 84, 84, 84, 84}, m = "invokeSuspend", n = {"message", "message"}, s = {"L$0", "L$0"})
/* loaded from: classes6.dex */
final class RawWebSocketCommon$writerJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    int label;
    final /* synthetic */ io.ktor.websocket.RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$writerJob$1(io.ktor.websocket.RawWebSocketCommon rawWebSocketCommon, kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketCommon$writerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.RawWebSocketCommon$writerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.RawWebSocketCommon$writerJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054 A[Catch: all -> 0x0033, ChannelWriteException -> 0x0036, TryCatch #3 {ChannelWriteException -> 0x0036, all -> 0x0033, blocks: (B:27:0x0025, B:28:0x0088, B:30:0x003c, B:33:0x0050, B:35:0x0054, B:39:0x0073, B:42:0x00bb, B:44:0x00bf, B:45:0x00ca, B:46:0x00e0, B:47:0x008c, B:52:0x002b, B:53:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: all -> 0x0033, ChannelWriteException -> 0x0036, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x0036, all -> 0x0033, blocks: (B:27:0x0025, B:28:0x0088, B:30:0x003c, B:33:0x0050, B:35:0x0054, B:39:0x0073, B:42:0x00bb, B:44:0x00bf, B:45:0x00ca, B:46:0x00e0, B:47:0x008c, B:52:0x002b, B:53:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c A[Catch: all -> 0x0033, ChannelWriteException -> 0x0036, TRY_LEAVE, TryCatch #3 {ChannelWriteException -> 0x0036, all -> 0x0033, blocks: (B:27:0x0025, B:28:0x0088, B:30:0x003c, B:33:0x0050, B:35:0x0054, B:39:0x0073, B:42:0x00bb, B:44:0x00bf, B:45:0x00ca, B:46:0x00e0, B:47:0x008c, B:52:0x002b, B:53:0x002f), top: B:2:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0145 -> B:10:0x0145). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0085 -> B:27:0x0088). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bf -> B:29:0x003c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.coroutines.channels.Channel channel4;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        kotlinx.coroutines.channels.Channel channel5;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        kotlinx.coroutines.channels.Channel channel6;
        java.lang.Object m12323getOrNullimpl;
        java.lang.Object obj2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel4;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel5;
        kotlinx.coroutines.channels.Channel channel7;
        kotlinx.coroutines.channels.Channel channel8;
        kotlinx.coroutines.channels.Channel channel9;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (io.ktor.util.cio.ChannelWriteException e) {
            channel3 = this.this$0._outgoing;
            channel3.close(kotlinx.coroutines.ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
            channel4 = this.this$0._outgoing;
            channel4.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
            byteWriteChannel2 = this.this$0.output;
            this.L$0 = null;
            this.label = 5;
            coroutine_suspended = coroutine_suspended;
            if (byteWriteChannel2.flushAndClose(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } catch (java.lang.Throwable th) {
            channel = this.this$0._outgoing;
            channel.close(th);
            channel2 = this.this$0._outgoing;
            channel2.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
            byteWriteChannel = this.this$0.output;
            this.L$0 = null;
            this.label = 6;
            coroutine_suspended = coroutine_suspended;
            if (byteWriteChannel.flushAndClose(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                channel7 = this.this$0._outgoing;
                this.L$0 = null;
                this.label = 1;
                obj = channel7.receive(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (obj instanceof io.ktor.websocket.Frame) {
                    if (!(obj instanceof io.ktor.websocket.RawWebSocketCommon.FlushRequest)) {
                        throw new java.lang.IllegalArgumentException("unknown message " + obj);
                    }
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((io.ktor.websocket.RawWebSocketCommon.FlushRequest) obj).complete());
                    channel7 = this.this$0._outgoing;
                    this.L$0 = null;
                    this.label = 1;
                    obj = channel7.receive(this);
                    if (obj == coroutine_suspended) {
                    }
                    if (obj instanceof io.ktor.websocket.Frame) {
                        byteWriteChannel5 = this.this$0.output;
                        this.L$0 = obj;
                        this.label = 2;
                        if (io.ktor.websocket.RawWebSocketCommonKt.writeFrame(byteWriteChannel5, (io.ktor.websocket.Frame) obj, this.this$0.getMasking(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = obj;
                        byteWriteChannel4 = this.this$0.output;
                        this.L$0 = obj2;
                        this.label = 3;
                        if (byteWriteChannel4.flush(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (obj2 instanceof io.ktor.websocket.Frame.Close) {
                            channel8 = this.this$0._outgoing;
                            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(channel8, null, 1, null);
                            channel9 = this.this$0._outgoing;
                            channel9.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                            byteWriteChannel6 = this.this$0.output;
                            this.L$0 = null;
                            this.label = 4;
                            if (byteWriteChannel6.flushAndClose(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channel6 = this.this$0._outgoing;
                            m12323getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(channel6.mo12311tryReceivePtdJZtk());
                            if (m12323getOrNullimpl == null) {
                                return kotlin.Unit.INSTANCE;
                            }
                            boolean z = m12323getOrNullimpl instanceof io.ktor.websocket.RawWebSocketCommon.FlushRequest;
                            coroutine_suspended = z;
                            if (z != 0) {
                                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((io.ktor.websocket.RawWebSocketCommon.FlushRequest) m12323getOrNullimpl).complete());
                                coroutine_suspended = z;
                            }
                            channel6 = this.this$0._outgoing;
                            m12323getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(channel6.mo12311tryReceivePtdJZtk());
                            if (m12323getOrNullimpl == null) {
                            }
                        }
                        channel7 = this.this$0._outgoing;
                        this.L$0 = null;
                        this.label = 1;
                        obj = channel7.receive(this);
                        if (obj == coroutine_suspended) {
                        }
                        if (obj instanceof io.ktor.websocket.Frame) {
                        }
                    }
                }
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                if (obj instanceof io.ktor.websocket.Frame) {
                }
                break;
            case 2:
                obj2 = this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                byteWriteChannel4 = this.this$0.output;
                this.L$0 = obj2;
                this.label = 3;
                if (byteWriteChannel4.flush(this) == coroutine_suspended) {
                }
                if (obj2 instanceof io.ktor.websocket.Frame.Close) {
                }
                channel7 = this.this$0._outgoing;
                this.L$0 = null;
                this.label = 1;
                obj = channel7.receive(this);
                if (obj == coroutine_suspended) {
                }
                if (obj instanceof io.ktor.websocket.Frame) {
                }
                break;
            case 3:
                obj2 = this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (obj2 instanceof io.ktor.websocket.Frame.Close) {
                    }
                    channel7 = this.this$0._outgoing;
                    this.L$0 = null;
                    this.label = 1;
                    obj = channel7.receive(this);
                    if (obj == coroutine_suspended) {
                    }
                    if (obj instanceof io.ktor.websocket.Frame) {
                    }
                } catch (java.lang.Throwable th2) {
                    channel5 = this.this$0._outgoing;
                    channel5.close(kotlinx.coroutines.ExceptionsKt.CancellationException("WebSocket closed.", null));
                    byteWriteChannel3 = this.this$0.output;
                    this.L$0 = th2;
                    this.label = 7;
                    if (byteWriteChannel3.flushAndClose(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    throw th2;
                }
                break;
            case 4:
            case 5:
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                channel6 = this.this$0._outgoing;
                m12323getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(channel6.mo12311tryReceivePtdJZtk());
                if (m12323getOrNullimpl == null) {
                }
                break;
            case 7:
                java.lang.Throwable th3 = (java.lang.Throwable) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                throw th3;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
