package androidx.camera.camera2.pipe.internal;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u0010J2\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\n*\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\n*\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0016J%\u0010\u0019\u001a\u00020\u00132\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u001e\u0010 J\u001b\u0010#\u001a\u00020\u001d2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030!H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0013¢\u0006\u0004\b%\u0010\u001cR\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R\u0016\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00102"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "Landroidx/camera/camera2/pipe/Parameters;", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "sessionLock", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Lkotlinx/coroutines/CoroutineScope;", "graphScope", "<init>", "(Landroidx/camera/camera2/pipe/internal/GraphSessionLock;Landroidx/camera/camera2/pipe/graph/GraphProcessor;Lkotlinx/coroutines/CoroutineScope;)V", "T", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", "get", "(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/Metadata$Key;", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Ljava/lang/Object;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V", "(Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)V", "", "newParameters", "setAll", "(Ljava/util/Map;)V", "clear", "()V", "", "remove", "(Landroid/hardware/camera2/CaptureRequest$Key;)Z", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Z", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "removeAll", "(Ljava/util/Set;)Z", "flush", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/util/Map;", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraGraphParametersImpl implements androidx.camera.camera2.pipe.Parameters {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.GraphProcessor getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.Object, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.internal.GraphSessionLock getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CameraGraphParametersImpl(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, androidx.camera.camera2.pipe.graph.GraphProcessor graphProcessor, @androidx.camera.camera2.pipe.config.ForCameraGraph kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphSessionLock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphProcessor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = graphSessionLock;
        this.getHighSpeedVideoSizes = graphProcessor;
        this.Camera2StreamConfigurationMap = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Object();
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final <T> T get(android.hardware.camera2.CaptureRequest.Key<T> key) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            t = (T) this.getHighSpeedVideoFpsRanges.get(key);
        }
        return t;
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final <T> T get(androidx.camera.camera2.pipe.Metadata.Key<T> key) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            t = (T) this.getHighSpeedVideoFpsRanges.get(key);
        }
        return t;
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final <T> void set(android.hardware.camera2.CaptureRequest.Key<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        setAll(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(key, value)));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final <T> void set(androidx.camera.camera2.pipe.Metadata.Key<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        setAll(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(key, value)));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final void setAll(java.util.Map<java.lang.Object, ? extends java.lang.Object> newParameters) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newParameters, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            loop0: while (true) {
                z = false;
                for (java.util.Map.Entry<java.lang.Object, ? extends java.lang.Object> entry : newParameters.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.util.Map<java.lang.Object, java.lang.Object> map = this.getHighSpeedVideoFpsRanges;
                    if ((key instanceof android.hardware.camera2.CaptureRequest.Key) || (key instanceof androidx.camera.camera2.pipe.Metadata.Key)) {
                        if (!map.containsKey(key) || !kotlin.jvm.internal.Intrinsics.areEqual(map.get(key), value)) {
                            map.put(key, value);
                        }
                    } else if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                        java.util.Objects.toString(key);
                        java.util.Objects.toString(value);
                        java.util.Objects.toString(key);
                    }
                    z2 = z2;
                }
            }
            if (z2 && !this.getHighSpeedVideoSizesFor) {
                this.getHighSpeedVideoSizesFor = true;
                z = true;
            }
        }
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI.withTokenIn$camera_camera2_pipe(this.Camera2StreamConfigurationMap, new androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl$applyUpdate$1(this, null));
        }
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final void clear() {
        boolean z;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            z = false;
            if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
                this.getHighSpeedVideoFpsRanges.clear();
                if (!this.getHighSpeedVideoSizesFor) {
                    this.getHighSpeedVideoSizesFor = true;
                    z = true;
                }
            }
        }
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI.withTokenIn$camera_camera2_pipe(this.Camera2StreamConfigurationMap, new androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl$applyUpdate$1(this, null));
        }
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final <T> boolean remove(android.hardware.camera2.CaptureRequest.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return removeAll(kotlin.collections.SetsKt.setOf(key));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final <T> boolean remove(androidx.camera.camera2.pipe.Metadata.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return removeAll(kotlin.collections.SetsKt.setOf(key));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public final boolean removeAll(java.util.Set<?> keys) {
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            z = false;
            z2 = false;
            for (java.lang.Object obj : keys) {
                if (this.getHighSpeedVideoFpsRanges.containsKey(obj)) {
                    kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getHighSpeedVideoFpsRanges).remove(obj);
                    z2 = true;
                }
                if (!(obj instanceof android.hardware.camera2.CaptureRequest.Key) && !(obj instanceof androidx.camera.camera2.pipe.Metadata.Key) && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    java.util.Objects.toString(obj);
                    java.util.Objects.toString(obj);
                }
            }
            if (z2 && !this.getHighSpeedVideoSizesFor) {
                this.getHighSpeedVideoSizesFor = true;
                z = true;
            }
        }
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI.withTokenIn$camera_camera2_pipe(this.Camera2StreamConfigurationMap, new androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl$applyUpdate$1(this, null));
        }
        return z2;
    }

    public final void flush() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighSpeedVideoSizesFor) {
                this.getHighSpeedVideoSizesFor = false;
                this.getHighSpeedVideoSizes.updateGraphParameters(new java.util.HashMap(this.getHighSpeedVideoFpsRanges));
            }
        }
    }
}
