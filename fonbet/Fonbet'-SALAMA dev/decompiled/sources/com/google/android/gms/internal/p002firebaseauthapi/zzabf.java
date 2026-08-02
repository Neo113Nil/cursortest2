package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;

/* loaded from: classes.dex */
final class zzabf implements zzael<zzagl> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzzk zzc;

    public zzabf(zzzk zzzkVar, String str, zzade zzadeVar) {
        this.zza = str;
        this.zzb = zzadeVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(AbstractC0603a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        String zzc = zzaglVar2.zzc();
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(zzc).zzf(this.zza);
        zzzk.zza(this.zzc, this.zzb, zzaglVar2, zzahbVar, this);
    }
}
