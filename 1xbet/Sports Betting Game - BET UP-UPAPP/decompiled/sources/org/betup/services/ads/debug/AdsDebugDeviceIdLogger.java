package org.betup.services.ads.debug;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.sentry.util.StringUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public final class AdsDebugDeviceIdLogger {
    private static final String TAG = "AdsDeviceId";

    public static void logAdvertisingId(Context context) {
    }

    private AdsDebugDeviceIdLogger() {
    }

    private static /* synthetic */ void lambda$logAdvertisingId$0(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo != null ? advertisingIdInfo.getId() : AbstractJsonLexerKt.NULL;
            Log.d(TAG, "GAID=" + id + ", LAT=" + (advertisingIdInfo != null && advertisingIdInfo.isLimitAdTrackingEnabled()));
            if (StringUtils.PROPER_NIL_UUID.equals(id)) {
                Log.w(TAG, "GAID is zeroed. Check Privacy settings / reset Advertising ID.");
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to read GAID", e);
        }
    }
}
