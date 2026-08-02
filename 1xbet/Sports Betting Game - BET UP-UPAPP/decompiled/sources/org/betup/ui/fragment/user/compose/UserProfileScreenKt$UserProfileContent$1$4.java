package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.user.ForeignUserDetailsController;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.UserDetailsTab;
import org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt;
import org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks;
import org.betup.ui.fragment.user.compose.messages.UserMessagesState;

/* compiled from: UserProfileScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserProfileScreenKt$UserProfileContent$1$4 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ BetsController $betListController;
    final /* synthetic */ ForeignUserDetailsController $foreignUserDetailsController;
    final /* synthetic */ boolean $isAnotherUser;
    final /* synthetic */ MutableState<Boolean> $isInputFocused$delegate;
    final /* synthetic */ NewUserFavouritesModel $newUserFavourites;
    final /* synthetic */ Function1<BetsListModel, Unit> $onBetClick;
    final /* synthetic */ Function1<FavouriteTypeK, Unit> $onGoToMatches;
    final /* synthetic */ Function1<Integer, Unit> $onRankingTabSelected;
    final /* synthetic */ Function1<Integer, Unit> $onTabSelected;
    final /* synthetic */ Function1<Long, Unit> $onTeamClick;
    final /* synthetic */ Function1<Integer, Unit> $onUserCLick;
    final /* synthetic */ List<RankingTimeType> $rankingTabs;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ int $selectedRankingTabIndex;
    final /* synthetic */ List<UserDetailsTab> $tabs;
    final /* synthetic */ List<NewUserAchievementsModel> $userAchievements;
    final /* synthetic */ UserDetailsController $userDetailsController;
    final /* synthetic */ UserMessagesCallbacks $userMessagesCallbacks;
    final /* synthetic */ UserMessagesState $userMessagesState;
    final /* synthetic */ UserService $userService;
    final /* synthetic */ NewUserBetStatisticsModel $userStats;

    /* JADX WARN: Multi-variable type inference failed */
    UserProfileScreenKt$UserProfileContent$1$4(UserMessagesState userMessagesState, UserMessagesCallbacks userMessagesCallbacks, List<? extends UserDetailsTab> list, int i, Function1<? super Integer, Unit> function1, NewUserBetStatisticsModel newUserBetStatisticsModel, List<NewUserAchievementsModel> list2, NewUserFavouritesModel newUserFavouritesModel, BetsController betsController, Function1<? super BetsListModel, Unit> function12, UserService userService, Function1<? super FavouriteTypeK, Unit> function13, List<? extends RankingTimeType> list3, int i2, Function1<? super Integer, Unit> function14, Function1<? super Integer, Unit> function15, boolean z, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, Function1<? super Long, Unit> function16, MutableState<Boolean> mutableState) {
        this.$userMessagesState = userMessagesState;
        this.$userMessagesCallbacks = userMessagesCallbacks;
        this.$tabs = list;
        this.$selectedIndex = i;
        this.$onTabSelected = function1;
        this.$userStats = newUserBetStatisticsModel;
        this.$userAchievements = list2;
        this.$newUserFavourites = newUserFavouritesModel;
        this.$betListController = betsController;
        this.$onBetClick = function12;
        this.$userService = userService;
        this.$onGoToMatches = function13;
        this.$rankingTabs = list3;
        this.$selectedRankingTabIndex = i2;
        this.$onRankingTabSelected = function14;
        this.$onUserCLick = function15;
        this.$isAnotherUser = z;
        this.$userDetailsController = userDetailsController;
        this.$foreignUserDetailsController = foreignUserDetailsController;
        this.$onTeamClick = function16;
        this.$isInputFocused$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020916466, i2, -1, "org.betup.ui.fragment.user.compose.UserProfileContent.<anonymous>.<anonymous> (UserProfileScreen.kt:234)");
        }
        if (i == 0) {
            composer.startReplaceGroup(-775502462);
            Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(12), 0.0f, 2, null);
            List<UserDetailsTab> list = this.$tabs;
            int i3 = this.$selectedIndex;
            Function1<Integer, Unit> function1 = this.$onTabSelected;
            NewUserBetStatisticsModel newUserBetStatisticsModel = this.$userStats;
            List<NewUserAchievementsModel> list2 = this.$userAchievements;
            NewUserFavouritesModel newUserFavouritesModel = this.$newUserFavourites;
            BetsController betsController = this.$betListController;
            final Function1<BetsListModel, Unit> function12 = this.$onBetClick;
            UserService userService = this.$userService;
            Function1<FavouriteTypeK, Unit> function13 = this.$onGoToMatches;
            List<RankingTimeType> list3 = this.$rankingTabs;
            int i4 = this.$selectedRankingTabIndex;
            Function1<Integer, Unit> function14 = this.$onRankingTabSelected;
            Function1<Integer, Unit> function15 = this.$onUserCLick;
            boolean z = this.$isAnotherUser;
            UserDetailsController userDetailsController = this.$userDetailsController;
            ForeignUserDetailsController foreignUserDetailsController = this.$foreignUserDetailsController;
            Function1<Long, Unit> function16 = this.$onTeamClick;
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default);
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
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean changed = composer.changed(function12);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileContent$1$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$2$lambda$1$lambda$0;
                        invoke$lambda$2$lambda$1$lambda$0 = UserProfileScreenKt$UserProfileContent$1$4.invoke$lambda$2$lambda$1$lambda$0(Function1.this, (BetsListModel) obj);
                        return invoke$lambda$2$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            UserProfileScreenKt.UserProfileTabContent(list, i3, function1, newUserBetStatisticsModel, list2, newUserFavouritesModel, betsController, (Function1) rememberedValue, userService, function13, list3, i4, function14, function15, z, userDetailsController, foreignUserDetailsController, function16, composer, 0, 0, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else if (i == 1) {
            composer.startReplaceGroup(1730443090);
            BoxKt.Box(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
            composer.endReplaceGroup();
        } else if (i == 2) {
            composer.startReplaceGroup(-775457173);
            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(12), 0.0f, 2, null);
            UserDetailsController userDetailsController2 = this.$userDetailsController;
            ForeignUserDetailsController foreignUserDetailsController2 = this.$foreignUserDetailsController;
            boolean z2 = this.$isAnotherUser;
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default2);
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
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            UserProfileComponentsKt.UserBattlesContent(userDetailsController2, foreignUserDetailsController2, z2, composer, 0, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else if (i == 3) {
            composer.startReplaceGroup(-775446405);
            UserMessagesState userMessagesState = this.$userMessagesState;
            UserMessagesCallbacks userMessagesCallbacks = this.$userMessagesCallbacks;
            composer.startReplaceGroup(5004770);
            final MutableState<Boolean> mutableState = this.$isInputFocused$delegate;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileContent$1$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$5$lambda$4;
                        invoke$lambda$5$lambda$4 = UserProfileScreenKt$UserProfileContent$1$4.invoke$lambda$5$lambda$4(MutableState.this, ((Boolean) obj).booleanValue());
                        return invoke$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            MessagesTabScreenKt.MessagesTabContent(userMessagesState, userMessagesCallbacks, (Function1) rememberedValue2, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-775438668);
            BoxKt.Box(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, BetsListModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(MutableState mutableState, boolean z) {
        UserProfileScreenKt.UserProfileContent$lambda$7(mutableState, z);
        return Unit.INSTANCE;
    }
}
