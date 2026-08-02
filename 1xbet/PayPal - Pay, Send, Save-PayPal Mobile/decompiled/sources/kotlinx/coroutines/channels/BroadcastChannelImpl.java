package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002<=B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\f2\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010-R<\u00101\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150.j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0015`/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u00102\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008G¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0019\u0010;\u001a\u0004\u0018\u00018\u00008G¢\u0006\f\u0012\u0004\b:\u00107\u001a\u0004\b9\u00105"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "capacity", "<init>", "(I)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "element", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "", "registerSelectForSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "cancelImpl$kotlinx_coroutines_core", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCapacity", "()I", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/getHighSpeedVideoFpsRanges;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/locks/ReentrantLock;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "Ljava/util/HashMap;", "Camera2StreamConfigurationMap", "isClosedForSend", "()Z", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValueOrNull", "getValueOrNull$annotations", "valueOrNull", "SubscriberBuffered", "SubscriberConflated"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastChannelImpl<E> extends kotlinx.coroutines.channels.BufferedChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private final int capacity;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.locks.ReentrantLock getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.HashMap<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public BroadcastChannelImpl(int i) {
        super(0, null);
        kotlinx.coroutines.internal.Symbol symbol;
        this.capacity = i;
        if (i <= 0 && i != -1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BroadcastChannel capacity must be positive or Channel.CONFLATED, but ");
            sb.append(i);
            sb.append(" was specified");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.locks.ReentrantLock();
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.emptyList();
        symbol = kotlinx.coroutines.channels.BroadcastChannelKt.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = symbol;
        this.Camera2StreamConfigurationMap = new java.util.HashMap<>();
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public final kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.channels.BufferedChannel subscriberConflated = this.capacity == -1 ? new kotlinx.coroutines.channels.BroadcastChannelImpl.SubscriberConflated() : new kotlinx.coroutines.channels.BroadcastChannelImpl.SubscriberBuffered();
            if (isClosedForSend()) {
                java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
                symbol2 = kotlinx.coroutines.channels.BroadcastChannelKt.Camera2StreamConfigurationMap;
                if (obj == symbol2) {
                    subscriberConflated.close(getCloseCause());
                    return subscriberConflated;
                }
            }
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
            symbol = kotlinx.coroutines.channels.BroadcastChannelKt.Camera2StreamConfigurationMap;
            if (obj2 != symbol) {
                subscriberConflated.mo9266trySendJP2dKIU(getValue());
            }
            this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlinx.coroutines.channels.BufferedChannel>) this.getHighSpeedVideoFpsRangesFor, subscriberConflated);
            reentrantLock.unlock();
            return subscriberConflated;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:10:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 broadcastChannelImpl$send$1;
        int i;
        kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl;
        E e2;
        java.util.Iterator it;
        if (continuation instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) {
            broadcastChannelImpl$send$1 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) continuation;
            if ((broadcastChannelImpl$send$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                broadcastChannelImpl$send$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = broadcastChannelImpl$send$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = broadcastChannelImpl$send$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
                    reentrantLock.lock();
                    try {
                        if (isClosedForSend()) {
                            throw getSendException();
                        }
                        if (this.capacity == -1) {
                            this.getHighSpeedVideoFpsRanges = e;
                        }
                        java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.getHighSpeedVideoFpsRangesFor;
                        reentrantLock.unlock();
                        broadcastChannelImpl = this;
                        e2 = e;
                        it = list.iterator();
                        if (it.hasNext()) {
                        }
                    } catch (java.lang.Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) broadcastChannelImpl$send$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object obj2 = broadcastChannelImpl$send$1.getHighSpeedVideoFpsRangesFor;
                    broadcastChannelImpl = (kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl$send$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    E e3 = obj2;
                    if (((java.lang.Boolean) obj).booleanValue() && broadcastChannelImpl.isClosedForSend()) {
                        throw broadcastChannelImpl.getSendException();
                    }
                    e2 = e3;
                    if (it.hasNext()) {
                        kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (kotlinx.coroutines.channels.BufferedChannel) it.next();
                        broadcastChannelImpl$send$1.Camera2StreamConfigurationMap = broadcastChannelImpl;
                        broadcastChannelImpl$send$1.getHighSpeedVideoFpsRangesFor = e2;
                        broadcastChannelImpl$send$1.getHighResolutionOutputSizeshNQ4ISI = it;
                        broadcastChannelImpl$send$1.getHighSpeedVideoSizes = 1;
                        java.lang.Object sendBroadcast$kotlinx_coroutines_core = bufferedChannel.sendBroadcast$kotlinx_coroutines_core(e2, broadcastChannelImpl$send$1);
                        if (sendBroadcast$kotlinx_coroutines_core == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        e3 = e2;
                        obj = sendBroadcast$kotlinx_coroutines_core;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        e2 = e3;
                        if (it.hasNext()) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        broadcastChannelImpl$send$1 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1(this, continuation);
        java.lang.Object obj3 = broadcastChannelImpl$send$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = broadcastChannelImpl$send$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public final java.lang.Object mo9266trySendJP2dKIU(E element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                return super.mo9266trySendJP2dKIU(element);
            }
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.getHighSpeedVideoFpsRangesFor;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((kotlinx.coroutines.channels.BufferedChannel) it.next()).shouldSendSuspend$kotlinx_coroutines_core()) {
                        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24093failurePtdJZtk();
                    }
                }
            }
            if (this.capacity == -1) {
                this.getHighSpeedVideoFpsRanges = element;
            }
            java.util.Iterator<T> it2 = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it2.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it2.next()).mo9266trySendJP2dKIU(element);
            }
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m24094successJP2dKIU(kotlin.Unit.INSTANCE);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected final void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            java.lang.Object remove = this.Camera2StreamConfigurationMap.remove(select);
            if (remove != null) {
                select.selectInRegistrationPhase(remove);
                return;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(select.getGetHighResolutionOutputSizeshNQ4ISI()), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2(this, element, select, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final boolean close(java.lang.Throwable cause) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it.next()).close(cause);
            }
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.getHighSpeedVideoFpsRangesFor;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (java.lang.Object) it2.next();
                if (bufferedChannel.hasElements$kotlinx_coroutines_core()) {
                    arrayList.add(bufferedChannel);
                }
            }
            this.getHighSpeedVideoFpsRangesFor = arrayList;
            return super.close(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it.next()).cancelImpl$kotlinx_coroutines_core(cause);
            }
            symbol = kotlinx.coroutines.channels.BroadcastChannelKt.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = symbol;
            return super.cancelImpl$kotlinx_coroutines_core(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "<init>", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Throwable;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    final class SubscriberBuffered extends kotlinx.coroutines.channels.BufferedChannel<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public SubscriberBuffered() {
            super(kotlinx.coroutines.channels.BroadcastChannelImpl.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable p0) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = ((kotlinx.coroutines.channels.BroadcastChannelImpl) kotlinx.coroutines.channels.BroadcastChannelImpl.this).getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl = kotlinx.coroutines.channels.BroadcastChannelImpl.this;
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                kotlinx.coroutines.channels.BroadcastChannelImpl.access$removeSubscriber(broadcastChannelImpl, this);
                return super.cancelImpl$kotlinx_coroutines_core(p0);
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "<init>", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    final class SubscriberConflated extends kotlinx.coroutines.channels.ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        public final /* synthetic */ boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable th) {
            kotlinx.coroutines.channels.BroadcastChannelImpl.access$removeSubscriber(kotlinx.coroutines.channels.BroadcastChannelImpl.this, this);
            return super.cancelImpl$kotlinx_coroutines_core(th);
        }
    }

    public final E getValue() {
        kotlinx.coroutines.internal.Symbol symbol;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                java.lang.Throwable closeCause = getCloseCause();
                if (closeCause == null) {
                    throw new java.lang.IllegalStateException("This broadcast channel is closed");
                }
                throw closeCause;
            }
            java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
            symbol = kotlinx.coroutines.channels.BroadcastChannelKt.Camera2StreamConfigurationMap;
            if (obj == symbol) {
                throw new java.lang.IllegalStateException("No value".toString());
            }
            return (E) this.getHighSpeedVideoFpsRanges;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final E getValueOrNull() {
        E e;
        kotlinx.coroutines.internal.Symbol symbol;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            if (!isClosedForReceive()) {
                java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
                symbol = kotlinx.coroutines.channels.BroadcastChannelKt.Camera2StreamConfigurationMap;
                if (obj != symbol) {
                    e = (E) this.getHighSpeedVideoFpsRanges;
                    return e;
                }
            }
            e = null;
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public final java.lang.String toString() {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
        symbol = kotlinx.coroutines.channels.BroadcastChannelKt.Camera2StreamConfigurationMap;
        if (obj != symbol) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CONFLATED_ELEMENT=");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append("; ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.getHighSpeedVideoFpsRangesFor, ";", "<", ">", 0, null, null, 56, null));
        return sb.toString();
    }

    public static final /* synthetic */ void access$removeSubscriber(kotlinx.coroutines.channels.BroadcastChannelImpl broadcastChannelImpl, kotlinx.coroutines.channels.ReceiveChannel receiveChannel) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = broadcastChannelImpl.getHighResolutionOutputSizeshNQ4ISI;
        reentrantLock.lock();
        try {
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = broadcastChannelImpl.getHighSpeedVideoFpsRangesFor;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (java.lang.Object) it.next();
                if (bufferedChannel != receiveChannel) {
                    arrayList.add(bufferedChannel);
                }
            }
            broadcastChannelImpl.getHighSpeedVideoFpsRangesFor = arrayList;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
