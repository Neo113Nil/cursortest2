package io.ktor.util;

import android.support.v4.media.session.PlaybackStateCompat;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.io.Source;

/* compiled from: ByteChannels.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", i = {1}, l = {64, 66, 67, 81, 82, 81, 82, 81, 82}, m = "invokeSuspend", n = {"it"}, s = {"L$4"})
/* loaded from: classes7.dex */
final class ByteChannelsKt$copyToBoth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteWriteChannel $first;
    final /* synthetic */ ByteWriteChannel $second;
    final /* synthetic */ ByteReadChannel $this_copyToBoth;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelsKt$copyToBoth$1(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, Continuation<? super ByteChannelsKt$copyToBoth$1> continuation) {
        super(2, continuation);
        this.$this_copyToBoth = byteReadChannel;
        this.$first = byteWriteChannel;
        this.$second = byteWriteChannel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ByteChannelsKt$copyToBoth$1(this.$this_copyToBoth, this.$first, this.$second, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ByteChannelsKt$copyToBoth$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x0070, TryCatch #0 {all -> 0x0070, blocks: (B:30:0x00f7, B:31:0x0076, B:33:0x007e, B:35:0x0086, B:37:0x008e, B:40:0x00a9, B:61:0x00ff, B:62:0x0102, B:63:0x0103, B:68:0x0133, B:75:0x006c, B:29:0x00f5, B:42:0x00b2, B:54:0x00ec, B:58:0x00fd), top: B:2:0x0007, inners: #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133 A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:30:0x00f7, B:31:0x0076, B:33:0x007e, B:35:0x0086, B:37:0x008e, B:40:0x00a9, B:61:0x00ff, B:62:0x0102, B:63:0x0103, B:68:0x0133, B:75:0x006c, B:29:0x00f5, B:42:0x00b2, B:54:0x00ec, B:58:0x00fd), top: B:2:0x0007, inners: #4, #5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ea -> B:28:0x00f5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Source source;
        ByteReadChannel byteReadChannel;
        ByteWriteChannel byteWriteChannel;
        ByteWriteChannel byteWriteChannel2;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        ByteWriteChannel byteWriteChannel3;
        ByteWriteChannel byteWriteChannel4;
        ByteReadChannel byteReadChannel2;
        Source peek;
        Source peek2;
        Throwable closedCause;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (Throwable th) {
            try {
                ByteWriteChannelOperationsKt.close(this.$first, th);
                ByteWriteChannelOperationsKt.close(this.$second, th);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 6;
                if (this.$first.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                this.L$0 = th;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 8;
                if (this.$first.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (this.$this_copyToBoth.isClosedForRead() && (!this.$first.isClosedForWrite() || !this.$second.isClosedForWrite())) {
                    try {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 1;
                        obj = ByteReadChannelOperationsKt.readRemaining(this.$this_copyToBoth, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Source source2 = (Source) autoCloseable2;
                        peek2 = source2.peek();
                        this.L$0 = autoCloseable2;
                        this.L$1 = byteWriteChannel3;
                        this.L$2 = byteWriteChannel4;
                        this.L$3 = byteReadChannel2;
                        this.L$4 = source2;
                        this.label = 2;
                        if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel3, peek2, this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        autoCloseable = autoCloseable2;
                        byteWriteChannel2 = byteWriteChannel3;
                        byteWriteChannel = byteWriteChannel4;
                        byteReadChannel = byteReadChannel2;
                        source = source2;
                        peek = source.peek();
                        this.L$0 = autoCloseable;
                        this.L$1 = byteWriteChannel2;
                        this.L$2 = byteWriteChannel;
                        this.L$3 = byteReadChannel;
                        this.L$4 = null;
                        this.label = 3;
                        if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, peek, this) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        autoCloseable2 = autoCloseable;
                        Unit unit = Unit.INSTANCE;
                        AutoCloseableKt.closeFinally(autoCloseable2, null);
                        if (this.$this_copyToBoth.isClosedForRead()) {
                        }
                        closedCause = this.$this_copyToBoth.getClosedCause();
                        if (closedCause != null) {
                        }
                    } finally {
                    }
                    autoCloseable2 = (AutoCloseable) obj;
                    byteWriteChannel3 = this.$first;
                    byteWriteChannel4 = this.$second;
                    byteReadChannel2 = this.$this_copyToBoth;
                } else {
                    closedCause = this.$this_copyToBoth.getClosedCause();
                    if (closedCause != null) {
                        throw closedCause;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                    if (this.$first.flushAndClose(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.label = 5;
                    if (this.$second.flushAndClose(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                autoCloseable2 = (AutoCloseable) obj;
                byteWriteChannel3 = this.$first;
                byteWriteChannel4 = this.$second;
                byteReadChannel2 = this.$this_copyToBoth;
                Source source22 = (Source) autoCloseable2;
                peek2 = source22.peek();
                this.L$0 = autoCloseable2;
                this.L$1 = byteWriteChannel3;
                this.L$2 = byteWriteChannel4;
                this.L$3 = byteReadChannel2;
                this.L$4 = source22;
                this.label = 2;
                if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel3, peek2, this) != coroutine_suspended) {
                }
                break;
            case 2:
                source = (Source) this.L$4;
                byteReadChannel = (ByteReadChannel) this.L$3;
                byteWriteChannel = (ByteWriteChannel) this.L$2;
                byteWriteChannel2 = (ByteWriteChannel) this.L$1;
                autoCloseable = (AutoCloseable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    ByteReadChannel byteReadChannel3 = byteReadChannel;
                    ByteWriteChannel byteWriteChannel5 = byteWriteChannel;
                    ByteWriteChannel byteWriteChannel6 = byteWriteChannel2;
                    autoCloseable2 = autoCloseable;
                    byteReadChannel3.cancel(th3);
                    ByteWriteChannelOperationsKt.close(byteWriteChannel6, th3);
                    ByteWriteChannelOperationsKt.close(byteWriteChannel5, th3);
                    break;
                }
                peek = source.peek();
                this.L$0 = autoCloseable;
                this.L$1 = byteWriteChannel2;
                this.L$2 = byteWriteChannel;
                this.L$3 = byteReadChannel;
                this.L$4 = null;
                this.label = 3;
                if (ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, peek, this) != coroutine_suspended) {
                }
                break;
            case 3:
                byteReadChannel2 = (ByteReadChannel) this.L$3;
                byteWriteChannel4 = (ByteWriteChannel) this.L$2;
                byteWriteChannel3 = (ByteWriteChannel) this.L$1;
                autoCloseable2 = (AutoCloseable) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th4) {
                    byteReadChannel2.cancel(th4);
                    ByteWriteChannelOperationsKt.close(byteWriteChannel3, th4);
                    ByteWriteChannelOperationsKt.close(byteWriteChannel4, th4);
                }
                Unit unit2 = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(autoCloseable2, null);
                if (this.$this_copyToBoth.isClosedForRead()) {
                }
                closedCause = this.$this_copyToBoth.getClosedCause();
                if (closedCause != null) {
                }
                break;
            case 4:
                ResultKt.throwOnFailure(obj);
                this.label = 5;
                if (this.$second.flushAndClose(this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                this.label = 7;
                if (this.$second.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 8:
                Throwable th5 = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                th = th5;
                this.L$0 = th;
                this.label = 9;
                if (this.$second.flushAndClose(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            case 9:
                Throwable th6 = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                throw th6;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
