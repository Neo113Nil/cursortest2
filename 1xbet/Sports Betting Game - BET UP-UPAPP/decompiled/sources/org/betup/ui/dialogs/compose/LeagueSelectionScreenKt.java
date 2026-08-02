package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.dialogs.controller.LeagueSelectionController;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;

/* compiled from: LeagueSelectionScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"LeagueSelectionScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lorg/betup/ui/dialogs/controller/LeagueSelectionController;", "onDismiss", "Lkotlin/Function0;", "onBack", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/controller/LeagueSelectionController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release", "leaguesQuery", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LeagueSelectionScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeagueSelectionScreen$lambda$5(Modifier modifier, LeagueSelectionController leagueSelectionController, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        LeagueSelectionScreen(modifier, leagueSelectionController, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LeagueSelectionScreen(Modifier modifier, final LeagueSelectionController controller, final Function0<Unit> onDismiss, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier3;
        Function0<Unit> function03;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Function0<Unit> function04;
        int i4;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1928702685);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                function02 = function0;
                if (startRestartGroup.changedInstance(function02)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                function02 = function0;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            function02 = function0;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    modifier3 = companion;
                    function03 = onDismiss;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1928702685, i3, -1, "org.betup.ui.dialogs.compose.LeagueSelectionScreen (LeagueSelectionScreen.kt:34)");
                    }
                    State collectAsState = SnapshotStateKt.collectAsState(controller.getLeaguesQuery(), null, startRestartGroup, 0, 1);
                    startRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.LeagueSelectionScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit LeagueSelectionScreen$lambda$2$lambda$1;
                                LeagueSelectionScreen$lambda$2$lambda$1 = LeagueSelectionScreenKt.LeagueSelectionScreen$lambda$2$lambda$1(Function0.this);
                                return LeagueSelectionScreen$lambda$2$lambda$1;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier subtleClickAnimation = ClickAnimationModifierKt.subtleClickAnimation(modifier3, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, i3 & 14, 0, 1022);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation);
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
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), BattleFlowDimens.INSTANCE.m13174getScreenPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13175getScreenPaddingVD9Ej5fM());
                    Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceAround, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    int i6 = i3 >> 3;
                    TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, function03, null, false, true, true, startRestartGroup, (i6 & 112) | 1794048 | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
                    SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13192getTopSpacerMinD9Ej5fM(), BattleFlowDimens.INSTANCE.m13190getTopSpacerMaxD9Ej5fM()), startRestartGroup, 6);
                    TicketDarkKt.TicketDark(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableSingletons$LeagueSelectionScreenKt.INSTANCE.m13291getLambda$1360530383$app_release(), ComposableLambdaKt.rememberComposableLambda(518996240, true, new LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1(controller, collectAsState), startRestartGroup, 54), ComposableSingletons$LeagueSelectionScreenKt.INSTANCE.m13292getLambda$1896444433$app_release(), false, false, null, false, startRestartGroup, 224694, 192);
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
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function04 = function03;
                } else {
                    modifier3 = companion;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                modifier3 = modifier2;
            }
            function03 = function02;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            State collectAsState2 = SnapshotStateKt.collectAsState(controller.getLeaguesQuery(), null, startRestartGroup, 0, 1);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.LeagueSelectionScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit LeagueSelectionScreen$lambda$2$lambda$1;
                    LeagueSelectionScreen$lambda$2$lambda$1 = LeagueSelectionScreenKt.LeagueSelectionScreen$lambda$2$lambda$1(Function0.this);
                    return LeagueSelectionScreen$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier subtleClickAnimation2 = ClickAnimationModifierKt.subtleClickAnimation(modifier3, (Function0) rememberedValue, null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, i3 & 14, 0, 1022);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, subtleClickAnimation2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), BattleFlowDimens.INSTANCE.m13174getScreenPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13175getScreenPaddingVD9Ej5fM());
            Arrangement.HorizontalOrVertical spaceAround2 = Arrangement.INSTANCE.getSpaceAround();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceAround2, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            int i62 = i3 >> 3;
            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, function03, null, false, true, true, startRestartGroup, (i62 & 112) | 1794048 | (i62 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13192getTopSpacerMinD9Ej5fM(), BattleFlowDimens.INSTANCE.m13190getTopSpacerMaxD9Ej5fM()), startRestartGroup, 6);
            TicketDarkKt.TicketDark(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ComposableSingletons$LeagueSelectionScreenKt.INSTANCE.m13291getLambda$1360530383$app_release(), ComposableLambdaKt.rememberComposableLambda(518996240, true, new LeagueSelectionScreenKt$LeagueSelectionScreen$2$1$1(controller, collectAsState2), startRestartGroup, 54), ComposableSingletons$LeagueSelectionScreenKt.INSTANCE.m13292getLambda$1896444433$app_release(), false, false, null, false, startRestartGroup, 224694, 192);
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
            if (ComposerKt.isTraceInProgress()) {
            }
            function04 = function03;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            function04 = function02;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.LeagueSelectionScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LeagueSelectionScreen$lambda$5;
                    LeagueSelectionScreen$lambda$5 = LeagueSelectionScreenKt.LeagueSelectionScreen$lambda$5(Modifier.this, controller, onDismiss, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return LeagueSelectionScreen$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeagueSelectionScreen$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LeagueSelectionScreen$lambda$0(State<String> state) {
        return state.getValue();
    }
}
