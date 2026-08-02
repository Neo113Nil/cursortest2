package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0019\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\r2\n\u0010\u0016\u001a\u00060\u0017R\u00020\u0000H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "", "<init>", "()V", "lock", "useCountMap", "", "Landroid/view/Surface;", "", "listeners", "", "Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceListener;", "addListener", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "registerSurface", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "surface", "registerSurface$camera_camera2_pipe", "onTokenClosed", "surfaceToken", "Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceToken;", "onTokenClosed$camera_camera2_pipe", "SurfaceToken", "SurfaceListener", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraSurfaceManager {
    public static final boolean DEBUG = false;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.CameraSurfaceManager.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraSurfaceManager.Companion(null);
    private static final kotlinx.atomicfu.AtomicInt surfaceTokenDebugIds = kotlinx.atomicfu.AtomicFU.atomic(0);
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private final java.util.Map<android.view.Surface, java.lang.Integer> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
    private final java.util.Set<androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashSet();

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceListener;", "", "Landroid/view/Surface;", "surface", "", "onSurfaceActive", "(Landroid/view/Surface;)V", "onSurfaceInactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface SurfaceListener {
        void onSurfaceActive(android.view.Surface surface);

        void onSurfaceInactive(android.view.Surface surface);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceToken;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "surface", "Landroid/view/Surface;", "<init>", "(Landroidx/camera/camera2/pipe/CameraSurfaceManager;Landroid/view/Surface;)V", "getSurface$camera_camera2_pipe", "()Landroid/view/Surface;", "debugId", "", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "Lkotlinx/atomicfu/AtomicBoolean;", "close", "", "toString", "", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class SurfaceToken implements java.lang.AutoCloseable {
        private final int Camera2StreamConfigurationMap;
        private final android.view.Surface getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.camera.camera2.pipe.CameraSurfaceManager getHighSpeedVideoFpsRangesFor;
        private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoSizes;

        public SurfaceToken(androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager, android.view.Surface surface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
            this.getHighSpeedVideoFpsRangesFor = cameraSurfaceManager;
            this.getHighResolutionOutputSizeshNQ4ISI = surface;
            this.Camera2StreamConfigurationMap = androidx.camera.camera2.pipe.CameraSurfaceManager.INSTANCE.getSurfaceTokenDebugIds$camera_camera2_pipe().incrementAndGet();
            this.getHighSpeedVideoSizes = kotlinx.atomicfu.AtomicFU.atomic(false);
        }

        /* renamed from: getSurface$camera_camera2_pipe, reason: from getter */
        public final android.view.Surface getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRangesFor.onTokenClosed$camera_camera2_pipe(this);
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceToken-");
            sb.append(this.Camera2StreamConfigurationMap);
            return sb.toString();
        }
    }

    public final void addListener(androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener listener) {
        java.util.Set keySet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRangesFor.add(listener);
            java.util.Map<android.view.Surface, java.lang.Integer> map = this.Camera2StreamConfigurationMap;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<android.view.Surface, java.lang.Integer> entry : map.entrySet()) {
                if (entry.getValue().intValue() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            keySet = linkedHashMap.keySet();
        }
        java.util.Iterator it = keySet.iterator();
        while (it.hasNext()) {
            listener.onSurfaceActive((android.view.Surface) it.next());
        }
    }

    public final void removeListener(androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRangesFor.remove(listener);
        }
    }

    public final java.lang.AutoCloseable registerSurface$camera_camera2_pipe(android.view.Surface surface) {
        androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceToken surfaceToken;
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        if (!surface.isValid()) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            surfaceToken = new androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceToken(this, surface);
            java.lang.Integer num = this.Camera2StreamConfigurationMap.get(surface);
            int intValue = (num != null ? num.intValue() : 0) + 1;
            this.Camera2StreamConfigurationMap.put(surface, java.lang.Integer.valueOf(intValue));
            list = intValue == 1 ? kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRangesFor) : null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener) it.next()).onSurfaceActive(surface);
            }
        }
        return surfaceToken;
    }

    public final void onTokenClosed$camera_camera2_pipe(androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceToken surfaceToken) {
        android.view.Surface getHighResolutionOutputSizeshNQ4ISI;
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceToken, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI = surfaceToken.getGetHighResolutionOutputSizeshNQ4ISI();
            java.lang.Integer num = this.Camera2StreamConfigurationMap.get(getHighResolutionOutputSizeshNQ4ISI);
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Surface ");
                sb.append(getHighResolutionOutputSizeshNQ4ISI);
                sb.append(" (");
                sb.append(surfaceToken);
                sb.append(") has no use count");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            int intValue = num.intValue() - 1;
            this.Camera2StreamConfigurationMap.put(getHighResolutionOutputSizeshNQ4ISI, java.lang.Integer.valueOf(intValue));
            if (intValue == 0) {
                list = kotlin.collections.CollectionsKt.toList(this.getHighSpeedVideoFpsRangesFor);
                this.Camera2StreamConfigurationMap.remove(getHighResolutionOutputSizeshNQ4ISI);
            } else {
                list = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener) it.next()).onSurfaceInactive(getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/CameraSurfaceManager$Companion;", "", "<init>", "()V", "", "DEBUG", "Z", "Lkotlinx/atomicfu/AtomicInt;", "surfaceTokenDebugIds", "Lkotlinx/atomicfu/AtomicInt;", "getSurfaceTokenDebugIds$camera_camera2_pipe", "()Lkotlinx/atomicfu/AtomicInt;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.atomicfu.AtomicInt getSurfaceTokenDebugIds$camera_camera2_pipe() {
            return androidx.camera.camera2.pipe.CameraSurfaceManager.surfaceTokenDebugIds;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
