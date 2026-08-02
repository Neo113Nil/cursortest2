package io.ktor.network.selector;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u000fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010$\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u001a\u0010'\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager;", "Lio/ktor/network/selector/SelectorManagerSupport;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Ljava/nio/channels/Selector;", "p0", "", "getHighSpeedVideoSizes", "(Ljava/nio/channels/Selector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Camera2StreamConfigurationMap", "()V", "Lio/ktor/network/selector/Selectable;", "selectable", "notifyClosed", "(Lio/ktor/network/selector/Selectable;)V", "publishInterest", "Lio/ktor/network/selector/LockFreeMPSCQueue;", "getHighSpeedVideoFpsRanges", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "selectorRef", "Ljava/nio/channels/Selector;", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "", "inSelect", "Z", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "getHighResolutionOutputSizeshNQ4ISI", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Lio/ktor/network/selector/LockFreeMPSCQueue;", "getHighSpeedVideoFpsRangesFor", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "ContinuationHolder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActorSelectorManager extends io.ktor.network.selector.SelectorManagerSupport implements java.io.Closeable, kotlinx.coroutines.CoroutineScope {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.network.selector.ActorSelectorManager.ContinuationHolder<kotlin.Unit, kotlin.coroutines.Continuation<kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI;
    private volatile boolean closed;
    private final kotlin.coroutines.CoroutineContext coroutineContext;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;
    private volatile boolean inSelect;
    private volatile java.nio.channels.Selector selectorRef;

    public ActorSelectorManager(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();
        this.getHighResolutionOutputSizeshNQ4ISI = new io.ktor.network.selector.ActorSelectorManager.ContinuationHolder<>();
        this.getHighSpeedVideoFpsRangesFor = new io.ktor.network.selector.LockFreeMPSCQueue<>();
        this.coroutineContext = coroutineContext.plus(new kotlinx.coroutines.CoroutineName("selector"));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this, null, null, new io.ktor.network.selector.ActorSelectorManager.AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (r11 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ef, code lost:
    
        if (r11 != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007f, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
    
        if (kotlinx.coroutines.YieldKt.yield(r0) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[LOOP:1: B:18:0x0063->B:20:0x006b, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:15:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a3 -> B:15:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b1 -> B:15:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$process(io.ktor.network.selector.ActorSelectorManager actorSelectorManager, io.ktor.network.selector.LockFreeMPSCQueue lockFreeMPSCQueue, java.nio.channels.Selector selector, kotlin.coroutines.Continuation continuation) {
        io.ktor.network.selector.ActorSelectorManager$process$1 actorSelectorManager$process$1;
        int i;
        io.ktor.network.selector.LockFreeMPSCQueue lockFreeMPSCQueue2;
        java.nio.channels.Selector selector2;
        if (continuation instanceof io.ktor.network.selector.ActorSelectorManager$process$1) {
            actorSelectorManager$process$1 = (io.ktor.network.selector.ActorSelectorManager$process$1) continuation;
            if ((actorSelectorManager$process$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$process$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = actorSelectorManager$process$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actorSelectorManager$process$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    if (i == 1) {
                        selector2 = (java.nio.channels.Selector) actorSelectorManager$process$1.getHighSpeedVideoFpsRangesFor;
                        lockFreeMPSCQueue2 = (io.ktor.network.selector.LockFreeMPSCQueue) actorSelectorManager$process$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Number) obj).intValue() > 0) {
                            java.util.Set<java.nio.channels.SelectionKey> selectedKeys = selector2.selectedKeys();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(selectedKeys, "");
                            java.util.Set<java.nio.channels.SelectionKey> keys = selector2.keys();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
                            actorSelectorManager.handleSelectedKeys(selectedKeys, keys);
                        } else {
                            io.ktor.network.selector.Selectable selectable = (io.ktor.network.selector.Selectable) lockFreeMPSCQueue2.removeFirstOrNull();
                            if (selectable != null) {
                                actorSelectorManager.applyInterest(selector2, selectable);
                            } else {
                                actorSelectorManager$process$1.Camera2StreamConfigurationMap = lockFreeMPSCQueue2;
                                actorSelectorManager$process$1.getHighSpeedVideoFpsRangesFor = selector2;
                                actorSelectorManager$process$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                            }
                        }
                        while (!actorSelectorManager.closed) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        selector2 = (java.nio.channels.Selector) actorSelectorManager$process$1.getHighSpeedVideoFpsRangesFor;
                        lockFreeMPSCQueue2 = (io.ktor.network.selector.LockFreeMPSCQueue) actorSelectorManager$process$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.network.selector.Selectable selectable2 = (io.ktor.network.selector.Selectable) obj;
                        if (selectable2 != null) {
                            actorSelectorManager.applyInterest(selector2, selectable2);
                            while (!actorSelectorManager.closed) {
                                while (true) {
                                    io.ktor.network.selector.Selectable selectable3 = (io.ktor.network.selector.Selectable) lockFreeMPSCQueue2.removeFirstOrNull();
                                    if (selectable3 == null) {
                                        break;
                                    }
                                    actorSelectorManager.applyInterest(selector2, selectable3);
                                }
                                if (actorSelectorManager.getPending() > 0) {
                                    actorSelectorManager$process$1.Camera2StreamConfigurationMap = lockFreeMPSCQueue2;
                                    actorSelectorManager$process$1.getHighSpeedVideoFpsRangesFor = selector2;
                                    actorSelectorManager$process$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                    obj = actorSelectorManager.getHighSpeedVideoSizes(selector2, actorSelectorManager$process$1);
                                } else if (actorSelectorManager.getCancelled() > 0) {
                                    selector2.selectNow();
                                    if (actorSelectorManager.getPending() > 0) {
                                        java.util.Set<java.nio.channels.SelectionKey> selectedKeys2 = selector2.selectedKeys();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(selectedKeys2, "");
                                        java.util.Set<java.nio.channels.SelectionKey> keys2 = selector2.keys();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys2, "");
                                        actorSelectorManager.handleSelectedKeys(selectedKeys2, keys2);
                                    } else {
                                        actorSelectorManager.setCancelled(0);
                                    }
                                } else {
                                    actorSelectorManager$process$1.Camera2StreamConfigurationMap = lockFreeMPSCQueue2;
                                    actorSelectorManager$process$1.getHighSpeedVideoFpsRangesFor = selector2;
                                    actorSelectorManager$process$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                                    obj = (io.ktor.network.selector.Selectable) lockFreeMPSCQueue2.removeFirstOrNull();
                                    if (obj == null) {
                                        obj = actorSelectorManager.getHighSpeedVideoFpsRanges(lockFreeMPSCQueue2, actorSelectorManager$process$1);
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    selector = (java.nio.channels.Selector) actorSelectorManager$process$1.getHighSpeedVideoFpsRangesFor;
                    lockFreeMPSCQueue = (io.ktor.network.selector.LockFreeMPSCQueue) actorSelectorManager$process$1.Camera2StreamConfigurationMap;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.nio.channels.Selector selector3 = selector;
                lockFreeMPSCQueue2 = lockFreeMPSCQueue;
                selector2 = selector3;
                while (!actorSelectorManager.closed) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        actorSelectorManager$process$1 = new io.ktor.network.selector.ActorSelectorManager$process$1(actorSelectorManager, continuation);
        java.lang.Object obj2 = actorSelectorManager$process$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actorSelectorManager$process$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj2);
        java.nio.channels.Selector selector32 = selector;
        lockFreeMPSCQueue2 = lockFreeMPSCQueue;
        selector2 = selector32;
        while (!actorSelectorManager.closed) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"currentSelector"}, s = {"L$2"})
    /* renamed from: io.ktor.network.selector.ActorSelectorManager$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a2 A[Catch: all -> 0x00c3, LOOP:0: B:11:0x008e->B:13:0x00a2, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x00c3, blocks: (B:8:0x005c, B:9:0x0066, B:10:0x0089, B:11:0x008e, B:15:0x009a, B:13:0x00a2, B:23:0x007e, B:26:0x00b0, B:27:0x00c2, B:33:0x0042, B:22:0x006e), top: B:2:0x0008, inners: #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.nio.channels.spi.AbstractSelector abstractSelector;
            io.ktor.network.selector.ActorSelectorManager actorSelectorManager;
            java.nio.channels.spi.AbstractSelector abstractSelector2;
            java.lang.Throwable th;
            io.ktor.network.selector.Selectable selectable;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.nio.channels.spi.AbstractSelector openSelector = io.ktor.network.selector.ActorSelectorManager.this.getProvider().openSelector();
                    if (openSelector != null) {
                        io.ktor.network.selector.ActorSelectorManager.this.selectorRef = openSelector;
                        abstractSelector = openSelector;
                        actorSelectorManager = io.ktor.network.selector.ActorSelectorManager.this;
                        java.nio.channels.spi.AbstractSelector abstractSelector3 = abstractSelector;
                        try {
                            this.Camera2StreamConfigurationMap = abstractSelector;
                            this.getHighSpeedVideoSizes = actorSelectorManager;
                            this.getHighSpeedVideoFpsRanges = abstractSelector3;
                            this.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (io.ktor.network.selector.ActorSelectorManager.access$process(actorSelectorManager, actorSelectorManager.getHighSpeedVideoFpsRangesFor, abstractSelector3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            abstractSelector2 = abstractSelector3;
                        } catch (java.lang.Throwable th2) {
                            abstractSelector2 = abstractSelector3;
                            th = th2;
                            actorSelectorManager.closed = true;
                            actorSelectorManager.getHighSpeedVideoFpsRangesFor.close();
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, th);
                            actorSelectorManager.closed = true;
                            actorSelectorManager.getHighSpeedVideoFpsRangesFor.close();
                            actorSelectorManager.selectorRef = null;
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, (java.lang.Throwable) null);
                            while (true) {
                                selectable = (io.ktor.network.selector.Selectable) actorSelectorManager.getHighSpeedVideoFpsRangesFor.removeFirstOrNull();
                                if (selectable != null) {
                                }
                                actorSelectorManager.cancelAllSuspensions(selectable, new kotlinx.coroutines.channels.ClosedSendChannelException("Failed to apply interest: selector closed"));
                            }
                        }
                    } else {
                        throw new java.lang.IllegalStateException("openSelector() = null".toString());
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractSelector2 = (java.nio.channels.spi.AbstractSelector) this.getHighSpeedVideoFpsRanges;
                    actorSelectorManager = (io.ktor.network.selector.ActorSelectorManager) this.getHighSpeedVideoSizes;
                    abstractSelector = (java.io.Closeable) this.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            actorSelectorManager.closed = true;
                            actorSelectorManager.getHighSpeedVideoFpsRangesFor.close();
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, th);
                            actorSelectorManager.closed = true;
                            actorSelectorManager.getHighSpeedVideoFpsRangesFor.close();
                            actorSelectorManager.selectorRef = null;
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, (java.lang.Throwable) null);
                            while (true) {
                                selectable = (io.ktor.network.selector.Selectable) actorSelectorManager.getHighSpeedVideoFpsRangesFor.removeFirstOrNull();
                                if (selectable != null) {
                                }
                                actorSelectorManager.cancelAllSuspensions(selectable, new kotlinx.coroutines.channels.ClosedSendChannelException("Failed to apply interest: selector closed"));
                            }
                        } catch (java.lang.Throwable th4) {
                            actorSelectorManager.closed = true;
                            actorSelectorManager.getHighSpeedVideoFpsRangesFor.close();
                            actorSelectorManager.selectorRef = null;
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, (java.lang.Throwable) null);
                            throw th4;
                        }
                    }
                }
                actorSelectorManager.closed = true;
                actorSelectorManager.getHighSpeedVideoFpsRangesFor.close();
                actorSelectorManager.selectorRef = null;
                actorSelectorManager.cancelAllSuspensions(abstractSelector2, (java.lang.Throwable) null);
                while (true) {
                    selectable = (io.ktor.network.selector.Selectable) actorSelectorManager.getHighSpeedVideoFpsRangesFor.removeFirstOrNull();
                    if (selectable != null) {
                        actorSelectorManager.cancelAllSuspensions(selectable, new kotlinx.coroutines.channels.ClosedSendChannelException("Failed to apply interest: selector closed"));
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(abstractSelector, null);
                        return kotlin.Unit.INSTANCE;
                    }
                }
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((io.ktor.network.selector.ActorSelectorManager.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return io.ktor.network.selector.ActorSelectorManager.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super io.ktor.network.selector.ActorSelectorManager.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.nio.channels.Selector selector, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        io.ktor.network.selector.ActorSelectorManager$select$1 actorSelectorManager$select$1;
        int i;
        int selectNow;
        if (continuation instanceof io.ktor.network.selector.ActorSelectorManager$select$1) {
            actorSelectorManager$select$1 = (io.ktor.network.selector.ActorSelectorManager$select$1) continuation;
            if ((actorSelectorManager$select$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$select$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = actorSelectorManager$select$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actorSelectorManager$select$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.inSelect = true;
                    actorSelectorManager$select$1.Camera2StreamConfigurationMap = selector;
                    actorSelectorManager$select$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.YieldKt.yield(actorSelectorManager$select$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    selector = (java.nio.channels.Selector) actorSelectorManager$select$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (this.getHighSpeedVideoFpsRanges.get() != 0) {
                    selectNow = selector.select(500L);
                    this.inSelect = false;
                } else {
                    this.inSelect = false;
                    this.getHighSpeedVideoFpsRanges.set(0L);
                    selectNow = selector.selectNow();
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(selectNow);
            }
        }
        actorSelectorManager$select$1 = new io.ktor.network.selector.ActorSelectorManager$select$1(this, continuation);
        java.lang.Object obj2 = actorSelectorManager$select$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actorSelectorManager$select$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (this.getHighSpeedVideoFpsRanges.get() != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(selectNow);
    }

    private final void Camera2StreamConfigurationMap() {
        java.nio.channels.Selector selector;
        if (this.getHighSpeedVideoFpsRanges.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    @Override // io.ktor.network.selector.SelectorManager
    public final void notifyClosed(io.ktor.network.selector.Selectable selectable) {
        java.nio.channels.SelectionKey keyFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "");
        cancelAllSuspensions(selectable, new java.nio.channels.ClosedChannelException());
        java.nio.channels.Selector selector = this.selectorRef;
        if (selector == null || (keyFor = selectable.getChannel().keyFor(selector)) == null) {
            return;
        }
        keyFor.cancel();
        Camera2StreamConfigurationMap();
    }

    @Override // io.ktor.network.selector.SelectorManagerSupport
    protected final void publishInterest(io.ktor.network.selector.Selectable selectable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "");
        try {
            if (this.getHighSpeedVideoFpsRangesFor.addLast(selectable)) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(kotlin.Unit.INSTANCE);
                Camera2StreamConfigurationMap();
            } else {
                if (selectable.getChannel().isOpen()) {
                    throw new java.nio.channels.ClosedSelectorException();
                }
                throw new java.nio.channels.ClosedChannelException();
            }
        } catch (java.lang.Throwable th) {
            cancelAllSuspensions(selectable, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(io.ktor.network.selector.LockFreeMPSCQueue<io.ktor.network.selector.Selectable> lockFreeMPSCQueue, kotlin.coroutines.Continuation<? super io.ktor.network.selector.Selectable> continuation) {
        io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1 actorSelectorManager$receiveOrNullSuspend$1;
        java.lang.Object coroutine_suspended;
        int i;
        io.ktor.network.selector.Selectable removeFirstOrNull;
        java.lang.Object obj;
        if (continuation instanceof io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1) {
            actorSelectorManager$receiveOrNullSuspend$1 = (io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1) continuation;
            if ((actorSelectorManager$receiveOrNullSuspend$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$receiveOrNullSuspend$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = actorSelectorManager$receiveOrNullSuspend$1.getHighSpeedVideoFpsRangesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actorSelectorManager$receiveOrNullSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lockFreeMPSCQueue = (io.ktor.network.selector.LockFreeMPSCQueue) actorSelectorManager$receiveOrNullSuspend$1.Camera2StreamConfigurationMap;
                }
                kotlin.ResultKt.throwOnFailure(obj2);
                do {
                    removeFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
                    if (removeFirstOrNull == null) {
                        return removeFirstOrNull;
                    }
                    obj = null;
                    if (this.closed) {
                        return null;
                    }
                    actorSelectorManager$receiveOrNullSuspend$1.Camera2StreamConfigurationMap = lockFreeMPSCQueue;
                    actorSelectorManager$receiveOrNullSuspend$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1 actorSelectorManager$receiveOrNullSuspend$12 = actorSelectorManager$receiveOrNullSuspend$1;
                    io.ktor.network.selector.ActorSelectorManager.ContinuationHolder<kotlin.Unit, kotlin.coroutines.Continuation<kotlin.Unit>> continuationHolder = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (lockFreeMPSCQueue.isEmpty() && !this.closed) {
                        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(((io.ktor.network.selector.ActorSelectorManager.ContinuationHolder) continuationHolder).getHighSpeedVideoFpsRanges, null, actorSelectorManager$receiveOrNullSuspend$12)) {
                            if ((lockFreeMPSCQueue.isEmpty() && !this.closed) || !androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(((io.ktor.network.selector.ActorSelectorManager.ContinuationHolder) continuationHolder).getHighSpeedVideoFpsRanges, actorSelectorManager$receiveOrNullSuspend$12, null)) {
                                obj = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            }
                        } else {
                            throw new java.lang.IllegalStateException("Continuation is already set");
                        }
                    }
                    if (obj == null) {
                        obj = kotlin.Unit.INSTANCE;
                    }
                    if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(actorSelectorManager$receiveOrNullSuspend$12);
                    }
                } while (obj != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        actorSelectorManager$receiveOrNullSuspend$1 = new io.ktor.network.selector.ActorSelectorManager$receiveOrNullSuspend$1(this, continuation);
        java.lang.Object obj22 = actorSelectorManager$receiveOrNullSuspend$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actorSelectorManager$receiveOrNullSuspend$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.ResultKt.throwOnFailure(obj22);
        do {
            removeFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
            if (removeFirstOrNull == null) {
            }
        } while (obj != coroutine_suspended);
        return coroutine_suspended;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
        this.getHighSpeedVideoFpsRangesFor.close();
        if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(kotlin.Unit.INSTANCE)) {
            return;
        }
        Camera2StreamConfigurationMap();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/coroutines/Continuation;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "", "<init>", "()V", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Object;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ContinuationHolder<R, C extends kotlin.coroutines.Continuation<? super R>> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.concurrent.atomic.AtomicReference<C> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(null);

        public final boolean getHighSpeedVideoFpsRanges(R p0) {
            C andSet = this.getHighSpeedVideoFpsRanges.getAndSet(null);
            if (andSet == null) {
                return false;
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            andSet.resumeWith(kotlin.Result.m23436constructorimpl(p0));
            return true;
        }
    }

    public static final /* synthetic */ java.lang.Object access$receiveOrNull(io.ktor.network.selector.ActorSelectorManager actorSelectorManager, io.ktor.network.selector.LockFreeMPSCQueue lockFreeMPSCQueue, kotlin.coroutines.Continuation continuation) {
        io.ktor.network.selector.Selectable selectable = (io.ktor.network.selector.Selectable) lockFreeMPSCQueue.removeFirstOrNull();
        return selectable == null ? actorSelectorManager.getHighSpeedVideoFpsRanges(lockFreeMPSCQueue, continuation) : selectable;
    }
}
