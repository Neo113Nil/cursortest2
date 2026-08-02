package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcbh extends com.google.android.libraries.places.internal.zzbte {
    final /* synthetic */ com.google.android.libraries.places.internal.zzcbp zza;

    zzcbh(com.google.android.libraries.places.internal.zzcbp zzcbpVar) {
        java.util.Objects.requireNonNull(zzcbpVar);
        this.zza = zzcbpVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbte
    protected final void zzd() {
        this.zza.zzD().zzc(true);
    }

    @Override // com.google.android.libraries.places.internal.zzbte
    protected final void zze() {
        this.zza.zzD().zzc(false);
    }
}
