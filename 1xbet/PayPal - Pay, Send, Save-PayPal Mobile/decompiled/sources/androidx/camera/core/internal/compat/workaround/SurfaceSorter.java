package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes6.dex */
public class SurfaceSorter {
    private final boolean getHighSpeedVideoSizes;

    public SurfaceSorter() {
        this.getHighSpeedVideoSizes = androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class) != null;
    }

    public void sort(java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> list) {
        if (this.getHighSpeedVideoSizes) {
            java.util.Collections.sort(list, new java.util.Comparator() { // from class: androidx.camera.core.internal.compat.workaround.SurfaceSorter$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.camera.core.internal.compat.workaround.SurfaceSorter.getHighSpeedVideoSizes(((androidx.camera.core.impl.SessionConfig.OutputConfig) obj).getSurface()) - androidx.camera.core.internal.compat.workaround.SurfaceSorter.getHighSpeedVideoSizes(((androidx.camera.core.impl.SessionConfig.OutputConfig) obj2).getSurface());
                }
            });
        }
    }

    static int getHighSpeedVideoSizes(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        if (deferrableSurface.getContainerClass() == android.media.MediaCodec.class) {
            return 2;
        }
        return (deferrableSurface.getContainerClass() == androidx.camera.core.Preview.class || deferrableSurface.getContainerClass() == androidx.camera.core.streamsharing.StreamSharing.class) ? 0 : 1;
    }
}
