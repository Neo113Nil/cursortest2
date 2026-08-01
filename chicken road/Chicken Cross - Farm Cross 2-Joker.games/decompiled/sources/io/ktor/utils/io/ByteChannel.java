package io.ktor.utils.io;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ByteChannel.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JH\u0010!\u001a\u00020\u000b\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u001a2\u001a\b\u0004\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d\u0012\u0004\u0012\u00028\u00000\u001c2\u000e\b\u0004\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH\u0082H¢\u0006\u0004\b!\u0010\"J\u001c\u0010$\u001a\u00020\u000b\"\n\b\u0000\u0010#\u0018\u0001*\u00020\u001aH\u0082\b¢\u0006\u0004\b$\u0010\rJ\u0019\u0010%\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b%\u0010\u0016J4\u0010'\u001a\u00020\u000b\"\n\b\u0000\u0010\u001b\u0018\u0001*\u00020\u001a2\u0006\u0010&\u001a\u00028\u00002\u000e\b\u0004\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH\u0082\b¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\u000601j\u0002`28\u0002X\u0082\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\rR\u0014\u00106\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u0014\u00107\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u001a\u0010<\u001a\u0002088VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\r\u001a\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020=8VX\u0097\u0004¢\u0006\f\u0012\u0004\b@\u0010\r\u001a\u0004\b>\u0010?R\u0016\u0010D\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010+R\u0014\u0010F\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010+¨\u0006H"}, d2 = {"Lio/ktor/utils/io/ByteChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/utils/io/BufferedByteWriteChannel;", "", "autoFlush", "<init>", "(Z)V", "", "min", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "moveFlushToReadBuffer", "()V", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flushWriteBuffer", "close", "flushAndClose", "", "cause", "cancel", "(Ljava/lang/Throwable;)V", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "TaskType", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "createTask", "Lkotlin/Function0;", "shouldSleep", "sleepWhile", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Expected", "resumeSlot", "closeSlot", "slot", "trySuspend", "(Lio/ktor/utils/io/ByteChannel$Slot$Task;Lkotlin/jvm/functions/Function0;)V", "Z", "getAutoFlush", "()Z", "Lkotlinx/io/Buffer;", "flushBuffer", "Lkotlinx/io/Buffer;", "flushBufferSize", "I", "", "Lio/ktor/utils/io/locks/SynchronizedObject;", "flushBufferMutex", "Ljava/lang/Object;", "getFlushBufferMutex$annotations", "_readBuffer", "_writeBuffer", "Lkotlinx/io/Source;", "getReadBuffer", "()Lkotlinx/io/Source;", "getReadBuffer$annotations", "readBuffer", "Lkotlinx/io/Sink;", "getWriteBuffer", "()Lkotlinx/io/Sink;", "getWriteBuffer$annotations", "writeBuffer", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForWrite", "isClosedForRead", "Slot", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteChannel implements ByteReadChannel, BufferedByteWriteChannel {
    volatile /* synthetic */ Object _closedCause;
    private final Buffer _readBuffer;
    private final Buffer _writeBuffer;
    private final boolean autoFlush;
    private final Buffer flushBuffer;
    private final Object flushBufferMutex;
    private volatile int flushBufferSize;
    volatile /* synthetic */ Object suspensionSlot;
    static final /* synthetic */ AtomicReferenceFieldUpdater suspensionSlot$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "suspensionSlot");
    static final /* synthetic */ AtomicReferenceFieldUpdater _closedCause$FU = AtomicReferenceFieldUpdater.newUpdater(ByteChannel.class, Object.class, "_closedCause");

    public ByteChannel() {
        this(false, 1, null);
    }

    private static /* synthetic */ void getFlushBufferMutex$annotations() {
    }

    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    public static /* synthetic */ void getWriteBuffer$annotations() {
    }

    public ByteChannel(boolean z) {
        this.autoFlush = z;
        this.flushBuffer = new Buffer();
        this.flushBufferMutex = new Object();
        this.suspensionSlot = Slot.Empty.INSTANCE;
        this._readBuffer = new Buffer();
        this._writeBuffer = new Buffer();
        this._closedCause = null;
    }

    public /* synthetic */ ByteChannel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Source getReadBuffer() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            closeToken.throwOrNull(ByteChannel$readBuffer$1.INSTANCE);
        }
        if (this._readBuffer.exhausted()) {
            moveFlushToReadBuffer();
        }
        return this._readBuffer;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Sink getWriteBuffer() {
        CloseToken closeToken;
        if (isClosedForWrite() && ((closeToken = (CloseToken) this._closedCause) == null || closeToken.throwOrNull(ByteChannel$writeBuffer$1.INSTANCE) == null)) {
            throw new ClosedWriteChannelException(null, 1, null);
        }
        return this._writeBuffer;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = (CloseToken) this._closedCause;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public boolean isClosedForWrite() {
        return this._closedCause != null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return getClosedCause() != null || (isClosedForWrite() && this.flushBufferSize == 0 && this._readBuffer.exhausted());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitContent(int i, Continuation<? super Boolean> continuation) {
        ByteChannel$awaitContent$1 byteChannel$awaitContent$1;
        Object coroutine_suspended;
        int i2;
        ByteChannel byteChannel;
        long j;
        Object result;
        if (continuation instanceof ByteChannel$awaitContent$1) {
            byteChannel$awaitContent$1 = (ByteChannel$awaitContent$1) continuation;
            if ((byteChannel$awaitContent$1.label & Integer.MIN_VALUE) != 0) {
                byteChannel$awaitContent$1.label -= Integer.MIN_VALUE;
                Object obj = byteChannel$awaitContent$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = byteChannel$awaitContent$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
                    if (this._readBuffer.getSizeMut() >= i) {
                        return Boxing.boxBoolean(true);
                    }
                    byteChannel = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = byteChannel$awaitContent$1.I$0;
                    byteChannel = (ByteChannel) byteChannel$awaitContent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                do {
                    j = i;
                    if (this.flushBufferSize + this._readBuffer.getSizeMut() < j || this._closedCause != null) {
                        if (this._readBuffer.getSizeMut() < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                            moveFlushToReadBuffer();
                        }
                        return Boxing.boxBoolean(this._readBuffer.getSizeMut() >= j);
                    }
                    byteChannel$awaitContent$1.L$0 = byteChannel;
                    byteChannel$awaitContent$1.I$0 = i;
                    byteChannel$awaitContent$1.label = 1;
                    ByteChannel$awaitContent$1 byteChannel$awaitContent$12 = byteChannel$awaitContent$1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(byteChannel$awaitContent$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    Slot.Read read = new Slot.Read(cancellableContinuationImpl);
                    Slot slot = (Slot) byteChannel.suspensionSlot;
                    boolean z = slot instanceof Slot.Closed;
                    if (!z && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot, read)) {
                        read.resume();
                    } else {
                        if (slot instanceof Slot.Read) {
                            Slot.Task task = (Slot.Task) slot;
                            task.resume(new ConcurrentIOException(read.taskName(), task.getCreated()));
                        } else if (slot instanceof Slot.Task) {
                            ((Slot.Task) slot).resume();
                        } else if (z) {
                            read.resume(((Slot.Closed) slot).getCause());
                        } else if (!Intrinsics.areEqual(slot, Slot.Empty.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.flushBufferSize + this._readBuffer.getSizeMut() >= j || this._closedCause != null) {
                            Slot slot2 = (Slot) byteChannel.suspensionSlot;
                            if ((slot2 instanceof Slot.Read) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot2, Slot.Empty.INSTANCE)) {
                                ((Slot.Task) slot2).resume();
                            }
                        }
                    }
                    result = cancellableContinuationImpl.getResult();
                    if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(byteChannel$awaitContent$12);
                    }
                } while (result != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        byteChannel$awaitContent$1 = new ByteChannel$awaitContent$1(this, continuation);
        Object obj2 = byteChannel$awaitContent$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = byteChannel$awaitContent$1.label;
        if (i2 != 0) {
        }
        do {
            j = i;
            if (this.flushBufferSize + this._readBuffer.getSizeMut() < j) {
            }
            if (this._readBuffer.getSizeMut() < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            }
            return Boxing.boxBoolean(this._readBuffer.getSizeMut() >= j);
        } while (result != coroutine_suspended);
        return coroutine_suspended;
    }

    private final void moveFlushToReadBuffer() {
        synchronized (this.flushBufferMutex) {
            this.flushBuffer.transferTo(this._readBuffer);
            this.flushBufferSize = 0;
            Unit unit = Unit.INSTANCE;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if ((slot instanceof Slot.Write) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot, Slot.Empty.INSTANCE)) {
            ((Slot.Task) slot).resume();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:11:0x0049->B:28:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flush(Continuation<? super Unit> continuation) {
        ByteChannel$flush$1 byteChannel$flush$1;
        Object coroutine_suspended;
        int i;
        ByteChannel byteChannel;
        Slot slot;
        boolean z;
        Slot slot2;
        Object result;
        if (continuation instanceof ByteChannel$flush$1) {
            byteChannel$flush$1 = (ByteChannel$flush$1) continuation;
            if ((byteChannel$flush$1.label & Integer.MIN_VALUE) != 0) {
                byteChannel$flush$1.label -= Integer.MIN_VALUE;
                Object obj = byteChannel$flush$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannel$flush$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(this);
                    flushWriteBuffer();
                    if (this.flushBufferSize < 1048576) {
                        return Unit.INSTANCE;
                    }
                    byteChannel = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byteChannel = (ByteChannel) byteChannel$flush$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (this.flushBufferSize >= 1048576 && this._closedCause == null) {
                    byteChannel$flush$1.L$0 = byteChannel;
                    byteChannel$flush$1.label = 1;
                    ByteChannel$flush$1 byteChannel$flush$12 = byteChannel$flush$1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(byteChannel$flush$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    Slot.Write write = new Slot.Write(cancellableContinuationImpl);
                    slot = (Slot) byteChannel.suspensionSlot;
                    z = slot instanceof Slot.Closed;
                    if (z && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot, write)) {
                        write.resume();
                    } else {
                        if (!(slot instanceof Slot.Write)) {
                            Slot.Task task = (Slot.Task) slot;
                            task.resume(new ConcurrentIOException(write.taskName(), task.getCreated()));
                        } else if (slot instanceof Slot.Task) {
                            ((Slot.Task) slot).resume();
                        } else if (z) {
                            write.resume(((Slot.Closed) slot).getCause());
                        } else if (!Intrinsics.areEqual(slot, Slot.Empty.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.flushBufferSize >= 1048576 || this._closedCause != null) {
                            slot2 = (Slot) byteChannel.suspensionSlot;
                            if ((slot2 instanceof Slot.Write) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, byteChannel, slot2, Slot.Empty.INSTANCE)) {
                                ((Slot.Task) slot2).resume();
                            }
                        }
                    }
                    result = cancellableContinuationImpl.getResult();
                    if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(byteChannel$flush$12);
                    }
                    if (result != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        byteChannel$flush$1 = new ByteChannel$flush$1(this, continuation);
        Object obj2 = byteChannel$flush$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannel$flush$1.label;
        if (i != 0) {
        }
        while (this.flushBufferSize >= 1048576) {
            byteChannel$flush$1.L$0 = byteChannel;
            byteChannel$flush$1.label = 1;
            ByteChannel$flush$1 byteChannel$flush$122 = byteChannel$flush$1;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(byteChannel$flush$122), 1);
            cancellableContinuationImpl2.initCancellability();
            Slot.Write write2 = new Slot.Write(cancellableContinuationImpl2);
            slot = (Slot) byteChannel.suspensionSlot;
            z = slot instanceof Slot.Closed;
            if (z) {
            }
            if (!(slot instanceof Slot.Write)) {
            }
            if (this.flushBufferSize >= 1048576) {
            }
            slot2 = (Slot) byteChannel.suspensionSlot;
            if (slot2 instanceof Slot.Write) {
                ((Slot.Task) slot2).resume();
            }
            result = cancellableContinuationImpl2.getResult();
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (result != coroutine_suspended) {
            }
        }
        return Unit.INSTANCE;
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    public void flushWriteBuffer() {
        if (this._writeBuffer.exhausted()) {
            return;
        }
        synchronized (this.flushBufferMutex) {
            int sizeMut = (int) this._writeBuffer.getSizeMut();
            this.flushBuffer.transferFrom(this._writeBuffer);
            this.flushBufferSize += sizeMut;
            Unit unit = Unit.INSTANCE;
        }
        Slot slot = (Slot) this.suspensionSlot;
        if ((slot instanceof Slot.Read) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot, Slot.Empty.INSTANCE)) {
            ((Slot.Task) slot).resume();
        }
    }

    @Override // io.ktor.utils.io.BufferedByteWriteChannel
    public void close() {
        flushWriteBuffer();
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, CloseTokenKt.getCLOSED())) {
            closeSlot(null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(2:14|15)(2:17|18)))|28|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        kotlin.Result.m8079constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object flushAndClose(Continuation<? super Unit> continuation) {
        ByteChannel$flushAndClose$1 byteChannel$flushAndClose$1;
        int i;
        if (continuation instanceof ByteChannel$flushAndClose$1) {
            byteChannel$flushAndClose$1 = (ByteChannel$flushAndClose$1) continuation;
            if ((byteChannel$flushAndClose$1.label & Integer.MIN_VALUE) != 0) {
                byteChannel$flushAndClose$1.label -= Integer.MIN_VALUE;
                Object obj = byteChannel$flushAndClose$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannel$flushAndClose$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    ByteChannel byteChannel = this;
                    byteChannel$flushAndClose$1.label = 1;
                    if (flush(byteChannel$flushAndClose$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m8079constructorimpl(Unit.INSTANCE);
                if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, CloseTokenKt.getCLOSED())) {
                    return Unit.INSTANCE;
                }
                closeSlot(null);
                return Unit.INSTANCE;
            }
        }
        byteChannel$flushAndClose$1 = new ByteChannel$flushAndClose$1(this, continuation);
        Object obj2 = byteChannel$flushAndClose$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannel$flushAndClose$1.label;
        if (i != 0) {
        }
        Result.m8079constructorimpl(Unit.INSTANCE);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, CloseTokenKt.getCLOSED())) {
        }
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        if (this._closedCause != null) {
            return;
        }
        CloseToken closeToken = new CloseToken(cause);
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_closedCause$FU, this, null, closeToken);
        closeSlot(CloseToken.wrapCause$default(closeToken, null, 1, null));
    }

    public String toString() {
        return "ByteChannel[" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }

    private final /* synthetic */ <TaskType extends Slot.Task> Object sleepWhile(Function1<? super Continuation<? super Unit>, ? extends TaskType> function1, Function0<Boolean> function0, Continuation<? super Unit> continuation) {
        while (function0.invoke().booleanValue()) {
            InlineMarker.mark(0);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            TaskType invoke = function1.invoke(cancellableContinuationImpl);
            Slot slot = (Slot) this.suspensionSlot;
            boolean z = slot instanceof Slot.Closed;
            if (!z && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot, invoke)) {
                invoke.resume();
                Unit unit = Unit.INSTANCE;
            } else {
                Intrinsics.reifiedOperationMarker(3, "TaskType");
                boolean z2 = slot instanceof Slot.Task;
                if (z2) {
                    Slot.Task task = (Slot.Task) slot;
                    task.resume(new ConcurrentIOException(invoke.taskName(), task.getCreated()));
                } else if (z2) {
                    ((Slot.Task) slot).resume();
                } else if (z) {
                    invoke.resume(((Slot.Closed) slot).getCause());
                    Unit unit2 = Unit.INSTANCE;
                } else if (!Intrinsics.areEqual(slot, Slot.Empty.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!function0.invoke().booleanValue()) {
                    Slot slot2 = (Slot) this.suspensionSlot;
                    Intrinsics.reifiedOperationMarker(3, "TaskType");
                    if ((slot2 instanceof Slot.Task) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot2, Slot.Empty.INSTANCE)) {
                        ((Slot.Task) slot2).resume();
                    }
                }
            }
            Unit unit3 = Unit.INSTANCE;
            if (cancellableContinuationImpl.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            InlineMarker.mark(1);
        }
        return Unit.INSTANCE;
    }

    private final /* synthetic */ <Expected extends Slot.Task> void resumeSlot() {
        Slot slot = (Slot) this.suspensionSlot;
        Intrinsics.reifiedOperationMarker(3, "Expected");
        if ((slot instanceof Slot.Task) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot, Slot.Empty.INSTANCE)) {
            ((Slot.Task) slot).resume();
        }
    }

    private final void closeSlot(Throwable cause) {
        Slot slot = (Slot) suspensionSlot$FU.getAndSet(this, cause != null ? new Slot.Closed(cause) : Slot.INSTANCE.getCLOSED());
        if (slot instanceof Slot.Task) {
            ((Slot.Task) slot).resume(cause);
        }
    }

    private final /* synthetic */ <TaskType extends Slot.Task> void trySuspend(TaskType slot, Function0<Boolean> shouldSleep) {
        Slot slot2 = (Slot) this.suspensionSlot;
        boolean z = slot2 instanceof Slot.Closed;
        if (!z && !AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot2, slot)) {
            slot.resume();
            return;
        }
        Intrinsics.reifiedOperationMarker(3, "TaskType");
        boolean z2 = slot2 instanceof Slot.Task;
        if (z2) {
            Slot.Task task = (Slot.Task) slot2;
            task.resume(new ConcurrentIOException(slot.taskName(), task.getCreated()));
        } else if (z2) {
            ((Slot.Task) slot2).resume();
        } else if (z) {
            slot.resume(((Slot.Closed) slot2).getCause());
            return;
        } else if (!Intrinsics.areEqual(slot2, Slot.Empty.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        if (shouldSleep.invoke().booleanValue()) {
            return;
        }
        Slot slot3 = (Slot) this.suspensionSlot;
        Intrinsics.reifiedOperationMarker(3, "TaskType");
        if ((slot3 instanceof Slot.Task) && AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(suspensionSlot$FU, this, slot3, Slot.Empty.INSTANCE)) {
            ((Slot.Task) slot3).resume();
        }
    }

    /* compiled from: ByteChannel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot;", "", k.M, "Empty", "Closed", "Task", "Read", "Write", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface Slot {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        static Closed getCLOSED() {
            return INSTANCE.getCLOSED();
        }

        /* renamed from: getRESUME-d1pmJ48, reason: not valid java name */
        static Object m8042getRESUMEd1pmJ48() {
            return INSTANCE.m8044getRESUMEd1pmJ48();
        }

        /* compiled from: ByteChannel.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "CLOSED", "Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED", "()Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "getCLOSED$annotations", "Lkotlin/Result;", "", "RESUME", "Ljava/lang/Object;", "getRESUME-d1pmJ48", "()Ljava/lang/Object;", "getRESUME-d1pmJ48$annotations", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final Closed CLOSED = new Closed(null);
            private static final Object RESUME;

            @JvmStatic
            public static /* synthetic */ void getCLOSED$annotations() {
            }

            @JvmStatic
            /* renamed from: getRESUME-d1pmJ48$annotations, reason: not valid java name */
            public static /* synthetic */ void m8043getRESUMEd1pmJ48$annotations() {
            }

            private Companion() {
            }

            public final Closed getCLOSED() {
                return CLOSED;
            }

            static {
                Result.Companion companion = Result.INSTANCE;
                RESUME = Result.m8079constructorimpl(Unit.INSTANCE);
            }

            /* renamed from: getRESUME-d1pmJ48, reason: not valid java name */
            public final Object m8044getRESUMEd1pmJ48() {
                return RESUME;
            }
        }

        /* compiled from: ByteChannel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Empty;", "Lio/ktor/utils/io/ByteChannel$Slot;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Empty implements Slot {
            public static final Empty INSTANCE = new Empty();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Empty)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -231472095;
            }

            public String toString() {
                return "Empty";
            }

            private Empty() {
            }
        }

        /* compiled from: ByteChannel.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lio/ktor/utils/io/ByteChannel$Slot$Closed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Closed implements Slot {
            private final Throwable cause;

            public static /* synthetic */ Closed copy$default(Closed closed, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = closed.cause;
                }
                return closed.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            public final Closed copy(Throwable cause) {
                return new Closed(cause);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Closed) && Intrinsics.areEqual(this.cause, ((Closed) other).cause);
            }

            public int hashCode() {
                Throwable th = this.cause;
                if (th == null) {
                    return 0;
                }
                return th.hashCode();
            }

            public String toString() {
                return "Closed(cause=" + this.cause + ')';
            }

            public Closed(Throwable th) {
                this.cause = th;
            }

            public final Throwable getCause() {
                return this.cause;
            }
        }

        /* compiled from: ByteChannel.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0006\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lio/ktor/utils/io/ByteChannel$Slot;", "", "taskName", "()Ljava/lang/String;", "", CampaignEx.JSON_NATIVE_VIDEO_RESUME, "()V", "", "throwable", "(Ljava/lang/Throwable;)V", "getCreated", "()Ljava/lang/Throwable;", "created", "Lkotlin/coroutines/Continuation;", "getContinuation", "()Lkotlin/coroutines/Continuation;", "continuation", "Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Write;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface Task extends Slot {
            Continuation<Unit> getContinuation();

            Throwable getCreated();

            void resume();

            void resume(Throwable throwable);

            String taskName();

            /* compiled from: ByteChannel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class DefaultImpls {
                public static void resume(Task task) {
                    task.getContinuation().resumeWith(Slot.INSTANCE.m8044getRESUMEd1pmJ48());
                }

                public static /* synthetic */ void resume$default(Task task, Throwable th, int i, Object obj) {
                    if (obj != null) {
                        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resume");
                    }
                    if ((i & 1) != 0) {
                        th = null;
                    }
                    task.resume(th);
                }

                public static void resume(Task task, Throwable th) {
                    Object m8044getRESUMEd1pmJ48;
                    Continuation<Unit> continuation = task.getContinuation();
                    if (th != null) {
                        Result.Companion companion = Result.INSTANCE;
                        m8044getRESUMEd1pmJ48 = Result.m8079constructorimpl(ResultKt.createFailure(th));
                    } else {
                        m8044getRESUMEd1pmJ48 = Slot.INSTANCE.m8044getRESUMEd1pmJ48();
                    }
                    continuation.resumeWith(m8044getRESUMEd1pmJ48);
                }
            }
        }

        /* compiled from: ByteChannel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Read;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lkotlin/coroutines/Continuation;", "", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "taskName", "()Ljava/lang/String;", "Lkotlin/coroutines/Continuation;", "getContinuation", "()Lkotlin/coroutines/Continuation;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Read implements Task {
            private final Continuation<Unit> continuation;
            private Throwable created;

            /* JADX WARN: Multi-variable type inference failed */
            public Read(Continuation<? super Unit> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.continuation = continuation;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    StringBuilder sb = new StringBuilder("ReadTask 0x");
                    String num = Integer.toString(getContinuation().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    Throwable th = new Throwable(sb.append(num).toString());
                    kotlin.ExceptionsKt.stackTraceToString(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Continuation<Unit> getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Throwable getCreated() {
                return this.created;
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public String taskName() {
                return "read";
            }
        }

        /* compiled from: ByteChannel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/ByteChannel$Slot$Write;", "Lio/ktor/utils/io/ByteChannel$Slot$Task;", "Lkotlin/coroutines/Continuation;", "", "continuation", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "taskName", "()Ljava/lang/String;", "Lkotlin/coroutines/Continuation;", "getContinuation", "()Lkotlin/coroutines/Continuation;", "", "created", "Ljava/lang/Throwable;", "getCreated", "()Ljava/lang/Throwable;", "setCreated", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Write implements Task {
            private final Continuation<Unit> continuation;
            private Throwable created;

            /* JADX WARN: Multi-variable type inference failed */
            public Write(Continuation<? super Unit> continuation) {
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.continuation = continuation;
                if (ByteChannel_jvmKt.getDEVELOPMENT_MODE()) {
                    StringBuilder sb = new StringBuilder("WriteTask 0x");
                    String num = Integer.toString(getContinuation().hashCode(), CharsKt.checkRadix(16));
                    Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
                    Throwable th = new Throwable(sb.append(num).toString());
                    kotlin.ExceptionsKt.stackTraceToString(th);
                    setCreated(th);
                }
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Continuation<Unit> getContinuation() {
                return this.continuation;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume() {
                Task.DefaultImpls.resume(this);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public void resume(Throwable th) {
                Task.DefaultImpls.resume(this, th);
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public Throwable getCreated() {
                return this.created;
            }

            public void setCreated(Throwable th) {
                this.created = th;
            }

            @Override // io.ktor.utils.io.ByteChannel.Slot.Task
            public String taskName() {
                return "write";
            }
        }
    }
}
