package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzerf implements zzesg {
    private final String zza;
    private final int zzb;

    public zzerf(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcts) obj).zzb.putString("request_id", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        zzctsVar.zza.putString("request_id", this.zza);
        if (this.zzb == 2) {
            zzctsVar.zza.putInt("sod", 1);
        }
    }
}
