package org.betup.ui.fragment.competitions.details.compose;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.ui.fragment.competitions.details.compose.components.CompetitionDetailsPagerViewKt;
import org.betup.ui.fragment.competitions.details.compose.components.ErrorViewKt;
import org.betup.ui.fragment.competitions.details.compose.components.LoadingViewKt;
import org.betup.ui.fragment.competitions.details.controller.CompetitionDetailsController;

/* compiled from: CompetitionDetailsContent.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\u0016\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010X\u008a\u0084\u0002²\u0006\u0016\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010X\u008a\u0084\u0002"}, d2 = {"CompetitionDetailsContent", "", "controller", "Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;", "onPlaceBetClick", "Lkotlin/Function0;", "(Lorg/betup/ui/fragment/competitions/details/controller/CompetitionDetailsController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release", "competitionDetails", "Lorg/betup/model/remote/entity/competitions/CompetitionDetailsWithParticipantModel;", "isLoading", "", "hasError", "currentMatchIndex", "", "selectedBetsPerMatch", "", "", "expandedStates"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionDetailsContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsContent$lambda$19(CompetitionDetailsController competitionDetailsController, Function0 function0, int i, int i2, Composer composer, int i3) {
        CompetitionDetailsContent(competitionDetailsController, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompetitionDetailsContent(final CompetitionDetailsController controller, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        Function0<Unit> function03;
        State collectAsState;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(-1874709587);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt$$ExternalSyntheticLambda0
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
                    function03 = (Function0) rememberedValue;
                } else {
                    function03 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1874709587, i3, -1, "org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContent (CompetitionDetailsContent.kt:20)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context = (Context) consume;
                State collectAsState2 = SnapshotStateKt.collectAsState(controller.getCompetitionDetails(), null, startRestartGroup, 0, 1);
                collectAsState = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
                State collectAsState3 = SnapshotStateKt.collectAsState(controller.getHasError(), null, startRestartGroup, 0, 1);
                State collectAsState4 = SnapshotStateKt.collectAsState(controller.getCurrentMatchIndex(), null, startRestartGroup, 0, 1);
                State collectAsState5 = SnapshotStateKt.collectAsState(controller.m13658getSelectedBetsPerMatch(), null, startRestartGroup, 0, 1);
                State collectAsState6 = SnapshotStateKt.collectAsState(controller.getExpandedStates(), null, startRestartGroup, 0, 1);
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = i3;
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
                if (!CompetitionDetailsContent$lambda$3(collectAsState)) {
                    startRestartGroup.startReplaceGroup(-1510593170);
                    LoadingViewKt.LoadingView(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (!CompetitionDetailsContent$lambda$4(collectAsState3)) {
                    if (CompetitionDetailsContent$lambda$2(collectAsState2) != null) {
                        startRestartGroup.startReplaceGroup(-1510357043);
                        CompetitionDetailsWithParticipantModel CompetitionDetailsContent$lambda$2 = CompetitionDetailsContent$lambda$2(collectAsState2);
                        Intrinsics.checkNotNull(CompetitionDetailsContent$lambda$2);
                        int CompetitionDetailsContent$lambda$5 = CompetitionDetailsContent$lambda$5(collectAsState4);
                        Map<Long, Long> CompetitionDetailsContent$lambda$6 = CompetitionDetailsContent$lambda$6(collectAsState5);
                        Map<Long, Boolean> CompetitionDetailsContent$lambda$7 = CompetitionDetailsContent$lambda$7(collectAsState6);
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean changedInstance = startRestartGroup.changedInstance(controller);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit CompetitionDetailsContent$lambda$18$lambda$11$lambda$10;
                                    CompetitionDetailsContent$lambda$18$lambda$11$lambda$10 = CompetitionDetailsContentKt.CompetitionDetailsContent$lambda$18$lambda$11$lambda$10(CompetitionDetailsController.this, ((Integer) obj).intValue());
                                    return CompetitionDetailsContent$lambda$18$lambda$11$lambda$10;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        Function1 function1 = (Function1) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean changedInstance2 = startRestartGroup.changedInstance(controller);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function3() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    Unit CompetitionDetailsContent$lambda$18$lambda$13$lambda$12;
                                    CompetitionDetailsContent$lambda$18$lambda$13$lambda$12 = CompetitionDetailsContentKt.CompetitionDetailsContent$lambda$18$lambda$13$lambda$12(CompetitionDetailsController.this, ((Long) obj).longValue(), ((Long) obj2).longValue(), ((Integer) obj3).intValue());
                                    return CompetitionDetailsContent$lambda$18$lambda$13$lambda$12;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        Function3 function3 = (Function3) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        boolean changedInstance3 = startRestartGroup.changedInstance(controller);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit CompetitionDetailsContent$lambda$18$lambda$15$lambda$14;
                                    CompetitionDetailsContent$lambda$18$lambda$15$lambda$14 = CompetitionDetailsContentKt.CompetitionDetailsContent$lambda$18$lambda$15$lambda$14(CompetitionDetailsController.this, ((Long) obj).longValue());
                                    return CompetitionDetailsContent$lambda$18$lambda$15$lambda$14;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        Function1 function12 = (Function1) rememberedValue4;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        boolean changedInstance4 = startRestartGroup.changedInstance(controller) | startRestartGroup.changedInstance(context);
                        Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit CompetitionDetailsContent$lambda$18$lambda$17$lambda$16;
                                    CompetitionDetailsContent$lambda$18$lambda$17$lambda$16 = CompetitionDetailsContentKt.CompetitionDetailsContent$lambda$18$lambda$17$lambda$16(CompetitionDetailsController.this, context);
                                    return CompetitionDetailsContent$lambda$18$lambda$17$lambda$16;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        CompetitionDetailsPagerViewKt.CompetitionDetailsPagerView(CompetitionDetailsContent$lambda$2, CompetitionDetailsContent$lambda$5, CompetitionDetailsContent$lambda$6, CompetitionDetailsContent$lambda$7, function1, function3, function12, (Function0) rememberedValue5, function03, controller.areAllMatchesSelected(), controller.getUserService().getOddType(), startRestartGroup, (i5 << 21) & 234881024, 0, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1509349605);
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
                    function02 = function03;
                } else {
                    startRestartGroup.startReplaceGroup(-1510521281);
                    startRestartGroup.startReplaceGroup(5004770);
                    boolean changedInstance5 = startRestartGroup.changedInstance(controller);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CompetitionDetailsContent$lambda$18$lambda$9$lambda$8;
                                CompetitionDetailsContent$lambda$18$lambda$9$lambda$8 = CompetitionDetailsContentKt.CompetitionDetailsContent$lambda$18$lambda$9$lambda$8(CompetitionDetailsController.this);
                                return CompetitionDetailsContent$lambda$18$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    startRestartGroup.endReplaceGroup();
                    ErrorViewKt.ErrorView((Function0) rememberedValue6, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                function02 = function03;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.CompetitionDetailsContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CompetitionDetailsContent$lambda$19;
                        CompetitionDetailsContent$lambda$19 = CompetitionDetailsContentKt.CompetitionDetailsContent$lambda$19(CompetitionDetailsController.this, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CompetitionDetailsContent$lambda$19;
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context2 = (Context) consume2;
        State collectAsState22 = SnapshotStateKt.collectAsState(controller.getCompetitionDetails(), null, startRestartGroup, 0, 1);
        collectAsState = SnapshotStateKt.collectAsState(controller.isLoading(), null, startRestartGroup, 0, 1);
        State collectAsState32 = SnapshotStateKt.collectAsState(controller.getHasError(), null, startRestartGroup, 0, 1);
        State collectAsState42 = SnapshotStateKt.collectAsState(controller.getCurrentMatchIndex(), null, startRestartGroup, 0, 1);
        State collectAsState52 = SnapshotStateKt.collectAsState(controller.m13658getSelectedBetsPerMatch(), null, startRestartGroup, 0, 1);
        State collectAsState62 = SnapshotStateKt.collectAsState(controller.getExpandedStates(), null, startRestartGroup, 0, 1);
        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(12), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        int i52 = i3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        if (!CompetitionDetailsContent$lambda$3(collectAsState)) {
        }
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function02 = function03;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsContent$lambda$18$lambda$9$lambda$8(CompetitionDetailsController competitionDetailsController) {
        competitionDetailsController.loadCompetitionDetails();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsContent$lambda$18$lambda$11$lambda$10(CompetitionDetailsController competitionDetailsController, int i) {
        competitionDetailsController.selectMatchByIndex(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsContent$lambda$18$lambda$13$lambda$12(CompetitionDetailsController competitionDetailsController, long j, long j2, int i) {
        competitionDetailsController.onBetClick(j, j2, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsContent$lambda$18$lambda$15$lambda$14(CompetitionDetailsController competitionDetailsController, long j) {
        competitionDetailsController.onExpandToggle(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompetitionDetailsContent$lambda$18$lambda$17$lambda$16(CompetitionDetailsController competitionDetailsController, Context context) {
        competitionDetailsController.selectRandomBets(context);
        return Unit.INSTANCE;
    }

    private static final CompetitionDetailsWithParticipantModel CompetitionDetailsContent$lambda$2(State<CompetitionDetailsWithParticipantModel> state) {
        return state.getValue();
    }

    private static final boolean CompetitionDetailsContent$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CompetitionDetailsContent$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final int CompetitionDetailsContent$lambda$5(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final Map<Long, Long> CompetitionDetailsContent$lambda$6(State<? extends Map<Long, Long>> state) {
        return state.getValue();
    }

    private static final Map<Long, Boolean> CompetitionDetailsContent$lambda$7(State<? extends Map<Long, Boolean>> state) {
        return state.getValue();
    }
}
