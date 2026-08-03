package androidx.compose.material;

/* compiled from: Text.kt */
@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aß\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\u001aÉ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020)2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00060,2\b\b\u0002\u0010.\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", com.helpshift.proactive.InAppViewConstants.MAX_LINES, "", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> LocalTextStyle = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextStyle>() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.text.TextStyle invoke() {
            return androidx.compose.ui.text.TextStyle.INSTANCE.getDefault();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a9  */
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1582TextfLXpl1I(final java.lang.String text, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontFamily fontFamily, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.text.style.TextAlign textAlign, long j4, int i, boolean z, int i2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.runtime.Composer composer, final int i3, final int i4, final int i5) {
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
        androidx.compose.ui.Modifier.Companion companion;
        long m2149getUnspecified0d7_KjU;
        androidx.compose.ui.text.font.FontStyle fontStyle2;
        androidx.compose.ui.text.font.FontWeight fontWeight2;
        androidx.compose.ui.text.font.FontFamily fontFamily2;
        long m4684getUnspecifiedXSAIIZE;
        androidx.compose.ui.text.style.TextDecoration textDecoration2;
        androidx.compose.ui.text.style.TextAlign textAlign2;
        int m4409getClipgIe3tQ8;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i22;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function12;
        int i23;
        boolean z2;
        long j5;
        long j6;
        long j7;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.text.style.TextAlign textAlign3;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13;
        final androidx.compose.ui.text.font.FontFamily fontFamily3;
        final long j8;
        final boolean z3;
        final androidx.compose.ui.text.font.FontStyle fontStyle3;
        final int i24;
        final long j9;
        final androidx.compose.ui.text.style.TextDecoration textDecoration3;
        final long j10;
        final long j11;
        final int i25;
        final androidx.compose.ui.text.font.FontWeight fontWeight3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-366126944);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)106@5548L7,129@6306L145:Text.kt#jmzs0o");
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
                i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                i6 |= startRestartGroup.changed(textDecoration) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i14 = i5 & 512;
            if (i14 == 0) {
                i6 |= 805306368;
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
                                companion = i26 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                m2149getUnspecified0d7_KjU = i7 != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : j;
                                long m4684getUnspecifiedXSAIIZE2 = i8 != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j2;
                                fontStyle2 = i9 != 0 ? null : fontStyle;
                                fontWeight2 = i10 != 0 ? null : fontWeight;
                                fontFamily2 = i11 != 0 ? null : fontFamily;
                                m4684getUnspecifiedXSAIIZE = i12 != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j3;
                                textDecoration2 = i13 != 0 ? null : textDecoration;
                                textAlign2 = i14 == 0 ? textAlign : null;
                                long m4684getUnspecifiedXSAIIZE3 = i15 != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j4;
                                m4409getClipgIe3tQ8 = i17 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i;
                                boolean z4 = i18 != 0 ? true : z;
                                int i28 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                androidx.compose.material.TextKt$Text$1 textKt$Text$1 = i21 != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>() { // from class: androidx.compose.material.TextKt$Text$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.TextLayoutResult it) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function1;
                                if ((i5 & 32768) != 0) {
                                    androidx.compose.ui.text.style.TextDecoration textDecoration4 = textDecoration2;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> providableCompositionLocal = LocalTextStyle;
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = startRestartGroup.consume(providableCompositionLocal);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textStyle2 = (androidx.compose.ui.text.TextStyle) consume;
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
                                j5 = m4684getUnspecifiedXSAIIZE3;
                                j6 = m4684getUnspecifiedXSAIIZE2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i5 & 32768) != 0) {
                                    i27 &= -458753;
                                }
                                companion = modifier;
                                m2149getUnspecified0d7_KjU = j;
                                j6 = j2;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                m4684getUnspecifiedXSAIIZE = j3;
                                textDecoration2 = textDecoration;
                                textAlign2 = textAlign;
                                m4409getClipgIe3tQ8 = i;
                                z2 = z;
                                i23 = i2;
                                function12 = function1;
                                textStyle2 = textStyle;
                                i22 = i27;
                                j5 = j4;
                            }
                            startRestartGroup.endDefaults();
                            startRestartGroup.startReplaceableGroup(1557613088);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                            if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                                j7 = m2149getUnspecified0d7_KjU;
                            } else {
                                long m3994getColor0d7_KjU = textStyle2.m3994getColor0d7_KjU();
                                if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume2 = startRestartGroup.consume(localContentColor);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m2123unboximpl = ((androidx.compose.ui.graphics.Color) consume2).m2123unboximpl();
                                    androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> localContentAlpha = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = startRestartGroup.consume(localContentAlpha);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    m3994getColor0d7_KjU = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2123unboximpl, ((java.lang.Number) consume3).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                j7 = m3994getColor0d7_KjU;
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.text.TextStyle textStyle4 = textStyle2;
                            int i29 = i22 << 9;
                            androidx.compose.foundation.text.BasicTextKt.m853BasicTextBpD7jsM(text, companion, textStyle4.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, m4409getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 112) | (i6 & 14) | ((i22 >> 3) & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016), 0);
                            modifier2 = companion;
                            textAlign3 = textAlign2;
                            textStyle3 = textStyle4;
                            function13 = function12;
                            fontFamily3 = fontFamily2;
                            j8 = j5;
                            z3 = z2;
                            fontStyle3 = fontStyle2;
                            i24 = i23;
                            j9 = m4684getUnspecifiedXSAIIZE;
                            textDecoration3 = textDecoration2;
                            j10 = j6;
                            j11 = m2149getUnspecified0d7_KjU;
                            androidx.compose.ui.text.font.FontWeight fontWeight4 = fontWeight2;
                            i25 = m4409getClipgIe3tQ8;
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
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextKt$Text$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i30) {
                                androidx.compose.material.TextKt.m1582TextfLXpl1I(text, modifier2, j11, j10, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration3, textAlign3, j8, i25, z3, i24, function13, textStyle3, composer2, i3 | 1, i4, i5);
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
                    j5 = m4684getUnspecifiedXSAIIZE3;
                    j6 = m4684getUnspecifiedXSAIIZE2;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557613088);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                    if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.text.TextStyle textStyle42 = textStyle2;
                    int i292 = i22 << 9;
                    androidx.compose.foundation.text.BasicTextKt.m853BasicTextBpD7jsM(text, companion, textStyle42.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, m4409getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 112) | (i6 & 14) | ((i22 >> 3) & 7168) | (i292 & 57344) | (i292 & 458752) | (i292 & 3670016), 0);
                    modifier2 = companion;
                    textAlign3 = textAlign2;
                    textStyle3 = textStyle42;
                    function13 = function12;
                    fontFamily3 = fontFamily2;
                    j8 = j5;
                    z3 = z2;
                    fontStyle3 = fontStyle2;
                    i24 = i23;
                    j9 = m4684getUnspecifiedXSAIIZE;
                    textDecoration3 = textDecoration2;
                    j10 = j6;
                    j11 = m2149getUnspecified0d7_KjU;
                    androidx.compose.ui.text.font.FontWeight fontWeight42 = fontWeight2;
                    i25 = m4409getClipgIe3tQ8;
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
                j5 = m4684getUnspecifiedXSAIIZE3;
                j6 = m4684getUnspecifiedXSAIIZE2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557613088);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
                if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.text.TextStyle textStyle422 = textStyle2;
                int i2922 = i22 << 9;
                androidx.compose.foundation.text.BasicTextKt.m853BasicTextBpD7jsM(text, companion, textStyle422.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, m4409getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 112) | (i6 & 14) | ((i22 >> 3) & 7168) | (i2922 & 57344) | (i2922 & 458752) | (i2922 & 3670016), 0);
                modifier2 = companion;
                textAlign3 = textAlign2;
                textStyle3 = textStyle422;
                function13 = function12;
                fontFamily3 = fontFamily2;
                j8 = j5;
                z3 = z2;
                fontStyle3 = fontStyle2;
                i24 = i23;
                j9 = m4684getUnspecifiedXSAIIZE;
                textDecoration3 = textDecoration2;
                j10 = j6;
                j11 = m2149getUnspecified0d7_KjU;
                androidx.compose.ui.text.font.FontWeight fontWeight422 = fontWeight2;
                i25 = m4409getClipgIe3tQ8;
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
            j5 = m4684getUnspecifiedXSAIIZE3;
            j6 = m4684getUnspecifiedXSAIIZE2;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557613088);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
            if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.text.TextStyle textStyle4222 = textStyle2;
            int i29222 = i22 << 9;
            androidx.compose.foundation.text.BasicTextKt.m853BasicTextBpD7jsM(text, companion, textStyle4222.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, m4409getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 112) | (i6 & 14) | ((i22 >> 3) & 7168) | (i29222 & 57344) | (i29222 & 458752) | (i29222 & 3670016), 0);
            modifier2 = companion;
            textAlign3 = textAlign2;
            textStyle3 = textStyle4222;
            function13 = function12;
            fontFamily3 = fontFamily2;
            j8 = j5;
            z3 = z2;
            fontStyle3 = fontStyle2;
            i24 = i23;
            j9 = m4684getUnspecifiedXSAIIZE;
            textDecoration3 = textDecoration2;
            j10 = j6;
            j11 = m2149getUnspecified0d7_KjU;
            androidx.compose.ui.text.font.FontWeight fontWeight4222 = fontWeight2;
            i25 = m4409getClipgIe3tQ8;
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
        j5 = m4684getUnspecifiedXSAIIZE3;
        j6 = m4684getUnspecifiedXSAIIZE2;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557613088);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*111@5663L7,111@5702L7");
        if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.text.TextStyle textStyle42222 = textStyle2;
        int i292222 = i22 << 9;
        androidx.compose.foundation.text.BasicTextKt.m853BasicTextBpD7jsM(text, companion, textStyle42222.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, m4409getClipgIe3tQ8, z2, i23, startRestartGroup, (i6 & 112) | (i6 & 14) | ((i22 >> 3) & 7168) | (i292222 & 57344) | (i292222 & 458752) | (i292222 & 3670016), 0);
        modifier2 = companion;
        textAlign3 = textAlign2;
        textStyle3 = textStyle42222;
        function13 = function12;
        fontFamily3 = fontFamily2;
        j8 = j5;
        z3 = z2;
        fontStyle3 = fontStyle2;
        i24 = i23;
        j9 = m4684getUnspecifiedXSAIIZE;
        textDecoration3 = textDecoration2;
        j10 = j6;
        j11 = m2149getUnspecified0d7_KjU;
        androidx.compose.ui.text.font.FontWeight fontWeight42222 = fontWeight2;
        i25 = m4409getClipgIe3tQ8;
        fontWeight3 = fontWeight42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029b  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1581Text4IGK_g(final androidx.compose.ui.text.AnnotatedString text, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.ui.text.font.FontStyle fontStyle, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontFamily fontFamily, long j3, androidx.compose.ui.text.style.TextDecoration textDecoration, androidx.compose.ui.text.style.TextAlign textAlign, long j4, int i, boolean z, int i2, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, androidx.compose.ui.text.TextStyle textStyle, androidx.compose.runtime.Composer composer, final int i3, final int i4, final int i5) {
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
        androidx.compose.ui.Modifier.Companion companion;
        long m2149getUnspecified0d7_KjU;
        androidx.compose.ui.text.font.FontStyle fontStyle2;
        androidx.compose.ui.text.font.FontWeight fontWeight2;
        androidx.compose.ui.text.font.FontFamily fontFamily2;
        long m4684getUnspecifiedXSAIIZE;
        androidx.compose.ui.text.style.TextDecoration textDecoration2;
        androidx.compose.ui.text.style.TextAlign textAlign2;
        java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map2;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i23;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function12;
        int i24;
        java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map3;
        int i25;
        boolean z2;
        long j5;
        long j6;
        long j7;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.text.style.TextAlign textAlign3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13;
        final androidx.compose.ui.text.font.FontFamily fontFamily3;
        final int i26;
        final java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map4;
        final androidx.compose.ui.text.style.TextDecoration textDecoration3;
        final boolean z3;
        final int i27;
        final androidx.compose.ui.text.font.FontWeight fontWeight3;
        final androidx.compose.ui.text.font.FontStyle fontStyle3;
        final long j8;
        final long j9;
        final long j10;
        final androidx.compose.ui.text.TextStyle textStyle3;
        final long j11;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-422393234);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)210@10653L7,232@11410L167:Text.kt#jmzs0o");
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
                i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                i6 |= startRestartGroup.changed(textDecoration) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i14 = i5 & 512;
            if (i14 == 0) {
                i6 |= 805306368;
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
                        i29 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i4 & 458752) == 0) {
                        i22 = i19;
                        i29 |= startRestartGroup.changed(function1) ? 131072 : 65536;
                        if ((i4 & 3670016) == 0) {
                            i29 |= ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                        }
                        if (i20 == 16384 || (1533916891 & i6) != 306783378 || (2995931 & i29) != 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i28 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                m2149getUnspecified0d7_KjU = i7 != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() : j;
                                long m4684getUnspecifiedXSAIIZE2 = i8 != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j2;
                                fontStyle2 = i9 != 0 ? null : fontStyle;
                                fontWeight2 = i10 != 0 ? null : fontWeight;
                                fontFamily2 = i11 != 0 ? null : fontFamily;
                                m4684getUnspecifiedXSAIIZE = i12 != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j3;
                                textDecoration2 = i13 != 0 ? null : textDecoration;
                                textAlign2 = i14 == 0 ? textAlign : null;
                                long m4684getUnspecifiedXSAIIZE3 = i15 != 0 ? androidx.compose.ui.unit.TextUnit.INSTANCE.m4684getUnspecifiedXSAIIZE() : j4;
                                int m4409getClipgIe3tQ8 = i17 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m4409getClipgIe3tQ8() : i;
                                boolean z4 = i18 != 0 ? true : z;
                                int i30 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                if (i20 != 0) {
                                    map2 = kotlin.collections.MapsKt.emptyMap();
                                    i29 &= -57345;
                                } else {
                                    map2 = map;
                                }
                                androidx.compose.material.TextKt$Text$3 textKt$Text$3 = i21 != 0 ? new kotlin.jvm.functions.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>() { // from class: androidx.compose.material.TextKt$Text$3
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.text.TextLayoutResult it) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } : function1;
                                if ((i5 & 65536) != 0) {
                                    androidx.compose.ui.text.style.TextDecoration textDecoration4 = textDecoration2;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> providableCompositionLocal = LocalTextStyle;
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = startRestartGroup.consume(providableCompositionLocal);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    textStyle2 = (androidx.compose.ui.text.TextStyle) consume;
                                    i23 = i29 & (-3670017);
                                    function12 = textKt$Text$3;
                                    textDecoration2 = textDecoration4;
                                } else {
                                    textStyle2 = textStyle;
                                    i23 = i29;
                                    function12 = textKt$Text$3;
                                }
                                i24 = m4409getClipgIe3tQ8;
                                map3 = map2;
                                i25 = i30;
                                z2 = z4;
                                j5 = m4684getUnspecifiedXSAIIZE3;
                                j6 = m4684getUnspecifiedXSAIIZE2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if (i20 != 0) {
                                    i29 &= -57345;
                                }
                                if ((i5 & 65536) != 0) {
                                    i29 &= -3670017;
                                }
                                companion = modifier;
                                m2149getUnspecified0d7_KjU = j;
                                j6 = j2;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                m4684getUnspecifiedXSAIIZE = j3;
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
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                            if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                                j7 = m2149getUnspecified0d7_KjU;
                            } else {
                                long m3994getColor0d7_KjU = textStyle2.m3994getColor0d7_KjU();
                                if (m3994getColor0d7_KjU == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume2 = startRestartGroup.consume(localContentColor);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    long m2123unboximpl = ((androidx.compose.ui.graphics.Color) consume2).m2123unboximpl();
                                    androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Float> localContentAlpha = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = startRestartGroup.consume(localContentAlpha);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    m3994getColor0d7_KjU = androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(m2123unboximpl, ((java.lang.Number) consume3).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                }
                                j7 = m3994getColor0d7_KjU;
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.text.TextStyle textStyle4 = textStyle2;
                            int i31 = i23 << 9;
                            androidx.compose.foundation.text.BasicTextKt.m851BasicText4YKlhWE(text, companion, textStyle4.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016), 0);
                            modifier2 = companion;
                            textAlign3 = textAlign2;
                            function13 = function12;
                            fontFamily3 = fontFamily2;
                            i26 = i25;
                            map4 = map3;
                            textDecoration3 = textDecoration2;
                            z3 = z2;
                            androidx.compose.ui.text.font.FontWeight fontWeight4 = fontWeight2;
                            i27 = i24;
                            fontWeight3 = fontWeight4;
                            fontStyle3 = fontStyle2;
                            j8 = j6;
                            j9 = m2149getUnspecified0d7_KjU;
                            j10 = m4684getUnspecifiedXSAIIZE;
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
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextKt$Text$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i32) {
                                androidx.compose.material.TextKt.m1581Text4IGK_g(androidx.compose.ui.text.AnnotatedString.this, modifier2, j9, j8, fontStyle3, fontWeight3, fontFamily3, j10, textDecoration3, textAlign3, j11, i27, z3, i26, map4, function13, textStyle3, composer2, i3 | 1, i4, i5);
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
                    i24 = m4409getClipgIe3tQ8;
                    map3 = map2;
                    i25 = i30;
                    z2 = z4;
                    j5 = m4684getUnspecifiedXSAIIZE3;
                    j6 = m4684getUnspecifiedXSAIIZE2;
                    startRestartGroup.endDefaults();
                    startRestartGroup.startReplaceableGroup(1557618192);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                    if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.text.TextStyle textStyle42 = textStyle2;
                    int i312 = i23 << 9;
                    androidx.compose.foundation.text.BasicTextKt.m851BasicText4YKlhWE(text, companion, textStyle42.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016), 0);
                    modifier2 = companion;
                    textAlign3 = textAlign2;
                    function13 = function12;
                    fontFamily3 = fontFamily2;
                    i26 = i25;
                    map4 = map3;
                    textDecoration3 = textDecoration2;
                    z3 = z2;
                    androidx.compose.ui.text.font.FontWeight fontWeight42 = fontWeight2;
                    i27 = i24;
                    fontWeight3 = fontWeight42;
                    fontStyle3 = fontStyle2;
                    j8 = j6;
                    j9 = m2149getUnspecified0d7_KjU;
                    j10 = m4684getUnspecifiedXSAIIZE;
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
                i24 = m4409getClipgIe3tQ8;
                map3 = map2;
                i25 = i30;
                z2 = z4;
                j5 = m4684getUnspecifiedXSAIIZE3;
                j6 = m4684getUnspecifiedXSAIIZE2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(1557618192);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
                if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.text.TextStyle textStyle422 = textStyle2;
                int i3122 = i23 << 9;
                androidx.compose.foundation.text.BasicTextKt.m851BasicText4YKlhWE(text, companion, textStyle422.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i3122 & 57344) | (i3122 & 458752) | (i3122 & 3670016), 0);
                modifier2 = companion;
                textAlign3 = textAlign2;
                function13 = function12;
                fontFamily3 = fontFamily2;
                i26 = i25;
                map4 = map3;
                textDecoration3 = textDecoration2;
                z3 = z2;
                androidx.compose.ui.text.font.FontWeight fontWeight422 = fontWeight2;
                i27 = i24;
                fontWeight3 = fontWeight422;
                fontStyle3 = fontStyle2;
                j8 = j6;
                j9 = m2149getUnspecified0d7_KjU;
                j10 = m4684getUnspecifiedXSAIIZE;
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
            i24 = m4409getClipgIe3tQ8;
            map3 = map2;
            i25 = i30;
            z2 = z4;
            j5 = m4684getUnspecifiedXSAIIZE3;
            j6 = m4684getUnspecifiedXSAIIZE2;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(1557618192);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
            if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.text.TextStyle textStyle4222 = textStyle2;
            int i31222 = i23 << 9;
            androidx.compose.foundation.text.BasicTextKt.m851BasicText4YKlhWE(text, companion, textStyle4222.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i31222 & 57344) | (i31222 & 458752) | (i31222 & 3670016), 0);
            modifier2 = companion;
            textAlign3 = textAlign2;
            function13 = function12;
            fontFamily3 = fontFamily2;
            i26 = i25;
            map4 = map3;
            textDecoration3 = textDecoration2;
            z3 = z2;
            androidx.compose.ui.text.font.FontWeight fontWeight4222 = fontWeight2;
            i27 = i24;
            fontWeight3 = fontWeight4222;
            fontStyle3 = fontStyle2;
            j8 = j6;
            j9 = m2149getUnspecified0d7_KjU;
            j10 = m4684getUnspecifiedXSAIIZE;
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
        i24 = m4409getClipgIe3tQ8;
        map3 = map2;
        i25 = i30;
        z2 = z4;
        j5 = m4684getUnspecifiedXSAIIZE3;
        j6 = m4684getUnspecifiedXSAIIZE2;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(1557618192);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "*214@10767L7,214@10806L7");
        if (m2149getUnspecified0d7_KjU != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.text.TextStyle textStyle42222 = textStyle2;
        int i312222 = i23 << 9;
        androidx.compose.foundation.text.BasicTextKt.m851BasicText4YKlhWE(text, companion, textStyle42222.merge(new androidx.compose.ui.text.TextStyle(j7, j6, fontWeight2, fontStyle2, (androidx.compose.ui.text.font.FontSynthesis) null, fontFamily2, (java.lang.String) null, m4684getUnspecifiedXSAIIZE, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, textDecoration2, (androidx.compose.ui.graphics.Shadow) null, textAlign2, (androidx.compose.ui.text.style.TextDirection) null, j5, (androidx.compose.ui.text.style.TextIndent) null, 175952, (kotlin.jvm.internal.DefaultConstructorMarker) null)), function12, i24, z2, i25, map3, startRestartGroup, (i6 & 112) | (i6 & 14) | 16777216 | ((i23 >> 6) & 7168) | (i312222 & 57344) | (i312222 & 458752) | (i312222 & 3670016), 0);
        modifier2 = companion;
        textAlign3 = textAlign2;
        function13 = function12;
        fontFamily3 = fontFamily2;
        i26 = i25;
        map4 = map3;
        textDecoration3 = textDecoration2;
        z3 = z2;
        androidx.compose.ui.text.font.FontWeight fontWeight42222 = fontWeight2;
        i27 = i24;
        fontWeight3 = fontWeight42222;
        fontStyle3 = fontStyle2;
        j8 = j6;
        j9 = m2149getUnspecified0d7_KjU;
        j10 = m4684getUnspecifiedXSAIIZE;
        textStyle3 = textStyle42222;
        j11 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final androidx.compose.ui.text.TextStyle value, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1772272796);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ProvideTextStyle)P(1)263@12533L7,264@12558L80:Text.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.TextStyle> providableCompositionLocal = LocalTextStyle;
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(providableCompositionLocal);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{providableCompositionLocal.provides(((androidx.compose.ui.text.TextStyle) consume).merge(value))}, content, startRestartGroup, (i2 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                androidx.compose.material.TextKt.ProvideTextStyle(androidx.compose.ui.text.TextStyle.this, content, composer2, i | 1);
            }
        });
    }
}
