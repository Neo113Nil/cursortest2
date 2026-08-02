package androidx.glance.session;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.K;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/K;", "", "<anonymous>", "(Lkotlinx/coroutines/K;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.glance.session.InteractiveFrameClock$onNewAwaiters$2", f = "InteractiveFrameClock.kt", i = {}, l = {116, 119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class InteractiveFrameClock$onNewAwaiters$2 extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.LongRef $minPeriod;
    final /* synthetic */ long $now;
    final /* synthetic */ Ref.LongRef $period;
    int label;
    final /* synthetic */ InteractiveFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveFrameClock$onNewAwaiters$2(Ref.LongRef longRef, Ref.LongRef longRef2, InteractiveFrameClock interactiveFrameClock, long j, Continuation<? super InteractiveFrameClock$onNewAwaiters$2> continuation) {
        super(2, continuation);
        this.$period = longRef;
        this.$minPeriod = longRef2;
        this.this$0 = interactiveFrameClock;
        this.$now = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InteractiveFrameClock$onNewAwaiters$2(this.$period, this.$minPeriod, this.this$0, this.$now, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (com.google.common.collect.c0.b(r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (kotlinx.coroutines.W.b((r6 - r4) / 1000000, r8) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function0 function0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$period.element;
            long j2 = this.$minPeriod.element;
            if (j >= j2) {
                this.label = 1;
            } else {
                this.label = 2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            this.this$0.sendFrame(this.$now);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InteractiveFrameClock interactiveFrameClock = this.this$0;
            function0 = interactiveFrameClock.nanoTime;
            interactiveFrameClock.sendFrame(((Number) function0.invoke()).longValue());
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((InteractiveFrameClock$onNewAwaiters$2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
