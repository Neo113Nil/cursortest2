package androidx.work;

/* loaded from: classes.dex */
public final class ForegroundInfo {
    private final int Camera2StreamConfigurationMap;
    private final android.app.Notification getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public ForegroundInfo(int i, android.app.Notification notification) {
        this(i, notification, 0);
    }

    public ForegroundInfo(int i, android.app.Notification notification, int i2) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = notification;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    public final int getNotificationId() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getForegroundServiceType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final android.app.Notification getNotification() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.work.ForegroundInfo foregroundInfo = (androidx.work.ForegroundInfo) obj;
        if (this.Camera2StreamConfigurationMap == foregroundInfo.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == foregroundInfo.getHighSpeedVideoFpsRangesFor) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(foregroundInfo.getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.Camera2StreamConfigurationMap * 31) + this.getHighSpeedVideoFpsRangesFor) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ForegroundInfo{mNotificationId=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", mForegroundServiceType=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", mNotification=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
