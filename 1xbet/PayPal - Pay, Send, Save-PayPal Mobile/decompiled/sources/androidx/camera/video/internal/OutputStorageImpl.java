package androidx.camera.video.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/video/internal/OutputStorageImpl;", "Landroidx/camera/video/internal/OutputStorage;", "Landroidx/camera/video/OutputOptions;", "outputOptions", "<init>", "(Landroidx/camera/video/OutputOptions;)V", "getOutputOptions", "()Landroidx/camera/video/OutputOptions;", "", "getAvailableBytes", "()J", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/video/OutputOptions;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OutputStorageImpl implements androidx.camera.video.internal.OutputStorage {
    private static final androidx.camera.video.internal.OutputStorageImpl.Companion Companion = new androidx.camera.video.internal.OutputStorageImpl.Companion(null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.video.OutputOptions getHighSpeedVideoFpsRanges;

    public OutputStorageImpl(androidx.camera.video.OutputOptions outputOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputOptions, "");
        this.getHighSpeedVideoFpsRanges = outputOptions;
    }

    @Override // androidx.camera.video.internal.OutputStorage
    /* renamed from: getOutputOptions, reason: from getter */
    public final androidx.camera.video.OutputOptions getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.internal.OutputStorage
    public final long getAvailableBytes() {
        try {
            androidx.camera.video.OutputOptions outputOptions = this.getHighSpeedVideoFpsRanges;
            if (outputOptions instanceof androidx.camera.video.FileOutputOptions) {
                java.io.File parentFile = ((androidx.camera.video.FileOutputOptions) outputOptions).getFile().getParentFile();
                kotlin.jvm.internal.Intrinsics.checkNotNull(parentFile);
                return androidx.camera.video.internal.utils.StorageUtil.getAvailableBytes(parentFile);
            }
            if (outputOptions instanceof androidx.camera.video.MediaStoreOutputOptions) {
                android.net.Uri collectionUri = ((androidx.camera.video.MediaStoreOutputOptions) outputOptions).getCollectionUri();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionUri, "");
                return androidx.camera.video.internal.utils.StorageUtil.getAvailableBytesForMediaStoreUri(collectionUri);
            }
            if (outputOptions instanceof androidx.camera.video.FileDescriptorOutputOptions) {
                return Long.MAX_VALUE;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown OutputOptions: ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            throw new java.lang.AssertionError(sb.toString());
        } catch (java.lang.RuntimeException e) {
            androidx.camera.core.Logger.w("OutputStorageImpl", "Fail to access the available bytes.", e);
            return Long.MAX_VALUE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/video/internal/OutputStorageImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
