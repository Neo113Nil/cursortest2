package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class zzaau implements zzael<zzagb> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzagl zzc;

    public zzaau(zzaav zzaavVar, zzael zzaelVar, zzade zzadeVar, zzagl zzaglVar) {
        this.zza = zzaelVar;
        this.zzb = zzadeVar;
        this.zzc = zzaglVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        List<zzage> zza = zzagbVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzb.zza(this.zzc, zza.get(0));
        }
    }
}
