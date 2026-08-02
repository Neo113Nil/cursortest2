package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzepq implements zzesg {
    private final boolean zza;

    public zzepq(boolean z4) {
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcts) obj).zzb.putBoolean("is_gbid", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcts) obj).zza.putBoolean("is_gbid", this.zza);
    }
}
