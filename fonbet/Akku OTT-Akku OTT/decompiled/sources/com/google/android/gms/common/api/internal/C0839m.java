package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;

/* renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0839m {
    @NonNull
    public static C0838l a(@NonNull Looper looper, @NonNull Object obj, @NonNull String str) {
        C0875q.h(obj, "Listener must not be null");
        C0875q.h(looper, "Looper must not be null");
        C0875q.h(str, "Listener type must not be null");
        return new C0838l(looper, obj, str);
    }
}
