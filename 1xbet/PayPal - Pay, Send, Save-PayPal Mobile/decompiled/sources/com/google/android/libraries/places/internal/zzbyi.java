package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyi implements com.google.android.libraries.places.internal.zzbym {
    final /* synthetic */ java.lang.Object zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzf zzb;

    zzbyi(com.google.android.libraries.places.internal.zzbzf zzbzfVar, java.lang.Object obj) {
        this.zza = obj;
        java.util.Objects.requireNonNull(zzbzfVar);
        this.zzb = zzbzfVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbym
    public final void zza(com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        zzbzdVar.zza.zzt(this.zzb.zzD().zze(this.zza));
        zzbzdVar.zza.zzu();
    }
}
