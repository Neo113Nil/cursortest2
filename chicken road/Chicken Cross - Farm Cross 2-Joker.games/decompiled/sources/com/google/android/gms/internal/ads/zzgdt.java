package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgdt extends zzhbr {
    Object zza;

    zzgdt(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final boolean zza(Object obj) {
        return super.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final boolean zzb(Throwable th) {
        return super.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final void zzc() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String zzd() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }
}
