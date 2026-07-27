package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes6.dex */
public abstract class Dk {
    public static SharedPreferences a() {
        Context context = AbstractC3914mk.f7252a;
        String str = (context != null ? context.getPackageName() : null) + "_preferences";
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
