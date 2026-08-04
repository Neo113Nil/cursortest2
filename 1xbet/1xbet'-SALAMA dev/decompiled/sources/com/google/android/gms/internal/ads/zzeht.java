package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zzeht {
    private final zzder zza;

    public zzeht(zzder zzderVar) {
        this.zza = zzderVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, View view, zzehp zzehpVar) {
        zzehr zzehrVar = new zzehr(this, new zzdez() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // com.google.android.gms.internal.ads.zzdez
            public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
            }
        });
        zzddo zzddoVarZzd = this.zza.zzd(new zzcqm(zzfarVar, zzfafVar, null), zzehrVar);
        zzehpVar.zzd(new zzehs(this, zzddoVarZzd));
        return zzddoVarZzd.zzg();
    }
}
