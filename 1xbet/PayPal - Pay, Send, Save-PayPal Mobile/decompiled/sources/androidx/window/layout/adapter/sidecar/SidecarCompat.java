package androidx.window.layout.adapter.sidecar;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0004$%&'B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\"\u001a\u00020#H\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat;", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "sidecarAdapter", "Landroidx/window/layout/adapter/sidecar/SidecarAdapter;", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/adapter/sidecar/SidecarAdapter;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "windowListenerRegisteredContexts", "", "Landroid/os/IBinder;", "Landroid/app/Activity;", "componentCallbackMap", "Landroidx/core/util/Consumer;", "Landroid/content/res/Configuration;", "extensionCallback", "Landroidx/window/layout/adapter/sidecar/SidecarCompat$DistinctElementCallback;", "setExtensionCallback", "", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "getWindowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "onWindowLayoutChangeListenerAdded", "register", "windowToken", "registerConfigurationChangeListener", "onWindowLayoutChangeListenerRemoved", "unregisterComponentCallback", "validateExtensionInterface", "", "FirstAttachAdapter", "TranslatingCallback", "DistinctElementCallback", "Companion", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.adapter.sidecar.SidecarCompat.Companion INSTANCE = new androidx.window.layout.adapter.sidecar.SidecarCompat.Companion(null);
    private final java.util.Map<android.app.Activity, androidx.core.util.Consumer<android.content.res.Configuration>> Camera2StreamConfigurationMap;
    private final androidx.window.sidecar.SidecarInterface getHighResolutionOutputSizeshNQ4ISI;
    private androidx.window.layout.adapter.sidecar.SidecarCompat.DistinctElementCallback getHighSpeedVideoFpsRanges;
    private final androidx.window.layout.adapter.sidecar.SidecarAdapter getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<android.os.IBinder, android.app.Activity> getHighSpeedVideoSizes;

    public SidecarCompat(androidx.window.sidecar.SidecarInterface sidecarInterface, androidx.window.layout.adapter.sidecar.SidecarAdapter sidecarAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarAdapter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = sidecarInterface;
        this.getHighSpeedVideoFpsRangesFor = sidecarAdapter;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    }

    /* renamed from: getSidecar, reason: from getter */
    public final androidx.window.sidecar.SidecarInterface getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(android.content.Context context) {
        this(INSTANCE.getSidecarCompat$window_release(context), new androidx.window.layout.adapter.sidecar.SidecarAdapter(null, 1, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat
    public final void setExtensionCallback(androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionCallback, "");
        this.getHighSpeedVideoFpsRanges = new androidx.window.layout.adapter.sidecar.SidecarCompat.DistinctElementCallback(extensionCallback);
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.getHighResolutionOutputSizeshNQ4ISI;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback(this.getHighSpeedVideoFpsRangesFor, new androidx.window.layout.adapter.sidecar.SidecarCompat.TranslatingCallback()));
        }
    }

    public final androidx.window.layout.WindowLayoutInfo getWindowLayoutInfo(android.app.Activity activity) {
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList());
        }
        androidx.window.sidecar.SidecarInterface sidecarInterface = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.window.sidecar.SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release) : null;
        androidx.window.layout.adapter.sidecar.SidecarAdapter sidecarAdapter = this.getHighSpeedVideoFpsRangesFor;
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, sidecarDeviceState);
    }

    @Override // androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat
    public final void onWindowLayoutChangeListenerAdded(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new androidx.window.layout.adapter.sidecar.SidecarCompat.FirstAttachAdapter(this, activity));
        }
    }

    public final void register(android.os.IBinder windowToken, android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.getHighSpeedVideoSizes.put(windowToken, activity);
        androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.getHighSpeedVideoSizes.size() == 1 && (sidecarInterface = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        androidx.window.layout.adapter.sidecar.SidecarCompat.DistinctElementCallback distinctElementCallback = this.getHighSpeedVideoFpsRanges;
        if (distinctElementCallback != null) {
            distinctElementCallback.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        getHighSpeedVideoSizes(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getHighSpeedVideoSizes(final android.app.Activity activity) {
        if (this.Camera2StreamConfigurationMap.get(activity) == null && (activity instanceof androidx.core.content.OnConfigurationChangedProvider)) {
            androidx.core.util.Consumer<android.content.res.Configuration> consumer = new androidx.core.util.Consumer() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.window.layout.adapter.sidecar.SidecarCompat.Camera2StreamConfigurationMap(androidx.window.layout.adapter.sidecar.SidecarCompat.this, activity, (android.content.res.Configuration) obj);
                }
            };
            this.Camera2StreamConfigurationMap.put(activity, consumer);
            ((androidx.core.content.OnConfigurationChangedProvider) activity).addOnConfigurationChangedListener(consumer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(androidx.window.layout.adapter.sidecar.SidecarCompat sidecarCompat, android.app.Activity activity, android.content.res.Configuration configuration) {
        androidx.window.layout.adapter.sidecar.SidecarCompat.DistinctElementCallback distinctElementCallback = sidecarCompat.getHighSpeedVideoFpsRanges;
        if (distinctElementCallback != null) {
            distinctElementCallback.onWindowLayoutChanged(activity, sidecarCompat.getWindowLayoutInfo(activity));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat
    public final void onWindowLayoutChangeListenerRemoved(android.app.Activity activity) {
        androidx.window.sidecar.SidecarInterface sidecarInterface;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        android.os.IBinder activityWindowToken$window_release = INSTANCE.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
            }
            Camera2StreamConfigurationMap(activity);
            androidx.window.layout.adapter.sidecar.SidecarCompat.DistinctElementCallback distinctElementCallback = this.getHighSpeedVideoFpsRanges;
            if (distinctElementCallback != null) {
                distinctElementCallback.getHighSpeedVideoFpsRanges(activity);
            }
            boolean z = this.getHighSpeedVideoSizes.size() == 1;
            this.getHighSpeedVideoSizes.remove(activityWindowToken$window_release);
            if (!z || (sidecarInterface = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
                return;
            }
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Camera2StreamConfigurationMap(android.app.Activity activity) {
        androidx.core.util.Consumer<android.content.res.Configuration> consumer = this.Camera2StreamConfigurationMap.get(activity);
        if (consumer == null) {
            return;
        }
        if (activity instanceof androidx.core.content.OnConfigurationChangedProvider) {
            ((androidx.core.content.OnConfigurationChangedProvider) activity).removeOnConfigurationChangedListener(consumer);
        }
        this.Camera2StreamConfigurationMap.remove(activity);
    }

    @Override // androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat
    public final boolean validateExtensionInterface() {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        java.lang.Class<?> cls3;
        java.lang.Class<?> cls4;
        try {
            androidx.window.sidecar.SidecarInterface sidecarInterface = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.reflect.Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", androidx.window.sidecar.SidecarInterface.SidecarCallback.class);
            java.lang.Class<?> returnType = method != null ? method.getReturnType() : null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType, java.lang.Void.TYPE)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal return type for 'setSidecarCallback': ");
                sb.append(returnType);
                throw new java.lang.NoSuchMethodException(sb.toString());
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface4 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.reflect.Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", android.os.IBinder.class);
            java.lang.Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType2, androidx.window.sidecar.SidecarWindowLayoutInfo.class)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Illegal return type for 'getWindowLayoutInfo': ");
                sb2.append(returnType2);
                throw new java.lang.NoSuchMethodException(sb2.toString());
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface5 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.reflect.Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", android.os.IBinder.class);
            java.lang.Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType3, java.lang.Void.TYPE)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Illegal return type for 'onWindowLayoutChangeListenerAdded': ");
                sb3.append(returnType3);
                throw new java.lang.NoSuchMethodException(sb3.toString());
            }
            androidx.window.sidecar.SidecarInterface sidecarInterface6 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.reflect.Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", android.os.IBinder.class);
            java.lang.Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(returnType4, java.lang.Void.TYPE)) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ");
                sb4.append(returnType4);
                throw new java.lang.NoSuchMethodException(sb4.toString());
            }
            androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (java.lang.NoSuchFieldError unused) {
                androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, 3);
                java.lang.Object invoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", new java.lang.Class[0]).invoke(sidecarDeviceState, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                if (((java.lang.Integer) invoke).intValue() != 3) {
                    throw new java.lang.Exception("Invalid device posture getter/setter");
                }
            }
            androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = new androidx.window.sidecar.SidecarDisplayFeature();
            android.graphics.Rect rect = sidecarDisplayFeature.getRect();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rect, "");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new androidx.window.sidecar.SidecarWindowLayoutInfo();
            try {
                java.util.List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (java.lang.NoSuchFieldError unused2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(sidecarDisplayFeature);
                androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                java.lang.Object invoke2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new java.lang.Class[0]).invoke(sidecarWindowLayoutInfo, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke2, "");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(arrayList, (java.util.List) invoke2)) {
                    throw new java.lang.Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (java.lang.Throwable unused3) {
            return false;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u0006*\u00020\u00040\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "p0", "Landroid/app/Activity;", "p1", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;Landroid/app/Activity;)V", "Landroid/view/View;", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "getHighSpeedVideoSizes", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ref/WeakReference;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class FirstAttachAdapter implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.window.layout.adapter.sidecar.SidecarCompat getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.lang.ref.WeakReference<android.app.Activity> Camera2StreamConfigurationMap;

        public FirstAttachAdapter(androidx.window.layout.adapter.sidecar.SidecarCompat sidecarCompat, android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarCompat, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            this.getHighSpeedVideoSizes = sidecarCompat;
            this.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            p0.removeOnAttachStateChangeListener(this);
            android.app.Activity activity = this.Camera2StreamConfigurationMap.get();
            android.os.IBinder activityWindowToken$window_release = androidx.window.layout.adapter.sidecar.SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.getHighSpeedVideoSizes.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "<init>", "(Landroidx/window/layout/adapter/sidecar/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TranslatingCallback implements androidx.window.sidecar.SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public final void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState newDeviceState) {
            androidx.window.sidecar.SidecarInterface getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newDeviceState, "");
            java.util.Collection<android.app.Activity> values = androidx.window.layout.adapter.sidecar.SidecarCompat.this.getHighSpeedVideoSizes.values();
            androidx.window.layout.adapter.sidecar.SidecarCompat sidecarCompat = androidx.window.layout.adapter.sidecar.SidecarCompat.this;
            for (android.app.Activity activity : values) {
                android.os.IBinder activityWindowToken$window_release = androidx.window.layout.adapter.sidecar.SidecarCompat.INSTANCE.getActivityWindowToken$window_release(activity);
                androidx.window.sidecar.SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (getHighResolutionOutputSizeshNQ4ISI = sidecarCompat.getGetHighResolutionOutputSizeshNQ4ISI()) != null) {
                    sidecarWindowLayoutInfo = getHighResolutionOutputSizeshNQ4ISI.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                androidx.window.layout.adapter.sidecar.SidecarCompat.DistinctElementCallback distinctElementCallback = sidecarCompat.getHighSpeedVideoFpsRanges;
                if (distinctElementCallback != null) {
                    distinctElementCallback.onWindowLayoutChanged(activity, sidecarCompat.getHighSpeedVideoFpsRangesFor.translate(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        public final void onWindowLayoutChanged(android.os.IBinder windowToken, androidx.window.sidecar.SidecarWindowLayoutInfo newLayout) {
            androidx.window.sidecar.SidecarDeviceState sidecarDeviceState;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newLayout, "");
            android.app.Activity activity = (android.app.Activity) androidx.window.layout.adapter.sidecar.SidecarCompat.this.getHighSpeedVideoSizes.get(windowToken);
            if (activity == null) {
                return;
            }
            androidx.window.layout.adapter.sidecar.SidecarAdapter sidecarAdapter = androidx.window.layout.adapter.sidecar.SidecarCompat.this.getHighSpeedVideoFpsRangesFor;
            androidx.window.sidecar.SidecarInterface getHighResolutionOutputSizeshNQ4ISI = androidx.window.layout.adapter.sidecar.SidecarCompat.this.getGetHighResolutionOutputSizeshNQ4ISI();
            if (getHighResolutionOutputSizeshNQ4ISI == null || (sidecarDeviceState = getHighResolutionOutputSizeshNQ4ISI.getDeviceState()) == null) {
                sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
            }
            androidx.window.layout.WindowLayoutInfo translate = sidecarAdapter.translate(newLayout, sidecarDeviceState);
            androidx.window.layout.adapter.sidecar.SidecarCompat.DistinctElementCallback distinctElementCallback = androidx.window.layout.adapter.sidecar.SidecarCompat.this.getHighSpeedVideoFpsRanges;
            if (distinctElementCallback != null) {
                distinctElementCallback.onWindowLayoutChanged(activity, translate);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "p0", "<init>", "(Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "Landroid/app/Activity;", "Landroidx/window/layout/WindowLayoutInfo;", "p1", "", "onWindowLayoutChanged", "(Landroid/app/Activity;Landroidx/window/layout/WindowLayoutInfo;)V", "getHighSpeedVideoFpsRanges", "(Landroid/app/Activity;)V", "Landroidx/window/layout/adapter/sidecar/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/locks/ReentrantLock;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/locks/ReentrantLock;", "Camera2StreamConfigurationMap", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DistinctElementCallback implements androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.WeakHashMap<android.app.Activity, androidx.window.layout.WindowLayoutInfo> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.concurrent.locks.ReentrantLock Camera2StreamConfigurationMap;

        public DistinctElementCallback(androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionCallbackInterface, "");
            this.getHighSpeedVideoFpsRangesFor = extensionCallbackInterface;
            this.Camera2StreamConfigurationMap = new java.util.concurrent.locks.ReentrantLock();
            this.getHighSpeedVideoSizes = new java.util.WeakHashMap<>();
        }

        @Override // androidx.window.layout.adapter.sidecar.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public final void onWindowLayoutChanged(android.app.Activity p0, androidx.window.layout.WindowLayoutInfo p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.Camera2StreamConfigurationMap;
            reentrantLock.lock();
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(p1, this.getHighSpeedVideoSizes.get(p0))) {
                    return;
                }
                this.getHighSpeedVideoSizes.put(p0, p1);
                reentrantLock.unlock();
                this.getHighSpeedVideoFpsRangesFor.onWindowLayoutChanged(p0, p1);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void getHighSpeedVideoFpsRanges(android.app.Activity p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.Camera2StreamConfigurationMap;
            reentrantLock.lock();
            try {
                this.getHighSpeedVideoSizes.put(p0, null);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$Companion;", "", "<init>", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", "context", "Landroid/content/Context;", "getSidecarCompat$window_release", "getActivityWindowToken", "Landroid/os/IBinder;", "activity", "Landroid/app/Activity;", "getActivityWindowToken$window_release", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.window.core.Version getSidecarVersion() {
            try {
                java.lang.String apiVersion = androidx.window.sidecar.SidecarProvider.getApiVersion();
                if (android.text.TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return androidx.window.core.Version.INSTANCE.parse(apiVersion);
            } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
                return null;
            }
        }

        public final androidx.window.sidecar.SidecarInterface getSidecarCompat$window_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return androidx.window.sidecar.SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final android.os.IBinder getActivityWindowToken$window_release(android.app.Activity activity) {
            android.view.Window window;
            android.view.WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
