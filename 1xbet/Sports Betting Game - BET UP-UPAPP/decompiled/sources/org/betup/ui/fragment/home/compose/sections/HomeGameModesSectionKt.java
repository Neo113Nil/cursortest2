package org.betup.ui.fragment.home.compose.sections;

import android.graphics.Rect;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: HomeGameModesSection.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u009f\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a5\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"HomeGameModesSection", "", "onCompetitionsClick", "Lkotlin/Function0;", "onBattlesClick", "onRankingsClick", "onCompetitionsBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onBattlesBoundsReported", "onRankingsBoundsReported", "activeTourColumnIndex", "", "battlesBadgeCount", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "gameModeTourTileModifier", "columnIndex", "onBoundsReported", "(ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeGameModesSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeGameModesSection$lambda$1(Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Integer num, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        HomeGameModesSection(function0, function02, function03, function1, function12, function13, num, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeGameModesSection(final Function0<Unit> onCompetitionsClick, final Function0<Unit> onBattlesClick, final Function0<Unit> onRankingsClick, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Integer num, int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        Function1<? super Rect, Unit> function14;
        int i7;
        int i8;
        int i9;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final Modifier modifier2;
        final Function1<? super Rect, Unit> function15;
        final Function1<? super Rect, Unit> function16;
        final Function1<? super Rect, Unit> function17;
        final Integer num2;
        final int i10;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onCompetitionsClick, "onCompetitionsClick");
        Intrinsics.checkNotNullParameter(onBattlesClick, "onBattlesClick");
        Intrinsics.checkNotNullParameter(onRankingsClick, "onRankingsClick");
        Composer startRestartGroup = composer.startRestartGroup(-805662109);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(onCompetitionsClick) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onBattlesClick) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onRankingsClick) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function14 = function13;
                    i4 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(num) ? 1048576 : 524288;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
                    }
                    if ((i4 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        Function1<? super Rect, Unit> function18 = i11 == 0 ? null : function1;
                        Function1<? super Rect, Unit> function19 = i5 == 0 ? null : function12;
                        Function1<? super Rect, Unit> function110 = i6 == 0 ? null : function14;
                        Integer num3 = i7 == 0 ? null : num;
                        int i12 = i8 == 0 ? 0 : i;
                        Modifier modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-805662109, i4, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection (HomeGameModesSection.kt:34)");
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                        DividerKt.m3000HorizontalDivider9IZ8Weo(null, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), startRestartGroup, 48, 1);
                        HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_game_modes, startRestartGroup, 6), null, Integer.valueOf(R.drawable.group_games), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                        final Integer num4 = num3;
                        final Function1<? super Rect, Unit> function111 = function18;
                        final Function1<? super Rect, Unit> function112 = function19;
                        final int i13 = i12;
                        Modifier modifier4 = modifier3;
                        final Function1<? super Rect, Unit> function113 = function110;
                        composer2 = startRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(393871151, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num5) {
                                invoke(boxWithConstraintsScope, composer3, num5.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i14) {
                                int i15;
                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                if ((i14 & 6) == 0) {
                                    i15 = i14 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i15 = i14;
                                }
                                if ((i15 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(393871151, i15, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous> (HomeGameModesSection.kt:49)");
                                }
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                                final String stringResource = StringResources_androidKt.stringResource(R.string.drawer_competitions, composer3, 6);
                                final String stringResource2 = StringResources_androidKt.stringResource(R.string.battles, composer3, 6);
                                final String stringResource3 = StringResources_androidKt.stringResource(R.string.rankings, composer3, 6);
                                final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                final Integer num5 = num4;
                                final Function1<Rect, Unit> function114 = function111;
                                final Function0<Unit> function0 = onCompetitionsClick;
                                final Function1<Rect, Unit> function115 = function112;
                                final Function0<Unit> function02 = onBattlesClick;
                                final int i16 = i13;
                                final Function1<Rect, Unit> function116 = function113;
                                final Function0<Unit> function03 = onRankingsClick;
                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically, composer3, 54);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1732811989, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                                        invoke(composer4, num6.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i17) {
                                        Modifier gameModeTourTileModifier;
                                        if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1732811989, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:63)");
                                        }
                                        gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(0, num5, function114, composer4, 6);
                                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, R.drawable.ic_competition, function0, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48, 0);
                                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1324083852, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                                        invoke(composer4, num6.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i17) {
                                        Modifier gameModeTourTileModifier;
                                        if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1324083852, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:77)");
                                        }
                                        gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(1, num5, function115, composer4, 6);
                                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.ic_battle, function02, gameModeTourTileModifier, null, i16, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 16);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48, 0);
                                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1852324301, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                                        invoke(composer4, num6.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i17) {
                                        Modifier gameModeTourTileModifier;
                                        if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1852324301, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:92)");
                                        }
                                        gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(2, num5, function116, composer4, 6);
                                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.cup_new_gold, function03, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3078, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        function15 = function18;
                        function16 = function19;
                        function17 = function110;
                        num2 = num3;
                        i10 = i12;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function15 = function1;
                        function16 = function12;
                        num2 = num;
                        modifier2 = modifier;
                        composer2 = startRestartGroup;
                        function17 = function14;
                        i10 = i;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomeGameModesSection$lambda$1;
                                HomeGameModesSection$lambda$1 = HomeGameModesSectionKt.HomeGameModesSection$lambda$1(Function0.this, onBattlesClick, onRankingsClick, function15, function16, function17, num2, i10, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return HomeGameModesSection$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                function14 = function13;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                if (i11 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                DividerKt.m3000HorizontalDivider9IZ8Weo(null, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), startRestartGroup, 48, 1);
                HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_game_modes, startRestartGroup, 6), null, Integer.valueOf(R.drawable.group_games), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                final Integer num42 = num3;
                final Function1<? super Rect, Unit> function1112 = function18;
                final Function1<? super Rect, Unit> function1122 = function19;
                final int i132 = i12;
                Modifier modifier42 = modifier3;
                final Function1<? super Rect, Unit> function1132 = function110;
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(393871151, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num5) {
                        invoke(boxWithConstraintsScope, composer3, num5.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i14) {
                        int i15;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i14 & 6) == 0) {
                            i15 = i14 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i15 = i14;
                        }
                        if ((i15 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(393871151, i15, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous> (HomeGameModesSection.kt:49)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                        final String stringResource = StringResources_androidKt.stringResource(R.string.drawer_competitions, composer3, 6);
                        final String stringResource2 = StringResources_androidKt.stringResource(R.string.battles, composer3, 6);
                        final String stringResource3 = StringResources_androidKt.stringResource(R.string.rankings, composer3, 6);
                        final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        final Integer num5 = num42;
                        final Function1<? super Rect, Unit> function114 = function1112;
                        final Function0<Unit> function0 = onCompetitionsClick;
                        final Function1<? super Rect, Unit> function115 = function1122;
                        final Function0<Unit> function02 = onBattlesClick;
                        final int i16 = i132;
                        final Function1<? super Rect, Unit> function116 = function1132;
                        final Function0<Unit> function03 = onRankingsClick;
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, centerVertically, composer3, 54);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default22);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor22);
                        } else {
                            composer3.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1732811989, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                                invoke(composer4, num6.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i17) {
                                Modifier gameModeTourTileModifier;
                                if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1732811989, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:63)");
                                }
                                gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(0, num5, function114, composer4, 6);
                                HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, R.drawable.ic_competition, function0, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48, 0);
                        HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1324083852, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                                invoke(composer4, num6.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i17) {
                                Modifier gameModeTourTileModifier;
                                if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1324083852, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:77)");
                                }
                                gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(1, num5, function115, composer4, 6);
                                HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.ic_battle, function02, gameModeTourTileModifier, null, i16, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48, 0);
                        HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1852324301, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                                invoke(composer4, num6.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i17) {
                                Modifier gameModeTourTileModifier;
                                if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1852324301, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:92)");
                                }
                                gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(2, num5, function116, composer4, 6);
                                HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.cup_new_gold, function03, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 3078, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                function15 = function18;
                function16 = function19;
                function17 = function110;
                num2 = num3;
                i10 = i12;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function14 = function13;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            if (i11 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_422, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
            DividerKt.m3000HorizontalDivider9IZ8Weo(null, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), startRestartGroup, 48, 1);
            HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_game_modes, startRestartGroup, 6), null, Integer.valueOf(R.drawable.group_games), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
            final Integer num422 = num3;
            final Function1<? super Rect, Unit> function11122 = function18;
            final Function1<? super Rect, Unit> function11222 = function19;
            final int i1322 = i12;
            Modifier modifier422 = modifier3;
            final Function1<? super Rect, Unit> function11322 = function110;
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(393871151, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num5) {
                    invoke(boxWithConstraintsScope, composer3, num5.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i14) {
                    int i15;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i14 & 6) == 0) {
                        i15 = i14 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i15 = i14;
                    }
                    if ((i15 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(393871151, i15, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous> (HomeGameModesSection.kt:49)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                    final String stringResource = StringResources_androidKt.stringResource(R.string.drawer_competitions, composer3, 6);
                    final String stringResource2 = StringResources_androidKt.stringResource(R.string.battles, composer3, 6);
                    final String stringResource3 = StringResources_androidKt.stringResource(R.string.rankings, composer3, 6);
                    final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                    Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    final Integer num5 = num422;
                    final Function1<? super Rect, Unit> function114 = function11122;
                    final Function0<Unit> function0 = onCompetitionsClick;
                    final Function1<? super Rect, Unit> function115 = function11222;
                    final Function0<Unit> function02 = onBattlesClick;
                    final int i16 = i1322;
                    final Function1<? super Rect, Unit> function116 = function11322;
                    final Function0<Unit> function03 = onRankingsClick;
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4222, centerVertically, composer3, 54);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default222);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor222);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1732811989, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                            invoke(composer4, num6.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i17) {
                            Modifier gameModeTourTileModifier;
                            if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1732811989, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:63)");
                            }
                            gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(0, num5, function114, composer4, 6);
                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, R.drawable.ic_competition, function0, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48, 0);
                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1324083852, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                            invoke(composer4, num6.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i17) {
                            Modifier gameModeTourTileModifier;
                            if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1324083852, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:77)");
                            }
                            gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(1, num5, function115, composer4, 6);
                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.ic_battle, function02, gameModeTourTileModifier, null, i16, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48, 0);
                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1852324301, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                            invoke(composer4, num6.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i17) {
                            Modifier gameModeTourTileModifier;
                            if ((i17 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1852324301, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:92)");
                            }
                            gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(2, num5, function116, composer4, 6);
                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.cup_new_gold, function03, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 3078, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier422;
            function15 = function18;
            function16 = function19;
            function17 = function110;
            num2 = num3;
            i10 = i12;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function14 = function13;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        if (i11 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
        DividerKt.m3000HorizontalDivider9IZ8Weo(null, Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor(), startRestartGroup, 48, 1);
        HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_game_modes, startRestartGroup, 6), null, Integer.valueOf(R.drawable.group_games), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
        final Integer num4222 = num3;
        final Function1<? super Rect, Unit> function111222 = function18;
        final Function1<? super Rect, Unit> function112222 = function19;
        final int i13222 = i12;
        Modifier modifier4222 = modifier3;
        final Function1<? super Rect, Unit> function113222 = function110;
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(393871151, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num5) {
                invoke(boxWithConstraintsScope, composer3, num5.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i14) {
                int i15;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i14 & 6) == 0) {
                    i15 = i14 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i15 = i14;
                }
                if ((i15 & 19) == 18 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(393871151, i15, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous> (HomeGameModesSection.kt:49)");
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer3.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                final String stringResource = StringResources_androidKt.stringResource(R.string.drawer_competitions, composer3, 6);
                final String stringResource2 = StringResources_androidKt.stringResource(R.string.battles, composer3, 6);
                final String stringResource3 = StringResources_androidKt.stringResource(R.string.rankings, composer3, 6);
                final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                final Integer num5 = num4222;
                final Function1<? super Rect, Unit> function114 = function111222;
                final Function0<Unit> function0 = onCompetitionsClick;
                final Function1<? super Rect, Unit> function115 = function112222;
                final Function0<Unit> function02 = onBattlesClick;
                final int i16 = i13222;
                final Function1<? super Rect, Unit> function116 = function113222;
                final Function0<Unit> function03 = onRankingsClick;
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42222, centerVertically, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2222);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1732811989, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                        invoke(composer4, num6.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i17) {
                        Modifier gameModeTourTileModifier;
                        if ((i17 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1732811989, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:63)");
                        }
                        gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(0, num5, function114, composer4, 6);
                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, R.drawable.ic_competition, function0, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48, 0);
                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1324083852, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                        invoke(composer4, num6.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i17) {
                        Modifier gameModeTourTileModifier;
                        if ((i17 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1324083852, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:77)");
                        }
                        gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(1, num5, function115, composer4, 6);
                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.ic_battle, function02, gameModeTourTileModifier, null, i16, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48, 0);
                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1852324301, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeGameModesSectionKt$HomeGameModesSection$1$1$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num6) {
                        invoke(composer4, num6.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i17) {
                        Modifier gameModeTourTileModifier;
                        if ((i17 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1852324301, i17, -1, "org.betup.ui.fragment.home.compose.sections.HomeGameModesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeGameModesSection.kt:92)");
                        }
                        gameModeTourTileModifier = HomeGameModesSectionKt.gameModeTourTileModifier(2, num5, function116, composer4, 6);
                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.cup_new_gold, function03, gameModeTourTileModifier, null, 0, true, rememberHomeQuickPlayTileLabelFontSize, composer4, 1572912, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48, 0);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), composer2, 3078, 6);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier4222;
        function15 = function18;
        function16 = function19;
        function17 = function110;
        num2 = num3;
        i10 = i12;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier gameModeTourTileModifier(int i, Integer num, Function1<? super Rect, Unit> function1, Composer composer, int i2) {
        composer.startReplaceGroup(1477314413);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477314413, i2, -1, "org.betup.ui.fragment.home.compose.sections.gameModeTourTileModifier (HomeGameModesSection.kt:115)");
        }
        Modifier reportHomeTourBounds = HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function1, composer, ((i2 >> 3) & 112) | 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return reportHomeTourBounds;
    }
}
