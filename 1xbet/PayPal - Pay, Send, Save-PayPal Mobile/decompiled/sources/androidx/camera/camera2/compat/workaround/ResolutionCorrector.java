package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/compat/workaround/ResolutionCorrector;", "", "<init>", "()V", "Landroidx/camera/core/impl/SurfaceConfig$ConfigType;", "configType", "", "Landroid/util/Size;", "supportedResolutions", "insertOrPrioritize", "(Landroidx/camera/core/impl/SurfaceConfig$ConfigType;Ljava/util/List;)Ljava/util/List;", "Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResolutionCorrector {
    private final androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk getHighSpeedVideoSizes = (androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.class);

    public final java.util.List<android.util.Size> insertOrPrioritize(androidx.camera.core.impl.SurfaceConfig.ConfigType configType, java.util.List<android.util.Size> supportedResolutions) {
        android.util.Size verifiedResolution;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedResolutions, "");
        androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk = this.getHighSpeedVideoSizes;
        if (extraCroppingQuirk == null || (verifiedResolution = extraCroppingQuirk.getVerifiedResolution(configType)) == null) {
            return supportedResolutions;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(verifiedResolution);
        for (android.util.Size size : supportedResolutions) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(size, verifiedResolution)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }
}
