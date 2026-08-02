package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001%J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001aR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/StreamGraph;", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "config", "Landroidx/camera/camera2/pipe/CameraStream;", "get", "(Landroidx/camera/camera2/pipe/CameraStream$Config;)Landroidx/camera/camera2/pipe/CameraStream;", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "get-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/CameraStream;", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "Landroidx/camera/camera2/pipe/OutputStream;", "get-iYJqvbA", "(I)Landroidx/camera/camera2/pipe/OutputStream;", "Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "getOutputLatency-IL232MI", "(ILandroidx/camera/camera2/pipe/OutputId;)Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "getOutputLatency", "Landroidx/camera/camera2/pipe/media/ImageSource;", "getImageSource-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/media/ImageSource;", "getImageSource", "", "getStreams", "()Ljava/util/List;", "streams", "", "getStreamIds", "()Ljava/util/Set;", "streamIds", "Landroidx/camera/camera2/pipe/InputStream;", "getInputs", "inputs", "getOutputs", "outputs", "OutputLatency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface StreamGraph {
    androidx.camera.camera2.pipe.CameraStream get(androidx.camera.camera2.pipe.CameraStream.Config config);

    /* renamed from: getImageSource-aKI5c8E, reason: not valid java name */
    androidx.camera.camera2.pipe.media.ImageSource mo750getImageSourceaKI5c8E(int streamId);

    java.util.List<androidx.camera.camera2.pipe.InputStream> getInputs();

    /* renamed from: getOutputLatency-IL232MI, reason: not valid java name */
    androidx.camera.camera2.pipe.StreamGraph.OutputLatency mo751getOutputLatencyIL232MI(int streamId, androidx.camera.camera2.pipe.OutputId outputId);

    java.util.List<androidx.camera.camera2.pipe.OutputStream> getOutputs();

    java.util.Set<androidx.camera.camera2.pipe.StreamId> getStreamIds();

    java.util.List<androidx.camera.camera2.pipe.CameraStream> getStreams();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: get-aKI5c8E, reason: not valid java name */
        public static androidx.camera.camera2.pipe.CameraStream m752getaKI5c8E(androidx.camera.camera2.pipe.StreamGraph streamGraph, int i) {
            return androidx.camera.camera2.pipe.StreamGraph.super.m748getaKI5c8E(i);
        }

        @java.lang.Deprecated
        /* renamed from: get-iYJqvbA, reason: not valid java name */
        public static androidx.camera.camera2.pipe.OutputStream m753getiYJqvbA(androidx.camera.camera2.pipe.StreamGraph streamGraph, int i) {
            return androidx.camera.camera2.pipe.StreamGraph.super.m749getiYJqvbA(i);
        }
    }

    /* renamed from: get-aKI5c8E, reason: not valid java name */
    default androidx.camera.camera2.pipe.CameraStream m748getaKI5c8E(int streamId) {
        java.lang.Object obj;
        java.util.Iterator<T> it = getStreams().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(((androidx.camera.camera2.pipe.CameraStream) obj).getId(), streamId)) {
                break;
            }
        }
        return (androidx.camera.camera2.pipe.CameraStream) obj;
    }

    /* renamed from: get-iYJqvbA, reason: not valid java name */
    default androidx.camera.camera2.pipe.OutputStream m749getiYJqvbA(int outputId) {
        java.lang.Object obj;
        java.util.Iterator<T> it = getOutputs().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (androidx.camera.camera2.pipe.OutputId.m539equalsimpl0(((androidx.camera.camera2.pipe.OutputStream) obj).getId(), outputId)) {
                break;
            }
        }
        return (androidx.camera.camera2.pipe.OutputStream) obj;
    }

    /* renamed from: getOutputLatency-IL232MI$default, reason: not valid java name */
    static /* synthetic */ androidx.camera.camera2.pipe.StreamGraph.OutputLatency m747getOutputLatencyIL232MI$default(androidx.camera.camera2.pipe.StreamGraph streamGraph, int i, androidx.camera.camera2.pipe.OutputId outputId, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOutputLatency-IL232MI");
        }
        if ((i2 & 2) != 0) {
            outputId = null;
        }
        return streamGraph.mo751getOutputLatencyIL232MI(i, outputId);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u001a\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "", "", "estimatedCaptureLatencyNs", "estimatedProcessingLatencyNs", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getEstimatedCaptureLatencyNs", "getEstimatedProcessingLatencyNs", "getEstimatedLatencyNs", "estimatedLatencyNs"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class OutputLatency {
        private final long estimatedCaptureLatencyNs;
        private final long estimatedProcessingLatencyNs;

        public OutputLatency(long j, long j2) {
            this.estimatedCaptureLatencyNs = j;
            this.estimatedProcessingLatencyNs = j2;
        }

        public final long getEstimatedCaptureLatencyNs() {
            return this.estimatedCaptureLatencyNs;
        }

        public final long getEstimatedProcessingLatencyNs() {
            return this.estimatedProcessingLatencyNs;
        }

        public final long getEstimatedLatencyNs() {
            return this.estimatedCaptureLatencyNs + this.estimatedProcessingLatencyNs;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputLatency(estimatedCaptureLatencyNs=");
            sb.append(this.estimatedCaptureLatencyNs);
            sb.append(", estimatedProcessingLatencyNs=");
            sb.append(this.estimatedProcessingLatencyNs);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Long.hashCode(this.estimatedCaptureLatencyNs) * 31) + java.lang.Long.hashCode(this.estimatedProcessingLatencyNs);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.pipe.StreamGraph.OutputLatency)) {
                return false;
            }
            androidx.camera.camera2.pipe.StreamGraph.OutputLatency outputLatency = (androidx.camera.camera2.pipe.StreamGraph.OutputLatency) other;
            return this.estimatedCaptureLatencyNs == outputLatency.estimatedCaptureLatencyNs && this.estimatedProcessingLatencyNs == outputLatency.estimatedProcessingLatencyNs;
        }

        public final androidx.camera.camera2.pipe.StreamGraph.OutputLatency copy(long estimatedCaptureLatencyNs, long estimatedProcessingLatencyNs) {
            return new androidx.camera.camera2.pipe.StreamGraph.OutputLatency(estimatedCaptureLatencyNs, estimatedProcessingLatencyNs);
        }

        /* renamed from: component2, reason: from getter */
        public final long getEstimatedProcessingLatencyNs() {
            return this.estimatedProcessingLatencyNs;
        }

        /* renamed from: component1, reason: from getter */
        public final long getEstimatedCaptureLatencyNs() {
            return this.estimatedCaptureLatencyNs;
        }

        public static /* synthetic */ androidx.camera.camera2.pipe.StreamGraph.OutputLatency copy$default(androidx.camera.camera2.pipe.StreamGraph.OutputLatency outputLatency, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = outputLatency.estimatedCaptureLatencyNs;
            }
            if ((i & 2) != 0) {
                j2 = outputLatency.estimatedProcessingLatencyNs;
            }
            return outputLatency.copy(j, j2);
        }
    }
}
