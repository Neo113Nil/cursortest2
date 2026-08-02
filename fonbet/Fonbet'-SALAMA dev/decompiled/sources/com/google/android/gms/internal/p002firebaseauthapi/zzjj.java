package com.google.android.gms.internal.p002firebaseauthapi;

import e1.k;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjj implements zzbl {
    private final zzbl zza;
    private final zzws zzb;
    private final byte[] zzc;

    private zzjj(zzbl zzblVar, zzws zzwsVar, byte[] bArr) {
        this.zza = zzblVar;
        this.zzb = zzwsVar;
        this.zzc = bArr;
    }

    public static zzbl zza(zznc zzncVar) {
        byte[] zzb;
        zzpc zza = zzncVar.zza(zzbq.zza());
        zzvq zzvqVar = (zzvq) ((zzajy) zzvq.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze());
        zzpg.zza();
        zzbl zzblVar = (zzbl) zzpg.zza(zzvqVar, zzbl.class);
        zzws zzb2 = zza.zzb();
        int i7 = zzjm.zza[zzb2.ordinal()];
        if (i7 == 1) {
            zzb = zzog.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException(k.d(zzb2.zza(), "unknown output prefix type "));
            }
            zzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzjj(zzblVar, zzb2, zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (this.zzb == zzws.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpr.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
