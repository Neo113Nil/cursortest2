package com.goldenboot.saga.zone;

import android.content.Context;
import android.content.res.Configuration;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public class KeyframeArray {
    public Context evictLayout;

    public KeyframeArray(Context context) {
        this.evictLayout = context;
    }

    public static KeyframeArray growPayload(Context context) {
        return new KeyframeArray(context);
    }

    public boolean clipOrigin() {
        return true;
    }

    public int detachStream() {
        Configuration configuration = this.evictLayout.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean evictLayout() {
        return this.evictLayout.getApplicationInfo().targetSdkVersion < 14;
    }

    public int injectMetric() {
        return this.evictLayout.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean releaseHeader() {
        return this.evictLayout.getResources().getBoolean(VibrationUploader.evictLayout);
    }
}
