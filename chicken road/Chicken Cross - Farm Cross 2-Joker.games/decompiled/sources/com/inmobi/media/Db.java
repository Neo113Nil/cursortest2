package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Db {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6510a;

    public Db(Context context, String str) {
        this.f6510a = context.getSharedPreferences(str, 0);
    }

    public static void a(Db db, String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = db.f6510a.edit();
        edit.putBoolean(key, z);
        edit.apply();
    }

    public final void b(Set set) {
        Intrinsics.checkNotNullParameter("reported_events", "key");
        SharedPreferences.Editor edit = this.f6510a.edit();
        edit.putStringSet("reported_events", set);
        edit.apply();
    }

    public final boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f6510a.contains(key)) {
            return false;
        }
        SharedPreferences.Editor edit = this.f6510a.edit();
        edit.remove(key);
        edit.apply();
        return true;
    }

    public final void a(String key, String str, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f6510a.edit();
        edit.putString(key, str);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public final Set a(Set set) {
        Intrinsics.checkNotNullParameter("reported_events", "key");
        return this.f6510a.getStringSet("reported_events", set);
    }

    public final void a(String key, int i, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f6510a.edit();
        edit.putInt(key, i);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public final void a(String key, long j, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.f6510a.edit();
        edit.putLong(key, j);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
