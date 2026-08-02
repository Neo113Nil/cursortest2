package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "", "getCorrectedAspectRatio", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectRatioLegacyApi21Quirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk.Companion(null);

    public final int getCorrectedAspectRatio() {
        return 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AspectRatioLegacyApi21Quirk$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraMetadata);
            return false;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
