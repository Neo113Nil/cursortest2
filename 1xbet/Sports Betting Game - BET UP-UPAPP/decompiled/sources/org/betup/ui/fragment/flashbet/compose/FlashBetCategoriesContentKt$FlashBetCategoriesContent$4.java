package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.fragment.flashbet.controller.FlashBetCategoriesState;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetCategoriesContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FlashBetCategoriesContentKt$FlashBetCategoriesContent$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ State<FlashBetCategoriesState> $categoriesState$delegate;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ List<FlashBetLeagueCardItem> $items;
    final /* synthetic */ Function1<FlashBetLeagueCardItem, Unit> $onCategoryClick;
    final /* synthetic */ Function0<Unit> $onClickBack;
    final /* synthetic */ Function0<Unit> $playClick;

    /* JADX WARN: Multi-variable type inference failed */
    FlashBetCategoriesContentKt$FlashBetCategoriesContent$4(List<FlashBetLeagueCardItem> list, boolean z, Function0<Unit> function0, Function1<? super FlashBetLeagueCardItem, Unit> function1, Function0<Unit> function02, State<? extends FlashBetCategoriesState> state) {
        this.$items = list;
        this.$isLoading = z;
        this.$playClick = function0;
        this.$onCategoryClick = function1;
        this.$onClickBack = function02;
        this.$categoriesState$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$2$lambda$1$lambda$0(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8(List list, final Function0 function0, final Function1 function1, LazyListScope LazyColumn) {
        FlashBetLeagueCardItem copy;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<FlashBetLeagueCardItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (final FlashBetLeagueCardItem flashBetLeagueCardItem : list2) {
            copy = flashBetLeagueCardItem.copy((r22 & 1) != 0 ? flashBetLeagueCardItem.id : null, (r22 & 2) != 0 ? flashBetLeagueCardItem.title : null, (r22 & 4) != 0 ? flashBetLeagueCardItem.season : null, (r22 & 8) != 0 ? flashBetLeagueCardItem.photoUrl : null, (r22 & 16) != 0 ? flashBetLeagueCardItem.leagueLogoUrl : null, (r22 & 32) != 0 ? flashBetLeagueCardItem.entryFee : 0L, (r22 & 64) != 0 ? flashBetLeagueCardItem.playedMatches : 0, (r22 & 128) != 0 ? flashBetLeagueCardItem.totalMatches : 0, (r22 & 256) != 0 ? flashBetLeagueCardItem.onClick : new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4;
                    invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4 = FlashBetCategoriesContentKt$FlashBetCategoriesContent$4.invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4(Function0.this, function1, flashBetLeagueCardItem);
                    return invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4;
                }
            });
            arrayList.add(copy);
        }
        final ArrayList arrayList2 = arrayList;
        final Function1 function12 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$10$lambda$9$lambda$8$lambda$6;
                invoke$lambda$10$lambda$9$lambda$8$lambda$6 = FlashBetCategoriesContentKt$FlashBetCategoriesContent$4.invoke$lambda$10$lambda$9$lambda$8$lambda$6((FlashBetLeagueCardItem) obj);
                return invoke$lambda$10$lambda$9$lambda$8$lambda$6;
            }
        };
        final FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 flashBetCategoriesContentKt$FlashBetCategoriesContent$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(FlashBetLeagueCardItem flashBetLeagueCardItem2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((FlashBetLeagueCardItem) obj);
            }
        };
        LazyColumn.items(arrayList2.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$2
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
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
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
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
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
                FlashBetLeagueCardItem flashBetLeagueCardItem2 = (FlashBetLeagueCardItem) arrayList2.get(i);
                composer.startReplaceGroup(1902947444);
                FlashBetLeagueCardItemKt.FlashBetLeagueCard(flashBetLeagueCardItem2, null, composer, 0, 2);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$5$lambda$4(Function0 function0, Function1 function1, FlashBetLeagueCardItem flashBetLeagueCardItem) {
        function0.invoke();
        function1.invoke(flashBetLeagueCardItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$10$lambda$9$lambda$8$lambda$6(FlashBetLeagueCardItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    public final void invoke(Composer composer, int i) {
        FlashBetCategoriesState FlashBetCategoriesContent$lambda$2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-534282816, i, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContent.<anonymous> (FlashBetCategoriesContent.kt:71)");
        }
        final List<FlashBetLeagueCardItem> list = this.$items;
        boolean z = this.$isLoading;
        final Function0<Unit> function0 = this.$playClick;
        final Function1<FlashBetLeagueCardItem, Unit> function1 = this.$onCategoryClick;
        final Function0<Unit> function02 = this.$onClickBack;
        State<FlashBetCategoriesState> state = this.$categoriesState$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, composer, 6);
        Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(24));
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(function0) | composer.changed(function02);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$10$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$10$lambda$2$lambda$1$lambda$0 = FlashBetCategoriesContentKt$FlashBetCategoriesContent$4.invoke$lambda$10$lambda$2$lambda$1$lambda$0(Function0.this, function02);
                    return invoke$lambda$10$lambda$2$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ImageKt.Image(painterResource, "back", ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        FlashBetCategoriesContent$lambda$2 = FlashBetCategoriesContentKt.FlashBetCategoriesContent$lambda$2(state);
        if ((FlashBetCategoriesContent$lambda$2 instanceof FlashBetCategoriesState.Error) && list.isEmpty()) {
            composer.startReplaceGroup(674902482);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.empty_list_view, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 130546);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else if (list.isEmpty() && z) {
            composer.startReplaceGroup(675405054);
            LoadingViewKt.LoadingView(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 6, 2);
            composer.endReplaceGroup();
        } else if (list.isEmpty()) {
            composer.startReplaceGroup(676254764);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(675537548);
            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(12));
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
            composer.startReplaceGroup(-1746271574);
            boolean changedInstance = composer.changedInstance(list) | composer.changed(function0) | composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoriesContentKt$FlashBetCategoriesContent$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$10$lambda$9$lambda$8;
                        invoke$lambda$10$lambda$9$lambda$8 = FlashBetCategoriesContentKt$FlashBetCategoriesContent$4.invoke$lambda$10$lambda$9$lambda$8(list, function0, function1, (LazyListScope) obj);
                        return invoke$lambda$10$lambda$9$lambda$8;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(m1517paddingVpY3zN4, null, null, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue2, composer, 24582, 494);
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
