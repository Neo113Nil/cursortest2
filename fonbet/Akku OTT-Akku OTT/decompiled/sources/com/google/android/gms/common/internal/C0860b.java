package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0860b {
    @NonNull
    public static com.google.android.gms.common.api.b a(@NonNull Status status) {
        return status.c != null ? new com.google.android.gms.common.api.k(status) : new com.google.android.gms.common.api.b(status);
    }
}
