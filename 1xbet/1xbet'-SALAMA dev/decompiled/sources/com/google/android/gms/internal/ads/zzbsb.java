package com.google.android.gms.internal.ads;

import O2.h;
import O2.i;
import O2.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzbsb {
    private final i zza;
    private final h zzb;
    private j zzc;

    public zzbsb(i iVar, h hVar) {
    }

    public static /* bridge */ /* synthetic */ h zzc(zzbsb zzbsbVar) {
        zzbsbVar.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ i zzd(zzbsb zzbsbVar) {
        zzbsbVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized j zzf(zzbgd zzbgdVar) {
        j jVar = this.zzc;
        if (jVar != null) {
            return jVar;
        }
        zzbsc zzbscVar = new zzbsc(zzbgdVar);
        this.zzc = zzbscVar;
        return zzbscVar;
    }

    public final zzbgn zza() {
        return null;
    }

    public final zzbgq zzb() {
        return new zzbrz(this, null);
    }
}
