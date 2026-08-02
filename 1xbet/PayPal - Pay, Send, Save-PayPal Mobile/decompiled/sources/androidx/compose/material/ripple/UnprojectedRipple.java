package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple;", "Landroid/graphics/drawable/RippleDrawable;", "", "p0", "<init>", "(Z)V", "Landroidx/compose/ui/graphics/Color;", "", "p1", "", "Camera2StreamConfigurationMap", "(JF)V", "isProjected", "()Z", "Landroid/graphics/Rect;", "getDirtyBounds", "()Landroid/graphics/Rect;", "", "getHighSpeedVideoFpsRangesFor", "(I)V", "getHighSpeedVideoSizes", "(JF)J", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Color;", "Ljava/lang/Integer;", "Companion", "MRadiusHelper"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UnprojectedRipple extends android.graphics.drawable.RippleDrawable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Integer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Color Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    public UnprojectedRipple(boolean z) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public final void Camera2StreamConfigurationMap(long p0, float p1) {
        long highSpeedVideoSizes = getHighSpeedVideoSizes(p0, p1);
        androidx.compose.ui.graphics.Color color = this.Camera2StreamConfigurationMap;
        if (color != null && androidx.compose.ui.graphics.Color.m5997equalsimpl0(color.m6006unboximpl(), highSpeedVideoSizes)) {
            return;
        }
        this.Camera2StreamConfigurationMap = androidx.compose.ui.graphics.Color.m5986boximpl(highSpeedVideoSizes);
        setColor(android.content.res.ColorStateList.valueOf(androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(highSpeedVideoSizes)));
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.getHighSpeedVideoFpsRanges = false;
        return dirtyBounds;
    }

    public final void getHighSpeedVideoFpsRangesFor(int p0) {
        java.lang.Integer num = this.getHighSpeedVideoSizes;
        if (num == null || num.intValue() != p0) {
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(p0);
            androidx.compose.material.ripple.UnprojectedRipple.MRadiusHelper mRadiusHelper = androidx.compose.material.ripple.UnprojectedRipple.MRadiusHelper.INSTANCE;
            androidx.compose.material.ripple.UnprojectedRipple.MRadiusHelper.Camera2StreamConfigurationMap(this, p0);
        }
    }

    private static long getHighSpeedVideoSizes(long p0, float p1) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            p1 *= 2.0f;
        }
        return androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(p0, kotlin.ranges.RangesKt.coerceAtMost(p1, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$MRadiusHelper;", "", "<init>", "()V", "Landroid/graphics/drawable/RippleDrawable;", "p0", "", "p1", "", "Camera2StreamConfigurationMap", "(Landroid/graphics/drawable/RippleDrawable;I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class MRadiusHelper {
        public static final androidx.compose.material.ripple.UnprojectedRipple.MRadiusHelper INSTANCE = new androidx.compose.material.ripple.UnprojectedRipple.MRadiusHelper();

        private MRadiusHelper() {
        }

        public static void Camera2StreamConfigurationMap(android.graphics.drawable.RippleDrawable p0, int p1) {
            p0.setRadius(p1);
        }
    }
}
