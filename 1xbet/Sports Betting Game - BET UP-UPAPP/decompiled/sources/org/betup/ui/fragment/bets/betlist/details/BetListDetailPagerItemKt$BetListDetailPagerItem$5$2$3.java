package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.shop.CancelBetInfoModel;
import org.betup.model.remote.entity.shop.SellBetInfoModel;

/* compiled from: BetListDetailPagerItem.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CancelBetInfoModel $cancelBetInfo;
    final /* synthetic */ boolean $forShareCapture;
    final /* synthetic */ boolean $hasActionBottom;
    final /* synthetic */ BetsListModel $item;
    final /* synthetic */ Function2<Long, Long, Unit> $onCancelBetClick;
    final /* synthetic */ Function3<Long, Long, Double, Unit> $onSellBetClick;
    final /* synthetic */ Function0<Unit> $onSellUnavailableClick;
    final /* synthetic */ SellBetInfoModel $sellBetInfo;
    final /* synthetic */ boolean $sellInfoLoaded;
    final /* synthetic */ boolean $sellInteractive;
    final /* synthetic */ long $sellNetReturn;

    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3(boolean z, boolean z2, CancelBetInfoModel cancelBetInfoModel, boolean z3, boolean z4, long j, SellBetInfoModel sellBetInfoModel, Function2<? super Long, ? super Long, Unit> function2, BetsListModel betsListModel, Function3<? super Long, ? super Long, ? super Double, Unit> function3, Function0<Unit> function0) {
        this.$hasActionBottom = z;
        this.$forShareCapture = z2;
        this.$cancelBetInfo = cancelBetInfoModel;
        this.$sellInteractive = z3;
        this.$sellInfoLoaded = z4;
        this.$sellNetReturn = j;
        this.$sellBetInfo = sellBetInfoModel;
        this.$onCancelBetClick = function2;
        this.$item = betsListModel;
        this.$onSellBetClick = function3;
        this.$onSellUnavailableClick = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, BetsListModel betsListModel, CancelBetInfoModel cancelBetInfoModel) {
        function2.invoke(Long.valueOf(betsListModel.getId().intValue()), Long.valueOf(cancelBetInfoModel != null ? cancelBetInfoModel.getMoneyReturn() : 0L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function3 function3, BetsListModel betsListModel, long j, SellBetInfoModel sellBetInfoModel) {
        function3.invoke(Long.valueOf(betsListModel.getId().intValue()), Long.valueOf(j), Double.valueOf(sellBetInfoModel != null ? sellBetInfoModel.getSellCoefficient() : 0.0d));
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        float f;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2048002150, i, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:148)");
        }
        if (!this.$hasActionBottom || this.$forShareCapture) {
            composer.startReplaceGroup(-2020273752);
            Modifier.Companion companion = Modifier.INSTANCE;
            f = BetListDetailPagerItemKt.TicketContentBottomSpacerHeight;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(companion, f), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2021512760);
            CancelBetInfoModel cancelBetInfoModel = this.$cancelBetInfo;
            boolean z = false;
            boolean z2 = cancelBetInfoModel != null && cancelBetInfoModel.isCancelAvailable();
            boolean z3 = this.$sellInteractive;
            if (this.$sellInfoLoaded && !z3) {
                z = true;
            }
            CancelBetInfoModel cancelBetInfoModel2 = this.$cancelBetInfo;
            long moneyReturn = cancelBetInfoModel2 != null ? cancelBetInfoModel2.getMoneyReturn() : 0L;
            long j = this.$sellNetReturn;
            SellBetInfoModel sellBetInfoModel = this.$sellBetInfo;
            double sellCoefficient = sellBetInfoModel != null ? sellBetInfoModel.getSellCoefficient() : 0.0d;
            composer.startReplaceGroup(-1746271574);
            boolean changed = composer.changed(this.$onCancelBetClick) | composer.changedInstance(this.$item) | composer.changedInstance(this.$cancelBetInfo);
            final Function2<Long, Long, Unit> function2 = this.$onCancelBetClick;
            final BetsListModel betsListModel = this.$item;
            final CancelBetInfoModel cancelBetInfoModel3 = this.$cancelBetInfo;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3.invoke$lambda$1$lambda$0(Function2.this, betsListModel, cancelBetInfoModel3);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean changed2 = composer.changed(this.$onSellBetClick) | composer.changedInstance(this.$item) | composer.changed(this.$sellNetReturn) | composer.changedInstance(this.$sellBetInfo);
            final Function3<Long, Long, Double, Unit> function3 = this.$onSellBetClick;
            final BetsListModel betsListModel2 = this.$item;
            double d = sellCoefficient;
            final long j2 = this.$sellNetReturn;
            final SellBetInfoModel sellBetInfoModel2 = this.$sellBetInfo;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$3.invoke$lambda$3$lambda$2(Function3.this, betsListModel2, j2, sellBetInfoModel2);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            BetListDetailPagerItemKt.CancelSellButtonsRow(z2, z3, z, moneyReturn, j, d, function0, (Function0) rememberedValue2, this.$onSellUnavailableClick, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
