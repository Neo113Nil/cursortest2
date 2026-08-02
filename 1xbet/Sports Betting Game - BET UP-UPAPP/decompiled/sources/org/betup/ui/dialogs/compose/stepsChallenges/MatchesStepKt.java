package org.betup.ui.dialogs.compose.stepsChallenges;

import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.matches.NewLeagueModel;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.MatchLeagueItemKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.dialogs.controller.MatchSelectionController;
import org.betup.ui.fragment.bets.sheet.compose.items.TeamsRowKt;
import org.betup.utils.UiExtensionsKt;

/* compiled from: MatchesStep.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001ai\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002"}, d2 = {"MatchesStep", "", "controller", "Lorg/betup/ui/dialogs/controller/MatchSelectionController;", "(Lorg/betup/ui/dialogs/controller/MatchSelectionController;Landroidx/compose/runtime/Composer;I)V", "NewMatchItem", "match", "Lorg/betup/model/remote/entity/matches/NewMatchItemModel;", "onClick", "Lkotlin/Function0;", "onNavigateToLeague", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "leagueId", "", "isLive", "compact", "(Lorg/betup/model/remote/entity/matches/NewMatchItemModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Composer;II)V", "NewMatchItemTeamsRow", "matchIsStarted", "teamImageSize", "Landroidx/compose/ui/unit/Dp;", "teamRowPadding", "NewMatchItemTeamsRow-UuyPYSY", "(ZLorg/betup/model/remote/entity/matches/NewMatchItemModel;FFLandroidx/compose/runtime/Composer;II)V", "app_release", "matches", "", "isLoading", "isLoadingMore", "hasMore", "error", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MatchesStepKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchesStep$lambda$8(MatchSelectionController matchSelectionController, int i, Composer composer, int i2) {
        MatchesStep(matchSelectionController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMatchItem$lambda$20(NewMatchItemModel newMatchItemModel, Function0 function0, Function2 function2, boolean z, int i, int i2, Composer composer, int i3) {
        NewMatchItem(newMatchItemModel, function0, function2, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMatchItemTeamsRow_UuyPYSY$lambda$21(boolean z, NewMatchItemModel newMatchItemModel, float f, float f2, int i, int i2, Composer composer, int i3) {
        m13349NewMatchItemTeamsRowUuyPYSY(z, newMatchItemModel, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MatchesStep(final MatchSelectionController controller, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(-885099519);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-885099519, i2, -1, "org.betup.ui.dialogs.compose.stepsChallenges.MatchesStep (MatchesStep.kt:44)");
            }
            State collectAsState = SnapshotStateKt.collectAsState(controller.getMatches(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState2 = SnapshotStateKt.collectAsState(controller.isLoading(), false, null, startRestartGroup, 48, 2);
            State collectAsState3 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), false, null, startRestartGroup, 48, 2);
            State collectAsState4 = SnapshotStateKt.collectAsState(controller.getHasMore(), false, null, startRestartGroup, 48, 2);
            State collectAsState5 = SnapshotStateKt.collectAsState(controller.getError(), null, null, startRestartGroup, 48, 2);
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            Boolean valueOf = Boolean.valueOf(MatchesStep$lambda$3(collectAsState4));
            Boolean valueOf2 = Boolean.valueOf(MatchesStep$lambda$2(collectAsState3));
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changed = startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(collectAsState4) | startRestartGroup.changedInstance(controller);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new MatchesStepKt$MatchesStep$1$1(rememberLazyListStateWithoutSavedState, controller, collectAsState, collectAsState3, collectAsState4, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue, startRestartGroup, 0);
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13167getListPaddingD9Ej5fM());
            boolean MatchesStep$lambda$1 = MatchesStep$lambda$1(collectAsState2);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(controller);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MatchesStep$lambda$7$lambda$6;
                        MatchesStep$lambda$7$lambda$6 = MatchesStepKt.MatchesStep$lambda$7$lambda$6(MatchSelectionController.this);
                        return MatchesStep$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(m1516padding3ABfNKs, MatchesStep$lambda$1, (Function0) rememberedValue2, !MatchesStep$lambda$0(collectAsState).isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(423107833, true, new MatchesStepKt$MatchesStep$3(rememberLazyListStateWithoutSavedState, collectAsState, controller, collectAsState3, collectAsState5), startRestartGroup, 54), startRestartGroup, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchesStep$lambda$8;
                    MatchesStep$lambda$8 = MatchesStepKt.MatchesStep$lambda$8(MatchSelectionController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchesStep$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchesStep$lambda$7$lambda$6(MatchSelectionController matchSelectionController) {
        matchSelectionController.refresh();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0211, code lost:
    
        if (r2 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0234, code lost:
    
        if (r5 == null) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewMatchItem(final NewMatchItemModel match, final Function0<Unit> onClick, Function2<? super Integer, ? super Boolean, Unit> function2, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Integer, ? super Boolean, Unit> function22;
        int i4;
        boolean z2;
        final Function2<? super Integer, ? super Boolean, Unit> function23;
        boolean z3;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        float m7774constructorimpl3;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Function2<? super Integer, ? super Boolean, Unit> function24;
        Composer composer2;
        final Function2<? super Integer, ? super Boolean, Unit> function25;
        final boolean z4;
        String str;
        String str2;
        Object obj;
        float f;
        Function0 function0;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1037421396);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(match) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    function23 = i5 != 0 ? null : function22;
                    z3 = i4 != 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1037421396, i3, -1, "org.betup.ui.dialogs.compose.stepsChallenges.NewMatchItem (MatchesStep.kt:156)");
                    }
                    if (z3) {
                        m7774constructorimpl = BattleFlowDimens.INSTANCE.m13173getMatchItemPaddingVD9Ej5fM();
                    } else {
                        m7774constructorimpl = Dp.m7774constructorimpl(8);
                    }
                    if (z3) {
                        m7774constructorimpl2 = BattleFlowDimens.INSTANCE.m13183getTeamImageSizeD9Ej5fM();
                    } else {
                        m7774constructorimpl2 = Dp.m7774constructorimpl(48);
                    }
                    float f2 = m7774constructorimpl2;
                    if (z3) {
                        m7774constructorimpl3 = BattleFlowDimens.INSTANCE.m13184getTeamRowPaddingD9Ej5fM();
                    } else {
                        m7774constructorimpl3 = Dp.m7774constructorimpl(16);
                    }
                    boolean isStarted = UiExtensionsKt.isStarted(match.getMatch());
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, m7774constructorimpl, 1, null);
                    startRestartGroup.startReplaceGroup(-529523350);
                    if (function23 == null) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean z5 = (i3 & 112) == 32;
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit NewMatchItem$lambda$10$lambda$9;
                                    NewMatchItem$lambda$10$lambda$9 = MatchesStepKt.NewMatchItem$lambda$10$lambda$9(Function0.this);
                                    return NewMatchItem$lambda$10$lambda$9;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        companion = ClickableKt.m1059clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue, 7, null);
                    } else {
                        companion = Modifier.INSTANCE;
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier then = m1518paddingVpY3zN4$default.then(companion);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                    if (function23 != null) {
                        startRestartGroup.startReplaceGroup(339857054);
                        NewLeagueModel league = match.getMatch().getLeague();
                        String name = league.getName();
                        if (name != null) {
                            if (StringsKt.isBlank(name)) {
                                name = null;
                            }
                        }
                        name = match.getMatch().getSport().getName();
                        if (name == null) {
                            name = "";
                        }
                        String photoUrl = league.getPhotoUrl();
                        if (photoUrl != null) {
                            if (StringsKt.isBlank(photoUrl)) {
                                photoUrl = null;
                            }
                        }
                        photoUrl = match.getMatch().getSport().getPhotoUrl();
                        if (photoUrl == null) {
                            photoUrl = "";
                        }
                        String str3 = photoUrl;
                        Long valueOf = Long.valueOf(league.getId());
                        long longValue = valueOf.longValue();
                        if (longValue <= 0 || longValue > SieveCacheKt.NodeLinkMask) {
                            valueOf = null;
                        }
                        final Integer valueOf2 = valueOf != null ? Integer.valueOf((int) valueOf.longValue()) : null;
                        startRestartGroup.startReplaceGroup(1396448926);
                        if (!StringsKt.isBlank(name)) {
                            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(2), 7, null);
                            startRestartGroup.startReplaceGroup(1396460953);
                            if (valueOf2 != null) {
                                startRestartGroup.startReplaceGroup(-1746271574);
                                boolean changed = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changed(valueOf2) | startRestartGroup.changedInstance(match);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit NewMatchItem$lambda$19$lambda$15$lambda$14;
                                            NewMatchItem$lambda$19$lambda$15$lambda$14 = MatchesStepKt.NewMatchItem$lambda$19$lambda$15$lambda$14(Function2.this, valueOf2, match);
                                            return NewMatchItem$lambda$19$lambda$15$lambda$14;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceGroup();
                                function0 = (Function0) rememberedValue2;
                            } else {
                                function0 = null;
                            }
                            startRestartGroup.endReplaceGroup();
                            str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                            String str4 = name;
                            f = 0.0f;
                            obj = null;
                            MatchLeagueItemKt.MatchLeagueItem(m1520paddingqDBjuR0$default, str3, str4, true, false, true, function0, startRestartGroup, 199686, 16);
                        } else {
                            str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                            obj = null;
                            f = 0.0f;
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, obj);
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean z6 = (i3 & 112) == 32;
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z6 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit NewMatchItem$lambda$19$lambda$17$lambda$16;
                                    NewMatchItem$lambda$19$lambda$17$lambda$16 = MatchesStepKt.NewMatchItem$lambda$19$lambda$17$lambda$16(Function0.this);
                                    return NewMatchItem$lambda$19$lambda$17$lambda$16;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue3, 7, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str2);
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
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function24 = function23;
                        composer2 = startRestartGroup;
                        m13349NewMatchItemTeamsRowUuyPYSY(isStarted, match, f2, m7774constructorimpl3, startRestartGroup, (i3 << 3) & 112, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceGroup();
                    } else {
                        function24 = function23;
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(341267585);
                        m13349NewMatchItemTeamsRowUuyPYSY(isStarted, match, f2, m7774constructorimpl3, composer2, (i3 << 3) & 112, 0);
                        composer2.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function25 = function24;
                    z4 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    function25 = function22;
                    z4 = z2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit NewMatchItem$lambda$20;
                            NewMatchItem$lambda$20 = MatchesStepKt.NewMatchItem$lambda$20(NewMatchItemModel.this, onClick, function25, z4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return NewMatchItem$lambda$20;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i3 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z3) {
            }
            if (z3) {
            }
            float f22 = m7774constructorimpl2;
            if (z3) {
            }
            boolean isStarted2 = UiExtensionsKt.isStarted(match.getMatch());
            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, m7774constructorimpl, 1, null);
            startRestartGroup.startReplaceGroup(-529523350);
            if (function23 == null) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier then2 = m1518paddingVpY3zN4$default2.then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (function23 != null) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            function25 = function24;
            z4 = z3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function22 = function2;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (z3) {
        }
        if (z3) {
        }
        float f222 = m7774constructorimpl2;
        if (z3) {
        }
        boolean isStarted22 = UiExtensionsKt.isStarted(match.getMatch());
        Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, m7774constructorimpl, 1, null);
        startRestartGroup.startReplaceGroup(-529523350);
        if (function23 == null) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then22 = m1518paddingVpY3zN4$default22.then(companion);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        if (function23 != null) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function25 = function24;
        z4 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMatchItem$lambda$10$lambda$9(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMatchItem$lambda$19$lambda$15$lambda$14(Function2 function2, Integer num, NewMatchItemModel newMatchItemModel) {
        function2.invoke(num, Boolean.valueOf(UiExtensionsKt.isLive(newMatchItemModel.getMatch())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewMatchItem$lambda$19$lambda$17$lambda$16(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0063  */
    /* renamed from: NewMatchItemTeamsRow-UuyPYSY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13349NewMatchItemTeamsRowUuyPYSY(final boolean z, final NewMatchItemModel newMatchItemModel, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        float f4;
        String str;
        String str2;
        String formattedDateWithoutYear;
        String str3;
        String formattedTime;
        Composer composer2;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-370173258);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(newMatchItemModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i3 & 1171) != 1170 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    f5 = f3;
                    f6 = f4;
                    composer2 = startRestartGroup;
                } else {
                    float m7774constructorimpl = i5 != 0 ? Dp.m7774constructorimpl(48) : f3;
                    float m7774constructorimpl2 = i4 != 0 ? Dp.m7774constructorimpl(16) : f4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-370173258, i3, -1, "org.betup.ui.dialogs.compose.stepsChallenges.NewMatchItemTeamsRow (MatchesStep.kt:226)");
                    }
                    String name = newMatchItemModel.getMatch().getHomeTeam().getName();
                    String str4 = name == null ? "" : name;
                    String name2 = newMatchItemModel.getMatch().getAwayTeam().getName();
                    String str5 = name2 == null ? "" : name2;
                    String photoUrl = newMatchItemModel.getMatch().getHomeTeam().getPhotoUrl();
                    String str6 = photoUrl == null ? "" : photoUrl;
                    String photoUrl2 = newMatchItemModel.getMatch().getAwayTeam().getPhotoUrl();
                    String str7 = photoUrl2 == null ? "" : photoUrl2;
                    str = null;
                    String valueOf = (z || newMatchItemModel.getMatch().getScoreHome() <= 0) ? null : String.valueOf(newMatchItemModel.getMatch().getScoreHome());
                    if (z && newMatchItemModel.getMatch().getScoreAway() > 0) {
                        str = String.valueOf(newMatchItemModel.getMatch().getScoreAway());
                    }
                    String str8 = str;
                    if (z) {
                        String currentTime = newMatchItemModel.getMatch().getCurrentTime();
                        if (currentTime == null) {
                            currentTime = "";
                        }
                        formattedDateWithoutYear = UiExtensionsKt.normalizeMatchTime(currentTime);
                    } else {
                        String date = newMatchItemModel.getMatch().getDate();
                        if (date == null || (formattedDateWithoutYear = UiExtensionsKt.getFormattedDateWithoutYear(date)) == null) {
                            str2 = "";
                            if (!z) {
                                String currentPeriod = newMatchItemModel.getMatch().getCurrentPeriod();
                                formattedTime = UiExtensionsKt.normalizeMatchTime(currentPeriod != null ? currentPeriod : "");
                            } else {
                                String date2 = newMatchItemModel.getMatch().getDate();
                                if (date2 == null || (formattedTime = UiExtensionsKt.getFormattedTime(date2)) == null) {
                                    str3 = "";
                                    composer2 = startRestartGroup;
                                    TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, str8, null, str2, str3, null, false, z, false, false, false, false, 0, null, null, m7774constructorimpl, m7774constructorimpl2, false, composer2, 0, ((i3 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48, (i3 >> 6) & 126, 5235841);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f5 = m7774constructorimpl;
                                    f6 = m7774constructorimpl2;
                                }
                            }
                            str3 = formattedTime;
                            composer2 = startRestartGroup;
                            TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, str8, null, str2, str3, null, false, z, false, false, false, false, 0, null, null, m7774constructorimpl, m7774constructorimpl2, false, composer2, 0, ((i3 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48, (i3 >> 6) & 126, 5235841);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f5 = m7774constructorimpl;
                            f6 = m7774constructorimpl2;
                        }
                    }
                    str2 = formattedDateWithoutYear;
                    if (!z) {
                    }
                    str3 = formattedTime;
                    composer2 = startRestartGroup;
                    TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, str8, null, str2, str3, null, false, z, false, false, false, false, 0, null, null, m7774constructorimpl, m7774constructorimpl2, false, composer2, 0, ((i3 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48, (i3 >> 6) & 126, 5235841);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f5 = m7774constructorimpl;
                    f6 = m7774constructorimpl2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.MatchesStepKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit NewMatchItemTeamsRow_UuyPYSY$lambda$21;
                            NewMatchItemTeamsRow_UuyPYSY$lambda$21 = MatchesStepKt.NewMatchItemTeamsRow_UuyPYSY$lambda$21(z, newMatchItemModel, f5, f6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return NewMatchItemTeamsRow_UuyPYSY$lambda$21;
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if ((i3 & 1171) != 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String name3 = newMatchItemModel.getMatch().getHomeTeam().getName();
            if (name3 == null) {
            }
            String name22 = newMatchItemModel.getMatch().getAwayTeam().getName();
            if (name22 == null) {
            }
            String photoUrl3 = newMatchItemModel.getMatch().getHomeTeam().getPhotoUrl();
            if (photoUrl3 == null) {
            }
            String photoUrl22 = newMatchItemModel.getMatch().getAwayTeam().getPhotoUrl();
            if (photoUrl22 == null) {
            }
            str = null;
            if (z) {
            }
            if (z) {
                str = String.valueOf(newMatchItemModel.getMatch().getScoreAway());
            }
            String str82 = str;
            if (z) {
            }
            str2 = formattedDateWithoutYear;
            if (!z) {
            }
            str3 = formattedTime;
            composer2 = startRestartGroup;
            TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, str82, null, str2, str3, null, false, z, false, false, false, false, 0, null, null, m7774constructorimpl, m7774constructorimpl2, false, composer2, 0, ((i3 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48, (i3 >> 6) & 126, 5235841);
            if (ComposerKt.isTraceInProgress()) {
            }
            f5 = m7774constructorimpl;
            f6 = m7774constructorimpl2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i3 & 1171) != 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        String name32 = newMatchItemModel.getMatch().getHomeTeam().getName();
        if (name32 == null) {
        }
        String name222 = newMatchItemModel.getMatch().getAwayTeam().getName();
        if (name222 == null) {
        }
        String photoUrl32 = newMatchItemModel.getMatch().getHomeTeam().getPhotoUrl();
        if (photoUrl32 == null) {
        }
        String photoUrl222 = newMatchItemModel.getMatch().getAwayTeam().getPhotoUrl();
        if (photoUrl222 == null) {
        }
        str = null;
        if (z) {
        }
        if (z) {
        }
        String str822 = str;
        if (z) {
        }
        str2 = formattedDateWithoutYear;
        if (!z) {
        }
        str3 = formattedTime;
        composer2 = startRestartGroup;
        TeamsRowKt.m13615TeamsRowUiefj4(null, str4, str5, str6, str7, valueOf, str822, null, str2, str3, null, false, z, false, false, false, false, 0, null, null, m7774constructorimpl, m7774constructorimpl2, false, composer2, 0, ((i3 << 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 48, (i3 >> 6) & 126, 5235841);
        if (ComposerKt.isTraceInProgress()) {
        }
        f5 = m7774constructorimpl;
        f6 = m7774constructorimpl2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewMatchItemModel> MatchesStep$lambda$0(State<? extends List<NewMatchItemModel>> state) {
        return state.getValue();
    }

    private static final boolean MatchesStep$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MatchesStep$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MatchesStep$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MatchesStep$lambda$4(State<String> state) {
        return state.getValue();
    }
}
