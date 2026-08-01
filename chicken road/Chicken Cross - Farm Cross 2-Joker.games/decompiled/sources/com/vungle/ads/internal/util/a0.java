package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.vungle.ads.internal.presenter.f0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class a0 {
    public static int a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static WebView a(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return f0.a(context, str);
        } catch (Resources.NotFoundException e) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e + ".message");
        } catch (Exception e2) {
            throw new InstantiationException(e2.getMessage());
        }
    }

    public static Pair a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = resources.getConfiguration().orientation;
        return new Pair(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)));
    }
}
