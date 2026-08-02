package androidx.appcompat.widget;

/* loaded from: classes5.dex */
class ActionBarBackgroundDrawable extends android.graphics.drawable.Drawable {
    final androidx.appcompat.widget.ActionBarContainer Camera2StreamConfigurationMap;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }

    public ActionBarBackgroundDrawable(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
        this.Camera2StreamConfigurationMap = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) {
            if (this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI != null) {
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.draw(canvas);
            }
        } else {
            if (this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes != null) {
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.draw(canvas);
            }
            if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges == null || !this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) {
            if (this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI != null) {
                androidx.appcompat.widget.ActionBarBackgroundDrawable.Api21Impl.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes, outline);
            }
        } else if (this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes != null) {
            androidx.appcompat.widget.ActionBarBackgroundDrawable.Api21Impl.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes, outline);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        public static void getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable drawable, android.graphics.Outline outline) {
            drawable.getOutline(outline);
        }
    }
}
