package com.google.android.gms.internal.p002firebaseauthapi;

import p003a.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaap implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ zzafp zzb;
    private final /* synthetic */ zzade zzc;

    public zzaap(zzzk zzzkVar, zzafp zzafpVar, zzade zzadeVar) {
        this.zzb = zzafpVar;
        this.zzc = zzadeVar;
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        this.zzb.zza(zzaglVar.zzc());
        this.zza.zza.zza(this.zzb, new zzaao(this, this.zzc));
    }
}
