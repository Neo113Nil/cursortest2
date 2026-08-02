package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0014\u0010)\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Lcom/adobe/marketing/mobile/internal/util/ActivityCompatOwner;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "<init>", "()V", "Landroid/view/View;", "view", "", "attachToView$core_phoneRelease", "(Landroid/view/View;)V", "detachFromView$core_phoneRelease", "onCreate$core_phoneRelease", "onDestroy$core_phoneRelease", "Landroidx/activity/OnBackPressedDispatcher;", "Camera2StreamConfigurationMap", "Landroidx/activity/OnBackPressedDispatcher;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/lifecycle/LifecycleRegistry;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/LifecycleRegistry;", "getHighSpeedVideoFpsRangesFor", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "onBackPressedDispatcher", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistryController;", "getHighSpeedVideoSizes", "Landroidx/savedstate/SavedStateRegistryController;", "Landroidx/lifecycle/ViewModelStore;", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityCompatOwner implements androidx.view.LifecycleOwner, androidx.view.ViewModelStoreOwner, androidx.view.SavedStateRegistryOwner, androidx.view.OnBackPressedDispatcherOwner {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.view.LifecycleRegistry getHighSpeedVideoFpsRangesFor = new androidx.view.LifecycleRegistry(this);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.ViewModelStore getHighSpeedVideoSizes = new androidx.view.ViewModelStore();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.SavedStateRegistryController Camera2StreamConfigurationMap = androidx.view.SavedStateRegistryController.INSTANCE.create(this);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.OnBackPressedDispatcher getHighResolutionOutputSizeshNQ4ISI = new androidx.view.OnBackPressedDispatcher(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.internal.util.ActivityCompatOwner$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            com.adobe.marketing.mobile.internal.util.ActivityCompatOwner.m9878$r8$lambda$YqgVKkecSv717gtqBLHgvp4FYU();
        }
    });

    /* renamed from: $r8$lambda$YqgVKkecS-v717gtqBLHgvp4FYU, reason: not valid java name */
    public static /* synthetic */ void m9878$r8$lambda$YqgVKkecSv717gtqBLHgvp4FYU() {
    }

    @Override // androidx.view.LifecycleOwner
    public final androidx.view.Lifecycle getLifecycle() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.view.ViewModelStoreOwner
    /* renamed from: getViewModelStore, reason: from getter */
    public final androidx.view.ViewModelStore getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.view.SavedStateRegistryOwner
    public final androidx.view.SavedStateRegistry getSavedStateRegistry() {
        return this.Camera2StreamConfigurationMap.getSavedStateRegistry();
    }

    @Override // androidx.view.OnBackPressedDispatcherOwner
    /* renamed from: getOnBackPressedDispatcher, reason: from getter */
    public final androidx.view.OnBackPressedDispatcher getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void onCreate$core_phoneRelease() {
        this.Camera2StreamConfigurationMap.performRestore(null);
        this.getHighSpeedVideoFpsRangesFor.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
    }

    public final void onDestroy$core_phoneRelease() {
        this.getHighSpeedVideoFpsRangesFor.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
        this.getHighSpeedVideoSizes.clear();
    }

    public final void attachToView$core_phoneRelease(android.view.View view) {
        if (view != null) {
            androidx.view.C0276ViewTreeLifecycleOwner.set(view, this);
            androidx.view.C0278ViewTreeViewModelStoreOwner.set(view, this);
            androidx.view.C0291ViewTreeSavedStateRegistryOwner.set(view, this);
            androidx.view.C0271ViewTreeOnBackPressedDispatcherOwner.set(view, this);
        }
    }

    public final void detachFromView$core_phoneRelease(android.view.View view) {
        if (view != null) {
            androidx.view.C0276ViewTreeLifecycleOwner.set(view, null);
            androidx.view.C0278ViewTreeViewModelStoreOwner.set(view, null);
            androidx.view.C0291ViewTreeSavedStateRegistryOwner.set(view, null);
        }
    }
}
