package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class AmazonUtils extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.AmazonUtils instance;

    public static org.cocos2dx.bole.sdk.AmazonUtils Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.AmazonUtils();
        }
        return instance;
    }
}
