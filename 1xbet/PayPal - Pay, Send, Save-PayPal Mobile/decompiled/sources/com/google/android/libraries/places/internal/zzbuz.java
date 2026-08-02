package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuz extends com.google.android.libraries.places.internal.zzblg {
    com.google.android.libraries.places.internal.zzboq zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zzb;

    /* synthetic */ zzbuz(com.google.android.libraries.places.internal.zzbvr zzbvrVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zzb = zzbvrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final /* synthetic */ com.google.android.libraries.places.internal.zzblm zza(com.google.android.libraries.places.internal.zzbld zzbldVar) {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zzb;
        zzbvrVar.zze.zzc();
        com.google.common.base.Preconditions.checkState(!zzbvrVar.zzQ(), "Channel is being terminated");
        return new com.google.android.libraries.places.internal.zzbvp(zzbvrVar, zzbldVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final void zzb(com.google.android.libraries.places.internal.zzbjn zzbjnVar, com.google.android.libraries.places.internal.zzbln zzblnVar) {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zzb;
        zzbvrVar.zze.zzc();
        com.google.common.base.Preconditions.checkNotNull(zzbjnVar, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY);
        com.google.common.base.Preconditions.checkNotNull(zzblnVar, "newPicker");
        if (this != zzbvrVar.zzF() || zzbvrVar.zzG()) {
            return;
        }
        zzbvrVar.zzo(zzblnVar);
        if (zzbjnVar != com.google.android.libraries.places.internal.zzbjn.SHUTDOWN) {
            zzbvrVar.zzW().zzb(2, "Entering {0} state with picker: {1}", zzbjnVar, zzblnVar);
            zzbvrVar.zzB().zza(zzbjnVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final void zzc() {
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzb.zze;
        zzbnxVar.zzc();
        zzbnxVar.zzb(new com.google.android.libraries.places.internal.zzbuy(this));
        zzbnxVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final java.util.concurrent.ScheduledExecutorService zze() {
        return this.zzb.zzw();
    }

    @Override // com.google.android.libraries.places.internal.zzblg
    public final com.google.android.libraries.places.internal.zzbnx zzd() {
        return this.zzb.zze;
    }
}
