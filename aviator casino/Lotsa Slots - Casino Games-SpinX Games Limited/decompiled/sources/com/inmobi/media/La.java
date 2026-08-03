package com.inmobi.media;

/* loaded from: classes5.dex */
public final class La {
    public static final java.util.concurrent.ConcurrentHashMap b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f4815a;

    public La(android.content.Context context, java.lang.String str) {
        this.f4815a = context.getSharedPreferences(str, 0);
    }

    public static void a(com.inmobi.media.La la, java.lang.String key, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        android.content.SharedPreferences.Editor edit = la.f4815a.edit();
        edit.putBoolean(key, z);
        edit.apply();
    }

    public final boolean a(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f4815a.contains(key)) {
            return false;
        }
        android.content.SharedPreferences.Editor edit = this.f4815a.edit();
        edit.remove(key);
        edit.apply();
        return true;
    }

    public final void a(java.lang.String key, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        android.content.SharedPreferences.Editor edit = this.f4815a.edit();
        edit.putString(key, str);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public final void a(java.lang.String key, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        android.content.SharedPreferences.Editor edit = this.f4815a.edit();
        edit.putInt(key, i);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public final void a(java.lang.String key, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        android.content.SharedPreferences.Editor edit = this.f4815a.edit();
        edit.putLong(key, j);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
