package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
public final class ViewComponentManager implements dagger.hilt.internal.GeneratedComponentManager<java.lang.Object> {
    private final boolean Camera2StreamConfigurationMap;
    private volatile java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final android.view.View getHighSpeedVideoFpsRangesFor;
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    public interface ViewComponentBuilderEntryPoint {
        dagger.hilt.android.internal.builders.ViewComponentBuilder viewComponentBuilder();
    }

    public interface ViewWithFragmentComponentBuilderEntryPoint {
        dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder();
    }

    public ViewComponentManager(android.view.View view, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = view;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final java.lang.Object generatedComponent() {
        java.lang.Object build;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            synchronized (this.getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    dagger.hilt.internal.GeneratedComponentManager<?> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(false);
                    if (this.Camera2StreamConfigurationMap) {
                        build = ((dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint) dagger.hilt.EntryPoints.get(highSpeedVideoFpsRanges, dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint.class)).viewWithFragmentComponentBuilder().view(this.getHighSpeedVideoFpsRangesFor).build();
                    } else {
                        build = ((dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint) dagger.hilt.EntryPoints.get(highSpeedVideoFpsRanges, dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint.class)).viewComponentBuilder().view(this.getHighSpeedVideoFpsRangesFor).build();
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = build;
                }
            }
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final dagger.hilt.internal.GeneratedComponentManager<?> maybeGetParentComponentManager() {
        return getHighSpeedVideoFpsRanges(true);
    }

    private dagger.hilt.internal.GeneratedComponentManager<?> getHighSpeedVideoFpsRanges(boolean z) {
        if (this.Camera2StreamConfigurationMap) {
            android.content.Context Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.class, z);
            if (Camera2StreamConfigurationMap instanceof dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper) {
                dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper fragmentContextWrapper = (dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper) Camera2StreamConfigurationMap;
                dagger.hilt.internal.Preconditions.checkNotNull(fragmentContextWrapper.getHighSpeedVideoSizes, "The fragment has already been destroyed.");
                return (dagger.hilt.internal.GeneratedComponentManager) fragmentContextWrapper.getHighSpeedVideoSizes;
            }
            if (z) {
                return null;
            }
            dagger.hilt.internal.Preconditions.checkState(!(r4 instanceof dagger.hilt.internal.GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.getHighSpeedVideoFpsRangesFor.getClass(), Camera2StreamConfigurationMap(dagger.hilt.internal.GeneratedComponentManager.class, z).getClass().getName());
        } else {
            java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(dagger.hilt.internal.GeneratedComponentManager.class, z);
            if (Camera2StreamConfigurationMap2 instanceof dagger.hilt.internal.GeneratedComponentManager) {
                return (dagger.hilt.internal.GeneratedComponentManager) Camera2StreamConfigurationMap2;
            }
            if (z) {
                return null;
            }
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.getHighSpeedVideoFpsRangesFor.getClass()));
    }

    private android.content.Context Camera2StreamConfigurationMap(java.lang.Class<?> cls, boolean z) {
        android.content.Context context = this.getHighSpeedVideoFpsRangesFor.getContext();
        while ((context instanceof android.content.ContextWrapper) && !cls.isInstance(context)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (context != dagger.hilt.android.internal.Contexts.getApplication(context.getApplicationContext())) {
            return context;
        }
        dagger.hilt.internal.Preconditions.checkState(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.getHighSpeedVideoFpsRangesFor.getClass());
        return null;
    }

    public static final class FragmentContextWrapper extends android.content.ContextWrapper {
        private android.view.LayoutInflater Camera2StreamConfigurationMap;
        private android.view.LayoutInflater getHighSpeedVideoFpsRanges;
        private final androidx.view.LifecycleEventObserver getHighSpeedVideoFpsRangesFor;
        androidx.fragment.app.Fragment getHighSpeedVideoSizes;

        static /* synthetic */ android.view.LayoutInflater Camera2StreamConfigurationMap(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper fragmentContextWrapper) {
            fragmentContextWrapper.getHighSpeedVideoFpsRanges = null;
            return null;
        }

        static /* synthetic */ android.view.LayoutInflater getHighResolutionOutputSizeshNQ4ISI(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper fragmentContextWrapper) {
            fragmentContextWrapper.Camera2StreamConfigurationMap = null;
            return null;
        }

        static /* synthetic */ androidx.fragment.app.Fragment getHighSpeedVideoSizes(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper fragmentContextWrapper) {
            fragmentContextWrapper.getHighSpeedVideoSizes = null;
            return null;
        }

        FragmentContextWrapper(android.content.Context context, androidx.fragment.app.Fragment fragment) {
            super((android.content.Context) dagger.hilt.internal.Preconditions.checkNotNull(context));
            androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.view.LifecycleEventObserver
                public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                        dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.getHighSpeedVideoSizes(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.this);
                        dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.Camera2StreamConfigurationMap(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.this);
                        dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.getHighResolutionOutputSizeshNQ4ISI(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.this);
                    }
                }
            };
            this.getHighSpeedVideoFpsRangesFor = lifecycleEventObserver;
            this.getHighSpeedVideoFpsRanges = null;
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) dagger.hilt.internal.Preconditions.checkNotNull(fragment);
            this.getHighSpeedVideoSizes = fragment2;
            fragment2.getLifecycleRegistry().addObserver(lifecycleEventObserver);
        }

        FragmentContextWrapper(android.view.LayoutInflater layoutInflater, androidx.fragment.app.Fragment fragment) {
            super((android.content.Context) dagger.hilt.internal.Preconditions.checkNotNull(((android.view.LayoutInflater) dagger.hilt.internal.Preconditions.checkNotNull(layoutInflater)).getContext()));
            androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.1
                @Override // androidx.view.LifecycleEventObserver
                public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                        dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.getHighSpeedVideoSizes(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.this);
                        dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.Camera2StreamConfigurationMap(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.this);
                        dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.getHighResolutionOutputSizeshNQ4ISI(dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper.this);
                    }
                }
            };
            this.getHighSpeedVideoFpsRangesFor = lifecycleEventObserver;
            this.getHighSpeedVideoFpsRanges = layoutInflater;
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) dagger.hilt.internal.Preconditions.checkNotNull(fragment);
            this.getHighSpeedVideoSizes = fragment2;
            fragment2.getLifecycleRegistry().addObserver(lifecycleEventObserver);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final java.lang.Object getSystemService(java.lang.String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.Camera2StreamConfigurationMap == null) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = (android.view.LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.cloneInContext(this);
            }
            return this.Camera2StreamConfigurationMap;
        }

        @Override // android.content.ContextWrapper
        public final void attachBaseContext(android.content.Context context) {
            super.attachBaseContext(context);
        }
    }
}
