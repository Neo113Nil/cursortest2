package androidx.media3.common.util;

/* loaded from: classes7.dex */
public abstract class LibraryLoader {
    private boolean getHighSpeedVideoFpsRanges;
    private java.lang.String[] getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    protected abstract void loadLibrary(java.lang.String str);

    public LibraryLoader(java.lang.String... strArr) {
        this.getHighSpeedVideoFpsRangesFor = strArr;
    }

    public void setLibraries(java.lang.String... strArr) {
        synchronized (this) {
            com.google.common.base.Preconditions.checkState(!this.getHighSpeedVideoSizes, "Cannot set libraries after loading");
            this.getHighSpeedVideoFpsRangesFor = strArr;
        }
    }

    public boolean isAvailable() {
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                return this.getHighSpeedVideoFpsRanges;
            }
            this.getHighSpeedVideoSizes = true;
            try {
                for (java.lang.String str : this.getHighSpeedVideoFpsRangesFor) {
                    loadLibrary(str);
                }
                this.getHighSpeedVideoFpsRanges = true;
            } catch (java.lang.UnsatisfiedLinkError unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Failed to load ");
                sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor));
                androidx.media3.common.util.Log.w("LibraryLoader", sb.toString());
            }
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}
