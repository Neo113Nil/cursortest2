package androidx.compose.ui.text.style;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0014J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle;", "", "other", "merge", "(Landroidx/compose/ui/text/style/TextForegroundStyle;)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Lkotlin/Function0;", "takeOrElse", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/text/style/TextForegroundStyle;", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "", "getAlpha", "()F", "alpha", "Companion", "Unspecified"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TextForegroundStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.style.TextForegroundStyle.Companion INSTANCE = androidx.compose.ui.text.style.TextForegroundStyle.Companion.getHighResolutionOutputSizeshNQ4ISI;

    /* JADX INFO: Access modifiers changed from: private */
    static androidx.compose.ui.text.style.TextForegroundStyle getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle) {
        return textForegroundStyle;
    }

    /* renamed from: getAlpha */
    float getGetHighResolutionOutputSizeshNQ4ISI();

    androidx.compose.ui.graphics.Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long getGetHighResolutionOutputSizeshNQ4ISI();

    default androidx.compose.ui.text.style.TextForegroundStyle merge(androidx.compose.ui.text.style.TextForegroundStyle other) {
        float Camera2StreamConfigurationMap;
        boolean z = other instanceof androidx.compose.ui.text.style.BrushStyle;
        if (!z || !(this instanceof androidx.compose.ui.text.style.BrushStyle)) {
            return (!z || (this instanceof androidx.compose.ui.text.style.BrushStyle)) ? (z || !(this instanceof androidx.compose.ui.text.style.BrushStyle)) ? other.takeOrElse(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.text.style.TextForegroundStyle highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.text.style.TextForegroundStyle.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.style.TextForegroundStyle.this);
                    return highSpeedVideoFpsRangesFor;
                }
            }) : this : other;
        }
        androidx.compose.ui.text.style.BrushStyle brushStyle = (androidx.compose.ui.text.style.BrushStyle) other;
        androidx.compose.ui.graphics.ShaderBrush getHighSpeedVideoFpsRangesFor = brushStyle.getGetHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = androidx.compose.ui.text.style.TextDrawStyleKt.Camera2StreamConfigurationMap(brushStyle.getGetHighResolutionOutputSizeshNQ4ISI(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.ui.text.style.TextForegroundStyle.getHighSpeedVideoSizes(androidx.compose.ui.text.style.TextForegroundStyle.this);
                return java.lang.Float.valueOf(highSpeedVideoSizes);
            }
        });
        return new androidx.compose.ui.text.style.BrushStyle(getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static float getHighSpeedVideoSizes(androidx.compose.ui.text.style.TextForegroundStyle textForegroundStyle) {
        return ((androidx.compose.ui.text.style.BrushStyle) textForegroundStyle).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    default androidx.compose.ui.text.style.TextForegroundStyle takeOrElse(kotlin.jvm.functions.Function0<? extends androidx.compose.ui.text.style.TextForegroundStyle> other) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(this, androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE) ? this : other.invoke();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "brush", "", "getAlpha", "()F", "alpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Unspecified implements androidx.compose.ui.text.style.TextForegroundStyle {
        public static final int $stable = 0;
        public static final androidx.compose.ui.text.style.TextForegroundStyle.Unspecified INSTANCE = new androidx.compose.ui.text.style.TextForegroundStyle.Unspecified();

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getAlpha */
        public final float getGetHighResolutionOutputSizeshNQ4ISI() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public final androidx.compose.ui.graphics.Brush getBrush() {
            return null;
        }

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public final long getGetHighResolutionOutputSizeshNQ4ISI() {
            return androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/text/style/TextForegroundStyle;", "from-8_81llA", "(J)Landroidx/compose/ui/text/style/TextForegroundStyle;", "from", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/Brush;F)Landroidx/compose/ui/text/style/TextForegroundStyle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.style.TextForegroundStyle.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.text.style.TextForegroundStyle.Companion();

        private Companion() {
        }

        /* renamed from: from-8_81llA, reason: not valid java name */
        public final androidx.compose.ui.text.style.TextForegroundStyle m8470from8_81llA(long color) {
            return color != 16 ? new androidx.compose.ui.text.style.ColorStyle(color, null) : androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE;
        }

        public final androidx.compose.ui.text.style.TextForegroundStyle from(androidx.compose.ui.graphics.Brush brush, float alpha) {
            if (brush == null) {
                return androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE;
            }
            if (brush instanceof androidx.compose.ui.graphics.SolidColor) {
                return m8470from8_81llA(androidx.compose.ui.text.style.TextDrawStyleKt.m8469modulateDxMtmZc(((androidx.compose.ui.graphics.SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof androidx.compose.ui.graphics.ShaderBrush) {
                return new androidx.compose.ui.text.style.BrushStyle((androidx.compose.ui.graphics.ShaderBrush) brush, alpha);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
