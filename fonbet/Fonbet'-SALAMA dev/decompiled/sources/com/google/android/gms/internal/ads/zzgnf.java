package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgnf {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgnf(zzgnb zzgnbVar, zzgne zzgneVar) {
        this.zza = new HashMap(zzgnbVar.zza);
        this.zzb = new HashMap(zzgnbVar.zzb);
        this.zzc = new HashMap(zzgnbVar.zzc);
        this.zzd = new HashMap(zzgnbVar.zzd);
    }

    public final zzgcs zza(zzgna zzgnaVar, zzgdj zzgdjVar) {
        zzgnc zzgncVar = new zzgnc(zzgnaVar.getClass(), zzgnaVar.zzd(), null);
        if (this.zzb.containsKey(zzgncVar)) {
            return ((zzgkl) this.zzb.get(zzgncVar)).zza(zzgnaVar, zzgdjVar);
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No Key Parser for requested key type ", zzgncVar.toString(), " available"));
    }

    public final zzgdf zzb(zzgna zzgnaVar) {
        zzgnc zzgncVar = new zzgnc(zzgnaVar.getClass(), zzgnaVar.zzd(), null);
        if (this.zzd.containsKey(zzgncVar)) {
            return ((zzglz) this.zzd.get(zzgncVar)).zza(zzgnaVar);
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No Parameters Parser for requested key type ", zzgncVar.toString(), " available"));
    }

    public final zzgna zzc(zzgcs zzgcsVar, Class cls, zzgdj zzgdjVar) {
        zzgnd zzgndVar = new zzgnd(zzgcsVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgndVar)) {
            return ((zzgkp) this.zza.get(zzgndVar)).zza(zzgcsVar, zzgdjVar);
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No Key serializer for ", zzgndVar.toString(), " available"));
    }

    public final zzgna zzd(zzgdf zzgdfVar, Class cls) {
        zzgnd zzgndVar = new zzgnd(zzgdfVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzgndVar)) {
            return ((zzgmd) this.zzc.get(zzgndVar)).zza(zzgdfVar);
        }
        throw new GeneralSecurityException(AbstractC0486a1.h("No Key Format serializer for ", zzgndVar.toString(), " available"));
    }

    public final boolean zzi(zzgna zzgnaVar) {
        return this.zzb.containsKey(new zzgnc(zzgnaVar.getClass(), zzgnaVar.zzd(), null));
    }

    public final boolean zzj(zzgna zzgnaVar) {
        return this.zzd.containsKey(new zzgnc(zzgnaVar.getClass(), zzgnaVar.zzd(), null));
    }
}
