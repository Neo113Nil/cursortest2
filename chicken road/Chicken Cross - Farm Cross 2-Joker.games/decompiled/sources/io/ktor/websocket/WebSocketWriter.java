package io.ktor.websocket;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperations_jvmKt;
import io.ktor.utils.io.pool.ObjectPool;
import io.ktor.websocket.Frame;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: WebSocketWriter.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lio/ktor/websocket/WebSocketWriter;", "Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "masking", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "pool", "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/CoroutineContext;ZLio/ktor/utils/io/pool/ObjectPool;)V", "buffer", "", "writeLoop", "(Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drainQueueAndDiscard", "()V", "Lio/ktor/websocket/Frame;", "firstMsg", "drainQueueAndSerialize", "(Lio/ktor/websocket/Frame;Ljava/nio/ByteBuffer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "frame", "send", "(Lio/ktor/websocket/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Z", "getMasking", "()Z", "setMasking", "(Z)V", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "Lkotlinx/coroutines/channels/Channel;", "", "queue", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Serializer;", "serializer", "Lio/ktor/websocket/Serializer;", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "outgoing", "Lkotlinx/coroutines/Job;", "writeLoopJob", "Lkotlinx/coroutines/Job;", "FlushRequest", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebSocketWriter implements CoroutineScope {
    private final CoroutineContext coroutineContext;
    private boolean masking;
    private final ObjectPool<ByteBuffer> pool;
    private final Channel<Object> queue;
    private final Serializer serializer;
    private final ByteWriteChannel writeChannel;
    private final Job writeLoopJob;

    public WebSocketWriter(ByteWriteChannel writeChannel, CoroutineContext coroutineContext, boolean z, ObjectPool<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.writeChannel = writeChannel;
        this.coroutineContext = coroutineContext;
        this.masking = z;
        this.pool = pool;
        this.queue = ChannelKt.Channel$default(8, null, null, 6, null);
        this.serializer = new Serializer();
        this.writeLoopJob = BuildersKt.launch(this, new CoroutineName("ws-writer"), CoroutineStart.ATOMIC, new WebSocketWriter$writeLoopJob$1(this, null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final boolean getMasking() {
        return this.masking;
    }

    public final void setMasking(boolean z) {
        this.masking = z;
    }

    public /* synthetic */ WebSocketWriter(ByteWriteChannel byteWriteChannel, CoroutineContext coroutineContext, boolean z, ObjectPool objectPool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteWriteChannel, coroutineContext, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    public final ObjectPool<ByteBuffer> getPool() {
        return this.pool;
    }

    public final SendChannel<Frame> getOutgoing() {
        return this.queue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|73|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[Catch: all -> 0x00e9, ChannelWriteException -> 0x00ec, TryCatch #4 {ChannelWriteException -> 0x00ec, all -> 0x00e9, blocks: (B:21:0x009b, B:33:0x007b, B:35:0x0083, B:37:0x008b, B:40:0x00a7, B:42:0x00ab, B:43:0x00b5, B:44:0x00cd), top: B:20:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:20:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ab -> B:27:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeLoop(ByteBuffer byteBuffer, Continuation<? super Unit> continuation) {
        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$1;
        Object coroutine_suspended;
        ChannelIterator<Object> it;
        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$12;
        ChannelIterator<Object> channelIterator;
        WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$13;
        Object hasNext;
        ByteWriteChannel byteWriteChannel;
        try {
            if (continuation instanceof WebSocketWriter$writeLoop$1) {
                webSocketWriter$writeLoop$1 = (WebSocketWriter$writeLoop$1) continuation;
                if ((webSocketWriter$writeLoop$1.label & Integer.MIN_VALUE) != 0) {
                    webSocketWriter$writeLoop$1.label -= Integer.MIN_VALUE;
                    Object obj = webSocketWriter$writeLoop$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (webSocketWriter$writeLoop$1.label) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            byteBuffer.clear();
                            it = this.queue.iterator();
                            webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                            webSocketWriter$writeLoop$1.L$1 = it;
                            webSocketWriter$writeLoop$1.label = 1;
                            hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            webSocketWriter$writeLoop$12 = webSocketWriter$writeLoop$1;
                            channelIterator = it;
                            obj = hasNext;
                            webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$12;
                            if (((Boolean) obj).booleanValue()) {
                                Object next = channelIterator.next();
                                if (next instanceof Frame) {
                                    try {
                                        webSocketWriter$writeLoop$13.L$0 = byteBuffer;
                                        webSocketWriter$writeLoop$13.L$1 = channelIterator;
                                        webSocketWriter$writeLoop$13.label = 2;
                                        obj = drainQueueAndSerialize((Frame) next, byteBuffer, webSocketWriter$writeLoop$13);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        if (((Boolean) obj).booleanValue()) {
                                        }
                                        it = channelIterator;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                                        webSocketWriter$writeLoop$1.L$1 = it;
                                        webSocketWriter$writeLoop$1.label = 1;
                                        hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                                        if (hasNext != coroutine_suspended) {
                                        }
                                    } catch (ChannelWriteException e) {
                                        e = e;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        this.queue.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                                        this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                                        ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                                        webSocketWriter$writeLoop$1.L$0 = null;
                                        webSocketWriter$writeLoop$1.L$1 = null;
                                        webSocketWriter$writeLoop$1.label = 4;
                                        if (byteWriteChannel2.flushAndClose(webSocketWriter$writeLoop$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        drainQueueAndDiscard();
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        th = th;
                                        webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                        this.queue.close(th);
                                        this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                                        ByteWriteChannel byteWriteChannel3 = this.writeChannel;
                                        webSocketWriter$writeLoop$1.L$0 = null;
                                        webSocketWriter$writeLoop$1.L$1 = null;
                                        webSocketWriter$writeLoop$1.label = 5;
                                        if (byteWriteChannel3.flushAndClose(webSocketWriter$writeLoop$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        drainQueueAndDiscard();
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    if (!(next instanceof FlushRequest)) {
                                        throw new IllegalArgumentException("unknown message " + next);
                                    }
                                    Boxing.boxBoolean(((FlushRequest) next).complete());
                                    it = channelIterator;
                                    webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                                    webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                                    webSocketWriter$writeLoop$1.L$1 = it;
                                    webSocketWriter$writeLoop$1.label = 1;
                                    hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                                    if (hasNext != coroutine_suspended) {
                                    }
                                }
                            }
                            this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                            byteWriteChannel = this.writeChannel;
                            webSocketWriter$writeLoop$13.L$0 = null;
                            webSocketWriter$writeLoop$13.L$1 = null;
                            webSocketWriter$writeLoop$13.label = 3;
                            if (byteWriteChannel.flushAndClose(webSocketWriter$writeLoop$13) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            drainQueueAndDiscard();
                            return Unit.INSTANCE;
                        case 1:
                            ChannelIterator<Object> channelIterator2 = (ChannelIterator) webSocketWriter$writeLoop$1.L$1;
                            ByteBuffer byteBuffer2 = (ByteBuffer) webSocketWriter$writeLoop$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            webSocketWriter$writeLoop$12 = webSocketWriter$writeLoop$1;
                            channelIterator = channelIterator2;
                            byteBuffer = byteBuffer2;
                            webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$12;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                            byteWriteChannel = this.writeChannel;
                            webSocketWriter$writeLoop$13.L$0 = null;
                            webSocketWriter$writeLoop$13.L$1 = null;
                            webSocketWriter$writeLoop$13.label = 3;
                            if (byteWriteChannel.flushAndClose(webSocketWriter$writeLoop$13) == coroutine_suspended) {
                            }
                            drainQueueAndDiscard();
                            return Unit.INSTANCE;
                        case 2:
                            ChannelIterator<Object> channelIterator3 = (ChannelIterator) webSocketWriter$writeLoop$1.L$1;
                            ByteBuffer byteBuffer3 = (ByteBuffer) webSocketWriter$writeLoop$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            WebSocketWriter$writeLoop$1 webSocketWriter$writeLoop$14 = webSocketWriter$writeLoop$1;
                            channelIterator = channelIterator3;
                            byteBuffer = byteBuffer3;
                            webSocketWriter$writeLoop$13 = webSocketWriter$writeLoop$14;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            it = channelIterator;
                            webSocketWriter$writeLoop$1 = webSocketWriter$writeLoop$13;
                            webSocketWriter$writeLoop$1.L$0 = byteBuffer;
                            webSocketWriter$writeLoop$1.L$1 = it;
                            webSocketWriter$writeLoop$1.label = 1;
                            hasNext = it.hasNext(webSocketWriter$writeLoop$1);
                            if (hasNext != coroutine_suspended) {
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                            ResultKt.throwOnFailure(obj);
                            drainQueueAndDiscard();
                            return Unit.INSTANCE;
                        case 6:
                            Throwable th2 = (Throwable) webSocketWriter$writeLoop$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th2;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (webSocketWriter$writeLoop$1.label) {
            }
        } catch (Throwable th3) {
            this.queue.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
            ByteWriteChannel byteWriteChannel4 = this.writeChannel;
            webSocketWriter$writeLoop$1.L$0 = th3;
            webSocketWriter$writeLoop$1.L$1 = null;
            webSocketWriter$writeLoop$1.label = 6;
            if (byteWriteChannel4.flushAndClose(webSocketWriter$writeLoop$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th3;
        }
        webSocketWriter$writeLoop$1 = new WebSocketWriter$writeLoop$1(this, continuation);
        Object obj2 = webSocketWriter$writeLoop$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drainQueueAndDiscard() {
        SendChannel.DefaultImpls.close$default(this.queue, null, 1, null);
        while (true) {
            try {
                Object m9603getOrNullimpl = ChannelResult.m9603getOrNullimpl(this.queue.mo9591tryReceivePtdJZtk());
                if (m9603getOrNullimpl != null) {
                    if (!(m9603getOrNullimpl instanceof Frame.Close) && !(m9603getOrNullimpl instanceof Frame.Ping) && !(m9603getOrNullimpl instanceof Frame.Pong)) {
                        if (!(m9603getOrNullimpl instanceof FlushRequest)) {
                            if (!(m9603getOrNullimpl instanceof Frame.Text) && !(m9603getOrNullimpl instanceof Frame.Binary)) {
                                break;
                            }
                        } else {
                            ((FlushRequest) m9603getOrNullimpl).complete();
                        }
                    }
                } else {
                    return;
                }
            } catch (CancellationException unused) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c5, code lost:
    
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r8.queue, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0161, code lost:
    
        if (r10.hasRemaining() == false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012f -> B:24:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0135 -> B:24:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x013b -> B:24:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x014d -> B:23:0x0150). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object drainQueueAndSerialize(Frame frame, ByteBuffer byteBuffer, Continuation<? super Boolean> continuation) {
        WebSocketWriter$drainQueueAndSerialize$1 webSocketWriter$drainQueueAndSerialize$1;
        int i;
        Ref.ObjectRef objectRef;
        int i2;
        ByteBuffer byteBuffer2;
        Ref.ObjectRef objectRef2;
        int i3;
        ByteWriteChannel byteWriteChannel;
        ?? r9;
        Ref.ObjectRef objectRef3;
        ?? m9603getOrNullimpl;
        int i4;
        int i5;
        FlushRequest flushRequest;
        if (continuation instanceof WebSocketWriter$drainQueueAndSerialize$1) {
            webSocketWriter$drainQueueAndSerialize$1 = (WebSocketWriter$drainQueueAndSerialize$1) continuation;
            if ((webSocketWriter$drainQueueAndSerialize$1.label & Integer.MIN_VALUE) != 0) {
                webSocketWriter$drainQueueAndSerialize$1.label -= Integer.MIN_VALUE;
                Object obj = webSocketWriter$drainQueueAndSerialize$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketWriter$drainQueueAndSerialize$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    objectRef = new Ref.ObjectRef();
                    this.serializer.enqueue(frame);
                    r9 = frame instanceof Frame.Close;
                    while (objectRef.element == null) {
                        if (!(m9603getOrNullimpl instanceof FlushRequest)) {
                        }
                    }
                    if (!this.serializer.getHasOutstandingBytes()) {
                    }
                    this.serializer.setMasking(this.masking);
                    this.serializer.serialize(byteBuffer);
                    byteBuffer.flip();
                    i3 = r9;
                    byteWriteChannel = this.writeChannel;
                    webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer;
                    webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef;
                    webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                    webSocketWriter$drainQueueAndSerialize$1.I$0 = i3;
                    webSocketWriter$drainQueueAndSerialize$1.label = 1;
                    if (ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    int i6 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$1;
                    ByteBuffer byteBuffer3 = (ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    byteBuffer2 = byteBuffer3;
                    objectRef2 = objectRef4;
                    i2 = i6;
                    i4 = i2;
                    if (!this.serializer.getHasOutstandingBytes()) {
                    }
                    objectRef = objectRef2;
                    byteBuffer = byteBuffer2;
                    if (objectRef.element == null) {
                    }
                    i3 = i4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                        objectRef3 = (Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        i5 = i7;
                        flushRequest = (FlushRequest) objectRef3.element;
                        if (flushRequest != null) {
                            Boxing.boxBoolean(flushRequest.complete());
                        }
                        return Boxing.boxBoolean(i5 != 0);
                    }
                    int i8 = webSocketWriter$drainQueueAndSerialize$1.I$0;
                    FlushRequest flushRequest2 = (FlushRequest) webSocketWriter$drainQueueAndSerialize$1.L$2;
                    objectRef2 = (Ref.ObjectRef) webSocketWriter$drainQueueAndSerialize$1.L$1;
                    byteBuffer2 = (ByteBuffer) webSocketWriter$drainQueueAndSerialize$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    int i9 = i8;
                    flushRequest2.complete();
                    objectRef2.element = null;
                    i4 = i9;
                    objectRef = objectRef2;
                    byteBuffer = byteBuffer2;
                    if (objectRef.element == null || i4 != 0) {
                        i3 = i4;
                    }
                    byteBuffer.compact();
                    r9 = i4;
                    while (objectRef.element == null && r9 == 0 && this.serializer.getRemainingCapacity() > 0 && (m9603getOrNullimpl = ChannelResult.m9603getOrNullimpl(this.queue.mo9591tryReceivePtdJZtk())) != 0) {
                        if (!(m9603getOrNullimpl instanceof FlushRequest)) {
                            objectRef.element = m9603getOrNullimpl;
                        } else if (m9603getOrNullimpl instanceof Frame.Close) {
                            this.serializer.enqueue((Frame) m9603getOrNullimpl);
                            r9 = 1;
                        } else {
                            if (!(m9603getOrNullimpl instanceof Frame)) {
                                throw new IllegalArgumentException("unknown message " + m9603getOrNullimpl);
                            }
                            this.serializer.enqueue((Frame) m9603getOrNullimpl);
                        }
                    }
                    if (!this.serializer.getHasOutstandingBytes() || byteBuffer.position() != 0) {
                        this.serializer.setMasking(this.masking);
                        this.serializer.serialize(byteBuffer);
                        byteBuffer.flip();
                        i3 = r9;
                        byteWriteChannel = this.writeChannel;
                        webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer;
                        webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef;
                        webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                        webSocketWriter$drainQueueAndSerialize$1.I$0 = i3;
                        webSocketWriter$drainQueueAndSerialize$1.label = 1;
                        if (ByteWriteChannelOperations_jvmKt.writeFully(byteWriteChannel, byteBuffer, webSocketWriter$drainQueueAndSerialize$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteBuffer2 = byteBuffer;
                        objectRef2 = objectRef;
                        i2 = i3;
                        i4 = i2;
                        if (!this.serializer.getHasOutstandingBytes()) {
                            i4 = i2;
                            if (!byteBuffer2.hasRemaining()) {
                                flushRequest2 = (FlushRequest) objectRef2.element;
                                i4 = i2;
                                if (flushRequest2 != null) {
                                    ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                                    webSocketWriter$drainQueueAndSerialize$1.L$0 = byteBuffer2;
                                    webSocketWriter$drainQueueAndSerialize$1.L$1 = objectRef2;
                                    webSocketWriter$drainQueueAndSerialize$1.L$2 = flushRequest2;
                                    webSocketWriter$drainQueueAndSerialize$1.I$0 = i2;
                                    webSocketWriter$drainQueueAndSerialize$1.label = 2;
                                    i9 = i2;
                                    if (byteWriteChannel2.flush(webSocketWriter$drainQueueAndSerialize$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    flushRequest2.complete();
                                    objectRef2.element = null;
                                    i4 = i9;
                                }
                            }
                        }
                        objectRef = objectRef2;
                        byteBuffer = byteBuffer2;
                        if (objectRef.element == null) {
                        }
                        i3 = i4;
                    } else {
                        ByteWriteChannel byteWriteChannel3 = this.writeChannel;
                        webSocketWriter$drainQueueAndSerialize$1.L$0 = objectRef;
                        webSocketWriter$drainQueueAndSerialize$1.L$1 = null;
                        webSocketWriter$drainQueueAndSerialize$1.L$2 = null;
                        webSocketWriter$drainQueueAndSerialize$1.I$0 = r9;
                        webSocketWriter$drainQueueAndSerialize$1.label = 3;
                        if (byteWriteChannel3.flush(webSocketWriter$drainQueueAndSerialize$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef3 = objectRef;
                        i5 = r9;
                        flushRequest = (FlushRequest) objectRef3.element;
                        if (flushRequest != null) {
                        }
                        return Boxing.boxBoolean(i5 != 0);
                    }
                }
            }
        }
        webSocketWriter$drainQueueAndSerialize$1 = new WebSocketWriter$drainQueueAndSerialize$1(this, continuation);
        Object obj2 = webSocketWriter$drainQueueAndSerialize$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketWriter$drainQueueAndSerialize$1.label;
        if (i != 0) {
        }
    }

    public final Object send(Frame frame, Continuation<? super Unit> continuation) {
        Object send = this.queue.send(frame, continuation);
        return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.WebSocketWriter$FlushRequest] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flush(Continuation<? super Unit> continuation) {
        WebSocketWriter$flush$1 webSocketWriter$flush$1;
        Object coroutine_suspended;
        ?? r2;
        FlushRequest flushRequest;
        FlushRequest flushRequest2;
        Job job;
        try {
            if (continuation instanceof WebSocketWriter$flush$1) {
                webSocketWriter$flush$1 = (WebSocketWriter$flush$1) continuation;
                if ((webSocketWriter$flush$1.label & Integer.MIN_VALUE) != 0) {
                    webSocketWriter$flush$1.label -= Integer.MIN_VALUE;
                    Object obj = webSocketWriter$flush$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = webSocketWriter$flush$1.label;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        flushRequest = new FlushRequest((Job) getCoroutineContext().get(Job.INSTANCE));
                        try {
                            Channel<Object> channel = this.queue;
                            webSocketWriter$flush$1.L$0 = flushRequest;
                            webSocketWriter$flush$1.L$1 = flushRequest;
                            webSocketWriter$flush$1.label = 1;
                            if (channel.send(flushRequest, webSocketWriter$flush$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (ClosedSendChannelException unused) {
                            flushRequest2 = flushRequest;
                            flushRequest.complete();
                            job = this.writeLoopJob;
                            webSocketWriter$flush$1.L$0 = flushRequest2;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 2;
                            if (job.join(webSocketWriter$flush$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flushRequest = flushRequest2;
                            flushRequest2 = flushRequest;
                            webSocketWriter$flush$1.L$0 = null;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 3;
                            if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (r2 == 1) {
                            flushRequest = (FlushRequest) webSocketWriter$flush$1.L$1;
                            flushRequest2 = (FlushRequest) webSocketWriter$flush$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (ClosedSendChannelException unused2) {
                                flushRequest.complete();
                                job = this.writeLoopJob;
                                webSocketWriter$flush$1.L$0 = flushRequest2;
                                webSocketWriter$flush$1.L$1 = null;
                                webSocketWriter$flush$1.label = 2;
                                if (job.join(webSocketWriter$flush$1) != coroutine_suspended) {
                                }
                            }
                            webSocketWriter$flush$1.L$0 = null;
                            webSocketWriter$flush$1.L$1 = null;
                            webSocketWriter$flush$1.label = 3;
                            if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        flushRequest = (FlushRequest) webSocketWriter$flush$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    flushRequest2 = flushRequest;
                    webSocketWriter$flush$1.L$0 = null;
                    webSocketWriter$flush$1.L$1 = null;
                    webSocketWriter$flush$1.label = 3;
                    if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
            if (r2 != 0) {
            }
            flushRequest2 = flushRequest;
            webSocketWriter$flush$1.L$0 = null;
            webSocketWriter$flush$1.L$1 = null;
            webSocketWriter$flush$1.label = 3;
            if (flushRequest2.await(webSocketWriter$flush$1) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            r2.complete();
            throw th;
        }
        webSocketWriter$flush$1 = new WebSocketWriter$flush$1(this, continuation);
        Object obj2 = webSocketWriter$flush$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = webSocketWriter$flush$1.label;
    }

    /* compiled from: WebSocketWriter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/WebSocketWriter$FlushRequest;", "", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "", CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, "()Z", "", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CompletableJob;", "done", "Lkotlinx/coroutines/CompletableJob;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class FlushRequest {
        private final CompletableJob done;

        public FlushRequest(Job job) {
            this.done = JobKt.Job(job);
        }

        public final boolean complete() {
            return this.done.complete();
        }

        public final Object await(Continuation<? super Unit> continuation) {
            Object join = this.done.join(continuation);
            return join == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : Unit.INSTANCE;
        }
    }
}
