package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class zzgdb {
    private final zzgsm zza;
    private final List zzb;
    private final zzgky zzc;

    public /* synthetic */ zzgdb(zzgsm zzgsmVar, List list, zzgky zzgkyVar, zzgda zzgdaVar) {
        this.zza = zzgsmVar;
        this.zzb = list;
        this.zzc = zzgkyVar;
    }

    public static final zzgdb zza(zzgsm zzgsmVar) throws GeneralSecurityException {
        zzh(zzgsmVar);
        return new zzgdb(zzgsmVar, zzg(zzgsmVar));
    }

    public static final zzgdb zzb(zzgdf zzgdfVar) {
        zzgcy zzgcyVar = new zzgcy();
        zzgcw zzgcwVar = new zzgcw(zzgdfVar, null);
        zzgcwVar.zzd();
        zzgcwVar.zzc();
        zzgcyVar.zza(zzgcwVar);
        return zzgcyVar.zzb();
    }

    private final Object zzf(zzgkg zzgkgVar, Class cls, Class cls2) throws GeneralSecurityException {
        int i7 = zzgdm.zza;
        zzgsm zzgsmVar = this.zza;
        int iZzb = zzgsmVar.zzb();
        int i8 = 0;
        boolean z4 = false;
        boolean z7 = true;
        for (zzgsk zzgskVar : zzgsmVar.zzh()) {
            if (zzgskVar.zzk() == 3) {
                if (!zzgskVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgskVar.zza())));
                }
                if (zzgskVar.zzf() == zzgte.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgskVar.zza())));
                }
                if (zzgskVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgskVar.zza())));
                }
                if (zzgskVar.zza() == iZzb) {
                    if (z4) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z4 = true;
                }
                z7 &= zzgskVar.zzb().zzb() == zzgry.ASYMMETRIC_PUBLIC;
                i8++;
            }
        }
        if (i8 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z4 && !z7) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgmr zzgmrVarZzb = zzgmu.zzb(cls2);
        zzgmrVarZzb.zzc(this.zzc);
        for (int i9 = 0; i9 < this.zzb.size(); i9++) {
            zzgsk zzgskVarZzd = this.zza.zzd(i9);
            if (zzgskVarZzd.zzk() == 3) {
                zzgcz zzgczVar = (zzgcz) this.zzb.get(i9);
                if (zzgczVar == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i9 + " and type_url " + zzgskVarZzd.zzb().zzg() + " failed, unable to get primitive");
                }
                zzgcs zzgcsVarZza = zzgczVar.zza();
                try {
                    Object objZzb = zzgkgVar.zzb(zzgcsVarZza, cls2);
                    if (zzgskVarZzd.zza() == this.zza.zzb()) {
                        zzgmrVarZzb.zzb(objZzb, zzgcsVarZza, zzgskVarZzd);
                    } else {
                        zzgmrVarZzb.zza(objZzb, zzgcsVarZza, zzgskVarZzd);
                    }
                } catch (GeneralSecurityException e7) {
                    throw new GeneralSecurityException(L.j("Unable to get primitive ", cls2.toString(), " for key of type ", zzgskVarZzd.zzb().zzg(), ", see https://developers.google.com/tink/faq/registration_errors"), e7);
                }
            }
        }
        return zzgkgVar.zzc(zzgmrVarZzb.zzd(), cls);
    }

    private static List zzg(zzgsm zzgsmVar) {
        zzgcu zzgcuVar;
        ArrayList arrayList = new ArrayList(zzgsmVar.zza());
        for (zzgsk zzgskVar : zzgsmVar.zzh()) {
            int iZza = zzgskVar.zza();
            try {
                zzgmw zzgmwVarZza = zzgmw.zza(zzgskVar.zzb().zzg(), zzgskVar.zzb().zzf(), zzgskVar.zzb().zzb(), zzgskVar.zzf(), zzgskVar.zzf() == zzgte.RAW ? null : Integer.valueOf(zzgskVar.zza()));
                zzglu zzgluVarZzc = zzglu.zzc();
                zzgdj zzgdjVarZza = zzgdj.zza();
                zzgcs zzgkuVar = !zzgluVarZzc.zzj(zzgmwVarZza) ? new zzgku(zzgmwVarZza, zzgdjVarZza) : zzgluVarZzc.zza(zzgmwVarZza, zzgdjVarZza);
                int iZzk = zzgskVar.zzk() - 2;
                if (iZzk == 1) {
                    zzgcuVar = zzgcu.zza;
                } else if (iZzk == 2) {
                    zzgcuVar = zzgcu.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzgcuVar = zzgcu.zzc;
                }
                arrayList.add(new zzgcz(zzgkuVar, zzgcuVar, iZza, iZza == zzgsmVar.zzb(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzh(zzgsm zzgsmVar) throws GeneralSecurityException {
        if (zzgsmVar == null || zzgsmVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i7 = zzgdm.zza;
        zzgsn zzgsnVarZza = zzgsr.zza();
        zzgsm zzgsmVar = this.zza;
        zzgsnVarZza.zzb(zzgsmVar.zzb());
        for (zzgsk zzgskVar : zzgsmVar.zzh()) {
            zzgso zzgsoVarZza = zzgsp.zza();
            zzgsoVarZza.zzc(zzgskVar.zzb().zzg());
            zzgsoVarZza.zzd(zzgskVar.zzk());
            zzgsoVarZza.zzb(zzgskVar.zzf());
            zzgsoVarZza.zza(zzgskVar.zza());
            zzgsnVarZza.zza((zzgsp) zzgsoVarZza.zzbr());
        }
        return ((zzgsr) zzgsnVarZza.zzbr()).toString();
    }

    public final zzgsm zzc() {
        return this.zza;
    }

    public final Object zzd(zzgcm zzgcmVar, Class cls) throws GeneralSecurityException {
        if (!(zzgcmVar instanceof zzgkg)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzgkg zzgkgVar = (zzgkg) zzgcmVar;
        return zzf(zzgkgVar, cls, zzgkgVar.zza(cls));
    }

    private zzgdb(zzgsm zzgsmVar, List list) {
        this.zza = zzgsmVar;
        this.zzb = list;
        this.zzc = zzgky.zza;
    }
}
