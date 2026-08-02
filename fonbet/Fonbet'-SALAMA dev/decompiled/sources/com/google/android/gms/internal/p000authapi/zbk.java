package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC0828e;

/* loaded from: classes.dex */
final class zbk extends zbd {
    private final InterfaceC0828e zba;

    public zbk(InterfaceC0828e interfaceC0828e) {
        this.zba = interfaceC0828e;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbd, com.google.android.gms.internal.p000authapi.zbs
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
