package org.betup.ui.dialogs.compose.stepsChallenges;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
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
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.dialogs.controller.BetSelectionController;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: BetGroupsStep.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\u001ao\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2:\b\u0002\u0010\n\u001a4\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u008a\u0084\u0002²\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\fX\u008a\u0084\u0002²\u0006\"\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100 0 X\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\"X\u008a\u0084\u0002"}, d2 = {"BetGroupsStep", "", "selectedMatch", "Lorg/betup/model/remote/entity/matches/NewMatchItemModel;", "controller", "Lorg/betup/ui/dialogs/controller/BetSelectionController;", "oddType", "Lorg/betup/model/local/entity/OddType;", "modifier", "Landroidx/compose/ui/Modifier;", "onNavigateToLeague", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "leagueId", "", "isLive", "(Lorg/betup/model/remote/entity/matches/NewMatchItemModel;Lorg/betup/ui/dialogs/controller/BetSelectionController;Lorg/betup/model/local/entity/OddType;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release", "selectedBetIds", "", "", "isLoadingMatch", "isLoadingBets", "subMatches", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "betGroups", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "selectedBetGroupTabIndex", "expandedStatesPerTab", "", "error", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetGroupsStepKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsStep$lambda$40(NewMatchItemModel newMatchItemModel, BetSelectionController betSelectionController, OddType oddType, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        BetGroupsStep(newMatchItemModel, betSelectionController, oddType, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x10a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0947 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0f0c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0f18  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0fb5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0fc1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0fea  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0fc5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0f1c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x10b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x07b7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetGroupsStep(final NewMatchItemModel newMatchItemModel, final BetSelectionController controller, OddType oddType, Modifier modifier, Function2<? super Integer, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Integer, ? super Boolean, Unit> function22;
        int i5;
        State collectAsState;
        State collectAsState2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int i6;
        String str;
        String str2;
        String str3;
        String str4;
        Modifier modifier3;
        String str5;
        String str6;
        int i7;
        Composer composer2;
        boolean z;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        final OddType oddType2;
        final Modifier modifier4;
        Map<Long, Boolean> map;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(-1667038478);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(newMatchItemModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                i5 = i3;
                if ((i5 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    OddType oddType3 = i8 != 0 ? OddType.DECIMAL : oddType;
                    Modifier modifier5 = i9 != 0 ? Modifier.INSTANCE : modifier2;
                    Function2<? super Integer, ? super Boolean, Unit> function23 = i4 != 0 ? null : function22;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1667038478, i5, -1, "org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStep (BetGroupsStep.kt:36)");
                    }
                    State collectAsState3 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
                    State collectAsState4 = SnapshotStateKt.collectAsState(controller.isLoadingMatch(), null, startRestartGroup, 0, 1);
                    collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingBets(), null, startRestartGroup, 0, 1);
                    collectAsState2 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
                    State collectAsState5 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
                    State collectAsState6 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
                    State collectAsState7 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
                    State collectAsState8 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
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
                    if (newMatchItemModel != null) {
                        startRestartGroup.startReplaceGroup(-692164729);
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13153getBetMatchHeaderPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13154getBetMatchHeaderPaddingVD9Ej5fM());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                        Composer m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit;
                                    unit = Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        MatchesStepKt.NewMatchItem(newMatchItemModel, (Function0) rememberedValue, function23, true, startRestartGroup, (i5 & 14) | 3120 | ((i5 >> 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 0);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        i6 = i5;
                        str = "C72@3468L9:Box.kt#2w3rfo";
                        str5 = "C89@4556L9:Column.kt#2w3rfo";
                        str2 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        i7 = 5004770;
                        str6 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                        modifier3 = modifier5;
                    } else if (!BetGroupsStep$lambda$1(collectAsState4)) {
                        i6 = i5;
                        str = "C72@3468L9:Box.kt#2w3rfo";
                        str2 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        modifier3 = modifier5;
                        if (BetGroupsStep$lambda$7(collectAsState8) != null) {
                            startRestartGroup.startReplaceGroup(-690583233);
                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, str2);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, str);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, startRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl6, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            str5 = "C89@4556L9:Column.kt#2w3rfo";
                            str6 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                            composer2 = startRestartGroup;
                            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.error, startRestartGroup, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13158getErrorPaddingHD9Ej5fM(), 0.0f, 2, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13159getErrorTextSizeXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
                            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13170getLoadingSpacerD9Ej5fM()), composer2, 6);
                            String stringResource = StringResources_androidKt.stringResource(R.string.try_again, composer2, 6);
                            i7 = 5004770;
                            composer2.startReplaceGroup(5004770);
                            boolean changedInstance = composer2.changedInstance(controller);
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BetGroupsStep$lambda$39$lambda$16$lambda$15$lambda$14$lambda$13;
                                        BetGroupsStep$lambda$39$lambda$16$lambda$15$lambda$14$lambda$13 = BetGroupsStepKt.BetGroupsStep$lambda$39$lambda$16$lambda$15$lambda$14$lambda$13(BetSelectionController.this);
                                        return BetGroupsStep$lambda$39$lambda$16$lambda$15$lambda$14$lambda$13;
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, stringResource, true, false, false, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 3120, 0, 0, 2097073);
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
                            composer2.endReplaceGroup();
                        } else {
                            str5 = "C89@4556L9:Column.kt#2w3rfo";
                            str6 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                            i7 = 5004770;
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(-689388710);
                            composer2.endReplaceGroup();
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(-691449001);
                        Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        str2 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, str2);
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                        str3 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        str4 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor5);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl7, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                            m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash5);
                        }
                        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center4 = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(center4, centerHorizontally2, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor6);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl8, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash6);
                        }
                        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        LoadingViewKt.LoadingView(null, null, startRestartGroup, 0, 3);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13170getLoadingSpacerD9Ej5fM()), startRestartGroup, 6);
                        i6 = i5;
                        modifier3 = modifier5;
                        str = "C72@3468L9:Box.kt#2w3rfo";
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading, startRestartGroup, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13171getLoadingTextXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3072, 0, 130546);
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
                        startRestartGroup.endReplaceGroup();
                        str5 = "C89@4556L9:Column.kt#2w3rfo";
                        str6 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
                        i7 = 5004770;
                        composer2 = startRestartGroup;
                    }
                    if (!BetGroupsStep$lambda$3(collectAsState2).isEmpty()) {
                        List<BetGroupsTabs> BetGroupsStep$lambda$3 = BetGroupsStep$lambda$3(collectAsState2);
                        if (!(BetGroupsStep$lambda$3 instanceof Collection) || !BetGroupsStep$lambda$3.isEmpty()) {
                            Iterator<T> it = BetGroupsStep$lambda$3.iterator();
                            while (it.hasNext()) {
                                if (!((BetGroupsTabs) it.next()).getBets().isEmpty()) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    z = false;
                    boolean isEmpty = BetGroupsStep$lambda$4(collectAsState5).isEmpty();
                    if (!z && !isEmpty) {
                        composer2.startReplaceGroup(-688962832);
                        List<BetGroupsTabs> BetGroupsStep$lambda$32 = BetGroupsStep$lambda$3(collectAsState2);
                        int BetGroupsStep$lambda$5 = BetGroupsStep$lambda$5(collectAsState6);
                        List<MatchVarietyGroupBetsModel> BetGroupsStep$lambda$4 = BetGroupsStep$lambda$4(collectAsState5);
                        Set<Long> BetGroupsStep$lambda$0 = BetGroupsStep$lambda$0(collectAsState3);
                        Map<Long, Boolean> map2 = BetGroupsStep$lambda$6(collectAsState7).get(Integer.valueOf(BetGroupsStep$lambda$5(collectAsState6)));
                        if (map2 == null) {
                            List<MatchVarietyGroupBetsModel> BetGroupsStep$lambda$42 = BetGroupsStep$lambda$4(collectAsState5);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(BetGroupsStep$lambda$42, 10)), 16));
                            Iterator<T> it2 = BetGroupsStep$lambda$42.iterator();
                            while (it2.hasNext()) {
                                Pair pair = TuplesKt.to(Long.valueOf(((MatchVarietyGroupBetsModel) it2.next()).getGroup().getId()), false);
                                linkedHashMap.put(pair.getFirst(), pair.getSecond());
                            }
                            map = linkedHashMap;
                        } else {
                            map = map2;
                        }
                        Map<Integer, Map<Long, Boolean>> BetGroupsStep$lambda$6 = BetGroupsStep$lambda$6(collectAsState7);
                        Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        composer2.startReplaceGroup(i7);
                        boolean changedInstance2 = composer2.changedInstance(controller);
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit BetGroupsStep$lambda$39$lambda$20$lambda$19;
                                    BetGroupsStep$lambda$39$lambda$20$lambda$19 = BetGroupsStepKt.BetGroupsStep$lambda$39$lambda$20$lambda$19(BetSelectionController.this, ((Integer) obj).intValue());
                                    return BetGroupsStep$lambda$39$lambda$20$lambda$19;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        Function1 function1 = (Function1) rememberedValue3;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(i7);
                        boolean changedInstance3 = composer2.changedInstance(controller);
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BetGroupsStep$lambda$39$lambda$22$lambda$21;
                                    BetGroupsStep$lambda$39$lambda$22$lambda$21 = BetGroupsStepKt.BetGroupsStep$lambda$39$lambda$22$lambda$21(BetSelectionController.this, ((Long) obj).longValue(), ((Integer) obj2).intValue());
                                    return BetGroupsStep$lambda$39$lambda$22$lambda$21;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        Function2 function24 = (Function2) rememberedValue4;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(i7);
                        boolean changedInstance4 = composer2.changedInstance(controller);
                        Object rememberedValue5 = composer2.rememberedValue();
                        if (changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BetGroupsStep$lambda$39$lambda$24$lambda$23;
                                    BetGroupsStep$lambda$39$lambda$24$lambda$23 = BetGroupsStepKt.BetGroupsStep$lambda$39$lambda$24$lambda$23(BetSelectionController.this, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                                    return BetGroupsStep$lambda$39$lambda$24$lambda$23;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        Function2 function25 = (Function2) rememberedValue5;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(i7);
                        boolean changedInstance5 = composer2.changedInstance(controller);
                        Object rememberedValue6 = composer2.rememberedValue();
                        if (changedInstance5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new Function3() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit BetGroupsStep$lambda$39$lambda$26$lambda$25;
                                    BetGroupsStep$lambda$39$lambda$26$lambda$25 = BetGroupsStepKt.BetGroupsStep$lambda$39$lambda$26$lambda$25(BetSelectionController.this, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (List) obj3);
                                    return BetGroupsStep$lambda$39$lambda$26$lambda$25;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        Function3 function3 = (Function3) rememberedValue6;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        Object rememberedValue7 = composer2.rememberedValue();
                        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    List emptyList;
                                    emptyList = CollectionsKt.emptyList();
                                    return emptyList;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        composer2.endReplaceGroup();
                        MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(weight$default, BetGroupsStep$lambda$32, BetGroupsStep$lambda$5, BetGroupsStep$lambda$4, function1, function24, BetGroupsStep$lambda$0, null, map, BetGroupsStep$lambda$6, function25, function3, oddType3, (Function0) rememberedValue7, true, true, true, null, null, null, null, null, null, false, false, 0L, null, null, false, null, null, null, composer2, 0, (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 1797120, 0, 0, 2147352704, 1);
                        composer2.endReplaceGroup();
                    } else if (!BetGroupsStep$lambda$2(collectAsState) || (z && isEmpty)) {
                        String str7 = str5;
                        String str8 = str6;
                        composer2.startReplaceGroup(-687523440);
                        Modifier fillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str2);
                        MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center5, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default4);
                        Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor7);
                        } else {
                            composer2.useNode();
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash7);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center6 = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str8);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(center6, centerHorizontally3, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer2, companion3);
                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor8);
                        } else {
                            composer2.useNode();
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash8);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str7);
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        LoadingViewKt.LoadingView(null, null, composer2, 0, 3);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13170getLoadingSpacerD9Ej5fM()), composer2, 6);
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading_bets, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13171getLoadingTextXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
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
                        composer2.endReplaceGroup();
                    } else if (BetGroupsStep$lambda$7(collectAsState8) != null) {
                        composer2.startReplaceGroup(-686435433);
                        Modifier fillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center7 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str2);
                        MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center7, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
                        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default5);
                        Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor9);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl9 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl9, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl9, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl9.getInserting() || !Intrinsics.areEqual(m4610constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                            m4610constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                            m4610constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                        }
                        Updater.m4617setimpl(m4610constructorimpl9, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center8 = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str6);
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(center8, centerHorizontally4, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
                        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer2, companion4);
                        Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor10);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl10 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl10, columnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl10.getInserting() || !Intrinsics.areEqual(m4610constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                            m4610constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                            m4610constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                        }
                        Updater.m4617setimpl(m4610constructorimpl10, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str5);
                        ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.battles_error, composer2, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13158getErrorPaddingHD9Ej5fM(), 0.0f, 2, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13159getErrorTextSizeXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13170getLoadingSpacerD9Ej5fM()), composer2, 6);
                        String stringResource2 = StringResources_androidKt.stringResource(R.string.try_again, composer2, 6);
                        composer2.startReplaceGroup(i7);
                        boolean changedInstance6 = composer2.changedInstance(controller);
                        Object rememberedValue8 = composer2.rememberedValue();
                        if (changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BetGroupsStep$lambda$39$lambda$34$lambda$33$lambda$32$lambda$31;
                                    BetGroupsStep$lambda$39$lambda$34$lambda$33$lambda$32$lambda$31 = BetGroupsStepKt.BetGroupsStep$lambda$39$lambda$34$lambda$33$lambda$32$lambda$31(BetSelectionController.this);
                                    return BetGroupsStep$lambda$39$lambda$34$lambda$33$lambda$32$lambda$31;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        composer2.endReplaceGroup();
                        CommonButtonKt.m12915CommonButtonUPEs2M4(null, true, stringResource2, true, false, false, (Function0) rememberedValue8, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer2, 3120, 0, 0, 2097073);
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
                        composer2.endReplaceGroup();
                    } else {
                        String str9 = str5;
                        String str10 = str6;
                        composer2.startReplaceGroup(-685167998);
                        if (!BetGroupsStep$lambda$2(collectAsState)) {
                            if (!BetGroupsStep$lambda$3(collectAsState2).isEmpty()) {
                                List<BetGroupsTabs> BetGroupsStep$lambda$33 = BetGroupsStep$lambda$3(collectAsState2);
                                if (!(BetGroupsStep$lambda$33 instanceof Collection) || !BetGroupsStep$lambda$33.isEmpty()) {
                                    Iterator<T> it3 = BetGroupsStep$lambda$33.iterator();
                                    while (it3.hasNext()) {
                                        if (!((BetGroupsTabs) it3.next()).getBets().isEmpty()) {
                                        }
                                    }
                                }
                            }
                            composer2.startReplaceGroup(-684860664);
                            Modifier fillMaxSize$default6 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment center9 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str2);
                            MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(center9, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
                            int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default6);
                            Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor11);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4610constructorimpl11 = Updater.m4610constructorimpl(composer2);
                            Updater.m4617setimpl(m4610constructorimpl11, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl11.getInserting() || !Intrinsics.areEqual(m4610constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                m4610constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                                m4610constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                            }
                            Updater.m4617setimpl(m4610constructorimpl11, materializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str);
                            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_bets, composer2, 6), PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13158getErrorPaddingHD9Ej5fM(), 0.0f, 2, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13159getErrorTextSizeXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 130544);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        }
                        composer2.startReplaceGroup(-684254397);
                        Modifier fillMaxSize$default7 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center10 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str2);
                        MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(center10, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
                        int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier12 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default7);
                        Function0<ComposeUiNode> constructor12 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor12);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl12 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl12, maybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl12, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl12.getInserting() || !Intrinsics.areEqual(m4610constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                            m4610constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                            m4610constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                        }
                        Updater.m4617setimpl(m4610constructorimpl12, materializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str);
                        BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                        Alignment.Horizontal centerHorizontally5 = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center11 = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str10);
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(center11, centerHorizontally5, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
                        int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier13 = ComposedModifierKt.materializeModifier(composer2, companion5);
                        Function0<ComposeUiNode> constructor13 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor13);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl13 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl13, columnMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl13, currentCompositionLocalMap13, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl13.getInserting() || !Intrinsics.areEqual(m4610constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
                            m4610constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
                            m4610constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
                        }
                        Updater.m4617setimpl(m4610constructorimpl13, materializeModifier13, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str9);
                        ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                        LoadingViewKt.LoadingView(null, null, composer2, 0, 3);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13170getLoadingSpacerD9Ej5fM()), composer2, 6);
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading_bets, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13171getLoadingTextXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
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
                        composer2.endReplaceGroup();
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
                    oddType2 = oddType3;
                    function22 = function23;
                    modifier4 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = startRestartGroup;
                    oddType2 = oddType;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BetGroupsStep$lambda$40;
                            BetGroupsStep$lambda$40 = BetGroupsStepKt.BetGroupsStep$lambda$40(NewMatchItemModel.this, controller, oddType2, modifier4, function22, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BetGroupsStep$lambda$40;
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            State collectAsState32 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
            State collectAsState42 = SnapshotStateKt.collectAsState(controller.isLoadingMatch(), null, startRestartGroup, 0, 1);
            collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingBets(), null, startRestartGroup, 0, 1);
            collectAsState2 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
            State collectAsState52 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
            State collectAsState62 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
            State collectAsState72 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
            State collectAsState82 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
            Modifier fillMaxSize$default8 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap14 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier14 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default8);
            Function0<ComposeUiNode> constructor14 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap14, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash14);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier14, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            if (newMatchItemModel != null) {
            }
            if (!BetGroupsStep$lambda$3(collectAsState2).isEmpty()) {
            }
            z = false;
            boolean isEmpty2 = BetGroupsStep$lambda$4(collectAsState52).isEmpty();
            if (!z) {
            }
            if (!BetGroupsStep$lambda$2(collectAsState)) {
            }
            String str72 = str5;
            String str82 = str6;
            composer2.startReplaceGroup(-687523440);
            Modifier fillMaxSize$default42 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center52 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str2);
            MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(center52, false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap72 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default42);
            Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash72);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str);
            BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally32 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center62 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str82);
            Modifier.Companion companion32 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy42 = ColumnKt.columnMeasurePolicy(center62, centerHorizontally32, composer2, 54);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap82 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier82 = ComposedModifierKt.materializeModifier(composer2, companion32);
            Function0<ComposeUiNode> constructor82 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap82, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash82 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash82);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier82, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str72);
            ColumnScopeInstance columnScopeInstance42 = ColumnScopeInstance.INSTANCE;
            LoadingViewKt.LoadingView(null, null, composer2, 0, 3);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13170getLoadingSpacerD9Ej5fM()), composer2, 6);
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading_bets, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13171getLoadingTextXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
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
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            oddType2 = oddType3;
            function22 = function23;
            modifier4 = modifier3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState322 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
        State collectAsState422 = SnapshotStateKt.collectAsState(controller.isLoadingMatch(), null, startRestartGroup, 0, 1);
        collectAsState = SnapshotStateKt.collectAsState(controller.isLoadingBets(), null, startRestartGroup, 0, 1);
        collectAsState2 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
        State collectAsState522 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
        State collectAsState622 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
        State collectAsState722 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
        State collectAsState822 = SnapshotStateKt.collectAsState(controller.getError(), null, startRestartGroup, 0, 1);
        Modifier fillMaxSize$default82 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy72 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap142 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier142 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default82);
        Function0<ComposeUiNode> constructor142 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy72, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap142, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash142 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash142);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier142, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance72 = ColumnScopeInstance.INSTANCE;
        if (newMatchItemModel != null) {
        }
        if (!BetGroupsStep$lambda$3(collectAsState2).isEmpty()) {
        }
        z = false;
        boolean isEmpty22 = BetGroupsStep$lambda$4(collectAsState522).isEmpty();
        if (!z) {
        }
        if (!BetGroupsStep$lambda$2(collectAsState)) {
        }
        String str722 = str5;
        String str822 = str6;
        composer2.startReplaceGroup(-687523440);
        Modifier fillMaxSize$default422 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment center522 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, str2);
        MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(center522, false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap722 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier722 = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default422);
        Function0<ComposeUiNode> constructor722 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash722);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, str);
        BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
        Alignment.Horizontal centerHorizontally322 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center622 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str822);
        Modifier.Companion companion322 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy422 = ColumnKt.columnMeasurePolicy(center622, centerHorizontally322, composer2, 54);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str3);
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap822 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier822 = ComposedModifierKt.materializeModifier(composer2, companion322);
        Function0<ComposeUiNode> constructor822 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap822, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash822 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash822);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier822, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, str722);
        ColumnScopeInstance columnScopeInstance422 = ColumnScopeInstance.INSTANCE;
        LoadingViewKt.LoadingView(null, null, composer2, 0, 3);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13170getLoadingSpacerD9Ej5fM()), composer2, 6);
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading_bets, composer2, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13171getLoadingTextXSAIIZE(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130546);
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
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        oddType2 = oddType3;
        function22 = function23;
        modifier4 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsStep$lambda$39$lambda$16$lambda$15$lambda$14$lambda$13(BetSelectionController betSelectionController) {
        betSelectionController.retry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsStep$lambda$39$lambda$20$lambda$19(BetSelectionController betSelectionController, int i) {
        betSelectionController.onBetGroupTabSelected(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsStep$lambda$39$lambda$22$lambda$21(BetSelectionController betSelectionController, long j, int i) {
        betSelectionController.onBetClick(j, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsStep$lambda$39$lambda$24$lambda$23(BetSelectionController betSelectionController, int i, long j) {
        betSelectionController.onExpandToggle(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsStep$lambda$39$lambda$26$lambda$25(BetSelectionController betSelectionController, int i, boolean z, List groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        betSelectionController.setAllExpanded(i, z, groupIds);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupsStep$lambda$39$lambda$34$lambda$33$lambda$32$lambda$31(BetSelectionController betSelectionController) {
        betSelectionController.retry();
        return Unit.INSTANCE;
    }

    private static final Set<Long> BetGroupsStep$lambda$0(State<? extends Set<Long>> state) {
        return state.getValue();
    }

    private static final boolean BetGroupsStep$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean BetGroupsStep$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<BetGroupsTabs> BetGroupsStep$lambda$3(State<? extends List<BetGroupsTabs>> state) {
        return state.getValue();
    }

    private static final List<MatchVarietyGroupBetsModel> BetGroupsStep$lambda$4(State<? extends List<MatchVarietyGroupBetsModel>> state) {
        return state.getValue();
    }

    private static final int BetGroupsStep$lambda$5(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final Map<Integer, Map<Long, Boolean>> BetGroupsStep$lambda$6(State<? extends Map<Integer, ? extends Map<Long, Boolean>>> state) {
        return (Map) state.getValue();
    }

    private static final String BetGroupsStep$lambda$7(State<String> state) {
        return state.getValue();
    }
}
