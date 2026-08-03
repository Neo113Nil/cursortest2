package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class SamsungUtils extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.SamsungUtils instance;

    public static org.cocos2dx.bole.sdk.SamsungUtils Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.SamsungUtils();
        }
        return instance;
    }
}
