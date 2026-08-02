package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zznd<P> extends zzna<P> implements zzcj<P> {
    public zznd(String str, Class<P> cls, zzalp<? extends zzalc> zzalpVar) {
        super(str, cls, zzvq.zzb.ASYMMETRIC_PRIVATE, zzalpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcj
    public final zzvq zzc(zzaip zzaipVar) {
        Object zza = zzof.zza().zza((zzof) zzpc.zza(this.zza, zzaipVar, this.zzb, zzws.RAW, null), zzbq.zza());
        if (!(zza instanceof zzck)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzpc zzpcVar = (zzpc) zzof.zza().zza(((zzck) zza).zzb(), zzpc.class, zzbq.zza());
        return (zzvq) ((zzajy) zzvq.zza().zza(zzpcVar.zzf()).zza(zzpcVar.zzd()).zza(zzpcVar.zza()).zze());
    }
}
