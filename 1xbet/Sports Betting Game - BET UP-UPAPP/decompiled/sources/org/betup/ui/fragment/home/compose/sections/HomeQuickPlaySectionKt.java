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
import org.betup.ui.common.compose.NavigationImageHelper;
import org.betup.ui.fragment.home.compose.HomeTourBoundsKt;

/* compiled from: HomeQuickPlaySection.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"HomeQuickPlaySection", "", "onFlashBetClick", "Lkotlin/Function0;", "onMinigamesClick", "onTvBetClick", "onFlashBetBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", "onMinigamesBoundsReported", "onTvBetBoundsReported", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeQuickPlaySectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeQuickPlaySection$lambda$1(Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeQuickPlaySection(function0, function02, function03, function1, function12, function13, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeQuickPlaySection(final Function0<Unit> onFlashBetClick, final Function0<Unit> onMinigamesClick, final Function0<Unit> onTvBetClick, Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Rect, Unit> function14;
        int i4;
        final Function1<? super Rect, Unit> function15;
        int i5;
        Function1<? super Rect, Unit> function16;
        int i6;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final Function1<? super Rect, Unit> function17;
        final Function1<? super Rect, Unit> function18;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onFlashBetClick, "onFlashBetClick");
        Intrinsics.checkNotNullParameter(onMinigamesClick, "onMinigamesClick");
        Intrinsics.checkNotNullParameter(onTvBetClick, "onTvBetClick");
        Composer startRestartGroup = composer.startRestartGroup(1150899119);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(onFlashBetClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onMinigamesClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onTvBetClick) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function14 = function1;
            i3 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function15 = function12;
                i3 |= startRestartGroup.changedInstance(function15) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function16 = function13;
                    i3 |= startRestartGroup.changedInstance(function16) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            Function1<? super Rect, Unit> function19 = i7 != 0 ? null : function14;
                            Function1<? super Rect, Unit> function110 = i4 != 0 ? null : function15;
                            Function1<? super Rect, Unit> function111 = i5 != 0 ? null : function16;
                            Modifier modifier3 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1150899119, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection (HomeQuickPlaySection.kt:29)");
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
                            if (startRestartGroup.getInserting()) {
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
                            HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_quick_play, startRestartGroup, 6), null, Integer.valueOf(R.drawable.thunder_bolt), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                            final Function1<? super Rect, Unit> function112 = function19;
                            final Function1<? super Rect, Unit> function113 = function110;
                            Modifier modifier4 = modifier3;
                            final Function1<? super Rect, Unit> function114 = function111;
                            composer2 = startRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1745374331, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i8) {
                                    int i9;
                                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                    if ((i8 & 6) == 0) {
                                        i9 = i8 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1745374331, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:39)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                                    final String stringResource = StringResources_androidKt.stringResource(R.string.flash_bet, composer3, 6);
                                    final String stringResource2 = StringResources_androidKt.stringResource(R.string.home_mini_games, composer3, 6);
                                    final String stringResource3 = StringResources_androidKt.stringResource(R.string.tvbet, composer3, 6);
                                    final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    final Function1<Rect, Unit> function115 = function112;
                                    final Function0<Unit> function0 = onFlashBetClick;
                                    final Function1<Rect, Unit> function116 = function113;
                                    final Function0<Unit> function02 = onMinigamesClick;
                                    final Function1<Rect, Unit> function117 = function114;
                                    final Function0<Unit> function03 = onTvBetClick;
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
                                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1372188705, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i10) {
                                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1372188705, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:53)");
                                            }
                                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, NavigationImageHelper.INSTANCE.getFlashBetDrawable(), function0, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function115, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 0, 112);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 48, 0);
                                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(498459864, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$2
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i10) {
                                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(498459864, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:64)");
                                            }
                                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.new_minigames_img, function02, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function116, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 48, 0);
                                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(99747097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$3
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i10) {
                                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(99747097, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:75)");
                                            }
                                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.tv_bet_img, function03, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function117, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
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
                            }, startRestartGroup, 54), startRestartGroup, 3078, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                            function17 = function19;
                            function15 = function110;
                            function18 = function111;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function17 = function14;
                            composer2 = startRestartGroup;
                            function18 = function16;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier5 = modifier2;
                            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit HomeQuickPlaySection$lambda$1;
                                    HomeQuickPlaySection$lambda$1 = HomeQuickPlaySectionKt.HomeQuickPlaySection$lambda$1(Function0.this, onMinigamesClick, onTvBetClick, function17, function15, function18, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return HomeQuickPlaySection$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    modifier2 = modifier;
                    if ((599187 & i3) == 599186) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
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
                    if (startRestartGroup.getInserting()) {
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
                    HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_quick_play, startRestartGroup, 6), null, Integer.valueOf(R.drawable.thunder_bolt), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                    final Function1<? super Rect, Unit> function1122 = function19;
                    final Function1<? super Rect, Unit> function1132 = function110;
                    Modifier modifier42 = modifier3;
                    final Function1<? super Rect, Unit> function1142 = function111;
                    composer2 = startRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1745374331, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                            invoke(boxWithConstraintsScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i8 & 6) == 0) {
                                i9 = i8 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1745374331, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:39)");
                            }
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                            final String stringResource = StringResources_androidKt.stringResource(R.string.flash_bet, composer3, 6);
                            final String stringResource2 = StringResources_androidKt.stringResource(R.string.home_mini_games, composer3, 6);
                            final String stringResource3 = StringResources_androidKt.stringResource(R.string.tvbet, composer3, 6);
                            final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            final Function1<? super Rect, Unit> function115 = function1122;
                            final Function0<Unit> function0 = onFlashBetClick;
                            final Function1<? super Rect, Unit> function116 = function1132;
                            final Function0<Unit> function02 = onMinigamesClick;
                            final Function1<? super Rect, Unit> function117 = function1142;
                            final Function0<Unit> function03 = onTvBetClick;
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
                            HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1372188705, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1372188705, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:53)");
                                    }
                                    HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, NavigationImageHelper.INSTANCE.getFlashBetDrawable(), function0, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function115, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 0, 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48, 0);
                            HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(498459864, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(498459864, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:64)");
                                    }
                                    HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.new_minigames_img, function02, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function116, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48, 0);
                            HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(99747097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i10) {
                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(99747097, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:75)");
                                    }
                                    HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.tv_bet_img, function03, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function117, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
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
                    }, startRestartGroup, 54), startRestartGroup, 3078, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                    function17 = function19;
                    function15 = function110;
                    function18 = function111;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function16 = function13;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                modifier2 = modifier;
                if ((599187 & i3) == 599186) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
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
                if (startRestartGroup.getInserting()) {
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
                HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_quick_play, startRestartGroup, 6), null, Integer.valueOf(R.drawable.thunder_bolt), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
                final Function1<? super Rect, Unit> function11222 = function19;
                final Function1<? super Rect, Unit> function11322 = function110;
                Modifier modifier422 = modifier3;
                final Function1<? super Rect, Unit> function11422 = function111;
                composer2 = startRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1745374331, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i8) {
                        int i9;
                        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((i8 & 6) == 0) {
                            i9 = i8 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                        } else {
                            i9 = i8;
                        }
                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1745374331, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:39)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                        final String stringResource = StringResources_androidKt.stringResource(R.string.flash_bet, composer3, 6);
                        final String stringResource2 = StringResources_androidKt.stringResource(R.string.home_mini_games, composer3, 6);
                        final String stringResource3 = StringResources_androidKt.stringResource(R.string.tvbet, composer3, 6);
                        final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        final Function1<? super Rect, Unit> function115 = function11222;
                        final Function0<Unit> function0 = onFlashBetClick;
                        final Function1<? super Rect, Unit> function116 = function11322;
                        final Function0<Unit> function02 = onMinigamesClick;
                        final Function1<? super Rect, Unit> function117 = function11422;
                        final Function0<Unit> function03 = onTvBetClick;
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
                        HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1372188705, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i10) {
                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1372188705, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:53)");
                                }
                                HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, NavigationImageHelper.INSTANCE.getFlashBetDrawable(), function0, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function115, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 0, 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48, 0);
                        HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(498459864, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i10) {
                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(498459864, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:64)");
                                }
                                HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.new_minigames_img, function02, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function116, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48, 0);
                        HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(99747097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i10) {
                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(99747097, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:75)");
                                }
                                HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.tv_bet_img, function03, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function117, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
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
                }, startRestartGroup, 54), startRestartGroup, 3078, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier422;
                function17 = function19;
                function15 = function110;
                function18 = function111;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function15 = function12;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function16 = function13;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
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
            if (startRestartGroup.getInserting()) {
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
            HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_quick_play, startRestartGroup, 6), null, Integer.valueOf(R.drawable.thunder_bolt), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
            final Function1<? super Rect, Unit> function112222 = function19;
            final Function1<? super Rect, Unit> function113222 = function110;
            Modifier modifier4222 = modifier3;
            final Function1<? super Rect, Unit> function114222 = function111;
            composer2 = startRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1745374331, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i8) {
                    int i9;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1745374331, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:39)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                    final String stringResource = StringResources_androidKt.stringResource(R.string.flash_bet, composer3, 6);
                    final String stringResource2 = StringResources_androidKt.stringResource(R.string.home_mini_games, composer3, 6);
                    final String stringResource3 = StringResources_androidKt.stringResource(R.string.tvbet, composer3, 6);
                    final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                    Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    final Function1<? super Rect, Unit> function115 = function112222;
                    final Function0<Unit> function0 = onFlashBetClick;
                    final Function1<? super Rect, Unit> function116 = function113222;
                    final Function0<Unit> function02 = onMinigamesClick;
                    final Function1<? super Rect, Unit> function117 = function114222;
                    final Function0<Unit> function03 = onTvBetClick;
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
                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1372188705, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1372188705, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:53)");
                            }
                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, NavigationImageHelper.INSTANCE.getFlashBetDrawable(), function0, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function115, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 0, 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48, 0);
                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(498459864, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(498459864, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:64)");
                            }
                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.new_minigames_img, function02, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function116, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 48, 0);
                    HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(99747097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(99747097, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:75)");
                            }
                            HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.tv_bet_img, function03, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function117, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
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
            }, startRestartGroup, 54), startRestartGroup, 3078, 6);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier4222;
            function17 = function19;
            function15 = function110;
            function18 = function111;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function14 = function1;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function15 = function12;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function16 = function13;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
        HomeSectionTitleKt.HomeSectionTitle(StringResources_androidKt.stringResource(R.string.home_quick_play, startRestartGroup, 6), null, Integer.valueOf(R.drawable.thunder_bolt), null, null, null, null, null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 250);
        final Function1<? super Rect, Unit> function1122222 = function19;
        final Function1<? super Rect, Unit> function1132222 = function110;
        Modifier modifier42222 = modifier3;
        final Function1<? super Rect, Unit> function1142222 = function111;
        composer2 = startRestartGroup;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1745374331, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                invoke(boxWithConstraintsScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i8) {
                int i9;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i8 & 6) == 0) {
                    i9 = i8 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i9 = i8;
                }
                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1745374331, i9, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:39)");
                }
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer3.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
                final String stringResource = StringResources_androidKt.stringResource(R.string.flash_bet, composer3, 6);
                final String stringResource2 = StringResources_androidKt.stringResource(R.string.home_mini_games, composer3, 6);
                final String stringResource3 = StringResources_androidKt.stringResource(R.string.tvbet, composer3, 6);
                final long rememberHomeQuickPlayTileLabelFontSize = HomeStubSectionKt.rememberHomeQuickPlayTileLabelFontSize(CollectionsKt.listOf((Object[]) new String[]{stringResource, stringResource2, stringResource3}), mo1167toPx0680j_4, 0, composer3, 0, 4);
                Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_422222 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                final Function1<? super Rect, Unit> function115 = function1122222;
                final Function0<Unit> function0 = onFlashBetClick;
                final Function1<? super Rect, Unit> function116 = function1132222;
                final Function0<Unit> function02 = onMinigamesClick;
                final Function1<? super Rect, Unit> function117 = function1142222;
                final Function0<Unit> function03 = onTvBetClick;
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422222, centerVertically, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default22222);
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor22222);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(1372188705, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i10) {
                        if ((i10 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1372188705, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:53)");
                        }
                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource, NavigationImageHelper.INSTANCE.getFlashBetDrawable(), function0, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function115, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 0, 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48, 0);
                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(498459864, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i10) {
                        if ((i10 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(498459864, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:64)");
                        }
                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource2, R.drawable.new_minigames_img, function02, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function116, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 48, 0);
                HomeStubSectionKt.HomeQuickPlayTileSlot(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposableLambdaKt.rememberComposableLambda(99747097, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt$HomeQuickPlaySection$1$1$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                        invoke(composer4, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer4, int i10) {
                        if ((i10 & 3) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(99747097, i10, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeQuickPlaySection.kt:75)");
                        }
                        HomeStubSectionKt.m13837HomeQuickPlayTileBrHU8kk(stringResource3, R.drawable.tv_bet_img, function03, HomeTourBoundsKt.reportHomeTourBounds(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.8f), function117, composer4, 6), null, 0, false, rememberHomeQuickPlayTileLabelFontSize, composer4, 48, 112);
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
        }, startRestartGroup, 54), startRestartGroup, 3078, 6);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42222;
        function17 = function19;
        function15 = function110;
        function18 = function111;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
