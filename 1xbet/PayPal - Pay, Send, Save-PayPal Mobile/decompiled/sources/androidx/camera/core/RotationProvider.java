package androidx.camera.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u0001:\u0003*+)B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001a\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R$\u0010'\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Landroidx/camera/core/RotationProvider;", "", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "", "ignoreCanDetectForTest", "(Landroid/content/Context;Z)V", "", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(I)V", "orientation", "updateOrientationForTesting", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/camera/core/RotationProvider$Listener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Ljava/util/concurrent/Executor;Landroidx/camera/core/RotationProvider$Listener;)Z", "removeListener", "(Landroidx/camera/core/RotationProvider$Listener;)V", "shutdown", "()V", "Camera2StreamConfigurationMap", "(I)I", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Landroid/view/OrientationEventListener;", "Landroid/view/OrientationEventListener;", "", "Landroidx/camera/core/RotationProvider$ListenerWrapper;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Z", "isShutdown", "()Z", "Companion", "Listener", "ListenerWrapper"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RotationProvider {
    private static final androidx.camera.core.RotationProvider.Companion Companion = new androidx.camera.core.RotationProvider.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.view.OrientationEventListener Camera2StreamConfigurationMap;
    private final java.util.Map<androidx.camera.core.RotationProvider.Listener, androidx.camera.core.RotationProvider.ListenerWrapper> getHighSpeedVideoFpsRanges;
    private volatile int getHighSpeedVideoFpsRangesFor;
    private final java.lang.Object getHighSpeedVideoSizes;
    private boolean isShutdown;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/core/RotationProvider$Listener;", "", "", androidx.constraintlayout.motion.widget.Key.ROTATION, "", "onRotationChanged", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Listener {
        void onRotationChanged(int rotation);
    }

    /* renamed from: isShutdown, reason: from getter */
    public final boolean getIsShutdown() {
        return this.isShutdown;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RotationProvider(android.content.Context context) {
        this(context, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    public RotationProvider(android.content.Context context, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = new android.view.OrientationEventListener(context) { // from class: androidx.camera.core.RotationProvider.1
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int orientation) {
                if (orientation == -1) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap(orientation));
            }
        };
    }

    public /* synthetic */ RotationProvider(android.content.Context context, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(int p0) {
        java.util.List list;
        if (this.getHighSpeedVideoFpsRangesFor != p0) {
            this.getHighSpeedVideoFpsRangesFor = p0;
            synchronized (this.getHighSpeedVideoSizes) {
                list = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRanges.values());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.RotationProvider.ListenerWrapper) it.next()).getHighSpeedVideoFpsRangesFor(p0);
            }
        }
    }

    public final void updateOrientationForTesting(int orientation) {
        getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap(orientation));
    }

    public final boolean addListener(java.util.concurrent.Executor executor, androidx.camera.core.RotationProvider.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoSizes) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI && !this.Camera2StreamConfigurationMap.canDetectOrientation()) {
                return false;
            }
            androidx.camera.core.RotationProvider.ListenerWrapper listenerWrapper = new androidx.camera.core.RotationProvider.ListenerWrapper(listener, executor);
            this.getHighSpeedVideoFpsRanges.put(listener, listenerWrapper);
            if (this.getHighSpeedVideoFpsRangesFor != -1) {
                listenerWrapper.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            }
            if (this.getHighSpeedVideoFpsRanges.size() == 1) {
                this.Camera2StreamConfigurationMap.enable();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return true;
        }
    }

    public final void removeListener(androidx.camera.core.RotationProvider.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoSizes) {
            androidx.camera.core.RotationProvider.ListenerWrapper listenerWrapper = this.getHighSpeedVideoFpsRanges.get(listener);
            if (listenerWrapper != null) {
                listenerWrapper.getHighSpeedVideoFpsRangesFor.set(false);
                this.getHighSpeedVideoFpsRanges.remove(listener);
            }
            if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                this.Camera2StreamConfigurationMap.disable();
                this.getHighSpeedVideoFpsRangesFor = -1;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void shutdown() {
        synchronized (this.getHighSpeedVideoSizes) {
            this.Camera2StreamConfigurationMap.disable();
            this.getHighSpeedVideoFpsRanges.clear();
            this.isShutdown = true;
            this.getHighSpeedVideoFpsRangesFor = -1;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Camera2StreamConfigurationMap(int p0) {
        if (this.getHighSpeedVideoFpsRangesFor == -1) {
            if (p0 >= 0 && p0 < 45) {
                return 0;
            }
            if (45 <= p0 && p0 < 135) {
                return 3;
            }
            if (135 > p0 || p0 >= 225) {
                return (225 > p0 || p0 >= 315) ? 0 : 1;
            }
            return 2;
        }
        if ((p0 >= 0 && p0 < 40) || (320 <= p0 && p0 < 360)) {
            return 0;
        }
        if (50 <= p0 && p0 < 130) {
            return 3;
        }
        if (140 <= p0 && p0 < 220) {
            return 2;
        }
        if (230 > p0 || p0 >= 310) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return 1;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012"}, d2 = {"Landroidx/camera/core/RotationProvider$ListenerWrapper;", "", "Landroidx/camera/core/RotationProvider$Listener;", "p0", "Ljava/util/concurrent/Executor;", "p1", "<init>", "(Landroidx/camera/core/RotationProvider$Listener;Ljava/util/concurrent/Executor;)V", "", "", "getHighSpeedVideoFpsRangesFor", "(I)V", "Landroidx/camera/core/RotationProvider$Listener;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Executor;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class ListenerWrapper {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.camera.core.RotationProvider.Listener getHighSpeedVideoSizes;

        public ListenerWrapper(androidx.camera.core.RotationProvider.Listener listener, java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            this.getHighSpeedVideoSizes = listener;
            this.getHighResolutionOutputSizeshNQ4ISI = executor;
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(true);
        }

        public final void getHighSpeedVideoFpsRangesFor(final int p0) {
            if (this.getHighSpeedVideoFpsRangesFor.get()) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.camera.core.RotationProvider$ListenerWrapper$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.RotationProvider.ListenerWrapper.getHighSpeedVideoSizes(androidx.camera.core.RotationProvider.ListenerWrapper.this, p0);
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException unused) {
                    androidx.camera.core.Logger.w("RotationProvider", "Failed to execute the command. Maybe the executor has been shutdown.");
                }
            }
        }

        public static /* synthetic */ void getHighSpeedVideoSizes(androidx.camera.core.RotationProvider.ListenerWrapper listenerWrapper, int i) {
            if (listenerWrapper.getHighSpeedVideoFpsRangesFor.get()) {
                listenerWrapper.getHighSpeedVideoSizes.onRotationChanged(i);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/core/RotationProvider$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
