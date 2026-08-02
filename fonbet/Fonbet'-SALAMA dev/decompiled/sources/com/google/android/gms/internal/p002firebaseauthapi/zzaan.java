package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0603a;

/* loaded from: classes.dex */
final class zzaan implements zzael<zzaht> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    public zzaan(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(AbstractC0603a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzaht zzahtVar) {
        zzaht zzahtVar2 = zzahtVar;
        if (!zzahtVar2.zzl()) {
            zzzk.zza(this.zzb, zzahtVar2, this.zza, this);
        } else {
            this.zza.zza(new zzzl(zzahtVar2.zzf(), zzahtVar2.zzk(), zzahtVar2.zzb()));
        }
    }
}
