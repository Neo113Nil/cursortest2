package org.betup.ui.fragment.user.compose;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.fragment.bets.BetsTabBarComposeKt;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;
import org.betup.ui.fragment.user.controller.UserBattlesController;

/* compiled from: UserBattlesContent.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002"}, d2 = {"UserBattlesContent", "", "controller", "Lorg/betup/ui/fragment/user/controller/UserBattlesController;", "(Lorg/betup/ui/fragment/user/controller/UserBattlesController;Landroidx/compose/runtime/Composer;II)V", "app_release", "selectedTab", "", "realAvailableBattles", "", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleUiItem;", "realPrivateBattles", "realStatsBattles", "Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "isLoading", "", "battleCounts", "Lorg/betup/model/remote/entity/challenges/BattleCountModel;", "totalItems", "hasMoreAvailableBattles", "hasMorePrivateBattles", "hasMoreStatsBattles", "isLoadMoreAvailableBattles", "isLoadMorePrivateBattles", "isLoadMoreStatsBattles", "selectedStatsFilter", "Lorg/betup/model/remote/entity/challenges/ChallengeState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserBattlesContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContent$lambda$38(UserBattlesController userBattlesController, int i, int i2, Composer composer, int i3) {
        UserBattlesContent(userBattlesController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void UserBattlesContent(UserBattlesController userBattlesController, Composer composer, final int i, final int i2) {
        UserBattlesController userBattlesController2;
        int i3;
        int i4;
        MutableState collectAsState;
        boolean z;
        MutableState collectAsState2;
        boolean z2;
        MutableState collectAsState3;
        boolean z3;
        State collectAsState4;
        MutableState mutableState;
        boolean z4;
        State collectAsState5;
        MutableState mutableState2;
        boolean z5;
        State collectAsState6;
        MutableState mutableState3;
        boolean z6;
        State collectAsState7;
        MutableState mutableState4;
        final UserBattlesController userBattlesController3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-431225905);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            userBattlesController2 = userBattlesController;
        } else if ((i & 6) == 0) {
            userBattlesController2 = userBattlesController;
            i3 = (startRestartGroup.changedInstance(userBattlesController2) ? 4 : 2) | i;
        } else {
            userBattlesController2 = userBattlesController;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            UserBattlesController userBattlesController4 = i5 != 0 ? null : userBattlesController2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-431225905, i3, -1, "org.betup.ui.fragment.user.compose.UserBattlesContent (UserBattlesContent.kt:44)");
            }
            Log.d("UserBattlesContent", "Controller received: " + (userBattlesController4 != null));
            final List listOf = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.battles_available, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.battles_private, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.battles_stats, startRestartGroup, 6)});
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed = startRestartGroup.changed(listOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int size;
                        size = listOf.size();
                        return Integer.valueOf(size);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            PagerState rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(0, 0.0f, (Function0) rememberedValue, startRestartGroup, 6, 2);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Integer valueOf = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changed2 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function2) new UserBattlesContentKt$UserBattlesContent$1$1(rememberPagerStateWithoutSavedState, mutableState5, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
            Integer valueOf2 = Integer.valueOf(UserBattlesContent$lambda$3(mutableState5));
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean changed3 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function2) new UserBattlesContentKt$UserBattlesContent$2$1(rememberPagerStateWithoutSavedState, mutableState5, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            StateFlow<List<NewUserBattleUiItem>> availableBattles = userBattlesController4 != null ? userBattlesController4.getAvailableBattles() : null;
            startRestartGroup.startReplaceGroup(-2091192065);
            MutableState collectAsState8 = availableBattles == null ? null : SnapshotStateKt.collectAsState(availableBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091192881);
            if (collectAsState8 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState8 = (MutableState) rememberedValue5;
            }
            State state = collectAsState8;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<NewUserBattleUiItem>> privateBattles = userBattlesController4 != null ? userBattlesController4.getPrivateBattles() : null;
            startRestartGroup.startReplaceGroup(-2091186017);
            MutableState collectAsState9 = privateBattles == null ? null : SnapshotStateKt.collectAsState(privateBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091186771);
            if (collectAsState9 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState9 = (MutableState) rememberedValue6;
            }
            State state2 = collectAsState9;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<NewUserBattleModel>> statsBattles = userBattlesController4 != null ? userBattlesController4.getStatsBattles() : null;
            startRestartGroup.startReplaceGroup(-2091180097);
            MutableState collectAsState10 = statsBattles == null ? null : SnapshotStateKt.collectAsState(statsBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091180764);
            if (collectAsState10 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState10 = (MutableState) rememberedValue7;
            }
            State state3 = collectAsState10;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isBattlesLoading = userBattlesController4 != null ? userBattlesController4.isBattlesLoading() : null;
            startRestartGroup.startReplaceGroup(-2091173473);
            MutableState collectAsState11 = isBattlesLoading == null ? null : SnapshotStateKt.collectAsState(isBattlesLoading, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091174353);
            if (collectAsState11 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState11 = (MutableState) rememberedValue8;
            }
            State state4 = collectAsState11;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<BattleCountModel>> battleCounts = userBattlesController4 != null ? userBattlesController4.getBattleCounts() : null;
            startRestartGroup.startReplaceGroup(-2091169729);
            MutableState collectAsState12 = battleCounts == null ? null : SnapshotStateKt.collectAsState(battleCounts, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091170420);
            if (collectAsState12 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState12 = (MutableState) rememberedValue9;
            }
            State state5 = collectAsState12;
            startRestartGroup.endReplaceGroup();
            StateFlow<Integer> totalItems = userBattlesController4 != null ? userBattlesController4.getTotalItems() : null;
            startRestartGroup.startReplaceGroup(-2091164033);
            if (totalItems == null) {
                collectAsState = null;
                i4 = 0;
            } else {
                i4 = 0;
                collectAsState = SnapshotStateKt.collectAsState(totalItems, null, startRestartGroup, 0, 1);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091164731);
            if (collectAsState == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i4), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState = (MutableState) rememberedValue10;
            }
            State state6 = collectAsState;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMoreAvailableBattles = userBattlesController4 != null ? userBattlesController4.getHasMoreAvailableBattles() : null;
            startRestartGroup.startReplaceGroup(-2091159713);
            if (hasMoreAvailableBattles == null) {
                collectAsState2 = null;
                z = false;
            } else {
                z = false;
                collectAsState2 = SnapshotStateKt.collectAsState(hasMoreAvailableBattles, null, startRestartGroup, 0, 1);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091160814);
            if (collectAsState2 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState2 = (MutableState) rememberedValue11;
            }
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMorePrivateBattles = userBattlesController4 != null ? userBattlesController4.getHasMorePrivateBattles() : null;
            startRestartGroup.startReplaceGroup(-2091155521);
            if (hasMorePrivateBattles == null) {
                collectAsState3 = null;
                z2 = false;
            } else {
                z2 = false;
                collectAsState3 = SnapshotStateKt.collectAsState(hasMorePrivateBattles, null, startRestartGroup, 0, 1);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091156560);
            if (collectAsState3 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState3 = (MutableState) rememberedValue12;
            }
            State state7 = collectAsState3;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMoreStatsBattles = userBattlesController4 != null ? userBattlesController4.getHasMoreStatsBattles() : null;
            startRestartGroup.startReplaceGroup(-2091151457);
            if (hasMoreStatsBattles == null) {
                collectAsState4 = null;
                z3 = false;
            } else {
                z3 = false;
                collectAsState4 = SnapshotStateKt.collectAsState(hasMoreStatsBattles, null, startRestartGroup, 0, 1);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091152434);
            if (collectAsState4 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z3), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                startRestartGroup.endReplaceGroup();
                mutableState = (MutableState) rememberedValue13;
            } else {
                mutableState = collectAsState4;
            }
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMoreAvailableBattles = userBattlesController4 != null ? userBattlesController4.isLoadMoreAvailableBattles() : null;
            startRestartGroup.startReplaceGroup(-2091146017);
            if (isLoadMoreAvailableBattles == null) {
                collectAsState5 = null;
                z4 = false;
            } else {
                z4 = false;
                collectAsState5 = SnapshotStateKt.collectAsState(isLoadMoreAvailableBattles, null, startRestartGroup, 0, 1);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091147211);
            if (collectAsState5 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue14 = startRestartGroup.rememberedValue();
                if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                }
                startRestartGroup.endReplaceGroup();
                mutableState2 = (MutableState) rememberedValue14;
            } else {
                mutableState2 = collectAsState5;
            }
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMorePrivateBattles = userBattlesController4 != null ? userBattlesController4.isLoadMorePrivateBattles() : null;
            startRestartGroup.startReplaceGroup(-2091141633);
            State state8 = mutableState;
            if (isLoadMorePrivateBattles == null) {
                collectAsState6 = null;
                z5 = false;
            } else {
                z5 = false;
                collectAsState6 = SnapshotStateKt.collectAsState(isLoadMorePrivateBattles, null, startRestartGroup, 0, 1);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091142765);
            if (collectAsState6 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue15 = startRestartGroup.rememberedValue();
                if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z5), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                }
                startRestartGroup.endReplaceGroup();
                mutableState3 = (MutableState) rememberedValue15;
            } else {
                mutableState3 = collectAsState6;
            }
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMoreStatsBattles = userBattlesController4 != null ? userBattlesController4.isLoadMoreStatsBattles() : null;
            startRestartGroup.startReplaceGroup(-2091137377);
            State state9 = mutableState3;
            if (isLoadMoreStatsBattles == null) {
                collectAsState7 = null;
                z6 = false;
            } else {
                z6 = false;
                collectAsState7 = SnapshotStateKt.collectAsState(isLoadMoreStatsBattles, null, startRestartGroup, 0, 1);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-2091138447);
            if (collectAsState7 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue16 = startRestartGroup.rememberedValue();
                if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z6), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue16);
                }
                startRestartGroup.endReplaceGroup();
                mutableState4 = (MutableState) rememberedValue16;
            } else {
                mutableState4 = collectAsState7;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue17 = startRestartGroup.rememberedValue();
            if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                rememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue17);
            }
            MutableState mutableState6 = (MutableState) rememberedValue17;
            startRestartGroup.endReplaceGroup();
            Integer valueOf3 = Integer.valueOf(UserBattlesContent$lambda$3(mutableState5));
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changed4 = startRestartGroup.changed(state) | startRestartGroup.changed(state4) | startRestartGroup.changedInstance(userBattlesController4) | startRestartGroup.changed(state2) | startRestartGroup.changed(state3) | startRestartGroup.changed(state5);
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                rememberedValue18 = (Function2) new UserBattlesContentKt$UserBattlesContent$3$1(userBattlesController4, mutableState5, state, state4, state2, state3, mutableState6, state5, null);
                startRestartGroup.updateRememberedValue(rememberedValue18);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue18, startRestartGroup, 0);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f = 16;
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f), 0.0f, 8, null);
            int UserBattlesContent$lambda$3 = UserBattlesContent$lambda$3(mutableState5);
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue19 = startRestartGroup.rememberedValue();
            if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                rememberedValue19 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserBattlesContent$lambda$37$lambda$36$lambda$35;
                        UserBattlesContent$lambda$37$lambda$36$lambda$35 = UserBattlesContentKt.UserBattlesContent$lambda$37$lambda$36$lambda$35(MutableState.this, ((Integer) obj).intValue());
                        return UserBattlesContent$lambda$37$lambda$36$lambda$35;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue19);
            }
            startRestartGroup.endReplaceGroup();
            BetsTabBarComposeKt.BetsTabBarCompose(m1520paddingqDBjuR0$default, UserBattlesContent$lambda$3, (Function1) rememberedValue19, listOf, false, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 16);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-891231610, true, new UserBattlesContentKt$UserBattlesContent$4$2(userBattlesController4, state, state4, collectAsState2, mutableState2, state2, state7, state9, state3, mutableState6, state8, mutableState4, state5, state6), startRestartGroup, 54);
            userBattlesController3 = userBattlesController4;
            composer2 = startRestartGroup;
            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, fillMaxSize$default2, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, rememberComposableLambda, composer2, 48, 24576, 16380);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            userBattlesController3 = userBattlesController2;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UserBattlesContent$lambda$38;
                    UserBattlesContent$lambda$38 = UserBattlesContentKt.UserBattlesContent$lambda$38(UserBattlesController.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UserBattlesContent$lambda$38;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int UserBattlesContent$lambda$3(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserBattlesContent$lambda$4(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeState UserBattlesContent$lambda$32(MutableState<ChallengeState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContent$lambda$37$lambda$36$lambda$35(MutableState mutableState, int i) {
        UserBattlesContent$lambda$4(mutableState, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewUserBattleUiItem> UserBattlesContent$lambda$8(State<? extends List<NewUserBattleUiItem>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewUserBattleUiItem> UserBattlesContent$lambda$10(State<? extends List<NewUserBattleUiItem>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewUserBattleModel> UserBattlesContent$lambda$12(State<? extends List<NewUserBattleModel>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContent$lambda$14(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<BattleCountModel> UserBattlesContent$lambda$16(State<? extends List<BattleCountModel>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int UserBattlesContent$lambda$18(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContent$lambda$20(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContent$lambda$22(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContent$lambda$24(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContent$lambda$26(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContent$lambda$28(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContent$lambda$30(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
