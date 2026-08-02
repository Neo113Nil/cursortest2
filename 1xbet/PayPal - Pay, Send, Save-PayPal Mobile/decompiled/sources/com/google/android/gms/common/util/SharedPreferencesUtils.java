package com.google.android.gms.common.util;

/* loaded from: classes8.dex */
public class SharedPreferencesUtils {
    @java.lang.Deprecated
    public static void publishWorldReadableSharedPreferences(android.content.Context context, android.content.SharedPreferences.Editor editor, java.lang.String str) {
        throw new java.lang.IllegalStateException("world-readable shared preferences should only be used by apk");
    }

    private SharedPreferencesUtils() {
    }
}
