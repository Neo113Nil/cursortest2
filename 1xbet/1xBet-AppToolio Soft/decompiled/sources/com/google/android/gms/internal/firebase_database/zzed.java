package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzed {
    private final Map<zzhe, zzhi> zzko = new HashMap();
    private final zzfv zzkp;

    public zzed(zzfv zzfvVar) {
        this.zzkp = zzfvVar;
    }

    private final List<zzgx> zza(zzhi zzhiVar, zzfl zzflVar, zzfg zzfgVar, zzja zzjaVar) {
        zzhj zzb = zzhiVar.zzb(zzflVar, zzfgVar, zzjaVar);
        if (!zzhiVar.zzeo().zzek()) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (zzgw zzgwVar : zzb.zzpy) {
                zzgz zzdt = zzgwVar.zzdt();
                if (zzdt == zzgz.CHILD_ADDED) {
                    hashSet2.add(zzgwVar.zzds());
                } else if (zzdt == zzgz.CHILD_REMOVED) {
                    hashSet.add(zzgwVar.zzds());
                }
            }
            if (!hashSet2.isEmpty() || !hashSet.isEmpty()) {
                this.zzkp.zza(zzhiVar.zzeo(), hashSet2, hashSet);
            }
        }
        return zzb.zzpx;
    }

    public final boolean isEmpty() {
        return this.zzko.isEmpty();
    }

    public final zzkn<List<zzhh>, List<zzgy>> zza(zzhh zzhhVar, zzce zzceVar, DatabaseError databaseError) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean zzci = zzci();
        if (zzhhVar.isDefault()) {
            Iterator<Map.Entry<zzhe, zzhi>> it = this.zzko.entrySet().iterator();
            while (it.hasNext()) {
                zzhi value = it.next().getValue();
                arrayList2.addAll(value.zza(zzceVar, databaseError));
                if (value.isEmpty()) {
                    it.remove();
                    if (!value.zzeo().zzek()) {
                        arrayList.add(value.zzeo());
                    }
                }
            }
        } else {
            zzhi zzhiVar = this.zzko.get(zzhhVar.zzen());
            if (zzhiVar != null) {
                arrayList2.addAll(zzhiVar.zza(zzceVar, databaseError));
                if (zzhiVar.isEmpty()) {
                    this.zzko.remove(zzhhVar.zzen());
                    if (!zzhiVar.zzeo().zzek()) {
                        arrayList.add(zzhiVar.zzeo());
                    }
                }
            }
        }
        if (zzci && !zzci()) {
            arrayList.add(zzhh.zzal(zzhhVar.zzg()));
        }
        return new zzkn<>(arrayList, arrayList2);
    }

    public final List<zzgx> zza(zzce zzceVar, zzfg zzfgVar, zzgu zzguVar) {
        boolean z;
        zzhh zzbe = zzceVar.zzbe();
        zzhi zzhiVar = this.zzko.get(zzbe.zzen());
        if (zzhiVar == null) {
            zzja zzc = zzfgVar.zzc(zzguVar.zzdo() ? zzguVar.zzd() : null);
            if (zzc != null) {
                z = true;
            } else {
                zzc = zzfgVar.zzd(zzguVar.zzd());
                z = false;
            }
            zzhiVar = new zzhi(zzbe, new zzhk(new zzgu(zzit.zza(zzc, zzbe.zzeg()), z, false), zzguVar));
            if (!zzbe.zzek()) {
                HashSet hashSet = new HashSet();
                Iterator<zziz> it = zzhiVar.zzeq().iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().zzge());
                }
                this.zzkp.zza(zzbe, hashSet);
            }
            this.zzko.put(zzbe.zzen(), zzhiVar);
        }
        zzhiVar.zzb(zzceVar);
        return zzhiVar.zzk(zzceVar);
    }

    public final List<zzgx> zza(zzfl zzflVar, zzfg zzfgVar, zzja zzjaVar) {
        zzhe zzdc = zzflVar.zzcy().zzdc();
        if (zzdc != null) {
            return zza(this.zzko.get(zzdc), zzflVar, zzfgVar, zzjaVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<zzhe, zzhi>> it = this.zzko.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(zza(it.next().getValue(), zzflVar, zzfgVar, zzjaVar));
        }
        return arrayList;
    }

    public final zzhi zzb(zzhh zzhhVar) {
        return zzhhVar.zzek() ? zzcj() : this.zzko.get(zzhhVar.zzen());
    }

    public final boolean zzc(zzhh zzhhVar) {
        return zzb(zzhhVar) != null;
    }

    public final List<zzhi> zzch() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<zzhe, zzhi>> it = this.zzko.entrySet().iterator();
        while (it.hasNext()) {
            zzhi value = it.next().getValue();
            if (!value.zzeo().zzek()) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    public final boolean zzci() {
        return zzcj() != null;
    }

    public final zzhi zzcj() {
        Iterator<Map.Entry<zzhe, zzhi>> it = this.zzko.entrySet().iterator();
        while (it.hasNext()) {
            zzhi value = it.next().getValue();
            if (value.zzeo().zzek()) {
                return value;
            }
        }
        return null;
    }

    public final zzja zzr(zzch zzchVar) {
        for (zzhi zzhiVar : this.zzko.values()) {
            if (zzhiVar.zzr(zzchVar) != null) {
                return zzhiVar.zzr(zzchVar);
            }
        }
        return null;
    }
}
