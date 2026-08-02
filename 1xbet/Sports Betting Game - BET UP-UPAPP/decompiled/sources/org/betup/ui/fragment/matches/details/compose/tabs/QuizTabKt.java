package org.betup.ui.fragment.matches.details.compose.tabs;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.details.MatchDetailsQuizAvailabilityModel;
import org.betup.model.remote.entity.matches.details.QuizModel;
import org.betup.model.remote.entity.matches.details.QuizParticipationModel;
import org.betup.model.remote.entity.matches.details.QuizTierModel;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizParticipationResultScreenKt;
import org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizQuestionsScreenKt;
import org.betup.ui.fragment.matches.details.compose.tabs.quiz.QuizSelectionState;
import org.betup.ui.views.ComposeUtils;

/* compiled from: QuizTab.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"QuizTabContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/matches/details/MatchDetailsController;Landroidx/compose/runtime/Composer;II)V", "QuizNotAvailableScreen", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "isLoading", "", "quizAvailability", "Lorg/betup/model/remote/entity/matches/details/MatchDetailsQuizAvailabilityModel;", "quizParticipationDetails", "Lorg/betup/model/remote/entity/matches/details/QuizParticipationModel;", "isParticipationLoading", "quizDetails", "Lorg/betup/model/remote/entity/matches/details/QuizModel;", "isQuizDetailsLoading", "quizTiers", "", "Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "selectionState", "Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/QuizSelectionState;", "isPlacingQuiz"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuizTabKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizNotAvailableScreen$lambda$23(int i, Composer composer, int i2) {
        QuizNotAvailableScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizTabContent$lambda$21(Modifier modifier, MatchDetailsController matchDetailsController, int i, int i2, Composer composer, int i3) {
        QuizTabContent(modifier, matchDetailsController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void QuizTabContent(Modifier modifier, MatchDetailsController controller, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        QuizTabKt$QuizTabContent$1$1 quizTabKt$QuizTabContent$1$1;
        final MatchDetailsController matchDetailsController;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(785935034);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(785935034, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.QuizTabContent (QuizTab.kt:37)");
            }
            State collectAsState = SnapshotStateKt.collectAsState(controller.isQuizLoading(), null, startRestartGroup, 0, 1);
            State collectAsState2 = SnapshotStateKt.collectAsState(controller.getQuizAvailability(), null, startRestartGroup, 0, 1);
            State collectAsState3 = SnapshotStateKt.collectAsState(controller.getQuizParticipationDetails(), null, startRestartGroup, 0, 1);
            State collectAsState4 = SnapshotStateKt.collectAsState(controller.isQuizParticipationLoading(), null, startRestartGroup, 0, 1);
            State collectAsState5 = SnapshotStateKt.collectAsState(controller.getQuizDetails(), null, startRestartGroup, 0, 1);
            State collectAsState6 = SnapshotStateKt.collectAsState(controller.isQuizDetailsLoading(), null, startRestartGroup, 0, 1);
            State collectAsState7 = SnapshotStateKt.collectAsState(controller.getQuizTiers(), null, startRestartGroup, 0, 1);
            State collectAsState8 = SnapshotStateKt.collectAsState(controller.getQuizSelectionState(), null, startRestartGroup, 0, 1);
            State collectAsState9 = SnapshotStateKt.collectAsState(controller.isPlacingQuiz(), null, startRestartGroup, 0, 1);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(controller);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                quizTabKt$QuizTabContent$1$1 = new QuizTabKt$QuizTabContent$1$1(controller, null);
                startRestartGroup.updateRememberedValue(quizTabKt$QuizTabContent$1$1);
            } else {
                quizTabKt$QuizTabContent$1$1 = rememberedValue;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) quizTabKt$QuizTabContent$1$1, startRestartGroup, 6);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Modifier modifier5 = modifier4;
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
            if (QuizTabContent$lambda$0(collectAsState) && QuizTabContent$lambda$1(collectAsState2) == null) {
                startRestartGroup.startReplaceGroup(-1882443242);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
                Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 29);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
                matchDetailsController = controller;
                modifier3 = modifier5;
            } else if (QuizTabContent$lambda$1(collectAsState2) != null) {
                startRestartGroup.startReplaceGroup(-1882013520);
                QuizParticipationModel QuizTabContent$lambda$2 = QuizTabContent$lambda$2(collectAsState3);
                if (QuizTabContent$lambda$2 == null) {
                    MatchDetailsQuizAvailabilityModel QuizTabContent$lambda$1 = QuizTabContent$lambda$1(collectAsState2);
                    Intrinsics.checkNotNull(QuizTabContent$lambda$1);
                    QuizTabContent$lambda$2 = QuizTabContent$lambda$1.getParticipation();
                }
                MatchDetailsQuizAvailabilityModel QuizTabContent$lambda$12 = QuizTabContent$lambda$1(collectAsState2);
                Intrinsics.checkNotNull(QuizTabContent$lambda$12);
                boolean z = QuizTabContent$lambda$12.getState() == 1;
                if (QuizTabContent$lambda$3(collectAsState4)) {
                    MatchDetailsQuizAvailabilityModel QuizTabContent$lambda$13 = QuizTabContent$lambda$1(collectAsState2);
                    Intrinsics.checkNotNull(QuizTabContent$lambda$13);
                    if (QuizTabContent$lambda$13.getParticipation() != null) {
                        startRestartGroup.startReplaceGroup(-1881628066);
                        Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
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
                        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 29);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        matchDetailsController = controller;
                        modifier3 = modifier5;
                        startRestartGroup.endReplaceGroup();
                    }
                }
                if (QuizTabContent$lambda$2 != null) {
                    startRestartGroup.startReplaceGroup(-1881152030);
                    QuizParticipationResultScreenKt.QuizParticipationResultScreen(QuizTabContent$lambda$2, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    matchDetailsController = controller;
                    modifier3 = modifier5;
                    startRestartGroup.endReplaceGroup();
                } else {
                    MatchDetailsQuizAvailabilityModel QuizTabContent$lambda$14 = QuizTabContent$lambda$1(collectAsState2);
                    Intrinsics.checkNotNull(QuizTabContent$lambda$14);
                    if (QuizTabContent$lambda$14.getAvailable() && z) {
                        startRestartGroup.startReplaceGroup(-1880783750);
                        if (QuizTabContent$lambda$5(collectAsState6)) {
                            startRestartGroup.startReplaceGroup(-1880708730);
                            Modifier fillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment center3 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default4);
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
                            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 29);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                            matchDetailsController = controller;
                            modifier3 = modifier5;
                        } else if (QuizTabContent$lambda$4(collectAsState5) != null && !QuizTabContent$lambda$6(collectAsState7).isEmpty()) {
                            startRestartGroup.startReplaceGroup(-1880141089);
                            QuizModel QuizTabContent$lambda$4 = QuizTabContent$lambda$4(collectAsState5);
                            Intrinsics.checkNotNull(QuizTabContent$lambda$4);
                            QuizSelectionState QuizTabContent$lambda$7 = QuizTabContent$lambda$7(collectAsState8);
                            List<QuizTierModel> QuizTabContent$lambda$6 = QuizTabContent$lambda$6(collectAsState7);
                            OddType oddType = controller.getOddType();
                            if (oddType == null) {
                                oddType = OddType.DECIMAL;
                            }
                            OddType oddType2 = oddType;
                            startRestartGroup.startReplaceGroup(5004770);
                            matchDetailsController = controller;
                            boolean changedInstance2 = startRestartGroup.changedInstance(matchDetailsController);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function5() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.QuizTabKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function5
                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                        Unit QuizTabContent$lambda$20$lambda$14$lambda$13;
                                        QuizTabContent$lambda$20$lambda$14$lambda$13 = QuizTabKt.QuizTabContent$lambda$20$lambda$14$lambda$13(MatchDetailsController.this, ((Integer) obj).intValue(), ((Long) obj2).longValue(), (String) obj3, ((Float) obj4).floatValue(), (String) obj5);
                                        return QuizTabContent$lambda$20$lambda$14$lambda$13;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            Function5 function5 = (Function5) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changedInstance3 = startRestartGroup.changedInstance(matchDetailsController);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function1() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.QuizTabKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit QuizTabContent$lambda$20$lambda$16$lambda$15;
                                        QuizTabContent$lambda$20$lambda$16$lambda$15 = QuizTabKt.QuizTabContent$lambda$20$lambda$16$lambda$15(MatchDetailsController.this, ((Long) obj).longValue());
                                        return QuizTabContent$lambda$20$lambda$16$lambda$15;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            Function1 function1 = (Function1) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean changedInstance4 = startRestartGroup.changedInstance(matchDetailsController);
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.QuizTabKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit QuizTabContent$lambda$20$lambda$18$lambda$17;
                                        QuizTabContent$lambda$20$lambda$18$lambda$17 = QuizTabKt.QuizTabContent$lambda$20$lambda$18$lambda$17(MatchDetailsController.this);
                                        return QuizTabContent$lambda$20$lambda$18$lambda$17;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceGroup();
                            modifier3 = modifier5;
                            QuizQuestionsScreenKt.QuizQuestionsScreen(QuizTabContent$lambda$4, QuizTabContent$lambda$7, QuizTabContent$lambda$6, oddType2, function5, function1, (Function0) rememberedValue4, QuizTabContent$lambda$8(collectAsState9), startRestartGroup, 0, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            matchDetailsController = controller;
                            modifier3 = modifier5;
                            startRestartGroup.startReplaceGroup(-1878943962);
                            Modifier fillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment center4 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default5);
                            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor5);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                            }
                            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 29);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        matchDetailsController = controller;
                        modifier3 = modifier5;
                        startRestartGroup.startReplaceGroup(-1878426138);
                        QuizNotAvailableScreen(startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                }
            } else {
                matchDetailsController = controller;
                modifier3 = modifier5;
                startRestartGroup.startReplaceGroup(-1878273866);
                QuizNotAvailableScreen(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
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
            matchDetailsController = controller;
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.QuizTabKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuizTabContent$lambda$21;
                    QuizTabContent$lambda$21 = QuizTabKt.QuizTabContent$lambda$21(Modifier.this, matchDetailsController, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return QuizTabContent$lambda$21;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizTabContent$lambda$20$lambda$14$lambda$13(MatchDetailsController matchDetailsController, int i, long j, String betName, float f, String varietyName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(varietyName, "varietyName");
        matchDetailsController.selectQuizAnswer(i, j, betName, f, varietyName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizTabContent$lambda$20$lambda$16$lambda$15(MatchDetailsController matchDetailsController, long j) {
        matchDetailsController.selectQuizTier(j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuizTabContent$lambda$20$lambda$18$lambda$17(MatchDetailsController matchDetailsController) {
        matchDetailsController.placeQuizParticipation();
        return Unit.INSTANCE;
    }

    private static final void QuizNotAvailableScreen(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2080986416);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2080986416, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.QuizNotAvailableScreen (QuizTab.kt:151)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(32));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            composer2 = startRestartGroup;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.quiz_not_available_message, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744412, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.QuizTabKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit QuizNotAvailableScreen$lambda$23;
                    QuizNotAvailableScreen$lambda$23 = QuizTabKt.QuizNotAvailableScreen$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                    return QuizNotAvailableScreen$lambda$23;
                }
            });
        }
    }

    private static final boolean QuizTabContent$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final MatchDetailsQuizAvailabilityModel QuizTabContent$lambda$1(State<MatchDetailsQuizAvailabilityModel> state) {
        return state.getValue();
    }

    private static final QuizParticipationModel QuizTabContent$lambda$2(State<QuizParticipationModel> state) {
        return state.getValue();
    }

    private static final boolean QuizTabContent$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final QuizModel QuizTabContent$lambda$4(State<QuizModel> state) {
        return state.getValue();
    }

    private static final boolean QuizTabContent$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<QuizTierModel> QuizTabContent$lambda$6(State<? extends List<QuizTierModel>> state) {
        return state.getValue();
    }

    private static final QuizSelectionState QuizTabContent$lambda$7(State<QuizSelectionState> state) {
        return state.getValue();
    }

    private static final boolean QuizTabContent$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
