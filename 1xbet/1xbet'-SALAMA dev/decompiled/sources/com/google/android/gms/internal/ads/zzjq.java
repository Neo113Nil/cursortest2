package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzjq implements zzks {
    private final Object zza;
    private zzbn zzb;

    public zzjq(Object obj, zzul zzulVar) {
        this.zza = obj;
        this.zzb = zzulVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzbn zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final Object zzb() {
        return this.zza;
    }

    public final void zzc(zzbn zzbnVar) {
        this.zzb = zzbnVar;
    }
}
