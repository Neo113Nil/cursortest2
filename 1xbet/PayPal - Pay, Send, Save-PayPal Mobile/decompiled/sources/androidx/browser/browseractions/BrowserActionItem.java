package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public class BrowserActionItem {
    private int Camera2StreamConfigurationMap;
    java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private android.net.Uri getHighSpeedVideoFpsRangesFor;
    private final android.app.PendingIntent getHighSpeedVideoSizes;

    public BrowserActionItem(java.lang.String str, android.app.PendingIntent pendingIntent, int i) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = pendingIntent;
        this.Camera2StreamConfigurationMap = i;
    }

    public BrowserActionItem(java.lang.String str, android.app.PendingIntent pendingIntent, android.net.Uri uri) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = pendingIntent;
        this.getHighSpeedVideoFpsRangesFor = uri;
    }

    BrowserActionItem(java.lang.String str, java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = runnable;
    }

    public BrowserActionItem(java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }

    public int getIconId() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getTitle() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public android.app.PendingIntent getAction() {
        android.app.PendingIntent pendingIntent = this.getHighSpeedVideoSizes;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new java.lang.IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public android.net.Uri getIconUri() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
