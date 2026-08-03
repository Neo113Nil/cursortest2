package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class AmazonSDK extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.AmazonSDK instance;

    public static org.cocos2dx.bole.sdk.AmazonSDK Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.AmazonSDK();
        }
        return instance;
    }
}
