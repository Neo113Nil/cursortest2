package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvc extends com.google.android.libraries.places.internal.zzbit {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvl zza;

    zzbvc(com.google.android.libraries.places.internal.zzbvl zzbvlVar) {
        java.util.Objects.requireNonNull(zzbvlVar);
        this.zza = zzbvlVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final com.google.android.libraries.places.internal.zzbix zza(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza.zza;
        com.google.android.libraries.places.internal.zzbpk zzbpkVar = new com.google.android.libraries.places.internal.zzbpk(zzbmlVar, zzbvrVar.zzp(zzbisVar), zzbisVar, zzbvrVar.zzai(), zzbvrVar.zzS() ? null : zzbvrVar.zzv().zzb(), zzbvrVar.zzU(), null);
        zzbpkVar.zzf(zzbvrVar.zzz());
        return zzbpkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbit
    public final java.lang.String zzb() {
        return this.zza.zzg();
    }
}
