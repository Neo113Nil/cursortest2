package org.betup.utils;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;

/* loaded from: classes4.dex */
public final class FacebookSdkHelper {
    private static final Object INIT_LOCK = new Object();
    private static final String TAG = "FacebookSdkHelper";

    private FacebookSdkHelper() {
    }

    public static boolean ensureInitialized(Context context) {
        if (context == null) {
            return false;
        }
        if (FacebookSdk.isInitialized()) {
            return true;
        }
        synchronized (INIT_LOCK) {
            if (FacebookSdk.isInitialized()) {
                return true;
            }
            try {
                FacebookSdk.sdkInitialize(context.getApplicationContext());
                return FacebookSdk.isInitialized();
            } catch (Throwable th) {
                Log.e(TAG, "Facebook SDK init failed", th);
                return false;
            }
        }
    }
}
