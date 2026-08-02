package org.betup.ui.dialogs.compose;

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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.TicketDarkKt;
import org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt;

/* compiled from: CompetitionInfoScreen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"CompetitionInfoScreen", "", "jackpot", "", "onDismiss", "Lkotlin/Function0;", "(JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CompetitionInfoScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "CompetitionInfoScreenSmallJackpotPreview", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompetitionInfoScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionInfoScreen$lambda$4(long j, Function0 function0, int i, Composer composer, int i2) {
        CompetitionInfoScreen(j, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionInfoScreenPreview$lambda$7(int i, Composer composer, int i2) {
        CompetitionInfoScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionInfoScreenSmallJackpotPreview$lambda$10(int i, Composer composer, int i2) {
        CompetitionInfoScreenSmallJackpotPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CompetitionInfoScreen(final long j, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(919342857);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(919342857, i2, -1, "org.betup.ui.dialogs.compose.CompetitionInfoScreen (CompetitionInfoScreen.kt:31)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.CompetitionInfoScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CompetitionInfoScreen$lambda$1$lambda$0;
                        CompetitionInfoScreen$lambda$1$lambda$0 = CompetitionInfoScreenKt.CompetitionInfoScreen$lambda$1$lambda$0(Function0.this);
                        return CompetitionInfoScreen$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxSize$default, false, null, null, (Function0) rememberedValue, 7, null);
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
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly, centerHorizontally, startRestartGroup, 54);
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
            TicketDarkKt.TicketDark(SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null), ComposableSingletons$CompetitionInfoScreenKt.INSTANCE.getLambda$1604402269$app_release(), ComposableLambdaKt.rememberComposableLambda(398396, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.compose.CompetitionInfoScreenKt$CompetitionInfoScreen$2$1$1
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
                        ComposerKt.traceEventStart(398396, i4, -1, "org.betup.ui.dialogs.compose.CompetitionInfoScreen.<anonymous>.<anonymous>.<anonymous> (CompetitionInfoScreen.kt:68)");
                    }
                    CompetitionInfoContentKt.CompetitionInfoContent(j, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableSingletons$CompetitionInfoScreenKt.INSTANCE.m13290getLambda$1603605477$app_release(), false, true, null, false, composer2, 224694, 192);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(34)), composer2, 6);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.CompetitionInfoScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionInfoScreen$lambda$4;
                    CompetitionInfoScreen$lambda$4 = CompetitionInfoScreenKt.CompetitionInfoScreen$lambda$4(j, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionInfoScreen$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionInfoScreen$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void CompetitionInfoScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1424104303);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1424104303, i, -1, "org.betup.ui.dialogs.compose.CompetitionInfoScreenPreview (CompetitionInfoScreen.kt:85)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.CompetitionInfoScreenKt$$ExternalSyntheticLambda4
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
            CompetitionInfoScreen(1000000L, (Function0) rememberedValue, startRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.CompetitionInfoScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionInfoScreenPreview$lambda$7;
                    CompetitionInfoScreenPreview$lambda$7 = CompetitionInfoScreenKt.CompetitionInfoScreenPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionInfoScreenPreview$lambda$7;
                }
            });
        }
    }

    public static final void CompetitionInfoScreenSmallJackpotPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1494939746);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1494939746, i, -1, "org.betup.ui.dialogs.compose.CompetitionInfoScreenSmallJackpotPreview (CompetitionInfoScreen.kt:94)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.CompetitionInfoScreenKt$$ExternalSyntheticLambda0
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
            CompetitionInfoScreen(50000L, (Function0) rememberedValue, startRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.CompetitionInfoScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompetitionInfoScreenSmallJackpotPreview$lambda$10;
                    CompetitionInfoScreenSmallJackpotPreview$lambda$10 = CompetitionInfoScreenKt.CompetitionInfoScreenSmallJackpotPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompetitionInfoScreenSmallJackpotPreview$lambda$10;
                }
            });
        }
    }
}
