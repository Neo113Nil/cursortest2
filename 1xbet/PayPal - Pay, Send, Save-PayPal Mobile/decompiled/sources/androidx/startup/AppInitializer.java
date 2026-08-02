package androidx.startup;

/* loaded from: classes7.dex */
public final class AppInitializer {
    private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private static volatile androidx.startup.AppInitializer getHighResolutionOutputSizeshNQ4ISI;
    final android.content.Context getHighSpeedVideoSizes;
    final java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
    final java.util.Map<java.lang.Class<?>, java.lang.Object> getHighSpeedVideoFpsRanges = new java.util.HashMap();

    private AppInitializer(android.content.Context context) {
        this.getHighSpeedVideoSizes = context.getApplicationContext();
    }

    public static androidx.startup.AppInitializer getInstance(android.content.Context context) {
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            synchronized (Camera2StreamConfigurationMap) {
                if (getHighResolutionOutputSizeshNQ4ISI == null) {
                    getHighResolutionOutputSizeshNQ4ISI = new androidx.startup.AppInitializer(context);
                }
            }
        }
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final <T> T initializeComponent(java.lang.Class<? extends androidx.startup.Initializer<T>> cls) {
        return (T) getHighResolutionOutputSizeshNQ4ISI(cls);
    }

    public final boolean isEagerlyInitialized(java.lang.Class<? extends androidx.startup.Initializer<?>> cls) {
        return this.getHighSpeedVideoFpsRangesFor.contains(cls);
    }

    private <T> T getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<? extends androidx.startup.Initializer<?>> cls) {
        T t;
        synchronized (Camera2StreamConfigurationMap) {
            t = (T) this.getHighSpeedVideoFpsRanges.get(cls);
            if (t == null) {
                t = (T) getHighSpeedVideoSizes(cls, new java.util.HashSet());
            }
        }
        return t;
    }

    private <T> T getHighSpeedVideoSizes(java.lang.Class<? extends androidx.startup.Initializer<?>> cls, java.util.Set<java.lang.Class<?>> set) {
        T t;
        if (androidx.tracing.Trace.isEnabled()) {
            try {
                androidx.tracing.Trace.beginSection(cls.getSimpleName());
            } finally {
                androidx.tracing.Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (!this.getHighSpeedVideoFpsRanges.containsKey(cls)) {
            set.add(cls);
            try {
                androidx.startup.Initializer<?> newInstance = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (java.lang.Class<? extends androidx.startup.Initializer<?>> cls2 : dependencies) {
                        if (!this.getHighSpeedVideoFpsRanges.containsKey(cls2)) {
                            getHighSpeedVideoSizes(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.create(this.getHighSpeedVideoSizes);
                set.remove(cls);
                this.getHighSpeedVideoFpsRanges.put(cls, t);
            } catch (java.lang.Throwable th) {
                throw new androidx.startup.StartupException(th);
            }
        } else {
            t = (T) this.getHighSpeedVideoFpsRanges.get(cls);
        }
        return t;
    }

    final void getHighSpeedVideoSizes(java.lang.Class<? extends androidx.startup.InitializationProvider> cls) {
        try {
            try {
                androidx.tracing.Trace.beginSection("Startup");
                Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.getPackageManager().getProviderInfo(new android.content.ComponentName(this.getHighSpeedVideoSizes, cls), 128).metaData);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new androidx.startup.StartupException(e);
            }
        } finally {
            androidx.tracing.Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Camera2StreamConfigurationMap(android.os.Bundle bundle) {
        java.lang.String string = this.getHighSpeedVideoSizes.getString(androidx.startup.R.string.androidx_startup);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                for (java.lang.String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(str);
                        if (androidx.startup.Initializer.class.isAssignableFrom(cls)) {
                            this.getHighSpeedVideoFpsRangesFor.add(cls);
                        }
                    }
                }
                java.util.Iterator<java.lang.Class<? extends androidx.startup.Initializer<?>>> it = this.getHighSpeedVideoFpsRangesFor.iterator();
                while (it.hasNext()) {
                    getHighSpeedVideoSizes(it.next(), hashSet);
                }
            } catch (java.lang.ClassNotFoundException e) {
                throw new androidx.startup.StartupException(e);
            }
        }
    }
}
