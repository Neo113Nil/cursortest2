package org.betup.ui.fragment.flashbet.compose;

import android.os.SystemClock;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: FlashBetQuestionCountdownRing.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1", f = "FlashBetQuestionCountdownRing.kt", i = {0}, l = {73}, m = "invokeSuspend", n = {"startElapsedMs"}, s = {"J$0"})
/* loaded from: classes4.dex */
final class FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $hasExpired$delegate;
    final /* synthetic */ int $initialSeconds;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ MutableIntState $lastTickSecond$delegate;
    final /* synthetic */ State<Boolean> $latestIsActive$delegate;
    final /* synthetic */ State<Function0<Unit>> $latestOnExpired$delegate;
    final /* synthetic */ State<Function1<Integer, Unit>> $latestOnSecondTick$delegate;
    final /* synthetic */ MutableFloatState $remainingSeconds$delegate;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1(boolean z, int i, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, MutableIntState mutableIntState, State<Boolean> state, State<? extends Function1<? super Integer, Unit>> state2, State<? extends Function0<Unit>> state3, Continuation<? super FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1> continuation) {
        super(2, continuation);
        this.$isActive = z;
        this.$initialSeconds = i;
        this.$hasExpired$delegate = mutableState;
        this.$remainingSeconds$delegate = mutableFloatState;
        this.$lastTickSecond$delegate = mutableIntState;
        this.$latestIsActive$delegate = state;
        this.$latestOnSecondTick$delegate = state2;
        this.$latestOnExpired$delegate = state3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1(this.$isActive, this.$initialSeconds, this.$hasExpired$delegate, this.$remainingSeconds$delegate, this.$lastTickSecond$delegate, this.$latestIsActive$delegate, this.$latestOnSecondTick$delegate, this.$latestOnExpired$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetQuestionCountdownRingKt$FlashBetQuestionCountdownRing$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long elapsedRealtime;
        boolean FlashBetQuestionCountdownRing_0vH8DBg$lambda$9;
        boolean FlashBetQuestionCountdownRing_0vH8DBg$lambda$4;
        Function0 FlashBetQuestionCountdownRing_0vH8DBg$lambda$10;
        int FlashBetQuestionCountdownRing_0vH8DBg$lambda$7;
        Function1 FlashBetQuestionCountdownRing_0vH8DBg$lambda$11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$isActive) {
                return Unit.INSTANCE;
            }
            FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$5(this.$hasExpired$delegate, false);
            this.$remainingSeconds$delegate.setFloatValue(this.$initialSeconds);
            this.$lastTickSecond$delegate.setIntValue(this.$initialSeconds + 1);
            elapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            elapsedRealtime = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        do {
            FlashBetQuestionCountdownRing_0vH8DBg$lambda$9 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$9(this.$latestIsActive$delegate);
            if (FlashBetQuestionCountdownRing_0vH8DBg$lambda$9) {
                float coerceAtLeast = RangesKt.coerceAtLeast(this.$initialSeconds - ((SystemClock.elapsedRealtime() - elapsedRealtime) / 1000.0f), 0.0f);
                this.$remainingSeconds$delegate.setFloatValue(coerceAtLeast);
                int coerceAtLeast2 = RangesKt.coerceAtLeast((int) Math.ceil(coerceAtLeast), 0);
                if (coerceAtLeast2 > 0) {
                    FlashBetQuestionCountdownRing_0vH8DBg$lambda$7 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$7(this.$lastTickSecond$delegate);
                    if (coerceAtLeast2 < FlashBetQuestionCountdownRing_0vH8DBg$lambda$7) {
                        this.$lastTickSecond$delegate.setIntValue(coerceAtLeast2);
                        FlashBetQuestionCountdownRing_0vH8DBg$lambda$11 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$11(this.$latestOnSecondTick$delegate);
                        if (FlashBetQuestionCountdownRing_0vH8DBg$lambda$11 != null) {
                            FlashBetQuestionCountdownRing_0vH8DBg$lambda$11.invoke(Boxing.boxInt(coerceAtLeast2));
                        }
                    }
                }
                if (coerceAtLeast <= 0.0f) {
                    FlashBetQuestionCountdownRing_0vH8DBg$lambda$4 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$4(this.$hasExpired$delegate);
                    if (!FlashBetQuestionCountdownRing_0vH8DBg$lambda$4) {
                        FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$5(this.$hasExpired$delegate, true);
                        FlashBetQuestionCountdownRing_0vH8DBg$lambda$10 = FlashBetQuestionCountdownRingKt.FlashBetQuestionCountdownRing_0vH8DBg$lambda$10(this.$latestOnExpired$delegate);
                        FlashBetQuestionCountdownRing_0vH8DBg$lambda$10.invoke();
                    }
                } else {
                    this.J$0 = elapsedRealtime;
                    this.label = 1;
                }
            }
            return Unit.INSTANCE;
        } while (DelayKt.delay(16L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
