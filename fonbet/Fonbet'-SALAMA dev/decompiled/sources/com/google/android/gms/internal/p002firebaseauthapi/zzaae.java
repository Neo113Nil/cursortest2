package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;

/* loaded from: classes.dex */
final class zzaae implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ zzahr zzb;
    private final /* synthetic */ zzade zzc;

    public zzaae(zzzk zzzkVar, zzahr zzahrVar, zzade zzadeVar) {
        this.zzb = zzahrVar;
        this.zzc = zzadeVar;
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(AbstractC0603a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzaej zzaejVar;
        this.zzb.zzb(true);
        this.zzb.zza(zzaglVar.zzc());
        zzaejVar = this.zza.zza;
        zzaejVar.zza(this.zzb, new zzaah(this, this.zzc, this));
    }
}
