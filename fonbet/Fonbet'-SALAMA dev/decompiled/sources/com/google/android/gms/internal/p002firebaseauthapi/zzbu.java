package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzbu {
    private final zzch zza;

    private zzbu(zzch zzchVar) {
        this.zza = zzchVar;
    }

    public static zzbu zza(zzch zzchVar) {
        return new zzbu(zzchVar);
    }

    private final zzvu zzb() {
        try {
            zzch zzchVar = this.zza;
            return zzchVar instanceof zzne ? ((zzne) zzchVar).zzb().zza() : ((zzpf) zzof.zza().zza((zzof) this.zza, zzpf.class)).zza();
        } catch (GeneralSecurityException e7) {
            throw new zzpp("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(this.zza)), e7);
        }
    }

    public final zzch zza() {
        zzch zzchVar = this.zza;
        return zzchVar != null ? zzchVar : zzcp.zza(zzb().zzk());
    }
}
