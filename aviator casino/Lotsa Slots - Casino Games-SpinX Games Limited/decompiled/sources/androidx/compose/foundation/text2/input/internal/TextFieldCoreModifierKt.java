package androidx.compose.foundation.text2.input.internal;

/* compiled from: TextFieldCoreModifier.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\n\u001a\u00020\u000b*\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t¨\u0006\u0014"}, d2 = {"DefaultCursorThickness", "Landroidx/compose/ui/unit/Dp;", "F", "cursorAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "isSpecified", "", "Landroidx/compose/ui/graphics/Brush;", "(Landroidx/compose/ui/graphics/Brush;)Z", "getCursorRectInScroller", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "cursorOffset", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", com.helpshift.proactive.InAppViewConstants.RTL, "textFieldWidth", "roundToNext", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldCoreModifierKt {
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> cursorAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.m128infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.keyframes(new kotlin.jvm.functions.Function1<androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TextFieldCoreModifierKt$cursorAnimationSpec$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
            invoke2(keyframesSpecConfig);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float> keyframesSpecConfig) {
            keyframesSpecConfig.setDurationMillis(1000);
            java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf, 0);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf, 499);
            java.lang.Float valueOf2 = java.lang.Float.valueOf(0.0f);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf2, 500);
            keyframesSpecConfig.at((androidx.compose.animation.core.KeyframesSpec.KeyframesSpecConfig<java.lang.Float>) valueOf2, 999);
        }
    }), null, 0, 6, null);
    private static final float DefaultCursorThickness = androidx.compose.ui.unit.Dp.m4478constructorimpl(2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSpecified(androidx.compose.ui.graphics.Brush brush) {
        return ((brush instanceof androidx.compose.ui.graphics.SolidColor) && ((androidx.compose.ui.graphics.SolidColor) brush).getValue() == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getCursorRectInScroller(androidx.compose.ui.unit.Density density, int i, androidx.compose.ui.text.TextLayoutResult textLayoutResult, boolean z, int i2) {
        androidx.compose.ui.geometry.Rect zero;
        float left;
        float left2;
        if (textLayoutResult == null || (zero = textLayoutResult.getCursorRect(kotlin.ranges.RangesKt.coerceIn(i, (kotlin.ranges.ClosedRange<java.lang.Integer>) new kotlin.ranges.IntRange(0, textLayoutResult.getLayoutInput().getText().length())))) == null) {
            zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        androidx.compose.ui.geometry.Rect rect = zero;
        int mo309roundToPx0680j_4 = density.mo309roundToPx0680j_4(DefaultCursorThickness);
        if (z) {
            left = (i2 - rect.getLeft()) - mo309roundToPx0680j_4;
        } else {
            left = rect.getLeft();
        }
        float f = left;
        if (z) {
            left2 = i2 - rect.getLeft();
        } else {
            left2 = rect.getLeft() + mo309roundToPx0680j_4;
        }
        return androidx.compose.ui.geometry.Rect.copy$default(rect, f, 0.0f, left2, 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float roundToNext(float f) {
        double floor;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            floor = java.lang.Math.ceil(f);
        } else {
            floor = java.lang.Math.floor(f);
        }
        return (float) floor;
    }
}
