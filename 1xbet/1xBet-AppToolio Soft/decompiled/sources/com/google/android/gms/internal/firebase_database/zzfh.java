package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfh implements zzcf {
    private static zzfh zzmj = new zzfh();
    private final HashMap<zzce, List<zzce>> zzmi = new HashMap<>();

    private zzfh() {
    }

    public static zzfh zzcu() {
        return zzmj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_database.zzcf
    public final void zzd(zzce zzceVar) {
        zzce zza;
        List<zzce> list;
        synchronized (this.zzmi) {
            List<zzce> list2 = this.zzmi.get(zzceVar);
            int i = 0;
            if (list2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list2.size()) {
                        break;
                    }
                    if (list2.get(i2) == zzceVar) {
                        list2.remove(i2);
                        break;
                    }
                    i2++;
                }
                if (list2.isEmpty()) {
                    this.zzmi.remove(zzceVar);
                }
            }
            if (!zzceVar.zzbe().isDefault() && (list = this.zzmi.get((zza = zzceVar.zza(zzhh.zzal(zzceVar.zzbe().zzg()))))) != null) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (list.get(i) == zzceVar) {
                        list.remove(i);
                        break;
                    }
                    i++;
                }
                if (list.isEmpty()) {
                    this.zzmi.remove(zza);
                }
            }
        }
    }

    public final void zzi(zzce zzceVar) {
        synchronized (this.zzmi) {
            List<zzce> list = this.zzmi.get(zzceVar);
            if (list == null) {
                list = new ArrayList<>();
                this.zzmi.put(zzceVar, list);
            }
            list.add(zzceVar);
            if (!zzceVar.zzbe().isDefault()) {
                zzce zza = zzceVar.zza(zzhh.zzal(zzceVar.zzbe().zzg()));
                List<zzce> list2 = this.zzmi.get(zza);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.zzmi.put(zza, list2);
                }
                list2.add(zzceVar);
            }
            zzceVar.zze(true);
            zzceVar.zza(this);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void zzj(zzce zzceVar) {
        synchronized (this.zzmi) {
            List<zzce> list = this.zzmi.get(zzceVar);
            if (list != null && !list.isEmpty()) {
                if (zzceVar.zzbe().isDefault()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        zzce zzceVar2 = list.get(size);
                        if (!hashSet.contains(zzceVar2.zzbe())) {
                            hashSet.add(zzceVar2.zzbe());
                            zzceVar2.zzbr();
                        }
                    }
                } else {
                    list.get(0).zzbr();
                }
            }
        }
    }
}
