package org.betup.ui.fragment.competitions.details.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel;
import org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel;
import org.betup.model.remote.entity.leagues.NewLeague;
import org.betup.model.remote.entity.sports.NewSport;
import org.betup.model.remote.entity.teams.NewTeam;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: MatchNavigationDots.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001aS\u0010\u0000\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0015"}, d2 = {"MatchNavigationDots", "", "matchCount", "", "currentIndex", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "onDotClick", "Lkotlin/Function1;", "(IILandroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "matches", "", "Lorg/betup/model/remote/entity/competitions/CompetitionMatchWithBetsModel;", "selectedBetsPerMatch", "", "", "(Ljava/util/List;ILjava/util/Map;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MatchNavigationDotsPreview", "(Landroidx/compose/runtime/Composer;I)V", "MatchNavigationDotsFewMatchesPreview", "MatchNavigationDotsSingleMatchPreview", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchNavigationDotsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDots$lambda$10(List list, int i, Map map, LazyListState lazyListState, Function1 function1, int i2, Composer composer, int i3) {
        MatchNavigationDots(list, i, map, lazyListState, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDots$lambda$3(int i, int i2, LazyListState lazyListState, Function1 function1, int i3, Composer composer, int i4) {
        MatchNavigationDots(i, i2, lazyListState, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDotsFewMatchesPreview$lambda$20(int i, Composer composer, int i2) {
        MatchNavigationDotsFewMatchesPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDotsPreview$lambda$15(int i, Composer composer, int i2) {
        MatchNavigationDotsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDotsSingleMatchPreview$lambda$24(int i, Composer composer, int i2) {
        MatchNavigationDotsSingleMatchPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MatchNavigationDots(final int i, final int i2, final LazyListState listState, final Function1<? super Integer, Unit> onDotClick, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(onDotClick, "onDotClick");
        Composer startRestartGroup = composer.startRestartGroup(-740829220);
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(listState) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onDotClick) ? 2048 : 1024;
        }
        if ((i4 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740829220, i4, -1, "org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDots (MatchNavigationDots.kt:36)");
            }
            Integer valueOf = Integer.valueOf(i2);
            startRestartGroup.startReplaceGroup(-1746271574);
            int i5 = i4 & 14;
            int i6 = i4 & 112;
            boolean z = (i5 == 4) | (i6 == 32) | ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
            MatchNavigationDotsKt$MatchNavigationDots$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MatchNavigationDotsKt$MatchNavigationDots$1$1(i, i2, listState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            int i7 = i4 >> 3;
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i7 & 14);
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(16), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceGroup(-1746271574);
            boolean z2 = (i5 == 4) | (i6 == 32) | ((i4 & 7168) == 2048);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MatchNavigationDots$lambda$2$lambda$1;
                        MatchNavigationDots$lambda$2$lambda$1 = MatchNavigationDotsKt.MatchNavigationDots$lambda$2$lambda$1(i, i2, onDotClick, (LazyListScope) obj);
                        return MatchNavigationDots$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyRow(m1520paddingqDBjuR0$default, listState, null, false, center, null, null, false, null, (Function1) rememberedValue2, startRestartGroup, (i7 & 112) | 24582, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchNavigationDots$lambda$3;
                    MatchNavigationDots$lambda$3 = MatchNavigationDotsKt.MatchNavigationDots$lambda$3(i, i2, listState, onDotClick, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchNavigationDots$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDots$lambda$2$lambda$1(int i, int i2, Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.items$default(LazyRow, i, null, null, ComposableLambdaKt.composableLambdaInstance(397832584, true, new MatchNavigationDotsKt$MatchNavigationDots$2$1$1(i2, function1, i)), 6, null);
        return Unit.INSTANCE;
    }

    public static final void MatchNavigationDots(final List<CompetitionMatchWithBetsModel> matches, final int i, final Map<Long, Long> selectedBetsPerMatch, final LazyListState listState, final Function1<? super Integer, Unit> onDotClick, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(matches, "matches");
        Intrinsics.checkNotNullParameter(selectedBetsPerMatch, "selectedBetsPerMatch");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(onDotClick, "onDotClick");
        Composer startRestartGroup = composer.startRestartGroup(1491221047);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(matches) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(selectedBetsPerMatch) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(listState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onDotClick) ? 16384 : 8192;
        }
        int i4 = i3;
        if ((i4 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1491221047, i4, -1, "org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDots (MatchNavigationDots.kt:107)");
            }
            final int size = matches.size();
            Integer valueOf = Integer.valueOf(i);
            startRestartGroup.startReplaceGroup(-1746271574);
            int i5 = i4 & 112;
            boolean changed = startRestartGroup.changed(size) | (i5 == 32) | ((i4 & 7168) == 2048);
            MatchNavigationDotsKt$MatchNavigationDots$4$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MatchNavigationDotsKt$MatchNavigationDots$4$1(size, i, listState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, (i4 >> 3) & 14);
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(16), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean changedInstance = startRestartGroup.changedInstance(matches) | startRestartGroup.changedInstance(selectedBetsPerMatch) | (i5 == 32) | ((57344 & i4) == 16384) | startRestartGroup.changed(size);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MatchNavigationDots$lambda$9$lambda$8;
                        MatchNavigationDots$lambda$9$lambda$8 = MatchNavigationDotsKt.MatchNavigationDots$lambda$9$lambda$8(matches, selectedBetsPerMatch, i, onDotClick, size, (LazyListScope) obj);
                        return MatchNavigationDots$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue2 = function1;
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyRow(m1520paddingqDBjuR0$default, listState, null, false, center, null, null, false, null, (Function1) rememberedValue2, composer2, ((i4 >> 6) & 112) | 24582, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchNavigationDots$lambda$10;
                    MatchNavigationDots$lambda$10 = MatchNavigationDotsKt.MatchNavigationDots$lambda$10(matches, i, selectedBetsPerMatch, listState, onDotClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchNavigationDots$lambda$10;
                }
            });
        }
    }

    public static final void MatchNavigationDotsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1211198054);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1211198054, i, -1, "org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsPreview (MatchNavigationDots.kt:216)");
            }
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            IntRange intRange = new IntRange(1, 10);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(new CompetitionMatchWithBetsModel(new CompetitionMatchInfoModel(((IntIterator) it).nextInt(), new NewLeague(104138, "", "League"), new NewTeam(789968, "", "Team B"), new NewTeam(789960, "", "Team A"), new NewSport(22, "", "Football", null, null, false, 56, null), 0, 0, "2025-09-19T06:00:00.000+00:00", 1, null, null, null, null, 7776, null), null, CollectionsKt.emptyList(), 2, null));
            }
            ArrayList arrayList2 = arrayList;
            Map mapOf = MapsKt.mapOf(TuplesKt.to(3L, 1001L), TuplesKt.to(5L, 1002L), TuplesKt.to(7L, 1003L));
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
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MatchNavigationDotsPreview$lambda$14$lambda$13$lambda$12;
                        MatchNavigationDotsPreview$lambda$14$lambda$13$lambda$12 = MatchNavigationDotsKt.MatchNavigationDotsPreview$lambda$14$lambda$13$lambda$12(((Integer) obj).intValue());
                        return MatchNavigationDotsPreview$lambda$14$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            MatchNavigationDots(arrayList2, 2, mapOf, rememberLazyListStateWithoutSavedState, (Function1) rememberedValue, startRestartGroup, 25008);
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
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchNavigationDotsPreview$lambda$15;
                    MatchNavigationDotsPreview$lambda$15 = MatchNavigationDotsKt.MatchNavigationDotsPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchNavigationDotsPreview$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDotsPreview$lambda$14$lambda$13$lambda$12(int i) {
        return Unit.INSTANCE;
    }

    public static final void MatchNavigationDotsFewMatchesPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(818577195);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(818577195, i, -1, "org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsFewMatchesPreview (MatchNavigationDots.kt:267)");
            }
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            IntRange intRange = new IntRange(1, 3);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(new CompetitionMatchWithBetsModel(new CompetitionMatchInfoModel(((IntIterator) it).nextInt(), new NewLeague(104138, "", "League"), new NewTeam(789968, "", "Team B"), new NewTeam(789960, "", "Team A"), new NewSport(22, "", "Football", null, null, false, 56, null), 0, 0, "2025-09-19T06:00:00.000+00:00", 1, null, null, null, null, 7776, null), null, CollectionsKt.emptyList(), 2, null));
            }
            ArrayList arrayList2 = arrayList;
            Map mapOf = MapsKt.mapOf(TuplesKt.to(1L, 1001L), TuplesKt.to(2L, 1002L));
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
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MatchNavigationDotsFewMatchesPreview$lambda$19$lambda$18$lambda$17;
                        MatchNavigationDotsFewMatchesPreview$lambda$19$lambda$18$lambda$17 = MatchNavigationDotsKt.MatchNavigationDotsFewMatchesPreview$lambda$19$lambda$18$lambda$17(((Integer) obj).intValue());
                        return MatchNavigationDotsFewMatchesPreview$lambda$19$lambda$18$lambda$17;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            MatchNavigationDots(arrayList2, 0, mapOf, rememberLazyListStateWithoutSavedState, (Function1) rememberedValue, startRestartGroup, 25008);
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
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchNavigationDotsFewMatchesPreview$lambda$20;
                    MatchNavigationDotsFewMatchesPreview$lambda$20 = MatchNavigationDotsKt.MatchNavigationDotsFewMatchesPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchNavigationDotsFewMatchesPreview$lambda$20;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDotsFewMatchesPreview$lambda$19$lambda$18$lambda$17(int i) {
        return Unit.INSTANCE;
    }

    public static final void MatchNavigationDotsSingleMatchPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-745825837);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-745825837, i, -1, "org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsSingleMatchPreview (MatchNavigationDots.kt:318)");
            }
            LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            List listOf = CollectionsKt.listOf(new CompetitionMatchWithBetsModel(new CompetitionMatchInfoModel(1L, new NewLeague(104138, "", "League"), new NewTeam(789968, "", "Team B"), new NewTeam(789960, "", "Team A"), new NewSport(22, "", "Football", null, null, false, 56, null), 0, 0, "2025-09-19T06:00:00.000+00:00", 1, null, null, null, null, 7776, null), null, CollectionsKt.emptyList(), 2, null));
            Map mapOf = MapsKt.mapOf(TuplesKt.to(1L, 1001L));
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
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit MatchNavigationDotsSingleMatchPreview$lambda$23$lambda$22$lambda$21;
                        MatchNavigationDotsSingleMatchPreview$lambda$23$lambda$22$lambda$21 = MatchNavigationDotsKt.MatchNavigationDotsSingleMatchPreview$lambda$23$lambda$22$lambda$21(((Integer) obj).intValue());
                        return MatchNavigationDotsSingleMatchPreview$lambda$23$lambda$22$lambda$21;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            MatchNavigationDots(listOf, 0, mapOf, rememberLazyListStateWithoutSavedState, (Function1) rememberedValue, startRestartGroup, 25008);
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
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchNavigationDotsSingleMatchPreview$lambda$24;
                    MatchNavigationDotsSingleMatchPreview$lambda$24 = MatchNavigationDotsKt.MatchNavigationDotsSingleMatchPreview$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchNavigationDotsSingleMatchPreview$lambda$24;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDotsSingleMatchPreview$lambda$23$lambda$22$lambda$21(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchNavigationDots$lambda$9$lambda$8(final List list, final Map map, final int i, final Function1 function1, final int i2, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$MatchNavigationDots$lambda$9$lambda$8$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i3) {
                list.get(i3);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$MatchNavigationDots$lambda$9$lambda$8$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, final int i3, Composer composer, int i4) {
                int i5;
                Brush brush;
                long j;
                Modifier.Companion companion;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i4 & 6) == 0) {
                    i5 = i4 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i5 = i4;
                }
                if ((i4 & 48) == 0) {
                    i5 |= composer.changed(i3) ? 32 : 16;
                }
                if (!composer.shouldExecute((i5 & Opcodes.I2S) != 146, i5 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                CompetitionMatchWithBetsModel competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) list.get(i3);
                composer.startReplaceGroup(-862608961);
                boolean containsKey = map.containsKey(Long.valueOf(competitionMatchWithBetsModel.getMatchInfo().getId()));
                boolean z = i3 == i;
                if (containsKey && z) {
                    brush = Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null);
                } else if (containsKey) {
                    brush = Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor()), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null);
                } else if (z) {
                    brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
                } else {
                    brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGray.INSTANCE.getBrush();
                }
                Brush brush2 = brush;
                if (containsKey) {
                    j = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                } else if (z) {
                    j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                } else {
                    j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                }
                long j2 = j;
                float m7774constructorimpl = Dp.m7774constructorimpl((containsKey && z) ? 2 : 0);
                Brush brush3 = (containsKey && z) ? ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush() : null;
                Modifier background$default = BackgroundKt.background$default(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), brush2, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null);
                if (Dp.m7773compareTo0680j_4(m7774constructorimpl, Dp.m7774constructorimpl(0)) > 0 && brush3 != null) {
                    companion = BorderKt.m1038borderziNgDLE(Modifier.INSTANCE, m7774constructorimpl, brush3, RoundedCornerShapeKt.getCircleShape());
                } else {
                    companion = Modifier.INSTANCE;
                }
                Modifier then = background$default.then(companion);
                composer.startReplaceGroup(-1633490746);
                boolean changed = ((((i5 & 112) ^ 48) > 32 && composer.changed(i3)) || (i5 & 48) == 32) | composer.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.competitions.details.compose.components.MatchNavigationDotsKt$MatchNavigationDots$5$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(Integer.valueOf(i3));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(then, false, null, null, (Function0) rememberedValue, 7, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1059clickableXHw0xAI$default);
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
                TextKt.m3621Text4IGK_g(String.valueOf(i3 + 1), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j2, TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.startReplaceGroup(-443373728);
                if (i3 < i2 - 1) {
                    SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer, 6);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
