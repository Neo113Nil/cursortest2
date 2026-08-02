package org.betup.ui.dialogs.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import io.bidmachine.media3.extractor.WavUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel;
import org.betup.model.remote.entity.competitions.CompetitionParticipantBetModel;
import org.betup.ui.common.compose.HapticFeedbackEffectKt;
import org.betup.ui.common.compose.HapticFeedbackType;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;
import org.betup.ui.views.ComposeUtils;

/* compiled from: CompetitionPreviewScreen.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, d2 = {"CompetitionPreviewScreen", "", "controller", "Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;", "onDismiss", "Lkotlin/Function0;", "(Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CompetitionPreviewScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "comp", "Lorg/betup/model/remote/entity/competitions/CompetitionDetailsWithParticipantModel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompetitionPreviewScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionPreviewScreen$lambda$6(CompetitionDetailsController competitionDetailsController, Function0 function0, int i, Composer composer, int i2) {
        CompetitionPreviewScreen(competitionDetailsController, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionPreviewScreenPreview$lambda$8(int i, Composer composer, int i2) {
        CompetitionPreviewScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CompetitionPreviewScreen(final CompetitionDetailsController controller, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-985817140);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985817140, i2, -1, "org.betup.ui.dialogs.compose.CompetitionPreviewScreen (CompetitionPreviewScreen.kt:47)");
            }
            final State collectAsState = SnapshotStateKt.collectAsState(controller.getCompetitionDetails(), null, startRestartGroup, 0, 1);
            Boolean isWon = controller.getIsWon();
            Function1<HapticFeedbackType, Unit> rememberHapticFeedback = HapticFeedbackEffectKt.rememberHapticFeedback(startRestartGroup, 0);
            CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$0 = CompetitionPreviewScreen$lambda$0(collectAsState);
            Long valueOf = CompetitionPreviewScreen$lambda$0 != null ? Long.valueOf(CompetitionPreviewScreen$lambda$0.getId()) : null;
            startRestartGroup.startReplaceGroup(-1746271574);
            boolean changed = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(isWon) | startRestartGroup.changed(rememberHapticFeedback);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new CompetitionPreviewScreenKt$CompetitionPreviewScreen$1$1(isWon, rememberHapticFeedback, collectAsState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, isWon, (Function2) rememberedValue, startRestartGroup, 0);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CompetitionPreviewScreen$lambda$3$lambda$2;
                        CompetitionPreviewScreen$lambda$3$lambda$2 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$3$lambda$2(Function0.this);
                        return CompetitionPreviewScreen$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxSize$default, false, null, null, (Function0) rememberedValue2, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
            float f = 32;
            Modifier align = BoxScopeInstance.INSTANCE.align(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 2, null), Alignment.INSTANCE.getCenter());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
            float f2 = 4;
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            TopActionButtonsKt.TopActionButtons(columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), onDismiss, null, null, false, false, false, startRestartGroup, i3 | 24576, 108);
            SpacerKt.Spacer(SizeKt.m1550heightInVpY3zN4(Modifier.INSTANCE, Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f)), startRestartGroup, 6);
            composer2 = startRestartGroup;
            TicketDarkKt.TicketDark(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), ComposableLambdaKt.rememberComposableLambda(1390920224, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$CompetitionPreviewScreen$3$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$02;
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1390920224, i4, -1, "org.betup.ui.dialogs.compose.CompetitionPreviewScreen.<anonymous>.<anonymous>.<anonymous> (CompetitionPreviewScreen.kt:89)");
                    }
                    CompetitionPreviewScreen$lambda$02 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(collectAsState);
                    QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.competition, composer3, 6), CompetitionPreviewScreen$lambda$02 != null ? Long.valueOf(CompetitionPreviewScreen$lambda$02.getId()) : null, null, false, false, false, false, composer3, 0, 249);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-482293313, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$CompetitionPreviewScreen$3$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-482293313, i4, -1, "org.betup.ui.dialogs.compose.CompetitionPreviewScreen.<anonymous>.<anonymous>.<anonymous> (CompetitionPreviewScreen.kt:263)");
                    }
                    CompetitionPreviewContentKt.CompetitionPreviewContent(CompetitionDetailsController.this, null, composer3, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1939460446, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$CompetitionPreviewScreen$3$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$02;
                    CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$03;
                    List<CompetitionMatchWithBetsModel> matches;
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1939460446, i4, -1, "org.betup.ui.dialogs.compose.CompetitionPreviewScreen.<anonymous>.<anonymous>.<anonymous> (CompetitionPreviewScreen.kt:95)");
                    }
                    CompetitionPreviewScreen$lambda$02 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(collectAsState);
                    if (CompetitionPreviewScreen$lambda$02 != null) {
                        float f3 = 12;
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f3), 0.0f, Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(24), 2, null);
                        final State<CompetitionDetailsWithParticipantModel> state = collectAsState;
                        final CompetitionDetailsController competitionDetailsController = controller;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1520paddingqDBjuR0$default);
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
                        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Arrangement.INSTANCE.getSpaceBetween(), Arrangement.INSTANCE.getCenter(), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(1885726376, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$CompetitionPreviewScreen$3$1$3$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer4, Integer num) {
                                invoke(flowRowScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(FlowRowScope FlowRow, Composer composer4, int i5) {
                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$04;
                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$05;
                                List<CompetitionMatchWithBetsModel> matches2;
                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$06;
                                String stringResource;
                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$07;
                                Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                if ((i5 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1885726376, i5, -1, "org.betup.ui.dialogs.compose.CompetitionPreviewScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompetitionPreviewScreen.kt:103)");
                                }
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                State<CompetitionDetailsWithParticipantModel> state2 = state;
                                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, companion);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor4);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer4);
                                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.competition_buy_in, composer4, 6) + ": ", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                CompetitionPreviewScreen$lambda$04 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state2);
                                Intrinsics.checkNotNull(CompetitionPreviewScreen$lambda$04);
                                TextKt.m3621Text4IGK_g(String.valueOf(CompetitionPreviewScreen$lambda$04.getEnterFee()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                float f4 = 4;
                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer4, 6);
                                float f5 = 20;
                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Coin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                composer4.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                CompetitionPreviewScreen$lambda$05 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state);
                                if (CompetitionPreviewScreen$lambda$05 != null && (matches2 = CompetitionPreviewScreen$lambda$05.getMatches()) != null) {
                                    List<CompetitionMatchWithBetsModel> list = matches2;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        Iterator<T> it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            if (((CompetitionMatchWithBetsModel) it.next()).getMatchInfo().getMatchState() == 3) {
                                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                State<CompetitionDetailsWithParticipantModel> state3 = state;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer4, 48);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion2);
                                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor5);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer4);
                                                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                composer4.startReplaceGroup(-1543295965);
                                                CompetitionPreviewScreen$lambda$06 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state3);
                                                Intrinsics.checkNotNull(CompetitionPreviewScreen$lambda$06);
                                                if (CompetitionPreviewScreen$lambda$06.getPrizePool() > 0) {
                                                    CompetitionPreviewScreen$lambda$07 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state3);
                                                    stringResource = " " + (CompetitionPreviewScreen$lambda$07 != null ? Long.valueOf(CompetitionPreviewScreen$lambda$07.getPrizePool()) : null);
                                                } else {
                                                    stringResource = StringResources_androidKt.stringResource(R.string.competition_empty_prize_pool, composer4, 6);
                                                }
                                                composer4.endReplaceGroup();
                                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.competition_prize_pool, composer4, 6) + ":", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                TextKt.m3621Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(16), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer4, 6);
                                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Coin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                            }
                                        }
                                    }
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 1573302, 56);
                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl((float) 4.5d)), composer3, 6);
                        composer3.startReplaceGroup(674772270);
                        CompetitionPreviewScreen$lambda$03 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state);
                        if (CompetitionPreviewScreen$lambda$03 != null && (matches = CompetitionPreviewScreen$lambda$03.getMatches()) != null) {
                            List<CompetitionMatchWithBetsModel> list = matches;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    } else if (((CompetitionMatchWithBetsModel) it.next()).getMatchInfo().getMatchState() == 3) {
                                        FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Arrangement.INSTANCE.getSpaceBetween(), Arrangement.INSTANCE.getCenter(), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(1313945581, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$CompetitionPreviewScreen$3$1$3$1$3
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer4, Integer num) {
                                                invoke(flowRowScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Code restructure failed: missing block: B:69:0x0443, code lost:
                                            
                                                if (r4 >= (r6 != null ? r6.getJackPot() : 0)) goto L75;
                                             */
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final void invoke(FlowRowScope FlowRow, Composer composer4, int i5) {
                                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$04;
                                                Integer num;
                                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$05;
                                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$06;
                                                CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$07;
                                                List<CompetitionMatchWithBetsModel> matches2;
                                                List<CompetitionMatchWithBetsModel> matches3;
                                                Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                                if ((i5 & 17) == 16 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1313945581, i5, -1, "org.betup.ui.dialogs.compose.CompetitionPreviewScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CompetitionPreviewScreen.kt:181)");
                                                }
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                CompetitionDetailsController competitionDetailsController2 = CompetitionDetailsController.this;
                                                State<CompetitionDetailsWithParticipantModel> state2 = state;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer4, companion);
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor4);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m4610constructorimpl4 = Updater.m4610constructorimpl(composer4);
                                                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                Integer num2 = null;
                                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.result, composer4, 6) + ": ", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                CompetitionPreviewScreen$lambda$04 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state2);
                                                if (CompetitionPreviewScreen$lambda$04 == null || (matches3 = CompetitionPreviewScreen$lambda$04.getMatches()) == null) {
                                                    num = null;
                                                } else {
                                                    ArrayList arrayList = new ArrayList();
                                                    for (Object obj : matches3) {
                                                        CompetitionParticipantBetModel competitionParticipantBetModel = (CompetitionParticipantBetModel) CollectionsKt.firstOrNull((List) ((CompetitionMatchWithBetsModel) obj).getBets());
                                                        if (competitionParticipantBetModel != null && competitionParticipantBetModel.getState() == 4) {
                                                            arrayList.add(obj);
                                                        }
                                                    }
                                                    num = Integer.valueOf(arrayList.size());
                                                }
                                                CompetitionPreviewScreen$lambda$05 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state2);
                                                if (CompetitionPreviewScreen$lambda$05 != null && (matches2 = CompetitionPreviewScreen$lambda$05.getMatches()) != null) {
                                                    num2 = Integer.valueOf(matches2.size());
                                                }
                                                String str = num + "/" + num2;
                                                long sp = TextUnitKt.getSp(16);
                                                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6);
                                                FontWeight normal = FontWeight.INSTANCE.getNormal();
                                                Boolean isWon2 = competitionDetailsController2.getIsWon();
                                                boolean z2 = true;
                                                TextKt.m3621Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(Intrinsics.areEqual((Object) isWon2, (Object) true) ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : Intrinsics.areEqual((Object) isWon2, (Object) false) ? ComposeUtils.AppColorPalette.Red.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), sp, normal, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                float f4 = 4;
                                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer4, 6);
                                                float f5 = 20;
                                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Coin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                State<CompetitionDetailsWithParticipantModel> state3 = state;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer4, 48);
                                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer4, companion2);
                                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer4.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer4.startReusableNode();
                                                if (composer4.getInserting()) {
                                                    composer4.createNode(constructor5);
                                                } else {
                                                    composer4.useNode();
                                                }
                                                Composer m4610constructorimpl5 = Updater.m4610constructorimpl(composer4);
                                                Updater.m4617setimpl(m4610constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                }
                                                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.won, composer4, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                CompetitionPreviewScreen$lambda$06 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state3);
                                                long wonPrize = CompetitionPreviewScreen$lambda$06 != null ? CompetitionPreviewScreen$lambda$06.getWonPrize() : 0L;
                                                if (wonPrize > 0) {
                                                    CompetitionPreviewScreen$lambda$07 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(state3);
                                                }
                                                z2 = false;
                                                TextKt.m3621Text4IGK_g(" " + wonPrize, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(z2 ? ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor() : wonPrize > 0 ? ComposeUtils.AppColorPalette.Green.INSTANCE.getColor() : ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), TextUnitKt.getSp(16), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer4, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                                                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), composer4, 6);
                                                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Coin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 1573302, 56);
                                        break;
                                    }
                                }
                            }
                        }
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), false, true, null, false, composer2, 224694, 192);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer2, 6);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f)), composer2, 6);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionPreviewScreen$lambda$6;
                    CompetitionPreviewScreen$lambda$6 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$6(CompetitionDetailsController.this, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionPreviewScreen$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionPreviewScreen$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void CompetitionPreviewScreenPreview(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-51881703);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-51881703, i, -1, "org.betup.ui.dialogs.compose.CompetitionPreviewScreenPreview (CompetitionPreviewScreen.kt:281)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
            composer2 = startRestartGroup;
            androidx.compose.material.TextKt.m2642Text4IGK_g("Preview not available - requires controller", (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131066);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionPreviewScreenPreview$lambda$8;
                    CompetitionPreviewScreenPreview$lambda$8 = CompetitionPreviewScreenKt.CompetitionPreviewScreenPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionPreviewScreenPreview$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$0(State<CompetitionDetailsWithParticipantModel> state) {
        return state.getValue();
    }
}
