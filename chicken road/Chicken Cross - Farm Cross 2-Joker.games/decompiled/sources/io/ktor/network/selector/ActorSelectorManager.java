package io.ktor.network.selector;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Closeable;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* compiled from: ActorSelectorManager.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0082H¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u001c\u0010\u001d\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R&\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager;", "Lio/ktor/network/selector/SelectorManagerSupport;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lio/ktor/network/selector/LockFreeMPSCQueue;", "Lio/ktor/network/selector/Selectable;", "mb", "Ljava/nio/channels/Selector;", "selector", "", "process", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Ljava/nio/channels/Selector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "select", "(Ljava/nio/channels/Selector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchIfNeeded", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectWakeup", "()V", "processInterests", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Ljava/nio/channels/Selector;)V", "selectable", "notifyClosed", "(Lio/ktor/network/selector/Selectable;)V", "publishInterest", "receiveOrNull", "(Lio/ktor/network/selector/LockFreeMPSCQueue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveOrNullSuspend", "close", "selectorRef", "Ljava/nio/channels/Selector;", "Ljava/util/concurrent/atomic/AtomicLong;", "wakeup", "Ljava/util/concurrent/atomic/AtomicLong;", "", "inSelect", "Z", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "Lkotlin/coroutines/Continuation;", "continuation", "Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "closed", "selectionQueue", "Lio/ktor/network/selector/LockFreeMPSCQueue;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "ContinuationHolder", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActorSelectorManager extends SelectorManagerSupport implements Closeable, CoroutineScope {
    private volatile boolean closed;
    private final ContinuationHolder<Unit, Continuation<Unit>> continuation;
    private final CoroutineContext coroutineContext;
    private volatile boolean inSelect;
    private final LockFreeMPSCQueue<Selectable> selectionQueue;
    private volatile Selector selectorRef;
    private final AtomicLong wakeup;

    public ActorSelectorManager(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.wakeup = new AtomicLong();
        this.continuation = new ContinuationHolder<>();
        this.selectionQueue = new LockFreeMPSCQueue<>();
        this.coroutineContext = context.plus(new CoroutineName("selector"));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* compiled from: ActorSelectorManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"currentSelector"}, s = {"L$2"})
    /* renamed from: io.ktor.network.selector.ActorSelectorManager$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ActorSelectorManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00a7 A[Catch: all -> 0x00c8, LOOP:0: B:10:0x0093->B:12:0x00a7, LOOP_END, TRY_ENTER, TryCatch #1 {all -> 0x00c8, blocks: (B:8:0x005c, B:9:0x006b, B:10:0x0093, B:14:0x009f, B:12:0x00a7, B:22:0x0083, B:25:0x00b5, B:26:0x00c7, B:32:0x0042, B:21:0x0073), top: B:2:0x0008, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x009f A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AbstractSelector abstractSelector;
            ActorSelectorManager actorSelectorManager;
            AbstractSelector abstractSelector2;
            Throwable th;
            AbstractSelector abstractSelector3;
            Selectable selectable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractSelector openSelector = ActorSelectorManager.this.getProvider().openSelector();
                    if (openSelector != null) {
                        ActorSelectorManager.this.selectorRef = openSelector;
                        abstractSelector = openSelector;
                        actorSelectorManager = ActorSelectorManager.this;
                        AbstractSelector abstractSelector4 = abstractSelector;
                        try {
                            this.L$0 = abstractSelector;
                            this.L$1 = actorSelectorManager;
                            this.L$2 = abstractSelector4;
                            this.label = 1;
                            if (actorSelectorManager.process(actorSelectorManager.selectionQueue, abstractSelector4, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            abstractSelector2 = abstractSelector4;
                        } catch (Throwable th2) {
                            abstractSelector2 = abstractSelector4;
                            th = th2;
                            actorSelectorManager.closed = true;
                            actorSelectorManager.selectionQueue.close();
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, th);
                            actorSelectorManager.closed = true;
                            actorSelectorManager.selectionQueue.close();
                            actorSelectorManager.selectorRef = null;
                            abstractSelector3 = abstractSelector2;
                            actorSelectorManager.cancelAllSuspensions(abstractSelector3, (Throwable) null);
                            while (true) {
                                selectable = (Selectable) actorSelectorManager.selectionQueue.removeFirstOrNull();
                                if (selectable != null) {
                                }
                                actorSelectorManager.cancelAllSuspensions(selectable, new ClosedSendChannelException("Failed to apply interest: selector closed"));
                            }
                        }
                    } else {
                        throw new IllegalStateException("openSelector() = null".toString());
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractSelector2 = (AbstractSelector) this.L$2;
                    actorSelectorManager = (ActorSelectorManager) this.L$1;
                    abstractSelector = (Closeable) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            actorSelectorManager.closed = true;
                            actorSelectorManager.selectionQueue.close();
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, th);
                            actorSelectorManager.closed = true;
                            actorSelectorManager.selectionQueue.close();
                            actorSelectorManager.selectorRef = null;
                            abstractSelector3 = abstractSelector2;
                            actorSelectorManager.cancelAllSuspensions(abstractSelector3, (Throwable) null);
                            while (true) {
                                selectable = (Selectable) actorSelectorManager.selectionQueue.removeFirstOrNull();
                                if (selectable != null) {
                                }
                                actorSelectorManager.cancelAllSuspensions(selectable, new ClosedSendChannelException("Failed to apply interest: selector closed"));
                            }
                        } catch (Throwable th4) {
                            actorSelectorManager.closed = true;
                            actorSelectorManager.selectionQueue.close();
                            actorSelectorManager.selectorRef = null;
                            actorSelectorManager.cancelAllSuspensions(abstractSelector2, (Throwable) null);
                            throw th4;
                        }
                    }
                }
                actorSelectorManager.closed = true;
                actorSelectorManager.selectionQueue.close();
                actorSelectorManager.selectorRef = null;
                abstractSelector3 = abstractSelector2;
                actorSelectorManager.cancelAllSuspensions(abstractSelector3, (Throwable) null);
                while (true) {
                    selectable = (Selectable) actorSelectorManager.selectionQueue.removeFirstOrNull();
                    if (selectable != null) {
                        actorSelectorManager.cancelAllSuspensions(selectable, new ClosedSendChannelException("Failed to apply interest: selector closed"));
                    } else {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(abstractSelector, null);
                        return Unit.INSTANCE;
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008b -> B:15:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a5 -> B:15:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b3 -> B:15:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e6 -> B:12:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object process(LockFreeMPSCQueue<Selectable> lockFreeMPSCQueue, Selector selector, Continuation<? super Unit> continuation) {
        ActorSelectorManager$process$1 actorSelectorManager$process$1;
        int i;
        Selectable selectable;
        if (continuation instanceof ActorSelectorManager$process$1) {
            actorSelectorManager$process$1 = (ActorSelectorManager$process$1) continuation;
            if ((actorSelectorManager$process$1.label & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$process$1.label -= Integer.MIN_VALUE;
                Object obj = actorSelectorManager$process$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actorSelectorManager$process$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 1) {
                    Selector selector2 = (Selector) actorSelectorManager$process$1.L$1;
                    LockFreeMPSCQueue<Selectable> lockFreeMPSCQueue2 = (LockFreeMPSCQueue) actorSelectorManager$process$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    selector = selector2;
                    lockFreeMPSCQueue = lockFreeMPSCQueue2;
                    if (((Number) obj).intValue() > 0) {
                        Set<SelectionKey> selectedKeys = selector.selectedKeys();
                        Intrinsics.checkNotNullExpressionValue(selectedKeys, "selectedKeys(...)");
                        Set<SelectionKey> keys = selector.keys();
                        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                        handleSelectedKeys(selectedKeys, keys);
                    } else {
                        Selectable removeFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
                        if (removeFirstOrNull != null) {
                            applyInterest(selector, removeFirstOrNull);
                        } else {
                            actorSelectorManager$process$1.L$0 = lockFreeMPSCQueue;
                            actorSelectorManager$process$1.L$1 = selector;
                            actorSelectorManager$process$1.label = 2;
                            if (YieldKt.yield(actorSelectorManager$process$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Selector selector3 = (Selector) actorSelectorManager$process$1.L$1;
                        LockFreeMPSCQueue<Selectable> lockFreeMPSCQueue3 = (LockFreeMPSCQueue) actorSelectorManager$process$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        selector = selector3;
                        lockFreeMPSCQueue = lockFreeMPSCQueue3;
                        selectable = (Selectable) obj;
                        if (selectable != null) {
                            applyInterest(selector, selectable);
                        }
                        return Unit.INSTANCE;
                    }
                    Selector selector4 = (Selector) actorSelectorManager$process$1.L$1;
                    LockFreeMPSCQueue<Selectable> lockFreeMPSCQueue4 = (LockFreeMPSCQueue) actorSelectorManager$process$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    selector = selector4;
                    lockFreeMPSCQueue = lockFreeMPSCQueue4;
                }
                while (!this.closed) {
                    processInterests(lockFreeMPSCQueue, selector);
                    if (getPending() > 0) {
                        actorSelectorManager$process$1.L$0 = lockFreeMPSCQueue;
                        actorSelectorManager$process$1.L$1 = selector;
                        actorSelectorManager$process$1.label = 1;
                        obj = select(selector, actorSelectorManager$process$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Number) obj).intValue() > 0) {
                        }
                        while (!this.closed) {
                        }
                    } else if (getCancelled() > 0) {
                        selector.selectNow();
                        if (getPending() > 0) {
                            Set<SelectionKey> selectedKeys2 = selector.selectedKeys();
                            Intrinsics.checkNotNullExpressionValue(selectedKeys2, "selectedKeys(...)");
                            Set<SelectionKey> keys2 = selector.keys();
                            Intrinsics.checkNotNullExpressionValue(keys2, "keys(...)");
                            handleSelectedKeys(selectedKeys2, keys2);
                        } else {
                            setCancelled(0);
                        }
                    } else {
                        actorSelectorManager$process$1.L$0 = lockFreeMPSCQueue;
                        actorSelectorManager$process$1.L$1 = selector;
                        actorSelectorManager$process$1.label = 3;
                        obj = receiveOrNull(lockFreeMPSCQueue, actorSelectorManager$process$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        selectable = (Selectable) obj;
                        if (selectable != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        actorSelectorManager$process$1 = new ActorSelectorManager$process$1(this, continuation);
        Object obj2 = actorSelectorManager$process$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actorSelectorManager$process$1.label;
        if (i != 0) {
        }
        while (!this.closed) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object select(Selector selector, Continuation<? super Integer> continuation) {
        ActorSelectorManager$select$1 actorSelectorManager$select$1;
        int i;
        int selectNow;
        if (continuation instanceof ActorSelectorManager$select$1) {
            actorSelectorManager$select$1 = (ActorSelectorManager$select$1) continuation;
            if ((actorSelectorManager$select$1.label & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$select$1.label -= Integer.MIN_VALUE;
                Object obj = actorSelectorManager$select$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actorSelectorManager$select$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.inSelect = true;
                    actorSelectorManager$select$1.L$0 = selector;
                    actorSelectorManager$select$1.label = 1;
                    if (YieldKt.yield(actorSelectorManager$select$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    selector = (Selector) actorSelectorManager$select$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (this.wakeup.get() != 0) {
                    selectNow = selector.select(500L);
                    this.inSelect = false;
                } else {
                    this.inSelect = false;
                    this.wakeup.set(0L);
                    selectNow = selector.selectNow();
                }
                return Boxing.boxInt(selectNow);
            }
        }
        actorSelectorManager$select$1 = new ActorSelectorManager$select$1(this, continuation);
        Object obj2 = actorSelectorManager$select$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actorSelectorManager$select$1.label;
        if (i != 0) {
        }
        if (this.wakeup.get() != 0) {
        }
        return Boxing.boxInt(selectNow);
    }

    private final Object dispatchIfNeeded(Continuation<? super Unit> continuation) {
        InlineMarker.mark(0);
        YieldKt.yield(continuation);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }

    private final void selectWakeup() {
        Selector selector;
        if (this.wakeup.incrementAndGet() == 1 && this.inSelect && (selector = this.selectorRef) != null) {
            selector.wakeup();
        }
    }

    private final void processInterests(LockFreeMPSCQueue<Selectable> mb, Selector selector) {
        while (true) {
            Selectable removeFirstOrNull = mb.removeFirstOrNull();
            if (removeFirstOrNull == null) {
                return;
            } else {
                applyInterest(selector, removeFirstOrNull);
            }
        }
    }

    @Override // io.ktor.network.selector.SelectorManager
    public void notifyClosed(Selectable selectable) {
        SelectionKey keyFor;
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        cancelAllSuspensions(selectable, new ClosedChannelException());
        Selector selector = this.selectorRef;
        if (selector == null || (keyFor = selectable.getChannel().keyFor(selector)) == null) {
            return;
        }
        keyFor.cancel();
        selectWakeup();
    }

    @Override // io.ktor.network.selector.SelectorManagerSupport
    protected void publishInterest(Selectable selectable) {
        Intrinsics.checkNotNullParameter(selectable, "selectable");
        try {
            if (this.selectionQueue.addLast(selectable)) {
                this.continuation.resume(Unit.INSTANCE);
                selectWakeup();
            } else {
                if (selectable.getChannel().isOpen()) {
                    throw new ClosedSelectorException();
                }
                throw new ClosedChannelException();
            }
        } catch (Throwable th) {
            cancelAllSuspensions(selectable, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOrNull(LockFreeMPSCQueue<Selectable> lockFreeMPSCQueue, Continuation<? super Selectable> continuation) {
        Selectable removeFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
        return removeFirstOrNull == null ? receiveOrNullSuspend(lockFreeMPSCQueue, continuation) : removeFirstOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object receiveOrNullSuspend(LockFreeMPSCQueue<Selectable> lockFreeMPSCQueue, Continuation<? super Selectable> continuation) {
        ActorSelectorManager$receiveOrNullSuspend$1 actorSelectorManager$receiveOrNullSuspend$1;
        Object coroutine_suspended;
        int i;
        Selectable removeFirstOrNull;
        Object obj;
        if (continuation instanceof ActorSelectorManager$receiveOrNullSuspend$1) {
            actorSelectorManager$receiveOrNullSuspend$1 = (ActorSelectorManager$receiveOrNullSuspend$1) continuation;
            if ((actorSelectorManager$receiveOrNullSuspend$1.label & Integer.MIN_VALUE) != 0) {
                actorSelectorManager$receiveOrNullSuspend$1.label -= Integer.MIN_VALUE;
                Object obj2 = actorSelectorManager$receiveOrNullSuspend$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = actorSelectorManager$receiveOrNullSuspend$1.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lockFreeMPSCQueue = (LockFreeMPSCQueue) actorSelectorManager$receiveOrNullSuspend$1.L$0;
                }
                ResultKt.throwOnFailure(obj2);
                do {
                    removeFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
                    if (removeFirstOrNull == null) {
                        return removeFirstOrNull;
                    }
                    obj = null;
                    if (this.closed) {
                        return null;
                    }
                    actorSelectorManager$receiveOrNullSuspend$1.L$0 = lockFreeMPSCQueue;
                    actorSelectorManager$receiveOrNullSuspend$1.label = 1;
                    ActorSelectorManager$receiveOrNullSuspend$1 actorSelectorManager$receiveOrNullSuspend$12 = actorSelectorManager$receiveOrNullSuspend$1;
                    ContinuationHolder<Unit, Continuation<Unit>> continuationHolder = this.continuation;
                    if (lockFreeMPSCQueue.isEmpty() && !this.closed) {
                        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(((ContinuationHolder) continuationHolder).ref, null, actorSelectorManager$receiveOrNullSuspend$12)) {
                            if ((lockFreeMPSCQueue.isEmpty() && !this.closed) || !MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(((ContinuationHolder) continuationHolder).ref, actorSelectorManager$receiveOrNullSuspend$12, null)) {
                                obj = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            }
                        } else {
                            throw new IllegalStateException("Continuation is already set");
                        }
                    }
                    if (obj == null) {
                        obj = Unit.INSTANCE;
                    }
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(actorSelectorManager$receiveOrNullSuspend$12);
                    }
                } while (obj != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        actorSelectorManager$receiveOrNullSuspend$1 = new ActorSelectorManager$receiveOrNullSuspend$1(this, continuation);
        Object obj22 = actorSelectorManager$receiveOrNullSuspend$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = actorSelectorManager$receiveOrNullSuspend$1.label;
        if (i != 0) {
        }
        ResultKt.throwOnFailure(obj22);
        do {
            removeFirstOrNull = lockFreeMPSCQueue.removeFirstOrNull();
            if (removeFirstOrNull == null) {
            }
        } while (obj != coroutine_suspended);
        return coroutine_suspended;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.selectionQueue.close();
        if (this.continuation.resume(Unit.INSTANCE)) {
            return;
        }
        selectWakeup();
    }

    /* compiled from: ActorSelectorManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00028\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lio/ktor/network/selector/ActorSelectorManager$ContinuationHolder;", "R", "Lkotlin/coroutines/Continuation;", "C", "", "<init>", "()V", "value", "", CampaignEx.JSON_NATIVE_VIDEO_RESUME, "(Ljava/lang/Object;)Z", "continuation", "Lkotlin/Function0;", "condition", "suspendIf", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "ref", "Ljava/util/concurrent/atomic/AtomicReference;", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class ContinuationHolder<R, C extends Continuation<? super R>> {
        private final AtomicReference<C> ref = new AtomicReference<>(null);

        public final boolean resume(R value) {
            C andSet = this.ref.getAndSet(null);
            if (andSet == null) {
                return false;
            }
            Result.Companion companion = Result.INSTANCE;
            andSet.resumeWith(Result.m8079constructorimpl(value));
            return true;
        }

        public final Object suspendIf(C continuation, Function0<Boolean> condition) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            Intrinsics.checkNotNullParameter(condition, "condition");
            if (!condition.invoke().booleanValue()) {
                return null;
            }
            if (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.ref, null, continuation)) {
                throw new IllegalStateException("Continuation is already set");
            }
            if (condition.invoke().booleanValue() || !MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.ref, continuation, null)) {
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            return null;
        }
    }
}
