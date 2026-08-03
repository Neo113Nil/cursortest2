package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class HuaweiSDK extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.HuaweiSDK instance;

    public static org.cocos2dx.bole.sdk.HuaweiSDK Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.HuaweiSDK();
        }
        return instance;
    }
}
