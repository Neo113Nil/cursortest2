package dagger.hilt.android.internal.managers;

import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.AnonymousClass1;

/* loaded from: classes17.dex */
public class ActivityComponentManager implements dagger.hilt.internal.GeneratedComponentManager<java.lang.Object> {
    private volatile java.lang.Object Camera2StreamConfigurationMap;
    protected final android.app.Activity activity;
    private dagger.hilt.android.internal.managers.SavedStateHandleHolder getHighSpeedVideoFpsRanges;
    private final dagger.hilt.internal.GeneratedComponentManager<dagger.hilt.android.components.ActivityRetainedComponent> getHighSpeedVideoFpsRangesFor;
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    public interface ActivityComponentBuilderEntryPoint {
        dagger.hilt.android.internal.builders.ActivityComponentBuilder activityComponentBuilder();
    }

    public ActivityComponentManager(android.app.Activity activity) {
        this.activity = activity;
        this.getHighSpeedVideoFpsRangesFor = new dagger.hilt.android.internal.managers.ActivityRetainedComponentManager((androidx.view.ComponentActivity) activity);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public java.lang.Object generatedComponent() {
        if (this.Camera2StreamConfigurationMap == null) {
            synchronized (this.getHighSpeedVideoSizes) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = createComponent();
                }
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    public final void initSavedStateHandleHolders() {
        dagger.hilt.android.internal.managers.ActivityRetainedComponentManager activityRetainedComponentManager = (dagger.hilt.android.internal.managers.ActivityRetainedComponentManager) this.getHighSpeedVideoFpsRangesFor;
        dagger.hilt.android.internal.managers.SavedStateHandleHolder savedStateHandleHolder = ((dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentViewModel) new androidx.view.ViewModelProvider(activityRetainedComponentManager.getHighSpeedVideoSizes, activityRetainedComponentManager.new AnonymousClass1(activityRetainedComponentManager.getHighResolutionOutputSizeshNQ4ISI)).get(dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentViewModel.class)).getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = savedStateHandleHolder;
        if (savedStateHandleHolder.isInvalid()) {
            this.getHighSpeedVideoFpsRanges.setExtras(((androidx.view.ComponentActivity) this.activity).getDefaultViewModelCreationExtras());
        }
    }

    public final void clearSavedStateHandleHolders() {
        dagger.hilt.android.internal.managers.SavedStateHandleHolder savedStateHandleHolder = this.getHighSpeedVideoFpsRanges;
        if (savedStateHandleHolder != null) {
            savedStateHandleHolder.clear();
        }
    }

    protected java.lang.Object createComponent() {
        java.lang.String obj;
        if (!(this.activity.getApplication() instanceof dagger.hilt.internal.GeneratedComponentManager)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (android.app.Application.class.equals(this.activity.getApplication().getClass())) {
                obj = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Found: ");
                sb2.append(this.activity.getApplication().getClass());
                obj = sb2.toString();
            }
            sb.append(obj);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return ((dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint) dagger.hilt.EntryPoints.get(this.getHighSpeedVideoFpsRangesFor, dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint.class)).activityComponentBuilder().activity(this.activity).build();
    }
}
