package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzepu implements zzesg {
    private final Boolean zza;

    public zzepu(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Boolean bool = this.zza;
        zzcts zzctsVar = (zzcts) obj;
        if (bool != null) {
            zzctsVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
