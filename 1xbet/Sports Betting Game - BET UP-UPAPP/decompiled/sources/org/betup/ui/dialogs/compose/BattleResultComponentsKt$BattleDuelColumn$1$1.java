package org.betup.ui.dialogs.compose;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TweenSpec;
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

/* compiled from: BattleResultComponents.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.BattleResultComponentsKt$BattleDuelColumn$1$1", f = "BattleResultComponents.kt", i = {}, l = {1207}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BattleResultComponentsKt$BattleDuelColumn$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Float> $displayOdds$delegate;
    final /* synthetic */ boolean $oddsRace;
    final /* synthetic */ MutableState<Boolean> $oddsRaceDone$delegate;
    final /* synthetic */ Double $targetOdds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BattleResultComponentsKt$BattleDuelColumn$1$1(boolean z, Double d, MutableState<Boolean> mutableState, MutableState<Float> mutableState2, Continuation<? super BattleResultComponentsKt$BattleDuelColumn$1$1> continuation) {
        super(2, continuation);
        this.$oddsRace = z;
        this.$targetOdds = d;
        this.$oddsRaceDone$delegate = mutableState;
        this.$displayOdds$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BattleResultComponentsKt$BattleDuelColumn$1$1(this.$oddsRace, this.$targetOdds, this.$oddsRaceDone$delegate, this.$displayOdds$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BattleResultComponentsKt$BattleDuelColumn$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$oddsRace || this.$targetOdds == null) {
                BattleResultComponentsKt.BattleDuelColumn$lambda$54(this.$oddsRaceDone$delegate, true);
                return Unit.INSTANCE;
            }
            BattleResultComponentsKt.BattleDuelColumn$lambda$54(this.$oddsRaceDone$delegate, false);
            float doubleValue = (float) this.$targetOdds.doubleValue();
            TweenSpec tween$default = AnimationSpecKt.tween$default(850, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
            final MutableState<Float> mutableState = this.$displayOdds$delegate;
            this.label = 1;
            if (SuspendAnimationKt.animate$default(1.0f, doubleValue, 0.0f, tween$default, new Function2() { // from class: org.betup.ui.dialogs.compose.BattleResultComponentsKt$BattleDuelColumn$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BattleResultComponentsKt$BattleDuelColumn$1$1.invokeSuspend$lambda$0(MutableState.this, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    return invokeSuspend$lambda$0;
                }
            }, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BattleResultComponentsKt.BattleDuelColumn$lambda$54(this.$oddsRaceDone$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState mutableState, float f, float f2) {
        BattleResultComponentsKt.BattleDuelColumn$lambda$57(mutableState, f);
        return Unit.INSTANCE;
    }
}
