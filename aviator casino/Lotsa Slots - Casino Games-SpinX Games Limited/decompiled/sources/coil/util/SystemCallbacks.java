package coil.util;

/* compiled from: SystemCallbacks.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0006\u0010\u0011\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u001d\u0010%\u001a\u00020\u001b2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0'H\u0082\bR*\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00040\u00040\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006)"}, d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/NetworkObserver$Listener;", "imageLoader", "Lcoil/RealImageLoader;", "<init>", "(Lcoil/RealImageLoader;)V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getImageLoader$annotations", "()V", "getImageLoader", "()Ljava/lang/ref/WeakReference;", "application", "Landroid/content/Context;", "networkObserver", "Lcoil/network/NetworkObserver;", "shutdown", "", "getShutdown$annotations", "getShutdown", "()Z", "setShutdown", "(Z)V", "_isOnline", "isOnline", "registerMemoryPressureCallbacks", "", "registerNetworkObserver", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onTrimMemory", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "", "onLowMemory", "onConnectivityChange", "withImageLoader", "block", "Lkotlin/Function1;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemCallbacks implements android.content.ComponentCallbacks2, coil.network.NetworkObserver.Listener {
    private static final java.lang.String OFFLINE = "OFFLINE";
    private static final java.lang.String ONLINE = "ONLINE";
    private static final java.lang.String TAG = "NetworkObserver";
    private boolean _isOnline = true;
    private android.content.Context application;
    private final java.lang.ref.WeakReference<coil.RealImageLoader> imageLoader;
    private coil.network.NetworkObserver networkObserver;
    private boolean shutdown;

    public static /* synthetic */ void getImageLoader$annotations() {
    }

    public static /* synthetic */ void getShutdown$annotations() {
    }

    public SystemCallbacks(coil.RealImageLoader realImageLoader) {
        this.imageLoader = new java.lang.ref.WeakReference<>(realImageLoader);
    }

    public final java.lang.ref.WeakReference<coil.RealImageLoader> getImageLoader() {
        return this.imageLoader;
    }

    public final boolean getShutdown() {
        return this.shutdown;
    }

    public final void setShutdown(boolean z) {
        this.shutdown = z;
    }

    public final synchronized boolean isOnline() {
        registerNetworkObserver();
        return this._isOnline;
    }

    public final synchronized void shutdown() {
        if (this.shutdown) {
            return;
        }
        this.shutdown = true;
        android.content.Context context = this.application;
        if (context != null) {
            context.unregisterComponentCallbacks(this);
        }
        coil.network.NetworkObserver networkObserver = this.networkObserver;
        if (networkObserver != null) {
            networkObserver.shutdown();
        }
        this.imageLoader.clear();
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    private final void withImageLoader(kotlin.jvm.functions.Function1<? super coil.RealImageLoader, kotlin.Unit> block) {
        coil.RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader != null) {
            block.invoke(realImageLoader);
        } else {
            shutdown();
        }
    }

    public final synchronized void registerMemoryPressureCallbacks() {
        coil.RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader != null) {
            if (this.application == null) {
                android.content.Context context = realImageLoader.getContext();
                this.application = context;
                context.registerComponentCallbacks(this);
            }
        } else {
            shutdown();
        }
    }

    private final synchronized void registerNetworkObserver() {
        coil.network.EmptyNetworkObserver emptyNetworkObserver;
        coil.RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader != null) {
            if (this.networkObserver == null) {
                if (realImageLoader.getOptions().getNetworkObserverEnabled()) {
                    emptyNetworkObserver = coil.network.NetworkObserverKt.NetworkObserver(realImageLoader.getContext(), this, realImageLoader.getLogger());
                } else {
                    emptyNetworkObserver = new coil.network.EmptyNetworkObserver();
                }
                this.networkObserver = emptyNetworkObserver;
                this._isOnline = emptyNetworkObserver.isOnline();
            }
        } else {
            shutdown();
        }
    }

    @Override // android.content.ComponentCallbacks
    public synchronized void onConfigurationChanged(android.content.res.Configuration newConfig) {
        if (this.imageLoader.get() == null) {
            shutdown();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public synchronized void onTrimMemory(int level) {
        coil.RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader != null) {
            coil.util.Logger logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 2) {
                logger.log(TAG, 2, "trimMemory, level=" + level, null);
            }
            realImageLoader.onTrimMemory$coil_base_release(level);
        } else {
            shutdown();
        }
    }

    @Override // coil.network.NetworkObserver.Listener
    public synchronized void onConnectivityChange(boolean isOnline) {
        coil.RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader != null) {
            coil.util.Logger logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, isOnline ? ONLINE : OFFLINE, null);
            }
            this._isOnline = isOnline;
        } else {
            shutdown();
        }
    }
}
