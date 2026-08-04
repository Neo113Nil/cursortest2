package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzgnb {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgnb() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgnb zza(zzgkl zzgklVar) throws GeneralSecurityException {
        zzgnc zzgncVar = new zzgnc(zzgklVar.zzd(), zzgklVar.zzc(), null);
        if (this.zzb.containsKey(zzgncVar)) {
            zzgkl zzgklVar2 = (zzgkl) this.zzb.get(zzgncVar);
            if (!zzgklVar2.equals(zzgklVar) || !zzgklVar.equals(zzgklVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgncVar.toString()));
            }
        } else {
            this.zzb.put(zzgncVar, zzgklVar);
        }
        return this;
    }

    public final zzgnb zzb(zzgkp zzgkpVar) throws GeneralSecurityException {
        zzgnd zzgndVar = new zzgnd(zzgkpVar.zzc(), zzgkpVar.zzd(), null);
        if (this.zza.containsKey(zzgndVar)) {
            zzgkp zzgkpVar2 = (zzgkp) this.zza.get(zzgndVar);
            if (!zzgkpVar2.equals(zzgkpVar) || !zzgkpVar.equals(zzgkpVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgndVar.toString()));
            }
        } else {
            this.zza.put(zzgndVar, zzgkpVar);
        }
        return this;
    }

    public final zzgnb zzc(zzglz zzglzVar) throws GeneralSecurityException {
        zzgnc zzgncVar = new zzgnc(zzglzVar.zzd(), zzglzVar.zzc(), null);
        if (this.zzd.containsKey(zzgncVar)) {
            zzglz zzglzVar2 = (zzglz) this.zzd.get(zzgncVar);
            if (!zzglzVar2.equals(zzglzVar) || !zzglzVar.equals(zzglzVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgncVar.toString()));
            }
        } else {
            this.zzd.put(zzgncVar, zzglzVar);
        }
        return this;
    }

    public final zzgnb zzd(zzgmd zzgmdVar) throws GeneralSecurityException {
        zzgnd zzgndVar = new zzgnd(zzgmdVar.zzc(), zzgmdVar.zzd(), null);
        if (this.zzc.containsKey(zzgndVar)) {
            zzgmd zzgmdVar2 = (zzgmd) this.zzc.get(zzgndVar);
            if (!zzgmdVar2.equals(zzgmdVar) || !zzgmdVar.equals(zzgmdVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgndVar.toString()));
            }
        } else {
            this.zzc.put(zzgndVar, zzgmdVar);
        }
        return this;
    }

    public zzgnb(zzgnf zzgnfVar) {
        this.zza = new HashMap(zzgnfVar.zza);
        this.zzb = new HashMap(zzgnfVar.zzb);
        this.zzc = new HashMap(zzgnfVar.zzc);
        this.zzd = new HashMap(zzgnfVar.zzd);
    }
}
