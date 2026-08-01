package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* loaded from: classes4.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory pcc;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return pcc;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        pcc = iSDKTypeFactory;
    }
}
