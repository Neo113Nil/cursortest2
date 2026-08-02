package androidx.core.app;

/* loaded from: classes3.dex */
final class ActivityRecreator {
    protected static final java.lang.Class<?> Camera2StreamConfigurationMap;
    protected static final java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI;
    protected static final java.lang.reflect.Method getHighSpeedVideoFpsRanges;
    protected static final java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
    protected static final java.lang.reflect.Method getHighSpeedVideoSizes;
    private static final android.os.Handler getHighSpeedVideoSizesFor = new android.os.Handler(android.os.Looper.getMainLooper());
    protected static final java.lang.reflect.Field getInputFormats;

    private ActivityRecreator() {
    }

    static {
        java.lang.Class<?> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2;
        getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRangesFor();
        getInputFormats = getHighSpeedVideoSizes();
        getHighSpeedVideoSizes = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2);
        getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap2);
        getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2);
    }

    static boolean getHighSpeedVideoSizes(android.app.Activity activity) {
        java.lang.Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if ((android.os.Build.VERSION.SDK_INT == 26 || android.os.Build.VERSION.SDK_INT == 27) && getHighSpeedVideoFpsRangesFor == null) {
            return false;
        }
        if (getHighSpeedVideoFpsRanges == null && getHighSpeedVideoSizes == null) {
            return false;
        }
        try {
            final java.lang.Object obj2 = getInputFormats.get(activity);
            if (obj2 == null || (obj = getHighResolutionOutputSizeshNQ4ISI.get(activity)) == null) {
                return false;
            }
            final android.app.Application application = activity.getApplication();
            final androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks lifecycleCheckCallbacks = new androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks(activity);
            application.registerActivityLifecycleCallbacks(lifecycleCheckCallbacks);
            android.os.Handler handler = getHighSpeedVideoSizesFor;
            handler.post(new java.lang.Runnable() { // from class: androidx.core.app.ActivityRecreator.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.core.app.ActivityRecreator.LifecycleCheckCallbacks.this.getHighSpeedVideoFpsRanges = obj2;
                }
            });
            try {
                if (android.os.Build.VERSION.SDK_INT == 26 || android.os.Build.VERSION.SDK_INT == 27) {
                    getHighSpeedVideoFpsRangesFor.invoke(obj, obj2, null, null, 0, java.lang.Boolean.FALSE, null, null, java.lang.Boolean.FALSE, java.lang.Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                handler.post(new java.lang.Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                    @Override // java.lang.Runnable
                    public void run() {
                        application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                    }
                });
                return true;
            } catch (java.lang.Throwable th) {
                getHighSpeedVideoSizesFor.post(new java.lang.Runnable() { // from class: androidx.core.app.ActivityRecreator.2
                    @Override // java.lang.Runnable
                    public void run() {
                        application.unregisterActivityLifecycleCallbacks(lifecycleCheckCallbacks);
                    }
                });
                throw th;
            }
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    static final class LifecycleCheckCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        java.lang.Object getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private android.app.Activity getHighSpeedVideoSizes;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private boolean Camera2StreamConfigurationMap = false;
        private boolean getInputFormats = false;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(android.app.Activity activity) {
        }

        LifecycleCheckCallbacks(android.app.Activity activity) {
            this.getHighSpeedVideoSizes = activity;
            this.getHighSpeedVideoFpsRangesFor = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            if (this.getHighSpeedVideoSizes == activity) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(android.app.Activity activity) {
            if (!this.Camera2StreamConfigurationMap || this.getInputFormats || this.getHighResolutionOutputSizeshNQ4ISI || !androidx.core.app.ActivityRecreator.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, activity)) {
                return;
            }
            this.getInputFormats = true;
            this.getHighSpeedVideoFpsRanges = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(android.app.Activity activity) {
            if (this.getHighSpeedVideoSizes == activity) {
                this.getHighSpeedVideoSizes = null;
                this.Camera2StreamConfigurationMap = true;
            }
        }
    }

    protected static boolean Camera2StreamConfigurationMap(java.lang.Object obj, int i, android.app.Activity activity) {
        try {
            final java.lang.Object obj2 = getInputFormats.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                final java.lang.Object obj3 = getHighResolutionOutputSizeshNQ4ISI.get(activity);
                getHighSpeedVideoSizesFor.postAtFrontOfQueue(new java.lang.Runnable() { // from class: androidx.core.app.ActivityRecreator.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (androidx.core.app.ActivityRecreator.getHighSpeedVideoSizes != null) {
                                androidx.core.app.ActivityRecreator.getHighSpeedVideoSizes.invoke(obj3, obj2, java.lang.Boolean.FALSE, "AppCompat recreation");
                            } else {
                                androidx.core.app.ActivityRecreator.getHighSpeedVideoFpsRanges.invoke(obj3, obj2, java.lang.Boolean.FALSE);
                            }
                        } catch (java.lang.RuntimeException e) {
                            if (e.getClass() == java.lang.RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                                throw e;
                            }
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                });
                return true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    private static java.lang.reflect.Method Camera2StreamConfigurationMap(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("performStopActivity", android.os.IBinder.class, java.lang.Boolean.TYPE, java.lang.String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("performStopActivity", android.os.IBinder.class, java.lang.Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Field getHighSpeedVideoFpsRangesFor() {
        try {
            java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Field getHighSpeedVideoSizes() {
        try {
            java.lang.reflect.Field declaredField = android.app.Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.Class<?> Camera2StreamConfigurationMap() {
        try {
            return java.lang.Class.forName("android.app.ActivityThread");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    private static java.lang.reflect.Method getHighSpeedVideoFpsRanges(java.lang.Class<?> cls) {
        if ((android.os.Build.VERSION.SDK_INT != 26 && android.os.Build.VERSION.SDK_INT != 27) || cls == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", android.os.IBinder.class, java.util.List.class, java.util.List.class, java.lang.Integer.TYPE, java.lang.Boolean.TYPE, android.content.res.Configuration.class, android.content.res.Configuration.class, java.lang.Boolean.TYPE, java.lang.Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
