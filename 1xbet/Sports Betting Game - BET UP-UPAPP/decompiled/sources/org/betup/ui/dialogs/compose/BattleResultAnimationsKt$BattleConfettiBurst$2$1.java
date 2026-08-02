package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.MutableIntState;
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
@DebugMetadata(c = "org.betup.ui.dialogs.compose.BattleResultAnimationsKt$BattleConfettiBurst$2$1", f = "BattleResultAnimations.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BattleResultAnimationsKt$BattleConfettiBurst$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $burstKey$delegate;
    final /* synthetic */ boolean $show;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BattleResultAnimationsKt$BattleConfettiBurst$2$1(boolean z, MutableIntState mutableIntState, Continuation<? super BattleResultAnimationsKt$BattleConfettiBurst$2$1> continuation) {
        super(2, continuation);
        this.$show = z;
        this.$burstKey$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BattleResultAnimationsKt$BattleConfettiBurst$2$1(this.$show, this.$burstKey$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BattleResultAnimationsKt$BattleConfettiBurst$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int BattleConfettiBurst$lambda$12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$show) {
            BattleConfettiBurst$lambda$12 = BattleResultAnimationsKt.BattleConfettiBurst$lambda$12(this.$burstKey$delegate);
            this.$burstKey$delegate.setIntValue(BattleConfettiBurst$lambda$12 + 1);
        }
        return Unit.INSTANCE;
    }
}
