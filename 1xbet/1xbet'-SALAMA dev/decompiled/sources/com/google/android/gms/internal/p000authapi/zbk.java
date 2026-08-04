package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0784e;

/* JADX INFO: loaded from: classes.dex */
final class zbk extends zbd {
    private final InterfaceC0784e zba;

    public zbk(InterfaceC0784e interfaceC0784e) {
        this.zba = interfaceC0784e;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
