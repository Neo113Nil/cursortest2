package org.betup.ui.common.compose;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.ironsource.InterfaceC3497ge;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.FormatHelper;

/* compiled from: VideoRewardButton.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"VideoRewardButtonBig", "", "isEnabled", "", "amount", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZJLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VideoRewardButton", "app_release", "scale", "", "currentFontSize", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoRewardButtonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoRewardButton$lambda$21(boolean z, long j, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        VideoRewardButton(z, j, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoRewardButtonBig$lambda$10(boolean z, long j, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        VideoRewardButtonBig(z, j, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoRewardButtonBig(final boolean z, final long j, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        Composer composer2;
        Modifier.Companion companion;
        Composer composer3;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        Object rememberedValue;
        int i5;
        int VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2;
        Object rememberedValue2;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        Composer composer4;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1996949354);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1996949354, i4, -1, "org.betup.ui.common.compose.VideoRewardButtonBig (VideoRewardButton.kt:51)");
                }
                Modifier modifier6 = modifier5;
                State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse_animation", startRestartGroup, 6, 0), 1.0f, !z ? 1.05f : 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 4, null), RepeatMode.Reverse, 0L, 4, null), "scale_animation", startRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
                Brush brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
                if (!z) {
                    j2 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                } else {
                    j2 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                }
                long j3 = j2;
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier6);
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
                float f = 100;
                Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(AlphaKt.alpha(ScaleKt.scale(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), !z ? VideoRewardButtonBig$lambda$0(animateFloat) : 1.0f), !z ? 1.0f : 0.5f), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                startRestartGroup.startReplaceGroup(1389780107);
                if (!z) {
                    modifier3 = m1038borderziNgDLE;
                    composer2 = startRestartGroup;
                    companion = ClickAnimationModifierKt.subtleClickAnimation(Modifier.INSTANCE, onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, composer2, ((i4 >> 3) & 112) | 3078, 0, 1018);
                } else {
                    modifier3 = m1038borderziNgDLE;
                    composer2 = startRestartGroup;
                    companion = Modifier.INSTANCE;
                }
                composer2.endReplaceGroup();
                float f2 = 12;
                float f3 = 6;
                Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(modifier3.then(companion), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                composer3 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1519paddingqDBjuR0);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), null, false, 3, null);
                Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, start, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, wrapContentWidth$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String stringResource = StringResources_androidKt.stringResource(R.string.ad_reward, composer3, 6);
                composer3.startReplaceGroup(1849434622);
                rememberedValue = composer3.rememberedValue();
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                    i5 = 2;
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer3.updateRememberedValue(rememberedValue);
                } else {
                    i5 = 2;
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                composer3.endReplaceGroup();
                long sp = TextUnitKt.getSp(18);
                VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 = VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2(mutableState);
                if (VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 != 0) {
                    if (VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 == 1) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.9f);
                    } else if (VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 == i5) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.8f);
                    } else if (VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 == 3) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.7f);
                    } else if (VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 == 4) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.6f);
                    } else if (VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 == 5) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.5f);
                    } else {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.4f);
                    }
                }
                long j4 = sp;
                TextStyle textStyle = new TextStyle(j3, j4, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
                int m7709getClipgIe3tQ8 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                composer3.startReplaceGroup(5004770);
                rememberedValue2 = composer3.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.VideoRewardButtonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$5$lambda$4;
                            VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$5$lambda$4 = VideoRewardButtonKt.VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$5$lambda$4(MutableState.this, (TextLayoutResult) obj);
                            return VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$5$lambda$4;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue2);
                }
                composer3.endReplaceGroup();
                TextKt.m2642Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue2, textStyle, composer3, 0, 199728, 22526);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer4 = composer3;
                TextKt.m2642Text4IGK_g(j <= 0 ? "+" + FormatHelper.getShopBetcoinsFormated(j) : "+0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, j4, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ad_video_rew, composer4, 6), "Video Reward", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(54)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer4 = startRestartGroup;
            }
            endRestartGroup = composer4.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.VideoRewardButtonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit VideoRewardButtonBig$lambda$10;
                        VideoRewardButtonBig$lambda$10 = VideoRewardButtonKt.VideoRewardButtonBig$lambda$10(z, j, onClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return VideoRewardButtonBig$lambda$10;
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
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier62 = modifier5;
        State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse_animation", startRestartGroup, 6, 0), 1.0f, !z ? 1.05f : 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 4, null), RepeatMode.Reverse, 0L, 4, null), "scale_animation", startRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
        Brush brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
        if (!z) {
        }
        long j32 = j2;
        Alignment center3 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier62);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        float f4 = 100;
        Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(AlphaKt.alpha(ScaleKt.scale(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), !z ? VideoRewardButtonBig$lambda$0(animateFloat2) : 1.0f), !z ? 1.0f : 0.5f), brush2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
        startRestartGroup.startReplaceGroup(1389780107);
        if (!z) {
        }
        composer2.endReplaceGroup();
        float f22 = 12;
        float f32 = 6;
        Modifier m1519paddingqDBjuR02 = PaddingKt.m1519paddingqDBjuR0(modifier3.then(companion), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32));
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f22));
        composer3 = composer2;
        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_43, centerVertically3, composer3, 54);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, m1519paddingqDBjuR02);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        Modifier wrapContentWidth$default2 = SizeKt.wrapContentWidth$default(PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), null, false, 3, null);
        Alignment.Horizontal start2 = Alignment.INSTANCE.getStart();
        Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center22, start2, composer3, 54);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, wrapContentWidth$default2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        String stringResource2 = StringResources_androidKt.stringResource(R.string.ad_reward, composer3, 6);
        composer3.startReplaceGroup(1849434622);
        rememberedValue = composer3.rememberedValue();
        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2 = (MutableState) rememberedValue;
        composer3.endReplaceGroup();
        long sp2 = TextUnitKt.getSp(18);
        VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 = VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2(mutableState2);
        if (VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2 != 0) {
        }
        long j42 = sp2;
        TextStyle textStyle2 = new TextStyle(j32, j42, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
        int m7709getClipgIe3tQ82 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
        composer3.startReplaceGroup(5004770);
        rememberedValue2 = composer3.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        composer3.endReplaceGroup();
        TextKt.m2642Text4IGK_g(stringResource2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ82, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue2, textStyle2, composer3, 0, 199728, 22526);
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion22 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, centerVertically22, composer3, 54);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap42 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer3, companion22);
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        composer4 = composer3;
        TextKt.m2642Text4IGK_g(j <= 0 ? "+" + FormatHelper.getShopBetcoinsFormated(j) : "+0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j32, j42, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(18)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ad_video_rew, composer4, 6), "Video Reward", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(54)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier62;
        endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final int VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$3(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$5$lambda$4(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.getMultiParagraph().getWidth() > ((int) (textLayoutResult.getSize() >> 32)) && VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2(mutableState) < 6) {
            VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$3(mutableState, VideoRewardButtonBig$lambda$9$lambda$8$lambda$7$lambda$2(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoRewardButton(final boolean z, final long j, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier3;
        Composer composer2;
        int i5;
        Modifier.Companion companion;
        Composer composer3;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        Object rememberedValue;
        int i6;
        Alignment.Horizontal horizontal;
        int VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13;
        Object rememberedValue2;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        Composer composer4;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1836816986);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1836816986, i4, -1, "org.betup.ui.common.compose.VideoRewardButton (VideoRewardButton.kt:187)");
                }
                Modifier modifier6 = modifier5;
                State<Float> animateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse_animation", startRestartGroup, 6, 0), 1.0f, !z ? 1.05f : 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 4, null), RepeatMode.Reverse, 0L, 4, null), "scale_animation", startRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
                Brush brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
                if (!z) {
                    j2 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                } else {
                    j2 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                }
                long j3 = j2;
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier6);
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
                float f = 100;
                Modifier m1038borderziNgDLE = BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(AlphaKt.alpha(ScaleKt.scale(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), !z ? VideoRewardButton$lambda$11(animateFloat) : 1.0f), !z ? 1.0f : 0.5f), brush, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f)));
                startRestartGroup.startReplaceGroup(-1019649789);
                if (!z) {
                    modifier3 = m1038borderziNgDLE;
                    i5 = 9;
                    composer2 = startRestartGroup;
                    companion = ClickAnimationModifierKt.subtleClickAnimation(Modifier.INSTANCE, onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, composer2, ((i4 >> 3) & 112) | 3078, 0, 1018);
                } else {
                    modifier3 = m1038borderziNgDLE;
                    composer2 = startRestartGroup;
                    i5 = 9;
                    companion = Modifier.INSTANCE;
                }
                composer2.endReplaceGroup();
                float f2 = 6;
                float f3 = 3;
                Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(modifier3.then(companion), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3), Dp.m7774constructorimpl(f3));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
                composer3 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, centerVertically, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1519paddingqDBjuR0);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Horizontal start = Alignment.INSTANCE.getStart();
                Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, start, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1520paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor3);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String stringResource = StringResources_androidKt.stringResource(R.string.ad_reward, composer3, 6);
                composer3.startReplaceGroup(1849434622);
                rememberedValue = composer3.rememberedValue();
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                    i6 = 2;
                    horizontal = null;
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    composer3.updateRememberedValue(rememberedValue);
                } else {
                    i6 = 2;
                    horizontal = null;
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                composer3.endReplaceGroup();
                long sp = TextUnitKt.getSp(i5);
                VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 = VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13(mutableState);
                if (VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 != 0) {
                    if (VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 == 1) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.9f);
                    } else if (VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 == i6) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.8f);
                    } else if (VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 == 3) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.7f);
                    } else if (VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 == 4) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.6f);
                    } else if (VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 == 5) {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.5f);
                    } else {
                        sp = TextUnitKt.getSp(TextUnit.m7968getValueimpl(sp) * 0.4f);
                    }
                }
                long j4 = sp;
                Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal, false, 3, horizontal);
                TextStyle textStyle = new TextStyle(j3, j4, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
                int m7709getClipgIe3tQ8 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
                composer3.startReplaceGroup(5004770);
                rememberedValue2 = composer3.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: org.betup.ui.common.compose.VideoRewardButtonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$16$lambda$15;
                            VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$16$lambda$15 = VideoRewardButtonKt.VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$16$lambda$15(MutableState.this, (TextLayoutResult) obj);
                            return VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$16$lambda$15;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue2);
                }
                composer3.endReplaceGroup();
                TextKt.m2642Text4IGK_g(stringResource, wrapContentWidth$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ8, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue2, textStyle, composer3, 48, 199728, 22524);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(i6));
                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_42, centerVertically2, composer3, 54);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer4 = composer3;
                TextKt.m2642Text4IGK_g(j <= 0 ? "+" + FormatHelper.getShopBetcoinsFormated(j) : "+0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j3, j4, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ad_video_rew, composer4, 6), "Video Reward", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(27)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer4.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer4 = startRestartGroup;
            }
            endRestartGroup = composer4.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.common.compose.VideoRewardButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit VideoRewardButton$lambda$21;
                        VideoRewardButton$lambda$21 = VideoRewardButtonKt.VideoRewardButton$lambda$21(z, j, onClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return VideoRewardButton$lambda$21;
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
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier62 = modifier5;
        State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("pulse_animation", startRestartGroup, 6, 0), 1.0f, !z ? 1.05f : 1.0f, AnimationSpecKt.m925infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 4, null), RepeatMode.Reverse, 0L, 4, null), "scale_animation", startRestartGroup, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
        Brush brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGrayBackground.INSTANCE.getBrush();
        if (!z) {
        }
        long j32 = j2;
        Alignment center3 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier62);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        float f4 = 100;
        Modifier m1038borderziNgDLE2 = BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(AlphaKt.alpha(ScaleKt.scale(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), !z ? VideoRewardButton$lambda$11(animateFloat2) : 1.0f), !z ? 1.0f : 0.5f), brush2, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(f4)));
        startRestartGroup.startReplaceGroup(-1019649789);
        if (!z) {
        }
        composer2.endReplaceGroup();
        float f22 = 6;
        float f32 = 3;
        Modifier m1519paddingqDBjuR02 = PaddingKt.m1519paddingqDBjuR0(modifier3.then(companion), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32), Dp.m7774constructorimpl(f32));
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_43 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f22));
        composer3 = composer2;
        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_43, centerVertically3, composer3, 54);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, m1519paddingqDBjuR02);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null);
        Alignment.Horizontal start2 = Alignment.INSTANCE.getStart();
        Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center22, start2, composer3, 54);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, m1520paddingqDBjuR0$default2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        String stringResource2 = StringResources_androidKt.stringResource(R.string.ad_reward, composer3, 6);
        composer3.startReplaceGroup(1849434622);
        rememberedValue = composer3.rememberedValue();
        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState2 = (MutableState) rememberedValue;
        composer3.endReplaceGroup();
        long sp2 = TextUnitKt.getSp(i5);
        VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 = VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13(mutableState2);
        if (VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13 != 0) {
        }
        long j42 = sp2;
        Modifier wrapContentWidth$default2 = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, horizontal, false, 3, horizontal);
        TextStyle textStyle2 = new TextStyle(j32, j42, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null);
        int m7709getClipgIe3tQ82 = TextOverflow.INSTANCE.m7709getClipgIe3tQ8();
        composer3.startReplaceGroup(5004770);
        rememberedValue2 = composer3.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        composer3.endReplaceGroup();
        TextKt.m2642Text4IGK_g(stringResource2, wrapContentWidth$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, m7709getClipgIe3tQ82, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) rememberedValue2, textStyle2, composer3, 48, 199728, 22524);
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_422 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(i6));
        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion22 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m1397spacedBy0680j_422, centerVertically22, composer3, 54);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap42 = composer3.getCurrentCompositionLocalMap();
        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer3, companion22);
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (!composer3.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(composer3);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        composer4 = composer3;
        TextKt.m2642Text4IGK_g(j <= 0 ? "+" + FormatHelper.getShopBetcoinsFormated(j) : "+0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j32, j42, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer3, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer4, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.betcoin, composer4, 6), "Betcoin", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(i5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ad_video_rew, composer4, 6), "Video Reward", SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(27)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 432, 120);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        ComposerKt.sourceInformationMarkerEnd(composer4);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier62;
        endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final int VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$14(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$16$lambda$15(MutableState mutableState, TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        if (textLayoutResult.getMultiParagraph().getWidth() > ((int) (textLayoutResult.getSize() >> 32)) && VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13(mutableState) < 6) {
            VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$14(mutableState, VideoRewardButton$lambda$20$lambda$19$lambda$18$lambda$13(mutableState) + 1);
        }
        return Unit.INSTANCE;
    }

    private static final float VideoRewardButtonBig$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float VideoRewardButton$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }
}
