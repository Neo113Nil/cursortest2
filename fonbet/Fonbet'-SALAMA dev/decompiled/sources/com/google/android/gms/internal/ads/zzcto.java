package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class zzcto implements zzcwe, zzcvl {
    private final zzfaf zza;

    public zzcto(Context context, zzfaf zzfafVar, zzbst zzbstVar) {
        this.zza = zzfafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdh(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdk(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        zzbsu zzbsuVar = this.zza.zzad;
        if (zzbsuVar == null || !zzbsuVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zza.zzad.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zza.zzad.zzb);
    }
}
