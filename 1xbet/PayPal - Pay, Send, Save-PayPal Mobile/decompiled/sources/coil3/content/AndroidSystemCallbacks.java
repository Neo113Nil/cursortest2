package coil3.content;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 '2\u00020\u0001:\u0003()'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR5\u0010\f\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00020\u00020\nj\f\u0012\b\u0012\u0006*\u00020\u00020\u0002`\u000b8\u0007¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0012\u001a\u00060\u0011R\u00020\u00008\u0007¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0018\u001a\u00060\u0017R\u00020\u00008\u0007¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010\t\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0007@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b&\u0010\b\u001a\u0004\b$\u0010%"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks;", "Lcoil3/util/SystemCallbacks;", "Lcoil3/RealImageLoader;", "strongImageLoaderReference", "<init>", "(Lcoil3/RealImageLoader;)V", "", "registerMemoryPressureCallbacks", "()V", "shutdown", "Ljava/lang/ref/WeakReference;", "Lcoil3/util/getHighResolutionOutputSizeshNQ4ISI;", "imageLoader", "Ljava/lang/ref/WeakReference;", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "Lcoil3/util/AndroidSystemCallbacks$ActivityCallbacks;", "activityCallbacks", "Lcoil3/util/AndroidSystemCallbacks$ActivityCallbacks;", "getActivityCallbacks", "()Lcoil3/util/AndroidSystemCallbacks$ActivityCallbacks;", "getActivityCallbacks$annotations", "Lcoil3/util/AndroidSystemCallbacks$ComponentCallbacks;", "componentCallbacks", "Lcoil3/util/AndroidSystemCallbacks$ComponentCallbacks;", "getComponentCallbacks", "()Lcoil3/util/AndroidSystemCallbacks$ComponentCallbacks;", "getComponentCallbacks$annotations", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "", "p0", "Z", "getShutdown", "()Z", "getShutdown$annotations", "Companion", "ActivityCallbacks", "ComponentCallbacks"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidSystemCallbacks implements coil3.content.SystemCallbacks {
    private static final coil3.util.AndroidSystemCallbacks.Companion Companion = new coil3.util.AndroidSystemCallbacks.Companion(null);
    private final coil3.util.AndroidSystemCallbacks.ActivityCallbacks activityCallbacks;
    private final coil3.util.AndroidSystemCallbacks.ComponentCallbacks componentCallbacks = new coil3.util.AndroidSystemCallbacks.ComponentCallbacks();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.ref.WeakReference<coil3.RealImageLoader> imageLoader;
    private boolean shutdown;

    public static /* synthetic */ void getActivityCallbacks$annotations() {
    }

    public static /* synthetic */ void getComponentCallbacks$annotations() {
    }

    public static /* synthetic */ void getImageLoader$annotations() {
    }

    public static /* synthetic */ void getShutdown$annotations() {
    }

    public AndroidSystemCallbacks(coil3.RealImageLoader realImageLoader) {
        this.imageLoader = new java.lang.ref.WeakReference<>(realImageLoader);
        this.activityCallbacks = new coil3.util.AndroidSystemCallbacks.ActivityCallbacks(realImageLoader);
    }

    public final java.lang.ref.WeakReference<coil3.RealImageLoader> getImageLoader() {
        return this.imageLoader;
    }

    public final coil3.util.AndroidSystemCallbacks.ActivityCallbacks getActivityCallbacks() {
        return this.activityCallbacks;
    }

    public final coil3.util.AndroidSystemCallbacks.ComponentCallbacks getComponentCallbacks() {
        return this.componentCallbacks;
    }

    public final boolean getShutdown() {
        return this.shutdown;
    }

    @Override // coil3.content.SystemCallbacks
    public final void shutdown() {
        synchronized (this) {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
            if (context != null) {
                this.activityCallbacks.unregister(context);
                context.unregisterComponentCallbacks(this.componentCallbacks);
            }
            this.imageLoader.clear();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks$ActivityCallbacks;", "Lcoil3/util/DefaultActivityLifecycleCallbacks;", "Lcoil3/RealImageLoader;", "strongImageLoaderReference", "<init>", "(Lcoil3/util/AndroidSystemCallbacks;Lcoil3/RealImageLoader;)V", "Landroid/content/Context;", "context", "", "register", "(Landroid/content/Context;)V", "unregister", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "", "getHighSpeedVideoFpsRangesFor", "D", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ActivityCallbacks implements coil3.content.DefaultActivityLifecycleCallbacks {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final double getHighResolutionOutputSizeshNQ4ISI;

        public ActivityCallbacks(coil3.RealImageLoader realImageLoader) {
            this.getHighResolutionOutputSizeshNQ4ISI = coil3.ImageLoaders_androidKt.getMemoryCacheMaxSizePercentWhileInBackground(realImageLoader.getGetHighSpeedVideoFpsRangesFor());
        }

        public final void register(android.content.Context context) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == 1.0d) {
                return;
            }
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(this);
            coil3.content.AndroidSystemCallbacks androidSystemCallbacks = coil3.content.AndroidSystemCallbacks.this;
            coil3.RealImageLoader realImageLoader = androidSystemCallbacks.getImageLoader().get();
            if (realImageLoader != null) {
                coil3.memory.MemoryCache memoryCache = realImageLoader.getMemoryCache();
                if (memoryCache != null) {
                    memoryCache.setMaxSize((long) (this.getHighResolutionOutputSizeshNQ4ISI * memoryCache.getInitialMaxSize()));
                    coil3.content.Logger logger = realImageLoader.getGetHighSpeedVideoFpsRangesFor().getLogger();
                    if (logger != null) {
                        coil3.util.Logger.Level level = coil3.util.Logger.Level.Verbose;
                        if (logger.getMinLevel().compareTo(level) <= 0) {
                            long maxSize = memoryCache.getMaxSize();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Restricting ");
                            sb.append(memoryCache);
                            sb.append("'s max size to ");
                            sb.append(maxSize);
                            sb.append(" bytes.");
                            logger.log("AndroidSystemCallbacks", level, sb.toString(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            androidSystemCallbacks.shutdown();
        }

        public final void unregister(android.content.Context context) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == 1.0d) {
                return;
            }
            android.content.Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
            ((android.app.Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            coil3.content.AndroidSystemCallbacks androidSystemCallbacks = coil3.content.AndroidSystemCallbacks.this;
            coil3.RealImageLoader realImageLoader = androidSystemCallbacks.getImageLoader().get();
            if (realImageLoader != null) {
                coil3.memory.MemoryCache memoryCache = realImageLoader.getMemoryCache();
                if (memoryCache != null) {
                    memoryCache.setMaxSize(memoryCache.getInitialMaxSize());
                    coil3.content.Logger logger = realImageLoader.getGetHighSpeedVideoFpsRangesFor().getLogger();
                    if (logger != null) {
                        coil3.util.Logger.Level level = coil3.util.Logger.Level.Verbose;
                        if (logger.getMinLevel().compareTo(level) <= 0) {
                            long maxSize = memoryCache.getMaxSize();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Restoring ");
                            sb.append(memoryCache);
                            sb.append("'s max size to ");
                            sb.append(maxSize);
                            sb.append(" bytes.");
                            logger.log("AndroidSystemCallbacks", level, sb.toString(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            androidSystemCallbacks.shutdown();
        }

        @Override // coil3.content.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(android.app.Activity activity) {
            unregister(activity);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks$ComponentCallbacks;", "Landroid/content/ComponentCallbacks2;", "<init>", "(Lcoil3/util/AndroidSystemCallbacks;)V", "", "level", "", "onTrimMemory", "(I)V", "onLowMemory", "()V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ComponentCallbacks implements android.content.ComponentCallbacks2 {
        public ComponentCallbacks() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int level) {
            coil3.memory.MemoryCache memoryCache;
            coil3.content.AndroidSystemCallbacks androidSystemCallbacks = coil3.content.AndroidSystemCallbacks.this;
            synchronized (androidSystemCallbacks) {
                coil3.RealImageLoader realImageLoader = androidSystemCallbacks.getImageLoader().get();
                if (realImageLoader != null) {
                    coil3.content.Logger logger = realImageLoader.getGetHighSpeedVideoFpsRangesFor().getLogger();
                    if (logger != null) {
                        coil3.util.Logger.Level level2 = coil3.util.Logger.Level.Verbose;
                        if (logger.getMinLevel().compareTo(level2) <= 0) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("trimMemory, level=");
                            sb.append(level);
                            logger.log("AndroidSystemCallbacks", level2, sb.toString(), null);
                        }
                    }
                    if (level >= 40) {
                        coil3.memory.MemoryCache memoryCache2 = realImageLoader.getMemoryCache();
                        if (memoryCache2 != null) {
                            memoryCache2.clear();
                        }
                    } else if (level >= 20) {
                        androidSystemCallbacks.getActivityCallbacks().register(realImageLoader.getGetHighSpeedVideoFpsRangesFor().getApplication());
                    } else if (level >= 10 && (memoryCache = realImageLoader.getMemoryCache()) != null) {
                        memoryCache.trimToSize(memoryCache.getSize() / 2);
                    }
                } else {
                    androidSystemCallbacks.shutdown();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(android.content.res.Configuration newConfig) {
            coil3.content.AndroidSystemCallbacks androidSystemCallbacks = coil3.content.AndroidSystemCallbacks.this;
            synchronized (androidSystemCallbacks) {
                if (androidSystemCallbacks.getImageLoader().get() == null) {
                    androidSystemCallbacks.shutdown();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil3/util/AndroidSystemCallbacks$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // coil3.content.SystemCallbacks
    public final void registerMemoryPressureCallbacks() {
        synchronized (this) {
            coil3.RealImageLoader realImageLoader = getImageLoader().get();
            if (realImageLoader != null) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    android.content.Context application = realImageLoader.getGetHighSpeedVideoFpsRangesFor().getApplication();
                    this.getHighResolutionOutputSizeshNQ4ISI = application;
                    application.registerComponentCallbacks(this.componentCallbacks);
                }
            } else {
                shutdown();
            }
        }
    }
}
