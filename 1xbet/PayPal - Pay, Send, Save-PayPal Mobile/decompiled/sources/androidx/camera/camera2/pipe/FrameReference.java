package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 $2\u00020\u0001:\u0001$J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0006J#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010 \u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/FrameReference;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputStatus;", "imageStatus-Oo2lJfM", "(I)I", "imageStatus", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "imageStatus-BWjvHWQ", "", "streamFilter", "Landroidx/camera/camera2/pipe/Frame;", "tryAcquire", "(Ljava/util/Set;)Landroidx/camera/camera2/pipe/Frame;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameId;", "getFrameId-OMxQvVY", "()J", "frameId", "Landroidx/camera/camera2/pipe/FrameNumber;", "getFrameNumber-Ugla2oM", "frameNumber", "Landroidx/camera/camera2/pipe/CameraTimestamp;", "getFrameTimestamp-LS1Wq50", "frameTimestamp", "getFrameInfoStatus-U7r42EA", "()I", "frameInfoStatus", "getImageStreams", "()Ljava/util/Set;", "imageStreams", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FrameReference {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.FrameReference.Companion INSTANCE = androidx.camera.camera2.pipe.FrameReference.Companion.getHighSpeedVideoFpsRangesFor;

    /* renamed from: getFrameId-OMxQvVY, reason: not valid java name */
    long mo505getFrameIdOMxQvVY();

    /* renamed from: getFrameInfoStatus-U7r42EA, reason: not valid java name */
    int mo506getFrameInfoStatusU7r42EA();

    /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
    long mo507getFrameNumberUgla2oM();

    /* renamed from: getFrameTimestamp-LS1Wq50, reason: not valid java name */
    long mo508getFrameTimestampLS1Wq50();

    java.util.Set<androidx.camera.camera2.pipe.StreamId> getImageStreams();

    androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata();

    /* renamed from: imageStatus-Oo2lJfM, reason: not valid java name */
    int mo510imageStatusOo2lJfM(int streamId);

    androidx.camera.camera2.pipe.Frame tryAcquire(java.util.Set<androidx.camera.camera2.pipe.StreamId> streamFilter);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: imageStatus-BWjvHWQ, reason: not valid java name */
        public static int m511imageStatusBWjvHWQ(androidx.camera.camera2.pipe.FrameReference frameReference, int i) {
            return androidx.camera.camera2.pipe.FrameReference.super.mo509imageStatusBWjvHWQ(i);
        }
    }

    /* renamed from: imageStatus-BWjvHWQ, reason: not valid java name */
    default int mo509imageStatusBWjvHWQ(int outputId) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.camera.camera2.pipe.Frame tryAcquire$default(androidx.camera.camera2.pipe.FrameReference frameReference, java.util.Set set, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryAcquire");
        }
        if ((i & 1) != 0) {
            set = null;
        }
        return frameReference.tryAcquire(set);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b*\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/pipe/FrameReference$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/FrameReference;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streamFilter", "Landroidx/camera/camera2/pipe/Frame;", "acquire", "(Landroidx/camera/camera2/pipe/FrameReference;Ljava/util/Set;)Landroidx/camera/camera2/pipe/Frame;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.pipe.FrameReference.Companion getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.FrameReference.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.camera.camera2.pipe.Frame acquire$default(androidx.camera.camera2.pipe.FrameReference.Companion companion, androidx.camera.camera2.pipe.FrameReference frameReference, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = null;
            }
            return companion.acquire(frameReference, set);
        }

        public final androidx.camera.camera2.pipe.Frame acquire(androidx.camera.camera2.pipe.FrameReference frameReference, java.util.Set<androidx.camera.camera2.pipe.StreamId> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameReference, "");
            androidx.camera.camera2.pipe.Frame tryAcquire = frameReference.tryAcquire(set);
            if (tryAcquire != null) {
                return tryAcquire;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to acquire a strong reference to ");
            sb.append(frameReference);
            sb.append('!');
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
    }
}
