package androidx.view;

@java.lang.Deprecated
/* loaded from: classes3.dex */
class ReflectiveGenericLifecycleObserver implements androidx.view.LifecycleEventObserver {
    private final androidx.lifecycle.ClassesInfoCache.CallbackInfo Camera2StreamConfigurationMap;
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    ReflectiveGenericLifecycleObserver(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap = androidx.view.ClassesInfoCache.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(obj.getClass());
    }

    @Override // androidx.view.LifecycleEventObserver
    public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner, event, this.getHighSpeedVideoFpsRangesFor);
    }
}
