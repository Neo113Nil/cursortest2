package androidx.appcompat.widget;

/* loaded from: classes3.dex */
class TintResources extends androidx.appcompat.widget.ResourcesWrapper {
    private final java.lang.ref.WeakReference<android.content.Context> getHighSpeedVideoSizes;

    public TintResources(android.content.Context context, android.content.res.Resources resources) {
        super(resources);
        this.getHighSpeedVideoSizes = new java.lang.ref.WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i) throws android.content.res.Resources.NotFoundException {
        androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks;
        android.graphics.drawable.Drawable Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
        android.content.Context context = this.getHighSpeedVideoSizes.get();
        if (Camera2StreamConfigurationMap != null && context != null && (resourceManagerHooks = androidx.appcompat.widget.ResourceManagerInternal.get().getHighSpeedVideoFpsRangesFor) != null) {
            resourceManagerHooks.tintDrawableUsingColorFilter(context, i, Camera2StreamConfigurationMap);
        }
        return Camera2StreamConfigurationMap;
    }
}
