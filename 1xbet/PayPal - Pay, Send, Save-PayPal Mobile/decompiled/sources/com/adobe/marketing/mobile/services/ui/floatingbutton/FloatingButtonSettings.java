package com.adobe.marketing.mobile.services.ui.floatingbutton;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u0019B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;", "", "", "p0", "p1", "Landroid/graphics/Bitmap;", "p2", "", "p3", "<init>", "(IILandroid/graphics/Bitmap;F)V", "cornerRadius", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCornerRadius", "()F", "height", com.visa.cbp.getEncExpo.warmup, "getHeight", "()I", "initialGraphic", "Landroid/graphics/Bitmap;", "getInitialGraphic", "()Landroid/graphics/Bitmap;", "width", "getWidth", "Builder"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FloatingButtonSettings {
    public static final int $stable = 8;
    private final float cornerRadius;
    private final int height;
    private final android.graphics.Bitmap initialGraphic;
    private final int width;

    private FloatingButtonSettings(int i, int i2, android.graphics.Bitmap bitmap, float f) {
        this.height = i;
        this.width = i2;
        this.initialGraphic = bitmap;
        this.cornerRadius = f;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final android.graphics.Bitmap getInitialGraphic() {
        return this.initialGraphic;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings$Builder;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;", "build", "()Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings;", "", "cornerRadius", "(F)Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings$Builder;", "", "height", "(I)Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings$Builder;", "Landroid/graphics/Bitmap;", "initialGraphic", "(Landroid/graphics/Bitmap;)Lcom/adobe/marketing/mobile/services/ui/floatingbutton/FloatingButtonSettings$Builder;", "width", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Bitmap;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int Camera2StreamConfigurationMap = 56;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes = 56;
        private float getHighSpeedVideoFpsRangesFor = 5.0f;

        public final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings.Builder height(int height) {
            this.Camera2StreamConfigurationMap = height;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings.Builder width(int width) {
            this.getHighSpeedVideoSizes = width;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings.Builder cornerRadius(float cornerRadius) {
            this.getHighSpeedVideoFpsRangesFor = cornerRadius;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings.Builder initialGraphic(android.graphics.Bitmap initialGraphic) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialGraphic, "");
            this.getHighResolutionOutputSizeshNQ4ISI = initialGraphic;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings build() {
            android.graphics.Bitmap bitmap = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bitmap != null) {
                return new com.adobe.marketing.mobile.services.ui.floatingbutton.FloatingButtonSettings(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, bitmap, this.getHighSpeedVideoFpsRangesFor, null);
            }
            throw new java.lang.IllegalArgumentException("Initial graphic must be set");
        }
    }

    public /* synthetic */ FloatingButtonSettings(int i, int i2, android.graphics.Bitmap bitmap, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, bitmap, f);
    }
}
