package org.betup.ui.fragment.bets.betlist;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.ui.fragment.bets.betlist.compose.BetsListScreenKt;

/* compiled from: BetsListFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetsListFragment$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BetsListFragment this$0;

    BetsListFragment$onCreateView$1$1(BetsListFragment betsListFragment) {
        this.this$0 = betsListFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1779192227, i, -1, "org.betup.ui.fragment.bets.betlist.BetsListFragment.onCreateView.<anonymous>.<anonymous> (BetsListFragment.kt:47)");
        }
        StateFlow<List<BetsListModel>> betList = this.this$0.getBetController().getBetList();
        StateFlow<BetState> betFilterState = this.this$0.getBetController().getBetFilterState();
        StateFlow<Boolean> isLoadingBetsHistory = this.this$0.getBetController().isLoadingBetsHistory();
        StateFlow<Boolean> isLoadMoreHistoryBets = this.this$0.getBetController().isLoadMoreHistoryBets();
        StateFlow<Boolean> hasMoreHistoryBets = this.this$0.getBetController().getHasMoreHistoryBets();
        StateFlow<NewUserBetStatisticsModel> betStatus = this.this$0.getBetController().getBetStatus();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final BetsListFragment betsListFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.BetsListFragment$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = BetsListFragment$onCreateView$1$1.invoke$lambda$1$lambda$0(BetsListFragment.this, (BetsListModel) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final BetsListFragment betsListFragment2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.BetsListFragment$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = BetsListFragment$onCreateView$1$1.invoke$lambda$3$lambda$2(BetsListFragment.this, (BetState) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function1 function12 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final BetsListFragment betsListFragment3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.BetsListFragment$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = BetsListFragment$onCreateView$1$1.invoke$lambda$5$lambda$4(BetsListFragment.this);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function0 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final BetsListFragment betsListFragment4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.BetsListFragment$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = BetsListFragment$onCreateView$1$1.invoke$lambda$7$lambda$6(BetsListFragment.this);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        BetsListScreenKt.BetsListScreen(betList, function1, function12, function0, betFilterState, isLoadingBetsHistory, null, (Function0) rememberedValue4, isLoadMoreHistoryBets, hasMoreHistoryBets, betStatus, false, composer, 0, 0, 2112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BetsListFragment betsListFragment, BetsListModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer id = it.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        betsListFragment.showBetDetailDialog(id.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(BetsListFragment betsListFragment) {
        betsListFragment.getBetController().reloadBetsHistory();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(BetsListFragment betsListFragment, BetState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        betsListFragment.getBetController().setFilterState(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(BetsListFragment betsListFragment) {
        betsListFragment.getBetController().loadBetsHistory();
        return Unit.INSTANCE;
    }
}
