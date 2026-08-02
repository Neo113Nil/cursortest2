package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
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

    public final zzgdb zzb() {
        zzgcx zzgcxVar;
        int i7;
        int i8;
        zzgcx zzgcxVar2;
        zzgcx zzgcxVar3;
        char c3 = 1;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List list = this.zza;
        zzgsi zzc = zzgsm.zzc();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        int i9 = 0;
        int i10 = 0;
        while (i10 < list2.size() - 1) {
            int i11 = i10 + 1;
            zzgcx zzgcxVar4 = ((zzgcw) list2.get(i10)).zze;
            zzgcxVar2 = zzgcx.zza;
            if (zzgcxVar4 == zzgcxVar2) {
                zzgcx zzgcxVar5 = ((zzgcw) list2.get(i11)).zze;
                zzgcxVar3 = zzgcx.zza;
                if (zzgcxVar5 != zzgcxVar3) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
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
            zzgcx zzgcxVar6 = zzgcwVar.zze;
            zzgcxVar = zzgcx.zza;
            if (zzgcxVar6 == zzgcxVar) {
                i7 = i9;
                while (true) {
                    if (i7 != 0 && !hashSet.contains(Integer.valueOf(i7))) {
                        break;
                    }
                    int i12 = zzgni.zza;
                    i7 = i9;
                    while (i7 == 0) {
                        byte[] zzb = zzgmz.zzb(4);
                        i7 = (zzb[3] & 255) | ((zzb[i9] & 255) << 24) | ((zzb[c3] & 255) << 16) | ((zzb[2] & 255) << 8);
                    }
                }
            } else {
                zzgcx unused2 = zzgcwVar.zze;
                i7 = i9;
            }
            Integer valueOf = Integer.valueOf(i7);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException(AbstractC0486a1.f(i7, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(valueOf);
            zzgcw.zza(zzgcwVar);
            zzgcs zza = zzglk.zzb().zza(zzgcwVar.zzd, c3 != zzgcwVar.zzd.zza() ? null : valueOf);
            zzgcz zzgczVar = new zzgcz(zza, zzgcwVar.zzb, i7, zzgcwVar.zza, null);
            zzgcu zzgcuVar = zzgcwVar.zzb;
            zzgmw zzgmwVar = (zzgmw) zzglu.zzc().zzd(zza, zzgmw.class, zzgdj.zza());
            Integer zzf = zzgmwVar.zzf();
            if (zzf != null && zzf.intValue() != i7) {
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
            zzgsj zzc2 = zzgsk.zzc();
            zzgrx zza2 = zzgsa.zza();
            zza2.zzb(zzgmwVar.zzg());
            zza2.zzc(zzgmwVar.zze());
            zza2.zza(zzgmwVar.zzb());
            zzc2.zza(zza2);
            zzc2.zzd(i8);
            zzc2.zzb(i7);
            zzc2.zzc(zzgmwVar.zzc());
            zzc.zza((zzgsk) zzc2.zzbr());
            if (zzgcwVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgcwVar.zzb != zzgcuVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzgczVar);
            c3 = 1;
            i9 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzc.zzb(num.intValue());
        zzgsm zzgsmVar = (zzgsm) zzc.zzbr();
        zzgdb.zzh(zzgsmVar);
        return new zzgdb(zzgsmVar, arrayList, this.zzb, null);
    }
}
