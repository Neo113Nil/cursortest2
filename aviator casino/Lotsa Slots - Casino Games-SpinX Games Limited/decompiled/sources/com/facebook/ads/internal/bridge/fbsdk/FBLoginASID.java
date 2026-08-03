package com.facebook.ads.internal.bridge.fbsdk;

/* loaded from: classes2.dex */
public class FBLoginASID {
    public static java.lang.String getFBLoginASID() {
        try {
            java.lang.Object invoke = java.lang.Class.forName("com.facebook.AccessToken").getDeclaredMethod("getCurrentAccessToken", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            if (invoke != null) {
                return (java.lang.String) java.lang.Class.forName("com.facebook.AccessToken").getDeclaredMethod("getUserId", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
