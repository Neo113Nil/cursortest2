package org.betup.ui.fragment.user.compose;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.challenges.NewUserBattleModel;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.fragment.user.UserDetailsController;
import org.betup.ui.fragment.user.compose.items.NewUserBattleUiItem;

/* compiled from: UserBattlesContentWithTabs.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002"}, d2 = {"UserBattlesContentWithTabs", "", "controller", "Lorg/betup/ui/fragment/user/UserDetailsController;", "(Lorg/betup/ui/fragment/user/UserDetailsController;Landroidx/compose/runtime/Composer;II)V", "app_release", "selectedTab", "", "realAvailableBattles", "", "Lorg/betup/ui/fragment/user/compose/items/NewUserBattleUiItem;", "realPrivateBattles", "realStatsBattles", "Lorg/betup/model/remote/entity/challenges/NewUserBattleModel;", "isLoading", "", "battleCounts", "Lorg/betup/model/remote/entity/challenges/BattleCountModel;", "totalItems", "hasMoreAvailableBattles", "hasMorePrivateBattles", "hasMoreStatsBattles", "isLoadMoreAvailableBattles", "isLoadMorePrivateBattles", "isLoadMoreStatsBattles", "selectedStatsFilter", "Lorg/betup/model/remote/entity/challenges/ChallengeState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserBattlesContentWithTabsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContentWithTabs$lambda$45(UserDetailsController userDetailsController, int i, int i2, Composer composer, int i3) {
        UserBattlesContentWithTabs(userDetailsController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void UserBattlesContentWithTabs(UserDetailsController userDetailsController, Composer composer, final int i, final int i2) {
        UserDetailsController userDetailsController2;
        int i3;
        final MutableState mutableState;
        final MutableState mutableState2;
        Composer composer2;
        final UserDetailsController userDetailsController3;
        Composer startRestartGroup = composer.startRestartGroup(-941865440);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            userDetailsController2 = userDetailsController;
        } else if ((i & 6) == 0) {
            userDetailsController2 = userDetailsController;
            i3 = (startRestartGroup.changedInstance(userDetailsController2) ? 4 : 2) | i;
        } else {
            userDetailsController2 = userDetailsController;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            UserDetailsController userDetailsController4 = i4 != 0 ? null : userDetailsController2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-941865440, i3, -1, "org.betup.ui.fragment.user.compose.UserBattlesContentWithTabs (UserBattlesContentWithTabs.kt:42)");
            }
            Log.d("UserBattlesContentWithTabs", "Controller received: " + (userDetailsController4 != null));
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<NewUserBattleUiItem>> availableBattles = userDetailsController4 != null ? userDetailsController4.getAvailableBattles() : null;
            startRestartGroup.startReplaceGroup(1105423472);
            MutableState collectAsState = availableBattles == null ? null : SnapshotStateKt.collectAsState(availableBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105422656);
            if (collectAsState == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState = (MutableState) rememberedValue2;
            }
            State state = collectAsState;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<NewUserBattleUiItem>> privateBattles = userDetailsController4 != null ? userDetailsController4.getPrivateBattles() : null;
            startRestartGroup.startReplaceGroup(1105429520);
            MutableState collectAsState2 = privateBattles == null ? null : SnapshotStateKt.collectAsState(privateBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105428766);
            if (collectAsState2 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState2 = (MutableState) rememberedValue3;
            }
            State state2 = collectAsState2;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<NewUserBattleModel>> statsBattles = userDetailsController4 != null ? userDetailsController4.getStatsBattles() : null;
            startRestartGroup.startReplaceGroup(1105435440);
            MutableState collectAsState3 = statsBattles == null ? null : SnapshotStateKt.collectAsState(statsBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105434773);
            if (collectAsState3 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState3 = (MutableState) rememberedValue4;
            }
            State state3 = collectAsState3;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isBattlesLoading = userDetailsController4 != null ? userDetailsController4.isBattlesLoading() : null;
            startRestartGroup.startReplaceGroup(1105442064);
            MutableState collectAsState4 = isBattlesLoading == null ? null : SnapshotStateKt.collectAsState(isBattlesLoading, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105441206);
            if (collectAsState4 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState4 = (MutableState) rememberedValue5;
            }
            State state4 = collectAsState4;
            startRestartGroup.endReplaceGroup();
            StateFlow<List<BattleCountModel>> battleCounts = userDetailsController4 != null ? userDetailsController4.getBattleCounts() : null;
            startRestartGroup.startReplaceGroup(1105446512);
            MutableState collectAsState5 = battleCounts == null ? null : SnapshotStateKt.collectAsState(battleCounts, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105445821);
            if (collectAsState5 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState5 = (MutableState) rememberedValue6;
            }
            startRestartGroup.endReplaceGroup();
            StateFlow<Integer> totalItems = userDetailsController4 != null ? userDetailsController4.getTotalItems() : null;
            startRestartGroup.startReplaceGroup(1105452208);
            MutableState collectAsState6 = totalItems == null ? null : SnapshotStateKt.collectAsState(totalItems, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105451510);
            if (collectAsState6 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState6 = (MutableState) rememberedValue7;
            }
            State state5 = collectAsState6;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMoreAvailableBattles = userDetailsController4 != null ? userDetailsController4.getHasMoreAvailableBattles() : null;
            startRestartGroup.startReplaceGroup(1105456528);
            MutableState collectAsState7 = hasMoreAvailableBattles == null ? null : SnapshotStateKt.collectAsState(hasMoreAvailableBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105455427);
            if (collectAsState7 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState7 = (MutableState) rememberedValue8;
            }
            State state6 = collectAsState7;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMorePrivateBattles = userDetailsController4 != null ? userDetailsController4.getHasMorePrivateBattles() : null;
            startRestartGroup.startReplaceGroup(1105460720);
            MutableState collectAsState8 = hasMorePrivateBattles == null ? null : SnapshotStateKt.collectAsState(hasMorePrivateBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105459681);
            if (collectAsState8 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState8 = (MutableState) rememberedValue9;
            }
            State state7 = collectAsState8;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> hasMoreStatsBattles = userDetailsController4 != null ? userDetailsController4.getHasMoreStatsBattles() : null;
            startRestartGroup.startReplaceGroup(1105464784);
            MutableState collectAsState9 = hasMoreStatsBattles == null ? null : SnapshotStateKt.collectAsState(hasMoreStatsBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105463807);
            if (collectAsState9 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState9 = (MutableState) rememberedValue10;
            }
            State state8 = collectAsState9;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMoreAvailableBattles = userDetailsController4 != null ? userDetailsController4.isLoadMoreAvailableBattles() : null;
            startRestartGroup.startReplaceGroup(1105470224);
            MutableState collectAsState10 = isLoadMoreAvailableBattles == null ? null : SnapshotStateKt.collectAsState(isLoadMoreAvailableBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105469030);
            if (collectAsState10 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState10 = (MutableState) rememberedValue11;
            }
            State state9 = collectAsState10;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMorePrivateBattles = userDetailsController4 != null ? userDetailsController4.isLoadMorePrivateBattles() : null;
            startRestartGroup.startReplaceGroup(1105474608);
            MutableState collectAsState11 = isLoadMorePrivateBattles == null ? null : SnapshotStateKt.collectAsState(isLoadMorePrivateBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105473476);
            if (collectAsState11 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState11 = (MutableState) rememberedValue12;
            }
            State state10 = collectAsState11;
            startRestartGroup.endReplaceGroup();
            StateFlow<Boolean> isLoadMoreStatsBattles = userDetailsController4 != null ? userDetailsController4.isLoadMoreStatsBattles() : null;
            startRestartGroup.startReplaceGroup(1105478864);
            MutableState collectAsState12 = isLoadMoreStatsBattles == null ? null : SnapshotStateKt.collectAsState(isLoadMoreStatsBattles, null, startRestartGroup, 0, 1);
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1105477794);
            if (collectAsState12 == null) {
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                startRestartGroup.endReplaceGroup();
                collectAsState12 = (MutableState) rememberedValue13;
            }
            State state11 = collectAsState12;
            startRestartGroup.endReplaceGroup();
            Integer valueOf = Integer.valueOf(UserBattlesContentWithTabs$lambda$1(mutableState3));
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changed = startRestartGroup.changed(state) | startRestartGroup.changed(state4) | startRestartGroup.changedInstance(userDetailsController4) | startRestartGroup.changed(state2) | startRestartGroup.changed(state3) | startRestartGroup.changed(collectAsState5);
            UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1 rememberedValue14 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$1$1(userDetailsController4, mutableState3, state, state4, state2, state3, collectAsState5, null);
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue14, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            MutableState mutableState4 = (MutableState) rememberedValue15;
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            State state12 = collectAsState5;
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
            float f = 12;
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f));
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String stringResource = StringResources_androidKt.stringResource(R.string.battles_available, startRestartGroup, 6);
            boolean z = UserBattlesContentWithTabs$lambda$1(mutableState3) == 0;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$32$lambda$31;
                        UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$32$lambda$31 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$32$lambda$31(MutableState.this);
                        return UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$32$lambda$31;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue16);
            }
            startRestartGroup.endReplaceGroup();
            UserDetailsController userDetailsController5 = userDetailsController4;
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, z, stringResource, false, false, false, (Function0) rememberedValue16, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 1575936, 0, 0, 2097073);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.battles_private, startRestartGroup, 6);
            boolean z2 = UserBattlesContentWithTabs$lambda$1(mutableState3) == 1;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue17 = startRestartGroup.rememberedValue();
            if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState3;
                rememberedValue17 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$34$lambda$33;
                        UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$34$lambda$33 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$34$lambda$33(MutableState.this);
                        return UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$34$lambda$33;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue17);
            } else {
                mutableState = mutableState3;
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState5 = mutableState;
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, z2, stringResource2, false, false, false, (Function0) rememberedValue17, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 1575936, 0, 0, 2097073);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            String stringResource3 = StringResources_androidKt.stringResource(R.string.battles_stats, startRestartGroup, 6);
            boolean z3 = UserBattlesContentWithTabs$lambda$1(mutableState5) == 2;
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState5;
                rememberedValue18 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$36$lambda$35;
                        UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$36$lambda$35 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$36$lambda$35(MutableState.this);
                        return UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$36$lambda$35;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue18);
            } else {
                mutableState2 = mutableState5;
            }
            startRestartGroup.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, z3, stringResource3, false, false, false, (Function0) rememberedValue18, false, false, false, false, false, null, null, false, false, null, null, null, null, null, startRestartGroup, 1575936, 0, 0, 2097073);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int UserBattlesContentWithTabs$lambda$1 = UserBattlesContentWithTabs$lambda$1(mutableState2);
            if (UserBattlesContentWithTabs$lambda$1 == 0) {
                composer2 = startRestartGroup;
                userDetailsController3 = userDetailsController5;
                composer2.startReplaceGroup(145890633);
                List<NewUserBattleUiItem> UserBattlesContentWithTabs$lambda$4 = userDetailsController3 != null ? UserBattlesContentWithTabs$lambda$4(state) : CollectionsKt.emptyList();
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean UserBattlesContentWithTabs$lambda$10 = UserBattlesContentWithTabs$lambda$10(state4);
                composer2.startReplaceGroup(5004770);
                boolean changedInstance = composer2.changedInstance(userDetailsController3);
                Object rememberedValue19 = composer2.rememberedValue();
                if (changedInstance || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit UserBattlesContentWithTabs$lambda$44$lambda$39$lambda$38;
                            UserBattlesContentWithTabs$lambda$44$lambda$39$lambda$38 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$44$lambda$39$lambda$38(UserDetailsController.this);
                            return UserBattlesContentWithTabs$lambda$44$lambda$39$lambda$38;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue19);
                }
                composer2.endReplaceGroup();
                SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default2, UserBattlesContentWithTabs$lambda$10, (Function0) rememberedValue19, !UserBattlesContentWithTabs$lambda$4.isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(465453974, true, new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$3(UserBattlesContentWithTabs$lambda$4, state6, state4, userDetailsController3, state9), composer2, 54), composer2, 196614, 16);
                composer2.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else if (UserBattlesContentWithTabs$lambda$1 == 1) {
                composer2 = startRestartGroup;
                userDetailsController3 = userDetailsController5;
                composer2.startReplaceGroup(151509383);
                List<NewUserBattleUiItem> UserBattlesContentWithTabs$lambda$6 = userDetailsController3 != null ? UserBattlesContentWithTabs$lambda$6(state2) : CollectionsKt.emptyList();
                Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean UserBattlesContentWithTabs$lambda$102 = UserBattlesContentWithTabs$lambda$10(state4);
                composer2.startReplaceGroup(5004770);
                boolean changedInstance2 = composer2.changedInstance(userDetailsController3);
                Object rememberedValue20 = composer2.rememberedValue();
                if (changedInstance2 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue20 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit UserBattlesContentWithTabs$lambda$44$lambda$41$lambda$40;
                            UserBattlesContentWithTabs$lambda$44$lambda$41$lambda$40 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$44$lambda$41$lambda$40(UserDetailsController.this);
                            return UserBattlesContentWithTabs$lambda$44$lambda$41$lambda$40;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue20);
                }
                composer2.endReplaceGroup();
                SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default3, UserBattlesContentWithTabs$lambda$102, (Function0) rememberedValue20, !UserBattlesContentWithTabs$lambda$6.isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(2015344191, true, new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$5(UserBattlesContentWithTabs$lambda$6, state7, state4, userDetailsController3, state10), composer2, 54), composer2, 196614, 16);
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (UserBattlesContentWithTabs$lambda$1 == 2) {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(157453292);
                List<NewUserBattleModel> UserBattlesContentWithTabs$lambda$8 = UserBattlesContentWithTabs$lambda$8(state3);
                Modifier fillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean UserBattlesContentWithTabs$lambda$103 = UserBattlesContentWithTabs$lambda$10(state4);
                composer2.startReplaceGroup(5004770);
                userDetailsController3 = userDetailsController5;
                boolean changedInstance3 = composer2.changedInstance(userDetailsController3);
                Object rememberedValue21 = composer2.rememberedValue();
                if (changedInstance3 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue21 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit UserBattlesContentWithTabs$lambda$44$lambda$43$lambda$42;
                            UserBattlesContentWithTabs$lambda$44$lambda$43$lambda$42 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$44$lambda$43$lambda$42(UserDetailsController.this);
                            return UserBattlesContentWithTabs$lambda$44$lambda$43$lambda$42;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue21);
                }
                composer2.endReplaceGroup();
                SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default4, UserBattlesContentWithTabs$lambda$103, (Function0) rememberedValue21, !UserBattlesContentWithTabs$lambda$8.isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(1778726366, true, new UserBattlesContentWithTabsKt$UserBattlesContentWithTabs$2$7(UserBattlesContentWithTabs$lambda$8, state8, state4, userDetailsController3, state11, mutableState4, state12, state5), composer2, 54), composer2, 196614, 16);
                composer2.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(163687082);
                composer2.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
                userDetailsController3 = userDetailsController5;
            }
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
            composer2 = startRestartGroup;
            userDetailsController3 = userDetailsController2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserBattlesContentWithTabsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UserBattlesContentWithTabs$lambda$45;
                    UserBattlesContentWithTabs$lambda$45 = UserBattlesContentWithTabsKt.UserBattlesContentWithTabs$lambda$45(UserDetailsController.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UserBattlesContentWithTabs$lambda$45;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int UserBattlesContentWithTabs$lambda$1(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void UserBattlesContentWithTabs$lambda$2(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeState UserBattlesContentWithTabs$lambda$29(MutableState<ChallengeState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$32$lambda$31(MutableState mutableState) {
        UserBattlesContentWithTabs$lambda$2(mutableState, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$34$lambda$33(MutableState mutableState) {
        UserBattlesContentWithTabs$lambda$2(mutableState, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContentWithTabs$lambda$44$lambda$37$lambda$36$lambda$35(MutableState mutableState) {
        UserBattlesContentWithTabs$lambda$2(mutableState, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContentWithTabs$lambda$44$lambda$39$lambda$38(UserDetailsController userDetailsController) {
        if (userDetailsController != null) {
            userDetailsController.loadAvailableBattles();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContentWithTabs$lambda$44$lambda$41$lambda$40(UserDetailsController userDetailsController) {
        if (userDetailsController != null) {
            userDetailsController.loadPrivateBattles();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserBattlesContentWithTabs$lambda$44$lambda$43$lambda$42(UserDetailsController userDetailsController) {
        if (userDetailsController != null) {
            UserDetailsController.loadStatsBattles$default(userDetailsController, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewUserBattleUiItem> UserBattlesContentWithTabs$lambda$4(State<? extends List<NewUserBattleUiItem>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewUserBattleUiItem> UserBattlesContentWithTabs$lambda$6(State<? extends List<NewUserBattleUiItem>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewUserBattleModel> UserBattlesContentWithTabs$lambda$8(State<? extends List<NewUserBattleModel>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContentWithTabs$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<BattleCountModel> UserBattlesContentWithTabs$lambda$12(State<? extends List<BattleCountModel>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int UserBattlesContentWithTabs$lambda$14(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContentWithTabs$lambda$16(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContentWithTabs$lambda$18(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContentWithTabs$lambda$20(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContentWithTabs$lambda$22(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContentWithTabs$lambda$24(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UserBattlesContentWithTabs$lambda$26(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
