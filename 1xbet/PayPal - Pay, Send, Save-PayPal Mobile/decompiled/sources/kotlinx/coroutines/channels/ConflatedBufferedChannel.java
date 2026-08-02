package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0090@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\b2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010 "}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "element", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendBroadcast$kotlinx_coroutines_core", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "shouldSendSuspend$kotlinx_coroutines_core", "()Z", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/BufferOverflow;", "isConflatedDropOldest"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ConflatedBufferedChannel<E> extends kotlinx.coroutines.channels.BufferedChannel<E> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.BufferOverflow getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    public /* synthetic */ ConflatedBufferedChannel(int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, kotlin.jvm.functions.Function1 function1, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bufferOverflow, (i2 & 4) != 0 ? null : function1);
    }

    public ConflatedBufferedChannel(int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        super(i, function1);
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = bufferOverflow;
        if (bufferOverflow == kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("This implementation does not support suspension for senders, use ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.channels.BufferedChannel.class).getSimpleName());
            sb.append(" instead");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i > 0) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Buffered channel capacity must be at least 1, but ");
        sb2.append(i);
        sb2.append(" was specified");
        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
        return this.getHighSpeedVideoFpsRangesFor == kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST;
    }

    private final java.lang.Object getHighSpeedVideoFpsRanges(E p0, boolean p1) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1;
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default;
        java.lang.Object mo9266trySendJP2dKIU = super.mo9266trySendJP2dKIU(p0);
        if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(mo9266trySendJP2dKIU) || kotlinx.coroutines.channels.ChannelResult.m24087isClosedimpl(mo9266trySendJP2dKIU)) {
            return mo9266trySendJP2dKIU;
        }
        if (p1 && (function1 = this.onUndeliveredElement) != null && (callUndeliveredElementCatchingException$default = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, p0, null, 2, null)) != null) {
            throw callUndeliveredElementCatchingException$default;
        }
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object element) {
        java.lang.Object mo9266trySendJP2dKIU = mo9266trySendJP2dKIU(element);
        if (!(mo9266trySendJP2dKIU instanceof kotlinx.coroutines.channels.ChannelResult.Failed)) {
            select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
        } else {
            if (mo9266trySendJP2dKIU instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
                kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(mo9266trySendJP2dKIU);
                select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
                return;
            }
            throw new java.lang.IllegalStateException("unreachable".toString());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default;
        java.lang.Object highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor == kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST ? getHighSpeedVideoFpsRanges((kotlinx.coroutines.channels.ConflatedBufferedChannel<E>) e, true) : m24074trySendDropOldestJP2dKIU(e);
        if (highSpeedVideoFpsRanges instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(highSpeedVideoFpsRanges);
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
            if (function1 != null && (callUndeliveredElementCatchingException$default = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e, null, 2, null)) != null) {
                kotlin.ExceptionsKt.addSuppressed(callUndeliveredElementCatchingException$default, getSendException());
                throw callUndeliveredElementCatchingException$default;
            }
            throw getSendException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public java.lang.Object sendBroadcast$kotlinx_coroutines_core(E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        java.lang.Object highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor == kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST ? getHighSpeedVideoFpsRanges((kotlinx.coroutines.channels.ConflatedBufferedChannel<E>) e, true) : m24074trySendDropOldestJP2dKIU(e);
        if (!(highSpeedVideoFpsRanges instanceof kotlinx.coroutines.channels.ChannelResult.Failed)) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public java.lang.Object mo9266trySendJP2dKIU(E element) {
        return this.getHighSpeedVideoFpsRangesFor == kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST ? getHighSpeedVideoFpsRanges((kotlinx.coroutines.channels.ConflatedBufferedChannel<E>) element, false) : m24074trySendDropOldestJP2dKIU(element);
    }
}
