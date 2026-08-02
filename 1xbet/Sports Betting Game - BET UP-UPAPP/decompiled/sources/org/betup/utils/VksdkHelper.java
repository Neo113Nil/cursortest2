package org.betup.utils;

import android.content.Context;
import com.vk.sdk.VKSdk;
import com.vk.sdk.VKServiceActivity;

/* loaded from: classes4.dex */
public final class VksdkHelper {
    private static Integer authorizationRequestCode;
    private static volatile boolean initialized;

    private VksdkHelper() {
    }

    public static void ensureInitialized(Context context) {
        if (initialized) {
            return;
        }
        synchronized (VksdkHelper.class) {
            if (initialized) {
                return;
            }
            VKSdk.initialize(context.getApplicationContext());
            initialized = true;
        }
    }

    public static int getAuthorizationRequestCode() {
        if (authorizationRequestCode == null) {
            synchronized (VksdkHelper.class) {
                if (authorizationRequestCode == null) {
                    authorizationRequestCode = Integer.valueOf(VKServiceActivity.VKServiceType.Authorization.getOuterCode());
                }
            }
        }
        return authorizationRequestCode.intValue();
    }
}
