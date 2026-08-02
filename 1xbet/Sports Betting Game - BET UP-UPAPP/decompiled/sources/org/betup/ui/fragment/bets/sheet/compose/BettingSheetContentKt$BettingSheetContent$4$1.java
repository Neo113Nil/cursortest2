package org.betup.ui.fragment.bets.sheet.compose;

import androidx.compose.runtime.MutableState;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTab;

/* compiled from: BettingSheetContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$4$1", f = "BettingSheetContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BettingSheetContentKt$BettingSheetContent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $amount;
    final /* synthetic */ MutableState<Long> $amountBeforeBattle$delegate;
    final /* synthetic */ long $effectiveMinBet;
    final /* synthetic */ long $minBet;
    final /* synthetic */ Function1<Long, Unit> $onAmountChange;
    final /* synthetic */ MutableState<QuickBetTab> $selectedTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BettingSheetContentKt$BettingSheetContent$4$1(long j, long j2, Function1<? super Long, Unit> function1, MutableState<QuickBetTab> mutableState, MutableState<Long> mutableState2, long j3, Continuation<? super BettingSheetContentKt$BettingSheetContent$4$1> continuation) {
        super(2, continuation);
        this.$amount = j;
        this.$effectiveMinBet = j2;
        this.$onAmountChange = function1;
        this.$selectedTab$delegate = mutableState;
        this.$amountBeforeBattle$delegate = mutableState2;
        this.$minBet = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BettingSheetContentKt$BettingSheetContent$4$1(this.$amount, this.$effectiveMinBet, this.$onAmountChange, this.$selectedTab$delegate, this.$amountBeforeBattle$delegate, this.$minBet, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BettingSheetContentKt$BettingSheetContent$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        QuickBetTab BettingSheetContent$lambda$25;
        Long BettingSheetContent$lambda$28;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BettingSheetContent$lambda$25 = BettingSheetContentKt.BettingSheetContent$lambda$25(this.$selectedTab$delegate);
            if (BettingSheetContent$lambda$25 != QuickBetTab.BATTLE) {
                BettingSheetContent$lambda$28 = BettingSheetContentKt.BettingSheetContent$lambda$28(this.$amountBeforeBattle$delegate);
                if (BettingSheetContent$lambda$28 != null) {
                    Function1<Long, Unit> function1 = this.$onAmountChange;
                    long j = this.$minBet;
                    MutableState<Long> mutableState = this.$amountBeforeBattle$delegate;
                    function1.invoke(Boxing.boxLong(RangesKt.coerceAtLeast(BettingSheetContent$lambda$28.longValue(), j)));
                    mutableState.setValue(null);
                }
            } else {
                long j2 = this.$amount;
                if (j2 < this.$effectiveMinBet) {
                    this.$amountBeforeBattle$delegate.setValue(Boxing.boxLong(j2));
                    this.$onAmountChange.invoke(Boxing.boxLong(this.$effectiveMinBet));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
