package androidx.core.graphics.drawable;

/* loaded from: classes7.dex */
final class WrappedDrawableState extends android.graphics.drawable.Drawable.ConstantState {
    android.graphics.drawable.Drawable.ConstantState Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    android.graphics.PorterDuff.Mode getHighSpeedVideoFpsRangesFor;
    android.content.res.ColorStateList getHighSpeedVideoSizes;

    WrappedDrawableState(androidx.core.graphics.drawable.WrappedDrawableState wrappedDrawableState) {
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = androidx.core.graphics.drawable.WrappedDrawableApi14.getHighSpeedVideoFpsRanges;
        if (wrappedDrawableState != null) {
            this.getHighSpeedVideoFpsRanges = wrappedDrawableState.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = wrappedDrawableState.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = wrappedDrawableState.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = wrappedDrawableState.getHighSpeedVideoFpsRangesFor;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return new androidx.core.graphics.drawable.WrappedDrawableApi21(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.getHighSpeedVideoFpsRanges;
        android.graphics.drawable.Drawable.ConstantState constantState = this.Camera2StreamConfigurationMap;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
