package org.betup.ui.dialogs.compose.stepsChallenges;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.dialogs.controller.SportsSelectionController;
import org.betup.ui.views.ComposeUtils;

/* compiled from: SportsStep.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a#\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u008a\u0084\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002"}, d2 = {"SportsStep", "", "controller", "Lorg/betup/ui/dialogs/controller/SportsSelectionController;", "(Lorg/betup/ui/dialogs/controller/SportsSelectionController;Landroidx/compose/runtime/Composer;I)V", "NewSportItem", "sport", "Lorg/betup/model/remote/entity/sports/NewSport;", "onClick", "Lkotlin/Function0;", "(Lorg/betup/model/remote/entity/sports/NewSport;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "sports", "", "isLoading", "", "isLoadingMore", "hasMore", "error", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportsStepKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSportItem$lambda$12(NewSport newSport, Function0 function0, int i, Composer composer, int i2) {
        NewSportItem(newSport, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsStep$lambda$8(SportsSelectionController sportsSelectionController, int i, Composer composer, int i2) {
        SportsStep(sportsSelectionController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SportsStep(final SportsSelectionController controller, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(887375843);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(887375843, i2, -1, "org.betup.ui.dialogs.compose.stepsChallenges.SportsStep (SportsStep.kt:30)");
            }
            State collectAsState = SnapshotStateKt.collectAsState(controller.getSports(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState2 = SnapshotStateKt.collectAsState(controller.isLoading(), false, null, startRestartGroup, 48, 2);
            State collectAsState3 = SnapshotStateKt.collectAsState(controller.isLoadingMore(), false, null, startRestartGroup, 48, 2);
            State collectAsState4 = SnapshotStateKt.collectAsState(controller.getHasMore(), false, null, startRestartGroup, 48, 2);
            State collectAsState5 = SnapshotStateKt.collectAsState(controller.getError(), null, null, startRestartGroup, 48, 2);
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            Boolean valueOf = Boolean.valueOf(SportsStep$lambda$3(collectAsState4));
            Boolean valueOf2 = Boolean.valueOf(SportsStep$lambda$2(collectAsState3));
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changed = startRestartGroup.changed(rememberLazyListStateWithoutSavedState) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(collectAsState4) | startRestartGroup.changedInstance(controller);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new SportsStepKt$SportsStep$1$1(rememberLazyListStateWithoutSavedState, controller, collectAsState, collectAsState3, collectAsState4, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(rememberLazyListStateWithoutSavedState, valueOf, valueOf2, (Function2) rememberedValue, startRestartGroup, 0);
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BattleFlowDimens.INSTANCE.m13167getListPaddingD9Ej5fM());
            boolean SportsStep$lambda$1 = SportsStep$lambda$1(collectAsState2);
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(controller);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.SportsStepKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SportsStep$lambda$7$lambda$6;
                        SportsStep$lambda$7$lambda$6 = SportsStepKt.SportsStep$lambda$7$lambda$6(SportsSelectionController.this);
                        return SportsStep$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(m1516padding3ABfNKs, SportsStep$lambda$1, (Function0) rememberedValue2, !SportsStep$lambda$0(collectAsState).isEmpty(), null, ComposableLambdaKt.rememberComposableLambda(-317349909, true, new SportsStepKt$SportsStep$3(rememberLazyListStateWithoutSavedState, collectAsState, controller, collectAsState3, collectAsState5), startRestartGroup, 54), startRestartGroup, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.SportsStepKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SportsStep$lambda$8;
                    SportsStep$lambda$8 = SportsStepKt.SportsStep$lambda$8(SportsSelectionController.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SportsStep$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SportsStep$lambda$7$lambda$6(SportsSelectionController sportsSelectionController) {
        sportsSelectionController.refresh();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewSportItem(final NewSport newSport, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-478967030);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(newSport) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478967030, i2, -1, "org.betup.ui.dialogs.compose.stepsChallenges.NewSportItem (SportsStep.kt:128)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.SportsStepKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit NewSportItem$lambda$10$lambda$9;
                        NewSportItem$lambda$10$lambda$9 = SportsStepKt.NewSportItem$lambda$10$lambda$9(Function0.this);
                        return NewSportItem$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue, 7, null), BattleFlowDimens.INSTANCE.m13165getListItemPaddingHD9Ej5fM(), BattleFlowDimens.INSTANCE.m13166getListItemPaddingVD9Ej5fM());
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(newSport.getPhotoUrl(), StringResources_androidKt.stringResource(R.string.cd_sport_icon, startRestartGroup, 6), SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13163getListIconSizeD9Ej5fM()), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, BattleFlowDimens.INSTANCE.m13164getListIconSpacerD9Ej5fM()), composer2, 6);
            String name = newSport.getName();
            if (name == null) {
                name = "";
            }
            TextKt.m2642Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), BattleFlowDimens.INSTANCE.m13168getListTextSizeXSAIIZE(), FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.compose.stepsChallenges.SportsStepKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewSportItem$lambda$12;
                    NewSportItem$lambda$12 = SportsStepKt.NewSportItem$lambda$12(NewSport.this, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NewSportItem$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewSportItem$lambda$10$lambda$9(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NewSport> SportsStep$lambda$0(State<? extends List<NewSport>> state) {
        return state.getValue();
    }

    private static final boolean SportsStep$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SportsStep$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SportsStep$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SportsStep$lambda$4(State<String> state) {
        return state.getValue();
    }
}
