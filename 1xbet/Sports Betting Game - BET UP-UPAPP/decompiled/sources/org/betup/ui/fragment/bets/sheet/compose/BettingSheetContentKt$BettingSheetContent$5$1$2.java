package org.betup.ui.fragment.bets.sheet.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetDataModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;
import org.betup.ui.fragment.bets.betslip.adapter.model.BetModel;
import org.betup.ui.fragment.bets.sheet.compose.items.BetInfoRowKt;
import org.betup.ui.fragment.bets.sheet.compose.items.PotentialReturnCardKt;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetStakeControlsKt;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTab;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.DateHelper;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BettingSheetContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BettingSheetContentKt$BettingSheetContent$5$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ long $amount;
    final /* synthetic */ State<BetModel> $bet$delegate;
    final /* synthetic */ List<BetModel> $bets;
    final /* synthetic */ long $effectiveMinBet;
    final /* synthetic */ boolean $isChallengeAllowed;
    final /* synthetic */ State<Boolean> $isInvalid$delegate;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ OddType $oddType;
    final /* synthetic */ Function1<Long, Unit> $onAmountChange;
    final /* synthetic */ MutableState<QuickBetTab> $selectedTab$delegate;
    final /* synthetic */ long $userAmount;

    /* compiled from: BettingSheetContent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BetModel.stat.values().length];
            try {
                iArr[BetModel.stat.INCREASED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetModel.stat.DECREASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QuickBetTab.values().length];
            try {
                iArr2[QuickBetTab.BATTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[QuickBetTab.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[QuickBetTab.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    BettingSheetContentKt$BettingSheetContent$5$1$2(boolean z, long j, long j2, long j3, Function1<? super Long, Unit> function1, boolean z2, List<? extends BetModel> list, State<? extends BetModel> state, OddType oddType, State<Boolean> state2, MutableState<QuickBetTab> mutableState) {
        this.$isChallengeAllowed = z;
        this.$amount = j;
        this.$userAmount = j2;
        this.$effectiveMinBet = j3;
        this.$onAmountChange = function1;
        this.$isLoading = z2;
        this.$bets = list;
        this.$bet$delegate = state;
        this.$oddType = oddType;
        this.$isInvalid$delegate = state2;
        this.$selectedTab$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5(MutableState mutableState, QuickBetTab it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        String str;
        String formattedDateWithoutYear;
        OddType oddType;
        State<BetModel> state;
        String str2;
        long j;
        MutableState<QuickBetTab> mutableState;
        State<Boolean> state2;
        String str3;
        long j2;
        long j3;
        String str4;
        boolean z;
        String str5;
        BetModel BettingSheetContent$lambda$14;
        BetModel BettingSheetContent$lambda$142;
        BetModel BettingSheetContent$lambda$143;
        BetModel BettingSheetContent$lambda$144;
        boolean BettingSheetContent$lambda$23;
        BetModel BettingSheetContent$lambda$145;
        Boolean bool;
        QuickBetTab BettingSheetContent$lambda$25;
        final MutableState<QuickBetTab> mutableState2;
        QuickBetTab BettingSheetContent$lambda$252;
        Composer composer2;
        Long l;
        int i2;
        QuickBetTab BettingSheetContent$lambda$253;
        long j4;
        BetModel BettingSheetContent$lambda$146;
        long j5;
        MatchDetailsBetDataModel bet;
        QuickBetTab BettingSheetContent$lambda$254;
        BetModel.stat status;
        MatchDetailsBetDataModel bet2;
        MatchDetailsBetDataModel bet3;
        MatchDetailsBetDataModel bet4;
        MatchDetailsBetGroupModel betGroup;
        MatchDetailsBetDataModel bet5;
        SubMatchModel subMatch;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1736631878, i, -1, "org.betup.ui.fragment.bets.sheet.compose.BettingSheetContent.<anonymous>.<anonymous>.<anonymous> (BettingSheetContent.kt:259)");
        }
        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(Modifier.INSTANCE, QuickBetDimens.INSTANCE.m13549getContentHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13550getContentVerticalPaddingD9Ej5fM());
        boolean z2 = this.$isChallengeAllowed;
        long j6 = this.$amount;
        long j7 = this.$userAmount;
        long j8 = this.$effectiveMinBet;
        Function1<Long, Unit> function1 = this.$onAmountChange;
        boolean z3 = this.$isLoading;
        List<BetModel> list = this.$bets;
        State<BetModel> state3 = this.$bet$delegate;
        OddType oddType2 = this.$oddType;
        State<Boolean> state4 = this.$isInvalid$delegate;
        MutableState<QuickBetTab> mutableState3 = this.$selectedTab$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN4);
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
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (z3) {
            composer.startReplaceGroup(637793106);
            BettingSheetLoadingStateKt.BettingSheetLoadingState(null, composer, 0, 1);
            composer.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            str3 = "C72@3468L9:Box.kt#2w3rfo";
            j2 = j7;
            j3 = j6;
            str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
            str5 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
            oddType = oddType2;
            str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
            j = j8;
            state2 = state4;
            mutableState = mutableState3;
            state = state3;
            z = z2;
        } else {
            composer.startReplaceGroup(637942464);
            BetModel betModel = (BetModel) CollectionsKt.firstOrNull((List) list);
            if (betModel == null) {
                str3 = "C72@3468L9:Box.kt#2w3rfo";
                j2 = j7;
                j3 = j6;
                str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                str5 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                oddType = oddType2;
                str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                j = j8;
                state2 = state4;
                mutableState = mutableState3;
                state = state3;
                z = z2;
            } else {
                MatchDetailsDataModel match = betModel.getMatch();
                Intrinsics.checkNotNullExpressionValue(match, "getMatch(...)");
                boolean isLive = UiExtensionsKt.isLive(match);
                String name = betModel.getMatch().getHomeTeam().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String name2 = betModel.getMatch().getAwayTeam().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                String photoUrl = betModel.getMatch().getHomeTeam().getPhotoUrl();
                String str6 = photoUrl == null ? "" : photoUrl;
                String photoUrl2 = betModel.getMatch().getAwayTeam().getPhotoUrl();
                String str7 = photoUrl2 == null ? "" : photoUrl2;
                Float scoreHome = betModel.getMatch().getScoreHome();
                String num = scoreHome != null ? Integer.valueOf((int) scoreHome.floatValue()).toString() : null;
                Float scoreAway = betModel.getMatch().getScoreAway();
                String num2 = scoreAway != null ? Integer.valueOf((int) scoreAway.floatValue()).toString() : null;
                if (isLive) {
                    str = "C72@3468L9:Box.kt#2w3rfo";
                    formattedDateWithoutYear = UiExtensionsKt.normalizeMatchTime(betModel.getMatch().getCurrentPeriod());
                } else {
                    String date = betModel.getMatch().getDate();
                    str = "C72@3468L9:Box.kt#2w3rfo";
                    Intrinsics.checkNotNullExpressionValue(date, "getDate(...)");
                    formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(date);
                }
                String normalizeMatchTime = isLive ? UiExtensionsKt.normalizeMatchTime(betModel.getMatch().getCurrentTime()) : DateHelper.getTime(betModel.getMatch().getDate());
                MatchDetailsDataModel match2 = betModel.getMatch();
                Intrinsics.checkNotNullExpressionValue(match2, "getMatch(...)");
                oddType = oddType2;
                state = state3;
                str2 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                j = j8;
                mutableState = mutableState3;
                state2 = state4;
                str3 = str;
                j2 = j7;
                j3 = j6;
                str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                z = z2;
                str5 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                TeamsRowKt.m13615TeamsRowUiefj4(null, name, name2, str6, str7, num, num2, null, formattedDateWithoutYear, normalizeMatchTime, null, false, UiExtensionsKt.isStarted(match2), false, false, false, false, 0, null, null, QuickBetDimens.INSTANCE.m13587getTeamImageSizeD9Ej5fM(), QuickBetDimens.INSTANCE.m13588getTeamsRowPaddingD9Ej5fM(), false, composer, 0, 0, 54, 5237889);
                Unit unit2 = Unit.INSTANCE;
                Unit unit3 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        String[] strArr = new String[2];
        BettingSheetContent$lambda$14 = BettingSheetContentKt.BettingSheetContent$lambda$14(state);
        String name3 = (BettingSheetContent$lambda$14 == null || (bet5 = BettingSheetContent$lambda$14.getBet()) == null || (subMatch = bet5.getSubMatch()) == null) ? null : subMatch.getName();
        if (name3 == null) {
            name3 = "";
        }
        strArr[0] = name3;
        BettingSheetContent$lambda$142 = BettingSheetContentKt.BettingSheetContent$lambda$14(state);
        String name4 = (BettingSheetContent$lambda$142 == null || (bet4 = BettingSheetContent$lambda$142.getBet()) == null || (betGroup = bet4.getBetGroup()) == null) ? null : betGroup.getName();
        if (name4 == null) {
            name4 = "";
        }
        strArr[1] = name4;
        List listOf = CollectionsKt.listOf((Object[]) strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, " · ", null, null, 0, null, null, 62, null);
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, QuickBetDimens.INSTANCE.m13546getBetCardTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(QuickBetDimens.INSTANCE.m13544getBetCardCornerRadiusD9Ej5fM())), QuickBetDimens.INSTANCE.m13545getBetCardHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13547getBetCardVerticalPaddingD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, str5);
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str4);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, str3);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        BettingSheetContent$lambda$143 = BettingSheetContentKt.BettingSheetContent$lambda$14(state);
        String betName = (BettingSheetContent$lambda$143 == null || (bet3 = BettingSheetContent$lambda$143.getBet()) == null) ? null : bet3.getBetName();
        String str8 = betName != null ? betName : "";
        BettingSheetContent$lambda$144 = BettingSheetContentKt.BettingSheetContent$lambda$14(state);
        double d = 0.0d;
        double grabbedCoeficient = (BettingSheetContent$lambda$144 == null || (bet2 = BettingSheetContent$lambda$144.getBet()) == null) ? 0.0d : bet2.getGrabbedCoeficient();
        BettingSheetContent$lambda$23 = BettingSheetContentKt.BettingSheetContent$lambda$23(state2);
        long m13548getBetCoefficientFontSizeXSAIIZE = QuickBetDimens.INSTANCE.m13548getBetCoefficientFontSizeXSAIIZE();
        BettingSheetContent$lambda$145 = BettingSheetContentKt.BettingSheetContent$lambda$14(state);
        if (BettingSheetContent$lambda$145 == null || (status = BettingSheetContent$lambda$145.getStatus()) == null) {
            bool = null;
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            bool = i3 != 1 ? i3 != 2 ? null : false : true;
        }
        BetInfoRowKt.m13598BetInfoRowTVReaoo(null, joinToString$default, str8, grabbedCoeficient, oddType, 0L, false, null, bool, false, BettingSheetContent$lambda$23, m13548getBetCoefficientFontSizeXSAIIZE, composer, 806879232, 48, Opcodes.IF_ICMPLT);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, QuickBetDimens.INSTANCE.m13586getTabsTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
        BettingSheetContent$lambda$25 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState);
        composer.startReplaceGroup(5004770);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            mutableState2 = mutableState;
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.sheet.compose.BettingSheetContentKt$BettingSheetContent$5$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$7$lambda$6$lambda$5;
                    invoke$lambda$7$lambda$6$lambda$5 = BettingSheetContentKt$BettingSheetContent$5$1$2.invoke$lambda$7$lambda$6$lambda$5(MutableState.this, (QuickBetTab) obj2);
                    return invoke$lambda$7$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        } else {
            mutableState2 = mutableState;
        }
        composer.endReplaceGroup();
        QuickBetTabSelectorKt.QuickBetTabSelector(BettingSheetContent$lambda$25, (Function1) rememberedValue, m1520paddingqDBjuR0$default, z, composer, 432, 0);
        BettingSheetContent$lambda$252 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState2);
        int i4 = WhenMappings.$EnumSwitchMapping$1[BettingSheetContent$lambda$252.ordinal()];
        if (i4 != 1) {
            i2 = 2;
            if (i4 != 2) {
                if (i4 != 3) {
                    composer.startReplaceGroup(1028605775);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1823415014);
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.quick_bet_multibet_hint, composer, 6), PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), QuickBetDimens.INSTANCE.m13556getMultiHintHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13557getMultiHintTopPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13556getMultiHintHorizontalPaddingD9Ej5fM(), QuickBetDimens.INSTANCE.m13554getMultiHintBottomPaddingD9Ej5fM()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), QuickBetDimens.INSTANCE.m13555getMultiHintFontSizeXSAIIZE(), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer, 0, 0, 65532);
                composer.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
            composer2 = composer;
            l = null;
        } else {
            composer2 = composer;
            l = null;
            i2 = 2;
        }
        composer2.startReplaceGroup(1822053959);
        Long l2 = l;
        QuickBetStakeControlsKt.QuickBetStakeControls(j3, j2, j, function1, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, QuickBetDimens.INSTANCE.m13573getSectionTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 24576, 0);
        BettingSheetContent$lambda$253 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState2);
        if (WhenMappings.$EnumSwitchMapping$1[BettingSheetContent$lambda$253.ordinal()] == 1) {
            j4 = j3;
            j5 = j4 * i2;
        } else {
            j4 = j3;
            BettingSheetContent$lambda$146 = BettingSheetContentKt.BettingSheetContent$lambda$14(state);
            if (BettingSheetContent$lambda$146 != null && (bet = BettingSheetContent$lambda$146.getBet()) != null) {
                d = bet.getGrabbedCoeficient();
            }
            j5 = (long) (j4 * d);
        }
        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, QuickBetDimens.INSTANCE.m13573getSectionTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
        BettingSheetContent$lambda$254 = BettingSheetContentKt.BettingSheetContent$lambda$25(mutableState2);
        PotentialReturnCardKt.PotentialReturnCard(j5, m1520paddingqDBjuR0$default2, BettingSheetContent$lambda$254 == QuickBetTab.SINGLE ? Long.valueOf(RangesKt.coerceAtLeast(j5 - j4, 0L)) : l2, composer, 48, 0);
        composer.endReplaceGroup();
        Unit unit5 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
