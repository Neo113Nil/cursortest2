package org.betup.ui.fragment.bets.betlist.details;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsLeagueModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsSportModel;
import org.betup.ui.common.compose.MatchLeagueItemKt;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt;
import org.betup.ui.fragment.bets.betslip.compose.BetSlipUiModel;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetDimens;
import org.betup.ui.fragment.bets.sheet.compose.items.BetInfoRowKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.fragment.user.compose.components.BattleStatsItemKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.DateHelper;
import org.betup.utils.MatchUtils;
import org.betup.utils.NavigationHelper;
import org.betup.utils.OddHelper;
import org.betup.utils.UiExtensionsKt;

/* compiled from: BetListDetailPagerItem.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $forShareCapture;
    final /* synthetic */ boolean $isViewingOtherUserBets;
    final /* synthetic */ BetsListModel $item;
    final /* synthetic */ OddType $oddTye;
    final /* synthetic */ Function2<Integer, Boolean, Unit> $onLeagueClick;
    final /* synthetic */ Function2<Integer, MatchState, Unit> $onMatchClick;
    final /* synthetic */ Object $returnMoney;

    /* JADX WARN: Multi-variable type inference failed */
    BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2(BetsListModel betsListModel, boolean z, Function2<? super Integer, ? super MatchState, Unit> function2, OddType oddType, Object obj, boolean z2, Function2<? super Integer, ? super Boolean, Unit> function22) {
        this.$item = betsListModel;
        this.$forShareCapture = z;
        this.$onMatchClick = function2;
        this.$oddTye = oddType;
        this.$returnMoney = obj;
        this.$isViewingOtherUserBets = z2;
        this.$onLeagueClick = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$2$lambda$1(Function2 function2, Integer num, BetsPlaceModel betsPlaceModel) {
        if (function2 == null) {
            function2 = new Function2() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0 = BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2.invoke$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
                    return invoke$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0;
                }
            };
        }
        MatchDetailsDataModel sportMatch = betsPlaceModel.getSportMatch();
        Intrinsics.checkNotNullExpressionValue(sportMatch, "getSportMatch(...)");
        function2.invoke(num, Boolean.valueOf(UiExtensionsKt.isLive(sportMatch)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(int i, boolean z) {
        NavigationHelper.navigateToLeagueMatches$default(NavigationHelper.INSTANCE, i, z, (String) null, false, 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$4$lambda$3(Function2 function2, BetsPlaceModel betsPlaceModel) {
        Integer id = betsPlaceModel.getSportMatch().getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        MatchState state = betsPlaceModel.getSportMatch().getState();
        Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
        function2.invoke(id, state);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        String str;
        Iterator it;
        String str2;
        String name;
        String str3;
        MatchDetailsSportModel sport;
        MatchDetailsDataModel sportMatch;
        String photoUrl;
        String str4;
        MatchDetailsSportModel sport2;
        MatchDetailsLeagueModel league;
        MatchDetailsLeagueModel league2;
        String name2;
        int i2;
        String name3;
        String photoUrl2;
        Function0 function0;
        String str5;
        String str6;
        Function2<Integer, MatchState, Unit> function2;
        OddType oddType;
        Object obj;
        boolean z;
        String str7;
        BetsListModel betsListModel;
        String resultRow;
        String formattedDateWithoutYear;
        String str8;
        String time;
        String str9;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        String str10;
        String stringResource;
        String name4;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1887550809, i, -1, "org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItem.<anonymous>.<anonymous>.<anonymous> (BetListDetailPagerItem.kt:177)");
        }
        if (this.$item.getPlacedBets().size() == 1) {
            composer.startReplaceGroup(-1980329983);
            List<BetsPlaceModel> placedBets = this.$item.getPlacedBets();
            Intrinsics.checkNotNullExpressionValue(placedBets, "getPlacedBets(...)");
            final BetsPlaceModel betsPlaceModel = (BetsPlaceModel) CollectionsKt.firstOrNull((List) placedBets);
            if (betsPlaceModel != null) {
                final Function2<Integer, Boolean, Unit> function22 = this.$onLeagueClick;
                Function2<Integer, MatchState, Unit> function23 = this.$onMatchClick;
                BetsListModel betsListModel2 = this.$item;
                OddType oddType2 = this.$oddTye;
                Object obj2 = this.$returnMoney;
                boolean z2 = this.$isViewingOtherUserBets;
                float f = 12;
                Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(8));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1519paddingqDBjuR0);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                MatchDetailsLeagueModel league3 = betsPlaceModel.getSportMatch().getLeague();
                final Integer id = league3 != null ? league3.getId() : null;
                MatchDetailsLeagueModel league4 = betsPlaceModel.getSportMatch().getLeague();
                if ((league4 == null || (name3 = league4.getPhotoUrl()) == null) && (name3 = betsPlaceModel.getSportMatch().getSport().getName()) == null) {
                    name3 = "";
                }
                MatchDetailsLeagueModel league5 = betsPlaceModel.getSportMatch().getLeague();
                if ((league5 == null || (photoUrl2 = league5.getName()) == null) && (photoUrl2 = betsPlaceModel.getSportMatch().getSport().getPhotoUrl()) == null) {
                    photoUrl2 = "";
                }
                composer.startReplaceGroup(-1291969497);
                if (id == null || id.intValue() <= 0) {
                    function0 = null;
                } else {
                    composer.startReplaceGroup(-1746271574);
                    boolean changed = composer.changed(function22) | composer.changed(id) | composer.changedInstance(betsPlaceModel);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$8$lambda$7$lambda$2$lambda$1;
                                invoke$lambda$8$lambda$7$lambda$2$lambda$1 = BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2.invoke$lambda$8$lambda$7$lambda$2$lambda$1(Function2.this, id, betsPlaceModel);
                                return invoke$lambda$8$lambda$7$lambda$2$lambda$1;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    function0 = (Function0) rememberedValue;
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                MatchLeagueItemKt.MatchLeagueItem(null, name3, photoUrl2, false, false, false, function0, composer, 0, 57);
                composer.startReplaceGroup(-1291946603);
                if (betsPlaceModel.getSportMatch().getState() == MatchState.FINISHED) {
                    String date = betsPlaceModel.getSportMatch().getDate();
                    Intrinsics.checkNotNullExpressionValue(date, "getDate(...)");
                    str6 = "format(...)";
                    function2 = function23;
                    oddType = oddType2;
                    obj = obj2;
                    z = z2;
                    betsListModel = betsListModel2;
                    str5 = "getDate(...)";
                    str7 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    TextKt.m2642Text4IGK_g(BattleStatsItemKt.getFormattedDateDDMMYYYY(date) + " | " + DateHelper.getTime(betsPlaceModel.getSportMatch().getDate()), OffsetKt.m1476offsetVpY3zN4$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(2), 0.0f, 0.0f, 13, null), 0.0f, Dp.m7774constructorimpl(10), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 48, 0, 65532);
                } else {
                    str5 = "getDate(...)";
                    str6 = "format(...)";
                    function2 = function23;
                    oddType = oddType2;
                    obj = obj2;
                    z = z2;
                    str7 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    betsListModel = betsListModel2;
                }
                composer.endReplaceGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final Function2<Integer, MatchState, Unit> function24 = function2;
                boolean changed2 = composer.changed(function24) | composer.changedInstance(betsPlaceModel);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.betlist.details.BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$8$lambda$7$lambda$4$lambda$3;
                            invoke$lambda$8$lambda$7$lambda$4$lambda$3 = BetListDetailPagerItemKt$BetListDetailPagerItem$5$2$2.invoke$lambda$8$lambda$7$lambda$4$lambda$3(Function2.this, betsPlaceModel);
                            return invoke$lambda$8$lambda$7$lambda$4$lambda$3;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue2, 7, null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1059clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                String str11 = str7;
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                String name5 = betsPlaceModel.getSportMatch().getHomeTeam().getName();
                Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                String name6 = betsPlaceModel.getSportMatch().getAwayTeam().getName();
                Intrinsics.checkNotNullExpressionValue(name6, "getName(...)");
                String photoUrl3 = betsPlaceModel.getSportMatch().getHomeTeam().getPhotoUrl();
                String str12 = photoUrl3 == null ? "" : photoUrl3;
                String photoUrl4 = betsPlaceModel.getSportMatch().getAwayTeam().getPhotoUrl();
                String str13 = photoUrl4 == null ? "" : photoUrl4;
                Float scoreHome = betsPlaceModel.getSportMatch().getScoreHome();
                String num = scoreHome != null ? Integer.valueOf((int) scoreHome.floatValue()).toString() : null;
                Float scoreAway = betsPlaceModel.getSportMatch().getScoreAway();
                String num2 = scoreAway != null ? Integer.valueOf((int) scoreAway.floatValue()).toString() : null;
                String extractPeriodScoresFromResultRaw = ((betsPlaceModel.getSportMatch().getState() != MatchState.FINISHED && betsPlaceModel.getSportMatch().getState() != MatchState.LIVE) || (resultRow = betsPlaceModel.getSportMatch().getResultRow()) == null || StringsKt.isBlank(resultRow)) ? null : MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(betsPlaceModel.getSportMatch().getResultRow());
                if (!UiExtensionsKt.isStarted(betsPlaceModel)) {
                    String date2 = betsPlaceModel.getSportMatch().getDate();
                    Intrinsics.checkNotNullExpressionValue(date2, str5);
                    formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(date2);
                } else if (betsPlaceModel.getSportMatch().getState() != MatchState.FINISHED) {
                    String date3 = betsPlaceModel.getSportMatch().getDate();
                    Intrinsics.checkNotNullExpressionValue(date3, str5);
                    formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(date3);
                } else if (betsPlaceModel.getSportMatch().getState() == MatchState.LIVE) {
                    formattedDateWithoutYear = UiExtensionsKt.normalizeMatchTime(betsPlaceModel.getSportMatch().getCurrentTime());
                } else {
                    str8 = "";
                    if (UiExtensionsKt.isStarted(betsPlaceModel)) {
                        time = DateHelper.getTime(betsPlaceModel.getSportMatch().getDate());
                    } else if (betsPlaceModel.getSportMatch().getState() != MatchState.FINISHED) {
                        time = DateHelper.getTime(betsPlaceModel.getSportMatch().getDate());
                    } else if (betsPlaceModel.getSportMatch().getState() == MatchState.LIVE) {
                        time = UiExtensionsKt.normalizeMatchTime(betsPlaceModel.getSportMatch().getCurrentPeriod());
                    } else {
                        str9 = "";
                        TeamsRowKt.m13615TeamsRowUiefj4(null, name5, name6, str12, str13, num, num2, extractPeriodScoresFromResultRaw, str8, str9, null, true, UiExtensionsKt.isStarted(betsPlaceModel), false, false, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 0, 48, 0, 8381441);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        float f2 = 15;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f2), 0.0f, Dp.m7774constructorimpl(f2), 5, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13544getBetCardCornerRadiusD9Ej5fM())), QuickBetDimens.INSTANCE.m13545getBetCardHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13547getBetCardVerticalPaddingD9Ej5fM());
                        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        BetGroupModel betGroup = betsPlaceModel.getBetGroup();
                        String str14 = (betGroup != null || (name4 = betGroup.getName()) == null) ? null : name4.toString();
                        String str15 = str14 == null ? "" : str14;
                        String betName = betsPlaceModel.getBetName();
                        Intrinsics.checkNotNullExpressionValue(betName, "getBetName(...)");
                        Double placedCoeficient = betsPlaceModel.getPlacedCoeficient();
                        Intrinsics.checkNotNullExpressionValue(placedCoeficient, "getPlacedCoeficient(...)");
                        double doubleValue = placedCoeficient.doubleValue();
                        BetState state = betsPlaceModel.getState();
                        Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
                        BetInfoRowKt.m13598BetInfoRowTVReaoo(null, str15, betName, doubleValue, oddType, UiExtensionsKt.getTextColor(state), true, betsPlaceModel.getBetsGameType(), null, false, false, QuickBetDimens.INSTANCE.m13548getBetCoefficientFontSizeXSAIIZE(), composer, 1572864, 48, 1793);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        int moneyPlaced = (int) betsListModel.getMoneyPlaced();
                        Double placedCoeficient2 = betsPlaceModel.getPlacedCoeficient();
                        Intrinsics.checkNotNullExpressionValue(placedCoeficient2, "getPlacedCoeficient(...)");
                        String format = OddHelper.format(oddType, placedCoeficient2.doubleValue());
                        Intrinsics.checkNotNullExpressionValue(format, str6);
                        int intValue = ((Number) obj).intValue();
                        BetState state2 = betsPlaceModel.getState();
                        Intrinsics.checkNotNullExpressionValue(state2, "getState(...)");
                        long textColor = UiExtensionsKt.getTextColor(state2);
                        if (z || betsListModel.getState() != BetState.WON) {
                            composer2 = composer;
                            if (betsListModel.getState() == BetState.WON) {
                                composer2.startReplaceGroup(-1291731085);
                                stringResource = StringResources_androidKt.stringResource(R.string.you_won, composer2, 6);
                                composer.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1388882454);
                                composer.endReplaceGroup();
                                str10 = null;
                                BetHistoryDetailsSummaryKt.m13456BetHistoryDetailsSummary3f6hBDE(null, moneyPlaced, format, intValue, textColor, str10, false, composer, 1572864, 1);
                                composer2.startReplaceGroup(-1291725064);
                                if (z || betsListModel.getState() != BetState.LOST) {
                                    BetState state3 = betsListModel.getState();
                                    Intrinsics.checkNotNullExpressionValue(state3, "getState(...)");
                                    BetTicketOutcomeLineKt.BetTicketOutcomeLine(state3, betsListModel.getMoneyPlaced(), betsListModel.getFinalCoeficient(), betsListModel.getMoneyReturned(), null, composer, 0, 16);
                                }
                                composer.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                Unit unit = Unit.INSTANCE;
                                Unit unit2 = Unit.INSTANCE;
                            }
                        } else {
                            composer2 = composer;
                            composer2.startReplaceGroup(-1291737075);
                            stringResource = StringResources_androidKt.stringResource(R.string.bet_state_won_short, composer2, 6);
                            composer.endReplaceGroup();
                        }
                        str10 = stringResource;
                        BetHistoryDetailsSummaryKt.m13456BetHistoryDetailsSummary3f6hBDE(null, moneyPlaced, format, intValue, textColor, str10, false, composer, 1572864, 1);
                        composer2.startReplaceGroup(-1291725064);
                        if (z) {
                        }
                        BetState state32 = betsListModel.getState();
                        Intrinsics.checkNotNullExpressionValue(state32, "getState(...)");
                        BetTicketOutcomeLineKt.BetTicketOutcomeLine(state32, betsListModel.getMoneyPlaced(), betsListModel.getFinalCoeficient(), betsListModel.getMoneyReturned(), null, composer, 0, 16);
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        Unit unit3 = Unit.INSTANCE;
                        Unit unit22 = Unit.INSTANCE;
                    }
                    str9 = time;
                    TeamsRowKt.m13615TeamsRowUiefj4(null, name5, name6, str12, str13, num, num2, extractPeriodScoresFromResultRaw, str8, str9, null, true, UiExtensionsKt.isStarted(betsPlaceModel), false, false, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 0, 48, 0, 8381441);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    float f22 = 15;
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f22), 0.0f, Dp.m7774constructorimpl(f22), 5, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13544getBetCardCornerRadiusD9Ej5fM())), QuickBetDimens.INSTANCE.m13545getBetCardHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13547getBetCardVerticalPaddingD9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN42);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
                    if (!(composer.getApplier() instanceof Applier)) {
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(composer);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    BetGroupModel betGroup2 = betsPlaceModel.getBetGroup();
                    if (betGroup2 != null) {
                    }
                    if (str14 == null) {
                    }
                    String betName2 = betsPlaceModel.getBetName();
                    Intrinsics.checkNotNullExpressionValue(betName2, "getBetName(...)");
                    Double placedCoeficient3 = betsPlaceModel.getPlacedCoeficient();
                    Intrinsics.checkNotNullExpressionValue(placedCoeficient3, "getPlacedCoeficient(...)");
                    double doubleValue2 = placedCoeficient3.doubleValue();
                    BetState state4 = betsPlaceModel.getState();
                    Intrinsics.checkNotNullExpressionValue(state4, "getState(...)");
                    BetInfoRowKt.m13598BetInfoRowTVReaoo(null, str15, betName2, doubleValue2, oddType, UiExtensionsKt.getTextColor(state4), true, betsPlaceModel.getBetsGameType(), null, false, false, QuickBetDimens.INSTANCE.m13548getBetCoefficientFontSizeXSAIIZE(), composer, 1572864, 48, 1793);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    int moneyPlaced2 = (int) betsListModel.getMoneyPlaced();
                    Double placedCoeficient22 = betsPlaceModel.getPlacedCoeficient();
                    Intrinsics.checkNotNullExpressionValue(placedCoeficient22, "getPlacedCoeficient(...)");
                    String format2 = OddHelper.format(oddType, placedCoeficient22.doubleValue());
                    Intrinsics.checkNotNullExpressionValue(format2, str6);
                    int intValue2 = ((Number) obj).intValue();
                    BetState state22 = betsPlaceModel.getState();
                    Intrinsics.checkNotNullExpressionValue(state22, "getState(...)");
                    long textColor2 = UiExtensionsKt.getTextColor(state22);
                    if (z) {
                    }
                    composer2 = composer;
                    if (betsListModel.getState() == BetState.WON) {
                    }
                }
                str8 = formattedDateWithoutYear;
                if (UiExtensionsKt.isStarted(betsPlaceModel)) {
                }
                str9 = time;
                TeamsRowKt.m13615TeamsRowUiefj4(null, name5, name6, str12, str13, num, num2, extractPeriodScoresFromResultRaw, str8, str9, null, true, UiExtensionsKt.isStarted(betsPlaceModel), false, false, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 0, 48, 0, 8381441);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                float f222 = 15;
                Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f222), 0.0f, Dp.m7774constructorimpl(f222), 5, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13544getBetCardCornerRadiusD9Ej5fM())), QuickBetDimens.INSTANCE.m13545getBetCardHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13547getBetCardVerticalPaddingD9Ej5fM());
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap322 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN422);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str11);
                if (!(composer.getApplier() instanceof Applier)) {
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                BetGroupModel betGroup22 = betsPlaceModel.getBetGroup();
                if (betGroup22 != null) {
                }
                if (str14 == null) {
                }
                String betName22 = betsPlaceModel.getBetName();
                Intrinsics.checkNotNullExpressionValue(betName22, "getBetName(...)");
                Double placedCoeficient32 = betsPlaceModel.getPlacedCoeficient();
                Intrinsics.checkNotNullExpressionValue(placedCoeficient32, "getPlacedCoeficient(...)");
                double doubleValue22 = placedCoeficient32.doubleValue();
                BetState state42 = betsPlaceModel.getState();
                Intrinsics.checkNotNullExpressionValue(state42, "getState(...)");
                BetInfoRowKt.m13598BetInfoRowTVReaoo(null, str15, betName22, doubleValue22, oddType, UiExtensionsKt.getTextColor(state42), true, betsPlaceModel.getBetsGameType(), null, false, false, QuickBetDimens.INSTANCE.m13548getBetCoefficientFontSizeXSAIIZE(), composer, 1572864, 48, 1793);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                int moneyPlaced22 = (int) betsListModel.getMoneyPlaced();
                Double placedCoeficient222 = betsPlaceModel.getPlacedCoeficient();
                Intrinsics.checkNotNullExpressionValue(placedCoeficient222, "getPlacedCoeficient(...)");
                String format22 = OddHelper.format(oddType, placedCoeficient222.doubleValue());
                Intrinsics.checkNotNullExpressionValue(format22, str6);
                int intValue22 = ((Number) obj).intValue();
                BetState state222 = betsPlaceModel.getState();
                Intrinsics.checkNotNullExpressionValue(state222, "getState(...)");
                long textColor22 = UiExtensionsKt.getTextColor(state222);
                if (z) {
                }
                composer2 = composer;
                if (betsListModel.getState() == BetState.WON) {
                }
            }
            composer.endReplaceGroup();
        } else {
            String str16 = "getName(...)";
            composer.startReplaceGroup(-1971596818);
            float f3 = 12;
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null).then(this.$forShareCapture ? Modifier.INSTANCE : SizeKt.m1551heightInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(310), 1, null)), Dp.m7774constructorimpl(f3), 0.0f, 2, null);
            List<BetsPlaceModel> placedBets2 = this.$item.getPlacedBets();
            Intrinsics.checkNotNullExpressionValue(placedBets2, "getPlacedBets(...)");
            List<BetsPlaceModel> list = placedBets2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                BetsPlaceModel betsPlaceModel2 = (BetsPlaceModel) it2.next();
                Intrinsics.checkNotNull(betsPlaceModel2);
                if (UiExtensionsKt.isStarted(betsPlaceModel2)) {
                    String resultRow2 = betsPlaceModel2.getSportMatch().getResultRow();
                    String str17 = resultRow2;
                    if (str17 == null || StringsKt.isBlank(str17)) {
                        it = it2;
                        Float scoreHome2 = betsPlaceModel2.getSportMatch().getScoreHome();
                        int floatValue = scoreHome2 != null ? (int) scoreHome2.floatValue() : 0;
                        Float scoreAway2 = betsPlaceModel2.getSportMatch().getScoreAway();
                        resultRow2 = floatValue + "-" + (scoreAway2 != null ? (int) scoreAway2.floatValue() : 0);
                    } else {
                        String extractPeriodScoresFromResultRaw2 = MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(resultRow2);
                        Float scoreHome3 = betsPlaceModel2.getSportMatch().getScoreHome();
                        int floatValue2 = scoreHome3 != null ? (int) scoreHome3.floatValue() : 0;
                        Float scoreAway3 = betsPlaceModel2.getSportMatch().getScoreAway();
                        if (scoreAway3 != null) {
                            i2 = (int) scoreAway3.floatValue();
                            it = it2;
                        } else {
                            it = it2;
                            i2 = 0;
                        }
                        String str18 = floatValue2 + "-" + i2;
                        if (extractPeriodScoresFromResultRaw2 != null) {
                            resultRow2 = str18 + " (" + extractPeriodScoresFromResultRaw2 + ")";
                        }
                    }
                    str2 = resultRow2;
                } else {
                    it = it2;
                    str2 = null;
                }
                long intValue3 = betsPlaceModel2.getSportMatch().getId().intValue();
                String date4 = betsPlaceModel2.getSportMatch().getDate();
                Intrinsics.checkNotNullExpressionValue(date4, "getDate(...)");
                String name7 = betsPlaceModel2.getSportMatch().getHomeTeam().getName();
                Intrinsics.checkNotNullExpressionValue(name7, str16);
                String name8 = betsPlaceModel2.getSportMatch().getAwayTeam().getName();
                Intrinsics.checkNotNullExpressionValue(name8, str16);
                String str19 = str16;
                String betName3 = betsPlaceModel2.getBetName();
                Intrinsics.checkNotNullExpressionValue(betName3, "getBetName(...)");
                Double placedCoeficient4 = betsPlaceModel2.getPlacedCoeficient();
                Intrinsics.checkNotNullExpressionValue(placedCoeficient4, "getPlacedCoeficient(...)");
                double doubleValue3 = placedCoeficient4.doubleValue();
                MatchState state5 = betsPlaceModel2.getSportMatch().getState();
                Intrinsics.checkNotNullExpressionValue(state5, "getState(...)");
                BetState state6 = betsPlaceModel2.getState();
                BetGroupModel betGroup3 = betsPlaceModel2.getBetGroup();
                String str20 = (betGroup3 == null || (name2 = betGroup3.getName()) == null) ? "" : name2;
                MatchDetailsDataModel sportMatch2 = betsPlaceModel2.getSportMatch();
                if (sportMatch2 == null || (league2 = sportMatch2.getLeague()) == null || (name = league2.getName()) == null) {
                    MatchDetailsDataModel sportMatch3 = betsPlaceModel2.getSportMatch();
                    name = (sportMatch3 == null || (sport = sportMatch3.getSport()) == null) ? null : sport.getName();
                    if (name == null) {
                        str3 = "";
                        sportMatch = betsPlaceModel2.getSportMatch();
                        if (sportMatch != null || (league = sportMatch.getLeague()) == null || (photoUrl = league.getPhotoUrl()) == null) {
                            MatchDetailsDataModel sportMatch4 = betsPlaceModel2.getSportMatch();
                            photoUrl = (sportMatch4 != null || (sport2 = sportMatch4.getSport()) == null) ? null : sport2.getPhotoUrl();
                            if (photoUrl == null) {
                                str4 = "";
                                String betsGameType = betsPlaceModel2.getBetsGameType();
                                arrayList.add(new BetSlipUiModel(null, Long.valueOf(intValue3), true, false, false, date4, name7, name8, betName3, doubleValue3, state5, state6, str20, null, str3, str4, str2, (betsGameType != null || betsGameType.length() <= 0) ? null : betsGameType, 24, null));
                                it2 = it;
                                str16 = str19;
                            }
                        }
                        str4 = photoUrl;
                        String betsGameType2 = betsPlaceModel2.getBetsGameType();
                        arrayList.add(new BetSlipUiModel(null, Long.valueOf(intValue3), true, false, false, date4, name7, name8, betName3, doubleValue3, state5, state6, str20, null, str3, str4, str2, (betsGameType2 != null || betsGameType2.length() <= 0) ? null : betsGameType2, 24, null));
                        it2 = it;
                        str16 = str19;
                    }
                }
                str3 = name;
                sportMatch = betsPlaceModel2.getSportMatch();
                if (sportMatch != null) {
                }
                MatchDetailsDataModel sportMatch42 = betsPlaceModel2.getSportMatch();
                if (sportMatch42 != null) {
                }
                if (photoUrl == null) {
                }
                str4 = photoUrl;
                String betsGameType22 = betsPlaceModel2.getBetsGameType();
                arrayList.add(new BetSlipUiModel(null, Long.valueOf(intValue3), true, false, false, date4, name7, name8, betName3, doubleValue3, state5, state6, str20, null, str3, str4, str2, (betsGameType22 != null || betsGameType22.length() <= 0) ? null : betsGameType22, 24, null));
                it2 = it;
                str16 = str19;
            }
            BetSlipListUiKt.BetSlipListUi(m1518paddingVpY3zN4$default, null, this.$onMatchClick, arrayList, this.$oddTye, false, true, this.$forShareCapture, composer, 1769472, 2);
            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f3), 0.0f, 2, null);
            int moneyPlaced3 = (int) this.$item.getMoneyPlaced();
            OddType oddType3 = this.$oddTye;
            Double finalCoeficient = this.$item.getFinalCoeficient();
            Intrinsics.checkNotNullExpressionValue(finalCoeficient, "getFinalCoeficient(...)");
            String format3 = OddHelper.format(oddType3, finalCoeficient.doubleValue());
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            int intValue4 = ((Number) this.$returnMoney).intValue();
            BetState state7 = this.$item.getState();
            Intrinsics.checkNotNullExpressionValue(state7, "getState(...)");
            long textColor3 = UiExtensionsKt.getTextColor(state7);
            if (this.$isViewingOtherUserBets && this.$item.getState() == BetState.WON) {
                composer.startReplaceGroup(1460536933);
                str = StringResources_androidKt.stringResource(R.string.bet_state_won_short, composer, 6);
                composer.endReplaceGroup();
            } else if (this.$item.getState() == BetState.WON) {
                composer.startReplaceGroup(1460540217);
                str = StringResources_androidKt.stringResource(R.string.you_won, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1967825948);
                composer.endReplaceGroup();
                str = null;
            }
            BetHistoryDetailsSummaryKt.m13456BetHistoryDetailsSummary3f6hBDE(m1518paddingVpY3zN4$default2, moneyPlaced3, format3, intValue4, textColor3, str, false, composer, 6, 64);
            if (!this.$isViewingOtherUserBets || this.$item.getState() != BetState.LOST) {
                Modifier m1518paddingVpY3zN4$default3 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f3), 0.0f, 2, null);
                BetState state8 = this.$item.getState();
                Intrinsics.checkNotNullExpressionValue(state8, "getState(...)");
                BetTicketOutcomeLineKt.BetTicketOutcomeLine(state8, this.$item.getMoneyPlaced(), this.$item.getFinalCoeficient(), this.$item.getMoneyReturned(), m1518paddingVpY3zN4$default3, composer, 24576, 0);
            }
            composer.endReplaceGroup();
            Unit unit4 = Unit.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
