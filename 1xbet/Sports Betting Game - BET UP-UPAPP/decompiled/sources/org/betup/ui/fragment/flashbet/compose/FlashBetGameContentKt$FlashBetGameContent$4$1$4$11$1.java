package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: FlashBetGameContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.flashbet.compose.FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1", f = "FlashBetGameContent.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $goalCelebrationKey$delegate;
    final /* synthetic */ MutableState<FlashBetGoalSide> $scoringSide$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1(MutableIntState mutableIntState, MutableState<FlashBetGoalSide> mutableState, Continuation<? super FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1> continuation) {
        super(2, continuation);
        this.$goalCelebrationKey$delegate = mutableIntState;
        this.$scoringSide$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1(this.$goalCelebrationKey$delegate, this.$scoringSide$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlashBetGameContentKt$FlashBetGameContent$4$1$4$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69 = FlashBetGameContentKt.FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69(this.$goalCelebrationKey$delegate);
            if (FlashBetGameContent$lambda$118$lambda$117$lambda$116$lambda$69 > 0) {
                this.label = 1;
                if (DelayKt.delay(2200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$scoringSide$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
