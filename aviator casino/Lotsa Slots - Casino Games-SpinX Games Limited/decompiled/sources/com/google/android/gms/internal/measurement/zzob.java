package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzob implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzod zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzob(com.google.android.gms.internal.measurement.zzod zzodVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzodVar);
        this.zza = zzodVar;
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
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        if (i >= zzodVar.zzj()) {
            return !zzodVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        return i < zzodVar.zzj() ? (com.google.android.gms.internal.measurement.zzoa) zzodVar.zzi()[i] : (java.util.Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        zzodVar.zzh();
        int i = this.zzb;
        if (i >= zzodVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzodVar.zzg(i);
        }
    }
}
