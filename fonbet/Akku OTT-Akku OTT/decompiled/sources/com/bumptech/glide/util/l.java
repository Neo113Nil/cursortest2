package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class l {
    public static void a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static void b(@Nullable Object obj) {
        c(obj, "Argument must not be null");
    }

    @NonNull
    public static void c(@Nullable Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
