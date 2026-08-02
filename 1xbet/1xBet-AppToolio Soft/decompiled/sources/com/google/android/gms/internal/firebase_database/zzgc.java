package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzgc {
    private static final zzgn<Map<zzhe, zzgb>> zznt = new zzgd();
    private static final zzgn<Map<zzhe, zzgb>> zznu = new zzge();
    private static final zzgn<zzgb> zznv = new zzgf();
    private static final zzgn<zzgb> zznw = new zzgg();
    private final zzhz zzbs;
    private final zzfw zzne;
    private zzgj<Map<zzhe, zzgb>> zznx = new zzgj<>(null);
    private final zzkf zzny;
    private long zznz;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public zzgc(zzfw zzfwVar, zzhz zzhzVar, zzkf zzkfVar) {
        this.zznz = 0L;
        this.zzne = zzfwVar;
        this.zzbs = zzhzVar;
        this.zzny = zzkfVar;
        try {
            this.zzne.beginTransaction();
            this.zzne.zzc(this.zzny.millis());
            this.zzne.setTransactionSuccessful();
            this.zzne.endTransaction();
            for (zzgb zzgbVar : this.zzne.zzl()) {
                this.zznz = Math.max(zzgbVar.id + 1, this.zznz);
                zzb(zzgbVar);
            }
        } catch (Throwable th) {
            this.zzne.endTransaction();
            throw th;
        }
    }

    private final List<zzgb> zza(zzgn<zzgb> zzgnVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<zzch, Map<zzhe, zzgb>>> it = this.zznx.iterator();
        while (it.hasNext()) {
            for (zzgb zzgbVar : it.next().getValue().values()) {
                if (zzgnVar.zzd(zzgbVar)) {
                    arrayList.add(zzgbVar);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzgb zzgbVar) {
        zzb(zzgbVar);
        this.zzne.zza(zzgbVar);
    }

    private final boolean zzad(zzch zzchVar) {
        return this.zznx.zza(zzchVar, zznt) != null;
    }

    private final void zzb(zzgb zzgbVar) {
        zzhh zzhhVar = zzgbVar.zznp;
        zzkq.zza(!zzhhVar.zzek() || zzhhVar.isDefault(), "Can't have tracked non-default query that loads all data");
        Map<zzhe, zzgb> zzai = this.zznx.zzai(zzgbVar.zznp.zzg());
        if (zzai == null) {
            zzai = new HashMap<>();
            this.zznx = this.zznx.zzb(zzgbVar.zznp.zzg(), (zzch) zzai);
        }
        zzgb zzgbVar2 = zzai.get(zzgbVar.zznp.zzen());
        zzkq.zzf(zzgbVar2 == null || zzgbVar2.id == zzgbVar.id);
        zzai.put(zzgbVar.zznp.zzen(), zzgbVar);
    }

    private final void zzb(zzhh zzhhVar, boolean z) {
        zzgb zzgbVar;
        zzhh zzj = zzj(zzhhVar);
        zzgb zzk = zzk(zzj);
        long millis = this.zzny.millis();
        if (zzk != null) {
            zzgb zzgbVar2 = new zzgb(zzk.id, zzk.zznp, millis, zzk.zznr, zzk.zzns);
            zzgbVar = new zzgb(zzgbVar2.id, zzgbVar2.zznp, zzgbVar2.zznq, zzgbVar2.zznr, z);
        } else {
            long j = this.zznz;
            this.zznz = 1 + j;
            zzgbVar = new zzgb(j, zzj, millis, false, z);
        }
        zza(zzgbVar);
    }

    private static zzhh zzj(zzhh zzhhVar) {
        return zzhhVar.zzek() ? zzhh.zzal(zzhhVar.zzg()) : zzhhVar;
    }

    public final zzfx zza(zzfq zzfqVar) {
        List<zzgb> zza = zza(zznv);
        long size = zza.size() - Math.min((long) Math.floor(r1 * (1.0f - zzfqVar.zzde())), zzfqVar.zzdf());
        zzfx zzfxVar = new zzfx();
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar = this.zzbs;
            int size2 = zza.size();
            StringBuilder sb = new StringBuilder(80);
            sb.append("Pruning old queries.  Prunable: ");
            sb.append(size2);
            sb.append(" Count to prune: ");
            sb.append(size);
            zzhzVar.zza(sb.toString(), null, new Object[0]);
        }
        Collections.sort(zza, new zzgi(this));
        zzfx zzfxVar2 = zzfxVar;
        for (int i = 0; i < size; i++) {
            zzgb zzgbVar = zza.get(i);
            zzfxVar2 = zzfxVar2.zzx(zzgbVar.zznp.zzg());
            zzhh zzj = zzj(zzgbVar.zznp);
            this.zzne.zzb(zzk(zzj).id);
            Map<zzhe, zzgb> zzai = this.zznx.zzai(zzj.zzg());
            zzai.remove(zzj.zzen());
            if (zzai.isEmpty()) {
                this.zznx = this.zznx.zzah(zzj.zzg());
            }
        }
        for (int i2 = (int) size; i2 < zza.size(); i2++) {
            zzfxVar2 = zzfxVar2.zzy(zza.get(i2).zznp.zzg());
        }
        List<zzgb> zza2 = zza(zznw);
        if (this.zzbs.zzfa()) {
            zzhz zzhzVar2 = this.zzbs;
            int size3 = zza2.size();
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unprunable queries: ");
            sb2.append(size3);
            zzhzVar2.zza(sb2.toString(), null, new Object[0]);
        }
        Iterator<zzgb> it = zza2.iterator();
        while (it.hasNext()) {
            zzfxVar2 = zzfxVar2.zzy(it.next().zznp.zzg());
        }
        return zzfxVar2;
    }

    public final Set<zzid> zzaa(zzch zzchVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Map<zzhe, zzgb> zzai = this.zznx.zzai(zzchVar);
        if (zzai != null) {
            for (zzgb zzgbVar : zzai.values()) {
                if (!zzgbVar.zznp.zzek()) {
                    hashSet2.add(Long.valueOf(zzgbVar.id));
                }
            }
        }
        if (!hashSet2.isEmpty()) {
            hashSet.addAll(this.zzne.zza(hashSet2));
        }
        Iterator<Map.Entry<zzid, zzgj<Map<zzhe, zzgb>>>> it = this.zznx.zzag(zzchVar).zzdm().iterator();
        while (it.hasNext()) {
            Map.Entry<zzid, zzgj<Map<zzhe, zzgb>>> next = it.next();
            zzid key = next.getKey();
            zzgj<Map<zzhe, zzgb>> value = next.getValue();
            if (value.getValue() != null && zznt.zzd(value.getValue())) {
                hashSet.add(key);
            }
        }
        return hashSet;
    }

    public final void zzab(zzch zzchVar) {
        zzgb zzdi;
        if (zzad(zzchVar)) {
            return;
        }
        zzhh zzal = zzhh.zzal(zzchVar);
        zzgb zzk = zzk(zzal);
        if (zzk == null) {
            long j = this.zznz;
            this.zznz = 1 + j;
            zzdi = new zzgb(j, zzal, this.zzny.millis(), true, false);
        } else {
            zzdi = zzk.zzdi();
        }
        zza(zzdi);
    }

    public final boolean zzac(zzch zzchVar) {
        return this.zznx.zzb(zzchVar, zznu) != null;
    }

    public final long zzdj() {
        return zza(zznv).size();
    }

    public final void zzg(zzhh zzhhVar) {
        zzb(zzhhVar, true);
    }

    public final void zzh(zzhh zzhhVar) {
        zzb(zzhhVar, false);
    }

    public final zzgb zzk(zzhh zzhhVar) {
        zzhh zzj = zzj(zzhhVar);
        Map<zzhe, zzgb> zzai = this.zznx.zzai(zzj.zzg());
        if (zzai != null) {
            return zzai.get(zzj.zzen());
        }
        return null;
    }

    public final void zzl(zzhh zzhhVar) {
        zzgb zzk = zzk(zzj(zzhhVar));
        if (zzk == null || zzk.zznr) {
            return;
        }
        zza(zzk.zzdi());
    }

    public final boolean zzm(zzhh zzhhVar) {
        Map<zzhe, zzgb> zzai;
        if (zzad(zzhhVar.zzg())) {
            return true;
        }
        return !zzhhVar.zzek() && (zzai = this.zznx.zzai(zzhhVar.zzg())) != null && zzai.containsKey(zzhhVar.zzen()) && zzai.get(zzhhVar.zzen()).zznr;
    }

    public final void zzz(zzch zzchVar) {
        this.zznx.zzag(zzchVar).zza(new zzgh(this));
    }
}
