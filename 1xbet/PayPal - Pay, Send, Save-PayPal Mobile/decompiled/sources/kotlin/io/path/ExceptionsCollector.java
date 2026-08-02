package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\r\u001a\u00020\u00072\n\u0010\u0003\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u001b\u0010\r\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\u00128\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Lkotlin/io/path/ExceptionsCollector;", "", "", "p0", "<init>", "(I)V", "Ljava/nio/file/Path;", "", "Camera2StreamConfigurationMap", "(Ljava/nio/file/Path;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Exception;)V", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "", "Ljava/util/List;", "Ljava/nio/file/Path;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ExceptionsCollector {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<java.lang.Exception> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    java.nio.file.Path Camera2StreamConfigurationMap;

    private ExceptionsCollector(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    public /* synthetic */ ExceptionsCollector(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 64 : i);
    }

    public final void Camera2StreamConfigurationMap(java.nio.file.Path p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.nio.file.Path path = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = path != null ? path.resolve(p0) : null;
    }

    public final void getHighSpeedVideoFpsRangesFor(java.nio.file.Path p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.nio.file.Path path = this.Camera2StreamConfigurationMap;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(p0, path != null ? path.getFileName() : null)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        java.nio.file.Path path2 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = path2 != null ? path2.getParent() : null;
    }

    public final void getHighSpeedVideoFpsRanges(java.lang.Exception p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoSizes++;
        if (this.getHighSpeedVideoFpsRanges.size() < this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.Camera2StreamConfigurationMap != null) {
                java.lang.Throwable initCause = new java.nio.file.FileSystemException(java.lang.String.valueOf(this.Camera2StreamConfigurationMap)).initCause(p0);
                kotlin.jvm.internal.Intrinsics.checkNotNull(initCause, "");
                p0 = (java.nio.file.FileSystemException) initCause;
            }
            this.getHighSpeedVideoFpsRanges.add(p0);
        }
    }

    public ExceptionsCollector() {
        this(0, 1, null);
    }
}
