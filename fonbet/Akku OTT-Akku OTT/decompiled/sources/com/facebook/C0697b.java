package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0697b {
    public static final a Companion = new a();
    public final SharedPreferences a;

    /* renamed from: com.facebook.b$a */
    public static final class a {
    }

    /* renamed from: com.facebook.b$b, reason: collision with other inner class name */
    public static final class C0086b {
    }

    public C0697b() {
        SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        C0086b tokenCachingStrategyFactory = new C0086b();
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(tokenCachingStrategyFactory, "tokenCachingStrategyFactory");
        this.a = sharedPreferences;
    }
}
