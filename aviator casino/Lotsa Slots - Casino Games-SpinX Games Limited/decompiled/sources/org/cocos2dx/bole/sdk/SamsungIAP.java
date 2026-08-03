package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class SamsungIAP extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.SamsungIAP instance;

    public static org.cocos2dx.bole.sdk.SamsungIAP Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.SamsungIAP();
        }
        return instance;
    }
}
