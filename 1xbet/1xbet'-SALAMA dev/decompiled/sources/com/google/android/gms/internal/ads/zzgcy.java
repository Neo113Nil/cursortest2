package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzgcy {
    private final List zza = new ArrayList();
    private final zzgky zzb = zzgky.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgcw) it.next()).zza = false;
        }
    }

    public final zzgcy zza(zzgcw zzgcwVar) {
        if (zzgcwVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgcwVar.zza) {
            zzd();
        }
        zzgcwVar.zzf = this;
        this.zza.add(zzgcwVar);
        return this;
    }

    public final zzgdb zzb() throws GeneralSecurityException {
        int i7;
        int i8;
        char c3 = 1;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List list = this.zza;
        zzgsi zzgsiVarZzc = zzgsm.zzc();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        int i9 = 0;
        int i10 = 0;
        while (i10 < list2.size() - 1) {
            int i11 = i10 + 1;
            if (((zzgcw) list2.get(i10)).zze == zzgcx.zza && ((zzgcw) list2.get(i11)).zze != zzgcx.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i10 = i11;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzgcw zzgcwVar : this.zza) {
            zzgcu unused = zzgcwVar.zzb;
            if (zzgcwVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzgcwVar.zze == zzgcx.zza) {
                i7 = i9;
                while (true) {
                    if (i7 != 0 && !hashSet.contains(Integer.valueOf(i7))) {
                        break;
                    }
                    int i12 = zzgni.zza;
                    i7 = i9;
                    while (i7 == 0) {
                        byte[] bArrZzb = zzgmz.zzb(4);
                        i7 = (bArrZzb[3] & 255) | ((bArrZzb[i9] & 255) << 24) | ((bArrZzb[c3] & 255) << 16) | ((bArrZzb[2] & 255) << 8);
                    }
                }
            } else {
                zzgcx unused2 = zzgcwVar.zze;
                i7 = i9;
            }
            Integer numValueOf = Integer.valueOf(i7);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(AbstractC0486a1.f(i7, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzgcw.zza(zzgcwVar);
            zzgcs zzgcsVarZza = zzglk.zzb().zza(zzgcwVar.zzd, c3 != zzgcwVar.zzd.zza() ? null : numValueOf);
            zzgcz zzgczVar = new zzgcz(zzgcsVarZza, zzgcwVar.zzb, i7, zzgcwVar.zza, null);
            zzgcu zzgcuVar = zzgcwVar.zzb;
            zzgmw zzgmwVar = (zzgmw) zzglu.zzc().zzd(zzgcsVarZza, zzgmw.class, zzgdj.zza());
            Integer numZzf = zzgmwVar.zzf();
            if (numZzf != null && numZzf.intValue() != i7) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            zzgcu zzgcuVar2 = zzgcu.zza;
            if (zzgcuVar2.equals(zzgcuVar)) {
                i8 = 3;
            } else if (zzgcu.zzb.equals(zzgcuVar)) {
                i8 = 4;
            } else {
                if (!zzgcu.zzc.equals(zzgcuVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i8 = 5;
            }
            zzgsj zzgsjVarZzc = zzgsk.zzc();
            zzgrx zzgrxVarZza = zzgsa.zza();
            zzgrxVarZza.zzb(zzgmwVar.zzg());
            zzgrxVarZza.zzc(zzgmwVar.zze());
            zzgrxVarZza.zza(zzgmwVar.zzb());
            zzgsjVarZzc.zza(zzgrxVarZza);
            zzgsjVarZzc.zzd(i8);
            zzgsjVarZzc.zzb(i7);
            zzgsjVarZzc.zzc(zzgmwVar.zzc());
            zzgsiVarZzc.zza((zzgsk) zzgsjVarZzc.zzbr());
            if (zzgcwVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgcwVar.zzb != zzgcuVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgczVar);
            c3 = 1;
            i9 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgsiVarZzc.zzb(num.intValue());
        zzgsm zzgsmVar = (zzgsm) zzgsiVarZzc.zzbr();
        zzgdb.zzh(zzgsmVar);
        return new zzgdb(zzgsmVar, arrayList, this.zzb, null);
    }
}
