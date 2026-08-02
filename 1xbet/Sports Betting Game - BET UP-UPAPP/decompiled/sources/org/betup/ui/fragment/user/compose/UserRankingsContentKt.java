package org.betup.ui.fragment.user.compose;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.draw.ClipKt;
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
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.model.remote.entity.country.NewCountryModel;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.fragment.bets.BetsTabBarComposeKt;
import org.betup.ui.fragment.user.compose.RankingTimeType;
import org.betup.ui.fragment.user.controller.UserRankingsController;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: UserRankingsContent.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u001a#\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a)\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"UserRankingsContent", "", "controller", "Lorg/betup/ui/fragment/user/controller/UserRankingsController;", "userId", "", "(Lorg/betup/ui/fragment/user/controller/UserRankingsController;ILandroidx/compose/runtime/Composer;II)V", "RankingListItem", "item", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "onUserClick", "Lkotlin/Function1;", "(Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "rankingTabs", "", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "selectedTab", "isLoading", "", "error", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserRankingsContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RankingListItem$lambda$22(NewUserRankingItemModel newUserRankingItemModel, Function1 function1, int i, Composer composer, int i2) {
        RankingListItem(newUserRankingItemModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserRankingsContent$lambda$15(UserRankingsController userRankingsController, int i, int i2, int i3, Composer composer, int i4) {
        UserRankingsContent(userRankingsController, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserRankingsContent(UserRankingsController userRankingsController, int i, Composer composer, final int i2, final int i3) {
        UserRankingsController userRankingsController2;
        int i4;
        int i5;
        final UserRankingsController userRankingsController3;
        final int i6;
        boolean changedInstance;
        UserRankingsContentKt$UserRankingsContent$1$1 rememberedValue;
        MutableState collectAsState;
        MutableState collectAsState2;
        MutableState collectAsState3;
        MutableState collectAsState4;
        ArrayList arrayList;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        State state;
        State state2;
        State state3;
        boolean changedInstance2;
        Object rememberedValue2;
        String stringResource;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(884632406);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            userRankingsController2 = userRankingsController;
        } else if ((i2 & 6) == 0) {
            userRankingsController2 = userRankingsController;
            i4 = (startRestartGroup.changedInstance(userRankingsController2) ? 4 : 2) | i2;
        } else {
            userRankingsController2 = userRankingsController;
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 32 : 16;
            if ((i4 & 19) == 18 || !startRestartGroup.getSkipping()) {
                userRankingsController3 = i7 == 0 ? null : userRankingsController2;
                i6 = i8 == 0 ? 0 : i5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(884632406, i4, -1, "org.betup.ui.fragment.user.compose.UserRankingsContent (UserRankingsContent.kt:51)");
                }
                Log.d("UserRankingsContent", "Controller received: " + (userRankingsController3 == null) + ", userId: " + i6);
                Integer valueOf = Integer.valueOf(i6);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(userRankingsController3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new UserRankingsContentKt$UserRankingsContent$1$1(i6, userRankingsController3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
                StateFlow<List<RankingTimeType>> rankingTabs = userRankingsController3 == null ? userRankingsController3.getRankingTabs() : null;
                startRestartGroup.startReplaceGroup(-271762266);
                collectAsState = rankingTabs != null ? null : SnapshotStateKt.collectAsState(rankingTabs, null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-271762922);
                if (collectAsState == null) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    collectAsState = (MutableState) rememberedValue3;
                }
                State state4 = collectAsState;
                startRestartGroup.endReplaceGroup();
                StateFlow<Integer> selectedRankingTabIndex = userRankingsController3 == null ? userRankingsController3.getSelectedRankingTabIndex() : null;
                startRestartGroup.startReplaceGroup(-271755994);
                collectAsState2 = selectedRankingTabIndex != null ? null : SnapshotStateKt.collectAsState(selectedRankingTabIndex, null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-271757049);
                if (collectAsState2 == null) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceGroup();
                    collectAsState2 = (MutableState) rememberedValue4;
                }
                State state5 = collectAsState2;
                startRestartGroup.endReplaceGroup();
                StateFlow<Boolean> isLoading = userRankingsController3 == null ? userRankingsController3.isLoading() : null;
                startRestartGroup.startReplaceGroup(-271751098);
                collectAsState3 = isLoading != null ? null : SnapshotStateKt.collectAsState(isLoading, null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-271751715);
                if (collectAsState3 == null) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    collectAsState3 = (MutableState) rememberedValue5;
                }
                State state6 = collectAsState3;
                startRestartGroup.endReplaceGroup();
                StateFlow<String> error = userRankingsController3 == null ? userRankingsController3.getError() : null;
                startRestartGroup.startReplaceGroup(-271746330);
                collectAsState4 = error != null ? null : SnapshotStateKt.collectAsState(error, null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-271746824);
                if (collectAsState4 == null) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    startRestartGroup.endReplaceGroup();
                    collectAsState4 = (MutableState) rememberedValue6;
                }
                State state7 = collectAsState4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-271740832);
                List<RankingTimeType> UserRankingsContent$lambda$2 = UserRankingsContent$lambda$2(state4);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(UserRankingsContent$lambda$2, 10));
                for (RankingTimeType rankingTimeType : UserRankingsContent$lambda$2) {
                    if (rankingTimeType instanceof RankingTimeType.Day) {
                        startRestartGroup.startReplaceGroup(1882893504);
                        stringResource = StringResources_androidKt.stringResource(R.string.ranking_day_label, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    } else if (rankingTimeType instanceof RankingTimeType.Week) {
                        startRestartGroup.startReplaceGroup(1882896129);
                        stringResource = StringResources_androidKt.stringResource(R.string.ranking_week_label, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (!(rankingTimeType instanceof RankingTimeType.Month)) {
                            startRestartGroup.startReplaceGroup(1882892101);
                            startRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(1882898818);
                        stringResource = StringResources_androidKt.stringResource(R.string.ranking_month_label, startRestartGroup, 6);
                        startRestartGroup.endReplaceGroup();
                    }
                    arrayList2.add(stringResource);
                }
                arrayList = arrayList2;
                startRestartGroup.endReplaceGroup();
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
                startRestartGroup.startReplaceGroup(-2079405940);
                if (arrayList.isEmpty()) {
                    float f = 16;
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f), 0.0f, 8, null);
                    int UserRankingsContent$lambda$4 = UserRankingsContent$lambda$4(state5);
                    startRestartGroup.startReplaceGroup(5004770);
                    boolean changedInstance3 = startRestartGroup.changedInstance(userRankingsController3);
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit UserRankingsContent$lambda$14$lambda$11$lambda$10;
                                UserRankingsContent$lambda$14$lambda$11$lambda$10 = UserRankingsContentKt.UserRankingsContent$lambda$14$lambda$11$lambda$10(UserRankingsController.this, ((Integer) obj).intValue());
                                return UserRankingsContent$lambda$14$lambda$11$lambda$10;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    startRestartGroup.endReplaceGroup();
                    state = state7;
                    state2 = state5;
                    state3 = state4;
                    BetsTabBarComposeKt.BetsTabBarCompose(m1520paddingqDBjuR0$default, UserRankingsContent$lambda$4, (Function1) rememberedValue7, arrayList, false, startRestartGroup, 0, 16);
                } else {
                    state = state7;
                    state2 = state5;
                    state3 = state4;
                }
                startRestartGroup.endReplaceGroup();
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
                boolean UserRankingsContent$lambda$6 = UserRankingsContent$lambda$6(state6);
                startRestartGroup.startReplaceGroup(5004770);
                changedInstance2 = startRestartGroup.changedInstance(userRankingsController3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit UserRankingsContent$lambda$14$lambda$13$lambda$12;
                            UserRankingsContent$lambda$14$lambda$13$lambda$12 = UserRankingsContentKt.UserRankingsContent$lambda$14$lambda$13$lambda$12(UserRankingsController.this);
                            return UserRankingsContent$lambda$14$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(m1518paddingVpY3zN4$default, UserRankingsContent$lambda$6, (Function0) rememberedValue2, !UserRankingsContent$lambda$2(state3).isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(700943768, true, new UserRankingsContentKt$UserRankingsContent$2$3(state3, state2, state, userRankingsController3), startRestartGroup, 54), startRestartGroup, 196614, 16);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                userRankingsController3 = userRankingsController2;
                i6 = i5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit UserRankingsContent$lambda$15;
                        UserRankingsContent$lambda$15 = UserRankingsContentKt.UserRankingsContent$lambda$15(UserRankingsController.this, i6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return UserRankingsContent$lambda$15;
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if ((i4 & 19) == 18) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Log.d("UserRankingsContent", "Controller received: " + (userRankingsController3 == null) + ", userId: " + i6);
        Integer valueOf2 = Integer.valueOf(i6);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = ((i4 & 112) != 32) | startRestartGroup.changedInstance(userRankingsController3);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new UserRankingsContentKt$UserRankingsContent$1$1(i6, userRankingsController3, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
        if (userRankingsController3 == null) {
        }
        startRestartGroup.startReplaceGroup(-271762266);
        if (rankingTabs != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-271762922);
        if (collectAsState == null) {
        }
        State state42 = collectAsState;
        startRestartGroup.endReplaceGroup();
        if (userRankingsController3 == null) {
        }
        startRestartGroup.startReplaceGroup(-271755994);
        if (selectedRankingTabIndex != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-271757049);
        if (collectAsState2 == null) {
        }
        State state52 = collectAsState2;
        startRestartGroup.endReplaceGroup();
        if (userRankingsController3 == null) {
        }
        startRestartGroup.startReplaceGroup(-271751098);
        if (isLoading != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-271751715);
        if (collectAsState3 == null) {
        }
        State state62 = collectAsState3;
        startRestartGroup.endReplaceGroup();
        if (userRankingsController3 == null) {
        }
        startRestartGroup.startReplaceGroup(-271746330);
        if (error != null) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-271746824);
        if (collectAsState4 == null) {
        }
        State state72 = collectAsState4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-271740832);
        List<RankingTimeType> UserRankingsContent$lambda$22 = UserRankingsContent$lambda$2(state42);
        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(UserRankingsContent$lambda$22, 10));
        while (r4.hasNext()) {
        }
        arrayList = arrayList22;
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
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
        if (!startRestartGroup.getInserting()) {
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
        startRestartGroup.startReplaceGroup(-2079405940);
        if (arrayList.isEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
        boolean UserRankingsContent$lambda$62 = UserRankingsContent$lambda$6(state62);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(userRankingsController3);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit UserRankingsContent$lambda$14$lambda$13$lambda$12;
                UserRankingsContent$lambda$14$lambda$13$lambda$12 = UserRankingsContentKt.UserRankingsContent$lambda$14$lambda$13$lambda$12(UserRankingsController.this);
                return UserRankingsContent$lambda$14$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(m1518paddingVpY3zN4$default2, UserRankingsContent$lambda$62, (Function0) rememberedValue2, !UserRankingsContent$lambda$2(state3).isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(700943768, true, new UserRankingsContentKt$UserRankingsContent$2$3(state3, state2, state, userRankingsController3), startRestartGroup, 54), startRestartGroup, 196614, 16);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserRankingsContent$lambda$14$lambda$11$lambda$10(UserRankingsController userRankingsController, int i) {
        if (userRankingsController != null) {
            userRankingsController.setSelectedRankingTab(i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserRankingsContent$lambda$14$lambda$13$lambda$12(UserRankingsController userRankingsController) {
        if (userRankingsController != null) {
            userRankingsController.refreshRankingStatistics();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RankingListItem(final NewUserRankingItemModel newUserRankingItemModel, final Function1<? super Integer, Unit> function1, Composer composer, final int i) {
        int i2;
        String str;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1462074349);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(newUserRankingItemModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1462074349, i2, -1, "org.betup.ui.fragment.user.compose.RankingListItem (UserRankingsContent.kt:244)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit RankingListItem$lambda$17$lambda$16;
                        RankingListItem$lambda$17$lambda$16 = UserRankingsContentKt.RankingListItem$lambda$17$lambda$16(Function1.this, newUserRankingItemModel);
                        return RankingListItem$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            float f = 4;
            Modifier m1024backgroundbw27NRU = BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(ClickableKt.m1059clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null), 0.0f, 1, null), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1024backgroundbw27NRU);
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
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f2 = 12;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2));
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
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
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.ranking_place_format, new Object[]{Integer.valueOf(newUserRankingItemModel.getRank())}, startRestartGroup, 6), SizeKt.m1570widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(28), 0.0f, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(700), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            float f3 = 8;
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), startRestartGroup, 6);
            String photoUrl = newUserRankingItemModel.getPhotoUrl();
            if (photoUrl == null) {
                photoUrl = "";
            }
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(photoUrl, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f3)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(newUserRankingItemModel.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            NewCountryModel country = newUserRankingItemModel.getCountry();
            if (country == null || (str = country.getPhotoUrl()) == null) {
                str = "";
            }
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(str, null, ClipKt.clip(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), RoundedCornerShapeKt.getCircleShape()), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 48, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.level, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            TextKt.m2642Text4IGK_g(String.valueOf(newUserRankingItemModel.getLevel()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f2)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.ranking_roi_percentage_format, new Object[]{UiExtensionsKt.formatRoiPercent(newUserRankingItemModel.getWinningRate())}, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(700), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RankingListItem$lambda$22;
                    RankingListItem$lambda$22 = UserRankingsContentKt.RankingListItem$lambda$22(NewUserRankingItemModel.this, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RankingListItem$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RankingListItem$lambda$17$lambda$16(Function1 function1, NewUserRankingItemModel newUserRankingItemModel) {
        function1.invoke(Integer.valueOf((int) newUserRankingItemModel.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUserClick(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", i);
        bundle.putBoolean("return", true);
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.USER_DETAILS, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RankingTimeType> UserRankingsContent$lambda$2(State<? extends List<? extends RankingTimeType>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int UserRankingsContent$lambda$4(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final boolean UserRankingsContent$lambda$6(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UserRankingsContent$lambda$8(State<String> state) {
        return state.getValue();
    }
}
