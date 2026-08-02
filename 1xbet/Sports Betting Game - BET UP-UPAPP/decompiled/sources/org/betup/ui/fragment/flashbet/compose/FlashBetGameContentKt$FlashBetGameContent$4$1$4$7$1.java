package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1", f = "FlashBetGameContent.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $answersCount;
    final /* synthetic */ Context $appContext;
    final /* synthetic */ MutableState<Integer> $lastAnswersCount$delegate;
    final /* synthetic */ FlashBetGameSessionDto $s;
    final /* synthetic */ MutableState<Boolean> $showReveal$delegate;
    final /* synthetic */ MutableState<Boolean> $showSimulation$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1(int i, FlashBetGameSessionDto flashBetGameSessionDto, Context context, MutableState<Integer> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1> continuation) {
        super(2, continuation);
        this.$answersCount = i;
        this.$s = flashBetGameSessionDto;
        this.$appContext = context;
        this.$lastAnswersCount$delegate = mutableState;
        this.$showSimulation$delegate = mutableState2;
        this.$showReveal$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1(this.$answersCount, this.$s, this.$appContext, this.$lastAnswersCount$delegate, this.$showSimulation$delegate, this.$showReveal$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$44;
        boolean FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = this.$answersCount;
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$44 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$44(this.$lastAnswersCount$delegate);
            if (i2 > FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$44) {
                FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$42(this.$showSimulation$delegate, true);
                this.label = 1;
                if (DelayKt.delay(this.$s.getGapBetweenQuestionsMs(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$45(this.$lastAnswersCount$delegate, this.$answersCount);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$42(this.$showSimulation$delegate, false);
        FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38(this.$showReveal$delegate);
        if (!FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$38) {
            FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
            Context context = this.$appContext;
            Intrinsics.checkNotNull(context);
            flashBetUiSoundEffect.playWhistle(context, true);
        }
        FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$45(this.$lastAnswersCount$delegate, this.$answersCount);
        return Unit.INSTANCE;
    }
}
