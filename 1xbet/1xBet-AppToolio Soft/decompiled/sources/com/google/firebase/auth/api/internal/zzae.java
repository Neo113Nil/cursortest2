package com.google.firebase.auth.api.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* loaded from: classes.dex */
final class zzae implements zzdk<com.google.android.gms.internal.firebase_auth.zzao> {
    private final /* synthetic */ zzcb zzfl;
    private final /* synthetic */ zza zzfm;
    private final /* synthetic */ String zzfy;

    zzae(zza zzaVar, String str, zzcb zzcbVar) {
        this.zzfm = zzaVar;
        this.zzfy = str;
        this.zzfl = zzcbVar;
    }

    @Override // com.google.firebase.auth.api.internal.zzdk
    public final /* synthetic */ void onSuccess(@NonNull com.google.android.gms.internal.firebase_auth.zzao zzaoVar) {
        com.google.android.gms.internal.firebase_auth.zzao zzaoVar2 = zzaoVar;
        String zzaw = zzaoVar2.zzaw();
        com.google.android.gms.internal.firebase_auth.zzaz zzazVar = new com.google.android.gms.internal.firebase_auth.zzaz();
        zzazVar.zzv(zzaw).zzx(this.zzfy);
        this.zzfm.zza(this.zzfl, zzaoVar2, zzazVar, this);
    }

    @Override // com.google.firebase.auth.api.internal.zzdj
    public final void zzc(@Nullable String str) {
        this.zzfl.onFailure(com.google.firebase.auth.internal.zzq.zzaf(str));
    }
}
