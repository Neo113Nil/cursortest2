package androidx.glance.session;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.K;
import kotlinx.coroutines.X0;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ<\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010#R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/glance/session/InteractiveFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlinx/coroutines/K;", "scope", "", "baselineHz", "interactiveHz", "", "interactiveTimeoutMs", "Lkotlin/Function0;", "nanoTime", "<init>", "(Lkotlinx/coroutines/K;IIJLkotlin/jvm/functions/Function0;)V", "", "onNewAwaiters", "()V", "now", "sendFrame", "(J)V", "startInteractive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopInteractive", "R", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentHz$glance_release", "()I", "currentHz", "Lkotlinx/coroutines/K;", "I", "J", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/BroadcastFrameClock;", "frameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "", "lock", "Ljava/lang/Object;", "lastFrame", "Lkotlinx/coroutines/l;", "interactiveCoroutine", "Lkotlinx/coroutines/l;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInteractiveFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveFrameClock.kt\nandroidx/glance/session/InteractiveFrameClock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
/* loaded from: classes.dex */
public final class InteractiveFrameClock implements MonotonicFrameClock {
    private static final boolean DEBUG = false;
    private static final long NANOSECONDS_PER_MILLISECOND = 1000000;
    private static final long NANOSECONDS_PER_SECOND = 1000000000;
    private static final String TAG = "InteractiveFrameClock";
    private final int baselineHz;
    private int currentHz;
    private final BroadcastFrameClock frameClock;
    private InterfaceC1096l<? super Unit> interactiveCoroutine;
    private final int interactiveHz;
    private final long interactiveTimeoutMs;
    private long lastFrame;
    private final Object lock;
    private final Function0<Long> nanoTime;
    private final K scope;

    public InteractiveFrameClock(K k, int i, int i2, long j, Function0<Long> function0) {
        this.scope = k;
        this.baselineHz = i;
        this.interactiveHz = i2;
        this.interactiveTimeoutMs = j;
        this.nanoTime = function0;
        this.frameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.glance.session.InteractiveFrameClock$frameClock$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InteractiveFrameClock.this.onNewAwaiters();
            }
        });
        this.lock = new Object();
        this.currentHz = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewAwaiters() {
        long longValue = this.nanoTime.invoke().longValue();
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.LongRef longRef2 = new Ref.LongRef();
        synchronized (this.lock) {
            longRef.element = longValue - this.lastFrame;
            longRef2.element = 1000000000 / this.currentHz;
            Unit unit = Unit.INSTANCE;
        }
        C1082i.c(this.scope, null, null, new InteractiveFrameClock$onNewAwaiters$2(longRef, longRef2, this, longValue, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFrame(long now) {
        this.frameClock.sendFrame(now);
        synchronized (this.lock) {
            this.lastFrame = now;
            Unit unit = Unit.INSTANCE;
        }
    }

    @VisibleForTesting
    public final int currentHz$glance_release() {
        int i;
        synchronized (this.lock) {
            i = this.currentHz;
        }
        return i;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final Object startInteractive(Continuation<? super Unit> continuation) {
        return X0.c(this.interactiveTimeoutMs, new InteractiveFrameClock$startInteractive$2(this, null), continuation);
    }

    public final void stopInteractive() {
        synchronized (this.lock) {
            InterfaceC1096l<? super Unit> interfaceC1096l = this.interactiveCoroutine;
            if (interfaceC1096l != null) {
                interfaceC1096l.cancel(null);
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        return this.frameClock.withFrameNanos(function1, continuation);
    }

    public /* synthetic */ InteractiveFrameClock(K k, int i, int i2, long j, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(k, (i3 & 2) != 0 ? 5 : i, (i3 & 4) != 0 ? 20 : i2, (i3 & 8) != 0 ? 5000L : j, (i3 & 16) != 0 ? new Function0<Long>() { // from class: androidx.glance.session.InteractiveFrameClock.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(System.nanoTime());
            }
        } : function0);
    }
}
