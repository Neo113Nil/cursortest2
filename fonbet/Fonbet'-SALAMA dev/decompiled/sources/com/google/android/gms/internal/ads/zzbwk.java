package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbwk extends zzbvp {
    private final String zza;
    private final int zzb;

    public zzbwk(S2.b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvq
    public final String zzf() {
        return this.zza;
    }

    public zzbwk(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }
}
