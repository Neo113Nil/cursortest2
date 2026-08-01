package com.bytedance.sdk.component.adexpress.oo;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class sf {
    public static boolean pcc(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
