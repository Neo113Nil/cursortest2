package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class SamsungCloud extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.SamsungCloud instance;

    public static org.cocos2dx.bole.sdk.SamsungCloud Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.SamsungCloud();
        }
        return instance;
    }
}
