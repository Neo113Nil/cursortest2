package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzaq extends zzal {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzal zzc;

    public zzaq(zzal zzalVar, int i7, int i8) {
        this.zzc = zzalVar;
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzy.zza(i7, this.zzb);
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final Object[] zzf() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.List
    /* JADX INFO: renamed from: zza */
    public final zzal subList(int i7, int i8) {
        zzy.zza(i7, i8, this.zzb);
        zzal zzalVar = this.zzc;
        int i9 = this.zza;
        return (zzal) zzalVar.subList(i7 + i9, i8 + i9);
    }
}
