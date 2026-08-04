package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzglk {
    public static final /* synthetic */ int zza = 0;
    private static final zzglj zzb = new zzglj() { // from class: com.google.android.gms.internal.ads.zzgli
        @Override // com.google.android.gms.internal.ads.zzglj
        public final zzgcs zza(zzgdf zzgdfVar, Integer num) throws GeneralSecurityException {
            int i7 = zzglk.zza;
            zzgse zzgseVarZzc = ((zzgkv) zzgdfVar).zzb().zzc();
            zzgct zzgctVarZzb = zzgkh.zzc().zzb(zzgseVarZzc.zzi());
            if (!zzgkh.zzc().zze(zzgseVarZzc.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzgsa zzgsaVarZza = zzgctVarZzb.zza(zzgseVarZzc.zzh());
            return new zzgku(zzgmw.zza(zzgsaVarZza.zzg(), zzgsaVarZza.zzf(), zzgsaVarZza.zzb(), zzgseVarZzc.zzg(), num), zzgcr.zza());
        }
    };
    private static final zzglk zzc = zze();
    private final Map zzd = new HashMap();

    public static zzglk zzb() {
        return zzc;
    }

    private final synchronized zzgcs zzd(zzgdf zzgdfVar, Integer num) {
        zzglj zzgljVar;
        zzgljVar = (zzglj) this.zzd.get(zzgdfVar.getClass());
        if (zzgljVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzgdfVar.toString() + ": no key creator for this class was registered.");
        }
        return zzgljVar.zza(zzgdfVar, num);
    }

    private static zzglk zze() {
        zzglk zzglkVar = new zzglk();
        try {
            zzglkVar.zzc(zzb, zzgkv.class);
            return zzglkVar;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException("unexpected error.", e7);
        }
    }

    public final zzgcs zza(zzgdf zzgdfVar, Integer num) {
        return zzd(zzgdfVar, num);
    }

    public final synchronized void zzc(zzglj zzgljVar, Class cls) {
        try {
            zzglj zzgljVar2 = (zzglj) this.zzd.get(cls);
            if (zzgljVar2 != null && !zzgljVar2.equals(zzgljVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.zzd.put(cls, zzgljVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
