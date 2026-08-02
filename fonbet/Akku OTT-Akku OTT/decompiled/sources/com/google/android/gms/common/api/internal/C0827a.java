package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0860b;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0827a implements InterfaceC0845t {
    @Override // com.google.android.gms.common.api.internal.InterfaceC0845t
    @NonNull
    public final Exception getException(@NonNull Status status) {
        return C0860b.a(status);
    }
}
