package androidx.glance.session;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/K;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.session.TimerScopeKt$withTimer$2", f = "TimerScope.kt", i = {0}, l = {86}, m = "invokeSuspend", n = {"timerJob"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class TimerScopeKt$withTimer$2<T> extends SuspendLambda implements Function2<K, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ TimeSource $timeSource;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/K;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.glance.session.TimerScopeKt$withTimer$2$1", f = "TimerScope.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.glance.session.TimerScopeKt$withTimer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<K, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
        final /* synthetic */ TimeSource $timeSource;
        final /* synthetic */ AtomicReference<InterfaceC1120x0> $timerJob;
        final /* synthetic */ K $timerScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, TimeSource timeSource, K k, AtomicReference<InterfaceC1120x0> atomicReference, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$timeSource = timeSource;
            this.$timerScope = k;
            this.$timerJob = atomicReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$timeSource, this.$timerScope, this.$timerJob, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = new TimerScopeKt$withTimer$2$1$blockScope$1((K) this.L$0, this.$timeSource, this.$timerScope, this.$block, this.$timerJob);
            Function2<TimerScope, Continuation<? super T>, Object> function2 = this.$block;
            this.label = 1;
            Object invoke = function2.invoke(timerScopeKt$withTimer$2$1$blockScope$1, this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super T> continuation) {
            return ((AnonymousClass1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimerScopeKt$withTimer$2(Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, TimeSource timeSource, Continuation<? super TimerScopeKt$withTimer$2> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$timeSource = timeSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TimerScopeKt$withTimer$2 timerScopeKt$withTimer$2 = new TimerScopeKt$withTimer$2(this.$block, this.$timeSource, continuation);
        timerScopeKt$withTimer$2.L$0 = obj;
        return timerScopeKt$withTimer$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            K k = (K) this.L$0;
            AtomicReference atomicReference2 = new AtomicReference(null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$timeSource, k, atomicReference2, null);
            this.L$0 = atomicReference2;
            this.label = 1;
            obj = L.c(anonymousClass1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            atomicReference = atomicReference2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicReference = (AtomicReference) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) atomicReference.get();
        if (interfaceC1120x0 != null) {
            interfaceC1120x0.cancel((CancellationException) null);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super T> continuation) {
        return ((TimerScopeKt$withTimer$2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
