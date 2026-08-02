package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcgi implements zzheg {
    private final zzcge zza;

    public zzcgi(zzcge zzcgeVar) {
        this.zza = zzcgeVar;
    }

    public static Context zzc(zzcge zzcgeVar) {
        Context zzb = zzcgeVar.zzb();
        zzheo.zzb(zzb);
        return zzb;
    }

    public final Context zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
