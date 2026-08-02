package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import w1.L;

/* loaded from: classes.dex */
public final class zzggr {
    private zzggt zza;
    private String zzb;
    private zzggs zzc;
    private zzgdx zzd;

    private zzggr() {
        throw null;
    }

    public final zzggr zza(zzgdx zzgdxVar) {
        this.zzd = zzgdxVar;
        return this;
    }

    public final zzggr zzb(zzggs zzggsVar) {
        this.zzc = zzggsVar;
        return this;
    }

    public final zzggr zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzggr zzd(zzggt zzggtVar) {
        this.zza = zzggtVar;
        return this;
    }

    public final zzggv zze() {
        if (this.zza == null) {
            this.zza = zzggt.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzggs zzggsVar = this.zzc;
        if (zzggsVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgdx zzgdxVar = this.zzd;
        if (zzgdxVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgdxVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzggsVar.equals(zzggs.zza) && (zzgdxVar instanceof zzgfj)) || ((zzggsVar.equals(zzggs.zzc) && (zzgdxVar instanceof zzgga)) || ((zzggsVar.equals(zzggs.zzb) && (zzgdxVar instanceof zzghx)) || ((zzggsVar.equals(zzggs.zzd) && (zzgdxVar instanceof zzgeo)) || ((zzggsVar.equals(zzggs.zze) && (zzgdxVar instanceof zzgey)) || (zzggsVar.equals(zzggs.zzf) && (zzgdxVar instanceof zzgfu))))))) {
            return new zzggv(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new GeneralSecurityException(L.j("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
    }

    public /* synthetic */ zzggr(zzggu zzgguVar) {
    }
}
