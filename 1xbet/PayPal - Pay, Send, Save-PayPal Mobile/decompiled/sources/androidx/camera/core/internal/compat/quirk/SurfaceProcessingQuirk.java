package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public interface SurfaceProcessingQuirk extends androidx.camera.core.impl.Quirk {
    default boolean workaroundBySurfaceProcessing() {
        return true;
    }

    static boolean workaroundBySurfaceProcessing(androidx.camera.core.impl.Quirks quirks) {
        java.util.Iterator it = quirks.getAll(androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk) it.next()).workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }
}
