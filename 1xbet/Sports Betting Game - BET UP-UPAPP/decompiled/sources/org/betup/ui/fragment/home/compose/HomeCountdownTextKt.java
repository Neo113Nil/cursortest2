package org.betup.ui.fragment.home.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.ironsource.X2;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeCountdownText.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a3\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aG\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\u00072\b\b\u0001\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u001b¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"rememberTickingNowMs", "", "enabled", "", "intervalMs", "(ZJLandroidx/compose/runtime/Composer;II)J", "HomeMonospaceCountdownText", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "HomeMonospaceCountdownText--jt2gSs", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "HomeCountdownInlineText", "formatRes", "", "remainingMs", "minHeight", "HomeCountdownInlineText-AGcomas", "(IJLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;FFLandroidx/compose/runtime/Composer;II)V", "HomeCountdownStackedText", "labelRes", "(IJLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "nowMs"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeCountdownTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeCountdownInlineText_AGcomas$lambda$7(int i, long j, TextStyle textStyle, Modifier modifier, float f, float f2, int i2, int i3, Composer composer, int i4) {
        m13757HomeCountdownInlineTextAGcomas(i, j, textStyle, modifier, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeCountdownStackedText$lambda$9(int i, long j, TextStyle textStyle, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        HomeCountdownStackedText(i, j, textStyle, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMonospaceCountdownText__jt2gSs$lambda$4(String str, TextStyle textStyle, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        m13758HomeMonospaceCountdownTextjt2gSs(str, textStyle, modifier, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final long rememberTickingNowMs(boolean z, long j, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1534429070);
        boolean z2 = true;
        boolean z3 = (i2 & 1) != 0 ? true : z;
        if ((i2 & 2) != 0) {
            j = 1000;
        }
        long j2 = j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1534429070, i, -1, "org.betup.ui.fragment.home.compose.rememberTickingNowMs (HomeCountdownText.kt:45)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotLongStateKt.mutableLongStateOf(System.currentTimeMillis());
            composer.updateRememberedValue(rememberedValue);
        }
        MutableLongState mutableLongState = (MutableLongState) rememberedValue;
        composer.endReplaceGroup();
        Boolean valueOf = Boolean.valueOf(z3);
        Long valueOf2 = Long.valueOf(j2);
        composer.startReplaceGroup(-1746271574);
        boolean z4 = (((i & 14) ^ 6) > 4 && composer.changed(z3)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(j2)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        HomeCountdownTextKt$rememberTickingNowMs$1$1 rememberedValue2 = composer.rememberedValue();
        if (z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new HomeCountdownTextKt$rememberTickingNowMs$1$1(z3, j2, mutableLongState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, composer, i & 126);
        long rememberTickingNowMs$lambda$1 = rememberTickingNowMs$lambda$1(mutableLongState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberTickingNowMs$lambda$1;
    }

    private static final long rememberTickingNowMs$lambda$1(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* renamed from: HomeMonospaceCountdownText--jt2gSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13758HomeMonospaceCountdownTextjt2gSs(final String text, final TextStyle style, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f2;
        int i5;
        Composer composer2;
        TextStyle m7263copyp1EtxEg;
        final float f3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer startRestartGroup = composer.startRestartGroup(-112765042);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(style) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                i5 = i3;
                if ((i5 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    float m7774constructorimpl = i4 != 0 ? Dp.m7774constructorimpl(56) : f2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-112765042, i5, -1, "org.betup.ui.fragment.home.compose.HomeMonospaceCountdownText (HomeCountdownText.kt:63)");
                    }
                    Modifier m1570widthInVpY3zN4$default = SizeKt.m1570widthInVpY3zN4$default(modifier4, m7774constructorimpl, 0.0f, 2, null);
                    float f4 = m7774constructorimpl;
                    Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    m7263copyp1EtxEg = style.m7263copyp1EtxEg((r48 & 1) != 0 ? style.spanStyle.m7178getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? style.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? style.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? style.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? style.spanStyle.getFontFamily() : FontFamily.INSTANCE.getMonospace(), (r48 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? style.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? style.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? style.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? style.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? style.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? style.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? style.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? style.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? style.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? style.platformStyle : null, (r48 & 1048576) != 0 ? style.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? style.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? style.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? style.paragraphStyle.getTextMotion() : null);
                    TextKt.m3621Text4IGK_g(text, m1570widthInVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m7263copyp1EtxEg, composer2, i5 & 14, X2.b.f, 50684);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = f4;
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f3 = f2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.HomeCountdownTextKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit HomeMonospaceCountdownText__jt2gSs$lambda$4;
                            HomeMonospaceCountdownText__jt2gSs$lambda$4 = HomeCountdownTextKt.HomeMonospaceCountdownText__jt2gSs$lambda$4(text, style, modifier3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return HomeMonospaceCountdownText__jt2gSs$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            i5 = i3;
            if ((i5 & 1171) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m1570widthInVpY3zN4$default2 = SizeKt.m1570widthInVpY3zN4$default(modifier4, m7774constructorimpl, 0.0f, 2, null);
            float f42 = m7774constructorimpl;
            Modifier modifier52 = modifier4;
            composer2 = startRestartGroup;
            m7263copyp1EtxEg = style.m7263copyp1EtxEg((r48 & 1) != 0 ? style.spanStyle.m7178getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? style.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? style.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? style.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? style.spanStyle.getFontFamily() : FontFamily.INSTANCE.getMonospace(), (r48 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? style.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? style.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? style.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? style.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? style.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? style.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? style.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? style.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? style.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? style.platformStyle : null, (r48 & 1048576) != 0 ? style.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? style.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? style.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? style.paragraphStyle.getTextMotion() : null);
            TextKt.m3621Text4IGK_g(text, m1570widthInVpY3zN4$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m7263copyp1EtxEg, composer2, i5 & 14, X2.b.f, 50684);
            if (ComposerKt.isTraceInProgress()) {
            }
            f3 = f42;
            modifier3 = modifier52;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m1570widthInVpY3zN4$default22 = SizeKt.m1570widthInVpY3zN4$default(modifier4, m7774constructorimpl, 0.0f, 2, null);
        float f422 = m7774constructorimpl;
        Modifier modifier522 = modifier4;
        composer2 = startRestartGroup;
        m7263copyp1EtxEg = style.m7263copyp1EtxEg((r48 & 1) != 0 ? style.spanStyle.m7178getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? style.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? style.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? style.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? style.spanStyle.getFontFamily() : FontFamily.INSTANCE.getMonospace(), (r48 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? style.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? style.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? style.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? style.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? style.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? style.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? style.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? style.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? style.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? style.platformStyle : null, (r48 & 1048576) != 0 ? style.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? style.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? style.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? style.paragraphStyle.getTextMotion() : null);
        TextKt.m3621Text4IGK_g(text, m1570widthInVpY3zN4$default22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, m7263copyp1EtxEg, composer2, i5 & 14, X2.b.f, 50684);
        if (ComposerKt.isTraceInProgress()) {
        }
        f3 = f422;
        modifier3 = modifier522;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007e  */
    /* renamed from: HomeCountdownInlineText-AGcomas, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13757HomeCountdownInlineTextAGcomas(final int i, final long j, final TextStyle style, Modifier modifier, float f, float f2, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        float f3;
        int i6;
        float f4;
        int i7;
        int indexOf$default;
        Composer composer2;
        final Modifier modifier3;
        final float f5;
        final float f6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(style, "style");
        Composer startRestartGroup = composer.startRestartGroup(-489833084);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(style) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    f4 = f2;
                    i4 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                    i7 = i4;
                    if ((74899 & i7) == 74898 || !startRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i5 != 0) {
                            f3 = Dp.m7774constructorimpl(Opcodes.F2L);
                        }
                        if (i6 != 0) {
                            f4 = Dp.m7774constructorimpl(18);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-489833084, i7, -1, "org.betup.ui.fragment.home.compose.HomeCountdownInlineText (HomeCountdownText.kt:86)");
                        }
                        String formatHms = HomeCountdownFormat.INSTANCE.formatHms(j);
                        String stringResource = StringResources_androidKt.stringResource(i, new Object[]{formatHms}, startRestartGroup, i7 & 14);
                        indexOf$default = StringsKt.indexOf$default((CharSequence) stringResource, formatHms, 0, false, 6, (Object) null);
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        if (indexOf$default < 0) {
                            String substring = stringResource.substring(0, indexOf$default);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            builder.append(substring);
                            int pushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamily.INSTANCE.getMonospace(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null));
                            try {
                                builder.append(formatHms);
                                Unit unit = Unit.INSTANCE;
                                builder.pop(pushStyle);
                                String substring2 = stringResource.substring(indexOf$default + formatHms.length());
                                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                                builder.append(substring2);
                            } catch (Throwable th) {
                                builder.pop(pushStyle);
                                throw th;
                            }
                        } else {
                            builder.append(stringResource);
                        }
                        Modifier modifier4 = modifier2;
                        float f7 = f3;
                        float f8 = f4;
                        composer2 = startRestartGroup;
                        TextKt.m3622TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.m1570widthInVpY3zN4$default(SizeKt.m1549height3ABfNKs(modifier2, f4), f3, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, null, null, style, composer2, 0, ((i7 << 15) & 29360128) | X2.b.f, 116732);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        f5 = f7;
                        f6 = f8;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        f5 = f3;
                        f6 = f4;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.HomeCountdownTextKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomeCountdownInlineText_AGcomas$lambda$7;
                                HomeCountdownInlineText_AGcomas$lambda$7 = HomeCountdownTextKt.HomeCountdownInlineText_AGcomas$lambda$7(i, j, style, modifier3, f5, f6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                return HomeCountdownInlineText_AGcomas$lambda$7;
                            }
                        });
                        return;
                    }
                    return;
                }
                f4 = f2;
                i7 = i4;
                if ((74899 & i7) == 74898) {
                }
                if (i8 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                String formatHms2 = HomeCountdownFormat.INSTANCE.formatHms(j);
                String stringResource2 = StringResources_androidKt.stringResource(i, new Object[]{formatHms2}, startRestartGroup, i7 & 14);
                indexOf$default = StringsKt.indexOf$default((CharSequence) stringResource2, formatHms2, 0, false, 6, (Object) null);
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                if (indexOf$default < 0) {
                }
                Modifier modifier42 = modifier2;
                float f72 = f3;
                float f82 = f4;
                composer2 = startRestartGroup;
                TextKt.m3622TextIbK3jfQ(builder2.toAnnotatedString(), SizeKt.m1570widthInVpY3zN4$default(SizeKt.m1549height3ABfNKs(modifier2, f4), f3, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, null, null, style, composer2, 0, ((i7 << 15) & 29360128) | X2.b.f, 116732);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                f5 = f72;
                f6 = f82;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            f4 = f2;
            i7 = i4;
            if ((74899 & i7) == 74898) {
            }
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String formatHms22 = HomeCountdownFormat.INSTANCE.formatHms(j);
            String stringResource22 = StringResources_androidKt.stringResource(i, new Object[]{formatHms22}, startRestartGroup, i7 & 14);
            indexOf$default = StringsKt.indexOf$default((CharSequence) stringResource22, formatHms22, 0, false, 6, (Object) null);
            AnnotatedString.Builder builder22 = new AnnotatedString.Builder(0, 1, null);
            if (indexOf$default < 0) {
            }
            Modifier modifier422 = modifier2;
            float f722 = f3;
            float f822 = f4;
            composer2 = startRestartGroup;
            TextKt.m3622TextIbK3jfQ(builder22.toAnnotatedString(), SizeKt.m1570widthInVpY3zN4$default(SizeKt.m1549height3ABfNKs(modifier2, f4), f3, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, null, null, style, composer2, 0, ((i7 << 15) & 29360128) | X2.b.f, 116732);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            f5 = f722;
            f6 = f822;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        f4 = f2;
        i7 = i4;
        if ((74899 & i7) == 74898) {
        }
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        String formatHms222 = HomeCountdownFormat.INSTANCE.formatHms(j);
        String stringResource222 = StringResources_androidKt.stringResource(i, new Object[]{formatHms222}, startRestartGroup, i7 & 14);
        indexOf$default = StringsKt.indexOf$default((CharSequence) stringResource222, formatHms222, 0, false, 6, (Object) null);
        AnnotatedString.Builder builder222 = new AnnotatedString.Builder(0, 1, null);
        if (indexOf$default < 0) {
        }
        Modifier modifier4222 = modifier2;
        float f7222 = f3;
        float f8222 = f4;
        composer2 = startRestartGroup;
        TextKt.m3622TextIbK3jfQ(builder222.toAnnotatedString(), SizeKt.m1570widthInVpY3zN4$default(SizeKt.m1549height3ABfNKs(modifier2, f4), f3, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7709getClipgIe3tQ8(), false, 1, 0, null, null, style, composer2, 0, ((i7 << 15) & 29360128) | X2.b.f, 116732);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        f5 = f7222;
        f6 = f8222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeCountdownStackedText(final int i, final long j, final TextStyle style, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(style, "style");
        Composer startRestartGroup = composer.startRestartGroup(2062819210);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changed(style) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i5 = i4;
            if ((i5 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2062819210, i5, -1, "org.betup.ui.fragment.home.compose.HomeCountdownStackedText (HomeCountdownText.kt:122)");
                }
                String formatHms = HomeCountdownFormat.INSTANCE.formatHms(j);
                Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                composer2 = startRestartGroup;
                TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(i, startRestartGroup, i5 & 14), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, style, composer2, 0, ((i5 << 12) & 3670016) | 3072, 56830);
                m13758HomeMonospaceCountdownTextjt2gSs(formatHms, style, null, Dp.m7774constructorimpl(72), composer2, ((i5 >> 3) & 112) | 3072, 4);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.HomeCountdownTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeCountdownStackedText$lambda$9;
                        HomeCountdownStackedText$lambda$9 = HomeCountdownTextKt.HomeCountdownStackedText$lambda$9(i, j, style, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeCountdownStackedText$lambda$9;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i5 = i4;
        if ((i5 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        String formatHms2 = HomeCountdownFormat.INSTANCE.formatHms(j);
        Alignment.Horizontal end2 = Alignment.INSTANCE.getEnd();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
        composer2 = startRestartGroup;
        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(i, startRestartGroup, i5 & 14), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, style, composer2, 0, ((i5 << 12) & 3670016) | 3072, 56830);
        m13758HomeMonospaceCountdownTextjt2gSs(formatHms2, style, null, Dp.m7774constructorimpl(72), composer2, ((i5 >> 3) & 112) | 3072, 4);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
