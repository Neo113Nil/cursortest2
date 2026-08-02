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
import org.betup.model.remote.entity.messaging.ChatModel;
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

/* compiled from: UserDetailsFragmentK.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserDetailsFragmentK$onCreateView$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UserDetailsFragmentK this$0;

    UserDetailsFragmentK$onCreateView$1$1(UserDetailsFragmentK userDetailsFragmentK) {
        this.this$0 = userDetailsFragmentK;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$28$lambda$27(UserDetailsFragmentK userDetailsFragmentK) {
        userDetailsFragmentK.getController().ensureChatsLoaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$30$lambda$29(UserDetailsFragmentK userDetailsFragmentK) {
        userDetailsFragmentK.getController().refreshChats();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$32$lambda$31(UserDetailsFragmentK userDetailsFragmentK) {
        userDetailsFragmentK.getController().refreshActiveChat();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$34$lambda$33(UserDetailsFragmentK userDetailsFragmentK) {
        userDetailsFragmentK.getController().loadMoreChats();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$38$lambda$37(State state, UserDetailsFragmentK userDetailsFragmentK, ChatListItemUi chatUi) {
        Object obj;
        Intrinsics.checkNotNullParameter(chatUi, "chatUi");
        Iterator<T> it = invoke$lambda$12(state).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ChatModel) obj).getChatId(), chatUi.getChatId())) {
                break;
            }
        }
        ChatModel chatModel = (ChatModel) obj;
        if (chatModel != null) {
            userDetailsFragmentK.getController().openChat(chatModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39(UserDetailsFragmentK userDetailsFragmentK) {
        userDetailsFragmentK.getController().closeChat();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$42$lambda$41(UserDetailsFragmentK userDetailsFragmentK) {
        userDetailsFragmentK.getController().loadMoreMessages();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$44$lambda$43(UserDetailsFragmentK userDetailsFragmentK, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        userDetailsFragmentK.getController().sendMessage(text);
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatListItemUi chatListItemUi;
        String str;
        Date sendDate;
        Object obj;
        ChatListItemUi listUi;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(677574555, i, -1, "org.betup.ui.fragment.user.UserDetailsFragmentK.onCreateView.<anonymous>.<anonymous> (UserDetailsFragmentK.kt:108)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(this.this$0.getController().getNewUserInfo(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(this.this$0.getController().getNewUserBetStatistics(), null, composer, 0, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(this.this$0.getController().getNewUserRanks(), null, composer, 0, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(this.this$0.getController().getNewUserAchievements(), null, composer, 0, 1);
        State collectAsState5 = SnapshotStateKt.collectAsState(this.this$0.getController().getNewUserFavourites(), null, composer, 0, 1);
        State collectAsState6 = SnapshotStateKt.collectAsState(this.this$0.getController().isLoading(), null, composer, 0, 1);
        State collectAsState7 = SnapshotStateKt.collectAsState(this.this$0.getController().getUserInfoLoadFailed(), null, composer, 0, 1);
        State collectAsState8 = SnapshotStateKt.collectAsState(this.this$0.getController().getSelectedTabIndex(), null, composer, 0, 1);
        State collectAsState9 = SnapshotStateKt.collectAsState(this.this$0.getController().getBaseTabs(), null, composer, 0, 1);
        State collectAsState10 = SnapshotStateKt.collectAsState(this.this$0.getController().m14198getSelectedBaseTabIndex(), null, composer, 0, 1);
        State collectAsState11 = SnapshotStateKt.collectAsState(this.this$0.getController().getRankingTabs(), null, composer, 0, 1);
        State collectAsState12 = SnapshotStateKt.collectAsState(this.this$0.getController().m14199getSelectedRankingTabIndex(), null, composer, 0, 1);
        final State collectAsState13 = SnapshotStateKt.collectAsState(this.this$0.getController().getUserChats(), null, composer, 0, 1);
        State collectAsState14 = SnapshotStateKt.collectAsState(this.this$0.getController().isChatsLoading(), null, composer, 0, 1);
        State collectAsState15 = SnapshotStateKt.collectAsState(this.this$0.getController().isChatsLoadingMore(), null, composer, 0, 1);
        State collectAsState16 = SnapshotStateKt.collectAsState(this.this$0.getController().getHasMoreChats(), null, composer, 0, 1);
        State collectAsState17 = SnapshotStateKt.collectAsState(this.this$0.getController().getSelectedChat(), null, composer, 0, 1);
        State collectAsState18 = SnapshotStateKt.collectAsState(this.this$0.getController().getChatMessages(), null, composer, 0, 1);
        State collectAsState19 = SnapshotStateKt.collectAsState(this.this$0.getController().isChatMessagesLoading(), null, composer, 0, 1);
        State collectAsState20 = SnapshotStateKt.collectAsState(this.this$0.getController().isChatMessagesLoadingMore(), null, composer, 0, 1);
        State collectAsState21 = SnapshotStateKt.collectAsState(this.this$0.getController().getHasMoreChatMessages(), null, composer, 0, 1);
        State collectAsState22 = SnapshotStateKt.collectAsState(this.this$0.getController().isSendingMessage(), null, composer, 0, 1);
        Integer id = this.this$0.getUserService().getShortProfile().getUserModel().getId();
        List<ChatModel> invoke$lambda$12 = invoke$lambda$12(collectAsState13);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke$lambda$12, 10));
        Iterator<T> it = invoke$lambda$12.iterator();
        while (it.hasNext()) {
            listUi = UserDetailsFragmentKKt.toListUi((ChatModel) it.next());
            arrayList.add(listUi);
        }
        ArrayList arrayList2 = arrayList;
        ChatModel invoke$lambda$16 = invoke$lambda$16(collectAsState17);
        if (invoke$lambda$16 != null) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.areEqual(((ChatListItemUi) obj).getChatId(), invoke$lambda$16.getChatId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ChatListItemUi chatListItemUi2 = (ChatListItemUi) obj;
            if (chatListItemUi2 == null) {
                chatListItemUi2 = UserDetailsFragmentKKt.toListUi(invoke$lambda$16);
            }
            chatListItemUi = chatListItemUi2;
        } else {
            chatListItemUi = null;
        }
        List<ExtendedMessageModel> invoke$lambda$17 = invoke$lambda$17(collectAsState18);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(invoke$lambda$17, 10));
        for (ExtendedMessageModel extendedMessageModel : invoke$lambda$17) {
            MessageModel message = extendedMessageModel.getMessage();
            if (message == null || (sendDate = message.getSendDate()) == null || (str = DateHelper.getTimeFromTimestamp(sendDate.getTime())) == null) {
                str = "";
            }
            Intrinsics.checkNotNull(id);
            arrayList3.add(MessagesModelsKt.toBubbleUi(extendedMessageModel, id.intValue(), str));
        }
        ArrayList arrayList4 = arrayList3;
        boolean invoke$lambda$13 = invoke$lambda$13(collectAsState14);
        boolean invoke$lambda$14 = invoke$lambda$14(collectAsState15);
        boolean invoke$lambda$15 = invoke$lambda$15(collectAsState16);
        boolean invoke$lambda$18 = invoke$lambda$18(collectAsState19);
        boolean invoke$lambda$19 = invoke$lambda$19(collectAsState20);
        boolean invoke$lambda$20 = invoke$lambda$20(collectAsState21);
        boolean invoke$lambda$21 = invoke$lambda$21(collectAsState22);
        String name = chatListItemUi != null ? chatListItemUi.getName() : null;
        String avatarUrl = chatListItemUi != null ? chatListItemUi.getAvatarUrl() : null;
        Intrinsics.checkNotNull(id);
        UserMessagesState userMessagesState = new UserMessagesState(arrayList2, invoke$lambda$13, invoke$lambda$14, invoke$lambda$15, chatListItemUi, arrayList4, invoke$lambda$18, invoke$lambda$19, invoke$lambda$20, invoke$lambda$21, name, avatarUrl, id.intValue(), false);
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$28$lambda$27;
                    invoke$lambda$28$lambda$27 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$28$lambda$27(UserDetailsFragmentK.this);
                    return invoke$lambda$28$lambda$27;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance2 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK2 = this.this$0;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$30$lambda$29;
                    invoke$lambda$30$lambda$29 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$30$lambda$29(UserDetailsFragmentK.this);
                    return invoke$lambda$30$lambda$29;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance3 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK3 = this.this$0;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$32$lambda$31;
                    invoke$lambda$32$lambda$31 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$32$lambda$31(UserDetailsFragmentK.this);
                    return invoke$lambda$32$lambda$31;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        Function0 function03 = (Function0) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance4 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK4 = this.this$0;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$34$lambda$33;
                    invoke$lambda$34$lambda$33 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$34$lambda$33(UserDetailsFragmentK.this);
                    return invoke$lambda$34$lambda$33;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function0 function04 = (Function0) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(collectAsState13) | composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK5 = this.this$0;
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$38$lambda$37;
                    invoke$lambda$38$lambda$37 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$38$lambda$37(State.this, userDetailsFragmentK5, (ChatListItemUi) obj2);
                    return invoke$lambda$38$lambda$37;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function1 function1 = (Function1) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance5 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK6 = this.this$0;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$40$lambda$39;
                    invoke$lambda$40$lambda$39 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$40$lambda$39(UserDetailsFragmentK.this);
                    return invoke$lambda$40$lambda$39;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        Function0 function05 = (Function0) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance6 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK7 = this.this$0;
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance6 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$42$lambda$41;
                    invoke$lambda$42$lambda$41 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$42$lambda$41(UserDetailsFragmentK.this);
                    return invoke$lambda$42$lambda$41;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        Function0 function06 = (Function0) rememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance7 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK8 = this.this$0;
        Object rememberedValue8 = composer.rememberedValue();
        if (changedInstance7 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$44$lambda$43;
                    invoke$lambda$44$lambda$43 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$44$lambda$43(UserDetailsFragmentK.this, (String) obj2);
                    return invoke$lambda$44$lambda$43;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        composer.endReplaceGroup();
        UserMessagesCallbacks userMessagesCallbacks = new UserMessagesCallbacks(function0, function02, function03, function04, function1, function05, function06, (Function1) rememberedValue8);
        NewUserInfoModel invoke$lambda$0 = invoke$lambda$0(collectAsState);
        NewUserBetStatisticsModel invoke$lambda$1 = invoke$lambda$1(collectAsState2);
        NewUserRanksModel invoke$lambda$2 = invoke$lambda$2(collectAsState3);
        List<NewUserAchievementsModel> invoke$lambda$3 = invoke$lambda$3(collectAsState4);
        NewUserFavouritesModel invoke$lambda$4 = invoke$lambda$4(collectAsState5);
        boolean invoke$lambda$5 = invoke$lambda$5(collectAsState6);
        boolean invoke$lambda$6 = invoke$lambda$6(collectAsState7);
        composer.startReplaceGroup(5004770);
        boolean changedInstance8 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK9 = this.this$0;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance8 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function0() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$46$lambda$45;
                    invoke$lambda$46$lambda$45 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$46$lambda$45(UserDetailsFragmentK.this);
                    return invoke$lambda$46$lambda$45;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        Function0 function07 = (Function0) rememberedValue9;
        composer.endReplaceGroup();
        List<UserDetailsTab> userTabs = this.this$0.getController().getUserTabs();
        int invoke$lambda$7 = invoke$lambda$7(collectAsState8);
        composer.startReplaceGroup(5004770);
        boolean changedInstance9 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK10 = this.this$0;
        Object rememberedValue10 = composer.rememberedValue();
        if (changedInstance9 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
            rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$48$lambda$47;
                    invoke$lambda$48$lambda$47 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$48$lambda$47(UserDetailsFragmentK.this, ((Integer) obj2).intValue());
                    return invoke$lambda$48$lambda$47;
                }
            };
            composer.updateRememberedValue(rememberedValue10);
        }
        Function1 function12 = (Function1) rememberedValue10;
        composer.endReplaceGroup();
        List<BaseButtonMatchUIItem> invoke$lambda$8 = invoke$lambda$8(collectAsState9);
        int invoke$lambda$9 = invoke$lambda$9(collectAsState10);
        BetsController betListController = this.this$0.getBetListController();
        composer.startReplaceGroup(5004770);
        boolean changedInstance10 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK11 = this.this$0;
        Object rememberedValue11 = composer.rememberedValue();
        if (changedInstance10 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$50$lambda$49;
                    invoke$lambda$50$lambda$49 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$50$lambda$49(UserDetailsFragmentK.this, (BetsListModel) obj2);
                    return invoke$lambda$50$lambda$49;
                }
            };
            composer.updateRememberedValue(rememberedValue11);
        }
        Function1 function13 = (Function1) rememberedValue11;
        composer.endReplaceGroup();
        UserService userService = this.this$0.getUserService();
        composer.startReplaceGroup(5004770);
        boolean changedInstance11 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK12 = this.this$0;
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance11 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            rememberedValue12 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$52$lambda$51;
                    invoke$lambda$52$lambda$51 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$52$lambda$51(UserDetailsFragmentK.this, (FavouriteTypeK) obj2);
                    return invoke$lambda$52$lambda$51;
                }
            };
            composer.updateRememberedValue(rememberedValue12);
        }
        Function1 function14 = (Function1) rememberedValue12;
        composer.endReplaceGroup();
        List<RankingTimeType> invoke$lambda$10 = invoke$lambda$10(collectAsState11);
        int invoke$lambda$11 = invoke$lambda$11(collectAsState12);
        composer.startReplaceGroup(5004770);
        boolean changedInstance12 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK13 = this.this$0;
        Object rememberedValue13 = composer.rememberedValue();
        if (changedInstance12 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            rememberedValue13 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$54$lambda$53;
                    invoke$lambda$54$lambda$53 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$54$lambda$53(UserDetailsFragmentK.this, ((Integer) obj2).intValue());
                    return invoke$lambda$54$lambda$53;
                }
            };
            composer.updateRememberedValue(rememberedValue13);
        }
        Function1 function15 = (Function1) rememberedValue13;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean changedInstance13 = composer.changedInstance(this.this$0);
        final UserDetailsFragmentK userDetailsFragmentK14 = this.this$0;
        Object rememberedValue14 = composer.rememberedValue();
        if (changedInstance13 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
            rememberedValue14 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$56$lambda$55;
                    invoke$lambda$56$lambda$55 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$56$lambda$55(UserDetailsFragmentK.this, ((Integer) obj2).intValue());
                    return invoke$lambda$56$lambda$55;
                }
            };
            composer.updateRememberedValue(rememberedValue14);
        }
        Function1 function16 = (Function1) rememberedValue14;
        composer.endReplaceGroup();
        UserDetailsController controller = this.this$0.getController();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue15 = composer.rememberedValue();
        if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
            rememberedValue15 = new Function1() { // from class: org.betup.ui.fragment.user.UserDetailsFragmentK$onCreateView$1$1$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$59$lambda$58;
                    invoke$lambda$59$lambda$58 = UserDetailsFragmentK$onCreateView$1$1.invoke$lambda$59$lambda$58(((Long) obj2).longValue());
                    return invoke$lambda$59$lambda$58;
                }
            };
            composer.updateRememberedValue(rememberedValue15);
        }
        composer.endReplaceGroup();
        UserProfileScreenKt.UserProfileScreen(invoke$lambda$0, invoke$lambda$1, invoke$lambda$2, invoke$lambda$3, invoke$lambda$4, invoke$lambda$5, invoke$lambda$6, function07, userTabs, invoke$lambda$7, function12, invoke$lambda$8, invoke$lambda$9, betListController, function13, userService, function14, invoke$lambda$10, invoke$lambda$11, function15, function16, controller, null, false, userMessagesState, userMessagesCallbacks, (Function1) rememberedValue15, composer, 0, 0, 1572864, 12582912);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$46$lambda$45(UserDetailsFragmentK userDetailsFragmentK) {
        userDetailsFragmentK.getController().retryLoadUserInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$48$lambda$47(UserDetailsFragmentK userDetailsFragmentK, int i) {
        userDetailsFragmentK.getController().setSelectedTab(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$50$lambda$49(UserDetailsFragmentK userDetailsFragmentK, BetsListModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        userDetailsFragmentK.getController().onBetClick(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$52$lambda$51(UserDetailsFragmentK userDetailsFragmentK, FavouriteTypeK favouriteType) {
        Intrinsics.checkNotNullParameter(favouriteType, "favouriteType");
        userDetailsFragmentK.getController().goToMatches(favouriteType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$54$lambda$53(UserDetailsFragmentK userDetailsFragmentK, int i) {
        userDetailsFragmentK.getController().setSelectedRankingTab(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$56$lambda$55(UserDetailsFragmentK userDetailsFragmentK, int i) {
        userDetailsFragmentK.getController().onUserCLick(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$59$lambda$58(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("teamId", j);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TEAM_DETAILS, bundle));
        return Unit.INSTANCE;
    }

    private static final NewUserInfoModel invoke$lambda$0(State<NewUserInfoModel> state) {
        return state.getValue();
    }

    private static final NewUserBetStatisticsModel invoke$lambda$1(State<NewUserBetStatisticsModel> state) {
        return state.getValue();
    }

    private static final NewUserRanksModel invoke$lambda$2(State<NewUserRanksModel> state) {
        return state.getValue();
    }

    private static final List<NewUserAchievementsModel> invoke$lambda$3(State<? extends List<NewUserAchievementsModel>> state) {
        return state.getValue();
    }

    private static final NewUserFavouritesModel invoke$lambda$4(State<NewUserFavouritesModel> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final int invoke$lambda$7(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<BaseButtonMatchUIItem> invoke$lambda$8(State<? extends List<BaseButtonMatchUIItem>> state) {
        return state.getValue();
    }

    private static final int invoke$lambda$9(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<RankingTimeType> invoke$lambda$10(State<? extends List<? extends RankingTimeType>> state) {
        return (List) state.getValue();
    }

    private static final int invoke$lambda$11(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<ChatModel> invoke$lambda$12(State<? extends List<? extends ChatModel>> state) {
        return (List) state.getValue();
    }

    private static final boolean invoke$lambda$13(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$15(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final ChatModel invoke$lambda$16(State<? extends ChatModel> state) {
        return state.getValue();
    }

    private static final List<ExtendedMessageModel> invoke$lambda$17(State<? extends List<? extends ExtendedMessageModel>> state) {
        return (List) state.getValue();
    }

    private static final boolean invoke$lambda$18(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$19(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$20(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean invoke$lambda$21(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
