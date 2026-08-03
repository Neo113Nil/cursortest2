package com.inmobi.media;

/* renamed from: com.inmobi.media.ij, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2490ij {
    public static android.content.SharedPreferences a() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        java.lang.String str = (context != null ? context.getPackageName() : null) + "_preferences";
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
