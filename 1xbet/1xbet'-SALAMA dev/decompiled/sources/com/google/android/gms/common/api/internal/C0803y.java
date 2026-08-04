package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0803y implements com.google.android.gms.common.api.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f11201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f11202b;

    public C0803y(A a2, BasePendingResult basePendingResult) {
        this.f11202b = a2;
        this.f11201a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.p
    public final void a(Status status) {
        ((Map) this.f11202b.f11090a).remove(this.f11201a);
    }
}
