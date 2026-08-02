package org.betup.ui.fragment.home.compose.sections;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.ui.common.compose.AutoResizeSiblingsTextKt;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeStubSection.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a7\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\f\u001a-\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001ac\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a*\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\"H\u0007¢\u0006\u0002\u0010#¨\u0006$"}, d2 = {"HomeStubPlaceholder", "", "message", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeStubSection", "sectionTitle", "placeholderMessage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberHomeQuickPlayTileLabelFontSize", "Landroidx/compose/ui/unit/TextUnit;", "labels", "", "rowMaxWidthPx", "", "tileCount", "", "(Ljava/util/List;FILandroidx/compose/runtime/Composer;II)J", "HomeQuickPlayTile", "label", "iconRes", "valueLabel", "badgeCount", "reserveCornerBadgeSpace", "", "labelFontSize", "HomeQuickPlayTile-BrHU8kk", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;IZJLandroidx/compose/runtime/Composer;II)V", "HomeQuickPlayTileSlot", "content", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeStubSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeQuickPlayTileSlot$lambda$12(Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        HomeQuickPlayTileSlot(modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeQuickPlayTile_BrHU8kk$lambda$10(String str, int i, Function0 function0, Modifier modifier, String str2, int i2, boolean z, long j, int i3, int i4, Composer composer, int i5) {
        m13837HomeQuickPlayTileBrHU8kk(str, i, function0, modifier, str2, i2, z, j, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeStubPlaceholder$lambda$1(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeStubPlaceholder(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeStubSection$lambda$3(String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeStubSection(str, str2, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeStubPlaceholder(final String message, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        Modifier modifier4;
        int i5;
        Composer composer2;
        Modifier.Companion companion;
        Composer composer3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer4;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(message, "message");
        Composer startRestartGroup = composer.startRestartGroup(271756305);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(message) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if ((i4 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier6 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(271756305, i4, -1, "org.betup.ui.fragment.home.compose.sections.HomeStubPlaceholder (HomeStubSection.kt:63)");
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
                Modifier m1025backgroundbw27NRU$default = BackgroundKt.m1025backgroundbw27NRU$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null), m1810RoundedCornerShape0680j_4), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_4), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), null, 2, null);
                startRestartGroup.startReplaceGroup(-835181084);
                if (function0 == null) {
                    modifier3 = m1025backgroundbw27NRU$default;
                    modifier4 = modifier6;
                    i5 = i4;
                    composer2 = startRestartGroup;
                    companion = ClickAnimationModifierKt.subtleClickAnimation(Modifier.INSTANCE, function0, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i4 & 112) | 3078, 0, 1018);
                } else {
                    modifier3 = m1025backgroundbw27NRU$default;
                    modifier4 = modifier6;
                    i5 = i4;
                    composer2 = startRestartGroup;
                    companion = Modifier.INSTANCE;
                }
                composer2.endReplaceGroup();
                Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(modifier3.then(companion), Dp.m7774constructorimpl(16));
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                composer3 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m1516padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer4 = composer3;
                TextKt.m3621Text4IGK_g(message, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null), composer4, i5 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                composer4 = startRestartGroup;
            }
            endRestartGroup = composer4.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStubSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeStubPlaceholder$lambda$1;
                        HomeStubPlaceholder$lambda$1 = HomeStubSectionKt.HomeStubPlaceholder$lambda$1(message, function0, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeStubPlaceholder$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & Opcodes.I2S) == 146) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
        Modifier m1025backgroundbw27NRU$default2 = BackgroundKt.m1025backgroundbw27NRU$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null), m1810RoundedCornerShape0680j_42), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), m1810RoundedCornerShape0680j_42), ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor(), null, 2, null);
        startRestartGroup.startReplaceGroup(-835181084);
        if (function0 == null) {
        }
        composer2.endReplaceGroup();
        Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(modifier3.then(companion), Dp.m7774constructorimpl(16));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        composer3 = composer2;
        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer3, 6);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1516padding3ABfNKs2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        composer4 = composer3;
        TextKt.m3621Text4IGK_g(message, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null), composer4, i5 & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier4;
        endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeStubSection(final String sectionTitle, final String placeholderMessage, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(placeholderMessage, "placeholderMessage");
        Composer startRestartGroup = composer.startRestartGroup(-765631170);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sectionTitle) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(placeholderMessage) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-765631170, i4, -1, "org.betup.ui.fragment.home.compose.sections.HomeStubSection (HomeStubSection.kt:98)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
                Modifier modifier5 = modifier4;
                HomeSectionTitleKt.HomeSectionTitle(sectionTitle, null, null, null, null, null, null, null, startRestartGroup, i4 & 14, 254);
                HomeStubPlaceholder(placeholderMessage, function0, null, startRestartGroup, (i4 >> 3) & 126, 4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStubSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeStubSection$lambda$3;
                        HomeStubSection$lambda$3 = HomeStubSectionKt.HomeStubSection$lambda$3(sectionTitle, placeholderMessage, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeStubSection$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
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
        Modifier modifier52 = modifier4;
        HomeSectionTitleKt.HomeSectionTitle(sectionTitle, null, null, null, null, null, null, null, startRestartGroup, i4 & 14, 254);
        HomeStubPlaceholder(placeholderMessage, function0, null, startRestartGroup, (i4 >> 3) & 126, 4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long rememberHomeQuickPlayTileLabelFontSize(List<String> labels, float f, int i, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        composer.startReplaceGroup(18026442);
        int i4 = (i3 & 4) != 0 ? 3 : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(18026442, i2, -1, "org.betup.ui.fragment.home.compose.sections.rememberHomeQuickPlayTileLabelFontSize (HomeStubSection.kt:116)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        long m12898CalculateAutoResizeFontSizeForWidtha8pgNYE = AutoResizeSiblingsTextKt.m12898CalculateAutoResizeFontSizeForWidtha8pgNYE(labels, HomeQuickPlayTileStyle.INSTANCE.m13824getLabelFontSizeXSAIIZE(), HomeQuickPlayTileStyle.INSTANCE.m13825getLabelMinFontSizeXSAIIZE(), RangesKt.coerceAtLeast((((f - (density.mo1167toPx0680j_4(HomeQuickPlayTileStyle.INSTANCE.m13827getTileHorizontalGapD9Ej5fM()) * RangesKt.coerceAtLeast(i4 - 1, 0))) / RangesKt.coerceAtLeast(i4, 1)) * 0.8f) - density.mo1167toPx0680j_4(Dp.m7774constructorimpl(HomeQuickPlayTileStyle.INSTANCE.m13821getContentPaddingD9Ej5fM() * 2)), 1.0f), true, HomeQuickPlayTileStyle.INSTANCE.getLabelMaxLines(), new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777183, (DefaultConstructorMarker) null), composer, (i2 & 14) | 221616, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m12898CalculateAutoResizeFontSizeForWidtha8pgNYE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0685  */
    /* renamed from: HomeQuickPlayTile-BrHU8kk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13837HomeQuickPlayTileBrHU8kk(final String label, final int i, final Function0<Unit> onClick, Modifier modifier, String str, int i2, boolean z, long j, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        String str3;
        int i12;
        float m13820getBadgeOverflowPadD9Ej5fM;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int i13;
        Composer composer2;
        int i14;
        int i15;
        final int i16;
        final Modifier modifier3;
        final String str4;
        final boolean z3;
        final long j2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(888707561);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(label) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i17 = i4 & 8;
        if (i17 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i3 & 24576) == 0) {
                str2 = str;
                i5 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i3) == 0) {
                    i8 = i2;
                    i5 |= startRestartGroup.changed(i8) ? 131072 : 65536;
                    i9 = i4 & 64;
                    if (i9 == 0) {
                        i5 |= 1572864;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                        }
                    }
                    i10 = i4 & 128;
                    if (i10 == 0) {
                        i11 = i5 | 12582912;
                    } else {
                        int i18 = i5;
                        if ((i3 & 12582912) == 0) {
                            i18 |= startRestartGroup.changed(j) ? 8388608 : 4194304;
                        }
                        i11 = i18;
                    }
                    if ((i11 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                        str3 = i6 == 0 ? null : str2;
                        i12 = i7 == 0 ? 0 : i8;
                        boolean z4 = i9 == 0 ? false : z2;
                        long m13824getLabelFontSizeXSAIIZE = i10 == 0 ? HomeQuickPlayTileStyle.INSTANCE.m13824getLabelFontSizeXSAIIZE() : j;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(888707561, i11, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlayTile (HomeStubSection.kt:148)");
                        }
                        RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(HomeQuickPlayTileStyle.INSTANCE.m13822getCornerRadiusD9Ej5fM());
                        if (i12 <= 0 || z4) {
                            m13820getBadgeOverflowPadD9Ej5fM = HomeQuickPlayTileStyle.INSTANCE.m13820getBadgeOverflowPadD9Ej5fM();
                        } else {
                            m13820getBadgeOverflowPadD9Ej5fM = Dp.m7774constructorimpl(0);
                        }
                        float f = m13820getBadgeOverflowPadD9Ej5fM;
                        Modifier aspectRatio$default = AspectRatioKt.aspectRatio$default(PaddingKt.m1520paddingqDBjuR0$default(modifier4, 0.0f, f, f, 0.0f, 9, null), 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, aspectRatio$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                        float f2 = 1;
                        Modifier background$default = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), roundedCornerShape), Dp.m7774constructorimpl(f2), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape, 0.0f, 4, null);
                        int i19 = i11 >> 3;
                        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(background$default, onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i19 & 112) | 3072, 0, 1018), HomeQuickPlayTileStyle.INSTANCE.m13821getContentPaddingD9Ej5fM());
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
                        ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, i19 & 14), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, HomeQuickPlayTileStyle.INSTANCE.m13823getIconSizeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, HomeQuickPlayTileStyle.INSTANCE.m13826getLabelTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        long j3 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                        TextUnitKt.m7981checkArithmeticR2X_6o(m13824getLabelFontSizeXSAIIZE);
                        i13 = i12;
                        TextKt.m3621Text4IGK_g(label, m1520paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, HomeQuickPlayTileStyle.INSTANCE.getLabelMaxLines(), 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, m13824getLabelFontSizeXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, TextUnitKt.pack(TextUnit.m7966getRawTypeimpl(m13824getLabelFontSizeXSAIIZE), TextUnit.m7968getValueimpl(m13824getLabelFontSizeXSAIIZE) * 1.15f), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613340, (DefaultConstructorMarker) null), startRestartGroup, (i11 & 14) | 48, X2.b.f, 51196);
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1198010754);
                        if (str3 != null) {
                            i14 = 6;
                        } else {
                            i14 = 6;
                            TextKt.m3621Text4IGK_g(str3, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, HomeQuickPlayTileStyle.INSTANCE.m13829getValueTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), HomeQuickPlayTileStyle.INSTANCE.m13828getValueFontSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744412, (DefaultConstructorMarker) null), composer2, 48, 0, 65532);
                            Unit unit = Unit.INSTANCE;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.startReplaceGroup(-1509118953);
                        if (i13 <= 0) {
                            String valueOf = i13 > 99 ? "99+" : String.valueOf(i13);
                            Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(BackgroundKt.m1024backgroundbw27NRU(SizeKt.m1547defaultMinSizeVpY3zN4(OffsetKt.m1475offsetVpY3zN4(ZIndexModifierKt.zIndex(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), 1.0f), HomeQuickPlayTileStyle.INSTANCE.m13817getBadgeCornerOffsetD9Ej5fM(), Dp.m7774constructorimpl(-HomeQuickPlayTileStyle.INSTANCE.m13817getBadgeCornerOffsetD9Ej5fM())), HomeQuickPlayTileStyle.INSTANCE.m13819getBadgeMinSizeD9Ej5fM(), HomeQuickPlayTileStyle.INSTANCE.m13819getBadgeMinSizeD9Ej5fM()), ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), RoundedCornerShapeKt.getCircleShape()), Dp.m7774constructorimpl(4), Dp.m7774constructorimpl(f2));
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4610constructorimpl3 = Updater.m4610constructorimpl(composer2);
                            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            TextStyle textStyle = new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), HomeQuickPlayTileStyle.INSTANCE.m13818getBadgeFontSizeXSAIIZE(), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer2, i14), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null);
                            i15 = i13;
                            TextKt.m3621Text4IGK_g(valueOf, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer2, 0, 3072, 57342);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        } else {
                            i15 = i13;
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i16 = i15;
                        modifier3 = modifier4;
                        str4 = str3;
                        z3 = z4;
                        j2 = m13824getLabelFontSizeXSAIIZE;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        str4 = str2;
                        z3 = z2;
                        composer2 = startRestartGroup;
                        i16 = i8;
                        j2 = j;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStubSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomeQuickPlayTile_BrHU8kk$lambda$10;
                                HomeQuickPlayTile_BrHU8kk$lambda$10 = HomeStubSectionKt.HomeQuickPlayTile_BrHU8kk$lambda$10(label, i, onClick, modifier3, str4, i16, z3, j2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                return HomeQuickPlayTile_BrHU8kk$lambda$10;
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i2;
                i9 = i4 & 64;
                if (i9 == 0) {
                }
                i10 = i4 & 128;
                if (i10 == 0) {
                }
                if ((i11 & 4793491) == 4793490) {
                }
                if (i17 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(HomeQuickPlayTileStyle.INSTANCE.m13822getCornerRadiusD9Ej5fM());
                if (i12 <= 0) {
                }
                m13820getBadgeOverflowPadD9Ej5fM = HomeQuickPlayTileStyle.INSTANCE.m13820getBadgeOverflowPadD9Ej5fM();
                float f3 = m13820getBadgeOverflowPadD9Ej5fM;
                Modifier aspectRatio$default2 = AspectRatioKt.aspectRatio$default(PaddingKt.m1520paddingqDBjuR0$default(modifier4, 0.0f, f3, f3, 0.0f, 9, null), 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, aspectRatio$default2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
                float f22 = 1;
                Modifier background$default2 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), roundedCornerShape2), Dp.m7774constructorimpl(f22), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape2), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape2, 0.0f, 4, null);
                int i192 = i11 >> 3;
                Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(background$default2, onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i192 & 112) | 3072, 0, 1018), HomeQuickPlayTileStyle.INSTANCE.m13821getContentPaddingD9Ej5fM());
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center3, centerHorizontally2, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
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
                ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, i192 & 14), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, HomeQuickPlayTileStyle.INSTANCE.m13823getIconSizeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
                Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, HomeQuickPlayTileStyle.INSTANCE.m13826getLabelTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
                long j32 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                TextUnitKt.m7981checkArithmeticR2X_6o(m13824getLabelFontSizeXSAIIZE);
                i13 = i12;
                TextKt.m3621Text4IGK_g(label, m1520paddingqDBjuR0$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, HomeQuickPlayTileStyle.INSTANCE.getLabelMaxLines(), 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j32, m13824getLabelFontSizeXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, TextUnitKt.pack(TextUnit.m7966getRawTypeimpl(m13824getLabelFontSizeXSAIIZE), TextUnit.m7968getValueimpl(m13824getLabelFontSizeXSAIIZE) * 1.15f), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613340, (DefaultConstructorMarker) null), startRestartGroup, (i11 & 14) | 48, X2.b.f, 51196);
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1198010754);
                if (str3 != null) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-1509118953);
                if (i13 <= 0) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                i16 = i15;
                modifier3 = modifier4;
                str4 = str3;
                z3 = z4;
                j2 = m13824getLabelFontSizeXSAIIZE;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str2 = str;
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            i8 = i2;
            i9 = i4 & 64;
            if (i9 == 0) {
            }
            i10 = i4 & 128;
            if (i10 == 0) {
            }
            if ((i11 & 4793491) == 4793490) {
            }
            if (i17 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(HomeQuickPlayTileStyle.INSTANCE.m13822getCornerRadiusD9Ej5fM());
            if (i12 <= 0) {
            }
            m13820getBadgeOverflowPadD9Ej5fM = HomeQuickPlayTileStyle.INSTANCE.m13820getBadgeOverflowPadD9Ej5fM();
            float f32 = m13820getBadgeOverflowPadD9Ej5fM;
            Modifier aspectRatio$default22 = AspectRatioKt.aspectRatio$default(PaddingKt.m1520paddingqDBjuR0$default(modifier4, 0.0f, f32, f32, 0.0f, 9, null), 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, aspectRatio$default22);
            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            RoundedCornerShape roundedCornerShape22 = m1810RoundedCornerShape0680j_422;
            float f222 = 1;
            Modifier background$default22 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), roundedCornerShape22), Dp.m7774constructorimpl(f222), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape22), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape22, 0.0f, 4, null);
            int i1922 = i11 >> 3;
            Modifier m1516padding3ABfNKs22 = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(background$default22, onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i1922 & 112) | 3072, 0, 1018), HomeQuickPlayTileStyle.INSTANCE.m13821getContentPaddingD9Ej5fM());
            Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center32 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(center32, centerHorizontally22, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs22);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, i1922 & 14), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, HomeQuickPlayTileStyle.INSTANCE.m13823getIconSizeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, HomeQuickPlayTileStyle.INSTANCE.m13826getLabelTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
            long j322 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            TextUnitKt.m7981checkArithmeticR2X_6o(m13824getLabelFontSizeXSAIIZE);
            i13 = i12;
            TextKt.m3621Text4IGK_g(label, m1520paddingqDBjuR0$default22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, HomeQuickPlayTileStyle.INSTANCE.getLabelMaxLines(), 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j322, m13824getLabelFontSizeXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, TextUnitKt.pack(TextUnit.m7966getRawTypeimpl(m13824getLabelFontSizeXSAIIZE), TextUnit.m7968getValueimpl(m13824getLabelFontSizeXSAIIZE) * 1.15f), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613340, (DefaultConstructorMarker) null), startRestartGroup, (i11 & 14) | 48, X2.b.f, 51196);
            composer2 = startRestartGroup;
            composer2.startReplaceGroup(-1198010754);
            if (str3 != null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.startReplaceGroup(-1509118953);
            if (i13 <= 0) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            i16 = i15;
            modifier3 = modifier4;
            str4 = str3;
            z3 = z4;
            j2 = m13824getLabelFontSizeXSAIIZE;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        i8 = i2;
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        if ((i11 & 4793491) == 4793490) {
        }
        if (i17 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(HomeQuickPlayTileStyle.INSTANCE.m13822getCornerRadiusD9Ej5fM());
        if (i12 <= 0) {
        }
        m13820getBadgeOverflowPadD9Ej5fM = HomeQuickPlayTileStyle.INSTANCE.m13820getBadgeOverflowPadD9Ej5fM();
        float f322 = m13820getBadgeOverflowPadD9Ej5fM;
        Modifier aspectRatio$default222 = AspectRatioKt.aspectRatio$default(PaddingKt.m1520paddingqDBjuR0$default(modifier4, 0.0f, f322, f322, 0.0f, 9, null), 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, aspectRatio$default222);
        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash422);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        RoundedCornerShape roundedCornerShape222 = m1810RoundedCornerShape0680j_4222;
        float f2222 = 1;
        Modifier background$default222 = BackgroundKt.background$default(BorderKt.m1038borderziNgDLE(ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), roundedCornerShape222), Dp.m7774constructorimpl(f2222), ComposeUtils.AppBrushPalette.GiftBorder.INSTANCE.getBrush(), roundedCornerShape222), ComposeUtils.AppBrushPalette.GiftBackground.INSTANCE.getBrush(), roundedCornerShape222, 0.0f, 4, null);
        int i19222 = i11 >> 3;
        Modifier m1516padding3ABfNKs222 = PaddingKt.m1516padding3ABfNKs(ClickAnimationModifierKt.subtleClickAnimation(background$default222, onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i19222 & 112) | 3072, 0, 1018), HomeQuickPlayTileStyle.INSTANCE.m13821getContentPaddingD9Ej5fM());
        Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical center322 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(center322, centerHorizontally222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(i, startRestartGroup, i19222 & 14), (String) null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, HomeQuickPlayTileStyle.INSTANCE.m13823getIconSizeD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
        Modifier m1520paddingqDBjuR0$default222 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, HomeQuickPlayTileStyle.INSTANCE.m13826getLabelTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null);
        long j3222 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        TextUnitKt.m7981checkArithmeticR2X_6o(m13824getLabelFontSizeXSAIIZE);
        i13 = i12;
        TextKt.m3621Text4IGK_g(label, m1520paddingqDBjuR0$default222, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), true, HomeQuickPlayTileStyle.INSTANCE.getLabelMaxLines(), 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3222, m13824getLabelFontSizeXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, TextUnitKt.pack(TextUnit.m7966getRawTypeimpl(m13824getLabelFontSizeXSAIIZE), TextUnit.m7968getValueimpl(m13824getLabelFontSizeXSAIIZE) * 1.15f), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613340, (DefaultConstructorMarker) null), startRestartGroup, (i11 & 14) | 48, X2.b.f, 51196);
        composer2 = startRestartGroup;
        composer2.startReplaceGroup(-1198010754);
        if (str3 != null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(-1509118953);
        if (i13 <= 0) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        i16 = i15;
        modifier3 = modifier4;
        str4 = str3;
        z3 = z4;
        j2 = m13824getLabelFontSizeXSAIIZE;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void HomeQuickPlayTileSlot(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1199079369);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1199079369, i3, -1, "org.betup.ui.fragment.home.compose.sections.HomeQuickPlayTileSlot (HomeStubSection.kt:247)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
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
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.sections.HomeStubSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeQuickPlayTileSlot$lambda$12;
                    HomeQuickPlayTileSlot$lambda$12 = HomeStubSectionKt.HomeQuickPlayTileSlot$lambda$12(Modifier.this, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeQuickPlayTileSlot$lambda$12;
                }
            });
        }
    }
}
