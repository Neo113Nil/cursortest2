package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzgr implements java.util.Iterator {
    final /* synthetic */ com.google.android.gms.internal.auth.zzgv zza;
    private int zzb = -1;
    private boolean zzc;
    private java.util.Iterator zzd;

    private final java.util.Iterator zza() {
        java.util.Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.List list;
        java.util.Map map;
        int i = this.zzb + 1;
        list = this.zza.zzb;
        if (i < list.size()) {
            return true;
        }
        map = this.zza.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.List list;
        java.util.List list2;
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        list = this.zza.zzb;
        if (i >= list.size()) {
            return (java.util.Map.Entry) zza().next();
        }
        list2 = this.zza.zzb;
        return (java.util.Map.Entry) list2.get(this.zzb);
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.List list;
        if (!this.zzc) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        int i = this.zzb;
        list = this.zza.zzb;
        if (i >= list.size()) {
            zza().remove();
            return;
        }
        com.google.android.gms.internal.auth.zzgv zzgvVar = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 - 1;
        zzgvVar.zzl(i2);
    }

    /* synthetic */ zzgr(com.google.android.gms.internal.auth.zzgv zzgvVar, com.google.android.gms.internal.auth.zzgq zzgqVar) {
        this.zza = zzgvVar;
    }
}
