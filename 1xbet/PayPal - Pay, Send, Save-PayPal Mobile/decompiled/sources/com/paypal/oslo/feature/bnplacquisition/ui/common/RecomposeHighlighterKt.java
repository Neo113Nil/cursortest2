package com.paypal.oslo.feature.bnplacquisition.ui.common;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "recomposeHighlighter", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/Modifier;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RecomposeHighlighterKt {
    private static final androidx.compose.ui.Modifier getHighSpeedVideoSizes;

    public static final androidx.compose.ui.Modifier recomposeHighlighter(androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return modifier.then(getHighSpeedVideoSizes);
    }

    static {
        getHighSpeedVideoSizes = androidx.compose.ui.ComposedModifierKt.composed(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$special$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("recomposeHighlighter");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt.$r8$lambda$KgkAL0VH5QnxzzULxu0QAQgBnSY((androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: $r8$lambda$3Kbz3FAk1-5_mJ2PZDBHupyqNS4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12307$r8$lambda$3Kbz3FAk15_mJ2PZDBHupyqNS4(androidx.compose.runtime.MutableState mutableState, long[] jArr, androidx.compose.runtime.MutableState mutableState2, androidx.compose.ui.text.TextMeasurer textMeasurer, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        androidx.compose.ui.text.TextLayoutResult m8016measurewNUYSr0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "");
        contentDrawScope.drawContent();
        char c = 0;
        long longValue = jArr[0] - ((java.lang.Number) mutableState2.getValue()).longValue();
        if (androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(contentDrawScope.mo6531getSizeNHjbRc()) > 0.0f) {
            if (longValue > 0) {
                kotlin.Pair pair = longValue == 1 ? kotlin.TuplesKt.to(androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.Color.INSTANCE.m6023getBlue0d7_KjU()), java.lang.Float.valueOf(contentDrawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(3.0f)))) : longValue == 2 ? kotlin.TuplesKt.to(androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.Color.INSTANCE.m6027getGreen0d7_KjU()), java.lang.Float.valueOf(contentDrawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f)))) : kotlin.TuplesKt.to(androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.ColorKt.m6046lerpjxsXWHM(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6034getYellow0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6030getRed0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), java.lang.Math.min(1.0f, (longValue - 1) / 100.0f))), java.lang.Float.valueOf(contentDrawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(5.0f)) + contentDrawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl((int) longValue))));
                long m6006unboximpl = ((androidx.compose.ui.graphics.Color) pair.component1()).m6006unboximpl();
                float floatValue = ((java.lang.Number) pair.component2()).floatValue();
                float f = floatValue / 2.0f;
                long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
                long m5812constructorimpl = androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() & 4294967295L)) - floatValue) & 4294967295L) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) - floatValue) << 32));
                boolean z = floatValue * 2.0f > androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(contentDrawScope.mo6531getSizeNHjbRc());
                if (z) {
                    m5744constructorimpl = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                }
                long j = m5744constructorimpl;
                if (z) {
                    m5812constructorimpl = contentDrawScope.mo6531getSizeNHjbRc();
                }
                androidx.compose.ui.graphics.drawscope.DrawScope.m6525drawRectAsUm42w$default(contentDrawScope, new androidx.compose.ui.graphics.SolidColor(m6006unboximpl, null), j, m5812constructorimpl, 0.0f, z ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : new androidx.compose.ui.graphics.drawscope.Stroke(floatValue, 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
                c = 0;
            }
            m8016measurewNUYSr0 = textMeasurer.m8016measurewNUYSr0(java.lang.String.valueOf(jArr[c]), (r24 & 2) != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : new androidx.compose.ui.text.TextStyle(androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(12), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16777212, (kotlin.jvm.internal.DefaultConstructorMarker) null), (r24 & 4) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : 0, (r24 & 8) != 0, (r24 & 16) != 0 ? Integer.MAX_VALUE : 0, (r24 & 32) != 0 ? androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (r24 & 64) != 0 ? textMeasurer.Camera2StreamConfigurationMap : null, (r24 & 128) != 0 ? textMeasurer.getHighSpeedVideoFpsRanges : null, (r24 & 256) != 0 ? textMeasurer.getHighSpeedVideoSizes : null, (r24 & 512) != 0 ? false : false);
            float size = ((int) (m8016measurewNUYSr0.getSize() >> 32)) + (2.0f * contentDrawScope.mo1418toPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f)));
            float size2 = (int) (m8016measurewNUYSr0.getSize() & 4294967295L);
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (contentDrawScope.mo6531getSizeNHjbRc() >> 32)) - size;
            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
            androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(contentDrawScope2, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(size2 + r7) & 4294967295L) | (java.lang.Float.floatToRawIntBits(size) << 32)), 0.0f, null, null, 0, 120, null);
            androidx.compose.ui.text.TextPainterKt.m8025drawTextd8rzKo(contentDrawScope2, m8016measurewNUYSr0, (r21 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : 0L, (r21 & 4) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0() : androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(r1 + 0.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat + r1) << 32)), (r21 & 8) != 0 ? Float.NaN : 0.0f, (r21 & 16) != 0 ? null : null, (r21 & 32) != 0 ? null : null, (r21 & 64) == 0 ? null : null, (r21 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6533getDefaultBlendMode0nO6VwU() : 0);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.Modifier $r8$lambda$KgkAL0VH5QnxzzULxu0QAQgBnSY(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(-402559530);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-402559530, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.recomposeModifier.<anonymous> (RecomposeHighlighter.kt:50)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        java.lang.Object obj = rememberedValue;
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            long[] jArr = {0};
            composer.updateRememberedValue(jArr);
            obj = jArr;
        }
        final long[] jArr2 = (long[]) obj;
        jArr2[0] = jArr2[0] + 1;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        mutableState.setValue(java.lang.Long.valueOf(jArr2[0]));
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
        long j = jArr2[0];
        boolean changedInstance = composer.changedInstance(jArr2);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$recomposeModifier$2$1$1(mutableState2, jArr2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Long.valueOf(j), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer, 0);
        final androidx.compose.ui.text.TextMeasurer rememberTextMeasurer = androidx.compose.ui.text.TextMeasurerHelperKt.rememberTextMeasurer(0, composer, 0, 1);
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        boolean changedInstance2 = composer.changedInstance(jArr2);
        boolean changed = composer.changed(rememberTextMeasurer);
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if ((changedInstance2 | changed) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.RecomposeHighlighterKt.m12307$r8$lambda$3Kbz3FAk15_mJ2PZDBHupyqNS4(androidx.compose.runtime.MutableState.this, jArr2, mutableState2, rememberTextMeasurer, (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj2);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        androidx.compose.ui.Modifier drawWithContent = androidx.compose.ui.draw.DrawModifierKt.drawWithContent(companion, (kotlin.jvm.functions.Function1) rememberedValue5);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return drawWithContent;
    }
}
