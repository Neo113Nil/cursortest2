package org.betup.ui.fragment.home.compose.sections;

import android.graphics.Rect;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.ironsource.X2;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.compose.AutoResizeSiblingFontSizes;
import org.betup.ui.common.compose.AutoResizeSiblingsTextKt;
import org.betup.ui.fragment.home.compose.HomeStatsUiState;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: HomeStatsSection.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aS\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"HomeStatsSection", "", "state", "Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;", "onWinRateClick", "Lkotlin/Function0;", "onGlobalRankClick", "onBestStreakClick", "onWinRateBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onGlobalRankBoundsReported", "onBestStreakBoundsReported", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/home/compose/HomeStatsUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeStatTile", "label", "", "value", "iconRes", "", "onClick", "labelFontSize", "Landroidx/compose/ui/unit/TextUnit;", "valueFontSize", "HomeStatTile-zZioVvc", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;JJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeStatsSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeStatTile_zZioVvc$lambda$7(String str, String str2, int i, Function0 function0, long j, long j2, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        m13833HomeStatTilezZioVvc(str, str2, i, function0, j, j2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeStatsSection$lambda$0(HomeStatsUiState homeStatsUiState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeStatsSection(homeStatsUiState, function0, function02, function03, function1, function12, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeStatsSection$lambda$1(HomeStatsUiState homeStatsUiState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeStatsSection(homeStatsUiState, function0, function02, function03, function1, function12, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeStatsSection$lambda$4(HomeStatsUiState homeStatsUiState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeStatsSection(homeStatsUiState, function0, function02, function03, function1, function12, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeStatsSection(final HomeStatsUiState state, final Function0<Unit> onWinRateClick, final Function0<Unit> onGlobalRankClick, final Function0<Unit> onBestStreakClick, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final Function1<? super Rect, Unit> function14;
        int i5;
        Function1<? super Rect, Unit> function15;
        int i6;
        Composer composer2;
        Modifier modifier2;
        final Function1<? super Rect, Unit> function16;
        final Function1<? super Rect, Unit> function17;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onWinRateClick, "onWinRateClick");
        Intrinsics.checkNotNullParameter(onGlobalRankClick, "onGlobalRankClick");
        Intrinsics.checkNotNullParameter(onBestStreakClick, "onBestStreakClick");
        Composer startRestartGroup = composer.startRestartGroup(-1248406128);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(state) : startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onWinRateClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onGlobalRankClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onBestStreakClick) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                function14 = function12;
                i3 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    function15 = function13;
                    i3 |= startRestartGroup.changedInstance(function15) ? 1048576 : 524288;
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(modifier) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                        Function1<? super Rect, Unit> function18 = i7 == 0 ? null : function1;
                        Function1<? super Rect, Unit> function19 = i4 == 0 ? null : function14;
                        Function1<? super Rect, Unit> function110 = i5 == 0 ? null : function15;
                        Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1248406128, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomeStatsSection (HomeStatsSection.kt:60)");
                        }
                        startRestartGroup.startReplaceGroup(-1422397908);
                        if (!Intrinsics.areEqual(state, HomeStatsUiState.Loading.INSTANCE)) {
                            HomeSectionLoadingPlaceholderKt.m13830HomeSectionLoadingPlaceholderorJrPs(Dp.m7774constructorimpl(56), modifier3, startRestartGroup, ((i3 >> 18) & 112) | 6, 0);
                            startRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final Function1<? super Rect, Unit> function111 = function18;
                                final Function1<? super Rect, Unit> function112 = function19;
                                final Function1<? super Rect, Unit> function113 = function110;
                                final Modifier modifier4 = modifier3;
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStatsSectionKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit HomeStatsSection$lambda$0;
                                        HomeStatsSection$lambda$0 = HomeStatsSectionKt.HomeStatsSection$lambda$0(HomeStatsUiState.this, onWinRateClick, onGlobalRankClick, onBestStreakClick, function111, function112, function113, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return HomeStatsSection$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!(state instanceof HomeStatsUiState.Visible)) {
                            if (!Intrinsics.areEqual(state, HomeStatsUiState.Hidden.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            startRestartGroup.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                            if (endRestartGroup2 != null) {
                                final Function1<? super Rect, Unit> function114 = function18;
                                final Function1<? super Rect, Unit> function115 = function19;
                                final Function1<? super Rect, Unit> function116 = function110;
                                final Modifier modifier5 = modifier3;
                                endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStatsSectionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit HomeStatsSection$lambda$1;
                                        HomeStatsSection$lambda$1 = HomeStatsSectionKt.HomeStatsSection$lambda$1(HomeStatsUiState.this, onWinRateClick, onGlobalRankClick, onBestStreakClick, function114, function115, function116, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return HomeStatsSection$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        startRestartGroup.endReplaceGroup();
                        HomeStatsUiState.Visible visible = (HomeStatsUiState.Visible) state;
                        startRestartGroup.startReplaceGroup(-1422386736);
                        List createListBuilder = CollectionsKt.createListBuilder();
                        createListBuilder.add(new HomeStatTileData(StringResources_androidKt.stringResource(R.string.win_rate, startRestartGroup, 6), visible.getWinRatePercent() + "%", R.drawable.target_img, onWinRateClick, function18));
                        String globalRankLabel = visible.getGlobalRankLabel();
                        startRestartGroup.startReplaceGroup(-1422375402);
                        if (globalRankLabel != null) {
                            createListBuilder.add(new HomeStatTileData(StringResources_androidKt.stringResource(R.string.home_global_rank, startRestartGroup, 6), globalRankLabel, R.drawable.globe_img, onGlobalRankClick, function19));
                        }
                        startRestartGroup.endReplaceGroup();
                        createListBuilder.add(new HomeStatTileData(StringResources_androidKt.stringResource(R.string.best_winning_streak, startRestartGroup, 6), String.valueOf(visible.getBestStreak()), R.drawable.ic_fire, onBestStreakClick, function110));
                        final List build = CollectionsKt.build(createListBuilder);
                        startRestartGroup.endReplaceGroup();
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1698941818, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStatsSectionKt$HomeStatsSection$3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                invoke(boxWithConstraintsScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i8) {
                                float m12901statTileTextAreaWidthPxFb0jozE;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                int i9 = (i8 & 6) == 0 ? i8 | (composer3.changed(BoxWithConstraints) ? 4 : 2) : i8;
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1698941818, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeStatsSection.<anonymous> (HomeStatsSection.kt:104)");
                                }
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume;
                                m12901statTileTextAreaWidthPxFb0jozE = AutoResizeSiblingsTextKt.m12901statTileTextAreaWidthPxFb0jozE(density.mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM()), build.size(), density, (r16 & 8) != 0 ? Dp.m7774constructorimpl(8) : 0.0f, (r16 & 16) != 0 ? Dp.m7774constructorimpl(8) : 0.0f, (r16 & 32) != 0 ? Dp.m7774constructorimpl(32) : 0.0f, (r16 & 64) != 0 ? Dp.m7774constructorimpl(8) : 0.0f);
                                List<HomeStatTileData> list = build;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((HomeStatTileData) it.next()).getLabel());
                                }
                                ArrayList arrayList2 = arrayList;
                                List<HomeStatTileData> list2 = build;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((HomeStatTileData) it2.next()).getValue());
                                }
                                AutoResizeSiblingFontSizes m12899CalculateAutoResizeSiblingLabelValueFontSizes9WM6Nnc = AutoResizeSiblingsTextKt.m12899CalculateAutoResizeSiblingLabelValueFontSizes9WM6Nnc(arrayList2, arrayList3, m12901statTileTextAreaWidthPxFb0jozE, TextUnitKt.getSp(10), TextUnitKt.getSp(7), TextUnitKt.getSp(15), TextUnitKt.getSp(9), 0, true, null, null, composer3, 102460416, 0, 1664);
                                Object obj = null;
                                Modifier height = IntrinsicKt.height(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), IntrinsicSize.Max);
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                                List<HomeStatTileData> list3 = build;
                                Composer composer4 = composer3;
                                ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer4, 6);
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int i10 = 0;
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, height);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4610constructorimpl = Updater.m4610constructorimpl(composer3);
                                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                composer4.startReplaceGroup(-1211669566);
                                for (HomeStatTileData homeStatTileData : list3) {
                                    HomeStatsSectionKt.m13833HomeStatTilezZioVvc(homeStatTileData.getLabel(), homeStatTileData.getValue(), homeStatTileData.getIconRes(), homeStatTileData.getOnClick(), m12899CalculateAutoResizeSiblingLabelValueFontSizes9WM6Nnc.m12896getLabelFontSizeXSAIIZE(), m12899CalculateAutoResizeSiblingLabelValueFontSizes9WM6Nnc.m12897getValueFontSizeXSAIIZE(), HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, obj), homeStatTileData.getOnBoundsReported(), composer4, i10), composer3, 0, 0);
                                    composer4 = composer3;
                                    i10 = i10;
                                    obj = obj;
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54);
                        Modifier modifier6 = modifier3;
                        composer2 = startRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(fillMaxWidth$default, null, false, rememberComposableLambda, composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier6;
                        function16 = function18;
                        function14 = function19;
                        function17 = function110;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function16 = function1;
                        function17 = function15;
                        composer2 = startRestartGroup;
                        modifier2 = modifier;
                    }
                    ScopeUpdateScope endRestartGroup3 = composer2.endRestartGroup();
                    if (endRestartGroup3 != null) {
                        final Modifier modifier7 = modifier2;
                        endRestartGroup3.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStatsSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomeStatsSection$lambda$4;
                                HomeStatsSection$lambda$4 = HomeStatsSectionKt.HomeStatsSection$lambda$4(HomeStatsUiState.this, onWinRateClick, onGlobalRankClick, onBestStreakClick, function16, function14, function17, modifier7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return HomeStatsSection$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                function15 = function13;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(-1422397908);
                if (!Intrinsics.areEqual(state, HomeStatsUiState.Loading.INSTANCE)) {
                }
            }
            function14 = function12;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function15 = function13;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(-1422397908);
            if (!Intrinsics.areEqual(state, HomeStatsUiState.Loading.INSTANCE)) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function14 = function12;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function15 = function13;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-1422397908);
        if (!Intrinsics.areEqual(state, HomeStatsUiState.Loading.INSTANCE)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* renamed from: HomeStatTile-zZioVvc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13833HomeStatTilezZioVvc(final String str, final String str2, final int i, final Function0<Unit> function0, final long j, final long j2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Modifier modifier3;
        int i6;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1275966891);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 131072 : 65536;
        }
        int i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            if ((i4 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1275966891, i4, -1, "org.betup.ui.fragment.home.compose.sections.HomeStatTile (HomeStatsSection.kt:154)");
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
                Modifier clip = ClipKt.clip(SizeKt.fillMaxHeight$default(SizeKt.m1548defaultMinSizeVpY3zN4$default(modifier5, 0.0f, Dp.m7774constructorimpl(52), 1, null), 0.0f, 1, null), m1810RoundedCornerShape0680j_4);
                if (function0 == null) {
                    i5 = i4;
                    modifier3 = clip;
                    i6 = 1;
                    companion = ClickableKt.m1059clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function0, 7, null);
                } else {
                    i5 = i4;
                    modifier3 = clip;
                    i6 = 1;
                    companion = Modifier.INSTANCE;
                }
                float f = 8;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(modifier3.then(companion), Dp.m7774constructorimpl(i6), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_4), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_4, 0.0f, 4, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(10));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifier6 = modifier5;
                ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, (i5 >> 6) & 14), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(2));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                long j3 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                TextUnitKt.m7981checkArithmeticR2X_6o(j);
                TextKt.m3621Text4IGK_g(str, fillMaxWidth$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.pack(TextUnit.m7966getRawTypeimpl(j), TextUnit.m7968getValueimpl(j) * 1.15f), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646108, (DefaultConstructorMarker) null), startRestartGroup, (i5 & 14) | 48, X2.b.f, 51196);
                TextKt.m3621Text4IGK_g(str2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), j2, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, j2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), startRestartGroup, ((i5 >> 3) & 14) | 48, 3120, 55292);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStatsSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeStatTile_zZioVvc$lambda$7;
                        HomeStatTile_zZioVvc$lambda$7 = HomeStatsSectionKt.HomeStatTile_zZioVvc$lambda$7(str, str2, i, function0, j, j2, modifier4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeStatTile_zZioVvc$lambda$7;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i4 & 599187) == 599186) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
        Modifier clip2 = ClipKt.clip(SizeKt.fillMaxHeight$default(SizeKt.m1548defaultMinSizeVpY3zN4$default(modifier5, 0.0f, Dp.m7774constructorimpl(52), 1, null), 0.0f, 1, null), m1810RoundedCornerShape0680j_42);
        if (function0 == null) {
        }
        float f2 = 8;
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(modifier3.then(companion), Dp.m7774constructorimpl(i6), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_42), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_42, 0.0f, 4, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(10));
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_43, centerVertically2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        Modifier modifier62 = modifier5;
        ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, (i5 >> 6) & 14), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(2));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        long j32 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        TextUnitKt.m7981checkArithmeticR2X_6o(j);
        TextKt.m3621Text4IGK_g(str, fillMaxWidth$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j32, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.pack(TextUnit.m7966getRawTypeimpl(j), TextUnit.m7968getValueimpl(j) * 1.15f), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646108, (DefaultConstructorMarker) null), startRestartGroup, (i5 & 14) | 48, X2.b.f, 51196);
        TextKt.m3621Text4IGK_g(str2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), j2, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7663getStarte0LSkKk(), 0, j2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613336, (DefaultConstructorMarker) null), startRestartGroup, ((i5 >> 3) & 14) | 48, 3120, 55292);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier62;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
