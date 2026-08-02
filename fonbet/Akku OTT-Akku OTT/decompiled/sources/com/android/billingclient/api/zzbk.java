package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
final class zzbk {
    private final List zza;
    private final BillingResult zzb;

    public zzbk(BillingResult billingResult, @Nullable List list) {
        this.zza = list;
        this.zzb = billingResult;
    }

    public final BillingResult zza() {
        return this.zzb;
    }

    public final List zzb() {
        return this.zza;
    }
}
