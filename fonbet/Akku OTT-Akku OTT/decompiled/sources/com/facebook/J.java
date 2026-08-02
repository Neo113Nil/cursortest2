package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class J {
    public static final a Companion = new a();
    public final SharedPreferences a;

    public static final class a {
    }

    public J() {
        SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }
}
