package androidx.window.layout.adapter.sidecar;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0005R#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0007¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;", "Landroidx/window/layout/adapter/WindowBackend;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "windowExtension", "<init>", "(Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", com.sun.jna.Callback.METHOD_NAME, "", "registerLayoutChangeCallback", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "unregisterLayoutChangeCallback", "(Landroidx/core/util/Consumer;)V", "getCurrentWindowLayoutInfo", "(Landroid/content/Context;)Landroidx/window/layout/WindowLayoutInfo;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "getWindowExtension", "()Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "setWindowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "windowLayoutChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "", "Landroidx/window/layout/SupportedPosture;", "getSupportedPostures", "()Ljava/util/List;", "supportedPostures", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SidecarWindowBackend implements androidx.window.layout.adapter.WindowBackend {
    public static final boolean DEBUG = false;
    private static volatile androidx.window.layout.adapter.sidecar.SidecarWindowBackend getHighResolutionOutputSizeshNQ4ISI;
    private androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat windowExtension;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> windowLayoutChangeCallbacks = new java.util.concurrent.CopyOnWriteArrayList<>();

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.adapter.sidecar.SidecarWindowBackend.Companion INSTANCE = new androidx.window.layout.adapter.sidecar.SidecarWindowBackend.Companion(null);
    private static final java.util.concurrent.locks.ReentrantLock getHighSpeedVideoFpsRangesFor = new java.util.concurrent.locks.ReentrantLock();

    public static /* synthetic */ void getWindowLayoutChangeCallbacks$annotations() {
    }

    public SidecarWindowBackend(androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
        androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat extensionInterfaceCompat2 = this.windowExtension;
        if (extensionInterfaceCompat2 != null) {
            extensionInterfaceCompat2.setExtensionCallback(new androidx.window.layout.adapter.sidecar.SidecarWindowBackend.ExtensionListenerImpl());
        }
    }

    public final androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }

    public final void setWindowExtension(androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat extensionInterfaceCompat) {
        this.windowExtension = extensionInterfaceCompat;
    }

    public final java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final void registerLayoutChangeCallback(android.content.Context context, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        boolean z;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            callback.accept(new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList()));
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = getHighSpeedVideoFpsRangesFor;
        reentrantLock.lock();
        try {
            androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
            if (extensionInterfaceCompat == null) {
                callback.accept(new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList()));
                return;
            }
            java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
            if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
                java.util.Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it.next()).getActivity(), activity)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper(activity, executor, callback);
            this.windowLayoutChangeCallbacks.add(windowLayoutChangeCallbackWrapper);
            if (!z) {
                extensionInterfaceCompat.onWindowLayoutChangeListenerAdded(activity);
            } else {
                java.util.Iterator<T> it2 = this.windowLayoutChangeCallbacks.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(activity, ((androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj).getActivity())) {
                            break;
                        }
                    }
                }
                androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj;
                androidx.window.layout.WindowLayoutInfo lastInfo = windowLayoutChangeCallbackWrapper2 != null ? windowLayoutChangeCallbackWrapper2.getLastInfo() : null;
                if (lastInfo != null) {
                    windowLayoutChangeCallbackWrapper.accept(lastInfo);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final void unregisterLayoutChangeCallback(androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        synchronized (getHighSpeedVideoFpsRangesFor) {
            if (this.windowExtension == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> it = this.windowLayoutChangeCallbacks.iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper next = it.next();
                if (next.getCallback() == callback) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                    arrayList.add(next);
                }
            }
            this.windowLayoutChangeCallbacks.removeAll(arrayList);
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                android.app.Activity activity = ((androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it2.next()).getActivity();
                java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
                if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
                    java.util.Iterator<T> it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it3.next()).getActivity(), activity)) {
                            break;
                        }
                    }
                }
                androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat extensionInterfaceCompat = this.windowExtension;
                if (extensionInterfaceCompat != null) {
                    extensionInterfaceCompat.onWindowLayoutChangeListenerRemoved(activity);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final java.util.List<androidx.window.layout.SupportedPosture> getSupportedPostures() {
        throw new java.lang.UnsupportedOperationException("Must be called from extensions.");
    }

    @Override // androidx.window.layout.adapter.WindowBackend
    public final androidx.window.layout.WindowLayoutInfo getCurrentWindowLayoutInfo(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        throw new java.lang.UnsupportedOperationException("Must be called from extensions.");
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;)V", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "", "onWindowLayoutChanged", "(Landroid/app/Activity;Landroidx/window/layout/WindowLayoutInfo;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ExtensionListenerImpl implements androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface {
        public ExtensionListenerImpl() {
        }

        @Override // androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public final void onWindowLayoutChanged(android.app.Activity activity, androidx.window.layout.WindowLayoutInfo newLayout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayout, "");
            java.util.Iterator<androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper> it = androidx.window.layout.adapter.sidecar.SidecarWindowBackend.this.getWindowLayoutChangeCallbacks().iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(next.getActivity(), activity)) {
                    next.accept(newLayout);
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000e"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "newLayoutInfo", "", "accept", "(Landroidx/window/layout/WindowLayoutInfo;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Executor;", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "lastInfo", "Landroidx/window/layout/WindowLayoutInfo;", "getLastInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setLastInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WindowLayoutChangeCallbackWrapper {
        private final java.util.concurrent.Executor Camera2StreamConfigurationMap;
        private final android.app.Activity activity;
        private final androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> callback;
        private androidx.window.layout.WindowLayoutInfo lastInfo;

        public WindowLayoutChangeCallbackWrapper(android.app.Activity activity, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> consumer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "");
            this.activity = activity;
            this.Camera2StreamConfigurationMap = executor;
            this.callback = consumer;
        }

        public final android.app.Activity getActivity() {
            return this.activity;
        }

        public final androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> getCallback() {
            return this.callback;
        }

        public final androidx.window.layout.WindowLayoutInfo getLastInfo() {
            return this.lastInfo;
        }

        public final void setLastInfo(androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
            this.lastInfo = windowLayoutInfo;
        }

        public final void accept(final androidx.window.layout.WindowLayoutInfo newLayoutInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayoutInfo, "");
            this.lastInfo = newLayoutInfo;
            this.Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: androidx.window.layout.adapter.sidecar.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.window.layout.adapter.sidecar.SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.this.callback.accept(newLayoutInfo);
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;", "getInstance", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "initAndVerifyExtension", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "Landroidx/window/core/Version;", "sidecarVersion", "", "isSidecarVersionSupported", "(Landroidx/window/core/Version;)Z", "", "resetInstance", "DEBUG", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/window/layout/adapter/sidecar/SidecarWindowBackend;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/locks/ReentrantLock;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/locks/ReentrantLock;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.window.layout.adapter.sidecar.SidecarWindowBackend getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            if (androidx.window.layout.adapter.sidecar.SidecarWindowBackend.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = androidx.window.layout.adapter.sidecar.SidecarWindowBackend.getHighSpeedVideoFpsRangesFor;
                reentrantLock.lock();
                try {
                    if (androidx.window.layout.adapter.sidecar.SidecarWindowBackend.getHighResolutionOutputSizeshNQ4ISI == null) {
                        androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat initAndVerifyExtension = androidx.window.layout.adapter.sidecar.SidecarWindowBackend.INSTANCE.initAndVerifyExtension(context);
                        androidx.window.layout.adapter.sidecar.SidecarWindowBackend.Companion companion = androidx.window.layout.adapter.sidecar.SidecarWindowBackend.INSTANCE;
                        androidx.window.layout.adapter.sidecar.SidecarWindowBackend.getHighResolutionOutputSizeshNQ4ISI = new androidx.window.layout.adapter.sidecar.SidecarWindowBackend(initAndVerifyExtension);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            androidx.window.layout.adapter.sidecar.SidecarWindowBackend sidecarWindowBackend = androidx.window.layout.adapter.sidecar.SidecarWindowBackend.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(sidecarWindowBackend);
            return sidecarWindowBackend;
        }

        public final androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat initAndVerifyExtension(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            try {
                if (isSidecarVersionSupported(androidx.window.layout.adapter.sidecar.SidecarCompat.INSTANCE.getSidecarVersion())) {
                    androidx.window.layout.adapter.sidecar.SidecarCompat sidecarCompat = new androidx.window.layout.adapter.sidecar.SidecarCompat(context);
                    if (sidecarCompat.validateExtensionInterface()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (java.lang.Throwable unused) {
            }
            return null;
        }

        public final boolean isSidecarVersionSupported(androidx.window.core.Version sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(androidx.window.core.Version.INSTANCE.getVERSION_0_1()) >= 0;
        }

        public final void resetInstance() {
            androidx.window.layout.adapter.sidecar.SidecarWindowBackend.getHighResolutionOutputSizeshNQ4ISI = null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
