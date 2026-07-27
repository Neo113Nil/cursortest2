package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wg {
    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5061a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public wg(SharedPreferences sharedPrefs) {
        Intrinsics.checkNotNullParameter(sharedPrefs, "sharedPrefs");
        this.f5061a = sharedPrefs;
    }

    public final String a(String sharedPrefsKey) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            return this.f5061a.getString(sharedPrefsKey, null);
        } catch (Exception e) {
            mb.b("Load from shared prefs exception", e);
            return null;
        }
    }

    public final void b(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            this.f5061a.edit().putBoolean(key, z).apply();
        } catch (Exception e) {
            mb.b("Save boolean to shared prefs exception", e);
        }
    }

    public final void a(String sharedPrefsKey, String str) {
        Intrinsics.checkNotNullParameter(sharedPrefsKey, "sharedPrefsKey");
        try {
            this.f5061a.edit().putString(sharedPrefsKey, str).apply();
        } catch (Exception e) {
            mb.b("Save to shared prefs exception", e);
        }
    }

    public final boolean a(String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.f5061a.getBoolean(key, z);
        } catch (Exception e) {
            mb.b("Load boolean from shared prefs exception", e);
            return z;
        }
    }
}
