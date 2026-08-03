package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigl implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.ads.zzign zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzigl(com.google.android.gms.internal.ads.zzign zzignVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzignVar);
        this.zza = zzignVar;
        this.zzb = -1;
    }

    private final java.util.Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        if (i >= zzignVar.zzj()) {
            return !zzignVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        return i < zzignVar.zzj() ? (com.google.android.gms.internal.ads.zzigk) zzignVar.zzi()[i] : (java.util.Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        zzignVar.zzh();
        int i = this.zzb;
        if (i >= zzignVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzignVar.zzg(i);
        }
    }
}
