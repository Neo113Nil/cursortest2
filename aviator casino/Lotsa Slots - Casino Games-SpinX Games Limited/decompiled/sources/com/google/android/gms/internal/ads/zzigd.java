package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigd extends com.google.android.gms.internal.ads.zzict {
    final com.google.android.gms.internal.ads.zzigf zza;
    com.google.android.gms.internal.ads.zzicv zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzigg zzc;

    zzigd(com.google.android.gms.internal.ads.zzigg zziggVar) {
        java.util.Objects.requireNonNull(zziggVar);
        this.zzc = zziggVar;
        this.zza = new com.google.android.gms.internal.ads.zzigf(zziggVar, null);
        this.zzb = zzb();
    }

    private final com.google.android.gms.internal.ads.zzicv zzb() {
        com.google.android.gms.internal.ads.zzigf zzigfVar = this.zza;
        if (zzigfVar.hasNext()) {
            return zzigfVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzicv
    public final byte zza() {
        com.google.android.gms.internal.ads.zzicv zzicvVar = this.zzb;
        if (zzicvVar == null) {
            throw new java.util.NoSuchElementException();
        }
        byte zza = zzicvVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
