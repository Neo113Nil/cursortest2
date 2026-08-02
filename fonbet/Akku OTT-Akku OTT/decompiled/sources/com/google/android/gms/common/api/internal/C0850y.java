package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;

/* renamed from: com.google.android.gms.common.api.internal.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0850y implements i.a {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ A b;

    public C0850y(A a, BasePendingResult basePendingResult) {
        this.b = a;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.i.a
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
