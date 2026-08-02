package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvq {
    final java.lang.Object zza;
    java.util.Collection zzb;
    com.google.android.libraries.places.internal.zzbnp zzc;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zzd;

    /* synthetic */ zzbvq(com.google.android.libraries.places.internal.zzbvr zzbvrVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zzd = zzbvrVar;
        this.zza = new java.lang.Object();
        this.zzb = new java.util.HashSet();
    }

    final void zza(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        synchronized (this.zza) {
            if (this.zzc != null) {
                return;
            }
            this.zzc = zzbnpVar;
            boolean isEmpty = this.zzb.isEmpty();
            if (isEmpty) {
                this.zzd.zzL().zzd(zzbnpVar);
            }
        }
    }
}
