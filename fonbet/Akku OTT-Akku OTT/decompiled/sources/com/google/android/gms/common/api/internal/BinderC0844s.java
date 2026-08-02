package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0834h;

/* renamed from: com.google.android.gms.common.api.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class BinderC0844s extends InterfaceC0834h.a {
    public final InterfaceC0831e<Status> a;

    public BinderC0844s(@NonNull InterfaceC0831e<Status> interfaceC0831e) {
        this.a = interfaceC0831e;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0834h
    public final void onResult(@NonNull Status status) {
        this.a.setResult(status);
    }
}
