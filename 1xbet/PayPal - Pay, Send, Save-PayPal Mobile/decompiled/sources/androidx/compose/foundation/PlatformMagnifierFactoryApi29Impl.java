package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/ui/unit/Density;", "density", "", "initialZoom", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "create", "canUpdateZoom", "Z", "getCanUpdateZoom", "()Z", "PlatformMagnifierImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformMagnifierFactoryApi29Impl implements androidx.compose.foundation.PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl INSTANCE = new androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public final boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* renamed from: create-nHHXs2Y */
    public final androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl.PlatformMagnifierImpl mo1363createnHHXs2Y(android.view.View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, androidx.compose.ui.unit.Density density, float initialZoom) {
        if (useTextDefault) {
            return new androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl.PlatformMagnifierImpl(new android.widget.Magnifier(view));
        }
        long mo1419toSizeXkaWNTQ = density.mo1419toSizeXkaWNTQ(size);
        float mo1418toPx0680j_4 = density.mo1418toPx0680j_4(cornerRadius);
        float mo1418toPx0680j_42 = density.mo1418toPx0680j_4(elevation);
        android.widget.Magnifier.Builder builder = new android.widget.Magnifier.Builder(view);
        if (mo1419toSizeXkaWNTQ != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(kotlin.math.MathKt.roundToInt(java.lang.Float.intBitsToFloat((int) (mo1419toSizeXkaWNTQ >> 32))), kotlin.math.MathKt.roundToInt(java.lang.Float.intBitsToFloat((int) (mo1419toSizeXkaWNTQ & 4294967295L))));
        }
        if (!java.lang.Float.isNaN(mo1418toPx0680j_4)) {
            builder.setCornerRadius(mo1418toPx0680j_4);
        }
        if (!java.lang.Float.isNaN(mo1418toPx0680j_42)) {
            builder.setElevation(mo1418toPx0680j_42);
        }
        if (!java.lang.Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(clippingEnabled);
        return new androidx.compose.foundation.PlatformMagnifierFactoryApi29Impl.PlatformMagnifierImpl(builder.build());
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "", "update-Wko1d7g", "(JJF)V", "update"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PlatformMagnifierImpl extends androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 8;

        public PlatformMagnifierImpl(android.widget.Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public final void mo1362updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom) {
            if (!java.lang.Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if ((9223372034707292159L & magnifierCenter) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                getMagnifier().show(java.lang.Float.intBitsToFloat((int) (sourceCenter >> 32)), java.lang.Float.intBitsToFloat((int) (sourceCenter & 4294967295L)), java.lang.Float.intBitsToFloat((int) (magnifierCenter >> 32)), java.lang.Float.intBitsToFloat((int) (magnifierCenter & 4294967295L)));
            } else {
                getMagnifier().show(java.lang.Float.intBitsToFloat((int) (sourceCenter >> 32)), java.lang.Float.intBitsToFloat((int) (sourceCenter & 4294967295L)));
            }
        }
    }
}
