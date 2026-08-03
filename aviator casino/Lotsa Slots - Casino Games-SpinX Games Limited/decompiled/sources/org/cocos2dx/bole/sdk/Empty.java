package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class Empty extends org.cocos2dx.bole.sdk.SDKBase {
    private static org.cocos2dx.bole.sdk.Empty instance;

    public static org.cocos2dx.bole.sdk.Empty Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.Empty();
        }
        return instance;
    }
}
