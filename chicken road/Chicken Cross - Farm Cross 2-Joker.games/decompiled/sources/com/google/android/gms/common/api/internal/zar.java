package com.google.android.gms.common.api.internal;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.7.2 */
/* loaded from: classes9.dex */
final class zar {
    final /* synthetic */ BasePendingResult zaa;

    /* synthetic */ zar(BasePendingResult basePendingResult, byte[] bArr) {
        Objects.requireNonNull(basePendingResult);
        this.zaa = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult.zal(this.zaa.zam());
        super.finalize();
    }
}
