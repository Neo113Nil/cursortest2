package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfqk extends zzfqw {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqx zzc() {
        return new zzfqm(this.zza, this.zzb, null);
    }
}
