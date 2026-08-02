package androidx.browser.customtabs;

/* loaded from: classes5.dex */
public final class CustomContentAction {
    final int Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final android.app.PendingIntent getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* synthetic */ CustomContentAction(int i, java.lang.String str, android.app.PendingIntent pendingIntent, int i2, byte b) {
        this(i, str, pendingIntent, i2);
    }

    public static final class Builder {
        private final int Camera2StreamConfigurationMap;
        private final android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRangesFor;
        private final java.lang.String getHighSpeedVideoSizes;

        public Builder(int i, java.lang.String str, android.app.PendingIntent pendingIntent, int i2) {
            if (str.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Label cannot be empty.");
            }
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Id cannot be set to negative numbers.");
            }
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalArgumentException("Invalid target type: ".concat(java.lang.String.valueOf(i2)));
            }
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = str;
            this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
            this.Camera2StreamConfigurationMap = i2;
        }

        public final androidx.browser.customtabs.CustomContentAction build() {
            return new androidx.browser.customtabs.CustomContentAction(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, (byte) 0);
        }
    }

    private CustomContentAction(int i, java.lang.String str, android.app.PendingIntent pendingIntent, int i2) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = pendingIntent;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    public final int getId() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String getLabel() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int getTargetType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static androidx.browser.customtabs.CustomContentAction fromBundle(android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent;
        if (!bundle.containsKey("androidx.browser.customtabs.customcontentaction.ID")) {
            throw new java.lang.IllegalArgumentException("Bundle is missing required key: androidx.browser.customtabs.customcontentaction.ID");
        }
        int i = bundle.getInt("androidx.browser.customtabs.customcontentaction.ID");
        java.lang.String string = bundle.getString("androidx.browser.customtabs.customcontentaction.LABEL");
        if (android.text.TextUtils.isEmpty(string)) {
            throw new java.lang.IllegalArgumentException("Bundle is missing required key: androidx.browser.customtabs.customcontentaction.LABEL");
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            pendingIntent = (android.app.PendingIntent) bundle.getParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT", android.app.PendingIntent.class);
        } else {
            pendingIntent = (android.app.PendingIntent) bundle.getParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT");
        }
        if (pendingIntent == null) {
            throw new java.lang.IllegalArgumentException("Bundle is missing required key: androidx.browser.customtabs.customcontentaction.PENDING_INTENT");
        }
        int i2 = bundle.getInt("androidx.browser.customtabs.customcontentaction.TARGET_TYPE", 0);
        if (i2 != 1 && i2 != 2) {
            throw new java.lang.IllegalArgumentException("Invalid target type: ".concat(java.lang.String.valueOf(i2)));
        }
        return new androidx.browser.customtabs.CustomContentAction(i, string, pendingIntent, i2);
    }
}
