package androidx.appcompat.app;

/* loaded from: classes3.dex */
public abstract class AppCompatDelegate {
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static androidx.appcompat.app.AppCompatDelegate.SerialExecutor Camera2StreamConfigurationMap = new androidx.appcompat.app.AppCompatDelegate.SerialExecutor(new androidx.appcompat.app.AppCompatDelegate.ThreadPerTaskExecutor());
    private static int getHighResolutionOutputSizeshNQ4ISI = -100;
    private static androidx.core.os.LocaleListCompat getInputSizeshNQ4ISI = null;
    private static androidx.core.os.LocaleListCompat getOutputMinFrameDuration = null;
    private static java.lang.Boolean getOutputFormats = null;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static final androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> getHighSpeedVideoFpsRanges = new androidx.collection.ArraySet<>();
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public abstract void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    @java.lang.Deprecated
    public void attachBaseContext(android.content.Context context) {
    }

    public abstract android.view.View createView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet);

    public abstract <T extends android.view.View> T findViewById(int i);

    public android.content.Context getContextForDelegate() {
        return null;
    }

    public abstract androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    boolean getHighSpeedVideoFpsRangesFor() {
        return false;
    }

    public int getLocalNightMode() {
        return -100;
    }

    public abstract android.view.MenuInflater getMenuInflater();

    public abstract androidx.appcompat.app.ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(android.content.res.Configuration configuration);

    public abstract void onCreate(android.os.Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(android.os.Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(android.os.Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(android.view.View view);

    public abstract void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    public abstract void setLocalNightMode(int i);

    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar);

    public void setTheme(int i) {
    }

    public abstract void setTitle(java.lang.CharSequence charSequence);

    public abstract androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback callback);

    static class SerialExecutor implements java.util.concurrent.Executor {
        java.lang.Runnable Camera2StreamConfigurationMap;
        final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
        private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        final java.util.Queue<java.lang.Runnable> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayDeque();

        SerialExecutor(java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRangesFor = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(final java.lang.Runnable runnable) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                this.getHighResolutionOutputSizeshNQ4ISI.add(new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$SerialExecutor$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.appcompat.app.AppCompatDelegate.SerialExecutor.this.Camera2StreamConfigurationMap(runnable);
                    }
                });
                if (this.Camera2StreamConfigurationMap == null) {
                    Camera2StreamConfigurationMap();
                }
            }
        }

        /* synthetic */ void Camera2StreamConfigurationMap(java.lang.Runnable runnable) {
            try {
                runnable.run();
            } finally {
                Camera2StreamConfigurationMap();
            }
        }

        protected void Camera2StreamConfigurationMap() {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                java.lang.Runnable poll = this.getHighResolutionOutputSizeshNQ4ISI.poll();
                this.Camera2StreamConfigurationMap = poll;
                if (poll != null) {
                    this.getHighSpeedVideoFpsRangesFor.execute(poll);
                }
            }
        }
    }

    static class ThreadPerTaskExecutor implements java.util.concurrent.Executor {
        ThreadPerTaskExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            new java.lang.Thread(runnable).start();
        }
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(activity, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Dialog dialog, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context context, android.view.Window window, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(context, window, appCompatCallback);
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context context, android.app.Activity activity, androidx.appcompat.app.AppCompatCallback appCompatCallback) {
        return new androidx.appcompat.app.AppCompatDelegateImpl(context, activity, appCompatCallback);
    }

    AppCompatDelegate() {
    }

    public android.content.Context attachBaseContext2(android.content.Context context) {
        attachBaseContext(context);
        return context;
    }

    public static void setDefaultNightMode(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && getHighResolutionOutputSizeshNQ4ISI != i) {
            getHighResolutionOutputSizeshNQ4ISI = i;
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public static void setApplicationLocales(androidx.core.os.LocaleListCompat localeListCompat) {
        java.util.Objects.requireNonNull(localeListCompat);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (highSpeedVideoSizes != null) {
                androidx.appcompat.app.AppCompatDelegate.Api33Impl.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.appcompat.app.AppCompatDelegate.Api24Impl.Camera2StreamConfigurationMap(localeListCompat.toLanguageTags()));
                return;
            }
            return;
        }
        if (localeListCompat.equals(getInputSizeshNQ4ISI)) {
            return;
        }
        synchronized (getHighSpeedVideoFpsRangesFor) {
            getInputSizeshNQ4ISI = localeListCompat;
            getInputSizeshNQ4ISI();
        }
    }

    public static androidx.core.os.LocaleListCompat getApplicationLocales() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (highSpeedVideoSizes != null) {
                return androidx.core.os.LocaleListCompat.wrap(androidx.appcompat.app.AppCompatDelegate.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoSizes));
            }
        } else {
            androidx.core.os.LocaleListCompat localeListCompat = getInputSizeshNQ4ISI;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return androidx.core.os.LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    static androidx.core.os.LocaleListCompat getHighSpeedVideoFpsRanges() {
        return getInputSizeshNQ4ISI;
    }

    static androidx.core.os.LocaleListCompat Camera2StreamConfigurationMap() {
        return getOutputMinFrameDuration;
    }

    static java.lang.Object getHighSpeedVideoSizes() {
        android.content.Context contextForDelegate;
        java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            androidx.appcompat.app.AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                return contextForDelegate.getSystemService("locale");
            }
        }
        return null;
    }

    static boolean Camera2StreamConfigurationMap(android.content.Context context) {
        if (getOutputFormats == null) {
            try {
                android.content.pm.ServiceInfo serviceInfo = androidx.appcompat.app.AppLocalesMetadataHolderService.getServiceInfo(context);
                if (serviceInfo.metaData != null) {
                    getOutputFormats = java.lang.Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                getOutputFormats = java.lang.Boolean.FALSE;
            }
        }
        return getOutputFormats.booleanValue();
    }

    void getOutputMinFrameDuration(final android.content.Context context) {
        Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.appcompat.app.AppCompatDelegate.getHighSpeedVideoFpsRangesFor(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getHighSpeedVideoFpsRangesFor(final android.content.Context context) {
        if (Camera2StreamConfigurationMap(context)) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                if (getHighSpeedVideoSizesFor) {
                    return;
                }
                Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.appcompat.app.AppCompatDelegate.getHighSpeedVideoFpsRanges(context);
                    }
                });
                return;
            }
            synchronized (getHighSpeedVideoSizes) {
                androidx.core.os.LocaleListCompat localeListCompat = getInputSizeshNQ4ISI;
                if (localeListCompat == null) {
                    if (getOutputMinFrameDuration == null) {
                        getOutputMinFrameDuration = androidx.core.os.LocaleListCompat.forLanguageTags(androidx.core.app.AppLocalesStorageHelper.readLocales(context));
                    }
                    if (getOutputMinFrameDuration.isEmpty()) {
                    } else {
                        getInputSizeshNQ4ISI = getOutputMinFrameDuration;
                    }
                } else if (!localeListCompat.equals(getOutputMinFrameDuration)) {
                    androidx.core.os.LocaleListCompat localeListCompat2 = getInputSizeshNQ4ISI;
                    getOutputMinFrameDuration = localeListCompat2;
                    androidx.core.app.AppLocalesStorageHelper.persistLocales(context, localeListCompat2.toLanguageTags());
                }
            }
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(android.content.Context context) {
        getHighSpeedVideoSizes(context);
        getHighSpeedVideoSizesFor = true;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        androidx.appcompat.widget.VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return androidx.appcompat.widget.VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    static void getHighSpeedVideoFpsRanges(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (getHighSpeedVideoFpsRangesFor) {
            getHighResolutionOutputSizeshNQ4ISI(appCompatDelegate);
            getHighSpeedVideoFpsRanges.add(new java.lang.ref.WeakReference<>(appCompatDelegate));
        }
    }

    static void Camera2StreamConfigurationMap(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (getHighSpeedVideoFpsRangesFor) {
            getHighResolutionOutputSizeshNQ4ISI(appCompatDelegate);
        }
    }

    static void getHighSpeedVideoSizes(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.content.ComponentName componentName = new android.content.ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (getApplicationLocales().isEmpty()) {
                    java.lang.String readLocales = androidx.core.app.AppLocalesStorageHelper.readLocales(context);
                    java.lang.Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        androidx.appcompat.app.AppCompatDelegate.Api33Impl.getHighSpeedVideoSizes(systemService, androidx.appcompat.app.AppCompatDelegate.Api24Impl.Camera2StreamConfigurationMap(readLocales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(androidx.appcompat.app.AppCompatDelegate appCompatDelegate) {
        synchronized (getHighSpeedVideoFpsRangesFor) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI() {
        synchronized (getHighSpeedVideoFpsRangesFor) {
            java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                androidx.appcompat.app.AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.applyDayNight();
                }
            }
        }
    }

    private static void getInputSizeshNQ4ISI() {
        java.util.Iterator<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> it = getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            androidx.appcompat.app.AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null) {
                appCompatDelegate.getHighSpeedVideoFpsRangesFor();
            }
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.os.LocaleList Camera2StreamConfigurationMap(java.lang.String str) {
            return android.os.LocaleList.forLanguageTags(str);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static void getHighSpeedVideoSizes(java.lang.Object obj, android.os.LocaleList localeList) {
            ((android.app.LocaleManager) obj).setApplicationLocales(localeList);
        }

        static android.os.LocaleList getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            return ((android.app.LocaleManager) obj).getApplicationLocales();
        }
    }
}
