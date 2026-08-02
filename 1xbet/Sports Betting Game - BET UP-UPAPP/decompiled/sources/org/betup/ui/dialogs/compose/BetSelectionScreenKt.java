package org.betup.ui.dialogs.compose;

import android.util.Log;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.model.remote.entity.matches.NewMatchItemModel;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.dialogs.compose.stepsChallenges.BetGroupsStepKt;
import org.betup.ui.dialogs.controller.BattleBetSelectionState;
import org.betup.ui.dialogs.controller.BattleUserUi;
import org.betup.ui.dialogs.controller.BetSelectionController;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.components.BattleMatchDetItemKt;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleCreator;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.items.BattleUiItem;

/* compiled from: BetSelectionScreen.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2:\b\u0002\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"BetSelectionScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lorg/betup/ui/dialogs/controller/BetSelectionController;", "onDismiss", "Lkotlin/Function0;", "onBack", "showBackButton", "", "onNavigateToLeague", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "leagueId", "isLive", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/controller/BetSelectionController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release", "selectedMatch", "Lorg/betup/model/remote/entity/matches/NewMatchItemModel;", "battleInfo", "Lorg/betup/ui/dialogs/controller/BattleUserUi;", "selectedBetIds", "", "", "isAcceptingBattle", "isVideoRewardAvailable", "videoRewardAmount"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BetSelectionScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSelectionScreen$lambda$6(Modifier modifier, BetSelectionController betSelectionController, Function0 function0, Function0 function02, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        BetSelectionScreen(modifier, betSelectionController, function0, function02, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetSelectionScreen(Modifier modifier, final BetSelectionController controller, final Function0<Unit> onDismiss, Function0<Unit> function0, boolean z, Function2<? super Integer, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        boolean z2;
        int i4;
        Function2<? super Integer, ? super Boolean, Unit> function22;
        Function2<? super Integer, ? super Boolean, Unit> function23;
        Modifier modifier3;
        Function0<Unit> function03;
        boolean z3;
        boolean z4;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        final Modifier modifier4;
        final Function0<Unit> function04;
        final boolean z5;
        int i5;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1434194095);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                function02 = function0;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            function02 = function0;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            function02 = onDismiss;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            modifier3 = companion;
                            function03 = function02;
                            z3 = z2;
                            function23 = null;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1434194095, i3, -1, "org.betup.ui.dialogs.compose.BetSelectionScreen (BetSelectionScreen.kt:41)");
                            }
                            final State collectAsState = SnapshotStateKt.collectAsState(controller.getSelectedMatch(), null, startRestartGroup, 0, 1);
                            final State collectAsState2 = SnapshotStateKt.collectAsState(controller.getBattleInfo(), null, startRestartGroup, 0, 1);
                            final BattleBetSelectionState battleBetSelectionState = controller.get_betSelectionState();
                            startRestartGroup.startReplaceGroup(5004770);
                            z4 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit BetSelectionScreen$lambda$3$lambda$2;
                                        BetSelectionScreen$lambda$3$lambda$2 = BetSelectionScreenKt.BetSelectionScreen$lambda$3$lambda$2(Function0.this);
                                        return BetSelectionScreen$lambda$3$lambda$2;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(modifier3, false, null, null, (Function0) rememberedValue, 7, null);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), BattleFlowDimens.INSTANCE.m13174getScreenPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13176getScreenPaddingVBetD9Ej5fM());
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
                            int i8 = i3 >> 3;
                            TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, function03, null, false, z3, true, startRestartGroup, (i8 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i8 & 112) | 1597440 | ((i3 << 3) & 458752), 8);
                            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13193getTopSpacerMinBetD9Ej5fM(), BattleFlowDimens.INSTANCE.m13191getTopSpacerMaxBetD9Ej5fM()), startRestartGroup, 6);
                            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2094725669, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$BetSelectionScreen$2$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2094725669, i9, -1, "org.betup.ui.dialogs.compose.BetSelectionScreen.<anonymous>.<anonymous>.<anonymous> (BetSelectionScreen.kt:76)");
                                    }
                                    BattleBetSelectionState battleBetSelectionState2 = BattleBetSelectionState.this;
                                    QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(battleBetSelectionState2 != null ? battleBetSelectionState2.getTitleIdP() : R.string.battle, composer3, 0), null, null, false, false, false, true, composer3, 12582912, 125);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54);
                            final Modifier modifier5 = modifier3;
                            final Function2<? super Integer, ? super Boolean, Unit> function24 = function23;
                            composer2 = startRestartGroup;
                            TicketDarkKt.TicketDark(wrapContentSize$default, rememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(-997407780, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$BetSelectionScreen$2$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    BattleUserUi BetSelectionScreen$lambda$1;
                                    BattleUserUi BetSelectionScreen$lambda$12;
                                    NewMatchItemModel BetSelectionScreen$lambda$0;
                                    BattleUserUi BetSelectionScreen$lambda$13;
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-997407780, i9, -1, "org.betup.ui.dialogs.compose.BetSelectionScreen.<anonymous>.<anonymous>.<anonymous> (BetSelectionScreen.kt:145)");
                                    }
                                    Unit unit = null;
                                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null);
                                    Modifier modifier6 = Modifier.this;
                                    BetSelectionController betSelectionController = controller;
                                    Function2<Integer, Boolean, Unit> function25 = function24;
                                    State<BattleUserUi> state = collectAsState2;
                                    State<NewMatchItemModel> state2 = collectAsState;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, fillMaxHeight$default);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                                    Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    BetSelectionScreen$lambda$1 = BetSelectionScreenKt.BetSelectionScreen$lambda$1(state);
                                    Log.d("BetSelectionScreen", "Battle info: " + BetSelectionScreen$lambda$1);
                                    BetSelectionScreen$lambda$12 = BetSelectionScreenKt.BetSelectionScreen$lambda$1(state);
                                    Modifier align = boxScopeInstance2.align(PaddingKt.m1520paddingqDBjuR0$default(modifier6, 0.0f, 0.0f, 0.0f, BetSelectionScreen$lambda$12 == null ? Dp.m7774constructorimpl(0) : BattleFlowDimens.INSTANCE.m13152getBetInfoBottomInsetD9Ej5fM(), 7, null), Alignment.INSTANCE.getTopCenter());
                                    BetSelectionScreen$lambda$0 = BetSelectionScreenKt.BetSelectionScreen$lambda$0(state2);
                                    OddType oddType = betSelectionController.getUserService().getOddType();
                                    Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
                                    BetGroupsStepKt.BetGroupsStep(BetSelectionScreen$lambda$0, betSelectionController, oddType, align, function25, composer3, 0, 0);
                                    BetSelectionScreen$lambda$13 = BetSelectionScreenKt.BetSelectionScreen$lambda$1(state);
                                    composer3.startReplaceGroup(-597299027);
                                    if (BetSelectionScreen$lambda$13 != null) {
                                        Log.d("BetSelectionScreen", "Displaying battle info: name=" + BetSelectionScreen$lambda$13.getName() + ", amount=" + BetSelectionScreen$lambda$13.getAmount() + ", profileImg=" + BetSelectionScreen$lambda$13.getProfileImg());
                                        Modifier align2 = boxScopeInstance2.align(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13151getBetInfoBarHeightD9Ej5fM()), Alignment.INSTANCE.getBottomCenter());
                                        Long longOrNull = StringsKt.toLongOrNull(BetSelectionScreen$lambda$13.getAmount());
                                        BattleMatchDetItemKt.BattleMatchDetItem(align2, new BattleUiItem(0L, longOrNull != null ? longOrNull.longValue() : 0L, 0L, 0L, ChallengeState.PENDING.INSTANCE, new BattleCreator(0L, BetSelectionScreen$lambda$13.getName(), "", BetSelectionScreen$lambda$13.getProfileImg()), null, false, 0, 448, null), null, null, false, false, composer3, 28032, 32);
                                        unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceGroup();
                                    if (unit == null) {
                                        Log.d("BetSelectionScreen", "No battle info to display");
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(99910109, true, new BetSelectionScreenKt$BetSelectionScreen$2$1$3(controller, battleBetSelectionState), startRestartGroup, 54), false, false, null, false, startRestartGroup, 224694, 192);
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
                            modifier4 = modifier3;
                            function04 = function03;
                            z5 = z3;
                        } else {
                            function23 = function2;
                            modifier3 = companion;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        function23 = function2;
                        modifier3 = modifier2;
                    }
                    function03 = function02;
                    z3 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final State<NewMatchItemModel> collectAsState3 = SnapshotStateKt.collectAsState(controller.getSelectedMatch(), null, startRestartGroup, 0, 1);
                    final State<BattleUserUi> collectAsState22 = SnapshotStateKt.collectAsState(controller.getBattleInfo(), null, startRestartGroup, 0, 1);
                    final BattleBetSelectionState battleBetSelectionState2 = controller.get_betSelectionState();
                    startRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit BetSelectionScreen$lambda$3$lambda$2;
                            BetSelectionScreen$lambda$3$lambda$2 = BetSelectionScreenKt.BetSelectionScreen$lambda$3$lambda$2(Function0.this);
                            return BetSelectionScreen$lambda$3$lambda$2;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(modifier3, false, null, null, (Function0) rememberedValue, 7, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
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
                    Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), BattleFlowDimens.INSTANCE.m13174getScreenPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13176getScreenPaddingVBetD9Ej5fM());
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
                    int i82 = i3 >> 3;
                    TopActionButtonsKt.TopActionButtons(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, function03, null, false, z3, true, startRestartGroup, (i82 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i82 & 112) | 1597440 | ((i3 << 3) & 458752), 8);
                    SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13193getTopSpacerMinBetD9Ej5fM(), BattleFlowDimens.INSTANCE.m13191getTopSpacerMaxBetD9Ej5fM()), startRestartGroup, 6);
                    Modifier wrapContentSize$default2 = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                    ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-2094725669, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$BetSelectionScreen$2$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2094725669, i9, -1, "org.betup.ui.dialogs.compose.BetSelectionScreen.<anonymous>.<anonymous>.<anonymous> (BetSelectionScreen.kt:76)");
                            }
                            BattleBetSelectionState battleBetSelectionState22 = BattleBetSelectionState.this;
                            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(battleBetSelectionState22 != null ? battleBetSelectionState22.getTitleIdP() : R.string.battle, composer3, 0), null, null, false, false, false, true, composer3, 12582912, 125);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54);
                    final Modifier modifier52 = modifier3;
                    final Function2<? super Integer, ? super Boolean, Unit> function242 = function23;
                    composer2 = startRestartGroup;
                    TicketDarkKt.TicketDark(wrapContentSize$default2, rememberComposableLambda2, ComposableLambdaKt.rememberComposableLambda(-997407780, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$BetSelectionScreen$2$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i9) {
                            BattleUserUi BetSelectionScreen$lambda$1;
                            BattleUserUi BetSelectionScreen$lambda$12;
                            NewMatchItemModel BetSelectionScreen$lambda$0;
                            BattleUserUi BetSelectionScreen$lambda$13;
                            if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-997407780, i9, -1, "org.betup.ui.dialogs.compose.BetSelectionScreen.<anonymous>.<anonymous>.<anonymous> (BetSelectionScreen.kt:145)");
                            }
                            Unit unit = null;
                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null);
                            Modifier modifier6 = Modifier.this;
                            BetSelectionController betSelectionController = controller;
                            Function2<Integer, Boolean, Unit> function25 = function242;
                            State<BattleUserUi> state = collectAsState22;
                            State<NewMatchItemModel> state2 = collectAsState3;
                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, fillMaxHeight$default);
                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor32);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            BetSelectionScreen$lambda$1 = BetSelectionScreenKt.BetSelectionScreen$lambda$1(state);
                            Log.d("BetSelectionScreen", "Battle info: " + BetSelectionScreen$lambda$1);
                            BetSelectionScreen$lambda$12 = BetSelectionScreenKt.BetSelectionScreen$lambda$1(state);
                            Modifier align = boxScopeInstance22.align(PaddingKt.m1520paddingqDBjuR0$default(modifier6, 0.0f, 0.0f, 0.0f, BetSelectionScreen$lambda$12 == null ? Dp.m7774constructorimpl(0) : BattleFlowDimens.INSTANCE.m13152getBetInfoBottomInsetD9Ej5fM(), 7, null), Alignment.INSTANCE.getTopCenter());
                            BetSelectionScreen$lambda$0 = BetSelectionScreenKt.BetSelectionScreen$lambda$0(state2);
                            OddType oddType = betSelectionController.getUserService().getOddType();
                            Intrinsics.checkNotNullExpressionValue(oddType, "getOddType(...)");
                            BetGroupsStepKt.BetGroupsStep(BetSelectionScreen$lambda$0, betSelectionController, oddType, align, function25, composer3, 0, 0);
                            BetSelectionScreen$lambda$13 = BetSelectionScreenKt.BetSelectionScreen$lambda$1(state);
                            composer3.startReplaceGroup(-597299027);
                            if (BetSelectionScreen$lambda$13 != null) {
                                Log.d("BetSelectionScreen", "Displaying battle info: name=" + BetSelectionScreen$lambda$13.getName() + ", amount=" + BetSelectionScreen$lambda$13.getAmount() + ", profileImg=" + BetSelectionScreen$lambda$13.getProfileImg());
                                Modifier align2 = boxScopeInstance22.align(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13151getBetInfoBarHeightD9Ej5fM()), Alignment.INSTANCE.getBottomCenter());
                                Long longOrNull = StringsKt.toLongOrNull(BetSelectionScreen$lambda$13.getAmount());
                                BattleMatchDetItemKt.BattleMatchDetItem(align2, new BattleUiItem(0L, longOrNull != null ? longOrNull.longValue() : 0L, 0L, 0L, ChallengeState.PENDING.INSTANCE, new BattleCreator(0L, BetSelectionScreen$lambda$13.getName(), "", BetSelectionScreen$lambda$13.getProfileImg()), null, false, 0, 448, null), null, null, false, false, composer3, 28032, 32);
                                unit = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                            if (unit == null) {
                                Log.d("BetSelectionScreen", "No battle info to display");
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(99910109, true, new BetSelectionScreenKt$BetSelectionScreen$2$1$3(controller, battleBetSelectionState2), startRestartGroup, 54), false, false, null, false, startRestartGroup, 224694, 192);
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
                    }
                    modifier4 = modifier3;
                    function04 = function03;
                    z5 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = startRestartGroup;
                    function04 = function02;
                    z5 = z2;
                    function23 = function22;
                }
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final Function2<? super Integer, ? super Boolean, Unit> function25 = function23;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.BetSelectionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BetSelectionScreen$lambda$6;
                            BetSelectionScreen$lambda$6 = BetSelectionScreenKt.BetSelectionScreen$lambda$6(Modifier.this, controller, onDismiss, function04, z5, function25, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BetSelectionScreen$lambda$6;
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if ((74899 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
        }
        z2 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((74899 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSelectionScreen$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewMatchItemModel BetSelectionScreen$lambda$0(State<NewMatchItemModel> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BattleUserUi BetSelectionScreen$lambda$1(State<BattleUserUi> state) {
        return state.getValue();
    }
}
