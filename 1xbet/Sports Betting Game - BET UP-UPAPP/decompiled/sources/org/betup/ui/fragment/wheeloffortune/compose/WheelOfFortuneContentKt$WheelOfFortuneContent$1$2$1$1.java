package org.betup.ui.fragment.wheeloffortune.compose;

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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.fragment.wheeloffortune.model.WheelSegment;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: WheelOfFortuneContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.wheeloffortune.compose.WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1", f = "WheelOfFortuneContent.kt", i = {}, l = {Opcodes.MULTIANEWARRAY, Opcodes.IFNONNULL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Integer, Unit> $onSpinComplete;
    final /* synthetic */ Function1<HapticFeedbackType, Unit> $performHaptic;
    final /* synthetic */ int $randomDuration;
    final /* synthetic */ WheelSegment $winningSegment;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1(int i, Function1<? super HapticFeedbackType, Unit> function1, Function1<? super Integer, Unit> function12, WheelSegment wheelSegment, Continuation<? super WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1> continuation) {
        super(2, continuation);
        this.$randomDuration = i;
        this.$performHaptic = function1;
        this.$onSpinComplete = function12;
        this.$winningSegment = wheelSegment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1(this.$randomDuration, this.$performHaptic, this.$onSpinComplete, this.$winningSegment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WheelOfFortuneContentKt$WheelOfFortuneContent$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(this.$randomDuration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$performHaptic.invoke(HapticFeedbackType.Win);
                this.$onSpinComplete.invoke(Boxing.boxInt(this.$winningSegment.getValue()));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$performHaptic.invoke(HapticFeedbackType.SpinStop);
        this.label = 2;
        if (DelayKt.delay(1500L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.$performHaptic.invoke(HapticFeedbackType.Win);
        this.$onSpinComplete.invoke(Boxing.boxInt(this.$winningSegment.getValue()));
        return Unit.INSTANCE;
    }
}
