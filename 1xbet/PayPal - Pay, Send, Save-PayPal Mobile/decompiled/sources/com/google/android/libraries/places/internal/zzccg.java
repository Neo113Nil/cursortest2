package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzccg {
    private java.lang.String[] zza;
    private java.lang.String[] zzb;
    private boolean zzc;

    public zzccg(com.google.android.libraries.places.internal.zzcch zzcchVar) {
        boolean z = zzcchVar.zzb;
        this.zza = zzcchVar.zzc();
        this.zzb = zzcchVar.zzd();
        this.zzc = zzcchVar.zzc;
    }

    public final com.google.android.libraries.places.internal.zzccg zza(com.google.android.libraries.places.internal.zzccf... zzccfVarArr) {
        java.lang.String[] strArr = new java.lang.String[zzccfVarArr.length];
        for (int i = 0; i < zzccfVarArr.length; i++) {
            strArr[i] = zzccfVarArr[i].zzbb;
        }
        this.zza = strArr;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzccg zzb(java.lang.String... strArr) {
        this.zza = strArr == null ? null : (java.lang.String[]) strArr.clone();
        return this;
    }

    public final com.google.android.libraries.places.internal.zzccg zzc(com.google.android.libraries.places.internal.zzcct... zzcctVarArr) {
        java.lang.String[] strArr = new java.lang.String[zzcctVarArr.length];
        for (int i = 0; i < zzcctVarArr.length; i++) {
            strArr[i] = zzcctVarArr[i].zzf;
        }
        this.zzb = strArr;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzccg zzd(java.lang.String... strArr) {
        this.zzb = strArr == null ? null : (java.lang.String[]) strArr.clone();
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcch zzf() {
        return new com.google.android.libraries.places.internal.zzcch(this, null);
    }

    final /* synthetic */ boolean zzi() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.String[] zzh() {
        return this.zzb;
    }

    final /* synthetic */ java.lang.String[] zzg() {
        return this.zza;
    }

    public final com.google.android.libraries.places.internal.zzccg zze(boolean z) {
        this.zzc = true;
        return this;
    }

    public zzccg(boolean z) {
    }
}
