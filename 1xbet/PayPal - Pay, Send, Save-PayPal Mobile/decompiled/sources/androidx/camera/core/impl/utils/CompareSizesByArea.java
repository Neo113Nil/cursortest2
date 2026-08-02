package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class CompareSizesByArea implements java.util.Comparator<android.util.Size> {
    private boolean getHighSpeedVideoFpsRanges;

    public CompareSizesByArea() {
        this(false);
    }

    public CompareSizesByArea(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // java.util.Comparator
    public final int compare(android.util.Size size, android.util.Size size2) {
        int signum = java.lang.Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.getHighSpeedVideoFpsRanges ? signum * (-1) : signum;
    }
}
