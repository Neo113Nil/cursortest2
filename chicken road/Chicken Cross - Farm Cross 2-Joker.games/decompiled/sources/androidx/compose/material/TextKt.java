package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
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
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TextStyle.INSTANCE.getDefault();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02aa  */
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1243TextfLXpl1I(final String text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier.Companion companion;
        long m1664getUnspecified0d7_KjU;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long m4032getUnspecifiedXSAIIZE;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        int m3781getClipgIe3tQ8;
        TextStyle textStyle2;
        int i22;
        Function1<? super TextLayoutResult, Unit> function12;
        int i23;
        boolean z2;
        long j5;
        long j6;
        long j7;
        final Modifier modifier2;
        final TextAlign textAlign3;
        final TextStyle textStyle3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final FontFamily fontFamily3;
        final long j8;
        final boolean z3;
        final FontStyle fontStyle3;
        final int i24;
        final long j9;
        final TextDecoration textDecoration3;
        final long j10;
        final long j11;
        final int i25;
        final FontWeight fontWeight3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-366126944);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)106@5548L7,129@6306L145:Text.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i26 = i5 & 2;
        if (i26 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & 458752) == 0) {
                i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i14 = i5 & 512;
            if (i14 == 0) {
                i6 |= C.ENCODING_PCM_32BIT;
            } else if ((i3 & 1879048192) == 0) {
                i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
                i16 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
            } else {
                i16 = i4;
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
                i16 |= 48;
            } else if ((i4 & 112) == 0) {
                i16 |= startRestartGroup.changed(i) ? 32 : 16;
            }
            int i27 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
                i27 |= 384;
            } else if ((i4 & 896) == 0) {
                i27 |= startRestartGroup.changed(z) ? 256 : 128;
                i19 = i5 & 8192;
                if (i19 != 0) {
                    i27 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    i27 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                    i20 = i5 & 16384;
                    if (i20 == 0) {
                        i27 |= 24576;
                    } else if ((i4 & 57344) == 0) {
                        i21 = i20;
                        i27 |= startRestartGroup.changed(function1) ? 16384 : 8192;
                        if ((i4 & 458752) == 0) {
                            i27 |= ((i5 & 32768) == 0 && startRestartGroup.changed(textStyle)) ? 131072 : 65536;
                        }
                        if ((i6 & 1533916891) == 306783378 || (374491 & i27) != 74898 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i26 != 0 ? Modifier.INSTANCE : modifier;
                                m1664getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m1664getUnspecified0d7_KjU() : j;
                                long m4032getUnspecifiedXSAIIZE2 = i8 != 0 ? TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE() : j2;
                                fontStyle2 = i9 != 0 ? null : fontStyle;
                                fontWeight2 = i10 != 0 ? null : fontWeight;
                                fontFamily2 = i11 != 0 ? null : fontFamily;
                                m4032getUnspecifiedXSAIIZE = i12 != 0 ? TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE() : j3;
                                textDecoration2 = i13 != 0 ? null : textDecoration;
                                textAlign2 = i14 == 0 ? textAlign : null;
                                long m4032getUnspecifiedXSAIIZE3 = i15 != 0 ? TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE() : j4;
                                m3781getClipgIe3tQ8 = i17 != 0 ? TextOverflow.INSTANCE.m3781getClipgIe3tQ8() : i;
                                boolean z4 = i18 != 0 ? true : z;
                                int i28 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                TextKt$Text$1 textKt$Text$1 = i21 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function1;
                                if ((i5 & 32768) != 0) {
                                    TextDecoration textDecoration4 = textDecoration2;
                                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(providableCompositionLocal);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textStyle2 = (TextStyle) consume;
                                    i22 = i27 & (-458753);
                                    function12 = textKt$Text$1;
                                    textDecoration2 = textDecoration4;
                                } else {
                                    textStyle2 = textStyle;
                                    i22 = i27;
                                    function12 = textKt$Text$1;
                                }
                                i23 = i28;
                                z2 = z4;
                                j5 = m4032getUnspecifiedXSAIIZE3;
                                j6 = m4032getUnspecifiedXSAIIZE2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 32768) != 0) {
                                    i27 &= -458753;
                                }
                                companion = modifier;
                                m1664getUnspecified0d7_KjU = j;
                                j6 = j2;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                m4032getUnspecifiedXSAIIZE = j3;
                                textDecoration2 = textDecoration;
                                textAlign2 = textAlign;
                                m3781getClipgIe3tQ8 = i;
                                z2 = z;
                                i23 = i2;
                                function12 = function1;
                                textStyle2 = textStyle;
                                i22 = i27;
                                j5 = j4;
                            }
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1557613088);
                            ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                            if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                                j7 = m1664getUnspecified0d7_KjU;
                            } else {
                                long m3502getColor0d7_KjU = textStyle2.m3502getColor0d7_KjU();
                                if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m1638unboximpl = ((Color) consume2).m1638unboximpl();
                                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localContentAlpha);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    m3502getColor0d7_KjU = Color.m1627copywmQWz5c$default(m1638unboximpl, ((Number) consume3).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                j7 = m3502getColor0d7_KjU;
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle textStyle4 = textStyle2;
                            int i29 = i22 << 9;
                            BasicTextKt.m682BasicTextBpD7jsM(text, companion, textStyle4.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, m3781getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 126) | ((i22 >> 3) & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016), 0);
                            modifier2 = companion;
                            textAlign3 = textAlign2;
                            textStyle3 = textStyle4;
                            function13 = function12;
                            fontFamily3 = fontFamily2;
                            j8 = j5;
                            z3 = z2;
                            fontStyle3 = fontStyle2;
                            i24 = i23;
                            j9 = m4032getUnspecifiedXSAIIZE;
                            textDecoration3 = textDecoration2;
                            j10 = j6;
                            j11 = m1664getUnspecified0d7_KjU;
                            FontWeight fontWeight4 = fontWeight2;
                            i25 = m3781getClipgIe3tQ8;
                            fontWeight3 = fontWeight4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            j11 = j;
                            j10 = j2;
                            fontStyle3 = fontStyle;
                            fontWeight3 = fontWeight;
                            fontFamily3 = fontFamily;
                            j9 = j3;
                            textDecoration3 = textDecoration;
                            textAlign3 = textAlign;
                            j8 = j4;
                            i25 = i;
                            z3 = z;
                            i24 = i2;
                            function13 = function1;
                            textStyle3 = textStyle;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i30) {
                                TextKt.m1243TextfLXpl1I(text, modifier2, j11, j10, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration3, textAlign3, j8, i25, z3, i24, function13, textStyle3, composer2, i3 | 1, i4, i5);
                            }
                        });
                        return;
                    }
                    i21 = i20;
                    if ((i4 & 458752) == 0) {
                    }
                    if ((i6 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if ((i5 & 32768) != 0) {
                    }
                    i23 = i28;
                    z2 = z4;
                    j5 = m4032getUnspecifiedXSAIIZE3;
                    j6 = m4032getUnspecifiedXSAIIZE2;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557613088);
                    ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                    if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle textStyle42 = textStyle2;
                    int i292 = i22 << 9;
                    BasicTextKt.m682BasicTextBpD7jsM(text, companion, textStyle42.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, m3781getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 126) | ((i22 >> 3) & 7168) | (i292 & 57344) | (i292 & 458752) | (i292 & 3670016), 0);
                    modifier2 = companion;
                    textAlign3 = textAlign2;
                    textStyle3 = textStyle42;
                    function13 = function12;
                    fontFamily3 = fontFamily2;
                    j8 = j5;
                    z3 = z2;
                    fontStyle3 = fontStyle2;
                    i24 = i23;
                    j9 = m4032getUnspecifiedXSAIIZE;
                    textDecoration3 = textDecoration2;
                    j10 = j6;
                    j11 = m1664getUnspecified0d7_KjU;
                    FontWeight fontWeight42 = fontWeight2;
                    i25 = m3781getClipgIe3tQ8;
                    fontWeight3 = fontWeight42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i20 = i5 & 16384;
                if (i20 == 0) {
                }
                i21 = i20;
                if ((i4 & 458752) == 0) {
                }
                if ((i6 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i26 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if ((i5 & 32768) != 0) {
                }
                i23 = i28;
                z2 = z4;
                j5 = m4032getUnspecifiedXSAIIZE3;
                j6 = m4032getUnspecifiedXSAIIZE2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557613088);
                ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle textStyle422 = textStyle2;
                int i2922 = i22 << 9;
                BasicTextKt.m682BasicTextBpD7jsM(text, companion, textStyle422.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, m3781getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 126) | ((i22 >> 3) & 7168) | (i2922 & 57344) | (i2922 & 458752) | (i2922 & 3670016), 0);
                modifier2 = companion;
                textAlign3 = textAlign2;
                textStyle3 = textStyle422;
                function13 = function12;
                fontFamily3 = fontFamily2;
                j8 = j5;
                z3 = z2;
                fontStyle3 = fontStyle2;
                i24 = i23;
                j9 = m4032getUnspecifiedXSAIIZE;
                textDecoration3 = textDecoration2;
                j10 = j6;
                j11 = m1664getUnspecified0d7_KjU;
                FontWeight fontWeight422 = fontWeight2;
                i25 = m3781getClipgIe3tQ8;
                fontWeight3 = fontWeight422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 == 0) {
            }
            i21 = i20;
            if ((i4 & 458752) == 0) {
            }
            if ((i6 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if ((i5 & 32768) != 0) {
            }
            i23 = i28;
            z2 = z4;
            j5 = m4032getUnspecifiedXSAIIZE3;
            j6 = m4032getUnspecifiedXSAIIZE2;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557613088);
            ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
            if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle textStyle4222 = textStyle2;
            int i29222 = i22 << 9;
            BasicTextKt.m682BasicTextBpD7jsM(text, companion, textStyle4222.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, m3781getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 126) | ((i22 >> 3) & 7168) | (i29222 & 57344) | (i29222 & 458752) | (i29222 & 3670016), 0);
            modifier2 = companion;
            textAlign3 = textAlign2;
            textStyle3 = textStyle4222;
            function13 = function12;
            fontFamily3 = fontFamily2;
            j8 = j5;
            z3 = z2;
            fontStyle3 = fontStyle2;
            i24 = i23;
            j9 = m4032getUnspecifiedXSAIIZE;
            textDecoration3 = textDecoration2;
            j10 = j6;
            j11 = m1664getUnspecified0d7_KjU;
            FontWeight fontWeight4222 = fontWeight2;
            i25 = m3781getClipgIe3tQ8;
            fontWeight3 = fontWeight4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i272 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 == 0) {
        }
        i21 = i20;
        if ((i4 & 458752) == 0) {
        }
        if ((i6 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if ((i5 & 32768) != 0) {
        }
        i23 = i28;
        z2 = z4;
        j5 = m4032getUnspecifiedXSAIIZE3;
        j6 = m4032getUnspecifiedXSAIIZE2;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557613088);
        ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
        if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle textStyle42222 = textStyle2;
        int i292222 = i22 << 9;
        BasicTextKt.m682BasicTextBpD7jsM(text, companion, textStyle42222.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, m3781getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 126) | ((i22 >> 3) & 7168) | (i292222 & 57344) | (i292222 & 458752) | (i292222 & 3670016), 0);
        modifier2 = companion;
        textAlign3 = textAlign2;
        textStyle3 = textStyle42222;
        function13 = function12;
        fontFamily3 = fontFamily2;
        j8 = j5;
        z3 = z2;
        fontStyle3 = fontStyle2;
        i24 = i23;
        j9 = m4032getUnspecifiedXSAIIZE;
        textDecoration3 = textDecoration2;
        j10 = j6;
        j11 = m1664getUnspecified0d7_KjU;
        FontWeight fontWeight42222 = fontWeight2;
        i25 = m3781getClipgIe3tQ8;
        fontWeight3 = fontWeight42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029c  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1242Text4IGK_g(final AnnotatedString text, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier.Companion companion;
        long m1664getUnspecified0d7_KjU;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long m4032getUnspecifiedXSAIIZE;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        Map<String, InlineTextContent> map2;
        TextStyle textStyle2;
        int i23;
        Function1<? super TextLayoutResult, Unit> function12;
        int i24;
        Map<String, InlineTextContent> map3;
        int i25;
        boolean z2;
        long j5;
        long j6;
        long j7;
        final Modifier modifier2;
        final TextAlign textAlign3;
        final Function1<? super TextLayoutResult, Unit> function13;
        final FontFamily fontFamily3;
        final int i26;
        final Map<String, InlineTextContent> map4;
        final TextDecoration textDecoration3;
        final boolean z3;
        final int i27;
        final FontWeight fontWeight3;
        final FontStyle fontStyle3;
        final long j8;
        final long j9;
        final long j10;
        final TextStyle textStyle3;
        final long j11;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-422393234);
        ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)210@10653L7,232@11410L167:Text.kt#jmzs0o");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (startRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i28 = i5 & 2;
        if (i28 != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i3 & 896) == 0) {
                i6 |= startRestartGroup.changed(j) ? 256 : 128;
            }
            i8 = i5 & 8;
            if (i8 == 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                i6 |= startRestartGroup.changed(j2) ? 2048 : 1024;
            }
            i9 = i5 & 16;
            if (i9 == 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                i6 |= startRestartGroup.changed(fontStyle) ? 16384 : 8192;
            }
            i10 = i5 & 32;
            if (i10 == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i3 & 458752) == 0) {
                i6 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
            }
            i11 = i5 & 64;
            if (i11 == 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                i6 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
            }
            i12 = i5 & 128;
            if (i12 == 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                i6 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
            }
            i13 = i5 & 256;
            if (i13 == 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                i6 |= startRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i14 = i5 & 512;
            if (i14 == 0) {
                i6 |= C.ENCODING_PCM_32BIT;
            } else if ((i3 & 1879048192) == 0) {
                i6 |= startRestartGroup.changed(textAlign) ? 536870912 : 268435456;
            }
            i15 = i5 & 1024;
            if (i15 == 0) {
                i16 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                i16 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
            } else {
                i16 = i4;
            }
            i17 = i5 & 2048;
            if (i17 == 0) {
                i16 |= 48;
            } else if ((i4 & 112) == 0) {
                i16 |= startRestartGroup.changed(i) ? 32 : 16;
            }
            int i29 = i16;
            i18 = i5 & 4096;
            if (i18 == 0) {
                i29 |= 384;
            } else if ((i4 & 896) == 0) {
                i29 |= startRestartGroup.changed(z) ? 256 : 128;
                i19 = i5 & 8192;
                if (i19 != 0) {
                    i29 |= 3072;
                } else if ((i4 & 7168) == 0) {
                    i29 |= startRestartGroup.changed(i2) ? 2048 : 1024;
                    i20 = i5 & 16384;
                    if (i20 != 0) {
                        i29 |= 8192;
                    }
                    i21 = i5 & 32768;
                    if (i21 == 0) {
                        i29 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i4 & 458752) == 0) {
                        i22 = i19;
                        i29 |= startRestartGroup.changed(function1) ? 131072 : 65536;
                        if ((i4 & 3670016) == 0) {
                            i29 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                        }
                        if (i20 == 16384 || (1533916891 & i6) != 306783378 || (2995931 & i29) != 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i28 != 0 ? Modifier.INSTANCE : modifier;
                                m1664getUnspecified0d7_KjU = i7 != 0 ? Color.INSTANCE.m1664getUnspecified0d7_KjU() : j;
                                long m4032getUnspecifiedXSAIIZE2 = i8 != 0 ? TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE() : j2;
                                fontStyle2 = i9 != 0 ? null : fontStyle;
                                fontWeight2 = i10 != 0 ? null : fontWeight;
                                fontFamily2 = i11 != 0 ? null : fontFamily;
                                m4032getUnspecifiedXSAIIZE = i12 != 0 ? TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE() : j3;
                                textDecoration2 = i13 != 0 ? null : textDecoration;
                                textAlign2 = i14 == 0 ? textAlign : null;
                                long m4032getUnspecifiedXSAIIZE3 = i15 != 0 ? TextUnit.INSTANCE.m4032getUnspecifiedXSAIIZE() : j4;
                                int m3781getClipgIe3tQ8 = i17 != 0 ? TextOverflow.INSTANCE.m3781getClipgIe3tQ8() : i;
                                boolean z4 = i18 != 0 ? true : z;
                                int i30 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                if (i20 != 0) {
                                    map2 = MapsKt.emptyMap();
                                    i29 &= -57345;
                                } else {
                                    map2 = map;
                                }
                                TextKt$Text$3 textKt$Text$3 = i21 != 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function1;
                                if ((i5 & 65536) != 0) {
                                    TextDecoration textDecoration4 = textDecoration2;
                                    ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(providableCompositionLocal);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textStyle2 = (TextStyle) consume;
                                    i23 = i29 & (-3670017);
                                    function12 = textKt$Text$3;
                                    textDecoration2 = textDecoration4;
                                } else {
                                    textStyle2 = textStyle;
                                    i23 = i29;
                                    function12 = textKt$Text$3;
                                }
                                i24 = m3781getClipgIe3tQ8;
                                map3 = map2;
                                i25 = i30;
                                z2 = z4;
                                j5 = m4032getUnspecifiedXSAIIZE3;
                                j6 = m4032getUnspecifiedXSAIIZE2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if (i20 != 0) {
                                    i29 &= -57345;
                                }
                                if ((i5 & 65536) != 0) {
                                    i29 &= -3670017;
                                }
                                companion = modifier;
                                m1664getUnspecified0d7_KjU = j;
                                j6 = j2;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                m4032getUnspecifiedXSAIIZE = j3;
                                textDecoration2 = textDecoration;
                                textAlign2 = textAlign;
                                j5 = j4;
                                z2 = z;
                                i25 = i2;
                                map3 = map;
                                function12 = function1;
                                textStyle2 = textStyle;
                                i23 = i29;
                                i24 = i;
                            }
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1557618192);
                            ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                            if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                                j7 = m1664getUnspecified0d7_KjU;
                            } else {
                                long m3502getColor0d7_KjU = textStyle2.m3502getColor0d7_KjU();
                                if (m3502getColor0d7_KjU == Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m1638unboximpl = ((Color) consume2).m1638unboximpl();
                                    ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = startRestartGroup.consume(localContentAlpha);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    m3502getColor0d7_KjU = Color.m1627copywmQWz5c$default(m1638unboximpl, ((Number) consume3).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                j7 = m3502getColor0d7_KjU;
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextStyle textStyle4 = textStyle2;
                            int i31 = i23 << 9;
                            BasicTextKt.m681BasicText4YKlhWE(text, companion, textStyle4.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016), 0);
                            modifier2 = companion;
                            textAlign3 = textAlign2;
                            function13 = function12;
                            fontFamily3 = fontFamily2;
                            i26 = i25;
                            map4 = map3;
                            textDecoration3 = textDecoration2;
                            z3 = z2;
                            FontWeight fontWeight4 = fontWeight2;
                            i27 = i24;
                            fontWeight3 = fontWeight4;
                            fontStyle3 = fontStyle2;
                            j8 = j6;
                            j9 = m1664getUnspecified0d7_KjU;
                            j10 = m4032getUnspecifiedXSAIIZE;
                            textStyle3 = textStyle4;
                            j11 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            j9 = j;
                            j8 = j2;
                            fontStyle3 = fontStyle;
                            fontWeight3 = fontWeight;
                            fontFamily3 = fontFamily;
                            j10 = j3;
                            textDecoration3 = textDecoration;
                            textAlign3 = textAlign;
                            j11 = j4;
                            i27 = i;
                            z3 = z;
                            i26 = i2;
                            map4 = map;
                            function13 = function1;
                            textStyle3 = textStyle;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i32) {
                                TextKt.m1242Text4IGK_g(AnnotatedString.this, modifier2, j9, j8, fontStyle3, fontWeight3, fontFamily3, j10, textDecoration3, textAlign3, j11, i27, z3, i26, map4, function13, textStyle3, composer2, i3 | 1, i4, i5);
                            }
                        });
                        return;
                    }
                    i22 = i19;
                    if ((i4 & 3670016) == 0) {
                    }
                    if (i20 == 16384) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i20 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if ((i5 & 65536) != 0) {
                    }
                    i24 = m3781getClipgIe3tQ8;
                    map3 = map2;
                    i25 = i30;
                    z2 = z4;
                    j5 = m4032getUnspecifiedXSAIIZE3;
                    j6 = m4032getUnspecifiedXSAIIZE2;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557618192);
                    ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                    if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextStyle textStyle42 = textStyle2;
                    int i312 = i23 << 9;
                    BasicTextKt.m681BasicText4YKlhWE(text, companion, textStyle42.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016), 0);
                    modifier2 = companion;
                    textAlign3 = textAlign2;
                    function13 = function12;
                    fontFamily3 = fontFamily2;
                    i26 = i25;
                    map4 = map3;
                    textDecoration3 = textDecoration2;
                    z3 = z2;
                    FontWeight fontWeight42 = fontWeight2;
                    i27 = i24;
                    fontWeight3 = fontWeight42;
                    fontStyle3 = fontStyle2;
                    j8 = j6;
                    j9 = m1664getUnspecified0d7_KjU;
                    j10 = m4032getUnspecifiedXSAIIZE;
                    textStyle3 = textStyle42;
                    j11 = j5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i20 = i5 & 16384;
                if (i20 != 0) {
                }
                i21 = i5 & 32768;
                if (i21 == 0) {
                }
                i22 = i19;
                if ((i4 & 3670016) == 0) {
                }
                if (i20 == 16384) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i28 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i22 != 0) {
                }
                if (i20 != 0) {
                }
                if (i21 != 0) {
                }
                if ((i5 & 65536) != 0) {
                }
                i24 = m3781getClipgIe3tQ8;
                map3 = map2;
                i25 = i30;
                z2 = z4;
                j5 = m4032getUnspecifiedXSAIIZE3;
                j6 = m4032getUnspecifiedXSAIIZE2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557618192);
                ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextStyle textStyle422 = textStyle2;
                int i3122 = i23 << 9;
                BasicTextKt.m681BasicText4YKlhWE(text, companion, textStyle422.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i3122 & 57344) | (i3122 & 458752) | (i3122 & 3670016), 0);
                modifier2 = companion;
                textAlign3 = textAlign2;
                function13 = function12;
                fontFamily3 = fontFamily2;
                i26 = i25;
                map4 = map3;
                textDecoration3 = textDecoration2;
                z3 = z2;
                FontWeight fontWeight422 = fontWeight2;
                i27 = i24;
                fontWeight3 = fontWeight422;
                fontStyle3 = fontStyle2;
                j8 = j6;
                j9 = m1664getUnspecified0d7_KjU;
                j10 = m4032getUnspecifiedXSAIIZE;
                textStyle3 = textStyle422;
                j11 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i19 = i5 & 8192;
            if (i19 != 0) {
            }
            i20 = i5 & 16384;
            if (i20 != 0) {
            }
            i21 = i5 & 32768;
            if (i21 == 0) {
            }
            i22 = i19;
            if ((i4 & 3670016) == 0) {
            }
            if (i20 == 16384) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i28 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i22 != 0) {
            }
            if (i20 != 0) {
            }
            if (i21 != 0) {
            }
            if ((i5 & 65536) != 0) {
            }
            i24 = m3781getClipgIe3tQ8;
            map3 = map2;
            i25 = i30;
            z2 = z4;
            j5 = m4032getUnspecifiedXSAIIZE3;
            j6 = m4032getUnspecifiedXSAIIZE2;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557618192);
            ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
            if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextStyle textStyle4222 = textStyle2;
            int i31222 = i23 << 9;
            BasicTextKt.m681BasicText4YKlhWE(text, companion, textStyle4222.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i31222 & 57344) | (i31222 & 458752) | (i31222 & 3670016), 0);
            modifier2 = companion;
            textAlign3 = textAlign2;
            function13 = function12;
            fontFamily3 = fontFamily2;
            i26 = i25;
            map4 = map3;
            textDecoration3 = textDecoration2;
            z3 = z2;
            FontWeight fontWeight4222 = fontWeight2;
            i27 = i24;
            fontWeight3 = fontWeight4222;
            fontStyle3 = fontStyle2;
            j8 = j6;
            j9 = m1664getUnspecified0d7_KjU;
            j10 = m4032getUnspecifiedXSAIIZE;
            textStyle3 = textStyle4222;
            j11 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 == 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i5 & 256;
        if (i13 == 0) {
        }
        i14 = i5 & 512;
        if (i14 == 0) {
        }
        i15 = i5 & 1024;
        if (i15 == 0) {
        }
        i17 = i5 & 2048;
        if (i17 == 0) {
        }
        int i292 = i16;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i19 = i5 & 8192;
        if (i19 != 0) {
        }
        i20 = i5 & 16384;
        if (i20 != 0) {
        }
        i21 = i5 & 32768;
        if (i21 == 0) {
        }
        i22 = i19;
        if ((i4 & 3670016) == 0) {
        }
        if (i20 == 16384) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i28 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i22 != 0) {
        }
        if (i20 != 0) {
        }
        if (i21 != 0) {
        }
        if ((i5 & 65536) != 0) {
        }
        i24 = m3781getClipgIe3tQ8;
        map3 = map2;
        i25 = i30;
        z2 = z4;
        j5 = m4032getUnspecifiedXSAIIZE3;
        j6 = m4032getUnspecifiedXSAIIZE2;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557618192);
        ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
        if (m1664getUnspecified0d7_KjU != Color.INSTANCE.m1664getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextStyle textStyle42222 = textStyle2;
        int i312222 = i23 << 9;
        BasicTextKt.m681BasicText4YKlhWE(text, companion, textStyle42222.merge(new TextStyle(j7, j6, fontWeight2, fontStyle2, (FontSynthesis) null, fontFamily2, (String) null, m4032getUnspecifiedXSAIIZE, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, textDecoration2, (Shadow) null, textAlign2, (TextDirection) null, j5, (TextIndent) null, 175952, (DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i312222 & 57344) | (i312222 & 458752) | (i312222 & 3670016), 0);
        modifier2 = companion;
        textAlign3 = textAlign2;
        function13 = function12;
        fontFamily3 = fontFamily2;
        i26 = i25;
        map4 = map3;
        textDecoration3 = textDecoration2;
        z3 = z2;
        FontWeight fontWeight42222 = fontWeight2;
        i27 = i24;
        fontWeight3 = fontWeight42222;
        fontStyle3 = fontStyle2;
        j8 = j6;
        j9 = m1664getUnspecified0d7_KjU;
        j10 = m4032getUnspecifiedXSAIIZE;
        textStyle3 = textStyle42222;
        j11 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle value, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)P(1)263@12533L7,264@12558L80:Text.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) consume).merge(value))}, content, startRestartGroup, (i2 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                TextKt.ProvideTextStyle(TextStyle.this, content, composer2, i | 1);
            }
        });
    }
}
