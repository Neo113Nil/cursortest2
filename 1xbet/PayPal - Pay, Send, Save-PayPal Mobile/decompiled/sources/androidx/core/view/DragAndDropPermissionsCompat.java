package androidx.core.view;

/* loaded from: classes7.dex */
public final class DragAndDropPermissionsCompat {
    private final android.view.DragAndDropPermissions getHighSpeedVideoSizes;

    private DragAndDropPermissionsCompat(android.view.DragAndDropPermissions dragAndDropPermissions) {
        this.getHighSpeedVideoSizes = dragAndDropPermissions;
    }

    public static androidx.core.view.DragAndDropPermissionsCompat request(android.app.Activity activity, android.view.DragEvent dragEvent) {
        android.view.DragAndDropPermissions highResolutionOutputSizeshNQ4ISI = androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(activity, dragEvent);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return new androidx.core.view.DragAndDropPermissionsCompat(highResolutionOutputSizeshNQ4ISI);
        }
        return null;
    }

    public final void release() {
        androidx.core.view.DragAndDropPermissionsCompat.Api24Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.view.DragAndDropPermissions getHighResolutionOutputSizeshNQ4ISI(android.app.Activity activity, android.view.DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }

        static void getHighSpeedVideoFpsRanges(android.view.DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }
    }
}
