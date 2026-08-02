package com.android.volley;

/* loaded from: classes7.dex */
public class DefaultRetryPolicy implements com.android.volley.RetryPolicy {
    public static final float DEFAULT_BACKOFF_MULT = 1.0f;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 2500;
    private final float Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public DefaultRetryPolicy() {
        this(2500, 1, 1.0f);
    }

    public DefaultRetryPolicy(int i, int i2, float f) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = f;
    }

    @Override // com.android.volley.RetryPolicy
    public int getCurrentTimeout() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.android.volley.RetryPolicy
    public int getCurrentRetryCount() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getBackoffMultiplier() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.android.volley.RetryPolicy
    public void retry(com.android.volley.VolleyError volleyError) throws com.android.volley.VolleyError {
        this.getHighSpeedVideoFpsRangesFor++;
        int i = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = i + ((int) (i * this.Camera2StreamConfigurationMap));
        if (!hasAttemptRemaining()) {
            throw volleyError;
        }
    }

    protected boolean hasAttemptRemaining() {
        return this.getHighSpeedVideoFpsRangesFor <= this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
