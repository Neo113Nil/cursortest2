package androidx.glance.session;

import android.content.Context;
import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Landroidx/glance/session/TimerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.glance.session.SessionWorker$doWork$2", f = "SessionWorker.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SessionWorker$doWork$2 extends SuspendLambda implements Function2<TimerScope, Continuation<? super ListenableWorker.Result>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SessionWorker this$0;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.glance.session.SessionWorker$doWork$2$1", f = "SessionWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.glance.session.SessionWorker$doWork$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ TimerScope $$this$withTimerOrNull;
        int label;
        final /* synthetic */ SessionWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimerScope timerScope, SessionWorker sessionWorker, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$$this$withTimerOrNull = timerScope;
            this.this$0 = sessionWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$$this$withTimerOrNull, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TimeoutOptions timeoutOptions;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TimerScope timerScope = this.$$this$withTimerOrNull;
            timeoutOptions = this.this$0.timeouts;
            timerScope.mo1453startTimerLRDsOJo(timeoutOptions.m1449getIdleTimeoutUwyO8pc());
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.glance.session.SessionWorker$doWork$2$2", f = "SessionWorker.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.glance.session.SessionWorker$doWork$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super ListenableWorker.Result>, Object> {
        final /* synthetic */ TimerScope $$this$withTimerOrNull;
        int label;
        final /* synthetic */ SessionWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SessionWorker sessionWorker, TimerScope timerScope, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.this$0 = sessionWorker;
            this.$$this$withTimerOrNull = timerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$$this$withTimerOrNull, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object work;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            SessionWorker sessionWorker = this.this$0;
            TimerScope timerScope = this.$$this$withTimerOrNull;
            this.label = 1;
            work = sessionWorker.work(timerScope, this);
            return work == coroutine_suspended ? coroutine_suspended : work;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ListenableWorker.Result> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$2(SessionWorker sessionWorker, Continuation<? super SessionWorker$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = sessionWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SessionWorker$doWork$2 sessionWorker$doWork$2 = new SessionWorker$doWork$2(this.this$0, continuation);
        sessionWorker$doWork$2.L$0 = obj;
        return sessionWorker$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TimerScope timerScope, Continuation<? super ListenableWorker.Result> continuation) {
        return ((SessionWorker$doWork$2) create(timerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        TimerScope timerScope = (TimerScope) this.L$0;
        Context applicationContext = this.this$0.getApplicationContext();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(timerScope, this.this$0, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, timerScope, null);
        this.label = 1;
        Object observeIdleEvents = IdleEventBroadcastReceiverKt.observeIdleEvents(applicationContext, anonymousClass1, anonymousClass2, this);
        return observeIdleEvents == coroutine_suspended ? coroutine_suspended : observeIdleEvents;
    }
}
