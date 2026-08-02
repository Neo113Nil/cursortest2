package com.amplitude.android.utilities;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public final SharedPreferences a;

    public d(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public final void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a.edit().remove(key).commit();
    }

    public final long b(String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.a.getLong(key, j);
    }

    public final boolean c(long j, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.a.edit().putLong(key, j).commit();
    }
}
