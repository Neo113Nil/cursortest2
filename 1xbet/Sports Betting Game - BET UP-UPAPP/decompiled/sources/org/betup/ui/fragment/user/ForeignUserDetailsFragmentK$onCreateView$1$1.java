package org.betup.ui.fragment.user;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.messaging.ExtendedMessageModel;
import org.betup.model.remote.entity.messaging.MessageModel;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.services.user.UserService;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchUIItem;
import org.betup.ui.fragment.user.compose.RankingTimeType;
import org.betup.ui.fragment.user.compose.UserProfileScreenKt;
import org.betup.ui.fragment.user.compose.messages.ChatListItemUi;
import org.betup.ui.fragment.user.compose.messages.MessagesModelsKt;
import org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks;
import org.betup.ui.fragment.user.compose.messages.UserMessagesState;
import org.betup.utils.DateHelper;
import org.greenrobot.eventbus.EventBus;

/* compiled from: ForeignUserDetailsFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ForeignUserDetailsFragmentK$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ForeignUserDetailsFragmentK this$0;

    ForeignUserDetailsFragmentK$onCreateView$1$1(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK) {
        this.this$0 = foreignUserDetailsFragmentK;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK) {
        foreignUserDetailsFragmentK.getController().ensureConversationLoaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$23$lambda$22(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK) {
        foreignUserDetailsFragmentK.getController().ensureConversationLoaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$27$lambda$26(ChatListItemUi it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$31$lambda$30(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK) {
        foreignUserDetailsFragmentK.getController().loadMoreConversationMessages();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$33$lambda$32(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        foreignUserDetailsFragmentK.getController().sendMessageToForeignUser(text);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        Date sendDate;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-947245019, i, -1, "org.betup.ui.fragment.user.ForeignUserDetailsFragmentK.onCreateView.<anonymous>.<anonymous> (ForeignUserDetailsFragmentK.kt:70)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getController().getUserInfo(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getController().getUserRanks(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getController().getUserBetStatistics(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getController().getUserAchievements(), null, composer, 0, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getController().getUserFavourites(), null, composer, 0, 1);
        SnapshotStateKt.collectAsState(this.this$0.getController().getUserRankingStatistics(), null, composer, 0, 1);
        State collectAsState6 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoading(), null, composer, 0, 1);
        SnapshotStateKt.collectAsState(this.this$0.getController().getError(), null, composer, 0, 1);
        State collectAsState7 = SnapshotStateKt.collectAsState(this.this$0.getController().getSelectedTabIndex(), null, composer, 0, 1);
        State collectAsState8 = SnapshotStateKt.collectAsState(this.this$0.getController().getBaseTabs(), null, composer, 0, 1);
        State collectAsState9 = SnapshotStateKt.collectAsState(this.this$0.getController().getSelectedBaseTabIndex(), null, composer, 0, 1);
        State collectAsState10 = SnapshotStateKt.collectAsState(this.this$0.getController().getRankingTabs(), null, composer, 0, 1);
        State collectAsState11 = SnapshotStateKt.collectAsState(this.this$0.getController().getSelectedRankingTabIndex(), null, composer, 0, 1);
        State collectAsState12 = SnapshotStateKt.collectAsState(this.this$0.getController().getConversationMessages(), null, composer, 0, 1);
        State collectAsState13 = SnapshotStateKt.collectAsState(this.this$0.getController().isConversationLoading(), null, composer, 0, 1);
        State collectAsState14 = SnapshotStateKt.collectAsState(this.this$0.getController().isConversationLoadingMore(), null, composer, 0, 1);
        State collectAsState15 = SnapshotStateKt.collectAsState(this.this$0.getController().getHasMoreConversationMessages(), null, composer, 0, 1);
        State collectAsState16 = SnapshotStateKt.collectAsState(this.this$0.getController().isSendingMessage(), null, composer, 0, 1);
        Integer id = this.this$0.getUserService().getShortProfile().getUserModel().getId();
        List<ExtendedMessageModel> invoke$lambda$13 = invoke$lambda$13(collectAsState12);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke$lambda$13, 10));
        for (Iterator it = invoke$lambda$13.iterator(); it.hasNext(); it = it) {
            ExtendedMessageModel extendedMessageModel = (ExtendedMessageModel) it.next();
            MessageModel message = extendedMessageModel.getMessage();
            if (message == null || (sendDate = message.getSendDate()) == null || (str = DateHelper.getTimeFromTimestamp(sendDate.getTime())) == null) {
                str = "";
            }
            Intrinsics.checkNotNull(id);
            arrayList.add(MessagesModelsKt.toBubbleUi(extendedMessageModel, id.intValue(), str));
            collectAsState6 = collectAsState6;
        }
        State state = collectAsState6;
        ArrayList arrayList2 = arrayList;
        List emptyList = CollectionsKt.emptyList();
        boolean invoke$lambda$14 = invoke$lambda$14(collectAsState13);
        boolean invoke$lambda$15 = invoke$lambda$15(collectAsState14);
        boolean invoke$lambda$16 = invoke$lambda$16(collectAsState15);
        boolean invoke$lambda$17 = invoke$lambda$17(collectAsState16);
        NewUserInfoModel invoke$lambda$0 = invoke$lambda$0(collectAsState);
        String name = invoke$lambda$0 != null ? invoke$lambda$0.getName() : null;
        NewUserInfoModel invoke$lambda$02 = invoke$lambda$0(collectAsState);
        String photoUrl = invoke$lambda$02 != null ? invoke$lambda$02.getPhotoUrl() : null;
        Intrinsics.checkNotNull(id);
        UserMessagesState userMessagesState = new UserMessagesState(emptyList, false, false, false, null, arrayList2, invoke$lambda$14, invoke$lambda$15, invoke$lambda$16, invoke$lambda$17, name, photoUrl, id.intValue(), true);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$21$lambda$20;
                    invoke$lambda$21$lambda$20 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$21$lambda$20(ForeignUserDetailsFragmentK.this);
                    return invoke$lambda$21$lambda$20;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$23$lambda$22;
                    invoke$lambda$23$lambda$22 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$23$lambda$22(ForeignUserDetailsFragmentK.this);
                    return invoke$lambda$23$lambda$22;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function03 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$27$lambda$26;
                    invoke$lambda$27$lambda$26 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$27$lambda$26((ChatListItemUi) obj);
                    return invoke$lambda$27$lambda$26;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function1 function1 = (Function1) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function0 function04 = (Function0) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK3 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$31$lambda$30;
                    invoke$lambda$31$lambda$30 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$31$lambda$30(ForeignUserDetailsFragmentK.this);
                    return invoke$lambda$31$lambda$30;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function0 function05 = (Function0) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK4 = this.this$0;
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$33$lambda$32;
                    invoke$lambda$33$lambda$32 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$33$lambda$32(ForeignUserDetailsFragmentK.this, (String) obj);
                    return invoke$lambda$33$lambda$32;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        composer.endReplaceGroup();
        UserMessagesCallbacks userMessagesCallbacks = new UserMessagesCallbacks(function0, function02, null, function03, function1, function04, function05, (Function1) rememberedValue7, 4, null);
        NewUserInfoModel invoke$lambda$03 = invoke$lambda$0(collectAsState);
        NewUserBetStatisticsModel invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        NewUserRanksModel invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        List<NewUserAchievementsModel> invoke$lambda$3 = invoke$lambda$3(collectAsState4);
        NewUserFavouritesModel invoke$lambda$4 = invoke$lambda$4(collectAsState5);
        boolean invoke$lambda$6 = invoke$lambda$6(state);
        List<UserDetailsTab> userTabs = this.this$0.getController().getUserTabs();
        int invoke$lambda$8 = invoke$lambda$8(collectAsState7);
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK5 = this.this$0;
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$35$lambda$34;
                    invoke$lambda$35$lambda$34 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$35$lambda$34(ForeignUserDetailsFragmentK.this, ((Integer) obj).intValue());
                    return invoke$lambda$35$lambda$34;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        Function1 function12 = (Function1) rememberedValue8;
        composer.endReplaceGroup();
        List<BaseButtonMatchUIItem> invoke$lambda$9 = invoke$lambda$9(collectAsState8);
        int invoke$lambda$10 = invoke$lambda$10(collectAsState9);
        BetsController betListController = this.this$0.getBetListController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK6 = this.this$0;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$37$lambda$36;
                    invoke$lambda$37$lambda$36 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$37$lambda$36(ForeignUserDetailsFragmentK.this, (BetsListModel) obj);
                    return invoke$lambda$37$lambda$36;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        Function1 function13 = (Function1) rememberedValue9;
        composer.endReplaceGroup();
        UserService userService = this.this$0.getUserService();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$39$lambda$38;
                    invoke$lambda$39$lambda$38 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$39$lambda$38((FavouriteTypeK) obj);
                    return invoke$lambda$39$lambda$38;
                }
            };
            composer.updateRememberedValue(rememberedValue10);
        }
        Function1 function14 = (Function1) rememberedValue10;
        composer.endReplaceGroup();
        List<RankingTimeType> invoke$lambda$11 = invoke$lambda$11(collectAsState10);
        int invoke$lambda$12 = invoke$lambda$12(collectAsState11);
        composer.startReplaceGroup(5004770);
        boolean changedInstance7 = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK7 = this.this$0;
        Object rememberedValue11 = composer.rememberedValue();
        if (changedInstance7 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$41$lambda$40;
                    invoke$lambda$41$lambda$40 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$41$lambda$40(ForeignUserDetailsFragmentK.this, ((Integer) obj).intValue());
                    return invoke$lambda$41$lambda$40;
                }
            };
            composer.updateRememberedValue(rememberedValue11);
        }
        Function1 function15 = (Function1) rememberedValue11;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance8 = composer.changedInstance(this.this$0);
        final ForeignUserDetailsFragmentK foreignUserDetailsFragmentK8 = this.this$0;
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance8 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            rememberedValue12 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$43$lambda$42;
                    invoke$lambda$43$lambda$42 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$43$lambda$42(ForeignUserDetailsFragmentK.this, ((Integer) obj).intValue());
                    return invoke$lambda$43$lambda$42;
                }
            };
            composer.updateRememberedValue(rememberedValue12);
        }
        Function1 function16 = (Function1) rememberedValue12;
        composer.endReplaceGroup();
        ForeignUserDetailsController controller = this.this$0.getController();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            rememberedValue13 = new Function1() { // from class: org.betup.ui.fragment.user.ForeignUserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$46$lambda$45;
                    invoke$lambda$46$lambda$45 = ForeignUserDetailsFragmentK$onCreateView$1$1.invoke$lambda$46$lambda$45(((Long) obj).longValue());
                    return invoke$lambda$46$lambda$45;
                }
            };
            composer.updateRememberedValue(rememberedValue13);
        }
        composer.endReplaceGroup();
        UserProfileScreenKt.UserProfileScreen(invoke$lambda$03, invoke$lambda$2, invoke$lambda$1, invoke$lambda$3, invoke$lambda$4, invoke$lambda$6, false, null, userTabs, invoke$lambda$8, function12, invoke$lambda$9, invoke$lambda$10, betListController, function13, userService, function14, invoke$lambda$11, invoke$lambda$12, function15, function16, null, controller, true, userMessagesState, userMessagesCallbacks, (Function1) rememberedValue13, composer, 0, 1572864, 1575984, 192);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$35$lambda$34(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK, int i) {
        foreignUserDetailsFragmentK.getController().setSelectedTab(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$37$lambda$36(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK, BetsListModel betModel) {
        Intrinsics.checkNotNullParameter(betModel, "betModel");
        foreignUserDetailsFragmentK.getController().onBetClick(betModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$39$lambda$38(FavouriteTypeK favouriteType) {
        Intrinsics.checkNotNullParameter(favouriteType, "favouriteType");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$41$lambda$40(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK, int i) {
        foreignUserDetailsFragmentK.getController().setSelectedRankingTab(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$43$lambda$42(ForeignUserDetailsFragmentK foreignUserDetailsFragmentK, int i) {
        foreignUserDetailsFragmentK.getController().navigateToForeignUser(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$46$lambda$45(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("teamId", j);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TEAM_DETAILS, bundle));
        return Unit.INSTANCE;
    }

    private static final NewUserInfoModel invoke$lambda$0(State<NewUserInfoModel> state) {
        return state.getValue();
    }

    private static final NewUserRanksModel invoke$lambda$1(State<NewUserRanksModel> state) {
        return state.getValue();
    }

    private static final NewUserBetStatisticsModel invoke$lambda$2(State<NewUserBetStatisticsModel> state) {
        return state.getValue();
    }

    private static final List<NewUserAchievementsModel> invoke$lambda$3(State<? extends List<NewUserAchievementsModel>> state) {
        return state.getValue();
    }

    private static final NewUserFavouritesModel invoke$lambda$4(State<NewUserFavouritesModel> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final int invoke$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<BaseButtonMatchUIItem> invoke$lambda$9(State<? extends List<BaseButtonMatchUIItem>> state) {
        return state.getValue();
    }

    private static final int invoke$lambda$10(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<RankingTimeType> invoke$lambda$11(State<? extends List<? extends RankingTimeType>> state) {
        return (List) state.getValue();
    }

    private static final int invoke$lambda$12(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<ExtendedMessageModel> invoke$lambda$13(State<? extends List<? extends ExtendedMessageModel>> state) {
        return (List) state.getValue();
    }

    private static final boolean invoke$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$15(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$16(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$17(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
