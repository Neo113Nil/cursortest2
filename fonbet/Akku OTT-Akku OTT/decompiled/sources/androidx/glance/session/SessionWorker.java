package androidx.glance.session;

import android.content.Context;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.Recomposer;
import androidx.glance.Applier;
import androidx.glance.EmittableWithChildren;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.Duration;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.P;
import kotlinx.coroutines.flow.Q;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.scheduling.c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Landroidx/glance/session/SessionManager;", "sessionManager", "Landroidx/glance/session/TimeoutOptions;", "timeouts", "Lkotlinx/coroutines/I;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Landroidx/glance/session/SessionManager;Landroidx/glance/session/TimeoutOptions;Lkotlinx/coroutines/I;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/glance/session/TimerScope;", "Landroidx/work/ListenableWorker$Result;", "work", "(Landroidx/glance/session/TimerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/WorkerParameters;", "Landroidx/glance/session/SessionManager;", "Landroidx/glance/session/TimeoutOptions;", "Lkotlinx/coroutines/I;", "getCoroutineContext", "()Lkotlinx/coroutines/I;", "getCoroutineContext$annotations", "()V", "", Constants.KEY, "Ljava/lang/String;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {
    private static final boolean DEBUG = false;
    private static final String TAG = "GlanceSessionWorker";
    public static final String TimeoutExitReason = "TIMEOUT_EXIT_REASON";
    private final I coroutineContext;
    private final String key;
    private final WorkerParameters params;
    private final SessionManager sessionManager;
    private final TimeoutOptions timeouts;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionWorker(Context context, WorkerParameters workerParameters, SessionManager sessionManager, TimeoutOptions timeoutOptions, I i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, r4, r5, r6);
        I i3;
        SessionManager glanceSessionManager = (i2 & 4) != 0 ? SessionManagerKt.getGlanceSessionManager() : sessionManager;
        TimeoutOptions timeoutOptions2 = (i2 & 8) != 0 ? new TimeoutOptions(0L, 0L, 0L, null, 15, null) : timeoutOptions;
        if ((i2 & 16) != 0) {
            c cVar = C1049c0.a;
            i3 = p.a;
        } else {
            i3 = i;
        }
    }

    @Deprecated(message = "Deprecated by super class, replacement in progress, see b/245353737")
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x016f, code lost:
    
        if (r3.join(r14) == r15) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0152, code lost:
    
        if (r9.receiveEvents(r0, r2, r14) != r15) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object work(TimerScope timerScope, Continuation<? super ListenableWorker.Result> continuation) {
        SessionWorker$work$1 sessionWorker$work$1;
        int i;
        final TimerScope timerScope2;
        InteractiveFrameClock interactiveFrameClock;
        int i2;
        CancellationException cancellationException;
        Recomposer recomposer;
        final SessionWorker sessionWorker;
        InterfaceC1120x0 interfaceC1120x0;
        Composition composition;
        final Session session;
        final InteractiveFrameClock interactiveFrameClock2;
        if (continuation instanceof SessionWorker$work$1) {
            sessionWorker$work$1 = (SessionWorker$work$1) continuation;
            int i3 = sessionWorker$work$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sessionWorker$work$1.label = i3 - Integer.MIN_VALUE;
                SessionWorker$work$1 sessionWorker$work$12 = sessionWorker$work$1;
                Object obj = sessionWorker$work$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionWorker$work$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Session session2 = this.sessionManager.getSession(this.key);
                    if (session2 == null) {
                        if (this.params.getRunAttemptCount() != 0) {
                            return ListenableWorker.Result.success();
                        }
                        throw new IllegalStateException(("No session available for key " + this.key).toString());
                    }
                    timerScope2 = timerScope;
                    interactiveFrameClock = new InteractiveFrameClock(timerScope2, 0, 0, 0L, null, 30, null);
                    Q0 c = C1082i.c(timerScope2, null, null, new SessionWorker$work$snapshotMonitor$1(null), 3);
                    EmittableWithChildren createRootEmittable = session2.createRootEmittable();
                    Recomposer recomposer2 = new Recomposer(timerScope2.getCoroutineContext());
                    Composition Composition = CompositionKt.Composition(new Applier(createRootEmittable), recomposer2);
                    Composition.setContent(session2.mo1282provideGlance(getApplicationContext()));
                    P a = Q.a(Boxing.boxBoolean(false));
                    C1082i.c(timerScope2, interactiveFrameClock, null, new SessionWorker$work$2(recomposer2, null), 2);
                    i2 = 3;
                    cancellationException = null;
                    C1082i.c(timerScope2, null, null, new SessionWorker$work$3(recomposer2, session2, a, this, createRootEmittable, timerScope2, null), 3);
                    SessionWorker$work$4 sessionWorker$work$4 = new SessionWorker$work$4(null);
                    sessionWorker$work$12.L$0 = this;
                    sessionWorker$work$12.L$1 = timerScope2;
                    sessionWorker$work$12.L$2 = session2;
                    sessionWorker$work$12.L$3 = interactiveFrameClock;
                    sessionWorker$work$12.L$4 = c;
                    sessionWorker$work$12.L$5 = recomposer2;
                    sessionWorker$work$12.L$6 = Composition;
                    sessionWorker$work$12.label = 1;
                    if (C1062g.f(a, sessionWorker$work$4, sessionWorker$work$12) != coroutine_suspended) {
                        recomposer = recomposer2;
                        sessionWorker = this;
                        interfaceC1120x0 = c;
                        composition = Composition;
                        session = session2;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    composition = (Composition) sessionWorker$work$12.L$6;
                    Recomposer recomposer3 = (Recomposer) sessionWorker$work$12.L$5;
                    InterfaceC1120x0 interfaceC1120x02 = (InterfaceC1120x0) sessionWorker$work$12.L$4;
                    interactiveFrameClock = (InteractiveFrameClock) sessionWorker$work$12.L$3;
                    session = (Session) sessionWorker$work$12.L$2;
                    TimerScope timerScope3 = (TimerScope) sessionWorker$work$12.L$1;
                    sessionWorker = (SessionWorker) sessionWorker$work$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    i2 = 3;
                    recomposer = recomposer3;
                    cancellationException = null;
                    interfaceC1120x0 = interfaceC1120x02;
                    timerScope2 = timerScope3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ListenableWorker.Result.success();
                    }
                    composition = (Composition) sessionWorker$work$12.L$3;
                    recomposer = (Recomposer) sessionWorker$work$12.L$2;
                    interfaceC1120x0 = (InterfaceC1120x0) sessionWorker$work$12.L$1;
                    interactiveFrameClock2 = (InteractiveFrameClock) sessionWorker$work$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    i2 = 3;
                    cancellationException = null;
                    composition.dispose();
                    interactiveFrameClock2.stopInteractive();
                    interfaceC1120x0.cancel(cancellationException);
                    recomposer.close();
                    sessionWorker$work$12.L$0 = cancellationException;
                    sessionWorker$work$12.L$1 = cancellationException;
                    sessionWorker$work$12.L$2 = cancellationException;
                    sessionWorker$work$12.L$3 = cancellationException;
                    sessionWorker$work$12.label = i2;
                }
                interactiveFrameClock2 = interactiveFrameClock;
                Context applicationContext = sessionWorker.getApplicationContext();
                Function1<Object, Unit> function1 = new Function1<Object, Unit>() { // from class: androidx.glance.session.SessionWorker$work$5

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
                    @DebugMetadata(c = "androidx.glance.session.SessionWorker$work$5$1", f = "SessionWorker.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.glance.session.SessionWorker$work$5$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
                        final /* synthetic */ InteractiveFrameClock $frameClock;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(InteractiveFrameClock interactiveFrameClock, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$frameClock = interactiveFrameClock;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$frameClock, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                InteractiveFrameClock interactiveFrameClock = this.$frameClock;
                                this.label = 1;
                                if (interactiveFrameClock.startInteractive(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(K k, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke2(obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object obj2) {
                        TimeoutOptions timeoutOptions;
                        TimeoutOptions timeoutOptions2;
                        long mo1452getTimeLeftUwyO8pc = TimerScope.this.mo1452getTimeLeftUwyO8pc();
                        timeoutOptions = sessionWorker.timeouts;
                        if (Duration.m3060compareToLRDsOJo(mo1452getTimeLeftUwyO8pc, timeoutOptions.m1448getAdditionalTimeUwyO8pc()) < 0) {
                            TimerScope timerScope4 = TimerScope.this;
                            timeoutOptions2 = sessionWorker.timeouts;
                            timerScope4.mo1451addTimeLRDsOJo(timeoutOptions2.m1448getAdditionalTimeUwyO8pc());
                        }
                        C1082i.c(TimerScope.this, null, null, new AnonymousClass1(interactiveFrameClock2, null), 3);
                    }
                };
                sessionWorker$work$12.L$0 = interactiveFrameClock2;
                sessionWorker$work$12.L$1 = interfaceC1120x0;
                sessionWorker$work$12.L$2 = recomposer;
                sessionWorker$work$12.L$3 = composition;
                sessionWorker$work$12.L$4 = cancellationException;
                sessionWorker$work$12.L$5 = cancellationException;
                sessionWorker$work$12.L$6 = cancellationException;
                sessionWorker$work$12.label = 2;
            }
        }
        sessionWorker$work$1 = new SessionWorker$work$1(this, continuation);
        SessionWorker$work$1 sessionWorker$work$122 = sessionWorker$work$1;
        Object obj2 = sessionWorker$work$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionWorker$work$122.label;
        if (i != 0) {
        }
        interactiveFrameClock2 = interactiveFrameClock;
        Context applicationContext2 = sessionWorker.getApplicationContext();
        Function1<Object, Unit> function12 = new Function1<Object, Unit>() { // from class: androidx.glance.session.SessionWorker$work$5

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.glance.session.SessionWorker$work$5$1", f = "SessionWorker.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.glance.session.SessionWorker$work$5$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
                final /* synthetic */ InteractiveFrameClock $frameClock;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(InteractiveFrameClock interactiveFrameClock, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$frameClock = interactiveFrameClock;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$frameClock, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        InteractiveFrameClock interactiveFrameClock = this.$frameClock;
                        this.label = 1;
                        if (interactiveFrameClock.startInteractive(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(K k, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj22) {
                invoke2(obj22);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj22) {
                TimeoutOptions timeoutOptions;
                TimeoutOptions timeoutOptions2;
                long mo1452getTimeLeftUwyO8pc = TimerScope.this.mo1452getTimeLeftUwyO8pc();
                timeoutOptions = sessionWorker.timeouts;
                if (Duration.m3060compareToLRDsOJo(mo1452getTimeLeftUwyO8pc, timeoutOptions.m1448getAdditionalTimeUwyO8pc()) < 0) {
                    TimerScope timerScope4 = TimerScope.this;
                    timeoutOptions2 = sessionWorker.timeouts;
                    timerScope4.mo1451addTimeLRDsOJo(timeoutOptions2.m1448getAdditionalTimeUwyO8pc());
                }
                C1082i.c(TimerScope.this, null, null, new AnonymousClass1(interactiveFrameClock2, null), 3);
            }
        };
        sessionWorker$work$122.L$0 = interactiveFrameClock2;
        sessionWorker$work$122.L$1 = interfaceC1120x0;
        sessionWorker$work$122.L$2 = recomposer;
        sessionWorker$work$122.L$3 = composition;
        sessionWorker$work$122.L$4 = cancellationException;
        sessionWorker$work$122.L$5 = cancellationException;
        sessionWorker$work$122.L$6 = cancellationException;
        sessionWorker$work$122.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        SessionWorker$doWork$1 sessionWorker$doWork$1;
        int i;
        if (continuation instanceof SessionWorker$doWork$1) {
            sessionWorker$doWork$1 = (SessionWorker$doWork$1) continuation;
            int i2 = sessionWorker$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sessionWorker$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sessionWorker$doWork$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionWorker$doWork$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TimeSource timeSource = this.timeouts.getTimeSource();
                    SessionWorker$doWork$2 sessionWorker$doWork$2 = new SessionWorker$doWork$2(this, null);
                    sessionWorker$doWork$1.label = 1;
                    obj = TimerScopeKt.withTimerOrNull(timeSource, sessionWorker$doWork$2, sessionWorker$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ListenableWorker.Result result = (ListenableWorker.Result) obj;
                return result != null ? ListenableWorker.Result.success(new Data.Builder().putBoolean(TimeoutExitReason, true).build()) : result;
            }
        }
        sessionWorker$doWork$1 = new SessionWorker$doWork$1(this, continuation);
        Object obj2 = sessionWorker$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionWorker$doWork$1.label;
        if (i != 0) {
        }
        ListenableWorker.Result result2 = (ListenableWorker.Result) obj2;
        if (result2 != null) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public I getCoroutineContext() {
        return this.coroutineContext;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, SessionManager sessionManager, TimeoutOptions timeoutOptions, I i) {
        super(context, workerParameters);
        this.params = workerParameters;
        this.sessionManager = sessionManager;
        this.timeouts = timeoutOptions;
        this.coroutineContext = i;
        String string = getInputData().getString(sessionManager.getKeyParam());
        if (string == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.key = string;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, SessionManagerKt.getGlanceSessionManager(), null, null, 24, null);
    }
}
