package org.betup.ui.fragment.user.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.betup.model.remote.entity.user.NewUserBetStatisticsModel;
import org.betup.model.remote.entity.user.NewUserFavouritesModel;
import org.betup.model.remote.entity.user.NewUserInfoModel;
import org.betup.model.remote.entity.user.NewUserRanksModel;
import org.betup.services.user.UserService;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.dialogs.fav.FavouriteTypeK;
import org.betup.ui.fragment.bets.BetsController;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchUIItem;
import org.betup.ui.fragment.user.ForeignUserDetailsController;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.UserDetailsTab;
import org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks;
import org.betup.ui.fragment.user.compose.messages.UserMessagesState;
import org.betup.ui.views.ComposeUtils;

/* compiled from: UserProfileScreen.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\u001aë\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t2\u0006\u0010%\u001a\u00020\u00152\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00103\u001aÇ\u0002\u00104\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t2\u0006\u0010%\u001a\u00020\u00152\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020\u000e2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017H\u0003¢\u0006\u0002\u00105\u001a\u0089\u0002\u00106\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u00107\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u00172\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t2\u0006\u0010%\u001a\u00020\u00152\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010,\u001a\u00020\u000e2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017H\u0003¢\u0006\u0002\u00108¨\u00069²\u0006\n\u0010:\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020<X\u008a\u0084\u0002"}, d2 = {"UserProfileScreen", "", "userInfo", "Lorg/betup/model/remote/entity/user/NewUserInfoModel;", "userStats", "Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;", "userRanks", "Lorg/betup/model/remote/entity/user/NewUserRanksModel;", "userAchievements", "", "Lorg/betup/model/remote/entity/user/NewUserAchievementsModel;", "newUserFavourites", "Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;", "isLoading", "", "userInfoLoadFailed", "onRetryUserInfo", "Lkotlin/Function0;", "tabs", "Lorg/betup/ui/fragment/user/UserDetailsTab;", "selectedIndex", "", "onTabSelected", "Lkotlin/Function1;", "baseTabs", "Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "selectedIndexBase", "betListController", "Lorg/betup/ui/fragment/bets/BetsController;", "onBetClick", "Lorg/betup/model/remote/api/rest/user/bets/models/BetsListModel;", "userService", "Lorg/betup/services/user/UserService;", "onGoToMatches", "Lorg/betup/ui/dialogs/fav/FavouriteTypeK;", "rankingTabs", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "selectedRankingTabIndex", "onRankingTabSelected", "onUserCLick", "userDetailsController", "Lorg/betup/ui/fragment/user/UserDetailsController;", "foreignUserDetailsController", "Lorg/betup/ui/fragment/user/ForeignUserDetailsController;", "isAnotherUser", "userMessagesState", "Lorg/betup/ui/fragment/user/compose/messages/UserMessagesState;", "userMessagesCallbacks", "Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;", "onTeamClick", "", "(Lorg/betup/model/remote/entity/user/NewUserInfoModel;Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;Lorg/betup/model/remote/entity/user/NewUserRanksModel;Ljava/util/List;Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;ZZLkotlin/jvm/functions/Function0;Ljava/util/List;ILkotlin/jvm/functions/Function1;Ljava/util/List;ILorg/betup/ui/fragment/bets/BetsController;Lkotlin/jvm/functions/Function1;Lorg/betup/services/user/UserService;Lkotlin/jvm/functions/Function1;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/betup/ui/fragment/user/UserDetailsController;Lorg/betup/ui/fragment/user/ForeignUserDetailsController;ZLorg/betup/ui/fragment/user/compose/messages/UserMessagesState;Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "UserProfileContent", "(Lorg/betup/model/remote/entity/user/NewUserInfoModel;Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;Lorg/betup/model/remote/entity/user/NewUserRanksModel;Ljava/util/List;Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;Ljava/util/List;ILkotlin/jvm/functions/Function1;Ljava/util/List;ILorg/betup/ui/fragment/bets/BetsController;Lkotlin/jvm/functions/Function1;Lorg/betup/services/user/UserService;Lkotlin/jvm/functions/Function1;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/betup/ui/fragment/user/UserDetailsController;Lorg/betup/ui/fragment/user/ForeignUserDetailsController;ZLorg/betup/ui/fragment/user/compose/messages/UserMessagesState;Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V", "UserProfileTabContent", "betController", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Lorg/betup/model/remote/entity/user/NewUserBetStatisticsModel;Ljava/util/List;Lorg/betup/model/remote/entity/user/NewUserFavouritesModel;Lorg/betup/ui/fragment/bets/BetsController;Lkotlin/jvm/functions/Function1;Lorg/betup/services/user/UserService;Lkotlin/jvm/functions/Function1;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLorg/betup/ui/fragment/user/UserDetailsController;Lorg/betup/ui/fragment/user/ForeignUserDetailsController;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "app_release", "isInputFocused", "headerHeight", "Landroidx/compose/ui/unit/Dp;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserProfileScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int UserProfileContent$lambda$15$lambda$12$lambda$11() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$16(NewUserInfoModel newUserInfoModel, NewUserBetStatisticsModel newUserBetStatisticsModel, NewUserRanksModel newUserRanksModel, List list, NewUserFavouritesModel newUserFavouritesModel, List list2, int i, Function1 function1, List list3, int i2, BetsController betsController, Function1 function12, UserService userService, Function1 function13, List list4, int i3, Function1 function14, Function1 function15, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, boolean z, UserMessagesState userMessagesState, UserMessagesCallbacks userMessagesCallbacks, Function1 function16, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        UserProfileContent(newUserInfoModel, newUserBetStatisticsModel, newUserRanksModel, list, newUserFavouritesModel, list2, i, function1, list3, i2, betsController, function12, userService, function13, list4, i3, function14, function15, userDetailsController, foreignUserDetailsController, z, userMessagesState, userMessagesCallbacks, function16, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileScreen$lambda$4(NewUserInfoModel newUserInfoModel, NewUserBetStatisticsModel newUserBetStatisticsModel, NewUserRanksModel newUserRanksModel, List list, NewUserFavouritesModel newUserFavouritesModel, boolean z, boolean z2, Function0 function0, List list2, int i, Function1 function1, List list3, int i2, BetsController betsController, Function1 function12, UserService userService, Function1 function13, List list4, int i3, Function1 function14, Function1 function15, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, boolean z3, UserMessagesState userMessagesState, UserMessagesCallbacks userMessagesCallbacks, Function1 function16, int i4, int i5, int i6, int i7, Composer composer, int i8) {
        UserProfileScreen(newUserInfoModel, newUserBetStatisticsModel, newUserRanksModel, list, newUserFavouritesModel, z, z2, function0, list2, i, function1, list3, i2, betsController, function12, userService, function13, list4, i3, function14, function15, userDetailsController, foreignUserDetailsController, z3, userMessagesState, userMessagesCallbacks, function16, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileTabContent$lambda$26(List list, int i, Function1 function1, NewUserBetStatisticsModel newUserBetStatisticsModel, List list2, NewUserFavouritesModel newUserFavouritesModel, BetsController betsController, Function1 function12, UserService userService, Function1 function13, List list3, int i2, Function1 function14, Function1 function15, boolean z, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, Function1 function16, int i3, int i4, int i5, Composer composer, int i6) {
        UserProfileTabContent(list, i, function1, newUserBetStatisticsModel, list2, newUserFavouritesModel, betsController, function12, userService, function13, list3, i2, function14, function15, z, userDetailsController, foreignUserDetailsController, function16, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserProfileScreen(final NewUserInfoModel newUserInfoModel, final NewUserBetStatisticsModel newUserBetStatisticsModel, final NewUserRanksModel newUserRanksModel, final List<NewUserAchievementsModel> userAchievements, final NewUserFavouritesModel newUserFavouritesModel, final boolean z, boolean z2, Function0<Unit> function0, final List<? extends UserDetailsTab> tabs, final int i, final Function1<? super Integer, Unit> onTabSelected, final List<BaseButtonMatchUIItem> baseTabs, final int i2, final BetsController betListController, final Function1<? super BetsListModel, Unit> onBetClick, final UserService userService, final Function1<? super FavouriteTypeK, Unit> onGoToMatches, final List<? extends RankingTimeType> rankingTabs, final int i3, final Function1<? super Integer, Unit> onRankingTabSelected, final Function1<? super Integer, Unit> onUserCLick, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, boolean z3, UserMessagesState userMessagesState, UserMessagesCallbacks userMessagesCallbacks, Function1<? super Long, Unit> function1, Composer composer, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final boolean z4;
        final Function0<Unit> function02;
        final UserDetailsController userDetailsController2;
        final ForeignUserDetailsController foreignUserDetailsController2;
        final boolean z5;
        final UserMessagesState userMessagesState2;
        final UserMessagesCallbacks userMessagesCallbacks2;
        final Function1<? super Long, Unit> function12;
        ScopeUpdateScope endRestartGroup;
        int i21;
        int i22;
        Intrinsics.checkNotNullParameter(userAchievements, "userAchievements");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(baseTabs, "baseTabs");
        Intrinsics.checkNotNullParameter(betListController, "betListController");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(onGoToMatches, "onGoToMatches");
        Intrinsics.checkNotNullParameter(rankingTabs, "rankingTabs");
        Intrinsics.checkNotNullParameter(onRankingTabSelected, "onRankingTabSelected");
        Intrinsics.checkNotNullParameter(onUserCLick, "onUserCLick");
        Composer startRestartGroup = composer.startRestartGroup(1492069172);
        if ((i7 & 1) != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i8 = (startRestartGroup.changed(newUserInfoModel) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 |= startRestartGroup.changed(newUserBetStatisticsModel) ? 32 : 16;
        }
        if ((i7 & 4) != 0) {
            i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i8 |= startRestartGroup.changed(newUserRanksModel) ? 256 : 128;
            if ((i7 & 8) == 0) {
                i8 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i8 |= startRestartGroup.changedInstance(userAchievements) ? 2048 : 1024;
            }
            if ((i7 & 16) == 0) {
                i8 |= 24576;
            } else if ((i4 & 24576) == 0) {
                i8 |= startRestartGroup.changedInstance(newUserFavouritesModel) ? 16384 : 8192;
                if ((i7 & 32) != 0) {
                    i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i8 |= startRestartGroup.changed(z) ? 131072 : 65536;
                }
                i9 = i7 & 64;
                if (i9 != 0) {
                    i8 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i8 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                i10 = i7 & 128;
                if (i10 != 0) {
                    i8 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i8 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                }
                if ((i7 & 256) == 0) {
                    i22 = (100663296 & i4) == 0 ? startRestartGroup.changedInstance(tabs) ? 67108864 : 33554432 : 100663296;
                    if ((i7 & 512) == 0) {
                        i8 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i8 |= startRestartGroup.changed(i) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        if ((i7 & 1024) != 0) {
                            i11 = i5;
                            i12 = i11 | 6;
                        } else {
                            i11 = i5;
                            if ((i11 & 6) == 0) {
                                i12 = i11 | (startRestartGroup.changedInstance(onTabSelected) ? 4 : 2);
                            } else {
                                i12 = i11;
                            }
                        }
                        if ((i7 & 2048) != 0) {
                            i12 |= 48;
                        } else if ((i11 & 48) == 0) {
                            i12 |= startRestartGroup.changedInstance(baseTabs) ? 32 : 16;
                        }
                        int i23 = i12;
                        if ((i7 & 4096) != 0) {
                            i23 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else if ((i11 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                            i23 |= startRestartGroup.changed(i2) ? 256 : 128;
                            if ((i7 & 8192) == 0) {
                                i23 |= 3072;
                            } else if ((i11 & 3072) == 0) {
                                i23 |= startRestartGroup.changedInstance(betListController) ? 2048 : 1024;
                            }
                            if ((i7 & 16384) == 0) {
                                i23 |= 24576;
                            } else if ((i11 & 24576) == 0) {
                                i23 |= startRestartGroup.changedInstance(onBetClick) ? 16384 : 8192;
                            }
                            if ((32768 & i7) == 0) {
                                i23 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i11 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i23 |= startRestartGroup.changedInstance(userService) ? 131072 : 65536;
                            }
                            if ((i7 & 65536) == 0) {
                                i23 |= 1572864;
                            } else if ((i11 & 1572864) == 0) {
                                i23 |= startRestartGroup.changedInstance(onGoToMatches) ? 1048576 : 524288;
                            }
                            if ((i7 & 131072) != 0) {
                                i21 = (12582912 & i11) == 0 ? startRestartGroup.changedInstance(rankingTabs) ? 8388608 : 4194304 : 12582912;
                                if ((262144 & i7) != 0) {
                                    i23 |= 100663296;
                                } else if ((100663296 & i11) == 0) {
                                    i23 |= startRestartGroup.changed(i3) ? 67108864 : 33554432;
                                    if ((i7 & 524288) == 0) {
                                        i23 |= 805306368;
                                    } else if ((i11 & 805306368) == 0) {
                                        i23 |= startRestartGroup.changedInstance(onRankingTabSelected) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                    }
                                    if ((i7 & 1048576) == 0) {
                                        i13 = i6;
                                        i14 = i13 | 6;
                                    } else {
                                        i13 = i6;
                                        if ((i13 & 6) == 0) {
                                            i14 = i13 | (startRestartGroup.changedInstance(onUserCLick) ? 4 : 2);
                                        } else {
                                            i14 = i13;
                                        }
                                    }
                                    i15 = i7 & 2097152;
                                    if (i15 == 0) {
                                        i14 |= 48;
                                    } else if ((i13 & 48) == 0) {
                                        i14 |= startRestartGroup.changedInstance(userDetailsController) ? 32 : 16;
                                    }
                                    int i24 = i14;
                                    i16 = i7 & 4194304;
                                    if (i16 == 0) {
                                        i24 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                    } else if ((i13 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                        i24 |= startRestartGroup.changedInstance(foreignUserDetailsController) ? 256 : 128;
                                        i17 = i7 & 8388608;
                                        if (i17 != 0) {
                                            i24 |= 3072;
                                        } else if ((i13 & 3072) == 0) {
                                            i24 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                                            i18 = i7 & 16777216;
                                            if (i18 == 0) {
                                                i24 |= 24576;
                                            } else if ((i13 & 24576) == 0) {
                                                i24 |= startRestartGroup.changed(userMessagesState) ? 16384 : 8192;
                                                i19 = i7 & 33554432;
                                                if (i19 != 0) {
                                                    i24 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                                } else if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                    i24 |= startRestartGroup.changed(userMessagesCallbacks) ? 131072 : 65536;
                                                }
                                                i20 = i7 & 67108864;
                                                if (i20 != 0) {
                                                    i24 |= 1572864;
                                                } else if ((i13 & 1572864) == 0) {
                                                    i24 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                                                }
                                                if ((i8 & 306783379) == 306783378 || (306783379 & i23) != 306783378 || (599187 & i24) != 599186 || !startRestartGroup.getSkipping()) {
                                                    boolean z6 = i9 != 0 ? false : z2;
                                                    Function0<Unit> function03 = i10 != 0 ? null : function0;
                                                    UserDetailsController userDetailsController3 = i15 != 0 ? null : userDetailsController;
                                                    ForeignUserDetailsController foreignUserDetailsController3 = i16 != 0 ? null : foreignUserDetailsController;
                                                    boolean z7 = i17 != 0 ? false : z3;
                                                    UserMessagesState userMessagesState3 = i18 != 0 ? new UserMessagesState(null, false, false, false, null, null, false, false, false, false, null, null, 0, false, 16383, null) : userMessagesState;
                                                    UserMessagesCallbacks userMessagesCallbacks3 = i19 != 0 ? new UserMessagesCallbacks(null, null, null, null, null, null, null, null, 255, null) : userMessagesCallbacks;
                                                    Function1<? super Long, Unit> function13 = i20 != 0 ? null : function1;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1492069172, i8, i23, "org.betup.ui.fragment.user.compose.UserProfileScreen (UserProfileScreen.kt:83)");
                                                    }
                                                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                    Alignment topCenter = Alignment.INSTANCE.getTopCenter();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    startRestartGroup.startReusableNode();
                                                    if (startRestartGroup.getInserting()) {
                                                        startRestartGroup.createNode(constructor);
                                                    } else {
                                                        startRestartGroup.useNode();
                                                    }
                                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    if (z) {
                                                        startRestartGroup.startReplaceGroup(1133405013);
                                                        ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(boxScopeInstance.align(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24)), Alignment.INSTANCE.getCenter()), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 28);
                                                        startRestartGroup.endReplaceGroup();
                                                    } else if (newUserInfoModel == null && z6 && function03 != null) {
                                                        startRestartGroup.startReplaceGroup(1133743626);
                                                        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(24));
                                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (startRestartGroup.getInserting()) {
                                                            startRestartGroup.createNode(constructor2);
                                                        } else {
                                                            startRestartGroup.useNode();
                                                        }
                                                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.error_loading_user_profile, startRestartGroup, 6), (Modifier) null, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                                                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                                                        ButtonKt.Button(function03, null, false, null, ButtonDefaults.INSTANCE.m2737buttonColorsro_MJ88(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0L, 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$UserProfileScreenKt.INSTANCE.m14211getLambda$1146352988$app_release(), startRestartGroup, ((i8 >> 21) & 14) | 805306368, 494);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endReplaceGroup();
                                                    } else {
                                                        startRestartGroup.startReplaceGroup(1134679330);
                                                        startRestartGroup.startReplaceGroup(5004770);
                                                        boolean z8 = (57344 & i23) == 16384;
                                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                                        if (z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda2
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    Unit UserProfileScreen$lambda$3$lambda$2$lambda$1;
                                                                    UserProfileScreen$lambda$3$lambda$2$lambda$1 = UserProfileScreenKt.UserProfileScreen$lambda$3$lambda$2$lambda$1(Function1.this, (BetsListModel) obj);
                                                                    return UserProfileScreen$lambda$3$lambda$2$lambda$1;
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        int i25 = 65534 & i8;
                                                        int i26 = i8 >> 9;
                                                        int i27 = (i26 & 3670016) | i25 | (458752 & i26);
                                                        int i28 = i23 << 21;
                                                        int i29 = i27 | (29360128 & i28) | (234881024 & i28) | (i28 & 1879048192);
                                                        int i30 = i24 << 21;
                                                        composer2 = startRestartGroup;
                                                        UserProfileContent(newUserInfoModel, newUserBetStatisticsModel, newUserRanksModel, userAchievements, newUserFavouritesModel, tabs, i, onTabSelected, baseTabs, i2, betListController, (Function1) rememberedValue, userService, onGoToMatches, rankingTabs, i3, onRankingTabSelected, onUserCLick, userDetailsController3, foreignUserDetailsController3, z7, userMessagesState3, userMessagesCallbacks3, function13, composer2, i29, ((i23 >> 9) & 4194190) | (29360128 & i30) | (234881024 & i30) | (i30 & 1879048192), (i24 >> 9) & 8190, 0);
                                                        composer2.endReplaceGroup();
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        composer2.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        z4 = z6;
                                                        function02 = function03;
                                                        userDetailsController2 = userDetailsController3;
                                                        foreignUserDetailsController2 = foreignUserDetailsController3;
                                                        z5 = z7;
                                                        userMessagesState2 = userMessagesState3;
                                                        userMessagesCallbacks2 = userMessagesCallbacks3;
                                                        function12 = function13;
                                                    }
                                                    composer2 = startRestartGroup;
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    z4 = z6;
                                                    function02 = function03;
                                                    userDetailsController2 = userDetailsController3;
                                                    foreignUserDetailsController2 = foreignUserDetailsController3;
                                                    z5 = z7;
                                                    userMessagesState2 = userMessagesState3;
                                                    userMessagesCallbacks2 = userMessagesCallbacks3;
                                                    function12 = function13;
                                                } else {
                                                    startRestartGroup.skipToGroupEnd();
                                                    z4 = z2;
                                                    function02 = function0;
                                                    userDetailsController2 = userDetailsController;
                                                    foreignUserDetailsController2 = foreignUserDetailsController;
                                                    z5 = z3;
                                                    userMessagesState2 = userMessagesState;
                                                    userMessagesCallbacks2 = userMessagesCallbacks;
                                                    function12 = function1;
                                                    composer2 = startRestartGroup;
                                                }
                                                endRestartGroup = composer2.endRestartGroup();
                                                if (endRestartGroup != null) {
                                                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj, Object obj2) {
                                                            Unit UserProfileScreen$lambda$4;
                                                            UserProfileScreen$lambda$4 = UserProfileScreenKt.UserProfileScreen$lambda$4(NewUserInfoModel.this, newUserBetStatisticsModel, newUserRanksModel, userAchievements, newUserFavouritesModel, z, z4, function02, tabs, i, onTabSelected, baseTabs, i2, betListController, onBetClick, userService, onGoToMatches, rankingTabs, i3, onRankingTabSelected, onUserCLick, userDetailsController2, foreignUserDetailsController2, z5, userMessagesState2, userMessagesCallbacks2, function12, i4, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                                            return UserProfileScreen$lambda$4;
                                                        }
                                                    });
                                                    return;
                                                }
                                                return;
                                            }
                                            i19 = i7 & 33554432;
                                            if (i19 != 0) {
                                            }
                                            i20 = i7 & 67108864;
                                            if (i20 != 0) {
                                            }
                                            if ((i8 & 306783379) == 306783378) {
                                            }
                                            if (i9 != 0) {
                                            }
                                            if (i10 != 0) {
                                            }
                                            if (i15 != 0) {
                                            }
                                            if (i16 != 0) {
                                            }
                                            if (i17 != 0) {
                                            }
                                            if (i18 != 0) {
                                            }
                                            if (i19 != 0) {
                                            }
                                            if (i20 != 0) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            Alignment topCenter2 = Alignment.INSTANCE.getTopCenter();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2, false);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl.getInserting()) {
                                            }
                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            if (z) {
                                            }
                                            composer2 = startRestartGroup;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            z4 = z6;
                                            function02 = function03;
                                            userDetailsController2 = userDetailsController3;
                                            foreignUserDetailsController2 = foreignUserDetailsController3;
                                            z5 = z7;
                                            userMessagesState2 = userMessagesState3;
                                            userMessagesCallbacks2 = userMessagesCallbacks3;
                                            function12 = function13;
                                            endRestartGroup = composer2.endRestartGroup();
                                            if (endRestartGroup != null) {
                                            }
                                        }
                                        i18 = i7 & 16777216;
                                        if (i18 == 0) {
                                        }
                                        i19 = i7 & 33554432;
                                        if (i19 != 0) {
                                        }
                                        i20 = i7 & 67108864;
                                        if (i20 != 0) {
                                        }
                                        if ((i8 & 306783379) == 306783378) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i10 != 0) {
                                        }
                                        if (i15 != 0) {
                                        }
                                        if (i16 != 0) {
                                        }
                                        if (i17 != 0) {
                                        }
                                        if (i18 != 0) {
                                        }
                                        if (i19 != 0) {
                                        }
                                        if (i20 != 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Alignment topCenter22 = Alignment.INSTANCE.getTopCenter();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter22, false);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl.getInserting()) {
                                        }
                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                        if (z) {
                                        }
                                        composer2 = startRestartGroup;
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        z4 = z6;
                                        function02 = function03;
                                        userDetailsController2 = userDetailsController3;
                                        foreignUserDetailsController2 = foreignUserDetailsController3;
                                        z5 = z7;
                                        userMessagesState2 = userMessagesState3;
                                        userMessagesCallbacks2 = userMessagesCallbacks3;
                                        function12 = function13;
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup != null) {
                                        }
                                    }
                                    i17 = i7 & 8388608;
                                    if (i17 != 0) {
                                    }
                                    i18 = i7 & 16777216;
                                    if (i18 == 0) {
                                    }
                                    i19 = i7 & 33554432;
                                    if (i19 != 0) {
                                    }
                                    i20 = i7 & 67108864;
                                    if (i20 != 0) {
                                    }
                                    if ((i8 & 306783379) == 306783378) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (i17 != 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    if (i19 != 0) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Alignment topCenter222 = Alignment.INSTANCE.getTopCenter();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter222, false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
                                    Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting()) {
                                    }
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                                    if (z) {
                                    }
                                    composer2 = startRestartGroup;
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    z4 = z6;
                                    function02 = function03;
                                    userDetailsController2 = userDetailsController3;
                                    foreignUserDetailsController2 = foreignUserDetailsController3;
                                    z5 = z7;
                                    userMessagesState2 = userMessagesState3;
                                    userMessagesCallbacks2 = userMessagesCallbacks3;
                                    function12 = function13;
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                if ((i7 & 524288) == 0) {
                                }
                                if ((i7 & 1048576) == 0) {
                                }
                                i15 = i7 & 2097152;
                                if (i15 == 0) {
                                }
                                int i242 = i14;
                                i16 = i7 & 4194304;
                                if (i16 == 0) {
                                }
                                i17 = i7 & 8388608;
                                if (i17 != 0) {
                                }
                                i18 = i7 & 16777216;
                                if (i18 == 0) {
                                }
                                i19 = i7 & 33554432;
                                if (i19 != 0) {
                                }
                                i20 = i7 & 67108864;
                                if (i20 != 0) {
                                }
                                if ((i8 & 306783379) == 306783378) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i17 != 0) {
                                }
                                if (i18 != 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (i20 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Alignment topCenter2222 = Alignment.INSTANCE.getTopCenter();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2222, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222);
                                Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                                if (z) {
                                }
                                composer2 = startRestartGroup;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z4 = z6;
                                function02 = function03;
                                userDetailsController2 = userDetailsController3;
                                foreignUserDetailsController2 = foreignUserDetailsController3;
                                z5 = z7;
                                userMessagesState2 = userMessagesState3;
                                userMessagesCallbacks2 = userMessagesCallbacks3;
                                function12 = function13;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i23 |= i21;
                            if ((262144 & i7) != 0) {
                            }
                            if ((i7 & 524288) == 0) {
                            }
                            if ((i7 & 1048576) == 0) {
                            }
                            i15 = i7 & 2097152;
                            if (i15 == 0) {
                            }
                            int i2422 = i14;
                            i16 = i7 & 4194304;
                            if (i16 == 0) {
                            }
                            i17 = i7 & 8388608;
                            if (i17 != 0) {
                            }
                            i18 = i7 & 16777216;
                            if (i18 == 0) {
                            }
                            i19 = i7 & 33554432;
                            if (i19 != 0) {
                            }
                            i20 = i7 & 67108864;
                            if (i20 != 0) {
                            }
                            if ((i8 & 306783379) == 306783378) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i20 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment topCenter22222 = Alignment.INSTANCE.getTopCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter22222, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222);
                            Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                            if (z) {
                            }
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z4 = z6;
                            function02 = function03;
                            userDetailsController2 = userDetailsController3;
                            foreignUserDetailsController2 = foreignUserDetailsController3;
                            z5 = z7;
                            userMessagesState2 = userMessagesState3;
                            userMessagesCallbacks2 = userMessagesCallbacks3;
                            function12 = function13;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i7 & 8192) == 0) {
                        }
                        if ((i7 & 16384) == 0) {
                        }
                        if ((32768 & i7) == 0) {
                        }
                        if ((i7 & 65536) == 0) {
                        }
                        if ((i7 & 131072) != 0) {
                        }
                        i23 |= i21;
                        if ((262144 & i7) != 0) {
                        }
                        if ((i7 & 524288) == 0) {
                        }
                        if ((i7 & 1048576) == 0) {
                        }
                        i15 = i7 & 2097152;
                        if (i15 == 0) {
                        }
                        int i24222 = i14;
                        i16 = i7 & 4194304;
                        if (i16 == 0) {
                        }
                        i17 = i7 & 8388608;
                        if (i17 != 0) {
                        }
                        i18 = i7 & 16777216;
                        if (i18 == 0) {
                        }
                        i19 = i7 & 33554432;
                        if (i19 != 0) {
                        }
                        i20 = i7 & 67108864;
                        if (i20 != 0) {
                        }
                        if ((i8 & 306783379) == 306783378) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i20 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment topCenter222222 = Alignment.INSTANCE.getTopCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter222222, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222);
                        Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                        if (z) {
                        }
                        composer2 = startRestartGroup;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z6;
                        function02 = function03;
                        userDetailsController2 = userDetailsController3;
                        foreignUserDetailsController2 = foreignUserDetailsController3;
                        z5 = z7;
                        userMessagesState2 = userMessagesState3;
                        userMessagesCallbacks2 = userMessagesCallbacks3;
                        function12 = function13;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i7 & 1024) != 0) {
                    }
                    if ((i7 & 2048) != 0) {
                    }
                    int i232 = i12;
                    if ((i7 & 4096) != 0) {
                    }
                    if ((i7 & 8192) == 0) {
                    }
                    if ((i7 & 16384) == 0) {
                    }
                    if ((32768 & i7) == 0) {
                    }
                    if ((i7 & 65536) == 0) {
                    }
                    if ((i7 & 131072) != 0) {
                    }
                    i232 |= i21;
                    if ((262144 & i7) != 0) {
                    }
                    if ((i7 & 524288) == 0) {
                    }
                    if ((i7 & 1048576) == 0) {
                    }
                    i15 = i7 & 2097152;
                    if (i15 == 0) {
                    }
                    int i242222 = i14;
                    i16 = i7 & 4194304;
                    if (i16 == 0) {
                    }
                    i17 = i7 & 8388608;
                    if (i17 != 0) {
                    }
                    i18 = i7 & 16777216;
                    if (i18 == 0) {
                    }
                    i19 = i7 & 33554432;
                    if (i19 != 0) {
                    }
                    i20 = i7 & 67108864;
                    if (i20 != 0) {
                    }
                    if ((i8 & 306783379) == 306783378) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier fillMaxSize$default2222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment topCenter2222222 = Alignment.INSTANCE.getTopCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2222222, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222222);
                    Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
                    if (z) {
                    }
                    composer2 = startRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z6;
                    function02 = function03;
                    userDetailsController2 = userDetailsController3;
                    foreignUserDetailsController2 = foreignUserDetailsController3;
                    z5 = z7;
                    userMessagesState2 = userMessagesState3;
                    userMessagesCallbacks2 = userMessagesCallbacks3;
                    function12 = function13;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 |= i22;
                if ((i7 & 512) == 0) {
                }
                if ((i7 & 1024) != 0) {
                }
                if ((i7 & 2048) != 0) {
                }
                int i2322 = i12;
                if ((i7 & 4096) != 0) {
                }
                if ((i7 & 8192) == 0) {
                }
                if ((i7 & 16384) == 0) {
                }
                if ((32768 & i7) == 0) {
                }
                if ((i7 & 65536) == 0) {
                }
                if ((i7 & 131072) != 0) {
                }
                i2322 |= i21;
                if ((262144 & i7) != 0) {
                }
                if ((i7 & 524288) == 0) {
                }
                if ((i7 & 1048576) == 0) {
                }
                i15 = i7 & 2097152;
                if (i15 == 0) {
                }
                int i2422222 = i14;
                i16 = i7 & 4194304;
                if (i16 == 0) {
                }
                i17 = i7 & 8388608;
                if (i17 != 0) {
                }
                i18 = i7 & 16777216;
                if (i18 == 0) {
                }
                i19 = i7 & 33554432;
                if (i19 != 0) {
                }
                i20 = i7 & 67108864;
                if (i20 != 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i20 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier fillMaxSize$default22222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment topCenter22222222 = Alignment.INSTANCE.getTopCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter22222222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222222);
                Function0<ComposeUiNode> constructor32222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier32222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22222222 = BoxScopeInstance.INSTANCE;
                if (z) {
                }
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z6;
                function02 = function03;
                userDetailsController2 = userDetailsController3;
                foreignUserDetailsController2 = foreignUserDetailsController3;
                z5 = z7;
                userMessagesState2 = userMessagesState3;
                userMessagesCallbacks2 = userMessagesCallbacks3;
                function12 = function13;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i7 & 32) != 0) {
            }
            i9 = i7 & 64;
            if (i9 != 0) {
            }
            i10 = i7 & 128;
            if (i10 != 0) {
            }
            if ((i7 & 256) == 0) {
            }
            i8 |= i22;
            if ((i7 & 512) == 0) {
            }
            if ((i7 & 1024) != 0) {
            }
            if ((i7 & 2048) != 0) {
            }
            int i23222 = i12;
            if ((i7 & 4096) != 0) {
            }
            if ((i7 & 8192) == 0) {
            }
            if ((i7 & 16384) == 0) {
            }
            if ((32768 & i7) == 0) {
            }
            if ((i7 & 65536) == 0) {
            }
            if ((i7 & 131072) != 0) {
            }
            i23222 |= i21;
            if ((262144 & i7) != 0) {
            }
            if ((i7 & 524288) == 0) {
            }
            if ((i7 & 1048576) == 0) {
            }
            i15 = i7 & 2097152;
            if (i15 == 0) {
            }
            int i24222222 = i14;
            i16 = i7 & 4194304;
            if (i16 == 0) {
            }
            i17 = i7 & 8388608;
            if (i17 != 0) {
            }
            i18 = i7 & 16777216;
            if (i18 == 0) {
            }
            i19 = i7 & 33554432;
            if (i19 != 0) {
            }
            i20 = i7 & 67108864;
            if (i20 != 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i20 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxSize$default222222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment topCenter222222222 = Alignment.INSTANCE.getTopCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter222222222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222222);
            Function0<ComposeUiNode> constructor322222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier322222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222222222 = BoxScopeInstance.INSTANCE;
            if (z) {
            }
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z4 = z6;
            function02 = function03;
            userDetailsController2 = userDetailsController3;
            foreignUserDetailsController2 = foreignUserDetailsController3;
            z5 = z7;
            userMessagesState2 = userMessagesState3;
            userMessagesCallbacks2 = userMessagesCallbacks3;
            function12 = function13;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i7 & 8) == 0) {
        }
        if ((i7 & 16) == 0) {
        }
        if ((i7 & 32) != 0) {
        }
        i9 = i7 & 64;
        if (i9 != 0) {
        }
        i10 = i7 & 128;
        if (i10 != 0) {
        }
        if ((i7 & 256) == 0) {
        }
        i8 |= i22;
        if ((i7 & 512) == 0) {
        }
        if ((i7 & 1024) != 0) {
        }
        if ((i7 & 2048) != 0) {
        }
        int i232222 = i12;
        if ((i7 & 4096) != 0) {
        }
        if ((i7 & 8192) == 0) {
        }
        if ((i7 & 16384) == 0) {
        }
        if ((32768 & i7) == 0) {
        }
        if ((i7 & 65536) == 0) {
        }
        if ((i7 & 131072) != 0) {
        }
        i232222 |= i21;
        if ((262144 & i7) != 0) {
        }
        if ((i7 & 524288) == 0) {
        }
        if ((i7 & 1048576) == 0) {
        }
        i15 = i7 & 2097152;
        if (i15 == 0) {
        }
        int i242222222 = i14;
        i16 = i7 & 4194304;
        if (i16 == 0) {
        }
        i17 = i7 & 8388608;
        if (i17 != 0) {
        }
        i18 = i7 & 16777216;
        if (i18 == 0) {
        }
        i19 = i7 & 33554432;
        if (i19 != 0) {
        }
        i20 = i7 & 67108864;
        if (i20 != 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i20 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default2222222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment topCenter2222222222 = Alignment.INSTANCE.getTopCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222222222 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter2222222222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222222222);
        Function0<ComposeUiNode> constructor3222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222222222 = BoxScopeInstance.INSTANCE;
        if (z) {
        }
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z4 = z6;
        function02 = function03;
        userDetailsController2 = userDetailsController3;
        foreignUserDetailsController2 = foreignUserDetailsController3;
        z5 = z7;
        userMessagesState2 = userMessagesState3;
        userMessagesCallbacks2 = userMessagesCallbacks3;
        function12 = function13;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileScreen$lambda$3$lambda$2$lambda$1(Function1 function1, BetsListModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void UserProfileContent(final NewUserInfoModel newUserInfoModel, final NewUserBetStatisticsModel newUserBetStatisticsModel, final NewUserRanksModel newUserRanksModel, final List<NewUserAchievementsModel> list, final NewUserFavouritesModel newUserFavouritesModel, final List<? extends UserDetailsTab> list2, final int i, final Function1<? super Integer, Unit> function1, final List<BaseButtonMatchUIItem> list3, final int i2, final BetsController betsController, final Function1<? super BetsListModel, Unit> function12, final UserService userService, final Function1<? super FavouriteTypeK, Unit> function13, final List<? extends RankingTimeType> list4, final int i3, final Function1<? super Integer, Unit> function14, final Function1<? super Integer, Unit> function15, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, boolean z, UserMessagesState userMessagesState, UserMessagesCallbacks userMessagesCallbacks, Function1<? super Long, Unit> function16, Composer composer, final int i4, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        UserDetailsController userDetailsController2;
        UserMessagesCallbacks userMessagesCallbacks2;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        Object rememberedValue2;
        boolean changed;
        UserMessagesCallbacks userMessagesCallbacks3;
        UserProfileScreenKt$UserProfileContent$1$2$1 userProfileScreenKt$UserProfileContent$1$2$1;
        boolean changed2;
        UserProfileScreenKt$UserProfileContent$1$3$1 rememberedValue3;
        final UserDetailsController userDetailsController3;
        final ForeignUserDetailsController foreignUserDetailsController2;
        final UserMessagesCallbacks userMessagesCallbacks4;
        final boolean z2;
        final UserMessagesState userMessagesState2;
        final Function1<? super Long, Unit> function17;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-832839771);
        if ((i7 & 1) != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i8 = (startRestartGroup.changed(newUserInfoModel) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 |= startRestartGroup.changed(newUserBetStatisticsModel) ? 32 : 16;
            if ((i7 & 4) == 0) {
                i8 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i8 |= startRestartGroup.changed(newUserRanksModel) ? 256 : 128;
                if ((i7 & 8) != 0) {
                    i8 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    i8 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
                    if ((i7 & 16) == 0) {
                        i8 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i8 |= startRestartGroup.changedInstance(newUserFavouritesModel) ? 16384 : 8192;
                        if ((i7 & 32) != 0) {
                            i8 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i8 |= startRestartGroup.changedInstance(list2) ? 131072 : 65536;
                        }
                        if ((i7 & 64) != 0) {
                            i8 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i8 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                        }
                        if ((i7 & 128) != 0) {
                            i8 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i8 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                            if ((i7 & 256) == 0) {
                                i8 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i8 |= startRestartGroup.changedInstance(list3) ? 67108864 : 33554432;
                            }
                            if ((i7 & 512) == 0) {
                                i8 |= 805306368;
                            } else if ((i4 & 805306368) == 0) {
                                i8 |= startRestartGroup.changed(i2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            }
                            if ((i7 & 1024) == 0) {
                                i9 = i5 | 6;
                            } else if ((i5 & 6) == 0) {
                                i9 = i5 | (startRestartGroup.changedInstance(betsController) ? 4 : 2);
                            } else {
                                i9 = i5;
                            }
                            if ((i7 & 2048) == 0) {
                                i9 |= 48;
                            } else if ((i5 & 48) == 0) {
                                i9 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
                                int i17 = i9;
                                if ((i7 & 4096) != 0) {
                                    i17 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                } else if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                    i17 |= startRestartGroup.changedInstance(userService) ? 256 : 128;
                                    if ((i7 & 8192) == 0) {
                                        i17 |= 3072;
                                    } else if ((i5 & 3072) == 0) {
                                        i17 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
                                        if ((i7 & 16384) != 0) {
                                            i17 |= 24576;
                                        } else if ((i5 & 24576) == 0) {
                                            i17 |= startRestartGroup.changedInstance(list4) ? 16384 : 8192;
                                            if ((i7 & 32768) == 0) {
                                                i17 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                            } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                                i17 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                                            }
                                            if ((i7 & 65536) == 0) {
                                                i17 |= 1572864;
                                            } else if ((i5 & 1572864) == 0) {
                                                i17 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                                            }
                                            if ((i7 & 131072) == 0) {
                                                i17 |= 12582912;
                                            } else if ((i5 & 12582912) == 0) {
                                                i17 |= startRestartGroup.changedInstance(function15) ? 8388608 : 4194304;
                                            }
                                            i10 = i7 & 262144;
                                            if (i10 == 0) {
                                                i17 |= 100663296;
                                            } else if ((i5 & 100663296) == 0) {
                                                i17 |= startRestartGroup.changedInstance(userDetailsController) ? 67108864 : 33554432;
                                            }
                                            i11 = i7 & 524288;
                                            if (i11 == 0) {
                                                i17 |= 805306368;
                                            } else if ((i5 & 805306368) == 0) {
                                                i17 |= startRestartGroup.changedInstance(foreignUserDetailsController) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                                            }
                                            i12 = i7 & 1048576;
                                            if (i12 == 0) {
                                                i13 = i6 | 6;
                                            } else if ((i6 & 6) == 0) {
                                                i13 = i6 | (startRestartGroup.changed(z) ? 4 : 2);
                                            } else {
                                                i13 = i6;
                                            }
                                            i14 = i7 & 2097152;
                                            if (i14 == 0) {
                                                i13 |= 48;
                                            } else if ((i6 & 48) == 0) {
                                                i13 |= startRestartGroup.changed(userMessagesState) ? 32 : 16;
                                            }
                                            int i18 = i13;
                                            i15 = i7 & 4194304;
                                            if (i15 == 0) {
                                                i18 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                                            } else if ((i6 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                                i18 |= startRestartGroup.changed(userMessagesCallbacks) ? 256 : 128;
                                                i16 = i7 & 8388608;
                                                if (i16 != 0) {
                                                    i18 |= 3072;
                                                } else if ((i6 & 3072) == 0) {
                                                    i18 |= startRestartGroup.changedInstance(function16) ? 2048 : 1024;
                                                    if ((i8 & 306783379) == 306783378 || (306783379 & i17) != 306783378 || (i18 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                                        userDetailsController2 = i10 == 0 ? null : userDetailsController;
                                                        ForeignUserDetailsController foreignUserDetailsController3 = i11 == 0 ? null : foreignUserDetailsController;
                                                        boolean z3 = i12 == 0 ? false : z;
                                                        UserMessagesState userMessagesState3 = i14 == 0 ? new UserMessagesState(null, false, false, false, null, null, false, false, false, false, null, null, 0, false, 16383, null) : userMessagesState;
                                                        userMessagesCallbacks2 = i15 == 0 ? new UserMessagesCallbacks(null, null, null, null, null, null, null, null, 255, null) : userMessagesCallbacks;
                                                        Function1<? super Long, Unit> function18 = i16 == 0 ? null : function16;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-832839771, i8, i17, "org.betup.ui.fragment.user.compose.UserProfileContent (UserProfileScreen.kt:176)");
                                                        }
                                                        startRestartGroup.startReplaceGroup(1849434622);
                                                        rememberedValue = startRestartGroup.rememberedValue();
                                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                                        }
                                                        MutableState mutableState = (MutableState) rememberedValue;
                                                        startRestartGroup.endReplaceGroup();
                                                        State<Dp> m914animateDpAsStateAjpBEmI = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                                                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (!startRestartGroup.getInserting()) {
                                                            startRestartGroup.createNode(constructor);
                                                        } else {
                                                            startRestartGroup.useNode();
                                                        }
                                                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI)), 0.0f, 1, null);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (!startRestartGroup.getInserting()) {
                                                            startRestartGroup.createNode(constructor2);
                                                        } else {
                                                            startRestartGroup.useNode();
                                                        }
                                                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        startRestartGroup.startReusableNode();
                                                        if (!startRestartGroup.getInserting()) {
                                                            startRestartGroup.createNode(constructor3);
                                                        } else {
                                                            startRestartGroup.useNode();
                                                        }
                                                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                        UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                                                        float f = 2;
                                                        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                                                        UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                                                        startRestartGroup.startReplaceGroup(1849434622);
                                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    int UserProfileContent$lambda$15$lambda$12$lambda$11;
                                                                    UserProfileContent$lambda$15$lambda$12$lambda$11 = UserProfileScreenKt.UserProfileContent$lambda$15$lambda$12$lambda$11();
                                                                    return Integer.valueOf(UserProfileContent$lambda$15$lambda$12$lambda$11);
                                                                }
                                                            };
                                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        int i19 = (i8 >> 27) & 14;
                                                        PagerState rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i19 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                                                        Integer valueOf = Integer.valueOf(i2);
                                                        startRestartGroup.startReplaceGroup(-1746271574);
                                                        int i20 = i8 & 1879048192;
                                                        changed = ((i18 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i20 != 536870912);
                                                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                        if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                            userMessagesCallbacks3 = userMessagesCallbacks2;
                                                            userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState, i2, userMessagesCallbacks3, null);
                                                            startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                                                        } else {
                                                            userProfileScreenKt$UserProfileContent$1$2$1 = rememberedValue4;
                                                            userMessagesCallbacks3 = userMessagesCallbacks2;
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i19);
                                                        Integer valueOf2 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                                                        startRestartGroup.startReplaceGroup(-1224400529);
                                                        ForeignUserDetailsController foreignUserDetailsController4 = foreignUserDetailsController3;
                                                        changed2 = (i20 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController4);
                                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                                        if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState, i2, userDetailsController2, foreignUserDetailsController4, null);
                                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                                        }
                                                        startRestartGroup.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                                        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController4, function18, mutableState), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        startRestartGroup.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        userDetailsController3 = userDetailsController2;
                                                        foreignUserDetailsController2 = foreignUserDetailsController4;
                                                        userMessagesCallbacks4 = userMessagesCallbacks3;
                                                        z2 = z3;
                                                        userMessagesState2 = userMessagesState3;
                                                        function17 = function18;
                                                    } else {
                                                        startRestartGroup.skipToGroupEnd();
                                                        userDetailsController3 = userDetailsController;
                                                        foreignUserDetailsController2 = foreignUserDetailsController;
                                                        z2 = z;
                                                        userMessagesState2 = userMessagesState;
                                                        userMessagesCallbacks4 = userMessagesCallbacks;
                                                        function17 = function16;
                                                    }
                                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                                    if (endRestartGroup == null) {
                                                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj, Object obj2) {
                                                                Unit UserProfileContent$lambda$16;
                                                                UserProfileContent$lambda$16 = UserProfileScreenKt.UserProfileContent$lambda$16(NewUserInfoModel.this, newUserBetStatisticsModel, newUserRanksModel, list, newUserFavouritesModel, list2, i, function1, list3, i2, betsController, function12, userService, function13, list4, i3, function14, function15, userDetailsController3, foreignUserDetailsController2, z2, userMessagesState2, userMessagesCallbacks4, function17, i4, i5, i6, i7, (Composer) obj, ((Integer) obj2).intValue());
                                                                return UserProfileContent$lambda$16;
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if ((i8 & 306783379) == 306783378) {
                                                }
                                                if (i10 == 0) {
                                                }
                                                if (i11 == 0) {
                                                }
                                                if (i12 == 0) {
                                                }
                                                if (i14 == 0) {
                                                }
                                                if (i15 == 0) {
                                                }
                                                if (i16 == 0) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                startRestartGroup.startReplaceGroup(1849434622);
                                                rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                }
                                                MutableState mutableState2 = (MutableState) rememberedValue;
                                                startRestartGroup.endReplaceGroup();
                                                State<Dp> m914animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState2)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                                                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (!startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl.getInserting()) {
                                                }
                                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI2)), 0.0f, 1, null);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (!startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl2.getInserting()) {
                                                }
                                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                                                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (!startRestartGroup.getInserting()) {
                                                }
                                                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4610constructorimpl3.getInserting()) {
                                                }
                                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                                                UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                                                float f2 = 2;
                                                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                                                UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                                                startRestartGroup.startReplaceGroup(1849434622);
                                                rememberedValue2 = startRestartGroup.rememberedValue();
                                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                int i192 = (i8 >> 27) & 14;
                                                PagerState rememberPagerStateWithoutSavedState2 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i192 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                                                Integer valueOf3 = Integer.valueOf(i2);
                                                startRestartGroup.startReplaceGroup(-1746271574);
                                                int i202 = i8 & 1879048192;
                                                changed = ((i18 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2) | (i202 != 536870912);
                                                Object rememberedValue42 = startRestartGroup.rememberedValue();
                                                if (changed) {
                                                }
                                                userMessagesCallbacks3 = userMessagesCallbacks2;
                                                userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState2, i2, userMessagesCallbacks3, null);
                                                startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                                                startRestartGroup.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i192);
                                                Integer valueOf22 = Integer.valueOf(rememberPagerStateWithoutSavedState2.getCurrentPage());
                                                startRestartGroup.startReplaceGroup(-1224400529);
                                                ForeignUserDetailsController foreignUserDetailsController42 = foreignUserDetailsController3;
                                                changed2 = (i202 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController42);
                                                rememberedValue3 = startRestartGroup.rememberedValue();
                                                if (!changed2) {
                                                }
                                                rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState2, i2, userDetailsController2, foreignUserDetailsController42, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                                startRestartGroup.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController42, function18, mutableState2), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                userDetailsController3 = userDetailsController2;
                                                foreignUserDetailsController2 = foreignUserDetailsController42;
                                                userMessagesCallbacks4 = userMessagesCallbacks3;
                                                z2 = z3;
                                                userMessagesState2 = userMessagesState3;
                                                function17 = function18;
                                                endRestartGroup = startRestartGroup.endRestartGroup();
                                                if (endRestartGroup == null) {
                                                }
                                            }
                                            i16 = i7 & 8388608;
                                            if (i16 != 0) {
                                            }
                                            if ((i8 & 306783379) == 306783378) {
                                            }
                                            if (i10 == 0) {
                                            }
                                            if (i11 == 0) {
                                            }
                                            if (i12 == 0) {
                                            }
                                            if (i14 == 0) {
                                            }
                                            if (i15 == 0) {
                                            }
                                            if (i16 == 0) {
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            }
                                            MutableState mutableState22 = (MutableState) rememberedValue;
                                            startRestartGroup.endReplaceGroup();
                                            State<Dp> m914animateDpAsStateAjpBEmI22 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState22)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                                            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                                            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (!startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl.getInserting()) {
                                            }
                                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                                            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI22)), 0.0f, 1, null);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                                            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (!startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl2.getInserting()) {
                                            }
                                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            Modifier.Companion companion22 = Modifier.INSTANCE;
                                            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                                            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (!startRestartGroup.getInserting()) {
                                            }
                                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl3.getInserting()) {
                                            }
                                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
                                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                                            UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                                            float f22 = 2;
                                            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                                            UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                                            startRestartGroup.startReplaceGroup(1849434622);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            int i1922 = (i8 >> 27) & 14;
                                            PagerState rememberPagerStateWithoutSavedState22 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i1922 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                                            Integer valueOf32 = Integer.valueOf(i2);
                                            startRestartGroup.startReplaceGroup(-1746271574);
                                            int i2022 = i8 & 1879048192;
                                            changed = ((i18 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22) | (i2022 != 536870912);
                                            Object rememberedValue422 = startRestartGroup.rememberedValue();
                                            if (changed) {
                                            }
                                            userMessagesCallbacks3 = userMessagesCallbacks2;
                                            userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState22, i2, userMessagesCallbacks3, null);
                                            startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i1922);
                                            Integer valueOf222 = Integer.valueOf(rememberPagerStateWithoutSavedState22.getCurrentPage());
                                            startRestartGroup.startReplaceGroup(-1224400529);
                                            ForeignUserDetailsController foreignUserDetailsController422 = foreignUserDetailsController3;
                                            changed2 = (i2022 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController422);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (!changed2) {
                                            }
                                            rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState22, i2, userDetailsController2, foreignUserDetailsController422, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance32, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController422, function18, mutableState22), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            userDetailsController3 = userDetailsController2;
                                            foreignUserDetailsController2 = foreignUserDetailsController422;
                                            userMessagesCallbacks4 = userMessagesCallbacks3;
                                            z2 = z3;
                                            userMessagesState2 = userMessagesState3;
                                            function17 = function18;
                                            endRestartGroup = startRestartGroup.endRestartGroup();
                                            if (endRestartGroup == null) {
                                            }
                                        }
                                        if ((i7 & 32768) == 0) {
                                        }
                                        if ((i7 & 65536) == 0) {
                                        }
                                        if ((i7 & 131072) == 0) {
                                        }
                                        i10 = i7 & 262144;
                                        if (i10 == 0) {
                                        }
                                        i11 = i7 & 524288;
                                        if (i11 == 0) {
                                        }
                                        i12 = i7 & 1048576;
                                        if (i12 == 0) {
                                        }
                                        i14 = i7 & 2097152;
                                        if (i14 == 0) {
                                        }
                                        int i182 = i13;
                                        i15 = i7 & 4194304;
                                        if (i15 == 0) {
                                        }
                                        i16 = i7 & 8388608;
                                        if (i16 != 0) {
                                        }
                                        if ((i8 & 306783379) == 306783378) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i16 == 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        }
                                        MutableState mutableState222 = (MutableState) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        State<Dp> m914animateDpAsStateAjpBEmI222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                                        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
                                        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (!startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl.getInserting()) {
                                        }
                                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
                                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
                                        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI222)), 0.0f, 1, null);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
                                        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (!startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl2.getInserting()) {
                                        }
                                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion222 = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
                                        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (!startRestartGroup.getInserting()) {
                                        }
                                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4610constructorimpl3.getInserting()) {
                                        }
                                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
                                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                                        UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                                        float f222 = 2;
                                        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                                        UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        int i19222 = (i8 >> 27) & 14;
                                        PagerState rememberPagerStateWithoutSavedState222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i19222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                                        Integer valueOf322 = Integer.valueOf(i2);
                                        startRestartGroup.startReplaceGroup(-1746271574);
                                        int i20222 = i8 & 1879048192;
                                        changed = ((i182 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222) | (i20222 != 536870912);
                                        Object rememberedValue4222 = startRestartGroup.rememberedValue();
                                        if (changed) {
                                        }
                                        userMessagesCallbacks3 = userMessagesCallbacks2;
                                        userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState222, i2, userMessagesCallbacks3, null);
                                        startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                                        startRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(valueOf322, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i19222);
                                        Integer valueOf2222 = Integer.valueOf(rememberPagerStateWithoutSavedState222.getCurrentPage());
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        ForeignUserDetailsController foreignUserDetailsController4222 = foreignUserDetailsController3;
                                        changed2 = (i20222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController4222);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!changed2) {
                                        }
                                        rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState222, i2, userDetailsController2, foreignUserDetailsController4222, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                        startRestartGroup.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance322, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController4222, function18, mutableState222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        userDetailsController3 = userDetailsController2;
                                        foreignUserDetailsController2 = foreignUserDetailsController4222;
                                        userMessagesCallbacks4 = userMessagesCallbacks3;
                                        z2 = z3;
                                        userMessagesState2 = userMessagesState3;
                                        function17 = function18;
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup == null) {
                                        }
                                    }
                                    if ((i7 & 16384) != 0) {
                                    }
                                    if ((i7 & 32768) == 0) {
                                    }
                                    if ((i7 & 65536) == 0) {
                                    }
                                    if ((i7 & 131072) == 0) {
                                    }
                                    i10 = i7 & 262144;
                                    if (i10 == 0) {
                                    }
                                    i11 = i7 & 524288;
                                    if (i11 == 0) {
                                    }
                                    i12 = i7 & 1048576;
                                    if (i12 == 0) {
                                    }
                                    i14 = i7 & 2097152;
                                    if (i14 == 0) {
                                    }
                                    int i1822 = i13;
                                    i15 = i7 & 4194304;
                                    if (i15 == 0) {
                                    }
                                    i16 = i7 & 8388608;
                                    if (i16 != 0) {
                                    }
                                    if ((i8 & 306783379) == 306783378) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    MutableState mutableState2222 = (MutableState) rememberedValue;
                                    startRestartGroup.endReplaceGroup();
                                    State<Dp> m914animateDpAsStateAjpBEmI2222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState2222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                                    Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy3222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222);
                                    Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting()) {
                                    }
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222);
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance3222 = ColumnScopeInstance.INSTANCE;
                                    Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI2222)), 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
                                    Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl2.getInserting()) {
                                    }
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    Modifier.Companion companion2222 = Modifier.INSTANCE;
                                    MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
                                    Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl3.getInserting()) {
                                    }
                                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222);
                                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                                    UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                                    float f2222 = 2;
                                    SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                                    UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                                    startRestartGroup.startReplaceGroup(1849434622);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    int i192222 = (i8 >> 27) & 14;
                                    PagerState rememberPagerStateWithoutSavedState2222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i192222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                                    Integer valueOf3222 = Integer.valueOf(i2);
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    int i202222 = i8 & 1879048192;
                                    changed = ((i1822 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222) | (i202222 != 536870912);
                                    Object rememberedValue42222 = startRestartGroup.rememberedValue();
                                    if (changed) {
                                    }
                                    userMessagesCallbacks3 = userMessagesCallbacks2;
                                    userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState2222, i2, userMessagesCallbacks3, null);
                                    startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf3222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i192222);
                                    Integer valueOf22222 = Integer.valueOf(rememberPagerStateWithoutSavedState2222.getCurrentPage());
                                    startRestartGroup.startReplaceGroup(-1224400529);
                                    ForeignUserDetailsController foreignUserDetailsController42222 = foreignUserDetailsController3;
                                    changed2 = (i202222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController42222);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!changed2) {
                                    }
                                    rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState2222, i2, userDetailsController2, foreignUserDetailsController42222, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                    PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance3222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController42222, function18, mutableState2222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    userDetailsController3 = userDetailsController2;
                                    foreignUserDetailsController2 = foreignUserDetailsController42222;
                                    userMessagesCallbacks4 = userMessagesCallbacks3;
                                    z2 = z3;
                                    userMessagesState2 = userMessagesState3;
                                    function17 = function18;
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup == null) {
                                    }
                                }
                                if ((i7 & 8192) == 0) {
                                }
                                if ((i7 & 16384) != 0) {
                                }
                                if ((i7 & 32768) == 0) {
                                }
                                if ((i7 & 65536) == 0) {
                                }
                                if ((i7 & 131072) == 0) {
                                }
                                i10 = i7 & 262144;
                                if (i10 == 0) {
                                }
                                i11 = i7 & 524288;
                                if (i11 == 0) {
                                }
                                i12 = i7 & 1048576;
                                if (i12 == 0) {
                                }
                                i14 = i7 & 2097152;
                                if (i14 == 0) {
                                }
                                int i18222 = i13;
                                i15 = i7 & 4194304;
                                if (i15 == 0) {
                                }
                                i16 = i7 & 8388608;
                                if (i16 != 0) {
                                }
                                if ((i8 & 306783379) == 306783378) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                MutableState mutableState22222 = (MutableState) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                State<Dp> m914animateDpAsStateAjpBEmI22222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState22222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                                Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy32222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap42222 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier42222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222);
                                Function0<ComposeUiNode> constructor42222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance32222 = ColumnScopeInstance.INSTANCE;
                                Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI22222)), 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22222);
                                Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl2.getInserting()) {
                                }
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                Modifier.Companion companion22222 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222);
                                Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl3.getInserting()) {
                                }
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322222);
                                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                                UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                                float f22222 = 2;
                                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                                UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                int i1922222 = (i8 >> 27) & 14;
                                PagerState rememberPagerStateWithoutSavedState22222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i1922222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                                Integer valueOf32222 = Integer.valueOf(i2);
                                startRestartGroup.startReplaceGroup(-1746271574);
                                int i2022222 = i8 & 1879048192;
                                changed = ((i18222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222) | (i2022222 != 536870912);
                                Object rememberedValue422222 = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                userMessagesCallbacks3 = userMessagesCallbacks2;
                                userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState22222, i2, userMessagesCallbacks3, null);
                                startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf32222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i1922222);
                                Integer valueOf222222 = Integer.valueOf(rememberPagerStateWithoutSavedState22222.getCurrentPage());
                                startRestartGroup.startReplaceGroup(-1224400529);
                                ForeignUserDetailsController foreignUserDetailsController422222 = foreignUserDetailsController3;
                                changed2 = (i2022222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController422222);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState22222, i2, userDetailsController2, foreignUserDetailsController422222, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance32222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController422222, function18, mutableState22222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                userDetailsController3 = userDetailsController2;
                                foreignUserDetailsController2 = foreignUserDetailsController422222;
                                userMessagesCallbacks4 = userMessagesCallbacks3;
                                z2 = z3;
                                userMessagesState2 = userMessagesState3;
                                function17 = function18;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            int i172 = i9;
                            if ((i7 & 4096) != 0) {
                            }
                            if ((i7 & 8192) == 0) {
                            }
                            if ((i7 & 16384) != 0) {
                            }
                            if ((i7 & 32768) == 0) {
                            }
                            if ((i7 & 65536) == 0) {
                            }
                            if ((i7 & 131072) == 0) {
                            }
                            i10 = i7 & 262144;
                            if (i10 == 0) {
                            }
                            i11 = i7 & 524288;
                            if (i11 == 0) {
                            }
                            i12 = i7 & 1048576;
                            if (i12 == 0) {
                            }
                            i14 = i7 & 2097152;
                            if (i14 == 0) {
                            }
                            int i182222 = i13;
                            i15 = i7 & 4194304;
                            if (i15 == 0) {
                            }
                            i16 = i7 & 8388608;
                            if (i16 != 0) {
                            }
                            if ((i8 & 306783379) == 306783378) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            MutableState mutableState222222 = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            State<Dp> m914animateDpAsStateAjpBEmI222222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState222222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                            Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy322222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap422222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier422222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222);
                            Function0<ComposeUiNode> constructor422222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance322222 = ColumnScopeInstance.INSTANCE;
                            Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI222222)), 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222222);
                            Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl2.getInserting()) {
                            }
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            Modifier.Companion companion222222 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222222);
                            Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl3.getInserting()) {
                            }
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222222);
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
                            UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                            float f222222 = 2;
                            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                            UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            int i19222222 = (i8 >> 27) & 14;
                            PagerState rememberPagerStateWithoutSavedState222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i19222222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                            Integer valueOf322222 = Integer.valueOf(i2);
                            startRestartGroup.startReplaceGroup(-1746271574);
                            int i20222222 = i8 & 1879048192;
                            changed = ((i182222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222222) | (i20222222 != 536870912);
                            Object rememberedValue4222222 = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            userMessagesCallbacks3 = userMessagesCallbacks2;
                            userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState222222, i2, userMessagesCallbacks3, null);
                            startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf322222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i19222222);
                            Integer valueOf2222222 = Integer.valueOf(rememberPagerStateWithoutSavedState222222.getCurrentPage());
                            startRestartGroup.startReplaceGroup(-1224400529);
                            ForeignUserDetailsController foreignUserDetailsController4222222 = foreignUserDetailsController3;
                            changed2 = (i20222222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController4222222);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed2) {
                            }
                            rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState222222, i2, userDetailsController2, foreignUserDetailsController4222222, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance322222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController4222222, function18, mutableState222222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            userDetailsController3 = userDetailsController2;
                            foreignUserDetailsController2 = foreignUserDetailsController4222222;
                            userMessagesCallbacks4 = userMessagesCallbacks3;
                            z2 = z3;
                            userMessagesState2 = userMessagesState3;
                            function17 = function18;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        if ((i7 & 256) == 0) {
                        }
                        if ((i7 & 512) == 0) {
                        }
                        if ((i7 & 1024) == 0) {
                        }
                        if ((i7 & 2048) == 0) {
                        }
                        int i1722 = i9;
                        if ((i7 & 4096) != 0) {
                        }
                        if ((i7 & 8192) == 0) {
                        }
                        if ((i7 & 16384) != 0) {
                        }
                        if ((i7 & 32768) == 0) {
                        }
                        if ((i7 & 65536) == 0) {
                        }
                        if ((i7 & 131072) == 0) {
                        }
                        i10 = i7 & 262144;
                        if (i10 == 0) {
                        }
                        i11 = i7 & 524288;
                        if (i11 == 0) {
                        }
                        i12 = i7 & 1048576;
                        if (i12 == 0) {
                        }
                        i14 = i7 & 2097152;
                        if (i14 == 0) {
                        }
                        int i1822222 = i13;
                        i15 = i7 & 4194304;
                        if (i15 == 0) {
                        }
                        i16 = i7 & 8388608;
                        if (i16 != 0) {
                        }
                        if ((i8 & 306783379) == 306783378) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i14 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState2222222 = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        State<Dp> m914animateDpAsStateAjpBEmI2222222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState2222222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                        Modifier fillMaxSize$default2222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy3222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4222222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222222);
                        Function0<ComposeUiNode> constructor4222222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy3222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222222);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3222222 = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default2222222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI2222222)), 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22222222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222222);
                        Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting()) {
                        }
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        Modifier.Companion companion2222222 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy22222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32222222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier32222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222222);
                        Function0<ComposeUiNode> constructor32222222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting()) {
                        }
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222222);
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance22222222 = ColumnScopeInstance.INSTANCE;
                        UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                        float f2222222 = 2;
                        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                        UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        int i192222222 = (i8 >> 27) & 14;
                        PagerState rememberPagerStateWithoutSavedState2222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i192222222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                        Integer valueOf3222222 = Integer.valueOf(i2);
                        startRestartGroup.startReplaceGroup(-1746271574);
                        int i202222222 = i8 & 1879048192;
                        changed = ((i1822222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222222) | (i202222222 != 536870912);
                        Object rememberedValue42222222 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        userMessagesCallbacks3 = userMessagesCallbacks2;
                        userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState2222222, i2, userMessagesCallbacks3, null);
                        startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf3222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i192222222);
                        Integer valueOf22222222 = Integer.valueOf(rememberPagerStateWithoutSavedState2222222.getCurrentPage());
                        startRestartGroup.startReplaceGroup(-1224400529);
                        ForeignUserDetailsController foreignUserDetailsController42222222 = foreignUserDetailsController3;
                        changed2 = (i202222222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController42222222);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState2222222, i2, userDetailsController2, foreignUserDetailsController42222222, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf22222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance3222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController42222222, function18, mutableState2222222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        userDetailsController3 = userDetailsController2;
                        foreignUserDetailsController2 = foreignUserDetailsController42222222;
                        userMessagesCallbacks4 = userMessagesCallbacks3;
                        z2 = z3;
                        userMessagesState2 = userMessagesState3;
                        function17 = function18;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i7 & 32) != 0) {
                    }
                    if ((i7 & 64) != 0) {
                    }
                    if ((i7 & 128) != 0) {
                    }
                    if ((i7 & 256) == 0) {
                    }
                    if ((i7 & 512) == 0) {
                    }
                    if ((i7 & 1024) == 0) {
                    }
                    if ((i7 & 2048) == 0) {
                    }
                    int i17222 = i9;
                    if ((i7 & 4096) != 0) {
                    }
                    if ((i7 & 8192) == 0) {
                    }
                    if ((i7 & 16384) != 0) {
                    }
                    if ((i7 & 32768) == 0) {
                    }
                    if ((i7 & 65536) == 0) {
                    }
                    if ((i7 & 131072) == 0) {
                    }
                    i10 = i7 & 262144;
                    if (i10 == 0) {
                    }
                    i11 = i7 & 524288;
                    if (i11 == 0) {
                    }
                    i12 = i7 & 1048576;
                    if (i12 == 0) {
                    }
                    i14 = i7 & 2097152;
                    if (i14 == 0) {
                    }
                    int i18222222 = i13;
                    i15 = i7 & 4194304;
                    if (i15 == 0) {
                    }
                    i16 = i7 & 8388608;
                    if (i16 != 0) {
                    }
                    if ((i8 & 306783379) == 306783378) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState22222222 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    State<Dp> m914animateDpAsStateAjpBEmI22222222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState22222222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                    Modifier fillMaxSize$default22222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy32222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222222);
                    Function0<ComposeUiNode> constructor42222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy32222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance32222222 = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default22222222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI22222222)), 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22222222);
                    Function0<ComposeUiNode> constructor222222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting()) {
                    }
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222222);
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22222222 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    Modifier.Companion companion22222222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap322222222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier322222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222222);
                    Function0<ComposeUiNode> constructor322222222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting()) {
                    }
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322222222);
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322222222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance222222222 = ColumnScopeInstance.INSTANCE;
                    UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                    float f22222222 = 2;
                    SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                    UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    int i1922222222 = (i8 >> 27) & 14;
                    PagerState rememberPagerStateWithoutSavedState22222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i1922222222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                    Integer valueOf32222222 = Integer.valueOf(i2);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    int i2022222222 = i8 & 1879048192;
                    changed = ((i18222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222222) | (i2022222222 != 536870912);
                    Object rememberedValue422222222 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    userMessagesCallbacks3 = userMessagesCallbacks2;
                    userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState22222222, i2, userMessagesCallbacks3, null);
                    startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf32222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i1922222222);
                    Integer valueOf222222222 = Integer.valueOf(rememberPagerStateWithoutSavedState22222222.getCurrentPage());
                    startRestartGroup.startReplaceGroup(-1224400529);
                    ForeignUserDetailsController foreignUserDetailsController422222222 = foreignUserDetailsController3;
                    changed2 = (i2022222222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController422222222);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState22222222, i2, userDetailsController2, foreignUserDetailsController422222222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf222222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                    PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance32222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController422222222, function18, mutableState22222222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    userDetailsController3 = userDetailsController2;
                    foreignUserDetailsController2 = foreignUserDetailsController422222222;
                    userMessagesCallbacks4 = userMessagesCallbacks3;
                    z2 = z3;
                    userMessagesState2 = userMessagesState3;
                    function17 = function18;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                if ((i7 & 16) == 0) {
                }
                if ((i7 & 32) != 0) {
                }
                if ((i7 & 64) != 0) {
                }
                if ((i7 & 128) != 0) {
                }
                if ((i7 & 256) == 0) {
                }
                if ((i7 & 512) == 0) {
                }
                if ((i7 & 1024) == 0) {
                }
                if ((i7 & 2048) == 0) {
                }
                int i172222 = i9;
                if ((i7 & 4096) != 0) {
                }
                if ((i7 & 8192) == 0) {
                }
                if ((i7 & 16384) != 0) {
                }
                if ((i7 & 32768) == 0) {
                }
                if ((i7 & 65536) == 0) {
                }
                if ((i7 & 131072) == 0) {
                }
                i10 = i7 & 262144;
                if (i10 == 0) {
                }
                i11 = i7 & 524288;
                if (i11 == 0) {
                }
                i12 = i7 & 1048576;
                if (i12 == 0) {
                }
                i14 = i7 & 2097152;
                if (i14 == 0) {
                }
                int i182222222 = i13;
                i15 = i7 & 4194304;
                if (i15 == 0) {
                }
                i16 = i7 & 8388608;
                if (i16 != 0) {
                }
                if ((i8 & 306783379) == 306783378) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState222222222 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                State<Dp> m914animateDpAsStateAjpBEmI222222222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState222222222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
                Modifier fillMaxSize$default222222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy322222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap422222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier422222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222222);
                Function0<ComposeUiNode> constructor422222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy322222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422222222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier422222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance322222222 = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default222222222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI222222222)), 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222222222);
                Function0<ComposeUiNode> constructor2222222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222222);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222222222 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier.Companion companion222222222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3222222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222222222);
                Function0<ComposeUiNode> constructor3222222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222222222);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2222222222 = ColumnScopeInstance.INSTANCE;
                UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
                float f222222222 = 2;
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
                UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f222222222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                int i19222222222 = (i8 >> 27) & 14;
                PagerState rememberPagerStateWithoutSavedState222222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i19222222222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
                Integer valueOf322222222 = Integer.valueOf(i2);
                startRestartGroup.startReplaceGroup(-1746271574);
                int i20222222222 = i8 & 1879048192;
                changed = ((i182222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222222222) | (i20222222222 != 536870912);
                Object rememberedValue4222222222 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                userMessagesCallbacks3 = userMessagesCallbacks2;
                userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState222222222, i2, userMessagesCallbacks3, null);
                startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf322222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i19222222222);
                Integer valueOf2222222222 = Integer.valueOf(rememberPagerStateWithoutSavedState222222222.getCurrentPage());
                startRestartGroup.startReplaceGroup(-1224400529);
                ForeignUserDetailsController foreignUserDetailsController4222222222 = foreignUserDetailsController3;
                changed2 = (i20222222222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222222222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController4222222222);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState222222222, i2, userDetailsController2, foreignUserDetailsController4222222222, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2222222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState222222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance322222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController4222222222, function18, mutableState222222222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                userDetailsController3 = userDetailsController2;
                foreignUserDetailsController2 = foreignUserDetailsController4222222222;
                userMessagesCallbacks4 = userMessagesCallbacks3;
                z2 = z3;
                userMessagesState2 = userMessagesState3;
                function17 = function18;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i7 & 8) != 0) {
            }
            if ((i7 & 16) == 0) {
            }
            if ((i7 & 32) != 0) {
            }
            if ((i7 & 64) != 0) {
            }
            if ((i7 & 128) != 0) {
            }
            if ((i7 & 256) == 0) {
            }
            if ((i7 & 512) == 0) {
            }
            if ((i7 & 1024) == 0) {
            }
            if ((i7 & 2048) == 0) {
            }
            int i1722222 = i9;
            if ((i7 & 4096) != 0) {
            }
            if ((i7 & 8192) == 0) {
            }
            if ((i7 & 16384) != 0) {
            }
            if ((i7 & 32768) == 0) {
            }
            if ((i7 & 65536) == 0) {
            }
            if ((i7 & 131072) == 0) {
            }
            i10 = i7 & 262144;
            if (i10 == 0) {
            }
            i11 = i7 & 524288;
            if (i11 == 0) {
            }
            i12 = i7 & 1048576;
            if (i12 == 0) {
            }
            i14 = i7 & 2097152;
            if (i14 == 0) {
            }
            int i1822222222 = i13;
            i15 = i7 & 4194304;
            if (i15 == 0) {
            }
            i16 = i7 & 8388608;
            if (i16 != 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState2222222222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State<Dp> m914animateDpAsStateAjpBEmI2222222222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState2222222222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
            Modifier fillMaxSize$default2222222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy3222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4222222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222222222);
            Function0<ComposeUiNode> constructor4222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy3222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4222222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier4222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3222222222 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default2222222222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI2222222222)), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222222222);
            Function0<ComposeUiNode> constructor22222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222222222 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion2222222222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy22222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32222222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222222222);
            Function0<ComposeUiNode> constructor32222222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy22222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32222222222);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32222222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22222222222 = ColumnScopeInstance.INSTANCE;
            UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
            float f2222222222 = 2;
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222222222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
            UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2222222222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            int i192222222222 = (i8 >> 27) & 14;
            PagerState rememberPagerStateWithoutSavedState2222222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i192222222222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
            Integer valueOf3222222222 = Integer.valueOf(i2);
            startRestartGroup.startReplaceGroup(-1746271574);
            int i202222222222 = i8 & 1879048192;
            changed = ((i1822222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222222222) | (i202222222222 != 536870912);
            Object rememberedValue42222222222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            userMessagesCallbacks3 = userMessagesCallbacks2;
            userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState2222222222, i2, userMessagesCallbacks3, null);
            startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf3222222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i192222222222);
            Integer valueOf22222222222 = Integer.valueOf(rememberPagerStateWithoutSavedState2222222222.getCurrentPage());
            startRestartGroup.startReplaceGroup(-1224400529);
            ForeignUserDetailsController foreignUserDetailsController42222222222 = foreignUserDetailsController3;
            changed2 = (i202222222222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222222222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController42222222222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState2222222222, i2, userDetailsController2, foreignUserDetailsController42222222222, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22222222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2222222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance3222222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController42222222222, function18, mutableState2222222222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            userDetailsController3 = userDetailsController2;
            foreignUserDetailsController2 = foreignUserDetailsController42222222222;
            userMessagesCallbacks4 = userMessagesCallbacks3;
            z2 = z3;
            userMessagesState2 = userMessagesState3;
            function17 = function18;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i7 & 4) == 0) {
        }
        if ((i7 & 8) != 0) {
        }
        if ((i7 & 16) == 0) {
        }
        if ((i7 & 32) != 0) {
        }
        if ((i7 & 64) != 0) {
        }
        if ((i7 & 128) != 0) {
        }
        if ((i7 & 256) == 0) {
        }
        if ((i7 & 512) == 0) {
        }
        if ((i7 & 1024) == 0) {
        }
        if ((i7 & 2048) == 0) {
        }
        int i17222222 = i9;
        if ((i7 & 4096) != 0) {
        }
        if ((i7 & 8192) == 0) {
        }
        if ((i7 & 16384) != 0) {
        }
        if ((i7 & 32768) == 0) {
        }
        if ((i7 & 65536) == 0) {
        }
        if ((i7 & 131072) == 0) {
        }
        i10 = i7 & 262144;
        if (i10 == 0) {
        }
        i11 = i7 & 524288;
        if (i11 == 0) {
        }
        i12 = i7 & 1048576;
        if (i12 == 0) {
        }
        i14 = i7 & 2097152;
        if (i14 == 0) {
        }
        int i18222222222 = i13;
        i15 = i7 & 4194304;
        if (i15 == 0) {
        }
        i16 = i7 & 8388608;
        if (i16 != 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState22222222222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        State<Dp> m914animateDpAsStateAjpBEmI22222222222 = AnimateAsStateKt.m914animateDpAsStateAjpBEmI(Dp.m7774constructorimpl((i2 == 3 || !UserProfileContent$lambda$6(mutableState22222222222)) ? MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED : 160), AnimationSpecKt.tween$default(200, 0, null, 6, null), "headerHeight", null, startRestartGroup, 432, 8);
        Modifier fillMaxSize$default22222222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy32222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222222222);
        Function0<ComposeUiNode> constructor42222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy32222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42222222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier42222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance32222222222 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default22222222222 = SizeKt.fillMaxWidth$default(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, UserProfileContent$lambda$8(m914animateDpAsStateAjpBEmI22222222222)), 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22222222222);
        Function0<ComposeUiNode> constructor222222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222222222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222222222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion22222222222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy222222222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322222222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322222222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222222222);
        Function0<ComposeUiNode> constructor322222222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy222222222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322222222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322222222222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322222222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222222222222 = ColumnScopeInstance.INSTANCE;
        UserHeaderKt.UserHeader(Modifier.INSTANCE, newUserInfoModel, newUserRanksModel, newUserBetStatisticsModel, startRestartGroup, ((i8 << 3) & 112) | 6 | (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 << 6) & 7168), 0);
        float f22222222222 = 2;
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222222222), Dp.m7774constructorimpl(8)), startRestartGroup, 6);
        UserDetailTabsUiKt.UserDetailTabsUi(list3, startRestartGroup, (i8 >> 24) & 14);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f22222222222), Dp.m7774constructorimpl(20)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        int i1922222222222 = (i8 >> 27) & 14;
        PagerState rememberPagerStateWithoutSavedState22222222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i2, 0.0f, (Function0) rememberedValue2, startRestartGroup, i1922222222222 | RendererCapabilities.DECODER_SUPPORT_MASK, 2);
        Integer valueOf32222222222 = Integer.valueOf(i2);
        startRestartGroup.startReplaceGroup(-1746271574);
        int i2022222222222 = i8 & 1879048192;
        changed = ((i18222222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222222222) | (i2022222222222 != 536870912);
        Object rememberedValue422222222222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        userMessagesCallbacks3 = userMessagesCallbacks2;
        userProfileScreenKt$UserProfileContent$1$2$1 = new UserProfileScreenKt$UserProfileContent$1$2$1(rememberPagerStateWithoutSavedState22222222222, i2, userMessagesCallbacks3, null);
        startRestartGroup.updateRememberedValue(userProfileScreenKt$UserProfileContent$1$2$1);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32222222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) userProfileScreenKt$UserProfileContent$1$2$1, startRestartGroup, i1922222222222);
        Integer valueOf222222222222 = Integer.valueOf(rememberPagerStateWithoutSavedState22222222222.getCurrentPage());
        startRestartGroup.startReplaceGroup(-1224400529);
        ForeignUserDetailsController foreignUserDetailsController422222222222 = foreignUserDetailsController3;
        changed2 = (i2022222222222 != 536870912) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222222222) | startRestartGroup.changedInstance(userDetailsController2) | startRestartGroup.changedInstance(foreignUserDetailsController422222222222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new UserProfileScreenKt$UserProfileContent$1$3$1(rememberPagerStateWithoutSavedState22222222222, i2, userDetailsController2, foreignUserDetailsController422222222222, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf222222222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22222222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance32222222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2020916466, true, new UserProfileScreenKt$UserProfileContent$1$4(userMessagesState3, userMessagesCallbacks3, list2, i, function1, newUserBetStatisticsModel, list, newUserFavouritesModel, betsController, function12, userService, function13, list4, i3, function14, function15, z3, userDetailsController2, foreignUserDetailsController422222222222, function18, mutableState22222222222), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        userDetailsController3 = userDetailsController2;
        foreignUserDetailsController2 = foreignUserDetailsController422222222222;
        userMessagesCallbacks4 = userMessagesCallbacks3;
        z2 = z3;
        userMessagesState2 = userMessagesState3;
        function17 = function18;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean UserProfileContent$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserProfileContent$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0447 A[LOOP:1: B:127:0x0441->B:129:0x0447, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserProfileTabContent(final List<? extends UserDetailsTab> list, final int i, final Function1<? super Integer, Unit> function1, final NewUserBetStatisticsModel newUserBetStatisticsModel, final List<NewUserAchievementsModel> list2, final NewUserFavouritesModel newUserFavouritesModel, final BetsController betsController, final Function1<? super BetsListModel, Unit> function12, final UserService userService, final Function1<? super FavouriteTypeK, Unit> function13, final List<? extends RankingTimeType> list3, final int i2, final Function1<? super Integer, Unit> function14, final Function1<? super Integer, Unit> function15, boolean z, UserDetailsController userDetailsController, ForeignUserDetailsController foreignUserDetailsController, Function1<? super Long, Unit> function16, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        final List list4;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        UserProfileScreenKt$UserProfileTabContent$1$1 rememberedValue2;
        boolean changed;
        UserProfileScreenKt$UserProfileTabContent$2$1 rememberedValue3;
        Object obj;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Iterator it;
        final UserDetailsController userDetailsController2;
        final ForeignUserDetailsController foreignUserDetailsController2;
        final Function1<? super Long, Unit> function17;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-558138987);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i6 |= startRestartGroup.changed(newUserBetStatisticsModel) ? 2048 : 1024;
            if ((i5 & 16) == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                i6 |= startRestartGroup.changedInstance(list2) ? 16384 : 8192;
                if ((i5 & 32) != 0) {
                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i6 |= startRestartGroup.changedInstance(newUserFavouritesModel) ? 131072 : 65536;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((100663296 & i3) == 0) {
                    i6 |= startRestartGroup.changedInstance(userService) ? 67108864 : 33554432;
                    if ((i5 & 512) == 0) {
                        i6 |= 805306368;
                    } else if ((805306368 & i3) == 0) {
                        i6 |= startRestartGroup.changedInstance(function13) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                        if ((i5 & 1024) != 0) {
                            i7 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i7 = i4 | (startRestartGroup.changedInstance(list3) ? 4 : 2);
                        } else {
                            i7 = i4;
                        }
                        if ((i5 & 2048) != 0) {
                            i7 |= 48;
                        } else if ((i4 & 48) == 0) {
                            i7 |= startRestartGroup.changed(i2) ? 32 : 16;
                            int i12 = i7;
                            if ((i5 & 4096) == 0) {
                                i12 |= RendererCapabilities.DECODER_SUPPORT_MASK;
                            } else if ((i4 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                                i12 |= startRestartGroup.changedInstance(function14) ? 256 : 128;
                                if ((i5 & 8192) != 0) {
                                    i12 |= 3072;
                                } else if ((i4 & 3072) == 0) {
                                    i12 |= startRestartGroup.changedInstance(function15) ? 2048 : 1024;
                                    i8 = i5 & 16384;
                                    if (i8 == 0) {
                                        i12 |= 24576;
                                    } else if ((i4 & 24576) == 0) {
                                        i12 |= startRestartGroup.changed(z) ? 16384 : 8192;
                                        i9 = i5 & 32768;
                                        if (i9 != 0) {
                                            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                        } else if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                            i12 |= startRestartGroup.changedInstance(userDetailsController) ? 131072 : 65536;
                                        }
                                        i10 = i5 & 65536;
                                        if (i10 != 0) {
                                            i12 |= 1572864;
                                        } else if ((i4 & 1572864) == 0) {
                                            i12 |= startRestartGroup.changedInstance(foreignUserDetailsController) ? 1048576 : 524288;
                                        }
                                        i11 = i5 & 131072;
                                        if (i11 != 0) {
                                            i12 |= 12582912;
                                        } else if ((i4 & 12582912) == 0) {
                                            i12 |= startRestartGroup.changedInstance(function16) ? 8388608 : 4194304;
                                        }
                                        if ((i6 & 302064787) == 302064786 || (4793491 & i12) != 4793490 || !startRestartGroup.getSkipping()) {
                                            z2 = i8 != 0 ? false : z;
                                            UserDetailsController userDetailsController3 = i9 != 0 ? null : userDetailsController;
                                            ForeignUserDetailsController foreignUserDetailsController3 = i10 != 0 ? null : foreignUserDetailsController;
                                            Function1<? super Long, Unit> function18 = i11 != 0 ? null : function16;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-558138987, i6, i12, "org.betup.ui.fragment.user.compose.UserProfileTabContent (UserProfileScreen.kt:305)");
                                            }
                                            if (z2) {
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj2 : list) {
                                                    if (!(((UserDetailsTab) obj2) instanceof UserDetailsTab.Activity)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                                list4 = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$UserProfileTabContent$$inlined$sortedBy$1
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // java.util.Comparator
                                                    public final int compare(T t, T t2) {
                                                        int i13;
                                                        UserDetailsTab userDetailsTab = (UserDetailsTab) t;
                                                        int i14 = 3;
                                                        if (userDetailsTab instanceof UserDetailsTab.Stats) {
                                                            i13 = 0;
                                                        } else if (userDetailsTab instanceof UserDetailsTab.Bets) {
                                                            i13 = 1;
                                                        } else if (userDetailsTab instanceof UserDetailsTab.About) {
                                                            i13 = 2;
                                                        } else {
                                                            i13 = userDetailsTab instanceof UserDetailsTab.Ranking ? 3 : 4;
                                                        }
                                                        Integer valueOf = Integer.valueOf(i13);
                                                        UserDetailsTab userDetailsTab2 = (UserDetailsTab) t2;
                                                        if (userDetailsTab2 instanceof UserDetailsTab.Stats) {
                                                            i14 = 0;
                                                        } else if (userDetailsTab2 instanceof UserDetailsTab.Bets) {
                                                            i14 = 1;
                                                        } else if (userDetailsTab2 instanceof UserDetailsTab.About) {
                                                            i14 = 2;
                                                        } else if (!(userDetailsTab2 instanceof UserDetailsTab.Ranking)) {
                                                            i14 = 4;
                                                        }
                                                        return ComparisonsKt.compareValues(valueOf, Integer.valueOf(i14));
                                                    }
                                                });
                                            } else {
                                                ArrayList arrayList2 = new ArrayList();
                                                Iterator it2 = list.iterator();
                                                while (it2.hasNext()) {
                                                    Object next = it2.next();
                                                    UserDetailsTab userDetailsTab = (UserDetailsTab) next;
                                                    Iterator it3 = it2;
                                                    if (!(userDetailsTab instanceof UserDetailsTab.Activity) && !(userDetailsTab instanceof UserDetailsTab.Bets)) {
                                                        arrayList2.add(next);
                                                    }
                                                    it2 = it3;
                                                }
                                                list4 = arrayList2;
                                            }
                                            startRestartGroup.startReplaceGroup(5004770);
                                            changedInstance = startRestartGroup.changedInstance(list4);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        int size;
                                                        size = list4.size();
                                                        return Integer.valueOf(size);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            int i13 = (i6 >> 3) & 14;
                                            int i14 = i6;
                                            PagerState rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i13, 2);
                                            Integer valueOf = Integer.valueOf(i);
                                            Integer valueOf2 = Integer.valueOf(list4.size());
                                            startRestartGroup.startReplaceGroup(-1746271574);
                                            int i15 = i14 & 112;
                                            changedInstance2 = startRestartGroup.changedInstance(list4) | (i15 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, startRestartGroup, i13);
                                            Integer valueOf3 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                                            startRestartGroup.startReplaceGroup(-1746271574);
                                            changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState) | (i15 == 32) | ((i14 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                obj = null;
                                                rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState, i, function1, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            } else {
                                                obj = null;
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            startRestartGroup.startReusableNode();
                                            if (startRestartGroup.getInserting()) {
                                                startRestartGroup.createNode(constructor);
                                            } else {
                                                startRestartGroup.useNode();
                                            }
                                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            startRestartGroup.startReplaceGroup(-504950898);
                                            List list5 = list4;
                                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                                            it = list5.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(StringResources_androidKt.stringResource(((UserDetailsTab) it.next()).getTitleRes(), startRestartGroup, 0));
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            UserTabsProfileKt.UserTabs(arrayList3, i, function1, null, startRestartGroup, i14 & 1008, 8);
                                            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            startRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            userDetailsController2 = userDetailsController3;
                                            foreignUserDetailsController2 = foreignUserDetailsController3;
                                            function17 = function18;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            z2 = z;
                                            userDetailsController2 = userDetailsController;
                                            foreignUserDetailsController2 = foreignUserDetailsController;
                                            function17 = function16;
                                        }
                                        endRestartGroup = startRestartGroup.endRestartGroup();
                                        if (endRestartGroup != null) {
                                            final boolean z3 = z2;
                                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj3, Object obj4) {
                                                    Unit UserProfileTabContent$lambda$26;
                                                    UserProfileTabContent$lambda$26 = UserProfileScreenKt.UserProfileTabContent$lambda$26(list, i, function1, newUserBetStatisticsModel, list2, newUserFavouritesModel, betsController, function12, userService, function13, list3, i2, function14, function15, z3, userDetailsController2, foreignUserDetailsController2, function17, i3, i4, i5, (Composer) obj3, ((Integer) obj4).intValue());
                                                    return UserProfileTabContent$lambda$26;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i9 = i5 & 32768;
                                    if (i9 != 0) {
                                    }
                                    i10 = i5 & 65536;
                                    if (i10 != 0) {
                                    }
                                    i11 = i5 & 131072;
                                    if (i11 != 0) {
                                    }
                                    if ((i6 & 302064787) == 302064786) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (z2) {
                                    }
                                    startRestartGroup.startReplaceGroup(5004770);
                                    changedInstance = startRestartGroup.changedInstance(list4);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (!changedInstance) {
                                    }
                                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int size;
                                            size = list4.size();
                                            return Integer.valueOf(size);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                    startRestartGroup.endReplaceGroup();
                                    int i132 = (i6 >> 3) & 14;
                                    int i142 = i6;
                                    PagerState rememberPagerStateWithoutSavedState2 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i132, 2);
                                    Integer valueOf4 = Integer.valueOf(i);
                                    Integer valueOf22 = Integer.valueOf(list4.size());
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    int i152 = i142 & 112;
                                    changedInstance2 = startRestartGroup.changedInstance(list4) | (i152 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!changedInstance2) {
                                    }
                                    rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf4, valueOf22, (Function2) rememberedValue2, startRestartGroup, i132);
                                    Integer valueOf32 = Integer.valueOf(rememberPagerStateWithoutSavedState2.getCurrentPage());
                                    startRestartGroup.startReplaceGroup(-1746271574);
                                    changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState2) | (i152 == 32) | ((i142 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (changed) {
                                    }
                                    obj = null;
                                    rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState2, i, function1, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                    startRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m4610constructorimpl.getInserting()) {
                                    }
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    startRestartGroup.startReplaceGroup(-504950898);
                                    List list52 = list4;
                                    ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list52, 10));
                                    it = list52.iterator();
                                    while (it.hasNext()) {
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    UserTabsProfileKt.UserTabs(arrayList32, i, function1, null, startRestartGroup, i142 & 1008, 8);
                                    PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    userDetailsController2 = userDetailsController3;
                                    foreignUserDetailsController2 = foreignUserDetailsController3;
                                    function17 = function18;
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                i8 = i5 & 16384;
                                if (i8 == 0) {
                                }
                                i9 = i5 & 32768;
                                if (i9 != 0) {
                                }
                                i10 = i5 & 65536;
                                if (i10 != 0) {
                                }
                                i11 = i5 & 131072;
                                if (i11 != 0) {
                                }
                                if ((i6 & 302064787) == 302064786) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (z2) {
                                }
                                startRestartGroup.startReplaceGroup(5004770);
                                changedInstance = startRestartGroup.changedInstance(list4);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changedInstance) {
                                }
                                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int size;
                                        size = list4.size();
                                        return Integer.valueOf(size);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceGroup();
                                int i1322 = (i6 >> 3) & 14;
                                int i1422 = i6;
                                PagerState rememberPagerStateWithoutSavedState22 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i1322, 2);
                                Integer valueOf42 = Integer.valueOf(i);
                                Integer valueOf222 = Integer.valueOf(list4.size());
                                startRestartGroup.startReplaceGroup(-1746271574);
                                int i1522 = i1422 & 112;
                                changedInstance2 = startRestartGroup.changedInstance(list4) | (i1522 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changedInstance2) {
                                }
                                rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState22, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf42, valueOf222, (Function2) rememberedValue2, startRestartGroup, i1322);
                                Integer valueOf322 = Integer.valueOf(rememberPagerStateWithoutSavedState22.getCurrentPage());
                                startRestartGroup.startReplaceGroup(-1746271574);
                                changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState22) | (i1522 == 32) | ((i1422 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                obj = null;
                                rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState22, i, function1, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf322, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                                Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4610constructorimpl.getInserting()) {
                                }
                                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                                startRestartGroup.startReplaceGroup(-504950898);
                                List list522 = list4;
                                ArrayList arrayList322 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list522, 10));
                                it = list522.iterator();
                                while (it.hasNext()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                UserTabsProfileKt.UserTabs(arrayList322, i, function1, null, startRestartGroup, i1422 & 1008, 8);
                                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                userDetailsController2 = userDetailsController3;
                                foreignUserDetailsController2 = foreignUserDetailsController3;
                                function17 = function18;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            if ((i5 & 8192) != 0) {
                            }
                            i8 = i5 & 16384;
                            if (i8 == 0) {
                            }
                            i9 = i5 & 32768;
                            if (i9 != 0) {
                            }
                            i10 = i5 & 65536;
                            if (i10 != 0) {
                            }
                            i11 = i5 & 131072;
                            if (i11 != 0) {
                            }
                            if ((i6 & 302064787) == 302064786) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (z2) {
                            }
                            startRestartGroup.startReplaceGroup(5004770);
                            changedInstance = startRestartGroup.changedInstance(list4);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance) {
                            }
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int size;
                                    size = list4.size();
                                    return Integer.valueOf(size);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            int i13222 = (i6 >> 3) & 14;
                            int i14222 = i6;
                            PagerState rememberPagerStateWithoutSavedState222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i13222, 2);
                            Integer valueOf422 = Integer.valueOf(i);
                            Integer valueOf2222 = Integer.valueOf(list4.size());
                            startRestartGroup.startReplaceGroup(-1746271574);
                            int i15222 = i14222 & 112;
                            changedInstance2 = startRestartGroup.changedInstance(list4) | (i15222 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changedInstance2) {
                            }
                            rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState222, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf422, valueOf2222, (Function2) rememberedValue2, startRestartGroup, i13222);
                            Integer valueOf3222 = Integer.valueOf(rememberPagerStateWithoutSavedState222.getCurrentPage());
                            startRestartGroup.startReplaceGroup(-1746271574);
                            changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState222) | (i15222 == 32) | ((i14222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            obj = null;
                            rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState222, i, function1, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(valueOf3222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                            Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
                            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m4610constructorimpl.getInserting()) {
                            }
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                            Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-504950898);
                            List list5222 = list4;
                            ArrayList arrayList3222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5222, 10));
                            it = list5222.iterator();
                            while (it.hasNext()) {
                            }
                            startRestartGroup.endReplaceGroup();
                            UserTabsProfileKt.UserTabs(arrayList3222, i, function1, null, startRestartGroup, i14222 & 1008, 8);
                            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            userDetailsController2 = userDetailsController3;
                            foreignUserDetailsController2 = foreignUserDetailsController3;
                            function17 = function18;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        int i122 = i7;
                        if ((i5 & 4096) == 0) {
                        }
                        if ((i5 & 8192) != 0) {
                        }
                        i8 = i5 & 16384;
                        if (i8 == 0) {
                        }
                        i9 = i5 & 32768;
                        if (i9 != 0) {
                        }
                        i10 = i5 & 65536;
                        if (i10 != 0) {
                        }
                        i11 = i5 & 131072;
                        if (i11 != 0) {
                        }
                        if ((i6 & 302064787) == 302064786) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (z2) {
                        }
                        startRestartGroup.startReplaceGroup(5004770);
                        changedInstance = startRestartGroup.changedInstance(list4);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int size;
                                size = list4.size();
                                return Integer.valueOf(size);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        int i132222 = (i6 >> 3) & 14;
                        int i142222 = i6;
                        PagerState rememberPagerStateWithoutSavedState2222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i132222, 2);
                        Integer valueOf4222 = Integer.valueOf(i);
                        Integer valueOf22222 = Integer.valueOf(list4.size());
                        startRestartGroup.startReplaceGroup(-1746271574);
                        int i152222 = i142222 & 112;
                        changedInstance2 = startRestartGroup.changedInstance(list4) | (i152222 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState2222, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf4222, valueOf22222, (Function2) rememberedValue2, startRestartGroup, i132222);
                        Integer valueOf32222 = Integer.valueOf(rememberPagerStateWithoutSavedState2222.getCurrentPage());
                        startRestartGroup.startReplaceGroup(-1746271574);
                        changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState2222) | (i152222 == 32) | ((i142222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        obj = null;
                        rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState2222, i, function1, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf32222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                        Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222);
                        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-504950898);
                        List list52222 = list4;
                        ArrayList arrayList32222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list52222, 10));
                        it = list52222.iterator();
                        while (it.hasNext()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        UserTabsProfileKt.UserTabs(arrayList32222, i, function1, null, startRestartGroup, i142222 & 1008, 8);
                        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        userDetailsController2 = userDetailsController3;
                        foreignUserDetailsController2 = foreignUserDetailsController3;
                        function17 = function18;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i5 & 1024) != 0) {
                    }
                    if ((i5 & 2048) != 0) {
                    }
                    int i1222 = i7;
                    if ((i5 & 4096) == 0) {
                    }
                    if ((i5 & 8192) != 0) {
                    }
                    i8 = i5 & 16384;
                    if (i8 == 0) {
                    }
                    i9 = i5 & 32768;
                    if (i9 != 0) {
                    }
                    i10 = i5 & 65536;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 131072;
                    if (i11 != 0) {
                    }
                    if ((i6 & 302064787) == 302064786) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (z2) {
                    }
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(list4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int size;
                            size = list4.size();
                            return Integer.valueOf(size);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    int i1322222 = (i6 >> 3) & 14;
                    int i1422222 = i6;
                    PagerState rememberPagerStateWithoutSavedState22222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i1322222, 2);
                    Integer valueOf42222 = Integer.valueOf(i);
                    Integer valueOf222222 = Integer.valueOf(list4.size());
                    startRestartGroup.startReplaceGroup(-1746271574);
                    int i1522222 = i1422222 & 112;
                    changedInstance2 = startRestartGroup.changedInstance(list4) | (i1522222 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance2) {
                    }
                    rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState22222, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf42222, valueOf222222, (Function2) rememberedValue2, startRestartGroup, i1322222);
                    Integer valueOf322222 = Integer.valueOf(rememberPagerStateWithoutSavedState22222.getCurrentPage());
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState22222) | (i1522222 == 32) | ((i1422222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    obj = null;
                    rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState22222, i, function1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf322222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                    Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222);
                    Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-504950898);
                    List list522222 = list4;
                    ArrayList arrayList322222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list522222, 10));
                    it = list522222.iterator();
                    while (it.hasNext()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    UserTabsProfileKt.UserTabs(arrayList322222, i, function1, null, startRestartGroup, i1422222 & 1008, 8);
                    PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance22222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    userDetailsController2 = userDetailsController3;
                    foreignUserDetailsController2 = foreignUserDetailsController3;
                    function17 = function18;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i5 & 512) == 0) {
                }
                if ((i5 & 1024) != 0) {
                }
                if ((i5 & 2048) != 0) {
                }
                int i12222 = i7;
                if ((i5 & 4096) == 0) {
                }
                if ((i5 & 8192) != 0) {
                }
                i8 = i5 & 16384;
                if (i8 == 0) {
                }
                i9 = i5 & 32768;
                if (i9 != 0) {
                }
                i10 = i5 & 65536;
                if (i10 != 0) {
                }
                i11 = i5 & 131072;
                if (i11 != 0) {
                }
                if ((i6 & 302064787) == 302064786) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z2) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance = startRestartGroup.changedInstance(list4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int size;
                        size = list4.size();
                        return Integer.valueOf(size);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                int i13222222 = (i6 >> 3) & 14;
                int i14222222 = i6;
                PagerState rememberPagerStateWithoutSavedState222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i13222222, 2);
                Integer valueOf422222 = Integer.valueOf(i);
                Integer valueOf2222222 = Integer.valueOf(list4.size());
                startRestartGroup.startReplaceGroup(-1746271574);
                int i15222222 = i14222222 & 112;
                changedInstance2 = startRestartGroup.changedInstance(list4) | (i15222222 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState222222);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState222222, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf422222, valueOf2222222, (Function2) rememberedValue2, startRestartGroup, i13222222);
                Integer valueOf3222222 = Integer.valueOf(rememberPagerStateWithoutSavedState222222.getCurrentPage());
                startRestartGroup.startReplaceGroup(-1746271574);
                changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState222222) | (i15222222 == 32) | ((i14222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                obj = null;
                rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState222222, i, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf3222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222222);
                Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-504950898);
                List list5222222 = list4;
                ArrayList arrayList3222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5222222, 10));
                it = list5222222.iterator();
                while (it.hasNext()) {
                }
                startRestartGroup.endReplaceGroup();
                UserTabsProfileKt.UserTabs(arrayList3222222, i, function1, null, startRestartGroup, i14222222 & 1008, 8);
                PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                userDetailsController2 = userDetailsController3;
                foreignUserDetailsController2 = foreignUserDetailsController3;
                function17 = function18;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i5 & 32) != 0) {
            }
            if ((i5 & 256) != 0) {
            }
            if ((i5 & 512) == 0) {
            }
            if ((i5 & 1024) != 0) {
            }
            if ((i5 & 2048) != 0) {
            }
            int i122222 = i7;
            if ((i5 & 4096) == 0) {
            }
            if ((i5 & 8192) != 0) {
            }
            i8 = i5 & 16384;
            if (i8 == 0) {
            }
            i9 = i5 & 32768;
            if (i9 != 0) {
            }
            i10 = i5 & 65536;
            if (i10 != 0) {
            }
            i11 = i5 & 131072;
            if (i11 != 0) {
            }
            if ((i6 & 302064787) == 302064786) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z2) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(list4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int size;
                    size = list4.size();
                    return Integer.valueOf(size);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            int i132222222 = (i6 >> 3) & 14;
            int i142222222 = i6;
            PagerState rememberPagerStateWithoutSavedState2222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i132222222, 2);
            Integer valueOf4222222 = Integer.valueOf(i);
            Integer valueOf22222222 = Integer.valueOf(list4.size());
            startRestartGroup.startReplaceGroup(-1746271574);
            int i152222222 = i142222222 & 112;
            changedInstance2 = startRestartGroup.changedInstance(list4) | (i152222222 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState2222222);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState2222222, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf4222222, valueOf22222222, (Function2) rememberedValue2, startRestartGroup, i132222222);
            Integer valueOf32222222 = Integer.valueOf(rememberPagerStateWithoutSavedState2222222.getCurrentPage());
            startRestartGroup.startReplaceGroup(-1746271574);
            changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState2222222) | (i152222222 == 32) | ((i142222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            obj = null;
            rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState2222222, i, function1, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf32222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
            Modifier fillMaxSize$default2222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2222222);
            Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-504950898);
            List list52222222 = list4;
            ArrayList arrayList32222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list52222222, 10));
            it = list52222222.iterator();
            while (it.hasNext()) {
            }
            startRestartGroup.endReplaceGroup();
            UserTabsProfileKt.UserTabs(arrayList32222222, i, function1, null, startRestartGroup, i142222222 & 1008, 8);
            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance2222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            userDetailsController2 = userDetailsController3;
            foreignUserDetailsController2 = foreignUserDetailsController3;
            function17 = function18;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i5 & 16) == 0) {
        }
        if ((i5 & 32) != 0) {
        }
        if ((i5 & 256) != 0) {
        }
        if ((i5 & 512) == 0) {
        }
        if ((i5 & 1024) != 0) {
        }
        if ((i5 & 2048) != 0) {
        }
        int i1222222 = i7;
        if ((i5 & 4096) == 0) {
        }
        if ((i5 & 8192) != 0) {
        }
        i8 = i5 & 16384;
        if (i8 == 0) {
        }
        i9 = i5 & 32768;
        if (i9 != 0) {
        }
        i10 = i5 & 65536;
        if (i10 != 0) {
        }
        i11 = i5 & 131072;
        if (i11 != 0) {
        }
        if ((i6 & 302064787) == 302064786) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (z2) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(list4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int size;
                size = list4.size();
                return Integer.valueOf(size);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i1322222222 = (i6 >> 3) & 14;
        int i1422222222 = i6;
        PagerState rememberPagerStateWithoutSavedState22222222 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(i, 0.0f, (Function0) rememberedValue, startRestartGroup, i1322222222, 2);
        Integer valueOf42222222 = Integer.valueOf(i);
        Integer valueOf222222222 = Integer.valueOf(list4.size());
        startRestartGroup.startReplaceGroup(-1746271574);
        int i1522222222 = i1422222222 & 112;
        changedInstance2 = startRestartGroup.changedInstance(list4) | (i1522222222 == 32) | startRestartGroup.changed(rememberPagerStateWithoutSavedState22222222);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = new UserProfileScreenKt$UserProfileTabContent$1$1(list4, i, rememberPagerStateWithoutSavedState22222222, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf42222222, valueOf222222222, (Function2) rememberedValue2, startRestartGroup, i1322222222);
        Integer valueOf322222222 = Integer.valueOf(rememberPagerStateWithoutSavedState22222222.getCurrentPage());
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = startRestartGroup.changed(rememberPagerStateWithoutSavedState22222222) | (i1522222222 == 32) | ((i1422222222 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        obj = null;
        rememberedValue3 = new UserProfileScreenKt$UserProfileTabContent$2$1(rememberPagerStateWithoutSavedState22222222, i, function1, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf322222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
        Modifier fillMaxSize$default22222222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, obj);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22222222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22222222);
        Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-504950898);
        List list522222222 = list4;
        ArrayList arrayList322222222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list522222222, 10));
        it = list522222222.iterator();
        while (it.hasNext()) {
        }
        startRestartGroup.endReplaceGroup();
        UserTabsProfileKt.UserTabs(arrayList322222222, i, function1, null, startRestartGroup, i1422222222 & 1008, 8);
        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22222222, SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance22222222, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1833923828, true, new UserProfileScreenKt$UserProfileTabContent$3$2(list4, newUserBetStatisticsModel, userDetailsController3, userService, z2, foreignUserDetailsController3, list2, newUserFavouritesModel, function13, function18, list3, i2, function14, function15), startRestartGroup, 54), startRestartGroup, 0, 24576, 16380);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        userDetailsController2 = userDetailsController3;
        foreignUserDetailsController2 = foreignUserDetailsController3;
        function17 = function18;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final float UserProfileContent$lambda$8(State<Dp> state) {
        return state.getValue().m7788unboximpl();
    }
}
