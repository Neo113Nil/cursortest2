package org.betup.ui.common.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.ui.views.ComposeUtils;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: AutoResizeSiblingsText.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aM\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!\u001aS\u0010\"\u001a\u00020\t2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u0012H\u0007¢\u0006\u0004\b*\u0010+\u001aU\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100\u001a8\u00101\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0010H\u0002\u001a0\u00105\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000eH\u0002¨\u00066"}, d2 = {"CalculateAutoResizeSiblingLabelValueFontSizes", "Lorg/betup/ui/common/compose/AutoResizeSiblingFontSizes;", "labels", "", "", "values", "textAreaWidthPx", "", "labelBaseFontSize", "Landroidx/compose/ui/unit/TextUnit;", "labelMinFontSize", "valueBaseFontSize", "valueMinFontSize", "labelMaxLines", "", "labelShrinkSingleLongWordOnly", "", "labelStyle", "Landroidx/compose/ui/text/TextStyle;", "valueStyle", "CalculateAutoResizeSiblingLabelValueFontSizes-9WM6Nnc", "(Ljava/util/List;Ljava/util/List;FJJJJIZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)Lorg/betup/ui/common/compose/AutoResizeSiblingFontSizes;", "statTileTextAreaWidthPx", "rowMaxWidthPx", "tileCount", "density", "Landroidx/compose/ui/unit/Density;", "horizontalGap", "Landroidx/compose/ui/unit/Dp;", "tileHorizontalPadding", "iconSize", "iconTextGap", "statTileTextAreaWidthPx-Fb0jozE", "(FILandroidx/compose/ui/unit/Density;FFFF)F", "CalculateAutoResizeFontSizeForWidth", "texts", "baseFontSize", "minFontSize", "targetWidthPx", "shrinkSingleLongWordOnly", "maxLines", "textStyle", "CalculateAutoResizeFontSizeForWidth-a8pgNYE", "(Ljava/util/List;JJFZILandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)J", "calculateAutoResizeFontSizeForWidth", "measurer", "Landroidx/compose/ui/text/TextMeasurer;", "calculateAutoResizeFontSizeForWidth-mFA2TWU", "(Landroidx/compose/ui/text/TextMeasurer;Ljava/util/List;JJFZILandroidx/compose/ui/text/TextStyle;)J", "requiredScaleForText", "text", "style", "maxWidthPx", "measureTextScale", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoResizeSiblingsTextKt {
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015a, code lost:
    
        if (r64.changed(r51) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d7, code lost:
    
        if (r64.changed(r1) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f8, code lost:
    
        if (r64.changed(r5) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022d, code lost:
    
        if (r64.changed(r3) == false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    /* renamed from: CalculateAutoResizeSiblingLabelValueFontSizes-9WM6Nnc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AutoResizeSiblingFontSizes m12899CalculateAutoResizeSiblingLabelValueFontSizes9WM6Nnc(List<String> labels, List<String> values, float f, long j, long j2, long j3, long j4, int i, boolean z, TextStyle textStyle, TextStyle textStyle2, Composer composer, int i2, int i3, int i4) {
        TextStyle textStyle3;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        long j5;
        boolean z5;
        TextStyle textStyle4;
        boolean z6;
        boolean z7;
        Object rememberedValue;
        Intrinsics.checkNotNullParameter(labels, "labels");
        Intrinsics.checkNotNullParameter(values, "values");
        composer.startReplaceGroup(-1399736260);
        long sp = (i4 & 8) != 0 ? TextUnitKt.getSp(11) : j;
        long sp2 = (i4 & 16) != 0 ? TextUnitKt.getSp(8) : j2;
        long sp3 = (i4 & 32) != 0 ? TextUnitKt.getSp(18) : j3;
        long sp4 = (i4 & 64) != 0 ? TextUnitKt.getSp(12) : j4;
        int i6 = (i4 & 128) != 0 ? 2 : i;
        boolean z8 = (i4 & 256) != 0 ? true : z;
        TextStyle textStyle5 = (i4 & 512) != 0 ? new TextStyle(0L, 0L, FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.openSansFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (DefaultConstructorMarker) null) : textStyle;
        TextStyle textStyle6 = (i4 & 1024) != 0 ? new TextStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (DefaultConstructorMarker) null) : textStyle2;
        if (ComposerKt.isTraceInProgress()) {
            textStyle3 = textStyle6;
            ComposerKt.traceEventStart(-1399736260, i2, i3, "org.betup.ui.common.compose.CalculateAutoResizeSiblingLabelValueFontSizes (AutoResizeSiblingsText.kt:51)");
        } else {
            textStyle3 = textStyle6;
        }
        TextMeasurer rememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composer, 0, 1);
        String joinToString$default = CollectionsKt.joinToString$default(labels, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, null, null, 0, null, null, 62, null);
        String joinToString$default2 = CollectionsKt.joinToString$default(values, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, null, null, 0, null, null, 62, null);
        composer.startReplaceGroup(-1224400529);
        boolean changed = composer.changed(joinToString$default) | composer.changed(joinToString$default2);
        if (((i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) <= 256) {
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) != 256) {
            z2 = false;
            boolean z9 = changed | z2 | ((((i2 & 7168) ^ 3072) <= 2048 && composer.changed(sp)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(sp2)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(sp3)) || (196608 & i2) == 131072) | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.changed(sp4)) || (1572864 & i2) == 1048576);
            if (((29360128 & i2) ^ 12582912) <= 8388608) {
                i5 = i6;
            } else {
                i5 = i6;
            }
            if ((i2 & 12582912) != 8388608) {
                z3 = false;
                boolean z10 = z9 | z3;
                if (((234881024 & i2) ^ 100663296) > 67108864) {
                    z4 = z8;
                    j5 = sp4;
                } else {
                    z4 = z8;
                    j5 = sp4;
                }
                if ((i2 & 100663296) != 67108864) {
                    z5 = false;
                    boolean z11 = z10 | z5 | ((((1879048192 & i2) ^ 805306368) <= 536870912 && composer.changed(textStyle5)) || (i2 & 805306368) == 536870912);
                    if (((i3 & 14) ^ 6) <= 4) {
                        textStyle4 = textStyle3;
                    } else {
                        textStyle4 = textStyle3;
                    }
                    if ((i3 & 6) != 4) {
                        z6 = false;
                        z7 = z11 | z6;
                        rememberedValue = composer.rememberedValue();
                        if (!z7 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            AutoResizeSiblingFontSizes autoResizeSiblingFontSizes = new AutoResizeSiblingFontSizes(m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, labels, sp, sp2, f, z4, i5, textStyle5), m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, values, sp3, j5, f, false, 1, textStyle4), null);
                            composer.updateRememberedValue(autoResizeSiblingFontSizes);
                            rememberedValue = autoResizeSiblingFontSizes;
                        }
                        AutoResizeSiblingFontSizes autoResizeSiblingFontSizes2 = (AutoResizeSiblingFontSizes) rememberedValue;
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        return autoResizeSiblingFontSizes2;
                    }
                    z6 = true;
                    z7 = z11 | z6;
                    rememberedValue = composer.rememberedValue();
                    if (!z7) {
                    }
                    AutoResizeSiblingFontSizes autoResizeSiblingFontSizes3 = new AutoResizeSiblingFontSizes(m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, labels, sp, sp2, f, z4, i5, textStyle5), m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, values, sp3, j5, f, false, 1, textStyle4), null);
                    composer.updateRememberedValue(autoResizeSiblingFontSizes3);
                    rememberedValue = autoResizeSiblingFontSizes3;
                    AutoResizeSiblingFontSizes autoResizeSiblingFontSizes22 = (AutoResizeSiblingFontSizes) rememberedValue;
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer.endReplaceGroup();
                    return autoResizeSiblingFontSizes22;
                }
                z5 = true;
                boolean z112 = z10 | z5 | ((((1879048192 & i2) ^ 805306368) <= 536870912 && composer.changed(textStyle5)) || (i2 & 805306368) == 536870912);
                if (((i3 & 14) ^ 6) <= 4) {
                }
                if ((i3 & 6) != 4) {
                }
                z6 = true;
                z7 = z112 | z6;
                rememberedValue = composer.rememberedValue();
                if (!z7) {
                }
                AutoResizeSiblingFontSizes autoResizeSiblingFontSizes32 = new AutoResizeSiblingFontSizes(m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, labels, sp, sp2, f, z4, i5, textStyle5), m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, values, sp3, j5, f, false, 1, textStyle4), null);
                composer.updateRememberedValue(autoResizeSiblingFontSizes32);
                rememberedValue = autoResizeSiblingFontSizes32;
                AutoResizeSiblingFontSizes autoResizeSiblingFontSizes222 = (AutoResizeSiblingFontSizes) rememberedValue;
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                return autoResizeSiblingFontSizes222;
            }
            z3 = true;
            boolean z102 = z9 | z3;
            if (((234881024 & i2) ^ 100663296) > 67108864) {
            }
            if ((i2 & 100663296) != 67108864) {
            }
            z5 = true;
            boolean z1122 = z102 | z5 | ((((1879048192 & i2) ^ 805306368) <= 536870912 && composer.changed(textStyle5)) || (i2 & 805306368) == 536870912);
            if (((i3 & 14) ^ 6) <= 4) {
            }
            if ((i3 & 6) != 4) {
            }
            z6 = true;
            z7 = z1122 | z6;
            rememberedValue = composer.rememberedValue();
            if (!z7) {
            }
            AutoResizeSiblingFontSizes autoResizeSiblingFontSizes322 = new AutoResizeSiblingFontSizes(m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, labels, sp, sp2, f, z4, i5, textStyle5), m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, values, sp3, j5, f, false, 1, textStyle4), null);
            composer.updateRememberedValue(autoResizeSiblingFontSizes322);
            rememberedValue = autoResizeSiblingFontSizes322;
            AutoResizeSiblingFontSizes autoResizeSiblingFontSizes2222 = (AutoResizeSiblingFontSizes) rememberedValue;
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            return autoResizeSiblingFontSizes2222;
        }
        z2 = true;
        boolean z92 = changed | z2 | ((((i2 & 7168) ^ 3072) <= 2048 && composer.changed(sp)) || (i2 & 3072) == 2048) | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(sp2)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(sp3)) || (196608 & i2) == 131072) | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.changed(sp4)) || (1572864 & i2) == 1048576);
        if (((29360128 & i2) ^ 12582912) <= 8388608) {
        }
        if ((i2 & 12582912) != 8388608) {
        }
        z3 = true;
        boolean z1022 = z92 | z3;
        if (((234881024 & i2) ^ 100663296) > 67108864) {
        }
        if ((i2 & 100663296) != 67108864) {
        }
        z5 = true;
        boolean z11222 = z1022 | z5 | ((((1879048192 & i2) ^ 805306368) <= 536870912 && composer.changed(textStyle5)) || (i2 & 805306368) == 536870912);
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
        }
        z6 = true;
        z7 = z11222 | z6;
        rememberedValue = composer.rememberedValue();
        if (!z7) {
        }
        AutoResizeSiblingFontSizes autoResizeSiblingFontSizes3222 = new AutoResizeSiblingFontSizes(m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, labels, sp, sp2, f, z4, i5, textStyle5), m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, values, sp3, j5, f, false, 1, textStyle4), null);
        composer.updateRememberedValue(autoResizeSiblingFontSizes3222);
        rememberedValue = autoResizeSiblingFontSizes3222;
        AutoResizeSiblingFontSizes autoResizeSiblingFontSizes22222 = (AutoResizeSiblingFontSizes) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return autoResizeSiblingFontSizes22222;
    }

    /* renamed from: statTileTextAreaWidthPx-Fb0jozE, reason: not valid java name */
    public static final float m12901statTileTextAreaWidthPxFb0jozE(float f, int i, Density density, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(density, "density");
        return RangesKt.coerceAtLeast(((f - (density.mo1167toPx0680j_4(f2) * RangesKt.coerceAtLeast(i - 1, 0))) / RangesKt.coerceAtLeast(i, 1)) - density.mo1167toPx0680j_4(Dp.m7774constructorimpl(Dp.m7774constructorimpl(Dp.m7774constructorimpl(f3 * 2) + f4) + f5)), 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (r52.changed(r48) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* renamed from: CalculateAutoResizeFontSizeForWidth-a8pgNYE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m12898CalculateAutoResizeFontSizeForWidtha8pgNYE(List<String> texts, long j, long j2, float f, boolean z, int i, TextStyle textStyle, Composer composer, int i2, int i3) {
        boolean z2;
        boolean z3;
        Object rememberedValue;
        Intrinsics.checkNotNullParameter(texts, "texts");
        composer.startReplaceGroup(-180008814);
        boolean z4 = (i3 & 16) != 0 ? false : z;
        int i4 = (i3 & 32) != 0 ? 1 : i;
        TextStyle textStyle2 = (i3 & 64) != 0 ? new TextStyle(0L, 0L, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777179, (DefaultConstructorMarker) null) : textStyle;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-180008814, i2, -1, "org.betup.ui.common.compose.CalculateAutoResizeFontSizeForWidth (AutoResizeSiblingsText.kt:125)");
        }
        TextMeasurer rememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, composer, 0, 1);
        String joinToString$default = CollectionsKt.joinToString$default(texts, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, null, null, 0, null, null, 62, null);
        composer.startReplaceGroup(-1224400529);
        boolean changed = composer.changed(joinToString$default) | ((((i2 & 112) ^ 48) > 32 && composer.changed(j)) || (i2 & 48) == 32) | ((((i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.changed(j2)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        if (((i2 & 7168) ^ 3072) <= 2048) {
        }
        if ((i2 & 3072) != 2048) {
            z2 = false;
            z3 = changed | z2 | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(z4)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i4)) || (i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.changed(textStyle2)) || (i2 & 1572864) == 1048576);
            rememberedValue = composer.rememberedValue();
            if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = TextUnit.m7958boximpl(m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, texts, j, j2, f, z4, i4, textStyle2));
                composer.updateRememberedValue(rememberedValue);
            }
            long packedValue = ((TextUnit) rememberedValue).getPackedValue();
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return packedValue;
        }
        z2 = true;
        z3 = changed | z2 | ((((57344 & i2) ^ 24576) <= 16384 && composer.changed(z4)) || (i2 & 24576) == 16384) | ((((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composer.changed(i4)) || (i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((3670016 & i2) ^ 1572864) <= 1048576 && composer.changed(textStyle2)) || (i2 & 1572864) == 1048576);
        rememberedValue = composer.rememberedValue();
        if (!z3) {
        }
        rememberedValue = TextUnit.m7958boximpl(m12900calculateAutoResizeFontSizeForWidthmFA2TWU(rememberTextMeasurer, texts, j, j2, f, z4, i4, textStyle2));
        composer.updateRememberedValue(rememberedValue);
        long packedValue2 = ((TextUnit) rememberedValue).getPackedValue();
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return packedValue2;
    }

    /* renamed from: calculateAutoResizeFontSizeForWidth-mFA2TWU, reason: not valid java name */
    private static final long m12900calculateAutoResizeFontSizeForWidthmFA2TWU(TextMeasurer textMeasurer, List<String> list, long j, long j2, float f, boolean z, int i, TextStyle textStyle) {
        float coerceAtLeast = RangesKt.coerceAtLeast(f, 1.0f);
        TextStyle merge = textStyle.merge(new TextStyle(0L, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777213, (DefaultConstructorMarker) null));
        float coerceIn = RangesKt.coerceIn(TextUnit.m7968getValueimpl(j2) / TextUnit.m7968getValueimpl(j), 0.0f, 1.0f);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(requiredScaleForText(textMeasurer, (String) it.next(), merge, coerceAtLeast, i, z)));
        }
        Float minOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) arrayList);
        return TextUnitKt.getSp(TextUnit.m7968getValueimpl(j) * RangesKt.coerceAtLeast(minOrNull != null ? minOrNull.floatValue() : 1.0f, coerceIn));
    }

    private static final float requiredScaleForText(TextMeasurer textMeasurer, String str, TextStyle textStyle, float f, int i, boolean z) {
        String str2 = str;
        float f2 = 1.0f;
        if (str2.length() == 0) {
            return 1.0f;
        }
        float measureTextScale = measureTextScale(textMeasurer, str, textStyle, f, i);
        if (!z) {
            return measureTextScale;
        }
        List split$default = StringsKt.split$default((CharSequence) str2, new String[]{"\n", "\t", " ", "-", "_", "/", ".", ",", ":", ";"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            f2 = measureTextScale(textMeasurer, (String) it.next(), textStyle, f, 1);
            while (it.hasNext()) {
                f2 = Math.max(f2, measureTextScale(textMeasurer, (String) it.next(), textStyle, f, 1));
            }
        }
        return Math.min(measureTextScale, f2);
    }

    private static final float measureTextScale(TextMeasurer textMeasurer, String str, TextStyle textStyle, float f, int i) {
        TextLayoutResult m7211measurexDpz5zY$default = TextMeasurer.m7211measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, 2, null), textStyle, 0, false, i, null, ConstraintsKt.Constraints$default(0, RangesKt.coerceAtLeast(MathKt.roundToInt(f), 1), 0, 0, 13, null), null, null, null, false, 1964, null);
        float f2 = 1.0f;
        float coerceAtMost = ((int) (m7211measurexDpz5zY$default.getSize() >> 32)) > 0 ? RangesKt.coerceAtMost(f / ((int) (m7211measurexDpz5zY$default.getSize() >> 32)), 1.0f) : 1.0f;
        if (m7211measurexDpz5zY$default.getLineCount() > i && m7211measurexDpz5zY$default.getLineCount() > 0) {
            f2 = i / m7211measurexDpz5zY$default.getLineCount();
        }
        return Math.min(coerceAtMost, f2);
    }
}
