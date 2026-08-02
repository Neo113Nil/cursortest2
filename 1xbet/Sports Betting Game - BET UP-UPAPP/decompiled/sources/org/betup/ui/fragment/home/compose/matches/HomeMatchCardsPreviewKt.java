package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.home.compose.HomeMatchItem;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeMatchCardsPreview.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a \u0010\u0003\u001a\u00020\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0010\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"previewBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "HomeMatchCardPreviewSurface", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "previewOdds", "", "Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "previewLiveMatch", "Lorg/betup/ui/fragment/home/compose/HomeMatchItem;", "previewMoreMatch", "HomeLiveMatchCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "HomeMoreMatchCardPreview", "previewAwayFavoredLiveMatch", "previewLargeScoreMatch", "HomeLiveMatchCardAwayFavoredPreview", "preview1x2Odds241335331", "HomeMatchSentimentBarOrientationsPreview", "HomeLiveMatchCardLargeScoresPreview", "HomeMatchCardsCombinedPreview", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchCardsPreviewKt {
    private static final List<HomeMatchOddUi> preview1x2Odds241335331;
    private static final HomeMatchItem previewAwayFavoredLiveMatch;
    private static final long previewBackgroundColor = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
    private static final HomeMatchItem previewLargeScoreMatch;
    private static final HomeMatchItem previewLiveMatch;
    private static final HomeMatchItem previewMoreMatch;
    private static final List<HomeMatchOddUi> previewOdds;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLiveMatchCardAwayFavoredPreview$lambda$4(int i, Composer composer, int i2) {
        HomeLiveMatchCardAwayFavoredPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLiveMatchCardLargeScoresPreview$lambda$6(int i, Composer composer, int i2) {
        HomeLiveMatchCardLargeScoresPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLiveMatchCardPreview$lambda$2(int i, Composer composer, int i2) {
        HomeLiveMatchCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchCardPreviewSurface$lambda$1(Function2 function2, int i, Composer composer, int i2) {
        HomeMatchCardPreviewSurface(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchCardsCombinedPreview$lambda$7(int i, Composer composer, int i2) {
        HomeMatchCardsCombinedPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchSentimentBarOrientationsPreview$lambda$5(int i, Composer composer, int i2) {
        HomeMatchSentimentBarOrientationsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMoreMatchCardPreview$lambda$3(int i, Composer composer, int i2) {
        HomeMoreMatchCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static {
        HomeMatchOddUi copy;
        HomeMatchOddUi copy2;
        HomeMatchItem copy3;
        HomeMatchItem copy4;
        List<HomeMatchOddUi> listOf = CollectionsKt.listOf((Object[]) new HomeMatchOddUi[]{new HomeMatchOddUi(1L, 1, "1", true, 2.55d, "2.55", false, 64, null), new HomeMatchOddUi(2L, 2, "X", true, 4.51d, "4.51", false, 64, null), new HomeMatchOddUi(3L, 3, ExifInterface.GPS_MEASUREMENT_2D, true, 2.88d, "2.88", false, 64, null)});
        previewOdds = listOf;
        Float valueOf = Float.valueOf(41.0f);
        Float valueOf2 = Float.valueOf(23.0f);
        Float valueOf3 = Float.valueOf(36.0f);
        HomeMatchItem homeMatchItem = new HomeMatchItem(1L, "Stade Brestois 29", "Paris Saint-Germain", "", "", 1, 4, true, "Football", "12k", null, null, "Italy. Serie A", "1st Half", "22:45", CollectionsKt.listOf((Object[]) new Float[]{valueOf, valueOf2, valueOf3}), listOf, 0, 134144, null);
        previewLiveMatch = homeMatchItem;
        previewMoreMatch = new HomeMatchItem(2L, "Liverpool", "Chelsea", "", "", null, null, false, "Football", "8.2k", "18:30", "22.05", "Premier League", null, null, CollectionsKt.listOf((Object[]) new Float[]{valueOf, valueOf2, valueOf3}), listOf, 0, 155648, null);
        copy = r7.copy((r20 & 1) != 0 ? r7.grabbedBetId : 0L, (r20 & 2) != 0 ? r7.betTypeId : 0, (r20 & 4) != 0 ? r7.betName : null, (r20 & 8) != 0 ? r7.isAvailable : false, (r20 & 16) != 0 ? r7.coefficient : 1.45d, (r20 & 32) != 0 ? r7.coefficientLabel : "1.45", (r20 & 64) != 0 ? listOf.get(0).groupUserAvailable : false);
        copy2 = r6.copy((r20 & 1) != 0 ? r6.grabbedBetId : 0L, (r20 & 2) != 0 ? r6.betTypeId : 0, (r20 & 4) != 0 ? r6.betName : null, (r20 & 8) != 0 ? r6.isAvailable : false, (r20 & 16) != 0 ? r6.coefficient : 3.2d, (r20 & 32) != 0 ? r6.coefficientLabel : "3.20", (r20 & 64) != 0 ? listOf.get(2).groupUserAvailable : false);
        copy3 = homeMatchItem.copy((r37 & 1) != 0 ? homeMatchItem.matchId : 4L, (r37 & 2) != 0 ? homeMatchItem.homeTeamName : null, (r37 & 4) != 0 ? homeMatchItem.awayTeamName : null, (r37 & 8) != 0 ? homeMatchItem.homeLogoUrl : null, (r37 & 16) != 0 ? homeMatchItem.awayLogoUrl : null, (r37 & 32) != 0 ? homeMatchItem.scoreHome : null, (r37 & 64) != 0 ? homeMatchItem.scoreAway : null, (r37 & 128) != 0 ? homeMatchItem.isLive : false, (r37 & 256) != 0 ? homeMatchItem.sportName : null, (r37 & 512) != 0 ? homeMatchItem.betsLabel : null, (r37 & 1024) != 0 ? homeMatchItem.kickoffTimeLabel : null, (r37 & 2048) != 0 ? homeMatchItem.kickoffDateLabel : null, (r37 & 4096) != 0 ? homeMatchItem.leagueName : null, (r37 & 8192) != 0 ? homeMatchItem.periodLabel : null, (r37 & 16384) != 0 ? homeMatchItem.liveTimeLabel : null, (r37 & 32768) != 0 ? homeMatchItem.sentimentPercents : CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(55.0f), Float.valueOf(20.0f), Float.valueOf(25.0f)}), (r37 & 65536) != 0 ? homeMatchItem.odds : CollectionsKt.listOf((Object[]) new HomeMatchOddUi[]{copy, listOf.get(1), copy2}), (r37 & 131072) != 0 ? homeMatchItem.sportId : 0);
        previewAwayFavoredLiveMatch = copy3;
        copy4 = homeMatchItem.copy((r37 & 1) != 0 ? homeMatchItem.matchId : 3L, (r37 & 2) != 0 ? homeMatchItem.homeTeamName : "Team A", (r37 & 4) != 0 ? homeMatchItem.awayTeamName : "Team B", (r37 & 8) != 0 ? homeMatchItem.homeLogoUrl : null, (r37 & 16) != 0 ? homeMatchItem.awayLogoUrl : null, (r37 & 32) != 0 ? homeMatchItem.scoreHome : Integer.valueOf(Opcodes.RET), (r37 & 64) != 0 ? homeMatchItem.scoreAway : 157, (r37 & 128) != 0 ? homeMatchItem.isLive : false, (r37 & 256) != 0 ? homeMatchItem.sportName : null, (r37 & 512) != 0 ? homeMatchItem.betsLabel : null, (r37 & 1024) != 0 ? homeMatchItem.kickoffTimeLabel : null, (r37 & 2048) != 0 ? homeMatchItem.kickoffDateLabel : null, (r37 & 4096) != 0 ? homeMatchItem.leagueName : null, (r37 & 8192) != 0 ? homeMatchItem.periodLabel : "4th Quarter", (r37 & 16384) != 0 ? homeMatchItem.liveTimeLabel : "12:00", (r37 & 32768) != 0 ? homeMatchItem.sentimentPercents : null, (r37 & 65536) != 0 ? homeMatchItem.odds : null, (r37 & 131072) != 0 ? homeMatchItem.sportId : 0);
        previewLargeScoreMatch = copy4;
        preview1x2Odds241335331 = CollectionsKt.listOf((Object[]) new HomeMatchOddUi[]{new HomeMatchOddUi(10L, 1, "1", true, 2.41d, "2.41", false, 64, null), new HomeMatchOddUi(11L, 2, "X", true, 3.35d, "3.35", false, 64, null), new HomeMatchOddUi(12L, 3, ExifInterface.GPS_MEASUREMENT_2D, true, 3.31d, "3.31", false, 64, null)});
    }

    private static final void HomeMatchCardPreviewSurface(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2121000729);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2121000729, i2, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchCardPreviewSurface (HomeMatchCardsPreview.kt:20)");
            }
            float f = 12;
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, previewBackgroundColor, null, 2, null), Dp.m7774constructorimpl(f));
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardsPreviewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchCardPreviewSurface$lambda$1;
                    HomeMatchCardPreviewSurface$lambda$1 = HomeMatchCardsPreviewKt.HomeMatchCardPreviewSurface$lambda$1(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchCardPreviewSurface$lambda$1;
                }
            });
        }
    }

    public static final void HomeLiveMatchCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1704054875);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1704054875, i, -1, "org.betup.ui.fragment.home.compose.matches.HomeLiveMatchCardPreview (HomeMatchCardsPreview.kt:100)");
            }
            HomeMatchCardPreviewSurface(ComposableSingletons$HomeMatchCardsPreviewKt.INSTANCE.m13774getLambda$1750551499$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardsPreviewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeLiveMatchCardPreview$lambda$2;
                    HomeLiveMatchCardPreview$lambda$2 = HomeMatchCardsPreviewKt.HomeLiveMatchCardPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeLiveMatchCardPreview$lambda$2;
                }
            });
        }
    }

    public static final void HomeMoreMatchCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(735857820);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735857820, i, -1, "org.betup.ui.fragment.home.compose.matches.HomeMoreMatchCardPreview (HomeMatchCardsPreview.kt:121)");
            }
            HomeMatchCardPreviewSurface(ComposableSingletons$HomeMatchCardsPreviewKt.INSTANCE.getLambda$689361196$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardsPreviewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMoreMatchCardPreview$lambda$3;
                    HomeMoreMatchCardPreview$lambda$3 = HomeMatchCardsPreviewKt.HomeMoreMatchCardPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMoreMatchCardPreview$lambda$3;
                }
            });
        }
    }

    public static final void HomeLiveMatchCardAwayFavoredPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1156294940);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1156294940, i, -1, "org.betup.ui.fragment.home.compose.matches.HomeLiveMatchCardAwayFavoredPreview (HomeMatchCardsPreview.kt:163)");
            }
            HomeMatchCardPreviewSurface(ComposableSingletons$HomeMatchCardsPreviewKt.INSTANCE.m13775getLambda$1935431028$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardsPreviewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeLiveMatchCardAwayFavoredPreview$lambda$4;
                    HomeLiveMatchCardAwayFavoredPreview$lambda$4 = HomeMatchCardsPreviewKt.HomeLiveMatchCardAwayFavoredPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeLiveMatchCardAwayFavoredPreview$lambda$4;
                }
            });
        }
    }

    public static final void HomeMatchSentimentBarOrientationsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(14839688);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(14839688, i, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchSentimentBarOrientationsPreview (HomeMatchCardsPreview.kt:211)");
            }
            HomeMatchCardPreviewSurface(ComposableSingletons$HomeMatchCardsPreviewKt.INSTANCE.getLambda$1075958808$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardsPreviewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchSentimentBarOrientationsPreview$lambda$5;
                    HomeMatchSentimentBarOrientationsPreview$lambda$5 = HomeMatchCardsPreviewKt.HomeMatchSentimentBarOrientationsPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchSentimentBarOrientationsPreview$lambda$5;
                }
            });
        }
    }

    public static final void HomeLiveMatchCardLargeScoresPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1689736585);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1689736585, i, -1, "org.betup.ui.fragment.home.compose.matches.HomeLiveMatchCardLargeScoresPreview (HomeMatchCardsPreview.kt:234)");
            }
            HomeMatchCardPreviewSurface(ComposableSingletons$HomeMatchCardsPreviewKt.INSTANCE.m13772getLambda$1401989383$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardsPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeLiveMatchCardLargeScoresPreview$lambda$6;
                    HomeLiveMatchCardLargeScoresPreview$lambda$6 = HomeMatchCardsPreviewKt.HomeLiveMatchCardLargeScoresPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeLiveMatchCardLargeScoresPreview$lambda$6;
                }
            });
        }
    }

    public static final void HomeMatchCardsCombinedPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(954144889);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(954144889, i, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchCardsCombinedPreview (HomeMatchCardsPreview.kt:255)");
            }
            HomeMatchCardPreviewSurface(ComposableSingletons$HomeMatchCardsPreviewKt.INSTANCE.m13773getLambda$1521422871$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchCardsPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMatchCardsCombinedPreview$lambda$7;
                    HomeMatchCardsCombinedPreview$lambda$7 = HomeMatchCardsPreviewKt.HomeMatchCardsCombinedPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMatchCardsCombinedPreview$lambda$7;
                }
            });
        }
    }
}
