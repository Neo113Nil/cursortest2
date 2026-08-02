package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.flashbet.controller.FlashBetSportsState;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetContentKt$FlashBetsListContent$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ List<FlashBetCategoryItem> $items;
    final /* synthetic */ Function1<FlashBetCategoryItem, Unit> $onSportClick;
    final /* synthetic */ FlashBetSportsState $sportsState;

    /* JADX WARN: Multi-variable type inference failed */
    FlashBetContentKt$FlashBetsListContent$2(FlashBetSportsState flashBetSportsState, List<FlashBetCategoryItem> list, boolean z, Function1<? super FlashBetCategoryItem, Unit> function1) {
        this.$sportsState = flashBetSportsState;
        this.$items = list;
        this.$isLoading = z;
        this.$onSportClick = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(List list, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<FlashBetCategoryItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final FlashBetCategoryItem flashBetCategoryItem : list2) {
            arrayList.add(FlashBetCategoryItem.copy$default(flashBetCategoryItem, null, null, null, 0, 0, new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetsListContent$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$6$lambda$5$lambda$2$lambda$1;
                    invoke$lambda$6$lambda$5$lambda$2$lambda$1 = FlashBetContentKt$FlashBetsListContent$2.invoke$lambda$6$lambda$5$lambda$2$lambda$1(Function1.this, flashBetCategoryItem);
                    return invoke$lambda$6$lambda$5$lambda$2$lambda$1;
                }
            }, 31, null));
        }
        final ArrayList arrayList2 = arrayList;
        final Function1 function12 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetsListContent$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$6$lambda$5$lambda$3;
                invoke$lambda$6$lambda$5$lambda$3 = FlashBetContentKt$FlashBetsListContent$2.invoke$lambda$6$lambda$5$lambda$3((FlashBetCategoryItem) obj);
                return invoke$lambda$6$lambda$5$lambda$3;
            }
        };
        final FlashBetContentKt$FlashBetsListContent$2$invoke$lambda$6$lambda$5$$inlined$items$default$1 flashBetContentKt$FlashBetsListContent$2$invoke$lambda$6$lambda$5$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetsListContent$2$invoke$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(FlashBetCategoryItem flashBetCategoryItem2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((FlashBetCategoryItem) obj);
            }
        };
        LazyColumn.items(arrayList2.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetsListContent$2$invoke$lambda$6$lambda$5$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(arrayList2.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetsListContent$2$invoke$lambda$6$lambda$5$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(arrayList2.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetsListContent$2$invoke$lambda$6$lambda$5$$inlined$items$default$4
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
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                FlashBetCategoryItem flashBetCategoryItem2 = (FlashBetCategoryItem) arrayList2.get(i);
                composer.startReplaceGroup(911939158);
                FlashBetCategoryItemKt.FlashBetCategoryRow(flashBetCategoryItem2, null, composer, 0, 2);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$2$lambda$1(Function1 function1, FlashBetCategoryItem flashBetCategoryItem) {
        function1.invoke(flashBetCategoryItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$6$lambda$5$lambda$3(FlashBetCategoryItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1225099462, i, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetsListContent.<anonymous> (FlashBetContent.kt:157)");
        }
        if ((this.$sportsState instanceof FlashBetSportsState.Error) && this.$items.isEmpty()) {
            composer.startReplaceGroup(-1693903006);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.empty_list_view, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 130546);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else if (this.$items.isEmpty() && this.$isLoading) {
            composer.startReplaceGroup(-1693400434);
            LoadingViewKt.LoadingView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 6, 2);
            composer.endReplaceGroup();
        } else if (this.$items.isEmpty()) {
            composer.startReplaceGroup(-1692719364);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1693273210);
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
            composer.startReplaceGroup(-1633490746);
            boolean changedInstance = composer.changedInstance(this.$items) | composer.changed(this.$onSportClick);
            final List<FlashBetCategoryItem> list = this.$items;
            final Function1<FlashBetCategoryItem, Unit> function1 = this.$onSportClick;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$FlashBetsListContent$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$6$lambda$5;
                        invoke$lambda$6$lambda$5 = FlashBetContentKt$FlashBetsListContent$2.invoke$lambda$6$lambda$5(list, function1, (LazyListScope) obj);
                        return invoke$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(m1517paddingVpY3zN4, null, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24582, 494);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
