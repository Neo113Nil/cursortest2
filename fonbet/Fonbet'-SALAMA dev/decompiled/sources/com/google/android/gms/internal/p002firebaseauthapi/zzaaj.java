package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;

/* loaded from: classes.dex */
final class zzaaj implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzade zzc;

    public zzaaj(zzzk zzzkVar, String str, zzade zzadeVar) {
        this.zzb = str;
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
        zzagl zzaglVar2 = zzaglVar;
        zzagc zzagcVar = new zzagc(zzaglVar2.zzc());
        zzaejVar = this.zza.zza;
        zzaejVar.zza(zzagcVar, new zzaai(this, this, zzaglVar2, this.zzb, this.zzc));
    }
}
