package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzher {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzher(int i7, int i8, zzheq zzheqVar) {
        this.zza = zzhed.zzc(i7);
        this.zzb = zzhed.zzc(i8);
    }

    public final zzher zza(zzhep zzhepVar) {
        this.zzb.add(zzhepVar);
        return this;
    }

    public final zzher zzb(zzhep zzhepVar) {
        this.zza.add(zzhepVar);
        return this;
    }

    public final zzhes zzc() {
        return new zzhes(this.zza, this.zzb, null);
    }
}
