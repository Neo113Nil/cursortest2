package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuu implements com.google.android.libraries.places.internal.zzbwc {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;

    /* synthetic */ zzbuu(com.google.android.libraries.places.internal.zzbvr zzbvrVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final com.google.android.libraries.places.internal.zzbio zza(com.google.android.libraries.places.internal.zzbio zzbioVar) {
        return zzbioVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zzb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zzc(boolean z) {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        zzbvrVar.zzf.zza(zzbvrVar.zzL(), z);
        if (z) {
            zzbvrVar.zze();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zzd(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkState(this.zza.zzN().get(), "Channel must have been shut down");
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final void zze() {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        com.google.common.base.Preconditions.checkState(zzbvrVar.zzN().get(), "Channel must have been shut down");
        zzbvrVar.zzR(true);
        zzbvrVar.zzj(false);
        zzbvrVar.zzi();
        zzbvrVar.zzq();
    }
}
