package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbuw extends com.google.android.libraries.places.internal.zzbte {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zza;

    /* synthetic */ zzbuw(com.google.android.libraries.places.internal.zzbvr zzbvrVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zza = zzbvrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbte
    protected final void zzd() {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbte
    protected final void zze() {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zza;
        if (zzbvrVar.zzN().get()) {
            return;
        }
        zzbvrVar.zzm();
    }
}
