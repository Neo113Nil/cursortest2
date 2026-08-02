package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzcgj implements zzheg {
    private final zzcge zza;

    public zzcgj(zzcge zzcgeVar) {
        this.zza = zzcgeVar;
    }

    public static WeakReference zzc(zzcge zzcgeVar) {
        WeakReference zzg = zzcgeVar.zzg();
        zzheo.zzb(zzg);
        return zzg;
    }

    public final WeakReference zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
