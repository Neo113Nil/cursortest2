package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfq implements java.util.Iterator {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbfs zza;
    private int zzb;
    private boolean zzc;
    private java.util.Iterator zzd;

    /* synthetic */ zzbfq(com.google.android.libraries.places.internal.zzbfs zzbfsVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbfsVar);
        this.zza = zzbfsVar;
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
        int i = this.zzb;
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        if (i + 1 >= zzbfsVar.zzj()) {
            return !zzbfsVar.zzk().isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        return i < zzbfsVar.zzj() ? (com.google.android.libraries.places.internal.zzbfp) zzbfsVar.zzi()[i] : (java.util.Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        zzbfsVar.zzh();
        int i = this.zzb;
        if (i >= zzbfsVar.zzj()) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzbfsVar.zzg(i);
        }
    }
}
