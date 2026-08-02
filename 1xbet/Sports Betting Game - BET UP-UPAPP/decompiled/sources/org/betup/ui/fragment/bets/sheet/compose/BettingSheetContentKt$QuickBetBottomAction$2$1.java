package org.betup.ui.fragment.bets.sheet.compose;

import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.ui.fragment.bets.BattleCreateResult;

/* compiled from: BettingSheetContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$QuickBetBottomAction$2$1", f = "BettingSheetContent.kt", i = {}, l = {FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BettingSheetContentKt$QuickBetBottomAction$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BattleCreateResult $battleCreateResult;
    final /* synthetic */ Function0<Unit> $onBattleCreateResultConsumed;
    final /* synthetic */ Function0<Unit> $performErrorHaptic;
    final /* synthetic */ Function0<Unit> $performPlaceBetSuccessHaptic;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BettingSheetContentKt$QuickBetBottomAction$2$1(BattleCreateResult battleCreateResult, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Continuation<? super BettingSheetContentKt$QuickBetBottomAction$2$1> continuation) {
        super(2, continuation);
        this.$battleCreateResult = battleCreateResult;
        this.$performPlaceBetSuccessHaptic = function0;
        this.$performErrorHaptic = function02;
        this.$onBattleCreateResultConsumed = function03;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BettingSheetContentKt$QuickBetBottomAction$2$1(this.$battleCreateResult, this.$performPlaceBetSuccessHaptic, this.$performErrorHaptic, this.$onBattleCreateResultConsumed, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BettingSheetContentKt$QuickBetBottomAction$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BattleCreateResult battleCreateResult = this.$battleCreateResult;
            if (Intrinsics.areEqual(battleCreateResult, BattleCreateResult.Success.INSTANCE)) {
                this.$performPlaceBetSuccessHaptic.invoke();
            } else if (Intrinsics.areEqual(battleCreateResult, BattleCreateResult.Error.INSTANCE)) {
                this.$performErrorHaptic.invoke();
                this.label = 1;
                if (DelayKt.delay(2200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (battleCreateResult != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onBattleCreateResultConsumed.invoke();
        return Unit.INSTANCE;
    }
}
