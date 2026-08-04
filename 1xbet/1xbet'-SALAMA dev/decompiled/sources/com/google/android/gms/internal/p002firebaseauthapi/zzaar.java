package com.google.android.gms.internal.p002firebaseauthapi;

import p003a.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaar implements zzael<zzafu> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    public zzaar(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(a.y0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzafu zzafuVar) {
        zzafu zzafuVar2 = zzafuVar;
        this.zzb.zza(new zzagl(zzafuVar2.zzb(), zzafuVar2.zza(), Long.valueOf(zzagn.zza(zzafuVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
