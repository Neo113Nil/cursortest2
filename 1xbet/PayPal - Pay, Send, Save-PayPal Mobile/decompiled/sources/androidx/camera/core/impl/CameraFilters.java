package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class CameraFilters {
    public static final androidx.camera.core.CameraFilter ANY = new androidx.camera.core.CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.CameraFilter
        public final java.util.List filter(java.util.List list) {
            return androidx.camera.core.impl.CameraFilters.getHighSpeedVideoFpsRanges(list);
        }
    };
    public static final androidx.camera.core.CameraFilter NONE = new androidx.camera.core.CameraFilter() { // from class: androidx.camera.core.impl.CameraFilters$$ExternalSyntheticLambda1
        @Override // androidx.camera.core.CameraFilter
        public final java.util.List filter(java.util.List list) {
            java.util.List emptyList;
            emptyList = java.util.Collections.emptyList();
            return emptyList;
        }
    };

    static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(java.util.List list) {
        return list;
    }

    private CameraFilters() {
    }
}
