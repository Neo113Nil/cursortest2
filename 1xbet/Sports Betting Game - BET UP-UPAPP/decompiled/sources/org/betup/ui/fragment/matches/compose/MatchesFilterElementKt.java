package org.betup.ui.fragment.matches.compose;

import android.app.Activity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: MatchesFilterElement.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"MatchesFilterElement", "", "activity", "Landroid/app/Activity;", "filterList", "", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "selectedFilter", "onFilterSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroid/app/Activity;Ljava/util/List;Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "MatchesFilterElementPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "expanded", "", "selected"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchesFilterElementKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchesFilterElement$lambda$15(Activity activity, List list, NewMatchFilter newMatchFilter, Function1 function1, Modifier modifier, int i, Composer composer, int i2) {
        MatchesFilterElement(activity, list, newMatchFilter, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchesFilterElementPreview$lambda$19(int i, Composer composer, int i2) {
        MatchesFilterElementPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MatchesFilterElement(final Activity activity, final List<? extends NewMatchFilter> filterList, final NewMatchFilter selectedFilter, final Function1<? super NewMatchFilter, Unit> onFilterSelected, final Modifier modifier, Composer composer, final int i) {
        int i2;
        TextStyle textStyle;
        TextLayoutResult m7212measurewNUYSr0;
        float m7774constructorimpl;
        final MutableState mutableState;
        Composer composer2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        Intrinsics.checkNotNullParameter(onFilterSelected, "onFilterSelected");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-1893478209);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(filterList) ? 32 : 16;
        }
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i2 |= startRestartGroup.changedInstance(selectedFilter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onFilterSelected) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893478209, i3, -1, "org.betup.ui.fragment.matches.compose.MatchesFilterElement (MatchesFilterElement.kt:44)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            TextMeasurer rememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, startRestartGroup, 0, 1);
            TextStyle textStyle2 = new TextStyle(0L, TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777177, (DefaultConstructorMarker) null);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            startRestartGroup.startReplaceGroup(5004770);
            boolean changed = startRestartGroup.changed(filterList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                List<? extends NewMatchFilter> list = filterList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    TextStyle textStyle3 = textStyle2;
                    m7212measurewNUYSr0 = r16.m7212measurewNUYSr0(((NewMatchFilter) it.next()).getResString(activity), (r24 & 2) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle3, (r24 & 4) != 0 ? TextOverflow.INSTANCE.m7709getClipgIe3tQ8() : 0, (r24 & 8) != 0, (r24 & 16) != 0 ? Integer.MAX_VALUE : 0, (r24 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (r24 & 64) != 0 ? r16.defaultLayoutDirection : null, (r24 & 128) != 0 ? r16.defaultDensity : null, (r24 & 256) != 0 ? rememberTextMeasurer.defaultFontFamilyResolver : null, (r24 & 512) != 0 ? false : false);
                    arrayList.add(Integer.valueOf((int) (m7212measurewNUYSr0.getSize() >> 32)));
                    rememberTextMeasurer = rememberTextMeasurer;
                    textStyle2 = textStyle3;
                }
                textStyle = textStyle2;
                Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
                rememberedValue2 = Integer.valueOf(num != null ? num.intValue() : 0);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                textStyle = textStyle2;
            }
            int intValue = ((Number) rememberedValue2).intValue();
            startRestartGroup.endReplaceGroup();
            float f = 50;
            float m7774constructorimpl2 = Dp.m7774constructorimpl(density.mo1164toDpu2uoSUM(intValue) + Dp.m7774constructorimpl(f));
            final TextStyle textStyle4 = textStyle;
            Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(modifier, Color.INSTANCE.m5203getTransparent0d7_KjU(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025backgroundbw27NRU$default);
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
            Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, m7774constructorimpl2);
            Brush brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush();
            if (MatchesFilterElement$lambda$1(mutableState2)) {
                m7774constructorimpl = Dp.m7774constructorimpl(12);
            } else {
                m7774constructorimpl = Dp.m7774constructorimpl(f);
            }
            Modifier background$default = BackgroundKt.background$default(m1568width3ABfNKs, brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(m7774constructorimpl), 0.0f, 4, null);
            startRestartGroup.startReplaceGroup(5004770);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState2;
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MatchesFilterElement$lambda$14$lambda$7$lambda$6;
                        MatchesFilterElement$lambda$14$lambda$7$lambda$6 = MatchesFilterElementKt.MatchesFilterElement$lambda$14$lambda$7$lambda$6(MutableState.this);
                        return MatchesFilterElement$lambda$14$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                mutableState = mutableState2;
            }
            startRestartGroup.endReplaceGroup();
            Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(background$default, (Function0) rememberedValue3, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 48, 0, 4094);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = startRestartGroup.changedInstance(selectedFilter) | startRestartGroup.changedInstance(filterList) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(activity) | startRestartGroup.changed(textStyle4);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                composer2 = startRestartGroup;
                Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MatchesFilterElement$lambda$14$lambda$13$lambda$12;
                        MatchesFilterElement$lambda$14$lambda$13$lambda$12 = MatchesFilterElementKt.MatchesFilterElement$lambda$14$lambda$13$lambda$12(NewMatchFilter.this, filterList, mutableState, modifier, onFilterSelected, activity, textStyle4, (LazyListScope) obj);
                        return MatchesFilterElement$lambda$14$lambda$13$lambda$12;
                    }
                };
                composer2.updateRememberedValue(function1);
                rememberedValue4 = function1;
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
            LazyDslKt.LazyColumn(clickAnimation, null, null, false, top, null, null, false, null, (Function1) rememberedValue4, composer2, 24576, 494);
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchesFilterElement$lambda$15;
                    MatchesFilterElement$lambda$15 = MatchesFilterElementKt.MatchesFilterElement$lambda$15(activity, filterList, selectedFilter, onFilterSelected, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchesFilterElement$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MatchesFilterElement$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MatchesFilterElement$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchesFilterElement$lambda$14$lambda$7$lambda$6(MutableState mutableState) {
        if (!MatchesFilterElement$lambda$1(mutableState)) {
            MatchesFilterElement$lambda$2(mutableState, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchesFilterElement$lambda$14$lambda$13$lambda$12(final NewMatchFilter newMatchFilter, List list, final MutableState mutableState, final Modifier modifier, final Function1 function1, final Activity activity, final TextStyle textStyle, LazyListScope LazyColumn) {
        List listOf;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (MatchesFilterElement$lambda$1(mutableState)) {
            List listOf2 = CollectionsKt.listOf(newMatchFilter);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual((NewMatchFilter) obj, newMatchFilter)) {
                    arrayList.add(obj);
                }
            }
            listOf = CollectionsKt.plus((Collection) listOf2, (Iterable) arrayList);
        } else {
            listOf = CollectionsKt.listOf(newMatchFilter);
        }
        final List list2 = listOf;
        final MatchesFilterElementKt$MatchesFilterElement$lambda$14$lambda$13$lambda$12$$inlined$items$default$1 matchesFilterElementKt$MatchesFilterElement$lambda$14$lambda$13$lambda$12$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$MatchesFilterElement$lambda$14$lambda$13$lambda$12$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(NewMatchFilter newMatchFilter2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((NewMatchFilter) obj2);
            }
        };
        LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$MatchesFilterElement$lambda$14$lambda$13$lambda$12$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list2.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$MatchesFilterElement$lambda$14$lambda$13$lambda$12$$inlined$items$default$4
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
                long j;
                TextStyle m7263copyp1EtxEg;
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final NewMatchFilter newMatchFilter2 = (NewMatchFilter) list2.get(i);
                composer.startReplaceGroup(1672320719);
                final boolean areEqual = Intrinsics.areEqual(newMatchFilter2, newMatchFilter);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                composer.startReplaceGroup(-1224400529);
                boolean changed = composer.changed(areEqual) | composer.changed(function1) | composer.changedInstance(newMatchFilter2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    final MutableState mutableState2 = mutableState;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$MatchesFilterElement$1$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            boolean MatchesFilterElement$lambda$1;
                            MatchesFilterElement$lambda$1 = MatchesFilterElementKt.MatchesFilterElement$lambda$1(mutableState2);
                            if (!MatchesFilterElement$lambda$1) {
                                MatchesFilterElementKt.MatchesFilterElement$lambda$2(mutableState2, true);
                            } else if (areEqual) {
                                MatchesFilterElementKt.MatchesFilterElement$lambda$2(mutableState2, false);
                            } else {
                                function12.invoke(newMatchFilter2);
                                MatchesFilterElementKt.MatchesFilterElement$lambda$2(mutableState2, false);
                            }
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                Modifier clickAnimation = ClickAnimationModifierKt.clickAnimation(fillMaxWidth$default, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, composer, 0, 0, 4094);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, clickAnimation);
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
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                String resString = newMatchFilter2.getResString(activity);
                TextStyle textStyle2 = textStyle;
                if (areEqual) {
                    j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                } else {
                    j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                }
                m7263copyp1EtxEg = textStyle2.m7263copyp1EtxEg((r48 & 1) != 0 ? textStyle2.spanStyle.m7178getColor0d7_KjU() : j, (r48 & 2) != 0 ? textStyle2.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? textStyle2.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? textStyle2.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? textStyle2.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? textStyle2.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? textStyle2.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? textStyle2.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? textStyle2.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? textStyle2.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? textStyle2.paragraphStyle.getTextAlign() : TextAlign.INSTANCE.m7658getCentere0LSkKk(), (r48 & 65536) != 0 ? textStyle2.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? textStyle2.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? textStyle2.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? textStyle2.platformStyle : null, (r48 & 1048576) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? textStyle2.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? textStyle2.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? textStyle2.paragraphStyle.getTextMotion() : null);
                TextKt.m3621Text4IGK_g(resString, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m7263copyp1EtxEg, composer, 0, 3120, 54782);
                composer.startReplaceGroup(1927421847);
                if (Intrinsics.areEqual(newMatchFilter2, NewMatchFilter.Live.INSTANCE)) {
                    BoxKt.Box(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), Dp.m7774constructorimpl(8)), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), composer, 0);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void MatchesFilterElementPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-963866465);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963866465, i, -1, "org.betup.ui.fragment.matches.compose.MatchesFilterElementPreview (MatchesFilterElement.kt:155)");
            }
            CollectionsKt.listOf((Object[]) new NewMatchFilter[]{NewMatchFilter.All.INSTANCE, NewMatchFilter.Today.INSTANCE, NewMatchFilter.Live.INSTANCE, NewMatchFilter.OneHour.INSTANCE, NewMatchFilter.ThreeHours.INSTANCE});
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(NewMatchFilter.All.INSTANCE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.MatchesFilterElementKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchesFilterElementPreview$lambda$19;
                    MatchesFilterElementPreview$lambda$19 = MatchesFilterElementKt.MatchesFilterElementPreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchesFilterElementPreview$lambda$19;
                }
            });
        }
    }
}
