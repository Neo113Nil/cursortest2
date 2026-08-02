package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzekc implements zzesg {
    private final boolean zza;

    public zzekc(boolean z4) {
        this.zza = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcts) obj).zza.putString("adid_p", true != this.zza ? "0" : "1");
    }
}
