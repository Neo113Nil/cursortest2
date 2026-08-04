package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzjj implements zzbl {
    private final zzbl zza;
    private final zzws zzb;
    private final byte[] zzc;

    private zzjj(zzbl zzblVar, zzws zzwsVar, byte[] bArr) {
        this.zza = zzblVar;
        this.zzb = zzwsVar;
        this.zzc = bArr;
    }

    public static zzbl zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzpc zzpcVarZza = zzncVar.zza(zzbq.zza());
        zzvq zzvqVar = (zzvq) ((zzajy) zzvq.zza().zza(zzpcVarZza.zzf()).zza(zzpcVarZza.zzd()).zza(zzpcVarZza.zza()).zze());
        zzpg.zza();
        zzbl zzblVar = (zzbl) zzpg.zza(zzvqVar, zzbl.class);
        zzws zzwsVarZzb = zzpcVarZza.zzb();
        int i7 = zzjm.zza[zzwsVarZzb.ordinal()];
        if (i7 == 1) {
            bArrZzb = zzog.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            bArrZzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException(k.d(zzwsVarZzb.zza(), "unknown output prefix type "));
            }
            bArrZzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzjj(zzblVar, zzwsVarZzb, bArrZzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb == zzws.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpr.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
