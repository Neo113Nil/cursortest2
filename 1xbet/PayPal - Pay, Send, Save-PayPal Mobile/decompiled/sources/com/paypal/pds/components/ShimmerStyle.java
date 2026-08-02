package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/pds/components/ShimmerStyle;", "", "Landroidx/compose/ui/graphics/Shape;", "p0", "<init>", "(Landroidx/compose/ui/graphics/Shape;)V", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape$pds_release", "()Landroidx/compose/ui/graphics/Shape;", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "getColorStops", "(Landroidx/compose/runtime/Composer;I)[Lkotlin/Pair;", "colorStops", androidx.compose.material3.internal.TextFieldImplKt.ContainerId, "Text", "Rounded", "Lcom/paypal/pds/components/ShimmerStyle$Container;", "Lcom/paypal/pds/components/ShimmerStyle$Rounded;", "Lcom/paypal/pds/components/ShimmerStyle$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ShimmerStyle {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.Shape shape;

    private ShimmerStyle(androidx.compose.ui.graphics.Shape shape) {
        this.shape = shape;
    }

    /* renamed from: getShape$pds_release, reason: from getter */
    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ShimmerStyle$Container;", "Lcom/paypal/pds/components/ShimmerStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Container extends com.paypal.pds.components.ShimmerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ShimmerStyle.Container INSTANCE = new com.paypal.pds.components.ShimmerStyle.Container();

        private Container() {
            super(com.paypal.pds.core.ConstantsKt.getRoundedCornerShape8(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ShimmerStyle$Text;", "Lcom/paypal/pds/components/ShimmerStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Text extends com.paypal.pds.components.ShimmerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ShimmerStyle.Text INSTANCE = new com.paypal.pds.components.ShimmerStyle.Text();

        private Text() {
            super(com.paypal.pds.core.ConstantsKt.getRoundedCornerShape4(), null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ShimmerStyle$Rounded;", "Lcom/paypal/pds/components/ShimmerStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Rounded extends com.paypal.pds.components.ShimmerStyle {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ShimmerStyle.Rounded INSTANCE = new com.paypal.pds.components.ShimmerStyle.Rounded();

        private Rounded() {
            super(com.paypal.pds.core.ConstantsKt.getRoundedCornerShapeFull(), null);
        }
    }

    public final kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] getColorStops(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(495669276, i, -1, "com.paypal.pds.components.ShimmerStyle.<get-colorStops> (Shimmer.kt:227)");
        }
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(composer, 0);
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        spreadBuilder.addSpread(new java.lang.Object[0]);
        spreadBuilder.add(localTokens);
        boolean z = false;
        for (java.lang.Object obj : spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()])) {
            z |= composer.changed(obj);
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            long value = com.paypal.pds.core.Color.BackgroundShimmerStart.INSTANCE.value(localTokens);
            long value2 = com.paypal.pds.core.Color.BackgroundShimmerEnd.INSTANCE.value(localTokens);
            rememberedValue = new kotlin.Pair[]{kotlin.TuplesKt.to(java.lang.Float.valueOf(0.0f), androidx.compose.ui.graphics.Color.m5986boximpl(value2)), kotlin.TuplesKt.to(java.lang.Float.valueOf(0.5f), androidx.compose.ui.graphics.Color.m5986boximpl(value)), kotlin.TuplesKt.to(java.lang.Float.valueOf(1.0f), androidx.compose.ui.graphics.Color.m5986boximpl(value2))};
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] pairArr = (kotlin.Pair[]) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pairArr;
    }

    public /* synthetic */ ShimmerStyle(androidx.compose.ui.graphics.Shape shape, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(shape);
    }
}
