package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxTypefaces {
    private static final java.util.HashMap<java.lang.String, android.graphics.Typeface> sTypefaceCache = new java.util.HashMap<>();

    public static synchronized android.graphics.Typeface get(android.content.Context context, java.lang.String str) {
        android.graphics.Typeface typeface;
        android.graphics.Typeface createFromAsset;
        synchronized (org.cocos2dx.lib.Cocos2dxTypefaces.class) {
            java.util.HashMap<java.lang.String, android.graphics.Typeface> hashMap = sTypefaceCache;
            if (!hashMap.containsKey(str)) {
                if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                    createFromAsset = android.graphics.Typeface.createFromFile(str);
                } else {
                    createFromAsset = android.graphics.Typeface.createFromAsset(context.getAssets(), str);
                }
                hashMap.put(str, createFromAsset);
            }
            typeface = hashMap.get(str);
        }
        return typeface;
    }
}
