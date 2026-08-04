package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzggi extends zzgdw {
    private final zzggk zza;
    private final zzgvd zzb;
    private final Integer zzc;

    private zzggi(zzggk zzggkVar, zzgvd zzgvdVar, Integer num) {
        this.zza = zzggkVar;
        this.zzb = zzgvdVar;
        this.zzc = num;
    }

    public static zzggi zzc(zzggk zzggkVar, Integer num) throws GeneralSecurityException {
        zzgvd zzgvdVarZzb;
        if (zzggkVar.zzb() == zzggj.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgvdVarZzb = zzgvd.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzggkVar.zzb() != zzggj.zzb) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(zzggkVar.zzb().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgvdVarZzb = zzgvd.zzb(new byte[0]);
        }
        return new zzggi(zzggkVar, zzgvdVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgdw, com.google.android.gms.internal.ads.zzgcs
    public final /* synthetic */ zzgdf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdw
    public final zzgvd zzb() {
        return this.zzb;
    }

    public final zzggk zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
