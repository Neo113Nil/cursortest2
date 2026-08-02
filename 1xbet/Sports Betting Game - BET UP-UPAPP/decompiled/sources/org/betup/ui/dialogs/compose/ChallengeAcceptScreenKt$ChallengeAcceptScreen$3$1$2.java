package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.details.LeagueModelShort;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.TeamModelShort;
import org.betup.model.remote.entity.user.ShortUserProfileModel;
import org.betup.ui.MainActivity;
import org.betup.ui.common.compose.MatchLeagueItemKt;
import org.betup.ui.common.compose.slider.BetAmountSliderKt;
import org.betup.ui.dialogs.BattleDialogStateManager;
import org.betup.ui.dialogs.controller.ChallengeAcceptController;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.bets.sheet.compose.BettingSheetLoadingStateKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.utils.MatchUtils;
import org.betup.utils.UiExtensionsKt;

/* compiled from: ChallengeAcceptScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<Long> $amount$delegate;
    final /* synthetic */ BetsController $betsController;
    final /* synthetic */ ChallengeAcceptController $controller;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ State<MatchShortInfoModel> $matchDetails$delegate;
    final /* synthetic */ State<OddType> $oddType$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function2<Integer, Boolean, Unit> $onNavigateToLeague;
    final /* synthetic */ State<String> $secondUserPhoto$delegate;
    final /* synthetic */ ShortUserProfileModel $user;
    final /* synthetic */ State<Long> $userAmount$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2(ChallengeAcceptController challengeAcceptController, ShortUserProfileModel shortUserProfileModel, State<String> state, Function0<Unit> function0, BetsController betsController, State<Boolean> state2, State<MatchShortInfoModel> state3, Function2<? super Integer, ? super Boolean, Unit> function2, State<? extends OddType> state4, State<Long> state5, State<Long> state6) {
        this.$controller = challengeAcceptController;
        this.$user = shortUserProfileModel;
        this.$secondUserPhoto$delegate = state;
        this.$onDismiss = function0;
        this.$betsController = betsController;
        this.$isLoading$delegate = state2;
        this.$matchDetails$delegate = state3;
        this.$onNavigateToLeague = function2;
        this.$oddType$delegate = state4;
        this.$amount$delegate = state5;
        this.$userAmount$delegate = state6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$6$lambda$5$lambda$4$lambda$3(Function2 function2, Integer num, MatchShortInfoModel matchShortInfoModel) {
        function2.invoke(num, Boolean.valueOf(UiExtensionsKt.isLive(matchShortInfoModel)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$8$lambda$7(ChallengeAcceptController challengeAcceptController, Function0 function0, State state) {
        String ChallengeAcceptScreen$lambda$6;
        MainActivity activity = challengeAcceptController.getActivity();
        if (activity != null) {
            BattleDialogStateManager battleDialogStateManager = BattleDialogStateManager.INSTANCE;
            BattleDialogStateManager.DialogType dialogType = BattleDialogStateManager.DialogType.CHALLENGE_ACCEPT;
            Long l = challengeAcceptController.get_matchId();
            Long value = challengeAcceptController.getUserId().getValue();
            Long l2 = challengeAcceptController.get_betId();
            String str = challengeAcceptController.get_betName();
            String groupName = challengeAcceptController.getGroupName();
            String str2 = challengeAcceptController.get_varietyName();
            ChallengeAcceptScreen$lambda$6 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$6(state);
            battleDialogStateManager.storeDialogState(new BattleDialogStateManager.DialogState(dialogType, null, l, value, l2, str, groupName, str2, ChallengeAcceptScreen$lambda$6, null, challengeAcceptController.getCoefficient(), null, null, 6658, null), activity);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$10$lambda$9(ChallengeAcceptController challengeAcceptController, Function0 function0) {
        MainActivity activity = challengeAcceptController.getActivity();
        if (activity != null) {
            BattleDialogStateManager.INSTANCE.storeDialogState(new BattleDialogStateManager.DialogState(BattleDialogStateManager.DialogType.CHALLENGE_ACCEPT, null, challengeAcceptController.get_matchId(), challengeAcceptController.getUserId().getValue(), challengeAcceptController.get_betId(), challengeAcceptController.get_betName(), challengeAcceptController.getGroupName(), challengeAcceptController.get_varietyName(), null, null, challengeAcceptController.getCoefficient(), null, null, 6914, null), activity);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$12$lambda$11(BetsController betsController, long j) {
        betsController.onAmountChange(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14$lambda$13(BetsController betsController, long j) {
        betsController.onAmountChange(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021f, code lost:
    
        if (r3 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023c, code lost:
    
        if (r5 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0257, code lost:
    
        if (r2.intValue() > 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        boolean ChallengeAcceptScreen$lambda$1;
        final MatchShortInfoModel ChallengeAcceptScreen$lambda$2;
        String name;
        String photoUrl;
        final Integer num;
        ShortUserProfileModel shortUserProfileModel;
        State<OddType> state;
        State<Long> state2;
        BetsController betsController;
        Function0<Unit> function0;
        State<String> state3;
        String str;
        String formattedDateWithoutYear;
        String str2;
        String formattedTime;
        ChallengeAcceptController challengeAcceptController;
        float f;
        State<Long> state4;
        Composer composer2;
        String resultRaw;
        String photoUrl2;
        String photoUrl3;
        String name2;
        String name3;
        Function0 function02;
        String ChallengeAcceptScreen$lambda$6;
        String str3;
        double doubleValue;
        OddType ChallengeAcceptScreen$lambda$5;
        final ChallengeAcceptController challengeAcceptController2;
        long ChallengeAcceptScreen$lambda$3;
        long ChallengeAcceptScreen$lambda$4;
        long ChallengeAcceptScreen$lambda$32;
        OddType ChallengeAcceptScreen$lambda$52;
        String ChallengeAcceptScreen$lambda$62;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225504206, i, -1, "org.betup.ui.dialogs.compose.ChallengeAcceptScreen.<anonymous>.<anonymous>.<anonymous> (ChallengeAcceptScreen.kt:237)");
        }
        float f2 = 12;
        float f3 = 6;
        Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3));
        ChallengeAcceptController challengeAcceptController3 = this.$controller;
        ShortUserProfileModel shortUserProfileModel2 = this.$user;
        State<String> state5 = this.$secondUserPhoto$delegate;
        Function0<Unit> function03 = this.$onDismiss;
        BetsController betsController2 = this.$betsController;
        State<Boolean> state6 = this.$isLoading$delegate;
        State<MatchShortInfoModel> state7 = this.$matchDetails$delegate;
        final Function2<Integer, Boolean, Unit> function2 = this.$onNavigateToLeague;
        State<OddType> state8 = this.$oddType$delegate;
        State<Long> state9 = this.$amount$delegate;
        State<Long> state10 = this.$userAmount$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
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
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ChallengeAcceptScreen$lambda$1 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$1(state6);
        if (ChallengeAcceptScreen$lambda$1) {
            composer.startReplaceGroup(-442319282);
            BettingSheetLoadingStateKt.BettingSheetLoadingState(null, composer, 0, 1);
            composer.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            shortUserProfileModel = shortUserProfileModel2;
            challengeAcceptController = challengeAcceptController3;
            f = f3;
            composer2 = composer;
            state4 = state10;
            state = state8;
            state2 = state9;
            betsController = betsController2;
            function0 = function03;
            state3 = state5;
        } else {
            composer.startReplaceGroup(-442099089);
            ChallengeAcceptScreen$lambda$2 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$2(state7);
            if (ChallengeAcceptScreen$lambda$2 == null) {
                shortUserProfileModel = shortUserProfileModel2;
                challengeAcceptController = challengeAcceptController3;
                f = f3;
                composer2 = composer;
                state4 = state10;
                state = state8;
                state2 = state9;
                betsController = betsController2;
                function0 = function03;
                state3 = state5;
            } else {
                boolean isStarted = UiExtensionsKt.isStarted(ChallengeAcceptScreen$lambda$2);
                LeagueModelShort league = ChallengeAcceptScreen$lambda$2.getLeague();
                if (league != null && (name = league.getName()) != null) {
                    if (StringsKt.isBlank(name)) {
                        name = null;
                    }
                }
                name = ChallengeAcceptScreen$lambda$2.getSport().getName();
                if (league != null && (photoUrl = league.getPhotoUrl()) != null) {
                    if (StringsKt.isBlank(photoUrl)) {
                        photoUrl = null;
                    }
                }
                photoUrl = ChallengeAcceptScreen$lambda$2.getSport().getPhotoUrl();
                if (league != null) {
                    num = Integer.valueOf(league.getId());
                }
                num = null;
                composer.startReplaceGroup(-14238592);
                if (StringsKt.isBlank(name)) {
                    shortUserProfileModel = shortUserProfileModel2;
                    state = state8;
                    state2 = state9;
                    betsController = betsController2;
                    function0 = function03;
                    state3 = state5;
                } else {
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(2), 7, null);
                    composer.startReplaceGroup(1004287350);
                    if (num == null || function2 == null) {
                        function02 = null;
                    } else {
                        composer.startReplaceGroup(-1746271574);
                        boolean changed = composer.changed(function2) | composer.changed(num) | composer.changedInstance(ChallengeAcceptScreen$lambda$2);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$15$lambda$6$lambda$5$lambda$4$lambda$3;
                                    invoke$lambda$15$lambda$6$lambda$5$lambda$4$lambda$3 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2.invoke$lambda$15$lambda$6$lambda$5$lambda$4$lambda$3(Function2.this, num, ChallengeAcceptScreen$lambda$2);
                                    return invoke$lambda$15$lambda$6$lambda$5$lambda$4$lambda$3;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        function02 = (Function0) rememberedValue;
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                    state2 = state9;
                    state = state8;
                    betsController = betsController2;
                    function0 = function03;
                    state3 = state5;
                    shortUserProfileModel = shortUserProfileModel2;
                    MatchLeagueItemKt.MatchLeagueItem(m1520paddingqDBjuR0$default, photoUrl, name, true, false, true, function02, composer, 199686, 16);
                }
                composer.endReplaceGroup();
                TeamModelShort homeTeam = ChallengeAcceptScreen$lambda$2.getHomeTeam();
                String str4 = (homeTeam == null || (name3 = homeTeam.getName()) == null) ? "" : name3;
                TeamModelShort awayTeam = ChallengeAcceptScreen$lambda$2.getAwayTeam();
                String str5 = (awayTeam == null || (name2 = awayTeam.getName()) == null) ? "" : name2;
                TeamModelShort homeTeam2 = ChallengeAcceptScreen$lambda$2.getHomeTeam();
                String str6 = (homeTeam2 == null || (photoUrl3 = homeTeam2.getPhotoUrl()) == null) ? "" : photoUrl3;
                TeamModelShort awayTeam2 = ChallengeAcceptScreen$lambda$2.getAwayTeam();
                String str7 = (awayTeam2 == null || (photoUrl2 = awayTeam2.getPhotoUrl()) == null) ? "" : photoUrl2;
                String valueOf = (!isStarted || ChallengeAcceptScreen$lambda$2.getScoreHome().intValue() <= 0) ? null : String.valueOf(ChallengeAcceptScreen$lambda$2.getScoreHome().intValue());
                String valueOf2 = (!isStarted || ChallengeAcceptScreen$lambda$2.getScoreAway().intValue() <= 0) ? null : String.valueOf(ChallengeAcceptScreen$lambda$2.getScoreAway().intValue());
                String extractPeriodScoresFromResultRaw = (!isStarted || (resultRaw = ChallengeAcceptScreen$lambda$2.getResultRaw()) == null || StringsKt.isBlank(resultRaw)) ? null : MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(ChallengeAcceptScreen$lambda$2.getResultRaw());
                if (isStarted) {
                    String currentTime = ChallengeAcceptScreen$lambda$2.getCurrentTime();
                    if (currentTime == null) {
                        currentTime = "";
                    }
                    formattedDateWithoutYear = UiExtensionsKt.normalizeMatchTime(currentTime);
                } else {
                    String date = ChallengeAcceptScreen$lambda$2.getDate();
                    if (date == null || (formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(date)) == null) {
                        str = "";
                        if (isStarted) {
                            String date2 = ChallengeAcceptScreen$lambda$2.getDate();
                            if (date2 == null || (formattedTime = UiExtensionsKt.getFormattedTime(date2)) == null) {
                                str2 = "";
                                challengeAcceptController = challengeAcceptController3;
                                f = f3;
                                state4 = state10;
                                composer2 = composer;
                                TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, valueOf2, extractPeriodScoresFromResultRaw, str, str2, null, false, isStarted, false, true, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 0, 24576, 0, 8367105);
                                Unit unit2 = Unit.INSTANCE;
                                Unit unit3 = Unit.INSTANCE;
                            }
                        } else {
                            String currentPeriod = ChallengeAcceptScreen$lambda$2.getCurrentPeriod();
                            if (currentPeriod == null) {
                                currentPeriod = "";
                            }
                            formattedTime = UiExtensionsKt.normalizeMatchTime(currentPeriod);
                        }
                        str2 = formattedTime;
                        challengeAcceptController = challengeAcceptController3;
                        f = f3;
                        state4 = state10;
                        composer2 = composer;
                        TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, valueOf2, extractPeriodScoresFromResultRaw, str, str2, null, false, isStarted, false, true, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 0, 24576, 0, 8367105);
                        Unit unit22 = Unit.INSTANCE;
                        Unit unit32 = Unit.INSTANCE;
                    }
                }
                str = formattedDateWithoutYear;
                if (isStarted) {
                }
                str2 = formattedTime;
                challengeAcceptController = challengeAcceptController3;
                f = f3;
                state4 = state10;
                composer2 = composer;
                TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, valueOf2, extractPeriodScoresFromResultRaw, str, str2, null, false, isStarted, false, true, false, false, 0, null, null, 0.0f, 0.0f, false, composer, 0, 24576, 0, 8367105);
                Unit unit222 = Unit.INSTANCE;
                Unit unit322 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ChallengeAcceptScreen$lambda$6 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$6(state3);
        if (ChallengeAcceptScreen$lambda$6 != null) {
            composer2.startReplaceGroup(1943503655);
            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(5), 0.0f, Dp.m7774constructorimpl(f), 5, null);
            String groupName = challengeAcceptController.getGroupName();
            if (groupName == null) {
                groupName = "";
            }
            String str8 = challengeAcceptController.get_betName();
            str3 = str8 != null ? str8 : "";
            String str9 = challengeAcceptController.get_varietyName();
            Double coefficient = challengeAcceptController.getCoefficient();
            doubleValue = coefficient != null ? coefficient.doubleValue() : 0.0d;
            String photoUrl4 = shortUserProfileModel.getUserModel().getPhotoUrl();
            ChallengeAcceptScreen$lambda$52 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$5(state);
            String stringResource = StringResources_androidKt.stringResource(R.string.not_set, composer2, 6);
            ChallengeAcceptScreen$lambda$62 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$6(state3);
            Long valueOf3 = shortUserProfileModel.getUserModel().getId() != null ? Long.valueOf(r7.intValue()) : null;
            Long value = challengeAcceptController.getUserId().getValue();
            Double valueOf4 = Double.valueOf(doubleValue);
            composer2.startReplaceGroup(-1746271574);
            final ChallengeAcceptController challengeAcceptController4 = challengeAcceptController;
            final State<String> state11 = state3;
            final Function0<Unit> function04 = function0;
            boolean changedInstance = composer2.changedInstance(challengeAcceptController4) | composer2.changed(state11) | composer2.changed(function04);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$15$lambda$8$lambda$7;
                        invoke$lambda$15$lambda$8$lambda$7 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2.invoke$lambda$15$lambda$8$lambda$7(ChallengeAcceptController.this, function04, state11);
                        return invoke$lambda$15$lambda$8$lambda$7;
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            ChallengeAcceptScreenKt.BattleBetInfoRowTwoUsers(m1520paddingqDBjuR0$default2, str3, groupName, str9, valueOf4, photoUrl4, null, ChallengeAcceptScreen$lambda$52, stringResource, "-", null, "-", ChallengeAcceptScreen$lambda$62, null, null, null, null, valueOf3, value, (Function0) rememberedValue2, composer, 805306374, 54, 122944);
            composer.endReplaceGroup();
            challengeAcceptController2 = challengeAcceptController4;
        } else {
            final Function0<Unit> function05 = function0;
            composer2.startReplaceGroup(1945962203);
            Modifier m1520paddingqDBjuR0$default3 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(5), 0.0f, Dp.m7774constructorimpl(f), 5, null);
            String groupName2 = challengeAcceptController.getGroupName();
            if (groupName2 == null) {
                groupName2 = "";
            }
            String str10 = challengeAcceptController.get_betName();
            str3 = str10 != null ? str10 : "";
            String str11 = challengeAcceptController.get_varietyName();
            Double coefficient2 = challengeAcceptController.getCoefficient();
            doubleValue = coefficient2 != null ? coefficient2.doubleValue() : 0.0d;
            String photoUrl5 = shortUserProfileModel.getUserModel().getPhotoUrl();
            ChallengeAcceptScreen$lambda$5 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$5(state);
            Long valueOf5 = shortUserProfileModel.getUserModel().getId() != null ? Long.valueOf(r7.intValue()) : null;
            Double valueOf6 = Double.valueOf(doubleValue);
            composer2.startReplaceGroup(-1633490746);
            challengeAcceptController2 = challengeAcceptController;
            boolean changedInstance2 = composer2.changedInstance(challengeAcceptController2) | composer2.changed(function05);
            Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$15$lambda$10$lambda$9;
                        invoke$lambda$15$lambda$10$lambda$9 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2.invoke$lambda$15$lambda$10$lambda$9(ChallengeAcceptController.this, function05);
                        return invoke$lambda$15$lambda$10$lambda$9;
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            ChallengeAcceptScreenKt.BattleBetInfoRow(m1520paddingqDBjuR0$default3, str3, groupName2, str11, valueOf6, photoUrl5, null, ChallengeAcceptScreen$lambda$5, valueOf5, (Function0) rememberedValue3, composer, 6, 64);
            composer.endReplaceGroup();
        }
        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f), 0.0f, 2, null);
        ChallengeAcceptScreen$lambda$3 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$3(state2);
        ChallengeAcceptScreen$lambda$4 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$4(state4);
        composer2.startReplaceGroup(5004770);
        final BetsController betsController3 = betsController;
        boolean changedInstance3 = composer2.changedInstance(betsController3);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$15$lambda$12$lambda$11;
                    invoke$lambda$15$lambda$12$lambda$11 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2.invoke$lambda$15$lambda$12$lambda$11(BetsController.this, ((Long) obj).longValue());
                    return invoke$lambda$15$lambda$12$lambda$11;
                }
            };
            composer2.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        BetAmountSliderKt.BetAmountSlider(m1518paddingVpY3zN4$default, ChallengeAcceptScreen$lambda$3, ChallengeAcceptScreen$lambda$4, 500L, (Function1) rememberedValue4, false, 0L, false, composer, 199686, 192);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        ChallengeAcceptScreen$lambda$32 = ChallengeAcceptScreenKt.ChallengeAcceptScreen$lambda$3(state2);
        Double coefficient3 = challengeAcceptController2.getCoefficient();
        Modifier.Companion companion3 = companion2;
        composer2.startReplaceGroup(5004770);
        boolean changedInstance4 = composer2.changedInstance(betsController3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: org.betup.ui.dialogs.compose.ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$15$lambda$14$lambda$13;
                    invoke$lambda$15$lambda$14$lambda$13 = ChallengeAcceptScreenKt$ChallengeAcceptScreen$3$1$2.invoke$lambda$15$lambda$14$lambda$13(BetsController.this, ((Long) obj).longValue());
                    return invoke$lambda$15$lambda$14$lambda$13;
                }
            };
            composer2.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        ChallengeAcceptScreenKt.BattleBetDetailsSummary(companion3, ChallengeAcceptScreen$lambda$32, coefficient3, (Function1) rememberedValue5, composer, 6);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
