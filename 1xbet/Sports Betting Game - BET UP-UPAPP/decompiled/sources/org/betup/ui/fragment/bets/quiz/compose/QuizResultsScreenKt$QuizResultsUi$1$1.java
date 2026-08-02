package org.betup.ui.fragment.bets.quiz.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.model.remote.entity.quiz.QuizShortParticipationModel;
import org.betup.model.remote.entity.quiz.QuizStateCountModel;
import org.betup.ui.fragment.bets.quiz.compose.components.QuizFilterDropdownKt;
import org.betup.ui.fragment.bets.quiz.compose.components.QuizResultItemKt;
import org.betup.utils.QuizCountExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: QuizResultsScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class QuizResultsScreenKt$QuizResultsUi$1$1 implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $hasMore;
    final /* synthetic */ boolean $isLoadMore;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function1<Integer, Unit> $onFilterSelected;
    final /* synthetic */ Function1<QuizShortParticipationModel, Unit> $onParticipationClick;
    final /* synthetic */ List<QuizShortParticipationModel> $participations;
    final /* synthetic */ Integer $selectedState;
    final /* synthetic */ List<QuizStateCountModel> $stateCounts;

    /* JADX WARN: Multi-variable type inference failed */
    QuizResultsScreenKt$QuizResultsUi$1$1(LazyListState lazyListState, List<QuizShortParticipationModel> list, Function1<? super QuizShortParticipationModel, Unit> function1, boolean z, boolean z2, Integer num, List<QuizStateCountModel> list2, Function1<? super Integer, Unit> function12) {
        this.$listState = lazyListState;
        this.$participations = list;
        this.$onParticipationClick = function1;
        this.$isLoadMore = z;
        this.$hasMore = z2;
        this.$selectedState = num;
        this.$stateCounts = list2;
        this.$onFilterSelected = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope PullToRefreshBox, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(PullToRefreshBox, "$this$PullToRefreshBox");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1828019946, i, -1, "org.betup.ui.fragment.bets.quiz.compose.QuizResultsUi.<anonymous>.<anonymous> (QuizResultsScreen.kt:124)");
        }
        LazyListState lazyListState = this.$listState;
        final List<QuizShortParticipationModel> list = this.$participations;
        final Function1<QuizShortParticipationModel, Unit> function1 = this.$onParticipationClick;
        final boolean z = this.$isLoadMore;
        final boolean z2 = this.$hasMore;
        Integer num = this.$selectedState;
        List<QuizStateCountModel> list2 = this.$stateCounts;
        Function1<Integer, Unit> function12 = this.$onFilterSelected;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        float f = 12;
        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(64), Dp.m7774constructorimpl(f), 0.0f, 8, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(list) | composer.changed(function1) | composer.changed(z) | composer.changed(z2);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreenKt$QuizResultsUi$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3$lambda$2;
                    invoke$lambda$4$lambda$3$lambda$2 = QuizResultsScreenKt$QuizResultsUi$1$1.invoke$lambda$4$lambda$3$lambda$2(list, z, z2, function1, (LazyListScope) obj);
                    return invoke$lambda$4$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default, lazyListState, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24576, 492);
        QuizFilterDropdownKt.QuizFilterElement(PaddingKt.m1520paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null), StateFlowKt.MutableStateFlow(num), QuizCountExtensionsKt.getCountFromQuizCounts(num, list2), function12, StateFlowKt.MutableStateFlow(list2), composer, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(final List list, boolean z, boolean z2, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreenKt$QuizResultsUi$1$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreenKt$QuizResultsUi$1$1$invoke$lambda$4$lambda$3$lambda$2$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final QuizShortParticipationModel quizShortParticipationModel = (QuizShortParticipationModel) list.get(i);
                composer.startReplaceGroup(-1668972261);
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(function1) | composer.changedInstance(quizShortParticipationModel);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.bets.quiz.compose.QuizResultsScreenKt$QuizResultsUi$1$1$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(quizShortParticipationModel);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                QuizResultItemKt.QuizResultItem(quizShortParticipationModel, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (z && z2) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$QuizResultsScreenKt.INSTANCE.m13503getLambda$354437600$app_release(), 3, null);
        }
        return Unit.INSTANCE;
    }
}
