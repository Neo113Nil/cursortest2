package com.adjust.sdk;

/* loaded from: classes2.dex */
public class AndroidIdUtil {
    public static java.lang.String getAndroidId(android.content.Context context) {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
