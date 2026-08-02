package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfqt extends zzfrw {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final zzfrw zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final zzfrw zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrw
    public final zzfrx zzc() {
        return new zzfqv(this.zza, this.zzb, null);
    }
}
