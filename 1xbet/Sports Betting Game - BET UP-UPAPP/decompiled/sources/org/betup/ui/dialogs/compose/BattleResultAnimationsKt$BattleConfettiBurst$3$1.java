package org.betup.ui.dialogs.compose;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TweenSpec;
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

/* compiled from: BattleResultAnimations.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.BattleResultAnimationsKt$BattleConfettiBurst$3$1", f = "BattleResultAnimations.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BattleResultAnimationsKt$BattleConfettiBurst$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $burstKey$delegate;
    final /* synthetic */ MutableState<Float> $progress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BattleResultAnimationsKt$BattleConfettiBurst$3$1(MutableIntState mutableIntState, MutableState<Float> mutableState, Continuation<? super BattleResultAnimationsKt$BattleConfettiBurst$3$1> continuation) {
        super(2, continuation);
        this.$burstKey$delegate = mutableIntState;
        this.$progress$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BattleResultAnimationsKt$BattleConfettiBurst$3$1(this.$burstKey$delegate, this.$progress$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BattleResultAnimationsKt$BattleConfettiBurst$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int BattleConfettiBurst$lambda$12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BattleConfettiBurst$lambda$12 = BattleResultAnimationsKt.BattleConfettiBurst$lambda$12(this.$burstKey$delegate);
            if (BattleConfettiBurst$lambda$12 > 0) {
                BattleResultAnimationsKt.BattleConfettiBurst$lambda$16(this.$progress$delegate, 0.0f);
                TweenSpec tween$default = AnimationSpecKt.tween$default(1700, 0, EasingKt.getLinearEasing(), 2, null);
                final MutableState<Float> mutableState = this.$progress$delegate;
                this.label = 1;
                if (SuspendAnimationKt.animate$default(0.0f, 1.0f, 0.0f, tween$default, new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultAnimationsKt$BattleConfettiBurst$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = BattleResultAnimationsKt$BattleConfettiBurst$3$1.invokeSuspend$lambda$0(MutableState.this, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        return invokeSuspend$lambda$0;
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState mutableState, float f, float f2) {
        BattleResultAnimationsKt.BattleConfettiBurst$lambda$16(mutableState, f);
        return Unit.INSTANCE;
    }
}
