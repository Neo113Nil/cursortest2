package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.shop.CancelBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetInfoModel;
import org.betup.utils.NavigationHelper;

/* compiled from: BetListDetailsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetListDetailsScreenKt$BetListDetailsScreen$16$3$2 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ State<CancelBetInfoModel> $cancelBetInfo$delegate;
    final /* synthetic */ int $currentPage;
    final /* synthetic */ MutableState<Boolean> $forShareCapture$delegate;
    final /* synthetic */ State<Boolean> $isRewardAddButtonEnabled$delegate;
    final /* synthetic */ boolean $isViewingOtherUserBets;
    final /* synthetic */ State<List<BetsListModel>> $items$delegate;
    final /* synthetic */ State<OddType> $oddTye$delegate;
    final /* synthetic */ Function2<Long, Long, Unit> $onCancelBetClick;
    final /* synthetic */ Function1<Integer, Unit> $onClickAddReward;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function2<Integer, MatchState, Unit> $onMatchClick;
    final /* synthetic */ Function3<Long, Long, Double, Unit> $onSellBetClick;
    final /* synthetic */ Function0<Unit> $onSellUnavailableClick;
    final /* synthetic */ State<SellBetInfoModel> $sellBetInfo$delegate;
    final /* synthetic */ BetTicketShareLayoutAnchor $ticketShareCoordsHolder;
    final /* synthetic */ State<Long> $videoRewardAmount$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailsScreenKt$BetListDetailsScreen$16$3$2(int i, Function1<? super Integer, Unit> function1, boolean z, Function2<? super Integer, ? super MatchState, Unit> function2, Function2<? super Long, ? super Long, Unit> function22, Function3<? super Long, ? super Long, ? super Double, Unit> function3, Function0<Unit> function0, Function0<Unit> function02, BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, State<? extends List<? extends BetsListModel>> state, State<? extends OddType> state2, State<Boolean> state3, State<Long> state4, State<? extends CancelBetInfoModel> state5, State<? extends SellBetInfoModel> state6, MutableState<Boolean> mutableState) {
        this.$currentPage = i;
        this.$onClickAddReward = function1;
        this.$isViewingOtherUserBets = z;
        this.$onMatchClick = function2;
        this.$onCancelBetClick = function22;
        this.$onSellBetClick = function3;
        this.$onSellUnavailableClick = function0;
        this.$onDismiss = function02;
        this.$ticketShareCoordsHolder = betTicketShareLayoutAnchor;
        this.$items$delegate = state;
        this.$oddTye$delegate = state2;
        this.$isRewardAddButtonEnabled$delegate = state3;
        this.$videoRewardAmount$delegate = state4;
        this.$cancelBetInfo$delegate = state5;
        this.$sellBetInfo$delegate = state6;
        this.$forShareCapture$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        List BetListDetailsScreen$lambda$16;
        OddType BetListDetailsScreen$lambda$33;
        boolean BetListDetailsScreen$lambda$39;
        long BetListDetailsScreen$lambda$40;
        CancelBetInfoModel BetListDetailsScreen$lambda$85$lambda$84$lambda$80;
        SellBetInfoModel BetListDetailsScreen$lambda$85$lambda$84$lambda$81;
        boolean BetListDetailsScreen$lambda$19;
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1825053995, i2, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreen.<anonymous>.<anonymous>.<anonymous> (BetListDetailsScreen.kt:573)");
        }
        BetListDetailsScreen$lambda$16 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$16(this.$items$delegate);
        final BetsListModel betsListModel = (BetsListModel) CollectionsKt.getOrNull(BetListDetailsScreen$lambda$16, i);
        if (betsListModel == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        boolean z = i == this.$currentPage;
        BetListDetailsScreen$lambda$33 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$33(this.$oddTye$delegate);
        BetListDetailsScreen$lambda$39 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$39(this.$isRewardAddButtonEnabled$delegate);
        BetListDetailsScreen$lambda$40 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$40(this.$videoRewardAmount$delegate);
        BetListDetailsScreen$lambda$85$lambda$84$lambda$80 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$80(this.$cancelBetInfo$delegate);
        BetListDetailsScreen$lambda$85$lambda$84$lambda$81 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$85$lambda$84$lambda$81(this.$sellBetInfo$delegate);
        BetListDetailsScreen$lambda$19 = BetListDetailsScreenKt.BetListDetailsScreen$lambda$19(this.$forShareCapture$delegate);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$onClickAddReward) | composer.changedInstance(betsListModel);
        final Function1<Integer, Unit> function1 = this.$onClickAddReward;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = BetListDetailsScreenKt$BetListDetailsScreen$16$3$2.invoke$lambda$1$lambda$0(Function1.this, betsListModel);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        boolean z2 = this.$isViewingOtherUserBets;
        Function2<Integer, MatchState, Unit> function2 = this.$onMatchClick;
        Function2<Long, Long, Unit> function22 = this.$onCancelBetClick;
        Function3<Long, Long, Double, Unit> function3 = this.$onSellBetClick;
        Function0<Unit> function02 = this.$onSellUnavailableClick;
        composer.startReplaceGroup(5004770);
        boolean changed2 = composer.changed(this.$onDismiss);
        final Function0<Unit> function03 = this.$onDismiss;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = BetListDetailsScreenKt$BetListDetailsScreen$16$3$2.invoke$lambda$3$lambda$2(Function0.this, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function2 function23 = (Function2) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.$ticketShareCoordsHolder);
        final BetTicketShareLayoutAnchor betTicketShareLayoutAnchor = this.$ticketShareCoordsHolder;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailsScreenKt$BetListDetailsScreen$16$3$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = BetListDetailsScreenKt$BetListDetailsScreen$16$3$2.invoke$lambda$5$lambda$4(BetTicketShareLayoutAnchor.this, (LayoutCoordinates) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        BetListDetailPagerItemKt.BetListDetailPagerItem(null, betsListModel, BetListDetailsScreen$lambda$33, function0, BetListDetailsScreen$lambda$39, BetListDetailsScreen$lambda$40, z2, function2, BetListDetailsScreen$lambda$85$lambda$84$lambda$80, BetListDetailsScreen$lambda$85$lambda$84$lambda$81, function22, function3, function02, z, function23, BetListDetailsScreen$lambda$19, (Function1) rememberedValue3, composer, 0, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, BetsListModel betsListModel) {
        Integer id = betsListModel.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        function1.invoke(id);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function0 function0, int i, boolean z) {
        function0.invoke();
        NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i, z, (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(BetTicketShareLayoutAnchor betTicketShareLayoutAnchor, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        betTicketShareLayoutAnchor.setCoordinates(it);
        return Unit.INSTANCE;
    }
}
