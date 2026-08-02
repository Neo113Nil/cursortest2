package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtq extends com.google.android.libraries.places.internal.zzbsm {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpn zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbtr zzb;

    zzbtq(com.google.android.libraries.places.internal.zzbtr zzbtrVar, com.google.android.libraries.places.internal.zzbpn zzbpnVar) {
        this.zza = zzbpnVar;
        java.util.Objects.requireNonNull(zzbtrVar);
        this.zzb = zzbtrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbsm, com.google.android.libraries.places.internal.zzbpn
    public final void zzc(com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbpm zzbpmVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zzb.zzb.zzg().zzb(zzbnpVar.zzj());
        this.zza.zzc(zzbnpVar, zzbpmVar, zzbmgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbsm
    protected final com.google.android.libraries.places.internal.zzbpn zze() {
        return this.zza;
    }
}
