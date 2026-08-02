package androidx.glance.session;

import android.content.Context;
import androidx.compose.runtime.Recomposer;
import androidx.glance.Emittable;
import androidx.glance.EmittableWithChildren;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;
import kotlinx.coroutines.flow.G;
import kotlinx.coroutines.flow.InterfaceC1061f;
import kotlinx.coroutines.flow.O;
import okhttp3.internal.ws.WebSocketProtocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.session.SessionWorker$work$3", f = "SessionWorker.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SessionWorker$work$3 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ EmittableWithChildren $root;
    final /* synthetic */ Session $session;
    final /* synthetic */ TimerScope $this_work;
    final /* synthetic */ G<Boolean> $uiReady;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SessionWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$work$3(Recomposer recomposer, Session session, G<Boolean> g, SessionWorker sessionWorker, EmittableWithChildren emittableWithChildren, TimerScope timerScope, Continuation<? super SessionWorker$work$3> continuation) {
        super(2, continuation);
        this.$recomposer = recomposer;
        this.$session = session;
        this.$uiReady = g;
        this.this$0 = sessionWorker;
        this.$root = emittableWithChildren;
        this.$this_work = timerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SessionWorker$work$3 sessionWorker$work$3 = new SessionWorker$work$3(this.$recomposer, this.$session, this.$uiReady, this.this$0, this.$root, this.$this_work, continuation);
        sessionWorker$work$3.L$0 = obj;
        return sessionWorker$work$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            K k = (K) this.L$0;
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = this.$recomposer.getChangeCount();
            O<Recomposer.State> currentState = this.$recomposer.getCurrentState();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, this.$recomposer, longRef, this.$uiReady, this.this$0, this.$root, this.$this_work, k);
            this.label = 1;
            if (currentState.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((SessionWorker$work$3) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "state", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.glance.session.SessionWorker$work$3$1, reason: invalid class name */
    public static final class AnonymousClass1 implements InterfaceC1061f<Recomposer.State> {
        final /* synthetic */ K $$this$launch;
        final /* synthetic */ Ref.LongRef $lastRecomposeCount;
        final /* synthetic */ Recomposer $recomposer;
        final /* synthetic */ EmittableWithChildren $root;
        final /* synthetic */ Session $session;
        final /* synthetic */ TimerScope $this_work;
        final /* synthetic */ G<Boolean> $uiReady;
        final /* synthetic */ SessionWorker this$0;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.glance.session.SessionWorker$work$3$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Recomposer.State.values().length];
                try {
                    iArr[Recomposer.State.Idle.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Recomposer.State.ShutDown.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(Session session, Recomposer recomposer, Ref.LongRef longRef, G<Boolean> g, SessionWorker sessionWorker, EmittableWithChildren emittableWithChildren, TimerScope timerScope, K k) {
            this.$session = session;
            this.$recomposer = recomposer;
            this.$lastRecomposeCount = longRef;
            this.$uiReady = g;
            this.this$0 = sessionWorker;
            this.$root = emittableWithChildren;
            this.$this_work = timerScope;
            this.$$this$launch = k;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
        
            if (r9.emit(r2, r0) != r1) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: emit, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit2(Recomposer.State state, Continuation<? super Unit> continuation) {
            SessionWorker$work$3$1$emit$1 sessionWorker$work$3$1$emit$1;
            int i;
            AnonymousClass1 anonymousClass1;
            TimeoutOptions timeoutOptions;
            if (continuation instanceof SessionWorker$work$3$1$emit$1) {
                sessionWorker$work$3$1$emit$1 = (SessionWorker$work$3$1$emit$1) continuation;
                int i2 = sessionWorker$work$3$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sessionWorker$work$3$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sessionWorker$work$3$1$emit$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sessionWorker$work$3$1$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                L.b(this.$$this$launch, null);
                            }
                            return Unit.INSTANCE;
                        }
                        if (this.$recomposer.getChangeCount() <= this.$lastRecomposeCount.element && this.$uiReady.getValue().booleanValue()) {
                            anonymousClass1 = this;
                            anonymousClass1.$lastRecomposeCount.element = anonymousClass1.$recomposer.getChangeCount();
                            return Unit.INSTANCE;
                        }
                        Session session = this.$session;
                        Context applicationContext = this.this$0.getApplicationContext();
                        Emittable copy = this.$root.copy();
                        Intrinsics.checkNotNull(copy, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
                        sessionWorker$work$3$1$emit$1.L$0 = this;
                        sessionWorker$work$3$1$emit$1.label = 1;
                        obj = session.processEmittableTree(applicationContext, (EmittableWithChildren) copy, sessionWorker$work$3$1$emit$1);
                        if (obj != coroutine_suspended) {
                            anonymousClass1 = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        anonymousClass1 = (AnonymousClass1) sessionWorker$work$3$1$emit$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        TimerScope timerScope = anonymousClass1.$this_work;
                        timeoutOptions = anonymousClass1.this$0.timeouts;
                        timerScope.mo1453startTimerLRDsOJo(timeoutOptions.m1450getInitialTimeoutUwyO8pc());
                        anonymousClass1.$lastRecomposeCount.element = anonymousClass1.$recomposer.getChangeCount();
                        return Unit.INSTANCE;
                    }
                    anonymousClass1 = (AnonymousClass1) sessionWorker$work$3$1$emit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (!anonymousClass1.$uiReady.getValue().booleanValue() && booleanValue) {
                        G<Boolean> g = anonymousClass1.$uiReady;
                        Boolean boxBoolean = Boxing.boxBoolean(true);
                        sessionWorker$work$3$1$emit$1.L$0 = anonymousClass1;
                        sessionWorker$work$3$1$emit$1.label = 2;
                    }
                    anonymousClass1.$lastRecomposeCount.element = anonymousClass1.$recomposer.getChangeCount();
                    return Unit.INSTANCE;
                }
            }
            sessionWorker$work$3$1$emit$1 = new SessionWorker$work$3$1$emit$1(this, continuation);
            Object obj2 = sessionWorker$work$3$1$emit$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = sessionWorker$work$3$1$emit$1.label;
            if (i != 0) {
            }
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            if (!anonymousClass1.$uiReady.getValue().booleanValue()) {
                G<Boolean> g2 = anonymousClass1.$uiReady;
                Boolean boxBoolean2 = Boxing.boxBoolean(true);
                sessionWorker$work$3$1$emit$1.L$0 = anonymousClass1;
                sessionWorker$work$3$1$emit$1.label = 2;
            }
            anonymousClass1.$lastRecomposeCount.element = anonymousClass1.$recomposer.getChangeCount();
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC1061f
        public /* bridge */ /* synthetic */ Object emit(Recomposer.State state, Continuation continuation) {
            return emit2(state, (Continuation<? super Unit>) continuation);
        }
    }
}
