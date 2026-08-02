package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzepm implements zzesg {
    private final Integer zza;

    public zzepm(Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcts zzctsVar = (zzcts) obj;
        if (num != null) {
            zzctsVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
