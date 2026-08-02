package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/ColorFilter;", "getNativeColorFilter$ui_graphics", "()Landroid/graphics/ColorFilter;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ColorFilter {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.ColorFilter.Companion INSTANCE = new androidx.compose.ui.graphics.ColorFilter.Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    /* renamed from: getNativeColorFilter$ui_graphics, reason: from getter */
    public final android.graphics.ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "tint-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "tint", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix", "colorMatrix-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "multiply", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "lighting--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "lighting"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.ColorFilter m6037tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.Companion companion, long j, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = androidx.compose.ui.graphics.BlendMode.INSTANCE.m5935getSrcIn0nO6VwU();
            }
            return companion.m6040tintxETnrds(j, i);
        }

        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final androidx.compose.ui.graphics.ColorFilter m6040tintxETnrds(long color, int blendMode) {
            return new androidx.compose.ui.graphics.BlendModeColorFilter(color, blendMode, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final androidx.compose.ui.graphics.ColorFilter m6038colorMatrixjHGOpc(float[] colorMatrix) {
            return new androidx.compose.ui.graphics.ColorMatrixColorFilter(colorMatrix, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final androidx.compose.ui.graphics.ColorFilter m6039lightingOWjLjI(long multiply, long add) {
            return new androidx.compose.ui.graphics.LightingColorFilter(multiply, add, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
