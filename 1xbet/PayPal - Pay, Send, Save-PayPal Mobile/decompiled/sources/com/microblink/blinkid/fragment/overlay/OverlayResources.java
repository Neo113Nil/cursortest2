package com.microblink.blinkid.fragment.overlay;

/* loaded from: classes10.dex */
public abstract class OverlayResources {
    private final android.content.res.TypedArray Camera2StreamConfigurationMap;
    private final android.content.res.TypedArray getHighSpeedVideoFpsRangesFor;

    public OverlayResources(android.content.Context context, int i, int i2) {
        this.Camera2StreamConfigurationMap = context.obtainStyledAttributes(i, IlIllIlIIl());
        this.getHighSpeedVideoFpsRangesFor = context.obtainStyledAttributes(i2, IlIllIlIIl());
    }

    public final android.graphics.drawable.Drawable IlIllIlIIl(int i) {
        android.graphics.drawable.Drawable drawable = this.Camera2StreamConfigurationMap.getDrawable(i);
        return drawable != null ? drawable : this.getHighSpeedVideoFpsRangesFor.getDrawable(i);
    }

    protected abstract int[] IlIllIlIIl();

    public final int IllIIIllII(int i) {
        int resourceId = this.Camera2StreamConfigurationMap.getResourceId(i, 0);
        return resourceId != 0 ? resourceId : this.getHighSpeedVideoFpsRangesFor.getResourceId(i, 0);
    }

    public final int llIIlIlIIl(int i) {
        int color = this.Camera2StreamConfigurationMap.getColor(i, 0);
        return color != 0 ? color : this.getHighSpeedVideoFpsRangesFor.getColor(i, 0);
    }

    public final void llIIlIlIIl() {
        this.Camera2StreamConfigurationMap.recycle();
        this.getHighSpeedVideoFpsRangesFor.recycle();
    }
}
