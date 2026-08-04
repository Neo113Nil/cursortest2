package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzcub implements zzheg {
    private final zzctz zza;
    private final zzhep zzb;

    public zzcub(zzctz zzctzVar, zzhep zzhepVar) {
        this.zza = zzctzVar;
        this.zzb = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzb = this.zza.zzb(((zzcgi) this.zzb).zza());
        zzheo.zzb(contextZzb);
        return contextZzb;
    }
}
