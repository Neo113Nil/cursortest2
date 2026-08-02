package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IlIIlIllll {
    public static java.lang.String llIIlIlIIl(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("com.microblink.blinkid.ping.preferences", 0);
        java.lang.String string = sharedPreferences.getString("com.microblink.blinkid.ping.preferences.userId", null);
        if (string != null) {
            return string;
        }
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        sharedPreferences.edit().putString("com.microblink.blinkid.ping.preferences.userId", obj).apply();
        return obj;
    }
}
