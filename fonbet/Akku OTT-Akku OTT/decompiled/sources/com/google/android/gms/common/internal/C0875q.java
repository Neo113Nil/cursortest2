package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.zzd;

/* renamed from: com.google.android.gms.common.internal.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0875q {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(@NonNull Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(androidx.core.database.a.d("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    @NonNull
    public static void d(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    @NonNull
    public static void e(@Nullable String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void f(@NonNull String str) {
        if (zzd.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static void g(@Nullable Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    @NonNull
    public static void h(@NonNull Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
