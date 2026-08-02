package androidx.core.graphics.drawable;

/* loaded from: classes7.dex */
class RoundedBitmapDrawable21 extends androidx.core.graphics.drawable.RoundedBitmapDrawable {
    protected RoundedBitmapDrawable21(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        getHighSpeedVideoSizes();
        outline.setRoundRect(this.getHighSpeedVideoFpsRanges, getCornerRadius());
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public void setMipMap(boolean z) {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoFpsRangesFor.setHasMipMap(z);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    public boolean hasMipMap() {
        return this.getHighSpeedVideoFpsRangesFor != null && this.getHighSpeedVideoFpsRangesFor.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.RoundedBitmapDrawable
    void getHighSpeedVideoFpsRanges(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.view.Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
