package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzgf;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class zzx extends zzot {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzz> zzc;
    private Long zzd;
    private Long zze;

    private final zzz zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzz zzzVar = new zzz(this, this.zza);
        this.zzc.put(num, zzzVar);
        return zzzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzot
    protected final boolean zzc() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0310 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List<zzgf.zzd> zza(String str, List<zzgf.zzf> list, List<zzgf.zzp> list2, Long l, Long l2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        zzfw.zze next;
        Iterator<zzgf.zzf> it;
        zzy zzyVar;
        zzbh zzbhVar;
        HashSet hashSet;
        Map<Integer, zzgf.zzm> map;
        List<zzfw.zzb> list3;
        Map<Integer, zzgf.zzm> map2;
        boolean z5;
        zzgf.zzm zzmVar;
        HashSet hashSet2;
        boolean z6;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator<zzgf.zzf> it2 = list.iterator();
        while (true) {
            z2 = true;
            if (!it2.hasNext()) {
                z3 = false;
                break;
            }
            if ("_s".equals(it2.next().zzg())) {
                z3 = true;
                break;
            }
        }
        boolean z7 = com.google.android.gms.internal.measurement.zzoh.zza() && zze().zzf(this.zza, zzbn.zzbz);
        boolean z8 = com.google.android.gms.internal.measurement.zzoh.zza() && zze().zzf(this.zza, zzbn.zzby);
        if (z3) {
            zzar zzh = zzh();
            String str2 = this.zza;
            zzh.zzam();
            zzh.zzv();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzh.f_().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error resetting session-scoped event counts. appId", zzgo.zza(str2), e);
            }
        }
        Map<Integer, List<zzfw.zzb>> emptyMap = Collections.emptyMap();
        if (z8 && z7) {
            emptyMap = zzh().zzm(this.zza);
        }
        Map<Integer, List<zzfw.zzb>> map3 = emptyMap;
        Map<Integer, zzgf.zzm> zzl = zzh().zzl(this.zza);
        if (zzl.isEmpty()) {
            z4 = true;
        } else {
            HashSet hashSet3 = new HashSet(zzl.keySet());
            if (z3) {
                String str3 = this.zza;
                Map<Integer, List<Integer>> zzn = zzh().zzn(this.zza);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(zzl);
                ArrayMap arrayMap = new ArrayMap();
                if (!zzl.isEmpty()) {
                    Iterator<Integer> it3 = zzl.keySet().iterator();
                    while (it3.hasNext()) {
                        int intValue = it3.next().intValue();
                        zzgf.zzm zzmVar2 = zzl.get(Integer.valueOf(intValue));
                        List<Integer> list4 = zzn.get(Integer.valueOf(intValue));
                        if (list4 == null || list4.isEmpty()) {
                            hashSet2 = hashSet3;
                            z6 = z2;
                            arrayMap.put(Integer.valueOf(intValue), zzmVar2);
                        } else {
                            List<Long> zza = h_().zza(zzmVar2.zzi(), list4);
                            if (!zza.isEmpty()) {
                                zzgf.zzm.zza zzb = zzmVar2.zzch().zzb().zzb(zza);
                                z6 = z2;
                                zzb.zzd().zzd(h_().zza(zzmVar2.zzk(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzgf.zze zzeVar : zzmVar2.zzh()) {
                                    HashSet hashSet4 = hashSet3;
                                    if (!list4.contains(Integer.valueOf(zzeVar.zza()))) {
                                        arrayList.add(zzeVar);
                                    }
                                    hashSet3 = hashSet4;
                                }
                                hashSet2 = hashSet3;
                                zzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzgf.zzn zznVar : zzmVar2.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zznVar.zzb()))) {
                                        arrayList2.add(zznVar);
                                    }
                                }
                                zzb.zzc().zzc(arrayList2);
                                arrayMap.put(Integer.valueOf(intValue), (zzgf.zzm) ((com.google.android.gms.internal.measurement.zzkg) zzb.zzaj()));
                            }
                        }
                        z2 = z6;
                        hashSet3 = hashSet2;
                    }
                }
                hashSet = hashSet3;
                z4 = z2;
                map = arrayMap;
            } else {
                hashSet = hashSet3;
                z4 = true;
                map = zzl;
            }
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                int intValue2 = ((Integer) it4.next()).intValue();
                zzgf.zzm zzmVar3 = map.get(Integer.valueOf(intValue2));
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ArrayMap arrayMap2 = new ArrayMap();
                if (zzmVar3 != null && zzmVar3.zza() != 0) {
                    for (zzgf.zze zzeVar2 : zzmVar3.zzh()) {
                        if (zzeVar2.zzf()) {
                            arrayMap2.put(Integer.valueOf(zzeVar2.zza()), zzeVar2.zze() ? Long.valueOf(zzeVar2.zzb()) : null);
                        }
                    }
                }
                ArrayMap arrayMap3 = new ArrayMap();
                if (zzmVar3 != null && zzmVar3.zzc() != 0) {
                    for (zzgf.zzn zznVar2 : zzmVar3.zzj()) {
                        if (!zznVar2.zzf() || zznVar2.zza() <= 0) {
                            zzmVar = zzmVar3;
                        } else {
                            zzmVar = zzmVar3;
                            arrayMap3.put(Integer.valueOf(zznVar2.zzb()), Long.valueOf(zznVar2.zza(zznVar2.zza() - 1)));
                        }
                        zzmVar3 = zzmVar;
                    }
                }
                zzgf.zzm zzmVar4 = zzmVar3;
                if (zzmVar4 != null) {
                    int i = 0;
                    while (i < (zzmVar4.zzd() << 6)) {
                        if (zzpj.zza(zzmVar4.zzk(), i)) {
                            map2 = map;
                            zzj().zzq().zza("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i));
                            bitSet2.set(i);
                            if (zzpj.zza(zzmVar4.zzi(), i)) {
                                bitSet.set(i);
                                z5 = z4;
                                if (z5) {
                                    arrayMap2.remove(Integer.valueOf(i));
                                }
                                i++;
                                map = map2;
                            }
                        } else {
                            map2 = map;
                        }
                        z5 = false;
                        if (z5) {
                        }
                        i++;
                        map = map2;
                    }
                }
                Map<Integer, zzgf.zzm> map4 = map;
                zzgf.zzm zzmVar5 = zzl.get(Integer.valueOf(intValue2));
                if (z8 && z7 && (list3 = map3.get(Integer.valueOf(intValue2))) != null && this.zze != null && this.zzd != null) {
                    for (zzfw.zzb zzbVar : list3) {
                        int zzb2 = zzbVar.zzb();
                        long longValue = this.zze.longValue() / 1000;
                        if (zzbVar.zzi()) {
                            longValue = this.zzd.longValue() / 1000;
                        }
                        if (arrayMap2.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap2.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        if (arrayMap3.containsKey(Integer.valueOf(zzb2))) {
                            arrayMap3.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(intValue2), new zzz(this, this.zza, zzmVar5, bitSet, bitSet2, arrayMap2, arrayMap3));
                map = map4;
            }
        }
        if (!list.isEmpty()) {
            zzy zzyVar2 = new zzy(this);
            ArrayMap arrayMap4 = new ArrayMap();
            Iterator<zzgf.zzf> it5 = list.iterator();
            while (it5.hasNext()) {
                zzgf.zzf next2 = it5.next();
                zzgf.zzf zza2 = zzyVar2.zza(this.zza, next2);
                if (zza2 != null) {
                    zzar zzh2 = zzh();
                    String str4 = this.zza;
                    String zzg = zza2.zzg();
                    zzbh zzd = zzh2.zzd(str4, next2.zzg());
                    if (zzd == null) {
                        zzh2.zzj().zzr().zza("Event aggregate wasn't created during raw event logging. appId, event", zzgo.zza(str4), zzh2.zzi().zza(zzg));
                        zzyVar = zzyVar2;
                        it = it5;
                        zzbhVar = new zzbh(str4, next2.zzg(), 1L, 1L, 1L, next2.zzd(), 0L, null, null, null, null);
                    } else {
                        it = it5;
                        zzyVar = zzyVar2;
                        zzbhVar = new zzbh(zzd.zza, zzd.zzb, zzd.zzc + 1, zzd.zzd + 1, zzd.zze + 1, zzd.zzf, zzd.zzg, zzd.zzh, zzd.zzi, zzd.zzj, zzd.zzk);
                    }
                    zzh().zza(zzbhVar);
                    if (!z) {
                        long j = zzbhVar.zzc;
                        String zzg2 = zza2.zzg();
                        Map<Integer, List<zzfw.zzb>> map5 = (Map) arrayMap4.get(zzg2);
                        if (map5 == null) {
                            map5 = zzh().zzf(this.zza, zzg2);
                            arrayMap4.put(zzg2, map5);
                        }
                        Iterator<Integer> it6 = map5.keySet().iterator();
                        while (it6.hasNext()) {
                            int intValue3 = it6.next().intValue();
                            if (this.zzb.contains(Integer.valueOf(intValue3))) {
                                zzj().zzq().zza("Skipping failed audience ID", Integer.valueOf(intValue3));
                            } else {
                                Iterator<zzfw.zzb> it7 = map5.get(Integer.valueOf(intValue3)).iterator();
                                boolean z9 = z4;
                                while (true) {
                                    if (!it7.hasNext()) {
                                        break;
                                    }
                                    zzfw.zzb next3 = it7.next();
                                    zzab zzabVar = new zzab(this, this.zza, intValue3, next3);
                                    boolean zza3 = zzabVar.zza(this.zzd, this.zze, zza2, j, zzbhVar, zza(intValue3, next3.zzb()));
                                    if (zza3) {
                                        zza(Integer.valueOf(intValue3)).zza(zzabVar);
                                        z9 = zza3;
                                    } else {
                                        this.zzb.add(Integer.valueOf(intValue3));
                                        z9 = zza3;
                                        break;
                                    }
                                }
                                if (!z9) {
                                    this.zzb.add(Integer.valueOf(intValue3));
                                }
                            }
                        }
                    }
                    it5 = it;
                    zzyVar2 = zzyVar;
                }
            }
        }
        if (z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            ArrayMap arrayMap5 = new ArrayMap();
            for (zzgf.zzp zzpVar : list2) {
                String zzg3 = zzpVar.zzg();
                Map<Integer, List<zzfw.zze>> map6 = (Map) arrayMap5.get(zzg3);
                if (map6 == null) {
                    map6 = zzh().zzg(this.zza, zzg3);
                    arrayMap5.put(zzg3, map6);
                }
                Iterator<Integer> it8 = map6.keySet().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        int intValue4 = it8.next().intValue();
                        if (this.zzb.contains(Integer.valueOf(intValue4))) {
                            zzj().zzq().zza("Skipping failed audience ID", Integer.valueOf(intValue4));
                            break;
                        }
                        Iterator<zzfw.zze> it9 = map6.get(Integer.valueOf(intValue4)).iterator();
                        boolean z10 = z4;
                        while (true) {
                            if (!it9.hasNext()) {
                                break;
                            }
                            next = it9.next();
                            if (zzj().zza(2)) {
                                zzj().zzq().zza("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), next.zzi() ? Integer.valueOf(next.zza()) : null, zzi().zzc(next.zze()));
                                zzj().zzq().zza("Filter definition", h_().zza(next));
                            }
                            if (!next.zzi() || next.zza() > 256) {
                                break;
                            }
                            zzad zzadVar = new zzad(this, this.zza, intValue4, next);
                            z10 = zzadVar.zza(this.zzd, this.zze, zzpVar, zza(intValue4, next.zza()));
                            if (z10) {
                                zza(Integer.valueOf(intValue4)).zza(zzadVar);
                            } else {
                                this.zzb.add(Integer.valueOf(intValue4));
                                break;
                            }
                        }
                        zzj().zzr().zza("Invalid property filter ID. appId, id", zzgo.zza(this.zza), String.valueOf(next.zzi() ? Integer.valueOf(next.zza()) : null));
                        z10 = false;
                        if (!z10) {
                            this.zzb.add(Integer.valueOf(intValue4));
                        }
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Set<Integer> keySet = this.zzc.keySet();
        keySet.removeAll(this.zzb);
        Iterator<Integer> it10 = keySet.iterator();
        while (it10.hasNext()) {
            int intValue5 = it10.next().intValue();
            zzz zzzVar = this.zzc.get(Integer.valueOf(intValue5));
            Preconditions.checkNotNull(zzzVar);
            zzgf.zzd zza4 = zzzVar.zza(intValue5);
            arrayList3.add(zza4);
            zzar zzh3 = zzh();
            String str5 = this.zza;
            zzgf.zzm zzd2 = zza4.zzd();
            zzh3.zzam();
            zzh3.zzv();
            Preconditions.checkNotEmpty(str5);
            Preconditions.checkNotNull(zzd2);
            byte[] zzce = zzd2.zzce();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str5);
            contentValues2.put("audience_id", Integer.valueOf(intValue5));
            contentValues2.put("current_results", zzce);
            try {
            } catch (SQLiteException e2) {
                e = e2;
            }
            try {
                if (zzh3.f_().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                    zzh3.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzgo.zza(str5));
                }
            } catch (SQLiteException e3) {
                e = e3;
                zzh3.zzj().zzg().zza("Error storing filter results. appId", zzgo.zza(str5), e);
            }
        }
        return arrayList3;
    }

    zzx(zzou zzouVar) {
        super(zzouVar);
    }

    private final boolean zza(int i, int i2) {
        BitSet bitSet;
        zzz zzzVar = this.zzc.get(Integer.valueOf(i));
        if (zzzVar == null) {
            return false;
        }
        bitSet = zzzVar.zzd;
        return bitSet.get(i2);
    }
}
