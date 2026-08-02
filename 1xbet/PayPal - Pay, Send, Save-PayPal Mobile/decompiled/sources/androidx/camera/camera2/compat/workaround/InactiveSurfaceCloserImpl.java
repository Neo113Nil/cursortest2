package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloserImpl;", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/core/impl/DeferrableSurface;", "deferrableSurface", "Landroidx/camera/camera2/pipe/CameraGraph;", "graph", "", "configure-hB7JTeY", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;)V", "configure", "onSurfaceInactive", "(Landroidx/camera/core/impl/DeferrableSurface;)V", "closeAll", "", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloserImpl$ConfiguredOutput;", "Ljava/util/List;", "ConfiguredOutput"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InactiveSurfaceCloserImpl implements androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput> Camera2StreamConfigurationMap = new java.util.ArrayList();

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    /* renamed from: configure-hB7JTeY */
    public final void mo74configurehB7JTeY(int streamId, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.camera2.pipe.CameraGraph graph) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferrableSurface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graph, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.Camera2StreamConfigurationMap.add(new androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput(streamId, deferrableSurface, graph, null));
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public final void onSurfaceInactive(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferrableSurface, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                if (((androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput) it.next()).contains(deferrableSurface)) {
                    deferrableSurface.close();
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser
    public final void closeAll() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                ((androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput) it.next()).close();
            }
            this.Camera2StreamConfigurationMap.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloserImpl$ConfiguredOutput;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/core/impl/DeferrableSurface;", "deferrableSurface", "Landroidx/camera/camera2/pipe/CameraGraph;", "graph", "<init>", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "close", "()V", "", "contains", "(Landroidx/camera/core/impl/DeferrableSurface;)Z", "component1-ptHMqGs", "()I", "component1", "component2", "()Landroidx/camera/core/impl/DeferrableSurface;", "component3", "()Landroidx/camera/camera2/pipe/CameraGraph;", "copy-hB7JTeY", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;)Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloserImpl$ConfiguredOutput;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStreamId-ptHMqGs", "Landroidx/camera/core/impl/DeferrableSurface;", "getDeferrableSurface", "Landroidx/camera/camera2/pipe/CameraGraph;", "getGraph"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfiguredOutput {
        private final androidx.camera.core.impl.DeferrableSurface deferrableSurface;
        private final androidx.camera.camera2.pipe.CameraGraph graph;
        private final int streamId;

        private ConfiguredOutput(int i, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.camera2.pipe.CameraGraph cameraGraph) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferrableSurface, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
            this.streamId = i;
            this.deferrableSurface = deferrableSurface;
            this.graph = cameraGraph;
        }

        /* renamed from: getStreamId-ptHMqGs, reason: not valid java name */
        public final int m78getStreamIdptHMqGs() {
            return this.streamId;
        }

        public final androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
            return this.deferrableSurface;
        }

        public final androidx.camera.camera2.pipe.CameraGraph getGraph() {
            return this.graph;
        }

        public final void close() {
            this.graph.mo390setSurfaceNYG5g8E(this.streamId, null);
            this.deferrableSurface.close();
        }

        public final boolean contains(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferrableSurface, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(this.deferrableSurface, deferrableSurface);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfiguredOutput(streamId=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(this.streamId));
            sb.append(", deferrableSurface=");
            sb.append(this.deferrableSurface);
            sb.append(", graph=");
            sb.append(this.graph);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((androidx.camera.camera2.pipe.StreamId.m759hashCodeimpl(this.streamId) * 31) + this.deferrableSurface.hashCode()) * 31) + this.graph.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput)) {
                return false;
            }
            androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput configuredOutput = (androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput) other;
            return androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(this.streamId, configuredOutput.streamId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deferrableSurface, configuredOutput.deferrableSurface) && kotlin.jvm.internal.Intrinsics.areEqual(this.graph, configuredOutput.graph);
        }

        /* renamed from: copy-hB7JTeY, reason: not valid java name */
        public final androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput m77copyhB7JTeY(int streamId, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.camera2.pipe.CameraGraph graph) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferrableSurface, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graph, "");
            return new androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput(streamId, deferrableSurface, graph, null);
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraGraph getGraph() {
            return this.graph;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
            return this.deferrableSurface;
        }

        /* renamed from: component1-ptHMqGs, reason: not valid java name and from getter */
        public final int getStreamId() {
            return this.streamId;
        }

        /* renamed from: copy-hB7JTeY$default, reason: not valid java name */
        public static /* synthetic */ androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput m75copyhB7JTeY$default(androidx.camera.camera2.compat.workaround.InactiveSurfaceCloserImpl.ConfiguredOutput configuredOutput, int i, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.camera2.pipe.CameraGraph cameraGraph, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = configuredOutput.streamId;
            }
            if ((i2 & 2) != 0) {
                deferrableSurface = configuredOutput.deferrableSurface;
            }
            if ((i2 & 4) != 0) {
                cameraGraph = configuredOutput.graph;
            }
            return configuredOutput.m77copyhB7JTeY(i, deferrableSurface, cameraGraph);
        }

        public /* synthetic */ ConfiguredOutput(int i, androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.camera2.pipe.CameraGraph cameraGraph, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, deferrableSurface, cameraGraph);
        }
    }
}
