package org.betup.services.ads.debug;

import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.common.AdInspectorError;

/* loaded from: classes2.dex */
public final class AdsDebugInspector {
    private static final String TAG = "AdsDebugInspector";

    public static void logAdapterStatuses() {
    }

    private AdsDebugInspector() {
    }

    public static void openAdInspector() {
        Log.w(TAG, "openAdInspector skipped — not DEBUG");
    }

    private static /* synthetic */ void lambda$openAdInspector$0(AdInspectorError adInspectorError) {
        if (adInspectorError == null) {
            Log.i(TAG, "Ad Inspector closed");
        } else {
            Log.e(TAG, "Ad Inspector closed with error: code=" + adInspectorError.getCode() + " msg=" + adInspectorError.getMessage() + " — register GAID in AdMob → Settings → Test devices");
        }
    }
}
