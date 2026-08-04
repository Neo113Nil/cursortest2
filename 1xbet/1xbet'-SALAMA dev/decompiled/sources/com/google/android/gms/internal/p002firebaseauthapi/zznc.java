package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zznc extends zzbp {
    private final zzpc zza;

    public zznc(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        zza(zzpcVar, zzcnVar);
        this.zza = zzpcVar;
    }

    public final zzpc zza(zzcn zzcnVar) throws GeneralSecurityException {
        zza(this.zza, zzcnVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zza.zze();
    }

    private static void zza(zzpc zzpcVar, zzcn zzcnVar) throws GeneralSecurityException {
        int i7 = zznf.zza[zzpcVar.zza().ordinal()];
        if (i7 == 1 || i7 == 2) {
            zzcn.zza(zzcnVar);
        }
    }
}
