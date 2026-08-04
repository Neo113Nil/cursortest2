package com.google.android.gms.internal.p002firebaseauthapi;

import p003a.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaaa implements zzael<zzagl> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzade zze;
    private final /* synthetic */ zzzk zzf;

    public zzaaa(zzzk zzzkVar, String str, String str2, String str3, String str4, zzade zzadeVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzadeVar;
        this.zzf = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zze.zza(a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzzk.zza(this.zzf, this.zze, new zzahg(this.zza, this.zzb, null, this.zzc, this.zzd, zzaglVar.zzc()), this);
    }
}
