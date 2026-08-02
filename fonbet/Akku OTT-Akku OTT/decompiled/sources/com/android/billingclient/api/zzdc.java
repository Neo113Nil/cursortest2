package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes3.dex */
final class zzdc {

    @Nullable
    private final List zza;
    private final int zzb;
    private final String zzc;

    public zzdc(int i, String str, @Nullable List list) {
        this.zzb = i;
        this.zzc = str;
        this.zza = list;
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    @Nullable
    public final List zzc() {
        return this.zza;
    }
}
