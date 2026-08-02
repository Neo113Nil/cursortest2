package androidx.core.service.quicksettings;

/* loaded from: classes7.dex */
public class PendingIntentActivityWrapper {
    private final android.content.Context Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Intent getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final android.os.Bundle getHighSpeedVideoSizes;
    private final android.app.PendingIntent getInputFormats;
    private final int getInputSizeshNQ4ISI;

    public PendingIntentActivityWrapper(android.content.Context context, int i, android.content.Intent intent, int i2, boolean z) {
        this(context, i, intent, i2, null, z);
    }

    public PendingIntentActivityWrapper(android.content.Context context, int i, android.content.Intent intent, int i2, android.os.Bundle bundle, boolean z) {
        android.app.PendingIntent activity;
        this.Camera2StreamConfigurationMap = context;
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = intent;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoSizes = bundle;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        if (bundle == null) {
            activity = androidx.core.app.PendingIntentCompat.getActivity(context, i, intent, i2, z);
        } else {
            activity = androidx.core.app.PendingIntentCompat.getActivity(context, i, intent, i2, bundle, z);
        }
        this.getInputFormats = activity;
    }

    public android.content.Context getContext() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getRequestCode() {
        return this.getInputSizeshNQ4ISI;
    }

    public android.content.Intent getIntent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getFlags() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.os.Bundle getOptions() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isMutable() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public android.app.PendingIntent getPendingIntent() {
        return this.getInputFormats;
    }
}
